/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package org.lwjgl.demo.util.spng;

import org.lwjgl.*;
import org.lwjgl.system.*;
import org.lwjgl.util.spng.*;

import javax.imageio.*;
import java.awt.image.*;
import java.io.*;
import java.nio.*;
import java.nio.file.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.util.spng.Spng.*;

public class ReadPng {
    public static void main(String[] args) {
        // Forward declerations for easier cleanup.
        ByteBuffer buffer = null;
        ByteBuffer pixels = null;

        long context = spng_ctx_new(0);
        if(context == NULL) {
            throw new RuntimeException("Failed to create new spng context");
        }

        try(MemoryStack stack = MemoryStack.stackPush()) {
            // Read a PNG file into a ByteBuffer to pass to spng.
            try(
                InputStream input = ReadPng.class.getResourceAsStream("/lwjgl16.png");
                ByteArrayOutputStream output = new ByteArrayOutputStream()
            ) {
                byte[] staging = new byte[1024 * 1024];
                int read;
                while((read = input.read(staging)) > 0) {
                    output.write(staging, 0, read);
                }

                byte[] data = output.toByteArray();
                buffer = MemoryUtil.memAlloc(data.length);
                buffer.put(data);
                buffer.position(0);
            } catch (IOException e) {
                throw new RuntimeException("Failed to read sample image", e);
            }

            // Give the buffer to spng to read.
            int result = spng_set_png_buffer(context, buffer);
            if(result != SPNG_SPNG_OK) {
                throw new RuntimeException("spng_set_png_buffer failed with " + spng_strerror(result) + " (" + result + ')');
            }

            // Get the IHDR chunk to get information about the image.
            SpngIhdr header = SpngIhdr.calloc(stack);
            result = spng_get_ihdr(context, header);
            if(result != SPNG_SPNG_OK) {
                throw new RuntimeException("spng_get_ihdr failed with " + spng_strerror(result) + " (" + result + ')');
            }

            // ... like the width and height.
            int width = header.width();
            int height = header.height();

            // Get the size of buffer we will need to store the pixel data
            PointerBuffer bufferSizePointer = stack.pointers(0);
            result = spng_decoded_image_size(context, SPNG_SPNG_FMT_RGBA8, bufferSizePointer);
            if(result != SPNG_SPNG_OK) {
                throw new RuntimeException("spng_decoded_image_size failed with " + spng_strerror(result) + " (" + result + ')');
            }
            int size = (int) bufferSizePointer.get(0);

            // Parse the PNG file and put the pixels into the pixel buffer
            pixels = MemoryUtil.memAlloc(size);
            result = spng_decode_image(context, pixels, SPNG_SPNG_FMT_RGBA8, 0);
            if(result != SPNG_SPNG_OK) {
                throw new RuntimeException("spng_decode_image failed with " + spng_strerror(result) + " (" + result + ')');
            }

            BufferedImage awt = new BufferedImage(width, height, BufferedImage.TYPE_4BYTE_ABGR);
            IntBuffer ints = pixels.asIntBuffer();
            int[] row = new int[width];
            for(int y = 0; y < height; y++) {
                ints.get(row);
                for(int x = 0; x < width; x++) {
                    int pixel = row[x];
                    pixel = (pixel & 0xFF00FF00) | ((pixel >> 16) & 0x000000FF) | ((pixel << 16) & 0x00FF0000);
                    row[x] = pixel;
                }
                awt.setRGB(0, y, width, 1, row, 0, width);
            }

            Path path = Paths.get("out.png");
            System.out.println(path.toAbsolutePath());
            try(OutputStream out = Files.newOutputStream(path)) {
                ImageIO.write(awt, "png", out);
            } catch (Throwable e) {}

            // Dump it to the terminal via ANSI color codes!
            for(int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    int pixel = pixels.getInt((x + y * width) * 4);

                    System.out.printf("%08X ", pixel);
                }
                System.out.println();
                for (int x = 0; x < width; x++) {
                    int pixel = pixels.getInt((x + y * width) * 4);
                    int red   = pixel & 0xFF;
                    int green = (pixel >> 8) & 0xFF;
                    int blue  = (pixel >> 16) & 0xFF;

                    System.out.printf("\u001B[48;2;%d;%d;%dm  ", red, green, blue);
                }
                System.out.println("\u001B[0m");
            }
        } finally {
            // Ensure that things get cleaned up.
            spng_ctx_free(context);
            MemoryUtil.memFree(buffer);
            MemoryUtil.memFree(pixels);
        }
    }
}

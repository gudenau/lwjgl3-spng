/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jawt;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <pre>{@code
 * struct JAWT_DrawingSurfaceInfo {
 *     void * platformInfo;
 *     {@link JAWTDrawingSurface JAWT_DrawingSurface} * ds;
 *     {@link JAWTRectangle JAWT_Rectangle} bounds;
 *     jint clipSize;
 *     {@link JAWTRectangle JAWT_Rectangle} * clip;
 * }}</pre>
 */
@NativeType("struct JAWT_DrawingSurfaceInfo")
public class JAWTDrawingSurfaceInfo extends Struct<JAWTDrawingSurfaceInfo> {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        PLATFORMINFO,
        DS,
        BOUNDS,
        CLIPSIZE,
        CLIP;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(JAWTRectangle.SIZEOF, JAWTRectangle.ALIGNOF),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        PLATFORMINFO = layout.offsetof(0);
        DS = layout.offsetof(1);
        BOUNDS = layout.offsetof(2);
        CLIPSIZE = layout.offsetof(3);
        CLIP = layout.offsetof(4);
    }

    protected JAWTDrawingSurfaceInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected JAWTDrawingSurfaceInfo create(long address, @Nullable ByteBuffer container) {
        return new JAWTDrawingSurfaceInfo(address, container);
    }

    /**
     * Creates a {@code JAWTDrawingSurfaceInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public JAWTDrawingSurfaceInfo(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code platformInfo} field. */
    @NativeType("void *")
    public long platformInfo() { return nplatformInfo(address()); }
    /** @return a {@link JAWTDrawingSurface} view of the struct pointed to by the {@code ds} field. */
    @NativeType("JAWT_DrawingSurface *")
    public JAWTDrawingSurface ds() { return nds(address()); }
    /** @return a {@link JAWTRectangle} view of the {@code bounds} field. */
    @NativeType("JAWT_Rectangle")
    public JAWTRectangle bounds() { return nbounds(address()); }
    /** @return the value of the {@code clipSize} field. */
    @NativeType("jint")
    public int clipSize() { return nclipSize(address()); }
    /** @return a {@link JAWTRectangle.Buffer} view of the struct array pointed to by the {@code clip} field. */
    @NativeType("JAWT_Rectangle *")
    public JAWTRectangle.Buffer clip() { return nclip(address()); }

    // -----------------------------------

    /** Returns a new {@code JAWTDrawingSurfaceInfo} instance for the specified memory address. */
    public static JAWTDrawingSurfaceInfo create(long address) {
        return new JAWTDrawingSurfaceInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable JAWTDrawingSurfaceInfo createSafe(long address) {
        return address == NULL ? null : new JAWTDrawingSurfaceInfo(address, null);
    }

    /**
     * Create a {@link JAWTDrawingSurfaceInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static JAWTDrawingSurfaceInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static JAWTDrawingSurfaceInfo.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #platformInfo}. */
    public static long nplatformInfo(long struct) { return memGetAddress(struct + JAWTDrawingSurfaceInfo.PLATFORMINFO); }
    /** Unsafe version of {@link #ds}. */
    public static JAWTDrawingSurface nds(long struct) { return JAWTDrawingSurface.create(memGetAddress(struct + JAWTDrawingSurfaceInfo.DS)); }
    /** Unsafe version of {@link #bounds}. */
    public static JAWTRectangle nbounds(long struct) { return JAWTRectangle.create(struct + JAWTDrawingSurfaceInfo.BOUNDS); }
    /** Unsafe version of {@link #clipSize}. */
    public static int nclipSize(long struct) { return memGetInt(struct + JAWTDrawingSurfaceInfo.CLIPSIZE); }
    /** Unsafe version of {@link #clip}. */
    public static JAWTRectangle.Buffer nclip(long struct) { return JAWTRectangle.create(memGetAddress(struct + JAWTDrawingSurfaceInfo.CLIP), nclipSize(struct)); }

    // -----------------------------------

    /** An array of {@link JAWTDrawingSurfaceInfo} structs. */
    public static class Buffer extends StructBuffer<JAWTDrawingSurfaceInfo, Buffer> {

        private static final JAWTDrawingSurfaceInfo ELEMENT_FACTORY = JAWTDrawingSurfaceInfo.create(-1L);

        /**
         * Creates a new {@code JAWTDrawingSurfaceInfo.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link JAWTDrawingSurfaceInfo#SIZEOF}, and its mark will be undefined.</p>
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer create(long address, @Nullable ByteBuffer container, int mark, int position, int limit, int capacity) {
            return new Buffer(address, container, mark, position, limit, capacity);
        }

        @Override
        protected JAWTDrawingSurfaceInfo getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code platformInfo} field. */
        @NativeType("void *")
        public long platformInfo() { return JAWTDrawingSurfaceInfo.nplatformInfo(address()); }
        /** @return a {@link JAWTDrawingSurface} view of the struct pointed to by the {@code ds} field. */
        @NativeType("JAWT_DrawingSurface *")
        public JAWTDrawingSurface ds() { return JAWTDrawingSurfaceInfo.nds(address()); }
        /** @return a {@link JAWTRectangle} view of the {@code bounds} field. */
        @NativeType("JAWT_Rectangle")
        public JAWTRectangle bounds() { return JAWTDrawingSurfaceInfo.nbounds(address()); }
        /** @return the value of the {@code clipSize} field. */
        @NativeType("jint")
        public int clipSize() { return JAWTDrawingSurfaceInfo.nclipSize(address()); }
        /** @return a {@link JAWTRectangle.Buffer} view of the struct array pointed to by the {@code clip} field. */
        @NativeType("JAWT_Rectangle *")
        public JAWTRectangle.Buffer clip() { return JAWTDrawingSurfaceInfo.nclip(address()); }

    }

}
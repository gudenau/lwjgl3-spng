/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct VkImageResolve2 {
 *     VkStructureType sType;
 *     void const * pNext;
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} srcSubresource;
 *     {@link VkOffset3D VkOffset3D} srcOffset;
 *     {@link VkImageSubresourceLayers VkImageSubresourceLayers} dstSubresource;
 *     {@link VkOffset3D VkOffset3D} dstOffset;
 *     {@link VkExtent3D VkExtent3D} extent;
 * }}</pre>
 */
public class VkImageResolve2 extends Struct<VkImageResolve2> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        SRCSUBRESOURCE,
        SRCOFFSET,
        DSTSUBRESOURCE,
        DSTOFFSET,
        EXTENT;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF),
            __member(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF),
            __member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.ALIGNOF),
            __member(VkOffset3D.SIZEOF, VkOffset3D.ALIGNOF),
            __member(VkExtent3D.SIZEOF, VkExtent3D.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        SRCSUBRESOURCE = layout.offsetof(2);
        SRCOFFSET = layout.offsetof(3);
        DSTSUBRESOURCE = layout.offsetof(4);
        DSTOFFSET = layout.offsetof(5);
        EXTENT = layout.offsetof(6);
    }

    protected VkImageResolve2(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkImageResolve2 create(long address, @Nullable ByteBuffer container) {
        return new VkImageResolve2(address, container);
    }

    /**
     * Creates a {@code VkImageResolve2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkImageResolve2(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** @return a {@link VkImageSubresourceLayers} view of the {@code srcSubresource} field. */
    public VkImageSubresourceLayers srcSubresource() { return nsrcSubresource(address()); }
    /** @return a {@link VkOffset3D} view of the {@code srcOffset} field. */
    public VkOffset3D srcOffset() { return nsrcOffset(address()); }
    /** @return a {@link VkImageSubresourceLayers} view of the {@code dstSubresource} field. */
    public VkImageSubresourceLayers dstSubresource() { return ndstSubresource(address()); }
    /** @return a {@link VkOffset3D} view of the {@code dstOffset} field. */
    public VkOffset3D dstOffset() { return ndstOffset(address()); }
    /** @return a {@link VkExtent3D} view of the {@code extent} field. */
    public VkExtent3D extent() { return nextent(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkImageResolve2 sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link VK13#VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2 STRUCTURE_TYPE_IMAGE_RESOLVE_2} value to the {@code sType} field. */
    public VkImageResolve2 sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkImageResolve2 pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Copies the specified {@link VkImageSubresourceLayers} to the {@code srcSubresource} field. */
    public VkImageResolve2 srcSubresource(VkImageSubresourceLayers value) { nsrcSubresource(address(), value); return this; }
    /** Passes the {@code srcSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageResolve2 srcSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(srcSubresource()); return this; }
    /** Copies the specified {@link VkOffset3D} to the {@code srcOffset} field. */
    public VkImageResolve2 srcOffset(VkOffset3D value) { nsrcOffset(address(), value); return this; }
    /** Passes the {@code srcOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageResolve2 srcOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(srcOffset()); return this; }
    /** Copies the specified {@link VkImageSubresourceLayers} to the {@code dstSubresource} field. */
    public VkImageResolve2 dstSubresource(VkImageSubresourceLayers value) { ndstSubresource(address(), value); return this; }
    /** Passes the {@code dstSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageResolve2 dstSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(dstSubresource()); return this; }
    /** Copies the specified {@link VkOffset3D} to the {@code dstOffset} field. */
    public VkImageResolve2 dstOffset(VkOffset3D value) { ndstOffset(address(), value); return this; }
    /** Passes the {@code dstOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageResolve2 dstOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(dstOffset()); return this; }
    /** Copies the specified {@link VkExtent3D} to the {@code extent} field. */
    public VkImageResolve2 extent(VkExtent3D value) { nextent(address(), value); return this; }
    /** Passes the {@code extent} field to the specified {@link java.util.function.Consumer Consumer}. */
    public VkImageResolve2 extent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(extent()); return this; }

    /** Initializes this struct with the specified values. */
    public VkImageResolve2 set(
        int sType,
        long pNext,
        VkImageSubresourceLayers srcSubresource,
        VkOffset3D srcOffset,
        VkImageSubresourceLayers dstSubresource,
        VkOffset3D dstOffset,
        VkExtent3D extent
    ) {
        sType(sType);
        pNext(pNext);
        srcSubresource(srcSubresource);
        srcOffset(srcOffset);
        dstSubresource(dstSubresource);
        dstOffset(dstOffset);
        extent(extent);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkImageResolve2 set(VkImageResolve2 src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkImageResolve2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkImageResolve2 malloc() {
        return new VkImageResolve2(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkImageResolve2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkImageResolve2 calloc() {
        return new VkImageResolve2(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkImageResolve2} instance allocated with {@link BufferUtils}. */
    public static VkImageResolve2 create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkImageResolve2(memAddress(container), container);
    }

    /** Returns a new {@code VkImageResolve2} instance for the specified memory address. */
    public static VkImageResolve2 create(long address) {
        return new VkImageResolve2(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkImageResolve2 createSafe(long address) {
        return address == NULL ? null : new VkImageResolve2(address, null);
    }

    /**
     * Returns a new {@link VkImageResolve2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageResolve2.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkImageResolve2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageResolve2.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageResolve2.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkImageResolve2.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkImageResolve2.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkImageResolve2.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkImageResolve2.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkImageResolve2} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageResolve2 malloc(MemoryStack stack) {
        return new VkImageResolve2(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkImageResolve2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkImageResolve2 calloc(MemoryStack stack) {
        return new VkImageResolve2(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkImageResolve2.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageResolve2.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkImageResolve2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkImageResolve2.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkImageResolve2.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkImageResolve2.PNEXT); }
    /** Unsafe version of {@link #srcSubresource}. */
    public static VkImageSubresourceLayers nsrcSubresource(long struct) { return VkImageSubresourceLayers.create(struct + VkImageResolve2.SRCSUBRESOURCE); }
    /** Unsafe version of {@link #srcOffset}. */
    public static VkOffset3D nsrcOffset(long struct) { return VkOffset3D.create(struct + VkImageResolve2.SRCOFFSET); }
    /** Unsafe version of {@link #dstSubresource}. */
    public static VkImageSubresourceLayers ndstSubresource(long struct) { return VkImageSubresourceLayers.create(struct + VkImageResolve2.DSTSUBRESOURCE); }
    /** Unsafe version of {@link #dstOffset}. */
    public static VkOffset3D ndstOffset(long struct) { return VkOffset3D.create(struct + VkImageResolve2.DSTOFFSET); }
    /** Unsafe version of {@link #extent}. */
    public static VkExtent3D nextent(long struct) { return VkExtent3D.create(struct + VkImageResolve2.EXTENT); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkImageResolve2.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkImageResolve2.PNEXT, value); }
    /** Unsafe version of {@link #srcSubresource(VkImageSubresourceLayers) srcSubresource}. */
    public static void nsrcSubresource(long struct, VkImageSubresourceLayers value) { memCopy(value.address(), struct + VkImageResolve2.SRCSUBRESOURCE, VkImageSubresourceLayers.SIZEOF); }
    /** Unsafe version of {@link #srcOffset(VkOffset3D) srcOffset}. */
    public static void nsrcOffset(long struct, VkOffset3D value) { memCopy(value.address(), struct + VkImageResolve2.SRCOFFSET, VkOffset3D.SIZEOF); }
    /** Unsafe version of {@link #dstSubresource(VkImageSubresourceLayers) dstSubresource}. */
    public static void ndstSubresource(long struct, VkImageSubresourceLayers value) { memCopy(value.address(), struct + VkImageResolve2.DSTSUBRESOURCE, VkImageSubresourceLayers.SIZEOF); }
    /** Unsafe version of {@link #dstOffset(VkOffset3D) dstOffset}. */
    public static void ndstOffset(long struct, VkOffset3D value) { memCopy(value.address(), struct + VkImageResolve2.DSTOFFSET, VkOffset3D.SIZEOF); }
    /** Unsafe version of {@link #extent(VkExtent3D) extent}. */
    public static void nextent(long struct, VkExtent3D value) { memCopy(value.address(), struct + VkImageResolve2.EXTENT, VkExtent3D.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VkImageResolve2} structs. */
    public static class Buffer extends StructBuffer<VkImageResolve2, Buffer> implements NativeResource {

        private static final VkImageResolve2 ELEMENT_FACTORY = VkImageResolve2.create(-1L);

        /**
         * Creates a new {@code VkImageResolve2.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkImageResolve2#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkImageResolve2 getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkImageResolve2.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkImageResolve2.npNext(address()); }
        /** @return a {@link VkImageSubresourceLayers} view of the {@code srcSubresource} field. */
        public VkImageSubresourceLayers srcSubresource() { return VkImageResolve2.nsrcSubresource(address()); }
        /** @return a {@link VkOffset3D} view of the {@code srcOffset} field. */
        public VkOffset3D srcOffset() { return VkImageResolve2.nsrcOffset(address()); }
        /** @return a {@link VkImageSubresourceLayers} view of the {@code dstSubresource} field. */
        public VkImageSubresourceLayers dstSubresource() { return VkImageResolve2.ndstSubresource(address()); }
        /** @return a {@link VkOffset3D} view of the {@code dstOffset} field. */
        public VkOffset3D dstOffset() { return VkImageResolve2.ndstOffset(address()); }
        /** @return a {@link VkExtent3D} view of the {@code extent} field. */
        public VkExtent3D extent() { return VkImageResolve2.nextent(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkImageResolve2.Buffer sType(@NativeType("VkStructureType") int value) { VkImageResolve2.nsType(address(), value); return this; }
        /** Sets the {@link VK13#VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2 STRUCTURE_TYPE_IMAGE_RESOLVE_2} value to the {@code sType} field. */
        public VkImageResolve2.Buffer sType$Default() { return sType(VK13.VK_STRUCTURE_TYPE_IMAGE_RESOLVE_2); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkImageResolve2.Buffer pNext(@NativeType("void const *") long value) { VkImageResolve2.npNext(address(), value); return this; }
        /** Copies the specified {@link VkImageSubresourceLayers} to the {@code srcSubresource} field. */
        public VkImageResolve2.Buffer srcSubresource(VkImageSubresourceLayers value) { VkImageResolve2.nsrcSubresource(address(), value); return this; }
        /** Passes the {@code srcSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageResolve2.Buffer srcSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(srcSubresource()); return this; }
        /** Copies the specified {@link VkOffset3D} to the {@code srcOffset} field. */
        public VkImageResolve2.Buffer srcOffset(VkOffset3D value) { VkImageResolve2.nsrcOffset(address(), value); return this; }
        /** Passes the {@code srcOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageResolve2.Buffer srcOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(srcOffset()); return this; }
        /** Copies the specified {@link VkImageSubresourceLayers} to the {@code dstSubresource} field. */
        public VkImageResolve2.Buffer dstSubresource(VkImageSubresourceLayers value) { VkImageResolve2.ndstSubresource(address(), value); return this; }
        /** Passes the {@code dstSubresource} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageResolve2.Buffer dstSubresource(java.util.function.Consumer<VkImageSubresourceLayers> consumer) { consumer.accept(dstSubresource()); return this; }
        /** Copies the specified {@link VkOffset3D} to the {@code dstOffset} field. */
        public VkImageResolve2.Buffer dstOffset(VkOffset3D value) { VkImageResolve2.ndstOffset(address(), value); return this; }
        /** Passes the {@code dstOffset} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageResolve2.Buffer dstOffset(java.util.function.Consumer<VkOffset3D> consumer) { consumer.accept(dstOffset()); return this; }
        /** Copies the specified {@link VkExtent3D} to the {@code extent} field. */
        public VkImageResolve2.Buffer extent(VkExtent3D value) { VkImageResolve2.nextent(address(), value); return this; }
        /** Passes the {@code extent} field to the specified {@link java.util.function.Consumer Consumer}. */
        public VkImageResolve2.Buffer extent(java.util.function.Consumer<VkExtent3D> consumer) { consumer.accept(extent()); return this; }

    }

}
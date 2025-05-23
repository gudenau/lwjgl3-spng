/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jspecify.annotations.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <pre>{@code
 * struct XrEyeGazeFB {
 *     XrBool32 isValid;
 *     {@link XrPosef XrPosef} gazePose;
 *     float gazeConfidence;
 * }}</pre>
 */
public class XrEyeGazeFB extends Struct<XrEyeGazeFB> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ISVALID,
        GAZEPOSE,
        GAZECONFIDENCE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ISVALID = layout.offsetof(0);
        GAZEPOSE = layout.offsetof(1);
        GAZECONFIDENCE = layout.offsetof(2);
    }

    protected XrEyeGazeFB(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected XrEyeGazeFB create(long address, @Nullable ByteBuffer container) {
        return new XrEyeGazeFB(address, container);
    }

    /**
     * Creates a {@code XrEyeGazeFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrEyeGazeFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code isValid} field. */
    @NativeType("XrBool32")
    public boolean isValid() { return nisValid(address()) != 0; }
    /** @return a {@link XrPosef} view of the {@code gazePose} field. */
    public XrPosef gazePose() { return ngazePose(address()); }
    /** @return the value of the {@code gazeConfidence} field. */
    public float gazeConfidence() { return ngazeConfidence(address()); }

    /** Sets the specified value to the {@code isValid} field. */
    public XrEyeGazeFB isValid(@NativeType("XrBool32") boolean value) { nisValid(address(), value ? 1 : 0); return this; }
    /** Copies the specified {@link XrPosef} to the {@code gazePose} field. */
    public XrEyeGazeFB gazePose(XrPosef value) { ngazePose(address(), value); return this; }
    /** Passes the {@code gazePose} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrEyeGazeFB gazePose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(gazePose()); return this; }
    /** Sets the specified value to the {@code gazeConfidence} field. */
    public XrEyeGazeFB gazeConfidence(float value) { ngazeConfidence(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrEyeGazeFB set(
        boolean isValid,
        XrPosef gazePose,
        float gazeConfidence
    ) {
        isValid(isValid);
        gazePose(gazePose);
        gazeConfidence(gazeConfidence);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrEyeGazeFB set(XrEyeGazeFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrEyeGazeFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrEyeGazeFB malloc() {
        return new XrEyeGazeFB(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code XrEyeGazeFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrEyeGazeFB calloc() {
        return new XrEyeGazeFB(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code XrEyeGazeFB} instance allocated with {@link BufferUtils}. */
    public static XrEyeGazeFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new XrEyeGazeFB(memAddress(container), container);
    }

    /** Returns a new {@code XrEyeGazeFB} instance for the specified memory address. */
    public static XrEyeGazeFB create(long address) {
        return new XrEyeGazeFB(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable XrEyeGazeFB createSafe(long address) {
        return address == NULL ? null : new XrEyeGazeFB(address, null);
    }

    /**
     * Returns a new {@link XrEyeGazeFB.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyeGazeFB.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link XrEyeGazeFB.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyeGazeFB.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEyeGazeFB.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static XrEyeGazeFB.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link XrEyeGazeFB.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static XrEyeGazeFB.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static XrEyeGazeFB.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code XrEyeGazeFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEyeGazeFB malloc(MemoryStack stack) {
        return new XrEyeGazeFB(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code XrEyeGazeFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrEyeGazeFB calloc(MemoryStack stack) {
        return new XrEyeGazeFB(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link XrEyeGazeFB.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEyeGazeFB.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link XrEyeGazeFB.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static XrEyeGazeFB.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #isValid}. */
    public static int nisValid(long struct) { return memGetInt(struct + XrEyeGazeFB.ISVALID); }
    /** Unsafe version of {@link #gazePose}. */
    public static XrPosef ngazePose(long struct) { return XrPosef.create(struct + XrEyeGazeFB.GAZEPOSE); }
    /** Unsafe version of {@link #gazeConfidence}. */
    public static float ngazeConfidence(long struct) { return memGetFloat(struct + XrEyeGazeFB.GAZECONFIDENCE); }

    /** Unsafe version of {@link #isValid(boolean) isValid}. */
    public static void nisValid(long struct, int value) { memPutInt(struct + XrEyeGazeFB.ISVALID, value); }
    /** Unsafe version of {@link #gazePose(XrPosef) gazePose}. */
    public static void ngazePose(long struct, XrPosef value) { memCopy(value.address(), struct + XrEyeGazeFB.GAZEPOSE, XrPosef.SIZEOF); }
    /** Unsafe version of {@link #gazeConfidence(float) gazeConfidence}. */
    public static void ngazeConfidence(long struct, float value) { memPutFloat(struct + XrEyeGazeFB.GAZECONFIDENCE, value); }

    // -----------------------------------

    /** An array of {@link XrEyeGazeFB} structs. */
    public static class Buffer extends StructBuffer<XrEyeGazeFB, Buffer> implements NativeResource {

        private static final XrEyeGazeFB ELEMENT_FACTORY = XrEyeGazeFB.create(-1L);

        /**
         * Creates a new {@code XrEyeGazeFB.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrEyeGazeFB#SIZEOF}, and its mark will be undefined.</p>
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
        protected XrEyeGazeFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code isValid} field. */
        @NativeType("XrBool32")
        public boolean isValid() { return XrEyeGazeFB.nisValid(address()) != 0; }
        /** @return a {@link XrPosef} view of the {@code gazePose} field. */
        public XrPosef gazePose() { return XrEyeGazeFB.ngazePose(address()); }
        /** @return the value of the {@code gazeConfidence} field. */
        public float gazeConfidence() { return XrEyeGazeFB.ngazeConfidence(address()); }

        /** Sets the specified value to the {@code isValid} field. */
        public XrEyeGazeFB.Buffer isValid(@NativeType("XrBool32") boolean value) { XrEyeGazeFB.nisValid(address(), value ? 1 : 0); return this; }
        /** Copies the specified {@link XrPosef} to the {@code gazePose} field. */
        public XrEyeGazeFB.Buffer gazePose(XrPosef value) { XrEyeGazeFB.ngazePose(address(), value); return this; }
        /** Passes the {@code gazePose} field to the specified {@link java.util.function.Consumer Consumer}. */
        public XrEyeGazeFB.Buffer gazePose(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(gazePose()); return this; }
        /** Sets the specified value to the {@code gazeConfidence} field. */
        public XrEyeGazeFB.Buffer gazeConfidence(float value) { XrEyeGazeFB.ngazeConfidence(address(), value); return this; }

    }

}
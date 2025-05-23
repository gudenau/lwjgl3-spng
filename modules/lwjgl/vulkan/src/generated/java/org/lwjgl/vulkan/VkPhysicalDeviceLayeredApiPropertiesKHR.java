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

import static org.lwjgl.vulkan.VK10.*;

/**
 * <pre>{@code
 * struct VkPhysicalDeviceLayeredApiPropertiesKHR {
 *     VkStructureType sType;
 *     void * pNext;
 *     uint32_t vendorID;
 *     uint32_t deviceID;
 *     VkPhysicalDeviceLayeredApiKHR layeredAPI;
 *     char deviceName[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE];
 * }}</pre>
 */
public class VkPhysicalDeviceLayeredApiPropertiesKHR extends Struct<VkPhysicalDeviceLayeredApiPropertiesKHR> implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        VENDORID,
        DEVICEID,
        LAYEREDAPI,
        DEVICENAME;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(4),
            __array(1, VK_MAX_PHYSICAL_DEVICE_NAME_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        VENDORID = layout.offsetof(2);
        DEVICEID = layout.offsetof(3);
        LAYEREDAPI = layout.offsetof(4);
        DEVICENAME = layout.offsetof(5);
    }

    protected VkPhysicalDeviceLayeredApiPropertiesKHR(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    @Override
    protected VkPhysicalDeviceLayeredApiPropertiesKHR create(long address, @Nullable ByteBuffer container) {
        return new VkPhysicalDeviceLayeredApiPropertiesKHR(address, container);
    }

    /**
     * Creates a {@code VkPhysicalDeviceLayeredApiPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkPhysicalDeviceLayeredApiPropertiesKHR(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** @return the value of the {@code pNext} field. */
    @NativeType("void *")
    public long pNext() { return npNext(address()); }
    /** @return the value of the {@code vendorID} field. */
    @NativeType("uint32_t")
    public int vendorID() { return nvendorID(address()); }
    /** @return the value of the {@code deviceID} field. */
    @NativeType("uint32_t")
    public int deviceID() { return ndeviceID(address()); }
    /** @return the value of the {@code layeredAPI} field. */
    @NativeType("VkPhysicalDeviceLayeredApiKHR")
    public int layeredAPI() { return nlayeredAPI(address()); }
    /** @return a {@link ByteBuffer} view of the {@code deviceName} field. */
    @NativeType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]")
    public ByteBuffer deviceName() { return ndeviceName(address()); }
    /** @return the null-terminated string stored in the {@code deviceName} field. */
    @NativeType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]")
    public String deviceNameString() { return ndeviceNameString(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkPhysicalDeviceLayeredApiPropertiesKHR sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the {@link KHRMaintenance7#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR} value to the {@code sType} field. */
    public VkPhysicalDeviceLayeredApiPropertiesKHR sType$Default() { return sType(KHRMaintenance7.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR); }
    /** Sets the specified value to the {@code pNext} field. */
    public VkPhysicalDeviceLayeredApiPropertiesKHR pNext(@NativeType("void *") long value) { npNext(address(), value); return this; }
    /** Prepends the specified {@link VkPhysicalDeviceLayeredApiVulkanPropertiesKHR} value to the {@code pNext} chain. */
    public VkPhysicalDeviceLayeredApiPropertiesKHR pNext(VkPhysicalDeviceLayeredApiVulkanPropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }

    /** Initializes this struct with the specified values. */
    public VkPhysicalDeviceLayeredApiPropertiesKHR set(
        int sType,
        long pNext
    ) {
        sType(sType);
        pNext(pNext);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkPhysicalDeviceLayeredApiPropertiesKHR set(VkPhysicalDeviceLayeredApiPropertiesKHR src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code VkPhysicalDeviceLayeredApiPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceLayeredApiPropertiesKHR malloc() {
        return new VkPhysicalDeviceLayeredApiPropertiesKHR(nmemAllocChecked(SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceLayeredApiPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkPhysicalDeviceLayeredApiPropertiesKHR calloc() {
        return new VkPhysicalDeviceLayeredApiPropertiesKHR(nmemCallocChecked(1, SIZEOF), null);
    }

    /** Returns a new {@code VkPhysicalDeviceLayeredApiPropertiesKHR} instance allocated with {@link BufferUtils}. */
    public static VkPhysicalDeviceLayeredApiPropertiesKHR create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return new VkPhysicalDeviceLayeredApiPropertiesKHR(memAddress(container), container);
    }

    /** Returns a new {@code VkPhysicalDeviceLayeredApiPropertiesKHR} instance for the specified memory address. */
    public static VkPhysicalDeviceLayeredApiPropertiesKHR create(long address) {
        return new VkPhysicalDeviceLayeredApiPropertiesKHR(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static @Nullable VkPhysicalDeviceLayeredApiPropertiesKHR createSafe(long address) {
        return address == NULL ? null : new VkPhysicalDeviceLayeredApiPropertiesKHR(address, null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer malloc(int capacity) {
        return new Buffer(nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer calloc(int capacity) {
        return new Buffer(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return new Buffer(memAddress(container), container, -1, 0, capacity, capacity);
    }

    /**
     * Create a {@link VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    public static VkPhysicalDeviceLayeredApiPropertiesKHR.@Nullable Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, capacity);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceLayeredApiPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceLayeredApiPropertiesKHR malloc(MemoryStack stack) {
        return new VkPhysicalDeviceLayeredApiPropertiesKHR(stack.nmalloc(ALIGNOF, SIZEOF), null);
    }

    /**
     * Returns a new {@code VkPhysicalDeviceLayeredApiPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkPhysicalDeviceLayeredApiPropertiesKHR calloc(MemoryStack stack) {
        return new VkPhysicalDeviceLayeredApiPropertiesKHR(stack.ncalloc(ALIGNOF, 1, SIZEOF), null);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer malloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer calloc(int capacity, MemoryStack stack) {
        return new Buffer(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceLayeredApiPropertiesKHR.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceLayeredApiPropertiesKHR.PNEXT); }
    /** Unsafe version of {@link #vendorID}. */
    public static int nvendorID(long struct) { return memGetInt(struct + VkPhysicalDeviceLayeredApiPropertiesKHR.VENDORID); }
    /** Unsafe version of {@link #deviceID}. */
    public static int ndeviceID(long struct) { return memGetInt(struct + VkPhysicalDeviceLayeredApiPropertiesKHR.DEVICEID); }
    /** Unsafe version of {@link #layeredAPI}. */
    public static int nlayeredAPI(long struct) { return memGetInt(struct + VkPhysicalDeviceLayeredApiPropertiesKHR.LAYEREDAPI); }
    /** Unsafe version of {@link #deviceName}. */
    public static ByteBuffer ndeviceName(long struct) { return memByteBuffer(struct + VkPhysicalDeviceLayeredApiPropertiesKHR.DEVICENAME, VK_MAX_PHYSICAL_DEVICE_NAME_SIZE); }
    /** Unsafe version of {@link #deviceNameString}. */
    public static String ndeviceNameString(long struct) { return memUTF8(struct + VkPhysicalDeviceLayeredApiPropertiesKHR.DEVICENAME); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceLayeredApiPropertiesKHR.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceLayeredApiPropertiesKHR.PNEXT, value); }

    // -----------------------------------

    /** An array of {@link VkPhysicalDeviceLayeredApiPropertiesKHR} structs. */
    public static class Buffer extends StructBuffer<VkPhysicalDeviceLayeredApiPropertiesKHR, Buffer> implements NativeResource {

        private static final VkPhysicalDeviceLayeredApiPropertiesKHR ELEMENT_FACTORY = VkPhysicalDeviceLayeredApiPropertiesKHR.create(-1L);

        /**
         * Creates a new {@code VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer} instance backed by the specified container.
         *
         * <p>Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkPhysicalDeviceLayeredApiPropertiesKHR#SIZEOF}, and its mark will be undefined.</p>
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
        protected VkPhysicalDeviceLayeredApiPropertiesKHR getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkPhysicalDeviceLayeredApiPropertiesKHR.nsType(address()); }
        /** @return the value of the {@code pNext} field. */
        @NativeType("void *")
        public long pNext() { return VkPhysicalDeviceLayeredApiPropertiesKHR.npNext(address()); }
        /** @return the value of the {@code vendorID} field. */
        @NativeType("uint32_t")
        public int vendorID() { return VkPhysicalDeviceLayeredApiPropertiesKHR.nvendorID(address()); }
        /** @return the value of the {@code deviceID} field. */
        @NativeType("uint32_t")
        public int deviceID() { return VkPhysicalDeviceLayeredApiPropertiesKHR.ndeviceID(address()); }
        /** @return the value of the {@code layeredAPI} field. */
        @NativeType("VkPhysicalDeviceLayeredApiKHR")
        public int layeredAPI() { return VkPhysicalDeviceLayeredApiPropertiesKHR.nlayeredAPI(address()); }
        /** @return a {@link ByteBuffer} view of the {@code deviceName} field. */
        @NativeType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]")
        public ByteBuffer deviceName() { return VkPhysicalDeviceLayeredApiPropertiesKHR.ndeviceName(address()); }
        /** @return the null-terminated string stored in the {@code deviceName} field. */
        @NativeType("char[VK_MAX_PHYSICAL_DEVICE_NAME_SIZE]")
        public String deviceNameString() { return VkPhysicalDeviceLayeredApiPropertiesKHR.ndeviceNameString(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer sType(@NativeType("VkStructureType") int value) { VkPhysicalDeviceLayeredApiPropertiesKHR.nsType(address(), value); return this; }
        /** Sets the {@link KHRMaintenance7#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR} value to the {@code sType} field. */
        public VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer sType$Default() { return sType(KHRMaintenance7.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_KHR); }
        /** Sets the specified value to the {@code pNext} field. */
        public VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer pNext(@NativeType("void *") long value) { VkPhysicalDeviceLayeredApiPropertiesKHR.npNext(address(), value); return this; }
        /** Prepends the specified {@link VkPhysicalDeviceLayeredApiVulkanPropertiesKHR} value to the {@code pNext} chain. */
        public VkPhysicalDeviceLayeredApiPropertiesKHR.Buffer pNext(VkPhysicalDeviceLayeredApiVulkanPropertiesKHR value) { return this.pNext(value.pNext(this.pNext()).address()); }

    }

}
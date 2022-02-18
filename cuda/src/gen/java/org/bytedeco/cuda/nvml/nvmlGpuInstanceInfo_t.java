// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlGpuInstanceInfo_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlGpuInstanceInfo_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlGpuInstanceInfo_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlGpuInstanceInfo_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlGpuInstanceInfo_t position(long position) {
        return (nvmlGpuInstanceInfo_t)super.position(position);
    }
    @Override public nvmlGpuInstanceInfo_t getPointer(long i) {
        return new nvmlGpuInstanceInfo_t((Pointer)this).offsetAddress(i);
    }

    /** Parent device */
    public native nvmlDevice_st device(); public native nvmlGpuInstanceInfo_t device(nvmlDevice_st setter);
    /** Unique instance ID within the device */
    public native @Cast("unsigned int") int id(); public native nvmlGpuInstanceInfo_t id(int setter);
    /** Unique profile ID within the device */
    public native @Cast("unsigned int") int profileId(); public native nvmlGpuInstanceInfo_t profileId(int setter);
    /** Placement for this instance */
    public native @ByRef nvmlGpuInstancePlacement_t placement(); public native nvmlGpuInstanceInfo_t placement(nvmlGpuInstancePlacement_t setter);
}

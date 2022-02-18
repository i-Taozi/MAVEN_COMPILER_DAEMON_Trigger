// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.librealsense2.global.realsense2.*;


@Properties(inherit = org.bytedeco.librealsense2.presets.realsense2.class)
public class STDepthControlGroup extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public STDepthControlGroup() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public STDepthControlGroup(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public STDepthControlGroup(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public STDepthControlGroup position(long position) {
        return (STDepthControlGroup)super.position(position);
    }
    @Override public STDepthControlGroup getPointer(long i) {
        return new STDepthControlGroup((Pointer)this).offsetAddress(i);
    }

    public native @Cast("uint32_t") int plusIncrement(); public native STDepthControlGroup plusIncrement(int setter);
    public native @Cast("uint32_t") int minusDecrement(); public native STDepthControlGroup minusDecrement(int setter);
    public native @Cast("uint32_t") int deepSeaMedianThreshold(); public native STDepthControlGroup deepSeaMedianThreshold(int setter);
    public native @Cast("uint32_t") int scoreThreshA(); public native STDepthControlGroup scoreThreshA(int setter);
    public native @Cast("uint32_t") int scoreThreshB(); public native STDepthControlGroup scoreThreshB(int setter);
    public native @Cast("uint32_t") int textureDifferenceThreshold(); public native STDepthControlGroup textureDifferenceThreshold(int setter);
    public native @Cast("uint32_t") int textureCountThreshold(); public native STDepthControlGroup textureCountThreshold(int setter);
    public native @Cast("uint32_t") int deepSeaSecondPeakThreshold(); public native STDepthControlGroup deepSeaSecondPeakThreshold(int setter);
    public native @Cast("uint32_t") int deepSeaNeighborThreshold(); public native STDepthControlGroup deepSeaNeighborThreshold(int setter);
    public native @Cast("uint32_t") int lrAgreeThreshold(); public native STDepthControlGroup lrAgreeThreshold(int setter);
}

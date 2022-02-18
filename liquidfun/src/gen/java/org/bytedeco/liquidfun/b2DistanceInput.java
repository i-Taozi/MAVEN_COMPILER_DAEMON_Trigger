// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.liquidfun;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.liquidfun.global.liquidfun.*;


/** Input for b2Distance.
 *  You have to option to use the shape radii
 *  in the computation. Even  */
@Properties(inherit = org.bytedeco.liquidfun.presets.liquidfun.class)
public class b2DistanceInput extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public b2DistanceInput() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public b2DistanceInput(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public b2DistanceInput(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public b2DistanceInput position(long position) {
        return (b2DistanceInput)super.position(position);
    }
    @Override public b2DistanceInput getPointer(long i) {
        return new b2DistanceInput((Pointer)this).offsetAddress(i);
    }

	public native @ByRef b2DistanceProxy proxyA(); public native b2DistanceInput proxyA(b2DistanceProxy setter);
	public native @ByRef b2DistanceProxy proxyB(); public native b2DistanceInput proxyB(b2DistanceProxy setter);
	public native @ByRef b2Transform transformA(); public native b2DistanceInput transformA(b2Transform setter);
	public native @ByRef b2Transform transformB(); public native b2DistanceInput transformB(b2Transform setter);
	public native @Cast("bool") boolean useRadii(); public native b2DistanceInput useRadii(boolean setter);
}

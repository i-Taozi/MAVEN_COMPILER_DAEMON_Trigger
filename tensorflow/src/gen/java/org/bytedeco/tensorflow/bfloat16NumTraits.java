// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// TODO(xpan): We probably need to overwrite more methods to have correct eigen
// behavior. E.g. epsilon(), dummy_precision, etc. See NumTraits.h in eigen.
@Name("Eigen::NumTraits<tensorflow::bfloat16>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class bfloat16NumTraits extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public bfloat16NumTraits() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public bfloat16NumTraits(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public bfloat16NumTraits(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public bfloat16NumTraits position(long position) {
        return (bfloat16NumTraits)super.position(position);
    }
    @Override public bfloat16NumTraits getPointer(long i) {
        return new bfloat16NumTraits((Pointer)this).offsetAddress(i);
    }

  /** enum Eigen::NumTraits<tensorflow::bfloat16>:: */
  public static final int
    IsInteger = 0,
    IsSigned = 1,
    RequireInitialization = 0;
  public static native @ByVal bfloat16 highest();

  public static native @ByVal bfloat16 lowest();

  public static native @ByVal bfloat16 infinity();

  public static native @ByVal bfloat16 quiet_NaN();
}

// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Unpacks a given dimension of a rank-{@code R} tensor into {@code num} rank-{@code (R-1)} tensors.
 * 
 *  Unpacks {@code num} tensors from {@code value} by chipping it along the {@code axis} dimension.
 *  For example, given a tensor of shape {@code (A, B, C, D)};
 * 
 *  If {@code axis == 0} then the i'th tensor in {@code output} is the slice {@code value[i, :, :, :]}
 *    and each tensor in {@code output} will have shape {@code (B, C, D)}. (Note that the
 *    dimension unpacked along is gone, unlike {@code split}).
 * 
 *  If {@code axis == 1} then the i'th tensor in {@code output} is the slice {@code value[:, i, :, :]}
 *    and each tensor in {@code output} will have shape {@code (A, C, D)}.
 *  Etc.
 * 
 *  This is the opposite of {@code pack}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * value: 1-D or higher, with {@code axis} dimension size equal to {@code num}.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * axis: Dimension along which to unpack.  Negative values wrap around, so the
 *  valid range is {@code [-R, R)}.
 * 
 *  Returns:
 *  * {@code OutputList}: The list of tensors unpacked from {@code value}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Unstack extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Unstack(Pointer p) { super(p); }

  /** Optional attribute setters for Unstack */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
      @Override public Attrs getPointer(long i) {
          return new Attrs((Pointer)this).offsetAddress(i);
      }
  
    /** Dimension along which to unpack.  Negative values wrap around, so the
     *  valid range is {@code [-R, R)}.
     * 
     *  Defaults to 0 */
    public native @ByVal Attrs Axis(@Cast("tensorflow::int64") long x);

    public native @Cast("tensorflow::int64") long axis_(); public native Attrs axis_(long setter);
  }
  public Unstack(@Const @ByRef Scope scope, @ByVal Input value, @Cast("tensorflow::int64") long num) { super((Pointer)null); allocate(scope, value, num); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input value, @Cast("tensorflow::int64") long num);
  public Unstack(@Const @ByRef Scope scope, @ByVal Input value, @Cast("tensorflow::int64") long num,
          @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, value, num, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input value, @Cast("tensorflow::int64") long num,
          @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator []") Output get(@Cast("size_t") long index);


  public static native @ByVal Attrs Axis(@Cast("tensorflow::int64") long x);

  public native @ByRef Operation operation(); public native Unstack operation(Operation setter);
  public native @ByRef @Cast("tensorflow::OutputList*") OutputVector output(); public native Unstack output(OutputVector setter);
}

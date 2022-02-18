// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Outputs random values from the Poisson distribution(s) described by rate.
 * 
 *  This op uses two algorithms, depending on rate. If rate >= 10, then
 *  the algorithm by Hormann is used to acquire samples via
 *  transformation-rejection.
 *  See http://www.sciencedirect.com/science/article/pii/0167668793909974.
 * 
 *  Otherwise, Knuth's algorithm is used to acquire samples via multiplying uniform
 *  random variables.
 *  See Donald E. Knuth (1969). Seminumerical Algorithms. The Art of Computer
 *  Programming, Volume 2. Addison Wesley
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * shape: 1-D integer tensor. Shape of independent samples to draw from each
 *  distribution described by the shape parameters given in rate.
 *  * rate: A tensor in which each scalar is a "rate" parameter describing the
 *  associated poisson distribution.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * seed: If either {@code seed} or {@code seed2} are set to be non-zero, the random number
 *  generator is seeded by the given seed.  Otherwise, it is seeded by a
 *  random seed.
 *  * seed2: A second seed to avoid seed collision.
 * 
 *  Returns:
 *  * {@code Output}: A tensor with shape {@code shape + shape(rate)}. Each slice
 *  {@code [:, ..., :, i0, i1, ...iN]} contains the samples drawn for
 *  {@code rate[i0, i1, ...iN]}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RandomPoissonV2 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RandomPoissonV2(Pointer p) { super(p); }

  /** Optional attribute setters for RandomPoissonV2 */
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
  
    /** If either {@code seed} or {@code seed2} are set to be non-zero, the random number
     *  generator is seeded by the given seed.  Otherwise, it is seeded by a
     *  random seed.
     * 
     *  Defaults to 0 */
    
    ///
    public native @ByVal Attrs Seed(@Cast("tensorflow::int64") long x);

    /** A second seed to avoid seed collision.
     * 
     *  Defaults to 0 */
    public native @ByVal Attrs Seed2(@Cast("tensorflow::int64") long x);

    /** Defaults to DT_INT64 */
    public native @ByVal Attrs Dtype(@Cast("tensorflow::DataType") int x);

    public native @Cast("tensorflow::int64") long seed_(); public native Attrs seed_(long setter);
    public native @Cast("tensorflow::int64") long seed2_(); public native Attrs seed2_(long setter);
    public native @Cast("tensorflow::DataType") int dtype_(); public native Attrs dtype_(int setter);
  }
  public RandomPoissonV2(@Const @ByRef Scope scope, @ByVal Input shape,
                  @ByVal Input rate) { super((Pointer)null); allocate(scope, shape, rate); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input shape,
                  @ByVal Input rate);
  public RandomPoissonV2(@Const @ByRef Scope scope, @ByVal Input shape,
                  @ByVal Input rate, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, shape, rate, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input shape,
                  @ByVal Input rate, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Seed(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs Seed2(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs Dtype(@Cast("tensorflow::DataType") int x);

  public native @ByRef Operation operation(); public native RandomPoissonV2 operation(Operation setter);
  public native @ByRef Output output(); public native RandomPoissonV2 output(Output setter);
}

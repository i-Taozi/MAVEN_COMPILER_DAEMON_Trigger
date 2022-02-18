// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Return histogram of values.
 * 
 *  Given the tensor {@code values}, this operation returns a rank 1 histogram counting
 *  the number of entries in {@code values} that fall into every bin.  The bins are
 *  equal width and determined by the arguments {@code value_range} and {@code nbins}.
 * 
 *  <pre>{@code python
 *  # Bins will be:  (-inf, 1), [1, 2), [2, 3), [3, 4), [4, inf)
 *  nbins = 5
 *  value_range = [0.0, 5.0]
 *  new_values = [-1.0, 0.0, 1.5, 2.0, 5.0, 15]
 * 
 *  with tf.get_default_session() as sess:
 *    hist = tf.histogram_fixed_width(new_values, value_range, nbins=5)
 *    variables.global_variables_initializer().run()
 *    sess.run(hist) => [2, 1, 1, 0, 2]
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * values: Numeric {@code Tensor}.
 *  * value_range: Shape [2] {@code Tensor} of same {@code dtype} as {@code values}.
 *  values <= value_range[0] will be mapped to hist[0],
 *  values >= value_range[1] will be mapped to hist[-1].
 *  * nbins: Scalar {@code int32 Tensor}.  Number of histogram bins.
 * 
 *  Returns:
 *  * {@code Output}: A 1-D {@code Tensor} holding histogram of values. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class HistogramFixedWidth extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HistogramFixedWidth(Pointer p) { super(p); }

  /** Optional attribute setters for HistogramFixedWidth */
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
  
    /** Defaults to DT_INT32 */
    public native @ByVal Attrs Dtype(@Cast("tensorflow::DataType") int x);

    public native @Cast("tensorflow::DataType") int dtype_(); public native Attrs dtype_(int setter);
  }
  public HistogramFixedWidth(@Const @ByRef Scope scope, @ByVal Input values, @ByVal Input value_range,
                      @ByVal Input nbins) { super((Pointer)null); allocate(scope, values, value_range, nbins); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input values, @ByVal Input value_range,
                      @ByVal Input nbins);
  public HistogramFixedWidth(@Const @ByRef Scope scope, @ByVal Input values, @ByVal Input value_range,
                      @ByVal Input nbins, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, values, value_range, nbins, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input values, @ByVal Input value_range,
                      @ByVal Input nbins, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Dtype(@Cast("tensorflow::DataType") int x);

  public native @ByRef Operation operation(); public native HistogramFixedWidth operation(Operation setter);
  public native @ByRef Output out(); public native HistogramFixedWidth out(Output setter);
}

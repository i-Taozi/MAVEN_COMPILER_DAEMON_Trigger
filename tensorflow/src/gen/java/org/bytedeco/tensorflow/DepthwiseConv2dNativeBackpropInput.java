// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes the gradients of depthwise convolution with respect to the input.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input_sizes: An integer vector representing the shape of {@code input}, based
 *  on {@code data_format}.  For example, if {@code data_format} is 'NHWC' then
 *   {@code input} is a 4-D {@code [batch, height, width, channels]} tensor.
 *  * filter: 4-D with shape
 *  {@code [filter_height, filter_width, in_channels, depthwise_multiplier]}.
 *  * out_backprop: 4-D with shape  based on {@code data_format}.
 *  For example, if {@code data_format} is 'NHWC' then
 *  out_backprop shape is {@code [batch, out_height, out_width, out_channels]}.
 *  Gradients w.r.t. the output of the convolution.
 *  * strides: The stride of the sliding window for each dimension of the input
 *  of the convolution.
 *  * padding: The type of padding algorithm to use.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * data_format: Specify the data format of the input and output data. With the
 *  default format "NHWC", the data is stored in the order of:
 *      [batch, height, width, channels].
 *  Alternatively, the format could be "NCHW", the data storage order of:
 *      [batch, channels, height, width].
 *  * dilations: 1-D tensor of length 4.  The dilation factor for each dimension of
 *  {@code input}. If set to k > 1, there will be k-1 skipped cells between each filter
 *  element on that dimension. The dimension order is determined by the value of
 *  {@code data_format}, see above for details. Dilations in the batch and depth
 *  dimensions must be 1.
 * 
 *  Returns:
 *  * {@code Output}: 4-D with shape according to {@code data_format}.  For example, if
 *  {@code data_format} is 'NHWC', output shape is {@code [batch, in_height,
 *  in_width, in_channels]}.  Gradient w.r.t. the input of the
 *  convolution. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class DepthwiseConv2dNativeBackpropInput extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DepthwiseConv2dNativeBackpropInput(Pointer p) { super(p); }

  /** Optional attribute setters for DepthwiseConv2dNativeBackpropInput */
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
  
    /** Specify the data format of the input and output data. With the
     *  default format "NHWC", the data is stored in the order of:
     *      [batch, height, width, channels].
     *  Alternatively, the format could be "NCHW", the data storage order of:
     *      [batch, channels, height, width].
     * 
     *  Defaults to "NHWC" */
    
    ///
    public native @ByVal Attrs DataFormat(@StringPiece BytePointer x);
    public native @ByVal Attrs DataFormat(@StringPiece String x);

    /** 1-D tensor of length 4.  The dilation factor for each dimension of
     *  {@code input}. If set to k > 1, there will be k-1 skipped cells between each filter
     *  element on that dimension. The dimension order is determined by the value of
     *  {@code data_format}, see above for details. Dilations in the batch and depth
     *  dimensions must be 1.
     * 
     *  Defaults to [1, 1, 1, 1] */
    public native @ByVal Attrs Dilations(@ArraySlice IntPointer x);
    public native @ByVal Attrs Dilations(@ArraySlice IntBuffer x);
    public native @ByVal Attrs Dilations(@ArraySlice int... x);

    public native @StringPiece BytePointer data_format_(); public native Attrs data_format_(BytePointer setter);
    public native @ArraySlice IntPointer dilations_(); public native Attrs dilations_(IntPointer setter);
  }
  public DepthwiseConv2dNativeBackpropInput(@Const @ByRef Scope scope,
                                     @ByVal Input input_sizes,
                                     @ByVal Input filter,
                                     @ByVal Input out_backprop, @ArraySlice IntPointer strides, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input_sizes, filter, out_backprop, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope,
                                     @ByVal Input input_sizes,
                                     @ByVal Input filter,
                                     @ByVal Input out_backprop, @ArraySlice IntPointer strides, @StringPiece BytePointer padding);
  public DepthwiseConv2dNativeBackpropInput(@Const @ByRef Scope scope,
                                     @ByVal Input input_sizes,
                                     @ByVal Input filter,
                                     @ByVal Input out_backprop, @ArraySlice IntBuffer strides, @StringPiece String padding) { super((Pointer)null); allocate(scope, input_sizes, filter, out_backprop, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope,
                                     @ByVal Input input_sizes,
                                     @ByVal Input filter,
                                     @ByVal Input out_backprop, @ArraySlice IntBuffer strides, @StringPiece String padding);
  public DepthwiseConv2dNativeBackpropInput(@Const @ByRef Scope scope,
                                     @ByVal Input input_sizes,
                                     @ByVal Input filter,
                                     @ByVal Input out_backprop, @ArraySlice int[] strides, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input_sizes, filter, out_backprop, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope,
                                     @ByVal Input input_sizes,
                                     @ByVal Input filter,
                                     @ByVal Input out_backprop, @ArraySlice int[] strides, @StringPiece BytePointer padding);
  public DepthwiseConv2dNativeBackpropInput(@Const @ByRef Scope scope,
                                     @ByVal Input input_sizes,
                                     @ByVal Input filter,
                                     @ByVal Input out_backprop, @ArraySlice IntPointer strides, @StringPiece String padding) { super((Pointer)null); allocate(scope, input_sizes, filter, out_backprop, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope,
                                     @ByVal Input input_sizes,
                                     @ByVal Input filter,
                                     @ByVal Input out_backprop, @ArraySlice IntPointer strides, @StringPiece String padding);
  public DepthwiseConv2dNativeBackpropInput(@Const @ByRef Scope scope,
                                     @ByVal Input input_sizes,
                                     @ByVal Input filter,
                                     @ByVal Input out_backprop, @ArraySlice IntBuffer strides, @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input_sizes, filter, out_backprop, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope,
                                     @ByVal Input input_sizes,
                                     @ByVal Input filter,
                                     @ByVal Input out_backprop, @ArraySlice IntBuffer strides, @StringPiece BytePointer padding);
  public DepthwiseConv2dNativeBackpropInput(@Const @ByRef Scope scope,
                                     @ByVal Input input_sizes,
                                     @ByVal Input filter,
                                     @ByVal Input out_backprop, @ArraySlice int[] strides, @StringPiece String padding) { super((Pointer)null); allocate(scope, input_sizes, filter, out_backprop, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope,
                                     @ByVal Input input_sizes,
                                     @ByVal Input filter,
                                     @ByVal Input out_backprop, @ArraySlice int[] strides, @StringPiece String padding);
  public DepthwiseConv2dNativeBackpropInput(@Const @ByRef Scope scope,
                                     @ByVal Input input_sizes,
                                     @ByVal Input filter,
                                     @ByVal Input out_backprop, @ArraySlice IntPointer strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input_sizes, filter, out_backprop, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope,
                                     @ByVal Input input_sizes,
                                     @ByVal Input filter,
                                     @ByVal Input out_backprop, @ArraySlice IntPointer strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs);
  public DepthwiseConv2dNativeBackpropInput(@Const @ByRef Scope scope,
                                     @ByVal Input input_sizes,
                                     @ByVal Input filter,
                                     @ByVal Input out_backprop, @ArraySlice IntBuffer strides, @StringPiece String padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input_sizes, filter, out_backprop, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope,
                                     @ByVal Input input_sizes,
                                     @ByVal Input filter,
                                     @ByVal Input out_backprop, @ArraySlice IntBuffer strides, @StringPiece String padding, @Const @ByRef Attrs attrs);
  public DepthwiseConv2dNativeBackpropInput(@Const @ByRef Scope scope,
                                     @ByVal Input input_sizes,
                                     @ByVal Input filter,
                                     @ByVal Input out_backprop, @ArraySlice int[] strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input_sizes, filter, out_backprop, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope,
                                     @ByVal Input input_sizes,
                                     @ByVal Input filter,
                                     @ByVal Input out_backprop, @ArraySlice int[] strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs);
  public DepthwiseConv2dNativeBackpropInput(@Const @ByRef Scope scope,
                                     @ByVal Input input_sizes,
                                     @ByVal Input filter,
                                     @ByVal Input out_backprop, @ArraySlice IntPointer strides, @StringPiece String padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input_sizes, filter, out_backprop, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope,
                                     @ByVal Input input_sizes,
                                     @ByVal Input filter,
                                     @ByVal Input out_backprop, @ArraySlice IntPointer strides, @StringPiece String padding, @Const @ByRef Attrs attrs);
  public DepthwiseConv2dNativeBackpropInput(@Const @ByRef Scope scope,
                                     @ByVal Input input_sizes,
                                     @ByVal Input filter,
                                     @ByVal Input out_backprop, @ArraySlice IntBuffer strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input_sizes, filter, out_backprop, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope,
                                     @ByVal Input input_sizes,
                                     @ByVal Input filter,
                                     @ByVal Input out_backprop, @ArraySlice IntBuffer strides, @StringPiece BytePointer padding, @Const @ByRef Attrs attrs);
  public DepthwiseConv2dNativeBackpropInput(@Const @ByRef Scope scope,
                                     @ByVal Input input_sizes,
                                     @ByVal Input filter,
                                     @ByVal Input out_backprop, @ArraySlice int[] strides, @StringPiece String padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input_sizes, filter, out_backprop, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope,
                                     @ByVal Input input_sizes,
                                     @ByVal Input filter,
                                     @ByVal Input out_backprop, @ArraySlice int[] strides, @StringPiece String padding, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs DataFormat(@StringPiece BytePointer x);
  public static native @ByVal Attrs DataFormat(@StringPiece String x);
  public static native @ByVal Attrs Dilations(@ArraySlice IntPointer x);
  public static native @ByVal Attrs Dilations(@ArraySlice IntBuffer x);
  public static native @ByVal Attrs Dilations(@ArraySlice int... x);

  public native @ByRef Operation operation(); public native DepthwiseConv2dNativeBackpropInput operation(Operation setter);
  public native @ByRef Output output(); public native DepthwiseConv2dNativeBackpropInput output(Output setter);
}

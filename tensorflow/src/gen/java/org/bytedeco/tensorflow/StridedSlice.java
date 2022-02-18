// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Return a strided slice from {@code input}.
 * 
 *  Note, most python users will want to use the Python {@code Tensor.__getitem__}
 *  or {@code Variable.__getitem__} rather than this op directly.
 * 
 *  The goal of this op is to produce a new tensor with a subset of
 *  the elements from the {@code n} dimensional {@code input} tensor. The subset is chosen using
 *  a sequence of {@code m} sparse range specifications encoded into the arguments
 *  of this function. Note, in some cases
 *  {@code m} could be equal to {@code n}, but this need not be the case. Each
 *  range specification entry can be one of the following:
 * 
 *  - An ellipsis (...). Ellipses are used to imply zero or more
 *    dimensions of full-dimension selection and are produced using
 *    {@code ellipsis_mask}. For example, {@code foo[...]} is the identity slice.
 * 
 *  - A new axis. This is used to insert a new shape=1 dimension and is
 *    produced using {@code new_axis_mask}. For example, {@code foo[:, ...]} where
 *    {@code foo} is shape {@code (3, 4)} produces a {@code (1, 3, 4)} tensor.
 * 
 * 
 *  - A range {@code begin:end:stride}. This is used to specify how much to choose from
 *    a given dimension. {@code stride} can be any integer but 0.  {@code begin} is an integer
 *    which represents the index of the first value to select while {@code end} represents
 *    the index of the last value to select. The number of values selected in each
 *    dimension is {@code end - begin} if {@code stride > 0} and {@code begin - end} if {@code stride < 0}.
 *    {@code begin} and {@code end} can be negative where {@code -1} is the last element, {@code -2} is
 *    the second to last. {@code begin_mask} controls whether to replace the explicitly
 *    given {@code begin} with an implicit effective value of {@code 0} if {@code stride > 0} and
 *    {@code -1} if {@code stride < 0}. {@code end_mask} is analogous but produces the number
 *    required to create the largest open interval. For example, given a shape
 *    {@code (3,)} tensor {@code foo[:]}, the effective {@code begin} and {@code end} are {@code 0} and {@code 3}. Do
 *    not assume this is equivalent to {@code foo[0:-1]} which has an effective {@code begin}
 *    and {@code end} of {@code 0} and {@code 2}. Another example is {@code foo[-2::-1]} which reverses the
 *    first dimension of a tensor while dropping the last two (in the original
 *    order elements). For example {@code foo = [1,2,3,4]; foo[-2::-1]} is {@code [4,3]}.
 * 
 *  - A single index. This is used to keep only elements that have a given
 *    index. For example ({@code foo[2, :]} on a shape {@code (5,6)} tensor produces a
 *    shape {@code (6,)} tensor. This is encoded in {@code begin} and {@code end} and
 *    {@code shrink_axis_mask}.
 * 
 *  Each conceptual range specification is encoded in the op's argument. This
 *  encoding is best understand by considering a non-trivial example. In
 *  particular,
 *  {@code foo[1, 2:4, None, ..., :-3:-1, :]} will be encoded as
 * 
 *  <pre>{@code
 *  begin = [1, 2, x, x, 0, x] # x denotes don't care (usually 0)
 *  end = [2, 4, x, x, -3, x]
 *  strides = [1, 1, x, x, -1, 1]
 *  begin_mask = 1<<4 | 1 << 5 = 48
 *  end_mask = 1<<5 = 32
 *  ellipsis_mask = 1<<3 = 8
 *  new_axis_mask = 1<<2 4
 *  shrink_axis_mask = 1<<0
 *  }</pre>
 * 
 *  In this case if {@code foo.shape} is (5, 5, 5, 5, 5, 5) the final shape of
 *  the slice becomes (2, 1, 5, 5, 2, 5).
 *  Let us walk step by step through each argument specification.
 * 
 *  1.  The first argument in the example slice is turned into {@code begin = 1} and
 *  {@code end = begin + 1 = 2}. To disambiguate from the original spec {@code 2:4} we
 *  also set the appropriate bit in {@code shrink_axis_mask}.
 * 
 *  2. {@code 2:4} is contributes 2, 4, 1 to begin, end, and stride. All masks have
 *  zero bits contributed.
 * 
 *  3. None is a synonym for {@code tf.newaxis}. This means insert a dimension of size 1
 *  dimension in the final shape. Dummy values are contributed to begin,
 *  end and stride, while the new_axis_mask bit is set.
 * 
 *  4. {@code ...} grab the full ranges from as many dimensions as needed to
 *  fully specify a slice for every dimension of the input shape.
 * 
 *  5. {@code :-3:-1} shows the use of negative indices. A negative index {@code i} associated
 *  with a dimension that has shape {@code s} is converted to a positive index
 *  {@code s + i}. So {@code -1} becomes {@code s-1} (i.e. the last element). This conversion
 *  is done internally so begin, end and strides receive x, -3, and -1.
 *  The appropriate begin_mask bit is set to indicate the start range is the
 *  full range (ignoring the x).
 * 
 *  6. {@code :} indicates that the entire contents of the corresponding dimension
 *  is selected. This is equivalent to {@code ::} or {@code 0::1}. begin, end, and strides
 *  receive 0, 0, and 1, respectively. The appropriate bits in {@code begin_mask} and
 *  {@code end_mask} are also set.
 * 
 *  *Requirements*:
 *    {@code 0 != strides[i] for i in [0, m)}
 *    {@code ellipsis_mask must be a power of two (only one ellipsis)}
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * begin: {@code begin[k]} specifies the offset into the {@code k}th range specification.
 *  The exact dimension this corresponds to will be determined by context.
 *  Out-of-bounds values will be silently clamped. If the {@code k}th bit of
 *  {@code begin_mask} then {@code begin[k]} is ignored and the full range of the
 *  appropriate dimension is used instead. Negative values causes indexing
 *  to start from the highest element e.g. If {@code foo==[1,2,3]} then {@code foo[-1]==3}.
 *  * end: {@code end[i]} is like {@code begin} with the exception that {@code end_mask} is
 *  used to determine full ranges.
 *  * strides: {@code strides[i]} specifies the increment in the {@code i}th specification
 *  after extracting a given element. Negative indices will reverse
 *  the original order. Out or range values are
 *  clamped to {@code [0,dim[i]) if slice[i]>0} or {@code [-1,dim[i]-1] if slice[i] < 0}
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * begin_mask: a bitmask where a bit i being 1 means to ignore the begin
 *  value and instead use the largest interval possible. At runtime
 *  begin[i] will be replaced with {@code [0, n-1)} if {@code stride[i] > 0} or
 *  {@code [-1, n-1]} if {@code stride[i] < 0}
 *  * end_mask: analogous to {@code begin_mask}
 *  * ellipsis_mask: a bitmask where bit {@code i} being 1 means the {@code i}th
 *  position is actually an ellipsis. One bit at most can be 1.
 *  If {@code ellipsis_mask == 0}, then an implicit ellipsis mask of {@code 1 << (m+1)}
 *  is provided. This means that {@code foo[3:5] == foo[3:5, ...]}. An ellipsis
 *  implicitly creates as many range specifications as necessary to fully
 *  specify the sliced range for every dimension. For example for a 4-dimensional
 *  tensor {@code foo} the slice {@code foo[2, ..., 5:8]} implies {@code foo[2, :, :, 5:8]}.
 *  * new_axis_mask: a bitmask where bit {@code i} being 1 means the {@code i}th
 *  specification creates a new shape 1 dimension. For example
 *  {@code foo[:4, tf.newaxis, :2]} would produce a shape {@code (4, 1, 2)} tensor.
 *  * shrink_axis_mask: a bitmask where bit {@code i} implies that the {@code i}th
 *  specification should shrink the dimensionality. begin and end
 *  must imply a slice of size 1 in the dimension. For example in
 *  python one might do {@code foo[:, 3, :]} which would result in
 *  {@code shrink_axis_mask} being 2.
 * 
 *  Returns:
 *  * {@code Output}: The output tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class StridedSlice extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StridedSlice(Pointer p) { super(p); }

  /** Optional attribute setters for StridedSlice */
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
  
    /** a bitmask where a bit i being 1 means to ignore the begin
     *  value and instead use the largest interval possible. At runtime
     *  begin[i] will be replaced with {@code [0, n-1)} if {@code stride[i] > 0} or
     *  {@code [-1, n-1]} if {@code stride[i] < 0}
     * 
     *  Defaults to 0 */
    
    ///
    public native @ByVal Attrs BeginMask(@Cast("tensorflow::int64") long x);

    /** analogous to {@code begin_mask}
     * 
     *  Defaults to 0 */
    
    ///
    public native @ByVal Attrs EndMask(@Cast("tensorflow::int64") long x);

    /** a bitmask where bit {@code i} being 1 means the {@code i}th
     *  position is actually an ellipsis. One bit at most can be 1.
     *  If {@code ellipsis_mask == 0}, then an implicit ellipsis mask of {@code 1 << (m+1)}
     *  is provided. This means that {@code foo[3:5] == foo[3:5, ...]}. An ellipsis
     *  implicitly creates as many range specifications as necessary to fully
     *  specify the sliced range for every dimension. For example for a 4-dimensional
     *  tensor {@code foo} the slice {@code foo[2, ..., 5:8]} implies {@code foo[2, :, :, 5:8]}.
     * 
     *  Defaults to 0 */
    
    ///
    public native @ByVal Attrs EllipsisMask(@Cast("tensorflow::int64") long x);

    /** a bitmask where bit {@code i} being 1 means the {@code i}th
     *  specification creates a new shape 1 dimension. For example
     *  {@code foo[:4, tf.newaxis, :2]} would produce a shape {@code (4, 1, 2)} tensor.
     * 
     *  Defaults to 0 */
    
    ///
    public native @ByVal Attrs NewAxisMask(@Cast("tensorflow::int64") long x);

    /** a bitmask where bit {@code i} implies that the {@code i}th
     *  specification should shrink the dimensionality. begin and end
     *  must imply a slice of size 1 in the dimension. For example in
     *  python one might do {@code foo[:, 3, :]} which would result in
     *  {@code shrink_axis_mask} being 2.
     * 
     *  Defaults to 0 */
    public native @ByVal Attrs ShrinkAxisMask(@Cast("tensorflow::int64") long x);

    public native @Cast("tensorflow::int64") long begin_mask_(); public native Attrs begin_mask_(long setter);
    public native @Cast("tensorflow::int64") long end_mask_(); public native Attrs end_mask_(long setter);
    public native @Cast("tensorflow::int64") long ellipsis_mask_(); public native Attrs ellipsis_mask_(long setter);
    public native @Cast("tensorflow::int64") long new_axis_mask_(); public native Attrs new_axis_mask_(long setter);
    public native @Cast("tensorflow::int64") long shrink_axis_mask_(); public native Attrs shrink_axis_mask_(long setter);
  }
  public StridedSlice(@Const @ByRef Scope scope, @ByVal Input input,
               @ByVal Input begin, @ByVal Input end,
               @ByVal Input strides) { super((Pointer)null); allocate(scope, input, begin, end, strides); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
               @ByVal Input begin, @ByVal Input end,
               @ByVal Input strides);
  public StridedSlice(@Const @ByRef Scope scope, @ByVal Input input,
               @ByVal Input begin, @ByVal Input end,
               @ByVal Input strides, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, begin, end, strides, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
               @ByVal Input begin, @ByVal Input end,
               @ByVal Input strides, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs BeginMask(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs EndMask(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs EllipsisMask(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs NewAxisMask(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs ShrinkAxisMask(@Cast("tensorflow::int64") long x);

  public native @ByRef Operation operation(); public native StridedSlice operation(Operation setter);
  public native @ByRef Output output(); public native StridedSlice output(Output setter);
}

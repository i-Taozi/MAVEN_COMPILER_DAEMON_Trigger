// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Enqueues zero or more tuples of one or more tensors in the given queue.
 * 
 *  This operation slices each component tensor along the 0th dimension to
 *  make multiple queue elements. All of the tuple components must have the
 *  same size in the 0th dimension.
 * 
 *  The components input has k elements, which correspond to the components of
 *  tuples stored in the given queue.
 * 
 *  N.B. If the queue is full, this operation will block until the given
 *  elements have been enqueued (or 'timeout_ms' elapses, if specified).
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * handle: The handle to a queue.
 *  * components: One or more tensors from which the enqueued tensors should
 *  be taken.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * timeout_ms: If the queue is too full, this operation will block for up
 *  to timeout_ms milliseconds.
 *  Note: This option is not supported yet.
 * 
 *  Returns:
 *  * the created {@code Operation} */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class QueueEnqueueMany extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QueueEnqueueMany(Pointer p) { super(p); }

  /** Optional attribute setters for QueueEnqueueMany */
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
  
    /** If the queue is too full, this operation will block for up
     *  to timeout_ms milliseconds.
     *  Note: This option is not supported yet.
     * 
     *  Defaults to -1 */
    public native @ByVal Attrs TimeoutMs(@Cast("tensorflow::int64") long x);

    public native @Cast("tensorflow::int64") long timeout_ms_(); public native Attrs timeout_ms_(long setter);
  }
  public QueueEnqueueMany(@Const @ByRef Scope scope, @ByVal Input handle,
                   @ByVal InputList components) { super((Pointer)null); allocate(scope, handle, components); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input handle,
                   @ByVal InputList components);
  public QueueEnqueueMany(@Const @ByRef Scope scope, @ByVal Input handle,
                   @ByVal InputList components, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, handle, components, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input handle,
                   @ByVal InputList components, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Operation") Operation asOperation();

  public static native @ByVal Attrs TimeoutMs(@Cast("tensorflow::int64") long x);

  public native @ByRef Operation operation(); public native QueueEnqueueMany operation(Operation setter);
}

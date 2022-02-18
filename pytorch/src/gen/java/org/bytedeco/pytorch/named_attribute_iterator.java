// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@Name("torch::jit::slot_iterator_impl<torch::jit::detail::NamedPolicy<torch::jit::detail::AttributePolicy> >") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class named_attribute_iterator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public named_attribute_iterator(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public named_attribute_iterator(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public named_attribute_iterator position(long position) {
        return (named_attribute_iterator)super.position(position);
    }
    @Override public named_attribute_iterator getPointer(long i) {
        return new named_attribute_iterator((Pointer)this).offsetAddress(i);
    }

  public named_attribute_iterator(
        @ByVal JitModule root,
        @Cast("bool") boolean recurse,
        @Cast("bool") boolean return_module) { super((Pointer)null); allocate(root, recurse, return_module); }
  private native void allocate(
        @ByVal JitModule root,
        @Cast("bool") boolean recurse,
        @Cast("bool") boolean return_module);
  // empty cursors_, represents end of iteration
  public named_attribute_iterator() { super((Pointer)null); allocate(); }
  private native void allocate();
  public native @ByVal @Name("operator *") NamedIValue multiply();
  public native @ByVal @Name("operator ->") NamedIValue access();
  public native @ByRef @Name("operator ++") named_attribute_iterator increment();
  public native @ByVal @Name("operator ++") named_attribute_iterator increment(int arg0);
}

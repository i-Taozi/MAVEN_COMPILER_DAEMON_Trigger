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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Softshrink ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies the soft shrinkage function element-wise.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.Softshrink to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::SoftshrinkOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  Softshrink model(SoftshrinkOptions(42.42));
 *  }</pre> */
// NOLINTNEXTLINE(bugprone-exception-escape)
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SoftshrinkImpl extends SoftshrinkImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SoftshrinkImpl(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SoftshrinkImpl(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SoftshrinkImpl position(long position) {
        return (SoftshrinkImpl)super.position(position);
    }
    @Override public SoftshrinkImpl getPointer(long i) {
        return new SoftshrinkImpl((Pointer)this).offsetAddress(i);
    }

  public SoftshrinkImpl(@Const @ByRef(nullValue = "torch::nn::SoftshrinkOptions{}") SoftshrinkOptions options_) { super((Pointer)null); allocate(options_); }
  @NoDeallocator private native void allocate(@Const @ByRef(nullValue = "torch::nn::SoftshrinkOptions{}") SoftshrinkOptions options_);
  public SoftshrinkImpl() { super((Pointer)null); allocate(); }
  @NoDeallocator private native void allocate();

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  public native void reset();

  /** Pretty prints the {@code Softshrink} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef SoftshrinkOptions options(); public native SoftshrinkImpl options(SoftshrinkOptions setter);
}

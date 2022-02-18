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


/** A {@code ModuleHolder} subclass for {@code ConvTranspose1dImpl}.
 *  See the documentation for {@code ConvTranspose1dImpl} class to learn what methods it
 *  provides, and examples of how to use {@code ConvTranspose1d} with {@code torch::nn::ConvTranspose1dOptions}.
 *  See the documentation for {@code ModuleHolder} to learn about PyTorch's
 *  module storage semantics. */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ConvTranspose1d extends ConvTranspose1dImplModuleHolder {
    static { Loader.load(); }

     public ConvTranspose1d(@ByVal @Cast("std::nullptr_t*") PointerPointer arg0) { super((Pointer)null); allocate(arg0); }
    private native void allocate(@ByVal @Cast("std::nullptr_t*") PointerPointer arg0); public ConvTranspose1d(@SharedPtr @Cast({"", "std::shared_ptr<torch::nn::ConvTranspose1dImpl>"}) ConvTranspose1dImpl module) { super((Pointer)null); allocate(module); }
    private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<torch::nn::ConvTranspose1dImpl>"}) ConvTranspose1dImpl module);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConvTranspose1d(Pointer p) { super(p); }

  }

// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief A function that executes general array operations that may yield
 *  outputs of different sizes or have results that depend on the whole array
 *  contents. These functions roughly correspond to the functions found in
 *  non-SQL array languages like APL and its derivatives. */
@Namespace("arrow::compute") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class VectorFunction extends Function {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VectorFunction(Pointer p) { super(p); }


  public VectorFunction(@StdString String name, @Const @ByRef Arity arity, @Const FunctionDoc doc,
                   @Const FunctionOptions default_options/*=nullptr*/) { super((Pointer)null); allocate(name, arity, doc, default_options); }
  private native void allocate(@StdString String name, @Const @ByRef Arity arity, @Const FunctionDoc doc,
                   @Const FunctionOptions default_options/*=nullptr*/);
  public VectorFunction(@StdString String name, @Const @ByRef Arity arity, @Const FunctionDoc doc) { super((Pointer)null); allocate(name, arity, doc); }
  private native void allocate(@StdString String name, @Const @ByRef Arity arity, @Const FunctionDoc doc);
  public VectorFunction(@StdString BytePointer name, @Const @ByRef Arity arity, @Const FunctionDoc doc,
                   @Const FunctionOptions default_options/*=nullptr*/) { super((Pointer)null); allocate(name, arity, doc, default_options); }
  private native void allocate(@StdString BytePointer name, @Const @ByRef Arity arity, @Const FunctionDoc doc,
                   @Const FunctionOptions default_options/*=nullptr*/);
  public VectorFunction(@StdString BytePointer name, @Const @ByRef Arity arity, @Const FunctionDoc doc) { super((Pointer)null); allocate(name, arity, doc); }
  private native void allocate(@StdString BytePointer name, @Const @ByRef Arity arity, @Const FunctionDoc doc);

  /** \brief Add a simple kernel with given input/output types, no required
   *  state initialization, no data preallocation, and no preallocation of the
   *  validity bitmap. */
  public native @ByVal Status AddKernel(@StdVector InputType in_types, @ByVal OutputType out_type,
                     @ByVal @Cast("arrow::compute::ArrayKernelExec*") Pointer exec, @ByVal(nullValue = "arrow::compute::KernelInit(nullptr)") @Cast("arrow::compute::KernelInit*") Pointer init);
  public native @ByVal Status AddKernel(@StdVector InputType in_types, @ByVal OutputType out_type,
                     @ByVal @Cast("arrow::compute::ArrayKernelExec*") Pointer exec);

  /** \brief Add a kernel (function implementation). Returns error if the
   *  kernel's signature does not match the function's arity. */
  public native @ByVal Status AddKernel(@ByVal VectorKernel kernel);
}

// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.mkl.global.mkl_rt.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


/**
 * \brief Packed function is a type-erased function.
 *  The arguments are passed by packed format.
 *
 *  This is an useful unified interface to call generated functions,
 *  It is the unified function function type of TVM.
 *  It corresponds to TVMFunctionHandle in C runtime API.
 */
@Namespace("tvm::runtime") @NoOffset @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class PackedFunc extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PackedFunc(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PackedFunc(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public PackedFunc position(long position) {
        return (PackedFunc)super.position(position);
    }
    @Override public PackedFunc getPointer(long i) {
        return new PackedFunc((Pointer)this).offsetAddress(i);
    }

  /**
   * \brief The internal std::function
   * @param args The arguments to the function.
   * @param rv The return value.
   *
   * <pre>{@code
   *   // Example code on how to implemented FType
   *   void MyPackedFunc(TVMArgs args, TVMRetValue* rv) {
   *     // automatically convert arguments to desired type.
   *     int a0 = args[0];
   *     float a1 = args[1];
   *     ...
   *     // automatically assign values to rv
   *     std::string my_return_value = "x";
   *     *rv = my_return_value;
   *   }
   * }</pre>
   */
  /** \brief default constructor */
  public PackedFunc() { super((Pointer)null); allocate(); }
  private native void allocate();
  /** \brief constructor from null */  // NOLINT(*)
  /**
   * \brief constructing a packed function from a std::function.
   * @param body the internal container of packed function.
   */
  public PackedFunc(@ByVal PackedFuncFType body) { super((Pointer)null); allocate(body); }
  private native void allocate(@ByVal PackedFuncFType body);
  /**
   * \brief Call packed function by directly passing in unpacked format.
   * @param args Arguments to be passed.
   * \tparam Args arguments to be passed.
   *
   * <pre>{@code
   *   // Example code on how to call packed function
   *   void CallPacked(PackedFunc f) {
   *     // call like normal functions by pass in arguments
   *     // return value is automatically converted back
   *     int rvalue = f(1, 2.0);
   *   }
   * }</pre>
   */
  /**
   * \brief Call the function in packed format.
   * @param args The arguments
   * @param rv The return value.
   */
  public native void CallPacked(@ByVal TVMArgs args, TVMRetValue rv);
  /** @return the internal body function */
  public native @ByPtrPtr @Name("body().target<void(*)(tvm::runtime::TVMArgs, tvm::runtime::TVMRetValue*)>") PackedFuncFType body();
  /** @return Whether the packed function is nullptr */
  /** @return Whether the packed function is not nullptr */
}

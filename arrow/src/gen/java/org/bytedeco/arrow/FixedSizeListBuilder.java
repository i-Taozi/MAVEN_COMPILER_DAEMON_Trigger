// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


// ----------------------------------------------------------------------
// FixedSizeList builder

/** \class FixedSizeListBuilder
 *  \brief Builder class for fixed-length list array value types */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class FixedSizeListBuilder extends ArrayBuilder {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FixedSizeListBuilder(Pointer p) { super(p); }

  /** Use this constructor to define the built array's type explicitly. If value_builder
   *  has indeterminate type, this builder will also. */
  public FixedSizeListBuilder(MemoryPool pool,
                         @Const @SharedPtr @ByRef ArrayBuilder value_builder,
                         int list_size) { super((Pointer)null); allocate(pool, value_builder, list_size); }
  private native void allocate(MemoryPool pool,
                         @Const @SharedPtr @ByRef ArrayBuilder value_builder,
                         int list_size);

  /** Use this constructor to infer the built array's type. If value_builder has
   *  indeterminate type, this builder will also. */
  public FixedSizeListBuilder(MemoryPool pool,
                         @Const @SharedPtr @ByRef ArrayBuilder value_builder,
                         @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(pool, value_builder, type); }
  private native void allocate(MemoryPool pool,
                         @Const @SharedPtr @ByRef ArrayBuilder value_builder,
                         @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);

  public native @ByVal Status Resize(@Cast("int64_t") long _capacity);
  public native void Reset();
  public native @ByVal Status FinishInternal(@SharedPtr ArrayData out);

  /** \cond FALSE */
  /** \endcond */

  
  ///
  public native @ByVal Status Finish(@SharedPtr FixedSizeListArray out);

  /** \brief Append a valid fixed length list.
   * 
   *  This function affects only the validity bitmap; the child values must be appended
   *  using the child array builder. */
  
  ///
  ///
  public native @ByVal Status Append();

  /** \brief Vector append
   * 
   *  If passed, valid_bytes wil be read and any zero byte
   *  will cause the corresponding slot to be null
   * 
   *  This function affects only the validity bitmap; the child values must be appended
   *  using the child array builder. This includes appending nulls for null lists.
   *  XXX this restriction is confusing, should this method be omitted? */
  
  ///
  public native @ByVal Status AppendValues(@Cast("int64_t") long length, @Cast("const uint8_t*") BytePointer valid_bytes/*=nullptr*/);
  public native @ByVal Status AppendValues(@Cast("int64_t") long length);
  public native @ByVal Status AppendValues(@Cast("int64_t") long length, @Cast("const uint8_t*") ByteBuffer valid_bytes/*=nullptr*/);
  public native @ByVal Status AppendValues(@Cast("int64_t") long length, @Cast("const uint8_t*") byte[] valid_bytes/*=nullptr*/);

  /** \brief Append a null fixed length list.
   * 
   *  The child array builder will have the appropriate number of nulls appended
   *  automatically. */
  
  ///
  public native @ByVal Status AppendNull();

  /** \brief Append length null fixed length lists.
   * 
   *  The child array builder will have the appropriate number of nulls appended
   *  automatically. */
  public native @ByVal Status AppendNulls(@Cast("int64_t") long length);

  public native @ByVal Status ValidateOverflow(@Cast("int64_t") long new_elements);

  public native @ByVal Status AppendEmptyValue();

  public native @ByVal Status AppendEmptyValues(@Cast("int64_t") long length);

  public native @ByVal Status AppendArraySlice(@Const @ByRef ArrayData array, @Cast("int64_t") long offset, @Cast("int64_t") long length);

  public native ArrayBuilder value_builder();

  public native @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type();

  // Cannot make this a static attribute because of linking issues
  public static native @Cast("const int64_t") long maximum_elements();
}

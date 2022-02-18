// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class BinaryScalar extends BaseBinaryScalar {
    static { Loader.load(); }

  
    
      
      
        public BinaryScalar(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(type); }
        private native void allocate(@SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BinaryScalar(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BinaryScalar(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BinaryScalar position(long position) {
        return (BinaryScalar)super.position(position);
    }
    @Override public BinaryScalar getPointer(long i) {
        return new BinaryScalar((Pointer)this).offsetAddress(i);
    }


  public BinaryScalar(@SharedPtr ArrowBuffer value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type) { super((Pointer)null); allocate(value, type); }
  private native void allocate(@SharedPtr ArrowBuffer value, @SharedPtr @Cast({"", "std::shared_ptr<arrow::DataType>"}) DataType type);

  public BinaryScalar(@SharedPtr ArrowBuffer value) { super((Pointer)null); allocate(value); }
  private native void allocate(@SharedPtr ArrowBuffer value);

  public BinaryScalar() { super((Pointer)null); allocate(); }
  private native void allocate();
}

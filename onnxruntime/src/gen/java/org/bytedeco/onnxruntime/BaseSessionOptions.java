// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;

@Name("Ort::Base<OrtSessionOptions>") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class BaseSessionOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseSessionOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BaseSessionOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BaseSessionOptions position(long position) {
        return (BaseSessionOptions)super.position(position);
    }
    @Override public BaseSessionOptions getPointer(long i) {
        return new BaseSessionOptions((Pointer)this).offsetAddress(i);
    }


  public BaseSessionOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
  public BaseSessionOptions(OrtSessionOptions p) { super((Pointer)null); allocate(p); }
  private native void allocate(OrtSessionOptions p);

  public native @Name("operator OrtSessionOptions*") OrtSessionOptions asOrtSessionOptions();

  /** \brief Releases ownership of the contained pointer */
  public native OrtSessionOptions release();
}

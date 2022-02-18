// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;

/** Intel(R) MKL-DNN exception class.
 * 
 *  This class captures the status returned by the failed C API function, error
 *  message, and, optionally, handle of the primitive that caused the error. */
@Namespace("mkldnn") @NoOffset @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class error extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public error(Pointer p) { super(p); }

    public native @Cast("mkldnn_status_t") int status(); public native error status(int setter);
    public native @StdString BytePointer message(); public native error message(BytePointer setter);
    
    ///
    public native @ByRef primitive error_primitive(); public native error error_primitive(primitive setter);

    /** Constructs an error instance.
     * 
     *  @param astatus The error status returned by the C API.
     *  @param amessage The error message.
     *  @param aerror_primitive (optional) A C handle of the primitive that
     *                          caused the error. */

    
    ///
    public error(@Cast("mkldnn_status_t") int astatus, @StdString BytePointer amessage,
                mkldnn_primitive aerror_primitive/*=0*/) { super((Pointer)null); allocate(astatus, amessage, aerror_primitive); }
    private native void allocate(@Cast("mkldnn_status_t") int astatus, @StdString BytePointer amessage,
                mkldnn_primitive aerror_primitive/*=0*/);
    public error(@Cast("mkldnn_status_t") int astatus, @StdString BytePointer amessage) { super((Pointer)null); allocate(astatus, amessage); }
    private native void allocate(@Cast("mkldnn_status_t") int astatus, @StdString BytePointer amessage);
    public error(@Cast("mkldnn_status_t") int astatus, @StdString String amessage,
                mkldnn_primitive aerror_primitive/*=0*/) { super((Pointer)null); allocate(astatus, amessage, aerror_primitive); }
    private native void allocate(@Cast("mkldnn_status_t") int astatus, @StdString String amessage,
                mkldnn_primitive aerror_primitive/*=0*/);
    public error(@Cast("mkldnn_status_t") int astatus, @StdString String amessage) { super((Pointer)null); allocate(astatus, amessage); }
    private native void allocate(@Cast("mkldnn_status_t") int astatus, @StdString String amessage);

    /** A convenience function for wrapping calls to the C API. Checks the
     *  return status and throws an #error in case of failure.
     * 
     *  @param status The error status returned by the C API.
     *  @param message The error message.
     *  @param error_primitive (optional) A C handle of the primitive that
     *                         caused the error. */

    public static native void wrap_c_api(@Cast("mkldnn_status_t") int status,
                @StdString BytePointer message,
                @ByPtrPtr mkldnn_primitive error_primitive/*=0*/);
    public static native void wrap_c_api(@Cast("mkldnn_status_t") int status,
                @StdString BytePointer message);
    public static native void wrap_c_api(@Cast("mkldnn_status_t") int status,
                @StdString String message,
                @Cast("mkldnn_primitive_t*") PointerPointer error_primitive/*=0*/);
    public static native void wrap_c_api(@Cast("mkldnn_status_t") int status,
                @StdString String message);
}

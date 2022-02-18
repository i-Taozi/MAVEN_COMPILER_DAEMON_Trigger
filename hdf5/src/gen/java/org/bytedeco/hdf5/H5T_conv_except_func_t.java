// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;

/** <!-- [H5T_conv_t_snip] -->
 <p>
 *  <!-- [H5T_conv_except_func_t_snip] -->
/**
 * \brief Exception handler.
 *
 * @param except_type [in] The kind of exception that occurred
 * @param src_id [in] Source datatype identifier
 * @param dst_id [in] Destination datatype identifier
 * @param src_buf [in] Source data buffer
 * @param dst_buf [in,out] Destination data buffer
 * @param user_data [in,out] Callback context
 * @return Valid callback function return values are #H5T_CONV_ABORT,
 *          #H5T_CONV_UNHANDLED and #H5T_CONV_HANDLED.
 *
 * \details If an exception like overflow happenes during conversion, this
 *          function is called if it's registered through H5Pset_type_conv_cb().
 *
 */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5T_conv_except_func_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5T_conv_except_func_t(Pointer p) { super(p); }
    protected H5T_conv_except_func_t() { allocate(); }
    private native void allocate();
    public native @Cast("H5T_conv_ret_t") int call(@Cast("H5T_conv_except_t") int except_type, @Cast("hid_t") long src_id, @Cast("hid_t") long dst_id,
                                                 Pointer src_buf, Pointer dst_buf, Pointer user_data);
}

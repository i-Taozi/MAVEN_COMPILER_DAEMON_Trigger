// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.libpostal;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libpostal.global.postal.*;


@Properties(inherit = org.bytedeco.libpostal.presets.postal.class)
public class libpostal_address_parser_options_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public libpostal_address_parser_options_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public libpostal_address_parser_options_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public libpostal_address_parser_options_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public libpostal_address_parser_options_t position(long position) {
        return (libpostal_address_parser_options_t)super.position(position);
    }
    @Override public libpostal_address_parser_options_t getPointer(long i) {
        return new libpostal_address_parser_options_t((Pointer)this).offsetAddress(i);
    }

    public native @Cast("char*") BytePointer language(); public native libpostal_address_parser_options_t language(BytePointer setter);
    public native @Cast("char*") BytePointer country(); public native libpostal_address_parser_options_t country(BytePointer setter);
}

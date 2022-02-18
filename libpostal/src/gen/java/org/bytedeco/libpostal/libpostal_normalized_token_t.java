// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.libpostal;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libpostal.global.postal.*;



@Properties(inherit = org.bytedeco.libpostal.presets.postal.class)
public class libpostal_normalized_token_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public libpostal_normalized_token_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public libpostal_normalized_token_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public libpostal_normalized_token_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public libpostal_normalized_token_t position(long position) {
        return (libpostal_normalized_token_t)super.position(position);
    }
    @Override public libpostal_normalized_token_t getPointer(long i) {
        return new libpostal_normalized_token_t((Pointer)this).offsetAddress(i);
    }

    public native @Cast("char*") BytePointer str(); public native libpostal_normalized_token_t str(BytePointer setter);
    public native @ByRef libpostal_token_t token(); public native libpostal_normalized_token_t token(libpostal_token_t setter);
}

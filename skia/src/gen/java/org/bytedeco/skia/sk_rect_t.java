// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.skia;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.skia.global.Skia.*;


@Properties(inherit = org.bytedeco.skia.presets.Skia.class)
public class sk_rect_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sk_rect_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sk_rect_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sk_rect_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sk_rect_t position(long position) {
        return (sk_rect_t)super.position(position);
    }
    @Override public sk_rect_t getPointer(long i) {
        return new sk_rect_t((Pointer)this).offsetAddress(i);
    }

    public native float left(); public native sk_rect_t left(float setter);
    public native float top(); public native sk_rect_t top(float setter);
    public native float right(); public native sk_rect_t right(float setter);
    public native float bottom(); public native sk_rect_t bottom(float setter);
}

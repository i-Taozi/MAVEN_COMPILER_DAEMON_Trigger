// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;



@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyShortScalarObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyShortScalarObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyShortScalarObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyShortScalarObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyShortScalarObject position(long position) {
        return (PyShortScalarObject)super.position(position);
    }
    @Override public PyShortScalarObject getPointer(long i) {
        return new PyShortScalarObject((Pointer)this).offsetAddress(i);
    }

        public native @ByRef PyObject ob_base(); public native PyShortScalarObject ob_base(PyObject setter);
        public native short obval(); public native PyShortScalarObject obval(short setter);
}

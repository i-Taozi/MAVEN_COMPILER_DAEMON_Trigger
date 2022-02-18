// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _frame extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _frame() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _frame(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _frame(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _frame position(long position) {
        return (_frame)super.position(position);
    }
    @Override public _frame getPointer(long i) {
        return new _frame((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyVarObject ob_base(); public native _frame ob_base(PyVarObject setter);
    public native _frame f_back(); public native _frame f_back(_frame setter);      /* previous frame, or NULL */
    public native PyCodeObject f_code(); public native _frame f_code(PyCodeObject setter);       /* code segment */
    public native PyObject f_builtins(); public native _frame f_builtins(PyObject setter);       /* builtin symbol table (PyDictObject) */
    public native PyObject f_globals(); public native _frame f_globals(PyObject setter);        /* global symbol table (PyDictObject) */
    public native PyObject f_locals(); public native _frame f_locals(PyObject setter);         /* local symbol table (any mapping) */
    public native PyObject f_valuestack(int i); public native _frame f_valuestack(int i, PyObject setter);
    public native @Cast("PyObject**") PointerPointer f_valuestack(); public native _frame f_valuestack(PointerPointer setter);    /* points after the last local */
    public native PyObject f_trace(); public native _frame f_trace(PyObject setter);          /* Trace function */
    public native int f_stackdepth(); public native _frame f_stackdepth(int setter);           /* Depth of value stack */
    public native @Cast("char") byte f_trace_lines(); public native _frame f_trace_lines(byte setter);         /* Emit per-line trace events? */
    public native @Cast("char") byte f_trace_opcodes(); public native _frame f_trace_opcodes(byte setter);       /* Emit per-opcode trace events? */

    /* Borrowed reference to a generator, or NULL */
    public native PyObject f_gen(); public native _frame f_gen(PyObject setter);

    public native int f_lasti(); public native _frame f_lasti(int setter);                /* Last instruction if called */
    public native int f_lineno(); public native _frame f_lineno(int setter);               /* Current line number. Only valid if non-zero */
    public native int f_iblock(); public native _frame f_iblock(int setter);               /* index in f_blockstack */
    public native @Cast("PyFrameState") byte f_state(); public native _frame f_state(byte setter);       /* What state the frame is in */
    public native @ByRef PyTryBlock f_blockstack(int i); public native _frame f_blockstack(int i, PyTryBlock setter);
    @MemberGetter public native PyTryBlock f_blockstack(); /* for try and loop blocks */
    public native PyObject f_localsplus(int i); public native _frame f_localsplus(int i, PyObject setter);
    @MemberGetter public native @Cast("PyObject**") PointerPointer f_localsplus();  /* locals+stack, dynamically sized */
}

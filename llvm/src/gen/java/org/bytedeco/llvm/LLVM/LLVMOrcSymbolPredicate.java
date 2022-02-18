// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * Predicate function for SymbolStringPoolEntries.
 */
@Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMOrcSymbolPredicate extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    LLVMOrcSymbolPredicate(Pointer p) { super(p); }
    protected LLVMOrcSymbolPredicate() { allocate(); }
    private native void allocate();
    public native int call(Pointer Ctx,
                                      LLVMOrcSymbolStringPoolEntryRef Sym);
}

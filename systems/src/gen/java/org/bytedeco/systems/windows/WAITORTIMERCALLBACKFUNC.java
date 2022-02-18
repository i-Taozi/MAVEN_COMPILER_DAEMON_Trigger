// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;
 
@Convention("NTAPI") @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class WAITORTIMERCALLBACKFUNC extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    WAITORTIMERCALLBACKFUNC(Pointer p) { super(p); }
    protected WAITORTIMERCALLBACKFUNC() { allocate(); }
    private native void allocate();
    public native void call(@Cast("PVOID") Pointer arg0, @Cast("BOOLEAN") boolean arg1 );
}

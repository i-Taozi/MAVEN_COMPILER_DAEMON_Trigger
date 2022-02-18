// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tesseract;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.leptonica.*;
import static org.bytedeco.leptonica.global.lept.*;

import static org.bytedeco.tesseract.global.tesseract.*;

@Properties(inherit = org.bytedeco.tesseract.presets.tesseract.class)
public class PROGRESS_FUNC extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PROGRESS_FUNC(Pointer p) { super(p); }
    protected PROGRESS_FUNC() { allocate(); }
    private native void allocate();
    public native @Cast("bool") boolean call(int arg0, int arg1, int arg2, int arg3, int arg4);
}

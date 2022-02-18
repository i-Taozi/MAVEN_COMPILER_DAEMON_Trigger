// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cusolver;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cusparse.*;
import static org.bytedeco.cuda.global.cusparse.*;

import static org.bytedeco.cuda.global.cusolver.*;


@Opaque @Properties(inherit = org.bytedeco.cuda.presets.cusolver.class)
public class csrqrInfo extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public csrqrInfo() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public csrqrInfo(Pointer p) { super(p); }
}

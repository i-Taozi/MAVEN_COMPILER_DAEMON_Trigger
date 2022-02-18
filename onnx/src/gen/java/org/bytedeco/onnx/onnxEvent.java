// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

/** Opaque ONNXIFI even handle. */
@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class onnxEvent extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public onnxEvent() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public onnxEvent(Pointer p) { super(p); }
}

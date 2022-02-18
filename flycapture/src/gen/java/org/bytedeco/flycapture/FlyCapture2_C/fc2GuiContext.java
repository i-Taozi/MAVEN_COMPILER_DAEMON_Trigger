// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.flycapture.FlyCapture2.*;
import static org.bytedeco.flycapture.global.FlyCapture2.*;

import static org.bytedeco.flycapture.global.FlyCapture2_C.*;


    /**
     * A context to the FlyCapture2 C GUI library. It must be created before
     * performing any calls to the library.
     */
    @Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2_C.class)
public class fc2GuiContext extends Pointer {
        /** Empty constructor. Calls {@code super((Pointer)null)}. */
        public fc2GuiContext() { super((Pointer)null); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public fc2GuiContext(Pointer p) { super(p); }
    }

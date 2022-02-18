// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.spinnaker.Spinnaker_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.spinnaker.global.Spinnaker_C.*;


/**
 * Handle for arrival event handler functionality. Created by calling
 * spinArrivalEventCreate(), which requires a call to
 * spinDeviceArrivalEventHandlerDestroy() to destroy.
 */
@Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.spinnaker.presets.Spinnaker_C.class)
public class spinDeviceArrivalEventHandler extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public spinDeviceArrivalEventHandler() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public spinDeviceArrivalEventHandler(Pointer p) { super(p); }
}

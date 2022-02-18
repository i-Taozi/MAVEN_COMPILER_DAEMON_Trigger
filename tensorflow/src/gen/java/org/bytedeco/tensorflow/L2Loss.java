// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** L2 Loss.
 * 
 *  Computes half the L2 norm of a tensor without the {@code sqrt}:
 * 
 *      output = sum(t ** 2) / 2
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * t: Typically 2-D, but may have any dimensions.
 * 
 *  Returns:
 *  * {@code Output}: 0-D. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class L2Loss extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public L2Loss(Pointer p) { super(p); }

  public L2Loss(@Const @ByRef Scope scope, @ByVal Input t) { super((Pointer)null); allocate(scope, t); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input t);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native L2Loss operation(Operation setter);
  public native @ByRef Output output(); public native L2Loss output(Output setter);
}

// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TF_WhileParams extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TF_WhileParams(Pointer p) { super(p); }

  // The number of inputs to the while loop, i.e. the number of loop variables.
  // This is the size of cond_inputs, body_inputs, and body_outputs.
  @MemberGetter public native int ninputs();

  // The while condition graph. The inputs are the current values of the loop
  // variables. The output should be a scalar boolean.
  @MemberGetter public native TF_Graph cond_graph();
  @MemberGetter public native @Const TF_Output cond_inputs();
  public native @ByRef TF_Output cond_output(); public native TF_WhileParams cond_output(TF_Output setter);

  // The loop body graph. The inputs are the current values of the loop
  // variables. The outputs are the updated values of the loop variables.
  @MemberGetter public native TF_Graph body_graph();
  @MemberGetter public native @Const TF_Output body_inputs();
  @MemberGetter public native TF_Output body_outputs();

  // Unique null-terminated name for this while loop. This is used as a prefix
  // for created operations.
  public native @Cast("const char*") BytePointer name(); public native TF_WhileParams name(BytePointer setter);
}

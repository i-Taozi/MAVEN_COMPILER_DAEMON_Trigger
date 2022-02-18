// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// defines how a method obtained from a module/class/interface behaves in script
@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MethodValue extends SugaredValue {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MethodValue(Pointer p) { super(p); }

  public MethodValue(Value self, @ByVal StringVector method_names) { super((Pointer)null); allocate(self, method_names); }
  private native void allocate(Value self, @ByVal StringVector method_names);
  public MethodValue(Value self, @StdString BytePointer method_name) { super((Pointer)null); allocate(self, method_name); }
  private native void allocate(Value self, @StdString BytePointer method_name);
  public MethodValue(Value self, @StdString String method_name) { super((Pointer)null); allocate(self, method_name); }
  private native void allocate(Value self, @StdString String method_name);

  public native @StdString BytePointer kind();

  public native @SharedPtr @ByVal SugaredValue call(
        @Const @ByRef SourceRange loc,
        @ByRef Function f,
        @ByVal NamedValueArrayRef args,
        @ByVal NamedValueArrayRef kwargs,
        @Cast("size_t") long n_binders);
}

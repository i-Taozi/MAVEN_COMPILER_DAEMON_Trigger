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


@Name("torch::jit::Named<at::Tensor>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class NamedTensor extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NamedTensor() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NamedTensor(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NamedTensor(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NamedTensor position(long position) {
        return (NamedTensor)super.position(position);
    }
    @Override public NamedTensor getPointer(long i) {
        return new NamedTensor((Pointer)this).offsetAddress(i);
    }

  public native @StdString BytePointer name(); public native NamedTensor name(BytePointer setter);
  public native @ByRef Tensor value(); public native NamedTensor value(Tensor setter);
}

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


/**
 * quint4x2 is for un-signed 4 bit quantized Tensors that are packed to byte
 * boundary.
 */
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class quint4x2 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public quint4x2(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public quint4x2(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public quint4x2 position(long position) {
        return (quint4x2)super.position(position);
    }
    @Override public quint4x2 getPointer(long i) {
        return new quint4x2((Pointer)this).offsetAddress(i);
    }

  public native @Cast("uint8_t") byte val_(); public native quint4x2 val_(byte setter);
  public quint4x2() { super((Pointer)null); allocate(); }
  private native void allocate();
  public quint4x2(@Cast("uint8_t") byte val) { super((Pointer)null); allocate(val); }
  private native void allocate(@Cast("uint8_t") byte val);
}

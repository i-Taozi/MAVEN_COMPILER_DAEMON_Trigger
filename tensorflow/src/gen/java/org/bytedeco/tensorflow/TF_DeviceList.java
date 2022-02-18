// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TF_DeviceList extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TF_DeviceList() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TF_DeviceList(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TF_DeviceList(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TF_DeviceList position(long position) {
        return (TF_DeviceList)super.position(position);
    }
    @Override public TF_DeviceList getPointer(long i) {
        return new TF_DeviceList((Pointer)this).offsetAddress(i);
    }

  public native @StdVector DeviceAttributes response(); public native TF_DeviceList response(DeviceAttributes setter);
}

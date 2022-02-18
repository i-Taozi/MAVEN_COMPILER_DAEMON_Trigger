// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** \brief Configure a grouped aggregation */
@Namespace("arrow::compute::internal") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class Aggregate extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Aggregate() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Aggregate(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Aggregate(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Aggregate position(long position) {
        return (Aggregate)super.position(position);
    }
    @Override public Aggregate getPointer(long i) {
        return new Aggregate((Pointer)this).offsetAddress(i);
    }

  /** the name of the aggregation function */
  public native @StdString String function(); public native Aggregate function(String setter);

  /** options for the aggregation function */
  public native @Const FunctionOptions options(); public native Aggregate options(FunctionOptions setter);
}

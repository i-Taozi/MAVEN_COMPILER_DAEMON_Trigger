// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;
  // namespace detail

/** Concrete type class for always-null data */
@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class NullType extends DataType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NullType(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NullType(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public NullType position(long position) {
        return (NullType)super.position(position);
    }
    @Override public NullType getPointer(long i) {
        return new NullType((Pointer)this).offsetAddress(i);
    }

  @MemberGetter public static native @Cast("const arrow::Type::type") int type_id();
  public static final int type_id = type_id();

  public static native String type_name();

  public NullType() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @StdString String ToString();

  public native @ByVal DataTypeLayout layout();

  public native @StdString String name();
}

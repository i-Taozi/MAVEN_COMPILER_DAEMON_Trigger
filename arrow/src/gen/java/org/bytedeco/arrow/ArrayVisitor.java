// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class ArrayVisitor extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ArrayVisitor() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ArrayVisitor(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ArrayVisitor(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ArrayVisitor position(long position) {
        return (ArrayVisitor)super.position(position);
    }
    @Override public ArrayVisitor getPointer(long i) {
        return new ArrayVisitor((Pointer)this).offsetAddress(i);
    }


  public native @ByVal Status Visit(@Const @ByRef NullArray array);
  public native @ByVal Status Visit(@Const @ByRef BooleanArray array);
  public native @ByVal Status Visit(@Const @ByRef Int8Array array);
  public native @ByVal Status Visit(@Const @ByRef Int16Array array);
  public native @ByVal Status Visit(@Const @ByRef Int32Array array);
  public native @ByVal Status Visit(@Const @ByRef Int64Array array);
  public native @ByVal Status Visit(@Const @ByRef UInt8Array array);
  public native @ByVal Status Visit(@Const @ByRef UInt16Array array);
  public native @ByVal Status Visit(@Const @ByRef UInt32Array array);
  public native @ByVal Status Visit(@Const @ByRef UInt64Array array);
  public native @ByVal Status Visit(@Const @ByRef HalfFloatArray array);
  public native @ByVal Status Visit(@Const @ByRef FloatArray array);
  public native @ByVal Status Visit(@Const @ByRef DoubleArray array);
  public native @ByVal Status Visit(@Const @ByRef StringArray array);
  public native @ByVal Status Visit(@Const @ByRef BinaryArray array);
  public native @ByVal Status Visit(@Const @ByRef LargeStringArray array);
  public native @ByVal Status Visit(@Const @ByRef LargeBinaryArray array);
  public native @ByVal Status Visit(@Const @ByRef FixedSizeBinaryArray array);
  public native @ByVal Status Visit(@Const @ByRef Date32Array array);
  public native @ByVal Status Visit(@Const @ByRef Date64Array array);
  public native @ByVal Status Visit(@Const @ByRef Time32Array array);
  public native @ByVal Status Visit(@Const @ByRef Time64Array array);
  public native @ByVal Status Visit(@Const @ByRef TimestampArray array);
  public native @ByVal Status Visit(@Const @ByRef DayTimeIntervalArray array);
  public native @ByVal Status Visit(@Const @ByRef MonthDayNanoIntervalArray array);
  public native @ByVal Status Visit(@Const @ByRef MonthIntervalArray array);
  public native @ByVal Status Visit(@Const @ByRef DurationArray array);
  public native @ByVal Status Visit(@Const @ByRef Decimal128Array array);
  public native @ByVal Status Visit(@Const @ByRef Decimal256Array array);
  public native @ByVal Status Visit(@Const @ByRef ListArray array);
  public native @ByVal Status Visit(@Const @ByRef LargeListArray array);
  public native @ByVal Status Visit(@Const @ByRef MapArray array);
  public native @ByVal Status Visit(@Const @ByRef FixedSizeListArray array);
  public native @ByVal Status Visit(@Const @ByRef StructArray array);
  public native @ByVal Status Visit(@Const @ByRef SparseUnionArray array);
  public native @ByVal Status Visit(@Const @ByRef DenseUnionArray array);
  public native @ByVal Status Visit(@Const @ByRef DictionaryArray array);
  public native @ByVal Status Visit(@Const @ByRef ExtensionArray array);
}

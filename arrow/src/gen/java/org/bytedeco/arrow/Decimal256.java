// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


/** Represents a signed 256-bit integer in two's complement.
 *  The max decimal precision that can be safely represented is
 *  76 significant digits.
 * 
 *  The implementation is split into two parts :
 * 
 *  1. BasicDecimal256
 *     - can be safely compiled to IR without references to libstdc++.
 *  2. Decimal256
 *     - (TODO) has additional functionality on top of BasicDecimal256 to deal with
 *       strings and streams. */
@Namespace("arrow") @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class Decimal256 extends BasicDecimal256 {
    static { Loader.load(); }

  
    
    ///
    public Decimal256(@Const @ByRef Long4Array array) { super((Pointer)null); allocate(array); }
    @NoException(true) private native void allocate(@Const @ByRef Long4Array array);
    public Decimal256() { super((Pointer)null); allocate(); }
    @NoException(true) private native void allocate();
  
    public Decimal256(@Const @ByRef BasicDecimal128 value) { super((Pointer)null); allocate(value); }
    @NoException(true) private native void allocate(@Const @ByRef BasicDecimal128 value);
    public Decimal256(@Cast("const uint8_t*") BytePointer bytes) { super((Pointer)null); allocate(bytes); }
    private native void allocate(@Cast("const uint8_t*") BytePointer bytes);
    public Decimal256(@Cast("const uint8_t*") ByteBuffer bytes) { super((Pointer)null); allocate(bytes); }
    private native void allocate(@Cast("const uint8_t*") ByteBuffer bytes);
    public Decimal256(@Cast("const uint8_t*") byte[] bytes) { super((Pointer)null); allocate(bytes); }
    private native void allocate(@Cast("const uint8_t*") byte[] bytes);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Decimal256(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Decimal256(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Decimal256 position(long position) {
        return (Decimal256)super.position(position);
    }
    @Override public Decimal256 getPointer(long i) {
        return new Decimal256((Pointer)this).offsetAddress(i);
    }

  /** \cond FALSE */
  // (need to avoid a duplicate definition in Sphinx)
  /** \endcond
   <p>
   *  \brief constructor creates a Decimal256 from a BasicDecimal256. */
  public Decimal256(@Const @ByRef BasicDecimal256 value) { super((Pointer)null); allocate(value); }
  @NoException(true) private native void allocate(@Const @ByRef BasicDecimal256 value);

  /** \brief Parse the number from a base 10 string representation. */
  public Decimal256(@StdString String value) { super((Pointer)null); allocate(value); }
  private native void allocate(@StdString String value);

  /** \brief Empty constructor creates a Decimal256 with a value of 0. */
  // This is required on some older compilers.

  /** \brief Convert the Decimal256 value to a base 10 decimal string with the given
   *  scale. */
  public native @StdString String ToString(int scale);

  /** \brief Convert the value to an integer string */
  public native @StdString String ToIntegerString();

  /** \brief Convert a decimal string to a Decimal256 value, optionally including
   *  precision and scale if they're passed in and not null. */
  public static native @ByVal Status FromString(@StdString String s, Decimal256 out, IntPointer precision,
                             IntPointer scale/*=nullptr*/);
  public static native @ByVal Status FromString(@StdString String s, Decimal256 out, IntPointer precision);
  public static native @ByVal Status FromString(@StdString BytePointer s, Decimal256 out, IntBuffer precision,
                             IntBuffer scale/*=nullptr*/);
  public static native @ByVal Status FromString(@StdString BytePointer s, Decimal256 out, IntBuffer precision);
  public static native @ByVal Status FromString(@StdString String s, Decimal256 out, int[] precision,
                             int[] scale/*=nullptr*/);
  public static native @ByVal Status FromString(@StdString String s, Decimal256 out, int[] precision);
  public static native @ByVal Status FromString(@StdString BytePointer s, Decimal256 out, IntPointer precision,
                             IntPointer scale/*=nullptr*/);
  public static native @ByVal Status FromString(@StdString BytePointer s, Decimal256 out, IntPointer precision);
  public static native @ByVal Status FromString(@StdString String s, Decimal256 out, IntBuffer precision,
                             IntBuffer scale/*=nullptr*/);
  public static native @ByVal Status FromString(@StdString String s, Decimal256 out, IntBuffer precision);
  public static native @ByVal Status FromString(@StdString BytePointer s, Decimal256 out, int[] precision,
                             int[] scale/*=nullptr*/);
  public static native @ByVal Status FromString(@StdString BytePointer s, Decimal256 out, int[] precision);
  public static native @ByVal Decimal256Result FromString(@StdString String s);
  public static native @ByVal Decimal256Result FromString(@StdString BytePointer s);

  /** \brief Convert Decimal256 from one scale to another */
  
  ///
  public native @ByVal Decimal256Result Rescale(int original_scale, int new_scale);

  /** Divide this number by right and return the result.
   * 
   *  This operation is not destructive.
   *  The answer rounds to zero. Signs work like:
   *    21 /  5 ->  4,  1
   *   -21 /  5 -> -4, -1
   *    21 / -5 -> -4,  1
   *   -21 / -5 ->  4, -1
   *  @param divisor [in] the number to divide by
   *  @return the pair of the quotient and the remainder */
  public native @ByVal Decimal256PairResult Divide(@Const @ByRef Decimal256 divisor);

  /** \brief Convert from a big-endian byte representation. The length must be
   *         between 1 and 32.
   *  @return error status if the length is an invalid value */
  public static native @ByVal Decimal256Result FromBigEndian(@Cast("const uint8_t*") BytePointer data, int length);
  public static native @ByVal Decimal256Result FromBigEndian(@Cast("const uint8_t*") ByteBuffer data, int length);
  public static native @ByVal Decimal256Result FromBigEndian(@Cast("const uint8_t*") byte[] data, int length);

  public static native @ByVal Decimal256Result FromReal(double real, int precision, int scale);
  public static native @ByVal Decimal256Result FromReal(float real, int precision, int scale);

  /** \brief Convert to a floating-point number (scaled).
   *  May return infinity in case of overflow. */
  public native float ToFloat(int scale);
  /** \brief Convert to a floating-point number (scaled) */
  public native double ToDouble(int scale);

  /** \brief Convert to a floating-point number (scaled) */

  
}

// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;

// #else
// #endif


@Name("gsl_dht_struct") @Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_dht extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_dht() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_dht(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_dht(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_dht position(long position) {
        return (gsl_dht)super.position(position);
    }
    @Override public gsl_dht getPointer(long i) {
        return new gsl_dht((Pointer)this).offsetAddress(i);
    }

  public native @Cast("size_t") long size(); public native gsl_dht size(long setter);  /* size of the sample arrays to be transformed    */
  public native double nu(); public native gsl_dht nu(double setter);    /* Bessel function order                          */
  public native double xmax(); public native gsl_dht xmax(double setter);  /* the upper limit to the x-sampling domain       */
  public native double kmax(); public native gsl_dht kmax(double setter);  /* the upper limit to the k-sampling domain       */
  public native DoublePointer j(); public native gsl_dht j(DoublePointer setter);     /* array of computed J_nu zeros, j_{nu,s} = j[s]  */
  public native DoublePointer Jjj(); public native gsl_dht Jjj(DoublePointer setter);   /* transform numerator, J_nu(j_i j_m / j_N)       */
  public native DoublePointer J2(); public native gsl_dht J2(DoublePointer setter);    /* transform denominator, J_{nu+1}^2(j_m)         */
}

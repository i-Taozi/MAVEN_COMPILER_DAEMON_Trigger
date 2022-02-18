// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_ml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_ml.*;


/** \brief The structure represents the logarithmic grid range of statmodel parameters.
<p>
It is used for optimizing statmodel accuracy by varying model parameters, the accuracy estimate
being computed by cross-validation.
 */
@Namespace("cv::ml") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_ml.class)
public class ParamGrid extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ParamGrid(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ParamGrid(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ParamGrid position(long position) {
        return (ParamGrid)super.position(position);
    }
    @Override public ParamGrid getPointer(long i) {
        return new ParamGrid((Pointer)this).offsetAddress(i);
    }

    /** \brief Default constructor */
    public ParamGrid() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** \brief Constructor with parameters */
    public ParamGrid(double _minVal, double _maxVal, double _logStep) { super((Pointer)null); allocate(_minVal, _maxVal, _logStep); }
    private native void allocate(double _minVal, double _maxVal, double _logStep);

    /** Minimum value of the statmodel parameter. Default value is 0. */
    public native double minVal(); public native ParamGrid minVal(double setter);
    /** Maximum value of the statmodel parameter. Default value is 0. */
    public native double maxVal(); public native ParamGrid maxVal(double setter);
    /** \brief Logarithmic step for iterating the statmodel parameter.
    <p>
    The grid determines the following iteration sequence of the statmodel parameter values:
    <pre>{@code \[(minVal, minVal*step, minVal*{step}^2, \dots,  minVal*{logStep}^n),\]}</pre>
    where {@code n} is the maximal index satisfying
    <pre>{@code \[\texttt{minVal} * \texttt{logStep} ^n <  \texttt{maxVal}\]}</pre>
    The grid is logarithmic, so logStep must always be greater than 1. Default value is 1.
    */
    public native double logStep(); public native ParamGrid logStep(double setter);

    /** \brief Creates a ParamGrid Ptr that can be given to the %SVM::trainAuto method
    <p>
    @param minVal minimum value of the parameter grid
    @param maxVal maximum value of the parameter grid
    @param logstep Logarithmic step for iterating the statmodel parameter
    */
    public static native @Ptr ParamGrid create(double minVal/*=0.*/, double maxVal/*=0.*/, double logstep/*=1.*/);
    public static native @Ptr ParamGrid create();
}

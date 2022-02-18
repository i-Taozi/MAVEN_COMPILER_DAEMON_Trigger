// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_xphoto;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import org.bytedeco.opencv.opencv_photo.*;
import static org.bytedeco.opencv.global.opencv_photo.*;

import static org.bytedeco.opencv.global.opencv_xphoto.*;


/** \brief A simple white balance algorithm that works by independently stretching
    each of the input image channels to the specified range. For increased robustness
    it ignores the top and bottom {@code p\%} of pixel values.
 */
@Namespace("cv::xphoto") @Properties(inherit = org.bytedeco.opencv.presets.opencv_xphoto.class)
public class SimpleWB extends WhiteBalancer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SimpleWB(Pointer p) { super(p); }

    /** \brief Input image range minimum value
    @see setInputMin */
    public native float getInputMin();
    /** \copybrief getInputMin @see getInputMin */
    public native void setInputMin(float val);

    /** \brief Input image range maximum value
    @see setInputMax */
    public native float getInputMax();
    /** \copybrief getInputMax @see getInputMax */
    public native void setInputMax(float val);

    /** \brief Output image range minimum value
    @see setOutputMin */
    public native float getOutputMin();
    /** \copybrief getOutputMin @see getOutputMin */
    public native void setOutputMin(float val);

    /** \brief Output image range maximum value
    @see setOutputMax */
    public native float getOutputMax();
    /** \copybrief getOutputMax @see getOutputMax */
    public native void setOutputMax(float val);

    /** \brief Percent of top/bottom values to ignore
    @see setP */
    public native float getP();
    /** \copybrief getP @see getP */
    public native void setP(float val);
}

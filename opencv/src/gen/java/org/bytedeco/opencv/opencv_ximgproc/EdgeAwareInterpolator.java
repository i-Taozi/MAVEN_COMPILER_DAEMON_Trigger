// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_ximgproc;

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
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;

import static org.bytedeco.opencv.global.opencv_ximgproc.*;


/** \brief Sparse match interpolation algorithm based on modified locally-weighted affine
estimator from \cite Revaud2015 and Fast Global Smoother as post-processing filter.
 */
@Namespace("cv::ximgproc") @Properties(inherit = org.bytedeco.opencv.presets.opencv_ximgproc.class)
public class EdgeAwareInterpolator extends SparseMatchInterpolator {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EdgeAwareInterpolator(Pointer p) { super(p); }

    /** \brief Interface to provide a more elaborated cost map, i.e. edge map, for the edge-aware term.
     *  This implementation is based on a rather simple gradient-based edge map estimation.
     *  To used more complex edge map estimator (e.g. StructuredEdgeDetection that has been
     *  used in the original publication) that may lead to improved accuracies, the internal
     *  edge map estimation can be bypassed here.
     *  @param _costMap a type CV_32FC1 Mat is required.
     *  @see cv::ximgproc::createSuperpixelSLIC
    */
    public native void setCostMap(@Const @ByRef Mat _costMap);
    /** \brief Parameter to tune the approximate size of the superpixel used for oversegmentation.
     *  @see cv::ximgproc::createSuperpixelSLIC
    */
    /** \brief K is a number of nearest-neighbor matches considered, when fitting a locally affine
    model. Usually it should be around 128. However, lower values would make the interpolation
    noticeably faster.
     */
    public native void setK(int _k);
    /** @see setK */
    public native int getK();

    /** \brief Sigma is a parameter defining how fast the weights decrease in the locally-weighted affine
    fitting. Higher values can help preserve fine details, lower values can help to get rid of noise in the
    output flow.
     */
    public native void setSigma(float _sigma);
    /** @see setSigma */
    public native float getSigma();

    /** \brief Lambda is a parameter defining the weight of the edge-aware term in geodesic distance,
    should be in the range of 0 to 1000.
     */
    public native void setLambda(float _lambda);
    /** @see setLambda */
    public native float getLambda();

    /** \brief Sets whether the fastGlobalSmootherFilter() post-processing is employed. It is turned on by
    default.
     */
    public native void setUsePostProcessing(@Cast("bool") boolean _use_post_proc);
    /** @see setUsePostProcessing */
    public native @Cast("bool") boolean getUsePostProcessing();

    /** \brief Sets the respective fastGlobalSmootherFilter() parameter.
     */
    public native void setFGSLambda(float _lambda);
    /** @see setFGSLambda */
    public native float getFGSLambda();

    /** @see setFGSLambda */
    public native void setFGSSigma(float _sigma);
    /** @see setFGSLambda */
    public native float getFGSSigma();
}

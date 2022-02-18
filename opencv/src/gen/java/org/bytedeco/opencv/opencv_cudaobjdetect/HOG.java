// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudaobjdetect;

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
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_cudaarithm.*;
import static org.bytedeco.opencv.global.opencv_cudaarithm.*;
import org.bytedeco.opencv.opencv_cudafilters.*;
import static org.bytedeco.opencv.global.opencv_cudafilters.*;
import org.bytedeco.opencv.opencv_cudaimgproc.*;
import static org.bytedeco.opencv.global.opencv_cudaimgproc.*;
import static org.bytedeco.opencv.global.opencv_cudawarping.*;

import static org.bytedeco.opencv.global.opencv_cudaobjdetect.*;


/** \addtogroup cudaobjdetect
 *  \{ */

//
// HOG (Histogram-of-Oriented-Gradients) Descriptor and Object Detector
//

/** \brief The class implements Histogram of Oriented Gradients (\cite Dalal2005) object detector.
<p>
\note
    -   An example applying the HOG descriptor for people detection can be found at
        opencv_source_code/samples/cpp/peopledetect.cpp
    -   A CUDA example applying the HOG descriptor for people detection can be found at
        opencv_source_code/samples/gpu/hog.cpp
    -   (Python) An example applying the HOG descriptor for people detection can be found at
        opencv_source_code/samples/python/peopledetect.py
 */
@Namespace("cv::cuda") @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudaobjdetect.class)
public class HOG extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HOG(Pointer p) { super(p); }

    /** \brief Creates the HOG descriptor and detector.
    <p>
    @param win_size Detection window size. Align to block size and block stride.
    @param block_size Block size in pixels. Align to cell size. Only (16,16) is supported for now.
    @param block_stride Block stride. It must be a multiple of cell size.
    @param cell_size Cell size. Only (8, 8) is supported for now.
    @param nbins Number of bins. Only 9 bins per cell are supported for now.
     */
    public static native @Ptr HOG create(@ByVal(nullValue = "cv::Size(64, 128)") Size win_size,
                               @ByVal(nullValue = "cv::Size(16, 16)") Size block_size,
                               @ByVal(nullValue = "cv::Size(8, 8)") Size block_stride,
                               @ByVal(nullValue = "cv::Size(8, 8)") Size cell_size,
                               int nbins/*=9*/);
    public static native @Ptr HOG create();

    /** Gaussian smoothing window parameter. */
    public native void setWinSigma(double win_sigma);
    public native double getWinSigma();

    /** L2-Hys normalization method shrinkage. */
    public native void setL2HysThreshold(double threshold_L2hys);
    public native double getL2HysThreshold();

    /** Flag to specify whether the gamma correction preprocessing is required or not. */
    public native void setGammaCorrection(@Cast("bool") boolean gamma_correction);
    public native @Cast("bool") boolean getGammaCorrection();

    /** Maximum number of detection window increases. */
    public native void setNumLevels(int nlevels);
    public native int getNumLevels();

    /** Threshold for the distance between features and SVM classifying plane.
     *  Usually it is 0 and should be specified in the detector coefficients (as the last free
     *  coefficient). But if the free coefficient is omitted (which is allowed), you can specify it
     *  manually here. */
    public native void setHitThreshold(double hit_threshold);
    public native double getHitThreshold();

    /** Window stride. It must be a multiple of block stride. */
    public native void setWinStride(@ByVal Size win_stride);
    public native @ByVal Size getWinStride();

    /** Coefficient of the detection window increase. */
    public native void setScaleFactor(double scale0);
    public native double getScaleFactor();

    /** Coefficient to regulate the similarity threshold. When detected, some
     *  objects can be covered by many rectangles. 0 means not to perform grouping.
     *  See groupRectangles. */
    public native void setGroupThreshold(int group_threshold);
    public native int getGroupThreshold();

    /** Descriptor storage format:
     *    - **DESCR_FORMAT_ROW_BY_ROW** - Row-major order.
     *    - **DESCR_FORMAT_COL_BY_COL** - Column-major order. */
    public native void setDescriptorFormat(@Cast("cv::HOGDescriptor::DescriptorStorageFormat") int descr_format);
    public native @Cast("cv::HOGDescriptor::DescriptorStorageFormat") int getDescriptorFormat();

    /** \brief Returns the number of coefficients required for the classification.
     */
    public native @Cast("size_t") long getDescriptorSize();

    /** \brief Returns the block histogram size.
     */
    public native @Cast("size_t") long getBlockHistogramSize();

    /** \brief Sets coefficients for the linear SVM classifier.
     */
    public native void setSVMDetector(@ByVal Mat detector);
    public native void setSVMDetector(@ByVal UMat detector);
    public native void setSVMDetector(@ByVal GpuMat detector);

    /** \brief Returns coefficients of the classifier trained for people detection.
     */
    public native @ByVal Mat getDefaultPeopleDetector();

    /** \brief Performs object detection without a multi-scale window.
    <p>
    @param img Source image. CV_8UC1 and CV_8UC4 types are supported for now.
    @param found_locations Left-top corner points of detected objects boundaries.
    @param confidences Optional output array for confidences.
     */
    public native void detect(@ByVal Mat img,
                            @ByRef PointVector found_locations,
                            @Cast({"double*", "std::vector<double>*"}) @StdVector("double") DoublePointer confidences/*=NULL*/);
    public native void detect(@ByVal Mat img,
                            @ByRef PointVector found_locations);
    public native void detect(@ByVal Mat img,
                            @ByRef PointVector found_locations,
                            @Cast({"double*", "std::vector<double>*"}) @StdVector("double") DoubleBuffer confidences/*=NULL*/);
    public native void detect(@ByVal Mat img,
                            @ByRef PointVector found_locations,
                            @Cast({"double*", "std::vector<double>*"}) @StdVector("double") double[] confidences/*=NULL*/);
    public native void detect(@ByVal UMat img,
                            @ByRef PointVector found_locations,
                            @Cast({"double*", "std::vector<double>*"}) @StdVector("double") DoublePointer confidences/*=NULL*/);
    public native void detect(@ByVal UMat img,
                            @ByRef PointVector found_locations);
    public native void detect(@ByVal UMat img,
                            @ByRef PointVector found_locations,
                            @Cast({"double*", "std::vector<double>*"}) @StdVector("double") DoubleBuffer confidences/*=NULL*/);
    public native void detect(@ByVal UMat img,
                            @ByRef PointVector found_locations,
                            @Cast({"double*", "std::vector<double>*"}) @StdVector("double") double[] confidences/*=NULL*/);
    public native void detect(@ByVal GpuMat img,
                            @ByRef PointVector found_locations,
                            @Cast({"double*", "std::vector<double>*"}) @StdVector("double") DoublePointer confidences/*=NULL*/);
    public native void detect(@ByVal GpuMat img,
                            @ByRef PointVector found_locations);
    public native void detect(@ByVal GpuMat img,
                            @ByRef PointVector found_locations,
                            @Cast({"double*", "std::vector<double>*"}) @StdVector("double") DoubleBuffer confidences/*=NULL*/);
    public native void detect(@ByVal GpuMat img,
                            @ByRef PointVector found_locations,
                            @Cast({"double*", "std::vector<double>*"}) @StdVector("double") double[] confidences/*=NULL*/);

    /** \brief Performs object detection without a multi-scale window.
    <p>
    @param img Source image. CV_8UC1 and CV_8UC4 types are supported for now.
    @param found_locations Left-top corner points of detected objects boundaries.
     */
    public native void detectWithoutConf(@ByVal Mat img,
            @ByRef PointVector found_locations);
    public native void detectWithoutConf(@ByVal UMat img,
            @ByRef PointVector found_locations);
    public native void detectWithoutConf(@ByVal GpuMat img,
            @ByRef PointVector found_locations);

    /** \brief Performs object detection with a multi-scale window.
    <p>
    @param img Source image. See cuda::HOGDescriptor::detect for type limitations.
    @param found_locations Detected objects boundaries.
    @param confidences Optional output array for confidences.
     */
    public native void detectMultiScale(@ByVal Mat img,
                                      @ByRef RectVector found_locations,
                                      @Cast({"double*", "std::vector<double>*"}) @StdVector("double") DoublePointer confidences/*=NULL*/);
    public native void detectMultiScale(@ByVal Mat img,
                                      @ByRef RectVector found_locations);
    public native void detectMultiScale(@ByVal Mat img,
                                      @ByRef RectVector found_locations,
                                      @Cast({"double*", "std::vector<double>*"}) @StdVector("double") DoubleBuffer confidences/*=NULL*/);
    public native void detectMultiScale(@ByVal Mat img,
                                      @ByRef RectVector found_locations,
                                      @Cast({"double*", "std::vector<double>*"}) @StdVector("double") double[] confidences/*=NULL*/);
    public native void detectMultiScale(@ByVal UMat img,
                                      @ByRef RectVector found_locations,
                                      @Cast({"double*", "std::vector<double>*"}) @StdVector("double") DoublePointer confidences/*=NULL*/);
    public native void detectMultiScale(@ByVal UMat img,
                                      @ByRef RectVector found_locations);
    public native void detectMultiScale(@ByVal UMat img,
                                      @ByRef RectVector found_locations,
                                      @Cast({"double*", "std::vector<double>*"}) @StdVector("double") DoubleBuffer confidences/*=NULL*/);
    public native void detectMultiScale(@ByVal UMat img,
                                      @ByRef RectVector found_locations,
                                      @Cast({"double*", "std::vector<double>*"}) @StdVector("double") double[] confidences/*=NULL*/);
    public native void detectMultiScale(@ByVal GpuMat img,
                                      @ByRef RectVector found_locations,
                                      @Cast({"double*", "std::vector<double>*"}) @StdVector("double") DoublePointer confidences/*=NULL*/);
    public native void detectMultiScale(@ByVal GpuMat img,
                                      @ByRef RectVector found_locations);
    public native void detectMultiScale(@ByVal GpuMat img,
                                      @ByRef RectVector found_locations,
                                      @Cast({"double*", "std::vector<double>*"}) @StdVector("double") DoubleBuffer confidences/*=NULL*/);
    public native void detectMultiScale(@ByVal GpuMat img,
                                      @ByRef RectVector found_locations,
                                      @Cast({"double*", "std::vector<double>*"}) @StdVector("double") double[] confidences/*=NULL*/);

    /** \brief Performs object detection with a multi-scale window.
    <p>
    @param img Source image. See cuda::HOGDescriptor::detect for type limitations.
    @param found_locations Detected objects boundaries.
     */
    public native void detectMultiScaleWithoutConf(@ByVal Mat img,
            @ByRef RectVector found_locations);
    public native void detectMultiScaleWithoutConf(@ByVal UMat img,
            @ByRef RectVector found_locations);
    public native void detectMultiScaleWithoutConf(@ByVal GpuMat img,
            @ByRef RectVector found_locations);

    /** \brief Returns block descriptors computed for the whole image.
    <p>
    @param img Source image. See cuda::HOGDescriptor::detect for type limitations.
    @param descriptors 2D array of descriptors.
    @param stream CUDA stream.
     */
    public native void compute(@ByVal Mat img,
                             @ByVal Mat descriptors,
                             @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void compute(@ByVal Mat img,
                             @ByVal Mat descriptors);
    public native void compute(@ByVal UMat img,
                             @ByVal UMat descriptors,
                             @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void compute(@ByVal UMat img,
                             @ByVal UMat descriptors);
    public native void compute(@ByVal GpuMat img,
                             @ByVal GpuMat descriptors,
                             @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void compute(@ByVal GpuMat img,
                             @ByVal GpuMat descriptors);
}

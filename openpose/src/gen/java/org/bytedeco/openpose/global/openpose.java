// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.openpose.global;

import org.bytedeco.openpose.*;

import org.bytedeco.javacpp.annotation.Index;
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
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;
import org.bytedeco.caffe.*;
import static org.bytedeco.caffe.global.caffe.*;

public class openpose extends org.bytedeco.openpose.presets.openpose {
    static { Loader.load(); }

// Targeting ../FloatArray2.java


// Targeting ../Float3.java


// Targeting ../FloatRectangle2.java


// Targeting ../HeatMapTypeVector.java


// Targeting ../Datums.java


// Targeting ../Float3Vector.java


// Targeting ../IntStringPair.java


// Targeting ../ProducerOpStringPair.java


// Parsed from openpose/utilities/enumClasses.hpp

// #ifndef OPENPOSE_UTILITIES_ENUM_CLASSES_HPP
// #define OPENPOSE_UTILITIES_ENUM_CLASSES_HPP
    @Namespace("op") public enum ErrorMode {
        StdRuntimeError((byte)(0)),
        FileLogging((byte)(1)),
        StdCerr((byte)(2)),
        All((byte)(3));

        public final byte value;
        private ErrorMode(byte v) { this.value = v; }
        private ErrorMode(ErrorMode e) { this.value = e.value; }
        public ErrorMode intern() { for (ErrorMode e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }

    @Namespace("op") public enum LogMode {
        FileLogging((byte)(0)),
        StdCout((byte)(1)),
        All((byte)(2));

        public final byte value;
        private LogMode(byte v) { this.value = v; }
        private LogMode(LogMode e) { this.value = e.value; }
        public LogMode intern() { for (LogMode e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }

    @Namespace("op") public enum Priority {
        None((byte)(0)),
        Low((byte)(1)),
        Normal((byte)(2)),
        High((byte)(3)),
        Max((byte)(4)),
        NoOutput((byte)(255));

        public final byte value;
        private Priority(byte v) { this.value = v; }
        private Priority(Priority e) { this.value = e.value; }
        public Priority intern() { for (Priority e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }

    @Namespace("op") public enum Extensions {
        Images((byte)(0)), // jpg, png, ...
        Size((byte)(1));

        public final byte value;
        private Extensions(byte v) { this.value = v; }
        private Extensions(Extensions e) { this.value = e.value; }
        public Extensions intern() { for (Extensions e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }


// #endif // OPENPOSE_UTILITIES_ENUM_CLASSES_HPP


// Parsed from openpose/thread/enumClasses.hpp

// #ifndef OPENPOSE_THREAD_ENUM_CLASSES_HPP
// #define OPENPOSE_THREAD_ENUM_CLASSES_HPP
    /**
     * ThreadManager synchronization mode.
     */
    @Namespace("op") public enum ThreadManagerMode {
        /**
         * First and last queues of ThreadManager will be given to the user, so he must push elements to the first queue and retrieve
         * them from the last one after being processed.
         * Recommended for prototyping environments (easier to test but more error-prone and potentially slower in performance).
         */
        Asynchronous((byte)(0)),
        /** Similar to Asynchronous, but only the input (first) queue is given to the user. */
        AsynchronousIn((byte)(1)),
        /** Similar to Asynchronous, but only the output (last) queue is given to the user. */
        AsynchronousOut((byte)(2)),
        /**
         * Everything will run inside the ThreadManager.
         * Recommended for production environments (more difficult to set up but faster in performance and less error-prone).
         */
        Synchronous((byte)(3));

        public final byte value;
        private ThreadManagerMode(byte v) { this.value = v; }
        private ThreadManagerMode(ThreadManagerMode e) { this.value = e.value; }
        public ThreadManagerMode intern() { for (ThreadManagerMode e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }


// #endif // OPENPOSE_THREAD_ENUM_CLASSES_HPP


// Parsed from openpose/pose/enumClasses.hpp

// #ifndef OPENPOSE_POSE_ENUM_CLASSES_HPP
// #define OPENPOSE_POSE_ENUM_CLASSES_HPP
    /**
     * An enum class in which all the possible type of pose estimation models are included.
     */
    @Namespace("op") public enum PoseModel {
        /**
         * COCO + 6 foot keypoints + neck + lower abs model, with 25+1 components (see poseParameters.hpp for details).
         */
        BODY_25((byte)(0)),
        /** COCO model + neck, with 18+1 components (see poseParameters.hpp for details). */
        COCO_18((byte)(1)),
        /** MPI model, with 15+1 components (see poseParameters.hpp for details). */
        MPI_15((byte)(2)),
        /** Variation of the MPI model, reduced number of CNN stages to 4: faster but less accurate.*/
        MPI_15_4((byte)(3)),
        /** Experimental. Do not use. */
        BODY_19((byte)(4)),
        /** Experimental. Do not use. */
        BODY_19_X2((byte)(5)),
        /** Experimental. Do not use. */
        BODY_19N((byte)(6)),
        /** Experimental. Do not use. */
        BODY_25E((byte)(7)),
        /** Experimental. Do not use. */
        CAR_12((byte)(8)),
        /** Experimental. Do not use. */
        BODY_25D((byte)(9)),
        /** Experimental. Do not use. */
        BODY_23((byte)(10)),
        /** Experimental. Do not use. */
        CAR_22((byte)(11)),
        /** Experimental. Do not use. */
        BODY_19E((byte)(12)),
        /** Experimental. Do not use. */
        BODY_25B((byte)(13)),
        /** Experimental. Do not use. */
        BODY_135((byte)(14)),
        Size((byte)(15));

        public final byte value;
        private PoseModel(byte v) { this.value = v; }
        private PoseModel(PoseModel e) { this.value = e.value; }
        public PoseModel intern() { for (PoseModel e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }

    @Namespace("op") public enum PoseProperty {
        NMSThreshold((byte)(0)),
        ConnectInterMinAboveThreshold((byte)(1)),
        ConnectInterThreshold((byte)(2)),
        ConnectMinSubsetCnt((byte)(3)),
        ConnectMinSubsetScore((byte)(4)),
        Size((byte)(5));

        public final byte value;
        private PoseProperty(byte v) { this.value = v; }
        private PoseProperty(PoseProperty e) { this.value = e.value; }
        public PoseProperty intern() { for (PoseProperty e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }


// #endif // OPENPOSE_POSE_ENUM_CLASSES_HPP


// Parsed from openpose/core/enumClasses.hpp

// #ifndef OPENPOSE_CORE_ENUM_CLASSES_HPP
// #define OPENPOSE_CORE_ENUM_CLASSES_HPP
    @Namespace("op") public enum ScaleMode {
        InputResolution((byte)(0)),
        NetOutputResolution((byte)(1)),
        OutputResolution((byte)(2)),
        ZeroToOne((byte)(3)), // [0, 1]
        ZeroToOneFixedAspect((byte)(4)), // [0, 1]
        PlusMinusOne((byte)(5)), // [-1, 1]
        PlusMinusOneFixedAspect((byte)(6)), // [-1, 1]
        UnsignedChar((byte)(7)), // [0, 255]
        NoScale((byte)(8));

        public final byte value;
        private ScaleMode(byte v) { this.value = v; }
        private ScaleMode(ScaleMode e) { this.value = e.value; }
        public ScaleMode intern() { for (ScaleMode e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }

    @Namespace("op") public enum HeatMapType {
        Parts((byte)(0)),
        Background((byte)(1)),
        PAFs((byte)(2));

        public final byte value;
        private HeatMapType(byte v) { this.value = v; }
        private HeatMapType(HeatMapType e) { this.value = e.value; }
        public HeatMapType intern() { for (HeatMapType e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }

    @Namespace("op") public enum RenderMode {
        None((byte)(0)),
        Auto((byte)(1)), // It will select Gpu if CUDA verison, or Cpu otherwise
        Cpu((byte)(2)),
        Gpu((byte)(3));

        public final byte value;
        private RenderMode(byte v) { this.value = v; }
        private RenderMode(RenderMode e) { this.value = e.value; }
        public RenderMode intern() { for (RenderMode e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }

    @Namespace("op") public enum ElementToRender {
        Skeleton((byte)(0)),
        Background((byte)(1)),
        AddKeypoints((byte)(2)),
        AddPAFs((byte)(3));

        public final byte value;
        private ElementToRender(byte v) { this.value = v; }
        private ElementToRender(ElementToRender e) { this.value = e.value; }
        public ElementToRender intern() { for (ElementToRender e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }


// #endif // OPENPOSE_CORE_ENUM_CLASSES_HPP


// Parsed from openpose/gui/enumClasses.hpp

// #ifndef OPENPOSE_GUI_ENUM_CLASSES_HPP
// #define OPENPOSE_GUI_ENUM_CLASSES_HPP
    /**
    * GUI display modes.
     * An enum class with the different output screen options. E.g., 2-D, 3-D, all, none.
     */
    @Namespace("op") public enum DisplayMode {
        /** No display. */
        NoDisplay((short)(0)),
        /** All (2-D and 3-D/Adam) displays */
        DisplayAll((short)(1)),
        /** Only 2-D display. */
        Display2D((short)(2)),
        /** Only 3-D display. */
        Display3D((short)(3)),
        /** Only Adam display. */
        DisplayAdam((short)(4));

        public final short value;
        private DisplayMode(short v) { this.value = v; }
        private DisplayMode(DisplayMode e) { this.value = e.value; }
        public DisplayMode intern() { for (DisplayMode e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }

    /**
     * Full screen modes.
     * An enum class with the different full screen mode options, i.e., full screen or windored.
     */
    @Namespace("op") public enum FullScreenMode {
        /** Full screen mode. */
        FullScreen(0 != 0),
        /** Windowed mode, depending on the frame output size. */
        Windowed(1 != 0);

        public final boolean value;
        private FullScreenMode(boolean v) { this.value = v; }
        private FullScreenMode(FullScreenMode e) { this.value = e.value; }
        public FullScreenMode intern() { for (FullScreenMode e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }


// #endif // OPENPOSE_GUI_ENUM_CLASSES_HPP


// Parsed from openpose/producer/enumClasses.hpp

// #ifndef OPENPOSE_PRODUCER_ENUM_CLASSES_HPP
// #define OPENPOSE_PRODUCER_ENUM_CLASSES_HPP
    @Namespace("op") public enum ProducerFpsMode {
        /** The frames will be extracted at the original source fps (frames might be skipped or repeated). */
        OriginalFps(0 != 0),
        /** The frames will be extracted when the software retrieves them (frames will not be skipped or repeated). */
        RetrievalFps(1 != 0);

        public final boolean value;
        private ProducerFpsMode(boolean v) { this.value = v; }
        private ProducerFpsMode(ProducerFpsMode e) { this.value = e.value; }
        public ProducerFpsMode intern() { for (ProducerFpsMode e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }

    @Namespace("op") public enum ProducerProperty {
        AutoRepeat((byte)(0)),
        Flip((byte)(1)),
        Rotation((byte)(2)),
        FrameStep((byte)(3)),
        NumberViews((byte)(4)),
        Size((byte)(5));

        public final byte value;
        private ProducerProperty(byte v) { this.value = v; }
        private ProducerProperty(ProducerProperty e) { this.value = e.value; }
        public ProducerProperty intern() { for (ProducerProperty e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }

    /**
     * Type of producers
     * An enum class in which all the possible type of Producer are included. In order to add a new Producer,
     * include its name in this enum and add a new 'else if' statement inside ProducerFactory::createProducer().
     */
    @Namespace("op") public enum ProducerType {
        /** Stereo FLIR (Point-Grey) camera reader. Based on Spinnaker SDK. */
        FlirCamera((byte)(0)),
        /** An image directory reader. It is able to read images on a folder with a interface similar to the OpenCV
         * cv::VideoCapture.
         */
        ImageDirectory((byte)(1)),
        /** An IP camera frames extractor, extending the functionality of cv::VideoCapture. */
        IPCamera((byte)(2)),
        /** A video frames extractor, extending the functionality of cv::VideoCapture. */
        Video((byte)(3)),
        /** A webcam frames extractor, extending the functionality of cv::VideoCapture. */
        Webcam((byte)(4)),
        /** No type defined. Default state when no specific Producer has been picked yet. */
        None((byte)(5));

        public final byte value;
        private ProducerType(byte v) { this.value = v; }
        private ProducerType(ProducerType e) { this.value = e.value; }
        public ProducerType intern() { for (ProducerType e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }


// #endif // OPENPOSE_PRODUCER_ENUM_CLASSES_HPP


// Parsed from openpose/filestream/enumClasses.hpp

// #ifndef OPENPOSE_FILESTREAM_ENUM_CLASSES_HPP
// #define OPENPOSE_FILESTREAM_ENUM_CLASSES_HPP
    @Namespace("op") public enum DataFormat {
        Json((byte)(0)),
        Xml((byte)(1)),
        Yaml((byte)(2)),
        Yml((byte)(3));

        public final byte value;
        private DataFormat(byte v) { this.value = v; }
        private DataFormat(DataFormat e) { this.value = e.value; }
        public DataFormat intern() { for (DataFormat e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }

    @Namespace("op") public enum CocoJsonFormat {
        Body((byte)(0)),
        Hand21((byte)(1)),
        Hand42((byte)(2)),
        Face((byte)(3)),
        Foot((byte)(4)),
        Car((byte)(5)),
        Size((byte)(6));

        public final byte value;
        private CocoJsonFormat(byte v) { this.value = v; }
        private CocoJsonFormat(CocoJsonFormat e) { this.value = e.value; }
        public CocoJsonFormat intern() { for (CocoJsonFormat e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }


// #endif // OPENPOSE_FILESTREAM_ENUM_CLASSES_HPP


// Parsed from openpose/wrapper/enumClasses.hpp

// #ifndef OPENPOSE_WRAPPER_ENUM_CLASSES_HPP
// #define OPENPOSE_WRAPPER_ENUM_CLASSES_HPP
    @Namespace("op") public enum PoseMode {
        Disabled((byte)(0)),
        Enabled((byte)(1)),
        NoNetwork((byte)(2)),
        Size((byte)(3));

        public final byte value;
        private PoseMode(byte v) { this.value = v; }
        private PoseMode(PoseMode e) { this.value = e.value; }
        public PoseMode intern() { for (PoseMode e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }

    @Namespace("op") public enum Detector {
        Body((byte)(0)),
        OpenCV((byte)(1)),
        Provided((byte)(2)),
        BodyWithTracking((byte)(3)),
        Size((byte)(4));

        public final byte value;
        private Detector(byte v) { this.value = v; }
        private Detector(Detector e) { this.value = e.value; }
        public Detector intern() { for (Detector e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }

    @Namespace("op") public enum WorkerType {
        Input((byte)(0)),
        PreProcessing((byte)(1)),
        PostProcessing((byte)(2)),
        Output((byte)(3)),
        Size((byte)(4));

        public final byte value;
        private WorkerType(byte v) { this.value = v; }
        private WorkerType(WorkerType e) { this.value = e.value; }
        public WorkerType intern() { for (WorkerType e : values()) if (e.value == value) return e; return this; }
        @Override public String toString() { return intern().name(); }
    }


// #endif // OPENPOSE_WRAPPER_ENUM_CLASSES_HPP


// Parsed from openpose/core/matrix.hpp

// #ifndef OPENPOSE_CORE_MAT_HPP
// #define OPENPOSE_CORE_MAT_HPP

// #include <memory> // std::shared_ptr
// #include <openpose/core/macros.hpp>
    // Convert from Matrix into cv::Mat. Usage example:
        // #include <opencv2/core/core.hpp>
        // ...
        // cv::Mat opMat = OP2CVMAT(cv::Mat());
    public static native @ByVal Mat OP_OP2CVMAT(@ByVal Matrix opMat);

    // Convert from Matrix into const cv::Mat. Usage example:
        // #include <opencv2/core/core.hpp>
        // ...
        // cv::Mat opMat = OP2CVCONSTMAT(cv::Mat());
    public static native @Const @ByVal Mat OP_OP2CVCONSTMAT(@ByVal Matrix opMat);

    // Convert from cv::Mat into Matrix. Usage example:
        // #include <opencv2/core/core.hpp>
        // ...
        // Matrix opMat = CV2OPMAT(Matrix());
    public static native @ByVal Matrix OP_CV2OPMAT(@ByVal Mat cvMat);

    // Convert from cv::Mat into const Matrix. Usage example:
        // #include <opencv2/core/core.hpp>
        // ...
        // Matrix opMat = CV2OPCONSTMAT(Matrix());
    public static native @Const @ByVal Matrix OP_CV2OPCONSTMAT(@ByVal Mat cvMat);

    // Convert from std::vector<Matrix> into std::vector<cv::Mat>. Usage example:
        // #include <opencv2/core/core.hpp>
        // ...
        // std::vector<Matrix> opMats; // Assume filled
        // OP_OP2CVVECTORMAT(cvMats, opMats);
//     #define OP_OP2CVVECTORMAT(cvMats, opMats)
//         std::vector<cv::Mat> cvMats;
//         for (auto& opMat : (opMats))
//         {
//             const auto cvMat = OP_OP2CVCONSTMAT(opMat);
//             cvMats.emplace_back(cvMat);
//         }

    // Convert from std::vector<cv::Mat> into std::vector<Matrix>. Usage example:
        // #include <opencv2/core/core.hpp>
        // ...
        // std::vector<cv::Mat> cvMats; // Assume filled
        // OP_CV2OPVECTORMAT(opMats, cvMats);
//     #define OP_CV2OPVECTORMAT(opMats, cvMats)
//         std::vector<op::Matrix> opMats;
//         for (auto& cvMat : (cvMats))
//         {
//             const auto opMat = OP_CV2OPMAT(cvMat);
//             opMats.emplace_back(opMat);
//         }

    // Convert from std::vector<cv::Mat> into std::vector<Matrix>. Usage example:
        // #include <opencv2/core/core.hpp>
        // ...
        // // Equivalents:
        // OP_CV_VOID_FUNCTION(opMat, size());
        // // and
        // OP_OP2CVMAT(cvMat, opMat);
        // cvMat.size();
//     #define OP_MAT_VOID_FUNCTION(opMat, function)
//         {
//             cv::Mat cvMat = OP_OP2CVMAT(cvMat, opMat);
//             cvMat.fnction;
//         }
//     #define OP_CONST_MAT_VOID_FUNCTION(opMat, function)
//         {
//             const cv::Mat cvMat = OP_OP2CVCONSTMAT(opMat);
//             cvMat.fnction;
//         }
//     #define OP_MAT_RETURN_FUNCTION(outputVariable, opMat, function)
//         {
//             cv::Mat cvMat = OP_OP2CVMAT(cvMat, opMat);
//             outputVariable = cvMat.fnction;
//         }
//     #define OP_CONST_MAT_RETURN_FUNCTION(outputVariable, opMat, function)
//         {
//             const cv::Mat cvMat = OP_OP2CVCONSTMAT(opMat);
//             outputVariable = cvMat.fnction;
//         }
// Targeting ../Matrix.java




// #endif // OPENPOSE_CORE_MAT_HPP


// Parsed from openpose/core/array.hpp

// #ifndef OPENPOSE_CORE_ARRAY_HPP
// #define OPENPOSE_CORE_ARRAY_HPP

// #include <memory> // std::shared_ptr
// #include <vector>
// #include <openpose/core/macros.hpp>
// #include <openpose/core/matrix.hpp>
// #include <openpose/utilities/errorAndLog.hpp>
// Targeting ../FloatArray.java


// Targeting ../LongLongArray.java



    // Static methods
    

// #endif // OPENPOSE_CORE_ARRAY_HPP


// Parsed from openpose/core/point.hpp

// #ifndef OPENPOSE_CORE_POINT_HPP
// #define OPENPOSE_CORE_POINT_HPP

// #include <string>
// #include <openpose/core/macros.hpp>
// Targeting ../IntPoint.java


// Targeting ../FloatPoint.java



    // Static methods
    

// #endif // OPENPOSE_CORE_POINT_HPP


// Parsed from openpose/core/rectangle.hpp

// #ifndef OPENPOSE_CORE_RECTANGLE_HPP
// #define OPENPOSE_CORE_RECTANGLE_HPP

// #include <string>
// #include <openpose/core/macros.hpp>
// #include <openpose/core/point.hpp>
// Targeting ../FloatRectangle.java



    // Static methods

    

// #endif // OPENPOSE_CORE_RECTANGLE_HPP


// Parsed from openpose/core/string.hpp

// #ifndef OPENPOSE_CORE_STRING_HPP
// #define OPENPOSE_CORE_STRING_HPP

// #include <memory> // std::shared_ptr
// #include <string>
// #include <openpose/core/macros.hpp>
// Targeting ../OpString.java




// #endif // OPENPOSE_CORE_STRING_HPP


// Parsed from openpose/core/datum.hpp

// #ifndef OPENPOSE_CORE_DATUM_HPP
// #define OPENPOSE_CORE_DATUM_HPP

// #ifdef USE_3D_ADAM_MODEL
// #endif
// #include <openpose/core/common.hpp>
// Targeting ../Datum.java



    // Defines for Datum. Added here rather than in `macros.hpp` to avoid circular dependencies
//     #define BASE_DATUM Datum
//     #define BASE_DATUMS std::vector<std::shared_ptr<BASE_DATUM>>
//     #define BASE_DATUMS_SH std::shared_ptr<BASE_DATUMS>
//     #define DEFINE_TEMPLATE_DATUM(templateName) template class OP_API templateName<BASE_DATUMS_SH>
//     #define COMPILE_TEMPLATE_DATUM(templateName) extern template class templateName<BASE_DATUMS_SH>


// #endif // OPENPOSE_CORE_DATUM_HPP


// Parsed from openpose/thread/worker.hpp

// #ifndef OPENPOSE_THREAD_WORKER_HPP
// #define OPENPOSE_THREAD_WORKER_HPP

// #include <openpose/core/common.hpp>
// Targeting ../DatumsWorker.java








// Implementation
    

    

    

    


// #endif // OPENPOSE_THREAD_WORKER_HPP


// Parsed from openpose/utilities/flagsToOpenPose.hpp

// #ifndef OPENPOSE_UTILITIES_FLAGS_TO_OPEN_POSE_HPP
// #define OPENPOSE_UTILITIES_FLAGS_TO_OPEN_POSE_HPP

// #include <openpose/core/common.hpp>
// #include <openpose/core/enumClasses.hpp>
// #include <openpose/gui/enumClasses.hpp>
// #include <openpose/pose/enumClasses.hpp>
// #include <openpose/producer/enumClasses.hpp>
// #include <openpose/wrapper/enumClasses.hpp>
    @Namespace("op") public static native PoseMode flagsToPoseMode(int poseModeInt);

    @Namespace("op") public static native PoseModel flagsToPoseModel(@Const @ByRef OpString poseModeString);

    @Namespace("op") public static native ScaleMode flagsToScaleMode(int keypointScaleMode);

    @Namespace("op") public static native ScaleMode flagsToHeatMapScaleMode(int heatMapScaleMode);

    @Namespace("op") public static native Detector flagsToDetector(int detector);

    // Determine type of frame source
    @Namespace("op") public static native ProducerType flagsToProducerType(
            @Const @ByRef OpString imageDirectory, @Const @ByRef OpString videoPath, @Const @ByRef OpString ipCameraPath,
            int webcamIndex, @Cast("const bool") boolean flirCamera);

    @Namespace("op") public static native @ByVal ProducerOpStringPair flagsToProducer(
            @Const @ByRef OpString imageDirectory, @Const @ByRef OpString videoPath, @Const @ByRef(nullValue = "op::String(\"\")") OpString ipCameraPath,
            int webcamIndex/*=-1*/, @Cast("const bool") boolean flirCamera/*=false*/, int flirCameraIndex/*=-1*/);
    @Namespace("op") public static native @ByVal ProducerOpStringPair flagsToProducer(
            @Const @ByRef OpString imageDirectory, @Const @ByRef OpString videoPath);

    @Namespace("op") public static native @ByVal HeatMapTypeVector flagsToHeatMaps(
            @Cast("const bool") boolean heatMapsAddParts/*=false*/, @Cast("const bool") boolean heatMapsAddBkg/*=false*/,
            @Cast("const bool") boolean heatMapsAddPAFs/*=false*/);
    @Namespace("op") public static native @ByVal HeatMapTypeVector flagsToHeatMaps();

    @Namespace("op") public static native RenderMode flagsToRenderMode(
            int renderFlag, @Cast("const bool") boolean gpuBuggy/*=false*/, int renderPoseFlag/*=-2*/);
    @Namespace("op") public static native RenderMode flagsToRenderMode(
            int renderFlag);

    @Namespace("op") public static native DisplayMode flagsToDisplayMode(int display, @Cast("const bool") boolean enabled3d);

    @Namespace("op") public static native @ByVal IntPoint flagsToPoint(@Const @ByRef OpString pointString, @Const @ByRef(nullValue = "op::String(\"1280x720\")") OpString pointExample);
    @Namespace("op") public static native @ByVal IntPoint flagsToPoint(@Const @ByRef OpString pointString);


// #endif // OPENPOSE_UTILITIES_FLAGS_TO_OPEN_POSE_HPP


// Parsed from openpose/wrapper/wrapperStructExtra.hpp

// #ifndef OPENPOSE_WRAPPER_WRAPPER_STRUCT_EXTRA_HPP
// #define OPENPOSE_WRAPPER_WRAPPER_STRUCT_EXTRA_HPP

// #include <openpose/core/common.hpp>
// Targeting ../WrapperStructExtra.java




// #endif // OPENPOSE_WRAPPER_WRAPPER_STRUCT_EXTRA_HPP


// Parsed from openpose/wrapper/wrapperStructFace.hpp

// #ifndef OPENPOSE_WRAPPER_WRAPPER_STRUCT_FACE_HPP
// #define OPENPOSE_WRAPPER_WRAPPER_STRUCT_FACE_HPP

// #include <openpose/core/common.hpp>
// #include <openpose/core/enumClasses.hpp>
// #include <openpose/face/faceParameters.hpp>
// #include <openpose/wrapper/enumClasses.hpp>
// Targeting ../WrapperStructFace.java




// #endif // OPENPOSE_WRAPPER_WRAPPER_STRUCT_FACE_HPP


// Parsed from openpose/wrapper/wrapperStructGui.hpp

// #ifndef OPENPOSE_WRAPPER_WRAPPER_STRUCT_GUI_HPP
// #define OPENPOSE_WRAPPER_WRAPPER_STRUCT_GUI_HPP

// #include <openpose/core/common.hpp>
// #include <openpose/gui/enumClasses.hpp>
// Targeting ../WrapperStructGui.java




// #endif // OPENPOSE_WRAPPER_WRAPPER_STRUCT_GUI_HPP


// Parsed from openpose/wrapper/wrapperStructHand.hpp

// #ifndef OPENPOSE_WRAPPER_WRAPPER_STRUCT_HAND_HPP
// #define OPENPOSE_WRAPPER_WRAPPER_STRUCT_HAND_HPP

// #include <openpose/core/common.hpp>
// #include <openpose/core/enumClasses.hpp>
// #include <openpose/hand/handParameters.hpp>
// #include <openpose/wrapper/enumClasses.hpp>
// Targeting ../WrapperStructHand.java




// #endif // OPENPOSE_WRAPPER_WRAPPER_STRUCT_HAND_HPP


// Parsed from openpose/wrapper/wrapperStructInput.hpp

// #ifndef OPENPOSE_WRAPPER_WRAPPER_STRUCT_INPUT_HPP
// #define OPENPOSE_WRAPPER_WRAPPER_STRUCT_INPUT_HPP

// #include <limits> // std::numeric_limits
// #include <openpose/core/common.hpp>
// #include <openpose/producer/producer.hpp>
// Targeting ../WrapperStructInput.java




// #endif // OPENPOSE_WRAPPER_WRAPPER_STRUCT_INPUT_HPP


// Parsed from openpose/wrapper/wrapperStructOutput.hpp

// #ifndef OPENPOSE_WRAPPER_WRAPPER_STRUCT_OUTPUT_HPP
// #define OPENPOSE_WRAPPER_WRAPPER_STRUCT_OUTPUT_HPP

// #include <openpose/core/common.hpp>
// #include <openpose/filestream/enumClasses.hpp>
// #include <openpose/gui/enumClasses.hpp>
// Targeting ../WrapperStructOutput.java




// #endif // OPENPOSE_WRAPPER_WRAPPER_STRUCT_OUTPUT_HPP


// Parsed from openpose/wrapper/wrapperStructPose.hpp

// #ifndef OPENPOSE_WRAPPER_WRAPPER_STRUCT_POSE_HPP
// #define OPENPOSE_WRAPPER_WRAPPER_STRUCT_POSE_HPP

// #include <openpose/core/common.hpp>
// #include <openpose/core/enumClasses.hpp>
// #include <openpose/pose/enumClasses.hpp>
// #include <openpose/pose/poseParameters.hpp>
// #include <openpose/pose/poseParametersRender.hpp>
// #include <openpose/wrapper/enumClasses.hpp>
// Targeting ../WrapperStructPose.java




// #endif // OPENPOSE_WRAPPER_WRAPPER_STRUCT_POSE_HPP


// Parsed from openpose/producer/producer.hpp

// #ifndef OPENPOSE_PRODUCER_PRODUCER_HPP
// #define OPENPOSE_PRODUCER_PRODUCER_HPP

// #include <openpose/3d/cameraParameterReader.hpp>
// #include <openpose/core/common.hpp>
// #include <openpose/producer/enumClasses.hpp>
// Targeting ../Producer.java



    /**
     * This function returns the desired producer given the input parameters.
     */
    @Namespace("op") public static native @SharedPtr Producer createProducer(
            ProducerType producerType/*=op::ProducerType::None*/, @StdString BytePointer producerString/*=""*/,
            @Const @ByRef(nullValue = "op::Point<int>{-1,-1}") IntPoint cameraResolution,
            @StdString BytePointer cameraParameterPath/*="models/cameraParameters/"*/, @Cast("const bool") boolean undistortImage/*=true*/,
            int numberViews/*=-1*/);
    @Namespace("op") public static native @SharedPtr Producer createProducer();
    @Namespace("op") public static native @SharedPtr Producer createProducer(
            ProducerType producerType/*=op::ProducerType::None*/, @StdString String producerString/*=""*/,
            @Const @ByRef(nullValue = "op::Point<int>{-1,-1}") IntPoint cameraResolution,
            @StdString String cameraParameterPath/*="models/cameraParameters/"*/, @Cast("const bool") boolean undistortImage/*=true*/,
            int numberViews/*=-1*/);


// #endif // OPENPOSE_PRODUCER_PRODUCER_HPP


// Parsed from openpose/wrapper/wrapperAuxiliary.hpp

// #ifndef OPENPOSE_WRAPPER_WRAPPER_AUXILIARY_HPP
// #define OPENPOSE_WRAPPER_WRAPPER_AUXILIARY_HPP

// #include <openpose/thread/headers.hpp>
// #include <openpose/wrapper/enumClasses.hpp>
// #include <openpose/wrapper/wrapperStructExtra.hpp>
// #include <openpose/wrapper/wrapperStructFace.hpp>
// #include <openpose/wrapper/wrapperStructGui.hpp>
// #include <openpose/wrapper/wrapperStructHand.hpp>
// #include <openpose/wrapper/wrapperStructInput.hpp>
// #include <openpose/wrapper/wrapperStructOutput.hpp>
// #include <openpose/wrapper/wrapperStructPose.hpp>
    /**
     * It checks that no wrong/contradictory flags are enabled for Wrapper(T)
     * @param wrapperStructPose
     * @param wrapperStructFace
     * @param wrapperStructHand
     * @param wrapperStructExtra
     * @param wrapperStructInput
     * @param wrapperStructOutput
     * @param renderOutput
     * @param userOutputWsEmpty
     * @param producerSharedPtr
     * @param threadManagerMode
     */
    @Namespace("op") public static native void wrapperConfigureSanityChecks(
            @ByRef WrapperStructPose wrapperStructPose, @Const @ByRef WrapperStructFace wrapperStructFace,
            @Const @ByRef WrapperStructHand wrapperStructHand, @Const @ByRef WrapperStructExtra wrapperStructExtra,
            @Const @ByRef WrapperStructInput wrapperStructInput, @Const @ByRef WrapperStructOutput wrapperStructOutput,
            @Const @ByRef WrapperStructGui wrapperStructGui, @Cast("const bool") boolean renderOutput, @Cast("const bool") boolean userInputAndPreprocessingWsEmpty,
            @Cast("const bool") boolean userOutputWsEmpty, @SharedPtr Producer producerSharedPtr,
            ThreadManagerMode threadManagerMode);

    /**
     * Thread ID increase (private internal function).
     * If multi-threading mode, it increases the thread ID.
     * If single-threading mode (for debugging), it does not modify it.
     * Note that mThreadId must be re-initialized to 0 before starting a new Wrapper(T) configuration.
     * @param threadId unsigned long long element with the current thread id value. I will be edited to the next
     * {@code desired thread id number.
     */
    @Namespace("op") public static native void threadIdPP(@Cast("unsigned long long*") @ByRef LongPointer threadId, @Cast("const bool") boolean multiThreadEnabled);
    @Namespace("op") public static native void threadIdPP(@Cast("unsigned long long*") @ByRef LongBuffer threadId, @Cast("const bool") boolean multiThreadEnabled);
    @Namespace("op") public static native void threadIdPP(@Cast("unsigned long long*") @ByRef long[] threadId, @Cast("const bool") boolean multiThreadEnabled);

    /**
     * Set ThreadManager from TWorkers (private internal function).
     * After any configure() has been called, the TWorkers are initialized. This function resets the ThreadManager
     * and adds them.
     * Common code for start() and exec().
     */

    /**
     * It fills camera parameters and splits the cvMat depending on how many camera parameter matrices are found.
     * For example usage, check {@code examples/tutorial_api_cpp/11_asynchronous_custom_input_multi_camera.cpp}
     */






// Implementation
// #include <openpose/3d/headers.hpp>
// #include <openpose/core/headers.hpp>
// #include <openpose/face/headers.hpp>
// #include <openpose/filestream/headers.hpp>
// #include <openpose/gpu/gpu.hpp>
// #include <openpose/gui/headers.hpp>
// #include <openpose/hand/headers.hpp>
// #include <openpose/pose/headers.hpp>
// #include <openpose/producer/headers.hpp>
// #include <openpose/tracking/headers.hpp>
// #include <openpose/utilities/fileSystem.hpp>
// #include <openpose/utilities/standard.hpp>


// #endif // OPENPOSE_WRAPPER_WRAPPER_AUXILIARY_HPP


// Parsed from openpose/wrapper/wrapper.hpp

// #ifndef OPENPOSE_WRAPPER_WRAPPER_HPP
// #define OPENPOSE_WRAPPER_WRAPPER_HPP

// #include <openpose/core/common.hpp>
// #include <openpose/thread/headers.hpp>
// #include <openpose/wrapper/enumClasses.hpp>
// #include <openpose/wrapper/wrapperStructExtra.hpp>
// #include <openpose/wrapper/wrapperStructFace.hpp>
// #include <openpose/wrapper/wrapperStructGui.hpp>
// #include <openpose/wrapper/wrapperStructHand.hpp>
// #include <openpose/wrapper/wrapperStructInput.hpp>
// #include <openpose/wrapper/wrapperStructOutput.hpp>
// #include <openpose/wrapper/wrapperStructPose.hpp>
// Targeting ../OpWrapper.java



    // Type






// Implementation
// #include <openpose/wrapper/wrapperAuxiliary.hpp>
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    


// #endif // OPENPOSE_WRAPPER_WRAPPER_HPP


}

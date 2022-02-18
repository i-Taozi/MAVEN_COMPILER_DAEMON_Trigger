// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.openpose;

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

import static org.bytedeco.openpose.global.openpose.*;

    /**
     * WrapperStructExtra: Pose estimation and rendering configuration struct.
     * WrapperStructExtra allows the user to set up the pose estimation and rendering parameters that will be used for
     * the OpenPose WrapperT template and Wrapper class.
     */
    @Namespace("op") @NoOffset @Properties(inherit = org.bytedeco.openpose.presets.openpose.class)
public class WrapperStructExtra extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public WrapperStructExtra(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public WrapperStructExtra(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public WrapperStructExtra position(long position) {
            return (WrapperStructExtra)super.position(position);
        }
        @Override public WrapperStructExtra getPointer(long i) {
            return new WrapperStructExtra((Pointer)this).offsetAddress(i);
        }
    
        /**
         * Whether to run the 3-D reconstruction demo, i.e.,
         * 1) Reading from a stereo camera system.
         * 2) Performing 3-D reconstruction from the multiple views.
         * 3) Displaying 3-D reconstruction results.
         */
        public native @Cast("bool") boolean reconstruct3d(); public native WrapperStructExtra reconstruct3d(boolean setter);

        /**
         * Minimum number of views required to reconstruct each keypoint.
         * By default (-1), it will require max(2, min(4, #cameras-1)) cameras to see the keypoint in order to
         * reconstruct it.
         */
        public native int minViews3d(); public native WrapperStructExtra minViews3d(int setter);

        /**
         * Whether to return a person ID for each body skeleton, providing temporal consistency.
         */
        public native @Cast("bool") boolean identification(); public native WrapperStructExtra identification(boolean setter);

        /**
         * Whether to enable people tracking across frames. The value indicates the number of frames where tracking
         * is run between each OpenPose keypoint detection. Select -1 (default) to disable it or 0 to run
         * simultaneously OpenPose keypoint detector and tracking for potentially higher accurary than only OpenPose.
         */
        public native int tracking(); public native WrapperStructExtra tracking(int setter);

        /**
         * Whether to enable inverse kinematics (IK) from 3-D keypoints to obtain 3-D joint angles. By default
         * (0 threads), it is disabled. Increasing the number of threads will increase the speed but also the
         * global system latency.
         */
        public native int ikThreads(); public native WrapperStructExtra ikThreads(int setter);

        /**
         * Constructor of the struct.
         * It has the recommended and default values we recommend for each element of the struct.
         * Since all the elements of the struct are public, they can also be manually filled.
         */
        public WrapperStructExtra(
                    @Cast("const bool") boolean reconstruct3d/*=false*/, int minViews3d/*=-1*/, @Cast("const bool") boolean identification/*=false*/,
                    int tracking/*=-1*/, int ikThreads/*=0*/) { super((Pointer)null); allocate(reconstruct3d, minViews3d, identification, tracking, ikThreads); }
        private native void allocate(
                    @Cast("const bool") boolean reconstruct3d/*=false*/, int minViews3d/*=-1*/, @Cast("const bool") boolean identification/*=false*/,
                    int tracking/*=-1*/, int ikThreads/*=0*/);
        public WrapperStructExtra() { super((Pointer)null); allocate(); }
        private native void allocate();
    }

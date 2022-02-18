// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

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

import static org.bytedeco.depthai.global.depthai.*;


/** RawStereoDepthConfig configuration structure */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class RawStereoDepthConfig extends RawBuffer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RawStereoDepthConfig() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RawStereoDepthConfig(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RawStereoDepthConfig(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RawStereoDepthConfig position(long position) {
        return (RawStereoDepthConfig)super.position(position);
    }
    @Override public RawStereoDepthConfig getPointer(long i) {
        return new RawStereoDepthConfig((Pointer)this).offsetAddress(i);
    }


    public static class AlgorithmControl extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public AlgorithmControl() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public AlgorithmControl(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public AlgorithmControl(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public AlgorithmControl position(long position) {
            return (AlgorithmControl)super.position(position);
        }
        @Override public AlgorithmControl getPointer(long i) {
            return new AlgorithmControl((Pointer)this).offsetAddress(i);
        }
    
        /**
         * Align the disparity/depth to the perspective of a rectified output, or center it
         */
        public enum DepthAlign { RECTIFIED_RIGHT(0), RECTIFIED_LEFT(1), CENTER(2);

            public final int value;
            private DepthAlign(int v) { this.value = v; }
            private DepthAlign(DepthAlign e) { this.value = e.value; }
            public DepthAlign intern() { for (DepthAlign e : values()) if (e.value == value) return e; return this; }
            @Override public String toString() { return intern().name(); }
        }

        /**
         * Set the disparity/depth alignment to the perspective of a rectified output, or center it
         */
        public native DepthAlign depthAlign(); public native AlgorithmControl depthAlign(DepthAlign setter);

        /**
         * Computes and combines disparities in both L-R and R-L directions, and combine them.
         * For better occlusion handling
         */
        public native @Cast("bool") boolean enableLeftRightCheck(); public native AlgorithmControl enableLeftRightCheck(boolean setter);

        /**
         * Disparity range increased from 95 to 190, combined from full resolution and downscaled images.
         * Suitable for short range objects
         */
        public native @Cast("bool") boolean enableExtended(); public native AlgorithmControl enableExtended(boolean setter);

        /**
         * Computes disparity with sub-pixel interpolation (5 fractional bits), suitable for long range
         */
        public native @Cast("bool") boolean enableSubpixel(); public native AlgorithmControl enableSubpixel(boolean setter);

        /**
         * Left-right check threshold for left-right, right-left disparity map combine, 0..128
         * Used only when left-right check mode is enabled.
         * Defines the maximum difference between the confidence of pixels from left-right and right-left confidence maps
         */
        public native @Cast("std::int32_t") int leftRightCheckThreshold(); public native AlgorithmControl leftRightCheckThreshold(int setter);

        /**
         * Number of fractional bits for subpixel mode
         *
         * Valid values: 3,4,5
         *
         * Defines the number of fractional disparities: 2^x
         *
         * Median filter postprocessing is supported only for 3 fractional bits
         */
        public native @Cast("std::int32_t") int subpixelFractionalBits(); public native AlgorithmControl subpixelFractionalBits(int setter);
    }

    /**
     * Controls the flow of stereo algorithm - left-right check, subpixel etc.
     */
    public native @ByRef AlgorithmControl algorithmControl(); public native RawStereoDepthConfig algorithmControl(AlgorithmControl setter);

    /**
     * Post-processing filters, all the filters are applied in disparity domain.
     */
    public static class PostProcessing extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public PostProcessing() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public PostProcessing(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public PostProcessing(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public PostProcessing position(long position) {
            return (PostProcessing)super.position(position);
        }
        @Override public PostProcessing getPointer(long i) {
            return new PostProcessing((Pointer)this).offsetAddress(i);
        }
    
        /**
         * Set kernel size for disparity/depth median filtering, or disable
         */
        public native MedianFilter median(); public native PostProcessing median(MedianFilter setter);

        /**
         * Sigma value for bilateral filter. 0 means disabled.
         * A larger value of the parameter means that farther colors within the pixel neighborhood will be mixed together.
         */
        public native @Cast("std::int16_t") short bilateralSigmaValue(); public native PostProcessing bilateralSigmaValue(short setter);

        /**
         * 1D edge-preserving spatial filter using high-order domain transform.
         */
        public static class SpatialFilter extends Pointer {
            static { Loader.load(); }
            /** Default native constructor. */
            public SpatialFilter() { super((Pointer)null); allocate(); }
            /** Native array allocator. Access with {@link Pointer#position(long)}. */
            public SpatialFilter(long size) { super((Pointer)null); allocateArray(size); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public SpatialFilter(Pointer p) { super(p); }
            private native void allocate();
            private native void allocateArray(long size);
            @Override public SpatialFilter position(long position) {
                return (SpatialFilter)super.position(position);
            }
            @Override public SpatialFilter getPointer(long i) {
                return new SpatialFilter((Pointer)this).offsetAddress(i);
            }
        
            @MemberGetter public static native @Cast("const std::int32_t") int DEFAULT_DELTA_VALUE();
            public static final int DEFAULT_DELTA_VALUE = DEFAULT_DELTA_VALUE();

            /**
             * Whether to enable or disable the filter.
             */
            public native @Cast("bool") boolean enable(); public native SpatialFilter enable(boolean setter);

            /**
             * An in-place heuristic symmetric hole-filling mode applied horizontally during the filter passes.
             * Intended to rectify minor artefacts with minimal performance impact.
             * Search radius for hole filling.
             */
            public native @Cast("std::uint8_t") byte holeFillingRadius(); public native SpatialFilter holeFillingRadius(byte setter);

            /**
             * The Alpha factor in an exponential moving average with Alpha=1 - no filter. Alpha = 0 - infinite filter.
             * Determines the amount of smoothing.
             */
            public native float alpha(); public native SpatialFilter alpha(float setter);

            /**
             * Step-size boundary. Establishes the threshold used to preserve "edges".
             * If the disparity value between neighboring pixels exceed the disparity threshold set by this delta parameter,
             * then filtering will be temporarily disabled.
             * Default value 0 means auto: 3 disparity integer levels.
             * In case of subpixel mode it's 3*number of subpixel levels.
             */
            public native @Cast("std::int32_t") int delta(); public native SpatialFilter delta(int setter);

            /**
             * Nubmer of iterations over the image in both horizontal and vertical direction.
             */
            public native @Cast("std::int32_t") int numIterations(); public native SpatialFilter numIterations(int setter);
        }

        /**
         * Edge-preserving filtering: This type of filter will smooth the depth noise while attempting to preserve edges.
         */
        public native @ByRef SpatialFilter spatialFilter(); public native PostProcessing spatialFilter(SpatialFilter setter);

        /**
         * Temporal filtering with optional persistence.
         * More details about the filter can be found here:
         */
        public static class TemporalFilter extends Pointer {
            static { Loader.load(); }
            /** Default native constructor. */
            public TemporalFilter() { super((Pointer)null); allocate(); }
            /** Native array allocator. Access with {@link Pointer#position(long)}. */
            public TemporalFilter(long size) { super((Pointer)null); allocateArray(size); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public TemporalFilter(Pointer p) { super(p); }
            private native void allocate();
            private native void allocateArray(long size);
            @Override public TemporalFilter position(long position) {
                return (TemporalFilter)super.position(position);
            }
            @Override public TemporalFilter getPointer(long i) {
                return new TemporalFilter((Pointer)this).offsetAddress(i);
            }
        
            @MemberGetter public static native @Cast("const std::int32_t") int DEFAULT_DELTA_VALUE();
            public static final int DEFAULT_DELTA_VALUE = DEFAULT_DELTA_VALUE();

            /**
             * Whether to enable or disable the filter.
             */
            public native @Cast("bool") boolean enable(); public native TemporalFilter enable(boolean setter);

            /**
             * Persistency algorithm type.
             */
            public enum PersistencyMode {
                PERSISTENCY_OFF(0),
                VALID_8_OUT_OF_8(1),
                VALID_2_IN_LAST_3(2),
                VALID_2_IN_LAST_4(3),
                VALID_2_OUT_OF_8(4),
                VALID_1_IN_LAST_2(5),
                VALID_1_IN_LAST_5(6),
                VALID_1_IN_LAST_8(7),
                PERSISTENCY_INDEFINITELY(8);

                public final int value;
                private PersistencyMode(int v) { this.value = v; }
                private PersistencyMode(PersistencyMode e) { this.value = e.value; }
                public PersistencyMode intern() { for (PersistencyMode e : values()) if (e.value == value) return e; return this; }
                @Override public String toString() { return intern().name(); }
            }

            /**
             * Persistency mode.
             * If the current disparity/depth value is invalid, it will be replaced by an older value, based on persistency mode.
             */
            public native PersistencyMode persistencyMode(); public native TemporalFilter persistencyMode(PersistencyMode setter);

            /**
             * The Alpha factor in an exponential moving average with Alpha=1 - no filter. Alpha = 0 - infinite filter.
             * Determines the extent of the temporal history that should be averaged.
             */
            public native float alpha(); public native TemporalFilter alpha(float setter);

            /**
             * Step-size boundary. Establishes the threshold used to preserve surfaces (edges).
             * If the disparity value between neighboring pixels exceed the disparity threshold set by this delta parameter,
             * then filtering will be temporarily disabled.
             * Default value 0 means auto: 3 disparity integer levels.
             * In case of subpixel mode it's 3*number of subpixel levels.
             */
            public native @Cast("std::int32_t") int delta(); public native TemporalFilter delta(int setter);
        }

        /**
         * Temporal filtering with optional persistence.
         * More details about the filter can be found here:
         */
        public native @ByRef TemporalFilter temporalFilter(); public native PostProcessing temporalFilter(TemporalFilter setter);

        /**
         * Threshold filtering.
         * Filters out distances outside of a given interval.
         */
        public static class ThresholdFilter extends Pointer {
            static { Loader.load(); }
            /** Default native constructor. */
            public ThresholdFilter() { super((Pointer)null); allocate(); }
            /** Native array allocator. Access with {@link Pointer#position(long)}. */
            public ThresholdFilter(long size) { super((Pointer)null); allocateArray(size); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public ThresholdFilter(Pointer p) { super(p); }
            private native void allocate();
            private native void allocateArray(long size);
            @Override public ThresholdFilter position(long position) {
                return (ThresholdFilter)super.position(position);
            }
            @Override public ThresholdFilter getPointer(long i) {
                return new ThresholdFilter((Pointer)this).offsetAddress(i);
            }
        
            /**
             * Minimum range in millimeters.
             * Depth values under this value are invalidated.
             */
            public native @Cast("std::int32_t") int minRange(); public native ThresholdFilter minRange(int setter);
            /**
             * Minimum range in millimeters.
             * Depth values over this value are invalidated.
             */
            public native @Cast("std::int32_t") int maxRange(); public native ThresholdFilter maxRange(int setter);
        }

        /**
         * Threshold filtering.
         * Filters out distances outside of a given interval.
         */
        public native @ByRef ThresholdFilter thresholdFilter(); public native PostProcessing thresholdFilter(ThresholdFilter setter);

        /**
         * Speckle filtering.
         * Removes speckle noise.
         */
        public static class SpeckleFilter extends Pointer {
            static { Loader.load(); }
            /** Default native constructor. */
            public SpeckleFilter() { super((Pointer)null); allocate(); }
            /** Native array allocator. Access with {@link Pointer#position(long)}. */
            public SpeckleFilter(long size) { super((Pointer)null); allocateArray(size); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public SpeckleFilter(Pointer p) { super(p); }
            private native void allocate();
            private native void allocateArray(long size);
            @Override public SpeckleFilter position(long position) {
                return (SpeckleFilter)super.position(position);
            }
            @Override public SpeckleFilter getPointer(long i) {
                return new SpeckleFilter((Pointer)this).offsetAddress(i);
            }
        
            /**
             * Whether to enable or disable the filter.
             */
            public native @Cast("bool") boolean enable(); public native SpeckleFilter enable(boolean setter);
            /**
             * Speckle search range.
             */
            public native @Cast("std::uint32_t") int speckleRange(); public native SpeckleFilter speckleRange(int setter);
        }

        /**
         * Speckle filtering.
         * Removes speckle noise.
         */
        public native @ByRef SpeckleFilter speckleFilter(); public native PostProcessing speckleFilter(SpeckleFilter setter);

        /**
         * Decimation filter.
         * Reduces the depth scene complexity. The filter runs on kernel sizes [2x2] to [8x8] pixels.
         */
        public static class DecimationFilter extends Pointer {
            static { Loader.load(); }
            /** Default native constructor. */
            public DecimationFilter() { super((Pointer)null); allocate(); }
            /** Native array allocator. Access with {@link Pointer#position(long)}. */
            public DecimationFilter(long size) { super((Pointer)null); allocateArray(size); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public DecimationFilter(Pointer p) { super(p); }
            private native void allocate();
            private native void allocateArray(long size);
            @Override public DecimationFilter position(long position) {
                return (DecimationFilter)super.position(position);
            }
            @Override public DecimationFilter getPointer(long i) {
                return new DecimationFilter((Pointer)this).offsetAddress(i);
            }
        
            /**
             * Decimation factor.
             * Valid values are 1,2,3,4.
             * Disparity/depth map x/y resolution will be decimated with this value.
             */
            public native @Cast("std::uint32_t") int decimationFactor(); public native DecimationFilter decimationFactor(int setter);
            /**
             * Decimation algorithm type.
             */
            public enum DecimationMode {
                PIXEL_SKIPPING(0),
                NON_ZERO_MEDIAN(1),
                NON_ZERO_MEAN(2);

                public final int value;
                private DecimationMode(int v) { this.value = v; }
                private DecimationMode(DecimationMode e) { this.value = e.value; }
                public DecimationMode intern() { for (DecimationMode e : values()) if (e.value == value) return e; return this; }
                @Override public String toString() { return intern().name(); }
            }
            /**
             * Decimation algorithm type.
             */
            public native DecimationMode decimationMode(); public native DecimationFilter decimationMode(DecimationMode setter);
        }

        /**
         * Decimation filter.
         * Reduces disparity/depth map x/y complexity, reducing runtime complexity for other filters.
         */
        public native @ByRef DecimationFilter decimationFilter(); public native PostProcessing decimationFilter(DecimationFilter setter);
    }

    /**
     * Controls the postprocessing of disparity and/or depth map.
     */
    public native @ByRef PostProcessing postProcessing(); public native RawStereoDepthConfig postProcessing(PostProcessing setter);

    /**
     * The basic cost function used by the Stereo Accelerator for matching the left and right images is the Census
     * Transform. It works on a block of pixels and computes a bit vector which represents the structure of the
     * image in that block.
     * There are two types of Census Transform based on how the middle pixel is used:
     * Classic Approach and Modified Census. The comparisons that are made between pixels can be or not thresholded.
     * In some cases a mask can be applied to filter out only specific bits from the entire bit stream.
     * All these approaches are:
     * Classic Approach: Uses middle pixel to compare against all its neighbors over a defined window. Each
     * comparison results in a new bit, that is 0 if central pixel is smaller, or 1 if is it bigger than its neighbor.
     * Modified Census Transform: same as classic Census Transform, but instead of comparing central pixel
     * with its neighbors, the window mean will be compared with each pixel over the window.
     * Thresholding Census Transform: same as classic Census Transform, but it is not enough that a
     * neighbor pixel to be bigger than the central pixel, it must be significant bigger (based on a threshold).
     * Census Transform with Mask: same as classic Census Transform, but in this case not all of the pixel from
     * the support window are part of the binary descriptor. We use a ma sk “M” to define which pixels are part
     * of the binary descriptor (1), and which pixels should be skipped (0).
     */
    public static class CensusTransform extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public CensusTransform() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public CensusTransform(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CensusTransform(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public CensusTransform position(long position) {
            return (CensusTransform)super.position(position);
        }
        @Override public CensusTransform getPointer(long i) {
            return new CensusTransform((Pointer)this).offsetAddress(i);
        }
    
        /**
         * Census transform kernel size possible values.
         */
        public enum KernelSize { AUTO(-1), KERNEL_5x5(0), KERNEL_7x7(1), KERNEL_7x9(2);

            public final int value;
            private KernelSize(int v) { this.value = v; }
            private KernelSize(KernelSize e) { this.value = e.value; }
            public KernelSize intern() { for (KernelSize e : values()) if (e.value == value) return e; return this; }
            @Override public String toString() { return intern().name(); }
        }

        /**
         * Census transform kernel size.
         */
        public native KernelSize kernelSize(); public native CensusTransform kernelSize(KernelSize setter);

        /**
         * Census transform mask, default - auto, mask is set based on resolution and kernel size.
         * Disabled for 400p input resolution.
         * Enabled for 720p.
         * 0XA82415 for 5x5 census transform kernel.
         * 0XAA02A8154055 for 7x7 census transform kernel.
         * 0X2AA00AA805540155 for 7x9 census transform kernel.
         * Empirical values.
         */
        public native @Cast("uint64_t") long kernelMask(); public native CensusTransform kernelMask(long setter);

        /**
         * If enabled, each pixel in the window is compared with the mean window value instead of the central pixel.
         */
        public native @Cast("bool") boolean enableMeanMode(); public native CensusTransform enableMeanMode(boolean setter);

        /**
         * Census transform comparison threshold value.
         */
        public native @Cast("uint32_t") int threshold(); public native CensusTransform threshold(int setter);
    }

    /**
     * Census transform settings.
     */
    public native @ByRef CensusTransform censusTransform(); public native RawStereoDepthConfig censusTransform(CensusTransform setter);

    /**
     * The matching cost is way of measuring the similarity of image locations in stereo correspondence
     * algorithm. Based on the configuration parameters and based on the descriptor type, a linear equation
     * is applied to computing the cost for each candidate disparity at each pixel.
     */
    public static class CostMatching extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public CostMatching() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public CostMatching(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CostMatching(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public CostMatching position(long position) {
            return (CostMatching)super.position(position);
        }
        @Override public CostMatching getPointer(long i) {
            return new CostMatching((Pointer)this).offsetAddress(i);
        }
    
        /**
         * Disparity search range: 64 or 96 pixels are supported by the HW.
         */
        public enum DisparityWidth { DISPARITY_64(0), DISPARITY_96(1);

            public final int value;
            private DisparityWidth(int v) { this.value = v; }
            private DisparityWidth(DisparityWidth e) { this.value = e.value; }
            public DisparityWidth intern() { for (DisparityWidth e : values()) if (e.value == value) return e; return this; }
            @Override public String toString() { return intern().name(); }
        }

        /**
         * Disparity search range, default 96 pixels.
         */
        public native DisparityWidth disparityWidth(); public native CostMatching disparityWidth(DisparityWidth setter);

        /**
         * Disparity companding using sparse matching.
         * Matching pixel by pixel for N disparities.
         * Matching every 2nd pixel for M disparitites.
         * Matching every 4th pixel for T disparities.
         * In case of 96 disparities: N=48, M=32, T=16.
         * This way the search range is extended to 176 disparities, by sparse matching.
         * Note: when enabling this flag only depth map will be affected, disparity map is not.
         */
        public native @Cast("bool") boolean enableCompanding(); public native CostMatching enableCompanding(boolean setter);

        /**
         * Used only for debug purposes, SW postprocessing handled only invalid value of 0 properly.
         */
        public native @Cast("uint8_t") byte invalidDisparityValue(); public native CostMatching invalidDisparityValue(byte setter);

        /**
         * Disparities with confidence value under this threshold are accepted.
         * Higher confidence threshold means disparities with less confidence are accepted too.
         */
        public native @Cast("uint8_t") byte confidenceThreshold(); public native CostMatching confidenceThreshold(byte setter);

        /**
         * The linear equation applied for computing the cost is:
         * COMB_COST = α*AD + β*(CTC<<3).
         * CLAMP(COMB_COST >> 5, threshold).
         * Where AD is the Absolute Difference between 2 pixels values.
         * CTC is the Census Transform Cost between 2 pixels, based on Hamming distance (xor).
         * The α and β parameters are subject to fine tuning by the user.
         */
        public static class LinearEquationParameters extends Pointer {
            static { Loader.load(); }
            /** Default native constructor. */
            public LinearEquationParameters() { super((Pointer)null); allocate(); }
            /** Native array allocator. Access with {@link Pointer#position(long)}. */
            public LinearEquationParameters(long size) { super((Pointer)null); allocateArray(size); }
            /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
            public LinearEquationParameters(Pointer p) { super(p); }
            private native void allocate();
            private native void allocateArray(long size);
            @Override public LinearEquationParameters position(long position) {
                return (LinearEquationParameters)super.position(position);
            }
            @Override public LinearEquationParameters getPointer(long i) {
                return new LinearEquationParameters((Pointer)this).offsetAddress(i);
            }
        
            public native @Cast("uint8_t") byte alpha(); public native LinearEquationParameters alpha(byte setter);
            public native @Cast("uint8_t") byte beta(); public native LinearEquationParameters beta(byte setter);
            public native @Cast("uint8_t") byte threshold(); public native LinearEquationParameters threshold(byte setter);
        }

        /**
         * Cost calculation linear equation parameters.
         */
        public native @ByRef LinearEquationParameters linearEquationParameters(); public native CostMatching linearEquationParameters(LinearEquationParameters setter);
    }

    /**
     * Cost matching settings.
     */
    public native @ByRef CostMatching costMatching(); public native RawStereoDepthConfig costMatching(CostMatching setter);

    /**
     * Cost Aggregation is based on Semi Global Block Matching (SGBM). This algorithm uses a semi global
     * technique to aggregate the cost map. Ultimately the idea is to build inertia into the stereo algorithm. If
     * a pixel has very little texture information, then odds are the correct disparity for this pixel is close to
     * that of the previous pixel considered. This means that we get improved results in areas with low
     * texture.
     */
    public static class CostAggregation extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public CostAggregation() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public CostAggregation(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CostAggregation(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public CostAggregation position(long position) {
            return (CostAggregation)super.position(position);
        }
        @Override public CostAggregation getPointer(long i) {
            return new CostAggregation((Pointer)this).offsetAddress(i);
        }
    
        @MemberGetter public static native int defaultPenaltyP1();
        public static final int defaultPenaltyP1 = defaultPenaltyP1();
        @MemberGetter public static native int defaultPenaltyP2();
        public static final int defaultPenaltyP2 = defaultPenaltyP2();

        /**
         * Cost calculation linear equation parameters.
         */
        public native @Cast("uint8_t") byte divisionFactor(); public native CostAggregation divisionFactor(byte setter);

        /**
         * Horizontal P1 penalty cost parameter.
         */
        public native @Cast("uint16_t") short horizontalPenaltyCostP1(); public native CostAggregation horizontalPenaltyCostP1(short setter);
        /**
         * Horizontal P2 penalty cost parameter.
         */
        public native @Cast("uint16_t") short horizontalPenaltyCostP2(); public native CostAggregation horizontalPenaltyCostP2(short setter);

        /**
         * Vertical P1 penalty cost parameter.
         */
        public native @Cast("uint16_t") short verticalPenaltyCostP1(); public native CostAggregation verticalPenaltyCostP1(short setter);
        /**
         * Vertical P2 penalty cost parameter.
         */
        public native @Cast("uint16_t") short verticalPenaltyCostP2(); public native CostAggregation verticalPenaltyCostP2(short setter);
    }

    /**
     * Cost aggregation settings.
     */
    public native @ByRef CostAggregation costAggregation(); public native RawStereoDepthConfig costAggregation(CostAggregation setter);

    public native @Override void serialize(@Cast("std::uint8_t*") @StdVector BytePointer metadata, @ByRef @Cast("dai::DatatypeEnum*") IntPointer datatype);
    public native @Override void serialize(@Cast("std::uint8_t*") @StdVector ByteBuffer metadata, @ByRef @Cast("dai::DatatypeEnum*") IntBuffer datatype);
    public native @Override void serialize(@Cast("std::uint8_t*") @StdVector byte[] metadata, @ByRef @Cast("dai::DatatypeEnum*") int[] datatype);
}

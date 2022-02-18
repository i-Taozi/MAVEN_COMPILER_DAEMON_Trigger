// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.artoolkitplus;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.artoolkitplus.global.ARToolKitPlus.*;


/**
 * Defines a simple interface for multi-marker tracking with ARToolKitPlus
 *  ARToolKit::TrackerMultiMarker provides all methods to access ARToolKit for
 *  multi marker tracking without needing to mess around with it directly.
 *
 *  Per default the tracker searches for Id-based markers with normal border and uses
 *  the RPP algorithm for pose estimation.
 *  Furthermore it uses only 4 'good' points of the convex hull to do the pose estimation.
 *  You can override this using the according methods.
 */
@Namespace("ARToolKitPlus") @NoOffset @Properties(inherit = org.bytedeco.artoolkitplus.presets.ARToolKitPlus.class)
public class TrackerMultiMarker extends Tracker {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TrackerMultiMarker(Pointer p) { super(p); }

    /**
     * These parameters control the way the toolkit warps a found
     * marker to a perfect square. The square has size
     * pattWidth * pattHeight, the projected
     * square in the image is subsampled at a min of
     * pattWidth/pattHeight and a max of pattSamples
     * steps in both x and y direction
     *  @param imWidth width of the source image in px
     *  @param imHeight height of the source image in px
     *  @param maxImagePatterns describes the maximum number of patterns that can be analyzed in a camera image.
     *  @param pattWidth describes the pattern image width (must be 6 for binary markers)
     *  @param pattHeight describes the pattern image height (must be 6 for binary markers)
     *  @param pattSamples describes the maximum resolution at which a pattern is sampled from the camera image
     *  (6 by default, must a a multiple of pattWidth and pattHeight).
     *  @param maxLoadPatterns describes the maximum number of pattern files that can be loaded.
     *  Reduce maxLoadPatterns and maxImagePatterns to reduce memory footprint.
     */
    public TrackerMultiMarker(int imWidth, int imHeight, int maxImagePatterns/*=8*/, int pattWidth/*=6*/, int pattHeight/*=6*/, int pattSamples/*=6*/,
                int maxLoadPatterns/*=0*/) { super((Pointer)null); allocate(imWidth, imHeight, maxImagePatterns, pattWidth, pattHeight, pattSamples, maxLoadPatterns); }
    private native void allocate(int imWidth, int imHeight, int maxImagePatterns/*=8*/, int pattWidth/*=6*/, int pattHeight/*=6*/, int pattSamples/*=6*/,
                int maxLoadPatterns/*=0*/);
    public TrackerMultiMarker(int imWidth, int imHeight) { super((Pointer)null); allocate(imWidth, imHeight); }
    private native void allocate(int imWidth, int imHeight);

    /**
     * initializes ARToolKit
     *  nCamParamFile is the name of the camera parameter file
     *  nNearClip & nFarClip are near and far clipping values for the OpenGL projection matrix
     *  nLogger is an instance which implements the ARToolKit::Logger interface
     */
    public native @Cast("bool") boolean init(@Cast("const char*") BytePointer nCamParamFile, @Cast("const char*") BytePointer nMultiFile, @Cast("ARFloat") float nNearClip, @Cast("ARFloat") float nFarClip);
    public native @Cast("bool") boolean init(String nCamParamFile, String nMultiFile, @Cast("ARFloat") float nNearClip, @Cast("ARFloat") float nFarClip);

    /**
     * calculates the transformation matrix
     *	pass the image as RGBX (32-bits)
     */
    public native int calc(@Cast("const uint8_t*") BytePointer nImage);
    public native int calc(@Cast("const uint8_t*") ByteBuffer nImage);
    public native int calc(@Cast("const uint8_t*") byte[] nImage);

    /*
     * Returns the number of detected markers used for multi-marker tracking
     */
    public native int getNumDetectedMarkers();

    /** Enables usage of arDetectMarkerLite. Otherwise arDetectMarker is used
    /**
     * Enables usage of arDetectMarkerLite. Otherwise arDetectMarker is used
     * In general arDetectMarker is more powerful since it keeps history about markers.
     * In some cases such as very low camera refresh rates it is advantegous to change this.
     * Using the non-lite version treats each image independent.
     */
    public native void setUseDetectLite(@Cast("bool") boolean nEnable);

    /**
     * Returns array of detected marker IDs
     * Only access the first getNumDetectedMarkers() markers
     */
    public native void getDetectedMarkers(@ByPtrRef IntPointer nMarkerIDs);
    public native void getDetectedMarkers(@ByPtrRef IntBuffer nMarkerIDs);
    public native void getDetectedMarkers(@ByPtrRef int[] nMarkerIDs);

    /*
     * Returns the ARMarkerInfo object for a found marker
     */
    public native @Const @ByRef ARMarkerInfo getDetectedMarker(int nWhich);

    /**
     * Returns the loaded ARMultiMarkerInfoT object
     *  If loading the multi-marker config file failed then this method
     *  returns NULL.
     */
    public native @Const ARMultiMarkerInfoT getMultiMarkerConfig();

    /**
     * Provides access to ARToolKit' internal version of the transformation matrix
     *  This method is primarily for compatibility issues with code previously using
     *  ARToolKit rather than ARToolKitPlus. This is the original transformation
     *  matrix ARToolKit calculates rather than the OpenGL style version of this matrix
     *  that can be retrieved via getModelViewMatrix().
     */
    public native void getARMatrix(@Cast("ARFloat(* /*[3]*/ )[4]") FloatPointer nMatrix);
    public native void getARMatrix(@Cast("ARFloat(* /*[3]*/ )[4]") FloatBuffer nMatrix);
    public native void getARMatrix(@Cast("ARFloat(* /*[3]*/ )[4]") float[] nMatrix);
}

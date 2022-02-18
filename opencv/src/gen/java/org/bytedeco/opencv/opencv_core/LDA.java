// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** \example samples/cpp/pca.cpp
An example using %PCA for dimensionality reduction while maintaining an amount of variance
*/

/** \example samples/cpp/tutorial_code/ml/introduction_to_pca/introduction_to_pca.cpp
Check \ref tutorial_introduction_to_pca "the corresponding tutorial" for more details
*/

/**
\brief Linear Discriminant Analysis
\todo document this class
*/
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class LDA extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LDA(Pointer p) { super(p); }

    /** \brief constructor
    Initializes a LDA with num_components (default 0).
    */
    public LDA(int num_components/*=0*/) { super((Pointer)null); allocate(num_components); }
    private native void allocate(int num_components/*=0*/);
    public LDA() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Initializes and performs a Discriminant Analysis with Fisher's
     Optimization Criterion on given data in src and corresponding labels
     in labels. If 0 (or less) number of components are given, they are
     automatically determined for given data in computation.
    */
    public LDA(@ByVal MatVector src, @ByVal Mat labels, int num_components/*=0*/) { super((Pointer)null); allocate(src, labels, num_components); }
    private native void allocate(@ByVal MatVector src, @ByVal Mat labels, int num_components/*=0*/);
    public LDA(@ByVal MatVector src, @ByVal Mat labels) { super((Pointer)null); allocate(src, labels); }
    private native void allocate(@ByVal MatVector src, @ByVal Mat labels);
    public LDA(@ByVal UMatVector src, @ByVal Mat labels, int num_components/*=0*/) { super((Pointer)null); allocate(src, labels, num_components); }
    private native void allocate(@ByVal UMatVector src, @ByVal Mat labels, int num_components/*=0*/);
    public LDA(@ByVal UMatVector src, @ByVal Mat labels) { super((Pointer)null); allocate(src, labels); }
    private native void allocate(@ByVal UMatVector src, @ByVal Mat labels);
    public LDA(@ByVal GpuMatVector src, @ByVal Mat labels, int num_components/*=0*/) { super((Pointer)null); allocate(src, labels, num_components); }
    private native void allocate(@ByVal GpuMatVector src, @ByVal Mat labels, int num_components/*=0*/);
    public LDA(@ByVal GpuMatVector src, @ByVal Mat labels) { super((Pointer)null); allocate(src, labels); }
    private native void allocate(@ByVal GpuMatVector src, @ByVal Mat labels);
    public LDA(@ByVal MatVector src, @ByVal UMat labels, int num_components/*=0*/) { super((Pointer)null); allocate(src, labels, num_components); }
    private native void allocate(@ByVal MatVector src, @ByVal UMat labels, int num_components/*=0*/);
    public LDA(@ByVal MatVector src, @ByVal UMat labels) { super((Pointer)null); allocate(src, labels); }
    private native void allocate(@ByVal MatVector src, @ByVal UMat labels);
    public LDA(@ByVal UMatVector src, @ByVal UMat labels, int num_components/*=0*/) { super((Pointer)null); allocate(src, labels, num_components); }
    private native void allocate(@ByVal UMatVector src, @ByVal UMat labels, int num_components/*=0*/);
    public LDA(@ByVal UMatVector src, @ByVal UMat labels) { super((Pointer)null); allocate(src, labels); }
    private native void allocate(@ByVal UMatVector src, @ByVal UMat labels);
    public LDA(@ByVal GpuMatVector src, @ByVal UMat labels, int num_components/*=0*/) { super((Pointer)null); allocate(src, labels, num_components); }
    private native void allocate(@ByVal GpuMatVector src, @ByVal UMat labels, int num_components/*=0*/);
    public LDA(@ByVal GpuMatVector src, @ByVal UMat labels) { super((Pointer)null); allocate(src, labels); }
    private native void allocate(@ByVal GpuMatVector src, @ByVal UMat labels);
    public LDA(@ByVal MatVector src, @ByVal GpuMat labels, int num_components/*=0*/) { super((Pointer)null); allocate(src, labels, num_components); }
    private native void allocate(@ByVal MatVector src, @ByVal GpuMat labels, int num_components/*=0*/);
    public LDA(@ByVal MatVector src, @ByVal GpuMat labels) { super((Pointer)null); allocate(src, labels); }
    private native void allocate(@ByVal MatVector src, @ByVal GpuMat labels);
    public LDA(@ByVal UMatVector src, @ByVal GpuMat labels, int num_components/*=0*/) { super((Pointer)null); allocate(src, labels, num_components); }
    private native void allocate(@ByVal UMatVector src, @ByVal GpuMat labels, int num_components/*=0*/);
    public LDA(@ByVal UMatVector src, @ByVal GpuMat labels) { super((Pointer)null); allocate(src, labels); }
    private native void allocate(@ByVal UMatVector src, @ByVal GpuMat labels);
    public LDA(@ByVal GpuMatVector src, @ByVal GpuMat labels, int num_components/*=0*/) { super((Pointer)null); allocate(src, labels, num_components); }
    private native void allocate(@ByVal GpuMatVector src, @ByVal GpuMat labels, int num_components/*=0*/);
    public LDA(@ByVal GpuMatVector src, @ByVal GpuMat labels) { super((Pointer)null); allocate(src, labels); }
    private native void allocate(@ByVal GpuMatVector src, @ByVal GpuMat labels);

    /** Serializes this object to a given filename.
      */
    public native void save(@Str BytePointer filename);
    public native void save(@Str String filename);

    /** Deserializes this object from a given filename.
      */
    public native void load(@Str BytePointer filename);
    public native void load(@Str String filename);

    /** Serializes this object to a given cv::FileStorage.
      */
    public native void save(@ByRef FileStorage fs);

    /** Deserializes this object from a given cv::FileStorage.
      */
    public native void load(@Const @ByRef FileStorage node);

    /** destructor
      */

    /** Compute the discriminants for data in src (row aligned) and labels.
      */
    public native void compute(@ByVal MatVector src, @ByVal Mat labels);
    public native void compute(@ByVal UMatVector src, @ByVal Mat labels);
    public native void compute(@ByVal GpuMatVector src, @ByVal Mat labels);
    public native void compute(@ByVal MatVector src, @ByVal UMat labels);
    public native void compute(@ByVal UMatVector src, @ByVal UMat labels);
    public native void compute(@ByVal GpuMatVector src, @ByVal UMat labels);
    public native void compute(@ByVal MatVector src, @ByVal GpuMat labels);
    public native void compute(@ByVal UMatVector src, @ByVal GpuMat labels);
    public native void compute(@ByVal GpuMatVector src, @ByVal GpuMat labels);

    /** Projects samples into the LDA subspace.
        src may be one or more row aligned samples.
      */
    public native @ByVal Mat project(@ByVal Mat src);
    public native @ByVal Mat project(@ByVal UMat src);
    public native @ByVal Mat project(@ByVal GpuMat src);

    /** Reconstructs projections from the LDA subspace.
        src may be one or more row aligned projections.
      */
    public native @ByVal Mat reconstruct(@ByVal Mat src);
    public native @ByVal Mat reconstruct(@ByVal UMat src);
    public native @ByVal Mat reconstruct(@ByVal GpuMat src);

    /** Returns the eigenvectors of this LDA.
      */
    public native @ByVal Mat eigenvectors();

    /** Returns the eigenvalues of this LDA.
      */
    public native @ByVal Mat eigenvalues();

    public static native @ByVal Mat subspaceProject(@ByVal Mat W, @ByVal Mat mean, @ByVal Mat src);
    public static native @ByVal Mat subspaceProject(@ByVal UMat W, @ByVal UMat mean, @ByVal UMat src);
    public static native @ByVal Mat subspaceProject(@ByVal GpuMat W, @ByVal GpuMat mean, @ByVal GpuMat src);
    public static native @ByVal Mat subspaceReconstruct(@ByVal Mat W, @ByVal Mat mean, @ByVal Mat src);
    public static native @ByVal Mat subspaceReconstruct(@ByVal UMat W, @ByVal UMat mean, @ByVal UMat src);
    public static native @ByVal Mat subspaceReconstruct(@ByVal GpuMat W, @ByVal GpuMat mean, @ByVal GpuMat src);
}

// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

@Name("cv::Rect_<double>") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Rect2d extends DoublePointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Rect2d(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Rect2d(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Rect2d position(long position) {
        return (Rect2d)super.position(position);
    }
    @Override public Rect2d getPointer(long i) {
        return new Rect2d((Pointer)this).offsetAddress(i);
    }


    /** default constructor */
    public Rect2d() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Rect2d(double _x, double _y, double _width, double _height) { super((Pointer)null); allocate(_x, _y, _width, _height); }
    private native void allocate(double _x, double _y, double _width, double _height);
// #if OPENCV_ABI_COMPATIBILITY < 500
    public Rect2d(@Const @ByRef Rect2d r) { super((Pointer)null); allocate(r); }
    private native void allocate(@Const @ByRef Rect2d r);
// #endif
    public Rect2d(@Const @ByRef Point2d org, @Const @ByRef Size2d sz) { super((Pointer)null); allocate(org, sz); }
    private native void allocate(@Const @ByRef Point2d org, @Const @ByRef Size2d sz);
    public Rect2d(@Const @ByRef Point2d pt1, @Const @ByRef Point2d pt2) { super((Pointer)null); allocate(pt1, pt2); }
    private native void allocate(@Const @ByRef Point2d pt1, @Const @ByRef Point2d pt2);

// #if OPENCV_ABI_COMPATIBILITY < 500
    public native @ByRef @Name("operator =") Rect2d put(@Const @ByRef Rect2d r);
// #endif
    /** the top-left corner */
    public native @ByVal Point2d tl();
    /** the bottom-right corner */
    public native @ByVal Point2d br();

    /** size (width, height) of the rectangle */
    public native @ByVal Size2d size();
    /** area (width*height) of the rectangle */
    public native double area();
    /** true if empty */
    public native @Cast("bool") boolean empty();

    /** conversion to another data type */

    /** checks whether the rectangle contains the point */
    public native @Cast("bool") boolean contains(@Const @ByRef Point2d pt);

    /** x coordinate of the top-left corner */
    public native double x(); public native Rect2d x(double setter);
    /** y coordinate of the top-left corner */
    public native double y(); public native Rect2d y(double setter);
    /** width of the rectangle */
    public native double width(); public native Rect2d width(double setter);
    /** height of the rectangle */
    public native double height(); public native Rect2d height(double setter);
}

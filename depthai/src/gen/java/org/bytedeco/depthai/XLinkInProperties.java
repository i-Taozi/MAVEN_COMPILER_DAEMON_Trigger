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


/**
 * Specify properties for XLinkIn such as stream name, ...
 */
@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class XLinkInProperties extends XLinkInPropertiesSerializable {
    static { Loader.load(); }
    /** Default native constructor. */
    public XLinkInProperties() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public XLinkInProperties(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public XLinkInProperties(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public XLinkInProperties position(long position) {
        return (XLinkInProperties)super.position(position);
    }
    @Override public XLinkInProperties getPointer(long i) {
        return new XLinkInProperties((Pointer)this).offsetAddress(i);
    }

    /**
     * Name of stream
     */
    public native @StdString BytePointer streamName(); public native XLinkInProperties streamName(BytePointer setter);

    /**
     * Maximum input data size
     */
    public native @Cast("std::uint32_t") int maxDataSize(); public native XLinkInProperties maxDataSize(int setter);

    /**
     * Number of frames in pool
     */
    public native @Cast("std::uint32_t") int numFrames(); public native XLinkInProperties numFrames(int setter);
}

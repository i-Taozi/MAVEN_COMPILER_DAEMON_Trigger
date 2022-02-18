// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avfilter;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;
import org.bytedeco.ffmpeg.avcodec.*;
import static org.bytedeco.ffmpeg.global.avcodec.*;
import org.bytedeco.ffmpeg.avformat.*;
import static org.bytedeco.ffmpeg.global.avformat.*;
import org.bytedeco.ffmpeg.postproc.*;
import static org.bytedeco.ffmpeg.global.postproc.*;
import org.bytedeco.ffmpeg.swscale.*;
import static org.bytedeco.ffmpeg.global.swscale.*;

import static org.bytedeco.ffmpeg.global.avfilter.*;


// #if FF_API_BUFFERSINK_ALLOC
/**
 * Deprecated and unused struct to use for initializing a buffersink context.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avfilter.class)
public class AVBufferSinkParams extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVBufferSinkParams() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVBufferSinkParams(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVBufferSinkParams(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVBufferSinkParams position(long position) {
        return (AVBufferSinkParams)super.position(position);
    }
    @Override public AVBufferSinkParams getPointer(long i) {
        return new AVBufferSinkParams((Pointer)this).offsetAddress(i);
    }

    /** list of allowed pixel formats, terminated by AV_PIX_FMT_NONE */
    public native @Cast("const AVPixelFormat*") IntPointer pixel_fmts(); public native AVBufferSinkParams pixel_fmts(IntPointer setter);
}

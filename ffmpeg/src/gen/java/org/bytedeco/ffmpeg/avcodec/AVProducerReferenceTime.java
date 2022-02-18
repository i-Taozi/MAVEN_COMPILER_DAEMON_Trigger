// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avcodec;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;

import static org.bytedeco.ffmpeg.global.avcodec.*;


/**
 * This structure supplies correlation between a packet timestamp and a wall clock
 * production time. The definition follows the Producer Reference Time ('prft')
 * as defined in ISO/IEC 14496-12
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avcodec.class)
public class AVProducerReferenceTime extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVProducerReferenceTime() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVProducerReferenceTime(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVProducerReferenceTime(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVProducerReferenceTime position(long position) {
        return (AVProducerReferenceTime)super.position(position);
    }
    @Override public AVProducerReferenceTime getPointer(long i) {
        return new AVProducerReferenceTime((Pointer)this).offsetAddress(i);
    }

    /**
     * A UTC timestamp, in microseconds, since Unix epoch (e.g, av_gettime()).
     */
    public native @Cast("int64_t") long wallclock(); public native AVProducerReferenceTime wallclock(long setter);
    public native int flags(); public native AVProducerReferenceTime flags(int setter);
}

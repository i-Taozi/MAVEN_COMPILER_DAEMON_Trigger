// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvcuvid;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.nvcodec.global.nvcuvid.*;


/*****************************************************************************/
/** \ingroup STRUCTS
/** \struct CUVIDSOURCEDATAPACKET
/** Data Packet
/** Used in cuvidParseVideoData API
/** IN for cuvidParseVideoData
/*****************************************************************************/
@Properties(inherit = org.bytedeco.nvcodec.presets.nvcuvid.class)
public class CUVIDSOURCEDATAPACKET extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUVIDSOURCEDATAPACKET() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUVIDSOURCEDATAPACKET(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUVIDSOURCEDATAPACKET(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUVIDSOURCEDATAPACKET position(long position) {
        return (CUVIDSOURCEDATAPACKET)super.position(position);
    }
    @Override public CUVIDSOURCEDATAPACKET getPointer(long i) {
        return new CUVIDSOURCEDATAPACKET((Pointer)this).offsetAddress(i);
    }

    /** IN: Combination of CUVID_PKT_XXX flags                              */
    public native @Cast("unsigned long") long flags(); public native CUVIDSOURCEDATAPACKET flags(long setter);
    /** IN: number of bytes in the payload (may be zero if EOS flag is set) */
    public native @Cast("unsigned long") long payload_size(); public native CUVIDSOURCEDATAPACKET payload_size(long setter);
    /** IN: Pointer to packet payload data (may be NULL if EOS flag is set) */
    public native @Cast("const unsigned char*") BytePointer payload(); public native CUVIDSOURCEDATAPACKET payload(BytePointer setter);
    /** IN: Presentation time stamp (10MHz clock), only valid if
                                                 CUVID_PKT_TIMESTAMP flag is set                                 */
    public native @Cast("CUvideotimestamp") long timestamp(); public native CUVIDSOURCEDATAPACKET timestamp(long setter);
}

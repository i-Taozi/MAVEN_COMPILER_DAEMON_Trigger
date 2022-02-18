// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvencodeapi;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.nvcodec.nvcuvid.*;
import static org.bytedeco.nvcodec.global.nvcuvid.*;

import static org.bytedeco.nvcodec.global.nvencodeapi.*;


/**
 * \struct _NV_ENC_INITIALIZE_PARAMS
 * Encode Session Initialization parameters.
 */
@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NV_ENC_INITIALIZE_PARAMS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NV_ENC_INITIALIZE_PARAMS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NV_ENC_INITIALIZE_PARAMS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NV_ENC_INITIALIZE_PARAMS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NV_ENC_INITIALIZE_PARAMS position(long position) {
        return (NV_ENC_INITIALIZE_PARAMS)super.position(position);
    }
    @Override public NV_ENC_INITIALIZE_PARAMS getPointer(long i) {
        return new NV_ENC_INITIALIZE_PARAMS((Pointer)this).offsetAddress(i);
    }

    /** [in]: Struct version. Must be set to ::NV_ENC_INITIALIZE_PARAMS_VER. */
    public native @Cast("uint32_t") int version(); public native NV_ENC_INITIALIZE_PARAMS version(int setter);
    /** [in]: Specifies the Encode GUID for which the encoder is being created. ::NvEncInitializeEncoder() API will fail if this is not set, or set to unsupported value. */
    public native @ByRef GUID encodeGUID(); public native NV_ENC_INITIALIZE_PARAMS encodeGUID(GUID setter);
    /** [in]: Specifies the preset for encoding. If the preset GUID is set then , the preset configuration will be applied before any other parameter. */
    public native @ByRef GUID presetGUID(); public native NV_ENC_INITIALIZE_PARAMS presetGUID(GUID setter);
    /** [in]: Specifies the encode width. If not set ::NvEncInitializeEncoder() API will fail. */
    public native @Cast("uint32_t") int encodeWidth(); public native NV_ENC_INITIALIZE_PARAMS encodeWidth(int setter);
    /** [in]: Specifies the encode height. If not set ::NvEncInitializeEncoder() API will fail. */
    public native @Cast("uint32_t") int encodeHeight(); public native NV_ENC_INITIALIZE_PARAMS encodeHeight(int setter);
    /** [in]: Specifies the display aspect ratio Width. */
    public native @Cast("uint32_t") int darWidth(); public native NV_ENC_INITIALIZE_PARAMS darWidth(int setter);
    /** [in]: Specifies the display aspect ratio height. */
    public native @Cast("uint32_t") int darHeight(); public native NV_ENC_INITIALIZE_PARAMS darHeight(int setter);
    /** [in]: Specifies the numerator for frame rate used for encoding in frames per second ( Frame rate = frameRateNum / frameRateDen ). */
    public native @Cast("uint32_t") int frameRateNum(); public native NV_ENC_INITIALIZE_PARAMS frameRateNum(int setter);
    /** [in]: Specifies the denominator for frame rate used for encoding in frames per second ( Frame rate = frameRateNum / frameRateDen ). */
    public native @Cast("uint32_t") int frameRateDen(); public native NV_ENC_INITIALIZE_PARAMS frameRateDen(int setter);
    /** [in]: Set this to 1 to enable asynchronous mode and is expected to use events to get picture completion notification. */
    public native @Cast("uint32_t") int enableEncodeAsync(); public native NV_ENC_INITIALIZE_PARAMS enableEncodeAsync(int setter);
    /** [in]: Set this to 1 to enable the Picture Type Decision is be taken by the NvEncodeAPI interface. */
    public native @Cast("uint32_t") int enablePTD(); public native NV_ENC_INITIALIZE_PARAMS enablePTD(int setter);
    /** [in]: Set this to 1 to enable reporting slice offsets in ::_NV_ENC_LOCK_BITSTREAM. NV_ENC_INITIALIZE_PARAMS::enableEncodeAsync must be set to 0 to use this feature. Client must set this to 0 if NV_ENC_CONFIG_H264::sliceMode is 1 on Kepler GPUs */
    public native @Cast("uint32_t") @NoOffset int reportSliceOffsets(); public native NV_ENC_INITIALIZE_PARAMS reportSliceOffsets(int setter);
    /** [in]: Set this to 1 to write out available bitstream to memory at subframe intervals.
                                                                                               If enableSubFrameWrite = 1, then the hardware encoder returns data as soon as a slice has completed encoding.
                                                                                               This results in better encoding latency, but the downside is that the application has to keep polling via a call to nvEncLockBitstream API continuously to see if any encoded slice data is available. 
                                                                                               Use this mode if you feel that the marginal reduction in latency from sub-frame encoding is worth the increase in complexity due to CPU-based polling. */
    public native @Cast("uint32_t") @NoOffset int enableSubFrameWrite(); public native NV_ENC_INITIALIZE_PARAMS enableSubFrameWrite(int setter);
    /** [in]: Set to 1 to enable external ME hints for the current frame. For NV_ENC_INITIALIZE_PARAMS::enablePTD=1 with B frames, programming L1 hints is optional for B frames since Client doesn't know internal GOP structure. 
                                                                                               NV_ENC_PIC_PARAMS::meHintRefPicDist should preferably be set with enablePTD=1. */
    public native @Cast("uint32_t") @NoOffset int enableExternalMEHints(); public native NV_ENC_INITIALIZE_PARAMS enableExternalMEHints(int setter);
    /** [in]: Set to 1 to enable ME Only Mode .*/
    public native @Cast("uint32_t") @NoOffset int enableMEOnlyMode(); public native NV_ENC_INITIALIZE_PARAMS enableMEOnlyMode(int setter);
    /** [in]: Set this to 1 to enable weighted prediction. Not supported if encode session is configured for B-Frames (i.e. NV_ENC_CONFIG::frameIntervalP > 1 or preset >=P3 when tuningInfo = ::NV_ENC_TUNING_INFO_HIGH_QUALITY or 
                                                                                               tuningInfo = ::NV_ENC_TUNING_INFO_LOSSLESS. This is because preset >=p3 internally enables B frames when tuningInfo = ::NV_ENC_TUNING_INFO_HIGH_QUALITY or ::NV_ENC_TUNING_INFO_LOSSLESS). */
    public native @Cast("uint32_t") @NoOffset int enableWeightedPrediction(); public native NV_ENC_INITIALIZE_PARAMS enableWeightedPrediction(int setter);
    /** [in]: Set this to 1 to enable output of NVENC in video memory buffer created by application. This feature is not supported for HEVC ME only mode. */
    public native @Cast("uint32_t") @NoOffset int enableOutputInVidmem(); public native NV_ENC_INITIALIZE_PARAMS enableOutputInVidmem(int setter);
    /** [in]: Reserved bitfields and must be set to 0 */
    public native @Cast("uint32_t") @NoOffset int reservedBitFields(); public native NV_ENC_INITIALIZE_PARAMS reservedBitFields(int setter);
    /** [in]: Reserved private data buffer size and must be set to 0 */
    public native @Cast("uint32_t") int privDataSize(); public native NV_ENC_INITIALIZE_PARAMS privDataSize(int setter);
    /** [in]: Reserved private data buffer and must be set to NULL */
    public native Pointer privData(); public native NV_ENC_INITIALIZE_PARAMS privData(Pointer setter);
    /** [in]: Specifies the advanced codec specific structure. If client has sent a valid codec config structure, it will override parameters set by the NV_ENC_INITIALIZE_PARAMS::presetGUID parameter. If set to NULL the NvEncodeAPI interface will use the NV_ENC_INITIALIZE_PARAMS::presetGUID to set the codec specific parameters.
                                                                                               Client can also optionally query the NvEncodeAPI interface to get codec specific parameters for a presetGUID using ::NvEncGetEncodePresetConfig() API. It can then modify (if required) some of the codec config parameters and send down a custom config structure as part of ::_NV_ENC_INITIALIZE_PARAMS.
                                                                                               Even in this case client is recommended to pass the same preset guid it has used in ::NvEncGetEncodePresetConfig() API to query the config structure; as NV_ENC_INITIALIZE_PARAMS::presetGUID. This will not override the custom config structure but will be used to determine other Encoder HW specific parameters not exposed in the API. */
    public native NV_ENC_CONFIG encodeConfig(); public native NV_ENC_INITIALIZE_PARAMS encodeConfig(NV_ENC_CONFIG setter);
    /** [in]: Maximum encode width to be used for current Encode session.
                                                                                               Client should allocate output buffers according to this dimension for dynamic resolution change. If set to 0, Encoder will not allow dynamic resolution change. */
    public native @Cast("uint32_t") int maxEncodeWidth(); public native NV_ENC_INITIALIZE_PARAMS maxEncodeWidth(int setter);
    /** [in]: Maximum encode height to be allowed for current Encode session.
                                                                                               Client should allocate output buffers according to this dimension for dynamic resolution change. If set to 0, Encode will not allow dynamic resolution change. */
    public native @Cast("uint32_t") int maxEncodeHeight(); public native NV_ENC_INITIALIZE_PARAMS maxEncodeHeight(int setter);
    /** [in]: If Client wants to pass external motion vectors in NV_ENC_PIC_PARAMS::meExternalHints buffer it must specify the maximum number of hint candidates per block per direction for the encode session.
                                                                                               The NV_ENC_INITIALIZE_PARAMS::maxMEHintCountsPerBlock[0] is for L0 predictors and NV_ENC_INITIALIZE_PARAMS::maxMEHintCountsPerBlock[1] is for L1 predictors.
                                                                                               This client must also set NV_ENC_INITIALIZE_PARAMS::enableExternalMEHints to 1. */
    public native @ByRef NVENC_EXTERNAL_ME_HINT_COUNTS_PER_BLOCKTYPE maxMEHintCountsPerBlock(int i); public native NV_ENC_INITIALIZE_PARAMS maxMEHintCountsPerBlock(int i, NVENC_EXTERNAL_ME_HINT_COUNTS_PER_BLOCKTYPE setter);
    @MemberGetter public native NVENC_EXTERNAL_ME_HINT_COUNTS_PER_BLOCKTYPE maxMEHintCountsPerBlock();
    /** [in]: Tuning Info of NVENC encoding(TuningInfo is not applicable to H264 and HEVC meonly mode). */
    public native @Cast("NV_ENC_TUNING_INFO") int tuningInfo(); public native NV_ENC_INITIALIZE_PARAMS tuningInfo(int setter);
    /** [in]: Specifies input buffer format. Client should set input buffer format only when D3D12 interface type is used. */
    public native @Cast("NV_ENC_BUFFER_FORMAT") int bufferFormat(); public native NV_ENC_INITIALIZE_PARAMS bufferFormat(int setter);
    /** [in]: Reserved and must be set to 0 */
    public native @Cast("uint32_t") int reserved(int i); public native NV_ENC_INITIALIZE_PARAMS reserved(int i, int setter);
    @MemberGetter public native @Cast("uint32_t*") IntPointer reserved();
    /** [in]: Reserved and must be set to NULL */
    public native Pointer reserved2(int i); public native NV_ENC_INITIALIZE_PARAMS reserved2(int i, Pointer setter);
    @MemberGetter public native @Cast("void**") PointerPointer reserved2();
}

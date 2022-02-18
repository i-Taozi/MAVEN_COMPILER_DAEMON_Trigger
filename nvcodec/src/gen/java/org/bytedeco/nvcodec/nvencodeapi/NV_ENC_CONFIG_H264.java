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
 * \struct _NV_ENC_CONFIG_H264
 * H264 encoder configuration parameters
 */
@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NV_ENC_CONFIG_H264 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NV_ENC_CONFIG_H264() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NV_ENC_CONFIG_H264(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NV_ENC_CONFIG_H264(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NV_ENC_CONFIG_H264 position(long position) {
        return (NV_ENC_CONFIG_H264)super.position(position);
    }
    @Override public NV_ENC_CONFIG_H264 getPointer(long i) {
        return new NV_ENC_CONFIG_H264((Pointer)this).offsetAddress(i);
    }

    /** [in]: Set to 1 to enable SVC temporal*/
    public native @Cast("uint32_t") @NoOffset int enableTemporalSVC(); public native NV_ENC_CONFIG_H264 enableTemporalSVC(int setter);
    /** [in]: Set to 1 to enable stereo MVC*/
    public native @Cast("uint32_t") @NoOffset int enableStereoMVC(); public native NV_ENC_CONFIG_H264 enableStereoMVC(int setter);
    /** [in]: Set to 1 to enable hierarchical P Frames */
    public native @Cast("uint32_t") @NoOffset int hierarchicalPFrames(); public native NV_ENC_CONFIG_H264 hierarchicalPFrames(int setter);
    /** [in]: Set to 1 to enable hierarchical B Frames */
    public native @Cast("uint32_t") @NoOffset int hierarchicalBFrames(); public native NV_ENC_CONFIG_H264 hierarchicalBFrames(int setter);
    /** [in]: Set to 1 to write SEI buffering period syntax in the bitstream */
    public native @Cast("uint32_t") @NoOffset int outputBufferingPeriodSEI(); public native NV_ENC_CONFIG_H264 outputBufferingPeriodSEI(int setter);
    /** [in]: Set to 1 to write SEI picture timing syntax in the bitstream.  When set for following rateControlMode : NV_ENC_PARAMS_RC_CBR, NV_ENC_PARAMS_RC_CBR_LOWDELAY_HQ,
                                                                                   NV_ENC_PARAMS_RC_CBR_HQ, filler data is inserted if needed to achieve HRD bitrate */
    public native @Cast("uint32_t") @NoOffset int outputPictureTimingSEI(); public native NV_ENC_CONFIG_H264 outputPictureTimingSEI(int setter); 
    /** [in]: Set to 1 to write access unit delimiter syntax in bitstream */
    public native @Cast("uint32_t") @NoOffset int outputAUD(); public native NV_ENC_CONFIG_H264 outputAUD(int setter);
    /** [in]: Set to 1 to disable writing of Sequence and Picture parameter info in bitstream */
    public native @Cast("uint32_t") @NoOffset int disableSPSPPS(); public native NV_ENC_CONFIG_H264 disableSPSPPS(int setter);
    /** [in]: Set to 1 to enable writing of frame packing arrangement SEI messages to bitstream */
    public native @Cast("uint32_t") @NoOffset int outputFramePackingSEI(); public native NV_ENC_CONFIG_H264 outputFramePackingSEI(int setter);
    /** [in]: Set to 1 to enable writing of recovery point SEI message */
    public native @Cast("uint32_t") @NoOffset int outputRecoveryPointSEI(); public native NV_ENC_CONFIG_H264 outputRecoveryPointSEI(int setter);
    /** [in]: Set to 1 to enable gradual decoder refresh or intra refresh. If the GOP structure uses B frames this will be ignored */
    public native @Cast("uint32_t") @NoOffset int enableIntraRefresh(); public native NV_ENC_CONFIG_H264 enableIntraRefresh(int setter);
    /** [in]: Set this to 1 to enable constrainedFrame encoding where each slice in the constrained picture is independent of other slices.
                                                                                   Constrained encoding works only with rectangular slices.
                                                                                   Check support for constrained encoding using ::NV_ENC_CAPS_SUPPORT_CONSTRAINED_ENCODING caps. */
    public native @Cast("uint32_t") @NoOffset int enableConstrainedEncoding(); public native NV_ENC_CONFIG_H264 enableConstrainedEncoding(int setter);
    /** [in]: Set to 1 to enable writing of Sequence and Picture parameter for every IDR frame */
    public native @Cast("uint32_t") @NoOffset int repeatSPSPPS(); public native NV_ENC_CONFIG_H264 repeatSPSPPS(int setter);
    /** [in]: Setting enableVFR=1 currently only sets the fixed_frame_rate_flag=0 in the VUI but otherwise 
                                                                                   has no impact on the encoder behavior. For more details please refer to E.1 VUI syntax of H.264 standard. Note, however, that NVENC does not support VFR encoding and rate control. */
    public native @Cast("uint32_t") @NoOffset int enableVFR(); public native NV_ENC_CONFIG_H264 enableVFR(int setter);
    /** [in]: Set to 1 to enable LTR (Long Term Reference) frame support. LTR can be used in two modes: "LTR Trust" mode and "LTR Per Picture" mode.
                                                                                   LTR Trust mode: In this mode, ltrNumFrames pictures after IDR are automatically marked as LTR. This mode is enabled by setting ltrTrustMode = 1.
                                                                                                   Use of LTR Trust mode is strongly discouraged as this mode may be deprecated in future.
                                                                                   LTR Per Picture mode: In this mode, client can control whether the current picture should be marked as LTR. Enable this mode by setting
                                                                                                         ltrTrustMode = 0 and ltrMarkFrame = 1 for the picture to be marked as LTR. This is the preferred mode
                                                                                                         for using LTR.
                                                                                   Note that LTRs are not supported if encoding session is configured with B-frames */
    public native @Cast("uint32_t") @NoOffset int enableLTR(); public native NV_ENC_CONFIG_H264 enableLTR(int setter);
    /** [in]: To enable lossless encode set this to 1, set QP to 0 and RC_mode to NV_ENC_PARAMS_RC_CONSTQP and profile to HIGH_444_PREDICTIVE_PROFILE.
                                                                                   Check support for lossless encoding using ::NV_ENC_CAPS_SUPPORT_LOSSLESS_ENCODE caps.  */
    public native @Cast("uint32_t") @NoOffset int qpPrimeYZeroTransformBypassFlag(); public native NV_ENC_CONFIG_H264 qpPrimeYZeroTransformBypassFlag(int setter);
    /** [in]: Set 1 to enable constrained intra prediction. */
    public native @Cast("uint32_t") @NoOffset int useConstrainedIntraPred(); public native NV_ENC_CONFIG_H264 useConstrainedIntraPred(int setter);
    /** [in]: Set to 1 to enable insertion of filler data in the bitstream.
                                                                                   This flag will take effect only when one of the CBR rate
                                                                                   control modes (NV_ENC_PARAMS_RC_CBR, NV_ENC_PARAMS_RC_CBR_HQ,
                                                                                   NV_ENC_PARAMS_RC_CBR_LOWDELAY_HQ) is in use and both
                                                                                   NV_ENC_INITIALIZE_PARAMS::frameRateNum and
                                                                                   NV_ENC_INITIALIZE_PARAMS::frameRateDen are set to non-zero
                                                                                   values. Setting this field when
                                                                                   NV_ENC_INITIALIZE_PARAMS::enableOutputInVidmem is also set
                                                                                   is currently not supported and will make ::NvEncInitializeEncoder()
                                                                                   return an error. */
    public native @Cast("uint32_t") @NoOffset int enableFillerDataInsertion(); public native NV_ENC_CONFIG_H264 enableFillerDataInsertion(int setter);
    /** [in]: Set to 1 to disable writing of SVC Prefix NALU preceding each slice in bitstream.
                                                                                   Applicable only when temporal SVC is enabled (NV_ENC_CONFIG_H264::enableTemporalSVC = 1). */
    public native @Cast("uint32_t") @NoOffset int disableSVCPrefixNalu(); public native NV_ENC_CONFIG_H264 disableSVCPrefixNalu(int setter);
    /** [in]: Set to 1 to enable writing of Scalability Information SEI message preceding each IDR picture in bitstream 
                                                                                   Applicable only when temporal SVC is enabled (NV_ENC_CONFIG_H264::enableTemporalSVC = 1). */
    public native @Cast("uint32_t") @NoOffset int enableScalabilityInfoSEI(); public native NV_ENC_CONFIG_H264 enableScalabilityInfoSEI(int setter);
    /** [in]: Set to 1 to maintain single slice in frames during intra refresh.
                                                                                   Check support for single slice intra refresh using ::NV_ENC_CAPS_SINGLE_SLICE_INTRA_REFRESH caps.
                                                                                   This flag will be ignored if the value returned for ::NV_ENC_CAPS_SINGLE_SLICE_INTRA_REFRESH caps is false. */
    public native @Cast("uint32_t") @NoOffset int singleSliceIntraRefresh(); public native NV_ENC_CONFIG_H264 singleSliceIntraRefresh(int setter);
    /** [in]: Reserved bitfields and must be set to 0 */
    public native @Cast("uint32_t") @NoOffset int reservedBitFields(); public native NV_ENC_CONFIG_H264 reservedBitFields(int setter);
    /** [in]: Specifies the encoding level. Client is recommended to set this to NV_ENC_LEVEL_AUTOSELECT in order to enable the NvEncodeAPI interface to select the correct level. */
    public native @Cast("uint32_t") int level(); public native NV_ENC_CONFIG_H264 level(int setter);
    /** [in]: Specifies the IDR interval. If not set, this is made equal to gopLength in NV_ENC_CONFIG.Low latency application client can set IDR interval to NVENC_INFINITE_GOPLENGTH so that IDR frames are not inserted automatically. */
    public native @Cast("uint32_t") int idrPeriod(); public native NV_ENC_CONFIG_H264 idrPeriod(int setter);
    /** [in]: Set to 1 to enable 4:4:4 separate colour planes */
    public native @Cast("uint32_t") int separateColourPlaneFlag(); public native NV_ENC_CONFIG_H264 separateColourPlaneFlag(int setter);
    /** [in]: Specifies the deblocking filter mode. Permissible value range: [0,2]. This flag corresponds 
                                                                                   to the flag disable_deblocking_filter_idc specified in section 7.4.3 of H.264 specification, 
                                                                                   which specifies whether the operation of the deblocking filter shall be disabled across some 
                                                                                   block edges of the slice and specifies for which edges the filtering is disabled. See section
                                                                                   7.4.3 of H.264 specification for more details.*/
    public native @Cast("uint32_t") int disableDeblockingFilterIDC(); public native NV_ENC_CONFIG_H264 disableDeblockingFilterIDC(int setter);
    /** [in]: Specifies number of temporal layers to be used for hierarchical coding / temporal SVC. Valid value range is [1,::NV_ENC_CAPS_NUM_MAX_TEMPORAL_LAYERS] */
    public native @Cast("uint32_t") int numTemporalLayers(); public native NV_ENC_CONFIG_H264 numTemporalLayers(int setter);
    /** [in]: Specifies the SPS id of the sequence header */
    public native @Cast("uint32_t") int spsId(); public native NV_ENC_CONFIG_H264 spsId(int setter);
    /** [in]: Specifies the PPS id of the picture header */
    public native @Cast("uint32_t") int ppsId(); public native NV_ENC_CONFIG_H264 ppsId(int setter);
    /** [in]: Specifies the AdaptiveTransform Mode. Check support for AdaptiveTransform mode using ::NV_ENC_CAPS_SUPPORT_ADAPTIVE_TRANSFORM caps. */
    public native @Cast("NV_ENC_H264_ADAPTIVE_TRANSFORM_MODE") int adaptiveTransformMode(); public native NV_ENC_CONFIG_H264 adaptiveTransformMode(int setter);
    /** [in]: Specified the FMO Mode. Check support for FMO using ::NV_ENC_CAPS_SUPPORT_FMO caps. */
    public native @Cast("NV_ENC_H264_FMO_MODE") int fmoMode(); public native NV_ENC_CONFIG_H264 fmoMode(int setter);
    /** [in]: Specifies the BDirect mode. Check support for BDirect mode using ::NV_ENC_CAPS_SUPPORT_BDIRECT_MODE caps.*/
    public native @Cast("NV_ENC_H264_BDIRECT_MODE") int bdirectMode(); public native NV_ENC_CONFIG_H264 bdirectMode(int setter);
    /** [in]: Specifies the entropy coding mode. Check support for CABAC mode using ::NV_ENC_CAPS_SUPPORT_CABAC caps. */
    public native @Cast("NV_ENC_H264_ENTROPY_CODING_MODE") int entropyCodingMode(); public native NV_ENC_CONFIG_H264 entropyCodingMode(int setter);
    /** [in]: Specifies the stereo frame packing mode which is to be signaled in frame packing arrangement SEI */
    public native @Cast("NV_ENC_STEREO_PACKING_MODE") int stereoMode(); public native NV_ENC_CONFIG_H264 stereoMode(int setter);
    /** [in]: Specifies the interval between successive intra refresh if enableIntrarefresh is set. Requires enableIntraRefresh to be set.
                                                                                   Will be disabled if NV_ENC_CONFIG::gopLength is not set to NVENC_INFINITE_GOPLENGTH. */
    public native @Cast("uint32_t") int intraRefreshPeriod(); public native NV_ENC_CONFIG_H264 intraRefreshPeriod(int setter);
    /** [in]: Specifies the length of intra refresh in number of frames for periodic intra refresh. This value should be smaller than intraRefreshPeriod */
    public native @Cast("uint32_t") int intraRefreshCnt(); public native NV_ENC_CONFIG_H264 intraRefreshCnt(int setter);
    /** [in]: Specifies the DPB size used for encoding. Setting it to 0 will let driver use the default DPB size. 
                                                                                   The low latency application which wants to invalidate reference frame as an error resilience tool
                                                                                   is recommended to use a large DPB size so that the encoder can keep old reference frames which can be used if recent
                                                                                   frames are invalidated. */
    public native @Cast("uint32_t") int maxNumRefFrames(); public native NV_ENC_CONFIG_H264 maxNumRefFrames(int setter);
    /** [in]: This parameter in conjunction with sliceModeData specifies the way in which the picture is divided into slices
                                                                                   sliceMode = 0 MB based slices, sliceMode = 1 Byte based slices, sliceMode = 2 MB row based slices, sliceMode = 3 numSlices in Picture.
                                                                                   When forceIntraRefreshWithFrameCnt is set it will have priority over sliceMode setting
                                                                                   When sliceMode == 0 and sliceModeData == 0 whole picture will be coded with one slice */
    public native @Cast("uint32_t") int sliceMode(); public native NV_ENC_CONFIG_H264 sliceMode(int setter);
    /** [in]: Specifies the parameter needed for sliceMode. For:
                                                                                   sliceMode = 0, sliceModeData specifies # of MBs in each slice (except last slice)
                                                                                   sliceMode = 1, sliceModeData specifies maximum # of bytes in each slice (except last slice)
                                                                                   sliceMode = 2, sliceModeData specifies # of MB rows in each slice (except last slice)
                                                                                   sliceMode = 3, sliceModeData specifies number of slices in the picture. Driver will divide picture into slices optimally */
    public native @Cast("uint32_t") int sliceModeData(); public native NV_ENC_CONFIG_H264 sliceModeData(int setter);
    /** [in]: Specifies the H264 video usability info parameters */
    public native @ByRef NV_ENC_CONFIG_H264_VUI_PARAMETERS h264VUIParameters(); public native NV_ENC_CONFIG_H264 h264VUIParameters(NV_ENC_CONFIG_H264_VUI_PARAMETERS setter);
    /** [in]: Specifies the number of LTR frames. This parameter has different meaning in two LTR modes.
                                                                                   In "LTR Trust" mode (ltrTrustMode = 1), encoder will mark the first ltrNumFrames base layer reference frames within each IDR interval as LTR.
                                                                                   In "LTR Per Picture" mode (ltrTrustMode = 0 and ltrMarkFrame = 1), ltrNumFrames specifies maximum number of LTR frames in DPB. */
    public native @Cast("uint32_t") int ltrNumFrames(); public native NV_ENC_CONFIG_H264 ltrNumFrames(int setter);
    /** [in]: Specifies the LTR operating mode. See comments near NV_ENC_CONFIG_H264::enableLTR for description of the two modes.
                                                                                   Set to 1 to use "LTR Trust" mode of LTR operation. Clients are discouraged to use "LTR Trust" mode as this mode may 
                                                                                   be deprecated in future releases.
                                                                                   Set to 0 when using "LTR Per Picture" mode of LTR operation. */
    public native @Cast("uint32_t") int ltrTrustMode(); public native NV_ENC_CONFIG_H264 ltrTrustMode(int setter);
    /** [in]: Specifies the chroma format. Should be set to 1 for yuv420 input, 3 for yuv444 input.
                                                                                   Check support for YUV444 encoding using ::NV_ENC_CAPS_SUPPORT_YUV444_ENCODE caps.*/
    public native @Cast("uint32_t") int chromaFormatIDC(); public native NV_ENC_CONFIG_H264 chromaFormatIDC(int setter);
    /** [in]: Specifies the maximum temporal layer used for temporal SVC / hierarchical coding.
                                                                                   Defaut value of this field is NV_ENC_CAPS::NV_ENC_CAPS_NUM_MAX_TEMPORAL_LAYERS. Note that the value NV_ENC_CONFIG_H264::maxNumRefFrames should
                                                                                   be greater than or equal to (NV_ENC_CONFIG_H264::maxTemporalLayers - 2) * 2, for NV_ENC_CONFIG_H264::maxTemporalLayers >= 2.*/
    public native @Cast("uint32_t") int maxTemporalLayers(); public native NV_ENC_CONFIG_H264 maxTemporalLayers(int setter);
    /** [in]: Specifies the B-Frame as reference mode. Check support for useBFramesAsRef mode using ::NV_ENC_CAPS_SUPPORT_BFRAME_REF_MODE caps.*/
    public native @Cast("NV_ENC_BFRAME_REF_MODE") int useBFramesAsRef(); public native NV_ENC_CONFIG_H264 useBFramesAsRef(int setter);
    /** [in]: Specifies max number of reference frames in reference picture list L0, that can be used by hardware for prediction of a frame. 
                                                                                   Check support for numRefL0 using ::NV_ENC_CAPS_SUPPORT_MULTIPLE_REF_FRAMES caps. */
    public native @Cast("NV_ENC_NUM_REF_FRAMES") int numRefL0(); public native NV_ENC_CONFIG_H264 numRefL0(int setter);
    /** [in]: Specifies max number of reference frames in reference picture list L1, that can be used by hardware for prediction of a frame. 
                                                                                   Check support for numRefL1 using ::NV_ENC_CAPS_SUPPORT_MULTIPLE_REF_FRAMES caps. */
    public native @Cast("NV_ENC_NUM_REF_FRAMES") int numRefL1(); public native NV_ENC_CONFIG_H264 numRefL1(int setter);
    /** [in]: Reserved and must be set to 0 */
    public native @Cast("uint32_t") int reserved1(int i); public native NV_ENC_CONFIG_H264 reserved1(int i, int setter);
    @MemberGetter public native @Cast("uint32_t*") IntPointer reserved1();
    /** [in]: Reserved and must be set to NULL */
    public native Pointer reserved2(int i); public native NV_ENC_CONFIG_H264 reserved2(int i, Pointer setter);
    @MemberGetter public native @Cast("void**") PointerPointer reserved2();
}

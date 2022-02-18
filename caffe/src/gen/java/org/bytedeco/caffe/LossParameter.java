// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

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
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;

import static org.bytedeco.caffe.global.caffe.*;

// -------------------------------------------------------------------

@Namespace("caffe") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class LossParameter extends Message {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LossParameter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LossParameter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public LossParameter position(long position) {
        return (LossParameter)super.position(position);
    }
    @Override public LossParameter getPointer(long i) {
        return new LossParameter((Pointer)this).offsetAddress(i);
    }

  public LossParameter() { super((Pointer)null); allocate(); }
  private native void allocate();

  public LossParameter(@Const @ByRef LossParameter from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef LossParameter from);

  public native @ByRef @Name("operator =") LossParameter put(@Const @ByRef LossParameter from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Const Descriptor descriptor();
  public static native @Const @ByRef LossParameter default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const LossParameter internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(LossParameter other);
  

  // implements Message ----------------------------------------------

  public native final LossParameter New();

  public native final LossParameter New(Arena arena);
  public native final void CopyFrom(@Const @ByRef Message from);
  public native final void MergeFrom(@Const @ByRef Message from);
  public native void CopyFrom(@Const @ByRef LossParameter from);
  public native void MergeFrom(@Const @ByRef LossParameter from);
  public native final void Clear();
  public native @Cast("bool") final boolean IsInitialized();

  public native @Cast("size_t") final long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") final boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native final void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") final BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") final ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") final byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native final int GetCachedSize();

  public native @ByVal final Metadata GetMetadata();

  // nested types ----------------------------------------------------
  @MemberGetter public static native @Cast("const caffe::LossParameter::NormalizationMode") int FULL();
  public static final int FULL = FULL();
  @MemberGetter public static native @Cast("const caffe::LossParameter::NormalizationMode") int VALID();
  public static final int VALID = VALID();
  @MemberGetter public static native @Cast("const caffe::LossParameter::NormalizationMode") int BATCH_SIZE();
  public static final int BATCH_SIZE = BATCH_SIZE();
  @MemberGetter public static native @Cast("const caffe::LossParameter::NormalizationMode") int NONE();
  public static final int NONE = NONE();
  public static native @Cast("bool") boolean NormalizationMode_IsValid(int value);
  @MemberGetter public static native @Cast("const caffe::LossParameter::NormalizationMode") int NormalizationMode_MIN();
  public static final int NormalizationMode_MIN = NormalizationMode_MIN();
  @MemberGetter public static native @Cast("const caffe::LossParameter::NormalizationMode") int NormalizationMode_MAX();
  public static final int NormalizationMode_MAX = NormalizationMode_MAX();
  @MemberGetter public static native int NormalizationMode_ARRAYSIZE();
  public static final int NormalizationMode_ARRAYSIZE = NormalizationMode_ARRAYSIZE();
  public static native @Const EnumDescriptor NormalizationMode_descriptor();
  public static native @StdString BytePointer NormalizationMode_Name(@Cast("caffe::LossParameter::NormalizationMode") int value);
  public static native @Cast("bool") boolean NormalizationMode_Parse(@StdString BytePointer name,
        @Cast("caffe::LossParameter::NormalizationMode*") IntPointer value);
  public static native @Cast("bool") boolean NormalizationMode_Parse(@StdString String name,
        @Cast("caffe::LossParameter::NormalizationMode*") IntBuffer value);
  public static native @Cast("bool") boolean NormalizationMode_Parse(@StdString BytePointer name,
        @Cast("caffe::LossParameter::NormalizationMode*") int[] value);
  public static native @Cast("bool") boolean NormalizationMode_Parse(@StdString String name,
        @Cast("caffe::LossParameter::NormalizationMode*") IntPointer value);
  public static native @Cast("bool") boolean NormalizationMode_Parse(@StdString BytePointer name,
        @Cast("caffe::LossParameter::NormalizationMode*") IntBuffer value);
  public static native @Cast("bool") boolean NormalizationMode_Parse(@StdString String name,
        @Cast("caffe::LossParameter::NormalizationMode*") int[] value);

  // accessors -------------------------------------------------------

  // optional int32 ignore_label = 1;
  public native @Cast("bool") boolean has_ignore_label();
  public native void clear_ignore_label();
  @MemberGetter public static native int kIgnoreLabelFieldNumber();
  public static final int kIgnoreLabelFieldNumber = kIgnoreLabelFieldNumber();
  public native @Cast("google::protobuf::int32") int ignore_label();
  public native void set_ignore_label(@Cast("google::protobuf::int32") int value);

  // optional bool normalize = 2;
  public native @Cast("bool") boolean has_normalize();
  public native void clear_normalize();
  @MemberGetter public static native int kNormalizeFieldNumber();
  public static final int kNormalizeFieldNumber = kNormalizeFieldNumber();
  public native @Cast("bool") boolean normalize();
  public native void set_normalize(@Cast("bool") boolean value);

  // optional .caffe.LossParameter.NormalizationMode normalization = 3 [default = VALID];
  public native @Cast("bool") boolean has_normalization();
  public native void clear_normalization();
  @MemberGetter public static native int kNormalizationFieldNumber();
  public static final int kNormalizationFieldNumber = kNormalizationFieldNumber();
  public native @Cast("caffe::LossParameter_NormalizationMode") int normalization();
  public native void set_normalization(@Cast("caffe::LossParameter_NormalizationMode") int value);
}

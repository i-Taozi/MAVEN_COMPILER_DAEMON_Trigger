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
public class SolverState extends Message {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SolverState(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SolverState(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SolverState position(long position) {
        return (SolverState)super.position(position);
    }
    @Override public SolverState getPointer(long i) {
        return new SolverState((Pointer)this).offsetAddress(i);
    }

  public SolverState() { super((Pointer)null); allocate(); }
  private native void allocate();

  public SolverState(@Const @ByRef SolverState from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef SolverState from);

  public native @ByRef @Name("operator =") SolverState put(@Const @ByRef SolverState from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Const Descriptor descriptor();
  public static native @Const @ByRef SolverState default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const SolverState internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(SolverState other);
  

  // implements Message ----------------------------------------------

  public native final SolverState New();

  public native final SolverState New(Arena arena);
  public native final void CopyFrom(@Const @ByRef Message from);
  public native final void MergeFrom(@Const @ByRef Message from);
  public native void CopyFrom(@Const @ByRef SolverState from);
  public native void MergeFrom(@Const @ByRef SolverState from);
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

  // accessors -------------------------------------------------------

  // repeated .caffe.BlobProto history = 3;
  public native int history_size();
  public native void clear_history();
  @MemberGetter public static native int kHistoryFieldNumber();
  public static final int kHistoryFieldNumber = kHistoryFieldNumber();
  public native BlobProto mutable_history(int index);
  public native @Const @ByRef BlobProto history(int index);
  public native BlobProto add_history();

  // optional string learned_net = 2;
  public native @Cast("bool") boolean has_learned_net();
  public native void clear_learned_net();
  @MemberGetter public static native int kLearnedNetFieldNumber();
  public static final int kLearnedNetFieldNumber = kLearnedNetFieldNumber();
  public native @StdString BytePointer learned_net();
  public native void set_learned_net(@StdString BytePointer value);
  public native void set_learned_net(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_learned_net(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_learned_net(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_learned_net();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_learned_net();
  public native void set_allocated_learned_net(@StdString @Cast({"char*", "std::string*"}) BytePointer learned_net);

  // optional int32 iter = 1;
  public native @Cast("bool") boolean has_iter();
  public native void clear_iter();
  @MemberGetter public static native int kIterFieldNumber();
  public static final int kIterFieldNumber = kIterFieldNumber();
  public native @Cast("google::protobuf::int32") int iter();
  public native void set_iter(@Cast("google::protobuf::int32") int value);

  // optional int32 current_step = 4 [default = 0];
  public native @Cast("bool") boolean has_current_step();
  public native void clear_current_step();
  @MemberGetter public static native int kCurrentStepFieldNumber();
  public static final int kCurrentStepFieldNumber = kCurrentStepFieldNumber();
  public native @Cast("google::protobuf::int32") int current_step();
  public native void set_current_step(@Cast("google::protobuf::int32") int value);
}

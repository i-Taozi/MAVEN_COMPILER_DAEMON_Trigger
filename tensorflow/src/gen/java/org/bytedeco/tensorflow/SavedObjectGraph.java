// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SavedObjectGraph extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SavedObjectGraph(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SavedObjectGraph(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SavedObjectGraph position(long position) {
        return (SavedObjectGraph)super.position(position);
    }
    @Override public SavedObjectGraph getPointer(long i) {
        return new SavedObjectGraph((Pointer)this).offsetAddress(i);
    }

  public SavedObjectGraph() { super((Pointer)null); allocate(); }
  private native void allocate();

  public SavedObjectGraph(@Const @ByRef SavedObjectGraph from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef SavedObjectGraph from);

  public native @ByRef @Name("operator =") SavedObjectGraph put(@Const @ByRef SavedObjectGraph from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef SavedObjectGraph default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const SavedObjectGraph internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(SavedObjectGraph other);
  public native void Swap(SavedObjectGraph other);
  

  // implements Message ----------------------------------------------

  public native SavedObjectGraph New();

  public native SavedObjectGraph New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef SavedObjectGraph from);
  public native void MergeFrom(@Const @ByRef SavedObjectGraph from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------


  // accessors -------------------------------------------------------

  // repeated .tensorflow.SavedObject nodes = 1;
  public native int nodes_size();
  public native void clear_nodes();
  @MemberGetter public static native int kNodesFieldNumber();
  public static final int kNodesFieldNumber = kNodesFieldNumber();
  public native SavedObject mutable_nodes(int index);
  public native @Const @ByRef SavedObject nodes(int index);
  public native SavedObject add_nodes();

  // map<string, .tensorflow.SavedConcreteFunction> concrete_functions = 2;
  public native int concrete_functions_size();
  public native void clear_concrete_functions();
  @MemberGetter public static native int kConcreteFunctionsFieldNumber();
  public static final int kConcreteFunctionsFieldNumber = kConcreteFunctionsFieldNumber();
  public native @Const @ByRef StringSavedConcreteFunctionMap concrete_functions();
  public native StringSavedConcreteFunctionMap mutable_concrete_functions();
}

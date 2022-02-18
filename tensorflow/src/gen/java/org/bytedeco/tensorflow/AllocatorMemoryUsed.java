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
public class AllocatorMemoryUsed extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AllocatorMemoryUsed(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AllocatorMemoryUsed(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public AllocatorMemoryUsed position(long position) {
        return (AllocatorMemoryUsed)super.position(position);
    }
    @Override public AllocatorMemoryUsed getPointer(long i) {
        return new AllocatorMemoryUsed((Pointer)this).offsetAddress(i);
    }

  public AllocatorMemoryUsed() { super((Pointer)null); allocate(); }
  private native void allocate();

  public AllocatorMemoryUsed(@Const @ByRef AllocatorMemoryUsed from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef AllocatorMemoryUsed from);

  public native @ByRef @Name("operator =") AllocatorMemoryUsed put(@Const @ByRef AllocatorMemoryUsed from);

  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer GetDescriptor();
  public static native @Cast("const google::protobuf::Reflection*") Pointer GetReflection();
  public static native @Const @ByRef AllocatorMemoryUsed default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const AllocatorMemoryUsed internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(AllocatorMemoryUsed other);
  public native void Swap(AllocatorMemoryUsed other);
  

  // implements Message ----------------------------------------------

  public native AllocatorMemoryUsed New();

  public native AllocatorMemoryUsed New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef AllocatorMemoryUsed from);
  public native void MergeFrom(@Const @ByRef AllocatorMemoryUsed from);
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

  // repeated .tensorflow.AllocationRecord allocation_records = 6;
  public native int allocation_records_size();
  public native void clear_allocation_records();
  @MemberGetter public static native int kAllocationRecordsFieldNumber();
  public static final int kAllocationRecordsFieldNumber = kAllocationRecordsFieldNumber();
  public native AllocationRecord mutable_allocation_records(int index);
  public native @Const @ByRef AllocationRecord allocation_records(int index);
  public native AllocationRecord add_allocation_records();

  // string allocator_name = 1;
  public native void clear_allocator_name();
  @MemberGetter public static native int kAllocatorNameFieldNumber();
  public static final int kAllocatorNameFieldNumber = kAllocatorNameFieldNumber();
  public native @StdString BytePointer allocator_name();
  public native void set_allocator_name(@StdString BytePointer value);
  public native void set_allocator_name(@StdString String value);
  public native void set_allocator_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_allocator_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_allocator_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_allocator_name();
  public native void set_allocated_allocator_name(@StdString @Cast({"char*", "std::string*"}) BytePointer allocator_name);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_allocator_name();
  public native void unsafe_arena_set_allocated_allocator_name(
        @StdString @Cast({"char*", "std::string*"}) BytePointer allocator_name);

  // int64 total_bytes = 2;
  public native void clear_total_bytes();
  @MemberGetter public static native int kTotalBytesFieldNumber();
  public static final int kTotalBytesFieldNumber = kTotalBytesFieldNumber();
  public native @Cast("google::protobuf::int64") long total_bytes();
  public native void set_total_bytes(@Cast("google::protobuf::int64") long value);

  // int64 peak_bytes = 3;
  public native void clear_peak_bytes();
  @MemberGetter public static native int kPeakBytesFieldNumber();
  public static final int kPeakBytesFieldNumber = kPeakBytesFieldNumber();
  public native @Cast("google::protobuf::int64") long peak_bytes();
  public native void set_peak_bytes(@Cast("google::protobuf::int64") long value);

  // int64 live_bytes = 4;
  public native void clear_live_bytes();
  @MemberGetter public static native int kLiveBytesFieldNumber();
  public static final int kLiveBytesFieldNumber = kLiveBytesFieldNumber();
  public native @Cast("google::protobuf::int64") long live_bytes();
  public native void set_live_bytes(@Cast("google::protobuf::int64") long value);

  // int64 allocator_bytes_in_use = 5;
  public native void clear_allocator_bytes_in_use();
  @MemberGetter public static native int kAllocatorBytesInUseFieldNumber();
  public static final int kAllocatorBytesInUseFieldNumber = kAllocatorBytesInUseFieldNumber();
  public native @Cast("google::protobuf::int64") long allocator_bytes_in_use();
  public native void set_allocator_bytes_in_use(@Cast("google::protobuf::int64") long value);
}

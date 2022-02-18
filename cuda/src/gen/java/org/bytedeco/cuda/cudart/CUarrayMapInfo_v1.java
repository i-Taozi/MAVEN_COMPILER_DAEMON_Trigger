// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Specifies the CUDA array or CUDA mipmapped array memory mapping information
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUarrayMapInfo_v1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUarrayMapInfo_v1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUarrayMapInfo_v1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUarrayMapInfo_v1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUarrayMapInfo_v1 position(long position) {
        return (CUarrayMapInfo_v1)super.position(position);
    }
    @Override public CUarrayMapInfo_v1 getPointer(long i) {
        return new CUarrayMapInfo_v1((Pointer)this).offsetAddress(i);
    }
    
    /** Resource type */
    public native @Cast("CUresourcetype") int resourceType(); public native CUarrayMapInfo_v1 resourceType(int setter);

        @Name("resource.mipmap") public native CUmipmappedArray_st resource_mipmap(); public native CUarrayMapInfo_v1 resource_mipmap(CUmipmappedArray_st setter);
        @Name("resource.array") public native CUarray_st resource_array(); public native CUarrayMapInfo_v1 resource_array(CUarray_st setter);

    /** Sparse subresource type */
    public native @Cast("CUarraySparseSubresourceType") int subresourceType(); public native CUarrayMapInfo_v1 subresourceType(int setter);

            /** For CUDA mipmapped arrays must a valid mipmap level. For CUDA arrays must be zero */
            @Name("subresource.sparseLevel.level") public native @Cast("unsigned int") int subresource_sparseLevel_level(); public native CUarrayMapInfo_v1 subresource_sparseLevel_level(int setter);            
            /** For CUDA layered arrays must be a valid layer index. Otherwise, must be zero */
            @Name("subresource.sparseLevel.layer") public native @Cast("unsigned int") int subresource_sparseLevel_layer(); public native CUarrayMapInfo_v1 subresource_sparseLevel_layer(int setter);
            /** Starting X offset in elements */
            @Name("subresource.sparseLevel.offsetX") public native @Cast("unsigned int") int subresource_sparseLevel_offsetX(); public native CUarrayMapInfo_v1 subresource_sparseLevel_offsetX(int setter);
            /** Starting Y offset in elements */
            @Name("subresource.sparseLevel.offsetY") public native @Cast("unsigned int") int subresource_sparseLevel_offsetY(); public native CUarrayMapInfo_v1 subresource_sparseLevel_offsetY(int setter);
            /** Starting Z offset in elements */
            @Name("subresource.sparseLevel.offsetZ") public native @Cast("unsigned int") int subresource_sparseLevel_offsetZ(); public native CUarrayMapInfo_v1 subresource_sparseLevel_offsetZ(int setter);            
            /** Width in elements */
            @Name("subresource.sparseLevel.extentWidth") public native @Cast("unsigned int") int subresource_sparseLevel_extentWidth(); public native CUarrayMapInfo_v1 subresource_sparseLevel_extentWidth(int setter);
            /** Height in elements */
            @Name("subresource.sparseLevel.extentHeight") public native @Cast("unsigned int") int subresource_sparseLevel_extentHeight(); public native CUarrayMapInfo_v1 subresource_sparseLevel_extentHeight(int setter);
            /** Depth in elements */
            @Name("subresource.sparseLevel.extentDepth") public native @Cast("unsigned int") int subresource_sparseLevel_extentDepth(); public native CUarrayMapInfo_v1 subresource_sparseLevel_extentDepth(int setter);
            /** For CUDA layered arrays must be a valid layer index. Otherwise, must be zero */
            @Name("subresource.miptail.layer") public native @Cast("unsigned int") int subresource_miptail_layer(); public native CUarrayMapInfo_v1 subresource_miptail_layer(int setter);
            /** Offset within mip tail */
            @Name("subresource.miptail.offset") public native @Cast("unsigned long long") long subresource_miptail_offset(); public native CUarrayMapInfo_v1 subresource_miptail_offset(long setter);
            /** Extent in bytes */
            @Name("subresource.miptail.size") public native @Cast("unsigned long long") long subresource_miptail_size(); public native CUarrayMapInfo_v1 subresource_miptail_size(long setter);
    
    /** Memory operation type */
    public native @Cast("CUmemOperationType") int memOperationType(); public native CUarrayMapInfo_v1 memOperationType(int setter);
    /** Memory handle type */
    public native @Cast("CUmemHandleType") int memHandleType(); public native CUarrayMapInfo_v1 memHandleType(int setter);

        @Name("memHandle.memHandle") public native @Cast("CUmemGenericAllocationHandle") long memHandle_memHandle(); public native CUarrayMapInfo_v1 memHandle_memHandle(long setter);
    
    /** Offset within the memory */
    public native @Cast("unsigned long long") long offset(); public native CUarrayMapInfo_v1 offset(long setter);
    /** Device ordinal bit mask */
    public native @Cast("unsigned int") int deviceBitMask(); public native CUarrayMapInfo_v1 deviceBitMask(int setter);
    /** flags for future use, must be zero now. */
    public native @Cast("unsigned int") int flags(); public native CUarrayMapInfo_v1 flags(int setter);
    /** Reserved for future use, must be zero now. */
    public native @Cast("unsigned int") int reserved(int i); public native CUarrayMapInfo_v1 reserved(int i, int setter);
    @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();
}

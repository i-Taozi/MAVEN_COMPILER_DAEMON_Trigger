// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * CUDA device properties
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaDeviceProp extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaDeviceProp() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaDeviceProp(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaDeviceProp(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaDeviceProp position(long position) {
        return (cudaDeviceProp)super.position(position);
    }
    @Override public cudaDeviceProp getPointer(long i) {
        return new cudaDeviceProp((Pointer)this).offsetAddress(i);
    }

    /** ASCII string identifying device */
    public native @Cast("char") byte name(int i); public native cudaDeviceProp name(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer name();
    /** 16-byte unique identifier */
    public native @ByRef cudaUUID_t uuid(); public native cudaDeviceProp uuid(cudaUUID_t setter);
    /** 8-byte locally unique identifier. Value is undefined on TCC and non-Windows platforms */
    public native @Cast("char") byte luid(int i); public native cudaDeviceProp luid(int i, byte setter);
    @MemberGetter public native @Cast("char*") BytePointer luid();
    /** LUID device node mask. Value is undefined on TCC and non-Windows platforms */
    public native @Cast("unsigned int") int luidDeviceNodeMask(); public native cudaDeviceProp luidDeviceNodeMask(int setter);
    /** Global memory available on device in bytes */
    public native @Cast("size_t") long totalGlobalMem(); public native cudaDeviceProp totalGlobalMem(long setter);
    /** Shared memory available per block in bytes */
    public native @Cast("size_t") long sharedMemPerBlock(); public native cudaDeviceProp sharedMemPerBlock(long setter);
    /** 32-bit registers available per block */
    public native int regsPerBlock(); public native cudaDeviceProp regsPerBlock(int setter);
    /** Warp size in threads */
    public native int warpSize(); public native cudaDeviceProp warpSize(int setter);
    /** Maximum pitch in bytes allowed by memory copies */
    public native @Cast("size_t") long memPitch(); public native cudaDeviceProp memPitch(long setter);
    /** Maximum number of threads per block */
    public native int maxThreadsPerBlock(); public native cudaDeviceProp maxThreadsPerBlock(int setter);
    /** Maximum size of each dimension of a block */
    public native int maxThreadsDim(int i); public native cudaDeviceProp maxThreadsDim(int i, int setter);
    @MemberGetter public native IntPointer maxThreadsDim();
    /** Maximum size of each dimension of a grid */
    public native int maxGridSize(int i); public native cudaDeviceProp maxGridSize(int i, int setter);
    @MemberGetter public native IntPointer maxGridSize();
    /** Clock frequency in kilohertz */
    public native int clockRate(); public native cudaDeviceProp clockRate(int setter);
    /** Constant memory available on device in bytes */
    public native @Cast("size_t") long totalConstMem(); public native cudaDeviceProp totalConstMem(long setter);
    /** Major compute capability */
    public native int major(); public native cudaDeviceProp major(int setter);
    /** Minor compute capability */
    public native int minor(); public native cudaDeviceProp minor(int setter);
    /** Alignment requirement for textures */
    public native @Cast("size_t") long textureAlignment(); public native cudaDeviceProp textureAlignment(long setter);
    /** Pitch alignment requirement for texture references bound to pitched memory */
    public native @Cast("size_t") long texturePitchAlignment(); public native cudaDeviceProp texturePitchAlignment(long setter);
    /** Device can concurrently copy memory and execute a kernel. Deprecated. Use instead asyncEngineCount. */
    public native int deviceOverlap(); public native cudaDeviceProp deviceOverlap(int setter);
    /** Number of multiprocessors on device */
    public native int multiProcessorCount(); public native cudaDeviceProp multiProcessorCount(int setter);
    /** Specified whether there is a run time limit on kernels */
    public native int kernelExecTimeoutEnabled(); public native cudaDeviceProp kernelExecTimeoutEnabled(int setter);
    /** Device is integrated as opposed to discrete */
    public native int integrated(); public native cudaDeviceProp integrated(int setter);
    /** Device can map host memory with cudaHostAlloc/cudaHostGetDevicePointer */
    public native int canMapHostMemory(); public native cudaDeviceProp canMapHostMemory(int setter);
    /** Compute mode (See ::cudaComputeMode) */
    public native int computeMode(); public native cudaDeviceProp computeMode(int setter);
    /** Maximum 1D texture size */
    public native int maxTexture1D(); public native cudaDeviceProp maxTexture1D(int setter);
    /** Maximum 1D mipmapped texture size */
    public native int maxTexture1DMipmap(); public native cudaDeviceProp maxTexture1DMipmap(int setter);
    /** Deprecated, do not use. Use cudaDeviceGetTexture1DLinearMaxWidth() or cuDeviceGetTexture1DLinearMaxWidth() instead. */
    public native int maxTexture1DLinear(); public native cudaDeviceProp maxTexture1DLinear(int setter);
    /** Maximum 2D texture dimensions */
    public native int maxTexture2D(int i); public native cudaDeviceProp maxTexture2D(int i, int setter);
    @MemberGetter public native IntPointer maxTexture2D();
    /** Maximum 2D mipmapped texture dimensions */
    public native int maxTexture2DMipmap(int i); public native cudaDeviceProp maxTexture2DMipmap(int i, int setter);
    @MemberGetter public native IntPointer maxTexture2DMipmap();
    /** Maximum dimensions (width, height, pitch) for 2D textures bound to pitched memory */
    public native int maxTexture2DLinear(int i); public native cudaDeviceProp maxTexture2DLinear(int i, int setter);
    @MemberGetter public native IntPointer maxTexture2DLinear();
    /** Maximum 2D texture dimensions if texture gather operations have to be performed */
    public native int maxTexture2DGather(int i); public native cudaDeviceProp maxTexture2DGather(int i, int setter);
    @MemberGetter public native IntPointer maxTexture2DGather();
    /** Maximum 3D texture dimensions */
    public native int maxTexture3D(int i); public native cudaDeviceProp maxTexture3D(int i, int setter);
    @MemberGetter public native IntPointer maxTexture3D();
    /** Maximum alternate 3D texture dimensions */
    public native int maxTexture3DAlt(int i); public native cudaDeviceProp maxTexture3DAlt(int i, int setter);
    @MemberGetter public native IntPointer maxTexture3DAlt();
    /** Maximum Cubemap texture dimensions */
    public native int maxTextureCubemap(); public native cudaDeviceProp maxTextureCubemap(int setter);
    /** Maximum 1D layered texture dimensions */
    public native int maxTexture1DLayered(int i); public native cudaDeviceProp maxTexture1DLayered(int i, int setter);
    @MemberGetter public native IntPointer maxTexture1DLayered();
    /** Maximum 2D layered texture dimensions */
    public native int maxTexture2DLayered(int i); public native cudaDeviceProp maxTexture2DLayered(int i, int setter);
    @MemberGetter public native IntPointer maxTexture2DLayered();
    /** Maximum Cubemap layered texture dimensions */
    public native int maxTextureCubemapLayered(int i); public native cudaDeviceProp maxTextureCubemapLayered(int i, int setter);
    @MemberGetter public native IntPointer maxTextureCubemapLayered();
    /** Maximum 1D surface size */
    public native int maxSurface1D(); public native cudaDeviceProp maxSurface1D(int setter);
    /** Maximum 2D surface dimensions */
    public native int maxSurface2D(int i); public native cudaDeviceProp maxSurface2D(int i, int setter);
    @MemberGetter public native IntPointer maxSurface2D();
    /** Maximum 3D surface dimensions */
    public native int maxSurface3D(int i); public native cudaDeviceProp maxSurface3D(int i, int setter);
    @MemberGetter public native IntPointer maxSurface3D();
    /** Maximum 1D layered surface dimensions */
    public native int maxSurface1DLayered(int i); public native cudaDeviceProp maxSurface1DLayered(int i, int setter);
    @MemberGetter public native IntPointer maxSurface1DLayered();
    /** Maximum 2D layered surface dimensions */
    public native int maxSurface2DLayered(int i); public native cudaDeviceProp maxSurface2DLayered(int i, int setter);
    @MemberGetter public native IntPointer maxSurface2DLayered();
    /** Maximum Cubemap surface dimensions */
    public native int maxSurfaceCubemap(); public native cudaDeviceProp maxSurfaceCubemap(int setter);
    /** Maximum Cubemap layered surface dimensions */
    public native int maxSurfaceCubemapLayered(int i); public native cudaDeviceProp maxSurfaceCubemapLayered(int i, int setter);
    @MemberGetter public native IntPointer maxSurfaceCubemapLayered();
    /** Alignment requirements for surfaces */
    public native @Cast("size_t") long surfaceAlignment(); public native cudaDeviceProp surfaceAlignment(long setter);
    /** Device can possibly execute multiple kernels concurrently */
    public native int concurrentKernels(); public native cudaDeviceProp concurrentKernels(int setter);
    /** Device has ECC support enabled */
    public native int ECCEnabled(); public native cudaDeviceProp ECCEnabled(int setter);
    /** PCI bus ID of the device */
    public native int pciBusID(); public native cudaDeviceProp pciBusID(int setter);
    /** PCI device ID of the device */
    public native int pciDeviceID(); public native cudaDeviceProp pciDeviceID(int setter);
    /** PCI domain ID of the device */
    public native int pciDomainID(); public native cudaDeviceProp pciDomainID(int setter);
    /** 1 if device is a Tesla device using TCC driver, 0 otherwise */
    public native int tccDriver(); public native cudaDeviceProp tccDriver(int setter);
    /** Number of asynchronous engines */
    public native int asyncEngineCount(); public native cudaDeviceProp asyncEngineCount(int setter);
    /** Device shares a unified address space with the host */
    public native int unifiedAddressing(); public native cudaDeviceProp unifiedAddressing(int setter);
    /** Peak memory clock frequency in kilohertz */
    public native int memoryClockRate(); public native cudaDeviceProp memoryClockRate(int setter);
    /** Global memory bus width in bits */
    public native int memoryBusWidth(); public native cudaDeviceProp memoryBusWidth(int setter);
    /** Size of L2 cache in bytes */
    public native int l2CacheSize(); public native cudaDeviceProp l2CacheSize(int setter);
    /** Device's maximum l2 persisting lines capacity setting in bytes */
    public native int persistingL2CacheMaxSize(); public native cudaDeviceProp persistingL2CacheMaxSize(int setter);
    /** Maximum resident threads per multiprocessor */
    public native int maxThreadsPerMultiProcessor(); public native cudaDeviceProp maxThreadsPerMultiProcessor(int setter);
    /** Device supports stream priorities */
    public native int streamPrioritiesSupported(); public native cudaDeviceProp streamPrioritiesSupported(int setter);
    /** Device supports caching globals in L1 */
    public native int globalL1CacheSupported(); public native cudaDeviceProp globalL1CacheSupported(int setter);
    /** Device supports caching locals in L1 */
    public native int localL1CacheSupported(); public native cudaDeviceProp localL1CacheSupported(int setter);
    /** Shared memory available per multiprocessor in bytes */
    public native @Cast("size_t") long sharedMemPerMultiprocessor(); public native cudaDeviceProp sharedMemPerMultiprocessor(long setter);
    /** 32-bit registers available per multiprocessor */
    public native int regsPerMultiprocessor(); public native cudaDeviceProp regsPerMultiprocessor(int setter);
    /** Device supports allocating managed memory on this system */
    public native int managedMemory(); public native cudaDeviceProp managedMemory(int setter);
    /** Device is on a multi-GPU board */
    public native int isMultiGpuBoard(); public native cudaDeviceProp isMultiGpuBoard(int setter);
    /** Unique identifier for a group of devices on the same multi-GPU board */
    public native int multiGpuBoardGroupID(); public native cudaDeviceProp multiGpuBoardGroupID(int setter);
    /** Link between the device and the host supports native atomic operations */
    public native int hostNativeAtomicSupported(); public native cudaDeviceProp hostNativeAtomicSupported(int setter);
    /** Ratio of single precision performance (in floating-point operations per second) to double precision performance */
    public native int singleToDoublePrecisionPerfRatio(); public native cudaDeviceProp singleToDoublePrecisionPerfRatio(int setter);
    /** Device supports coherently accessing pageable memory without calling cudaHostRegister on it */
    public native int pageableMemoryAccess(); public native cudaDeviceProp pageableMemoryAccess(int setter);
    /** Device can coherently access managed memory concurrently with the CPU */
    public native int concurrentManagedAccess(); public native cudaDeviceProp concurrentManagedAccess(int setter);
    /** Device supports Compute Preemption */
    public native int computePreemptionSupported(); public native cudaDeviceProp computePreemptionSupported(int setter);
    /** Device can access host registered memory at the same virtual address as the CPU */
    public native int canUseHostPointerForRegisteredMem(); public native cudaDeviceProp canUseHostPointerForRegisteredMem(int setter);
    /** Device supports launching cooperative kernels via ::cudaLaunchCooperativeKernel */
    public native int cooperativeLaunch(); public native cudaDeviceProp cooperativeLaunch(int setter);
    /** Deprecated, cudaLaunchCooperativeKernelMultiDevice is deprecated. */
    public native int cooperativeMultiDeviceLaunch(); public native cudaDeviceProp cooperativeMultiDeviceLaunch(int setter);
    /** Per device maximum shared memory per block usable by special opt in */
    public native @Cast("size_t") long sharedMemPerBlockOptin(); public native cudaDeviceProp sharedMemPerBlockOptin(long setter);
    /** Device accesses pageable memory via the host's page tables */
    public native int pageableMemoryAccessUsesHostPageTables(); public native cudaDeviceProp pageableMemoryAccessUsesHostPageTables(int setter);
    /** Host can directly access managed memory on the device without migration. */
    public native int directManagedMemAccessFromHost(); public native cudaDeviceProp directManagedMemAccessFromHost(int setter);
    /** Maximum number of resident blocks per multiprocessor */
    public native int maxBlocksPerMultiProcessor(); public native cudaDeviceProp maxBlocksPerMultiProcessor(int setter);
    /** The maximum value of ::cudaAccessPolicyWindow::num_bytes. */
    public native int accessPolicyMaxWindowSize(); public native cudaDeviceProp accessPolicyMaxWindowSize(int setter);
    /** Shared memory reserved by CUDA driver per block in bytes */
    public native @Cast("size_t") long reservedSharedMemPerBlock(); public native cudaDeviceProp reservedSharedMemPerBlock(long setter);
}

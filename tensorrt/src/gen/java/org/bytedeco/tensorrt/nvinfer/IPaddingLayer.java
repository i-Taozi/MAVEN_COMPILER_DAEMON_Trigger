// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class IPaddingLayer
 * 
 *  \brief Layer that represents a padding operation.
 * 
 *  The padding layer adds zero-padding at the start and end of the input tensor. It only supports padding along the two
 *  innermost dimensions. Applying negative padding results in cropping of the input.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IPaddingLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IPaddingLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the padding that is applied at the start of the tensor.
     * 
     *  Negative padding results in trimming the edge by the specified amount
     * 
     *  @see getPrePadding
     * 
     *  @deprecated Superseded by setPrePaddingNd and will be removed in TensorRT 9.0.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Deprecated @NoException(true) void setPrePadding(@ByVal DimsHW padding);

    /**
     *  \brief Get the padding that is applied at the start of the tensor.
     * 
     *  @see setPrePadding
     * 
     *  @deprecated Superseded by getPrePaddingNd and will be removed in TensorRT 9.0.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @Deprecated @ByVal @NoException(true) DimsHW getPrePadding();

    /**
     *  \brief Set the padding that is applied at the end of the tensor.
     * 
     *  Negative padding results in trimming the edge by the specified amount
     * 
     *  @see getPostPadding
     * 
     *  @deprecated Superseded by setPostPaddingNd and will be removed in TensorRT 9.0.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Deprecated @NoException(true) void setPostPadding(@ByVal DimsHW padding);

    /**
     *  \brief Get the padding that is applied at the end of the tensor.
     * 
     *  @see setPostPadding
     * 
     *  @deprecated Superseded by getPostPaddingNd and will be removed in TensorRT 9.0.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @Deprecated @ByVal @NoException(true) DimsHW getPostPadding();

    /**
     *  \brief Set the padding that is applied at the start of the tensor.
     * 
     *  Negative padding results in trimming the edge by the specified amount.
     * 
     *  \warning Only 2 dimensional padding is currently supported.
     * 
     *  @see getPrePaddingNd
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void setPrePaddingNd(@ByVal @Cast("nvinfer1::Dims*") Dims32 padding);

    /**
     *  \brief Get the padding that is applied at the start of the tensor.
     * 
     *  \warning Only 2 dimensional padding is currently supported.
     * 
     *  @see setPrePaddingNd
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getPrePaddingNd();

    /**
     *  \brief Set the padding that is applied at the end of the tensor.
     * 
     *  Negative padding results in trimming the edge by the specified amount
     * 
     *  \warning Only 2 dimensional padding is currently supported.
     * 
     *  @see getPostPaddingNd
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void setPostPaddingNd(@ByVal @Cast("nvinfer1::Dims*") Dims32 padding);

    /**
     *  \brief Get the padding that is applied at the end of the tensor.
     * 
     *  \warning Only 2 dimensional padding is currently supported.
     * 
     *  @see setPostPaddingNd
     *  */
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getPostPaddingNd();
}

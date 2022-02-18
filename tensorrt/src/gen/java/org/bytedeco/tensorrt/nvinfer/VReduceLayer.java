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


@Namespace("nvinfer1::apiv") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class VReduceLayer extends VRoot {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VReduceLayer(Pointer p) { super(p); }

    public native @NoException(true) void setOperation(ReduceOperation op);
    public native @NoException(true) void setOperation(@Cast("nvinfer1::ReduceOperation") int op);
    public native @NoException(true) ReduceOperation getOperation();
    public native @NoException(true) void setReduceAxes(@Cast("uint32_t") int reduceAxes);
    public native @Cast("uint32_t") @NoException(true) int getReduceAxes();
    public native @NoException(true) void setKeepDimensions(@Cast("bool") boolean keepDimensions);
    public native @Cast("bool") @NoException(true) boolean getKeepDimensions();
}

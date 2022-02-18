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


/** \class IShuffleLayer
 * 
 *  \brief Layer type for shuffling data.
 * 
 *  This layer shuffles data by applying in sequence: a transpose operation, a reshape operation
 *  and a second transpose operation. The dimension types of the output are those of the reshape dimension.
 * 
 *  The layer has an optional second input.  If present, it must be a 1D Int32 shape tensor,
 *  and the reshape dimensions are taken from it.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IShuffleLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IShuffleLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the permutation applied by the first transpose operation.
     * 
     *  @param permutation The dimension permutation applied before the reshape.
     * 
     *  The default is the identity permutation.
     * 
     *  @see getFirstTranspose
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void setFirstTranspose(@ByVal Permutation permutation);

    /**
     *  \brief Get the permutation applied by the first transpose operation.
     * 
     *  @return The dimension permutation applied before the reshape.
     * 
     *  @see setFirstTranspose
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @NoException(true) Permutation getFirstTranspose();

    /**
     *  \brief Set the reshaped dimensions.
     * 
     *  @param dimensions The reshaped dimensions.
     * 
     *  Two special values can be used as dimensions.
     * 
     *  Value 0 copies the corresponding dimension from input. This special value
     *  can be used more than once in the dimensions. If number of reshape
     *  dimensions is less than input, 0s are resolved by aligning the most
     *  significant dimensions of input.
     * 
     *  Value -1 infers that particular dimension by looking at input and rest
     *  of the reshape dimensions. Note that only a maximum of one dimension is
     *  permitted to be specified as -1.
     * 
     *  The product of the new dimensions must be equal to the product of the old.
     * 
     *  If a second input had been used to create this layer, that input is reset to null by this method.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void setReshapeDimensions(@ByVal @Cast("nvinfer1::Dims*") Dims32 dimensions);

    /**
     *  \brief Get the reshaped dimensions.
     * 
     *  @return The reshaped dimensions.
     * 
     *  If a second input is present and non-null, or setReshapeDimensions has
     *  not yet been called, this function returns Dims with nbDims == -1.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @Cast("nvinfer1::Dims*") @NoException(true) Dims32 getReshapeDimensions();

    /**
     *  \brief Append or replace an input of this layer with a specific tensor
     * 
     *  @param index the index of the input to modify.
     *  @param tensor the new input tensor */
    //
    /** Sets the input tensor for the given index. The index must be 0 for a static shuffle layer.
    /** A static shuffle layer is converted to a dynamic shuffle layer by calling setInput with an index 1.
    /** A dynamic shuffle layer cannot be converted back to a static shuffle layer.
    /**
    /** For a dynamic shuffle layer, the values 0 and 1 are valid.
    /** The indices in the dynamic case are as follows:
    /**
    /** - 0: Data or Shape tensor to be shuffled.
    /** - 1: The dimensions for the reshape operation, as a 1D Int32 shape tensor.
    /**
    /** If this function is called with the value 1, then the function getNbInputs() changes
    /** from returning 1 to 2.
    /**
    /** The reshape dimensions are treated identically to how they are treated if set statically
    /** via setReshapeDimensions. In particular, a -1 is treated as a wildcard even if dynamically
    /** supplied at runtime, and a 0 is treated as a placeholder if getZeroIsPlaceholder() = true,
    /** which is the default. If the placeholder interpretation of 0 is unwanted because the
    /** runtime dimension should be 0 when the reshape dimension is 0, be sure to call
    /** setZeroIsPlacholder(false) on the IShuffleLayer.
    /**
    /** @see setReshapeDimensions.
    /** */
    
    
    //!
    //!
    //!
    //!
    //!
    //!

    /**
     *  \brief Set the permutation applied by the second transpose operation.
     * 
     *  @param permutation The dimension permutation applied after the reshape.
     * 
     *  The default is the identity permutation.
     * 
     *  The permutation is applied as outputDimensionIndex = permutation.order[inputDimensionIndex], so to
     *  permute from CHW order to HWC order, the required permutation is [1, 2, 0].
     * 
     *  @see getSecondTranspose
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void setSecondTranspose(@ByVal Permutation permutation);

    /**
     *  \brief Get the permutation applied by the second transpose operation.
     * 
     *  @return The dimension permutation applied after the reshape.
     * 
     *  @see setSecondTranspose
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @NoException(true) Permutation getSecondTranspose();

    /**
     *  \brief Set meaning of 0 in reshape dimensions.
     * 
     *  If true, then a 0 in the reshape dimensions denotes copying the corresponding
     *  dimension from the first input tensor.  If false, then a 0 in the reshape
     *  dimensions denotes a zero-length dimension.
     * 
     *  Default: true
     * 
     *  @see getZeroIsPlaceholder();
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void setZeroIsPlaceholder(@Cast("bool") boolean zeroIsPlaceholder);

    /**
     *  \brief Get meaning of 0 in reshape dimensions.
     * 
     *  @return true if 0 is placeholder for corresponding input dimension,
     *          false if 0 denotes a zero-length dimension.
     * 
     *  @see setZeroIsPlaceholder
     *  */
    public native @Cast("bool") @NoException(true) boolean getZeroIsPlaceholder();
}

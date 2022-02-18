// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_dnn;

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

import static org.bytedeco.opencv.global.opencv_dnn.*;


    /** \brief GRU recurrent one-layer
     *
     * Accepts input sequence and computes the final hidden state for each element in the batch.
     *
     * - input[0] containing the features of the input sequence.
     * input[0] should have shape [{@code T}, {@code N}, {@code data_dims}] where {@code T} is sequence length, {@code N} is batch size, {@code data_dims} is input size
     * - output would have shape [{@code T}, {@code N}, {@code D} * {@code hidden_size}] where {@code D = 2} if layer is bidirectional otherwise {@code D = 1}
     *
     * Depends on the following attributes:
     * - hidden_size - Number of neurons in the hidden layer
     * - direction - RNN could be bidirectional or forward
     *
     * The final hidden state {@code  h_t } computes by the following formulas:
     *
     <pre>{@code \begin{eqnarray*}
     r_t = \sigma(W_{ir} x_t + b_{ir} + W_{hr} h_{(t-1)} + b_{hr}) \\
     z_t = \sigma(W_{iz} x_t + b_{iz} + W_{hz} h_{(t-1)} + b_{hz}) \\
     n_t = \tanh(W_{in} x_t + b_{in} + r_t \odot (W_{hn} h_{(t-1)}+ b_{hn})) \\
     h_t = (1 - z_t) \odot n_t + z_t \odot h_{(t-1)} \\
     \end{eqnarray*}}</pre>
     * Where {@code x_t} is current input, {@code h_{(t-1)}} is previous or initial hidden state.
     *
     * {@code W_{x?}}, {@code W_{h?}} and {@code b_{?}} are learned weights represented as matrices:
     * {@code W_{x?} \in R^{N_h \times N_x}}, {@code W_{h?} \in R^{N_h \times N_h}}, {@code b_? \in R^{N_h}}.
     *
     * {@code \odot} is per-element multiply operation.
    */
    @Namespace("cv::dnn") @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class GRULayer extends Layer {
        static { Loader.load(); }
        /** Default native constructor. */
        public GRULayer() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public GRULayer(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public GRULayer(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public GRULayer position(long position) {
            return (GRULayer)super.position(position);
        }
        @Override public GRULayer getPointer(long i) {
            return new GRULayer((Pointer)this).offsetAddress(i);
        }
    
        /** Creates instance of GRU layer */
        public static native @Ptr GRULayer create(@Const @ByRef LayerParams params);
    }

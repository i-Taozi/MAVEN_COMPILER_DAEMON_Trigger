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

@Name("caffe::ThresholdLayer<double>") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class DoubleThresholdLayer extends DoubleNeuronLayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DoubleThresholdLayer(Pointer p) { super(p); }

  /**
   * @param param provides ThresholdParameter threshold_param,
   *     with ThresholdLayer options:
   *   - threshold (\b optional, default 0).
   *     the threshold value {@code  t } to which the input values are compared.
   */
  public DoubleThresholdLayer(@Const @ByRef LayerParameter param) { super((Pointer)null); allocate(param); }
  private native void allocate(@Const @ByRef LayerParameter param);
  @Virtual public native void LayerSetUp(@Const @ByRef DoubleBlobVector bottom,
        @Const @ByRef DoubleBlobVector top);

  @Virtual public native @Const({false, false, true}) @Cast("const char*") BytePointer type();
  @Virtual protected native void Forward_cpu(@Const @ByRef DoubleBlobVector bottom,
        @Const @ByRef DoubleBlobVector top);
  @Virtual protected native void Forward_gpu(@Const @ByRef DoubleBlobVector bottom,
        @Const @ByRef DoubleBlobVector top);
  @Virtual protected native void Backward_cpu(@Const @ByRef DoubleBlobVector top,
        @Const @ByRef BoolVector propagate_down, @Const @ByRef DoubleBlobVector bottom);
}

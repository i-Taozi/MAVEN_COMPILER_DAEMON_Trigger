// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;

// #endif  // TF_LITE_STATIC_MEMORY

// Fixed size list of floats. Used for per-channel quantization.
@Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TfLiteFloatArray extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TfLiteFloatArray(Pointer p) { super(p); }

  public native int size(); public native TfLiteFloatArray size(int setter);
// #if defined(_MSC_VER)
  // Context for why this is needed is in http://b/189926408#comment21
  public native float data(int i); public native TfLiteFloatArray data(int i, float setter);
  @MemberGetter public native FloatPointer data();
// #elif (!defined(__clang__) && defined(__GNUC__) && __GNUC__ == 6 &&
//        __GNUC_MINOR__ >= 1) ||
//     defined(HEXAGON) ||
//     (defined(__clang__) && __clang_major__ == 7 && __clang_minor__ == 1)
  // gcc 6.1+ have a bug where flexible members aren't properly handled
  // https://github.com/google/re2/commit/b94b7cd42e9f02673cd748c1ac1d16db4052514c
// #else
// #endif
}

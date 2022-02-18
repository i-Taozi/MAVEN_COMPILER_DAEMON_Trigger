// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@NoOffset @Name("c10::variant<torch::enumtype::kZeros,torch::enumtype::kBorder,torch::enumtype::kReflection>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class grid_sample_padding_mode_t extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public grid_sample_padding_mode_t(Pointer p) { super(p); }
    public grid_sample_padding_mode_t(kZeros value) { this(); put(value); }
    public grid_sample_padding_mode_t(kBorder value) { this(); put(value); }
    public grid_sample_padding_mode_t(kReflection value) { this(); put(value); }
    public grid_sample_padding_mode_t()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef grid_sample_padding_mode_t put(@ByRef grid_sample_padding_mode_t x);

    public @ByRef kZeros get0() { return get0(this); }
    @Namespace @Name("c10::get<0>") public static native @ByRef kZeros get0(@ByRef grid_sample_padding_mode_t container);
    @ValueSetter public native grid_sample_padding_mode_t put(@ByRef kZeros value);
    public @ByRef kBorder get1() { return get1(this); }
    @Namespace @Name("c10::get<1>") public static native @ByRef kBorder get1(@ByRef grid_sample_padding_mode_t container);
    @ValueSetter public native grid_sample_padding_mode_t put(@ByRef kBorder value);
    public @ByRef kReflection get2() { return get2(this); }
    @Namespace @Name("c10::get<2>") public static native @ByRef kReflection get2(@ByRef grid_sample_padding_mode_t container);
    @ValueSetter public native grid_sample_padding_mode_t put(@ByRef kReflection value);
}


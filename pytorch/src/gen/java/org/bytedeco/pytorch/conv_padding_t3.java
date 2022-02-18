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

@NoOffset @Name("c10::variant<torch::ExpandingArray<3>,torch::enumtype::kValid,torch::enumtype::kSame>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class conv_padding_t3 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public conv_padding_t3(Pointer p) { super(p); }
    public @Cast("torch::ExpandingArray<3>*") @ByRef LongPointer get0() { return get0(this); }
    @Namespace @Name("c10::get<0>") public static native @Cast("torch::ExpandingArray<3>*") @ByRef LongPointer get0(@ByRef conv_padding_t3 container);
    @ValueSetter public native conv_padding_t3 put(@Cast("torch::ExpandingArray<3>*") @ByRef LongPointer value);
    public @ByRef kValid get1() { return get1(this); }
    @Namespace @Name("c10::get<1>") public static native @ByRef kValid get1(@ByRef conv_padding_t3 container);
    @ValueSetter public native conv_padding_t3 put(@ByRef kValid value);
    public @ByRef kSame get2() { return get2(this); }
    @Namespace @Name("c10::get<2>") public static native @ByRef kSame get2(@ByRef conv_padding_t3 container);
    @ValueSetter public native conv_padding_t3 put(@ByRef kSame value);
}


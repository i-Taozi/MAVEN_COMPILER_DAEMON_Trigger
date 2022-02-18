// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.parquet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;

import static org.bytedeco.arrow.global.parquet.*;


@Namespace("parquet") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.parquet.class)
public class FileCryptoMetaData extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FileCryptoMetaData(Pointer p) { super(p); }

  // API convenience to get a MetaData accessor
  public static native @SharedPtr FileCryptoMetaData Make(@Cast("const uint8_t*") BytePointer serialized_metadata,
                                                    @Cast("uint32_t*") IntPointer metadata_len);
  public static native @SharedPtr FileCryptoMetaData Make(@Cast("const uint8_t*") ByteBuffer serialized_metadata,
                                                    @Cast("uint32_t*") IntBuffer metadata_len);
  public static native @SharedPtr FileCryptoMetaData Make(@Cast("const uint8_t*") byte[] serialized_metadata,
                                                    @Cast("uint32_t*") int[] metadata_len);

  public native @ByVal EncryptionAlgorithm encryption_algorithm();
  public native @StdString String key_metadata();

  public native void WriteTo(OutputStream dst);
}

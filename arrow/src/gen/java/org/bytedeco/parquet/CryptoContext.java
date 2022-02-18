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
public class CryptoContext extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CryptoContext(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CryptoContext(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CryptoContext position(long position) {
        return (CryptoContext)super.position(position);
    }
    @Override public CryptoContext getPointer(long i) {
        return new CryptoContext((Pointer)this).offsetAddress(i);
    }

  public CryptoContext(@Cast("bool") boolean start_with_dictionary_page, short rg_ordinal, short col_ordinal,
                  @SharedPtr Decryptor meta, @SharedPtr Decryptor data) { super((Pointer)null); allocate(start_with_dictionary_page, rg_ordinal, col_ordinal, meta, data); }
  private native void allocate(@Cast("bool") boolean start_with_dictionary_page, short rg_ordinal, short col_ordinal,
                  @SharedPtr Decryptor meta, @SharedPtr Decryptor data);
  public CryptoContext() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native @Cast("bool") boolean start_decrypt_with_dictionary_page(); public native CryptoContext start_decrypt_with_dictionary_page(boolean setter);
  public native short row_group_ordinal(); public native CryptoContext row_group_ordinal(short setter);
  public native short column_ordinal(); public native CryptoContext column_ordinal(short setter);
  public native @SharedPtr Decryptor meta_decryptor(); public native CryptoContext meta_decryptor(Decryptor setter);
  public native @SharedPtr Decryptor data_decryptor(); public native CryptoContext data_decryptor(Decryptor setter);
}

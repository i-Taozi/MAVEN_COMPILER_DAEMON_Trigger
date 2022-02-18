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


// A Symbol is like an interned string, but with a little extra
// structure; it is namespaced via SymbolNamespace and the resulting
// intern pointers support efficient namespace testing.
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Symbol extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Symbol(Pointer p) { super(p); }

  public Symbol() { super((Pointer)null); allocate(); }
  private native void allocate();
  public Symbol(@Cast("c10::unique_t") int uniq) { super((Pointer)null); allocate(uniq); }
  private native void allocate(@Cast("c10::unique_t") int uniq);

  // Get a Symbol for a qualified string like "attr::bar"
  public static native @ByVal Symbol fromQualString(@StdString BytePointer s);
  public static native @ByVal Symbol fromQualString(@StdString String s);

  // Get a Symbol from a domain and an unqualified string like "org.pytorch.attr" and "bar"
  public static native @ByVal Symbol fromDomainAndUnqualString(@StdString BytePointer d, @StdString BytePointer s);
  public static native @ByVal Symbol fromDomainAndUnqualString(@StdString String d, @StdString String s);

  // Constructors for our various namespaced strings.  This will construct
  // the appropriate namespaced string, e.g., "attr::foo" for the
  // argument "foo", and then attempt to intern it.  DO NOT USE THIS
  // with a string literal; attr::foo should be available in that case
  // (and if it's not, you should add it to the built-ins list above.)
  public static native @ByVal Symbol attr(@StdString BytePointer s);
  public static native @ByVal Symbol attr(@StdString String s);
  public static native @ByVal Symbol aten(@StdString BytePointer s);
  public static native @ByVal Symbol aten(@StdString String s);
  public static native @ByVal Symbol cuda(@StdString BytePointer s);
  public static native @ByVal Symbol cuda(@StdString String s);
  public static native @ByVal Symbol onnx(@StdString BytePointer s);
  public static native @ByVal Symbol onnx(@StdString String s);
  public static native @ByVal Symbol prim(@StdString BytePointer s);
  public static native @ByVal Symbol prim(@StdString String s);
  public static native @ByVal Symbol user(@StdString BytePointer s);
  public static native @ByVal Symbol user(@StdString String s);
  public static native @ByVal Symbol caffe2(@StdString BytePointer s);
  public static native @ByVal Symbol caffe2(@StdString String s);
  public static native @ByVal Symbol dimname(@StdString BytePointer s);
  public static native @ByVal Symbol dimname(@StdString String s);
  // TODO: eliminate me
  public static native @ByVal Symbol scope(@StdString BytePointer s);
  public static native @ByVal Symbol scope(@StdString String s);

  public native @Cast("bool") boolean is_attr();
  public native @Cast("bool") boolean is_aten();
  public native @Cast("bool") boolean is_cuda();
  public native @Cast("bool") boolean is_prim();
  public native @Cast("bool") boolean is_onnx();
  public native @Cast("bool") boolean is_user();
  public native @Cast("bool") boolean is_caffe2();
  public native @Cast("bool") boolean is_dimname();

  // So we can switch on this
  public native @Cast("c10::unique_t") @Name("operator c10::unique_t") int asInt();

  public native @ByVal Symbol ns();

  // Give a string corresponding to the unqualified version of this name, e.g.,
  // "mm". Use this in a context where the intended namespace of the string is
  // obvious; this is a *lossy* conversion.
  public native @Cast("const char*") BytePointer toUnqualString();

  // Give a string corresponding to the qualified version of this name,
  // e.g., "aten::mm".  This string format is made available to Python bindings
  // (so we know how to parse it.)
  public native @Cast("const char*") BytePointer toQualString();

  // This describes a symbol in a case where humans read it.  At the moment it's
  // the same as toQualString.  This has to be a const char* returned because
  // a lot of printf style macros use it.
  public native @Cast("const char*") BytePointer toDisplayString();

  // Give a string corresponding to the domain name for the symbol,
  // e.g., "org.pytorch.aten".
  public native @StdString BytePointer domainString();
}

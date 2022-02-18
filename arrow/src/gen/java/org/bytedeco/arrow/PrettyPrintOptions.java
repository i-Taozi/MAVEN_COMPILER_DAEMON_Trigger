// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.arrow;

import org.bytedeco.arrow.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.arrow.global.arrow.*;


@Namespace("arrow") @NoOffset @Properties(inherit = org.bytedeco.arrow.presets.arrow.class)
public class PrettyPrintOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PrettyPrintOptions(Pointer p) { super(p); }

  public PrettyPrintOptions() { super((Pointer)null); allocate(); }
  private native void allocate();

  public PrettyPrintOptions(int indent_arg,
                       int window_arg/*=10*/, int indent_size_arg/*=2*/,
                       @StdString String null_rep_arg/*="null"*/, @Cast("bool") boolean skip_new_lines_arg/*=false*/,
                       @Cast("bool") boolean truncate_metadata_arg/*=true*/) { super((Pointer)null); allocate(indent_arg, window_arg, indent_size_arg, null_rep_arg, skip_new_lines_arg, truncate_metadata_arg); }
  private native void allocate(int indent_arg,
                       int window_arg/*=10*/, int indent_size_arg/*=2*/,
                       @StdString String null_rep_arg/*="null"*/, @Cast("bool") boolean skip_new_lines_arg/*=false*/,
                       @Cast("bool") boolean truncate_metadata_arg/*=true*/);
  public PrettyPrintOptions(int indent_arg) { super((Pointer)null); allocate(indent_arg); }
  private native void allocate(int indent_arg);
  public PrettyPrintOptions(int indent_arg,
                       int window_arg/*=10*/, int indent_size_arg/*=2*/,
                       @StdString BytePointer null_rep_arg/*="null"*/, @Cast("bool") boolean skip_new_lines_arg/*=false*/,
                       @Cast("bool") boolean truncate_metadata_arg/*=true*/) { super((Pointer)null); allocate(indent_arg, window_arg, indent_size_arg, null_rep_arg, skip_new_lines_arg, truncate_metadata_arg); }
  private native void allocate(int indent_arg,
                       int window_arg/*=10*/, int indent_size_arg/*=2*/,
                       @StdString BytePointer null_rep_arg/*="null"*/, @Cast("bool") boolean skip_new_lines_arg/*=false*/,
                       @Cast("bool") boolean truncate_metadata_arg/*=true*/);

  public static native @ByVal PrettyPrintOptions Defaults();

  /** Number of spaces to shift entire formatted object to the right */
  public native int indent(); public native PrettyPrintOptions indent(int setter);

  /** Size of internal indents */
  public native int indent_size(); public native PrettyPrintOptions indent_size(int setter);

  /** Maximum number of elements to show at the beginning and at the end. */
  public native int window(); public native PrettyPrintOptions window(int setter);

  /** String to use for representing a null value, defaults to "null" */
  public native @StdString String null_rep(); public native PrettyPrintOptions null_rep(String setter);

  /** Skip new lines between elements, defaults to false */
  public native @Cast("bool") boolean skip_new_lines(); public native PrettyPrintOptions skip_new_lines(boolean setter);

  /** Limit display of each KeyValueMetadata key/value pair to a single line at
   *  80 character width */
  public native @Cast("bool") boolean truncate_metadata(); public native PrettyPrintOptions truncate_metadata(boolean setter);

  /** If true, display field metadata when pretty-printing a Schema */
  public native @Cast("bool") boolean show_field_metadata(); public native PrettyPrintOptions show_field_metadata(boolean setter);

  /** If true, display schema metadata when pretty-printing a Schema */
  public native @Cast("bool") boolean show_schema_metadata(); public native PrettyPrintOptions show_schema_metadata(boolean setter);
}

// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.arrow_dataset;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.arrow.*;
import static org.bytedeco.arrow.global.arrow.*;
import org.bytedeco.parquet.*;
import static org.bytedeco.arrow.global.parquet.*;

import static org.bytedeco.arrow.global.arrow_dataset.*;


/** \brief A FileFormat implementation that reads from Parquet files */
@Namespace("arrow::dataset") @Properties(inherit = org.bytedeco.arrow.presets.arrow_dataset.class)
public class ParquetFileFormat extends FileFormat {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ParquetFileFormat(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ParquetFileFormat(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ParquetFileFormat position(long position) {
        return (ParquetFileFormat)super.position(position);
    }
    @Override public ParquetFileFormat getPointer(long i) {
        return new ParquetFileFormat((Pointer)this).offsetAddress(i);
    }

  public ParquetFileFormat() { super((Pointer)null); allocate(); }
  private native void allocate();

  /** Convenience constructor which copies properties from a parquet::ReaderProperties.
   *  memory_pool will be ignored. */
  public ParquetFileFormat(@Const @ByRef ReaderProperties reader_properties) { super((Pointer)null); allocate(reader_properties); }
  private native void allocate(@Const @ByRef ReaderProperties reader_properties);

  public native @StdString String type_name();

  public native @Cast("bool") boolean Equals(@Const @ByRef FileFormat other);

    /** \defgroup parquet-file-format-arrow-reader-properties properties which correspond
     *  to members of parquet::ArrowReaderProperties.
     * 
     *  We don't embed parquet::ReaderProperties directly because column names (rather
     *  than indices) are used to indicate dictionary columns, and other options are
     *  deferred to scan time.
     * 
     *  \{ */
    @Name("reader_options.dict_columns") public native @ByRef StringUnorderedSet reader_options_dict_columns(); public native ParquetFileFormat reader_options_dict_columns(StringUnorderedSet setter);
    @Name("reader_options.coerce_int96_timestamp_unit") public native TimeUnit.type reader_options_coerce_int96_timestamp_unit(); public native ParquetFileFormat reader_options_coerce_int96_timestamp_unit(TimeUnit.type setter);
    /** \} */

  public native @ByVal BoolResult IsSupported(@Const @ByRef FileSource source);

  /** \brief Return the schema of the file if possible. */
  public native @ByVal SchemaResult Inspect(@Const @ByRef FileSource source);

  /** \brief Open a file for scanning */
  public native @ByVal ScanTaskIteratorResult ScanFile(
        @SharedPtr ScanOptions options,
        @Const @SharedPtr @ByRef FileFragment file);

  public native @ByVal RecordBatchGeneratorResult ScanBatchesAsync(
        @SharedPtr ScanOptions options,
        @Const @SharedPtr @ByRef FileFragment file);

  public native @ByVal LongOptionalFuture CountRows(
        @Const @SharedPtr @ByRef FileFragment file, @ByVal Expression predicate,
        @SharedPtr ScanOptions options);

  /** \brief Create a Fragment targeting all RowGroups. */
  public native @ByVal FileFragmentResult MakeFragment(
        @ByVal FileSource source, @ByVal Expression partition_expression,
        @SharedPtr @ByVal Schema physical_schema);

  /** \brief Create a Fragment, restricted to the specified row groups. */
  public native @ByVal ParquetFileFragmentResult MakeFragment(
        @ByVal FileSource source, @ByVal Expression partition_expression,
        @SharedPtr @ByVal Schema physical_schema, @StdVector IntPointer row_groups);
  public native @ByVal ParquetFileFragmentResult MakeFragment(
        @ByVal FileSource source, @ByVal Expression partition_expression,
        @SharedPtr @ByVal Schema physical_schema, @StdVector IntBuffer row_groups);
  public native @ByVal ParquetFileFragmentResult MakeFragment(
        @ByVal FileSource source, @ByVal Expression partition_expression,
        @SharedPtr @ByVal Schema physical_schema, @StdVector int[] row_groups);

  /** \brief Return a FileReader on the given source. */
  public native @ByVal FileReaderResult GetReader(
        @Const @ByRef FileSource source, ScanOptions arg1/*=nullptr*/);
  public native @ByVal FileReaderResult GetReader(
        @Const @ByRef FileSource source);

  

  public native @ByVal FileWriterResult MakeWriter(
        @SharedPtr OutputStream destination, @SharedPtr @ByVal Schema schema,
        @SharedPtr FileWriteOptions options,
        @ByVal FileLocator destination_locator);

  public native @SharedPtr FileWriteOptions DefaultWriteOptions();
}

// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Generates labels for candidate sampling with a learned unigram distribution.
 * 
 *  A unigram sampler could use a fixed unigram distribution read from a
 *  file or passed in as an in-memory array instead of building up the distribution
 *  from data on the fly. There is also an option to skew the distribution by
 *  applying a distortion power to the weights.
 * 
 *  The vocabulary file should be in CSV-like format, with the last field
 *  being the weight associated with the word.
 * 
 *  For each batch, this op picks a single set of sampled candidate labels.
 * 
 *  The advantages of sampling candidates per-batch are simplicity and the
 *  possibility of efficient dense matrix multiplication. The disadvantage is that
 *  the sampled candidates must be chosen independently of the context and of the
 *  true labels.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * true_classes: A batch_size * num_true matrix, in which each row contains the
 *  IDs of the num_true target_classes in the corresponding original label.
 *  * num_true: Number of true labels per context.
 *  * num_sampled: Number of candidates to randomly sample.
 *  * unique: If unique is true, we sample with rejection, so that all sampled
 *  candidates in a batch are unique. This requires some approximation to
 *  estimate the post-rejection sampling probabilities.
 *  * range_max: The sampler will sample integers from the interval [0, range_max).
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * vocab_file: Each valid line in this file (which should have a CSV-like format)
 *  corresponds to a valid word ID. IDs are in sequential order, starting from
 *  num_reserved_ids. The last entry in each line is expected to be a value
 *  corresponding to the count or relative probability. Exactly one of vocab_file
 *  and unigrams needs to be passed to this op.
 *  * distortion: The distortion is used to skew the unigram probability distribution.
 *  Each weight is first raised to the distortion's power before adding to the
 *  internal unigram distribution. As a result, distortion = 1.0 gives regular
 *  unigram sampling (as defined by the vocab file), and distortion = 0.0 gives
 *  a uniform distribution.
 *  * num_reserved_ids: Optionally some reserved IDs can be added in the range [0,
 *  ..., num_reserved_ids) by the users. One use case is that a special unknown
 *  word token is used as ID 0. These IDs will have a sampling probability of 0.
 *  * num_shards: A sampler can be used to sample from a subset of the original range
 *  in order to speed up the whole computation through parallelism. This parameter
 *  (together with 'shard') indicates the number of partitions that are being
 *  used in the overall computation.
 *  * shard: A sampler can be used to sample from a subset of the original range
 *  in order to speed up the whole computation through parallelism. This parameter
 *  (together with 'num_shards') indicates the particular partition number of a
 *  sampler op, when partitioning is being used.
 *  * unigrams: A list of unigram counts or probabilities, one per ID in sequential
 *  order. Exactly one of vocab_file and unigrams should be passed to this op.
 *  * seed: If either seed or seed2 are set to be non-zero, the random number
 *  generator is seeded by the given seed.  Otherwise, it is seeded by a
 *  random seed.
 *  * seed2: An second seed to avoid seed collision.
 * 
 *  Returns:
 *  * {@code Output} sampled_candidates: A vector of length num_sampled, in which each element is
 *  the ID of a sampled candidate.
 *  * {@code Output} true_expected_count: A batch_size * num_true matrix, representing
 *  the number of times each candidate is expected to occur in a batch
 *  of sampled candidates. If unique=true, then this is a probability.
 *  * {@code Output} sampled_expected_count: A vector of length num_sampled, for each sampled
 *  candidate representing the number of times the candidate is expected
 *  to occur in a batch of sampled candidates.  If unique=true, then this is a
 *  probability. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class FixedUnigramCandidateSampler extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FixedUnigramCandidateSampler(Pointer p) { super(p); }

  /** Optional attribute setters for FixedUnigramCandidateSampler */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
      @Override public Attrs getPointer(long i) {
          return new Attrs((Pointer)this).offsetAddress(i);
      }
  
    /** Each valid line in this file (which should have a CSV-like format)
     *  corresponds to a valid word ID. IDs are in sequential order, starting from
     *  num_reserved_ids. The last entry in each line is expected to be a value
     *  corresponding to the count or relative probability. Exactly one of vocab_file
     *  and unigrams needs to be passed to this op.
     * 
     *  Defaults to "" */
    
    ///
    public native @ByVal Attrs VocabFile(@StringPiece BytePointer x);
    public native @ByVal Attrs VocabFile(@StringPiece String x);

    /** The distortion is used to skew the unigram probability distribution.
     *  Each weight is first raised to the distortion's power before adding to the
     *  internal unigram distribution. As a result, distortion = 1.0 gives regular
     *  unigram sampling (as defined by the vocab file), and distortion = 0.0 gives
     *  a uniform distribution.
     * 
     *  Defaults to 1 */
    
    ///
    public native @ByVal Attrs Distortion(float x);

    /** Optionally some reserved IDs can be added in the range [0,
     *  ..., num_reserved_ids) by the users. One use case is that a special unknown
     *  word token is used as ID 0. These IDs will have a sampling probability of 0.
     * 
     *  Defaults to 0 */
    
    ///
    public native @ByVal Attrs NumReservedIds(@Cast("tensorflow::int64") long x);

    /** A sampler can be used to sample from a subset of the original range
     *  in order to speed up the whole computation through parallelism. This parameter
     *  (together with 'shard') indicates the number of partitions that are being
     *  used in the overall computation.
     * 
     *  Defaults to 1 */
    
    ///
    public native @ByVal Attrs NumShards(@Cast("tensorflow::int64") long x);

    /** A sampler can be used to sample from a subset of the original range
     *  in order to speed up the whole computation through parallelism. This parameter
     *  (together with 'num_shards') indicates the particular partition number of a
     *  sampler op, when partitioning is being used.
     * 
     *  Defaults to 0 */
    
    ///
    public native @ByVal Attrs Shard(@Cast("tensorflow::int64") long x);

    /** A list of unigram counts or probabilities, one per ID in sequential
     *  order. Exactly one of vocab_file and unigrams should be passed to this op.
     * 
     *  Defaults to [] */
    
    ///
    public native @ByVal Attrs Unigrams(@ArraySlice FloatPointer x);
    public native @ByVal Attrs Unigrams(@ArraySlice FloatBuffer x);
    public native @ByVal Attrs Unigrams(@ArraySlice float... x);

    /** If either seed or seed2 are set to be non-zero, the random number
     *  generator is seeded by the given seed.  Otherwise, it is seeded by a
     *  random seed.
     * 
     *  Defaults to 0 */
    
    ///
    public native @ByVal Attrs Seed(@Cast("tensorflow::int64") long x);

    /** An second seed to avoid seed collision.
     * 
     *  Defaults to 0 */
    public native @ByVal Attrs Seed2(@Cast("tensorflow::int64") long x);

    public native @StringPiece BytePointer vocab_file_(); public native Attrs vocab_file_(BytePointer setter);
    public native float distortion_(); public native Attrs distortion_(float setter);
    public native @Cast("tensorflow::int64") long num_reserved_ids_(); public native Attrs num_reserved_ids_(long setter);
    public native @Cast("tensorflow::int64") long num_shards_(); public native Attrs num_shards_(long setter);
    public native @Cast("tensorflow::int64") long shard_(); public native Attrs shard_(long setter);
    public native @ArraySlice FloatPointer unigrams_(); public native Attrs unigrams_(FloatPointer setter);
    public native @Cast("tensorflow::int64") long seed_(); public native Attrs seed_(long setter);
    public native @Cast("tensorflow::int64") long seed2_(); public native Attrs seed2_(long setter);
  }
  public FixedUnigramCandidateSampler(@Const @ByRef Scope scope,
                               @ByVal Input true_classes, @Cast("tensorflow::int64") long num_true,
                               @Cast("tensorflow::int64") long num_sampled, @Cast("bool") boolean unique, @Cast("tensorflow::int64") long range_max) { super((Pointer)null); allocate(scope, true_classes, num_true, num_sampled, unique, range_max); }
  private native void allocate(@Const @ByRef Scope scope,
                               @ByVal Input true_classes, @Cast("tensorflow::int64") long num_true,
                               @Cast("tensorflow::int64") long num_sampled, @Cast("bool") boolean unique, @Cast("tensorflow::int64") long range_max);
  public FixedUnigramCandidateSampler(@Const @ByRef Scope scope,
                               @ByVal Input true_classes, @Cast("tensorflow::int64") long num_true,
                               @Cast("tensorflow::int64") long num_sampled, @Cast("bool") boolean unique, @Cast("tensorflow::int64") long range_max,
                               @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, true_classes, num_true, num_sampled, unique, range_max, attrs); }
  private native void allocate(@Const @ByRef Scope scope,
                               @ByVal Input true_classes, @Cast("tensorflow::int64") long num_true,
                               @Cast("tensorflow::int64") long num_sampled, @Cast("bool") boolean unique, @Cast("tensorflow::int64") long range_max,
                               @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs VocabFile(@StringPiece BytePointer x);
  public static native @ByVal Attrs VocabFile(@StringPiece String x);
  public static native @ByVal Attrs Distortion(float x);
  public static native @ByVal Attrs NumReservedIds(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs NumShards(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs Shard(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs Unigrams(@ArraySlice FloatPointer x);
  public static native @ByVal Attrs Unigrams(@ArraySlice FloatBuffer x);
  public static native @ByVal Attrs Unigrams(@ArraySlice float... x);
  public static native @ByVal Attrs Seed(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs Seed2(@Cast("tensorflow::int64") long x);

  public native @ByRef Operation operation(); public native FixedUnigramCandidateSampler operation(Operation setter);
  public native @ByRef Output sampled_candidates(); public native FixedUnigramCandidateSampler sampled_candidates(Output setter);
  public native @ByRef Output true_expected_count(); public native FixedUnigramCandidateSampler true_expected_count(Output setter);
  public native @ByRef Output sampled_expected_count(); public native FixedUnigramCandidateSampler sampled_expected_count(Output setter);
}

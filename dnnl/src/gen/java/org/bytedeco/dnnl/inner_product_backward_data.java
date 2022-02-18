// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** Inner product backward propagation primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class inner_product_backward_data extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public inner_product_backward_data(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public inner_product_backward_data(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public inner_product_backward_data position(long position) {
        return (inner_product_backward_data)super.position(position);
    }
    @Override public inner_product_backward_data getPointer(long i) {
        return new inner_product_backward_data((Pointer)this).offsetAddress(i);
    }

    /** Descriptor for an inner product backward propagation primitive. */
    @NoOffset public static class desc extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public desc(Pointer p) { super(p); }
    
        
        ///
        ///
        public native @ByRef dnnl_inner_product_desc_t data(); public native desc data(dnnl_inner_product_desc_t setter);

        /** Constructs a descriptor for an inner product backward propagation
         *  primitive.
         * 
         *  \note
         *      All the memory descriptors may be initialized with the
         *      #dnnl::memory::format_tag::any value of \p format_tag.
         * 
         *  @param diff_src_desc Memory descriptor for diff src.
         *  @param weights_desc Memory descriptor for weights.
         *  @param diff_dst_desc Memory descriptor for diff dst. */
        public desc(@Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc) { super((Pointer)null); allocate(diff_src_desc, weights_desc, diff_dst_desc); }
        private native void allocate(@Const @ByRef memory.desc diff_src_desc,
                        @Const @ByRef memory.desc weights_desc,
                        @Const @ByRef memory.desc diff_dst_desc);
    }

    /** Primitive descriptor for an inner product backward propagation
     *  primitive. */
    public static class primitive_desc extends org.bytedeco.dnnl.primitive_desc {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public primitive_desc(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public primitive_desc position(long position) {
            return (primitive_desc)super.position(position);
        }
        @Override public primitive_desc getPointer(long i) {
            return new primitive_desc((Pointer)this).offsetAddress(i);
        }
    
        /** Default constructor. Produces an empty object. */
        
        ///
        public primitive_desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Constructs a primitive descriptor for an inner product backward
         *  propagation primitive.
         * 
         *  @param adesc Descriptor for an inner product backward propagation
         *      primitive.
         *  @param aengine Engine to use.
         *  @param hint_fwd_pd Primitive descriptor for an inner product
         *      forward propagation primitive. It is used as a hint for
         *      deciding which memory format to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(adesc, aengine, hint_fwd_pd, allow_empty); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(adesc, aengine, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef engine aengine,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd);

        /** Constructs a primitive descriptor for an inner product backward
         *  propagation primitive.
         * 
         *  @param adesc Descriptor for an inner product backward propagation
         *      primitive.
         *  @param attr Primitive attributes to use.
         *  @param aengine Engine to use.
         *  @param hint_fwd_pd Primitive descriptor for an inner product
         *      forward propagation primitive. It is used as a hint for
         *      deciding which memory format to use.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(adesc, attr, aengine, hint_fwd_pd, allow_empty); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(adesc, attr, aengine, hint_fwd_pd); }
        private native void allocate(@Const @ByRef desc adesc, @Const @ByRef primitive_attr attr,
                        @Const @ByRef engine aengine,
                        @Const @ByRef inner_product_forward.primitive_desc hint_fwd_pd);

        /** Constructs a primitive descriptor for an inner product backward
         *  propagation primitive from a C API primitive descriptor that must
         *  have a matching kind.
         * 
         *  @param pd C API primitive descriptor for an inner product backward
         *      propagation primitive. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** \copydoc dnnl::primitive_desc_base::diff_src_desc()const */
        public native @ByVal memory.desc diff_src_desc();

        /** \copydoc dnnl::primitive_desc_base::weights_desc()const */
        public native @ByVal memory.desc weights_desc();

        /** \copydoc dnnl::primitive_desc_base::diff_dst_desc()const */
        public native @ByVal memory.desc diff_dst_desc();
    }

    /** Default constructor. Produces an empty object. */
    public inner_product_backward_data() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs an inner product backward propagation primitive.
     *  @param pd Primitive descriptor for an inner product backward
     *      propagation primitive. */
    public inner_product_backward_data(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);
}

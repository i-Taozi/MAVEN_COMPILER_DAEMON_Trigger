// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.artoolkitplus;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.artoolkitplus.global.ARToolKitPlus.*;


@Namespace("ARToolKitPlus") @Properties(inherit = org.bytedeco.artoolkitplus.presets.ARToolKitPlus.class)
public class ARMultiEachMarkerInfoT extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ARMultiEachMarkerInfoT() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ARMultiEachMarkerInfoT(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ARMultiEachMarkerInfoT(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ARMultiEachMarkerInfoT position(long position) {
        return (ARMultiEachMarkerInfoT)super.position(position);
    }
    @Override public ARMultiEachMarkerInfoT getPointer(long i) {
        return new ARMultiEachMarkerInfoT((Pointer)this).offsetAddress(i);
    }

    public native int patt_id(); public native ARMultiEachMarkerInfoT patt_id(int setter);
    public native @Cast("ARFloat") float width(); public native ARMultiEachMarkerInfoT width(float setter);
    public native @Cast("ARFloat") float center(int i); public native ARMultiEachMarkerInfoT center(int i, float setter);
    @MemberGetter public native @Cast("ARFloat*") FloatPointer center();
    public native @Cast("ARFloat") float trans(int i, int j); public native ARMultiEachMarkerInfoT trans(int i, int j, float setter);
    @MemberGetter public native @Cast("ARFloat(* /*[3]*/ )[4]") FloatPointer trans();
    public native @Cast("ARFloat") float itrans(int i, int j); public native ARMultiEachMarkerInfoT itrans(int i, int j, float setter);
    @MemberGetter public native @Cast("ARFloat(* /*[3]*/ )[4]") FloatPointer itrans();
    public native @Cast("ARFloat") float pos3d(int i, int j); public native ARMultiEachMarkerInfoT pos3d(int i, int j, float setter);
    @MemberGetter public native @Cast("ARFloat(* /*[4]*/ )[3]") FloatPointer pos3d();
    public native int visible(); public native ARMultiEachMarkerInfoT visible(int setter);
/*---*/
    public native int visibleR(); public native ARMultiEachMarkerInfoT visibleR(int setter);
}

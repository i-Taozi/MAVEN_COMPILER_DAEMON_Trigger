// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.macosx.*;


@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class rusage_info_v2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public rusage_info_v2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public rusage_info_v2(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public rusage_info_v2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public rusage_info_v2 position(long position) {
        return (rusage_info_v2)super.position(position);
    }
    @Override public rusage_info_v2 getPointer(long i) {
        return new rusage_info_v2((Pointer)this).offsetAddress(i);
    }

	public native @Cast("uint8_t") byte ri_uuid(int i); public native rusage_info_v2 ri_uuid(int i, byte setter);
	@MemberGetter public native @Cast("uint8_t*") BytePointer ri_uuid();
	public native @Cast("uint64_t") long ri_user_time(); public native rusage_info_v2 ri_user_time(long setter);
	public native @Cast("uint64_t") long ri_system_time(); public native rusage_info_v2 ri_system_time(long setter);
	public native @Cast("uint64_t") long ri_pkg_idle_wkups(); public native rusage_info_v2 ri_pkg_idle_wkups(long setter);
	public native @Cast("uint64_t") long ri_interrupt_wkups(); public native rusage_info_v2 ri_interrupt_wkups(long setter);
	public native @Cast("uint64_t") long ri_pageins(); public native rusage_info_v2 ri_pageins(long setter);
	public native @Cast("uint64_t") long ri_wired_size(); public native rusage_info_v2 ri_wired_size(long setter);
	public native @Cast("uint64_t") long ri_resident_size(); public native rusage_info_v2 ri_resident_size(long setter);
	public native @Cast("uint64_t") long ri_phys_footprint(); public native rusage_info_v2 ri_phys_footprint(long setter);
	public native @Cast("uint64_t") long ri_proc_start_abstime(); public native rusage_info_v2 ri_proc_start_abstime(long setter);
	public native @Cast("uint64_t") long ri_proc_exit_abstime(); public native rusage_info_v2 ri_proc_exit_abstime(long setter);
	public native @Cast("uint64_t") long ri_child_user_time(); public native rusage_info_v2 ri_child_user_time(long setter);
	public native @Cast("uint64_t") long ri_child_system_time(); public native rusage_info_v2 ri_child_system_time(long setter);
	public native @Cast("uint64_t") long ri_child_pkg_idle_wkups(); public native rusage_info_v2 ri_child_pkg_idle_wkups(long setter);
	public native @Cast("uint64_t") long ri_child_interrupt_wkups(); public native rusage_info_v2 ri_child_interrupt_wkups(long setter);
	public native @Cast("uint64_t") long ri_child_pageins(); public native rusage_info_v2 ri_child_pageins(long setter);
	public native @Cast("uint64_t") long ri_child_elapsed_abstime(); public native rusage_info_v2 ri_child_elapsed_abstime(long setter);
	public native @Cast("uint64_t") long ri_diskio_bytesread(); public native rusage_info_v2 ri_diskio_bytesread(long setter);
	public native @Cast("uint64_t") long ri_diskio_byteswritten(); public native rusage_info_v2 ri_diskio_byteswritten(long setter);
}

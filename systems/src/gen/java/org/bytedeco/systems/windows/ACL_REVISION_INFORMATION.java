// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


//
//  This record is returned/sent if the user is requesting/setting the
//  AclRevisionInformation
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class ACL_REVISION_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ACL_REVISION_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ACL_REVISION_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ACL_REVISION_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ACL_REVISION_INFORMATION position(long position) {
        return (ACL_REVISION_INFORMATION)super.position(position);
    }
    @Override public ACL_REVISION_INFORMATION getPointer(long i) {
        return new ACL_REVISION_INFORMATION((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int AclRevision(); public native ACL_REVISION_INFORMATION AclRevision(int setter);
}

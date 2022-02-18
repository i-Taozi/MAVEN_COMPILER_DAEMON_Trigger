// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.linux.*;

// #endif

/* Structure describing the action to be taken when a signal arrives.  */
@Name("struct sigaction") @Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class sigaction extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sigaction() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sigaction(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sigaction(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sigaction position(long position) {
        return (sigaction)super.position(position);
    }
    @Override public sigaction getPointer(long i) {
        return new sigaction((Pointer)this).offsetAddress(i);
    }

    /* Signal handler.  */
// #ifdef __USE_POSIX199309
	/* Used if SA_SIGINFO is not set.  */
	public native __sighandler_t sa_handler(); public native sigaction sa_handler(__sighandler_t setter);
	/* Used if SA_SIGINFO is set.  */
	public static class Sa_sigaction_int_siginfo_t_Pointer extends FunctionPointer {
	    static { Loader.load(); }
	    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
	    public    Sa_sigaction_int_siginfo_t_Pointer(Pointer p) { super(p); }
	    protected Sa_sigaction_int_siginfo_t_Pointer() { allocate(); }
	    private native void allocate();
	    public native void call(int arg0, siginfo_t arg1, Pointer arg2);
	}
	public native Sa_sigaction_int_siginfo_t_Pointer sa_sigaction(); public native sigaction sa_sigaction(Sa_sigaction_int_siginfo_t_Pointer setter);
// #else
// #endif

    /* Additional set of signals to be blocked.  */
    public native @ByRef sigset_t sa_mask(); public native sigaction sa_mask(sigset_t setter);

    /* Special flags.  */
    public native int sa_flags(); public native sigaction sa_flags(int setter);

    /* Restore handler.  */
    public static class Sa_restorer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Sa_restorer(Pointer p) { super(p); }
        protected Sa_restorer() { allocate(); }
        private native void allocate();
        public native void call();
    }
    public native Sa_restorer sa_restorer(); public native sigaction sa_restorer(Sa_restorer setter);
  }

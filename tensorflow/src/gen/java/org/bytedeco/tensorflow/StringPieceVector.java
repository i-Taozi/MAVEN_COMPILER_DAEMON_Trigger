// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

@Name("std::vector<tensorflow::StringPiece>") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class StringPieceVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringPieceVector(Pointer p) { super(p); }
    public StringPieceVector(BytePointer value) { this(1); put(0, value); }
    public StringPieceVector(BytePointer ... array) { this(array.length); put(array); }
    public StringPieceVector(String value) { this(1); put(0, value); }
    public StringPieceVector(String ... array) { this(array.length); put(array); }
    public StringPieceVector()       { allocate();  }
    public StringPieceVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef StringPieceVector put(@ByRef StringPieceVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @StringPiece BytePointer get(@Cast("size_t") long i);
    public native StringPieceVector put(@Cast("size_t") long i, BytePointer value);
    @ValueSetter @Index(function = "at") public native StringPieceVector put(@Cast("size_t") long i, @StringPiece String value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @StringPiece BytePointer value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @StringPiece BytePointer get();
    }

    public BytePointer[] get() {
        BytePointer[] array = new BytePointer[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public BytePointer pop_back() {
        long size = size();
        BytePointer value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public StringPieceVector push_back(BytePointer value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public StringPieceVector put(BytePointer value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public StringPieceVector put(BytePointer ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }

    public StringPieceVector push_back(String value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public StringPieceVector put(String value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public StringPieceVector put(String ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}


package com.facebook.simplejni;

import X.C31571eR;

public class NativeHolder {
    public final Destructor mDestructor;
    public final long mNativePointer;

    public class Destructor extends C31571eR {
        public long mNativeDestructorFunctionPointer;
        public long mNativePointer;

        public Destructor(Object obj, long j2, long j3) {
            super(obj);
            this.mNativePointer = j2;
            this.mNativeDestructorFunctionPointer = j3;
        }

        public static native void deleteNative(long j2, long j3);

        public void destruct() {
            long j2 = this.mNativePointer;
            if (j2 != 0) {
                deleteNative(j2, this.mNativeDestructorFunctionPointer);
                this.mNativePointer = 0;
            }
        }
    }

    public NativeHolder(long j2, long j3) {
        this.mNativePointer = j2;
        this.mDestructor = new Destructor(this, j2, j3);
    }

    public boolean isNativeEqual(NativeHolder nativeHolder) {
        return nativeHolder.mNativePointer == this.mNativePointer;
    }

    public synchronized void release() {
        this.mDestructor.destruct();
    }
}

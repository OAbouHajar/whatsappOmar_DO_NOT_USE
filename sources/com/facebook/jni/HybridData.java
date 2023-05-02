package com.facebook.jni;

import X.AnonymousClass5BC;
import X.C31281dr;

public class HybridData {
    public Destructor mDestructor = new Destructor(this);

    public class Destructor extends AnonymousClass5BC {
        public volatile long mNativePointer;

        public Destructor(Object obj) {
            super(obj);
        }

        public static native void deleteNative(long j2);

        public final void destruct() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0;
        }
    }

    static {
        C31281dr.A01("fbjni");
    }

    public boolean isValid() {
        return this.mDestructor.mNativePointer != 0;
    }

    public synchronized void resetNative() {
        this.mDestructor.destruct();
    }
}

package com.facebook.msys.mci;

import X.AnonymousClass00B;
import com.facebook.simplejni.NativeHolder;

public class TraceInfo {
    public final NativeHolder mNativeHolder;

    public TraceInfo(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public TraceInfo(Integer num, String str) {
        AnonymousClass00B.A06(num);
        AnonymousClass00B.A06(str);
        this.mNativeHolder = initNativeHolder(num, str);
    }

    public static native NativeHolder initNativeHolder(Integer num, String str);

    private native boolean nativeEquals(Object obj);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TraceInfo)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native String getTraceId();

    public native Integer getTraceType();

    public native int hashCode();

    public native String toString();
}

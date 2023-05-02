package com.facebook.msys.mci;

import X.AnonymousClass00B;
import com.facebook.simplejni.NativeHolder;

public class RedactedString {
    public NativeHolder mNativeHolder;

    public RedactedString(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public RedactedString(String str) {
        AnonymousClass00B.A06(str);
        this.mNativeHolder = initNativeHolder(str);
    }

    public RedactedString(String str, int i2) {
        AnonymousClass00B.A06(str);
        this.mNativeHolder = initNativeHolder(str, i2);
    }

    private native boolean equalsNative(Object obj);

    public static native NativeHolder initNativeHolder(String str);

    public static native NativeHolder initNativeHolder(String str, int i2);

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof RedactedString)) {
            return false;
        }
        return equalsNative(obj);
    }

    public native String getOriginalString();

    public native int hashCode();

    public native int leakAllowance();

    public native String toString();
}

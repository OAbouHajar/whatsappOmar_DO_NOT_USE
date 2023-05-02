package com.facebook.msys.mci;

import com.facebook.simplejni.NativeHolder;

public class LoggingOption {
    public final NativeHolder mNativeHolder;

    public LoggingOption(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public LoggingOption(Integer num, TraceInfo traceInfo, Number number, String str) {
        this.mNativeHolder = initNativeHolder(num, traceInfo, number, str);
    }

    public static native NativeHolder initNativeHolder(Integer num, TraceInfo traceInfo, Number number, String str);

    private native boolean nativeEquals(Object obj);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof LoggingOption)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native Number getLocalDataId();

    public native Integer getMessageSource();

    public native String getNavigationChain();

    public native TraceInfo getTraceInfo();

    public native int hashCode();

    public native String toString();
}

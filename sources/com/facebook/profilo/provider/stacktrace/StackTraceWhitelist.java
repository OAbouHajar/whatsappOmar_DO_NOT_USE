package com.facebook.profilo.provider.stacktrace;

import com.facebook.soloader.SoLoader;

public class StackTraceWhitelist {
    static {
        SoLoader.A06("profilo_stacktrace");
    }

    public static native void nativeAddToWhitelist(int i2);

    public static native void nativeRemoveFromWhitelist(int i2);
}

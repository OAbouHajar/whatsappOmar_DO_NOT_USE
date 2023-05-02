package com.facebook.profilo.core;

public final class TraceEvents {
    public static int sLastNameRefreshProvidersState;
    public static volatile int sProviders;

    public static native void nativeClearAllProviders();

    public static native int nativeDisableProviders(int i2);

    public static native int nativeEnableProviders(int i2);

    public static native void nativeRefreshProviderNames(int[] iArr, String[] strArr);
}

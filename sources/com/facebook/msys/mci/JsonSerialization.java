package com.facebook.msys.mci;

import X.C004201v;

public class JsonSerialization {
    public static boolean sInitialized;

    public static synchronized boolean initialize() {
        boolean z2;
        synchronized (JsonSerialization.class) {
            C004201v.A01("JsonSerialization.initialize");
            try {
                if (sInitialized) {
                    z2 = false;
                } else {
                    nativeInitialize();
                    z2 = true;
                    sInitialized = true;
                }
            } finally {
                C004201v.A00();
            }
        }
        return z2;
    }

    public static boolean isMCPEnabledForJsonSerialization() {
        return true;
    }

    public static native void nativeInitialize();
}

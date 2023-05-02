package com.facebook.msys.util;

import X.AnonymousClass00B;

public class Environment {
    public static boolean setenv(String str, String str2) {
        return setenv(str, str2, true);
    }

    public static boolean setenv(String str, String str2, boolean z2) {
        AnonymousClass00B.A06(str);
        AnonymousClass00B.A06(str2);
        return setenvNative(str, str2, z2);
    }

    public static native synchronized boolean setenvNative(String str, String str2, boolean z2);
}

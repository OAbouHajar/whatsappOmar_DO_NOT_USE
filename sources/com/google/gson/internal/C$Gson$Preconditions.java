package com.google.gson.internal;

/* renamed from: com.google.gson.internal.$Gson$Preconditions  reason: invalid class name */
/* compiled from: XFMFile */
public final class C$Gson$Preconditions {
    public static void checkArgument(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    public static <T> T checkNotNull(T t2) {
        t2.getClass();
        return t2;
    }
}

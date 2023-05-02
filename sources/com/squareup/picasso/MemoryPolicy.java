package com.squareup.picasso;

/* compiled from: XFMFile */
public enum MemoryPolicy {
    NO_CACHE(1),
    NO_STORE(2);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f1528a;

    /* access modifiers changed from: public */
    MemoryPolicy(int i2) {
        this.f1528a = i2;
    }

    public static boolean a(int i2) {
        return (i2 & NO_CACHE.f1528a) == 0;
    }
}

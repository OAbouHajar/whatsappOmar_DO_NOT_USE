package com.squareup.picasso;

/* compiled from: XFMFile */
public enum NetworkPolicy {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f1530a;

    /* access modifiers changed from: public */
    NetworkPolicy(int i2) {
        this.f1530a = i2;
    }

    public static boolean isOfflineOnly(int i2) {
        return (i2 & OFFLINE.f1530a) != 0;
    }

    public static boolean shouldReadFromDiskCache(int i2) {
        return (i2 & NO_CACHE.f1530a) == 0;
    }

    public static boolean shouldWriteToDiskCache(int i2) {
        return (i2 & NO_STORE.f1530a) == 0;
    }
}

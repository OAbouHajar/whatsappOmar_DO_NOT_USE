package com.squareup.picasso;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import e.o0;
import e.v;
import e.w;

/* compiled from: XFMFile */
public final class LruCache implements Cache {

    /* renamed from: a  reason: collision with root package name */
    public final v f1526a;

    public LruCache(int i2) {
        this.f1526a = new v(i2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LruCache(@androidx.annotation.NonNull android.content.Context r5) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = e.o0.f1699a
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
            int r5 = r5.flags
            r1 = 1048576(0x100000, float:1.469368E-39)
            r5 = r5 & r1
            if (r5 == 0) goto L_0x0017
            r5 = 1
            goto L_0x0018
        L_0x0017:
            r5 = 0
        L_0x0018:
            if (r5 == 0) goto L_0x001f
            int r5 = r0.getLargeMemoryClass()
            goto L_0x0023
        L_0x001f:
            int r5 = r0.getMemoryClass()
        L_0x0023:
            r0 = 1048576(0x100000, double:5.180654E-318)
            long r2 = (long) r5
            long r2 = r2 * r0
            r0 = 7
            long r2 = r2 / r0
            int r5 = (int) r2
            r4.<init>((int) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.LruCache.<init>(android.content.Context):void");
    }

    public void clear() {
        this.f1526a.evictAll();
    }

    public void clearKeyUri(String str) {
        v vVar = this.f1526a;
        for (String str2 : vVar.snapshot().keySet()) {
            if (str2.startsWith(str) && str2.length() > str.length() && str2.charAt(str.length()) == 10) {
                vVar.remove(str2);
            }
        }
    }

    public int evictionCount() {
        return this.f1526a.evictionCount();
    }

    @Nullable
    public Bitmap get(@NonNull String str) {
        w wVar = (w) this.f1526a.get(str);
        if (wVar != null) {
            return wVar.f1722a;
        }
        return null;
    }

    public int hitCount() {
        return this.f1526a.hitCount();
    }

    public int maxSize() {
        return this.f1526a.maxSize();
    }

    public int missCount() {
        return this.f1526a.missCount();
    }

    public int putCount() {
        return this.f1526a.putCount();
    }

    public void set(@NonNull String str, @NonNull Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        StringBuilder sb = o0.f1699a;
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount >= 0) {
            int maxSize = maxSize();
            v vVar = this.f1526a;
            if (allocationByteCount > maxSize) {
                vVar.remove(str);
            } else {
                vVar.put(str, new w(bitmap, allocationByteCount));
            }
        } else {
            throw new IllegalStateException("Negative size: " + bitmap);
        }
    }

    public int size() {
        return this.f1526a.size();
    }
}

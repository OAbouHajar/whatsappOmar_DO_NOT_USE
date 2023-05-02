package com.squareup.picasso;

import androidx.annotation.NonNull;
import java.io.File;
import java.io.IOException;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: XFMFile */
public final class OkHttp3Downloader implements Downloader {

    /* renamed from: a  reason: collision with root package name */
    public final Call.Factory f1531a;

    /* renamed from: b  reason: collision with root package name */
    public final Cache f1532b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f1533c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OkHttp3Downloader(android.content.Context r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = e.o0.f1699a
            java.io.File r0 = new java.io.File
            android.content.Context r3 = r3.getApplicationContext()
            java.io.File r3 = r3.getCacheDir()
            java.lang.String r1 = "picasso-cache"
            r0.<init>(r3, r1)
            boolean r3 = r0.exists()
            if (r3 != 0) goto L_0x001a
            r0.mkdirs()
        L_0x001a:
            r2.<init>((java.io.File) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.OkHttp3Downloader.<init>(android.content.Context):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OkHttp3Downloader(android.content.Context r3, long r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = e.o0.f1699a
            java.io.File r0 = new java.io.File
            android.content.Context r3 = r3.getApplicationContext()
            java.io.File r3 = r3.getCacheDir()
            java.lang.String r1 = "picasso-cache"
            r0.<init>(r3, r1)
            boolean r3 = r0.exists()
            if (r3 != 0) goto L_0x001a
            r0.mkdirs()
        L_0x001a:
            r2.<init>((java.io.File) r0, (long) r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.OkHttp3Downloader.<init>(android.content.Context, long):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public OkHttp3Downloader(java.io.File r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = e.o0.f1699a
            r0 = 5242880(0x500000, double:2.590327E-317)
            android.os.StatFs r2 = new android.os.StatFs     // Catch:{ IllegalArgumentException -> 0x001c }
            java.lang.String r3 = r8.getAbsolutePath()     // Catch:{ IllegalArgumentException -> 0x001c }
            r2.<init>(r3)     // Catch:{ IllegalArgumentException -> 0x001c }
            long r3 = r2.getBlockCountLong()     // Catch:{ IllegalArgumentException -> 0x001c }
            long r5 = r2.getBlockSizeLong()     // Catch:{ IllegalArgumentException -> 0x001c }
            long r3 = r3 * r5
            r5 = 50
            long r3 = r3 / r5
            goto L_0x001d
        L_0x001c:
            r3 = r0
        L_0x001d:
            r5 = 52428800(0x3200000, double:2.5903269E-316)
            long r2 = java.lang.Math.min(r3, r5)
            long r0 = java.lang.Math.max(r2, r0)
            r7.<init>((java.io.File) r8, (long) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.OkHttp3Downloader.<init>(java.io.File):void");
    }

    public OkHttp3Downloader(File file, long j2) {
        this(new OkHttpClient.Builder().cache(new Cache(file, j2)).build());
        this.f1533c = false;
    }

    public OkHttp3Downloader(Call.Factory factory) {
        this.f1533c = true;
        this.f1531a = factory;
        this.f1532b = null;
    }

    public OkHttp3Downloader(OkHttpClient okHttpClient) {
        this.f1533c = true;
        this.f1531a = okHttpClient;
        this.f1532b = okHttpClient.cache();
    }

    @NonNull
    public Response load(@NonNull Request request) {
        return this.f1531a.newCall(request).execute();
    }

    public void shutdown() {
        Cache cache;
        if (!this.f1533c && (cache = this.f1532b) != null) {
            try {
                cache.close();
            } catch (IOException unused) {
            }
        }
    }
}

package X;

/* renamed from: X.1dW  reason: invalid class name and case insensitive filesystem */
public class C31131dW {
    public static boolean A00;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005c A[Catch:{ all -> 0x00a9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A00(android.content.Context r9) {
        /*
            java.lang.Class<X.1dW> r8 = X.C31131dW.class
            monitor-enter(r8)
            boolean r0 = A00     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = "whatsappsoloader/init: already initialized"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00b4 }
            goto L_0x009f
        L_0x000f:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00b4 }
            r0 = 23
            r7 = 0
            if (r1 >= r0) goto L_0x0035
            java.lang.String r1 = X.AnonymousClass1U8.A02()     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = "armeabi-v7a"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x00b4 }
            if (r0 != 0) goto L_0x0035
            java.lang.String r0 = "x86"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x00b4 }
            if (r0 != 0) goto L_0x0035
            X.1C3 r1 = X.AnonymousClass1C3.A00()     // Catch:{ all -> 0x00b4 }
            java.lang.String[] r0 = com.facebook.soloader.SoLoader.A0C     // Catch:{ all -> 0x00b4 }
            com.facebook.soloader.SoLoader.A01(r9, r1, r0, r7)     // Catch:{ all -> 0x00b4 }
            goto L_0x0038
        L_0x0035:
            com.facebook.soloader.SoLoader.init(r9, r7)     // Catch:{ all -> 0x00b4 }
        L_0x0038:
            r3 = 1
            java.io.File r2 = r9.getFilesDir()     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "decompressed/libs.spk.zst"
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x00b2 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x00b2 }
            java.lang.String[] r0 = new java.lang.String[r7]     // Catch:{ all -> 0x00b4 }
            X.1dc r5 = new X.1dc     // Catch:{ all -> 0x00b4 }
            r5.<init>(r1, r0, r3)     // Catch:{ all -> 0x00b4 }
            java.lang.String r4 = "SoLoader"
            java.util.concurrent.locks.ReentrantReadWriteLock r6 = com.facebook.soloader.SoLoader.A0A     // Catch:{ all -> 0x00b4 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r6.writeLock()     // Catch:{ all -> 0x00b4 }
            r0.lock()     // Catch:{ all -> 0x00b4 }
            boolean r0 = com.facebook.soloader.SoLoader.A03()     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x00a1
            int r0 = com.facebook.soloader.SoLoader.A00()     // Catch:{ all -> 0x00a9 }
            r5.A01(r0)     // Catch:{ all -> 0x00a9 }
            X.1de[] r0 = com.facebook.soloader.SoLoader.A0D     // Catch:{ all -> 0x00a9 }
            int r0 = r0.length     // Catch:{ all -> 0x00a9 }
            int r0 = r0 + 1
            X.1de[] r2 = new X.C31181de[r0]     // Catch:{ all -> 0x00a9 }
            r2[r7] = r5     // Catch:{ all -> 0x00a9 }
            X.1de[] r1 = com.facebook.soloader.SoLoader.A0D     // Catch:{ all -> 0x00a9 }
            X.1de[] r0 = com.facebook.soloader.SoLoader.A0D     // Catch:{ all -> 0x00a9 }
            int r0 = r0.length     // Catch:{ all -> 0x00a9 }
            java.lang.System.arraycopy(r1, r7, r2, r3, r0)     // Catch:{ all -> 0x00a9 }
            com.facebook.soloader.SoLoader.A0D = r2     // Catch:{ all -> 0x00a9 }
            java.util.concurrent.atomic.AtomicInteger r0 = com.facebook.soloader.SoLoader.A09     // Catch:{ all -> 0x00a9 }
            r0.getAndIncrement()     // Catch:{ all -> 0x00a9 }
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r4, r0)     // Catch:{ all -> 0x00a9 }
            if (r0 == 0) goto L_0x0096
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            r1.<init>()     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "Prepended to SO sources: "
            r1.append(r0)     // Catch:{ all -> 0x00a9 }
            r1.append(r5)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00a9 }
            android.util.Log.d(r4, r0)     // Catch:{ all -> 0x00a9 }
        L_0x0096:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r6.writeLock()     // Catch:{ all -> 0x00b4 }
            r0.unlock()     // Catch:{ all -> 0x00b4 }
            A00 = r3     // Catch:{ all -> 0x00b4 }
        L_0x009f:
            monitor-exit(r8)
            return
        L_0x00a1:
            java.lang.String r1 = "SoLoader.init() not yet called"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00a9 }
            r0.<init>(r1)     // Catch:{ all -> 0x00a9 }
            throw r0     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r6.writeLock()     // Catch:{ all -> 0x00b4 }
            r0.unlock()     // Catch:{ all -> 0x00b4 }
            throw r1     // Catch:{ all -> 0x00b4 }
        L_0x00b2:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31131dW.A00(android.content.Context):void");
    }
}

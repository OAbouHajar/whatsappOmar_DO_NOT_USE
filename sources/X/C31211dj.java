package X;

import java.lang.reflect.Method;

/* renamed from: X.1dj  reason: invalid class name and case insensitive filesystem */
public class C31211dj implements AnonymousClass1C4 {
    public final /* synthetic */ Runtime A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Method A03;
    public final /* synthetic */ boolean A04;

    public C31211dj(Runtime runtime, String str, String str2, Method method, boolean z2) {
        this.A04 = z2;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = runtime;
        this.A03 = method;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x00a8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AKC(java.lang.String r13, int r14) {
        /*
            r12 = this;
            boolean r0 = r12.A04
            if (r0 == 0) goto L_0x00c3
            r1 = 4
            r0 = r14 & 4
            r6 = 1
            r3 = 0
            if (r0 != r1) goto L_0x000f
            java.lang.String r8 = r12.A01
        L_0x000d:
            r5 = 0
            goto L_0x0012
        L_0x000f:
            java.lang.String r8 = r12.A02
            goto L_0x000d
        L_0x0012:
            java.lang.Runtime r4 = r12.A00     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0040, all -> 0x00c1 }
            monitor-enter(r4)     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x0040, all -> 0x00c1 }
            java.lang.reflect.Method r2 = r12.A03     // Catch:{ all -> 0x0037 }
            r0 = 3
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0037 }
            r1[r3] = r13     // Catch:{ all -> 0x0037 }
            java.lang.Class<com.facebook.soloader.SoLoader> r0 = com.facebook.soloader.SoLoader.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ all -> 0x0037 }
            r1[r6] = r0     // Catch:{ all -> 0x0037 }
            r0 = 2
            r1[r0] = r8     // Catch:{ all -> 0x0037 }
            java.lang.Object r3 = r2.invoke(r4, r1)     // Catch:{ all -> 0x0037 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0037 }
            if (r3 != 0) goto L_0x0031
            monitor-exit(r4)     // Catch:{ all -> 0x003b }
            return
        L_0x0031:
            java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError     // Catch:{ all -> 0x003b }
            r0.<init>(r3)     // Catch:{ all -> 0x003b }
            throw r0     // Catch:{ all -> 0x003b }
        L_0x0037:
            r0 = move-exception
            r3 = r5
        L_0x0039:
            monitor-exit(r4)     // Catch:{ all -> 0x003b }
            goto L_0x003d
        L_0x003b:
            r0 = move-exception
            goto L_0x0039
        L_0x003d:
            throw r0     // Catch:{ IllegalAccessException | IllegalArgumentException | InvocationTargetException -> 0x003e }
        L_0x003e:
            r2 = move-exception
            goto L_0x0042
        L_0x0040:
            r2 = move-exception
            r3 = r5
        L_0x0042:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0059 }
            r1.<init>()     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = "Error: Cannot load "
            r1.append(r0)     // Catch:{ all -> 0x0059 }
            r1.append(r13)     // Catch:{ all -> 0x0059 }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x0059 }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0059 }
            r0.<init>(r3, r2)     // Catch:{ all -> 0x0059 }
            throw r0     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r11 = move-exception
            if (r3 == 0) goto L_0x00c2
            java.lang.String r7 = "SoLoader"
            java.lang.String r0 = "Error when loading lib: "
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            r6.append(r3)
            java.lang.String r0 = " lib hash: "
            r6.append(r0)
            java.io.File r1 = new java.io.File     // Catch:{ IOException | SecurityException | NoSuchAlgorithmException -> 0x00a9 }
            r1.<init>(r13)     // Catch:{ IOException | SecurityException | NoSuchAlgorithmException -> 0x00a9 }
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r10 = java.security.MessageDigest.getInstance(r0)     // Catch:{ IOException | SecurityException | NoSuchAlgorithmException -> 0x00a9 }
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ IOException | SecurityException | NoSuchAlgorithmException -> 0x00a9 }
            r9.<init>(r1)     // Catch:{ IOException | SecurityException | NoSuchAlgorithmException -> 0x00a9 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x00a4 }
        L_0x0081:
            int r0 = r9.read(r1)     // Catch:{ all -> 0x00a4 }
            r5 = 0
            if (r0 <= 0) goto L_0x008c
            r10.update(r1, r5, r0)     // Catch:{ all -> 0x00a4 }
            goto L_0x0081
        L_0x008c:
            java.lang.String r4 = "%32x"
            r3 = 1
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch:{ all -> 0x00a4 }
            byte[] r1 = r10.digest()     // Catch:{ all -> 0x00a4 }
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch:{ all -> 0x00a4 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x00a4 }
            r2[r5] = r0     // Catch:{ all -> 0x00a4 }
            java.lang.String r0 = java.lang.String.format(r4, r2)     // Catch:{ all -> 0x00a4 }
            r9.close()     // Catch:{ IOException | SecurityException | NoSuchAlgorithmException -> 0x00a9 }
            goto L_0x00ae
        L_0x00a4:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            throw r0     // Catch:{ IOException | SecurityException | NoSuchAlgorithmException -> 0x00a9 }
        L_0x00a9:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
        L_0x00ae:
            r6.append(r0)
            java.lang.String r0 = " search path is "
            r6.append(r0)
            r6.append(r8)
            java.lang.String r0 = r6.toString()
            android.util.Log.e(r7, r0)
            throw r11
        L_0x00c1:
            r11 = move-exception
        L_0x00c2:
            throw r11
        L_0x00c3:
            java.lang.System.load(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31211dj.AKC(java.lang.String, int):void");
    }

    public void AKE(C31121dV r2, String str, int i2) {
        throw new UnsupportedOperationException();
    }
}

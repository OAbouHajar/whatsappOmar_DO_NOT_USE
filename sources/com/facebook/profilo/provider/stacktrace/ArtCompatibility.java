package com.facebook.profilo.provider.stacktrace;

import com.facebook.soloader.SoLoader;
import java.util.concurrent.atomic.AtomicReference;

public class ArtCompatibility {
    public static final AtomicReference sIsCompatible = new AtomicReference((Object) null);

    static {
        SoLoader.A06("profilo_stacktrace");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e8, code lost:
        if (r1.equals("7.1") != false) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ea, code lost:
        r5 = nativeCheck(64);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f7, code lost:
        if (r1.equals("7.0") != false) goto L_0x00f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f9, code lost:
        r5 = nativeCheck(32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0106, code lost:
        if (r1.equals("6.0") != false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0108, code lost:
        r5 = nativeCheck(16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0113, code lost:
        if (r1.equals("5.1") != false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0115, code lost:
        r5 = nativeCheck(2048);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0122, code lost:
        if (r1.equals("5.0") != false) goto L_0x0124;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0124, code lost:
        r5 = nativeCheck(1024);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0131, code lost:
        if (r1.equals("9") != false) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0133, code lost:
        r5 = nativeCheck(16384);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0139, code lost:
        r1 = new java.io.FileOutputStream(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0141, code lost:
        r0 = 48;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0143, code lost:
        if (r5 == false) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0145, code lost:
        r0 = 49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        r1.write(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0166, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:94:0x016a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isCompatible(android.content.Context r7) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r6 = 0
            r0 = 21
            if (r1 >= r0) goto L_0x0008
            return r6
        L_0x0008:
            java.util.concurrent.atomic.AtomicReference r2 = sIsCompatible
            java.lang.Object r0 = r2.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0017
            boolean r5 = r0.booleanValue()
        L_0x0016:
            return r5
        L_0x0017:
            java.io.File r3 = r7.getFilesDir()     // Catch:{ IOException -> 0x016b }
            java.lang.String r0 = "ProfiloArtUnwindcCompat_"
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)     // Catch:{ IOException -> 0x016b }
            java.lang.String r1 = android.os.Build.VERSION.RELEASE     // Catch:{ IOException -> 0x016b }
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)     // Catch:{ IOException -> 0x016b }
            java.io.File r3 = X.C13700nu.A0C(r3, r0)     // Catch:{ IOException -> 0x016b }
            boolean r0 = r3.exists()     // Catch:{ IOException -> 0x016b }
            if (r0 == 0) goto L_0x0045
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x016b }
            r4.<init>(r3)     // Catch:{ IOException -> 0x016b }
            int r1 = r4.read()     // Catch:{ all -> 0x0161 }
            r0 = 49
            boolean r5 = X.AnonymousClass000.A1R(r1, r0)
            r4.close()     // Catch:{ IOException -> 0x016b }
            goto L_0x014d
        L_0x0045:
            int r0 = r1.hashCode()     // Catch:{ IOException -> 0x016b }
            r4 = 16
            switch(r0) {
                case 57: goto L_0x012b;
                case 52407: goto L_0x011c;
                case 52408: goto L_0x010d;
                case 53368: goto L_0x0100;
                case 54329: goto L_0x00f1;
                case 54330: goto L_0x00e2;
                case 56251: goto L_0x00d9;
                case 50364602: goto L_0x00d0;
                case 50364603: goto L_0x00c7;
                case 50365562: goto L_0x00be;
                case 50365563: goto L_0x00b5;
                case 51288123: goto L_0x00ac;
                case 52211643: goto L_0x00a3;
                case 52212604: goto L_0x009a;
                case 52212605: goto L_0x008a;
                case 52212606: goto L_0x007a;
                case 53135164: goto L_0x006a;
                case 53136125: goto L_0x005a;
                case 54058685: goto L_0x0050;
                default: goto L_0x004e;
            }     // Catch:{ IOException -> 0x016b }
        L_0x004e:
            goto L_0x013f
        L_0x0050:
            java.lang.String r0 = "9.0.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016b }
            if (r0 == 0) goto L_0x013f
            goto L_0x0133
        L_0x005a:
            java.lang.String r0 = "8.1.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016b }
            if (r0 == 0) goto L_0x013f
            r0 = 8192(0x2000, float:1.14794E-41)
            boolean r5 = nativeCheck(r0)     // Catch:{ IOException -> 0x016b }
            goto L_0x0139
        L_0x006a:
            java.lang.String r0 = "8.0.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016b }
            if (r0 == 0) goto L_0x013f
            r0 = 4096(0x1000, float:5.74E-42)
            boolean r5 = nativeCheck(r0)     // Catch:{ IOException -> 0x016b }
            goto L_0x0139
        L_0x007a:
            java.lang.String r0 = "7.1.2"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016b }
            if (r0 == 0) goto L_0x013f
            r0 = 256(0x100, float:3.59E-43)
            boolean r5 = nativeCheck(r0)     // Catch:{ IOException -> 0x016b }
            goto L_0x0139
        L_0x008a:
            java.lang.String r0 = "7.1.1"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016b }
            if (r0 == 0) goto L_0x013f
            r0 = 128(0x80, float:1.794E-43)
            boolean r5 = nativeCheck(r0)     // Catch:{ IOException -> 0x016b }
            goto L_0x0139
        L_0x009a:
            java.lang.String r0 = "7.1.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016b }
            if (r0 == 0) goto L_0x013f
            goto L_0x00ea
        L_0x00a3:
            java.lang.String r0 = "7.0.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016b }
            if (r0 == 0) goto L_0x013f
            goto L_0x00f9
        L_0x00ac:
            java.lang.String r0 = "6.0.1"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016b }
            if (r0 == 0) goto L_0x013f
            goto L_0x0108
        L_0x00b5:
            java.lang.String r0 = "5.1.1"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016b }
            if (r0 == 0) goto L_0x013f
            goto L_0x0115
        L_0x00be:
            java.lang.String r0 = "5.1.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016b }
            if (r0 == 0) goto L_0x013f
            goto L_0x0115
        L_0x00c7:
            java.lang.String r0 = "5.0.2"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016b }
            if (r0 == 0) goto L_0x013f
            goto L_0x0124
        L_0x00d0:
            java.lang.String r0 = "5.0.1"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016b }
            if (r0 == 0) goto L_0x013f
            goto L_0x0124
        L_0x00d9:
            java.lang.String r0 = "9.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016b }
            if (r0 == 0) goto L_0x013f
            goto L_0x0133
        L_0x00e2:
            java.lang.String r0 = "7.1"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016b }
            if (r0 == 0) goto L_0x013f
        L_0x00ea:
            r0 = 64
            boolean r5 = nativeCheck(r0)     // Catch:{ IOException -> 0x016b }
            goto L_0x0139
        L_0x00f1:
            java.lang.String r0 = "7.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016b }
            if (r0 == 0) goto L_0x013f
        L_0x00f9:
            r0 = 32
            boolean r5 = nativeCheck(r0)     // Catch:{ IOException -> 0x016b }
            goto L_0x0139
        L_0x0100:
            java.lang.String r0 = "6.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016b }
            if (r0 == 0) goto L_0x013f
        L_0x0108:
            boolean r5 = nativeCheck(r4)     // Catch:{ IOException -> 0x016b }
            goto L_0x0139
        L_0x010d:
            java.lang.String r0 = "5.1"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016b }
            if (r0 == 0) goto L_0x013f
        L_0x0115:
            r0 = 2048(0x800, float:2.87E-42)
            boolean r5 = nativeCheck(r0)     // Catch:{ IOException -> 0x016b }
            goto L_0x0139
        L_0x011c:
            java.lang.String r0 = "5.0"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016b }
            if (r0 == 0) goto L_0x013f
        L_0x0124:
            r0 = 1024(0x400, float:1.435E-42)
            boolean r5 = nativeCheck(r0)     // Catch:{ IOException -> 0x016b }
            goto L_0x0139
        L_0x012b:
            java.lang.String r0 = "9"
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x016b }
            if (r0 == 0) goto L_0x013f
        L_0x0133:
            r0 = 16384(0x4000, float:2.2959E-41)
            boolean r5 = nativeCheck(r0)     // Catch:{ IOException -> 0x016b }
        L_0x0139:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x016b }
            r1.<init>(r3)     // Catch:{ IOException -> 0x016b }
            goto L_0x0141
        L_0x013f:
            r5 = 0
            goto L_0x0139
        L_0x0141:
            r0 = 48
            if (r5 == 0) goto L_0x0147
            r0 = 49
        L_0x0147:
            r1.write(r0)     // Catch:{ all -> 0x0166 }
            r1.close()     // Catch:{ IOException -> 0x016b }
        L_0x014d:
            r1 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ IOException -> 0x016b }
            boolean r0 = r2.compareAndSet(r1, r0)     // Catch:{ IOException -> 0x016b }
            if (r0 != 0) goto L_0x0016
            java.lang.Object r0 = r2.get()     // Catch:{ IOException -> 0x016b }
            boolean r5 = X.AnonymousClass000.A1X(r0)     // Catch:{ IOException -> 0x016b }
            return r5
        L_0x0161:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x016a }
            goto L_0x016a
        L_0x0166:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x016a }
        L_0x016a:
            throw r0     // Catch:{ IOException -> 0x016b }
        L_0x016b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.ArtCompatibility.isCompatible(android.content.Context):boolean");
    }

    public static native boolean nativeCheck(int i2);
}

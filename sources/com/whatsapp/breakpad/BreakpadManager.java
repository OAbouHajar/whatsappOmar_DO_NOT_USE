package com.whatsapp.breakpad;

import java.io.File;

public class BreakpadManager {
    public static File A00;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        if (r1.startsWith("0.") != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A00(android.content.Context r10) {
        /*
            java.lang.Class<com.whatsapp.breakpad.BreakpadManager> r4 = com.whatsapp.breakpad.BreakpadManager.class
            monitor-enter(r4)
            java.io.File r0 = A00     // Catch:{ all -> 0x004f }
            r1 = 0
            if (r0 != 0) goto L_0x0009
            r1 = 1
        L_0x0009:
            java.lang.String r0 = "breakpad/initialized more than once"
            X.AnonymousClass00B.A0B(r0, r1)     // Catch:{ all -> 0x004f }
            java.io.File r3 = X.C32611gp.A00(r10)     // Catch:{ all -> 0x004f }
            java.lang.String r5 = r3.getAbsolutePath()     // Catch:{ all -> 0x004f }
            java.lang.String r6 = r10.getPackageCodePath()     // Catch:{ all -> 0x004f }
            java.io.File r2 = r10.getFilesDir()     // Catch:{ all -> 0x004f }
            java.lang.String r1 = "decompressed/libs.spk.zst"
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x004f }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x004f }
            java.lang.String r7 = r0.getAbsolutePath()     // Catch:{ all -> 0x004f }
            java.lang.String r8 = X.C17080uV.A08     // Catch:{ all -> 0x004f }
            java.lang.String r0 = "java.vm.version"
            java.lang.String r1 = java.lang.System.getProperty(r0)     // Catch:{ all -> 0x004f }
            if (r1 == 0) goto L_0x0044
            java.lang.String r0 = "1."
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x004f }
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "0."
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x004f }
            r9 = 1
            if (r0 == 0) goto L_0x0045
        L_0x0044:
            r9 = 0
        L_0x0045:
            r10 = 1536000(0x177000, float:2.152394E-39)
            setUpBreakpad(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x004f }
            A00 = r3     // Catch:{ all -> 0x004f }
            monitor-exit(r4)
            return
        L_0x004f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.breakpad.BreakpadManager.A00(android.content.Context):void");
    }

    public static native boolean crashThisProcess();

    public static native boolean overwriteBuffer(String str);

    public static native void panicInRust();

    public static native boolean setUpBreakpad(String str, String str2, String str3, String str4, boolean z2, int i2);

    public static native void sigsegvCRustC();

    public static native void sigsegvInRust();
}

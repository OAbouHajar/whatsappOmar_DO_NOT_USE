package com.facebook.profilo.provider.stacktrace;

import com.facebook.profilo.logger.MultiBufferLogger;
import com.facebook.soloader.SoLoader;

public class CPUProfiler {
    public static volatile int sAvailableTracers;
    public static volatile boolean sInitialized;

    static {
        SoLoader.A06("profilo_stacktrace");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        r0 = r1.equals(r0);
        r3 = 1024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004f, code lost:
        r0 = r1.equals(r0);
        r3 = 2048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0058, code lost:
        r0 = r1.equals(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005f, code lost:
        r0 = r1.equals(r0);
        r3 = 64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        r0 = r1.equals(r0);
        r3 = 16384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0092, code lost:
        if (r0 != false) goto L_0x0097;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean init(android.content.Context r6, com.facebook.profilo.logger.MultiBufferLogger r7, boolean r8, int r9, int r10, boolean r11) {
        /*
            java.lang.Class<com.facebook.profilo.provider.stacktrace.CPUProfiler> r4 = com.facebook.profilo.provider.stacktrace.CPUProfiler.class
            monitor-enter(r4)
            boolean r0 = sInitialized     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x0009
            goto L_0x00b1
        L_0x0009:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00b4 }
            r3 = 16
            r0 = 21
            if (r2 >= r0) goto L_0x0013
            goto L_0x0096
        L_0x0013:
            boolean r0 = com.facebook.profilo.provider.stacktrace.ArtCompatibility.isCompatible(r6)     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x0094
            java.lang.String r1 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x00b4 }
            int r0 = r1.hashCode()     // Catch:{ all -> 0x00b4 }
            switch(r0) {
                case 57: goto L_0x0023;
                case 52407: goto L_0x0026;
                case 52408: goto L_0x0029;
                case 53368: goto L_0x002c;
                case 54329: goto L_0x002f;
                case 54330: goto L_0x0038;
                case 56251: goto L_0x003b;
                case 50364602: goto L_0x003e;
                case 50364603: goto L_0x0041;
                case 50365562: goto L_0x004a;
                case 50365563: goto L_0x004d;
                case 51288123: goto L_0x0056;
                case 52212604: goto L_0x005d;
                case 52212605: goto L_0x0066;
                case 52212606: goto L_0x006f;
                case 53135164: goto L_0x0078;
                case 53136125: goto L_0x0081;
                case 54058685: goto L_0x008a;
                default: goto L_0x0022;
            }     // Catch:{ all -> 0x00b4 }
        L_0x0022:
            goto L_0x0094
        L_0x0023:
            java.lang.String r0 = "9"
            goto L_0x008c
        L_0x0026:
            java.lang.String r0 = "5.0"
            goto L_0x0043
        L_0x0029:
            java.lang.String r0 = "5.1"
            goto L_0x004f
        L_0x002c:
            java.lang.String r0 = "6.0"
            goto L_0x0058
        L_0x002f:
            java.lang.String r0 = "7.0"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00b4 }
            r3 = 32
            goto L_0x0092
        L_0x0038:
            java.lang.String r0 = "7.1"
            goto L_0x005f
        L_0x003b:
            java.lang.String r0 = "9.0"
            goto L_0x008c
        L_0x003e:
            java.lang.String r0 = "5.0.1"
            goto L_0x0043
        L_0x0041:
            java.lang.String r0 = "5.0.2"
        L_0x0043:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00b4 }
            r3 = 1024(0x400, float:1.435E-42)
            goto L_0x0092
        L_0x004a:
            java.lang.String r0 = "5.1.0"
            goto L_0x004f
        L_0x004d:
            java.lang.String r0 = "5.1.1"
        L_0x004f:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00b4 }
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0092
        L_0x0056:
            java.lang.String r0 = "6.0.1"
        L_0x0058:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00b4 }
            goto L_0x0092
        L_0x005d:
            java.lang.String r0 = "7.1.0"
        L_0x005f:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00b4 }
            r3 = 64
            goto L_0x0092
        L_0x0066:
            java.lang.String r0 = "7.1.1"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00b4 }
            r3 = 128(0x80, float:1.794E-43)
            goto L_0x0092
        L_0x006f:
            java.lang.String r0 = "7.1.2"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00b4 }
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0092
        L_0x0078:
            java.lang.String r0 = "8.0.0"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00b4 }
            r3 = 4096(0x1000, float:5.74E-42)
            goto L_0x0092
        L_0x0081:
            java.lang.String r0 = "8.1.0"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00b4 }
            r3 = 8192(0x2000, float:1.14794E-41)
            goto L_0x0092
        L_0x008a:
            java.lang.String r0 = "9.0.0"
        L_0x008c:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00b4 }
            r3 = 16384(0x4000, float:2.2959E-41)
        L_0x0092:
            if (r0 != 0) goto L_0x0097
        L_0x0094:
            r3 = 0
            goto L_0x0097
        L_0x0096:
            r3 = 1
        L_0x0097:
            r1 = r3 | 512(0x200, float:7.175E-43)
            r0 = 26
            if (r2 < r0) goto L_0x009f
            r1 = r1 | 4
        L_0x009f:
            sAvailableTracers = r1     // Catch:{ all -> 0x00b4 }
            int r6 = sAvailableTracers     // Catch:{ all -> 0x00b4 }
            r5 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            boolean r0 = nativeInitialize(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00b4 }
            sInitialized = r0     // Catch:{ all -> 0x00b4 }
            boolean r0 = sInitialized     // Catch:{ all -> 0x00b4 }
            goto L_0x00b2
        L_0x00b1:
            r0 = 1
        L_0x00b2:
            monitor-exit(r4)
            return r0
        L_0x00b4:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.CPUProfiler.init(android.content.Context, com.facebook.profilo.logger.MultiBufferLogger, boolean, int, int, boolean):boolean");
    }

    public static native boolean nativeInitialize(MultiBufferLogger multiBufferLogger, int i2, boolean z2, int i3, int i4, boolean z3);

    public static native void nativeLoggerLoop();

    public static native void nativeResetFrameworkNamesSet();

    public static native boolean nativeStartProfiling(int i2, int i3, int i4, boolean z2, boolean z3);

    public static native void nativeStopProfiling();
}

package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* renamed from: X.3Mg  reason: invalid class name and case insensitive filesystem */
public final class C63973Mg extends Surface {
    public static int A02;
    public static boolean A03;
    public boolean A00;
    public final AnonymousClass3M5 A01;

    public C63973Mg(SurfaceTexture surfaceTexture, AnonymousClass3M5 r2) {
        super(surfaceTexture);
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (A01(r5) != false) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C63973Mg A00(android.content.Context r5, boolean r6) {
        /*
            r4 = 0
            if (r6 == 0) goto L_0x000a
            boolean r1 = A01(r5)
            r0 = 0
            if (r1 == 0) goto L_0x000b
        L_0x000a:
            r0 = 1
        L_0x000b:
            X.C90524eJ.A04(r0)
            X.3M5 r3 = new X.3M5
            r3.<init>()
            if (r6 == 0) goto L_0x0017
            int r4 = A02
        L_0x0017:
            r3.start()
            android.os.Looper r0 = r3.getLooper()
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0, r3)
            r3.A00 = r1
            X.56c r0 = new X.56c
            r0.<init>(r1)
            r3.A01 = r0
            monitor-enter(r3)
            android.os.Handler r2 = r3.A00     // Catch:{ all -> 0x005f }
            r0 = 1
            r1 = 0
            android.os.Message r0 = r2.obtainMessage(r0, r4, r1)     // Catch:{ all -> 0x005f }
            r0.sendToTarget()     // Catch:{ all -> 0x005f }
        L_0x0038:
            X.3Mg r0 = r3.A02     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x004a
            java.lang.RuntimeException r0 = r3.A04     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x004a
            java.lang.Error r0 = r3.A03     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x004a
            r3.wait()     // Catch:{ InterruptedException -> 0x0048 }
            goto L_0x0038
        L_0x0048:
            r1 = 1
            goto L_0x0038
        L_0x004a:
            monitor-exit(r3)     // Catch:{ all -> 0x005f }
            if (r1 == 0) goto L_0x0054
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0054:
            java.lang.RuntimeException r0 = r3.A04
            if (r0 != 0) goto L_0x0061
            java.lang.Error r0 = r3.A03
            if (r0 != 0) goto L_0x0061
            X.3Mg r0 = r3.A02
            return r0
        L_0x005f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x005f }
        L_0x0061:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63973Mg.A00(android.content.Context, boolean):X.3Mg");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        if (r1.contains("EGL_KHR_surfaceless_context") == false) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean A01(android.content.Context r5) {
        /*
            java.lang.Class<X.3Mg> r4 = X.C63973Mg.class
            monitor-enter(r4)
            boolean r0 = A03     // Catch:{ all -> 0x006b }
            r3 = 1
            if (r0 != 0) goto L_0x0064
            int r1 = X.AnonymousClass3C1.A01     // Catch:{ all -> 0x006b }
            r2 = 0
            r0 = 24
            if (r1 < r0) goto L_0x005f
            r0 = 26
            if (r1 >= r0) goto L_0x0034
            java.lang.String r1 = X.AnonymousClass3C1.A04     // Catch:{ all -> 0x006b }
            java.lang.String r0 = "samsung"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x005f
            java.lang.String r1 = X.AnonymousClass3C1.A05     // Catch:{ all -> 0x006b }
            java.lang.String r0 = "XT1650"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x005f
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch:{ all -> 0x006b }
            java.lang.String r0 = "android.hardware.vr.high_performance"
            boolean r0 = r1.hasSystemFeature(r0)     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x0034
            goto L_0x005f
        L_0x0034:
            android.opengl.EGLDisplay r1 = android.opengl.EGL14.eglGetDisplay(r2)     // Catch:{ all -> 0x006b }
            r0 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r1 = android.opengl.EGL14.eglQueryString(r1, r0)     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x005f
            java.lang.String r0 = "EGL_EXT_protected_content"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x005f
            android.opengl.EGLDisplay r1 = android.opengl.EGL14.eglGetDisplay(r2)     // Catch:{ all -> 0x006b }
            r0 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r1 = android.opengl.EGL14.eglQueryString(r1, r0)     // Catch:{ all -> 0x006b }
            if (r1 == 0) goto L_0x005d
            java.lang.String r0 = "EGL_KHR_surfaceless_context"
            boolean r1 = r1.contains(r0)     // Catch:{ all -> 0x006b }
            r0 = 1
            if (r1 != 0) goto L_0x0060
        L_0x005d:
            r0 = 2
            goto L_0x0060
        L_0x005f:
            r0 = 0
        L_0x0060:
            A02 = r0     // Catch:{ all -> 0x006b }
            A03 = r3     // Catch:{ all -> 0x006b }
        L_0x0064:
            int r0 = A02     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x0069
            r3 = 0
        L_0x0069:
            monitor-exit(r4)
            return r3
        L_0x006b:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63973Mg.A01(android.content.Context):boolean");
    }

    public void release() {
        super.release();
        AnonymousClass3M5 r2 = this.A01;
        synchronized (r2) {
            if (!this.A00) {
                r2.A00.sendEmptyMessage(2);
                this.A00 = true;
            }
        }
    }
}

package X;

import android.content.Context;

/* renamed from: X.4o5  reason: invalid class name and case insensitive filesystem */
public class C96284o5 implements C108225Nd {
    public int A00 = 0;
    public C109725Ti A01 = C109725Ti.A00;
    public final Context A02;

    public C96284o5(Context context) {
        this.A02 = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0106, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x010e, code lost:
        throw new java.lang.RuntimeException("Error instantiating Opus extension", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x013a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0142, code lost:
        throw new java.lang.RuntimeException("Error instantiating FLAC extension", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x006b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0073, code lost:
        throw new java.lang.RuntimeException("Error instantiating VP9 extension", r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0106 A[ExcHandler: Exception (r2v11 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:24:0x00e3] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x013a A[ExcHandler: Exception (r2v8 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:36:0x0113] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x006b A[ExcHandler: Exception (r2v14 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:3:0x0038] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass5UO[] A7X(android.os.Handler r26, X.AnonymousClass5TI r27, X.C108295Nk r28, X.C108335No r29, X.AnonymousClass5TJ r30) {
        /*
            r25 = this;
            java.util.ArrayList r11 = X.AnonymousClass000.A0u()
            r12 = r25
            android.content.Context r15 = r12.A02
            int r3 = r12.A00
            X.5Ti r14 = r12.A01
            r1 = 5000(0x1388, double:2.4703E-320)
            java.lang.String r10 = "DefaultRenderersFactory"
            java.lang.Class<X.5TJ> r18 = X.AnonymousClass5TJ.class
            r9 = 0
            r8 = 50
            X.5TR r22 = X.AnonymousClass5TR.A00
            r7 = 0
            X.3Ux r0 = new X.3Ux
            r21 = r26
            r24 = r30
            r19 = r0
            r20 = r15
            r23 = r14
            r19.<init>(r20, r21, r22, r23, r24)
            r11.add(r0)
            if (r3 == 0) goto L_0x00b2
            int r4 = r11.size()
            r17 = 2
            r13 = 3
            r6 = 4
            r16 = 1
            java.lang.String r0 = "com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer"
            java.lang.Class r5 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006b }
            java.lang.Class[] r3 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006b }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006b }
            r3[r9] = r0     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006b }
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            r3[r16] = r0     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006b }
            r3[r17] = r18     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006b }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006b }
            java.lang.reflect.Constructor r3 = X.AnonymousClass3K4.A0c(r5, r0, r3, r13)     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006b }
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006b }
            X.C13690nt.A1Q(r0, r9, r1)     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006b }
            r0[r16] = r26     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006b }
            r0[r17] = r30     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006b }
            X.AnonymousClass000.A1M(r0, r8, r13)     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006b }
            java.lang.Object r0 = r3.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006b }
            X.5UO r0 = (X.AnonymousClass5UO) r0     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x006b }
            int r5 = r4 + 1
            r11.add(r4, r0)     // Catch:{ ClassNotFoundException -> 0x0074, Exception -> 0x006b }
            java.lang.String r0 = "Loaded LibvpxVideoRenderer."
            android.util.Log.i(r10, r0)     // Catch:{ ClassNotFoundException -> 0x0074, Exception -> 0x006b }
            goto L_0x0076
        L_0x006b:
            r2 = move-exception
            java.lang.String r1 = "Error instantiating VP9 extension"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L_0x0074:
            r4 = r5
        L_0x0075:
            r5 = r4
        L_0x0076:
            java.lang.String r0 = "com.google.android.exoplayer2.ext.av1.Libgav1VideoRenderer"
            java.lang.Class r4 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x00b2, Exception -> 0x00a9 }
            java.lang.Class[] r3 = new java.lang.Class[r6]     // Catch:{ ClassNotFoundException -> 0x00b2, Exception -> 0x00a9 }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x00b2, Exception -> 0x00a9 }
            r3[r9] = r0     // Catch:{ ClassNotFoundException -> 0x00b2, Exception -> 0x00a9 }
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            r3[r16] = r0     // Catch:{ ClassNotFoundException -> 0x00b2, Exception -> 0x00a9 }
            r3[r17] = r18     // Catch:{ ClassNotFoundException -> 0x00b2, Exception -> 0x00a9 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x00b2, Exception -> 0x00a9 }
            java.lang.reflect.Constructor r0 = X.AnonymousClass3K4.A0c(r4, r0, r3, r13)     // Catch:{ ClassNotFoundException -> 0x00b2, Exception -> 0x00a9 }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ ClassNotFoundException -> 0x00b2, Exception -> 0x00a9 }
            X.C13690nt.A1Q(r3, r9, r1)     // Catch:{ ClassNotFoundException -> 0x00b2, Exception -> 0x00a9 }
            r3[r16] = r26     // Catch:{ ClassNotFoundException -> 0x00b2, Exception -> 0x00a9 }
            r3[r17] = r30     // Catch:{ ClassNotFoundException -> 0x00b2, Exception -> 0x00a9 }
            X.AnonymousClass000.A1M(r3, r8, r13)     // Catch:{ ClassNotFoundException -> 0x00b2, Exception -> 0x00a9 }
            java.lang.Object r0 = r0.newInstance(r3)     // Catch:{ ClassNotFoundException -> 0x00b2, Exception -> 0x00a9 }
            X.5UO r0 = (X.AnonymousClass5UO) r0     // Catch:{ ClassNotFoundException -> 0x00b2, Exception -> 0x00a9 }
            r11.add(r5, r0)     // Catch:{ ClassNotFoundException -> 0x00b2, Exception -> 0x00a9 }
            java.lang.String r0 = "Loaded Libgav1VideoRenderer."
            android.util.Log.i(r10, r0)     // Catch:{ ClassNotFoundException -> 0x00b2, Exception -> 0x00a9 }
            goto L_0x00b2
        L_0x00a9:
            r2 = move-exception
            java.lang.String r1 = "Error instantiating AV1 extension"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L_0x00b2:
            X.4dU r2 = X.C90094dU.A00(r15)
            X.5Tm[] r1 = new X.C109765Tm[r9]
            X.4oC r0 = new X.4oC
            r0.<init>(r1)
            X.4oA r3 = new X.4oA
            r3.<init>(r2, r0)
            int r1 = r12.A00
            java.lang.Class<X.5TO> r6 = X.AnonymousClass5TO.class
            java.lang.Class<X.5TI> r12 = X.AnonymousClass5TI.class
            X.3Uy r0 = new X.3Uy
            r19 = r0
            r23 = r3
            r24 = r14
            r22 = r27
            r19.<init>(r20, r21, r22, r23, r24)
            r11.add(r0)
            if (r1 == 0) goto L_0x0175
            int r4 = r11.size()
            r5 = 2
            r8 = 3
            r9 = 1
            java.lang.Class<X.3UK> r2 = X.AnonymousClass3UK.class
            java.lang.Class[] r1 = new java.lang.Class[r8]     // Catch:{ ClassNotFoundException -> 0x0110, Exception -> 0x0106 }
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            r1[r7] = r0     // Catch:{ ClassNotFoundException -> 0x0110, Exception -> 0x0106 }
            r1[r9] = r12     // Catch:{ ClassNotFoundException -> 0x0110, Exception -> 0x0106 }
            java.lang.reflect.Constructor r1 = X.AnonymousClass3K4.A0c(r2, r6, r1, r5)     // Catch:{ ClassNotFoundException -> 0x0110, Exception -> 0x0106 }
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ ClassNotFoundException -> 0x0110, Exception -> 0x0106 }
            r0[r7] = r26     // Catch:{ ClassNotFoundException -> 0x0110, Exception -> 0x0106 }
            r0[r9] = r27     // Catch:{ ClassNotFoundException -> 0x0110, Exception -> 0x0106 }
            java.lang.Object r0 = X.AnonymousClass3K4.A0W(r3, r1, r0, r5)     // Catch:{ ClassNotFoundException -> 0x0110, Exception -> 0x0106 }
            X.5UO r0 = (X.AnonymousClass5UO) r0     // Catch:{ ClassNotFoundException -> 0x0110, Exception -> 0x0106 }
            int r2 = r4 + 1
            r11.add(r4, r0)     // Catch:{ ClassNotFoundException -> 0x010f, Exception -> 0x0106 }
            java.lang.String r0 = "Loaded LibopusAudioRenderer."
            android.util.Log.i(r10, r0)     // Catch:{ ClassNotFoundException -> 0x010f, Exception -> 0x0106 }
            goto L_0x0111
        L_0x0106:
            r2 = move-exception
            java.lang.String r1 = "Error instantiating Opus extension"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L_0x010f:
            r4 = r2
        L_0x0110:
            r2 = r4
        L_0x0111:
            java.lang.String r0 = "com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer"
            java.lang.Class r4 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0144, Exception -> 0x013a }
            java.lang.Class[] r1 = new java.lang.Class[r8]     // Catch:{ ClassNotFoundException -> 0x0144, Exception -> 0x013a }
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            r1[r7] = r0     // Catch:{ ClassNotFoundException -> 0x0144, Exception -> 0x013a }
            r1[r9] = r12     // Catch:{ ClassNotFoundException -> 0x0144, Exception -> 0x013a }
            java.lang.reflect.Constructor r1 = X.AnonymousClass3K4.A0c(r4, r6, r1, r5)     // Catch:{ ClassNotFoundException -> 0x0144, Exception -> 0x013a }
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ ClassNotFoundException -> 0x0144, Exception -> 0x013a }
            r0[r7] = r26     // Catch:{ ClassNotFoundException -> 0x0144, Exception -> 0x013a }
            r0[r9] = r27     // Catch:{ ClassNotFoundException -> 0x0144, Exception -> 0x013a }
            java.lang.Object r0 = X.AnonymousClass3K4.A0W(r3, r1, r0, r5)     // Catch:{ ClassNotFoundException -> 0x0144, Exception -> 0x013a }
            X.5UO r0 = (X.AnonymousClass5UO) r0     // Catch:{ ClassNotFoundException -> 0x0144, Exception -> 0x013a }
            int r4 = r2 + 1
            r11.add(r2, r0)     // Catch:{ ClassNotFoundException -> 0x0143, Exception -> 0x013a }
            java.lang.String r0 = "Loaded LibflacAudioRenderer."
            android.util.Log.i(r10, r0)     // Catch:{ ClassNotFoundException -> 0x0143, Exception -> 0x013a }
            goto L_0x0145
        L_0x013a:
            r2 = move-exception
            java.lang.String r1 = "Error instantiating FLAC extension"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L_0x0143:
            r2 = r4
        L_0x0144:
            r4 = r2
        L_0x0145:
            java.lang.String r0 = "com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer"
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0175, Exception -> 0x016c }
            java.lang.Class[] r1 = new java.lang.Class[r8]     // Catch:{ ClassNotFoundException -> 0x0175, Exception -> 0x016c }
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            r1[r7] = r0     // Catch:{ ClassNotFoundException -> 0x0175, Exception -> 0x016c }
            r1[r9] = r12     // Catch:{ ClassNotFoundException -> 0x0175, Exception -> 0x016c }
            java.lang.reflect.Constructor r1 = X.AnonymousClass3K4.A0c(r2, r6, r1, r5)     // Catch:{ ClassNotFoundException -> 0x0175, Exception -> 0x016c }
            java.lang.Object[] r0 = new java.lang.Object[r8]     // Catch:{ ClassNotFoundException -> 0x0175, Exception -> 0x016c }
            r0[r7] = r26     // Catch:{ ClassNotFoundException -> 0x0175, Exception -> 0x016c }
            r0[r9] = r27     // Catch:{ ClassNotFoundException -> 0x0175, Exception -> 0x016c }
            java.lang.Object r0 = X.AnonymousClass3K4.A0W(r3, r1, r0, r5)     // Catch:{ ClassNotFoundException -> 0x0175, Exception -> 0x016c }
            X.5UO r0 = (X.AnonymousClass5UO) r0     // Catch:{ ClassNotFoundException -> 0x0175, Exception -> 0x016c }
            r11.add(r4, r0)     // Catch:{ ClassNotFoundException -> 0x0175, Exception -> 0x016c }
            java.lang.String r0 = "Loaded FfmpegAudioRenderer."
            android.util.Log.i(r10, r0)     // Catch:{ ClassNotFoundException -> 0x0175, Exception -> 0x016c }
            goto L_0x0175
        L_0x016c:
            r2 = move-exception
            java.lang.String r1 = "Error instantiating FFmpeg extension"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1, r2)
            throw r0
        L_0x0175:
            android.os.Looper r1 = r21.getLooper()
            X.3UJ r0 = new X.3UJ
            r2 = r29
            r0.<init>(r1, r2)
            r11.add(r0)
            android.os.Looper r1 = r21.getLooper()
            X.3UI r0 = new X.3UI
            r2 = r28
            r0.<init>(r1, r2)
            r11.add(r0)
            X.3UG r0 = new X.3UG
            r0.<init>()
            r11.add(r0)
            X.5UO[] r0 = new X.AnonymousClass5UO[r7]
            java.lang.Object[] r0 = r11.toArray(r0)
            X.5UO[] r0 = (X.AnonymousClass5UO[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96284o5.A7X(android.os.Handler, X.5TI, X.5Nk, X.5No, X.5TJ):X.5UO[]");
    }
}

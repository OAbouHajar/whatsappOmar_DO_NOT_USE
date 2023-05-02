package X;

/* renamed from: X.43y  reason: invalid class name and case insensitive filesystem */
public final class C804643y extends Exception {
    public final Throwable cause;
    public final boolean isRecoverable;
    public final C30281c4 mediaPeriodId;
    public final C32491gT rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final String rendererName;
    public final long timestampMs;
    public final int type;

    public C804643y(C32491gT r1, C30281c4 r2, String str, String str2, Throwable th, int i2, int i3, int i4, long j2, boolean z2) {
        super(str, th);
        this.type = i2;
        this.cause = th;
        this.rendererName = str2;
        this.rendererIndex = i3;
        this.rendererFormat = r1;
        this.rendererFormatSupport = i4;
        this.mediaPeriodId = r2;
        this.timestampMs = j2;
        this.isRecoverable = z2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C804643y(X.C32491gT r15, java.lang.String r16, java.lang.Throwable r17, int r18, int r19, int r20, boolean r21) {
        /*
            r14 = this;
            r4 = 0
            r3 = r15
            r6 = r16
            r8 = r18
            r9 = r19
            r10 = r20
            if (r18 == 0) goto L_0x006a
            r2 = 1
            if (r8 == r2) goto L_0x0031
            java.lang.String r5 = "Unexpected runtime error"
        L_0x0011:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0024
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r5)
            java.lang.String r0 = ": "
            r1.append(r0)
            java.lang.String r5 = X.AnonymousClass000.A0h(r4, r1)
        L_0x0024:
            long r11 = android.os.SystemClock.elapsedRealtime()
            r2 = r14
            r7 = r17
            r13 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r13)
            return
        L_0x0031:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r6)
            java.lang.String r0 = " error, index="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", format="
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = ", format_supported="
            r1.append(r0)
            if (r20 == 0) goto L_0x0067
            if (r10 == r2) goto L_0x0064
            r0 = 2
            if (r10 == r0) goto L_0x0061
            r0 = 3
            if (r10 == r0) goto L_0x005e
            r0 = 4
            if (r10 != r0) goto L_0x006d
            java.lang.String r0 = "YES"
        L_0x0059:
            java.lang.String r5 = X.AnonymousClass000.A0h(r0, r1)
            goto L_0x0011
        L_0x005e:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L_0x0059
        L_0x0061:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L_0x0059
        L_0x0064:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L_0x0059
        L_0x0067:
            java.lang.String r0 = "NO"
            goto L_0x0059
        L_0x006a:
            java.lang.String r5 = "Source error"
            goto L_0x0011
        L_0x006d:
            java.lang.IllegalStateException r0 = X.AnonymousClass3K4.A0V()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C804643y.<init>(X.1gT, java.lang.String, java.lang.Throwable, int, int, int, boolean):void");
    }

    public C804643y A00(C30281c4 r13) {
        String message = getMessage();
        Throwable th = this.cause;
        int i2 = this.type;
        return new C804643y(this.rendererFormat, r13, message, this.rendererName, th, i2, this.rendererIndex, this.rendererFormatSupport, this.timestampMs, this.isRecoverable);
    }
}

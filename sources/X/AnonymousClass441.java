package X;

import android.media.MediaCodec;

/* renamed from: X.441  reason: invalid class name */
public class AnonymousClass441 extends Exception {
    public final C90714eg codecInfo;
    public final String diagnosticInfo;
    public final AnonymousClass441 fallbackDecoderInitializationException;
    public final String mimeType;
    public final boolean secureDecoderRequired;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass441(X.C32491gT r9, java.lang.Throwable r10, int r11) {
        /*
            r8 = this;
            java.lang.String r0 = "Decoder init failed: ["
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r11)
            java.lang.String r0 = "], "
            r1.append(r0)
            java.lang.String r3 = X.AnonymousClass000.A0f(r9, r1)
            java.lang.String r4 = r9.A0T
            java.lang.String r2 = "neg_"
            java.lang.String r0 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r2)
            int r0 = java.lang.Math.abs(r11)
            java.lang.String r5 = X.AnonymousClass000.A0l(r1, r0)
            r1 = 0
            r7 = 0
            r0 = r8
            r6 = r10
            r2 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass441.<init>(X.1gT, java.lang.Throwable, int):void");
    }

    public AnonymousClass441(C90714eg r1, AnonymousClass441 r2, String str, String str2, String str3, Throwable th, boolean z2) {
        super(str, th);
        this.mimeType = str2;
        this.secureDecoderRequired = z2;
        this.codecInfo = r1;
        this.diagnosticInfo = str3;
        this.fallbackDecoderInitializationException = r2;
    }

    public static String A00(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}

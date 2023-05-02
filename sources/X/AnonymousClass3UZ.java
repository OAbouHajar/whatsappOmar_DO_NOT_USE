package X;

import android.media.MediaCodec;

/* renamed from: X.3UZ  reason: invalid class name */
public class AnonymousClass3UZ extends C804743z {
    public final C90714eg codecInfo;
    public final String diagnosticInfo;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3UZ(C90714eg r4, Throwable th) {
        super(AnonymousClass000.A0h(r4 == null ? null : r4.A03, AnonymousClass000.A0r("Decoder failed: ")), th);
        String str = null;
        this.codecInfo = r4;
        this.diagnosticInfo = AnonymousClass3C1.A01 >= 21 ? A00(th) : str;
    }

    public static String A00(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}

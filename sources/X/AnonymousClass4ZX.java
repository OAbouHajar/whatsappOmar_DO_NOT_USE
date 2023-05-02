package X;

import android.media.MediaCodec;

/* renamed from: X.4ZX  reason: invalid class name */
public final class AnonymousClass4ZX {
    public final MediaCodec.CryptoInfo.Pattern A00 = new MediaCodec.CryptoInfo.Pattern(0, 0);
    public final MediaCodec.CryptoInfo A01;

    public /* synthetic */ AnonymousClass4ZX(MediaCodec.CryptoInfo cryptoInfo) {
        this.A01 = cryptoInfo;
    }

    public static /* synthetic */ void A00(AnonymousClass4ZX r2, int i2, int i3) {
        MediaCodec.CryptoInfo.Pattern pattern = r2.A00;
        pattern.set(i2, i3);
        r2.A01.setPattern(pattern);
    }
}

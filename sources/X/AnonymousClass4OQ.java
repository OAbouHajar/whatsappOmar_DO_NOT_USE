package X;

import android.media.MediaCodec;

/* renamed from: X.4OQ  reason: invalid class name */
public final class AnonymousClass4OQ {
    public int A00;
    public int A01;
    public byte[] A02;
    public byte[] A03;
    public int[] A04;
    public int[] A05;
    public final MediaCodec.CryptoInfo A06;
    public final AnonymousClass4ZX A07;

    public AnonymousClass4OQ() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.A06 = cryptoInfo;
        this.A07 = AnonymousClass3C1.A01 >= 24 ? new AnonymousClass4ZX(cryptoInfo) : null;
    }
}

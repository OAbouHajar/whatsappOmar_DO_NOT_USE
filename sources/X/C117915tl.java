package X;

/* renamed from: X.5tl  reason: invalid class name and case insensitive filesystem */
public class C117915tl {
    public final AnonymousClass50C A00;

    public C117915tl(AnonymousClass50C r1) {
        this.A00 = r1;
    }

    public static void A00(C117915tl r4, AnonymousClass5wR r5, C19550yc r6, byte[] bArr, C35081lL[] r8) {
        r5.A02.A0H(r6, new C28371Vv(r4.A01(bArr), "account", r8), "set", AnonymousClass1NO.A0L);
    }

    public C28371Vv A01(byte[] bArr) {
        C35081lL[] r3 = new C35081lL[3];
        AnonymousClass50C r4 = this.A00;
        C110115dX.A14("key-type", r4.A03, r3);
        r3[1] = new C35081lL("key-version", r4.A04);
        C35081lL.A01("provider", r4.A05, r3);
        return new C28371Vv("pin", r4.A8P(bArr, C004101u.A0E(16)), r3);
    }
}

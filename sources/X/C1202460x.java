package X;

/* renamed from: X.60x  reason: invalid class name and case insensitive filesystem */
public class C1202460x implements C1222368u {
    public final AnonymousClass68X A00;
    public final C117915tl A01;
    public final /* synthetic */ AnonymousClass5wV A02;

    public C1202460x(AnonymousClass68X r1, AnonymousClass5wV r2, C117915tl r3) {
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = r1;
    }

    public void AQW(AnonymousClass2HJ r2) {
        this.A00.AWL(r2);
    }

    public void AYF(String[] strArr) {
        AnonymousClass5wV r1 = this.A02;
        C117915tl r5 = this.A01;
        String str = strArr[0];
        String str2 = strArr[1];
        AnonymousClass68X r0 = this.A00;
        AnonymousClass5wR r6 = r1.A01;
        C112665ir r4 = new C112665ir(r0, r1, r5);
        byte[] A002 = AnonymousClass5wR.A00(Boolean.TRUE, str, "CHANGE", str2, (byte[]) null, new Object[0], C110105dW.A03(r6.A01));
        C35081lL[] r2 = new C35081lL[1];
        C35081lL.A02("action", "change-payment-pin", r2, 0);
        C117915tl.A00(r5, r6, r4, A002, r2);
    }
}

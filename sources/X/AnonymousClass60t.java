package X;

/* renamed from: X.60t  reason: invalid class name */
public class AnonymousClass60t implements C1222268t {
    public final AnonymousClass68X A00;
    public final C117915tl A01;
    public final /* synthetic */ AnonymousClass5wV A02;

    public AnonymousClass60t(AnonymousClass68X r1, AnonymousClass5wV r2, C117915tl r3) {
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = r1;
    }

    public void AQW(AnonymousClass2HJ r2) {
        this.A00.AWL(r2);
    }

    public void AYC(String str) {
        AnonymousClass5wV r3 = this.A02;
        C117915tl r6 = this.A01;
        AnonymousClass68X r2 = this.A00;
        r3.A08.A07("[Set PIN] called");
        AnonymousClass5wR r5 = r3.A01;
        C112675is r15 = new C112675is(r2, r3, r6);
        String str2 = str;
        byte[] A002 = AnonymousClass5wR.A00((Boolean) null, (Object) null, "CREATE", str2, (byte[]) null, new Object[0], C110105dW.A03(r5.A01));
        C35081lL[] r32 = new C35081lL[1];
        C35081lL.A02("action", "create-payment-pin", r32, 0);
        r5.A02.A0H(r15, new C28371Vv(r6.A01(A002), "account", r32), "set", AnonymousClass1NO.A0L);
    }
}

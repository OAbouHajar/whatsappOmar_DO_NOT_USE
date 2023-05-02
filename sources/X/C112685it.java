package X;

/* renamed from: X.5it  reason: invalid class name and case insensitive filesystem */
public class C112685it extends C112075hu {
    public final C117915tl A00;
    public final /* synthetic */ AnonymousClass5wV A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112685it(AnonymousClass68X r4, AnonymousClass5wV r5, C117915tl r6) {
        super(r5.A04.A00, r5.A02, r5.A05, r4);
        this.A01 = r5;
        this.A00 = r6;
    }

    public void A06(AnonymousClass2HJ r4) {
        if (r4 == null) {
            this.A01.A08.A07("verifyPinToken success");
            return;
        }
        AnonymousClass5wV r2 = this.A01;
        r2.A08.A07(AnonymousClass000.A0g("verifyPinToken error: ", r4));
        int i2 = r4.A00;
        if (i2 == 1441) {
            r2.A0A.A02(r4.A02);
        } else if (i2 == 1448) {
            r2.A07.A03(r4, this.A00.A00.A05, "PIN");
        }
    }
}

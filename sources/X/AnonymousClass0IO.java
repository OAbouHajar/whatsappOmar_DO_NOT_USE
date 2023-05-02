package X;

/* renamed from: X.0IO  reason: invalid class name */
public class AnonymousClass0IO extends AnonymousClass0QD {
    public float A00;
    public float A01;
    public final /* synthetic */ AnonymousClass0XJ A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0IO(AnonymousClass0XJ r1, float f2, float f3) {
        super(r1);
        this.A02 = r1;
        this.A00 = f2;
        this.A01 = f3;
    }

    public void A00(String str) {
        AnonymousClass0XJ r5 = this.A02;
        if (r5.A0w()) {
            AnonymousClass0UF r4 = r5.A02;
            if (r4.A05) {
                r5.A00.drawText(str, this.A00, this.A01, r4.A00);
            }
            AnonymousClass0UF r42 = r5.A02;
            if (r42.A06) {
                r5.A00.drawText(str, this.A00, this.A01, r42.A01);
            }
        }
        this.A00 += r5.A02.A00.measureText(str);
    }
}

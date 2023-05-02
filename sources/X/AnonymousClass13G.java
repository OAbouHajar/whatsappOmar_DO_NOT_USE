package X;

/* renamed from: X.13G  reason: invalid class name */
public class AnonymousClass13G {
    public final C16490t9 A00;
    public final AnonymousClass13F A01;

    public AnonymousClass13G(C16490t9 r1, AnonymousClass13F r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void A00(C46352Dw r4, Integer num) {
        if (r4 != null) {
            AnonymousClass2E1 r2 = new AnonymousClass2E1();
            r2.A02 = Long.valueOf((long) r4.A01);
            r2.A01 = Long.valueOf((long) r4.A02);
            r2.A00 = num;
            this.A00.A06(r2);
        }
    }

    public final void A01(Integer num) {
        A00(this.A01.A01(), num);
    }

    public final void A02(Integer num) {
        C46352Dw A012 = this.A01.A01();
        if (A012 != null) {
            AnonymousClass2E2 r2 = new AnonymousClass2E2();
            r2.A02 = Long.valueOf((long) A012.A01);
            r2.A01 = Long.valueOf((long) A012.A02);
            r2.A00 = num;
            this.A00.A06(r2);
        }
    }
}

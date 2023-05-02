package X;

/* renamed from: X.1Gt  reason: invalid class name and case insensitive filesystem */
public class C24651Gt extends C002701f {
    public final C17070uU A00;
    public final C17080uV A01;

    public C24651Gt(C17070uU r1, C17080uV r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void A00(AnonymousClass01A r3, AnonymousClass02C r4) {
        this.A01.A02(r3, "paused");
        if (r3.A0j) {
            this.A00.A00(r3, 2);
        }
    }

    public void A01(AnonymousClass01A r4, AnonymousClass02C r5) {
        boolean z2 = r4.A0j;
        StringBuilder sb = new StringBuilder("resumed ");
        sb.append(z2 ? "visible" : "invisible");
        this.A01.A02(r4, sb.toString());
        if (z2) {
            this.A00.A00(r4, 1);
        }
    }
}

package X;

/* renamed from: X.2ED  reason: invalid class name */
public class AnonymousClass2ED {
    public final AnonymousClass03L A00 = new AnonymousClass03L(1000);
    public final AnonymousClass03L A01 = new AnonymousClass03L(1000);

    public void A00(C37831po r4) {
        AnonymousClass03L r2 = this.A01;
        synchronized (r2) {
            r2.A06(Long.valueOf(r4.A02()), r4);
        }
        AnonymousClass03L r1 = this.A00;
        synchronized (r1) {
            r1.A06(r4.A0C, r4);
        }
    }

    public void A01(C37831po r4) {
        AnonymousClass03L r2 = this.A01;
        synchronized (r2) {
            r2.A03(Long.valueOf(r4.A02()));
        }
        AnonymousClass03L r1 = this.A00;
        synchronized (r1) {
            r1.A03(r4.A0C);
        }
    }
}

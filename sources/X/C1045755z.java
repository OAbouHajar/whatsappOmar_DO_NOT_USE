package X;

/* renamed from: X.55z  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C1045755z implements Runnable {
    public final /* synthetic */ C35001lD A00;
    public final /* synthetic */ AnonymousClass1J2 A01;
    public final /* synthetic */ C118755vC A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C1045755z(C35001lD r1, AnonymousClass1J2 r2, C118755vC r3, String str) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = str;
    }

    public final void run() {
        AnonymousClass1J2 r5 = this.A01;
        C118755vC r4 = this.A02;
        C35001lD r3 = this.A00;
        String str = this.A03;
        C19960zH A04 = r5.A04();
        String A0A = A04.A0A(A04.A00);
        if (A0A != null) {
            r4.A01(A0A);
            if (r3 != null) {
                r5.A03().A03(A0A, r3.A01, r5.A06(str), r3.A00, r3.A02);
                return;
            }
            return;
        }
        r4.A00(AnonymousClass000.A0V(r5.A05()));
    }
}

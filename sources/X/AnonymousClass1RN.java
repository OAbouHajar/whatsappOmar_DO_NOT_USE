package X;

/* renamed from: X.1RN  reason: invalid class name */
public class AnonymousClass1RN {
    public final C16440t3 A00;
    public final AnonymousClass1OJ A01;

    public AnonymousClass1RN(C16440t3 r1, AnonymousClass1OJ r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public boolean A00(C31781f1 r7) {
        if (System.currentTimeMillis() - r7.A04 >= 86400000) {
            r7.A04 = System.currentTimeMillis();
            r7.A01 = 1;
        } else {
            int i2 = r7.A01;
            if (i2 >= 15) {
                return false;
            }
            r7.A01 = i2 + 1;
        }
        this.A01.A03(r7);
        return true;
    }
}

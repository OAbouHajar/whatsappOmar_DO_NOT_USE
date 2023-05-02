package X;

/* renamed from: X.0ys  reason: invalid class name and case insensitive filesystem */
public class C19710ys {
    public final C23411Bw A00;
    public final C15960sC A01;

    public C19710ys(C23411Bw r1, C15960sC r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public int A00() {
        return this.A00.A01.A00.getInt("companion_registration_state", 0);
    }

    public void A01(int i2) {
        this.A00.A01.A00.edit().putInt("companion_registration_state", i2).commit();
        if (i2 == 8) {
            this.A01.A00.A00.edit().putInt("registration_state", 3).apply();
        }
    }

    public boolean A02() {
        int A002 = A00();
        return (A002 == 0 || A002 == 1 || A002 == 7 || A002 == 8 || A002 == 9) ? false : true;
    }
}

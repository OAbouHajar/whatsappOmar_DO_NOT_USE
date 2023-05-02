package X;

/* renamed from: X.0sC  reason: invalid class name and case insensitive filesystem */
public class C15960sC {
    public final C16290sm A00;

    public C15960sC(C16290sm r1) {
        this.A00 = r1;
    }

    public int A00() {
        return this.A00.A00.getInt("registration_state", 0);
    }

    public boolean A01() {
        return A00() == 3;
    }
}

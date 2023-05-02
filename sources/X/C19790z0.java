package X;

/* renamed from: X.0z0  reason: invalid class name and case insensitive filesystem */
public class C19790z0 {
    public final C15860rz A00;
    public final C19810z2 A01;

    public C19790z0(C15860rz r1, C19810z2 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public boolean A00(C15830rv r3) {
        return A01(r3) || !this.A01.A06().isEmpty();
    }

    public boolean A01(C15830rv r3) {
        return C16030sJ.A0L(r3) || this.A00.A1i();
    }

    public boolean A02(C16740tZ r6) {
        return A01(r6.A11.A00) && r6.A0I >= 1415214000000L && !(r6 instanceof C38541qx);
    }
}

package X;

/* renamed from: X.5Ix  reason: invalid class name and case insensitive filesystem */
public class C107625Ix extends C107525In {
    public C107625Ix(C32071fb r3) {
        super(r3, 0, true);
    }

    public C107625Ix(C32071fb r1, int i2, boolean z2) {
        super(r1, i2, z2);
    }

    public int A03() {
        int A01;
        int A03 = C107525In.A00(this).A05().A03();
        if (this.A02) {
            A01 = C32551gZ.A01(this.A00) + C32551gZ.A00(A03);
        } else {
            A03--;
            A01 = C32551gZ.A01(this.A00);
        }
        return A01 + A03;
    }

    public C32051fZ A05() {
        return this;
    }

    public C32051fZ A06() {
        return this;
    }

    public boolean A08() {
        return this.A02 || C107525In.A00(this).A05().A08();
    }
}

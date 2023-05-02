package X;

/* renamed from: X.5It  reason: invalid class name and case insensitive filesystem */
public class C107585It extends C107595Iu {
    public int A00 = -1;

    public C107585It() {
    }

    public C107585It(C32071fb r2) {
        super(r2);
    }

    public C107585It(C32391gH r2) {
        super(r2, true);
    }

    public C107585It(C32071fb[] r2) {
        super(r2);
    }

    public C107585It(C32071fb[] r2, boolean z2) {
        super(r2, true);
    }

    public int A03() {
        int i2 = this.A00;
        if (i2 < 0) {
            i2 = 0;
            for (C32071fb Agm : this.A01) {
                i2 += Agm.Agm().A05().A03();
            }
            this.A00 = i2;
        }
        return C32551gZ.A00(i2) + 1 + i2;
    }

    public C32051fZ A05() {
        return this.A00 ? this : super.A05();
    }

    public C32051fZ A06() {
        return this;
    }
}

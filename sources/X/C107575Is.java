package X;

/* renamed from: X.5Is  reason: invalid class name and case insensitive filesystem */
public class C107575Is extends C107595Iu {
    public int A00 = -1;

    public C107575Is() {
    }

    public C107575Is(C32071fb r2) {
        super(r2);
    }

    public C107575Is(C32391gH r2) {
        super(r2, false);
    }

    public C107575Is(C32071fb[] r2, boolean z2) {
        super(r2, z2);
    }

    public int A03() {
        int i2 = this.A00;
        if (i2 < 0) {
            C32071fb[] r2 = this.A01;
            int length = r2.length;
            i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                i2 = AnonymousClass3K3.A0P(r2, i3, i2);
            }
            this.A00 = i2;
        }
        return C32551gZ.A00(i2) + 1 + i2;
    }

    public C32051fZ A06() {
        return this;
    }
}

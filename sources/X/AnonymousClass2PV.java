package X;

/* renamed from: X.2PV  reason: invalid class name */
public abstract class AnonymousClass2PV {
    public int A00;
    public final int A01;

    public AnonymousClass2PV(int i2, int i3) {
        this.A01 = i2;
        this.A00 = i3;
    }

    public void A00() {
        C87394Wp r0;
        if (this instanceof C610537d) {
            C610537d r1 = (C610537d) this;
            r1.A01 = true;
            r0 = r1.A07;
        } else {
            C610637e r2 = (C610637e) this;
            if (!r2.A05) {
                r2.A05 = true;
                C30741cs r02 = r2.A04;
                if (r02 != null) {
                    r2.A02 = r02.A03();
                }
                r0 = r2.A0B;
            } else {
                return;
            }
        }
        r0.A02();
    }

    public void A01() {
        if (this instanceof C610537d) {
            ((C610537d) this).A08.A00();
            return;
        }
        C610637e r1 = (C610637e) this;
        r1.A0D.A00();
        r1.A0C.A00();
        r1.A0B.A00();
        r1.A0A.A00();
        r1.A00 = 4;
    }
}

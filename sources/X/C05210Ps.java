package X;

/* renamed from: X.0Ps  reason: invalid class name and case insensitive filesystem */
public class C05210Ps {
    public Object A00 = null;
    public boolean A01 = false;
    public final C14990q7 A02;
    public final C31201dg A03;
    public final Runnable A04 = new C09670ft(this);

    public C05210Ps(C14990q7 r2, C31201dg r3) {
        this.A02 = r2;
        this.A03 = r3;
    }

    public void A00() {
        C31201dg r4 = this.A03;
        C14930q1 A0H = r4.A0H(40);
        if (this.A01 && A0H != null) {
            C14940q2 r2 = new C14940q2();
            C14990q7 r1 = this.A02;
            r2.A02(r1, 0);
            C29701b3.A01(r1, r4, r2.A01(), A0H);
        }
    }
}

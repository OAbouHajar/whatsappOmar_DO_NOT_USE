package X;

/* renamed from: X.0vb  reason: invalid class name and case insensitive filesystem */
public class C17760vb {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public final C16490t9 A04;

    public C17760vb(C16490t9 r1) {
        this.A04 = r1;
    }

    public void A00(C15830rv r4, int i2) {
        this.A00 = i2;
        int i3 = 1;
        if (C16030sJ.A0L(r4)) {
            i3 = 2;
        }
        this.A02 = i3;
        C75033rV r2 = new C75033rV();
        int i4 = this.A01;
        if (i4 > 0) {
            r2.A01 = Integer.valueOf(i4);
        }
        r2.A02 = Integer.valueOf(i2);
        r2.A00 = Integer.valueOf(i3);
        if (i2 == 1) {
            r2.A03 = Long.valueOf(this.A03);
        }
        this.A04.A06(r2);
    }
}

package X;

/* renamed from: X.1Af  reason: invalid class name and case insensitive filesystem */
public class C23031Af {
    public final C14710pd A00;
    public final C209212c A01;
    public final C23021Ae A02;

    public C23031Af(C14710pd r1, C209212c r2, C23021Ae r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public void A00(C16740tZ r9) {
        if ((r9 instanceof C16730tY) && this.A00.A0E(C16620tM.A02, 249) && r9.A0F() != null && !r9.A0F().A04()) {
            C16730tY r2 = (C16730tY) r9;
            if (r9.A0U != null) {
                this.A02.A06(r2, 0);
            } else if (r2 instanceof C38681rF) {
                C42591y4 A12 = r2.A12();
                AnonymousClass00B.A06(A12);
                C16750ta r0 = A12.A04.A02;
                AnonymousClass00B.A06(r0);
                if (r0.A0M) {
                    this.A01.A08((C38331qc) null, r2, 2, 0, true, false);
                }
            }
        }
    }
}

package X;

/* renamed from: X.1nY  reason: invalid class name and case insensitive filesystem */
public class C36441nY {
    public C36001mq A00;

    public C36441nY(C36491nd r5, int i2) {
        C28581Wr A0U = C36001mq.A04.A0U();
        A0U.A03();
        C36001mq r1 = (C36001mq) A0U.A00;
        r1.A00 |= 1;
        r1.A01 = i2;
        byte[] A002 = r5.A01.A00();
        C28631Ww A01 = C28631Ww.A01(A002, 0, A002.length);
        A0U.A03();
        C36001mq r12 = (C36001mq) A0U.A00;
        r12.A00 |= 2;
        r12.A03 = A01;
        byte[] bArr = r5.A00.A00;
        C28631Ww A012 = C28631Ww.A01(bArr, 0, bArr.length);
        A0U.A03();
        C36001mq r13 = (C36001mq) A0U.A00;
        r13.A00 |= 4;
        r13.A02 = A012;
        this.A00 = (C36001mq) A0U.A02();
    }

    public C36441nY(byte[] bArr) {
        this.A00 = (C36001mq) C28541Wm.A0E(C36001mq.A04, bArr);
    }

    public C36491nd A00() {
        try {
            C36001mq r1 = this.A00;
            return new C36491nd(new C36411nV(r1.A02.A04()), C36241nE.A00(r1.A03.A04()));
        } catch (C36291nJ e2) {
            throw new AssertionError(e2);
        }
    }
}

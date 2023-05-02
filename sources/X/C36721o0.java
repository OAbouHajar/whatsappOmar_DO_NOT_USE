package X;

/* renamed from: X.1o0  reason: invalid class name and case insensitive filesystem */
public class C36721o0 {
    public C36731o1 A00;

    public C36721o0(C36251nF r6, C36511nf r7, byte[] bArr, int i2, int i3) {
        AnonymousClass2LI r1 = (AnonymousClass2LI) AnonymousClass2LF.A03.A0U();
        r1.A05(i3);
        r1.A06(C28631Ww.A01(bArr, 0, bArr.length));
        AnonymousClass2LF r4 = (AnonymousClass2LF) r1.A02();
        C28581Wr A0U = C36231nD.A03.A0U();
        byte[] A002 = r6.A00();
        C28631Ww A01 = C28631Ww.A01(A002, 0, A002.length);
        A0U.A03();
        C36231nD r12 = (C36231nD) A0U.A00;
        r12.A00 |= 1;
        r12.A02 = A01;
        if (r7 instanceof C36521ng) {
            byte[] bArr2 = ((C36411nV) r7.A00()).A00;
            C28631Ww A012 = C28631Ww.A01(bArr2, 0, bArr2.length);
            A0U.A03();
            C36231nD r13 = (C36231nD) A0U.A00;
            r13.A00 |= 2;
            r13.A01 = A012;
        }
        C28581Wr A0U2 = C36731o1.A05.A0U();
        A0U2.A03();
        C36731o1 r14 = (C36731o1) A0U2.A00;
        r14.A00 |= 1;
        r14.A01 = i2;
        A0U2.A03();
        C36731o1 r15 = (C36731o1) A0U2.A00;
        r15.A03 = r4;
        r15.A00 |= 2;
        A0U2.A03();
        C36731o1 r16 = (C36731o1) A0U2.A00;
        r16.A04 = (C36231nD) A0U.A02();
        r16.A00 |= 4;
        this.A00 = (C36731o1) A0U2.A02();
    }

    public C36721o0(C36731o1 r1) {
        this.A00 = r1;
    }

    public C88904bH A00() {
        AnonymousClass2LF r1 = this.A00.A03;
        AnonymousClass2LF r0 = r1;
        if (r1 == null) {
            r1 = AnonymousClass2LF.A03;
        }
        int i2 = r1.A01;
        if (r0 == null) {
            r0 = AnonymousClass2LF.A03;
        }
        return new C88904bH(i2, r0.A02.A04());
    }

    public void A01(C88904bH r5) {
        AnonymousClass2LI r3 = (AnonymousClass2LI) AnonymousClass2LF.A03.A0U();
        r3.A05(r5.A00);
        byte[] bArr = r5.A01;
        r3.A06(C28631Ww.A01(bArr, 0, bArr.length));
        C28581Wr A0U = this.A00.A0U();
        A0U.A03();
        C36731o1 r1 = (C36731o1) A0U.A00;
        r1.A03 = (AnonymousClass2LF) r3.A02();
        r1.A00 |= 2;
        this.A00 = (C36731o1) A0U.A02();
    }
}

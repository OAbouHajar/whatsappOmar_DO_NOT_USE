package X;

/* renamed from: X.1nB  reason: invalid class name and case insensitive filesystem */
public class C36211nB {
    public C36221nC A00;

    public C36211nB(C36221nC r1) {
        this.A00 = r1;
    }

    public C36211nB(C36251nF r9, C36511nf r10, byte[][] bArr, int i2, int i3) {
        C28581Wr A0U = C36231nD.A03.A0U();
        byte[] A002 = r9.A00();
        C28631Ww A01 = C28631Ww.A01(A002, 0, A002.length);
        A0U.A03();
        C36231nD r1 = (C36231nD) A0U.A00;
        r1.A00 |= 1;
        r1.A02 = A01;
        if (r10 instanceof C36521ng) {
            byte[] bArr2 = ((C36411nV) r10.A00()).A00;
            C28631Ww A012 = C28631Ww.A01(bArr2, 0, bArr2.length);
            A0U.A03();
            C36231nD r12 = (C36231nD) A0U.A00;
            r12.A00 |= 2;
            r12.A01 = A012;
        }
        C28581Wr A0U2 = C36221nC.A04.A0U();
        A0U2.A03();
        C36221nC r13 = (C36221nC) A0U2.A00;
        r13.A00 |= 1;
        r13.A01 = i2;
        A0U2.A03();
        C36221nC r14 = (C36221nC) A0U2.A00;
        r14.A03 = (C36231nD) A0U.A02();
        r14.A00 |= 2;
        int length = bArr.length;
        int[] A003 = AnonymousClass48Z.A00(i3, length);
        for (int i4 = 0; i4 < length; i4++) {
            AnonymousClass2LI r3 = (AnonymousClass2LI) AnonymousClass2LF.A03.A0U();
            r3.A05(A003[i4]);
            byte[] bArr3 = bArr[i4];
            r3.A06(C28631Ww.A01(bArr3, 0, bArr3.length));
            C28541Wm A02 = r3.A02();
            A0U2.A03();
            C36221nC r2 = (C36221nC) A0U2.A00;
            AnonymousClass1XE r15 = r2.A02;
            if (!((AnonymousClass1XF) r15).A00) {
                r15 = C28541Wm.A0G(r15);
                r2.A02 = r15;
            }
            r15.add(A02);
        }
        this.A00 = (C36221nC) A0U2.A02();
    }

    public void A00(C36261nG r10) {
        byte[][] bArr = r10.A01;
        int i2 = r10.A00;
        int length = bArr.length;
        int[] A002 = AnonymousClass48Z.A00(i2, length);
        C28581Wr A0U = this.A00.A0U();
        A0U.A03();
        ((C36221nC) A0U.A00).A02 = AnonymousClass2NE.A01;
        for (int i3 = 0; i3 < length; i3++) {
            AnonymousClass2LI r3 = (AnonymousClass2LI) AnonymousClass2LF.A03.A0U();
            r3.A05(A002[i3]);
            byte[] bArr2 = bArr[i3];
            r3.A06(C28631Ww.A01(bArr2, 0, bArr2.length));
            C28541Wm A02 = r3.A02();
            A0U.A03();
            C36221nC r2 = (C36221nC) A0U.A00;
            AnonymousClass1XE r1 = r2.A02;
            if (!((AnonymousClass1XF) r1).A00) {
                r1 = C28541Wm.A0G(r1);
                r2.A02 = r1;
            }
            r1.add(A02);
        }
        this.A00 = (C36221nC) A0U.A02();
    }
}

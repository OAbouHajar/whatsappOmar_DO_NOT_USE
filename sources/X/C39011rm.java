package X;

/* renamed from: X.1rm  reason: invalid class name and case insensitive filesystem */
public class C39011rm extends C38731rK implements C39001rl, C16850tk, C30081bi {
    public int A00 = 0;

    public C39011rm(C16750ta r10, C28381Vw r11, C39011rm r12, long j2) {
        super(r10, r11, (C16730tY) r12, r12.A10, j2, true);
        this.A00 = r12.A00;
    }

    public C39011rm(C28381Vw r2, long j2) {
        super(r2, (byte) 43, j2);
    }

    public C39011rm(C445524n r2, C28381Vw r3, long j2, boolean z2, boolean z3) {
        super(r3, (byte) 43, j2);
        A1C(r2, z2, z3);
        A1B(r2);
    }

    public void A5j(AnonymousClass21Q r9, AnonymousClass1GC r10) {
        C33221iE r3 = r9.A04;
        C52992en r0 = ((C33211iD) r3.A00).A0K;
        if (r0 == null) {
            r0 = C52992en.A02;
        }
        C69513fA r4 = (C69513fA) r0.A0U();
        C33211iD r02 = ((C52992en) r4.A00).A01;
        if (r02 == null) {
            r02 = C33211iD.A0o;
        }
        C28581Wr A0U = r02.A0U();
        C445524n r03 = ((C33211iD) A0U.A00).A0l;
        if (r03 == null) {
            r03 = C445524n.A0O;
        }
        C69593fI r6 = (C69593fI) r03.A0U();
        A1A(r6, r9, r10);
        r6.A03();
        C445524n r5 = (C445524n) r6.A00;
        r5.A00 |= 131072;
        r5.A0N = true;
        A0U.A03();
        C33211iD r1 = (C33211iD) A0U.A00;
        r1.A0l = (C445524n) r6.A02();
        r1.A00 |= 256;
        r4.A05((C33211iD) A0U.A02());
        if ((!r9.A09 || !r9.A03.A0E(C16620tM.A02, 1710) || r9.A00) && !r9.A03.A0E(C16620tM.A02, 1711)) {
            r3.A03();
            C33211iD r2 = (C33211iD) r3.A00;
            r2.A0K = (C52992en) r4.A02();
            r2.A00 |= 268435456;
            return;
        }
        r3.A03();
        C33211iD r12 = (C33211iD) r3.A00;
        r12.A0J = (C52992en) r4.A02();
        r12.A01 |= 2048;
    }

    public /* bridge */ /* synthetic */ C16740tZ A6M(C28381Vw r7) {
        long j2 = this.A0I;
        C16750ta r1 = this.A02;
        AnonymousClass00B.A06(r1);
        return new C39011rm(r1, r7, this, j2);
    }

    public int AGz() {
        return this.A00;
    }

    public void Aey(int i2) {
        this.A00 = i2;
    }
}

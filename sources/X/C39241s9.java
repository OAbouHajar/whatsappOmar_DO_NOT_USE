package X;

import android.support.v4.view.GravityCompat;

/* renamed from: X.1s9  reason: invalid class name and case insensitive filesystem */
public class C39241s9 extends C30581cc implements C39001rl, C16850tk, C30081bi {
    public int A00 = 0;

    public C39241s9(C28381Vw r2, long j2) {
        super(r2, (byte) 78, j2);
    }

    public C39241s9(C28381Vw r8, C39241s9 r9, long j2) {
        super(r8, r9, j2, true);
        this.A00 = r9.A00;
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
        C53012ep r03 = ((C33211iD) A0U.A00).A0E;
        if (r03 == null) {
            r03 = C53012ep.A0P;
        }
        C69603fJ r7 = (C69603fJ) r03.A0U();
        AnonymousClass1WV r2 = r9.A05;
        byte[] bArr = r9.A0A;
        if (C41071vB.A0O(r2, this, bArr)) {
            r7.A05(r10.A00(r2, this, bArr, r9.A07));
        }
        r7.A03();
        C53012ep r5 = (C53012ep) r7.A00;
        r5.A01 |= GravityCompat.RELATIVE_LAYOUT_DIRECTION;
        r5.A0O = true;
        A0U.A03();
        C33211iD r1 = (C33211iD) A0U.A00;
        r1.A0E = (C53012ep) r7.A02();
        r1.A00 |= 32;
        r4.A05((C33211iD) A0U.A02());
        if (r9.A03.A0E(C16620tM.A02, 2802)) {
            r3.A03();
            C33211iD r12 = (C33211iD) r3.A00;
            r12.A0I = (C52992en) r4.A02();
            r12.A01 |= 16384;
        }
    }

    public int AGz() {
        return this.A00;
    }

    public void Aey(int i2) {
        this.A00 = i2;
    }
}

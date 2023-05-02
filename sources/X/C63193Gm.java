package X;

import android.text.TextUtils;

/* renamed from: X.3Gm  reason: invalid class name and case insensitive filesystem */
public abstract class C63193Gm implements C42131xH {
    public final C35101lN A00;

    public C63193Gm(C35101lN r1) {
        this.A00 = r1;
    }

    public void A5k(AnonymousClass21Q r7, C39041rp r8, AnonymousClass1GC r9) {
        if (r8.A00 != null) {
            C33221iE r3 = r7.A04;
            C58762u4 r0 = ((C33211iD) r3.A00).A0P;
            if (r0 == null) {
                r0 = C58762u4.A05;
            }
            C28581Wr A0U = r0.A0U();
            String str = r8.A00.A03;
            if (!TextUtils.isEmpty(str)) {
                C28581Wr A0U2 = C58222t9.A02.A0U();
                C58222t9 r1 = (C58222t9) C28581Wr.A00(A0U2);
                r1.A00 |= 1;
                r1.A01 = str;
                C58762u4 r12 = (C58762u4) C28581Wr.A00(A0U);
                r12.A03 = (C58222t9) A0U2.A02();
                r12.A00 |= 1;
            }
            AnonymousClass1WV r2 = r7.A05;
            byte[] bArr = r7.A0A;
            if (C41071vB.A0O(r2, r8, bArr)) {
                AnonymousClass21S A002 = r9.A00(r2, r8, bArr, r7.A07);
                C58762u4 r13 = (C58762u4) C28581Wr.A00(A0U);
                r13.A02 = A002;
                r13.A00 |= 4;
            }
            C33211iD r14 = (C33211iD) C28581Wr.A00(r3);
            r14.A0P = (C58762u4) A0U.A02();
            r14.A01 |= 32;
        }
    }

    public int ADE() {
        return 36;
    }
}

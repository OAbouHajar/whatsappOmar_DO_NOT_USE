package X;

import android.text.TextUtils;

/* renamed from: X.3Gl  reason: invalid class name and case insensitive filesystem */
public class C63183Gl implements C42131xH {
    public void A5k(AnonymousClass21Q r8, C39041rp r9, AnonymousClass1GC r10) {
        C35101lN r5 = r9.A00;
        if (r5 != null && r5.A04 == 1) {
            C33221iE r3 = r8.A04;
            C58822uB r0 = ((C33211iD) r3.A00).A0S;
            if (r0 == null) {
                r0 = C58822uB.A06;
            }
            C28581Wr A0U = r0.A0U();
            String str = r5.A03;
            C58822uB r1 = (C58822uB) C28581Wr.A00(A0U);
            r1.A00 |= 1;
            r1.A05 = str;
            String str2 = r5.A01;
            if (!TextUtils.isEmpty(str2)) {
                C58822uB r12 = (C58822uB) C28581Wr.A00(A0U);
                r12.A00 |= 16;
                r12.A04 = str2;
            }
            AnonymousClass42M r2 = AnonymousClass42M.A01;
            C58822uB r13 = (C58822uB) C28581Wr.A00(A0U);
            r13.A00 |= 2;
            r13.A01 = r2.value;
            C58242tB r02 = r13.A03;
            if (r02 == null) {
                r02 = C58242tB.A02;
            }
            C28581Wr A0U2 = r02.A0U();
            String str3 = r5.A02;
            if (str3 != null) {
                C58242tB r14 = (C58242tB) C28581Wr.A00(A0U2);
                r14.A00 |= 1;
                r14.A01 = str3;
            }
            C58822uB r15 = (C58822uB) C28581Wr.A00(A0U);
            r15.A03 = (C58242tB) A0U2.A02();
            r15.A00 |= 4;
            AnonymousClass1WV r22 = r8.A05;
            byte[] bArr = r8.A0A;
            if (C41071vB.A0O(r22, r9, bArr)) {
                AnonymousClass21S A00 = r10.A00(r22, r9, bArr, r8.A07);
                C58822uB r16 = (C58822uB) C28581Wr.A00(A0U);
                r16.A02 = A00;
                r16.A00 |= 8;
            }
            C33211iD r23 = (C33211iD) C28581Wr.A00(r3);
            r23.A0S = (C58822uB) A0U.A02();
            r23.A00 |= 1073741824;
        }
    }

    public int ADE() {
        return 26;
    }
}

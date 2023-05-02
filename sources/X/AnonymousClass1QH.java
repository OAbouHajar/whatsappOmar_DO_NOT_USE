package X;

import android.text.TextUtils;

/* renamed from: X.1QH  reason: invalid class name */
public class AnonymousClass1QH implements AnonymousClass1Q5 {
    public void A5i(C16740tZ r6, AnonymousClass21Q r7, AnonymousClass1GC r8) {
        StringBuilder sb = new StringBuilder("Unexpected message type ");
        sb.append(r6.getClass());
        AnonymousClass00B.A0C(sb.toString(), r6 instanceof C39051rq);
        C39051rq r62 = (C39051rq) r6;
        C33221iE r4 = r7.A04;
        C58812uA r0 = ((C33211iD) r4.A00).A04;
        if (r0 == null) {
            r0 = C58812uA.A06;
        }
        C28581Wr A0U = r0.A0U();
        String A0I = r62.A0I();
        A0U.A03();
        C58812uA r1 = (C58812uA) A0U.A00;
        r1.A01 = 2;
        r1.A04 = A0I;
        AnonymousClass42H r2 = AnonymousClass42H.A01;
        A0U.A03();
        C58812uA r12 = (C58812uA) A0U.A00;
        r12.A00 |= 8;
        r12.A02 = r2.value;
        if (!TextUtils.isEmpty(r62.A00)) {
            String str = r62.A00;
            A0U.A03();
            C58812uA r13 = (C58812uA) A0U.A00;
            r13.A00 |= 1;
            r13.A05 = str;
        }
        AnonymousClass21S A00 = r8.A00(r7.A05, r62, r7.A0A, r7.A07);
        A0U.A03();
        C58812uA r14 = (C58812uA) A0U.A00;
        r14.A03 = A00;
        r14.A00 |= 4;
        r4.A03();
        C33211iD r15 = (C33211iD) r4.A00;
        r15.A04 = (C58812uA) A0U.A02();
        r15.A01 |= 2;
    }

    public int[] ACW() {
        return new int[]{49};
    }
}

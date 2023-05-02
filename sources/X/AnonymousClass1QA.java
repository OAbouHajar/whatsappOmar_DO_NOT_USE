package X;

/* renamed from: X.1QA  reason: invalid class name */
public class AnonymousClass1QA implements AnonymousClass1Q5 {
    public void A5i(C16740tZ r8, AnonymousClass21Q r9, AnonymousClass1GC r10) {
        StringBuilder sb = new StringBuilder("Unexpected message type ");
        sb.append(r8.getClass());
        AnonymousClass00B.A0C(sb.toString(), r8 instanceof C37471pD);
        C37471pD r82 = (C37471pD) r8;
        int i2 = r82.A00;
        C69613fK r3 = (C69613fK) C53002eo.A0F.A0U();
        r3.A05(AnonymousClass43A.A0A);
        C28581Wr A0U = C58692tu.A04.A0U();
        if (i2 != -1) {
            C802142z A00 = C802142z.A00(i2);
            A0U.A03();
            C58692tu r1 = (C58692tu) A0U.A00;
            r1.A00 |= 1;
            r1.A01 = A00.value;
            if (i2 == 0) {
                for (String str : r82.A01) {
                    C28581Wr A0U2 = C58252tC.A02.A0U();
                    A0U2.A03();
                    C58252tC r12 = (C58252tC) A0U2.A00;
                    r12.A00 |= 1;
                    r12.A01 = str;
                    A0U.A03();
                    C58692tu r2 = (C58692tu) A0U.A00;
                    AnonymousClass1XE r13 = r2.A02;
                    if (!((AnonymousClass1XF) r13).A00) {
                        r13 = C28541Wm.A0G(r13);
                        r2.A02 = r13;
                    }
                    r13.add(A0U2.A02());
                }
            }
        }
        r3.A03();
        C53002eo r14 = (C53002eo) r3.A00;
        r14.A0B = (C58692tu) A0U.A02();
        r14.A00 |= 4096;
        r9.A04.A09(r3);
    }

    public int[] ACW() {
        return new int[]{70};
    }
}

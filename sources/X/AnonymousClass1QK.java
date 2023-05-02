package X;

/* renamed from: X.1QK  reason: invalid class name */
public class AnonymousClass1QK implements AnonymousClass1Q5 {
    public void A5i(C16740tZ r7, AnonymousClass21Q r8, AnonymousClass1GC r9) {
        StringBuilder sb = new StringBuilder("Message type is not supported ");
        sb.append(r7.getClass());
        AnonymousClass00B.A0C(sb.toString(), r7 instanceof C39141rz);
        C39141rz r72 = (C39141rz) r7;
        C16880tn r1 = r72.A00;
        if (r1 != null) {
            C42091xD.A00(r1, r1.A00).A09(r72, r8, r9);
            C33221iE r4 = r8.A04;
            AnonymousClass220 r0 = ((C33211iD) r4.A00).A0O;
            if (r0 == null) {
                r0 = AnonymousClass220.A07;
            }
            C69523fB r5 = (C69523fB) r0.A0U();
            AnonymousClass22R r02 = ((AnonymousClass220) r5.A00).A05;
            if (r02 == null) {
                r02 = AnonymousClass22R.A06;
            }
            C69533fC r3 = (C69533fC) r02.A0U();
            r3.A05();
            AnonymousClass22R r12 = (AnonymousClass22R) r3.A00;
            C69593fI r03 = (C69593fI) (r12.A01 == 7 ? (C28541Wm) r12.A02 : C445524n.A0O).A0U();
            r72.A1A(r03, r8, r9);
            r3.A03();
            AnonymousClass22R r13 = (AnonymousClass22R) r3.A00;
            r13.A02 = r03.A02();
            r13.A01 = 7;
            r5.A05((AnonymousClass22R) r3.A02());
            r4.A08((AnonymousClass220) r5.A02());
        }
    }

    public int[] ACW() {
        return new int[]{62};
    }
}

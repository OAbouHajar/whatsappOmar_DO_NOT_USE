package X;

/* renamed from: X.1QL  reason: invalid class name */
public class AnonymousClass1QL implements AnonymousClass1Q5 {
    public void A5i(C16740tZ r15, AnonymousClass21Q r16, AnonymousClass1GC r17) {
        boolean z2;
        StringBuilder sb = new StringBuilder("Message type is not supported ");
        sb.append(r15.getClass());
        AnonymousClass00B.A0C(sb.toString(), r15 instanceof C39151s0);
        C39151s0 r5 = (C39151s0) r15;
        C16880tn r1 = r5.A00;
        if (r1 != null) {
            C42101xE A00 = C42091xD.A00(r1, r1.A00);
            AnonymousClass21Q r12 = r16;
            AnonymousClass1GC r10 = r17;
            A00.A09(r5, r12, r10);
            C33221iE r2 = r12.A04;
            AnonymousClass220 r0 = ((C33211iD) r2.A00).A0O;
            if (r0 == null) {
                r0 = AnonymousClass220.A07;
            }
            C69523fB r3 = (C69523fB) r0.A0U();
            AnonymousClass22R r02 = ((AnonymousClass220) r3.A00).A05;
            if (r02 == null) {
                r02 = AnonymousClass22R.A06;
            }
            C69533fC r4 = (C69533fC) r02.A0U();
            C16750ta r6 = r5.A02;
            C16870tm A0F = r5.A0F();
            if (r6 != null && (z2 || r6.A0U != null)) {
                C445324l r03 = ((C33211iD) r2.A00).A0C;
                if (r03 == null) {
                    r03 = C445324l.A0L;
                }
                C68703dr r7 = (C68703dr) r03.A0U();
                r5.A1A(r6, r7, r12.A05, A0F, r10, r12.A0A, (z2 = r12.A09), r12.A07);
                r4.A05();
                r4.A03();
                AnonymousClass22R r13 = (AnonymousClass22R) r4.A00;
                r13.A02 = r7.A02();
                r13.A01 = 3;
            }
            r3.A05((AnonymousClass22R) r4.A02());
            r2.A08((AnonymousClass220) r3.A02());
        }
    }

    public int[] ACW() {
        return new int[]{63};
    }
}

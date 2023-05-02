package X;

/* renamed from: X.1QJ  reason: invalid class name */
public class AnonymousClass1QJ implements AnonymousClass1Q5 {
    public void A5i(C16740tZ r8, AnonymousClass21Q r9, AnonymousClass1GC r10) {
        StringBuilder sb = new StringBuilder("FMessageInteractiveProtocolSerializer: message type is not supported ");
        sb.append(r8);
        AnonymousClass00B.A0C(sb.toString(), r8 instanceof C39111rw);
        C39111rw r82 = (C39111rw) r8;
        C16880tn r1 = r82.A00;
        if (r1 != null) {
            C42091xD.A00(r1, r1.A00).A09(r82, r9, r10);
            C33221iE r5 = r9.A04;
            AnonymousClass220 r0 = ((C33211iD) r5.A00).A0O;
            if (r0 == null) {
                r0 = AnonymousClass220.A07;
            }
            C69523fB r6 = (C69523fB) r0.A0U();
            AnonymousClass22R r02 = ((AnonymousClass220) r6.A00).A05;
            if (r02 == null) {
                r02 = AnonymousClass22R.A06;
            }
            C69533fC r4 = (C69533fC) r02.A0U();
            r4.A05();
            AnonymousClass22R r12 = (AnonymousClass22R) r4.A00;
            C68803e1 A1A = r82.A1A((C68803e1) (r12.A01 == 4 ? (C28541Wm) r12.A02 : C445224k.A0R).A0U(), r9.A09, r9.A07);
            r4.A03();
            AnonymousClass22R r13 = (AnonymousClass22R) r4.A00;
            r13.A02 = A1A.A02();
            r13.A01 = 4;
            r6.A05((AnonymousClass22R) r4.A02());
            r5.A08((AnonymousClass220) r6.A02());
        }
    }

    public int[] ACW() {
        return new int[]{57};
    }
}

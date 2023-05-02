package X;

/* renamed from: X.1QG  reason: invalid class name */
public class AnonymousClass1QG implements AnonymousClass1Q5 {
    public void A5i(C16740tZ r4, AnonymousClass21Q r5, AnonymousClass1GC r6) {
        StringBuilder sb = new StringBuilder("Unexpected message type ");
        sb.append(r4.getClass());
        AnonymousClass00B.A0C(sb.toString(), r4 instanceof C39211s6);
        C33221iE r1 = r5.A04;
        C58282tF r0 = ((C33211iD) r1.A00).A0e;
        if (r0 == null) {
            r0 = C58282tF.A02;
        }
        r1.A03();
        C33211iD r12 = (C33211iD) r1.A00;
        r12.A0e = (C58282tF) r0.A0U().A02();
        r12.A01 |= 1024;
    }

    public int[] ACW() {
        return new int[]{72};
    }
}

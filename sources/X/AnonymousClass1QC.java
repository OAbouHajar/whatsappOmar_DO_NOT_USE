package X;

/* renamed from: X.1QC  reason: invalid class name */
public class AnonymousClass1QC implements AnonymousClass1Q5 {
    public void A5i(C16740tZ r7, AnonymousClass21Q r8, AnonymousClass1GC r9) {
        if (r7 instanceof C37561pM) {
            C33221iE r5 = r8.A04;
            C53002eo r0 = ((C33211iD) r5.A00).A0b;
            if (r0 == null) {
                r0 = C53002eo.A0F;
            }
            C69613fK r4 = (C69613fK) r0.A0U();
            boolean z2 = ((C37561pM) r7).A00;
            C58192t6 r02 = ((C53002eo) r4.A00).A0A;
            if (r02 == null) {
                r02 = C58192t6.A02;
            }
            C28581Wr A0U = r02.A0U();
            A0U.A03();
            C58192t6 r1 = (C58192t6) A0U.A00;
            r1.A00 |= 1;
            r1.A01 = z2;
            r4.A05(AnonymousClass43A.A07);
            r4.A03();
            C53002eo r12 = (C53002eo) r4.A00;
            r12.A0A = (C58192t6) A0U.A02();
            r12.A00 |= 128;
            r5.A09(r4);
            return;
        }
        StringBuilder sb = new StringBuilder("Message type is not supported ");
        sb.append(r7.getClass());
        throw new IllegalArgumentException(sb.toString());
    }

    public int[] ACW() {
        return new int[]{47};
    }
}

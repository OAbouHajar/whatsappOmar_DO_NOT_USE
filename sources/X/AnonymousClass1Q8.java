package X;

import java.util.Collections;

/* renamed from: X.1Q8  reason: invalid class name */
public class AnonymousClass1Q8 implements AnonymousClass1Q5 {
    public void A5i(C16740tZ r7, AnonymousClass21Q r8, AnonymousClass1GC r9) {
        if (r7 instanceof C37601pQ) {
            C28581Wr A0U = AnonymousClass2sz.A01.A0U();
            for (AnonymousClass1WK A02 : Collections.unmodifiableSet(((C37601pQ) r7).A00)) {
                C37611pR A022 = A02.A02();
                A0U.A03();
                AnonymousClass2sz r2 = (AnonymousClass2sz) A0U.A00;
                AnonymousClass1XE r1 = r2.A00;
                if (!((AnonymousClass1XF) r1).A00) {
                    r1 = C28541Wm.A0G(r1);
                    r2.A00 = r1;
                }
                r1.add(A022);
            }
            C69613fK r22 = (C69613fK) C53002eo.A0F.A0U();
            r22.A05(AnonymousClass43A.A02);
            r22.A03();
            C53002eo r12 = (C53002eo) r22.A00;
            r12.A07 = (AnonymousClass2sz) A0U.A02();
            r12.A00 |= 64;
            r8.A04.A0A((C53002eo) r22.A02());
            return;
        }
        StringBuilder sb = new StringBuilder("Message type is not supported ");
        sb.append(r7.getClass());
        throw new IllegalArgumentException(sb.toString());
    }

    public int[] ACW() {
        return new int[]{39};
    }
}

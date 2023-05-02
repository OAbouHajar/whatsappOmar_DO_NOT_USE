package X;

import java.util.Set;

/* renamed from: X.1QB  reason: invalid class name */
public class AnonymousClass1QB implements AnonymousClass1Q5 {
    public void A5i(C16740tZ r6, AnonymousClass21Q r7, AnonymousClass1GC r8) {
        if (r6 instanceof C37621pS) {
            C37621pS r62 = (C37621pS) r6;
            C28581Wr A0U = C58372tO.A03.A0U();
            Set set = r62.A01;
            A0U.A03();
            C58372tO r2 = (C58372tO) A0U.A00;
            AnonymousClass1XE r1 = r2.A02;
            if (!((AnonymousClass1XF) r1).A00) {
                r1 = C28541Wm.A0G(r1);
                r2.A02 = r1;
            }
            C28591Ws.A01(set, r1);
            long j2 = r62.A00;
            A0U.A03();
            C58372tO r12 = (C58372tO) A0U.A00;
            r12.A00 |= 1;
            r12.A01 = j2;
            C69613fK r22 = (C69613fK) C53002eo.A0F.A0U();
            r22.A05(AnonymousClass43A.A01);
            r22.A03();
            C53002eo r13 = (C53002eo) r22.A00;
            r13.A06 = (C58372tO) A0U.A02();
            r13.A00 |= 256;
            r7.A04.A0A((C53002eo) r22.A02());
            return;
        }
        throw new IllegalArgumentException("FMessageReactionSerializer/not supported message");
    }

    public int[] ACW() {
        return new int[]{50};
    }
}

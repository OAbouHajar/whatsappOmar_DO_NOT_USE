package X;

import java.util.List;

/* renamed from: X.1rO  reason: invalid class name and case insensitive filesystem */
public class C38771rO extends C38601r3 {
    public C37831po A00;

    public C38771rO(C28381Vw r2, long j2) {
        super(r2, (byte) 10, j2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r0 == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A15() {
        /*
            r4 = this;
            java.util.List r1 = r4.A02
            boolean r0 = r1.isEmpty()
            r3 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0017
            java.lang.Object r0 = r1.get(r2)
            X.1po r0 = (X.C37831po) r0
            boolean r0 = r0.A0A()
            r1 = 1
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            boolean r0 = r4.A16()
            if (r0 == 0) goto L_0x0022
            if (r1 == 0) goto L_0x0021
            r3 = 3
        L_0x0021:
            return r3
        L_0x0022:
            if (r1 == 0) goto L_0x0025
            r2 = 2
        L_0x0025:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38771rO.A15():int");
    }

    public boolean A16() {
        List list = this.A02;
        return list.isEmpty() ? this.A01 : ((C37831po) list.get(0)).A0I;
    }
}

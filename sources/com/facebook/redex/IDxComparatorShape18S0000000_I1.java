package com.facebook.redex;

import java.util.Comparator;

public class IDxComparatorShape18S0000000_I1 implements Comparator {
    public final int A00;

    public IDxComparatorShape18S0000000_I1(int i2) {
        this.A00 = i2;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [byte[]] */
    /* JADX WARNING: type inference failed for: r2v2, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r2v2, types: [byte] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compare(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 0: goto L_0x0086;
                case 1: goto L_0x0053;
                case 2: goto L_0x001e;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.0VB r5 = (X.AnonymousClass0VB) r5
            X.0VB r6 = (X.AnonymousClass0VB) r6
            int r3 = r5.A03
            int r0 = r6.A03
            float r2 = r5.A02
            float r1 = r6.A02
            if (r3 != r0) goto L_0x0051
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x004d
            float r2 = r2 - r1
            float r0 = java.lang.Math.signum(r2)
            int r3 = (int) r0
        L_0x001d:
            return r3
        L_0x001e:
            X.0Os r5 = (X.C04970Os) r5
            X.0Os r6 = (X.C04970Os) r6
            androidx.recyclerview.widget.RecyclerView r2 = r5.A03
            r3 = 1
            boolean r1 = X.AnonymousClass000.A1W(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r6.A03
            boolean r0 = X.AnonymousClass000.A1W(r0)
            if (r1 == r0) goto L_0x0034
            if (r2 != 0) goto L_0x003c
            return r3
        L_0x0034:
            boolean r1 = r5.A04
            boolean r0 = r6.A04
            if (r1 == r0) goto L_0x003e
            if (r1 == 0) goto L_0x001d
        L_0x003c:
            r3 = -1
            return r3
        L_0x003e:
            int r3 = r6.A02
            int r0 = r5.A02
            int r3 = r3 - r0
            if (r3 != 0) goto L_0x001d
            int r3 = r5.A00
            int r0 = r6.A00
            int r3 = r3 - r0
            if (r3 == 0) goto L_0x009d
            return r3
        L_0x004d:
            int r3 = r5.A06
            int r0 = r6.A06
        L_0x0051:
            int r3 = r3 - r0
            return r3
        L_0x0053:
            X.0Q3 r5 = (X.AnonymousClass0Q3) r5
            X.0Q3 r6 = (X.AnonymousClass0Q3) r6
            int r1 = r6.A03
            int r0 = r6.A06
            int r1 = r1 - r0
            int r3 = r1 + 1
            int r1 = r6.A02
            int r0 = r6.A05
            int r1 = r1 - r0
            int r0 = r1 + 1
            int r3 = r3 * r0
            int r1 = r6.A01
            int r0 = r6.A04
            int r1 = r1 - r0
            int r0 = r1 + 1
            int r3 = r3 * r0
            int r1 = r5.A03
            int r0 = r5.A06
            int r1 = r1 - r0
            int r2 = r1 + 1
            int r1 = r5.A02
            int r0 = r5.A05
            int r1 = r1 - r0
            int r0 = r1 + 1
            int r2 = r2 * r0
            int r1 = r5.A01
            int r0 = r5.A04
            int r1 = r1 - r0
            int r0 = r1 + 1
            int r2 = r2 * r0
            goto L_0x0098
        L_0x0086:
            byte[] r5 = (byte[]) r5
            byte[] r6 = (byte[]) r6
            int r3 = r5.length
            int r2 = r6.length
            if (r3 != r2) goto L_0x0098
            r1 = 0
        L_0x008f:
            if (r1 >= r3) goto L_0x009d
            byte r0 = r5[r1]
            byte r2 = r6[r1]
            if (r0 == r2) goto L_0x009a
            r3 = r0
        L_0x0098:
            int r3 = r3 - r2
            return r3
        L_0x009a:
            int r1 = r1 + 1
            goto L_0x008f
        L_0x009d:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxComparatorShape18S0000000_I1.compare(java.lang.Object, java.lang.Object):int");
    }
}

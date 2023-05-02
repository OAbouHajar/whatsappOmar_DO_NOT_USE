package X;

import java.math.BigDecimal;

/* renamed from: X.3gE  reason: invalid class name and case insensitive filesystem */
public class C70173gE extends C89494cI {
    public static C70173gE A01 = new C70173gE((BigDecimal) null);
    public final BigDecimal A00;

    public C70173gE(CharSequence charSequence) {
        this.A00 = new BigDecimal(charSequence.toString());
    }

    public C70173gE(BigDecimal bigDecimal) {
        this.A00 = bigDecimal;
    }

    public static int A00(C89494cI r1, C89494cI r2) {
        return r1.A03().A00.compareTo(r2.A03().A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        r2 = ((X.C89494cI) r5).A03();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0022
            boolean r0 = r5 instanceof X.C70173gE
            r1 = 0
            if (r0 != 0) goto L_0x000d
            boolean r0 = r5 instanceof X.C70133gA
            if (r0 != 0) goto L_0x000d
        L_0x000c:
            return r1
        L_0x000d:
            X.4cI r5 = (X.C89494cI) r5
            X.3gE r2 = r5.A03()
            X.3gE r0 = A01
            if (r2 == r0) goto L_0x000c
            java.math.BigDecimal r1 = r4.A00
            java.math.BigDecimal r0 = r2.A00
            int r0 = r1.compareTo(r0)
            if (r0 == 0) goto L_0x0022
            r3 = 0
        L_0x0022:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70173gE.equals(java.lang.Object):boolean");
    }

    public String toString() {
        return this.A00.toString();
    }
}

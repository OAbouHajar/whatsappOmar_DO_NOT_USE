package X;

import java.math.BigInteger;

/* renamed from: X.59i  reason: invalid class name and case insensitive filesystem */
public class C1053959i implements C46932Gv {
    public BigInteger A00;
    public BigInteger A01;
    public BigInteger A02;
    public AnonymousClass4U9 A03;

    public C1053959i(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, AnonymousClass4U9 r5, int i2) {
        if (i2 <= bigInteger.bitLength() || C89714cm.A01("org.spongycastle.dh.allow_unsafe_p_value")) {
            this.A00 = bigInteger2;
            this.A01 = bigInteger;
            this.A02 = bigInteger3;
            this.A03 = r5;
            return;
        }
        throw AnonymousClass000.A0T("unsafe p value so small specific l required");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r1.equals(r0) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.C1053959i
            r2 = 0
            if (r0 == 0) goto L_0x0013
            X.59i r4 = (X.C1053959i) r4
            java.math.BigInteger r1 = r3.A02
            java.math.BigInteger r0 = r4.A02
            if (r1 == 0) goto L_0x0014
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0017
        L_0x0013:
            return r2
        L_0x0014:
            if (r0 == 0) goto L_0x0017
            return r2
        L_0x0017:
            java.math.BigInteger r1 = r4.A01
            java.math.BigInteger r0 = r3.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0013
            java.math.BigInteger r1 = r4.A00
            java.math.BigInteger r0 = r3.A00
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0013
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1053959i.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = this.A01.hashCode() ^ this.A00.hashCode();
        BigInteger bigInteger = this.A02;
        return hashCode ^ (bigInteger != null ? bigInteger.hashCode() : 0);
    }
}

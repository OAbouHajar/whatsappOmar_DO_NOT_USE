package X;

import java.math.BigInteger;
import java.security.cert.CRLSelector;

/* renamed from: X.5AI  reason: invalid class name */
public class AnonymousClass5AI implements C109955Ul {
    public final BigInteger A00;
    public final CRLSelector A01;
    public final boolean A02;
    public final boolean A03;
    public final byte[] A04;

    public AnonymousClass5AI(AnonymousClass4NZ r2) {
        this.A01 = r2.A04;
        this.A02 = r2.A01;
        this.A00 = r2.A00;
        this.A04 = r2.A03;
        this.A03 = r2.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (java.util.Arrays.equals(r1, r0) == false) goto L_0x0052;
     */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean ALL(java.security.cert.CRL r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.security.cert.X509CRL
            if (r0 == 0) goto L_0x0053
            r4 = r7
            java.security.cert.X509CRL r4 = (java.security.cert.X509CRL) r4
            r1 = 0
            r5 = 0
            X.1fY r0 = X.AnonymousClass5IH.A0C     // Catch:{ Exception -> 0x0052 }
            java.lang.String r0 = r0.A01     // Catch:{ Exception -> 0x0052 }
            byte[] r0 = r4.getExtensionValue(r0)     // Catch:{ Exception -> 0x0052 }
            if (r0 == 0) goto L_0x001d
            X.5Ib r0 = X.C107405Ib.A01(r0)     // Catch:{ Exception -> 0x0052 }
            byte[] r0 = r0.A00     // Catch:{ Exception -> 0x0052 }
            X.1hq r1 = X.C33041hq.A00(r0)     // Catch:{ Exception -> 0x0052 }
        L_0x001d:
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x0024
            if (r1 == 0) goto L_0x0039
            return r5
        L_0x0024:
            if (r1 == 0) goto L_0x0039
            java.math.BigInteger r3 = r6.A00
            if (r3 == 0) goto L_0x0039
            byte[] r2 = r1.A01
            r1 = 1
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r1, r2)
            int r0 = r0.compareTo(r3)
            if (r0 != r1) goto L_0x0039
            return r5
        L_0x0039:
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x0053
            X.1fY r0 = X.AnonymousClass5IH.A0K
            java.lang.String r0 = r0.A01
            byte[] r1 = r4.getExtensionValue(r0)
            byte[] r0 = r6.A04
            if (r0 != 0) goto L_0x004c
            if (r1 == 0) goto L_0x0053
            return r5
        L_0x004c:
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x0053
        L_0x0052:
            return r5
        L_0x0053:
            java.security.cert.CRLSelector r0 = r6.A01
            boolean r0 = r0.match(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5AI.ALL(java.security.cert.CRL):boolean");
    }

    public Object clone() {
        return this;
    }
}

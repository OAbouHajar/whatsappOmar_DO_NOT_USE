package X;

/* renamed from: X.59G  reason: invalid class name */
public final class AnonymousClass59G implements C109945Uk {
    public int A00;
    public long A01;
    public C89434cA A02;
    public boolean A03;
    public final C11050i7 A04;
    public final C13670mq A05;

    public AnonymousClass59G(C13670mq r2) {
        this.A05 = r2;
        C11050i7 AAD = r2.AAD();
        this.A04 = AAD;
        C89434cA r0 = AAD.A01;
        this.A02 = r0;
        this.A00 = r0 != null ? r0.A01 : -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        X.C18450wi.A07();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a4, code lost:
        throw X.AnonymousClass000.A0Z();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long AbQ(X.C11050i7 r15, long r16) {
        /*
            r14 = this;
            boolean r0 = r14.A03
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00ab
            X.4cA r1 = r14.A02
            if (r1 == 0) goto L_0x0016
            X.0i7 r0 = r14.A04
            X.4cA r0 = r0.A01
            if (r1 != r0) goto L_0x00ae
            int r1 = r14.A00
            int r0 = r0.A01
            if (r1 != r0) goto L_0x00ae
        L_0x0016:
            X.0mq r4 = r14.A05
            long r0 = r14.A01
            r2 = r16
            long r0 = r0 + r16
            r4.AcF(r0)
            X.4cA r0 = r14.A02
            if (r0 != 0) goto L_0x0031
            X.0i7 r0 = r14.A04
            X.4cA r0 = r0.A01
            if (r0 == 0) goto L_0x0031
            r14.A02 = r0
            int r0 = r0.A01
            r14.A00 = r0
        L_0x0031:
            X.0i7 r4 = r14.A04
            long r8 = r4.A00
            long r10 = r14.A01
            long r0 = r8 - r10
            long r12 = java.lang.Math.min(r2, r0)
            r6 = 0
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0046
            r0 = -1
            return r0
        L_0x0046:
            r0 = r12
            X.AnonymousClass48B.A00(r8, r10, r12)
            int r2 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x00a5
            long r2 = r15.A00
            long r2 = r2 + r12
            r15.A00 = r2
            X.4cA r4 = r4.A01
        L_0x0055:
            if (r4 == 0) goto L_0x009d
            int r3 = r4.A00
            int r2 = r4.A01
            int r3 = r3 - r2
            long r2 = (long) r3
            int r5 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r5 < 0) goto L_0x0065
            long r10 = r10 - r2
            X.4cA r4 = r4.A02
            goto L_0x0055
        L_0x0065:
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x00a5
            if (r4 == 0) goto L_0x009d
            X.4cA r5 = r4.A01()
            int r3 = r5.A01
            int r2 = (int) r10
            int r3 = r3 + r2
            r5.A01 = r3
            int r2 = (int) r0
            int r3 = r3 + r2
            int r2 = r5.A00
            int r2 = java.lang.Math.min(r3, r2)
            r5.A00 = r2
            X.4cA r2 = r15.A01
            if (r2 != 0) goto L_0x0095
            r5.A03 = r5
            r5.A02 = r5
            r15.A01 = r5
        L_0x0089:
            int r3 = r5.A00
            int r2 = r5.A01
            int r3 = r3 - r2
            long r2 = (long) r3
            long r0 = r0 - r2
            X.4cA r4 = r4.A02
            r10 = 0
            goto L_0x0065
        L_0x0095:
            X.4cA r2 = r2.A03
            if (r2 == 0) goto L_0x009d
            r2.A04(r5)
            goto L_0x0089
        L_0x009d:
            X.C18450wi.A07()
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()
            throw r0
        L_0x00a5:
            long r0 = r14.A01
            long r0 = r0 + r12
            r14.A01 = r0
            return r12
        L_0x00ab:
            java.lang.String r0 = "closed"
            goto L_0x00b0
        L_0x00ae:
            java.lang.String r0 = "Peek source is invalid because upstream source was used"
        L_0x00b0:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass59G.AbQ(X.0i7, long):long");
    }

    public void close() {
        this.A03 = true;
    }
}

package X;

/* renamed from: X.4Ug  reason: invalid class name and case insensitive filesystem */
public abstract class C86814Ug {
    public C88364aN A00;
    public final int A01;
    public final C96724on A02;
    public final AnonymousClass5R9 A03;

    public C86814Ug(C108245Nf r13, AnonymousClass5R9 r14, int i2, long j2, long j3, long j4, long j5, long j6) {
        this.A03 = r14;
        this.A01 = i2;
        this.A02 = new C96724on(r13, j2, j3, j4, j5, j6);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        r9.A00 = null;
        r8.AWs();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(X.C55142iu r24, X.AnonymousClass4Bt r25) {
        /*
            r23 = this;
        L_0x0000:
            r9 = r23
            X.4aN r6 = r9.A00
            X.C90524eJ.A01(r6)
            long r0 = r6.A02
            long r10 = r6.A00
            long r3 = r6.A04
            long r10 = r10 - r0
            int r2 = r9.A01
            long r7 = (long) r2
            int r2 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            r10 = r24
            r7 = r25
            if (r2 > 0) goto L_0x002d
            r2 = 0
            r9.A00 = r2
            X.5R9 r2 = r9.A03
            r2.AWs()
            long r3 = r10.AF7()
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x00ad
            r7.A00 = r0
        L_0x002b:
            r0 = 1
            return r0
        L_0x002d:
            long r11 = r10.AF7()
            long r0 = r3 - r11
            r11 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 < 0) goto L_0x0079
            r11 = 262144(0x40000, double:1.295163E-318)
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 > 0) goto L_0x0079
            int r2 = (int) r0
            r10.Afx(r2)
            r10.AcS()
            X.5R9 r8 = r9.A03
            long r11 = r6.A07
            X.4Zv r1 = r8.Ad7(r10, r11)
            int r2 = r1.A00
            r0 = -3
            if (r2 == r0) goto L_0x0073
            r0 = -2
            if (r2 == r0) goto L_0x0084
            r0 = -1
            if (r2 == r0) goto L_0x0091
            long r3 = r1.A01
            long r0 = r10.AF7()
            long r5 = r3 - r0
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0073
            r1 = 262144(0x40000, double:1.295163E-318)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0073
            int r0 = (int) r5
            r10.Afx(r0)
        L_0x0073:
            r0 = 0
            r9.A00 = r0
            r8.AWs()
        L_0x0079:
            long r1 = r10.AF7()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00ad
            r7.A00 = r3
            goto L_0x002b
        L_0x0084:
            long r13 = r1.A02
            long r2 = r1.A01
            r6.A03 = r13
            r6.A02 = r2
            long r15 = r6.A01
            long r4 = r6.A00
            goto L_0x009d
        L_0x0091:
            long r15 = r1.A02
            long r4 = r1.A01
            r6.A01 = r15
            r6.A00 = r4
            long r13 = r6.A03
            long r2 = r6.A02
        L_0x009d:
            long r0 = r6.A05
            r19 = r4
            r21 = r0
            r17 = r2
            long r0 = X.C88364aN.A00(r11, r13, r15, r17, r19, r21)
            r6.A04 = r0
            goto L_0x0000
        L_0x00ad:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86814Ug.A00(X.2iu, X.4Bt):int");
    }

    public final void A01(long j2) {
        C88364aN r0 = this.A00;
        long j3 = j2;
        if (r0 == null || r0.A06 != j2) {
            C96724on r1 = this.A02;
            this.A00 = new C88364aN(j3, r1.A05.Agk(j3), r1.A02, r1.A04, r1.A01, r1.A00);
        }
    }
}

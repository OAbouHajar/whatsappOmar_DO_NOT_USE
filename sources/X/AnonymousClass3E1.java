package X;

/* renamed from: X.3E1  reason: invalid class name */
public final class AnonymousClass3E1 implements C15070qH, C15120qM {
    public long A00;
    public long A01 = 0;
    public C15120qM A02;
    public C97354pr[] A03 = new C97354pr[0];
    public final C15070qH A04;

    public AnonymousClass3E1(C15070qH r3, long j2) {
        this.A04 = r3;
        this.A00 = j2;
    }

    public boolean A00() {
        return AnonymousClass000.A1O((this.A01 > -9223372036854775807L ? 1 : (this.A01 == -9223372036854775807L ? 0 : -1)));
    }

    public boolean A6f(long j2) {
        return this.A04.A6f(j2);
    }

    public void A7z(long j2, boolean z2) {
        this.A04.A7z(j2, false);
    }

    public long A9p(C88884bF r18, long j2) {
        C88884bF r10 = r18;
        long j3 = j2;
        if (j2 == 0) {
            return 0;
        }
        long j4 = r10.A01;
        long max = Math.max(0, Math.min(j4, j2 - 0));
        long j5 = r10.A00;
        long j6 = this.A00;
        long max2 = Math.max(0, Math.min(j5, j6 == Long.MIN_VALUE ? Long.MAX_VALUE : j6 - j2));
        if (!(max == j4 && max2 == j5)) {
            r10 = new C88884bF(max, max2);
        }
        return this.A04.A9p(r10, j3);
    }

    public long AAG() {
        long AAG = this.A04.AAG();
        if (AAG != Long.MIN_VALUE) {
            long j2 = this.A00;
            if (j2 == Long.MIN_VALUE || AAG < j2) {
                return AAG;
            }
        }
        return Long.MIN_VALUE;
    }

    public long ADw() {
        long ADw = this.A04.ADw();
        if (ADw != Long.MIN_VALUE) {
            long j2 = this.A00;
            if (j2 == Long.MIN_VALUE || ADw < j2) {
                return ADw;
            }
        }
        return Long.MIN_VALUE;
    }

    public C93604jT AGe() {
        return this.A04.AGe();
    }

    public boolean AJ6() {
        return this.A04.AJ6();
    }

    public void ALV() {
        this.A04.ALV();
    }

    public /* bridge */ /* synthetic */ void AP8(C15080qI r2) {
        this.A02.AP8(this);
    }

    public void AVC(C15070qH r2) {
        this.A02.AVC(this);
    }

    public void Aal(C15120qM r2, long j2) {
        this.A02 = r2;
        this.A04.Aal(this, j2);
    }

    public long AbU() {
        if (A00()) {
            long j2 = this.A01;
            this.A01 = -9223372036854775807L;
            long AbU = AbU();
            return AbU != -9223372036854775807L ? AbU : j2;
        }
        long AbU2 = this.A04.AbU();
        if (AbU2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z2 = true;
        C90524eJ.A04(C13700nu.A0f((AbU2 > 0 ? 1 : (AbU2 == 0 ? 0 : -1))));
        long j3 = this.A00;
        if (j3 != Long.MIN_VALUE && AbU2 > j3) {
            z2 = false;
        }
        C90524eJ.A04(z2);
        return AbU2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r5 > r3) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long AdG(long r9) {
        /*
            r8 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8.A01 = r0
            X.4pr[] r3 = r8.A03
            int r2 = r3.length
            r7 = 0
            r1 = 0
        L_0x000c:
            if (r1 >= r2) goto L_0x0017
            r0 = r3[r1]
            if (r0 == 0) goto L_0x0014
            r0.A00 = r7
        L_0x0014:
            int r1 = r1 + 1
            goto L_0x000c
        L_0x0017:
            X.0qH r0 = r8.A04
            long r5 = r0.AdG(r9)
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0034
            long r3 = r8.A00
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0033
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0034
        L_0x0033:
            r7 = 1
        L_0x0034:
            X.C90524eJ.A04(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3E1.AdG(long):long");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
        if (r10 > r0) goto L_0x0077;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long AdK(X.C109525Sm[] r19, X.AnonymousClass5UR[] r20, boolean[] r21, boolean[] r22, long r23) {
        /*
            r18 = this;
            r6 = r19
            int r5 = r6.length
            X.4pr[] r7 = new X.C97354pr[r5]
            r4 = r18
            r4.A03 = r7
            X.5Sm[] r12 = new X.C109525Sm[r5]
            r3 = 0
            r1 = 0
        L_0x000d:
            r2 = 0
            if (r1 >= r5) goto L_0x0021
            r0 = r19[r1]
            r7[r1] = r0
            r0 = r7[r1]
            if (r0 == 0) goto L_0x001c
            r0 = r7[r1]
            X.5Sm r2 = r0.A01
        L_0x001c:
            r12[r1] = r2
            int r1 = r1 + 1
            goto L_0x000d
        L_0x0021:
            X.0qH r11 = r4.A04
            r13 = r20
            r14 = r21
            r15 = r22
            r16 = r23
            long r10 = r11.AdK(r12, r13, r14, r15, r16)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.A01 = r0
            int r0 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r0 == 0) goto L_0x004c
            r7 = 0
            int r0 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0077
            long r0 = r4.A00
            r8 = -9223372036854775808
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x004c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 > 0) goto L_0x0077
        L_0x004c:
            r0 = 1
        L_0x004d:
            X.C90524eJ.A04(r0)
        L_0x0050:
            if (r3 >= r5) goto L_0x0079
            r0 = r12[r3]
            X.4pr[] r7 = r4.A03
            if (r0 != 0) goto L_0x0061
            r7[r3] = r2
        L_0x005a:
            r0 = r7[r3]
            r19[r3] = r0
            int r3 = r3 + 1
            goto L_0x0050
        L_0x0061:
            r0 = r7[r3]
            if (r0 == 0) goto L_0x006d
            r0 = r7[r3]
            X.5Sm r1 = r0.A01
            r0 = r12[r3]
            if (r1 == r0) goto L_0x005a
        L_0x006d:
            r1 = r12[r3]
            X.4pr r0 = new X.4pr
            r0.<init>(r4, r1)
            r7[r3] = r0
            goto L_0x005a
        L_0x0077:
            r0 = 0
            goto L_0x004d
        L_0x0079:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3E1.AdK(X.5Sm[], X.5UR[], boolean[], boolean[], long):long");
    }
}

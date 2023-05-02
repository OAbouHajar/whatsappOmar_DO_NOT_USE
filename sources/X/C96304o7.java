package X;

import java.nio.ByteBuffer;

/* renamed from: X.4o7  reason: invalid class name and case insensitive filesystem */
public abstract class C96304o7 implements C109765Tm {
    public C88734b0 A00;
    public C88734b0 A01;
    public C88734b0 A02;
    public C88734b0 A03;
    public ByteBuffer A04;
    public ByteBuffer A05;
    public boolean A06;

    public C96304o7() {
        ByteBuffer byteBuffer = C109765Tm.A00;
        this.A04 = byteBuffer;
        this.A05 = byteBuffer;
        C88734b0 r0 = C88734b0.A04;
        this.A02 = r0;
        this.A03 = r0;
        this.A00 = r0;
        this.A01 = r0;
    }

    public final ByteBuffer A00(int i2) {
        if (this.A04.capacity() < i2) {
            this.A04 = AnonymousClass3K3.A0s(i2);
        } else {
            this.A04.clear();
        }
        ByteBuffer byteBuffer = this.A04;
        this.A05 = byteBuffer;
        return byteBuffer;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r0 != 0) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C88734b0 A6W(X.C88734b0 r8) {
        /*
            r7 = this;
            r7.A02 = r8
            r2 = r7
            boolean r0 = r7 instanceof X.AnonymousClass3UU
            if (r0 == 0) goto L_0x0024
            X.3UU r2 = (X.AnonymousClass3UU) r2
            int r1 = r8.A02
            r0 = 2
            if (r1 != r0) goto L_0x00a5
            r0 = 1
            r2.A05 = r0
            int r0 = r2.A03
            if (r0 != 0) goto L_0x0019
            int r0 = r2.A02
        L_0x0017:
            if (r0 == 0) goto L_0x00a1
        L_0x0019:
            r7.A03 = r8
            boolean r0 = r7.AIc()
            if (r0 != 0) goto L_0x0023
            X.4b0 r8 = X.C88734b0.A04
        L_0x0023:
            return r8
        L_0x0024:
            boolean r0 = r7 instanceof X.AnonymousClass3UV
            if (r0 == 0) goto L_0x0032
            X.3UV r2 = (X.AnonymousClass3UV) r2
            int r1 = r8.A02
            r0 = 2
            if (r1 != r0) goto L_0x00ab
            boolean r0 = r2.A05
            goto L_0x0017
        L_0x0032:
            boolean r0 = r7 instanceof X.AnonymousClass3US
            if (r0 == 0) goto L_0x0053
            int r1 = r8.A02
            r2 = 2
            r0 = 3
            if (r1 == r0) goto L_0x006b
            if (r1 == r2) goto L_0x00a1
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            if (r1 == r0) goto L_0x006b
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r1 == r0) goto L_0x006b
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 == r0) goto L_0x006b
            r0 = 4
            if (r1 == r0) goto L_0x006b
            X.43M r0 = new X.43M
            r0.<init>(r8)
            throw r0
        L_0x0053:
            boolean r0 = r7 instanceof X.AnonymousClass3UW
            if (r0 == 0) goto L_0x0075
            int r1 = r8.A02
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r1 == r0) goto L_0x006a
            r0 = 805306368(0x30000000, float:4.656613E-10)
            if (r1 == r0) goto L_0x006a
            r0 = 4
            if (r1 == r0) goto L_0x00a1
            X.43M r0 = new X.43M
            r0.<init>(r8)
            throw r0
        L_0x006a:
            r2 = 4
        L_0x006b:
            int r1 = r8.A03
            int r0 = r8.A01
            X.4b0 r8 = new X.4b0
            r8.<init>(r1, r0, r2)
            goto L_0x0019
        L_0x0075:
            X.3UT r2 = (X.AnonymousClass3UT) r2
            int[] r6 = r2.A01
            if (r6 == 0) goto L_0x00a1
            int r0 = r8.A02
            r5 = 2
            if (r0 != r5) goto L_0x00b7
            int r4 = r8.A01
            int r3 = r6.length
            boolean r2 = X.AnonymousClass3K2.A1X(r4, r3)
            r1 = 0
        L_0x0088:
            if (r1 >= r3) goto L_0x0096
            r0 = r6[r1]
            if (r0 >= r4) goto L_0x00b1
            boolean r0 = X.AnonymousClass3K2.A1X(r0, r1)
            r2 = r2 | r0
            int r1 = r1 + 1
            goto L_0x0088
        L_0x0096:
            if (r2 == 0) goto L_0x00a1
            int r0 = r8.A03
            X.4b0 r8 = new X.4b0
            r8.<init>(r0, r3, r5)
            goto L_0x0019
        L_0x00a1:
            X.4b0 r8 = X.C88734b0.A04
            goto L_0x0019
        L_0x00a5:
            X.43M r0 = new X.43M
            r0.<init>(r8)
            throw r0
        L_0x00ab:
            X.43M r0 = new X.43M
            r0.<init>(r8)
            throw r0
        L_0x00b1:
            X.43M r0 = new X.43M
            r0.<init>(r8)
            throw r0
        L_0x00b7:
            X.43M r0 = new X.43M
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96304o7.A6W(X.4b0):X.4b0");
    }

    public ByteBuffer AE7() {
        ByteBuffer byteBuffer = this.A05;
        this.A05 = C109765Tm.A00;
        return byteBuffer;
    }

    public boolean AIc() {
        return this instanceof AnonymousClass3UV ? ((AnonymousClass3UV) this).A05 : C13680ns.A1a(this.A03, C88734b0.A04);
    }

    public boolean AIm() {
        return this.A06 && this.A05 == C109765Tm.A00;
    }

    public final void AbG() {
        this.A06 = true;
        if (this instanceof AnonymousClass3UU) {
            AnonymousClass3UU r4 = (AnonymousClass3UU) this;
            if (r4.A05) {
                int i2 = r4.A00;
                if (i2 > 0) {
                    r4.A04 += (long) (i2 / r4.A00.A00);
                }
                r4.A00 = 0;
            }
        } else if (this instanceof AnonymousClass3UV) {
            AnonymousClass3UV r42 = (AnonymousClass3UV) this;
            int i3 = r42.A01;
            if (i3 > 0) {
                r42.A02(r42.A07, i3);
            }
            if (!r42.A06) {
                r42.A04 += (long) (r42.A02 / r42.A00);
            }
        }
    }

    public final void flush() {
        this.A05 = C109765Tm.A00;
        this.A06 = false;
        this.A00 = this.A02;
        this.A01 = this.A03;
        if (this instanceof AnonymousClass3UU) {
            AnonymousClass3UU r4 = (AnonymousClass3UU) this;
            if (r4.A05) {
                r4.A05 = false;
                int i2 = r4.A02;
                int i3 = r4.A00.A00;
                r4.A06 = new byte[(i2 * i3)];
                r4.A01 = r4.A03 * i3;
            }
            r4.A00 = 0;
        } else if (this instanceof AnonymousClass3UV) {
            AnonymousClass3UV r42 = (AnonymousClass3UV) this;
            if (r42.A05) {
                C88734b0 r2 = r42.A00;
                int i4 = r2.A00;
                r42.A00 = i4;
                long j2 = (long) r2.A03;
                int A0S = ((int) AnonymousClass3K3.A0S(150000, j2)) * i4;
                if (r42.A07.length != A0S) {
                    r42.A07 = new byte[A0S];
                }
                int A0S2 = ((int) AnonymousClass3K3.A0S(20000, j2)) * i4;
                r42.A02 = A0S2;
                if (r42.A08.length != A0S2) {
                    r42.A08 = new byte[A0S2];
                }
            }
            r42.A03 = 0;
            r42.A04 = 0;
            r42.A01 = 0;
            r42.A06 = false;
        } else if (this instanceof AnonymousClass3UT) {
            AnonymousClass3UT r43 = (AnonymousClass3UT) this;
            r43.A00 = r43.A01;
        }
    }

    public final void reset() {
        flush();
        this.A04 = C109765Tm.A00;
        C88734b0 r0 = C88734b0.A04;
        this.A02 = r0;
        this.A03 = r0;
        this.A00 = r0;
        this.A01 = r0;
        if (this instanceof AnonymousClass3UU) {
            ((AnonymousClass3UU) this).A06 = AnonymousClass3C1.A0A;
        } else if (this instanceof AnonymousClass3UV) {
            AnonymousClass3UV r1 = (AnonymousClass3UV) this;
            r1.A05 = false;
            r1.A02 = 0;
            byte[] bArr = AnonymousClass3C1.A0A;
            r1.A07 = bArr;
            r1.A08 = bArr;
        } else if (this instanceof AnonymousClass3UT) {
            AnonymousClass3UT r12 = (AnonymousClass3UT) this;
            r12.A00 = null;
            r12.A01 = null;
        }
    }
}

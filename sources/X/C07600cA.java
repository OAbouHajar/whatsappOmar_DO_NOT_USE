package X;

/* renamed from: X.0cA  reason: invalid class name and case insensitive filesystem */
public class C07600cA implements C13290lm {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = 0;
    public Object A03 = null;
    public final C13290lm A04;

    public C07600cA(C13290lm r2) {
        this.A04 = r2;
    }

    public void A00() {
        int i2 = this.A02;
        if (i2 != 0) {
            if (i2 == 1) {
                this.A04.ASG(this.A01, this.A00);
            } else if (i2 != 2) {
                this.A04.AOI(this.A03, this.A01, this.A00);
            } else {
                this.A04.AW0(this.A01, this.A00);
            }
            this.A03 = null;
            this.A02 = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r1 = r5.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AOI(java.lang.Object r6, int r7, int r8) {
        /*
            r5 = this;
            int r0 = r5.A02
            r4 = 3
            if (r0 != r4) goto L_0x0023
            int r1 = r5.A01
            int r0 = r5.A00
            int r3 = r1 + r0
            if (r7 > r3) goto L_0x0023
            int r2 = r7 + r8
            if (r2 < r1) goto L_0x0023
            java.lang.Object r0 = r5.A03
            if (r0 != r6) goto L_0x0023
            int r1 = java.lang.Math.min(r7, r1)
            r5.A01 = r1
            int r0 = java.lang.Math.max(r3, r2)
            int r0 = r0 - r1
            r5.A00 = r0
            return
        L_0x0023:
            r5.A00()
            r5.A01 = r7
            r5.A00 = r8
            r5.A03 = r6
            r5.A02 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07600cA.AOI(java.lang.Object, int, int):void");
    }

    public void ASG(int i2, int i3) {
        int i4;
        if (this.A02 == 1 && i2 >= (i4 = this.A01)) {
            int i5 = this.A00;
            if (i2 <= i4 + i5) {
                this.A00 = i5 + i3;
                this.A01 = Math.min(i2, i4);
                return;
            }
        }
        A00();
        this.A01 = i2;
        this.A00 = i3;
        this.A02 = 1;
    }

    public void ATo(int i2, int i3) {
        A00();
        this.A04.ATo(i2, i3);
    }

    public void AW0(int i2, int i3) {
        int i4;
        if (this.A02 != 2 || (i4 = this.A01) < i2 || i4 > i2 + i3) {
            A00();
            this.A01 = i2;
            this.A00 = i3;
            this.A02 = 2;
            return;
        }
        this.A00 += i3;
        this.A01 = i2;
    }
}

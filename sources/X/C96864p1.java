package X;

import java.io.EOFException;

/* renamed from: X.4p1  reason: invalid class name and case insensitive filesystem */
public final class C96864p1 implements AnonymousClass5SM {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public final long A08;
    public final long A09;
    public final C87284Wd A0A;
    public final C87484Wy A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r9 <= r7) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C96864p1(X.C87484Wy r6, long r7, long r9, long r11, long r13, boolean r15) {
        /*
            r5 = this;
            r5.<init>()
            r2 = 0
            r3 = 0
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x000f
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            r0 = 1
            if (r1 > 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            X.C90524eJ.A03(r0)
            r5.A0B = r6
            r5.A09 = r7
            r5.A08 = r9
            long r9 = r9 - r7
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x002a
            if (r15 != 0) goto L_0x002a
            r5.A00 = r2
        L_0x0022:
            X.4Wd r0 = new X.4Wd
            r0.<init>()
            r5.A0A = r0
            return
        L_0x002a:
            r5.A07 = r13
            r0 = 4
            r5.A00 = r0
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C96864p1.<init>(X.4Wy, long, long, long, long, boolean):void");
    }

    public /* bridge */ /* synthetic */ C32371gD A7a() {
        if (this.A07 != 0) {
            return new C96674oi(this);
        }
        return null;
    }

    public long AbP(C55142iu r23) {
        long j2;
        int i2 = this.A00;
        C55142iu r11 = r23;
        if (i2 == 0) {
            long AF7 = r11.AF7();
            this.A03 = AF7;
            this.A00 = 1;
            long j3 = this.A08 - 65307;
            if (j3 > AF7) {
                return j3;
            }
        } else if (i2 != 1) {
            if (i2 == 2) {
                long j4 = this.A04;
                long j5 = this.A01;
                if (j4 != j5) {
                    long AF72 = r11.AF7();
                    C87284Wd r6 = this.A0A;
                    if (!r6.A00(r11, j5)) {
                        j2 = this.A04;
                        if (j2 == AF72) {
                            throw AnonymousClass3K3.A0e("No ogg page can be found.");
                        }
                    } else {
                        r6.A01(r11, false);
                        r11.AcS();
                        long j6 = this.A06;
                        long j7 = r6.A04;
                        long j8 = j6 - j7;
                        int i3 = r6.A01 + r6.A00;
                        if (0 > j8 || j8 >= 72000) {
                            if (j8 < 0) {
                                this.A01 = AF72;
                                this.A02 = j7;
                            } else {
                                this.A04 = r11.AF7() + ((long) i3);
                                this.A05 = j7;
                            }
                            long j9 = this.A01;
                            j2 = this.A04;
                            long j10 = j9 - j2;
                            if (j10 < 100000) {
                                this.A01 = j2;
                            } else {
                                j2 = Math.max(j2, Math.min((r11.AF7() - (((long) i3) * (j8 <= 0 ? 2 : 1))) + ((j8 * j10) / (this.A02 - this.A05)), j9 - 1));
                            }
                        }
                    }
                    if (j2 != -1) {
                        return j2;
                    }
                }
                this.A00 = 3;
            } else if (i2 != 3) {
                return -1;
            }
            while (true) {
                C87284Wd r5 = this.A0A;
                r5.A00(r11, -1);
                r5.A01(r11, false);
                if (r5.A04 > this.A06) {
                    r11.AcS();
                    this.A00 = 4;
                    return -(this.A05 + 2);
                }
                r11.Afx(r5.A01 + r5.A00);
                this.A04 = r11.AF7();
                this.A05 = r5.A04;
            }
        }
        C87284Wd r8 = this.A0A;
        r8.A03 = 0;
        r8.A04 = 0;
        r8.A02 = 0;
        r8.A01 = 0;
        r8.A00 = 0;
        if (!r8.A00(r11, -1)) {
            throw new EOFException();
        }
        do {
            r8.A01(r11, false);
            r11.Afx(r8.A01 + r8.A00);
            if ((r8.A03 & 4) == 4 || !r8.A00(r11, -1) || r11.AF7() >= this.A08) {
                this.A07 = r8.A04;
                this.A00 = 4;
            }
            r8.A01(r11, false);
            r11.Afx(r8.A01 + r8.A00);
            break;
        } while (r11.AF7() >= this.A08);
        this.A07 = r8.A04;
        this.A00 = 4;
        return this.A03;
    }

    public void Ag7(long j2) {
        long j3 = this.A07;
        this.A06 = Math.max(0, Math.min(j2, j3 - 1));
        this.A00 = 2;
        this.A04 = this.A09;
        this.A01 = this.A08;
        this.A05 = 0;
        this.A02 = j3;
    }
}

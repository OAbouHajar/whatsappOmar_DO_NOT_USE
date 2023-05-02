package X;

/* renamed from: X.4Wx  reason: invalid class name and case insensitive filesystem */
public final class C87474Wx {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AnonymousClass4LQ A04;
    public AnonymousClass4S8 A05;
    public boolean A06;
    public final C32481gS A07;
    public final AnonymousClass4PE A08 = new AnonymousClass4PE();
    public final C90504eH A09 = new C90504eH();
    public final C90504eH A0A = C90504eH.A05(1);
    public final C90504eH A0B = new C90504eH();

    public C87474Wx(C32481gS r2, AnonymousClass4LQ r3, AnonymousClass4S8 r4) {
        this.A07 = r2;
        this.A05 = r4;
        this.A04 = r3;
        this.A05 = r4;
        this.A04 = r3;
        r2.A9D(r4.A03.A07);
        A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        if (r15 != 0) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r11.A0F[r2] == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(int r14, int r15) {
        /*
            r13 = this;
            X.4Mw r0 = r13.A01()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r8 = r0.A00
            if (r8 == 0) goto L_0x0043
            X.4PE r0 = r13.A08
            X.4eH r5 = r0.A0H
        L_0x0010:
            X.4PE r11 = r13.A08
            int r2 = r13.A01
            boolean r0 = r11.A07
            if (r0 == 0) goto L_0x001f
            boolean[] r0 = r11.A0F
            boolean r0 = r0[r2]
            r12 = 1
            if (r0 != 0) goto L_0x0020
        L_0x001f:
            r12 = 0
        L_0x0020:
            r9 = 1
            if (r12 != 0) goto L_0x0026
            r4 = 0
            if (r15 == 0) goto L_0x0027
        L_0x0026:
            r4 = 1
        L_0x0027:
            X.4eH r3 = r13.A0A
            byte[] r2 = r3.A02
            r0 = 0
            if (r4 == 0) goto L_0x0030
            r0 = 128(0x80, float:1.794E-43)
        L_0x0030:
            X.AnonymousClass3K4.A0i(r0, r2, r8, r1)
            r3.A0S(r1)
            X.1gS r7 = r13.A07
            r7.Acx(r3, r9, r9)
            r7.Acx(r5, r8, r9)
            if (r4 != 0) goto L_0x004c
            int r0 = r8 + 1
            return r0
        L_0x0043:
            byte[] r0 = r0.A04
            X.4eH r5 = r13.A09
            int r8 = r0.length
            r5.A0U(r0, r8)
            goto L_0x0010
        L_0x004c:
            r4 = 6
            r6 = 3
            r5 = 2
            r10 = 8
            if (r12 != 0) goto L_0x0083
            X.4eH r3 = r13.A0B
            r3.A0Q(r10)
            byte[] r2 = r3.A02
            r2[r1] = r1
            r2[r9] = r9
            int r0 = r15 >> 8
            X.AnonymousClass3K4.A15(r2, r0, r5)
            X.AnonymousClass3K4.A15(r2, r15, r6)
            r1 = 4
            int r0 = r14 >> 24
            X.AnonymousClass3K4.A15(r2, r0, r1)
            r1 = 5
            int r0 = r14 >> 16
            X.AnonymousClass3K4.A15(r2, r0, r1)
            int r0 = r14 >> 8
            X.AnonymousClass3K4.A15(r2, r0, r4)
            r0 = 7
            X.AnonymousClass3K4.A15(r2, r14, r0)
            r7.Acx(r3, r10, r9)
            int r0 = r8 + 1
            int r0 = r0 + 8
            return r0
        L_0x0083:
            X.4eH r11 = r11.A0H
            int r2 = r11.A0F()
            r0 = -2
            r11.A0T(r0)
            int r0 = r2 * 6
            int r4 = r0 + 2
            if (r15 == 0) goto L_0x00b1
            X.4eH r3 = r13.A0B
            r3.A0Q(r4)
            byte[] r2 = r3.A02
            r11.A0V(r2, r1, r4)
            byte r0 = r2[r5]
            r1 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r10
            byte r0 = r2[r6]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            int r1 = r1 + r15
            int r0 = r1 >> 8
            X.AnonymousClass3K4.A15(r2, r0, r5)
            X.AnonymousClass3K4.A15(r2, r1, r6)
            r11 = r3
        L_0x00b1:
            r7.Acx(r11, r4, r9)
            int r0 = r8 + 1
            int r0 = r0 + r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C87474Wx.A00(int, int):int");
    }

    public C85044Mw A01() {
        if (this.A06) {
            AnonymousClass4PE r1 = this.A08;
            int i2 = r1.A05.A02;
            C85044Mw r12 = r1.A06;
            if (!(r12 == null && (r12 = this.A05.A03.A0A[i2]) == null) && r12.A03) {
                return r12;
            }
        }
        return null;
    }

    public void A02() {
        AnonymousClass4PE r3 = this.A08;
        r3.A01 = 0;
        r3.A04 = 0;
        r3.A08 = false;
        r3.A07 = false;
        r3.A09 = false;
        r3.A06 = null;
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
        this.A06 = false;
    }

    public boolean A03() {
        this.A01++;
        if (this.A06) {
            int i2 = this.A00 + 1;
            this.A00 = i2;
            int[] iArr = this.A08.A0C;
            int i3 = this.A02;
            if (i2 != iArr[i3]) {
                return true;
            }
            this.A02 = i3 + 1;
            this.A00 = 0;
        }
        return false;
    }
}

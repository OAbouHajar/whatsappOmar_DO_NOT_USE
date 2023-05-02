package X;

/* renamed from: X.0Dw  reason: invalid class name */
public class AnonymousClass0Dw extends C07250ar {
    public static int[] A00 = new int[2];

    public AnonymousClass0Dw(AnonymousClass0SN r3) {
        super(r3);
        this.A05.A04 = AnonymousClass0KE.LEFT;
        this.A04.A04 = AnonymousClass0KE.RIGHT;
        this.A01 = 0;
    }

    public static int A00(C07240aq r2) {
        return ((C07240aq) r2.A08.get(0)).A02;
    }

    public static final void A01(int[] iArr, float f2, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9 = i3 - i2;
        int i10 = i5 - i4;
        if (i6 == -1) {
            i7 = (int) ((((float) i10) * f2) + 0.5f);
            i8 = (int) ((((float) i9) / f2) + 0.5f);
            if (i7 > i9) {
                if (i8 > i10) {
                    return;
                }
            }
            iArr[0] = i7;
            iArr[1] = i10;
            return;
        } else if (i6 != 0) {
            i8 = (int) ((((float) i9) * f2) + 0.5f);
        } else {
            i7 = (int) ((((float) i10) * f2) + 0.5f);
            iArr[0] = i7;
            iArr[1] = i10;
            return;
        }
        iArr[0] = i9;
        iArr[1] = i8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        r5 = r7.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B() {
        /*
            r7 = this;
            X.0SN r2 = r7.A03
            boolean r0 = r2.A0i
            if (r0 == 0) goto L_0x000f
            X.0Dr r1 = r7.A06
            int r0 = r2.A04()
            r1.A02(r0)
        L_0x000f:
            X.0Dr r3 = r7.A06
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x0066
            X.0SN r6 = r7.A03
            X.0Jy[] r1 = r6.A0o
            r0 = 0
            r4 = r1[r0]
            r7.A02 = r4
            X.0Jy r0 = X.C03810Jy.MATCH_CONSTRAINT
            if (r4 == r0) goto L_0x00aa
            X.0Jy r2 = X.C03810Jy.MATCH_PARENT
            if (r4 != r2) goto L_0x009f
            X.0SN r5 = r6.A0Z
            if (r5 == 0) goto L_0x0033
            X.0Jy[] r1 = r5.A0o
            r0 = 0
            r1 = r1[r0]
            X.0Jy r0 = X.C03810Jy.FIXED
            if (r1 == r0) goto L_0x003a
        L_0x0033:
            X.0Jy[] r1 = r5.A0o
            r0 = 0
            r0 = r1[r0]
            if (r0 != r2) goto L_0x009f
        L_0x003a:
            int r4 = r5.A04()
            X.0S1 r0 = r6.A0W
            int r2 = r0.A00()
            int r4 = r4 - r2
            X.0S1 r0 = r6.A0X
            int r0 = r0.A00()
            int r4 = r4 - r0
            X.0aq r1 = r7.A05
            X.0Dw r0 = r5.A0c
            X.0aq r0 = r0.A05
            X.C07250ar.A06(r1, r0, r2)
            X.0aq r2 = r7.A04
            X.0Dw r0 = r5.A0c
            X.0aq r1 = r0.A04
            X.0SN r0 = r7.A03
            X.0S1 r0 = r0.A0X
            X.C07250ar.A05(r0, r2, r1)
            r3.A02(r4)
        L_0x0065:
            return
        L_0x0066:
            X.0Jy r0 = r7.A02
            X.0Jy r2 = X.C03810Jy.MATCH_PARENT
            if (r0 != r2) goto L_0x00aa
            X.0SN r5 = r7.A03
            X.0SN r4 = r5.A0Z
            if (r4 == 0) goto L_0x007b
            X.0Jy[] r1 = r4.A0o
            r0 = 0
            r1 = r1[r0]
            X.0Jy r0 = X.C03810Jy.FIXED
            if (r1 == r0) goto L_0x0082
        L_0x007b:
            X.0Jy[] r1 = r4.A0o
            r0 = 0
            r0 = r1[r0]
            if (r0 != r2) goto L_0x00aa
        L_0x0082:
            X.0aq r2 = r7.A05
            X.0Dw r0 = r4.A0c
            X.0aq r1 = r0.A05
            X.0S1 r0 = r5.A0W
            int r0 = r0.A00()
            X.C07250ar.A06(r2, r1, r0)
            X.0aq r2 = r7.A04
            X.0Dw r0 = r4.A0c
            X.0aq r1 = r0.A04
            X.0SN r0 = r7.A03
            X.0S1 r0 = r0.A0X
            X.C07250ar.A05(r0, r2, r1)
            return
        L_0x009f:
            X.0Jy r0 = X.C03810Jy.FIXED
            if (r4 != r0) goto L_0x00aa
            int r0 = r6.A04()
            r3.A02(r0)
        L_0x00aa:
            boolean r0 = r3.A0B
            r6 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0142
            X.0SN r5 = r7.A03
            boolean r0 = r5.A0i
            if (r0 == 0) goto L_0x0142
            X.0S1[] r1 = r5.A0n
            r6 = r1[r6]
            X.0S1 r0 = r6.A03
            if (r0 == 0) goto L_0x0100
            r2 = r1[r4]
            X.0S1 r0 = r2.A03
            if (r0 == 0) goto L_0x00f3
            boolean r0 = r5.A0J()
            if (r0 != 0) goto L_0x027b
            X.0aq r2 = X.C07250ar.A02(r6)
            if (r2 == 0) goto L_0x00d9
            X.0aq r1 = r7.A05
            int r0 = r6.A00()
            X.C07250ar.A06(r1, r2, r0)
        L_0x00d9:
            X.0SN r0 = r7.A03
            X.0S1[] r0 = r0.A0n
            r2 = r0[r4]
            X.0aq r1 = X.C07250ar.A02(r2)
            if (r1 == 0) goto L_0x00ea
            X.0aq r0 = r7.A04
            X.C07250ar.A05(r2, r0, r1)
        L_0x00ea:
            X.0aq r0 = r7.A05
            r0.A09 = r4
            X.0aq r0 = r7.A04
            r0.A09 = r4
            return
        L_0x00f3:
            X.0aq r1 = X.C07250ar.A02(r6)
            if (r1 == 0) goto L_0x0065
            X.0aq r4 = r7.A05
            int r0 = r6.A00()
            goto L_0x013a
        L_0x0100:
            r1 = r1[r4]
            X.0S1 r0 = r1.A03
            if (r0 == 0) goto L_0x011a
            X.0aq r0 = X.C07250ar.A02(r1)
            if (r0 == 0) goto L_0x0065
            X.0aq r4 = r7.A04
            X.C07250ar.A05(r1, r4, r0)
            X.0aq r1 = r7.A05
            int r0 = r3.A02
            int r0 = -r0
        L_0x0116:
            X.C07250ar.A06(r1, r4, r0)
            return
        L_0x011a:
            boolean r0 = r5 instanceof X.C12340kE
            if (r0 != 0) goto L_0x0065
            X.0SN r0 = r5.A0Z
            if (r0 == 0) goto L_0x0065
            X.0KD r0 = X.AnonymousClass0KD.CENTER
            X.0S1 r0 = r5.A07(r0)
            X.0S1 r0 = r0.A03
            if (r0 != 0) goto L_0x0065
            X.0SN r2 = r7.A03
            X.0SN r0 = r2.A0Z
            X.0Dw r0 = r0.A0c
            X.0aq r1 = r0.A05
            X.0aq r4 = r7.A05
            int r0 = r2.A05()
        L_0x013a:
            X.C07250ar.A06(r4, r1, r0)
            X.0aq r1 = r7.A04
            int r0 = r3.A02
            goto L_0x0116
        L_0x0142:
            X.0Jy r1 = r7.A02
            X.0Jy r0 = X.C03810Jy.MATCH_CONSTRAINT
            if (r1 != r0) goto L_0x01ab
            X.0SN r5 = r7.A03
            int r2 = r5.A0D
            r0 = 2
            if (r2 == r0) goto L_0x022d
            r1 = 3
            if (r2 != r1) goto L_0x01ab
            int r0 = r5.A0C
            if (r0 != r1) goto L_0x01f8
            X.0aq r0 = r7.A05
            r0.A03 = r7
            X.0aq r0 = r7.A04
            r0.A03 = r7
            X.0Dv r1 = r5.A0d
            X.0aq r0 = r1.A05
            r0.A03 = r7
            X.0aq r0 = r1.A04
            r0.A03 = r7
            r3.A03 = r7
            boolean r0 = r5.A0K()
            if (r0 == 0) goto L_0x01e2
            java.util.List r2 = r3.A08
            X.0Dr r0 = r1.A06
            r2.add(r0)
            X.0SN r0 = r7.A03
            X.0Dv r0 = r0.A0d
            X.0Dr r0 = r0.A06
            X.C07240aq.A00(r0, r3)
            X.0SN r0 = r7.A03
            X.0Dv r1 = r0.A0d
            X.0Dr r0 = r1.A06
            r0.A03 = r7
            X.0aq r0 = r1.A05
            r2.add(r0)
            X.0SN r0 = r7.A03
            X.0Dv r0 = r0.A0d
            X.0aq r0 = r0.A04
            r2.add(r0)
            X.0SN r0 = r7.A03
            X.0Dv r0 = r0.A0d
            X.0aq r0 = r0.A05
            X.C07240aq.A00(r0, r3)
            X.0SN r0 = r7.A03
            X.0Dv r0 = r0.A0d
            X.0aq r0 = r0.A04
            java.util.List r1 = r0.A07
        L_0x01a7:
            r0 = r3
        L_0x01a8:
            r1.add(r0)
        L_0x01ab:
            X.0SN r5 = r7.A03
            X.0S1[] r1 = r5.A0n
            r6 = r1[r6]
            X.0S1 r0 = r6.A03
            if (r0 == 0) goto L_0x0248
            r2 = r1[r4]
            X.0S1 r0 = r2.A03
            if (r0 == 0) goto L_0x023b
            boolean r0 = r5.A0J()
            if (r0 != 0) goto L_0x027b
            X.0aq r0 = X.C07250ar.A02(r6)
            X.0aq r1 = X.C07250ar.A02(r2)
            X.C07240aq.A00(r0, r7)
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x01d3
            r7.AhI(r7)
        L_0x01d3:
            X.C07240aq.A00(r1, r7)
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x01dd
            r7.AhI(r7)
        L_0x01dd:
            X.0JT r0 = X.AnonymousClass0JT.CENTER
            r7.A08 = r0
            return
        L_0x01e2:
            boolean r0 = r5.A0J()
            X.0Dr r2 = r1.A06
            if (r0 == 0) goto L_0x0229
            java.util.List r0 = r2.A08
            r0.add(r3)
            java.util.List r1 = r3.A07
            X.0SN r0 = r7.A03
            X.0Dv r0 = r0.A0d
            X.0Dr r0 = r0.A06
            goto L_0x01a8
        L_0x01f8:
            X.0Dv r0 = r5.A0d
            X.0Dr r1 = r0.A06
            java.util.List r0 = r3.A08
            r0.add(r1)
            X.C07240aq.A00(r1, r3)
            X.0SN r0 = r7.A03
            X.0Dv r0 = r0.A0d
            X.0aq r0 = r0.A05
            X.C07240aq.A00(r0, r3)
            X.0SN r0 = r7.A03
            X.0Dv r0 = r0.A0d
            X.0aq r0 = r0.A04
            X.C07240aq.A00(r0, r3)
            r3.A09 = r4
            java.util.List r1 = r3.A07
            X.0aq r0 = r7.A05
            r1.add(r0)
            X.0aq r2 = r7.A04
            r1.add(r2)
            java.util.List r0 = r0.A08
            r0.add(r3)
        L_0x0229:
            java.util.List r1 = r2.A08
            goto L_0x01a7
        L_0x022d:
            X.0SN r0 = r5.A0Z
            if (r0 == 0) goto L_0x01ab
            X.0Dv r0 = r0.A0d
            java.util.List r1 = X.C07250ar.A04(r3, r0, r7)
            X.0aq r0 = r7.A04
            goto L_0x01a8
        L_0x023b:
            X.0aq r2 = X.C07250ar.A02(r6)
            if (r2 == 0) goto L_0x0065
            X.0aq r1 = r7.A05
            int r0 = r6.A00()
            goto L_0x0272
        L_0x0248:
            r1 = r1[r4]
            X.0S1 r0 = r1.A03
            if (r0 == 0) goto L_0x0260
            X.0aq r0 = X.C07250ar.A02(r1)
            if (r0 == 0) goto L_0x0065
            X.0aq r2 = r7.A04
            X.C07250ar.A05(r1, r2, r0)
            X.0aq r1 = r7.A05
            r0 = -1
            r7.A0F(r1, r2, r3, r0)
            return
        L_0x0260:
            boolean r0 = r5 instanceof X.C12340kE
            if (r0 != 0) goto L_0x0065
            X.0SN r0 = r5.A0Z
            if (r0 == 0) goto L_0x0065
            X.0Dw r0 = r0.A0c
            X.0aq r2 = r0.A05
            X.0aq r1 = r7.A05
            int r0 = r5.A05()
        L_0x0272:
            X.C07250ar.A06(r1, r2, r0)
            X.0aq r0 = r7.A04
            r7.A0F(r0, r1, r3, r4)
            return
        L_0x027b:
            X.0aq r1 = r7.A05
            int r0 = r6.A00()
            r1.A00 = r0
            X.0aq r1 = r7.A04
            int r0 = r2.A00()
            int r0 = -r0
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Dw.A0B():void");
    }

    public void A0C() {
        C07240aq r2 = this.A05;
        if (r2.A0B) {
            this.A03.A0P = r2.A02;
        }
    }

    public void A0D() {
        this.A07 = null;
        this.A05.A01();
        this.A04.A01();
        this.A06.A01();
        this.A09 = false;
    }

    public boolean A0G() {
        return this.A02 != C03810Jy.MATCH_CONSTRAINT || this.A03.A0D == 0;
    }

    public void A0H() {
        this.A09 = false;
        C07240aq r0 = this.A05;
        r0.A01();
        r0.A0B = false;
        C07240aq r02 = this.A04;
        r02.A01();
        r02.A0B = false;
        this.A06.A0B = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x026a, code lost:
        if (r11 != false) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0215, code lost:
        if (r10 != false) goto L_0x0217;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AhI(X.C12360kG r22) {
        /*
            r21 = this;
            r2 = r21
            X.0JT r0 = r2.A08
            int r0 = r0.ordinal()
            r8 = 2
            r6 = 3
            r3 = 1
            r1 = 0
            int r0 = 3 - r0
            if (r0 == 0) goto L_0x02d3
            X.0Dr r0 = r2.A06
            boolean r4 = r0.A0B
            r13 = 1056964608(0x3f000000, float:0.5)
            if (r4 != 0) goto L_0x0042
            X.0Jy r5 = r2.A02
            X.0Jy r4 = X.C03810Jy.MATCH_CONSTRAINT
            if (r5 != r4) goto L_0x0042
            X.0SN r7 = r2.A03
            int r4 = r7.A0D
            if (r4 == r8) goto L_0x02bd
            if (r4 != r6) goto L_0x0042
            int r4 = r7.A0C
            r9 = -1
            if (r4 == 0) goto L_0x0107
            if (r4 == r6) goto L_0x0107
            int r4 = r7.A08
            if (r4 == r9) goto L_0x00fb
            if (r4 != 0) goto L_0x00fb
            X.0Dv r4 = r7.A0d
            X.0Dr r4 = r4.A06
            int r4 = r4.A02
            float r5 = (float) r4
            float r4 = r7.A01
            float r5 = r5 / r4
        L_0x003d:
            float r5 = r5 + r13
            int r4 = (int) r5
        L_0x003f:
            r0.A02(r4)
        L_0x0042:
            X.0aq r8 = r2.A05
            boolean r4 = r8.A0A
            if (r4 == 0) goto L_0x005a
            X.0aq r6 = r2.A04
            boolean r4 = r6.A0A
            if (r4 == 0) goto L_0x005a
            boolean r4 = r8.A0B
            if (r4 == 0) goto L_0x005b
            boolean r4 = r6.A0B
            if (r4 == 0) goto L_0x005b
            boolean r4 = r0.A0B
            if (r4 == 0) goto L_0x005b
        L_0x005a:
            return
        L_0x005b:
            boolean r4 = r0.A0B
            if (r4 != 0) goto L_0x00bb
            X.0Jy r9 = r2.A02
            X.0Jy r7 = X.C03810Jy.MATCH_CONSTRAINT
            if (r9 != r7) goto L_0x0075
            X.0SN r5 = r2.A03
            int r4 = r5.A0D
            if (r4 != 0) goto L_0x0075
            boolean r4 = r5.A0J()
            if (r4 != 0) goto L_0x0075
            X.C07250ar.A07(r8, r6, r0)
            return
        L_0x0075:
            if (r9 != r7) goto L_0x00bb
            int r4 = r2.A00
            if (r4 != r3) goto L_0x00bb
            java.util.List r5 = r8.A08
            int r3 = r5.size()
            if (r3 <= 0) goto L_0x00bb
            java.util.List r4 = r6.A08
            int r3 = r4.size()
            if (r3 <= 0) goto L_0x00bb
            java.lang.Object r3 = r5.get(r1)
            X.0aq r3 = (X.C07240aq) r3
            java.lang.Object r4 = r4.get(r1)
            X.0aq r4 = (X.C07240aq) r4
            int r5 = r3.A02
            int r3 = r8.A00
            int r5 = r5 + r3
            int r4 = r4.A02
            int r3 = r6.A00
            int r4 = r4 + r3
            int r4 = r4 - r5
            int r3 = r0.A00
            int r5 = java.lang.Math.min(r4, r3)
            X.0SN r3 = r2.A03
            int r4 = r3.A0F
            int r3 = r3.A0H
            int r3 = java.lang.Math.max(r3, r5)
            if (r4 <= 0) goto L_0x00b8
            int r3 = java.lang.Math.min(r4, r3)
        L_0x00b8:
            r0.A02(r3)
        L_0x00bb:
            boolean r3 = r0.A0B
            if (r3 == 0) goto L_0x005a
            java.util.List r3 = r8.A08
            java.lang.Object r11 = r3.get(r1)
            X.0aq r11 = (X.C07240aq) r11
            java.util.List r3 = r6.A08
            java.lang.Object r10 = r3.get(r1)
            X.0aq r10 = (X.C07240aq) r10
            int r9 = r11.A02
            int r1 = r8.A00
            int r7 = r9 + r1
            int r5 = r10.A02
            int r1 = r6.A00
            int r4 = r5 + r1
            X.0SN r1 = r2.A03
            float r3 = r1.A02
            if (r11 != r10) goto L_0x00e5
            r7 = r9
            r4 = r5
            r3 = 1056964608(0x3f000000, float:0.5)
        L_0x00e5:
            int r4 = r4 - r7
            int r1 = r0.A02
            int r4 = r4 - r1
            float r2 = (float) r7
            float r2 = r2 + r13
            float r1 = (float) r4
            float r1 = r1 * r3
            float r2 = r2 + r1
            int r1 = (int) r2
            r8.A02(r1)
            int r1 = r8.A02
            int r0 = r0.A02
            int r1 = r1 + r0
            r6.A02(r1)
            return
        L_0x00fb:
            X.0Dv r4 = r7.A0d
            X.0Dr r4 = r4.A06
            int r4 = r4.A02
            float r5 = (float) r4
            float r4 = r7.A01
            float r5 = r5 * r4
            goto L_0x003d
        L_0x0107:
            X.0Dv r4 = r7.A0d
            X.0aq r5 = r4.A05
            X.0aq r4 = r4.A04
            X.0S1 r6 = r7.A0W
            X.0S1 r6 = r6.A03
            boolean r12 = X.AnonymousClass000.A1V(r6)
            X.0S1 r6 = r7.A0Y
            X.0S1 r6 = r6.A03
            boolean r11 = X.AnonymousClass000.A1V(r6)
            X.0S1 r6 = r7.A0X
            X.0S1 r6 = r6.A03
            boolean r10 = X.AnonymousClass000.A1V(r6)
            X.0S1 r6 = r7.A0S
            X.0S1 r6 = r6.A03
            boolean r8 = X.AnonymousClass000.A1V(r6)
            int r6 = r7.A08
            if (r12 == 0) goto L_0x026a
            if (r11 == 0) goto L_0x0215
            if (r10 == 0) goto L_0x026c
            if (r8 == 0) goto L_0x0217
            float r12 = r7.A01
            boolean r7 = r5.A0B
            if (r7 == 0) goto L_0x017f
            boolean r7 = r4.A0B
            if (r7 == 0) goto L_0x017f
            X.0aq r9 = r2.A05
            boolean r7 = r9.A0A
            if (r7 == 0) goto L_0x005a
            X.0aq r8 = r2.A04
            boolean r7 = r8.A0A
            if (r7 == 0) goto L_0x005a
            int r13 = A00(r9)
            int r7 = r9.A00
            int r13 = r13 + r7
            int r14 = A00(r8)
            int r7 = r8.A00
            int r14 = r14 - r7
            int r15 = r5.A02
            int r5 = r5.A00
            int r15 = r15 + r5
            int r5 = r4.A02
            int r4 = r4.A00
            int r5 = r5 - r4
            int[] r11 = A00
            r17 = r6
            r16 = r5
            A01(r11, r12, r13, r14, r15, r16, r17)
            r1 = r11[r1]
            r0.A02(r1)
            X.0SN r0 = r2.A03
            X.0Dv r0 = r0.A0d
            X.0Dr r1 = r0.A06
            r0 = r11[r3]
            r1.A02(r0)
            return
        L_0x017f:
            X.0aq r8 = r2.A05
            boolean r7 = r8.A0B
            if (r7 == 0) goto L_0x01c9
            X.0aq r11 = r2.A04
            boolean r7 = r11.A0B
            if (r7 == 0) goto L_0x01c9
            boolean r7 = r5.A0A
            if (r7 == 0) goto L_0x005a
            boolean r7 = r4.A0A
            if (r7 == 0) goto L_0x005a
            int r10 = r8.A02
            int r7 = r8.A00
            int r10 = r10 + r7
            int r9 = r11.A02
            int r7 = r11.A00
            int r9 = r9 - r7
            int r18 = A00(r5)
            int r7 = r5.A00
            int r18 = r18 + r7
            int r19 = A00(r4)
            int r7 = r4.A00
            int r19 = r19 - r7
            int[] r14 = A00
            r15 = r12
            r16 = r10
            r17 = r9
            r20 = r6
            A01(r14, r15, r16, r17, r18, r19, r20)
            r7 = r14[r1]
            r0.A02(r7)
            X.0SN r7 = r2.A03
            X.0Dv r7 = r7.A0d
            X.0Dr r9 = r7.A06
            r7 = r14[r3]
            r9.A02(r7)
        L_0x01c9:
            boolean r7 = r8.A0A
            if (r7 == 0) goto L_0x005a
            X.0aq r9 = r2.A04
            boolean r7 = r9.A0A
            if (r7 == 0) goto L_0x005a
            boolean r7 = r5.A0A
            if (r7 == 0) goto L_0x005a
            boolean r7 = r4.A0A
            if (r7 == 0) goto L_0x005a
            int r16 = A00(r8)
            int r7 = r8.A00
            int r16 = r16 + r7
            int r17 = A00(r9)
            int r7 = r9.A00
            int r17 = r17 - r7
            int r18 = A00(r5)
            int r5 = r5.A00
            int r18 = r18 + r5
            int r19 = A00(r4)
            int r4 = r4.A00
            int r19 = r19 - r4
            int[] r14 = A00
            r15 = r12
            r20 = r6
            A01(r14, r15, r16, r17, r18, r19, r20)
            r4 = r14[r1]
            r0.A02(r4)
            X.0SN r4 = r2.A03
            X.0Dv r4 = r4.A0d
            X.0Dr r5 = r4.A06
            r4 = r14[r3]
            r5.A02(r4)
            goto L_0x0042
        L_0x0215:
            if (r10 == 0) goto L_0x0042
        L_0x0217:
            X.0aq r5 = r2.A05
            boolean r4 = r5.A0A
            if (r4 == 0) goto L_0x005a
            X.0aq r10 = r2.A04
            boolean r4 = r10.A0A
            if (r4 == 0) goto L_0x005a
            float r7 = r7.A01
            int r8 = A00(r5)
            int r4 = r5.A00
            int r8 = r8 + r4
            int r5 = A00(r10)
            int r4 = r10.A00
            int r5 = r5 - r4
            if (r6 == r9) goto L_0x0258
            if (r6 == 0) goto L_0x0258
            int r5 = r5 - r8
            int r6 = r2.A09(r5, r1)
            float r4 = (float) r6
            float r4 = r4 / r7
            float r4 = r4 + r13
            int r4 = (int) r4
            int r5 = r2.A09(r4, r3)
            if (r4 == r5) goto L_0x024a
            float r4 = (float) r5
            float r4 = r4 * r7
        L_0x0248:
            float r4 = r4 + r13
            int r6 = (int) r4
        L_0x024a:
            r0.A02(r6)
            X.0SN r4 = r2.A03
            X.0Dv r4 = r4.A0d
            X.0Dr r4 = r4.A06
            r4.A02(r5)
            goto L_0x0042
        L_0x0258:
            int r5 = r5 - r8
            int r6 = r2.A09(r5, r1)
            float r4 = (float) r6
            float r4 = r4 * r7
            float r4 = r4 + r13
            int r4 = (int) r4
            int r5 = r2.A09(r4, r3)
            if (r4 == r5) goto L_0x024a
            float r4 = (float) r5
            float r4 = r4 / r7
            goto L_0x0248
        L_0x026a:
            if (r11 == 0) goto L_0x0042
        L_0x026c:
            if (r8 == 0) goto L_0x0042
            boolean r8 = r5.A0A
            if (r8 == 0) goto L_0x005a
            boolean r8 = r4.A0A
            if (r8 == 0) goto L_0x005a
            float r7 = r7.A01
            int r8 = A00(r5)
            int r5 = r5.A00
            int r8 = r8 + r5
            int r5 = A00(r4)
            int r4 = r4.A00
            int r5 = r5 - r4
            if (r6 == r9) goto L_0x02ab
            if (r6 != 0) goto L_0x02ab
            int r5 = r5 - r8
            int r6 = r2.A09(r5, r3)
            float r4 = (float) r6
            float r4 = r4 * r7
            float r4 = r4 + r13
            int r4 = (int) r4
            int r5 = r2.A09(r4, r1)
            if (r4 == r5) goto L_0x029d
            float r4 = (float) r5
            float r4 = r4 / r7
        L_0x029b:
            float r4 = r4 + r13
            int r6 = (int) r4
        L_0x029d:
            r0.A02(r5)
            X.0SN r4 = r2.A03
            X.0Dv r4 = r4.A0d
            X.0Dr r4 = r4.A06
            r4.A02(r6)
            goto L_0x0042
        L_0x02ab:
            int r5 = r5 - r8
            int r6 = r2.A09(r5, r3)
            float r4 = (float) r6
            float r4 = r4 / r7
            float r4 = r4 + r13
            int r4 = (int) r4
            int r5 = r2.A09(r4, r1)
            if (r4 == r5) goto L_0x029d
            float r4 = (float) r5
            float r4 = r4 * r7
            goto L_0x029b
        L_0x02bd:
            X.0SN r4 = r7.A0Z
            if (r4 == 0) goto L_0x0042
            X.0Dw r4 = r4.A0c
            X.0Dr r6 = r4.A06
            boolean r4 = r6.A0B
            if (r4 == 0) goto L_0x0042
            float r5 = r7.A04
            int r4 = r6.A02
            float r4 = (float) r4
            float r4 = r4 * r5
            float r4 = r4 + r13
            int r4 = (int) r4
            goto L_0x003f
        L_0x02d3:
            X.0SN r0 = r2.A03
            X.0S1 r3 = r0.A0W
            X.0S1 r0 = r0.A0X
            r2.A0E(r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Dw.AhI(X.0kG):void");
    }

    public String toString() {
        return AnonymousClass000.A0h(this.A03.A0f, AnonymousClass000.A0r("HorizontalRun "));
    }
}

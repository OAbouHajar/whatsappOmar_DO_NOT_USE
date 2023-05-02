package X;

import java.util.List;

/* renamed from: X.0Dv  reason: invalid class name */
public class AnonymousClass0Dv extends C07250ar {
    public C07240aq A00;
    public AnonymousClass0Dr A01 = null;

    public AnonymousClass0Dv(AnonymousClass0SN r4) {
        super(r4);
        C07240aq r2 = new C07240aq(this);
        this.A00 = r2;
        this.A05.A04 = AnonymousClass0KE.TOP;
        this.A04.A04 = AnonymousClass0KE.BOTTOM;
        r2.A04 = AnonymousClass0KE.BASELINE;
        this.A01 = 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        r4 = r12.A03;
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B() {
        /*
            r12 = this;
            X.0SN r2 = r12.A03
            boolean r0 = r2.A0i
            if (r0 == 0) goto L_0x000f
            X.0Dr r1 = r12.A06
            int r0 = r2.A03()
            r1.A02(r0)
        L_0x000f:
            X.0Dr r3 = r12.A06
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x006a
            X.0SN r6 = r12.A03
            X.0Jy[] r1 = r6.A0o
            r0 = 1
            r2 = r1[r0]
            r12.A02 = r2
            boolean r0 = r6.A0h
            if (r0 == 0) goto L_0x0029
            X.0Dq r0 = new X.0Dq
            r0.<init>(r12)
            r12.A01 = r0
        L_0x0029:
            X.0Jy r0 = X.C03810Jy.MATCH_CONSTRAINT
            if (r2 == r0) goto L_0x00ac
            X.0Jy r0 = X.C03810Jy.MATCH_PARENT
            if (r2 != r0) goto L_0x00a1
            X.0SN r5 = r6.A0Z
            if (r5 == 0) goto L_0x00a1
            X.0Jy[] r1 = r5.A0o
            r0 = 1
            r1 = r1[r0]
            X.0Jy r0 = X.C03810Jy.FIXED
            if (r1 != r0) goto L_0x00a1
            int r4 = r5.A03()
            X.0S1 r0 = r6.A0Y
            int r2 = r0.A00()
            int r4 = r4 - r2
            X.0S1 r0 = r6.A0S
            int r0 = r0.A00()
            int r4 = r4 - r0
            X.0aq r1 = r12.A05
            X.0Dv r0 = r5.A0d
            X.0aq r0 = r0.A05
            X.C07250ar.A06(r1, r0, r2)
            X.0aq r2 = r12.A04
            X.0Dv r0 = r5.A0d
            X.0aq r1 = r0.A04
            X.0SN r0 = r12.A03
            X.0S1 r0 = r0.A0S
            X.C07250ar.A05(r0, r2, r1)
            r3.A02(r4)
        L_0x0069:
            return
        L_0x006a:
            X.0Jy r1 = r12.A02
            X.0Jy r0 = X.C03810Jy.MATCH_PARENT
            if (r1 != r0) goto L_0x00ac
            X.0SN r4 = r12.A03
            X.0SN r5 = r4.A0Z
            if (r5 == 0) goto L_0x00ac
            X.0Jy[] r1 = r5.A0o
            r0 = 1
            r1 = r1[r0]
            X.0Jy r0 = X.C03810Jy.FIXED
            if (r1 != r0) goto L_0x00ac
            X.0aq r2 = r12.A05
            X.0Dv r0 = r5.A0d
            X.0aq r1 = r0.A05
            X.0S1 r0 = r4.A0Y
            int r0 = r0.A00()
            X.C07250ar.A06(r2, r1, r0)
            X.0aq r4 = r12.A04
            X.0Dv r0 = r5.A0d
            X.0aq r2 = r0.A04
            X.0SN r0 = r12.A03
            X.0S1 r0 = r0.A0S
            int r0 = r0.A00()
            int r0 = -r0
        L_0x009d:
            X.C07250ar.A06(r4, r2, r0)
            return
        L_0x00a1:
            X.0Jy r0 = X.C03810Jy.FIXED
            if (r2 != r0) goto L_0x00ac
            int r0 = r6.A03()
            r3.A02(r0)
        L_0x00ac:
            boolean r0 = r3.A0B
            r4 = 0
            r11 = 4
            r2 = 1
            r6 = 2
            r5 = 3
            if (r0 == 0) goto L_0x0186
            X.0SN r7 = r12.A03
            boolean r0 = r7.A0i
            if (r0 == 0) goto L_0x02b1
            X.0S1[] r8 = r7.A0n
            r6 = r8[r6]
            X.0S1 r0 = r6.A03
            if (r0 == 0) goto L_0x0123
            r4 = r8[r5]
            X.0S1 r0 = r4.A03
            if (r0 == 0) goto L_0x0116
            boolean r0 = r7.A0K()
            if (r0 == 0) goto L_0x00ed
            X.0aq r1 = r12.A05
            int r0 = r6.A00()
            r1.A00 = r0
            X.0aq r1 = r12.A04
            int r0 = r4.A00()
            int r0 = -r0
            r1.A00 = r0
        L_0x00e0:
            X.0SN r1 = r12.A03
            boolean r0 = r1.A0h
            if (r0 == 0) goto L_0x0069
            X.0aq r4 = r12.A00
            X.0aq r2 = r12.A05
            int r0 = r1.A07
            goto L_0x009d
        L_0x00ed:
            X.0aq r3 = X.C07250ar.A02(r6)
            if (r3 == 0) goto L_0x00fc
            X.0aq r1 = r12.A05
            int r0 = r6.A00()
            X.C07250ar.A06(r1, r3, r0)
        L_0x00fc:
            X.0SN r0 = r12.A03
            X.0S1[] r0 = r0.A0n
            r3 = r0[r5]
            X.0aq r1 = X.C07250ar.A02(r3)
            if (r1 == 0) goto L_0x010d
            X.0aq r0 = r12.A04
            X.C07250ar.A05(r3, r0, r1)
        L_0x010d:
            X.0aq r0 = r12.A05
            r0.A09 = r2
            X.0aq r0 = r12.A04
            r0.A09 = r2
            goto L_0x00e0
        L_0x0116:
            X.0aq r1 = X.C07250ar.A02(r6)
            if (r1 == 0) goto L_0x0069
            X.0aq r4 = r12.A05
            int r0 = r6.A00()
            goto L_0x017e
        L_0x0123:
            r1 = r8[r5]
            X.0S1 r0 = r1.A03
            if (r0 == 0) goto L_0x013d
            X.0aq r0 = X.C07250ar.A02(r1)
            if (r0 == 0) goto L_0x00e0
            X.0aq r4 = r12.A04
            X.C07250ar.A05(r1, r4, r0)
            X.0aq r1 = r12.A05
            int r0 = r3.A02
            int r0 = -r0
        L_0x0139:
            X.C07250ar.A06(r1, r4, r0)
            goto L_0x00e0
        L_0x013d:
            r1 = r8[r11]
            X.0S1 r0 = r1.A03
            if (r0 == 0) goto L_0x015e
            X.0aq r0 = X.C07250ar.A02(r1)
            if (r0 == 0) goto L_0x0069
            X.0aq r1 = r12.A00
            X.C07250ar.A06(r1, r0, r4)
            X.0aq r2 = r12.A05
            X.0SN r0 = r12.A03
            int r0 = r0.A07
            int r0 = -r0
            X.C07250ar.A06(r2, r1, r0)
            X.0aq r4 = r12.A04
            int r0 = r3.A02
            goto L_0x009d
        L_0x015e:
            boolean r0 = r7 instanceof X.C12340kE
            if (r0 != 0) goto L_0x0069
            X.0SN r0 = r7.A0Z
            if (r0 == 0) goto L_0x0069
            X.0KD r0 = X.AnonymousClass0KD.CENTER
            X.0S1 r0 = r7.A07(r0)
            X.0S1 r0 = r0.A03
            if (r0 != 0) goto L_0x0069
            X.0SN r2 = r12.A03
            X.0SN r0 = r2.A0Z
            X.0Dv r0 = r0.A0d
            X.0aq r1 = r0.A05
            X.0aq r4 = r12.A05
            int r0 = r2.A06()
        L_0x017e:
            X.C07250ar.A06(r4, r1, r0)
            X.0aq r1 = r12.A04
            int r0 = r3.A02
            goto L_0x0139
        L_0x0186:
            X.0Jy r1 = r12.A02
            X.0Jy r0 = X.C03810Jy.MATCH_CONSTRAINT
            if (r1 != r0) goto L_0x02b1
            X.0SN r1 = r12.A03
            int r0 = r1.A0C
            if (r0 == r6) goto L_0x02a0
            if (r0 != r5) goto L_0x01a9
            boolean r0 = r1.A0K()
            if (r0 != 0) goto L_0x01a9
            int r0 = r1.A0D
            if (r0 == r5) goto L_0x01a9
            X.0Dw r0 = r1.A0c
            java.util.List r1 = X.C07250ar.A04(r3, r0, r12)
            X.0aq r0 = r12.A04
            r1.add(r0)
        L_0x01a9:
            X.0SN r7 = r12.A03
            X.0S1[] r10 = r7.A0n
            r9 = r10[r6]
            X.0S1 r1 = r9.A03
            if (r1 == 0) goto L_0x020b
            r6 = r10[r5]
            X.0S1 r0 = r6.A03
            if (r0 == 0) goto L_0x020b
            boolean r0 = r7.A0K()
            if (r0 == 0) goto L_0x01ea
            X.0aq r1 = r12.A05
            int r0 = r9.A00()
            r1.A00 = r0
            X.0aq r1 = r12.A04
            int r0 = r6.A00()
            int r0 = -r0
            r1.A00 = r0
        L_0x01d0:
            X.0SN r0 = r12.A03
            boolean r0 = r0.A0h
            if (r0 == 0) goto L_0x01df
            X.0aq r1 = r12.A00
            X.0aq r4 = r12.A05
            X.0Dr r0 = r12.A01
        L_0x01dc:
            r12.A0F(r1, r4, r0, r2)
        L_0x01df:
            java.util.List r0 = r3.A08
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0069
            r3.A0A = r2
            return
        L_0x01ea:
            X.0aq r0 = X.C07250ar.A02(r9)
            X.0aq r1 = X.C07250ar.A02(r6)
            X.C07240aq.A00(r0, r12)
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x01fc
            r12.AhI(r12)
        L_0x01fc:
            X.C07240aq.A00(r1, r12)
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x0206
            r12.AhI(r12)
        L_0x0206:
            X.0JT r0 = X.AnonymousClass0JT.CENTER
            r12.A08 = r0
            goto L_0x01d0
        L_0x020b:
            r8 = 0
            if (r1 == 0) goto L_0x0256
            X.0aq r1 = X.C07250ar.A02(r9)
            if (r1 == 0) goto L_0x01df
            X.0aq r4 = r12.A05
            int r0 = r9.A00()
        L_0x021a:
            X.C07250ar.A06(r4, r1, r0)
            X.0aq r0 = r12.A04
            r12.A0F(r0, r4, r3, r2)
            X.0SN r0 = r12.A03
            boolean r0 = r0.A0h
            if (r0 == 0) goto L_0x022f
            X.0aq r1 = r12.A00
            X.0Dr r0 = r12.A01
            r12.A0F(r1, r4, r0, r2)
        L_0x022f:
            X.0Jy r0 = r12.A02
            X.0Jy r4 = X.C03810Jy.MATCH_CONSTRAINT
            if (r0 != r4) goto L_0x01df
            X.0SN r1 = r12.A03
            float r0 = r1.A01
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x01df
            X.0Dw r1 = r1.A0c
            X.0Jy r0 = r1.A02
            if (r0 != r4) goto L_0x01df
            X.0Dr r0 = r1.A06
            X.C07240aq.A00(r0, r3)
            java.util.List r1 = r3.A08
            X.0SN r0 = r12.A03
            X.0Dw r0 = r0.A0c
            X.0Dr r0 = r0.A06
            r1.add(r0)
            r3.A03 = r12
            goto L_0x01df
        L_0x0256:
            r6 = r10[r5]
            X.0S1 r0 = r6.A03
            r5 = -1
            if (r0 == 0) goto L_0x026f
            X.0aq r0 = X.C07250ar.A02(r6)
            if (r0 == 0) goto L_0x01df
            X.0aq r1 = r12.A04
            X.C07250ar.A05(r6, r1, r0)
            X.0aq r0 = r12.A05
            r12.A0F(r0, r1, r3, r5)
            goto L_0x01d0
        L_0x026f:
            r1 = r10[r11]
            X.0S1 r0 = r1.A03
            if (r0 == 0) goto L_0x028c
            X.0aq r0 = X.C07250ar.A02(r1)
            if (r0 == 0) goto L_0x01df
            X.0aq r1 = r12.A00
            X.C07250ar.A06(r1, r0, r4)
            X.0aq r4 = r12.A05
            X.0Dr r0 = r12.A01
            r12.A0F(r4, r1, r0, r5)
            X.0aq r1 = r12.A04
            r0 = r3
            goto L_0x01dc
        L_0x028c:
            boolean r0 = r7 instanceof X.C12340kE
            if (r0 != 0) goto L_0x01df
            X.0SN r0 = r7.A0Z
            if (r0 == 0) goto L_0x01df
            X.0Dv r0 = r0.A0d
            X.0aq r1 = r0.A05
            X.0aq r4 = r12.A05
            int r0 = r7.A06()
            goto L_0x021a
        L_0x02a0:
            X.0SN r0 = r1.A0Z
            if (r0 == 0) goto L_0x01a9
            X.0Dv r0 = r0.A0d
            java.util.List r1 = X.C07250ar.A04(r3, r0, r12)
            X.0aq r0 = r12.A04
            r1.add(r0)
            goto L_0x01a9
        L_0x02b1:
            X.C07240aq.A00(r3, r12)
            boolean r0 = r3.A0B
            if (r0 == 0) goto L_0x01a9
            r12.AhI(r12)
            goto L_0x01a9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Dv.A0B():void");
    }

    public void A0C() {
        C07240aq r2 = this.A05;
        if (r2.A0B) {
            this.A03.A0Q = r2.A02;
        }
    }

    public void A0D() {
        this.A07 = null;
        this.A05.A01();
        this.A04.A01();
        this.A00.A01();
        this.A06.A01();
        this.A09 = false;
    }

    public boolean A0G() {
        return this.A02 != C03810Jy.MATCH_CONSTRAINT || this.A03.A0C == 0;
    }

    public void A0H() {
        this.A09 = false;
        C07240aq r0 = this.A05;
        r0.A01();
        r0.A0B = false;
        C07240aq r02 = this.A04;
        r02.A01();
        r02.A0B = false;
        C07240aq r03 = this.A00;
        r03.A01();
        r03.A0B = false;
        this.A06.A0B = false;
    }

    public void AhI(C12360kG r13) {
        int i2;
        if (3 - this.A08.ordinal() != 0) {
            AnonymousClass0Dr r5 = this.A06;
            if (r5.A0A && !r5.A0B && this.A02 == C03810Jy.MATCH_CONSTRAINT) {
                AnonymousClass0SN r6 = this.A03;
                int i3 = r6.A0C;
                if (i3 == 2) {
                    AnonymousClass0SN r0 = r6.A0Z;
                    if (r0 != null) {
                        AnonymousClass0Dr r2 = r0.A0d.A06;
                        if (r2.A0B) {
                            i2 = (int) ((((float) r2.A02) * r6.A03) + 0.5f);
                        }
                    }
                } else if (i3 == 3) {
                    AnonymousClass0Dr r22 = r6.A0c.A06;
                    if (r22.A0B) {
                        int i4 = r6.A08;
                        i2 = (int) (((i4 == -1 || i4 != 0) ? ((float) r22.A02) / r6.A01 : ((float) r22.A02) * r6.A01) + 0.5f);
                    }
                }
                r5.A02(i2);
            }
            C07240aq r7 = this.A05;
            if (r7.A0A) {
                C07240aq r62 = this.A04;
                if (!r62.A0A) {
                    return;
                }
                if (!r7.A0B || !r62.A0B || !r5.A0B) {
                    if (!r5.A0B) {
                        C03810Jy r8 = this.A02;
                        C03810Jy r23 = C03810Jy.MATCH_CONSTRAINT;
                        if (r8 == r23) {
                            AnonymousClass0SN r1 = this.A03;
                            if (r1.A0D == 0 && !r1.A0K()) {
                                C07250ar.A07(r7, r62, r5);
                                return;
                            }
                        }
                        if (r8 == r23 && this.A00 == 1) {
                            List list = r7.A08;
                            if (list.size() > 0) {
                                List list2 = r62.A08;
                                if (list2.size() > 0) {
                                    int i5 = (((C07240aq) list2.get(0)).A02 + r62.A00) - (((C07240aq) list.get(0)).A02 + r7.A00);
                                    int i6 = r5.A00;
                                    if (i5 < i6) {
                                        r5.A02(i5);
                                    } else {
                                        r5.A02(i6);
                                    }
                                }
                            }
                        }
                    }
                    if (r5.A0B) {
                        List list3 = r7.A08;
                        if (list3.size() > 0) {
                            List list4 = r62.A08;
                            if (list4.size() > 0) {
                                C07240aq r10 = (C07240aq) list3.get(0);
                                C07240aq r9 = (C07240aq) list4.get(0);
                                int i7 = r10.A02;
                                int i8 = i7 + r7.A00;
                                int i9 = r9.A02;
                                int i10 = i9 + r62.A00;
                                float f2 = this.A03.A06;
                                if (r10 == r9) {
                                    i8 = i7;
                                    i10 = i9;
                                    f2 = 0.5f;
                                }
                                r7.A02((int) (((float) i8) + 0.5f + (((float) ((i10 - i8) - r5.A02)) * f2)));
                                r62.A02(r7.A02 + r5.A02);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        AnonymousClass0SN r02 = this.A03;
        A0E(r02.A0Y, r02.A0S, 1);
    }

    public String toString() {
        return AnonymousClass000.A0h(this.A03.A0f, AnonymousClass000.A0r("VerticalRun "));
    }
}

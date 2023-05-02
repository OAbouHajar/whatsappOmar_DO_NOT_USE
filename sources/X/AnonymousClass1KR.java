package X;

/* renamed from: X.1KR  reason: invalid class name */
public class AnonymousClass1KR {
    public final C17170ue A00;
    public final C17210ui A01;
    public final C14710pd A02;
    public final C16490t9 A03;
    public final C20060zR A04;
    public final C16320sq A05;

    public AnonymousClass1KR(C17170ue r1, C17210ui r2, C14710pd r3, C16490t9 r4, C20060zR r5, C16320sq r6) {
        this.A02 = r3;
        this.A05 = r6;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = r1;
        this.A01 = r2;
    }

    public static final Integer A00(Integer num) {
        int intValue;
        int i2;
        if (num == null || (intValue = num.intValue()) < 0) {
            return null;
        }
        int i3 = 1;
        if (intValue != 0) {
            if (intValue == 1) {
                i2 = 2;
            } else {
                i3 = 10;
                if (intValue <= 10) {
                    i2 = 3;
                } else if (intValue <= 50) {
                    i2 = 4;
                } else if (intValue <= 100) {
                    i2 = 5;
                } else if (intValue <= 500) {
                    i2 = 6;
                } else if (intValue <= 1000) {
                    i2 = 7;
                } else if (intValue <= 10000) {
                    i2 = 8;
                } else if (intValue <= 100000) {
                    i2 = 9;
                } else if (intValue > 1000000) {
                    i2 = 11;
                }
            }
            return Integer.valueOf(i2);
        }
        return Integer.valueOf(i3);
    }

    public void A01(C35661mI r12, int i2) {
        Integer valueOf;
        if (r12 != null) {
            C75353s1 r1 = new C75353s1();
            r1.A03 = r12.A05;
            if (i2 == 0) {
                r1.A04 = r12.A08;
            }
            r1.A01 = r12.A04;
            r1.A02 = Integer.valueOf(i2);
            this.A03.A06(r1);
            C17210ui r2 = this.A01;
            int i3 = r12.A02;
            double d2 = r12.A00;
            Double d3 = r12.A03;
            String str = r12.A07;
            String str2 = r12.A06;
            int i4 = 2;
            if (i2 != 1) {
                if (i2 == 2 || i2 == 3) {
                    i4 = 4;
                } else {
                    int i5 = 6;
                    if (i2 != 6) {
                        i5 = 7;
                        i4 = 5;
                        if (i2 != 7) {
                            i4 = 8;
                            if (i2 != 8) {
                                if (i2 != 10) {
                                    valueOf = null;
                                    r2.A08(d3, valueOf, str, str2, d2, i3, r12.A01);
                                }
                            }
                        }
                    }
                    valueOf = Integer.valueOf(i5);
                    r2.A08(d3, valueOf, str, str2, d2, i3, r12.A01);
                }
            }
            valueOf = Integer.valueOf(i4);
            r2.A08(d3, valueOf, str, str2, d2, i3, r12.A01);
        }
    }

    public void A02(C35661mI r3, int i2) {
        if (r3 != null) {
            A01(r3, i2);
            return;
        }
        C75353s1 r1 = new C75353s1();
        r1.A02 = Integer.valueOf(i2);
        this.A03.A06(r1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r0.intValue() != 0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C35661mI r5, int r6, boolean r7) {
        /*
            r4 = this;
            X.3s1 r3 = new X.3s1
            r3.<init>()
            if (r5 == 0) goto L_0x0019
            java.lang.String r0 = r5.A05
            r3.A03 = r0
            java.lang.String r0 = r5.A08
            r3.A04 = r0
            java.lang.Integer r0 = r5.A04
            r3.A01 = r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x003b
        L_0x0019:
            r0 = 17
            if (r6 == r0) goto L_0x0021
            r0 = 15
            if (r6 != r0) goto L_0x003b
        L_0x0021:
            X.0ui r2 = r4.A01
            r0 = 5
            r2.A00 = r0
            java.util.Random r0 = r2.A02
            if (r0 != 0) goto L_0x0031
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r2.A02 = r0
        L_0x0031:
            long r0 = r0.nextLong()
            java.lang.String r0 = java.lang.Long.toHexString(r0)
            r2.A01 = r0
        L_0x003b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)
            r3.A00 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r3.A02 = r0
            X.0t9 r0 = r4.A03
            r0.A06(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KR.A03(X.1mI, int, boolean):void");
    }

    public void A04(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str, int i2, boolean z2, boolean z3) {
        Integer num6 = num;
        Integer num7 = num2;
        Integer num8 = num3;
        Integer num9 = num4;
        Integer num10 = num5;
        int i3 = i2;
        boolean z4 = z2;
        boolean z5 = z3;
        if (this.A02.A0E(C16620tM.A02, 904)) {
            this.A05.Acl(new AnonymousClass56W(this, num6, num7, num8, num10, num9, str, i3, z4, z5));
            return;
        }
        C75803sk r1 = new C75803sk();
        r1.A06 = Integer.valueOf(i3);
        r1.A09 = this.A00.A00;
        r1.A07 = num;
        r1.A01 = Boolean.valueOf(z4);
        r1.A02 = num2;
        r1.A03 = num8;
        r1.A04 = num10;
        r1.A00 = Boolean.valueOf(z5);
        r1.A05 = num9;
        this.A03.A06(r1);
    }

    public void A05(Integer num, Integer num2, String str, int i2, boolean z2, boolean z3) {
        A04(num, (Integer) null, (Integer) null, num2, (Integer) null, str, i2, z2, z3);
    }
}

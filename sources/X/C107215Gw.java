package X;

/* renamed from: X.5Gw  reason: invalid class name and case insensitive filesystem */
public class C107215Gw extends C89464cE {
    public int A00;
    public String A01;

    public C107215Gw(int i2) {
        super(i2);
    }

    public static C804343v A00(char c2, int i2, int i3) {
        return new C804343v(Character.valueOf(c2), i2, i3);
    }

    public static C804343v A01(C89464cE r3, int i2) {
        return new C804343v(r3.A04, r3.A01, i2);
    }

    public static void A02(C107215Gw r2, boolean[] zArr) {
        int i2 = r2.A01;
        r2.A08(zArr);
        r2.A0B(i2, r2.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r15.A09 != false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x012b, code lost:
        if (r3 > r0) goto L_0x012d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A09(boolean[] r16) {
        /*
            r15 = this;
            int r2 = r15.A01
            r15.A04()
        L_0x0005:
            char r8 = r15.A00
            r0 = 48
            if (r8 < r0) goto L_0x0013
            r0 = 57
            if (r8 > r0) goto L_0x0013
            r15.A05()
            goto L_0x0005
        L_0x0013:
            r3 = 101(0x65, float:1.42E-43)
            r0 = 46
            r4 = 26
            r7 = 126(0x7e, float:1.77E-43)
            r1 = 69
            r5 = 1
            r6 = r16
            if (r8 == r0) goto L_0x0044
            if (r8 == r1) goto L_0x0055
            if (r8 == r3) goto L_0x0055
            r15.A07()
            char r1 = r15.A00
            if (r1 < 0) goto L_0x00ab
            if (r1 >= r7) goto L_0x00ab
            boolean r0 = r16[r1]
            if (r0 != 0) goto L_0x00ab
            if (r1 == r4) goto L_0x00ab
        L_0x0035:
            r15.A08(r6)
            int r0 = r15.A01
            r15.A0B(r2, r0)
            boolean r0 = r15.A09
            if (r0 == 0) goto L_0x01bb
        L_0x0041:
            java.lang.String r0 = r15.A04
            return r0
        L_0x0044:
            r15.A04()
        L_0x0047:
            char r8 = r15.A00
            r0 = 48
            if (r8 < r0) goto L_0x0055
            r0 = 57
            if (r8 > r0) goto L_0x0055
            r15.A05()
            goto L_0x0047
        L_0x0055:
            if (r8 == r1) goto L_0x0069
            if (r8 == r3) goto L_0x0069
        L_0x0059:
            r15.A07()
            char r1 = r15.A00
            if (r1 < 0) goto L_0x016a
            if (r1 >= r7) goto L_0x016a
            boolean r0 = r16[r1]
            if (r0 != 0) goto L_0x016a
            if (r1 == r4) goto L_0x016a
            goto L_0x0035
        L_0x0069:
            X.4U7 r3 = r15.A06
            r3.A00(r1)
            r15.A04()
            char r1 = r15.A00
            r0 = 43
            if (r1 == r0) goto L_0x0083
            r0 = 45
            if (r1 == r0) goto L_0x0083
            r0 = 48
            if (r1 < r0) goto L_0x0097
            r0 = 57
            if (r1 > r0) goto L_0x0097
        L_0x0083:
            r3.A00(r1)
            r15.A04()
        L_0x0089:
            char r1 = r15.A00
            r0 = 48
            if (r1 < r0) goto L_0x0059
            r0 = 57
            if (r1 > r0) goto L_0x0059
            r15.A05()
            goto L_0x0089
        L_0x0097:
            r15.A08(r6)
            int r0 = r15.A01
            r15.A0B(r2, r0)
            boolean r0 = r15.A09
            if (r0 == 0) goto L_0x01bb
            boolean r0 = r15.A07
            if (r0 != 0) goto L_0x0041
            r15.A03()
            goto L_0x0041
        L_0x00ab:
            int r0 = r15.A01
            r15.A0B(r2, r0)
            java.lang.String r6 = r15.A04
            int r10 = r6.length()
            r3 = 0
            char r1 = r6.charAt(r3)
            r2 = 6
            r7 = 48
            r0 = 45
            if (r1 != r0) goto L_0x00dc
            r1 = 20
            boolean r0 = r15.A07
            if (r0 != 0) goto L_0x00d9
            r0 = 3
            if (r10 < r0) goto L_0x00d9
            char r0 = r6.charAt(r5)
            if (r0 != r7) goto L_0x00d9
            int r1 = r15.A01
            X.43v r0 = new X.43v
            r0.<init>(r6, r1, r2)
            throw r0
        L_0x00d9:
            r11 = 1
            r14 = 1
            goto L_0x00f5
        L_0x00dc:
            boolean r0 = r15.A07
            if (r0 != 0) goto L_0x00f1
            r0 = 2
            if (r10 < r0) goto L_0x00f1
            char r0 = r6.charAt(r3)
            if (r0 != r7) goto L_0x00f1
            int r1 = r15.A01
            X.43v r0 = new X.43v
            r0.<init>(r6, r1, r2)
            throw r0
        L_0x00f1:
            r1 = 19
            r11 = 0
            r14 = 0
        L_0x00f5:
            r8 = 10
            if (r10 >= r1) goto L_0x010d
            r5 = 0
        L_0x00fa:
            r1 = 0
        L_0x00fc:
            r12 = 10
            if (r11 >= r10) goto L_0x0112
            long r1 = r1 * r12
            int r9 = r11 + 1
            char r0 = r6.charAt(r11)
            int r0 = 48 - r0
            long r3 = (long) r0
            long r1 = r1 + r3
            r11 = r9
            goto L_0x00fc
        L_0x010d:
            if (r10 > r1) goto L_0x012d
            int r10 = r10 + -1
            goto L_0x00fa
        L_0x0112:
            if (r5 == 0) goto L_0x013b
            r3 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x0133
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x012d
            char r3 = r6.charAt(r11)
            r0 = 55
            if (r14 == 0) goto L_0x012b
            r0 = 56
        L_0x012b:
            if (r3 <= r0) goto L_0x0133
        L_0x012d:
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r6, r8)
            return r0
        L_0x0133:
            long r1 = r1 * r12
            char r0 = r6.charAt(r11)
            int r7 = r7 - r0
            long r3 = (long) r7
            long r1 = r1 + r3
        L_0x013b:
            if (r14 == 0) goto L_0x0153
            boolean r0 = r15.A0I
            if (r0 == 0) goto L_0x014e
            r3 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x014e
            int r0 = (int) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x014e:
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            return r0
        L_0x0153:
            long r3 = -r1
            boolean r0 = r15.A0I
            if (r0 == 0) goto L_0x0165
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0165
            int r0 = (int) r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x0165:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            return r0
        L_0x016a:
            int r0 = r15.A01
            r15.A0B(r2, r0)
            boolean r0 = r15.A07
            if (r0 != 0) goto L_0x0176
            r15.A03()
        L_0x0176:
            boolean r0 = r15.A0H     // Catch:{ NumberFormatException -> 0x01b6 }
            if (r0 != 0) goto L_0x0185
            java.lang.String r0 = r15.A04     // Catch:{ NumberFormatException -> 0x01b6 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x01b6 }
            java.lang.Float r4 = java.lang.Float.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01b6 }
            return r4
        L_0x0185:
            java.lang.String r2 = r15.A04     // Catch:{ NumberFormatException -> 0x01b6 }
            int r1 = r2.length()     // Catch:{ NumberFormatException -> 0x01b6 }
            r0 = 18
            if (r1 <= r0) goto L_0x01ad
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x01b6 }
            r4.<init>(r2)     // Catch:{ NumberFormatException -> 0x01b6 }
            boolean r0 = r15.A0G     // Catch:{ NumberFormatException -> 0x01b6 }
            if (r0 != 0) goto L_0x01b5
            java.lang.String r3 = r15.A04     // Catch:{ NumberFormatException -> 0x01b6 }
            double r1 = java.lang.Double.parseDouble(r3)     // Catch:{ NumberFormatException -> 0x01b6 }
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ NumberFormatException -> 0x01b6 }
            boolean r0 = r0.equals(r3)     // Catch:{ NumberFormatException -> 0x01b6 }
            if (r0 == 0) goto L_0x01b5
            java.lang.Double r4 = java.lang.Double.valueOf(r1)     // Catch:{ NumberFormatException -> 0x01b6 }
            return r4
        L_0x01ad:
            double r0 = java.lang.Double.parseDouble(r2)     // Catch:{ NumberFormatException -> 0x01b6 }
            java.lang.Double r4 = java.lang.Double.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01b6 }
        L_0x01b5:
            return r4
        L_0x01b6:
            X.43v r0 = A01(r15, r5)
            throw r0
        L_0x01bb:
            X.43v r0 = A01(r15, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107215Gw.A09(boolean[]):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        r3 = A00(r3, r4.A01, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        r0 = A09(X.C89464cE.A0N);
        r4.A02 = r0;
        r3 = r6.A03(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f4, code lost:
        r3 = r6.A03(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0A(java.lang.String r5, X.AnonymousClass4XH r6) {
        /*
            r4 = this;
            X.4RL r0 = r6.A00
            r4.A05 = r0
            r4.A01 = r5
            int r0 = r5.length()
            r4.A00 = r0
            r0 = -1
            r4.A01 = r0
        L_0x000f:
            r4.A04()     // Catch:{ IOException -> 0x011c }
            char r3 = r4.A00     // Catch:{ IOException -> 0x011c }
            r0 = 9
            if (r3 == r0) goto L_0x000f
            r0 = 10
            if (r3 == r0) goto L_0x000f
            r2 = 1
            switch(r3) {
                case 13: goto L_0x000f;
                case 32: goto L_0x000f;
                case 34: goto L_0x0043;
                case 39: goto L_0x0043;
                case 45: goto L_0x004e;
                case 78: goto L_0x005c;
                case 91: goto L_0x008e;
                case 93: goto L_0x003a;
                case 102: goto L_0x0093;
                case 110: goto L_0x00b5;
                case 116: goto L_0x00d2;
                case 123: goto L_0x00f9;
                case 125: goto L_0x003a;
                default: goto L_0x0020;
            }     // Catch:{ IOException -> 0x011c }
        L_0x0020:
            switch(r3) {
                case 48: goto L_0x004e;
                case 49: goto L_0x004e;
                case 50: goto L_0x004e;
                case 51: goto L_0x004e;
                case 52: goto L_0x004e;
                case 53: goto L_0x004e;
                case 54: goto L_0x004e;
                case 55: goto L_0x004e;
                case 56: goto L_0x004e;
                case 57: goto L_0x004e;
                case 58: goto L_0x003a;
                default: goto L_0x0023;
            }     // Catch:{ IOException -> 0x011c }
        L_0x0023:
            boolean[] r0 = X.C89464cE.A0N     // Catch:{ IOException -> 0x011c }
            A02(r4, r0)     // Catch:{ IOException -> 0x011c }
            boolean r0 = r4.A09     // Catch:{ IOException -> 0x011c }
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = r4.A04     // Catch:{ IOException -> 0x011c }
            java.lang.Object r3 = r6.A03(r0)     // Catch:{ IOException -> 0x011c }
            goto L_0x00fd
        L_0x0034:
            X.43v r3 = A01(r4, r2)     // Catch:{ IOException -> 0x011c }
            goto L_0x0115
        L_0x003a:
            int r1 = r4.A01     // Catch:{ IOException -> 0x011c }
            r0 = 0
            X.43v r3 = A00(r3, r1, r0)     // Catch:{ IOException -> 0x011c }
            goto L_0x0115
        L_0x0043:
            r4.A06()     // Catch:{ IOException -> 0x011c }
            java.lang.String r0 = r4.A04     // Catch:{ IOException -> 0x011c }
            java.lang.Object r3 = r6.A03(r0)     // Catch:{ IOException -> 0x011c }
            goto L_0x00fd
        L_0x004e:
            boolean[] r0 = X.C89464cE.A0N     // Catch:{ IOException -> 0x011c }
            java.lang.Object r0 = r4.A09(r0)     // Catch:{ IOException -> 0x011c }
            r4.A02 = r0     // Catch:{ IOException -> 0x011c }
            java.lang.Object r3 = r6.A03(r0)     // Catch:{ IOException -> 0x011c }
            goto L_0x00fd
        L_0x005c:
            boolean[] r0 = X.C89464cE.A0N     // Catch:{ IOException -> 0x011c }
            A02(r4, r0)     // Catch:{ IOException -> 0x011c }
            boolean r0 = r4.A08     // Catch:{ IOException -> 0x011c }
            if (r0 == 0) goto L_0x0088
            java.lang.String r1 = r4.A04     // Catch:{ IOException -> 0x011c }
            java.lang.String r0 = "NaN"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x011c }
            if (r0 == 0) goto L_0x007b
            r0 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ IOException -> 0x011c }
            java.lang.Object r3 = r6.A03(r0)     // Catch:{ IOException -> 0x011c }
            goto L_0x00fd
        L_0x007b:
            boolean r0 = r4.A09     // Catch:{ IOException -> 0x011c }
            if (r0 != 0) goto L_0x00f4
            int r0 = r4.A01     // Catch:{ IOException -> 0x011c }
            X.43v r3 = new X.43v     // Catch:{ IOException -> 0x011c }
            r3.<init>(r1, r0, r2)     // Catch:{ IOException -> 0x011c }
            goto L_0x0115
        L_0x0088:
            X.43v r3 = A01(r4, r2)     // Catch:{ IOException -> 0x011c }
            goto L_0x0115
        L_0x008e:
            java.lang.Object r3 = r4.A00(r6)     // Catch:{ IOException -> 0x011c }
            goto L_0x00fd
        L_0x0093:
            boolean[] r0 = X.C89464cE.A0N     // Catch:{ IOException -> 0x011c }
            A02(r4, r0)     // Catch:{ IOException -> 0x011c }
            java.lang.String r1 = r4.A04     // Catch:{ IOException -> 0x011c }
            java.lang.String r0 = "false"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x011c }
            if (r0 == 0) goto L_0x00a9
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ IOException -> 0x011c }
            java.lang.Object r3 = r6.A03(r0)     // Catch:{ IOException -> 0x011c }
            goto L_0x00fd
        L_0x00a9:
            boolean r0 = r4.A09     // Catch:{ IOException -> 0x011c }
            if (r0 != 0) goto L_0x00f4
            int r0 = r4.A01     // Catch:{ IOException -> 0x011c }
            X.43v r3 = new X.43v     // Catch:{ IOException -> 0x011c }
            r3.<init>(r1, r0, r2)     // Catch:{ IOException -> 0x011c }
            goto L_0x0115
        L_0x00b5:
            boolean[] r0 = X.C89464cE.A0N     // Catch:{ IOException -> 0x011c }
            A02(r4, r0)     // Catch:{ IOException -> 0x011c }
            java.lang.String r1 = r4.A04     // Catch:{ IOException -> 0x011c }
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x011c }
            if (r0 == 0) goto L_0x00c6
            r3 = 0
            goto L_0x00fd
        L_0x00c6:
            boolean r0 = r4.A09     // Catch:{ IOException -> 0x011c }
            if (r0 != 0) goto L_0x00f4
            int r0 = r4.A01     // Catch:{ IOException -> 0x011c }
            X.43v r3 = new X.43v     // Catch:{ IOException -> 0x011c }
            r3.<init>(r1, r0, r2)     // Catch:{ IOException -> 0x011c }
            goto L_0x0115
        L_0x00d2:
            boolean[] r0 = X.C89464cE.A0N     // Catch:{ IOException -> 0x011c }
            A02(r4, r0)     // Catch:{ IOException -> 0x011c }
            java.lang.String r1 = r4.A04     // Catch:{ IOException -> 0x011c }
            java.lang.String r0 = "true"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x011c }
            if (r0 == 0) goto L_0x00e8
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ IOException -> 0x011c }
            java.lang.Object r3 = r6.A03(r0)     // Catch:{ IOException -> 0x011c }
            goto L_0x00fd
        L_0x00e8:
            boolean r0 = r4.A09     // Catch:{ IOException -> 0x011c }
            if (r0 != 0) goto L_0x00f4
            int r0 = r4.A01     // Catch:{ IOException -> 0x011c }
            X.43v r3 = new X.43v     // Catch:{ IOException -> 0x011c }
            r3.<init>(r1, r0, r2)     // Catch:{ IOException -> 0x011c }
            goto L_0x0115
        L_0x00f4:
            java.lang.Object r3 = r6.A03(r1)     // Catch:{ IOException -> 0x011c }
            goto L_0x00fd
        L_0x00f9:
            java.lang.Object r3 = r4.A01(r6)     // Catch:{ IOException -> 0x011c }
        L_0x00fd:
            boolean r0 = r4.A0C     // Catch:{ IOException -> 0x011c }
            if (r0 == 0) goto L_0x0116
            boolean r0 = r4.A0D     // Catch:{ IOException -> 0x011c }
            if (r0 != 0) goto L_0x0108
            r4.A07()     // Catch:{ IOException -> 0x011c }
        L_0x0108:
            char r1 = r4.A00     // Catch:{ IOException -> 0x011c }
            r0 = 26
            if (r1 == r0) goto L_0x0116
            int r0 = r4.A01     // Catch:{ IOException -> 0x011c }
            int r0 = r0 - r2
            X.43v r3 = A00(r1, r0, r2)     // Catch:{ IOException -> 0x011c }
        L_0x0115:
            throw r3     // Catch:{ IOException -> 0x011c }
        L_0x0116:
            r0 = 0
            r4.A04 = r0
            r4.A02 = r0
            return r3
        L_0x011c:
            r2 = move-exception
            int r1 = r4.A01
            X.43v r0 = new X.43v
            r0.<init>(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C107215Gw.A0A(java.lang.String, X.4XH):java.lang.Object");
    }

    public void A0B(int i2, int i3) {
        while (i2 < i3 - 1 && Character.isWhitespace(this.A01.charAt(i2))) {
            i2++;
        }
        while (true) {
            int i4 = i3 - 1;
            if (i4 <= i2 || !Character.isWhitespace(this.A01.charAt(i4))) {
                this.A04 = this.A01.substring(i2, i3);
            } else {
                i3--;
            }
        }
        this.A04 = this.A01.substring(i2, i3);
    }
}

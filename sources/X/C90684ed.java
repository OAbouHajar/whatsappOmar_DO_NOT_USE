package X;

/* renamed from: X.4ed  reason: invalid class name and case insensitive filesystem */
public final class C90684ed {
    public double A00;
    public AnonymousClass426 A01;
    public final int A02;
    public final int A03;

    public C90684ed() {
        AnonymousClass426 r3 = AnonymousClass426.VALUE;
        this.A02 = -1;
        this.A03 = -1;
        this.A01 = r3;
        this.A00 = 0.0d;
    }

    public C90684ed(double d2) {
        AnonymousClass426 r1 = AnonymousClass426.CONSTANT;
        this.A02 = -1;
        this.A03 = -1;
        this.A01 = r1;
        this.A00 = d2;
    }

    public C90684ed(AnonymousClass426 r4, int i2) {
        C18450wi.A0H(r4, 2);
        this.A02 = i2;
        this.A03 = -1;
        this.A01 = r4;
        this.A00 = 0.0d;
    }

    public C90684ed(AnonymousClass426 r3, int i2, int i3) {
        C18450wi.A0H(r3, 3);
        this.A02 = i2;
        this.A03 = i3;
        this.A01 = r3;
        this.A00 = 0.0d;
    }

    public static final int A00(double d2, double d3) {
        if (Math.abs(d2 - d3) < 1.0E-11d) {
            return 0;
        }
        return d2 < d3 ? -1 : 1;
    }

    public static final boolean A01(double d2, double d3) {
        return Math.abs(d2 - d3) < 1.0E-11d;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a8, code lost:
        if (A01(r0, r2) != false) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b0, code lost:
        if (A00(r0, r2) > 0) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00be, code lost:
        if (A00(r0, r2) < 0) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c6, code lost:
        if (A00(r0, r2) <= 0) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0159, code lost:
        throw X.C105585Ae.A00(java.lang.Double.valueOf(r2), "Division by zero found. rightValue=");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0166, code lost:
        if (r0 < 0) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0168, code lost:
        r2 = 1.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x016a, code lost:
        r10.A00 = r2;
        r0 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0170, code lost:
        if (r0 == 0.0d) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0172, code lost:
        r2 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0177, code lost:
        if (r0 == 0.0d) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x017b, code lost:
        if (r2 != 0.0d) goto L_0x0168;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final double A02(X.C89484cG r11, java.util.ArrayList r12, int r13) {
        /*
            r10 = this;
            r5 = 0
            int r4 = r10.A02
            java.lang.String r9 = "Object has operation field set to "
            r1 = -1
            if (r4 != r1) goto L_0x003f
            int r0 = r10.A03
            if (r0 != r1) goto L_0x0195
            X.426 r2 = r10.A01
            int r0 = r2.ordinal()
            switch(r0) {
                case 18: goto L_0x002c;
                case 19: goto L_0x003b;
                default: goto L_0x0015;
            }
        L_0x0015:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r9)
            java.lang.String r0 = r2.name()
            r1.append(r0)
            java.lang.String r0 = " which is not defined for zero operands!"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            X.5Ae r0 = new X.5Ae
            r0.<init>(r1)
            throw r0
        L_0x002c:
            java.lang.Object r0 = r12.get(r13)
            X.C18450wi.A0B(r0)
            double r0 = X.AnonymousClass3K3.A01(r0)
            r10.A00 = r0
            goto L_0x018f
        L_0x003b:
            double r0 = r10.A00
            goto L_0x0188
        L_0x003f:
            if (r4 == r1) goto L_0x0195
            int r3 = r10.A03
            if (r3 != r1) goto L_0x006c
            X.4ed r0 = r11.A0C(r4)
            double r3 = r0.A02(r11, r12, r4)
            X.426 r2 = r10.A01
            int r0 = r2.ordinal()
            if (r0 == r5) goto L_0x017e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r9)
            java.lang.String r0 = r2.name()
            r1.append(r0)
            java.lang.String r0 = " which is not defined for one operand!"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            X.5Ae r0 = new X.5Ae
            r0.<init>(r1)
            throw r0
        L_0x006c:
            if (r4 == r1) goto L_0x0195
            if (r3 == r1) goto L_0x0195
            X.4ed r0 = r11.A0C(r4)
            double r0 = r0.A02(r11, r12, r4)
            X.4ed r2 = r11.A0C(r3)
            double r2 = r2.A02(r11, r12, r3)
            X.426 r8 = r10.A01
            int r7 = r8.ordinal()
            java.lang.String r6 = "Division by zero found. rightValue="
            r4 = 0
            switch(r7) {
                case 1: goto L_0x016e;
                case 2: goto L_0x0175;
                case 3: goto L_0x00a4;
                case 4: goto L_0x015a;
                case 5: goto L_0x00ac;
                case 6: goto L_0x00b4;
                case 7: goto L_0x00ba;
                case 8: goto L_0x00c2;
                case 9: goto L_0x00ca;
                case 10: goto L_0x00cd;
                case 11: goto L_0x00d0;
                case 12: goto L_0x00d3;
                case 13: goto L_0x00dc;
                case 14: goto L_0x00e2;
                case 15: goto L_0x00e8;
                case 16: goto L_0x0144;
                case 17: goto L_0x0149;
                default: goto L_0x008d;
            }
        L_0x008d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r9)
            java.lang.String r0 = r8.name()
            r1.append(r0)
            java.lang.String r0 = " which is not defined for two operands!"
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)
            X.5Ae r0 = new X.5Ae
            r0.<init>(r1)
            throw r0
        L_0x00a4:
            boolean r0 = A01(r0, r2)
            if (r0 == 0) goto L_0x0172
            goto L_0x0168
        L_0x00ac:
            int r0 = A00(r0, r2)
            if (r0 <= 0) goto L_0x0172
            goto L_0x0168
        L_0x00b4:
            int r0 = A00(r0, r2)
            goto L_0x0166
        L_0x00ba:
            int r0 = A00(r0, r2)
            if (r0 >= 0) goto L_0x0172
            goto L_0x0168
        L_0x00c2:
            int r0 = A00(r0, r2)
            if (r0 > 0) goto L_0x0172
            goto L_0x0168
        L_0x00ca:
            double r0 = r0 + r2
            goto L_0x0186
        L_0x00cd:
            double r0 = r0 - r2
            goto L_0x0186
        L_0x00d0:
            double r0 = r0 * r2
            goto L_0x0186
        L_0x00d3:
            boolean r4 = A01(r2, r4)
            if (r4 != 0) goto L_0x0151
            double r0 = r0 / r2
            goto L_0x0186
        L_0x00dc:
            double r2 = java.lang.Math.min(r0, r2)
            goto L_0x016a
        L_0x00e2:
            double r2 = java.lang.Math.max(r0, r2)
            goto L_0x016a
        L_0x00e8:
            boolean r6 = A01(r0, r4)
            if (r6 != 0) goto L_0x0132
            int r6 = A00(r0, r4)
            if (r6 < 0) goto L_0x012b
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            boolean r8 = A01(r0, r6)
            if (r8 != 0) goto L_0x0124
            boolean r8 = A01(r2, r4)
            if (r8 != 0) goto L_0x011d
            int r8 = A00(r2, r4)
            if (r8 < 0) goto L_0x0139
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x011a
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x011a
            double r2 = java.lang.Math.log(r2)
            double r0 = java.lang.Math.log(r0)
            double r2 = r2 / r0
            goto L_0x016a
        L_0x011a:
            r2 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            goto L_0x016a
        L_0x011d:
            java.lang.Double r1 = java.lang.Double.valueOf(r2)
            java.lang.String r0 = "x of log is zero. rightValue="
            goto L_0x013f
        L_0x0124:
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "Base of log is one. leftValue="
            goto L_0x013f
        L_0x012b:
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "Base of log is negative. leftValue="
            goto L_0x013f
        L_0x0132:
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            java.lang.String r0 = "Base of log is zero. leftValue="
            goto L_0x013f
        L_0x0139:
            java.lang.Double r1 = java.lang.Double.valueOf(r2)
            java.lang.String r0 = "x of log is negative. rightValue="
        L_0x013f:
            X.5Ae r0 = X.C105585Ae.A00(r1, r0)
            throw r0
        L_0x0144:
            double r2 = java.lang.Math.pow(r0, r2)
            goto L_0x016a
        L_0x0149:
            boolean r4 = A01(r2, r4)
            if (r4 != 0) goto L_0x0151
            double r0 = r0 % r2
            goto L_0x0186
        L_0x0151:
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            X.5Ae r0 = X.C105585Ae.A00(r0, r6)
            throw r0
        L_0x015a:
            double r0 = r0 - r2
            double r3 = java.lang.Math.abs(r0)
            r1 = 4442235333156365461(0x3da5fd7fe1796495, double:1.0E-11)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
        L_0x0166:
            if (r0 < 0) goto L_0x0172
        L_0x0168:
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x016a:
            r10.A00 = r2
            r0 = r2
            goto L_0x0188
        L_0x016e:
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0179
        L_0x0172:
            r2 = 0
            goto L_0x016a
        L_0x0175:
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0168
        L_0x0179:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0168
            goto L_0x0172
        L_0x017e:
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0192
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x0186:
            r10.A00 = r0
        L_0x0188:
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r12.set(r13, r0)
        L_0x018f:
            double r0 = r10.A00
            return r0
        L_0x0192:
            r0 = 0
            goto L_0x0186
        L_0x0195:
            java.lang.String r0 = "Object has incorrect fields, can not represent an actual operation node. leftChildIndex="
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            r2.append(r4)
            java.lang.String r0 = ", rightChildIndex="
            r2.append(r0)
            int r0 = r10.A03
            r2.append(r0)
            java.lang.String r0 = ", operation="
            r2.append(r0)
            X.426 r0 = r10.A01
            r2.append(r0)
            java.lang.String r0 = ", value="
            r2.append(r0)
            double r0 = r10.A00
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            X.5Ae r0 = new X.5Ae
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90684ed.A02(X.4cG, java.util.ArrayList, int):double");
    }
}

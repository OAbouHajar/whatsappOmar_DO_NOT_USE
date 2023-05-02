package X;

/* renamed from: X.4cE  reason: invalid class name and case insensitive filesystem */
public abstract class C89464cE {
    public static boolean[] A0J;
    public static boolean[] A0K;
    public static boolean[] A0L;
    public static boolean[] A0M;
    public static boolean[] A0N;
    public char A00;
    public int A01;
    public Object A02;
    public String A03;
    public String A04;
    public AnonymousClass4RL A05;
    public final AnonymousClass4U7 A06 = new AnonymousClass4U7();
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    static {
        boolean[] zArr = new boolean[126];
        A0J = zArr;
        boolean[] zArr2 = new boolean[126];
        A0K = zArr2;
        boolean[] zArr3 = new boolean[126];
        A0L = zArr3;
        boolean[] zArr4 = new boolean[126];
        A0M = zArr4;
        boolean[] zArr5 = new boolean[126];
        A0N = zArr5;
        zArr3[26] = true;
        zArr3[58] = true;
        zArr4[26] = true;
        zArr4[125] = true;
        zArr4[44] = true;
        zArr2[26] = true;
        zArr2[93] = true;
        zArr2[44] = true;
        zArr5[26] = true;
        zArr[58] = true;
        zArr[44] = true;
        zArr[26] = true;
        zArr[125] = true;
        zArr[93] = true;
    }

    public C89464cE(int i2) {
        boolean z2 = false;
        this.A08 = AnonymousClass000.A1Q(i2 & 4);
        this.A09 = AnonymousClass000.A1Q(i2 & 2);
        this.A0A = AnonymousClass000.A1Q(i2 & 1);
        this.A0E = AnonymousClass000.A1Q(i2 & 8);
        this.A0I = AnonymousClass000.A1Q(i2 & 16);
        this.A07 = AnonymousClass000.A1Q(i2 & 32);
        this.A0B = AnonymousClass000.A1Q(i2 & 64);
        this.A0H = AnonymousClass000.A1Q(i2 & 128);
        this.A0C = AnonymousClass3K2.A1X(i2 & 768, 768);
        this.A0D = AnonymousClass000.A1P(i2 & 512);
        this.A0F = AnonymousClass000.A1Q(i2 & 1024);
        this.A0G = (i2 & 2048) > 0 ? true : z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        if (r2 == ':') goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        if (r2 == ']') goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        if (r2 == '}') goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        r2 = A02(r8, A0K);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        if ((r8 instanceof X.AnonymousClass5HC) != false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004a, code lost:
        if ((r8 instanceof X.AnonymousClass5HD) != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004e, code lost:
        if ((r8 instanceof X.AnonymousClass5HB) != false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0052, code lost:
        if ((r8 instanceof X.AnonymousClass5H9) != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0056, code lost:
        if ((r8 instanceof X.AnonymousClass5HE) != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0058, code lost:
        r1 = X.AnonymousClass000.A0r("Invalid or non Implemented status");
        r1.append(" addValue(Object current, Object value) in ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006f, code lost:
        throw X.AnonymousClass000.A0a(X.AnonymousClass000.A0f(r8.getClass(), r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0070, code lost:
        ((java.util.List) r3).add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0077, code lost:
        ((java.util.AbstractCollection) r3).add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x008d, code lost:
        if (r5 == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0091, code lost:
        if (r7.A0B == false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0093, code lost:
        A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x009a, code lost:
        return r8.A03(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A00(X.AnonymousClass4XH r8) {
        /*
            r7 = this;
            java.lang.Object r3 = r8.A01()
            char r1 = r7.A00
            r0 = 91
            if (r1 != r0) goto L_0x00ae
            r7.A04()
            char r2 = r7.A00
            r4 = 44
            r1 = 0
            if (r2 != r4) goto L_0x0018
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x00a7
        L_0x0018:
            r6 = 1
        L_0x0019:
            r5 = 0
        L_0x001a:
            char r2 = r7.A00
            r0 = 9
            if (r2 == r0) goto L_0x0089
            r0 = 10
            if (r2 == r0) goto L_0x0089
            r0 = 13
            if (r2 == r0) goto L_0x0089
            r0 = 26
            if (r2 == r0) goto L_0x009b
            r0 = 32
            if (r2 == r0) goto L_0x0089
            if (r2 == r4) goto L_0x007e
            r0 = 58
            if (r2 == r0) goto L_0x00a7
            r0 = 93
            if (r2 == r0) goto L_0x008d
            r0 = 125(0x7d, float:1.75E-43)
            if (r2 == r0) goto L_0x00a7
            boolean[] r0 = A0K
            java.lang.Object r2 = r7.A02(r8, r0)
            boolean r0 = r8 instanceof X.AnonymousClass5HC
            if (r0 != 0) goto L_0x0077
            boolean r0 = r8 instanceof X.AnonymousClass5HD
            if (r0 != 0) goto L_0x0070
            boolean r0 = r8 instanceof X.AnonymousClass5HB
            if (r0 != 0) goto L_0x0077
            boolean r0 = r8 instanceof X.AnonymousClass5H9
            if (r0 != 0) goto L_0x0070
            boolean r0 = r8 instanceof X.AnonymousClass5HE
            if (r0 != 0) goto L_0x0070
            java.lang.String r0 = "Invalid or non Implemented status"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = " addValue(Object current, Object value) in "
            r1.append(r0)
            java.lang.Class r0 = r8.getClass()
            java.lang.String r0 = X.AnonymousClass000.A0f(r0, r1)
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)
            throw r0
        L_0x0070:
            r0 = r3
            java.util.List r0 = (java.util.List) r0
            r0.add(r2)
            goto L_0x0019
        L_0x0077:
            r0 = r3
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            r0.add(r2)
            goto L_0x0019
        L_0x007e:
            if (r5 == 0) goto L_0x0084
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x00a7
        L_0x0084:
            r7.A04()
            r5 = 1
            goto L_0x001a
        L_0x0089:
            r7.A04()
            goto L_0x001a
        L_0x008d:
            if (r5 == 0) goto L_0x0093
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x00a7
        L_0x0093:
            r7.A04()
            java.lang.Object r0 = r8.A03(r3)
            return r0
        L_0x009b:
            int r3 = r7.A01
            int r3 = r3 - r6
            r2 = 3
            java.lang.String r1 = "EOF"
            X.43v r0 = new X.43v
            r0.<init>(r1, r3, r2)
            throw r0
        L_0x00a7:
            int r0 = r7.A01
            X.43v r0 = X.C107215Gw.A00(r2, r0, r1)
            throw r0
        L_0x00ae:
            java.lang.String r0 = "Internal Error"
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89464cE.A00(X.4XH):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x012b, code lost:
        throw X.C107215Gw.A00(r1, r13.A01, 0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x011d A[EDGE_INSN: B:85:0x011d->B:78:0x011d ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A01(X.AnonymousClass4XH r14) {
        /*
            r13 = this;
            char r0 = r13.A00
            r8 = 123(0x7b, float:1.72E-43)
            if (r0 != r8) goto L_0x012c
            java.lang.Object r7 = r14.A02()
            r4 = 0
            r6 = 1
            r2 = 0
        L_0x000d:
            r13.A04()
            char r1 = r13.A00
            r0 = 9
            if (r1 == r0) goto L_0x000d
            r0 = 10
            if (r1 == r0) goto L_0x000d
            r0 = 13
            if (r1 == r0) goto L_0x000d
            r0 = 32
            if (r1 == r0) goto L_0x000d
            r9 = 44
            if (r1 == r9) goto L_0x00c6
            r12 = 58
            if (r1 == r12) goto L_0x0125
            r0 = 91
            if (r1 == r0) goto L_0x0125
            r0 = 93
            if (r1 == r0) goto L_0x0125
            if (r1 == r8) goto L_0x0125
            r5 = 125(0x7d, float:1.75E-43)
            if (r1 == r5) goto L_0x0110
            r0 = 34
            if (r1 == r0) goto L_0x0051
            r0 = 39
            if (r1 == r0) goto L_0x0051
            boolean[] r1 = A0L
            r0 = r13
            X.5Gw r0 = (X.C107215Gw) r0
            X.C107215Gw.A02(r0, r1)
            boolean r0 = r13.A09
            if (r0 != 0) goto L_0x0054
            X.43v r0 = X.C107215Gw.A01(r13, r6)
            throw r0
        L_0x0051:
            r13.A06()
        L_0x0054:
            java.lang.String r2 = r13.A04
            r13.A07()
            char r0 = r13.A00
            r3 = 3
            r11 = 26
            r10 = 0
            if (r0 == r12) goto L_0x006c
            int r1 = r13.A01
            int r1 = r1 - r6
            if (r0 != r11) goto L_0x00d6
            X.43v r0 = new X.43v
            r0.<init>(r10, r1, r3)
            throw r0
        L_0x006c:
            r1 = r13
            X.5Gw r1 = (X.C107215Gw) r1
            int r0 = r1.A01
            int r12 = r0 + 1
            r1.A01 = r12
            int r0 = r1.A00
            if (r12 >= r0) goto L_0x0104
            java.lang.String r0 = r1.A01
            char r0 = r0.charAt(r12)
            r1.A00 = r0
            r13.A03 = r2
            boolean[] r0 = A0M
            java.lang.Object r1 = r13.A02(r14, r0)
            boolean r0 = r14 instanceof X.AnonymousClass5HC
            if (r0 != 0) goto L_0x00bf
            boolean r0 = r14 instanceof X.AnonymousClass5HD
            if (r0 != 0) goto L_0x00bf
            boolean r0 = r14 instanceof X.AnonymousClass5HB
            if (r0 == 0) goto L_0x00b0
            r0 = r7
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            r0.put(r2, r1)
        L_0x009b:
            r13.A03 = r10
            r13.A07()
            char r1 = r13.A00
            if (r1 == r5) goto L_0x011d
            if (r1 == r11) goto L_0x00db
            if (r1 == r9) goto L_0x00d3
            int r0 = r13.A01
            int r0 = r0 - r6
            X.43v r0 = X.C107215Gw.A00(r1, r0, r6)
            throw r0
        L_0x00b0:
            boolean r0 = r14 instanceof X.AnonymousClass5HA
            if (r0 != 0) goto L_0x00bf
            boolean r0 = r14 instanceof X.AnonymousClass5H8
            if (r0 == 0) goto L_0x00e4
            java.lang.String r0 = "set"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)
            throw r0
        L_0x00bf:
            r0 = r7
            java.util.Map r0 = (java.util.Map) r0
            r0.put(r2, r1)
            goto L_0x009b
        L_0x00c6:
            if (r2 == 0) goto L_0x00d3
            boolean r0 = r13.A0B
            if (r0 != 0) goto L_0x00d3
            int r0 = r13.A01
            X.43v r0 = X.C107215Gw.A00(r1, r0, r4)
            throw r0
        L_0x00d3:
            r2 = 1
            goto L_0x000d
        L_0x00d6:
            X.43v r0 = X.C107215Gw.A00(r0, r1, r4)
            throw r0
        L_0x00db:
            int r1 = r13.A01
            int r1 = r1 - r6
            X.43v r0 = new X.43v
            r0.<init>(r10, r1, r3)
            throw r0
        L_0x00e4:
            java.lang.String r0 = "Invalid or non Implemented status"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = " setValue in "
            r1.append(r0)
            java.lang.Class r0 = r14.getClass()
            r1.append(r0)
            java.lang.String r0 = " key="
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r2, r1)
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)
            throw r0
        L_0x0104:
            r1.A00 = r11
            int r2 = r12 + -1
            java.lang.String r1 = "EOF"
            X.43v r0 = new X.43v
            r0.<init>(r1, r2, r3)
            throw r0
        L_0x0110:
            if (r2 == 0) goto L_0x011d
            boolean r0 = r13.A0B
            if (r0 != 0) goto L_0x011d
            int r0 = r13.A01
            X.43v r0 = X.C107215Gw.A00(r1, r0, r4)
            throw r0
        L_0x011d:
            r13.A04()
            java.lang.Object r0 = r14.A03(r7)
            return r0
        L_0x0125:
            int r0 = r13.A01
            X.43v r0 = X.C107215Gw.A00(r1, r0, r4)
            throw r0
        L_0x012c:
            java.lang.String r0 = "Internal Error"
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89464cE.A01(X.4XH):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        return A09(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007b, code lost:
        throw X.C107215Gw.A00(r3, r4.A01, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c2, code lost:
        r1.append(r0);
        r1.append(r5.getClass());
        r1.append(" key=");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d9, code lost:
        throw X.AnonymousClass000.A0a(X.AnonymousClass000.A0h(r2, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e0, code lost:
        throw X.AnonymousClass000.A0W("get");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x010c, code lost:
        throw X.C107215Gw.A01(r4, 1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A02(X.AnonymousClass4XH r5, boolean[] r6) {
        /*
            r4 = this;
        L_0x0000:
            char r3 = r4.A00
            r0 = 9
            if (r3 == r0) goto L_0x001e
            r0 = 10
            if (r3 == r0) goto L_0x001e
            r2 = 1
            switch(r3) {
                case 13: goto L_0x001e;
                case 32: goto L_0x001e;
                case 34: goto L_0x0022;
                case 39: goto L_0x0022;
                case 45: goto L_0x0028;
                case 78: goto L_0x00e1;
                case 91: goto L_0x002d;
                case 93: goto L_0x0074;
                case 102: goto L_0x010d;
                case 110: goto L_0x012c;
                case 116: goto L_0x014a;
                case 123: goto L_0x007c;
                case 125: goto L_0x0074;
                default: goto L_0x000e;
            }
        L_0x000e:
            switch(r3) {
                case 48: goto L_0x0028;
                case 49: goto L_0x0028;
                case 50: goto L_0x0028;
                case 51: goto L_0x0028;
                case 52: goto L_0x0028;
                case 53: goto L_0x0028;
                case 54: goto L_0x0028;
                case 55: goto L_0x0028;
                case 56: goto L_0x0028;
                case 57: goto L_0x0028;
                case 58: goto L_0x0074;
                default: goto L_0x0011;
            }
        L_0x0011:
            r0 = r4
            X.5Gw r0 = (X.C107215Gw) r0
            X.C107215Gw.A02(r0, r6)
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x0108
            java.lang.String r0 = r4.A04
            return r0
        L_0x001e:
            r4.A04()
            goto L_0x0000
        L_0x0022:
            r4.A06()
            java.lang.String r0 = r4.A04
            return r0
        L_0x0028:
            java.lang.Object r0 = r4.A09(r6)
            return r0
        L_0x002d:
            java.lang.String r2 = r4.A03
            boolean r0 = r5 instanceof X.AnonymousClass5HC
            if (r0 == 0) goto L_0x003c
            X.4RL r0 = r5.A00
            X.4XH r5 = r0.A01
        L_0x0037:
            java.lang.Object r0 = r4.A00(r5)
            return r0
        L_0x003c:
            boolean r0 = r5 instanceof X.AnonymousClass5HD
            if (r0 != 0) goto L_0x0037
            boolean r0 = r5 instanceof X.AnonymousClass5HB
            if (r0 != 0) goto L_0x0066
            boolean r0 = r5 instanceof X.AnonymousClass5HA
            if (r0 != 0) goto L_0x0066
            boolean r0 = r5 instanceof X.AnonymousClass5H9
            if (r0 != 0) goto L_0x0066
            boolean r0 = r5 instanceof X.AnonymousClass5H8
            if (r0 != 0) goto L_0x00da
            boolean r0 = r5 instanceof X.C107225Gx
            if (r0 == 0) goto L_0x006b
            r2 = r5
            X.5Gx r2 = (X.C107225Gx) r2
            X.4XH r5 = r2.A00
            if (r5 != 0) goto L_0x0037
            X.4RL r1 = r2.A00
            java.lang.Class r0 = r2.A01
            X.4XH r5 = r1.A00(r0)
            r2.A00 = r5
            goto L_0x0037
        L_0x0066:
            X.4RL r0 = r5.A00
            X.4XH r5 = r0.A00
            goto L_0x0037
        L_0x006b:
            java.lang.String r0 = "Invalid or non Implemented status"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = " startArray in "
            goto L_0x00c2
        L_0x0074:
            int r1 = r4.A01
            r0 = 0
            X.43v r0 = X.C107215Gw.A00(r3, r1, r0)
            throw r0
        L_0x007c:
            java.lang.String r2 = r4.A03
            boolean r0 = r5 instanceof X.AnonymousClass5HC
            if (r0 == 0) goto L_0x008b
            X.4RL r0 = r5.A00
            X.4XH r5 = r0.A01
        L_0x0086:
            java.lang.Object r0 = r4.A01(r5)
            return r0
        L_0x008b:
            boolean r0 = r5 instanceof X.AnonymousClass5HD
            if (r0 != 0) goto L_0x0086
            boolean r0 = r5 instanceof X.AnonymousClass5HB
            if (r0 != 0) goto L_0x00b5
            boolean r0 = r5 instanceof X.AnonymousClass5HA
            if (r0 != 0) goto L_0x00b5
            boolean r0 = r5 instanceof X.AnonymousClass5H9
            if (r0 != 0) goto L_0x00b5
            boolean r0 = r5 instanceof X.AnonymousClass5H8
            if (r0 != 0) goto L_0x00da
            boolean r0 = r5 instanceof X.C107225Gx
            if (r0 == 0) goto L_0x00ba
            r2 = r5
            X.5Gx r2 = (X.C107225Gx) r2
            X.4XH r5 = r2.A00
            if (r5 != 0) goto L_0x0086
            X.4RL r1 = r2.A00
            java.lang.Class r0 = r2.A01
            X.4XH r5 = r1.A00(r0)
            r2.A00 = r5
            goto L_0x0086
        L_0x00b5:
            X.4RL r0 = r5.A00
            X.4XH r5 = r0.A00
            goto L_0x0086
        L_0x00ba:
            java.lang.String r0 = "Invalid or non Implemented status"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = " startObject(String key) in "
        L_0x00c2:
            r1.append(r0)
            java.lang.Class r0 = r5.getClass()
            r1.append(r0)
            java.lang.String r0 = " key="
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r2, r1)
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0a(r0)
            throw r0
        L_0x00da:
            java.lang.String r0 = "get"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0W(r0)
            throw r0
        L_0x00e1:
            r0 = r4
            X.5Gw r0 = (X.C107215Gw) r0
            X.C107215Gw.A02(r0, r6)
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x0108
            java.lang.String r3 = r4.A04
            java.lang.String r0 = "NaN"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00fc
            r0 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L_0x00fc:
            boolean r0 = r4.A09
            if (r0 != 0) goto L_0x0169
            int r1 = r4.A01
            X.43v r0 = new X.43v
            r0.<init>(r3, r1, r2)
            throw r0
        L_0x0108:
            X.43v r0 = X.C107215Gw.A01(r4, r2)
            throw r0
        L_0x010d:
            r0 = r4
            X.5Gw r0 = (X.C107215Gw) r0
            X.C107215Gw.A02(r0, r6)
            java.lang.String r3 = r4.A04
            java.lang.String r0 = "false"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0120
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x0120:
            boolean r0 = r4.A09
            if (r0 != 0) goto L_0x0169
            int r1 = r4.A01
            X.43v r0 = new X.43v
            r0.<init>(r3, r1, r2)
            throw r0
        L_0x012c:
            r0 = r4
            X.5Gw r0 = (X.C107215Gw) r0
            X.C107215Gw.A02(r0, r6)
            java.lang.String r3 = r4.A04
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x013e
            r0 = 0
            return r0
        L_0x013e:
            boolean r0 = r4.A09
            if (r0 != 0) goto L_0x0169
            int r1 = r4.A01
            X.43v r0 = new X.43v
            r0.<init>(r3, r1, r2)
            throw r0
        L_0x014a:
            r0 = r4
            X.5Gw r0 = (X.C107215Gw) r0
            X.C107215Gw.A02(r0, r6)
            java.lang.String r3 = r4.A04
            java.lang.String r0 = "true"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x015d
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x015d:
            boolean r0 = r4.A09
            if (r0 != 0) goto L_0x0169
            int r1 = r4.A01
            X.43v r0 = new X.43v
            r0.<init>(r3, r1, r2)
            throw r0
        L_0x0169:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89464cE.A02(X.4XH, boolean[]):java.lang.Object");
    }

    public void A03() {
        String str = this.A04;
        int length = str.length();
        if (length == 1) {
            return;
        }
        if (length != 2) {
            char charAt = str.charAt(0);
            char charAt2 = this.A04.charAt(1);
            if (charAt == '-') {
                char charAt3 = this.A04.charAt(2);
                if (charAt2 != '0' || charAt3 < '0' || charAt3 > '9') {
                    return;
                }
            } else if (charAt != '0' || charAt2 < '0' || charAt2 > '9') {
                return;
            }
            throw C107215Gw.A01(this, 6);
        } else if (str.equals("00")) {
            throw new C804343v(str, this.A01, 6);
        }
    }

    public void A04() {
        C107215Gw r2 = (C107215Gw) this;
        int i2 = r2.A01 + 1;
        r2.A01 = i2;
        r2.A00 = i2 >= r2.A00 ? 26 : r2.A01.charAt(i2);
    }

    public void A05() {
        C107215Gw r2 = (C107215Gw) this;
        int i2 = r2.A01 + 1;
        r2.A01 = i2;
        r2.A00 = i2 >= r2.A00 ? 26 : r2.A01.charAt(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0145, code lost:
        throw X.C107215Gw.A00(r3, r7.A01, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06() {
        /*
            r10 = this;
            r7 = r10
            X.5Gw r7 = (X.C107215Gw) r7
            boolean r0 = r7.A0A
            if (r0 != 0) goto L_0x001f
            char r2 = r7.A00
            r0 = 39
            if (r2 != r0) goto L_0x001f
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x0017
            boolean[] r0 = A0J
            X.C107215Gw.A02(r7, r0)
            return
        L_0x0017:
            int r1 = r7.A01
            r0 = 0
            X.43v r0 = X.C107215Gw.A00(r2, r1, r0)
            throw r0
        L_0x001f:
            char r2 = r7.A00
            int r0 = r7.A01
            int r1 = r0 + 1
            java.lang.String r0 = r7.A01
            int r5 = r0.indexOf(r2, r1)
            r2 = -1
            if (r5 == r2) goto L_0x014e
            java.lang.String r1 = r0.substring(r1, r5)
            r7.A04 = r1
            r9 = 92
            int r0 = r1.indexOf(r9)
            if (r0 != r2) goto L_0x006d
            boolean r0 = r7.A0E
            if (r0 != 0) goto L_0x0067
            int r4 = r1.length()
            r3 = 0
            r2 = 0
        L_0x0046:
            if (r2 >= r4) goto L_0x0067
            java.lang.String r0 = r7.A04
            char r1 = r0.charAt(r2)
            if (r1 < 0) goto L_0x005c
            r0 = 31
            if (r1 <= r0) goto L_0x005f
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 != r0) goto L_0x005c
            boolean r0 = r7.A0F
            if (r0 != 0) goto L_0x005f
        L_0x005c:
            int r2 = r2 + 1
            goto L_0x0046
        L_0x005f:
            int r0 = r7.A01
            int r0 = r0 + r2
            X.43v r0 = X.C107215Gw.A00(r1, r0, r3)
            throw r0
        L_0x0067:
            r7.A01 = r5
            r7.A04()
            return
        L_0x006d:
            X.4U7 r8 = r7.A06
            r8.A00 = r2
            char r6 = r7.A00
        L_0x0073:
            r7.A04()
            char r3 = r7.A00
            r2 = 34
            if (r3 == r2) goto L_0x0127
            r0 = 39
            if (r3 == r0) goto L_0x0127
            if (r3 == r9) goto L_0x009c
            r0 = 127(0x7f, float:1.78E-43)
            r1 = 0
            if (r3 == r0) goto L_0x0093
            switch(r3) {
                case 0: goto L_0x008e;
                case 1: goto L_0x008e;
                case 2: goto L_0x008e;
                case 3: goto L_0x008e;
                case 4: goto L_0x008e;
                case 5: goto L_0x008e;
                case 6: goto L_0x008e;
                case 7: goto L_0x008e;
                case 8: goto L_0x008e;
                case 9: goto L_0x008e;
                case 10: goto L_0x008e;
                case 11: goto L_0x008e;
                case 12: goto L_0x008e;
                case 13: goto L_0x008e;
                case 14: goto L_0x008e;
                case 15: goto L_0x008e;
                case 16: goto L_0x008e;
                case 17: goto L_0x008e;
                case 18: goto L_0x008e;
                case 19: goto L_0x008e;
                case 20: goto L_0x008e;
                case 21: goto L_0x008e;
                case 22: goto L_0x008e;
                case 23: goto L_0x008e;
                case 24: goto L_0x008e;
                case 25: goto L_0x008e;
                case 26: goto L_0x0133;
                case 27: goto L_0x008e;
                case 28: goto L_0x008e;
                case 29: goto L_0x008e;
                case 30: goto L_0x008e;
                case 31: goto L_0x008e;
                default: goto L_0x008a;
            }
        L_0x008a:
            r8.A00(r3)
            goto L_0x0073
        L_0x008e:
            boolean r0 = r7.A0E
            if (r0 == 0) goto L_0x013f
            goto L_0x0073
        L_0x0093:
            boolean r0 = r7.A0E
            if (r0 != 0) goto L_0x0073
            boolean r0 = r7.A0F
            if (r0 != 0) goto L_0x013f
            goto L_0x008a
        L_0x009c:
            r7.A04()
            char r1 = r7.A00
            if (r1 == r2) goto L_0x0122
            if (r1 == r0) goto L_0x011b
            r2 = 47
            if (r1 == r2) goto L_0x0122
            if (r1 == r9) goto L_0x0116
            r0 = 98
            if (r1 == r0) goto L_0x0113
            r0 = 102(0x66, float:1.43E-43)
            if (r1 == r0) goto L_0x0110
            r0 = 110(0x6e, float:1.54E-43)
            if (r1 == r0) goto L_0x010d
            r0 = 114(0x72, float:1.6E-43)
            if (r1 == r0) goto L_0x010a
            r0 = 120(0x78, float:1.68E-43)
            if (r1 == r0) goto L_0x0108
            r0 = 116(0x74, float:1.63E-43)
            if (r1 == r0) goto L_0x0120
            r0 = 117(0x75, float:1.64E-43)
            if (r1 != r0) goto L_0x0073
            r5 = 4
        L_0x00c8:
            r4 = 0
            r3 = 0
        L_0x00ca:
            int r3 = r3 << 4
            r7.A04()
            char r2 = r7.A00
            r0 = 57
            if (r2 > r0) goto L_0x00ea
            r1 = 48
            int r0 = r2 + -48
            if (r2 >= r1) goto L_0x00f6
            r0 = 26
            if (r2 != r0) goto L_0x0146
            int r3 = r7.A01
            r2 = 3
            java.lang.String r1 = "EOF"
            X.43v r0 = new X.43v
            r0.<init>(r1, r3, r2)
            throw r0
        L_0x00ea:
            r0 = 70
            if (r2 > r0) goto L_0x00fd
            r0 = 65
            if (r2 < r0) goto L_0x0146
            int r0 = r2 + -65
        L_0x00f4:
            int r0 = r0 + 10
        L_0x00f6:
            int r3 = r3 + r0
            int r4 = r4 + 1
            if (r4 < r5) goto L_0x00ca
            char r2 = (char) r3
            goto L_0x0122
        L_0x00fd:
            r0 = 97
            if (r2 < r0) goto L_0x0146
            r0 = 102(0x66, float:1.43E-43)
            if (r2 > r0) goto L_0x0146
            int r0 = r2 + -97
            goto L_0x00f4
        L_0x0108:
            r5 = 2
            goto L_0x00c8
        L_0x010a:
            r2 = 13
            goto L_0x0122
        L_0x010d:
            r2 = 10
            goto L_0x0122
        L_0x0110:
            r2 = 12
            goto L_0x0122
        L_0x0113:
            r2 = 8
            goto L_0x0122
        L_0x0116:
            r8.A00(r9)
            goto L_0x0073
        L_0x011b:
            r8.A00(r0)
            goto L_0x0073
        L_0x0120:
            r2 = 9
        L_0x0122:
            r8.A00(r2)
            goto L_0x0073
        L_0x0127:
            if (r6 != r3) goto L_0x008a
            r7.A04()
            java.lang.String r0 = r8.toString()
            r7.A04 = r0
            return
        L_0x0133:
            int r0 = r7.A01
            int r3 = r0 + -1
            r2 = 3
            r1 = 0
            X.43v r0 = new X.43v
            r0.<init>(r1, r3, r2)
            throw r0
        L_0x013f:
            int r0 = r7.A01
            X.43v r0 = X.C107215Gw.A00(r3, r0, r1)
            throw r0
        L_0x0146:
            int r1 = r7.A01
            r0 = 4
            X.43v r0 = X.C107215Gw.A00(r2, r1, r0)
            throw r0
        L_0x014e:
            int r3 = r7.A00
            r2 = 3
            r1 = 0
            X.43v r0 = new X.43v
            r0.<init>(r1, r3, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89464cE.A06():void");
    }

    public void A07() {
        while (true) {
            char c2 = this.A00;
            if (c2 <= ' ' && c2 != 26) {
                A05();
            } else {
                return;
            }
        }
    }

    public void A08(boolean[] zArr) {
        while (true) {
            char c2 = this.A00;
            if (c2 == 26) {
                return;
            }
            if (c2 < 0 || c2 >= '~' || !zArr[c2]) {
                A05();
            } else {
                return;
            }
        }
    }

    public abstract Object A09(boolean[] zArr);
}

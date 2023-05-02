package X;

/* renamed from: X.4YJ  reason: invalid class name */
public final class AnonymousClass4YJ {
    public static final int[] A00 = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b9, code lost:
        r17 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.C55142iu r21, boolean r22) {
        /*
            r20 = 0
            r13 = r21
            long r6 = r13.getLength()
            r1 = 4096(0x1000, double:2.0237E-320)
            r18 = -1
            int r0 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x0015
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0015
            r1 = r6
        L_0x0015:
            int r12 = (int) r1
            r0 = 64
            X.4eH r11 = X.C90504eH.A05(r0)
            r16 = 0
            r10 = 0
            r17 = 0
        L_0x0021:
            r2 = 1
            if (r10 >= r12) goto L_0x00d6
            r14 = 8
            r11.A0Q(r14)
            byte[] r1 = r11.A02
            r0 = r20
            boolean r0 = r13.AaM(r1, r0, r14, r2)
            if (r0 == 0) goto L_0x00d6
            long r4 = r11.A0I()
            int r15 = r11.A07()
            r2 = 1
            r1 = 16
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x00bf
            byte[] r0 = r11.A02
            r13.AaL(r0, r14, r14)
            r11.A0R(r1)
            long r4 = r11.A0H()
        L_0x004f:
            long r8 = (long) r1
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x00e3
            int r10 = r10 + r1
            r0 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r15 != r0) goto L_0x0067
            int r0 = (int) r4
            int r12 = r12 + r0
            int r0 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x0021
            long r0 = (long) r12
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0021
            int r12 = (int) r6
            goto L_0x0021
        L_0x0067:
            r0 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r15 == r0) goto L_0x00d8
            r0 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r15 == r0) goto L_0x00d8
            long r2 = (long) r10
            long r2 = r2 + r4
            long r2 = r2 - r8
            long r0 = (long) r12
            int r16 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r16 >= 0) goto L_0x00d6
            long r4 = r4 - r8
            int r1 = (int) r4
            int r10 = r10 + r1
            r0 = 1718909296(0x66747970, float:2.8862439E23)
            if (r15 != r0) goto L_0x00b3
            if (r1 < r14) goto L_0x00d5
            r8 = 0
            r11.A0Q(r1)
            X.C90504eH.A06(r13, r11, r1)
            int r5 = r1 >> 2
        L_0x008c:
            if (r8 >= r5) goto L_0x00b0
            r0 = 1
            if (r8 != r0) goto L_0x0098
            r0 = 4
            r11.A0T(r0)
        L_0x0095:
            int r8 = r8 + 1
            goto L_0x008c
        L_0x0098:
            int r4 = r11.A07()
            int r1 = r4 >>> 8
            r0 = 3368816(0x336770, float:4.720717E-39)
            if (r1 == r0) goto L_0x00b9
            int[] r3 = A00
            int r2 = r3.length
            r1 = 0
        L_0x00a7:
            if (r1 >= r2) goto L_0x0095
            r0 = r3[r1]
            if (r0 == r4) goto L_0x00b9
            int r1 = r1 + 1
            goto L_0x00a7
        L_0x00b0:
            if (r17 != 0) goto L_0x00bb
            return r20
        L_0x00b3:
            if (r1 == 0) goto L_0x00bb
            r13.A4m(r1)
            goto L_0x00bb
        L_0x00b9:
            r17 = 1
        L_0x00bb:
            r16 = 0
            goto L_0x0021
        L_0x00bf:
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00d1
            int r0 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x00d1
            long r2 = r13.AEy()
            long r0 = r6 - r2
            long r4 = (long) r14
            long r4 = r4 + r0
        L_0x00d1:
            r1 = 8
            goto L_0x004f
        L_0x00d5:
            return r20
        L_0x00d6:
            r0 = 0
            goto L_0x00d9
        L_0x00d8:
            r0 = 1
        L_0x00d9:
            if (r17 == 0) goto L_0x00e1
            r16 = 1
            r1 = r22
            if (r1 == r0) goto L_0x00e3
        L_0x00e1:
            r16 = 0
        L_0x00e3:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4YJ.A00(X.2iu, boolean):boolean");
    }
}

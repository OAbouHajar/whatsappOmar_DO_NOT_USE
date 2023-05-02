package X;

/* renamed from: X.4dx  reason: invalid class name and case insensitive filesystem */
public final class C90324dx {
    public static final C89074bY A00 = ((!C90904f2.A06 || !C90904f2.A07) ? new AnonymousClass3ZX() : new AnonymousClass3ZY());

    public static int A00(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i3);
            if (charAt < 2048) {
                i4 += (127 - charAt) >>> 31;
                i3++;
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char charAt2 = charSequence.charAt(i3);
                    if (charAt2 < 2048) {
                        i2 += (127 - charAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i3) >= 65536) {
                                i3++;
                            } else {
                                throw new AnonymousClass442(i3, length2);
                            }
                        }
                    }
                    i3++;
                }
                i4 += i2;
            }
        }
        if (i4 >= length) {
            return i4;
        }
        throw AnonymousClass000.A0T(AnonymousClass3K2.A0g(i4));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        if (r13 < 2048) goto L_0x008f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073 A[LOOP:1: B:19:0x0073->B:25:0x0086, LOOP_START, PHI: r1 r2 r12 
      PHI: (r1v3 char) = (r1v2 char), (r1v9 char) binds: [B:17:0x006d, B:25:0x0086] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r2v4 long) = (r2v3 long), (r2v14 long) binds: [B:17:0x006d, B:25:0x0086] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r12v3 int) = (r12v2 int), (r12v9 int) binds: [B:17:0x006d, B:25:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(java.lang.CharSequence r19, java.nio.ByteBuffer r20) {
        /*
            X.4bY r4 = A00
            r11 = r20
            boolean r0 = r11.hasArray()
            r10 = r19
            if (r0 == 0) goto L_0x0026
            int r3 = r11.arrayOffset()
            byte[] r2 = r11.array()
            int r1 = r11.position()
            int r1 = r1 + r3
            int r0 = r11.remaining()
            int r0 = r4.A01(r10, r2, r1, r0)
            int r0 = r0 - r3
        L_0x0022:
            r11.position(r0)
            return
        L_0x0026:
            boolean r0 = r11.isDirect()
            if (r0 == 0) goto L_0x016b
            boolean r0 = r4 instanceof X.AnonymousClass3ZY
            if (r0 == 0) goto L_0x016b
            X.4XX r9 = X.C90904f2.A02
            long r0 = X.C90904f2.A01
            long r19 = r9.A05(r11, r0)
            int r0 = r11.position()
            long r2 = (long) r0
            long r2 = r2 + r19
            int r0 = r11.limit()
            long r4 = (long) r0
            long r4 = r4 + r19
            int r8 = r10.length()
            long r0 = (long) r8
            long r13 = r4 - r2
            java.lang.String r7 = " at index "
            java.lang.String r6 = "Failed writing "
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 > 0) goto L_0x014b
            r12 = 0
        L_0x0056:
            r1 = 128(0x80, float:1.794E-43)
            r17 = 1
            if (r12 >= r8) goto L_0x006d
            char r0 = r10.charAt(r12)
            if (r0 >= r1) goto L_0x006d
            long r17 = r17 + r2
            byte r0 = (byte) r0
            r9.A07(r2, r0)
            int r12 = r12 + 1
            r2 = r17
            goto L_0x0056
        L_0x006d:
            if (r12 != r8) goto L_0x0073
        L_0x006f:
            long r2 = r2 - r19
            int r0 = (int) r2
            goto L_0x0022
        L_0x0073:
            if (r12 >= r8) goto L_0x006f
            char r13 = r10.charAt(r12)
            if (r13 >= r1) goto L_0x008b
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x008f
            long r6 = r2 + r17
            byte r0 = (byte) r13
            r9.A07(r2, r0)
            r2 = r6
        L_0x0086:
            int r12 = r12 + 1
            r1 = 128(0x80, float:1.794E-43)
            goto L_0x0073
        L_0x008b:
            r0 = 2048(0x800, float:2.87E-42)
            if (r13 >= r0) goto L_0x00ad
        L_0x008f:
            r0 = 2
            long r6 = r4 - r0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x00ad
            long r6 = r2 + r17
            int r0 = r13 >>> 6
            r0 = r0 | 960(0x3c0, float:1.345E-42)
            byte r0 = (byte) r0
            r9.A07(r2, r0)
            long r2 = r6 + r17
            r1 = r13 & 63
            r0 = 128(0x80, float:1.794E-43)
            r1 = r1 | r0
            byte r0 = (byte) r1
        L_0x00a9:
            r9.A07(r6, r0)
            goto L_0x0086
        L_0x00ad:
            r14 = 57343(0xdfff, float:8.0355E-41)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r13 < r1) goto L_0x00b7
            if (r14 >= r13) goto L_0x00dd
        L_0x00b7:
            r15 = 3
            long r6 = r4 - r15
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x00dd
            long r0 = r2 + r17
            int r6 = r13 >>> 12
            r6 = r6 | 480(0x1e0, float:6.73E-43)
            byte r6 = (byte) r6
            r9.A07(r2, r6)
            long r6 = r0 + r17
            int r2 = r13 >>> 6
            r2 = r2 & 63
            r14 = 128(0x80, float:1.794E-43)
            r2 = r2 | r14
            byte r2 = (byte) r2
            r9.A07(r0, r2)
            long r2 = r6 + r17
            r0 = r13 & 63
            r0 = r0 | r14
            byte r0 = (byte) r0
            goto L_0x00a9
        L_0x00dd:
            r15 = 4
            long r6 = r4 - r15
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x012e
            int r6 = r12 + 1
            if (r6 == r8) goto L_0x0126
            char r1 = r10.charAt(r6)
            boolean r0 = java.lang.Character.isSurrogatePair(r13, r1)
            if (r0 == 0) goto L_0x0125
            int r13 = java.lang.Character.toCodePoint(r13, r1)
            long r0 = r2 + r17
            int r7 = r13 >>> 18
            r7 = r7 | 240(0xf0, float:3.36E-43)
            byte r7 = (byte) r7
            r9.A07(r2, r7)
            long r2 = r0 + r17
            int r7 = r13 >>> 12
            r7 = r7 & 63
            r12 = 128(0x80, float:1.794E-43)
            r7 = r7 | r12
            byte r7 = (byte) r7
            r9.A07(r0, r7)
            long r0 = r2 + r17
            int r7 = r13 >>> 6
            r7 = r7 & 63
            r7 = r7 | r12
            byte r7 = (byte) r7
            r9.A07(r2, r7)
            long r2 = r0 + r17
            r7 = r13 & 63
            r7 = r7 | r12
            byte r7 = (byte) r7
            r9.A07(r0, r7)
            r12 = r6
            goto L_0x0086
        L_0x0125:
            r12 = r6
        L_0x0126:
            int r1 = r12 + -1
            X.442 r0 = new X.442
            r0.<init>(r1, r8)
            throw r0
        L_0x012e:
            if (r1 > r13) goto L_0x0146
            if (r13 > r14) goto L_0x0146
            int r0 = r12 + 1
            if (r0 == r8) goto L_0x0140
            char r0 = r10.charAt(r0)
            boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
            if (r0 != 0) goto L_0x0146
        L_0x0140:
            X.442 r0 = new X.442
            r0.<init>(r12, r8)
            throw r0
        L_0x0146:
            java.lang.ArrayIndexOutOfBoundsException r0 = X.AnonymousClass3K2.A0V(r13, r2)
            throw r0
        L_0x014b:
            int r0 = r8 + -1
            char r2 = r10.charAt(r0)
            int r1 = r11.limit()
            r0 = 37
            java.lang.StringBuilder r0 = X.C13690nt.A0g(r0)
            r0.append(r6)
            r0.append(r2)
            java.lang.String r1 = X.C13680ns.A0i(r7, r0, r1)
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x016b:
            X.C89074bY.A00(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90324dx.A01(java.lang.CharSequence, java.nio.ByteBuffer):void");
    }
}

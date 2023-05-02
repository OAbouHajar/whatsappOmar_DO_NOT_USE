package X;

/* renamed from: X.4VM  reason: invalid class name */
public abstract class AnonymousClass4VM {
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        if (r12 < 2048) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0168, code lost:
        if (r3 < 2048) goto L_0x016a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a A[LOOP:1: B:15:0x003a->B:21:0x004c, LOOP_START, PHI: r1 r2 r11 
      PHI: (r1v13 char) = (r1v12 char), (r1v16 char) binds: [B:12:0x0036, B:21:0x004c] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r2v4 long) = (r2v3 long), (r2v19 long) binds: [B:12:0x0036, B:21:0x004c] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r11v3 int) = (r11v2 int), (r11v9 int) binds: [B:12:0x0036, B:21:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(java.lang.CharSequence r18, byte[] r19, int r20, int r21) {
        /*
            r17 = this;
            r10 = r21
            r9 = r20
            r0 = r17
            boolean r0 = r0 instanceof X.C67373bR
            r8 = r18
            r7 = r19
            if (r0 == 0) goto L_0x0131
            long r2 = (long) r9
            long r5 = (long) r10
            long r5 = r5 + r2
            int r4 = r8.length()
            java.lang.String r12 = " at index "
            java.lang.String r11 = "Failed writing "
            if (r4 > r10) goto L_0x0113
            int r0 = r7.length
            int r0 = r0 - r21
            if (r0 < r9) goto L_0x0113
            r11 = 0
        L_0x0021:
            r1 = 128(0x80, float:1.794E-43)
            r15 = 1
            if (r11 >= r4) goto L_0x0036
            char r0 = r8.charAt(r11)
            if (r0 >= r1) goto L_0x0036
            long r15 = r15 + r2
            byte r0 = (byte) r0
            X.C90914f4.A0A(r7, r0, r2)
            int r11 = r11 + 1
            r2 = r15
            goto L_0x0021
        L_0x0036:
            if (r11 != r4) goto L_0x003a
        L_0x0038:
            int r0 = (int) r2
            return r0
        L_0x003a:
            if (r11 >= r4) goto L_0x0038
            char r12 = r8.charAt(r11)
            if (r12 >= r1) goto L_0x0052
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0056
            long r13 = r2 + r15
            byte r0 = (byte) r12
            X.C90914f4.A0A(r7, r0, r2)
        L_0x004c:
            int r11 = r11 + 1
            r1 = 128(0x80, float:1.794E-43)
            r2 = r13
            goto L_0x003a
        L_0x0052:
            r0 = 2048(0x800, float:2.87E-42)
            if (r12 >= r0) goto L_0x0074
        L_0x0056:
            r0 = 2
            long r9 = r5 - r0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x0074
            long r0 = r2 + r15
            int r9 = r12 >>> 6
            r9 = r9 | 960(0x3c0, float:1.345E-42)
            byte r9 = (byte) r9
            X.C90914f4.A0A(r7, r9, r2)
            long r13 = r0 + r15
            r3 = r12 & 63
            r2 = 128(0x80, float:1.794E-43)
            r3 = r3 | r2
            byte r2 = (byte) r3
        L_0x0070:
            X.C90914f4.A0A(r7, r2, r0)
            goto L_0x004c
        L_0x0074:
            r14 = 57343(0xdfff, float:8.0355E-41)
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r12 < r13) goto L_0x007e
            if (r14 >= r12) goto L_0x00a4
        L_0x007e:
            r0 = 3
            long r9 = r5 - r0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00a4
            long r9 = r2 + r15
            int r0 = r12 >>> 12
            r0 = r0 | 480(0x1e0, float:6.73E-43)
            byte r0 = (byte) r0
            X.C90914f4.A0A(r7, r0, r2)
            long r0 = r9 + r15
            int r2 = r12 >>> 6
            r2 = r2 & 63
            r3 = 128(0x80, float:1.794E-43)
            r2 = r2 | r3
            byte r2 = (byte) r2
            X.C90914f4.A0A(r7, r2, r9)
            long r13 = r0 + r15
            r2 = r12 & 63
            r2 = r2 | r3
            byte r2 = (byte) r2
            goto L_0x0070
        L_0x00a4:
            r0 = 4
            long r9 = r5 - r0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00f6
            int r9 = r11 + 1
            if (r9 == r4) goto L_0x00ee
            char r1 = r8.charAt(r9)
            boolean r0 = java.lang.Character.isSurrogatePair(r12, r1)
            if (r0 == 0) goto L_0x00ed
            int r12 = java.lang.Character.toCodePoint(r12, r1)
            long r0 = r2 + r15
            int r10 = r12 >>> 18
            r10 = r10 | 240(0xf0, float:3.36E-43)
            byte r10 = (byte) r10
            X.C90914f4.A0A(r7, r10, r2)
            long r2 = r0 + r15
            int r10 = r12 >>> 12
            r10 = r10 & 63
            r11 = 128(0x80, float:1.794E-43)
            r10 = r10 | 128(0x80, float:1.794E-43)
            byte r10 = (byte) r10
            X.C90914f4.A0A(r7, r10, r0)
            long r0 = r2 + r15
            int r10 = r12 >>> 6
            r10 = r10 & 63
            r10 = r10 | r11
            byte r10 = (byte) r10
            X.C90914f4.A0A(r7, r10, r2)
            long r13 = r0 + r15
            r2 = r12 & 63
            r2 = r2 | r11
            byte r2 = (byte) r2
            X.C90914f4.A0A(r7, r2, r0)
            r11 = r9
            goto L_0x004c
        L_0x00ed:
            r11 = r9
        L_0x00ee:
            int r1 = r11 + -1
            X.443 r0 = new X.443
            r0.<init>(r1, r4)
            throw r0
        L_0x00f6:
            if (r13 > r12) goto L_0x010e
            if (r12 > r14) goto L_0x010e
            int r0 = r11 + 1
            if (r0 == r4) goto L_0x0108
            char r0 = r8.charAt(r0)
            boolean r0 = java.lang.Character.isSurrogatePair(r12, r0)
            if (r0 != 0) goto L_0x010e
        L_0x0108:
            X.443 r0 = new X.443
            r0.<init>(r11, r4)
            throw r0
        L_0x010e:
            java.lang.ArrayIndexOutOfBoundsException r0 = X.AnonymousClass3K2.A0V(r12, r2)
            throw r0
        L_0x0113:
            int r0 = r4 + -1
            char r1 = r8.charAt(r0)
            int r9 = r20 + r21
            r0 = 37
            java.lang.StringBuilder r0 = X.C13690nt.A0g(r0)
            r0.append(r11)
            r0.append(r1)
            java.lang.String r1 = X.C13680ns.A0i(r12, r0, r9)
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x0131:
            int r4 = r8.length()
            int r10 = r21 + r20
            r5 = 0
        L_0x0138:
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r4) goto L_0x014c
            int r1 = r5 + r20
            if (r1 >= r10) goto L_0x014c
            char r0 = r8.charAt(r5)
            if (r0 >= r6) goto L_0x014c
            byte r0 = (byte) r0
            r19[r1] = r0
            int r5 = r5 + 1
            goto L_0x0138
        L_0x014c:
            if (r5 != r4) goto L_0x0151
            int r9 = r20 + r4
        L_0x0150:
            return r9
        L_0x0151:
            int r9 = r20 + r5
        L_0x0153:
            if (r5 >= r4) goto L_0x0150
            char r3 = r8.charAt(r5)
            if (r3 >= r6) goto L_0x0166
            if (r9 >= r10) goto L_0x016a
            int r1 = r9 + 1
        L_0x015f:
            byte r0 = (byte) r3
            r19[r9] = r0
            r9 = r1
        L_0x0163:
            int r5 = r5 + 1
            goto L_0x0153
        L_0x0166:
            r0 = 2048(0x800, float:2.87E-42)
            if (r3 >= r0) goto L_0x0173
        L_0x016a:
            int r0 = r10 + -2
            if (r9 > r0) goto L_0x0173
            int r9 = X.AnonymousClass3K3.A0N(r7, r9, r3)
            goto L_0x0163
        L_0x0173:
            r2 = 57343(0xdfff, float:8.0355E-41)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r1) goto L_0x017d
            if (r2 >= r3) goto L_0x018b
        L_0x017d:
            int r0 = r10 + -3
            if (r9 > r0) goto L_0x018b
            int r9 = X.AnonymousClass3K2.A0E(r7, r9, r3)
            int r1 = r9 + 1
            r3 = r3 & 63
            r3 = r3 | r6
            goto L_0x015f
        L_0x018b:
            int r0 = r10 + -4
            if (r9 > r0) goto L_0x01b0
            int r2 = r5 + 1
            int r0 = r8.length()
            if (r2 == r0) goto L_0x01a8
            char r1 = r8.charAt(r2)
            boolean r0 = java.lang.Character.isSurrogatePair(r3, r1)
            if (r0 == 0) goto L_0x01a7
            int r9 = X.AnonymousClass3K2.A0B(r7, r3, r1, r9)
            r5 = r2
            goto L_0x0163
        L_0x01a7:
            r5 = r2
        L_0x01a8:
            int r1 = r5 + -1
            X.443 r0 = new X.443
            r0.<init>(r1, r4)
            throw r0
        L_0x01b0:
            if (r1 > r3) goto L_0x01cc
            if (r3 > r2) goto L_0x01cc
            int r1 = r5 + 1
            int r0 = r8.length()
            if (r1 == r0) goto L_0x01c6
            char r0 = r8.charAt(r1)
            boolean r0 = java.lang.Character.isSurrogatePair(r3, r0)
            if (r0 != 0) goto L_0x01cc
        L_0x01c6:
            X.443 r0 = new X.443
            r0.<init>(r5, r4)
            throw r0
        L_0x01cc:
            r0 = 37
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "Failed writing "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " at index "
            java.lang.String r1 = X.C13680ns.A0i(r0, r1, r9)
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VM.A00(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x015c, code lost:
        r3 = r14[r7 - 1];
        r4 = r16 - r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0162, code lost:
        if (r4 == 0) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0165, code lost:
        if (r4 == 1) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0168, code lost:
        if (r4 != 2) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x016a, code lost:
        r2 = r14[r7];
        r1 = r14[r7 + 1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0172, code lost:
        if (r3 > -12) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0174, code lost:
        if (r2 > -65) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0176, code lost:
        if (r1 > -65) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0178, code lost:
        r3 = r3 ^ (r2 << 8);
        r0 = r1 << 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x017e, code lost:
        return r3 ^ r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x017f, code lost:
        r1 = r14[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0183, code lost:
        if (r3 > -12) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0185, code lost:
        if (r1 > -65) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0187, code lost:
        r0 = r1 << 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x018c, code lost:
        if (r3 <= -12) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0197, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:?, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A01(byte[] r14, int r15, int r16) {
        /*
            r13 = this;
            r4 = r16
            boolean r0 = r13 instanceof X.C67373bR
            if (r0 == 0) goto L_0x00f2
            r1 = r15 | r16
            int r2 = r14.length
            int r0 = r2 - r16
            r1 = r1 | r0
            r5 = 2
            r6 = 3
            r0 = 0
            if (r1 < 0) goto L_0x00db
            long r2 = (long) r15
            long r0 = (long) r4
            long r0 = r0 - r2
            int r4 = (int) r0
            r0 = 16
            r11 = 1
            if (r4 >= r0) goto L_0x00c3
            r9 = 0
        L_0x001c:
            int r4 = r4 - r9
            long r0 = (long) r9
            long r2 = r2 + r0
        L_0x001f:
            r7 = 0
        L_0x0020:
            if (r4 <= 0) goto L_0x002e
            long r0 = r2 + r11
            byte r7 = X.C90914f4.A00(r14, r2)
            if (r7 < 0) goto L_0x0032
            int r4 = r4 + -1
            r2 = r0
            goto L_0x0020
        L_0x002e:
            if (r4 != 0) goto L_0x0033
            r7 = 0
        L_0x0031:
            return r7
        L_0x0032:
            r2 = r0
        L_0x0033:
            int r1 = r4 + -1
            r10 = -32
            r9 = -65
            if (r7 >= r10) goto L_0x004d
            if (r1 == 0) goto L_0x0031
            int r4 = r1 + -1
            r0 = -62
            if (r7 < r0) goto L_0x006b
        L_0x0043:
            long r7 = r2 + r11
            byte r0 = X.C90914f4.A00(r14, r2)
            if (r0 > r9) goto L_0x006b
            r2 = r7
            goto L_0x001f
        L_0x004d:
            r0 = -16
            if (r7 >= r0) goto L_0x0074
            if (r1 < r5) goto L_0x0092
            int r4 = r1 + -2
            long r0 = r2 + r11
            byte r8 = X.C90914f4.A00(r14, r2)
            if (r8 > r9) goto L_0x006b
            r3 = -96
            if (r7 != r10) goto L_0x006d
            if (r8 < r3) goto L_0x006b
        L_0x0063:
            long r2 = r0 + r11
            byte r0 = X.C90914f4.A00(r14, r0)
            if (r0 <= r9) goto L_0x001f
        L_0x006b:
            r7 = -1
            return r7
        L_0x006d:
            r2 = -19
            if (r7 != r2) goto L_0x0063
            if (r8 >= r3) goto L_0x006b
            goto L_0x0063
        L_0x0074:
            if (r1 < r6) goto L_0x0092
            int r4 = r1 + -3
            long r0 = r2 + r11
            byte r2 = X.C90914f4.A00(r14, r2)
            if (r2 > r9) goto L_0x006b
            int r3 = r7 << 28
            int r2 = r2 + 112
            int r3 = r3 + r2
            int r2 = r3 >> 30
            if (r2 != 0) goto L_0x006b
            long r2 = r0 + r11
            byte r0 = X.C90914f4.A00(r14, r0)
            if (r0 > r9) goto L_0x006b
            goto L_0x0043
        L_0x0092:
            if (r1 == 0) goto L_0x00be
            r0 = 1
            if (r1 == r0) goto L_0x00b1
            if (r1 != r5) goto L_0x00d5
            byte r4 = X.C90914f4.A00(r14, r2)
            long r2 = r2 + r11
            byte r1 = X.C90914f4.A00(r14, r2)
            r0 = -12
            if (r7 > r0) goto L_0x006b
            if (r4 > r9) goto L_0x006b
            if (r1 > r9) goto L_0x006b
            int r0 = r4 << 8
            r7 = r7 ^ r0
            int r0 = r1 << 16
        L_0x00af:
            r7 = r7 ^ r0
            return r7
        L_0x00b1:
            byte r1 = X.C90914f4.A00(r14, r2)
            r0 = -12
            if (r7 > r0) goto L_0x006b
            if (r1 > r9) goto L_0x006b
            int r0 = r1 << 8
            goto L_0x00af
        L_0x00be:
            r0 = -12
            if (r7 <= r0) goto L_0x0031
            goto L_0x006b
        L_0x00c3:
            r0 = r2
            r9 = 0
        L_0x00c5:
            long r7 = r0 + r11
            byte r0 = X.C90914f4.A00(r14, r0)
            if (r0 < 0) goto L_0x001c
            int r9 = r9 + 1
            r0 = r7
            if (r9 < r4) goto L_0x00c5
            r9 = r4
            goto L_0x001c
        L_0x00d5:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x00db:
            java.lang.Object[] r1 = new java.lang.Object[r6]
            X.AnonymousClass000.A1M(r1, r2, r0)
            X.AnonymousClass000.A1L(r1, r15)
            X.AnonymousClass000.A1M(r1, r4, r5)
            java.lang.String r0 = "Array length=%d, index=%d, limit=%d"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x00f2:
            if (r15 >= r4) goto L_0x00fb
            byte r0 = r14[r15]
            if (r0 < 0) goto L_0x00fb
            int r15 = r15 + 1
            goto L_0x00f2
        L_0x00fb:
            r3 = 0
            if (r15 < r4) goto L_0x00ff
        L_0x00fe:
            return r3
        L_0x00ff:
            if (r15 >= r4) goto L_0x00fe
            int r7 = r15 + 1
            byte r8 = r14[r15]
            if (r8 >= 0) goto L_0x018f
            r9 = -32
            r5 = -65
            if (r8 >= r9) goto L_0x0119
            if (r7 < r4) goto L_0x0110
            return r8
        L_0x0110:
            r0 = -62
            if (r8 < r0) goto L_0x0133
            int r15 = r7 + 1
            byte r0 = r14[r7]
            goto L_0x0131
        L_0x0119:
            r0 = -16
            if (r8 >= r0) goto L_0x013c
            int r0 = r16 + -1
            if (r7 >= r0) goto L_0x015c
            int r6 = r7 + 1
            byte r2 = r14[r7]
            if (r2 > r5) goto L_0x0133
            r1 = -96
            if (r8 != r9) goto L_0x0135
            if (r2 < r1) goto L_0x0133
        L_0x012d:
            int r15 = r6 + 1
            byte r0 = r14[r6]
        L_0x0131:
            if (r0 <= r5) goto L_0x00ff
        L_0x0133:
            r3 = -1
            return r3
        L_0x0135:
            r0 = -19
            if (r8 != r0) goto L_0x012d
            if (r2 >= r1) goto L_0x0133
            goto L_0x012d
        L_0x013c:
            int r0 = r16 + -2
            if (r7 >= r0) goto L_0x015c
            int r2 = r7 + 1
            byte r0 = r14[r7]
            if (r0 > r5) goto L_0x0133
            int r1 = r8 << 28
            int r0 = r0 + 112
            int r1 = r1 + r0
            int r0 = r1 >> 30
            if (r0 != 0) goto L_0x0133
            int r1 = r2 + 1
            byte r0 = r14[r2]
            if (r0 > r5) goto L_0x0133
            int r7 = r1 + 1
            byte r0 = r14[r1]
            if (r0 <= r5) goto L_0x018f
            goto L_0x0133
        L_0x015c:
            int r0 = r7 + -1
            byte r3 = r14[r0]
            int r4 = r16 - r7
            if (r4 == 0) goto L_0x018a
            r0 = 1
            if (r4 == r0) goto L_0x017f
            r0 = 2
            if (r4 != r0) goto L_0x0192
            byte r2 = r14[r7]
            int r0 = r7 + 1
            byte r1 = r14[r0]
            r0 = -12
            if (r3 > r0) goto L_0x0133
            if (r2 > r5) goto L_0x0133
            if (r1 > r5) goto L_0x0133
            int r0 = r2 << 8
            r3 = r3 ^ r0
            int r0 = r1 << 16
        L_0x017d:
            r3 = r3 ^ r0
            return r3
        L_0x017f:
            byte r1 = r14[r7]
            r0 = -12
            if (r3 > r0) goto L_0x0133
            if (r1 > r5) goto L_0x0133
            int r0 = r1 << 8
            goto L_0x017d
        L_0x018a:
            r0 = -12
            if (r3 <= r0) goto L_0x00fe
            goto L_0x0133
        L_0x018f:
            r15 = r7
            goto L_0x00ff
        L_0x0192:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VM.A01(byte[], int, int):int");
    }
}

package X;

import java.nio.ByteBuffer;

/* renamed from: X.4bY  reason: invalid class name and case insensitive filesystem */
public abstract class C89074bY {
    public static void A00(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i2;
        int length = charSequence.length();
        int position = byteBuffer.position();
        int i3 = 0;
        while (i3 < length) {
            try {
                char charAt = charSequence.charAt(i3);
                if (charAt >= 128) {
                    break;
                }
                i2 = position + i3;
                byteBuffer.put(i2, (byte) charAt);
                i3++;
            } catch (IndexOutOfBoundsException unused) {
                char charAt2 = charSequence.charAt(i3);
                StringBuilder A0g = C13690nt.A0g(37);
                A0g.append("Failed writing ");
                A0g.append(charAt2);
                throw new ArrayIndexOutOfBoundsException(C13680ns.A0i(" at index ", A0g, byteBuffer.position() + Math.max(i3, (position - byteBuffer.position()) + 1)));
            }
        }
        if (i3 == length) {
            byteBuffer.position(position + i3);
            return;
        }
        position += i3;
        while (i3 < length) {
            char charAt3 = charSequence.charAt(i3);
            if (charAt3 >= 128) {
                if (charAt3 < 2048) {
                    i2 = position + 1;
                    try {
                        byteBuffer.put(position, (byte) ((charAt3 >>> 6) | 192));
                        byteBuffer.put(i2, (byte) ((charAt3 & '?') | 128));
                        position = i2;
                        i3++;
                        position++;
                    } catch (IndexOutOfBoundsException unused2) {
                        position = i2;
                        char charAt22 = charSequence.charAt(i3);
                        StringBuilder A0g2 = C13690nt.A0g(37);
                        A0g2.append("Failed writing ");
                        A0g2.append(charAt22);
                        throw new ArrayIndexOutOfBoundsException(C13680ns.A0i(" at index ", A0g2, byteBuffer.position() + Math.max(i3, (position - byteBuffer.position()) + 1)));
                    }
                } else if (charAt3 < 55296 || 57343 < charAt3) {
                    i2 = position + 1;
                    byteBuffer.put(position, (byte) ((charAt3 >>> 12) | 224));
                    position = i2 + 1;
                    byteBuffer.put(i2, (byte) (((charAt3 >>> 6) & 63) | 128));
                    charAt3 = (charAt3 & '?') | 128;
                } else {
                    i2 = i3 + 1;
                    if (i2 != length) {
                        try {
                            char charAt4 = charSequence.charAt(i2);
                            if (Character.isSurrogatePair(charAt3, charAt4)) {
                                int codePoint = Character.toCodePoint(charAt3, charAt4);
                                i3 = position + 1;
                                try {
                                    byteBuffer.put(position, (byte) ((codePoint >>> 18) | 240));
                                    position = i3 + 1;
                                    byteBuffer.put(i3, (byte) (((codePoint >>> 12) & 63) | 128));
                                    i3 = position + 1;
                                    byteBuffer.put(position, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(i3, (byte) ((codePoint & 63) | 128));
                                    position = i3;
                                    i3 = i2;
                                    i3++;
                                    position++;
                                } catch (IndexOutOfBoundsException unused3) {
                                    position = i3;
                                }
                            } else {
                                i3 = i2;
                            }
                        } catch (IndexOutOfBoundsException unused4) {
                            i3 = i2;
                            char charAt222 = charSequence.charAt(i3);
                            StringBuilder A0g22 = C13690nt.A0g(37);
                            A0g22.append("Failed writing ");
                            A0g22.append(charAt222);
                            throw new ArrayIndexOutOfBoundsException(C13680ns.A0i(" at index ", A0g22, byteBuffer.position() + Math.max(i3, (position - byteBuffer.position()) + 1)));
                        }
                    }
                    throw new AnonymousClass442(i3, length);
                }
            }
            byteBuffer.put(position, (byte) charAt3);
            i3++;
            position++;
        }
        byteBuffer.position(position);
    }

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
    public int A01(java.lang.CharSequence r18, byte[] r19, int r20, int r21) {
        /*
            r17 = this;
            r10 = r21
            r9 = r20
            r0 = r17
            boolean r0 = r0 instanceof X.AnonymousClass3ZY
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
            X.C90904f2.A08(r7, r0, r2)
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
            X.C90904f2.A08(r7, r0, r2)
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
            X.C90904f2.A08(r7, r9, r2)
            long r13 = r0 + r15
            r3 = r12 & 63
            r2 = 128(0x80, float:1.794E-43)
            r3 = r3 | r2
            byte r2 = (byte) r3
        L_0x0070:
            X.C90904f2.A08(r7, r2, r0)
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
            X.C90904f2.A08(r7, r0, r2)
            long r0 = r9 + r15
            int r2 = r12 >>> 6
            r2 = r2 & 63
            r3 = 128(0x80, float:1.794E-43)
            r2 = r2 | r3
            byte r2 = (byte) r2
            X.C90904f2.A08(r7, r2, r9)
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
            X.C90904f2.A08(r7, r10, r2)
            long r2 = r0 + r15
            int r10 = r12 >>> 12
            r10 = r10 & 63
            r11 = 128(0x80, float:1.794E-43)
            r10 = r10 | 128(0x80, float:1.794E-43)
            byte r10 = (byte) r10
            X.C90904f2.A08(r7, r10, r0)
            long r0 = r2 + r15
            int r10 = r12 >>> 6
            r10 = r10 & 63
            r10 = r10 | r11
            byte r10 = (byte) r10
            X.C90904f2.A08(r7, r10, r2)
            long r13 = r0 + r15
            r2 = r12 & 63
            r2 = r2 | r11
            byte r2 = (byte) r2
            X.C90904f2.A08(r7, r2, r0)
            r11 = r9
            goto L_0x004c
        L_0x00ed:
            r11 = r9
        L_0x00ee:
            int r1 = r11 + -1
            X.442 r0 = new X.442
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
            X.442 r0 = new X.442
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
            X.442 r0 = new X.442
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
            X.442 r0 = new X.442
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
        throw new UnsupportedOperationException("Method not decompiled: X.C89074bY.A01(java.lang.CharSequence, byte[], int, int):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x018c, code lost:
        r4 = r19[r7 - 1];
        r3 = r21 - r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0192, code lost:
        if (r3 == 0) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0195, code lost:
        if (r3 == 1) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0198, code lost:
        if (r3 != 2) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x019a, code lost:
        r2 = r19[r7];
        r1 = r19[r7 + 1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01a2, code lost:
        if (r4 > -12) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01a4, code lost:
        if (r2 > -65) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01a6, code lost:
        if (r1 > -65) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01a8, code lost:
        r4 = r4 ^ (r2 << 8);
        r0 = r1 << 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01ae, code lost:
        return r4 ^ r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01af, code lost:
        r1 = r19[r7];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01b3, code lost:
        if (r4 > -12) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01b5, code lost:
        if (r1 > -65) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01b7, code lost:
        r0 = r1 << 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x01bc, code lost:
        if (r4 <= -12) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01c7, code lost:
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
    public int A02(byte[] r19, int r20, int r21) {
        /*
            r18 = this;
            r3 = r21
            r9 = r20
            r0 = r18
            boolean r0 = r0 instanceof X.AnonymousClass3ZY
            r8 = r19
            if (r0 == 0) goto L_0x0122
            r1 = r20 | r21
            int r2 = r8.length
            int r0 = r2 - r21
            r1 = r1 | r0
            r10 = 2
            r11 = 3
            r0 = 0
            if (r1 < 0) goto L_0x010b
            long r4 = (long) r9
            long r0 = (long) r3
            long r0 = r0 - r4
            int r9 = (int) r0
            r0 = 16
            r16 = 1
            if (r9 >= r0) goto L_0x00ee
            r3 = 0
        L_0x0022:
            int r9 = r9 - r3
            long r0 = (long) r3
            long r4 = r4 + r0
        L_0x0025:
            r7 = 0
        L_0x0026:
            if (r9 <= 0) goto L_0x0039
            long r12 = r4 + r16
            X.4XX r2 = X.C90904f2.A02
            long r0 = X.C90904f2.A00
            long r0 = r0 + r4
            byte r7 = r2.A01(r8, r0)
            if (r7 < 0) goto L_0x003d
            int r9 = r9 + -1
            r4 = r12
            goto L_0x0026
        L_0x0039:
            if (r9 != 0) goto L_0x003e
            r7 = 0
        L_0x003c:
            return r7
        L_0x003d:
            r4 = r12
        L_0x003e:
            int r1 = r9 + -1
            r13 = -32
            r6 = -65
            if (r7 >= r13) goto L_0x005d
            if (r1 == 0) goto L_0x003c
            int r9 = r1 + -1
            r0 = -62
            if (r7 < r0) goto L_0x0082
        L_0x004e:
            long r12 = r4 + r16
            X.4XX r2 = X.C90904f2.A02
            long r0 = X.C90904f2.A00
            long r0 = r0 + r4
            byte r0 = r2.A01(r8, r0)
            if (r0 > r6) goto L_0x0082
            r4 = r12
            goto L_0x0025
        L_0x005d:
            r0 = -16
            if (r7 >= r0) goto L_0x008b
            if (r1 < r10) goto L_0x00b0
            int r9 = r1 + -2
            long r14 = r4 + r16
            X.4XX r12 = X.C90904f2.A02
            long r2 = X.C90904f2.A00
            long r0 = r2 + r4
            byte r4 = r12.A01(r8, r0)
            if (r4 > r6) goto L_0x0082
            r1 = -96
            if (r7 != r13) goto L_0x0084
            if (r4 < r1) goto L_0x0082
        L_0x0079:
            long r4 = r14 + r16
            long r2 = r2 + r14
            byte r0 = r12.A01(r8, r2)
            if (r0 <= r6) goto L_0x0025
        L_0x0082:
            r7 = -1
            return r7
        L_0x0084:
            r0 = -19
            if (r7 != r0) goto L_0x0079
            if (r4 >= r1) goto L_0x0082
            goto L_0x0079
        L_0x008b:
            if (r1 < r11) goto L_0x00b0
            int r9 = r1 + -3
            long r13 = r4 + r16
            X.4XX r12 = X.C90904f2.A02
            long r2 = X.C90904f2.A00
            long r0 = r2 + r4
            byte r0 = r12.A01(r8, r0)
            if (r0 > r6) goto L_0x0082
            int r1 = r7 << 28
            int r0 = r0 + 112
            int r1 = r1 + r0
            int r0 = r1 >> 30
            if (r0 != 0) goto L_0x0082
            long r4 = r13 + r16
            long r2 = r2 + r13
            byte r0 = r12.A01(r8, r2)
            if (r0 > r6) goto L_0x0082
            goto L_0x004e
        L_0x00b0:
            if (r1 == 0) goto L_0x00e9
            r0 = 1
            if (r1 == r0) goto L_0x00d7
            if (r1 != r10) goto L_0x0105
            X.4XX r9 = X.C90904f2.A02
            long r0 = X.C90904f2.A00
            long r2 = r0 + r4
            byte r2 = r9.A01(r8, r2)
            long r4 = r4 + r16
            long r0 = r0 + r4
            byte r1 = r9.A01(r8, r0)
            r0 = -12
            if (r7 > r0) goto L_0x0082
            if (r2 > r6) goto L_0x0082
            if (r1 > r6) goto L_0x0082
            int r0 = r2 << 8
            r7 = r7 ^ r0
            int r0 = r1 << 16
        L_0x00d5:
            r7 = r7 ^ r0
            return r7
        L_0x00d7:
            X.4XX r2 = X.C90904f2.A02
            long r0 = X.C90904f2.A00
            long r0 = r0 + r4
            byte r1 = r2.A01(r8, r0)
            r0 = -12
            if (r7 > r0) goto L_0x0082
            if (r1 > r6) goto L_0x0082
            int r0 = r1 << 8
            goto L_0x00d5
        L_0x00e9:
            r0 = -12
            if (r7 <= r0) goto L_0x003c
            goto L_0x0082
        L_0x00ee:
            r12 = r4
            r3 = 0
        L_0x00f0:
            long r6 = r12 + r16
            X.4XX r2 = X.C90904f2.A02
            long r0 = X.C90904f2.A00
            long r0 = r0 + r12
            byte r0 = r2.A01(r8, r0)
            if (r0 < 0) goto L_0x0022
            int r3 = r3 + 1
            r12 = r6
            if (r3 < r9) goto L_0x00f0
            r3 = r9
            goto L_0x0022
        L_0x0105:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x010b:
            java.lang.Object[] r1 = new java.lang.Object[r11]
            X.AnonymousClass000.A1M(r1, r2, r0)
            X.AnonymousClass000.A1L(r1, r9)
            X.AnonymousClass000.A1M(r1, r3, r10)
            java.lang.String r0 = "Array length=%d, index=%d, limit=%d"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x0122:
            if (r9 >= r3) goto L_0x012b
            byte r0 = r19[r9]
            if (r0 < 0) goto L_0x012b
            int r9 = r9 + 1
            goto L_0x0122
        L_0x012b:
            r4 = 0
            if (r9 < r3) goto L_0x012f
        L_0x012e:
            return r4
        L_0x012f:
            if (r9 >= r3) goto L_0x012e
            int r7 = r9 + 1
            byte r9 = r19[r9]
            if (r9 >= 0) goto L_0x01bf
            r10 = -32
            r5 = -65
            if (r9 >= r10) goto L_0x0149
            if (r7 < r3) goto L_0x0140
            return r9
        L_0x0140:
            r0 = -62
            if (r9 < r0) goto L_0x0163
            int r9 = r7 + 1
            byte r0 = r19[r7]
            goto L_0x0161
        L_0x0149:
            r0 = -16
            if (r9 >= r0) goto L_0x016c
            int r0 = r21 + -1
            if (r7 >= r0) goto L_0x018c
            int r6 = r7 + 1
            byte r2 = r19[r7]
            if (r2 > r5) goto L_0x0163
            r1 = -96
            if (r9 != r10) goto L_0x0165
            if (r2 < r1) goto L_0x0163
        L_0x015d:
            int r9 = r6 + 1
            byte r0 = r19[r6]
        L_0x0161:
            if (r0 <= r5) goto L_0x012f
        L_0x0163:
            r4 = -1
            return r4
        L_0x0165:
            r0 = -19
            if (r9 != r0) goto L_0x015d
            if (r2 >= r1) goto L_0x0163
            goto L_0x015d
        L_0x016c:
            int r0 = r21 + -2
            if (r7 >= r0) goto L_0x018c
            int r2 = r7 + 1
            byte r0 = r19[r7]
            if (r0 > r5) goto L_0x0163
            int r1 = r9 << 28
            int r0 = r0 + 112
            int r1 = r1 + r0
            int r0 = r1 >> 30
            if (r0 != 0) goto L_0x0163
            int r1 = r2 + 1
            byte r0 = r19[r2]
            if (r0 > r5) goto L_0x0163
            int r7 = r1 + 1
            byte r0 = r19[r1]
            if (r0 <= r5) goto L_0x01bf
            goto L_0x0163
        L_0x018c:
            int r0 = r7 + -1
            byte r4 = r19[r0]
            int r3 = r21 - r7
            if (r3 == 0) goto L_0x01ba
            r0 = 1
            if (r3 == r0) goto L_0x01af
            r0 = 2
            if (r3 != r0) goto L_0x01c2
            byte r2 = r19[r7]
            int r0 = r7 + 1
            byte r1 = r19[r0]
            r0 = -12
            if (r4 > r0) goto L_0x0163
            if (r2 > r5) goto L_0x0163
            if (r1 > r5) goto L_0x0163
            int r0 = r2 << 8
            r4 = r4 ^ r0
            int r0 = r1 << 16
        L_0x01ad:
            r4 = r4 ^ r0
            return r4
        L_0x01af:
            byte r1 = r19[r7]
            r0 = -12
            if (r4 > r0) goto L_0x0163
            if (r1 > r5) goto L_0x0163
            int r0 = r1 << 8
            goto L_0x01ad
        L_0x01ba:
            r0 = -12
            if (r4 <= r0) goto L_0x012e
            goto L_0x0163
        L_0x01bf:
            r9 = r7
            goto L_0x012f
        L_0x01c2:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89074bY.A02(byte[], int, int):int");
    }
}

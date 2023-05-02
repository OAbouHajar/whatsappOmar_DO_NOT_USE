package X;

/* renamed from: X.4PO  reason: invalid class name */
public abstract class AnonymousClass4PO {
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005c, code lost:
        if (r12 < 2048) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x017d, code lost:
        if (r3 < 2048) goto L_0x017f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042 A[LOOP:1: B:15:0x0042->B:21:0x0054, LOOP_START, PHI: r1 r2 r13 
      PHI: (r1v13 char) = (r1v12 char), (r1v18 char) binds: [B:12:0x003c, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r2v4 long) = (r2v3 long), (r2v19 long) binds: [B:12:0x003c, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r13v2 int) = (r13v1 int), (r13v8 int) binds: [B:12:0x003c, B:21:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(java.lang.CharSequence r23, byte[] r24, int r25, int r26) {
        /*
            r22 = this;
            r10 = r26
            r9 = r25
            r0 = r22
            boolean r0 = r0 instanceof X.C69663fP
            r8 = r23
            r7 = r24
            if (r0 == 0) goto L_0x0146
            long r20 = com.google.protobuf.UnsafeUtil.A00
            long r0 = (long) r9
            long r2 = r20 + r0
            long r5 = (long) r10
            long r5 = r5 + r2
            int r4 = r8.length()
            java.lang.String r11 = " at index "
            java.lang.String r19 = "Failed writing "
            if (r4 > r10) goto L_0x012a
            int r0 = r7.length
            int r0 = r0 - r26
            if (r0 < r9) goto L_0x012a
            r13 = 0
        L_0x0025:
            r1 = 128(0x80, float:1.794E-43)
            r17 = 1
            if (r13 >= r4) goto L_0x003c
            char r0 = r8.charAt(r13)
            if (r0 >= r1) goto L_0x003c
            long r17 = r17 + r2
            byte r0 = (byte) r0
            com.google.protobuf.UnsafeUtil.A00(r7, r0, r2)
            int r13 = r13 + 1
            r2 = r17
            goto L_0x0025
        L_0x003c:
            if (r13 != r4) goto L_0x0042
        L_0x003e:
            long r2 = r2 - r20
            int r0 = (int) r2
            return r0
        L_0x0042:
            if (r13 >= r4) goto L_0x003e
            char r12 = r8.charAt(r13)
            if (r12 >= r1) goto L_0x005a
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x005e
            long r14 = r2 + r17
            byte r0 = (byte) r12
            com.google.protobuf.UnsafeUtil.A00(r7, r0, r2)
        L_0x0054:
            int r13 = r13 + 1
            r1 = 128(0x80, float:1.794E-43)
            r2 = r14
            goto L_0x0042
        L_0x005a:
            r0 = 2048(0x800, float:2.87E-42)
            if (r12 >= r0) goto L_0x007c
        L_0x005e:
            r0 = 2
            long r9 = r5 - r0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x007c
            long r0 = r2 + r17
            int r9 = r12 >>> 6
            r9 = r9 | 960(0x3c0, float:1.345E-42)
            byte r9 = (byte) r9
            com.google.protobuf.UnsafeUtil.A00(r7, r9, r2)
            long r14 = r0 + r17
            r3 = r12 & 63
            r2 = 128(0x80, float:1.794E-43)
            r3 = r3 | r2
            byte r2 = (byte) r3
        L_0x0078:
            com.google.protobuf.UnsafeUtil.A00(r7, r2, r0)
            goto L_0x0054
        L_0x007c:
            r14 = 57343(0xdfff, float:8.0355E-41)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r12 < r1) goto L_0x0086
            if (r14 >= r12) goto L_0x00ac
        L_0x0086:
            r15 = 3
            long r9 = r5 - r15
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00ac
            long r9 = r2 + r17
            int r0 = r12 >>> 12
            r0 = r0 | 480(0x1e0, float:6.73E-43)
            byte r0 = (byte) r0
            com.google.protobuf.UnsafeUtil.A00(r7, r0, r2)
            long r0 = r9 + r17
            int r2 = r12 >>> 6
            r2 = r2 & 63
            r3 = 128(0x80, float:1.794E-43)
            r2 = r2 | r3
            byte r2 = (byte) r2
            com.google.protobuf.UnsafeUtil.A00(r7, r2, r9)
            long r14 = r0 + r17
            r2 = r12 & 63
            r2 = r2 | r3
            byte r2 = (byte) r2
            goto L_0x0078
        L_0x00ac:
            r15 = 4
            long r9 = r5 - r15
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00fe
            int r9 = r13 + 1
            if (r9 == r4) goto L_0x00f6
            char r1 = r8.charAt(r9)
            boolean r0 = java.lang.Character.isSurrogatePair(r12, r1)
            if (r0 == 0) goto L_0x00f5
            int r13 = java.lang.Character.toCodePoint(r12, r1)
            long r0 = r2 + r17
            int r10 = r13 >>> 18
            r10 = r10 | 240(0xf0, float:3.36E-43)
            byte r10 = (byte) r10
            com.google.protobuf.UnsafeUtil.A00(r7, r10, r2)
            long r2 = r0 + r17
            int r10 = r13 >>> 12
            r10 = r10 & 63
            r12 = 128(0x80, float:1.794E-43)
            r10 = r10 | 128(0x80, float:1.794E-43)
            byte r10 = (byte) r10
            com.google.protobuf.UnsafeUtil.A00(r7, r10, r0)
            long r0 = r2 + r17
            int r10 = r13 >>> 6
            r10 = r10 & 63
            r10 = r10 | r12
            byte r10 = (byte) r10
            com.google.protobuf.UnsafeUtil.A00(r7, r10, r2)
            long r14 = r0 + r17
            r2 = r13 & 63
            r2 = r2 | r12
            byte r2 = (byte) r2
            com.google.protobuf.UnsafeUtil.A00(r7, r2, r0)
            r13 = r9
            goto L_0x0054
        L_0x00f5:
            r13 = r9
        L_0x00f6:
            int r1 = r13 + -1
            X.444 r0 = new X.444
            r0.<init>(r1, r4)
            throw r0
        L_0x00fe:
            if (r1 > r12) goto L_0x0116
            if (r12 > r14) goto L_0x0116
            int r0 = r13 + 1
            if (r0 == r4) goto L_0x0110
            char r0 = r8.charAt(r0)
            boolean r0 = java.lang.Character.isSurrogatePair(r12, r0)
            if (r0 != 0) goto L_0x0116
        L_0x0110:
            X.444 r0 = new X.444
            r0.<init>(r13, r4)
            throw r0
        L_0x0116:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r19)
            r0.append(r12)
            r0.append(r11)
            java.lang.String r1 = X.C13680ns.A0j(r0, r2)
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x012a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r19)
            int r0 = r4 + -1
            char r0 = r8.charAt(r0)
            r1.append(r0)
            r1.append(r11)
            int r9 = r25 + r26
            java.lang.String r1 = X.AnonymousClass000.A0l(r1, r9)
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        L_0x0146:
            int r4 = r8.length()
            int r10 = r26 + r25
            r5 = 0
        L_0x014d:
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r4) goto L_0x0161
            int r1 = r5 + r25
            if (r1 >= r10) goto L_0x0161
            char r0 = r8.charAt(r5)
            if (r0 >= r6) goto L_0x0161
            byte r0 = (byte) r0
            r24[r1] = r0
            int r5 = r5 + 1
            goto L_0x014d
        L_0x0161:
            if (r5 != r4) goto L_0x0166
            int r9 = r25 + r4
        L_0x0165:
            return r9
        L_0x0166:
            int r9 = r25 + r5
        L_0x0168:
            if (r5 >= r4) goto L_0x0165
            char r3 = r8.charAt(r5)
            if (r3 >= r6) goto L_0x017b
            if (r9 >= r10) goto L_0x017f
            int r1 = r9 + 1
        L_0x0174:
            byte r0 = (byte) r3
            r24[r9] = r0
            r9 = r1
        L_0x0178:
            int r5 = r5 + 1
            goto L_0x0168
        L_0x017b:
            r0 = 2048(0x800, float:2.87E-42)
            if (r3 >= r0) goto L_0x0188
        L_0x017f:
            int r0 = r10 + -2
            if (r9 > r0) goto L_0x0188
            int r9 = X.AnonymousClass3K3.A0N(r7, r9, r3)
            goto L_0x0178
        L_0x0188:
            r2 = 57343(0xdfff, float:8.0355E-41)
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r1) goto L_0x0192
            if (r2 >= r3) goto L_0x01a0
        L_0x0192:
            int r0 = r10 + -3
            if (r9 > r0) goto L_0x01a0
            int r9 = X.AnonymousClass3K2.A0E(r7, r9, r3)
            int r1 = r9 + 1
            r3 = r3 & 63
            r3 = r3 | r6
            goto L_0x0174
        L_0x01a0:
            int r0 = r10 + -4
            if (r9 > r0) goto L_0x01c5
            int r2 = r5 + 1
            int r0 = r8.length()
            if (r2 == r0) goto L_0x01bd
            char r1 = r8.charAt(r2)
            boolean r0 = java.lang.Character.isSurrogatePair(r3, r1)
            if (r0 == 0) goto L_0x01bc
            int r9 = X.AnonymousClass3K2.A0B(r7, r3, r1, r9)
            r5 = r2
            goto L_0x0178
        L_0x01bc:
            r5 = r2
        L_0x01bd:
            int r1 = r5 + -1
            X.444 r0 = new X.444
            r0.<init>(r1, r4)
            throw r0
        L_0x01c5:
            if (r1 > r3) goto L_0x01e1
            if (r3 > r2) goto L_0x01e1
            int r1 = r5 + 1
            int r0 = r8.length()
            if (r1 == r0) goto L_0x01db
            char r0 = r8.charAt(r1)
            boolean r0 = java.lang.Character.isSurrogatePair(r3, r0)
            if (r0 != 0) goto L_0x01e1
        L_0x01db:
            X.444 r0 = new X.444
            r0.<init>(r5, r4)
            throw r0
        L_0x01e1:
            java.lang.String r0 = "Failed writing "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r3)
            java.lang.String r0 = " at index "
            java.lang.String r1 = X.C13680ns.A0i(r0, r1, r9)
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4PO.A00(java.lang.CharSequence, byte[], int, int):int");
    }
}

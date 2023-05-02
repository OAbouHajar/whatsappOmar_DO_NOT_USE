package X;

/* renamed from: X.3Bi  reason: invalid class name and case insensitive filesystem */
public final class C62023Bi {
    public static final int[][] A00 = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
    public static final int[][] A01 = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, AnonymousClass2EA.A03, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
    public static final int[][] A02 = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] A03 = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01ff, code lost:
        r1 = r0 & 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01df, code lost:
        r1 = (r1 + r0) & 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01e2, code lost:
        if (r1 != 0) goto L_0x01e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e4, code lost:
        r11 = !r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01e6, code lost:
        r9[r6][r12] = r11 ? (byte) 1 : 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01fe, code lost:
        r0 = r0 + r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C1042954t r18, X.C51232bE r19, X.C90474eC r20, X.AnonymousClass4R5 r21, int r22) {
        /*
            r3 = -1
            r4 = r21
            byte[][] r9 = r4.A02
            int r2 = r9.length
            r1 = 0
        L_0x0007:
            if (r1 >= r2) goto L_0x0011
            r0 = r9[r1]
            java.util.Arrays.fill(r0, r3)
            int r1 = r1 + 1
            goto L_0x0007
        L_0x0011:
            int[][] r0 = A02
            r3 = 0
            r0 = r0[r3]
            int r0 = r0.length
            A02(r4, r3, r3)
            int r8 = r4.A01
            int r0 = r8 - r0
            A02(r4, r0, r3)
            A02(r4, r3, r0)
            r2 = 7
            A01(r4, r3, r2)
            int r0 = r8 + -8
            A01(r4, r0, r2)
            A01(r4, r3, r0)
            A03(r4, r2, r3)
            int r7 = r4.A00
            int r1 = r7 - r2
            int r0 = r1 + -1
            A03(r4, r0, r3)
            A03(r4, r2, r1)
            r2 = 8
            int r0 = r7 - r2
            r1 = r9[r0]
            byte r0 = r1[r2]
            if (r0 == 0) goto L_0x0251
            r0 = 1
            byte r0 = (byte) r0
            r1[r2] = r0
            r0 = r20
            int r3 = r0.A01
            r0 = 2
            if (r3 < r0) goto L_0x0095
            int r1 = r3 + -1
            int[][] r0 = A01
            r12 = r0[r1]
            int r11 = r12.length
            r10 = 0
        L_0x005c:
            if (r10 >= r11) goto L_0x0095
            r17 = r12[r10]
            if (r17 < 0) goto L_0x0092
            r6 = 0
        L_0x0063:
            if (r6 >= r11) goto L_0x0092
            r2 = r12[r6]
            if (r2 < 0) goto L_0x008f
            r0 = r9[r17]
            byte r1 = r0[r2]
            r0 = -1
            if (r1 != r0) goto L_0x008f
            int r16 = r2 + -2
            int r15 = r17 + -2
            r5 = 0
        L_0x0075:
            r4 = 5
            if (r5 >= r4) goto L_0x008f
            int[][] r0 = A00
            r14 = r0[r5]
            r2 = 0
        L_0x007d:
            int r13 = r16 + r2
            int r1 = r15 + r5
            r0 = r14[r2]
            r1 = r9[r1]
            byte r0 = (byte) r0
            r1[r13] = r0
            int r2 = r2 + 1
            if (r2 < r4) goto L_0x007d
            int r5 = r5 + 1
            goto L_0x0075
        L_0x008f:
            int r6 = r6 + 1
            goto L_0x0063
        L_0x0092:
            int r10 = r10 + 1
            goto L_0x005c
        L_0x0095:
            r10 = 8
            r5 = 8
        L_0x0099:
            int r0 = r8 - r10
            if (r5 >= r0) goto L_0x00bc
            int r6 = r5 + 1
            int r4 = r6 % 2
            r0 = 6
            r2 = r9[r0]
            byte r1 = r2[r5]
            r0 = -1
            if (r1 != r0) goto L_0x00ac
            byte r0 = (byte) r4
            r2[r5] = r0
        L_0x00ac:
            r1 = 6
            r0 = r9[r5]
            byte r1 = r0[r1]
            r0 = -1
            if (r1 != r0) goto L_0x00ba
            r2 = 6
            r1 = r9[r5]
            byte r0 = (byte) r4
            r1[r2] = r0
        L_0x00ba:
            r5 = r6
            goto L_0x0099
        L_0x00bc:
            X.54t r10 = new X.54t
            r10.<init>()
            if (r22 < 0) goto L_0x0249
            r0 = r19
            int r0 = r0.bits
            int r2 = r0 << 3
            r2 = r2 | r22
            r0 = 5
            r10.A01(r2, r0)
            r4 = 1335(0x537, float:1.871E-42)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r4)
            int r1 = 32 - r0
            int r0 = r1 + -1
            int r2 = r2 << r0
        L_0x00da:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r2)
            int r0 = 32 - r0
            if (r0 < r1) goto L_0x00ed
            int r0 = java.lang.Integer.numberOfLeadingZeros(r2)
            int r0 = 32 - r0
            int r0 = r0 - r1
            int r0 = r4 << r0
            r2 = r2 ^ r0
            goto L_0x00da
        L_0x00ed:
            r0 = 10
            r10.A01(r2, r0)
            X.54t r11 = new X.54t
            r11.<init>()
            r0 = 21522(0x5412, float:3.0159E-41)
            r5 = 15
            r11.A01(r0, r5)
            int r6 = r10.A00
            int r0 = r11.A00
            if (r6 != r0) goto L_0x0242
            r4 = 0
        L_0x0105:
            int[] r2 = r10.A01
            int r0 = r2.length
            if (r4 >= r0) goto L_0x0116
            r1 = r2[r4]
            int[] r0 = r11.A01
            r0 = r0[r4]
            r1 = r1 ^ r0
            r2[r4] = r1
            int r4 = r4 + 1
            goto L_0x0105
        L_0x0116:
            if (r6 != r5) goto L_0x0235
            r12 = 0
            r5 = 0
        L_0x011a:
            if (r5 >= r6) goto L_0x0149
            r11 = 1
            r0 = 14
            int r0 = r0 - r5
            boolean r2 = r10.A03(r0)
            int[][] r0 = A03
            r0 = r0[r5]
            r1 = r0[r12]
            r0 = r0[r11]
            r0 = r9[r0]
            byte r4 = (byte) r2
            r0[r1] = r4
            r2 = 8
            if (r5 >= r2) goto L_0x013f
            int r1 = r8 - r5
            int r1 = r1 - r11
            r0 = r9[r2]
            r0[r1] = r4
        L_0x013c:
            int r5 = r5 + 1
            goto L_0x011a
        L_0x013f:
            int r1 = r7 + -7
            int r0 = r5 + -8
            int r1 = r1 + r0
            r0 = r9[r1]
            r0[r2] = r4
            goto L_0x013c
        L_0x0149:
            r0 = 7
            if (r3 < r0) goto L_0x01ac
            X.54t r6 = new X.54t
            r6.<init>()
            r0 = 6
            r6.A01(r3, r0)
            r2 = 7973(0x1f25, float:1.1173E-41)
            int r0 = java.lang.Integer.numberOfLeadingZeros(r2)
            int r1 = 32 - r0
            int r0 = r1 + -1
            int r3 = r3 << r0
        L_0x0160:
            int r0 = java.lang.Integer.numberOfLeadingZeros(r3)
            int r0 = 32 - r0
            if (r0 < r1) goto L_0x0173
            int r0 = java.lang.Integer.numberOfLeadingZeros(r3)
            int r0 = 32 - r0
            int r0 = r0 - r1
            int r0 = r2 << r0
            r3 = r3 ^ r0
            goto L_0x0160
        L_0x0173:
            r0 = 12
            r6.A01(r3, r0)
            int r1 = r6.A00
            r0 = 18
            if (r1 != r0) goto L_0x019f
            r5 = 17
            r4 = 0
        L_0x0181:
            r3 = 0
        L_0x0182:
            boolean r1 = r6.A03(r5)
            int r5 = r5 + -1
            int r2 = r7 + -11
            int r2 = r2 + r3
            r0 = r9[r2]
            byte r1 = (byte) r1
            r0[r4] = r1
            r0 = r9[r4]
            r0[r2] = r1
            int r3 = r3 + 1
            r0 = 3
            if (r3 < r0) goto L_0x0182
            int r4 = r4 + 1
            r0 = 6
            if (r4 >= r0) goto L_0x01ac
            goto L_0x0181
        L_0x019f:
            java.lang.String r0 = "should not happen but we got: "
            java.lang.String r1 = X.C13680ns.A0c(r1, r0)
            X.440 r0 = new X.440
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x01ac:
            int r8 = r8 + -1
            int r6 = r7 + -1
            r5 = -1
            r4 = 0
            r3 = -1
        L_0x01b3:
            r10 = r18
            if (r8 <= 0) goto L_0x0218
            r0 = 6
            if (r8 != r0) goto L_0x01bb
            r8 = 5
        L_0x01bb:
            if (r6 < 0) goto L_0x0213
            if (r6 >= r7) goto L_0x0213
            r2 = 0
        L_0x01c0:
            int r12 = r8 - r2
            r0 = r9[r6]
            byte r0 = r0[r12]
            if (r0 != r5) goto L_0x01eb
            int r0 = r10.A00
            if (r4 >= r0) goto L_0x0211
            boolean r11 = r10.A03(r4)
            int r4 = r4 + 1
        L_0x01d2:
            r1 = r12
            r0 = r6
            switch(r22) {
                case 0: goto L_0x01fe;
                case 1: goto L_0x01ff;
                case 2: goto L_0x01f2;
                case 3: goto L_0x01f5;
                case 4: goto L_0x01fa;
                case 5: goto L_0x0202;
                case 6: goto L_0x020a;
                default: goto L_0x01d7;
            }
        L_0x01d7:
            int r0 = r6 * r12
            int r1 = r0 % 3
            int r0 = r6 + r12
            r0 = r0 & 1
        L_0x01df:
            int r1 = r1 + r0
            r1 = r1 & 1
        L_0x01e2:
            if (r1 != 0) goto L_0x01e6
            r11 = r11 ^ 1
        L_0x01e6:
            r1 = r9[r6]
            byte r0 = (byte) r11
            r1[r12] = r0
        L_0x01eb:
            int r2 = r2 + 1
            r0 = 2
            if (r2 < r0) goto L_0x01c0
            int r6 = r6 + r3
            goto L_0x01bb
        L_0x01f2:
            int r1 = r12 % 3
            goto L_0x01e2
        L_0x01f5:
            int r0 = r6 + r12
            int r1 = r0 % 3
            goto L_0x01e2
        L_0x01fa:
            int r0 = r6 >> 1
            int r1 = r12 / 3
        L_0x01fe:
            int r0 = r0 + r1
        L_0x01ff:
            r1 = r0 & 1
            goto L_0x01e2
        L_0x0202:
            int r0 = r6 * r12
            r1 = r0 & 1
            int r0 = r0 % 3
            int r1 = r1 + r0
            goto L_0x01e2
        L_0x020a:
            int r0 = r6 * r12
            r1 = r0 & 1
            int r0 = r0 % 3
            goto L_0x01df
        L_0x0211:
            r11 = 0
            goto L_0x01d2
        L_0x0213:
            int r3 = -r3
            int r6 = r6 + r3
            int r8 = r8 + -2
            goto L_0x01b3
        L_0x0218:
            int r2 = r10.A00
            if (r4 != r2) goto L_0x021d
            return
        L_0x021d:
            java.lang.String r0 = "Not all bits consumed: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r4)
            r0 = 47
            r1.append(r0)
            java.lang.String r1 = X.AnonymousClass000.A0l(r1, r2)
            X.440 r0 = new X.440
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0235:
            java.lang.String r0 = "should not happen but we got: "
            java.lang.String r1 = X.C13680ns.A0c(r6, r0)
            X.440 r0 = new X.440
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0242:
            java.lang.String r0 = "Sizes don't match"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        L_0x0249:
            java.lang.String r1 = "Invalid mask pattern"
            X.440 r0 = new X.440
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0251:
            X.440 r0 = new X.440
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62023Bi.A00(X.54t, X.2bE, X.4eC, X.4R5, int):void");
    }

    public static void A01(AnonymousClass4R5 r5, int i2, int i3) {
        int i4 = 0;
        do {
            int i5 = i2 + i4;
            byte[] bArr = r5.A02[i3];
            if (bArr[i5] == -1) {
                bArr[i5] = (byte) 0;
                i4++;
            } else {
                throw new AnonymousClass440();
            }
        } while (i4 < 8);
    }

    public static void A02(AnonymousClass4R5 r8, int i2, int i3) {
        for (int i4 = 0; i4 < 7; i4++) {
            int[] iArr = A02[i4];
            int i5 = 0;
            do {
                int i6 = iArr[i5];
                r8.A02[i3 + i4][i2 + i5] = (byte) i6;
                i5++;
            } while (i5 < 7);
        }
    }

    public static void A03(AnonymousClass4R5 r5, int i2, int i3) {
        int i4 = 0;
        do {
            int i5 = i3 + i4;
            byte[][] bArr = r5.A02;
            if (bArr[i5][i2] == -1) {
                bArr[i5][i2] = (byte) 0;
                i4++;
            } else {
                throw new AnonymousClass440();
            }
        } while (i4 < 7);
    }
}

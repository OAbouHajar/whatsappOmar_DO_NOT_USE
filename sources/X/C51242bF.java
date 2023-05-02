package X;

/* renamed from: X.2bF  reason: invalid class name and case insensitive filesystem */
public final class C51242bF {
    public static final int[] A00 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX WARNING: Code restructure failed: missing block: B:368:0x06c6, code lost:
        r17 = r17 + 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01d1  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0262 A[LOOP:8: B:136:0x0260->B:137:0x0262, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02d7 A[LOOP:12: B:158:0x02d7->B:159:0x02d9, LOOP_START, PHI: r0 
      PHI: (r0v208 int) = (r0v17 int), (r0v209 int) binds: [B:157:0x02d5, B:159:0x02d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x0745  */
    /* JADX WARNING: Removed duplicated region for block: B:398:0x0769  */
    /* JADX WARNING: Removed duplicated region for block: B:411:0x006f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x021f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e8 A[SYNTHETIC, Splitter:B:60:0x00e8] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024 A[SYNTHETIC, Splitter:B:8:0x0024] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0186 A[SYNTHETIC, Splitter:B:95:0x0186] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C51252bG A00(X.C51232bE r28, java.lang.String r29, java.util.Map r30) {
        /*
            r10 = r30
            if (r30 == 0) goto L_0x0020
            X.41U r1 = X.AnonymousClass41U.CHARACTER_SET
            boolean r0 = r10.containsKey(r1)
            if (r0 == 0) goto L_0x0020
            r7 = 1
            java.lang.Object r0 = r10.get(r1)
            java.lang.String r8 = r0.toString()
        L_0x0015:
            java.lang.String r2 = "Shift_JIS"
            boolean r0 = r2.equals(r8)
            r6 = r29
            if (r0 == 0) goto L_0x0044
            goto L_0x0024
        L_0x0020:
            r7 = 0
            java.lang.String r8 = "ISO-8859-1"
            goto L_0x0015
        L_0x0024:
            byte[] r5 = r6.getBytes(r2)     // Catch:{ UnsupportedEncodingException -> 0x0044 }
            int r4 = r5.length
            int r0 = r4 % 2
            if (r0 != 0) goto L_0x0044
            r3 = 0
        L_0x002e:
            if (r3 >= r4) goto L_0x006c
            byte r0 = r5[r3]
            r1 = r0 & 255(0xff, float:3.57E-43)
            r0 = 129(0x81, float:1.81E-43)
            if (r1 < r0) goto L_0x0044
            r0 = 159(0x9f, float:2.23E-43)
            if (r1 <= r0) goto L_0x0069
            r0 = 224(0xe0, float:3.14E-43)
            if (r1 < r0) goto L_0x0044
            r0 = 235(0xeb, float:3.3E-43)
            if (r1 <= r0) goto L_0x0069
        L_0x0044:
            r5 = 0
            r1 = 0
            r4 = 0
        L_0x0047:
            int r0 = r6.length()
            if (r5 >= r0) goto L_0x006f
            char r3 = r6.charAt(r5)
            r0 = 48
            if (r3 < r0) goto L_0x005d
            r0 = 57
            if (r3 > r0) goto L_0x005d
            r4 = 1
        L_0x005a:
            int r5 = r5 + 1
            goto L_0x0047
        L_0x005d:
            int[] r1 = A00
            int r0 = r1.length
            if (r3 >= r0) goto L_0x00e5
            r1 = r1[r3]
            r0 = -1
            if (r1 == r0) goto L_0x00e5
            r1 = 1
            goto L_0x005a
        L_0x0069:
            int r3 = r3 + 2
            goto L_0x002e
        L_0x006c:
            X.42v r3 = X.C801742v.KANJI
            goto L_0x0073
        L_0x006f:
            if (r1 == 0) goto L_0x00e0
            X.42v r3 = X.C801742v.ALPHANUMERIC
        L_0x0073:
            X.54t r5 = new X.54t
            r5.<init>()
            X.42v r4 = X.C801742v.BYTE
            if (r3 != r4) goto L_0x009a
            if (r7 == 0) goto L_0x009a
            java.util.Map r0 = X.AnonymousClass43B.A00
            java.lang.Object r7 = r0.get(r8)
            X.43B r7 = (X.AnonymousClass43B) r7
            if (r7 == 0) goto L_0x009a
            X.42v r0 = X.C801742v.ECI
            int r1 = r0.bits
            r0 = 4
            r5.A01(r1, r0)
            int[] r1 = r7.values
            r0 = 0
            r1 = r1[r0]
            r0 = 8
            r5.A01(r1, r0)
        L_0x009a:
            if (r30 == 0) goto L_0x00be
            X.41U r1 = X.AnonymousClass41U.GS1_FORMAT
            boolean r0 = r10.containsKey(r1)
            if (r0 == 0) goto L_0x00be
            java.lang.Object r0 = r10.get(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00be
            X.42v r0 = X.C801742v.FNC1_FIRST_POSITION
            int r1 = r0.bits
            r0 = 4
            r5.A01(r1, r0)
        L_0x00be:
            int r1 = r3.bits
            r0 = 4
            r5.A01(r1, r0)
            X.54t r7 = new X.54t
            r7.<init>()
            int r0 = r3.ordinal()
            switch(r0) {
                case 1: goto L_0x0101;
                case 2: goto L_0x0146;
                case 3: goto L_0x00d0;
                case 4: goto L_0x00e8;
                case 5: goto L_0x00d0;
                case 6: goto L_0x0186;
                default: goto L_0x00d0;
            }
        L_0x00d0:
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "Invalid mode: "
            java.lang.String r1 = r0.concat(r1)
            X.440 r0 = new X.440
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x00e0:
            if (r4 == 0) goto L_0x00e5
            X.42v r3 = X.C801742v.NUMERIC
            goto L_0x0073
        L_0x00e5:
            X.42v r3 = X.C801742v.BYTE
            goto L_0x0073
        L_0x00e8:
            byte[] r9 = r6.getBytes(r8)     // Catch:{ UnsupportedEncodingException -> 0x00fa }
            int r8 = r9.length
            r2 = 0
        L_0x00ee:
            if (r2 >= r8) goto L_0x01cd
            byte r1 = r9[r2]
            r0 = 8
            r7.A01(r1, r0)
            int r2 = r2 + 1
            goto L_0x00ee
        L_0x00fa:
            r1 = move-exception
            X.440 r0 = new X.440
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        L_0x0101:
            int r9 = r6.length()
            r12 = 0
        L_0x0106:
            if (r12 >= r9) goto L_0x01cd
            char r0 = r6.charAt(r12)
            int r1 = r0 + -48
            int r2 = r12 + 2
            if (r2 >= r9) goto L_0x012e
            int r0 = r12 + 1
            char r0 = r6.charAt(r0)
            int r11 = r0 + -48
            char r0 = r6.charAt(r2)
            int r8 = r0 + -48
            int r2 = r1 * 100
            r1 = 10
            int r0 = r11 * 10
            int r2 = r2 + r0
            int r2 = r2 + r8
            r7.A01(r2, r1)
            int r12 = r12 + 3
            goto L_0x0106
        L_0x012e:
            int r12 = r12 + 1
            if (r12 >= r9) goto L_0x0141
            char r0 = r6.charAt(r12)
            int r0 = r0 + -48
            int r1 = r1 * 10
            int r1 = r1 + r0
            r0 = 7
            r7.A01(r1, r0)
            r12 = r2
            goto L_0x0106
        L_0x0141:
            r0 = 4
            r7.A01(r1, r0)
            goto L_0x0106
        L_0x0146:
            int r11 = r6.length()
            r12 = 0
        L_0x014b:
            if (r12 >= r11) goto L_0x01cd
            char r0 = r6.charAt(r12)
            int[] r13 = A00
            int r9 = r13.length
            if (r0 >= r9) goto L_0x0180
            r8 = r13[r0]
            r2 = -1
            if (r8 == r2) goto L_0x0180
            int r1 = r12 + 1
            if (r1 >= r11) goto L_0x0174
            char r0 = r6.charAt(r1)
            if (r0 >= r9) goto L_0x017a
            r0 = r13[r0]
            if (r0 == r2) goto L_0x017a
            int r1 = r8 * 45
            int r1 = r1 + r0
            r0 = 11
            r7.A01(r1, r0)
            int r12 = r12 + 2
            goto L_0x014b
        L_0x0174:
            r0 = 6
            r7.A01(r8, r0)
            r12 = r1
            goto L_0x014b
        L_0x017a:
            X.440 r0 = new X.440
            r0.<init>()
            throw r0
        L_0x0180:
            X.440 r0 = new X.440
            r0.<init>()
            throw r0
        L_0x0186:
            byte[] r9 = r6.getBytes(r2)     // Catch:{ UnsupportedEncodingException -> 0x0784 }
            int r8 = r9.length
            r2 = 0
        L_0x018c:
            if (r2 >= r8) goto L_0x01cd
            byte r0 = r9[r2]
            r1 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r2 + 1
            byte r0 = r9[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r11 = r1 << 8
            r11 = r11 | r0
            r12 = 33088(0x8140, float:4.6366E-41)
            r1 = -1
            if (r11 < r12) goto L_0x01c5
            r0 = 40956(0x9ffc, float:5.7392E-41)
            if (r11 <= r0) goto L_0x01b3
            r0 = 57408(0xe040, float:8.0446E-41)
            if (r11 < r0) goto L_0x01c5
            r0 = 60351(0xebbf, float:8.457E-41)
            if (r11 > r0) goto L_0x01c5
            r12 = 49472(0xc140, float:6.9325E-41)
        L_0x01b3:
            int r11 = r11 - r12
            if (r11 == r1) goto L_0x01c5
            int r0 = r11 >> 8
            int r1 = r0 * 192
            r0 = r11 & 255(0xff, float:3.57E-43)
            int r1 = r1 + r0
            r0 = 13
            r7.A01(r1, r0)
            int r2 = r2 + 2
            goto L_0x018c
        L_0x01c5:
            java.lang.String r1 = "Invalid byte sequence"
            X.440 r0 = new X.440
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x01cd:
            r30 = r28
            if (r10 == 0) goto L_0x0203
            X.41U r1 = X.AnonymousClass41U.QR_VERSION
            boolean r0 = r10.containsKey(r1)
            if (r0 == 0) goto L_0x0203
            java.lang.Object r0 = r10.get(r1)
            java.lang.String r0 = r0.toString()
            int r0 = java.lang.Integer.parseInt(r0)
            X.4eC r2 = X.C90474eC.A01(r0)
            int r1 = r5.A00
            int r0 = r3.A00(r2)
            int r1 = r1 + r0
            int r0 = r7.A00
            int r1 = r1 + r0
            r0 = r30
            boolean r0 = A01(r0, r2, r1)
            if (r0 != 0) goto L_0x0252
            java.lang.String r1 = "Data too big for requested version"
            X.440 r0 = new X.440
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0203:
            X.4eC[] r1 = X.C90474eC.A05
            r0 = 0
            r0 = r1[r0]
            int r8 = r5.A00
            int r0 = r3.A00(r0)
            int r8 = r8 + r0
            int r0 = r7.A00
            int r8 = r8 + r0
            r2 = 1
        L_0x0213:
            X.4eC r1 = X.C90474eC.A01(r2)
            r0 = r30
            boolean r0 = A01(r0, r1, r8)
            if (r0 == 0) goto L_0x0244
            int r8 = r5.A00
            int r0 = r3.A00(r1)
            int r8 = r8 + r0
            int r0 = r7.A00
            int r8 = r8 + r0
            r1 = 1
        L_0x022a:
            X.4eC r2 = X.C90474eC.A01(r1)
            r0 = r30
            boolean r0 = A01(r0, r2, r8)
            if (r0 != 0) goto L_0x0252
            int r1 = r1 + 1
            r0 = 40
            if (r1 <= r0) goto L_0x022a
            java.lang.String r1 = "Data too big"
            X.440 r0 = new X.440
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0244:
            int r2 = r2 + 1
            r0 = 40
            if (r2 <= r0) goto L_0x0213
            java.lang.String r1 = "Data too big"
            X.440 r0 = new X.440
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0252:
            X.54t r8 = new X.54t
            r8.<init>()
            int r9 = r5.A00
            int r0 = r8.A00
            int r0 = r0 + r9
            r8.A00(r0)
            r1 = 0
        L_0x0260:
            if (r1 >= r9) goto L_0x026c
            boolean r0 = r5.A03(r1)
            r8.A02(r0)
            int r1 = r1 + 1
            goto L_0x0260
        L_0x026c:
            if (r3 != r4) goto L_0x0295
            int r0 = r7.A00
            int r0 = r0 + 7
            int r6 = r0 >> 3
        L_0x0274:
            int r0 = r3.A00(r2)
            r5 = 1
            int r4 = r5 << r0
            if (r6 >= r4) goto L_0x0769
            r8.A01(r6, r0)
            int r4 = r7.A00
            int r0 = r8.A00
            int r0 = r0 + r4
            r8.A00(r0)
            r1 = 0
        L_0x0289:
            if (r1 >= r4) goto L_0x029a
            boolean r0 = r7.A03(r1)
            r8.A02(r0)
            int r1 = r1 + 1
            goto L_0x0289
        L_0x0295:
            int r6 = r6.length()
            goto L_0x0274
        L_0x029a:
            X.4Gf[] r1 = r2.A03
            int r0 = r30.ordinal()
            r10 = r1[r0]
            int r0 = r2.A00
            r29 = r0
            int r7 = r10.A00
            X.4Ge[] r6 = r10.A01
            int r5 = r6.length
            r4 = 0
            r1 = 0
        L_0x02ad:
            if (r4 >= r5) goto L_0x02b7
            r0 = r6[r4]
            int r0 = r0.A00
            int r1 = r1 + r0
            int r4 = r4 + 1
            goto L_0x02ad
        L_0x02b7:
            int r7 = r7 * r1
            int r7 = r29 - r7
            int r6 = r7 << 3
            int r4 = r8.A00
            if (r4 > r6) goto L_0x074d
            r9 = 0
            r1 = 0
        L_0x02c2:
            int r0 = r8.A00
            if (r0 >= r6) goto L_0x02cf
            r8.A02(r9)
            int r1 = r1 + 1
            r0 = 4
            if (r1 >= r0) goto L_0x02cf
            goto L_0x02c2
        L_0x02cf:
            int r0 = r8.A00
            r0 = r0 & 7
            r5 = 8
            if (r0 <= 0) goto L_0x02df
        L_0x02d7:
            if (r0 >= r5) goto L_0x02df
            r8.A02(r9)
            int r0 = r0 + 1
            goto L_0x02d7
        L_0x02df:
            int r0 = r8.A00
            int r0 = r0 + 7
            int r0 = r0 >> 3
            int r4 = r7 - r0
        L_0x02e7:
            if (r9 >= r4) goto L_0x02f7
            r1 = r9 & 1
            r0 = 17
            if (r1 != 0) goto L_0x02f1
            r0 = 236(0xec, float:3.31E-43)
        L_0x02f1:
            r8.A01(r0, r5)
            int r9 = r9 + 1
            goto L_0x02e7
        L_0x02f7:
            int r9 = r8.A00
            if (r9 != r6) goto L_0x0745
            X.4Ge[] r5 = r10.A01
            int r4 = r5.length
            r1 = 0
            r6 = 0
        L_0x0300:
            if (r1 >= r4) goto L_0x030a
            r0 = r5[r1]
            int r0 = r0.A00
            int r6 = r6 + r0
            int r1 = r1 + 1
            goto L_0x0300
        L_0x030a:
            int r0 = r9 + 7
            int r0 = r0 >> 3
            if (r0 != r7) goto L_0x073d
            java.util.ArrayList r28 = new java.util.ArrayList
            r0 = r28
            r0.<init>(r6)
            r5 = 0
            r4 = 0
            r27 = 0
            r26 = 0
            r25 = 0
        L_0x031f:
            if (r4 >= r6) goto L_0x04f4
            r1 = 1
            int[] r0 = new int[r1]
            r24 = r0
            int[] r12 = new int[r1]
            if (r4 >= r6) goto L_0x04ec
            int r14 = r29 % r6
            int r11 = r6 - r14
            int r23 = r29 / r6
            int r10 = r23 + 1
            int r13 = r7 / r6
            int r9 = r13 + 1
            int r23 = r23 - r13
            int r10 = r10 - r9
            r0 = r23
            if (r0 != r10) goto L_0x04e4
            int r0 = r11 + r14
            if (r6 != r0) goto L_0x04dc
            int r1 = r13 + r23
            int r1 = r1 * r11
            int r0 = r9 + r10
            int r0 = r0 * r14
            int r1 = r1 + r0
            r0 = r29
            if (r0 != r1) goto L_0x04d4
            if (r4 >= r11) goto L_0x04b4
            r24[r5] = r13
            r12[r5] = r23
        L_0x0352:
            r1 = r24[r5]
            byte[] r0 = new byte[r1]
            r22 = r0
            int r12 = r27 << 3
            r11 = 0
        L_0x035b:
            if (r11 >= r1) goto L_0x0378
            r13 = 0
            r10 = 0
        L_0x035f:
            boolean r0 = r8.A03(r12)
            if (r0 == 0) goto L_0x036a
            int r9 = 7 - r13
            r0 = 1
            int r0 = r0 << r9
            r10 = r10 | r0
        L_0x036a:
            int r12 = r12 + 1
            int r13 = r13 + 1
            r0 = 8
            if (r13 < r0) goto L_0x035f
            byte r0 = (byte) r10
            r22[r11] = r0
            int r11 = r11 + 1
            goto L_0x035b
        L_0x0378:
            int r21 = r1 + r23
            r0 = r21
            int[] r10 = new int[r0]
            r9 = 0
            r11 = 0
        L_0x0380:
            if (r11 >= r1) goto L_0x038b
            byte r0 = r22[r11]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r10[r11] = r0
            int r11 = r11 + 1
            goto L_0x0380
        L_0x038b:
            X.4c3 r11 = X.C89374c3.A0D
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r13 = 1
            int[] r14 = new int[r13]
            r14[r5] = r13
            X.4XD r0 = new X.4XD
            r0.<init>(r11, r14)
            r12.add(r0)
            if (r23 == 0) goto L_0x04cc
            int r21 = r21 - r23
            if (r21 <= 0) goto L_0x04c4
            int r14 = r12.size()
            r0 = r23
            if (r0 < r14) goto L_0x03e4
            int r0 = r12.size()
            int r0 = r0 - r13
            java.lang.Object r17 = r12.get(r0)
            r0 = r17
            X.4XD r0 = (X.AnonymousClass4XD) r0
            r17 = r0
            int r14 = r12.size()
        L_0x03c0:
            r0 = r23
            if (r14 > r0) goto L_0x03e4
            r0 = 2
            int[] r15 = new int[r0]
            r15[r5] = r13
            int r16 = r14 + -1
            int[] r0 = r11.A04
            r0 = r0[r16]
            r15[r13] = r0
            X.4XD r0 = new X.4XD
            r0.<init>(r11, r15)
            r15 = r17
            X.4XD r17 = r15.A04(r0)
            r0 = r17
            r12.add(r0)
            int r14 = r14 + 1
            goto L_0x03c0
        L_0x03e4:
            java.lang.Object r20 = r12.get(r0)
            r0 = r20
            X.4XD r0 = (X.AnonymousClass4XD) r0
            r20 = r0
            r0 = r21
            int[] r14 = new int[r0]
            java.lang.System.arraycopy(r10, r5, r14, r5, r0)
            X.4XD r12 = new X.4XD
            r12.<init>(r11, r14)
            r0 = r23
            X.4XD r12 = r12.A02(r0, r13)
            X.4c3 r11 = r12.A00
            r0 = r20
            X.4c3 r0 = r0.A00
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x04bc
            r0 = r20
            int[] r14 = r0.A01
            r0 = r14[r5]
            if (r0 != 0) goto L_0x041c
            java.lang.String r1 = "Divide by 0"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x041c:
            X.4XD r0 = r11.A03
            r19 = r0
            int r0 = r14.length
            int r18 = r0 + -1
            int r0 = r18 - r18
            r0 = r14[r0]
            int r17 = r11.A00(r0)
        L_0x042b:
            int[] r0 = r12.A01
            int r0 = r0.length
            int r14 = r0 + -1
            r0 = r18
            if (r14 < r0) goto L_0x0461
            int[] r0 = r12.A01
            r0 = r0[r5]
            if (r0 == 0) goto L_0x0461
            int[] r14 = r12.A01
            int r0 = r14.length
            int r0 = r0 + -1
            int r16 = r0 - r18
            int r0 = r0 - r0
            r14 = r14[r0]
            r0 = r17
            int r0 = r11.A01(r14, r0)
            r15 = r20
            r14 = r16
            X.4XD r15 = r15.A02(r14, r0)
            X.4XD r14 = r11.A02(r14, r0)
            r0 = r19
            X.4XD r19 = r0.A03(r14)
            X.4XD r12 = r12.A03(r15)
            goto L_0x042b
        L_0x0461:
            r0 = 2
            X.4XD[] r0 = new X.AnonymousClass4XD[r0]
            r0[r5] = r19
            r0[r13] = r12
            r0 = r0[r13]
            int[] r14 = r0.A01
            int r13 = r14.length
            int r12 = r23 - r13
            r11 = 0
        L_0x0470:
            if (r11 >= r12) goto L_0x0479
            int r0 = r21 + r11
            r10[r0] = r5
            int r11 = r11 + 1
            goto L_0x0470
        L_0x0479:
            int r21 = r21 + r12
            r0 = r21
            java.lang.System.arraycopy(r14, r5, r10, r0, r13)
            r0 = r23
            byte[] r11 = new byte[r0]
        L_0x0484:
            r0 = r23
            if (r9 >= r0) goto L_0x0492
            int r0 = r1 + r9
            r0 = r10[r0]
            byte r0 = (byte) r0
            r11[r9] = r0
            int r9 = r9 + 1
            goto L_0x0484
        L_0x0492:
            X.4Gg r9 = new X.4Gg
            r0 = r22
            r9.<init>(r0, r11)
            r0 = r28
            r0.add(r9)
            r0 = r26
            int r26 = java.lang.Math.max(r0, r1)
            r1 = r25
            r0 = r23
            int r25 = java.lang.Math.max(r1, r0)
            r0 = r24[r5]
            int r27 = r27 + r0
            int r4 = r4 + 1
            goto L_0x031f
        L_0x04b4:
            r24[r5] = r9
            r12[r5] = r10
            r23 = r10
            goto L_0x0352
        L_0x04bc:
            java.lang.String r1 = "GenericGFPolys do not have same GenericGF field"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x04c4:
            java.lang.String r1 = "No data bytes provided"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x04cc:
            java.lang.String r1 = "No error correction bytes"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x04d4:
            java.lang.String r1 = "Total bytes mismatch"
            X.440 r0 = new X.440
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x04dc:
            java.lang.String r1 = "RS blocks mismatch"
            X.440 r0 = new X.440
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x04e4:
            java.lang.String r1 = "EC bytes mismatch"
            X.440 r0 = new X.440
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x04ec:
            java.lang.String r1 = "Block ID too large"
            X.440 r0 = new X.440
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x04f4:
            r0 = r27
            if (r7 != r0) goto L_0x0735
            X.54t r4 = new X.54t
            r4.<init>()
            r8 = 0
        L_0x04fe:
            r7 = 8
            r0 = r26
            if (r8 >= r0) goto L_0x0522
            java.util.Iterator r6 = r28.iterator()
        L_0x0508:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x051f
            java.lang.Object r0 = r6.next()
            X.4Gg r0 = (X.C83334Gg) r0
            byte[] r1 = r0.A00
            int r0 = r1.length
            if (r8 >= r0) goto L_0x0508
            byte r0 = r1[r8]
            r4.A01(r0, r7)
            goto L_0x0508
        L_0x051f:
            int r8 = r8 + 1
            goto L_0x04fe
        L_0x0522:
            r0 = r25
            if (r5 >= r0) goto L_0x0544
            java.util.Iterator r6 = r28.iterator()
        L_0x052a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0541
            java.lang.Object r0 = r6.next()
            X.4Gg r0 = (X.C83334Gg) r0
            byte[] r1 = r0.A01
            int r0 = r1.length
            if (r5 >= r0) goto L_0x052a
            byte r0 = r1[r5]
            r4.A01(r0, r7)
            goto L_0x052a
        L_0x0541:
            int r5 = r5 + 1
            goto L_0x0522
        L_0x0544:
            int r0 = r4.A00
            int r0 = r0 + 7
            int r5 = r0 >> 3
            r0 = r29
            if (r0 != r5) goto L_0x0712
            X.2bG r5 = new X.2bG
            r5.<init>()
            r0 = r30
            r5.A01 = r0
            r5.A02 = r3
            r5.A03 = r2
            int r0 = r2.A01
            int r0 = r0 << 2
            int r0 = r0 + 17
            X.4R5 r3 = new X.4R5
            r3.<init>(r0, r0)
            r19 = 2147483647(0x7fffffff, float:NaN)
            r18 = -1
            r6 = 0
        L_0x056c:
            r0 = r30
            X.C62023Bi.A00(r4, r0, r2, r3, r6)
            int r10 = r3.A00
            int r13 = r3.A01
            byte[][] r12 = r3.A02
            r7 = 0
            r8 = 0
        L_0x0579:
            if (r7 >= r10) goto L_0x05a0
            r15 = -1
            r11 = 0
            r14 = 0
        L_0x057e:
            r9 = 5
            if (r11 >= r13) goto L_0x0596
            r0 = r12[r7]
            byte r1 = r0[r11]
            if (r1 != r15) goto L_0x058c
            int r14 = r14 + 1
        L_0x0589:
            int r11 = r11 + 1
            goto L_0x057e
        L_0x058c:
            if (r14 < r9) goto L_0x0593
            int r0 = r14 + -5
            int r0 = r0 + 3
            int r8 = r8 + r0
        L_0x0593:
            r15 = r1
            r14 = 1
            goto L_0x0589
        L_0x0596:
            if (r14 < r9) goto L_0x059d
            int r0 = r14 + -5
            int r0 = r0 + 3
            int r8 = r8 + r0
        L_0x059d:
            int r7 = r7 + 1
            goto L_0x0579
        L_0x05a0:
            r7 = 0
            r16 = 0
        L_0x05a3:
            if (r7 >= r13) goto L_0x05cc
            r15 = -1
            r11 = 0
            r14 = 0
        L_0x05a8:
            r9 = 5
            if (r11 >= r10) goto L_0x05c1
            r0 = r12[r11]
            byte r1 = r0[r7]
            if (r1 != r15) goto L_0x05b6
            int r14 = r14 + 1
        L_0x05b3:
            int r11 = r11 + 1
            goto L_0x05a8
        L_0x05b6:
            if (r14 < r9) goto L_0x05be
            int r0 = r14 + -5
            int r0 = r0 + 3
            int r16 = r16 + r0
        L_0x05be:
            r15 = r1
            r14 = 1
            goto L_0x05b3
        L_0x05c1:
            if (r14 < r9) goto L_0x05c9
            int r0 = r14 + -5
            int r0 = r0 + 3
            int r16 = r16 + r0
        L_0x05c9:
            int r7 = r7 + 1
            goto L_0x05a3
        L_0x05cc:
            int r8 = r8 + r16
            r9 = 0
            r16 = 0
        L_0x05d1:
            int r0 = r10 + -1
            if (r9 >= r0) goto L_0x05f9
            r15 = r12[r9]
            r14 = 0
        L_0x05d8:
            int r0 = r13 + -1
            if (r14 >= r0) goto L_0x05f6
            byte r7 = r15[r14]
            int r11 = r14 + 1
            byte r0 = r15[r11]
            if (r7 != r0) goto L_0x05f4
            int r1 = r9 + 1
            r0 = r12[r1]
            byte r0 = r0[r14]
            if (r7 != r0) goto L_0x05f4
            r0 = r12[r1]
            byte r0 = r0[r11]
            if (r7 != r0) goto L_0x05f4
            int r16 = r16 + 1
        L_0x05f4:
            r14 = r11
            goto L_0x05d8
        L_0x05f6:
            int r9 = r9 + 1
            goto L_0x05d1
        L_0x05f9:
            int r0 = r16 * 3
            int r8 = r8 + r0
            r9 = 0
            r17 = 0
        L_0x05ff:
            if (r9 >= r10) goto L_0x06d0
            r7 = 0
        L_0x0602:
            if (r7 >= r13) goto L_0x06cc
            r14 = r12[r9]
            int r11 = r7 + 6
            r1 = 1
            if (r11 >= r13) goto L_0x065f
            byte r0 = r14[r7]
            if (r0 != r1) goto L_0x065f
            int r0 = r7 + 1
            byte r0 = r14[r0]
            if (r0 != 0) goto L_0x065f
            int r0 = r7 + 2
            byte r0 = r14[r0]
            if (r0 != r1) goto L_0x065f
            int r0 = r7 + 3
            byte r0 = r14[r0]
            if (r0 != r1) goto L_0x065f
            int r0 = r7 + 4
            byte r0 = r14[r0]
            if (r0 != r1) goto L_0x065f
            int r0 = r7 + 5
            byte r0 = r14[r0]
            if (r0 != 0) goto L_0x065f
            byte r0 = r14[r11]
            if (r0 != r1) goto L_0x065f
            int r0 = r7 + -4
            r15 = 0
            int r11 = java.lang.Math.max(r0, r15)
            int r0 = r14.length
            int r16 = java.lang.Math.min(r7, r0)
        L_0x063d:
            r0 = r16
            if (r11 >= r0) goto L_0x065d
            byte r0 = r14[r11]
            int r11 = r11 + 1
            if (r0 != r1) goto L_0x063d
            int r0 = r7 + 7
            int r11 = r7 + 11
            int r15 = java.lang.Math.max(r0, r15)
            int r0 = r14.length
            int r11 = java.lang.Math.min(r11, r0)
        L_0x0654:
            if (r15 >= r11) goto L_0x065d
            byte r0 = r14[r15]
            if (r0 == r1) goto L_0x065f
            int r15 = r15 + 1
            goto L_0x0654
        L_0x065d:
            int r17 = r17 + 1
        L_0x065f:
            int r11 = r9 + 6
            if (r11 >= r10) goto L_0x06c8
            r0 = r12[r9]
            byte r0 = r0[r7]
            if (r0 != r1) goto L_0x06c8
            int r0 = r9 + 1
            r0 = r12[r0]
            byte r0 = r0[r7]
            if (r0 != 0) goto L_0x06c8
            int r0 = r9 + 2
            r0 = r12[r0]
            byte r0 = r0[r7]
            if (r0 != r1) goto L_0x06c8
            int r0 = r9 + 3
            r0 = r12[r0]
            byte r0 = r0[r7]
            if (r0 != r1) goto L_0x06c8
            int r0 = r9 + 4
            r0 = r12[r0]
            byte r0 = r0[r7]
            if (r0 != r1) goto L_0x06c8
            int r0 = r9 + 5
            r0 = r12[r0]
            byte r0 = r0[r7]
            if (r0 != 0) goto L_0x06c8
            r0 = r12[r11]
            byte r0 = r0[r7]
            if (r0 != r1) goto L_0x06c8
            int r0 = r9 + -4
            r14 = 0
            int r15 = java.lang.Math.max(r0, r14)
            int r11 = r12.length
            int r16 = java.lang.Math.min(r9, r11)
        L_0x06a3:
            r0 = r16
            if (r15 >= r0) goto L_0x06c6
            r0 = r12[r15]
            byte r0 = r0[r7]
            int r15 = r15 + 1
            if (r0 != r1) goto L_0x06a3
            int r15 = r9 + 7
            int r0 = r9 + 11
            int r14 = java.lang.Math.max(r15, r14)
            int r11 = java.lang.Math.min(r0, r11)
        L_0x06bb:
            if (r14 >= r11) goto L_0x06c6
            r0 = r12[r14]
            byte r0 = r0[r7]
            if (r0 == r1) goto L_0x06c8
            int r14 = r14 + 1
            goto L_0x06bb
        L_0x06c6:
            int r17 = r17 + 1
        L_0x06c8:
            int r7 = r7 + 1
            goto L_0x0602
        L_0x06cc:
            int r9 = r9 + 1
            goto L_0x05ff
        L_0x06d0:
            int r0 = r17 * 40
            int r8 = r8 + r0
            r14 = 0
            r11 = 0
        L_0x06d5:
            r9 = 1
            if (r14 >= r10) goto L_0x06e9
            r7 = r12[r14]
            r1 = 0
        L_0x06db:
            if (r1 >= r13) goto L_0x06e6
            byte r0 = r7[r1]
            if (r0 != r9) goto L_0x06e3
            int r11 = r11 + 1
        L_0x06e3:
            int r1 = r1 + 1
            goto L_0x06db
        L_0x06e6:
            int r14 = r14 + 1
            goto L_0x06d5
        L_0x06e9:
            int r10 = r10 * r13
            int r0 = r11 << 1
            int r0 = r0 - r10
            int r0 = java.lang.Math.abs(r0)
            int r0 = r0 * 10
            int r0 = r0 / r10
            int r0 = r0 * 10
            int r8 = r8 + r0
            r0 = r19
            if (r8 >= r0) goto L_0x06ff
            r18 = r6
            r19 = r8
        L_0x06ff:
            int r6 = r6 + 1
            r0 = 8
            if (r6 < r0) goto L_0x056c
            r0 = r18
            r5.A00 = r0
            r1 = r0
            r0 = r30
            X.C62023Bi.A00(r4, r0, r2, r3, r1)
            r5.A04 = r3
            return r5
        L_0x0712:
            java.lang.String r0 = "Interleaving error: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = r29
            r1.append(r0)
            java.lang.String r0 = " and "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " differ."
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.440 r0 = new X.440
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0735:
            java.lang.String r1 = "Data bytes does not match offset"
            X.440 r0 = new X.440
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x073d:
            java.lang.String r1 = "Number of bits and data bytes does not match"
            X.440 r0 = new X.440
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0745:
            java.lang.String r1 = "Bits size does not equal capacity"
            X.440 r0 = new X.440
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x074d:
            java.lang.String r0 = "data bits cannot fit in the QR Code"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            java.lang.String r0 = " > "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            X.440 r0 = new X.440
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0769:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r0 = " is bigger than "
            r1.append(r0)
            int r4 = r4 - r5
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            X.440 r0 = new X.440
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0784:
            r1 = move-exception
            X.440 r0 = new X.440
            r0.<init>((java.lang.Throwable) r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51242bF.A00(X.2bE, java.lang.String, java.util.Map):X.2bG");
    }

    public static boolean A01(C51232bE r7, C90474eC r8, int i2) {
        int i3 = r8.A00;
        C83324Gf r0 = r8.A03[r7.ordinal()];
        int i4 = r0.A00;
        int i5 = 0;
        for (C83314Ge r02 : r0.A01) {
            i5 += r02.A00;
        }
        return i3 - (i4 * i5) >= ((i2 + 7) >> 3);
    }
}

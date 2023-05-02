package X;

/* renamed from: X.0Vu  reason: invalid class name and case insensitive filesystem */
public class C06440Vu {
    public static final C06000Tv A00 = C06000Tv.A00("nm", new String[1], 0);
    public static final C06000Tv A01;
    public static final C06000Tv A02;

    static {
        String[] strArr = new String[23];
        strArr[0] = "nm";
        strArr[1] = "ind";
        strArr[2] = "refId";
        strArr[3] = "ty";
        strArr[4] = "parent";
        strArr[5] = "sw";
        strArr[6] = "sh";
        strArr[7] = "sc";
        strArr[8] = "ks";
        strArr[9] = "tt";
        strArr[10] = "masksProperties";
        strArr[11] = "shapes";
        strArr[12] = "t";
        strArr[13] = "ef";
        strArr[14] = "sr";
        strArr[15] = "st";
        strArr[16] = "w";
        strArr[17] = "h";
        strArr[18] = "ip";
        strArr[19] = "op";
        strArr[20] = "tm";
        strArr[21] = "cl";
        A01 = C06000Tv.A00("hd", strArr, 22);
        String[] strArr2 = new String[2];
        strArr2[0] = "d";
        A02 = C06000Tv.A00("a", strArr2, 1);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0267, code lost:
        r2.A0G();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C05320Qf A00(X.AnonymousClass0Rs r61, X.C09090et r62) {
        /*
            X.0JX r33 = X.AnonymousClass0JX.NONE
            java.util.ArrayList r25 = X.AnonymousClass000.A0u()
            java.util.ArrayList r24 = X.AnonymousClass000.A0u()
            r2 = r62
            r2.A0F()
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r60 = java.lang.Float.valueOf(r0)
            r12 = 0
            r32 = 0
            r57 = 0
            java.lang.Float r55 = java.lang.Float.valueOf(r57)
            java.lang.String r13 = "UNSET"
            r35 = r32
            r31 = r32
            r23 = r32
            r11 = r32
            r28 = r11
            r14 = -1
            r62 = 0
            r10 = 0
            r21 = 0
            r20 = 0
            r43 = 0
            r39 = 1065353216(0x3f800000, float:1.0)
            r40 = 0
            r19 = 0
            r18 = 0
            r50 = 0
            r16 = 0
            r22 = r11
        L_0x0043:
            boolean r1 = r2.A0M()
            r0 = r61
            if (r1 == 0) goto L_0x0302
            X.0Tv r1 = A01
            int r1 = r2.A09(r1)
            r4 = 1
            switch(r1) {
                case 0: goto L_0x02fc;
                case 1: goto L_0x02f3;
                case 2: goto L_0x02ed;
                case 3: goto L_0x02dc;
                case 4: goto L_0x02d5;
                case 5: goto L_0x02c6;
                case 6: goto L_0x02b7;
                case 7: goto L_0x02ad;
                case 8: goto L_0x02a7;
                case 9: goto L_0x026c;
                case 10: goto L_0x019c;
                case 11: goto L_0x0187;
                case 12: goto L_0x00da;
                case 13: goto L_0x009b;
                case 14: goto L_0x0096;
                case 15: goto L_0x0091;
                case 16: goto L_0x0083;
                case 17: goto L_0x0075;
                case 18: goto L_0x0070;
                case 19: goto L_0x006b;
                case 20: goto L_0x0066;
                case 21: goto L_0x0061;
                case 22: goto L_0x005c;
                default: goto L_0x0055;
            }
        L_0x0055:
            r2.A0I()
            r2.A0J()
            goto L_0x0043
        L_0x005c:
            boolean r50 = r2.A0N()
            goto L_0x0043
        L_0x0061:
            java.lang.String r22 = r2.A0D()
            goto L_0x0043
        L_0x0066:
            X.0HT r28 = X.C06270Vb.A01(r0, r2, r12)
            goto L_0x0043
        L_0x006b:
            float r10 = X.C09090et.A05(r2)
            goto L_0x0043
        L_0x0070:
            float r62 = X.C09090et.A05(r2)
            goto L_0x0043
        L_0x0075:
            int r0 = r2.A08()
            float r0 = (float) r0
            float r1 = X.AnonymousClass0XD.A00()
            float r0 = r0 * r1
            int r0 = (int) r0
            r18 = r0
            goto L_0x0043
        L_0x0083:
            int r0 = r2.A08()
            float r0 = (float) r0
            float r1 = X.AnonymousClass0XD.A00()
            float r0 = r0 * r1
            int r0 = (int) r0
            r19 = r0
            goto L_0x0043
        L_0x0091:
            float r40 = X.C09090et.A05(r2)
            goto L_0x0043
        L_0x0096:
            float r39 = X.C09090et.A05(r2)
            goto L_0x0043
        L_0x009b:
            r2.A0E()
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
        L_0x00a2:
            boolean r1 = r2.A0M()
            if (r1 == 0) goto L_0x00cc
            r2.A0F()
        L_0x00ab:
            boolean r1 = r2.A0M()
            if (r1 == 0) goto L_0x00c8
            X.0Tv r1 = A00
            int r1 = r2.A09(r1)
            if (r1 == 0) goto L_0x00c0
            r2.A0I()
            r2.A0J()
            goto L_0x00ab
        L_0x00c0:
            java.lang.String r1 = r2.A0D()
            r3.add(r1)
            goto L_0x00ab
        L_0x00c8:
            r2.A0H()
            goto L_0x00a2
        L_0x00cc:
            r2.A0G()
            java.lang.String r1 = "Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r1)
            r1.append(r3)
            goto L_0x0280
        L_0x00da:
            r2.A0F()
        L_0x00dd:
            boolean r1 = r2.A0M()
            if (r1 == 0) goto L_0x0182
            X.0Tv r1 = A02
            int r1 = r2.A09(r1)
            if (r1 == 0) goto L_0x0171
            if (r1 == r4) goto L_0x00f4
            r2.A0I()
            r2.A0J()
            goto L_0x00dd
        L_0x00f4:
            r2.A0E()
            boolean r1 = r2.A0M()
            if (r1 == 0) goto L_0x0162
            r2.A0F()
            r3 = 0
            r11 = r3
        L_0x0102:
            boolean r1 = r2.A0M()
            if (r1 == 0) goto L_0x0158
            X.0Tv r1 = X.AnonymousClass0TX.A01
            int r1 = r2.A09(r1)
            if (r1 == 0) goto L_0x0117
            r2.A0I()
            r2.A0J()
            goto L_0x0102
        L_0x0117:
            r2.A0F()
            r5 = 0
            r9 = r3
            r8 = r3
            r7 = r3
        L_0x011e:
            boolean r1 = r2.A0M()
            if (r1 == 0) goto L_0x014f
            X.0Tv r1 = X.AnonymousClass0TX.A00
            int r1 = r2.A09(r1)
            if (r1 == 0) goto L_0x014a
            if (r1 == r4) goto L_0x0145
            r6 = 2
            if (r1 == r6) goto L_0x0140
            r6 = 3
            if (r1 == r6) goto L_0x013b
            r2.A0I()
            r2.A0J()
            goto L_0x011e
        L_0x013b:
            X.0HT r7 = X.C06270Vb.A01(r0, r2, r4)
            goto L_0x011e
        L_0x0140:
            X.0HT r8 = X.C06270Vb.A01(r0, r2, r4)
            goto L_0x011e
        L_0x0145:
            X.0HO r9 = X.C06270Vb.A00(r0, r2)
            goto L_0x011e
        L_0x014a:
            X.0HO r5 = X.C06270Vb.A00(r0, r2)
            goto L_0x011e
        L_0x014f:
            r2.A0H()
            X.0Oi r11 = new X.0Oi
            r11.<init>(r5, r9, r8, r7)
            goto L_0x0102
        L_0x0158:
            r2.A0H()
            if (r11 != 0) goto L_0x0162
            X.0Oi r11 = new X.0Oi
            r11.<init>(r3, r3, r3, r3)
        L_0x0162:
            boolean r1 = r2.A0M()
            if (r1 == 0) goto L_0x016c
            r2.A0J()
            goto L_0x0162
        L_0x016c:
            r2.A0G()
            goto L_0x00dd
        L_0x0171:
            X.0dw r3 = X.C08620dw.A00
            r1 = 1065353216(0x3f800000, float:1.0)
            java.util.List r3 = X.C06370Vl.A00(r0, r3, r2, r1, r12)
            X.0HS r23 = new X.0HS
            r1 = r23
            r1.<init>(r3)
            goto L_0x00dd
        L_0x0182:
            r2.A0H()
            goto L_0x0043
        L_0x0187:
            r2.A0E()
        L_0x018a:
            boolean r1 = r2.A0M()
            if (r1 == 0) goto L_0x0267
            X.0kl r3 = X.C06360Vk.A02(r0, r2)
            if (r3 == 0) goto L_0x018a
            r1 = r24
            r1.add(r3)
            goto L_0x018a
        L_0x019c:
            r2.A0E()
        L_0x019f:
            boolean r1 = r2.A0M()
            if (r1 == 0) goto L_0x025e
            r2.A0F()
            r1 = 0
            r5 = r1
            r7 = r1
            r6 = 0
        L_0x01ac:
            boolean r3 = r2.A0M()
            if (r3 == 0) goto L_0x024f
            java.lang.String r3 = r2.A0C()
            int r4 = r3.hashCode()
            switch(r4) {
                case 111: goto L_0x01c1;
                case 3588: goto L_0x01ce;
                case 104433: goto L_0x01e6;
                case 3357091: goto L_0x01f3;
                default: goto L_0x01bd;
            }
        L_0x01bd:
            r2.A0J()
            goto L_0x01ac
        L_0x01c1:
            java.lang.String r4 = "o"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01bd
            X.0HU r7 = X.C06270Vb.A02(r0, r2)
            goto L_0x01ac
        L_0x01ce:
            java.lang.String r4 = "pt"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01bd
            float r4 = X.AnonymousClass0XD.A00()
            X.0dx r3 = X.C08630dx.A00
            java.util.List r3 = X.C06370Vl.A00(r0, r3, r2, r4, r12)
            X.0HR r5 = new X.0HR
            r5.<init>(r3)
            goto L_0x01ac
        L_0x01e6:
            java.lang.String r4 = "inv"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01bd
            boolean r6 = r2.A0N()
            goto L_0x01ac
        L_0x01f3:
            java.lang.String r4 = "mode"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x01bd
            java.lang.String r1 = r2.A0D()
            int r4 = r1.hashCode()
            switch(r4) {
                case 97: goto L_0x021b;
                case 105: goto L_0x0226;
                case 110: goto L_0x0237;
                case 115: goto L_0x0243;
                default: goto L_0x0206;
            }
        L_0x0206:
            java.lang.String r1 = "Unknown mask mode "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r1)
            r1.append(r3)
            java.lang.String r3 = ". Defaulting to Add."
            java.lang.String r1 = X.AnonymousClass000.A0h(r3, r1)
            X.C05770Sy.A00(r1)
            X.0Jz r1 = X.C03820Jz.MASK_MODE_ADD
            goto L_0x01ac
        L_0x021b:
            java.lang.String r4 = "a"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0206
            X.0Jz r1 = X.C03820Jz.MASK_MODE_ADD
            goto L_0x01ac
        L_0x0226:
            java.lang.String r4 = "i"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0206
            java.lang.String r1 = "Animation contains intersect masks. They are not supported but will be treated like add masks."
            X.AnonymousClass0Rs.A01(r0, r1)
            X.0Jz r1 = X.C03820Jz.MASK_MODE_INTERSECT
            goto L_0x01ac
        L_0x0237:
            java.lang.String r4 = "n"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0206
            X.0Jz r1 = X.C03820Jz.MASK_MODE_NONE
            goto L_0x01ac
        L_0x0243:
            java.lang.String r4 = "s"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0206
            X.0Jz r1 = X.C03820Jz.MASK_MODE_SUBTRACT
            goto L_0x01ac
        L_0x024f:
            r2.A0H()
            X.0Oj r3 = new X.0Oj
            r3.<init>(r7, r5, r1, r6)
            r1 = r25
            r1.add(r3)
            goto L_0x019f
        L_0x025e:
            int r3 = r25.size()
            int r1 = r0.A03
            int r1 = r1 + r3
            r0.A03 = r1
        L_0x0267:
            r2.A0G()
            goto L_0x0043
        L_0x026c:
            int r3 = r2.A08()
            X.0JX[] r1 = X.AnonymousClass0JX.values()
            int r1 = r1.length
            if (r3 < r1) goto L_0x0289
            java.lang.String r1 = "Unsupported matte type: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r1)
            r1.append(r3)
        L_0x0280:
            java.lang.String r1 = r1.toString()
            X.AnonymousClass0Rs.A01(r0, r1)
            goto L_0x0043
        L_0x0289:
            X.0JX[] r1 = X.AnonymousClass0JX.values()
            r33 = r1[r3]
            int r1 = r33.ordinal()
            switch(r1) {
                case 3: goto L_0x02a1;
                case 4: goto L_0x029e;
                default: goto L_0x0296;
            }
        L_0x0296:
            int r1 = r0.A03
            int r1 = r1 + 1
            r0.A03 = r1
            goto L_0x0043
        L_0x029e:
            java.lang.String r1 = "Unsupported matte type: Luma Inverted"
            goto L_0x02a3
        L_0x02a1:
            java.lang.String r1 = "Unsupported matte type: Luma"
        L_0x02a3:
            X.AnonymousClass0Rs.A01(r0, r1)
            goto L_0x0296
        L_0x02a7:
            X.0df r31 = X.AnonymousClass0TY.A00(r0, r2)
            goto L_0x0043
        L_0x02ad:
            java.lang.String r0 = r2.A0D()
            int r43 = android.graphics.Color.parseColor(r0)
            goto L_0x0043
        L_0x02b7:
            int r0 = r2.A08()
            float r0 = (float) r0
            float r1 = X.AnonymousClass0XD.A00()
            float r0 = r0 * r1
            int r0 = (int) r0
            r20 = r0
            goto L_0x0043
        L_0x02c6:
            int r0 = r2.A08()
            float r0 = (float) r0
            float r1 = X.AnonymousClass0XD.A00()
            float r0 = r0 * r1
            int r0 = (int) r0
            r21 = r0
            goto L_0x0043
        L_0x02d5:
            int r0 = r2.A08()
            long r14 = (long) r0
            goto L_0x0043
        L_0x02dc:
            int r1 = r2.A08()
            X.0Jl r32 = X.C03680Jl.UNKNOWN
            r0 = 6
            if (r1 >= r0) goto L_0x0043
            X.0Jl[] r0 = X.C03680Jl.values()
            r32 = r0[r1]
            goto L_0x0043
        L_0x02ed:
            java.lang.String r35 = r2.A0D()
            goto L_0x0043
        L_0x02f3:
            int r0 = r2.A08()
            long r0 = (long) r0
            r16 = r0
            goto L_0x0043
        L_0x02fc:
            java.lang.String r13 = r2.A0D()
            goto L_0x0043
        L_0x0302:
            r2.A0H()
            float r62 = r62 / r39
            float r10 = r10 / r39
            java.util.ArrayList r1 = X.AnonymousClass000.A0u()
            int r2 = (r62 > r57 ? 1 : (r62 == r57 ? 0 : -1))
            if (r2 <= 0) goto L_0x0325
            r52 = 0
            java.lang.Float r54 = java.lang.Float.valueOf(r62)
            X.0Wl r2 = new X.0Wl
            r51 = r2
            r53 = r0
            r56 = r55
            r51.<init>((android.view.animation.Interpolator) r52, (X.AnonymousClass0Rs) r53, (java.lang.Float) r54, (java.lang.Object) r55, (java.lang.Object) r56, (float) r57)
            r1.add(r2)
        L_0x0325:
            int r2 = (r10 > r57 ? 1 : (r10 == r57 ? 0 : -1))
            if (r2 > 0) goto L_0x032b
            float r10 = r0.A00
        L_0x032b:
            r57 = 0
            java.lang.Float r59 = java.lang.Float.valueOf(r10)
            X.0Wl r2 = new X.0Wl
            r56 = r2
            r58 = r0
            r61 = r60
            r56.<init>((android.view.animation.Interpolator) r57, (X.AnonymousClass0Rs) r58, (java.lang.Float) r59, (java.lang.Object) r60, (java.lang.Object) r61, (float) r62)
            r1.add(r2)
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            java.lang.Float r5 = java.lang.Float.valueOf(r2)
            r7 = r55
            X.0Wl r2 = new X.0Wl
            r3 = r57
            r4 = r0
            r6 = r7
            r8 = r10
            r2.<init>((android.view.animation.Interpolator) r3, (X.AnonymousClass0Rs) r4, (java.lang.Float) r5, (java.lang.Object) r6, (java.lang.Object) r7, (float) r8)
            r1.add(r2)
            java.lang.String r2 = ".ai"
            boolean r2 = r13.endsWith(r2)
            if (r2 != 0) goto L_0x0367
            java.lang.String r3 = "ai"
            r2 = r22
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x036c
        L_0x0367:
            java.lang.String r2 = "Convert your Illustrator layers to shape layers."
            X.AnonymousClass0Rs.A01(r0, r2)
        L_0x036c:
            X.0Qf r26 = new X.0Qf
            r34 = r13
            r36 = r24
            r37 = r25
            r38 = r1
            r41 = r21
            r42 = r20
            r44 = r19
            r45 = r18
            r46 = r16
            r48 = r14
            r27 = r0
            r29 = r23
            r30 = r11
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r48, r50)
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06440Vu.A00(X.0Rs, X.0et):X.0Qf");
    }
}

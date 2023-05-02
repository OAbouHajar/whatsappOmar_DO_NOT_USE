package X;

import java.util.zip.Inflater;

/* renamed from: X.3VV  reason: invalid class name */
public final class AnonymousClass3VV extends C65323Ui {
    public Inflater A00;
    public final C85344Ob A01 = new C85344Ob();
    public final C90504eH A02 = new C90504eH();
    public final C90504eH A03 = new C90504eH();

    public AnonymousClass3VV() {
        super("PgsDecoder");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x01bd: MOVE  (r0v13 X.4eH) = (r38v0 X.4eH)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    /* JADX WARNING: CFG modification limit reached, blocks count: 204 */
    public X.C109535Sn A07(byte[] r40, int r41, boolean r42) {
        /*
            r39 = this;
            r5 = r39
            X.4eH r3 = r5.A02
            r1 = r40
            r0 = r41
            r3.A0U(r1, r0)
            int r0 = r3.A00
            int r1 = r3.A01
            int r0 = r0 - r1
            if (r0 <= 0) goto L_0x0086
            byte[] r0 = r3.A02
            byte r0 = r0[r1]
            r1 = r0 & 255(0xff, float:3.57E-43)
            r0 = 120(0x78, float:1.68E-43)
            if (r1 != r0) goto L_0x0086
            java.util.zip.Inflater r6 = r5.A00
            if (r6 != 0) goto L_0x0027
            java.util.zip.Inflater r6 = new java.util.zip.Inflater
            r6.<init>()
            r5.A00 = r6
        L_0x0027:
            X.4eH r4 = r5.A03
            int r1 = X.C90504eH.A00(r3)
            if (r1 <= 0) goto L_0x0086
            byte[] r0 = r4.A02
            int r0 = r0.length
            if (r0 >= r1) goto L_0x0039
            int r0 = r1 << 1
            r4.A0P(r0)
        L_0x0039:
            byte[] r2 = r3.A02
            int r1 = r3.A01
            int r0 = r3.A00
            int r0 = r0 - r1
            r6.setInput(r2, r1, r0)
            r2 = 0
            goto L_0x004a
        L_0x0045:
            int r0 = r0 << 1
            r4.A0P(r0)     // Catch:{ DataFormatException -> 0x0078, all -> 0x0073 }
        L_0x004a:
            byte[] r1 = r4.A02     // Catch:{ DataFormatException -> 0x0078, all -> 0x0073 }
            int r0 = r1.length     // Catch:{ DataFormatException -> 0x0078, all -> 0x0073 }
            int r0 = r0 - r2
            int r0 = r6.inflate(r1, r2, r0)     // Catch:{ DataFormatException -> 0x0078, all -> 0x0073 }
            int r2 = r2 + r0
            boolean r0 = r6.finished()     // Catch:{ DataFormatException -> 0x0078, all -> 0x0073 }
            if (r0 == 0) goto L_0x005d
            r4.A0R(r2)     // Catch:{ DataFormatException -> 0x0078, all -> 0x0073 }
            goto L_0x007c
        L_0x005d:
            boolean r0 = r6.needsDictionary()     // Catch:{ DataFormatException -> 0x0078, all -> 0x0073 }
            if (r0 != 0) goto L_0x006f
            boolean r0 = r6.needsInput()     // Catch:{ DataFormatException -> 0x0078, all -> 0x0073 }
            if (r0 != 0) goto L_0x006f
            byte[] r0 = r4.A02     // Catch:{ DataFormatException -> 0x0078, all -> 0x0073 }
            int r0 = r0.length     // Catch:{ DataFormatException -> 0x0078, all -> 0x0073 }
            if (r2 != r0) goto L_0x004a
            goto L_0x0045
        L_0x006f:
            r6.reset()
            goto L_0x0086
        L_0x0073:
            r0 = move-exception
            r6.reset()
            throw r0
        L_0x0078:
            r6.reset()
            goto L_0x0086
        L_0x007c:
            r6.reset()
            byte[] r1 = r4.A02
            int r0 = r4.A00
            r3.A0U(r1, r0)
        L_0x0086:
            X.4Ob r2 = r5.A01
            r1 = 0
            r2.A05 = r1
            r2.A04 = r1
            r2.A02 = r1
            r2.A03 = r1
            r2.A01 = r1
            r2.A00 = r1
            X.4eH r0 = r2.A07
            r38 = r0
            r0.A0Q(r1)
            r2.A06 = r1
            java.util.ArrayList r20 = X.AnonymousClass000.A0u()
        L_0x00a2:
            int r4 = r3.A00
            int r0 = r3.A01
            int r0 = r4 - r0
            r6 = 3
            if (r0 < r6) goto L_0x026d
            int r1 = r3.A0C()
            int r5 = r3.A0F()
            int r10 = r3.A01
            int r10 = r10 + r5
            r15 = 0
            if (r10 <= r4) goto L_0x00bd
            r3.A0S(r4)
            goto L_0x00a2
        L_0x00bd:
            r0 = 128(0x80, float:1.794E-43)
            if (r1 == r0) goto L_0x01ad
            switch(r1) {
                case 20: goto L_0x013b;
                case 21: goto L_0x00f1;
                case 22: goto L_0x00cf;
                default: goto L_0x00c4;
            }
        L_0x00c4:
            r3.A0S(r10)
            if (r15 == 0) goto L_0x00a2
            r0 = r20
            r0.add(r15)
            goto L_0x00a2
        L_0x00cf:
            r0 = 19
            if (r5 < r0) goto L_0x00c4
            int r0 = r3.A0F()
            r2.A05 = r0
            int r0 = r3.A0F()
            r2.A04 = r0
            r0 = 11
            r3.A0T(r0)
            int r0 = r3.A0F()
            r2.A02 = r0
            int r0 = r3.A0F()
            r2.A03 = r0
            goto L_0x00c4
        L_0x00f1:
            r4 = 4
            if (r5 < r4) goto L_0x00c4
            int r0 = X.C90504eH.A01(r3, r6)
            r0 = r0 & 128(0x80, float:1.794E-43)
            boolean r0 = X.AnonymousClass000.A1O(r0)
            int r5 = r5 + -4
            if (r0 == 0) goto L_0x011f
            r0 = 7
            if (r5 < r0) goto L_0x00c4
            int r1 = r3.A0D()
            if (r1 < r4) goto L_0x00c4
            int r0 = r3.A0F()
            r2.A01 = r0
            int r0 = r3.A0F()
            r2.A00 = r0
            int r1 = r1 - r4
            r0 = r38
            r0.A0Q(r1)
            int r5 = r5 + -7
        L_0x011f:
            r0 = r38
            int r4 = r0.A01
            int r0 = r0.A00
            if (r4 >= r0) goto L_0x00c4
            if (r5 <= 0) goto L_0x00c4
            int r1 = X.AnonymousClass3K4.A06(r0, r4, r5)
            r0 = r38
            byte[] r0 = r0.A02
            r3.A0V(r0, r4, r1)
            int r4 = r4 + r1
            r0 = r38
            r0.A0S(r4)
            goto L_0x00c4
        L_0x013b:
            int r1 = r5 % 5
            r0 = 2
            if (r1 != r0) goto L_0x00c4
            r3.A0T(r0)
            int[] r13 = r2.A08
            r0 = 0
            java.util.Arrays.fill(r13, r0)
            int r14 = r5 / 5
            r12 = 0
        L_0x014c:
            if (r12 >= r14) goto L_0x01a8
            int r19 = r3.A0C()
            int r0 = r3.A0C()
            int r4 = r3.A0C()
            int r5 = r3.A0C()
            int r18 = r3.A0C()
            double r8 = (double) r0
            r0 = 4608992865850220347(0x3ff66e978d4fdf3b, double:1.402)
            int r4 = r4 + -128
            double r6 = (double) r4
            double r0 = r0 * r6
            double r0 = r0 + r8
            int r11 = (int) r0
            r16 = 4599871095020959050(0x3fd60663c74fb54a, double:0.34414)
            int r0 = r5 + -128
            double r4 = (double) r0
            double r16 = r16 * r4
            double r0 = r8 - r16
            r16 = 4604607620821057148(0x3fe6da3c21187e7c, double:0.71414)
            double r6 = r6 * r16
            double r0 = r0 - r6
            int r6 = (int) r0
            r0 = 4610659197712347431(0x3ffc5a1cac083127, double:1.772)
            double r4 = r4 * r0
            double r8 = r8 + r4
            int r4 = (int) r8
            int r8 = r18 << 24
            r7 = 0
            r5 = 255(0xff, float:3.57E-43)
            int r0 = X.AnonymousClass3K3.A0C(r11, r5, r7)
            int r0 = r0 << 16
            r8 = r8 | r0
            int r0 = X.AnonymousClass3K3.A0C(r6, r5, r7)
            int r1 = r0 << 8
            r1 = r1 | r8
            int r0 = X.AnonymousClass3K3.A0C(r4, r5, r7)
            r0 = r0 | r1
            r13[r19] = r0
            int r12 = r12 + 1
            goto L_0x014c
        L_0x01a8:
            r0 = 1
            r2.A06 = r0
            goto L_0x00c4
        L_0x01ad:
            int r0 = r2.A05
            if (r0 == 0) goto L_0x0257
            int r0 = r2.A04
            if (r0 == 0) goto L_0x0257
            int r0 = r2.A01
            if (r0 == 0) goto L_0x0257
            int r0 = r2.A00
            if (r0 == 0) goto L_0x0257
            r0 = r38
            int r1 = r0.A00
            if (r1 == 0) goto L_0x0257
            int r0 = r0.A01
            if (r0 != r1) goto L_0x0257
            boolean r0 = r2.A06
            if (r0 == 0) goto L_0x0257
            r1 = 0
            r0 = r38
            r0.A0S(r1)
            int r7 = r2.A01
            int r0 = r2.A00
            int r7 = r7 * r0
            int[] r5 = new int[r7]
            r6 = 0
        L_0x01d9:
            if (r6 >= r7) goto L_0x0211
            int r1 = r38.A0C()
            if (r1 == 0) goto L_0x01eb
            int r4 = r6 + 1
            int[] r0 = r2.A08
            r0 = r0[r1]
            r5[r6] = r0
        L_0x01e9:
            r6 = r4
            goto L_0x01d9
        L_0x01eb:
            int r1 = r38.A0C()
            if (r1 == 0) goto L_0x01d9
            r0 = r1 & 64
            r4 = r1 & 63
            if (r0 == 0) goto L_0x01fe
            int r4 = r4 << 8
            int r0 = r38.A0C()
            r4 = r4 | r0
        L_0x01fe:
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x0208
            r0 = 0
        L_0x0203:
            int r4 = r4 + r6
            java.util.Arrays.fill(r5, r6, r4, r0)
            goto L_0x01e9
        L_0x0208:
            int[] r1 = r2.A08
            int r0 = r38.A0C()
            r0 = r1[r0]
            goto L_0x0203
        L_0x0211:
            int r4 = r2.A01
            int r1 = r2.A00
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r22 = android.graphics.Bitmap.createBitmap(r5, r4, r1, r0)
            int r0 = r2.A02
            float r5 = (float) r0
            int r0 = r2.A05
            float r7 = (float) r0
            float r5 = r5 / r7
            int r0 = r2.A03
            float r4 = (float) r0
            int r0 = r2.A04
            float r6 = (float) r0
            float r4 = r4 / r6
            int r0 = r2.A01
            float r1 = (float) r0
            float r1 = r1 / r7
            int r0 = r2.A00
            float r0 = (float) r0
            float r0 = r0 / r6
            r30 = 0
            r34 = -2147483648(0xffffffff80000000, float:-0.0)
            r35 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r27 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r24 = r15
            r31 = 0
            r32 = 0
            r33 = 0
            r36 = -2147483648(0xffffffff80000000, float:-0.0)
            r37 = 0
            X.4aV r21 = new X.4aV
            r23 = r15
            r25 = r4
            r26 = r5
            r28 = r1
            r29 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r15 = r21
        L_0x0257:
            r1 = 0
            r2.A05 = r1
            r2.A04 = r1
            r2.A02 = r1
            r2.A03 = r1
            r2.A01 = r1
            r2.A00 = r1
            r0 = r38
            r0.A0Q(r1)
            r2.A06 = r1
            goto L_0x00c4
        L_0x026d:
            java.util.List r1 = java.util.Collections.unmodifiableList(r20)
            X.4q1 r0 = new X.4q1
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3VV.A07(byte[], int, boolean):X.5Sn");
    }
}

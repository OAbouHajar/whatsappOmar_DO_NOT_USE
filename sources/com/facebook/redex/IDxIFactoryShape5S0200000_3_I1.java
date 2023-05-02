package com.facebook.redex;

import X.C014206u;

public class IDxIFactoryShape5S0200000_3_I1 extends C014206u {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxIFactoryShape5S0200000_3_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x01d1, code lost:
        r0 = "View model type mismatch";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x03f9, code lost:
        r0 = "Invalid viewModel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x03ff, code lost:
        throw X.AnonymousClass000.A0T(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C003401n A6s(java.lang.Class r70) {
        /*
            r69 = this;
            r0 = r69
            int r1 = r0.A02
            r2 = r70
            switch(r1) {
                case 0: goto L_0x0039;
                case 1: goto L_0x00a5;
                case 2: goto L_0x013b;
                case 3: goto L_0x01d5;
                case 4: goto L_0x02c1;
                case 5: goto L_0x03ad;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Class<X.5eU> r1 = X.C110595eU.class
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x03f9
            java.lang.Object r6 = r0.A01
            X.00n r6 = (X.C001200n) r6
            java.lang.Object r0 = r0.A00
            X.5tU r0 = (X.C117745tU) r0
            X.0t3 r5 = r0.A07
            X.0sq r4 = r0.A0R
            X.15p r3 = r0.A0Q
            X.013 r2 = r0.A09
            X.16r r1 = r0.A0C
            X.5vO r0 = r0.A0P
            X.5eU r16 = new X.5eU
            r17 = r6
            r18 = r5
            r19 = r2
            r20 = r1
            r21 = r0
            r22 = r3
            r23 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            return r16
        L_0x0039:
            java.lang.Class<X.5eb> r1 = X.C110655eb.class
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x03f9
            java.lang.Object r14 = r0.A01
            X.00n r14 = (X.C001200n) r14
            java.lang.Object r0 = r0.A00
            X.5tV r0 = (X.C117755tV) r0
            X.0t3 r1 = r0.A0A
            r22 = r1
            X.0pt r1 = r0.A01
            r19 = r1
            X.0so r1 = r0.A00
            r18 = r1
            X.0sK r1 = r0.A02
            r20 = r1
            X.0ug r1 = r0.A0K
            r28 = r1
            X.0tz r1 = r0.A0B
            r23 = r1
            X.0sq r15 = r0.A0f
            X.160 r13 = r0.A0H
            X.0wR r12 = r0.A0d
            X.0wS r11 = r0.A0W
            X.0t6 r10 = r0.A0D
            X.5x7 r9 = r0.A0L
            X.0wT r8 = r0.A0R
            X.0wU r7 = r0.A0T
            X.173 r6 = r0.A0G
            X.16r r5 = r0.A0F
            X.0wV r4 = r0.A0V
            X.0wP r3 = r0.A07
            X.0wX r2 = r0.A0P
            X.5wq r1 = r0.A0Y
            X.17O r0 = r0.A0Q
            X.5eb r16 = new X.5eb
            r32 = r8
            r33 = r7
            r34 = r4
            r35 = r11
            r36 = r1
            r37 = r12
            r38 = r15
            r17 = r14
            r21 = r3
            r24 = r10
            r25 = r5
            r26 = r6
            r27 = r13
            r29 = r9
            r30 = r2
            r31 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            return r16
        L_0x00a5:
            java.lang.Class<X.5nE> r1 = X.C114165nE.class
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x01d1
            java.lang.Object r1 = r0.A00
            X.5tV r1 = (X.C117755tV) r1
            X.0t3 r2 = r1.A0A
            r29 = r2
            X.0pt r2 = r1.A01
            r25 = r2
            X.0sK r2 = r1.A02
            r21 = r2
            X.0tz r2 = r1.A0B
            r26 = r2
            X.0sq r2 = r1.A0f
            r20 = r2
            X.160 r2 = r1.A0H
            r19 = r2
            X.15p r2 = r1.A0e
            r18 = r2
            X.0sG r2 = r1.A08
            r23 = r2
            X.01V r2 = r1.A09
            r24 = r2
            X.013 r2 = r1.A0C
            r27 = r2
            X.0wS r2 = r1.A0W
            r17 = r2
            X.01Y r2 = r1.A06
            r22 = r2
            X.0t6 r2 = r1.A0D
            r28 = r2
            X.1ME r15 = r1.A05
            X.0wT r14 = r1.A0R
            X.5wT r13 = r1.A0c
            X.0vO r12 = r1.A0E
            X.175 r11 = r1.A0O
            X.0w8 r10 = r1.A0U
            X.173 r9 = r1.A0G
            X.0uc r8 = r1.A04
            X.61t r7 = r1.A0M
            X.69a r6 = r1.A0Z
            X.1GO r5 = r1.A0a
            X.16r r4 = r1.A0F
            X.1MA r3 = r1.A0X
            X.17Y r2 = r1.A0S
            X.107 r1 = r1.A0N
            java.lang.Object r0 = r0.A01
            android.os.Bundle r0 = (android.os.Bundle) r0
            X.5nE r16 = new X.5nE
            r32 = r19
            r33 = r7
            r34 = r1
            r35 = r11
            r36 = r14
            r37 = r2
            r38 = r10
            r39 = r17
            r40 = r3
            r41 = r6
            r42 = r5
            r43 = r13
            r44 = r18
            r45 = r20
            r17 = r0
            r18 = r25
            r19 = r21
            r20 = r8
            r21 = r15
            r25 = r29
            r29 = r12
            r30 = r4
            r31 = r9
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            return r16
        L_0x013b:
            java.lang.Class<X.5nD> r1 = X.C114155nD.class
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x01d1
            java.lang.Object r1 = r0.A00
            X.5tV r1 = (X.C117755tV) r1
            X.0t3 r2 = r1.A0A
            r29 = r2
            X.0pt r2 = r1.A01
            r25 = r2
            X.0sK r2 = r1.A02
            r21 = r2
            X.0tz r2 = r1.A0B
            r26 = r2
            X.0sq r2 = r1.A0f
            r20 = r2
            X.160 r2 = r1.A0H
            r19 = r2
            X.15p r2 = r1.A0e
            r18 = r2
            X.0sG r2 = r1.A08
            r23 = r2
            X.01V r2 = r1.A09
            r24 = r2
            X.013 r2 = r1.A0C
            r27 = r2
            X.0wS r2 = r1.A0W
            r17 = r2
            X.01Y r2 = r1.A06
            r22 = r2
            X.0t6 r2 = r1.A0D
            r28 = r2
            X.1ME r15 = r1.A05
            X.0wT r14 = r1.A0R
            X.5wT r13 = r1.A0c
            X.0vO r12 = r1.A0E
            X.175 r11 = r1.A0O
            X.0w8 r10 = r1.A0U
            X.173 r9 = r1.A0G
            X.0uc r8 = r1.A04
            X.61t r7 = r1.A0M
            X.1GO r6 = r1.A0a
            X.16r r5 = r1.A0F
            X.69a r4 = r1.A0Z
            X.1MA r3 = r1.A0X
            X.17Y r2 = r1.A0S
            X.107 r1 = r1.A0N
            java.lang.Object r0 = r0.A01
            android.os.Bundle r0 = (android.os.Bundle) r0
            X.5nD r16 = new X.5nD
            r32 = r19
            r33 = r7
            r34 = r1
            r35 = r11
            r36 = r14
            r37 = r2
            r38 = r10
            r39 = r17
            r40 = r3
            r41 = r4
            r42 = r6
            r43 = r13
            r44 = r18
            r45 = r20
            r17 = r0
            r18 = r25
            r19 = r21
            r20 = r8
            r21 = r15
            r25 = r29
            r29 = r12
            r30 = r5
            r31 = r9
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            return r16
        L_0x01d1:
            java.lang.String r0 = "View model type mismatch"
            goto L_0x03fb
        L_0x01d5:
            java.lang.Class<X.5n6> r1 = X.C114085n6.class
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x03f9
            java.lang.Object r1 = r0.A00
            X.5tW r1 = (X.C117765tW) r1
            X.0t3 r2 = r1.A0A
            r68 = r2
            X.0pt r2 = r1.A01
            r67 = r2
            X.0so r2 = r1.A00
            r66 = r2
            X.0sK r2 = r1.A02
            r65 = r2
            X.0tz r2 = r1.A0B
            r64 = r2
            X.0sq r2 = r1.A0o
            r60 = r2
            X.0s5 r2 = r1.A03
            r63 = r2
            X.0pd r2 = r1.A0L
            r35 = r2
            X.160 r2 = r1.A0J
            r34 = r2
            X.0ug r2 = r1.A0M
            r36 = r2
            X.15p r2 = r1.A0l
            r58 = r2
            X.0sG r2 = r1.A08
            r62 = r2
            X.01V r2 = r1.A09
            r61 = r2
            X.013 r2 = r1.A0E
            r29 = r2
            X.0wR r2 = r1.A0k
            r28 = r2
            X.0wS r2 = r1.A0Z
            r27 = r2
            X.01Y r2 = r1.A06
            r26 = r2
            X.0t6 r2 = r1.A0F
            r30 = r2
            X.1ME r2 = r1.A05
            r25 = r2
            X.5xN r2 = r1.A0j
            r24 = r2
            X.0wT r2 = r1.A0U
            r23 = r2
            X.5wT r2 = r1.A0i
            r22 = r2
            X.0vO r2 = r1.A0G
            r31 = r2
            X.60h r2 = r1.A0f
            r21 = r2
            X.1HB r2 = r1.A0m
            r20 = r2
            X.175 r2 = r1.A0S
            r19 = r2
            X.5wy r2 = r1.A0P
            r18 = r2
            X.0wU r2 = r1.A0W
            r17 = r2
            X.0w8 r15 = r1.A0Y
            X.173 r14 = r1.A0I
            X.0uc r13 = r1.A04
            X.61t r12 = r1.A0N
            X.1GO r11 = r1.A0d
            X.16r r10 = r1.A0H
            X.69a r9 = r1.A0b
            X.60O r8 = r1.A0O
            X.60V r7 = r1.A0Q
            X.0wX r6 = r1.A0T
            X.1MA r5 = r1.A0a
            X.17Y r4 = r1.A0V
            X.107 r3 = r1.A0R
            X.5ix r2 = r1.A0h
            X.1MB r1 = r1.A0c
            java.lang.Object r0 = r0.A01
            android.os.Bundle r0 = (android.os.Bundle) r0
            X.5n6 r16 = new X.5n6
            r32 = r10
            r33 = r14
            r37 = r12
            r38 = r8
            r39 = r18
            r40 = r7
            r41 = r3
            r42 = r19
            r43 = r6
            r44 = r23
            r45 = r4
            r46 = r17
            r47 = r15
            r48 = r27
            r49 = r5
            r50 = r9
            r51 = r1
            r52 = r11
            r53 = r21
            r54 = r2
            r55 = r22
            r56 = r24
            r57 = r28
            r59 = r20
            r17 = r0
            r18 = r66
            r19 = r67
            r20 = r65
            r21 = r63
            r22 = r13
            r23 = r25
            r24 = r26
            r25 = r62
            r26 = r61
            r27 = r68
            r28 = r64
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            return r16
        L_0x02c1:
            java.lang.Class<X.5nF> r1 = X.C114175nF.class
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x03f9
            java.lang.Object r1 = r0.A00
            X.5tW r1 = (X.C117765tW) r1
            X.0t3 r2 = r1.A0A
            r68 = r2
            X.0pt r2 = r1.A01
            r67 = r2
            X.0so r2 = r1.A00
            r66 = r2
            X.0sK r2 = r1.A02
            r65 = r2
            X.0tz r2 = r1.A0B
            r64 = r2
            X.0sq r2 = r1.A0o
            r60 = r2
            X.0s5 r2 = r1.A03
            r63 = r2
            X.0pd r2 = r1.A0L
            r35 = r2
            X.160 r2 = r1.A0J
            r34 = r2
            X.0ug r2 = r1.A0M
            r36 = r2
            X.15p r2 = r1.A0l
            r58 = r2
            X.0sG r2 = r1.A08
            r62 = r2
            X.01V r2 = r1.A09
            r61 = r2
            X.013 r2 = r1.A0E
            r29 = r2
            X.0wR r2 = r1.A0k
            r28 = r2
            X.0wS r2 = r1.A0Z
            r27 = r2
            X.01Y r2 = r1.A06
            r26 = r2
            X.0t6 r2 = r1.A0F
            r30 = r2
            X.1ME r2 = r1.A05
            r25 = r2
            X.5xN r2 = r1.A0j
            r24 = r2
            X.0wT r2 = r1.A0U
            r23 = r2
            X.5wT r2 = r1.A0i
            r22 = r2
            X.0vO r2 = r1.A0G
            r31 = r2
            X.60h r2 = r1.A0f
            r21 = r2
            X.1HB r2 = r1.A0m
            r20 = r2
            X.175 r2 = r1.A0S
            r19 = r2
            X.5wy r2 = r1.A0P
            r18 = r2
            X.0wU r2 = r1.A0W
            r17 = r2
            X.0w8 r15 = r1.A0Y
            X.173 r14 = r1.A0I
            X.0uc r13 = r1.A04
            X.61t r12 = r1.A0N
            X.1GO r11 = r1.A0d
            X.16r r10 = r1.A0H
            X.69a r9 = r1.A0b
            X.60O r8 = r1.A0O
            X.60V r7 = r1.A0Q
            X.0wX r6 = r1.A0T
            X.1MA r5 = r1.A0a
            X.17Y r4 = r1.A0V
            X.107 r3 = r1.A0R
            X.5ix r2 = r1.A0h
            X.1MB r1 = r1.A0c
            java.lang.Object r0 = r0.A01
            android.os.Bundle r0 = (android.os.Bundle) r0
            X.5nF r16 = new X.5nF
            r32 = r10
            r33 = r14
            r37 = r12
            r38 = r8
            r39 = r18
            r40 = r7
            r41 = r3
            r42 = r19
            r43 = r6
            r44 = r23
            r45 = r4
            r46 = r17
            r47 = r15
            r48 = r27
            r49 = r5
            r50 = r9
            r51 = r1
            r52 = r11
            r53 = r21
            r54 = r2
            r55 = r22
            r56 = r24
            r57 = r28
            r59 = r20
            r17 = r0
            r18 = r66
            r19 = r67
            r20 = r65
            r21 = r63
            r22 = r13
            r23 = r25
            r24 = r26
            r25 = r62
            r26 = r61
            r27 = r68
            r28 = r64
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            return r16
        L_0x03ad:
            java.lang.Class<X.5ec> r1 = X.C110665ec.class
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x03f9
            java.lang.Object r13 = r0.A01
            X.01A r13 = (X.AnonymousClass01A) r13
            java.lang.Object r0 = r0.A00
            X.5tW r0 = (X.C117765tW) r0
            X.0t3 r12 = r0.A0A
            X.0pt r11 = r0.A01
            X.0tz r10 = r0.A0B
            X.0s5 r9 = r0.A03
            X.0ug r8 = r0.A0M
            X.0wS r7 = r0.A0Z
            X.0rz r6 = r0.A0C
            X.0wU r5 = r0.A0W
            X.174 r4 = r0.A0X
            X.0wP r3 = r0.A07
            X.0wX r2 = r0.A0T
            X.60V r1 = r0.A0Q
            X.0sm r0 = r0.A0D
            X.5ec r16 = new X.5ec
            r17 = r13
            r18 = r11
            r19 = r9
            r20 = r3
            r21 = r12
            r22 = r10
            r23 = r6
            r24 = r0
            r25 = r8
            r26 = r1
            r27 = r2
            r28 = r5
            r29 = r4
            r30 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return r16
        L_0x03f9:
            java.lang.String r0 = "Invalid viewModel"
        L_0x03fb:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxIFactoryShape5S0200000_3_I1.A6s(java.lang.Class):X.01n");
    }
}

package X;

import java.util.Comparator;

/* renamed from: X.07B  reason: invalid class name */
public class AnonymousClass07B {
    public static final Comparator A00 = new C10700hY();

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008d, code lost:
        if (r8[r2 - 1] < r8[r2 + 1]) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00eb, code lost:
        r3 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ec, code lost:
        if (r3 > r6) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ee, code lost:
        r15 = r3 + r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f2, code lost:
        if (r15 == (r6 + r19)) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f6, code lost:
        if (r15 == (r5 + r19)) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f8, code lost:
        r2 = r23 + r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0102, code lost:
        if (r7[r2 - 1] >= r7[r2 + 1]) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0104, code lost:
        r16 = r7[(r23 + r15) - 1];
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010a, code lost:
        r17 = r16 - r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010c, code lost:
        if (r16 <= 0) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010e, code lost:
        if (r17 <= 0) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011e, code lost:
        if (r25.A04((r21 + r16) - 1, (r14 + r17) - 1) == false) goto L_0x0125;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0120, code lost:
        r16 = r16 - 1;
        r17 = r17 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0125, code lost:
        r0 = r23 + r15;
        r7[r0] = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0129, code lost:
        if (r18 != false) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012b, code lost:
        if (r15 < r5) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012d, code lost:
        if (r15 > r6) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x012f, code lost:
        r1 = r8[r0];
        r0 = r7[r0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0133, code lost:
        if (r1 < r0) goto L_0x01b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0135, code lost:
        r3 = new X.C04960Or();
        r3.A01 = r0;
        r3.A02 = r0 - r15;
        r3.A00 = r1 - r0;
        r3.A03 = r4;
        r3.A04 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b0, code lost:
        r3 = r3 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01b4, code lost:
        r16 = r7[(r23 + r15) + 1] - 1;
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01bf, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x00b1 A[EDGE_INSN: B:102:0x00b1->B:25:0x00b1 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ac A[LOOP:3: B:19:0x0099->B:24:0x00ac, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00de A[LOOP:2: B:12:0x007d->B:34:0x00de, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x00c8 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass07C A00(X.AnonymousClass07A r25) {
        /*
            r11 = 1
            int r2 = r25.A01()
            int r1 = r25.A00()
            java.util.ArrayList r24 = new java.util.ArrayList
            r24.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            X.0U7 r0 = new X.0U7
            r0.<init>(r2, r1)
            r10.add(r0)
            int r23 = r2 + r1
            int r2 = r2 - r1
            int r0 = java.lang.Math.abs(r2)
            int r23 = r23 + r0
            int r0 = r23 << 1
            int[] r8 = new int[r0]
            int[] r7 = new int[r0]
            java.util.ArrayList r22 = new java.util.ArrayList
            r22.<init>()
        L_0x002f:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x01d2
            int r0 = r10.size()
            int r0 = r0 + -1
            java.lang.Object r9 = r10.remove(r0)
            X.0U7 r9 = (X.AnonymousClass0U7) r9
            int r0 = r9.A03
            r21 = r0
            int r0 = r9.A02
            int r14 = r9.A01
            int r13 = r9.A00
            int r20 = r0 - r21
            int r13 = r13 - r14
            r0 = r20
            if (r0 < r11) goto L_0x01c3
            if (r13 < r11) goto L_0x01c3
            int r19 = r20 - r13
            int r0 = r20 + r13
            int r0 = r0 + 1
            int r12 = r0 >> 1
            int r2 = r23 - r12
            int r2 = r2 - r11
            int r0 = r23 + r12
            int r1 = r0 + 1
            r0 = 0
            java.util.Arrays.fill(r8, r2, r1, r0)
            int r2 = r2 + r19
            int r1 = r1 + r19
            r0 = r20
            java.util.Arrays.fill(r7, r2, r1, r0)
            int r0 = r19 % 2
            r18 = 0
            if (r0 == 0) goto L_0x0078
            r18 = 1
        L_0x0078:
            r6 = 0
        L_0x0079:
            if (r6 > r12) goto L_0x01ca
            int r5 = -r6
            r15 = r5
        L_0x007d:
            if (r15 > r6) goto L_0x00eb
            if (r15 == r5) goto L_0x008f
            if (r15 == r6) goto L_0x00e1
            int r2 = r23 + r15
            int r0 = r2 + -1
            r1 = r8[r0]
            int r0 = r2 + 1
            r0 = r8[r0]
            if (r1 >= r0) goto L_0x00e1
        L_0x008f:
            int r0 = r23 + r15
            int r0 = r0 + 1
            r4 = r8[r0]
            r16 = 0
        L_0x0097:
            int r3 = r4 - r15
        L_0x0099:
            r0 = r20
            if (r4 >= r0) goto L_0x00b1
            if (r3 >= r13) goto L_0x00b1
            int r1 = r21 + r4
            int r0 = r14 + r3
            r2 = r1
            r1 = r25
            boolean r0 = r1.A04(r2, r0)
            if (r0 == 0) goto L_0x00b1
            int r4 = r4 + 1
            int r3 = r3 + 1
            goto L_0x0099
        L_0x00b1:
            int r1 = r23 + r15
            r8[r1] = r4
            if (r18 == 0) goto L_0x00de
            int r0 = r19 - r6
            int r0 = r0 + 1
            if (r15 < r0) goto L_0x00de
            int r0 = r19 + r6
            int r0 = r0 - r11
            if (r15 > r0) goto L_0x00de
            r2 = r8[r1]
            r1 = r7[r1]
            if (r2 < r1) goto L_0x00de
            X.0Or r3 = new X.0Or
            r3.<init>()
            r3.A01 = r1
            int r0 = r1 - r15
            r3.A02 = r0
            int r2 = r2 - r1
            r3.A00 = r2
            r0 = r16
            r3.A03 = r0
            r0 = 0
            r3.A04 = r0
            goto L_0x0147
        L_0x00de:
            int r15 = r15 + 2
            goto L_0x007d
        L_0x00e1:
            int r0 = r23 + r15
            int r0 = r0 - r11
            r0 = r8[r0]
            int r4 = r0 + 1
            r16 = 1
            goto L_0x0097
        L_0x00eb:
            r3 = r5
        L_0x00ec:
            if (r3 > r6) goto L_0x01bf
            int r15 = r3 + r19
            int r0 = r6 + r19
            if (r15 == r0) goto L_0x0104
            int r0 = r5 + r19
            if (r15 == r0) goto L_0x01b4
            int r2 = r23 + r15
            int r0 = r2 + -1
            r1 = r7[r0]
            int r0 = r2 + 1
            r0 = r7[r0]
            if (r1 >= r0) goto L_0x01b4
        L_0x0104:
            int r0 = r23 + r15
            int r0 = r0 - r11
            r16 = r7[r0]
            r4 = 0
        L_0x010a:
            int r17 = r16 - r15
        L_0x010c:
            if (r16 <= 0) goto L_0x0125
            if (r17 <= 0) goto L_0x0125
            int r0 = r21 + r16
            int r2 = r0 + -1
            int r0 = r14 + r17
            int r1 = r0 + -1
            r0 = r25
            boolean r0 = r0.A04(r2, r1)
            if (r0 == 0) goto L_0x0125
            int r16 = r16 + -1
            int r17 = r17 + -1
            goto L_0x010c
        L_0x0125:
            int r0 = r23 + r15
            r7[r0] = r16
            if (r18 != 0) goto L_0x01b0
            if (r15 < r5) goto L_0x01b0
            if (r15 > r6) goto L_0x01b0
            r1 = r8[r0]
            r0 = r7[r0]
            if (r1 < r0) goto L_0x01b0
            X.0Or r3 = new X.0Or
            r3.<init>()
            r3.A01 = r0
            int r2 = r0 - r15
            r3.A02 = r2
            int r1 = r1 - r0
            r3.A00 = r1
            r3.A03 = r4
            r3.A04 = r11
        L_0x0147:
            int r4 = r3.A00
            if (r4 <= 0) goto L_0x0150
            r0 = r24
            r0.add(r3)
        L_0x0150:
            int r5 = r3.A01
            int r12 = r9.A03
            int r5 = r5 + r12
            r3.A01 = r5
            int r2 = r3.A02
            int r6 = r9.A01
            int r2 = r2 + r6
            r3.A02 = r2
            boolean r0 = r22.isEmpty()
            if (r0 == 0) goto L_0x01a1
            X.0U7 r0 = new X.0U7
            r0.<init>()
        L_0x0169:
            r0.A03 = r12
            r0.A01 = r6
            boolean r6 = r3.A04
            if (r6 == 0) goto L_0x0195
            r1 = r5
        L_0x0172:
            r0.A02 = r1
            r1 = r2
        L_0x0175:
            r0.A00 = r1
            r10.add(r0)
            if (r6 == 0) goto L_0x0193
            boolean r0 = r3.A03
            int r5 = r5 + r4
            if (r0 == 0) goto L_0x018d
            int r5 = r5 + 1
        L_0x0183:
            r9.A03 = r5
            int r2 = r2 + r4
        L_0x0186:
            r9.A01 = r2
            r10.add(r9)
            goto L_0x002f
        L_0x018d:
            r9.A03 = r5
            int r2 = r2 + r4
            int r2 = r2 + 1
            goto L_0x0186
        L_0x0193:
            int r5 = r5 + r4
            goto L_0x0183
        L_0x0195:
            boolean r1 = r3.A03
            if (r1 == 0) goto L_0x019c
            int r1 = r5 + -1
            goto L_0x0172
        L_0x019c:
            r0.A02 = r5
            int r1 = r2 + -1
            goto L_0x0175
        L_0x01a1:
            int r0 = r22.size()
            int r1 = r0 + -1
            r0 = r22
            java.lang.Object r0 = r0.remove(r1)
            X.0U7 r0 = (X.AnonymousClass0U7) r0
            goto L_0x0169
        L_0x01b0:
            int r3 = r3 + 2
            goto L_0x00ec
        L_0x01b4:
            int r0 = r23 + r15
            int r0 = r0 + 1
            r16 = r7[r0]
            int r16 = r16 - r11
            r4 = 1
            goto L_0x010a
        L_0x01bf:
            int r6 = r6 + 1
            goto L_0x0079
        L_0x01c3:
            r0 = r22
            r0.add(r9)
            goto L_0x002f
        L_0x01ca:
            java.lang.String r1 = "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01d2:
            java.util.Comparator r1 = A00
            r0 = r24
            java.util.Collections.sort(r0, r1)
            X.07C r2 = new X.07C
            r1 = r25
            r2.<init>(r1, r0, r8, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass07B.A00(X.07A):X.07C");
    }
}

package X;

import java.util.List;

/* renamed from: X.4bM  reason: invalid class name and case insensitive filesystem */
public class C88954bM {
    public boolean A00;
    public final C1043054u A01;
    public final List A02 = AnonymousClass000.A0u();
    public final int[] A03 = new int[5];

    public C88954bM(C1043054u r2) {
        this.A01 = r2;
    }

    public static boolean A00(int[] iArr) {
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = iArr[i2];
            if (i4 == 0) {
                break;
            }
            i3 += i4;
            i2++;
            if (i2 >= 5) {
                if (i3 >= 7) {
                    float f2 = ((float) i3) / 7.0f;
                    float f3 = f2 / 2.0f;
                    return AnonymousClass3K3.A04(iArr, f2, 0) < f3 && AnonymousClass3K3.A04(iArr, f2, 1) < f3 && AnonymousClass3K3.A04(iArr, f2 * 3.0f, 2) < 3.0f * f3 && AnonymousClass3K3.A04(iArr, f2, 3) < f3 && AnonymousClass3K3.A04(iArr, f2, 4) < f3;
                }
            }
        }
    }

    public final boolean A01() {
        List<C69743fX> list = this.A02;
        int size = list.size();
        float f2 = 0.0f;
        int i2 = 0;
        float f3 = 0.0f;
        for (C69743fX r2 : list) {
            if (r2.A01 >= 2) {
                i2++;
                f3 += r2.A00;
            }
        }
        if (i2 >= 3) {
            float f4 = f3 / ((float) size);
            for (C69743fX r0 : list) {
                f2 += AnonymousClass3K4.A01(r0.A00, f4);
            }
            if (f2 <= f3 * 0.05f) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (r5[1] <= r1) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        r2 = Float.NaN;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006e, code lost:
        if (r7.A03(r9, r2) == false) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0070, code lost:
        r0 = r5[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0072, code lost:
        if (r0 > r1) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        r5[0] = r0 + 1;
        r2 = r2 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007a, code lost:
        if (r2 < 0) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007f, code lost:
        if (r5[0] <= r1) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0082, code lost:
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0084, code lost:
        if (r14 >= r6) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008a, code lost:
        if (r7.A03(r9, r14) == false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008c, code lost:
        X.AnonymousClass3K4.A17(r5, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0090, code lost:
        if (r14 != r6) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0094, code lost:
        if (r14 >= r6) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009a, code lost:
        if (r7.A03(r9, r14) != false) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009c, code lost:
        r0 = r5[3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009e, code lost:
        if (r0 >= r1) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a0, code lost:
        r5[3] = r0 + 1;
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a7, code lost:
        if (r14 == r6) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ab, code lost:
        if (r5[3] < r1) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00af, code lost:
        if (r14 >= r6) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b5, code lost:
        if (r7.A03(r9, r14) == false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b7, code lost:
        r0 = r5[4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b9, code lost:
        if (r0 >= r1) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00bb, code lost:
        r5[4] = r0 + 1;
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c2, code lost:
        r3 = r5[4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c4, code lost:
        if (r3 >= r1) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c6, code lost:
        r2 = r5[2];
        r1 = r5[3];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00da, code lost:
        if ((X.AnonymousClass000.A09((((r5[0] + r5[1]) + r2) + r1) + r3, r12) * 5) >= (r12 << 1)) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e0, code lost:
        if (A00(r5) == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e2, code lost:
        r2 = X.AnonymousClass3K4.A02(r14 - r3, r1, r2);
     */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0149 A[LOOP:13: B:95:0x0149->B:101:0x0157, LOOP_START, PHI: r9 
      PHI: (r9v7 int) = (r9v6 int), (r9v11 int) binds: [B:94:0x0146, B:101:0x0157] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(int[] r20, int r21, int r22) {
        /*
            r19 = this;
            r14 = r21
            r13 = 0
            r12 = r20[r13]
            r11 = 1
            r0 = r20[r11]
            int r12 = r12 + r0
            r10 = 2
            r1 = r20[r10]
            int r12 = r12 + r1
            r0 = 3
            r2 = r20[r0]
            int r12 = r12 + r2
            r0 = 4
            r0 = r20[r0]
            int r12 = r12 + r0
            int r3 = r22 - r0
            float r0 = X.AnonymousClass3K4.A02(r3, r2, r1)
            int r9 = (int) r0
            r8 = r19
            X.54u r7 = r8.A01
            int r6 = r7.A00
            int[] r5 = r8.A03
            r0 = 0
        L_0x0025:
            int r4 = r5.length
            if (r0 >= r4) goto L_0x002d
            r5[r0] = r13
            int r0 = r0 + 1
            goto L_0x0025
        L_0x002d:
            r2 = r14
        L_0x002e:
            r18 = 1
            if (r2 < 0) goto L_0x0055
            boolean r0 = r7.A03(r9, r2)
            if (r0 == 0) goto L_0x003e
            X.AnonymousClass3K4.A17(r5, r10)
            int r2 = r2 + -1
            goto L_0x002e
        L_0x003e:
            boolean r0 = r7.A03(r9, r2)
            if (r0 != 0) goto L_0x0051
            r0 = r5[r11]
            if (r0 > r1) goto L_0x0051
            int r0 = r0 + 1
            r5[r11] = r0
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0055
            goto L_0x003e
        L_0x0051:
            r0 = r5[r11]
            if (r0 <= r1) goto L_0x006a
        L_0x0055:
            r2 = 2143289344(0x7fc00000, float:NaN)
        L_0x0057:
            boolean r0 = java.lang.Float.isNaN(r2)
            if (r0 != 0) goto L_0x01bb
            int r3 = (int) r2
            r1 = r20[r10]
            int r14 = r7.A02
            r0 = 0
        L_0x0063:
            if (r0 >= r4) goto L_0x00e9
            r5[r0] = r13
            int r0 = r0 + 1
            goto L_0x0063
        L_0x006a:
            boolean r0 = r7.A03(r9, r2)
            if (r0 == 0) goto L_0x007d
            r0 = r5[r13]
            if (r0 > r1) goto L_0x007d
            int r0 = r0 + 1
            r5[r13] = r0
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x007d
            goto L_0x006a
        L_0x007d:
            r0 = r5[r13]
            if (r0 <= r1) goto L_0x0082
            goto L_0x0055
        L_0x0082:
            int r14 = r14 + 1
            if (r14 >= r6) goto L_0x0090
            boolean r0 = r7.A03(r9, r14)
            if (r0 == 0) goto L_0x0090
            X.AnonymousClass3K4.A17(r5, r10)
            goto L_0x0082
        L_0x0090:
            if (r14 != r6) goto L_0x0093
            goto L_0x0055
        L_0x0093:
            r15 = 3
            if (r14 >= r6) goto L_0x00a7
            boolean r0 = r7.A03(r9, r14)
            if (r0 != 0) goto L_0x00a7
            r0 = r5[r15]
            if (r0 >= r1) goto L_0x00a7
            int r0 = r0 + 1
            r5[r15] = r0
            int r14 = r14 + 1
            goto L_0x0093
        L_0x00a7:
            if (r14 == r6) goto L_0x0055
            r0 = r5[r15]
            if (r0 < r1) goto L_0x00ae
            goto L_0x0055
        L_0x00ae:
            r2 = 4
            if (r14 >= r6) goto L_0x00c2
            boolean r0 = r7.A03(r9, r14)
            if (r0 == 0) goto L_0x00c2
            r0 = r5[r2]
            if (r0 >= r1) goto L_0x00c2
            int r0 = r0 + 1
            r5[r2] = r0
            int r14 = r14 + 1
            goto L_0x00ae
        L_0x00c2:
            r3 = r5[r2]
            if (r3 >= r1) goto L_0x0055
            r0 = r5[r13]
            r1 = r5[r11]
            int r0 = r0 + r1
            r2 = r5[r10]
            int r0 = r0 + r2
            r1 = r5[r15]
            int r0 = r0 + r1
            int r0 = r0 + r3
            int r0 = X.AnonymousClass000.A09(r0, r12)
            int r15 = r0 * 5
            int r0 = r12 << 1
            if (r15 >= r0) goto L_0x0055
            boolean r0 = A00(r5)
            if (r0 == 0) goto L_0x0055
            int r14 = r14 - r3
            float r2 = X.AnonymousClass3K4.A02(r14, r1, r2)
            goto L_0x0057
        L_0x00e9:
            r15 = r9
        L_0x00ea:
            if (r15 < 0) goto L_0x010f
            boolean r0 = r7.A03(r15, r3)
            if (r0 == 0) goto L_0x00f8
            X.AnonymousClass3K4.A17(r5, r10)
            int r15 = r15 + -1
            goto L_0x00ea
        L_0x00f8:
            boolean r0 = r7.A03(r15, r3)
            if (r0 != 0) goto L_0x010b
            r0 = r5[r11]
            if (r0 > r1) goto L_0x010b
            int r0 = r0 + 1
            r5[r11] = r0
            int r15 = r15 + -1
            if (r15 < 0) goto L_0x010f
            goto L_0x00f8
        L_0x010b:
            r0 = r5[r11]
            if (r0 <= r1) goto L_0x0120
        L_0x010f:
            r1 = 2143289344(0x7fc00000, float:NaN)
        L_0x0111:
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 != 0) goto L_0x01bb
            int r9 = (int) r1
            r0 = 0
        L_0x0119:
            if (r0 >= r4) goto L_0x01a2
            r5[r0] = r13
            int r0 = r0 + 1
            goto L_0x0119
        L_0x0120:
            boolean r0 = r7.A03(r15, r3)
            if (r0 == 0) goto L_0x0133
            r0 = r5[r13]
            if (r0 > r1) goto L_0x0133
            int r0 = r0 + 1
            r5[r13] = r0
            int r15 = r15 + -1
            if (r15 < 0) goto L_0x0133
            goto L_0x0120
        L_0x0133:
            r0 = r5[r13]
            if (r0 <= r1) goto L_0x0138
            goto L_0x010f
        L_0x0138:
            int r9 = r9 + 1
            if (r9 >= r14) goto L_0x0146
            boolean r0 = r7.A03(r9, r3)
            if (r0 == 0) goto L_0x0146
            X.AnonymousClass3K4.A17(r5, r10)
            goto L_0x0138
        L_0x0146:
            if (r9 != r14) goto L_0x0149
            goto L_0x010f
        L_0x0149:
            r17 = 3
            if (r9 >= r14) goto L_0x015e
            boolean r0 = r7.A03(r9, r3)
            if (r0 != 0) goto L_0x015e
            r0 = r5[r17]
            if (r0 >= r1) goto L_0x015e
            int r0 = r0 + 1
            r5[r17] = r0
            int r9 = r9 + 1
            goto L_0x0149
        L_0x015e:
            if (r9 == r14) goto L_0x010f
            r0 = r5[r17]
            if (r0 < r1) goto L_0x0165
            goto L_0x010f
        L_0x0165:
            r15 = 4
            if (r9 >= r14) goto L_0x0179
            boolean r0 = r7.A03(r9, r3)
            if (r0 == 0) goto L_0x0179
            r0 = r5[r15]
            if (r0 >= r1) goto L_0x0179
            int r0 = r0 + 1
            r5[r15] = r0
            int r9 = r9 + 1
            goto L_0x0165
        L_0x0179:
            r16 = r5[r15]
            r0 = r16
            if (r0 >= r1) goto L_0x010f
            r0 = r5[r13]
            r1 = r5[r11]
            int r0 = r0 + r1
            r15 = r5[r10]
            int r0 = r0 + r15
            r1 = r5[r17]
            int r0 = r0 + r1
            int r0 = r0 + r16
            int r0 = X.AnonymousClass000.A09(r0, r12)
            int r0 = r0 * 5
            if (r0 >= r12) goto L_0x010f
            boolean r0 = A00(r5)
            if (r0 == 0) goto L_0x010f
            int r9 = r9 - r16
            float r1 = X.AnonymousClass3K4.A02(r9, r1, r15)
            goto L_0x0111
        L_0x01a2:
            r4 = 0
        L_0x01a3:
            if (r3 < r4) goto L_0x01b7
            if (r9 < r4) goto L_0x01b7
            int r15 = r9 - r4
            int r0 = r3 - r4
            boolean r0 = r7.A03(r15, r0)
            if (r0 == 0) goto L_0x01b7
            X.AnonymousClass3K4.A17(r5, r10)
            int r4 = r4 + 1
            goto L_0x01a3
        L_0x01b7:
            r0 = r5[r10]
            if (r0 != 0) goto L_0x01bc
        L_0x01bb:
            return r13
        L_0x01bc:
            if (r3 < r4) goto L_0x01d0
            if (r9 < r4) goto L_0x01d0
            int r15 = r9 - r4
            int r0 = r3 - r4
            boolean r0 = r7.A03(r15, r0)
            if (r0 != 0) goto L_0x01d0
            X.AnonymousClass3K4.A17(r5, r11)
            int r4 = r4 + 1
            goto L_0x01bc
        L_0x01d0:
            r0 = r5[r11]
            if (r0 != 0) goto L_0x01d5
            return r13
        L_0x01d5:
            if (r3 < r4) goto L_0x01e9
            if (r9 < r4) goto L_0x01e9
            int r15 = r9 - r4
            int r0 = r3 - r4
            boolean r0 = r7.A03(r15, r0)
            if (r0 == 0) goto L_0x01e9
            X.AnonymousClass3K4.A17(r5, r13)
            int r4 = r4 + 1
            goto L_0x01d5
        L_0x01e9:
            r0 = r5[r13]
            if (r0 != 0) goto L_0x01ee
            return r13
        L_0x01ee:
            int r4 = r3 + r18
            if (r4 >= r6) goto L_0x0202
            int r0 = r9 + r18
            if (r0 >= r14) goto L_0x0202
            boolean r0 = r7.A03(r0, r4)
            if (r0 == 0) goto L_0x0202
            X.AnonymousClass3K4.A17(r5, r10)
            int r18 = r18 + 1
            goto L_0x01ee
        L_0x0202:
            int r15 = r3 + r18
            r4 = 3
            if (r15 >= r6) goto L_0x0217
            int r0 = r9 + r18
            if (r0 >= r14) goto L_0x0217
            boolean r0 = r7.A03(r0, r15)
            if (r0 != 0) goto L_0x0217
            X.AnonymousClass3K4.A17(r5, r4)
            int r18 = r18 + 1
            goto L_0x0202
        L_0x0217:
            r0 = r5[r4]
            if (r0 != 0) goto L_0x021c
            return r13
        L_0x021c:
            int r15 = r3 + r18
            r4 = 4
            if (r15 >= r6) goto L_0x0231
            int r0 = r9 + r18
            if (r0 >= r14) goto L_0x0231
            boolean r0 = r7.A03(r0, r15)
            if (r0 == 0) goto L_0x0231
            X.AnonymousClass3K4.A17(r5, r4)
            int r18 = r18 + 1
            goto L_0x021c
        L_0x0231:
            r4 = r5[r4]
            if (r4 == 0) goto L_0x01bb
            r6 = 0
            r3 = 0
        L_0x0237:
            r0 = r5[r6]
            if (r0 == 0) goto L_0x01bb
            int r3 = r3 + r0
            int r6 = r6 + 1
            r0 = 5
            if (r6 < r0) goto L_0x0237
            r0 = 7
            if (r3 < r0) goto L_0x01bb
            float r3 = (float) r3
            r0 = 1088421888(0x40e00000, float:7.0)
            float r3 = r3 / r0
            r0 = 1068146622(0x3faa9fbe, float:1.333)
            float r7 = r3 / r0
            float r0 = X.AnonymousClass3K3.A04(r5, r3, r13)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x01bb
            float r0 = X.AnonymousClass3K3.A04(r5, r3, r11)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x01bb
            r6 = 1077936128(0x40400000, float:3.0)
            float r0 = r3 * r6
            float r0 = X.AnonymousClass3K3.A04(r5, r0, r10)
            float r6 = r6 * r7
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x01bb
            r0 = 3
            float r0 = X.AnonymousClass3K3.A04(r5, r3, r0)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x01bb
            float r0 = (float) r4
            float r0 = X.AnonymousClass3K4.A01(r3, r0)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x01bb
            float r10 = (float) r12
            r0 = 1088421888(0x40e00000, float:7.0)
            float r10 = r10 / r0
            r9 = 0
        L_0x0281:
            java.util.List r7 = r8.A02
            int r0 = r7.size()
            if (r9 >= r0) goto L_0x02d6
            java.lang.Object r12 = r7.get(r9)
            X.3fX r12 = (X.C69743fX) r12
            float r0 = r12.A01
            float r0 = X.AnonymousClass3K4.A01(r2, r0)
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x02d3
            float r0 = r12.A00
            float r0 = X.AnonymousClass3K4.A01(r1, r0)
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x02d3
            float r4 = r12.A00
            float r3 = X.AnonymousClass3K4.A01(r10, r4)
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x02b3
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x02d3
        L_0x02b3:
            int r0 = r12.A01
            int r6 = r0 + 1
            float r5 = (float) r0
            float r0 = r12.A00
            float r4 = r5 * r0
            float r4 = r4 + r1
            float r3 = (float) r6
            float r4 = r4 / r3
            float r0 = r12.A01
            float r1 = r5 * r0
            float r1 = r1 + r2
            float r1 = r1 / r3
            float r0 = r12.A00
            float r5 = r5 * r0
            float r5 = r5 + r10
            float r5 = r5 / r3
            X.3fX r0 = new X.3fX
            r0.<init>(r4, r1, r5, r6)
            r7.set(r9, r0)
            return r11
        L_0x02d3:
            int r9 = r9 + 1
            goto L_0x0281
        L_0x02d6:
            X.3fX r0 = new X.3fX
            r0.<init>(r1, r2, r10, r11)
            r7.add(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C88954bM.A02(int[], int, int):boolean");
    }
}

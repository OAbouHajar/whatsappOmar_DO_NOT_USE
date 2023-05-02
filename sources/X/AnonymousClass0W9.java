package X;

import android.graphics.Color;
import com.facebook.redex.IDxComparatorShape18S0000000_I1;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.0W9  reason: invalid class name */
public final class AnonymousClass0W9 {
    public static final Comparator A05 = new IDxComparatorShape18S0000000_I1(1);
    public final List A00;
    public final float[] A01 = new float[3];
    public final int[] A02;
    public final int[] A03;
    public final C11930jZ[] A04;

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0137, code lost:
        if (r2 < r1) goto L_0x0139;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0W9(int[] r14, X.C11930jZ[] r15) {
        /*
            r13 = this;
            r7 = 16
            r13.<init>()
            r0 = 3
            float[] r0 = new float[r0]
            r13.A01 = r0
            r13.A04 = r15
            r4 = 32768(0x8000, float:4.5918E-41)
            int[] r8 = new int[r4]
            r13.A03 = r8
            r3 = 0
            r6 = 0
        L_0x0015:
            int r0 = r14.length
            if (r6 >= r0) goto L_0x0044
            r2 = r14[r6]
            int r9 = android.graphics.Color.red(r2)
            r1 = 5
            r0 = 3
            int r9 = r9 >> r0
            r0 = 1
            int r1 = r0 << r1
            int r1 = r1 - r0
            r9 = r9 & r1
            int r5 = android.graphics.Color.green(r2)
            r0 = 3
            int r5 = r5 >> r0
            r5 = r5 & r1
            int r2 = android.graphics.Color.blue(r2)
            int r2 = r2 >> r0
            r2 = r2 & r1
            int r1 = r9 << 10
            int r0 = r5 << 5
            r1 = r1 | r0
            r2 = r2 | r1
            r14[r6] = r2
            r0 = r8[r2]
            int r0 = r0 + 1
            r8[r2] = r0
            int r6 = r6 + 1
            goto L_0x0015
        L_0x0044:
            r6 = 0
            r9 = 0
        L_0x0046:
            r0 = r8[r6]
            if (r0 <= 0) goto L_0x0071
            int r0 = r6 >> 10
            r2 = r0 & 31
            int r0 = r6 >> 5
            r1 = r0 & 31
            r0 = r6 & 31
            int r0 = A00(r2, r1, r0)
            float[] r5 = r13.A01
            int r2 = android.graphics.Color.red(r0)
            int r1 = android.graphics.Color.green(r0)
            int r0 = android.graphics.Color.blue(r0)
            X.AnonymousClass090.A07(r2, r1, r5, r0)
            boolean r0 = r13.A02(r5)
            if (r0 == 0) goto L_0x0071
            r8[r6] = r3
        L_0x0071:
            r0 = r8[r6]
            if (r0 <= 0) goto L_0x0077
            int r9 = r9 + 1
        L_0x0077:
            int r6 = r6 + 1
            if (r6 < r4) goto L_0x0046
            int[] r6 = new int[r9]
            r13.A02 = r6
            r2 = 0
            r1 = 0
        L_0x0081:
            r0 = r8[r2]
            if (r0 <= 0) goto L_0x008a
            int r0 = r1 + 1
            r6[r1] = r2
            r1 = r0
        L_0x008a:
            int r2 = r2 + 1
            if (r2 < r4) goto L_0x0081
            if (r9 > r7) goto L_0x00b7
            java.util.ArrayList r0 = X.AnonymousClass000.A0u()
            r13.A00 = r0
        L_0x0096:
            if (r3 >= r9) goto L_0x01a8
            r5 = r6[r3]
            java.util.List r4 = r13.A00
            int r0 = r5 >> 10
            r2 = r0 & 31
            int r0 = r5 >> 5
            r1 = r0 & 31
            r0 = r5 & 31
            int r2 = A00(r2, r1, r0)
            r1 = r8[r5]
            X.0S5 r0 = new X.0S5
            r0.<init>(r2, r1)
            r4.add(r0)
            int r3 = r3 + 1
            goto L_0x0096
        L_0x00b7:
            java.util.Comparator r0 = A05
            java.util.PriorityQueue r6 = new java.util.PriorityQueue
            r6.<init>(r7, r0)
            int[] r0 = r13.A02
            int r0 = r0.length
            int r1 = r0 + -1
            X.0Q3 r0 = new X.0Q3
            r0.<init>(r13, r3, r1)
            r6.offer(r0)
        L_0x00cb:
            int r0 = r6.size()
            if (r0 >= r7) goto L_0x013b
            java.lang.Object r9 = r6.poll()
            X.0Q3 r9 = (X.AnonymousClass0Q3) r9
            if (r9 == 0) goto L_0x013b
            int r12 = r9.A08
            int r3 = r12 + 1
            int r11 = r9.A00
            int r1 = r3 - r11
            r0 = 1
            if (r1 <= r0) goto L_0x013b
            r10 = r11
            int r4 = r9.A03
            int r0 = r9.A06
            int r4 = r4 - r0
            int r2 = r9.A02
            int r0 = r9.A05
            int r2 = r2 - r0
            int r1 = r9.A01
            int r0 = r9.A04
            int r1 = r1 - r0
            if (r4 < r2) goto L_0x0134
            if (r4 < r1) goto L_0x0134
            r0 = -3
        L_0x00f9:
            X.0W9 r8 = r9.A09
            int[] r5 = r8.A02
            int[] r4 = r8.A03
            A01(r5, r0, r11, r12)
            java.util.Arrays.sort(r5, r11, r3)
            int r3 = r9.A08
            A01(r5, r0, r11, r3)
            int r0 = r9.A07
            int r2 = r0 >> 1
            r1 = 0
        L_0x010f:
            if (r11 > r3) goto L_0x011e
            r0 = r5[r11]
            r0 = r4[r0]
            int r1 = r1 + r0
            if (r1 < r2) goto L_0x0131
            int r0 = r3 + -1
            int r10 = java.lang.Math.min(r0, r11)
        L_0x011e:
            int r1 = r10 + 1
            X.0Q3 r0 = new X.0Q3
            r0.<init>(r8, r1, r3)
            r9.A08 = r10
            r9.A00()
            r6.offer(r0)
            r6.offer(r9)
            goto L_0x00cb
        L_0x0131:
            int r11 = r11 + 1
            goto L_0x010f
        L_0x0134:
            if (r2 < r4) goto L_0x0139
            r0 = -2
            if (r2 >= r1) goto L_0x00f9
        L_0x0139:
            r0 = -1
            goto L_0x00f9
        L_0x013b:
            int r0 = r6.size()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r12 = r6.iterator()
        L_0x0148:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01a6
            java.lang.Object r10 = r12.next()
            X.0Q3 r10 = (X.AnonymousClass0Q3) r10
            X.0W9 r0 = r10.A09
            int[] r9 = r0.A02
            int[] r8 = r0.A03
            int r3 = r10.A00
            r2 = 0
            r5 = 0
            r7 = 0
            r6 = 0
        L_0x0160:
            int r0 = r10.A08
            if (r3 > r0) goto L_0x017c
            r11 = r9[r3]
            r1 = r8[r11]
            int r5 = r5 + r1
            int r0 = r11 >> 10
            r0 = r0 & 31
            int r0 = r0 * r1
            int r2 = r2 + r0
            int r0 = r11 >> 5
            r0 = r0 & 31
            int r0 = r0 * r1
            int r7 = r7 + r0
            r0 = r11 & 31
            int r1 = r1 * r0
            int r6 = r6 + r1
            int r3 = r3 + 1
            goto L_0x0160
        L_0x017c:
            float r0 = (float) r2
            float r3 = (float) r5
            float r0 = r0 / r3
            int r2 = java.lang.Math.round(r0)
            float r0 = (float) r7
            float r0 = r0 / r3
            int r1 = java.lang.Math.round(r0)
            float r0 = (float) r6
            float r0 = r0 / r3
            int r0 = java.lang.Math.round(r0)
            int r0 = A00(r2, r1, r0)
            X.0S5 r1 = new X.0S5
            r1.<init>(r0, r5)
            float[] r0 = r1.A01()
            boolean r0 = r13.A02(r0)
            if (r0 != 0) goto L_0x0148
            r4.add(r1)
            goto L_0x0148
        L_0x01a6:
            r13.A00 = r4
        L_0x01a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0W9.<init>(int[], X.0jZ[]):void");
    }

    public static int A00(int i2, int i3, int i4) {
        int i5 = (1 << 8) - 1;
        return Color.rgb((i2 << 3) & i5, (i3 << 3) & i5, (i4 << 3) & i5);
    }

    public static void A01(int[] iArr, int i2, int i3, int i4) {
        if (i2 == -2) {
            while (i3 <= i4) {
                int i5 = iArr[i3];
                iArr[i3] = (i5 & 31) | (((i5 >> 5) & 31) << 10) | (((i5 >> 10) & 31) << 5);
                i3++;
            }
        } else if (i2 == -1) {
            while (i3 <= i4) {
                int i6 = iArr[i3];
                iArr[i3] = ((i6 >> 10) & 31) | ((i6 & 31) << 10) | (((i6 >> 5) & 31) << 5);
                i3++;
            }
        }
    }

    public final boolean A02(float[] fArr) {
        C11930jZ[] r0 = this.A04;
        if (r0 == null || r0.length <= 0) {
            return false;
        }
        int i2 = (fArr[2] > 0.95f ? 1 : (fArr[2] == 0.95f ? 0 : -1));
        return true;
    }
}

package X;

import android.support.v4.view.MotionEventCompat;
import java.util.Arrays;

/* renamed from: X.4X8  reason: invalid class name */
public final class AnonymousClass4X8 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public short[] A0A;
    public short[] A0B;
    public short[] A0C;
    public final float A0D;
    public final float A0E;
    public final float A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final short[] A0L;

    public AnonymousClass4X8(float f2, float f3, int i2, int i3, int i4) {
        this.A0H = i2;
        this.A0G = i3;
        this.A0F = f2;
        this.A0D = f3;
        this.A0E = ((float) i2) / ((float) i4);
        this.A0K = i2 / 400;
        int i5 = i2 / 65;
        this.A0I = i5;
        int i6 = i5 << 1;
        this.A0J = i6;
        this.A0L = new short[i6];
        int i7 = i6 * i3;
        this.A0A = new short[i7];
        this.A0B = new short[i7];
        this.A0C = new short[i7];
    }

    public final int A00(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * this.A0G;
        int i6 = 1;
        int i7 = MotionEventCompat.ACTION_MASK;
        int i8 = 0;
        int i9 = 0;
        while (i3 <= i4) {
            int i10 = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                i10 += AnonymousClass000.A09(sArr[i5 + i11], sArr[i5 + i3 + i11]);
            }
            if (i10 * i8 < i6 * i3) {
                i8 = i3;
                i6 = i10;
            }
            if (i10 * i7 > i9 * i3) {
                i7 = i3;
                i9 = i10;
            }
            i3++;
        }
        this.A02 = i6 / i8;
        this.A01 = i9 / i7;
        return i8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r25 = this;
            r4 = r25
            int r3 = r4.A05
            float r0 = r4.A0F
            float r1 = r4.A0D
            float r23 = r0 / r1
            float r0 = r4.A0E
            float r22 = r0 * r1
            r0 = r23
            double r1 = (double) r0
            r5 = 4607182463836013682(0x3ff0000a7c5ac472, double:1.00001)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x00e1
            r5 = 4607182328728024861(0x3fefffeb074a771d, double:0.99999)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00e1
            short[] r2 = r4.A0A
            int r1 = r4.A00
            r0 = 0
            r4.A02(r2, r0, r1)
            r4.A00 = r0
        L_0x002d:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r22 > r0 ? 1 : (r22 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x007e
            int r8 = r4.A05
            if (r8 == r3) goto L_0x007e
            int r10 = r4.A0H
            float r0 = (float) r10
            float r0 = r0 / r22
            int r9 = (int) r0
        L_0x003d:
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r9 > r0) goto L_0x00db
            if (r10 > r0) goto L_0x00db
            int r8 = r8 - r3
            short[] r1 = r4.A0C
            int r0 = r4.A06
            short[] r6 = r4.A04(r1, r0, r8)
            r4.A0C = r6
            short[] r5 = r4.A0B
            int r7 = r4.A0G
            int r2 = r3 * r7
            int r1 = r4.A06
            int r1 = r1 * r7
            int r0 = r7 * r8
            java.lang.System.arraycopy(r5, r2, r6, r1, r0)
            r4.A05 = r3
            int r0 = r4.A06
            int r0 = r0 + r8
            r4.A06 = r0
            r6 = 0
            r8 = 0
        L_0x0065:
            int r11 = r4.A06
            int r0 = r11 + -1
            r5 = 1
            if (r8 < r0) goto L_0x007f
            int r2 = r11 - r5
            if (r2 == 0) goto L_0x007e
            short[] r1 = r4.A0C
            int r0 = r2 * r7
            int r11 = r11 - r2
            int r11 = r11 * r7
            java.lang.System.arraycopy(r1, r0, r1, r6, r11)
            int r0 = r4.A06
            int r0 = r0 - r2
            r4.A06 = r0
        L_0x007e:
            return
        L_0x007f:
            int r0 = r4.A04
            int r11 = r0 + 1
            int r2 = r11 * r9
            int r1 = r4.A03
            int r0 = r1 * r10
            if (r2 <= r0) goto L_0x00ca
            short[] r0 = r4.A0B
            short[] r12 = r4.A04(r0, r3, r5)
            r4.A0B = r12
            r11 = 0
        L_0x0094:
            if (r11 >= r7) goto L_0x00bd
            int r3 = r4.A05
            int r3 = r3 * r7
            int r3 = r3 + r11
            short[] r1 = r4.A0C
            int r0 = r7 * r8
            int r0 = r0 + r11
            short r13 = r1[r0]
            int r0 = r0 + r7
            short r15 = r1[r0]
            int r14 = r4.A03
            int r14 = r14 * r10
            int r0 = r4.A04
            int r2 = r0 * r9
            int r1 = r0 + 1
            int r1 = r1 * r9
            int r0 = r1 - r14
            int r1 = r1 - r2
            int r13 = r13 * r0
            int r0 = r1 - r0
            int r0 = r0 * r15
            int r13 = r13 + r0
            int r13 = r13 / r1
            short r0 = (short) r13
            r12[r3] = r0
            int r11 = r11 + 1
            goto L_0x0094
        L_0x00bd:
            int r0 = r4.A03
            int r0 = r0 + 1
            r4.A03 = r0
            int r0 = r4.A05
            int r3 = r0 + 1
            r4.A05 = r3
            goto L_0x007f
        L_0x00ca:
            r4.A04 = r11
            if (r11 != r10) goto L_0x00d8
            r4.A04 = r6
            if (r1 == r9) goto L_0x00d3
            r5 = 0
        L_0x00d3:
            X.C90524eJ.A04(r5)
            r4.A03 = r6
        L_0x00d8:
            int r8 = r8 + 1
            goto L_0x0065
        L_0x00db:
            int r9 = r9 >> 1
            int r10 = r10 >> 1
            goto L_0x003d
        L_0x00e1:
            int r0 = r4.A00
            r24 = r0
            int r11 = r4.A0J
            if (r0 < r11) goto L_0x002d
            r12 = 0
        L_0x00ea:
            int r0 = r4.A09
            if (r0 <= 0) goto L_0x0114
            int r5 = java.lang.Math.min(r11, r0)
            short[] r0 = r4.A0A
            r4.A02(r0, r12, r5)
            int r0 = r4.A09
            int r0 = r0 - r5
            r4.A09 = r0
        L_0x00fc:
            int r12 = r12 + r5
            int r5 = r11 + r12
            r0 = r24
            if (r5 <= r0) goto L_0x00ea
            int r5 = r4.A00
            int r5 = r5 - r12
            short[] r2 = r4.A0A
            int r1 = r4.A0G
            int r12 = r12 * r1
            int r1 = r1 * r5
            r0 = 0
            java.lang.System.arraycopy(r2, r12, r2, r0, r1)
            r4.A00 = r5
            goto L_0x002d
        L_0x0114:
            short[] r13 = r4.A0A
            int r15 = r4.A0H
            r0 = 4000(0xfa0, float:5.605E-42)
            r14 = 1
            if (r15 <= r0) goto L_0x01c9
            int r15 = r15 / r0
        L_0x011e:
            int r10 = r4.A0G
            if (r10 != r14) goto L_0x019e
            if (r15 != r14) goto L_0x019e
            int r15 = r4.A0K
            int r9 = r4.A0I
        L_0x0128:
            int r9 = r4.A00(r13, r12, r15, r9)
        L_0x012c:
            int r7 = r4.A02
            int r6 = r4.A01
            if (r7 == 0) goto L_0x0142
            int r5 = r4.A08
            if (r5 == 0) goto L_0x0142
            int r0 = r7 * 3
            if (r6 > r0) goto L_0x0142
            int r6 = r7 << 1
            int r0 = r4.A07
            int r0 = r0 * 3
            if (r6 > r0) goto L_0x0143
        L_0x0142:
            r5 = r9
        L_0x0143:
            r4.A07 = r7
            r4.A08 = r9
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x01d2
            r8 = 1065353216(0x3f800000, float:1.0)
            r7 = 1073741824(0x40000000, float:2.0)
            int r0 = (r23 > r7 ? 1 : (r23 == r7 ? 0 : -1))
            float r6 = (float) r5
            if (r0 < 0) goto L_0x0193
            float r0 = r23 - r8
            float r6 = r6 / r0
            int r14 = (int) r6
        L_0x015a:
            short[] r6 = r4.A0B
            int r0 = r4.A05
            short[] r9 = r4.A04(r6, r0, r14)
            r4.A0B = r9
            int r8 = r4.A05
            int r19 = r12 + r5
            r7 = 0
        L_0x0169:
            if (r7 >= r10) goto L_0x01cc
            int r18 = r8 * r10
            int r18 = r18 + r7
            int r17 = r19 * r10
            int r17 = r17 + r7
            int r16 = r12 * r10
            int r16 = r16 + r7
            r6 = 0
        L_0x0178:
            if (r6 >= r14) goto L_0x0190
            short r15 = r13[r16]
            int r0 = r14 - r6
            int r15 = r15 * r0
            short r0 = r13[r17]
            int r0 = r0 * r6
            int r15 = r15 + r0
            int r15 = r15 / r14
            short r0 = (short) r15
            r9[r18] = r0
            int r18 = r18 + r10
            int r16 = r16 + r10
            int r17 = r17 + r10
            int r6 = r6 + 1
            goto L_0x0178
        L_0x0190:
            int r7 = r7 + 1
            goto L_0x0169
        L_0x0193:
            float r7 = r7 - r23
            float r6 = r6 * r7
            float r0 = r23 - r8
            float r6 = r6 / r0
            int r0 = (int) r6
            r4.A09 = r0
            r14 = r5
            goto L_0x015a
        L_0x019e:
            r4.A03(r13, r12, r15)
            short[] r8 = r4.A0L
            int r7 = r4.A0K
            int r9 = r7 / r15
            int r6 = r4.A0I
            int r0 = r6 / r15
            r5 = 0
            int r9 = r4.A00(r8, r5, r9, r0)
            if (r15 == r14) goto L_0x012c
            int r9 = r9 * r15
            int r0 = r15 << 2
            int r15 = r9 - r0
            int r9 = r9 + r0
            if (r15 >= r7) goto L_0x01bb
            r15 = r7
        L_0x01bb:
            if (r9 <= r6) goto L_0x01be
            r9 = r6
        L_0x01be:
            if (r10 == r14) goto L_0x0128
            r4.A03(r13, r12, r14)
            int r9 = r4.A00(r8, r5, r15, r9)
            goto L_0x012c
        L_0x01c9:
            r15 = 1
            goto L_0x011e
        L_0x01cc:
            int r8 = r8 + r14
            r4.A05 = r8
            int r5 = r5 + r14
            goto L_0x00fc
        L_0x01d2:
            r7 = 1065353216(0x3f800000, float:1.0)
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r23 > r0 ? 1 : (r23 == r0 ? 0 : -1))
            float r6 = (float) r5
            if (r0 >= 0) goto L_0x022b
            float r6 = r6 * r23
            float r7 = r7 - r23
            float r6 = r6 / r7
            int r15 = (int) r6
        L_0x01e1:
            short[] r6 = r4.A0B
            int r0 = r4.A05
            int r14 = r5 + r15
            short[] r7 = r4.A04(r6, r0, r14)
            r4.A0B = r7
            int r9 = r12 * r10
            int r6 = r4.A05
            int r6 = r6 * r10
            int r0 = r10 * r5
            java.lang.System.arraycopy(r13, r9, r7, r6, r0)
            short[] r8 = r4.A0B
            int r7 = r4.A05
            int r21 = r7 + r5
            int r20 = r12 + r5
            r6 = 0
        L_0x0200:
            if (r6 >= r10) goto L_0x0239
            int r19 = r21 * r10
            int r19 = r19 + r6
            int r18 = r9 + r6
            int r17 = r20 * r10
            int r17 = r17 + r6
            r5 = 0
        L_0x020d:
            if (r5 >= r15) goto L_0x0228
            short r0 = r13[r17]
            int r16 = r15 - r5
            int r0 = r0 * r16
            short r16 = r13[r18]
            int r16 = r16 * r5
            int r0 = r0 + r16
            int r0 = r0 / r15
            short r0 = (short) r0
            r8[r19] = r0
            int r19 = r19 + r10
            int r17 = r17 + r10
            int r18 = r18 + r10
            int r5 = r5 + 1
            goto L_0x020d
        L_0x0228:
            int r6 = r6 + 1
            goto L_0x0200
        L_0x022b:
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 * r23
            float r0 = r0 - r7
            float r6 = r6 * r0
            float r7 = r7 - r23
            float r6 = r6 / r7
            int r0 = (int) r6
            r4.A09 = r0
            r15 = r5
            goto L_0x01e1
        L_0x0239:
            int r7 = r7 + r14
            r4.A05 = r7
            r5 = r15
            goto L_0x00fc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4X8.A01():void");
    }

    public final void A02(short[] sArr, int i2, int i3) {
        short[] A042 = A04(this.A0B, this.A05, i3);
        this.A0B = A042;
        int i4 = this.A0G;
        System.arraycopy(sArr, i2 * i4, A042, this.A05 * i4, i4 * i3);
        this.A05 += i3;
    }

    public final void A03(short[] sArr, int i2, int i3) {
        int i4 = this.A0J / i3;
        int i5 = this.A0G;
        int i6 = i3 * i5;
        int i7 = i2 * i5;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i9 += sArr[(i8 * i6) + i7 + i10];
            }
            this.A0L[i8] = (short) (i9 / i6);
        }
    }

    public final short[] A04(short[] sArr, int i2, int i3) {
        int length = sArr.length;
        int i4 = this.A0G;
        int i5 = length / i4;
        return i2 + i3 > i5 ? Arrays.copyOf(sArr, (((i5 * 3) >> 1) + i3) * i4) : sArr;
    }
}

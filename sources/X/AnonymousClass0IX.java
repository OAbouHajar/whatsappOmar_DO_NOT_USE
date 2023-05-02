package X;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import java.util.ArrayList;

/* renamed from: X.0IX  reason: invalid class name */
public abstract class AnonymousClass0IX extends AnonymousClass0VB {
    public static final ArrayList A0C = new ArrayList(5);
    public static final String[] A0D;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public C05290Qb A08 = new C05290Qb();
    public final C05150Pm A09 = new C05150Pm();
    public final AnonymousClass0S2 A0A;
    public final int[] A0B = new int[2];

    static {
        String[] strArr = new String[22];
        A0D = strArr;
        int i2 = 0;
        do {
            strArr[i2] = String.valueOf(i2);
            i2++;
        } while (i2 <= 21);
    }

    public AnonymousClass0IX(AnonymousClass074 r7, AnonymousClass0S2 r8) {
        super(r7);
        this.A0A = r8;
        ActivityManager activityManager = (ActivityManager) r7.A0P.getSystemService("activity");
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            if (!memoryInfo.lowMemory && memoryInfo.availMem >= 500000000 && memoryInfo.totalMem >= 3000000000L) {
                return;
            }
        }
        AnonymousClass0WN.A0D = Bitmap.Config.RGB_565;
    }

    public void A06() {
        super.A06();
        A0F();
    }

    public void A0A(boolean z2) {
        super.A0A(z2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x01bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(android.graphics.Canvas r31) {
        /*
            r30 = this;
            r10 = r30
            X.074 r0 = r10.A09
            X.09W r0 = r0.A0R
            r28 = r0
            r0 = 0
            r10.A07 = r0
            r10.A06 = r0
            r0 = r28
            int r0 = r0.A0G
            int r2 = r10.A05
            if (r0 == r2) goto L_0x0021
            if (r2 < 0) goto L_0x0245
            java.lang.String[] r1 = A0D
            int r0 = r1.length
            if (r2 >= r0) goto L_0x0245
            r0 = r1[r2]
        L_0x001e:
            X.AnonymousClass0X2.A02(r0)
        L_0x0021:
            r0 = r28
            int r0 = r0.A0G
            r10.A05 = r0
            X.0Wn r0 = r10.A0A
            X.0Pm r8 = r10.A09
            r0.A07(r8)
            r0 = r28
            double r0 = r0.A02
            double r3 = r8.A01
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0041
            r2 = r28
            double r2 = r2.A00
            double r2 = java.lang.Math.ceil(r2)
            double r0 = r0 + r2
        L_0x0041:
            r2 = r28
            double r11 = r2.A03
            r29 = r31
            r29.save()
            float r5 = r2.A0A
            float r4 = r2.A04
            float r3 = r2.A05
            r2 = r29
            r2.rotate(r5, r4, r3)
            r2 = r28
            float r5 = r2.A0B
            float r4 = r2.A04
            float r3 = r2.A05
            r2 = r29
            r2.scale(r5, r5, r4, r3)
            r2 = r28
            int r2 = r2.A0E
            double r6 = (double) r2
            double r4 = r8.A01
            double r2 = r6 * r4
            int r4 = (int) r2
            r27 = r4
            double r4 = r8.A03
            double r2 = r6 * r4
            int r4 = (int) r2
            r26 = r4
            double r4 = r8.A02
            double r2 = r6 * r4
            int r4 = (int) r2
            r25 = r4
            double r2 = r8.A00
            double r6 = r6 * r2
            int r2 = (int) r6
            r24 = r2
            int r3 = r10.A03
            r2 = r27
            if (r3 != r2) goto L_0x0098
            int r3 = r10.A04
            r2 = r26
            if (r3 != r2) goto L_0x0098
            int r3 = r10.A01
            if (r3 != r4) goto L_0x0098
            int r3 = r10.A02
            r2 = r24
            if (r3 == r2) goto L_0x00a8
        L_0x0098:
            r2 = r28
            int r4 = r2.A0G
            if (r4 < 0) goto L_0x0241
            java.lang.String[] r3 = A0D
            int r2 = r3.length
            if (r4 >= r2) goto L_0x0241
            r2 = r3[r4]
        L_0x00a5:
            X.AnonymousClass0X2.A02(r2)
        L_0x00a8:
            r2 = r27
            r10.A03 = r2
            r2 = r26
            r10.A04 = r2
            r2 = r25
            r10.A01 = r2
            r2 = r24
            r10.A02 = r2
            r2 = r28
            int r13 = r2.A0E
            int r23 = r13 + -1
            int r2 = r25 - r27
            r3 = 1
            int r9 = r2 + 1
            int r2 = r24 - r26
            int r8 = r2 + 1
            r22 = r8
            if (r9 <= r8) goto L_0x00cd
            r22 = r9
        L_0x00cd:
            int r22 = r22 * r22
            int r9 = r9 - r3
            int r9 = r9 >> r3
            int r9 = r9 + r27
            int r8 = r8 - r3
            int r8 = r8 >> r3
            int r8 = r8 + r26
            r2 = r28
            long r2 = r2.A0J
            double r6 = (double) r2
            double r4 = (double) r9
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 * r14
            double r2 = (double) r13
            double r4 = r4 / r2
            double r4 = r4 - r0
            double r0 = r6 * r4
            r4 = r28
            float r4 = r4.A04
            double r4 = (double) r4
            double r0 = r0 + r4
            float r4 = (float) r0
            r21 = r4
            double r0 = (double) r8
            double r0 = r0 * r14
            double r0 = r0 / r2
            double r0 = r0 - r11
            double r6 = r6 * r0
            r0 = r28
            float r0 = r0.A05
            double r0 = (double) r0
            double r6 = r6 + r0
            float r0 = (float) r6
            r20 = r0
            r6 = 0
            r5 = -1
            r19 = 0
            r4 = 0
            r17 = 0
        L_0x0103:
            r1 = r22
            r0 = r19
            if (r0 >= r1) goto L_0x0249
            int r7 = r4 + r9
            int r3 = r6 + r8
            int r1 = r10.A07
            int r0 = r4 * r1
            float r0 = (float) r0
            float r18 = r21 + r0
            int r0 = r6 * r1
            float r2 = (float) r0
            float r2 = r2 + r20
            r0 = r26
            if (r3 < r0) goto L_0x01c5
            r0 = r24
            if (r3 > r0) goto L_0x01c5
            float r0 = (float) r1
            float r14 = r0 + r18
            float r15 = r2 + r0
            android.graphics.Canvas$EdgeType r16 = android.graphics.Canvas.EdgeType.BW
            r11 = r29
            r12 = r18
            r13 = r2
            boolean r0 = r11.quickReject(r12, r13, r14, r15, r16)
            if (r0 != 0) goto L_0x01c5
            r13 = r7 & r23
            X.0S2 r12 = r10.A0A
            r0 = r28
            int r15 = r0.A0G
            X.0Qb r11 = r10.A08
            r14 = 0
            r11.A03 = r14
            r1 = 0
            r11.A06 = r1
            r11.A05 = r1
        L_0x0145:
            X.0WN[] r0 = r11.A07
            r0[r14] = r1
            int r14 = r14 + 1
            r0 = 4
            if (r14 < r0) goto L_0x0145
            r11.A00 = r13
            r11.A01 = r3
            r11.A02 = r15
            X.0WN r1 = r12.A06
        L_0x0156:
            int r0 = r1.A04
            if (r0 >= r15) goto L_0x0170
            android.graphics.Bitmap r0 = r1.A01()
            if (r0 == 0) goto L_0x0162
            r11.A05 = r1
        L_0x0162:
            int r0 = r1.A04
            int r14 = X.AnonymousClass000.A0A(r15, r0, r13, r3)
            X.0WN[] r0 = r1.A0A
            r0 = r0[r14]
            if (r0 == 0) goto L_0x0170
            r1 = r0
            goto L_0x0156
        L_0x0170:
            int r0 = r1.A04
            if (r0 != r15) goto L_0x0184
            int r0 = r1.A02
            if (r0 != r13) goto L_0x0184
            int r0 = r1.A03
            if (r0 != r3) goto L_0x0184
            android.graphics.Bitmap r0 = r1.A01()
            if (r0 == 0) goto L_0x021d
            r11.A06 = r1
        L_0x0184:
            X.0WN r1 = r11.A06
            if (r1 != 0) goto L_0x018c
            X.0WN r1 = r11.A05
            if (r1 == 0) goto L_0x0197
        L_0x018c:
            r12.A03(r1)
            X.0WN r0 = r12.A05
            r0.A08 = r1
            r1.A07 = r0
            r12.A05 = r1
        L_0x0197:
            X.0Qb r11 = r10.A08
            X.0WN r0 = r11.A06
            if (r0 == 0) goto L_0x020e
            r12 = 1
            r1 = 1
        L_0x019f:
            int r0 = r11.A03
            if (r0 != r1) goto L_0x01ae
            java.util.ArrayList r1 = A0C
            boolean r0 = r1.contains(r10)
            if (r0 != 0) goto L_0x01ae
            r1.add(r10)
        L_0x01ae:
            X.0Qb r11 = r10.A08
            r1 = r29
            r0 = r18
            r11.A00(r1, r0, r2)
            int r0 = r10.A07
            int r0 = r0 + 1
            r10.A07 = r0
            if (r12 != 0) goto L_0x01c5
            int r0 = r10.A06
            int r0 = r0 + 1
            r10.A06 = r0
        L_0x01c5:
            if (r4 == r6) goto L_0x020a
            if (r4 >= 0) goto L_0x0204
            int r0 = -r4
            if (r0 == r6) goto L_0x020a
        L_0x01cc:
            r2 = r17
        L_0x01ce:
            int r7 = r7 + r2
            int r3 = r3 + r5
            r0 = r26
            if (r0 > r3) goto L_0x01e8
            r0 = r24
            if (r3 > r0) goto L_0x01e8
            r0 = r27
            if (r0 > r7) goto L_0x01e8
            r0 = r25
            if (r7 > r0) goto L_0x01e8
            int r4 = r4 + r2
            int r6 = r6 + r5
            r17 = r2
        L_0x01e4:
            int r19 = r19 + 1
            goto L_0x0103
        L_0x01e8:
            r7 = r2 & 1
            r3 = 1
            int r7 = r7 << r3
            int r7 = r7 - r3
            int r7 = r7 * r4
            int r0 = r5 >> 1
            r0 = r0 & 1
            int r7 = r7 + r0
            r1 = r5 & 1
            int r1 = r1 << r3
            int r1 = r1 - r3
            int r1 = r1 * r6
            int r0 = -r2
            r17 = r0
            int r0 = r0 >> 1
            r0 = r0 & 1
            int r1 = r1 + r0
            int r5 = -r5
            r4 = r7
            r6 = r1
            goto L_0x01e4
        L_0x0204:
            if (r4 <= 0) goto L_0x01cc
            int r0 = 1 - r6
            if (r4 != r0) goto L_0x01cc
        L_0x020a:
            int r2 = -r5
            r5 = r17
            goto L_0x01ce
        L_0x020e:
            r12 = 0
            int r0 = r11.A03
            r1 = 1
            if (r0 == r1) goto L_0x019f
            r0 = r28
            int r1 = r0.A0G
            r0 = 2
            r10.A0G(r13, r3, r1, r0)
            goto L_0x01ae
        L_0x021d:
            int r0 = r1.A0B
            r11.A03 = r0
            X.0WN[] r0 = r1.A0A
            r16 = r0
            X.0WN[] r15 = r11.A07
            r1 = 0
            r14 = 4
            java.lang.System.arraycopy(r0, r1, r15, r1, r14)
        L_0x022c:
            r14 = r16[r1]
            if (r14 == 0) goto L_0x023b
            r12.A03(r14)
            X.0WN r0 = r12.A05
            r0.A08 = r14
            r14.A07 = r0
            r12.A05 = r14
        L_0x023b:
            int r1 = r1 + 1
            r0 = 4
            if (r1 >= r0) goto L_0x0184
            goto L_0x022c
        L_0x0241:
            java.lang.String r2 = "INVALID_ZOOM_LEVEL"
            goto L_0x00a5
        L_0x0245:
            java.lang.String r0 = "INVALID_ZOOM_LEVEL"
            goto L_0x001e
        L_0x0249:
            int r1 = r10.A07
            int r0 = r10.A00
            if (r1 <= r0) goto L_0x026d
            r10.A00 = r1
            int[] r2 = r10.A0B
            java.util.ArrayList r1 = X.C03430Im.A06
            boolean r0 = r1.contains(r10)
            if (r0 != 0) goto L_0x025e
            r1.add(r10)
        L_0x025e:
            X.C03430Im.A00(r2)
            X.0S2 r1 = r10.A0A
            r0 = 0
            r0 = r2[r0]
            r1.A01 = r0
            r0 = 1
            r0 = r2[r0]
            r1.A02 = r0
        L_0x026d:
            r29.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0IX.A0D(android.graphics.Canvas):void");
    }

    public abstract AnonymousClass0WN A0E(int i2, int i3, int i4);

    public abstract void A0F();

    public void A0G(int i2, int i3, int i4, int i5) {
        String str;
        int i6 = this.A07;
        AnonymousClass0WN r6 = new AnonymousClass0WN(i6, i6);
        r6.A02 = i2;
        r6.A03 = i3;
        r6.A04 = i4;
        r6.A0B = 1;
        this.A0A.A02(r6);
        C03410Ik r4 = new C03410Ik(this, r6, i2, i3, i4, i5);
        if (i4 >= 0) {
            String[] strArr = A0D;
            if (i4 < strArr.length) {
                str = strArr[i4];
                int i7 = AnonymousClass0X2.A00;
                AnonymousClass0X2.A00 = i7 - 1;
                r4.A00 = ((long) i7) << 32;
                r4.A02 = str;
                r4.A01 = 0;
                AnonymousClass0X2.A00().A00.add(r4);
            }
        }
        str = "INVALID_ZOOM_LEVEL";
        int i72 = AnonymousClass0X2.A00;
        AnonymousClass0X2.A00 = i72 - 1;
        r4.A00 = ((long) i72) << 32;
        r4.A02 = str;
        r4.A01 = 0;
        AnonymousClass0X2.A00().A00.add(r4);
    }
}

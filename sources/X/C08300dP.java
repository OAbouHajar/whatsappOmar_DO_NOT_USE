package X;

import android.graphics.Path;
import java.util.List;

/* renamed from: X.0dP  reason: invalid class name and case insensitive filesystem */
public class C08300dP implements C13520mW, C12650kk, C13540mY {
    public AnonymousClass0PM A00 = new AnonymousClass0PM();
    public boolean A01;
    public final Path A02 = AnonymousClass000.A0I();
    public final AnonymousClass0Ak A03;
    public final AnonymousClass0SI A04;
    public final AnonymousClass0SI A05;
    public final AnonymousClass0SI A06;
    public final AnonymousClass0SI A07;
    public final AnonymousClass0SI A08;
    public final AnonymousClass0SI A09;
    public final AnonymousClass0SI A0A;
    public final AnonymousClass0KK A0B;
    public final String A0C;
    public final boolean A0D;

    public C08300dP(AnonymousClass0Ak r9, C08460dg r10, C08360dV r11) {
        AnonymousClass0HM r0;
        this.A03 = r9;
        this.A0C = r10.A08;
        AnonymousClass0KK r7 = r10.A07;
        this.A0B = r7;
        this.A0D = r10.A09;
        AnonymousClass0HM A002 = AnonymousClass0HC.A00(r10.A04);
        this.A08 = A002;
        AnonymousClass0SI A7E = r10.A06.A7E();
        this.A09 = A7E;
        AnonymousClass0HM A003 = AnonymousClass0HC.A00(r10.A05);
        this.A0A = A003;
        AnonymousClass0HM A004 = AnonymousClass0HC.A00(r10.A02);
        this.A06 = A004;
        AnonymousClass0HM A005 = AnonymousClass0HC.A00(r10.A03);
        this.A07 = A005;
        AnonymousClass0KK r1 = AnonymousClass0KK.A01;
        if (r7 == r1) {
            this.A04 = AnonymousClass0HC.A00(r10.A00);
            r0 = AnonymousClass0HC.A00(r10.A01);
        } else {
            r0 = null;
            this.A04 = null;
        }
        this.A05 = r0;
        r11.A09(A002);
        r11.A09(A7E);
        r11.A09(A003);
        r11.A09(A004);
        r11.A09(A005);
        if (r7 == r1) {
            r11.A09(this.A04);
            r11.A09(this.A05);
        }
        AnonymousClass0SI.A04(A002, this);
        AnonymousClass0SI.A04(A7E, this);
        AnonymousClass0SI.A04(A003, this);
        AnonymousClass0SI.A04(A004, this);
        AnonymousClass0SI.A04(A005, this);
        if (r7 == r1) {
            AnonymousClass0SI.A04(this.A04, this);
            AnonymousClass0SI.A04(this.A05, this);
        }
    }

    public static double A00(float f2, float f3) {
        return (double) ((float) (Math.atan2((double) f2, (double) f3) - 1.5707963267948966d));
    }

    public void A4l(AnonymousClass0UV r2, Object obj) {
        AnonymousClass0SI r0;
        if (obj == C13480m6.A0C) {
            r0 = this.A08;
        } else if (obj == C13480m6.A0D) {
            r0 = this.A0A;
        } else if (obj == C13480m6.A02) {
            r0 = this.A09;
        } else if (obj != C13480m6.A08 || (r0 = this.A04) == null) {
            if (obj == C13480m6.A0A) {
                r0 = this.A06;
            } else if (obj != C13480m6.A09 || (r0 = this.A05) == null) {
                if (obj == C13480m6.A0B) {
                    r0 = this.A07;
                } else {
                    return;
                }
            }
        }
        r0.A0D(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0246, code lost:
        r0 = X.AnonymousClass0SI.A03(r7.A09);
        r35.offset(r0.x, r0.y);
        r35.close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Path AEK() {
        /*
            r36 = this;
            r7 = r36
            boolean r1 = r7.A01
            android.graphics.Path r0 = r7.A02
            r35 = r0
            if (r1 != 0) goto L_0x0027
            r35.reset()
            boolean r0 = r7.A0D
            if (r0 != 0) goto L_0x0024
            X.0KK r0 = r7.A0B
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x0028;
                case 1: goto L_0x0193;
                default: goto L_0x001a;
            }
        L_0x001a:
            r35.close()
            X.0PM r1 = r7.A00
            r0 = r35
            r1.A00(r0)
        L_0x0024:
            r0 = 1
            r7.A01 = r0
        L_0x0027:
            return r35
        L_0x0028:
            X.0SI r0 = r7.A08
            float r8 = X.AnonymousClass0SI.A02(r0)
            X.0SI r0 = r7.A0A
            if (r0 != 0) goto L_0x018c
            r2 = 0
        L_0x0034:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            double r2 = r2 - r0
            double r31 = java.lang.Math.toRadians(r2)
            r1 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r9 = (double) r8
            double r1 = r1 / r9
            float r0 = (float) r1
            r34 = r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r33 = r34 / r0
            int r0 = (int) r8
            float r0 = (float) r0
            float r8 = r8 - r0
            r2 = 0
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x005c
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r8
            float r0 = r0 * r33
            double r0 = (double) r0
            double r31 = r31 + r0
        L_0x005c:
            X.0SI r0 = r7.A06
            float r30 = X.AnonymousClass0SI.A02(r0)
            X.0SI r0 = r7.A04
            float r29 = X.AnonymousClass0SI.A02(r0)
            X.0SI r0 = r7.A05
            r1 = 1120403456(0x42c80000, float:100.0)
            if (r0 == 0) goto L_0x0188
            float r28 = X.AnonymousClass0SI.A02(r0)
            float r28 = r28 / r1
        L_0x0074:
            X.0SI r0 = r7.A07
            if (r0 == 0) goto L_0x0184
            float r27 = X.AnonymousClass0SI.A02(r0)
            float r27 = r27 / r1
        L_0x007e:
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0167
            float r6 = r30 - r29
            float r6 = r6 * r8
            float r6 = r6 + r29
            double r0 = (double) r6
            double r4 = java.lang.Math.cos(r31)
            double r2 = r0 * r4
            float r5 = (float) r2
            double r2 = java.lang.Math.sin(r31)
            double r0 = r0 * r2
            float r4 = (float) r0
            r0 = r35
            r0.moveTo(r5, r4)
            float r1 = r34 * r8
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            double r0 = (double) r1
            double r31 = r31 + r0
        L_0x00a2:
            double r25 = java.lang.Math.ceil(r9)
            r23 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r25 = r25 * r23
            r11 = 0
            r22 = 0
        L_0x00ad:
            double r2 = (double) r11
            int r0 = (r2 > r25 ? 1 : (r2 == r25 ? 0 : -1))
            if (r0 >= 0) goto L_0x0246
            r1 = r29
            if (r22 == 0) goto L_0x00b8
            r1 = r30
        L_0x00b8:
            r0 = 0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0163
            double r9 = r25 - r23
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0163
            float r12 = r34 * r8
            r0 = 1073741824(0x40000000, float:2.0)
            float r12 = r12 / r0
        L_0x00c8:
            r20 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r19 = 0
            int r0 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x00d7
            double r9 = r25 - r20
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x00d7
            r1 = r6
        L_0x00d7:
            double r0 = (double) r1
            double r13 = java.lang.Math.cos(r31)
            double r9 = r0 * r13
            float r14 = (float) r9
            double r9 = java.lang.Math.sin(r31)
            double r0 = r0 * r9
            float r10 = (float) r0
            int r0 = (r28 > r19 ? 1 : (r28 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x00fc
            int r0 = (r27 > r19 ? 1 : (r27 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x00fc
            r0 = r35
            r0.lineTo(r14, r10)
        L_0x00f2:
            double r0 = (double) r12
            double r31 = r31 + r0
            r22 = r22 ^ 1
            int r11 = r11 + 1
            r4 = r10
            r5 = r14
            goto L_0x00ad
        L_0x00fc:
            double r15 = A00(r4, r5)
            double r0 = java.lang.Math.cos(r15)
            float r9 = (float) r0
            double r0 = java.lang.Math.sin(r15)
            float r13 = (float) r0
            r18 = r13
            double r15 = A00(r10, r14)
            double r0 = java.lang.Math.cos(r15)
            float r13 = (float) r0
            double r0 = java.lang.Math.sin(r15)
            float r15 = (float) r0
            r0 = r27
            r16 = r28
            r17 = r30
            r1 = r29
            if (r22 == 0) goto L_0x012c
            r0 = r28
            r16 = r27
            r17 = r1
            r1 = r30
        L_0x012c:
            float r17 = r17 * r0
            r0 = 1056236141(0x3ef4e26d, float:0.47829)
            float r17 = r17 * r0
            float r9 = r9 * r17
            float r17 = r17 * r18
            float r1 = r1 * r16
            float r1 = r1 * r0
            float r13 = r13 * r1
            float r1 = r1 * r15
            int r0 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x0145
            if (r11 != 0) goto L_0x015a
            float r9 = r9 * r8
            float r17 = r17 * r8
        L_0x0145:
            float r5 = r5 - r9
            float r4 = r4 - r17
            float r18 = r14 + r13
            float r19 = r10 + r1
            r15 = r35
            r16 = r5
            r17 = r4
            r20 = r14
            r21 = r10
            r15.cubicTo(r16, r17, r18, r19, r20, r21)
            goto L_0x00f2
        L_0x015a:
            double r15 = r25 - r20
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x0145
            float r13 = r13 * r8
            float r1 = r1 * r8
            goto L_0x0145
        L_0x0163:
            r12 = r33
            goto L_0x00c8
        L_0x0167:
            r0 = r30
            double r0 = (double) r0
            double r4 = java.lang.Math.cos(r31)
            double r2 = r0 * r4
            float r5 = (float) r2
            double r2 = java.lang.Math.sin(r31)
            double r0 = r0 * r2
            float r4 = (float) r0
            r0 = r35
            r0.moveTo(r5, r4)
            r0 = r33
            double r0 = (double) r0
            double r31 = r31 + r0
            r6 = 0
            goto L_0x00a2
        L_0x0184:
            r27 = 0
            goto L_0x007e
        L_0x0188:
            r28 = 0
            goto L_0x0074
        L_0x018c:
            float r0 = X.AnonymousClass0SI.A02(r0)
            double r2 = (double) r0
            goto L_0x0034
        L_0x0193:
            X.0SI r0 = r7.A08
            float r0 = X.AnonymousClass0SI.A02(r0)
            double r0 = (double) r0
            double r0 = java.lang.Math.floor(r0)
            int r4 = (int) r0
            X.0SI r0 = r7.A0A
            if (r0 != 0) goto L_0x023f
            r2 = 0
        L_0x01a5:
            r0 = 4636033603912859648(0x4056800000000000, double:90.0)
            double r2 = r2 - r0
            double r21 = java.lang.Math.toRadians(r2)
            r2 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            double r0 = (double) r4
            double r2 = r2 / r0
            float r9 = (float) r2
            X.0SI r2 = r7.A07
            float r20 = X.AnonymousClass0SI.A02(r2)
            r2 = 1120403456(0x42c80000, float:100.0)
            float r20 = r20 / r2
            X.0SI r2 = r7.A06
            float r19 = X.AnonymousClass0SI.A02(r2)
            r2 = r19
            double r4 = (double) r2
            double r2 = java.lang.Math.cos(r21)
            double r2 = r2 * r4
            float r8 = (float) r2
            double r2 = java.lang.Math.sin(r21)
            double r2 = r2 * r4
            float r6 = (float) r2
            r2 = r35
            r2.moveTo(r8, r6)
            double r2 = (double) r9
            double r21 = r21 + r2
            double r17 = java.lang.Math.ceil(r0)
            r14 = 0
        L_0x01e3:
            double r0 = (double) r14
            int r9 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r9 >= 0) goto L_0x0246
            double r0 = java.lang.Math.cos(r21)
            double r0 = r0 * r4
            float r12 = (float) r0
            double r9 = java.lang.Math.sin(r21)
            double r0 = r4 * r9
            float r10 = (float) r0
            r0 = 0
            int r0 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0239
            double r15 = A00(r6, r8)
            double r0 = java.lang.Math.cos(r15)
            float r9 = (float) r0
            double r0 = java.lang.Math.sin(r15)
            float r11 = (float) r0
            double r15 = A00(r10, r12)
            double r0 = java.lang.Math.cos(r15)
            float r13 = (float) r0
            double r0 = java.lang.Math.sin(r15)
            float r15 = (float) r0
            float r1 = r19 * r20
            r0 = 1048576000(0x3e800000, float:0.25)
            float r1 = r1 * r0
            float r9 = r9 * r1
            float r11 = r11 * r1
            float r13 = r13 * r1
            float r1 = r1 * r15
            float r8 = r8 - r9
            float r6 = r6 - r11
            float r26 = r12 + r13
            float r27 = r10 + r1
            r23 = r35
            r24 = r8
            r25 = r6
            r28 = r12
            r29 = r10
            r23.cubicTo(r24, r25, r26, r27, r28, r29)
        L_0x0232:
            double r21 = r21 + r2
            int r14 = r14 + 1
            r6 = r10
            r8 = r12
            goto L_0x01e3
        L_0x0239:
            r0 = r35
            r0.lineTo(r12, r10)
            goto L_0x0232
        L_0x023f:
            float r0 = X.AnonymousClass0SI.A02(r0)
            double r2 = (double) r0
            goto L_0x01a5
        L_0x0246:
            X.0SI r0 = r7.A09
            android.graphics.PointF r0 = X.AnonymousClass0SI.A03(r0)
            float r2 = r0.x
            float r1 = r0.y
            r0 = r35
            r0.offset(r2, r1)
            r35.close()
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08300dP.AEK():android.graphics.Path");
    }

    public void AZV() {
        this.A01 = false;
        this.A03.invalidateSelf();
    }

    public void AcW(AnonymousClass0WM r1, AnonymousClass0WM r2, List list, int i2) {
        C06560Ws.A01(this, r1, r2, list, i2);
    }

    public void Adk(List list, List list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            C13150lY r2 = (C13150lY) list.get(i2);
            if (r2 instanceof C08240dJ) {
                C08240dJ r22 = (C08240dJ) r2;
                if (r22.A03 == AnonymousClass0JW.SIMULTANEOUSLY) {
                    this.A00.A00.add(r22);
                    r22.A05.add(this);
                }
            }
        }
    }

    public String getName() {
        return this.A0C;
    }
}

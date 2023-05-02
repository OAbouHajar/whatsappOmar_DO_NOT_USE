package X;

import android.graphics.Point;

/* renamed from: X.0Wn  reason: invalid class name and case insensitive filesystem */
public final class C06540Wn {
    public final AnonymousClass074 A00;
    public final C05150Pm A01 = new C05150Pm();
    public final float[] A02 = new float[2];

    public C06540Wn(AnonymousClass074 r2) {
        this.A00 = r2;
    }

    public static double A00(double d2) {
        double sin = Math.sin((d2 * 3.141592653589793d) / 180.0d);
        return 0.5d - (Math.log((sin + 1.0d) / (1.0d - sin)) / 12.566370614359172d);
    }

    public static double A01(double d2) {
        return (d2 + 180.0d) / 360.0d;
    }

    public static double A02(double d2) {
        return ((Math.atan(Math.exp((1.0d - (d2 * 2.0d)) * 3.141592653589793d)) * 2.0d) - 1.5707963267948966d) * 57.29577951308232d;
    }

    public double A03(float f2) {
        AnonymousClass09W r0 = this.A00.A0R;
        return (double) (f2 / (((float) r0.A0J) * r0.A0B));
    }

    public Point A04(AnonymousClass020 r11) {
        double d2 = r11.A00;
        double d3 = r11.A01;
        float[] fArr = this.A02;
        A08(fArr, A01(d3), A00(d2));
        return new Point((int) fArr[0], (int) fArr[1]);
    }

    public AnonymousClass020 A05(float f2, float f3) {
        float[] fArr = this.A02;
        A0A(fArr, f2, f3);
        return new AnonymousClass020(A02((double) fArr[1]), (((double) fArr[0]) * 360.0d) - 180.0d);
    }

    public AnonymousClass0RX A06() {
        AnonymousClass074 r4 = this.A00;
        AnonymousClass09W r5 = r4.A0R;
        float f2 = (float) 0;
        AnonymousClass020 A05 = A05(f2, (float) (r5.A0D - r4.A04));
        AnonymousClass020 A052 = A05((float) (r5.A0F - r4.A05), (float) (r5.A0D - r4.A04));
        AnonymousClass020 A053 = A05(f2, (float) r4.A06);
        AnonymousClass020 A054 = A05((float) (r5.A0F - r4.A05), (float) r4.A06);
        double d2 = A05.A00;
        double d3 = d2;
        double d4 = d2;
        double d5 = A05.A01;
        double d6 = d5;
        double d7 = d5 - d5;
        double d8 = A053.A00;
        if (d8 > d3) {
            d4 = d8;
        } else if (d8 < d3) {
            d3 = d8;
        }
        double A07 = d7 + ((double) AnonymousClass000.A07((d7 > 0.0d ? 1 : (d7 == 0.0d ? 0 : -1))));
        double d9 = A053.A01;
        double d10 = d9 - d5;
        double A072 = d10 + ((double) AnonymousClass000.A07((d10 > 0.0d ? 1 : (d10 == 0.0d ? 0 : -1))));
        double d11 = d5 - d9;
        double A073 = d11 + ((double) AnonymousClass000.A07((d11 > 0.0d ? 1 : (d11 == 0.0d ? 0 : -1))));
        if (Double.compare(A072, A07) > 0 || Double.compare(A073, A07) > 0) {
            if (A072 <= A073) {
                d5 = d9;
            } else {
                d6 = d9;
            }
        }
        double d12 = A052.A00;
        if (d12 > d4) {
            d4 = d12;
        } else if (d12 < d3) {
            d3 = d12;
        }
        double d13 = d5 - d6;
        double A074 = d13 + ((double) AnonymousClass000.A07((d13 > 0.0d ? 1 : (d13 == 0.0d ? 0 : -1))));
        double d14 = A052.A01;
        double d15 = d14 - d6;
        double A075 = d15 + ((double) AnonymousClass000.A07((d15 > 0.0d ? 1 : (d15 == 0.0d ? 0 : -1))));
        double d16 = d5 - d14;
        double A076 = d16 + ((double) AnonymousClass000.A07((d16 > 0.0d ? 1 : (d16 == 0.0d ? 0 : -1))));
        if (Double.compare(A075, A074) > 0 || Double.compare(A076, A074) > 0) {
            if (A075 <= A076) {
                d5 = d14;
            } else {
                d6 = d14;
            }
        }
        double d17 = A054.A00;
        if (d17 > d4) {
            d4 = d17;
        } else if (d17 < d3) {
            d3 = d17;
        }
        double d18 = d5 - d6;
        double A077 = d18 + ((double) AnonymousClass000.A07((d18 > 0.0d ? 1 : (d18 == 0.0d ? 0 : -1))));
        double d19 = A054.A01;
        double d20 = d19 - d6;
        double A078 = d20 + ((double) AnonymousClass000.A07((d20 > 0.0d ? 1 : (d20 == 0.0d ? 0 : -1))));
        double d21 = d5 - d19;
        double A079 = d21 + ((double) AnonymousClass000.A07((d21 > 0.0d ? 1 : (d21 == 0.0d ? 0 : -1))));
        if (Double.compare(A078, A077) > 0 || Double.compare(A079, A077) > 0) {
            if (A078 <= A079) {
                d5 = d19;
            } else {
                d6 = d19;
            }
        }
        return new AnonymousClass0RX(A05, A052, A053, A054, new AnonymousClass0YH(new AnonymousClass020(d3, d6), new AnonymousClass020(d4, d5)));
    }

    public final void A07(C05150Pm r9) {
        AnonymousClass09W r6 = this.A00.A0R;
        double d2 = r6.A03;
        double d3 = r6.A01;
        r9.A03 = d2 - d3;
        r9.A00 = d2 + d3;
        double d4 = r6.A02;
        double d5 = r6.A00;
        double d6 = d4 - d5;
        r9.A01 = d6;
        double d7 = d4 + d5;
        r9.A02 = d7;
        if (d6 < 0.0d) {
            double ceil = (double) ((int) Math.ceil(-d6));
            r9.A01 = d6 + ceil;
            r9.A02 = d7 + ceil;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if ((r4 - r12) < (r2 - r8)) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(float[] r11, double r12, double r14) {
        /*
            r10 = this;
            X.0Pm r6 = r10.A01
            r10.A07(r6)
            double r4 = r6.A01
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0011
            double r1 = r6.A02
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x002b
        L_0x0011:
            double r0 = r4 - r12
            double r1 = java.lang.Math.ceil(r0)
            int r0 = (int) r1
            double r2 = (double) r0
            double r2 = r2 + r12
            double r8 = r6.A02
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x002f
            double r6 = r2 - r8
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r12 = r2 - r0
            double r4 = r4 - r12
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x002f
        L_0x002b:
            r10.A09(r11, r12, r14)
            return
        L_0x002f:
            r12 = r2
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06540Wn.A08(float[], double, double):void");
    }

    public void A09(float[] fArr, double d2, double d3) {
        AnonymousClass09W r4 = this.A00.A0R;
        double d4 = r4.A02;
        C05150Pm r6 = this.A01;
        A07(r6);
        double d5 = r6.A01;
        if (d5 > d4 || d4 > r6.A02) {
            d4 += (double) ((int) Math.ceil(d5 - d4));
        }
        float f2 = (float) r4.A0J;
        fArr[0] = ((float) (d2 - d4)) * f2;
        fArr[1] = ((float) (d3 - r4.A03)) * f2;
        r4.A0g.mapVectors(fArr);
        fArr[0] = fArr[0] + r4.A04;
        fArr[1] = fArr[1] + r4.A05;
    }

    public void A0A(float[] fArr, float f2, float f3) {
        AnonymousClass09W r4 = this.A00.A0R;
        fArr[0] = f2 - r4.A04;
        fArr[1] = f3 - r4.A05;
        r4.A0h.mapVectors(fArr);
        double d2 = r4.A02;
        double d3 = (double) fArr[0];
        double d4 = (double) r4.A0J;
        double d5 = d2 + (d3 / d4);
        double d6 = r4.A03 + (((double) fArr[1]) / d4);
        if (d5 > 1.0d) {
            d5 -= 1.0d;
        } else if (d5 < 0.0d) {
            d5 += 1.0d;
        }
        fArr[0] = (float) d5;
        fArr[1] = (float) d6;
    }
}

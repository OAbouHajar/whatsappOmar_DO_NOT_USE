package X;

import android.graphics.Color;

/* renamed from: X.0WA  reason: invalid class name */
public class AnonymousClass0WA {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;

    public AnonymousClass0WA(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.A03 = f2;
        this.A02 = f3;
        this.A04 = f4;
        this.A05 = f5;
        this.A00 = f6;
        this.A01 = f7;
    }

    public static AnonymousClass0WA A00(float f2, float f3, float f4) {
        float f5 = f4;
        float log = ((float) Math.log((((double) (f3 * AnonymousClass0UH.A0A.A03)) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (double) ((3.1415927f * f4) / 180.0f);
        return new AnonymousClass0WA(f5, f3, f2, (1.7f * f2) / ((0.007f * f2) + 1.0f), log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public static AnonymousClass0WA A01(int i2) {
        AnonymousClass0UH r7 = AnonymousClass0UH.A0A;
        float A002 = C05860Th.A00(Color.red(i2));
        float A003 = C05860Th.A00(Color.green(i2));
        float A004 = C05860Th.A00(Color.blue(i2));
        float[][] fArr = C05860Th.A02;
        float[] fArr2 = fArr[0];
        float f2 = (fArr2[0] * A002) + (fArr2[1] * A003) + (fArr2[2] * A004);
        float[] fArr3 = fArr[1];
        float f3 = (fArr3[0] * A002) + (fArr3[1] * A003) + (fArr3[2] * A004);
        float[] fArr4 = fArr[2];
        float f4 = (A002 * fArr4[0]) + (A003 * fArr4[1]) + (A004 * fArr4[2]);
        float[] fArr5 = {f2, f3, f4};
        float[][] fArr6 = C05860Th.A03;
        float f5 = fArr5[0];
        float[] fArr7 = fArr6[0];
        float f6 = fArr5[1];
        float f7 = (f5 * fArr7[0]) + (fArr7[1] * f6) + (fArr7[2] * f4);
        float[] fArr8 = fArr6[1];
        float f8 = (f5 * fArr8[0]) + (fArr8[1] * f6) + (fArr8[2] * f4);
        float[] fArr9 = fArr6[2];
        float f9 = (f5 * fArr9[0]) + (f6 * fArr9[1]) + (f4 * fArr9[2]);
        float[] fArr10 = r7.A09;
        float f10 = fArr10[0] * f7;
        float f11 = fArr10[1] * f8;
        float f12 = fArr10[2] * f9;
        float f13 = r7.A02;
        float pow = (float) Math.pow(((double) (Math.abs(f10) * f13)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (Math.abs(f11) * f13)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (f13 * Math.abs(f12))) / 100.0d, 0.42d);
        float signum = ((Math.signum(f10) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f11) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f12) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d2 = (double) signum3;
        float f14 = ((float) (((((double) signum) * 11.0d) + (((double) signum2) * -12.0d)) + d2)) / 11.0f;
        float f15 = ((float) (((double) (signum + signum2)) - (d2 * 2.0d))) / 9.0f;
        float f16 = signum2 * 20.0f;
        float f17 = (((signum * 20.0f) + f16) + (21.0f * signum3)) / 20.0f;
        float f18 = (((signum * 40.0f) + f16) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f15, (double) f14)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f19 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((double) ((f18 * r7.A05) / r7.A00), (double) (r7.A01 * r7.A08))) * 100.0f;
        float f20 = r7.A03;
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) r7.A04), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) (((double) atan2) < 20.14d ? 360.0f + atan2 : atan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * r7.A06) * r7.A07) * ((float) Math.sqrt((double) ((f14 * f14) + (f15 * f15))))) / (f17 + 0.305f)), 0.9d)) * ((float) Math.sqrt(((double) pow4) / 100.0d));
        float f21 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((0.0228f * pow5 * f20) + 1.0f))) * 43.85965f;
        double d3 = (double) f19;
        return new AnonymousClass0WA(atan2, pow5, pow4, f21, log * ((float) Math.cos(d3)), log * ((float) Math.sin(d3)));
    }

    public int A02(AnonymousClass0UH r18) {
        float f2;
        float f3 = this.A02;
        if (((double) f3) != 0.0d) {
            double d2 = (double) this.A04;
            if (d2 != 0.0d) {
                f2 = f3 / ((float) Math.sqrt(d2 / 100.0d));
                AnonymousClass0UH r10 = r18;
                float pow = (float) Math.pow(((double) f2) / Math.pow(1.64d - Math.pow(0.29d, (double) r10.A04), 0.73d), 1.1111111111111112d);
                double d3 = (double) ((this.A03 * 3.1415927f) / 180.0f);
                float cos = ((float) (Math.cos(2.0d + d3) + 3.8d)) * 0.25f * 3846.1538f * r10.A06 * r10.A07;
                float pow2 = (r10.A00 * ((float) Math.pow(((double) this.A04) / 100.0d, (1.0d / ((double) r10.A01)) / ((double) r10.A08)))) / r10.A05;
                float sin = (float) Math.sin(d3);
                float cos2 = (float) Math.cos(d3);
                float f4 = (((0.305f + pow2) * 23.0f) * pow) / (((cos * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
                float f5 = cos2 * f4;
                float f6 = f4 * sin;
                float f7 = pow2 * 460.0f;
                float f8 = (((451.0f * f5) + f7) + (288.0f * f6)) / 1403.0f;
                float f9 = ((f7 - (891.0f * f5)) - (261.0f * f6)) / 1403.0f;
                float f10 = ((f7 - (f5 * 220.0f)) - (f6 * 6300.0f)) / 1403.0f;
                double abs = (double) Math.abs(f8);
                float signum = Math.signum(f8);
                float f11 = 100.0f / r10.A02;
                float pow3 = signum * f11 * ((float) Math.pow((double) ((float) Math.max(0.0d, (abs * 27.13d) / (400.0d - abs))), 2.380952380952381d));
                double abs2 = (double) Math.abs(f9);
                float signum2 = Math.signum(f9) * f11 * ((float) Math.pow((double) ((float) Math.max(0.0d, (abs2 * 27.13d) / (400.0d - abs2))), 2.380952380952381d));
                double abs3 = (double) Math.abs(f10);
                float signum3 = Math.signum(f10) * f11 * ((float) Math.pow((double) ((float) Math.max(0.0d, (abs3 * 27.13d) / (400.0d - abs3))), 2.380952380952381d));
                float[] fArr = r10.A09;
                float f12 = pow3 / fArr[0];
                float f13 = signum2 / fArr[1];
                float f14 = signum3 / fArr[2];
                float[][] fArr2 = C05860Th.A01;
                float[] fArr3 = fArr2[0];
                float f15 = (fArr3[0] * f12) + (fArr3[1] * f13) + (fArr3[2] * f14);
                float[] fArr4 = fArr2[1];
                float f16 = (fArr4[0] * f12) + (fArr4[1] * f13) + (fArr4[2] * f14);
                float[] fArr5 = fArr2[2];
                return AnonymousClass090.A02((double) f15, (double) f16, (double) ((f12 * fArr5[0]) + (f13 * fArr5[1]) + (f14 * fArr5[2])));
            }
        }
        f2 = 0.0f;
        AnonymousClass0UH r102 = r18;
        float pow4 = (float) Math.pow(((double) f2) / Math.pow(1.64d - Math.pow(0.29d, (double) r102.A04), 0.73d), 1.1111111111111112d);
        double d32 = (double) ((this.A03 * 3.1415927f) / 180.0f);
        float cos3 = ((float) (Math.cos(2.0d + d32) + 3.8d)) * 0.25f * 3846.1538f * r102.A06 * r102.A07;
        float pow22 = (r102.A00 * ((float) Math.pow(((double) this.A04) / 100.0d, (1.0d / ((double) r102.A01)) / ((double) r102.A08)))) / r102.A05;
        float sin2 = (float) Math.sin(d32);
        float cos22 = (float) Math.cos(d32);
        float f42 = (((0.305f + pow22) * 23.0f) * pow4) / (((cos3 * 23.0f) + ((11.0f * pow4) * cos22)) + ((pow4 * 108.0f) * sin2));
        float f52 = cos22 * f42;
        float f62 = f42 * sin2;
        float f72 = pow22 * 460.0f;
        float f82 = (((451.0f * f52) + f72) + (288.0f * f62)) / 1403.0f;
        float f92 = ((f72 - (891.0f * f52)) - (261.0f * f62)) / 1403.0f;
        float f102 = ((f72 - (f52 * 220.0f)) - (f62 * 6300.0f)) / 1403.0f;
        double abs4 = (double) Math.abs(f82);
        float signum4 = Math.signum(f82);
        float f112 = 100.0f / r102.A02;
        float pow32 = signum4 * f112 * ((float) Math.pow((double) ((float) Math.max(0.0d, (abs4 * 27.13d) / (400.0d - abs4))), 2.380952380952381d));
        double abs22 = (double) Math.abs(f92);
        float signum22 = Math.signum(f92) * f112 * ((float) Math.pow((double) ((float) Math.max(0.0d, (abs22 * 27.13d) / (400.0d - abs22))), 2.380952380952381d));
        double abs32 = (double) Math.abs(f102);
        float signum32 = Math.signum(f102) * f112 * ((float) Math.pow((double) ((float) Math.max(0.0d, (abs32 * 27.13d) / (400.0d - abs32))), 2.380952380952381d));
        float[] fArr6 = r102.A09;
        float f122 = pow32 / fArr6[0];
        float f132 = signum22 / fArr6[1];
        float f142 = signum32 / fArr6[2];
        float[][] fArr22 = C05860Th.A01;
        float[] fArr32 = fArr22[0];
        float f152 = (fArr32[0] * f122) + (fArr32[1] * f132) + (fArr32[2] * f142);
        float[] fArr42 = fArr22[1];
        float f162 = (fArr42[0] * f122) + (fArr42[1] * f132) + (fArr42[2] * f142);
        float[] fArr52 = fArr22[2];
        return AnonymousClass090.A02((double) f152, (double) f162, (double) ((f122 * fArr52[0]) + (f132 * fArr52[1]) + (f142 * fArr52[2])));
    }
}

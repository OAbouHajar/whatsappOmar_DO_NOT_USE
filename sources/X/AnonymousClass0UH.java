package X;

/* renamed from: X.0UH  reason: invalid class name */
public final class AnonymousClass0UH {
    public static final AnonymousClass0UH A0A;
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float[] A09;

    static {
        float f2;
        float f3;
        float f4;
        float[] fArr = C05860Th.A00;
        float pow = ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
        float f5 = (float) ((((double) pow) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = C05860Th.A03;
        float f6 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f7 = fArr[1];
        float f8 = fArr[2];
        float f9 = (f6 * fArr3[0]) + (fArr3[1] * f7) + (fArr3[2] * f8);
        float[] fArr4 = fArr2[1];
        float f10 = (f6 * fArr4[0]) + (fArr4[1] * f7) + (fArr4[2] * f8);
        float[] fArr5 = fArr2[2];
        float f11 = (f6 * fArr5[0]) + (f7 * fArr5[1]) + (f8 * fArr5[2]);
        float f12 = (2.0f / 10.0f) + 0.8f;
        if (((double) f12) >= 0.9d) {
            f2 = (f12 - 0.9f) * 10.0f;
            f3 = 0.59f;
            f4 = 0.69f;
        } else {
            f2 = (f12 - 0.8f) * 10.0f;
            f3 = 0.525f;
            f4 = 0.59f;
        }
        float f13 = f3 + ((f4 - f3) * f2);
        float exp = (1.0f - (((float) Math.exp((double) (((-f5) - 42.0f) / 92.0f))) * 0.2777778f)) * f12;
        double d2 = (double) exp;
        if (d2 > 1.0d) {
            exp = 1.0f;
        } else if (d2 < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f9) * exp) + 1.0f) - exp, (((100.0f / f10) * exp) + 1.0f) - exp, (((100.0f / f11) * exp) + 1.0f) - exp};
        float f14 = 1.0f / ((5.0f * f5) + 1.0f);
        float f15 = f14 * f14 * f14 * f14;
        float f16 = 1.0f - f15;
        float cbrt = (f15 * f5) + (0.1f * f16 * f16 * ((float) Math.cbrt(((double) f5) * 5.0d)));
        float f17 = pow / fArr[1];
        double d3 = (double) f17;
        float pow2 = 0.725f / ((float) Math.pow(d3, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * cbrt) * f9)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * cbrt) * f10)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * cbrt) * f11)) / 100.0d, 0.42d)};
        float f18 = fArr7[0];
        float f19 = fArr7[1];
        float f20 = fArr7[2];
        float f21 = (f20 * 400.0f) / (f20 + 27.13f);
        float[] fArr8 = {(f18 * 400.0f) / (f18 + 27.13f), (f19 * 400.0f) / (f19 + 27.13f), f21};
        A0A = new AnonymousClass0UH(fArr6, f17, ((fArr8[0] * 2.0f) + fArr8[1] + (f21 * 0.05f)) * pow2, pow2, pow2, f13, f12, cbrt, (float) Math.pow((double) cbrt, 0.25d), ((float) Math.sqrt(d3)) + 1.48f);
    }

    public AnonymousClass0UH(float[] fArr, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.A04 = f2;
        this.A00 = f3;
        this.A05 = f4;
        this.A07 = f5;
        this.A01 = f6;
        this.A06 = f7;
        this.A09 = fArr;
        this.A02 = f8;
        this.A03 = f9;
        this.A08 = f10;
    }
}

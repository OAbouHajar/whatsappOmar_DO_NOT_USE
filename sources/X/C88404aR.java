package X;

/* renamed from: X.4aR  reason: invalid class name and case insensitive filesystem */
public final class C88404aR {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;

    public C88404aR(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.A00 = f2;
        this.A01 = f5;
        this.A02 = f8;
        this.A03 = f3;
        this.A04 = f6;
        this.A05 = f9;
        this.A06 = f4;
        this.A07 = f7;
        this.A08 = f10;
    }

    public static C88404aR A00(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16 = f2;
        float f17 = ((f2 - f4) + f6) - f8;
        float f18 = f3;
        float f19 = ((f3 - f5) + f7) - f9;
        float f20 = 0.0f;
        if (f17 == 0.0f && f19 == 0.0f) {
            f11 = f4 - f16;
            f12 = f6 - f4;
            f13 = f5 - f3;
            f14 = f7 - f5;
            f15 = 1.0f;
            f10 = 0.0f;
        } else {
            float f21 = f4 - f6;
            float f22 = f8 - f6;
            float f23 = f5 - f7;
            float f24 = f9 - f7;
            float f25 = (f21 * f24) - (f22 * f23);
            f20 = ((f24 * f17) - (f22 * f19)) / f25;
            f10 = ((f21 * f19) - (f17 * f23)) / f25;
            f11 = (f20 * f4) + (f4 - f16);
            f12 = (f10 * f8) + (f8 - f16);
            f13 = (f5 - f18) + (f20 * f5);
            f14 = (f9 - f18) + (f10 * f9);
            f15 = 1.0f;
        }
        return new C88404aR(f11, f12, f16, f13, f14, f18, f20, f10, f15);
    }
}

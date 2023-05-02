package X;

import android.view.View;

/* renamed from: X.0Rh  reason: invalid class name and case insensitive filesystem */
public class C05440Rh {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;

    public C05440Rh(View view) {
        this.A05 = view.getTranslationX();
        this.A06 = view.getTranslationY();
        this.A07 = C004601z.A01(view);
        this.A03 = view.getScaleX();
        this.A04 = view.getScaleY();
        this.A00 = view.getRotationX();
        this.A01 = view.getRotationY();
        this.A02 = view.getRotation();
    }

    public void A00(View view) {
        float f2 = this.A05;
        float f3 = this.A06;
        float f4 = this.A07;
        float f5 = this.A03;
        float f6 = this.A04;
        float f7 = this.A00;
        float f8 = this.A01;
        float f9 = this.A02;
        view.setTranslationX(f2);
        view.setTranslationY(f3);
        C004601z.A0Y(view, f4);
        view.setScaleX(f5);
        view.setScaleY(f6);
        view.setRotationX(f7);
        view.setRotationY(f8);
        view.setRotation(f9);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C05440Rh)) {
            return false;
        }
        C05440Rh r4 = (C05440Rh) obj;
        return r4.A05 == this.A05 && r4.A06 == this.A06 && r4.A07 == this.A07 && r4.A03 == this.A03 && r4.A04 == this.A04 && r4.A00 == this.A00 && r4.A01 == this.A01 && r4.A02 == this.A02;
    }

    public int hashCode() {
        float f2 = this.A05;
        int i2 = 0;
        int floatToIntBits = (f2 != 0.0f ? Float.floatToIntBits(f2) : 0) * 31;
        float f3 = this.A06;
        int floatToIntBits2 = (floatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
        float f4 = this.A07;
        int floatToIntBits3 = (floatToIntBits2 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
        float f5 = this.A03;
        int floatToIntBits4 = (floatToIntBits3 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
        float f6 = this.A04;
        int floatToIntBits5 = (floatToIntBits4 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
        float f7 = this.A00;
        int floatToIntBits6 = (floatToIntBits5 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
        float f8 = this.A01;
        int floatToIntBits7 = (floatToIntBits6 + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0)) * 31;
        float f9 = this.A02;
        if (f9 != 0.0f) {
            i2 = Float.floatToIntBits(f9);
        }
        return floatToIntBits7 + i2;
    }
}

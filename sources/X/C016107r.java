package X;

import android.view.animation.Interpolator;

/* renamed from: X.07r  reason: invalid class name and case insensitive filesystem */
public abstract class C016107r implements Interpolator {
    public final float A00;
    public final float[] A01;

    public C016107r(float[] fArr) {
        this.A01 = fArr;
        this.A00 = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f2) {
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.A01;
        int length = fArr.length;
        int min = Math.min((int) (((float) (length - 1)) * f2), length - 2);
        float f3 = this.A00;
        float f4 = fArr[min];
        return f4 + (((f2 - (((float) min) * f3)) / f3) * (fArr[min + 1] - f4));
    }
}

package X;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* renamed from: X.0Yy  reason: invalid class name and case insensitive filesystem */
public class C07050Yy implements Interpolator {
    public final float[] A00;
    public final float[] A01;

    public C07050Yy(float f2, float f3, float f4, float f5) {
        Path A0I = AnonymousClass000.A0I();
        A0I.moveTo(0.0f, 0.0f);
        A0I.cubicTo(f2, f3, f4, f5, 1.0f, 1.0f);
        PathMeasure pathMeasure = new PathMeasure(A0I, false);
        float length = pathMeasure.getLength();
        int i2 = ((int) (length / 0.002f)) + 1;
        this.A00 = new float[i2];
        this.A01 = new float[i2];
        float[] fArr = new float[2];
        for (int i3 = 0; i3 < i2; i3++) {
            pathMeasure.getPosTan((((float) i3) * length) / ((float) (i2 - 1)), fArr, (float[]) null);
            this.A00[i3] = fArr[0];
            this.A01[i3] = fArr[1];
        }
    }

    public float getInterpolation(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        int i2 = 0;
        float[] fArr = this.A00;
        int length = fArr.length - 1;
        while (length - i2 > 1) {
            int i3 = (i2 + length) >> 1;
            if (f2 < fArr[i3]) {
                length = i3;
            } else {
                i2 = i3;
            }
        }
        float f3 = fArr[length];
        float f4 = fArr[i2];
        float f5 = f3 - f4;
        if (f5 == 0.0f) {
            return this.A01[i2];
        }
        float[] fArr2 = this.A01;
        float f6 = fArr2[i2];
        return AnonymousClass000.A01(fArr2[length], f6, (f2 - f4) / f5);
    }
}

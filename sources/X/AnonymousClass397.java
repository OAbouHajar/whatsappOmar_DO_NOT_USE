package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.397  reason: invalid class name */
public class AnonymousClass397 {
    public final Matrix A00 = AnonymousClass000.A0H();
    public final AnonymousClass39P A01;
    public final float[] A02 = new float[2];

    public AnonymousClass397(AnonymousClass39P r2) {
        this.A01 = r2;
    }

    public PointF A00(float f2, float f3) {
        Matrix matrix = this.A00;
        matrix.reset();
        AnonymousClass39P r1 = this.A01;
        matrix.preRotate((float) (-r1.A02));
        int i2 = r1.A02;
        float f4 = 0.0f;
        if (i2 == 90) {
            matrix.preTranslate((float) (-((int) r1.A0B.width())), 0.0f);
        } else {
            if (i2 == 180) {
                f4 = (float) (-((int) r1.A0B.width()));
            } else if (i2 != 270) {
                if (i2 != 0) {
                    throw new IllegalArgumentException();
                }
            }
            matrix.preTranslate(f4, (float) (-((int) r1.A0B.height())));
        }
        Rect rect = r1.A05;
        if (rect != null) {
            f2 = ((f2 * ((float) rect.width())) / ((float) r1.A04)) + ((float) rect.left);
            f3 = ((f3 * ((float) rect.height())) / ((float) r1.A03)) + ((float) rect.top);
        }
        float[] fArr = this.A02;
        RectF rectF = r1.A0B;
        fArr[0] = f2 - rectF.left;
        fArr[1] = f3 - rectF.top;
        matrix.mapPoints(fArr);
        RectF rectF2 = r1.A07;
        float f5 = rectF2.left;
        RectF rectF3 = r1.A06;
        float f6 = f5 - rectF3.left;
        float f7 = fArr[0];
        float f8 = r1.A00;
        return new PointF(f6 + (f7 / f8), (rectF2.top - rectF3.top) + (fArr[1] / f8));
    }

    public PointF A01(PointF pointF) {
        float[] fArr = this.A02;
        float f2 = pointF.x;
        AnonymousClass39P r1 = this.A01;
        RectF rectF = r1.A07;
        float f3 = rectF.left;
        RectF rectF2 = r1.A06;
        float f4 = r1.A00;
        fArr[0] = (f2 - (f3 - rectF2.left)) * f4;
        fArr[1] = (pointF.y - (rectF.top - rectF2.top)) * f4;
        Matrix matrix = this.A00;
        matrix.reset();
        int i2 = r1.A02;
        float f5 = 0.0f;
        if (i2 == 90) {
            matrix.preTranslate((float) ((int) r1.A0B.width()), 0.0f);
        } else {
            if (i2 == 180) {
                f5 = (float) ((int) r1.A0B.width());
            } else if (i2 != 270) {
                if (i2 != 0) {
                    throw new IllegalArgumentException();
                }
            }
            matrix.preTranslate(f5, (float) ((int) r1.A0B.height()));
        }
        matrix.preRotate((float) r1.A02);
        matrix.mapPoints(fArr);
        float f6 = fArr[0];
        float f7 = fArr[1];
        RectF rectF3 = r1.A0B;
        float f8 = f6 + rectF3.left;
        float f9 = f7 + rectF3.top;
        Rect rect = r1.A05;
        if (rect != null) {
            f8 = ((f8 - ((float) rect.left)) * ((float) r1.A04)) / ((float) rect.width());
            f9 = ((f9 - ((float) rect.top)) * ((float) r1.A03)) / ((float) rect.height());
        }
        return new PointF(f8, f9);
    }
}

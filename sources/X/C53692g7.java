package X;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: X.2g7  reason: invalid class name and case insensitive filesystem */
public class C53692g7 implements TypeEvaluator {
    public final Matrix A00 = new Matrix();
    public final float[] A01 = new float[9];
    public final float[] A02 = new float[9];

    public /* bridge */ /* synthetic */ Object evaluate(float f2, Object obj, Object obj2) {
        float[] fArr = this.A02;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.A01;
        ((Matrix) obj2).getValues(fArr2);
        int i2 = 0;
        do {
            float f3 = fArr2[i2];
            float f4 = fArr[i2];
            fArr2[i2] = f4 + ((f3 - f4) * f2);
            i2++;
        } while (i2 < 9);
        Matrix matrix = this.A00;
        matrix.setValues(fArr2);
        return matrix;
    }
}

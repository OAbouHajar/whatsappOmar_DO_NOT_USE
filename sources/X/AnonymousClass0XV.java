package X;

import android.animation.TypeEvaluator;

/* renamed from: X.0XV  reason: invalid class name */
public class AnonymousClass0XV implements TypeEvaluator {
    public float[] A00;

    public AnonymousClass0XV(float[] fArr) {
        this.A00 = fArr;
    }

    public /* bridge */ /* synthetic */ Object evaluate(float f2, Object obj, Object obj2) {
        float[] fArr = (float[]) obj;
        float[] fArr2 = (float[]) obj2;
        float[] fArr3 = this.A00;
        for (int i2 = 0; i2 < fArr3.length; i2++) {
            float f3 = fArr[i2];
            fArr3[i2] = f3 + ((fArr2[i2] - f3) * f2);
        }
        return fArr3;
    }
}

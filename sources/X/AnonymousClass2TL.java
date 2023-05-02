package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* renamed from: X.2TL  reason: invalid class name */
public class AnonymousClass2TL {
    public Bitmap A00;
    public Matrix A01;

    public AnonymousClass2TL(Bitmap bitmap) {
        this.A00 = bitmap;
    }

    public boolean A00() {
        Matrix matrix = this.A01;
        if (matrix != null) {
            float[] fArr = {0.0f, 1.0f};
            matrix.mapVectors(fArr);
            if (fArr[0] != 0.0f) {
                return true;
            }
        }
        return false;
    }
}

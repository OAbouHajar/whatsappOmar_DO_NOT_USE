package X;

import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: X.470  reason: invalid class name */
public class AnonymousClass470 {
    public static Matrix A00(Matrix matrix, RectF rectF, float f2) {
        if (matrix == null) {
            matrix = new Matrix();
        } else {
            matrix.reset();
        }
        matrix.setRotate(f2);
        float f3 = 0.0f;
        if (f2 != 90.0f) {
            if (f2 == 180.0f) {
                f3 = -rectF.width();
            } else if (f2 == 270.0f) {
                matrix.preTranslate(-rectF.width(), 0.0f);
                return matrix;
            } else {
                if (f2 != 0.0f) {
                    throw AnonymousClass3K3.A0f();
                }
                return matrix;
            }
        }
        matrix.preTranslate(f3, -rectF.height());
        return matrix;
    }
}

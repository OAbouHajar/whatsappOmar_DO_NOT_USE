package X;

import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: X.5qG  reason: invalid class name and case insensitive filesystem */
public class C115755qG {
    public final Matrix A00;

    public C115755qG(Matrix matrix, int i2, int i3, int i4, int i5) {
        RectF rectF = new RectF(0.0f, 0.0f, (float) i4, (float) i5);
        matrix.mapRect(rectF);
        Matrix matrix2 = new Matrix();
        matrix2.setScale(i2 == 1 ? -1.0f : 1.0f, 1.0f);
        matrix2.postRotate((float) i3);
        Matrix matrix3 = new Matrix();
        matrix3.setRectToRect(new RectF(-1000.0f, -1000.0f, 1000.0f, 1000.0f), rectF, Matrix.ScaleToFit.FILL);
        matrix2.setConcat(matrix3, matrix2);
        Matrix matrix4 = new Matrix();
        this.A00 = matrix4;
        matrix2.invert(matrix4);
    }
}

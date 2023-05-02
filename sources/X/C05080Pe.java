package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.View;

/* renamed from: X.0Pe  reason: invalid class name and case insensitive filesystem */
public class C05080Pe {
    public final Matrix A00 = AnonymousClass000.A0H();
    public final View A01;
    public final float[] A02 = new float[2];

    public C05080Pe(View view) {
        this.A01 = view;
    }

    public PointF A00(PointF pointF) {
        float[] fArr = this.A02;
        float f2 = pointF.x;
        View view = this.A01;
        fArr[0] = f2 - ((float) view.getLeft());
        fArr[1] = pointF.y - ((float) view.getTop());
        Matrix matrix = view.getMatrix();
        Matrix matrix2 = this.A00;
        matrix.invert(matrix2);
        matrix2.mapPoints(fArr);
        return new PointF(fArr[0], fArr[1]);
    }
}

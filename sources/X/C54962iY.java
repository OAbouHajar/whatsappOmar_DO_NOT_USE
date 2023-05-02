package X;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: X.2iY  reason: invalid class name and case insensitive filesystem */
public class C54962iY extends Animation {
    public Camera A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;

    public C54962iY(float f2, float f3, float f4, float f5) {
        this.A04 = f2;
        this.A01 = f3;
        this.A02 = f4;
        this.A03 = f5;
    }

    public void applyTransformation(float f2, Transformation transformation) {
        float f3 = 0.0f + ((this.A04 - 0.0f) * f2);
        Matrix matrix = transformation.getMatrix();
        this.A00.save();
        this.A00.translate(0.0f, 0.0f, (float) (((double) this.A03) * Math.sin(((double) f2) * 3.141592653589793d)));
        this.A00.rotateY(f3);
        this.A00.getMatrix(matrix);
        this.A00.restore();
        float f4 = this.A01;
        float f5 = this.A02;
        matrix.preTranslate(-f4, -f5);
        matrix.postTranslate(f4, f5);
    }

    public void initialize(int i2, int i3, int i4, int i5) {
        super.initialize(i2, i3, i4, i5);
        this.A00 = new Camera();
    }
}

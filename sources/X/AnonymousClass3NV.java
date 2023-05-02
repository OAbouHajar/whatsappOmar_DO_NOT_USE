package X;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;

/* renamed from: X.3NV  reason: invalid class name */
public class AnonymousClass3NV extends Animation {
    public int A00;
    public Camera A01;
    public ImageView A02;
    public boolean A03;

    public AnonymousClass3NV(ImageView imageView, int i2) {
        this.A02 = imageView;
        this.A00 = i2;
    }

    public void applyTransformation(float f2, Transformation transformation) {
        super.applyTransformation(f2, transformation);
        int i2 = ((int) (f2 * 180.0f)) % 360;
        Matrix matrix = transformation.getMatrix();
        this.A01.save();
        Camera camera = this.A01;
        ImageView imageView = this.A02;
        camera.translate(0.0f, 0.0f, (float) (((double) imageView.getWidth()) * Math.sin((((double) i2) * 3.141592653589793d) / 180.0d)));
        Camera camera2 = this.A01;
        float f3 = (float) (i2 + 180);
        if (i2 < 90) {
            f3 = (float) i2;
        }
        camera2.rotateY(f3);
        this.A01.getMatrix(matrix);
        this.A01.restore();
        matrix.preTranslate((float) ((-imageView.getWidth()) >> 1), (float) ((-imageView.getHeight()) >> 1));
        matrix.postTranslate((float) (imageView.getWidth() >> 1), (float) (imageView.getHeight() >> 1));
        if (i2 > 90 && !this.A03) {
            this.A03 = true;
            imageView.setImageResource(this.A00);
        }
    }

    public void initialize(int i2, int i3, int i4, int i5) {
        super.initialize(i2, i3, i4, i5);
        this.A01 = new Camera();
    }
}

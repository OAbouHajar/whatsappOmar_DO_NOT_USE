package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.View;
import com.obwhatsapp.InteractiveAnnotation;
import com.obwhatsapp.mediaview.PhotoView;

/* renamed from: X.4kd  reason: invalid class name and case insensitive filesystem */
public abstract class C94264kd implements View.OnTouchListener {
    public final Matrix A00 = new Matrix();
    public final PhotoView A01;
    public final C16730tY A02;

    public C94264kd(PhotoView photoView, C16730tY r3) {
        this.A02 = r3;
        this.A01 = photoView;
    }

    public abstract void A00(MotionEvent motionEvent);

    public abstract void A01(InteractiveAnnotation interactiveAnnotation);

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 1) {
            PhotoView photoView = this.A01;
            Bitmap photo = photoView.getPhoto();
            if (photo != null) {
                Matrix imageMatrix = photoView.getImageMatrix();
                Matrix matrix = this.A00;
                imageMatrix.invert(matrix);
                float[] fArr = {motionEvent.getRawX() - ((float) photoView.getLeft()), motionEvent.getRawY() - ((float) photoView.getTop())};
                float[] fArr2 = {(float) photo.getWidth(), (float) photo.getHeight()};
                matrix.mapPoints(fArr);
                InteractiveAnnotation A012 = AnonymousClass3A1.A01(this.A02, fArr, fArr2);
                if (A012 != null) {
                    A01(A012);
                }
            }
            A00(motionEvent);
            return true;
        }
        return true;
    }
}

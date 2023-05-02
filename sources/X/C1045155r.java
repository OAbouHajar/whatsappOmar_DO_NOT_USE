package X;

import android.graphics.Matrix;
import com.obwhatsapp.mediaview.PhotoView;

/* renamed from: X.55r  reason: invalid class name and case insensitive filesystem */
public class C1045155r implements Runnable {
    public float A00;
    public long A01;
    public boolean A02;
    public final PhotoView A03;

    public C1045155r(PhotoView photoView) {
        this.A03 = photoView;
    }

    public void run() {
        if (!this.A02) {
            float f2 = this.A00;
            if (f2 != 0.0f) {
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = this.A01;
                float f3 = 0.0f * ((float) (j2 != -1 ? currentTimeMillis - j2 : 0));
                if ((f2 < 0.0f && f2 + f3 > 0.0f) || (f2 > 0.0f && f2 + f3 < 0.0f)) {
                    f3 = 0.0f - f2;
                }
                PhotoView photoView = this.A03;
                photoView.A07 += f3;
                Matrix matrix = photoView.A0B;
                matrix.postRotate(f3, (float) (photoView.getWidth() >> 1), (float) (photoView.getHeight() >> 1));
                photoView.setImageMatrix(matrix);
                float f4 = this.A00 + f3;
                this.A00 = f4;
                if (f4 == 0.0f) {
                    this.A02 = true;
                    photoView.A07 = (float) Math.round(photoView.A07);
                    photoView.A09(true);
                    photoView.requestLayout();
                    photoView.invalidate();
                }
                this.A01 = currentTimeMillis;
            }
            if (!this.A02) {
                this.A03.post(this);
            }
        }
    }
}

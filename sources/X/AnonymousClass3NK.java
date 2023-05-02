package X;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import com.obwhatsapp.qrcode.QrScannerOverlay;

/* renamed from: X.3NK  reason: invalid class name */
public class AnonymousClass3NK extends Animation {
    public final /* synthetic */ QrScannerOverlay A00;

    public AnonymousClass3NK(QrScannerOverlay qrScannerOverlay) {
        this.A00 = qrScannerOverlay;
    }

    public void applyTransformation(float f2, Transformation transformation) {
        QrScannerOverlay qrScannerOverlay = this.A00;
        int width = qrScannerOverlay.getWidth();
        int height = qrScannerOverlay.getHeight();
        int min = (Math.min(width, height) * 3) >> 2;
        int i2 = (width - min) >> 1;
        int i3 = (height - min) >> 1;
        qrScannerOverlay.invalidate(i2, i3, i2 + min, min + i3);
    }
}

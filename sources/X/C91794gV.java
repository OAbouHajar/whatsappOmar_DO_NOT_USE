package X;

import android.media.ImageReader;
import org.pjsip.PjCamera;

/* renamed from: X.4gV  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91794gV implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ PjCamera A00;

    public /* synthetic */ C91794gV(PjCamera pjCamera) {
        this.A00 = pjCamera;
    }

    public final void onImageAvailable(ImageReader imageReader) {
        this.A00.lambda$getImageAvailableListener$1(imageReader);
    }
}

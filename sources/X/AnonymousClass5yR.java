package X;

import android.media.ImageReader;

/* renamed from: X.5yR  reason: invalid class name */
public class AnonymousClass5yR implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ AnonymousClass5zM A00;

    public AnonymousClass5yR(AnonymousClass5zM r1) {
        this.A00 = r1;
    }

    public void onImageAvailable(ImageReader imageReader) {
        AnonymousClass5zM.A00(imageReader, this.A00);
    }
}

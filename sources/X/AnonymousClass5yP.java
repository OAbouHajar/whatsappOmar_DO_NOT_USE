package X;

import android.media.ImageReader;

/* renamed from: X.5yP  reason: invalid class name */
public class AnonymousClass5yP implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ AnonymousClass5zL A00;

    public AnonymousClass5yP(AnonymousClass5zL r1) {
        this.A00 = r1;
    }

    public void onImageAvailable(ImageReader imageReader) {
        AnonymousClass5zL.A00(imageReader, this.A00);
    }
}

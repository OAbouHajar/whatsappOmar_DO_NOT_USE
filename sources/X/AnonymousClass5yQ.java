package X;

import android.media.Image;
import android.media.ImageReader;

/* renamed from: X.5yQ  reason: invalid class name */
public class AnonymousClass5yQ implements ImageReader.OnImageAvailableListener {
    public final /* synthetic */ AnonymousClass5xM A00;

    public AnonymousClass5yQ(AnonymousClass5xM r1) {
        this.A00 = r1;
    }

    public void onImageAvailable(ImageReader imageReader) {
        AnonymousClass5xM r1 = this.A00;
        Image A002 = r1.A00;
        if (A002 != null) {
            A002.close();
        }
        r1.A00 = imageReader.acquireNextImage();
        AnonymousClass5xM.A02(r1);
    }
}

package X;

import android.graphics.Bitmap;
import android.net.Uri;
import com.obwhatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.4yP  reason: invalid class name and case insensitive filesystem */
public class C102104yP implements AnonymousClass2OV {
    public final /* synthetic */ Uri A00;
    public final /* synthetic */ ImageComposerFragment A01;

    public C102104yP(Uri uri, ImageComposerFragment imageComposerFragment) {
        this.A01 = imageComposerFragment;
        this.A00 = uri;
    }

    public String AGT() {
        return this.A01.A00.toString();
    }

    public Bitmap AKB() {
        try {
            Uri uri = this.A00;
            ImageComposerFragment imageComposerFragment = this.A01;
            C14710pd r2 = imageComposerFragment.A09;
            AnonymousClass1A9 r1 = imageComposerFragment.A0M;
            int A02 = r2.A02(1576);
            Bitmap A0W = r1.A0W(uri, A02, A02);
            C30141bo r12 = imageComposerFragment.A07;
            r12.A04 = A0W;
            r12.A0B = false;
            r12.A02();
            return A0W;
        } catch (AnonymousClass20M | IOException | OutOfMemoryError e2) {
            Log.e("ImageComposerFragment/loadbitmap", e2);
            return null;
        }
    }
}

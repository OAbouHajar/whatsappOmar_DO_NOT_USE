package X;

import android.graphics.Matrix;
import com.obwhatsapp.mediacomposer.ImageComposerFragment;
import com.obwhatsapp.mediacomposer.doodle.ImagePreviewContentLayout;

/* renamed from: X.2Km  reason: invalid class name and case insensitive filesystem */
public class C47782Km {
    public final /* synthetic */ ImagePreviewContentLayout A00;

    public C47782Km(ImagePreviewContentLayout imagePreviewContentLayout) {
        this.A00 = imagePreviewContentLayout;
    }

    public void A00(Matrix matrix) {
        ImagePreviewContentLayout imagePreviewContentLayout = this.A00;
        AnonymousClass2Ra r1 = imagePreviewContentLayout.A03;
        r1.A0I.A0A.set(matrix);
        r1.A0H.invalidate();
        imagePreviewContentLayout.invalidate();
    }

    public void A01(boolean z2) {
        C108085Mp r0 = this.A00.A04;
        if (r0 != null) {
            ImageComposerFragment imageComposerFragment = ((C102784zW) r0).A00;
            if (z2) {
                imageComposerFragment.A1M(true, false);
            } else {
                imageComposerFragment.A1M(false, true);
            }
        }
    }
}

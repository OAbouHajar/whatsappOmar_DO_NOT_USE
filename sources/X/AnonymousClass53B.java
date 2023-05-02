package X;

import com.obwhatsapp.mediaview.PhotoView;

/* renamed from: X.53B  reason: invalid class name */
public final /* synthetic */ class AnonymousClass53B implements C108985Qg {
    public final /* synthetic */ PhotoView A00;

    public /* synthetic */ AnonymousClass53B(PhotoView photoView) {
        this.A00 = photoView;
    }

    public final void AUt(boolean z2, int i2) {
        float f2;
        PhotoView photoView = this.A00;
        if (i2 == 3) {
            photoView.setVisibility(8);
            f2 = 0.0f;
        } else if (i2 == 1) {
            photoView.setVisibility(0);
            f2 = 1.0f;
        } else {
            return;
        }
        photoView.setAlpha(f2);
    }
}

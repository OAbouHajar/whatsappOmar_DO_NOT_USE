package X;

import com.obwhatsapp.gallery.MediaGalleryActivity;

/* renamed from: X.2ZC  reason: invalid class name */
public final class AnonymousClass2ZC extends AnonymousClass1LY {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2ZC(C16760tb r2, AnonymousClass10B r3) {
        super(r2, r3);
        C18450wi.A0H(r2, 1);
        C18450wi.A0H(r3, 2);
    }

    public boolean A03(C14550pN r5, C16740tZ r6) {
        int i2;
        C18450wi.A0H(r6, 0);
        if (!(r5 instanceof MediaGalleryActivity)) {
            return super.A03(r5, r6);
        }
        MediaGalleryActivity mediaGalleryActivity = (MediaGalleryActivity) r5;
        C18450wi.A0H(mediaGalleryActivity, 0);
        int i3 = mediaGalleryActivity.A00;
        if (i3 == mediaGalleryActivity.A03) {
            i2 = 4;
        } else if (i3 == mediaGalleryActivity.A01) {
            i2 = 5;
        } else {
            int i4 = mediaGalleryActivity.A02;
            i2 = 3;
            if (i3 == i4) {
                i2 = 6;
            }
        }
        return A02(r5, r6, i2, false);
    }
}

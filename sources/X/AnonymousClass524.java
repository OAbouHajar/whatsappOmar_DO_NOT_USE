package X;

import com.obwhatsapp.R;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.524  reason: invalid class name */
public final /* synthetic */ class AnonymousClass524 implements C38511qu {
    public final /* synthetic */ WeakReference A00;

    public /* synthetic */ AnonymousClass524(WeakReference weakReference) {
        this.A00 = weakReference;
    }

    public final void AXr(boolean z2) {
        C55542jp r3 = (C55542jp) this.A00.get();
        if (r3 != null) {
            StickerStorePackPreviewActivity stickerStorePackPreviewActivity = (StickerStorePackPreviewActivity) r3;
            stickerStorePackPreviewActivity.A0X = false;
            if (z2) {
                stickerStorePackPreviewActivity.A05.A09(R.string.str16a2, 1);
                if (!stickerStorePackPreviewActivity.A0Z) {
                    stickerStorePackPreviewActivity.finish();
                    return;
                }
                return;
            }
            stickerStorePackPreviewActivity.A35();
        }
    }
}

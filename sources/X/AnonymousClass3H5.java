package X;

import android.os.Build;
import com.facebook.redex.IDxDListenerShape159S0100000_2_I1;
import com.obwhatsapp.R;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;

/* renamed from: X.3H5  reason: invalid class name */
public class AnonymousClass3H5 implements C38251qU {
    public final /* synthetic */ StickerStorePackPreviewActivity A00;

    public AnonymousClass3H5(StickerStorePackPreviewActivity stickerStorePackPreviewActivity) {
        this.A00 = stickerStorePackPreviewActivity;
    }

    public static /* synthetic */ void A00(AnonymousClass3H5 r2) {
        StickerStorePackPreviewActivity stickerStorePackPreviewActivity = r2.A00;
        if (!stickerStorePackPreviewActivity.isFinishing() && Build.VERSION.SDK_INT >= 17 && !stickerStorePackPreviewActivity.isDestroyed()) {
            stickerStorePackPreviewActivity.finish();
        }
    }

    public void AXo(C37771pi r2) {
        StickerStorePackPreviewActivity.A02(r2, this.A00);
    }

    public void AXq() {
        StickerStorePackPreviewActivity stickerStorePackPreviewActivity = this.A00;
        if (stickerStorePackPreviewActivity.A38() && !stickerStorePackPreviewActivity.A0G.A01()) {
            stickerStorePackPreviewActivity.A0W = true;
            AnonymousClass1ML.A01(stickerStorePackPreviewActivity.A0H, "sticker_store_pack_preview", C13690nt.A0h(stickerStorePackPreviewActivity));
        } else if (stickerStorePackPreviewActivity.A0Z && !stickerStorePackPreviewActivity.isFinishing() && Build.VERSION.SDK_INT >= 17 && !stickerStorePackPreviewActivity.isDestroyed()) {
            C32241fu A002 = C32241fu.A00(stickerStorePackPreviewActivity);
            A002.A01(R.string.str16a8);
            C13680ns.A1H(A002, this, 112, R.string.str0e87);
            A002.A0C(new IDxDListenerShape159S0100000_2_I1(this, 7));
            C005702l create = A002.create();
            create.setCanceledOnTouchOutside(false);
            create.show();
        }
    }
}

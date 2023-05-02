package X;

import android.content.SharedPreferences;
import com.obwhatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellView;
import java.util.Map;

/* renamed from: X.518  reason: invalid class name */
public final class AnonymousClass518 implements C211813c {
    public final /* synthetic */ AvatarStickerUpsellView A00;

    public AnonymousClass518(AvatarStickerUpsellView avatarStickerUpsellView) {
        this.A00 = avatarStickerUpsellView;
    }

    public void AN2() {
    }

    public void AN3() {
    }

    public /* synthetic */ void AN4(String str) {
    }

    public /* synthetic */ void AN5(String str, Map map) {
    }

    public void AN6(boolean z2) {
        C86254Rw A002 = this.A00.getViewController();
        C13680ns.A0z(((SharedPreferences) A002.A03.A01.getValue()).edit(), "pref_has_dismissed_sticker_upsell", true);
        A002.A01.setVisibility(8);
    }
}

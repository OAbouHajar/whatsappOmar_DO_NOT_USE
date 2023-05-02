package X;

import android.app.Activity;
import android.content.Context;
import com.obwhatsapp.productinfra.avatar.ui.stickers.upsell.AvatarStickerUpsellView;

/* renamed from: X.5Et  reason: invalid class name and case insensitive filesystem */
public final class C106675Et extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AvatarStickerUpsellView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106675Et(Context context, AvatarStickerUpsellView avatarStickerUpsellView) {
        super(0);
        this.$context = context;
        this.this$0 = avatarStickerUpsellView;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        Activity A00 = C19980zJ.A00(this.$context);
        C212013e avatarSharedPreferences = this.this$0.getAvatarSharedPreferences();
        AnonymousClass1ML avatarEditorLauncher = this.this$0.getAvatarEditorLauncher();
        C211613a avatarLogger = this.this$0.getAvatarLogger();
        return new C86254Rw(A00, this.this$0, this.this$0.getAvatarConfigRepository(), avatarSharedPreferences, avatarEditorLauncher, avatarLogger);
    }
}

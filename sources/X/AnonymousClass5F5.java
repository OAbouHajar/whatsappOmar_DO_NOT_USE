package X;

import android.graphics.Bitmap;
import com.obwhatsapp.avatar.home.AvatarHomeViewModel;

/* renamed from: X.5F5  reason: invalid class name */
public final class AnonymousClass5F5 extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ AvatarHomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5F5(AvatarHomeViewModel avatarHomeViewModel) {
        super(1);
        this.this$0 = avatarHomeViewModel;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C18450wi.A0H(bitmap, 0);
        AvatarHomeViewModel.A01(bitmap, this.this$0);
        return AnonymousClass22M.A00;
    }
}

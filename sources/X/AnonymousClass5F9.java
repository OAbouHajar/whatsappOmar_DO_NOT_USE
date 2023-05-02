package X;

import com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.5F9  reason: invalid class name */
public final class AnonymousClass5F9 extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ AvatarProfilePhotoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5F9(AvatarProfilePhotoViewModel avatarProfilePhotoViewModel) {
        super(1);
        this.this$0 = avatarProfilePhotoViewModel;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        Throwable th = (Throwable) obj;
        C18450wi.A0H(th, 0);
        Log.e("AvatarProfilePhotoViewModel/init fetching poses", th);
        Object A01 = this.this$0.A00.A01();
        C18450wi.A0F(A01);
        C18450wi.A0B(A01);
        C89304bw r0 = (C89304bw) A01;
        boolean z2 = r0.A06;
        this.this$0.A00.A0B(new C89304bw(r0.A00, r0.A01, r0.A03, r0.A02, z2, false, true));
        return AnonymousClass22M.A00;
    }
}

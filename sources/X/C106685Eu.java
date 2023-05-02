package X;

import android.content.Context;
import com.obwhatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.5Eu  reason: invalid class name and case insensitive filesystem */
public final class C106685Eu extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ WDSProfilePhoto this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106685Eu(Context context, WDSProfilePhoto wDSProfilePhoto) {
        super(0);
        this.$context = context;
        this.this$0 = wDSProfilePhoto;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        Context context = this.$context;
        AnonymousClass013 whatsAppLocale = this.this$0.getWhatsAppLocale();
        WDSProfilePhoto wDSProfilePhoto = this.this$0;
        C800242g r5 = wDSProfilePhoto.A03;
        C801342r r4 = wDSProfilePhoto.A02;
        boolean z2 = wDSProfilePhoto.A06;
        AnonymousClass2IH r6 = wDSProfilePhoto.A04;
        C18450wi.A0H(context, 0);
        AnonymousClass3K2.A1I(r5, r4);
        return new C88804b7(context, whatsAppLocale, new C95794nI(context, whatsAppLocale, wDSProfilePhoto, r4, r5, r6), r4, r5, z2);
    }
}

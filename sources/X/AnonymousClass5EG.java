package X;

import android.content.SharedPreferences;
import com.obwhatsapp.ctwa.trustsignal.viewmodel.TopBannerViewModel;

/* renamed from: X.5EG  reason: invalid class name */
public final class AnonymousClass5EG extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ TopBannerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5EG(TopBannerViewModel topBannerViewModel) {
        super(0);
        this.this$0 = topBannerViewModel;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        SharedPreferences A00 = this.this$0.A07.A00("ctwa_trust_banner_file");
        C18450wi.A0B(A00);
        return A00;
    }
}

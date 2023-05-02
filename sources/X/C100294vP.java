package X;

import com.facebook.redex.RunnableRunnableShape0S0300000_I0;
import com.facebook.redex.RunnableRunnableShape20S0100000_I1_3;
import com.obwhatsapp.wabloks.commerce.ui.viewmodel.WaExtensionsMetaDataViewModel;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.4vP  reason: invalid class name and case insensitive filesystem */
public final class C100294vP implements AnonymousClass236 {
    public final /* synthetic */ UserJid A00;
    public final /* synthetic */ WaExtensionsMetaDataViewModel A01;
    public final /* synthetic */ String A02;

    public C100294vP(UserJid userJid, WaExtensionsMetaDataViewModel waExtensionsMetaDataViewModel, String str) {
        this.A01 = waExtensionsMetaDataViewModel;
        this.A00 = userJid;
        this.A02 = str;
    }

    public void ALZ(AnonymousClass239 r7) {
        if (r7 != null) {
            List<AnonymousClass238> list = r7.A00;
            String str = this.A02;
            WaExtensionsMetaDataViewModel waExtensionsMetaDataViewModel = this.A01;
            for (AnonymousClass238 r0 : list) {
                if (C18450wi.A0R(r0.A03, str)) {
                    waExtensionsMetaDataViewModel.A02.A0K(new RunnableRunnableShape20S0100000_I1_3(waExtensionsMetaDataViewModel, 22));
                    return;
                }
            }
        }
        WaExtensionsMetaDataViewModel waExtensionsMetaDataViewModel2 = this.A01;
        UserJid userJid = this.A00;
        String str2 = this.A02;
        C17150uc r02 = waExtensionsMetaDataViewModel2.A03;
        C100284vO r4 = new C100284vO(waExtensionsMetaDataViewModel2, str2);
        AnonymousClass16E r3 = r02.A09;
        r3.A07.Acl(new RunnableRunnableShape0S0300000_I0(r3, userJid, r4, 18));
    }
}

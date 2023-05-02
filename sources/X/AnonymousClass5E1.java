package X;

import com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5E1  reason: invalid class name */
public final class AnonymousClass5E1 extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ CatalogSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5E1(CatalogSearchFragment catalogSearchFragment) {
        super(0);
        this.this$0 = catalogSearchFragment;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        String str;
        CatalogSearchFragment catalogSearchFragment = this.this$0;
        UserJid userJid = catalogSearchFragment.A0P;
        if (userJid == null) {
            str = "bizJid";
        } else {
            C16320sq r3 = catalogSearchFragment.A0R;
            if (r3 != null) {
                C24511Gf r2 = catalogSearchFragment.A0I;
                if (r2 != null) {
                    C17170ue r1 = catalogSearchFragment.A0K;
                    if (r1 != null) {
                        return new C49992Xb(r2, r1, userJid, r3);
                    }
                    str = "catalogAnalyticManager";
                } else {
                    str = "cartItemStore";
                }
            } else {
                str = "waWorkers";
            }
        }
        throw C18450wi.A03(str);
    }
}

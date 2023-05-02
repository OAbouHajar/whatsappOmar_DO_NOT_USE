package X;

import com.facebook.redex.IDxCListenerShape366S0100000_2_I1;
import com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5Dz  reason: invalid class name and case insensitive filesystem */
public final class C106475Dz extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ CatalogSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106475Dz(CatalogSearchFragment catalogSearchFragment) {
        super(0);
        this.this$0 = catalogSearchFragment;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        String str;
        CatalogSearchFragment catalogSearchFragment = this.this$0;
        AnonymousClass38V r4 = catalogSearchFragment.A0E;
        if (r4 != null) {
            UserJid userJid = catalogSearchFragment.A0P;
            if (userJid == null) {
                str = "bizJid";
            } else {
                return r4.A00(catalogSearchFragment, new IDxCListenerShape366S0100000_2_I1(catalogSearchFragment, 1), new AnonymousClass3F5(catalogSearchFragment), userJid);
            }
        } else {
            str = "searchResultAdapterFactory";
        }
        throw C18450wi.A03(str);
    }
}

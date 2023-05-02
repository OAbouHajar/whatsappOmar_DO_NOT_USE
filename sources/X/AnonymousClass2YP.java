package X;

import com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2YP  reason: invalid class name */
public final class AnonymousClass2YP extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ CatalogSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2YP(CatalogSearchFragment catalogSearchFragment) {
        super(0);
        this.this$0 = catalogSearchFragment;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        UserJid userJid = this.this$0.A0P;
        if (userJid != null) {
            return AnonymousClass46F.A00(AnonymousClass41H.CATALOG_SEARCH_FLOW, userJid, "catalog_category_dummy_root_id");
        }
        C18450wi.A0O("bizJid");
        throw new RuntimeException("Redex: Unreachable code after no-return invoke");
    }
}

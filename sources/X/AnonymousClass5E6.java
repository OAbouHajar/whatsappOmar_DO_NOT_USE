package X;

import com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragmentV2;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5E6  reason: invalid class name */
public final class AnonymousClass5E6 extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ CatalogSearchFragmentV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5E6(CatalogSearchFragmentV2 catalogSearchFragmentV2) {
        super(0);
        this.this$0 = catalogSearchFragmentV2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        UserJid userJid = this.this$0.A0H;
        if (userJid != null) {
            return AnonymousClass46F.A00(AnonymousClass41H.CATALOG_SEARCH_FLOW, userJid, "catalog_category_dummy_root_id");
        }
        throw C18450wi.A03("bizJid");
    }
}

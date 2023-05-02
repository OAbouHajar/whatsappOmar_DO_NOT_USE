package X;

import android.os.Bundle;
import com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragmentV2;
import com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchProductListFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5F1  reason: invalid class name */
public final class AnonymousClass5F1 extends AnonymousClass1DR implements AnonymousClass1DU {
    public final /* synthetic */ CatalogSearchFragmentV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5F1(CatalogSearchFragmentV2 catalogSearchFragmentV2) {
        super(0);
        this.this$0 = catalogSearchFragmentV2;
    }

    public /* bridge */ /* synthetic */ Object AIT() {
        UserJid userJid = this.this$0.A0H;
        if (userJid == null) {
            throw C18450wi.A03("bizJid");
        }
        Bundle A0D = C13690nt.A0D();
        A0D.putParcelable("category_biz_id", userJid);
        A0D.putInt("business_product_list_entry_point", 3);
        CatalogSearchProductListFragment catalogSearchProductListFragment = new CatalogSearchProductListFragment();
        catalogSearchProductListFragment.A0T(A0D);
        return catalogSearchProductListFragment;
    }
}

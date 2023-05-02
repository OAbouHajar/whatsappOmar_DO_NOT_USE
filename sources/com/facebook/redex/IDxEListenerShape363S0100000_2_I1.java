package com.facebook.redex;

import X.AnonymousClass050;
import X.C108545Ok;
import X.C13680ns;
import X.C18450wi;
import X.C89964dG;
import com.obwhatsapp.R;
import com.obwhatsapp.biz.catalog.view.activity.CatalogCategoryTabsActivity;
import com.obwhatsapp.businesscollection.view.activity.CollectionProductListActivity;
import com.whatsapp.jid.UserJid;

public class IDxEListenerShape363S0100000_2_I1 implements C108545Ok {
    public Object A00;
    public final int A01;

    public IDxEListenerShape363S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AR0(UserJid userJid) {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            CollectionProductListActivity collectionProductListActivity = (CollectionProductListActivity) obj;
            AnonymousClass050 A0O = C13680ns.A0O(collectionProductListActivity);
            A0O.A0E(collectionProductListActivity.A01.A00(userJid, 2), "CatalogSearchFragmentTag", R.id.catalog_search_host);
            A0O.A01();
            return;
        }
        CatalogCategoryTabsActivity catalogCategoryTabsActivity = (CatalogCategoryTabsActivity) obj;
        AnonymousClass050 A0O2 = C13680ns.A0O(catalogCategoryTabsActivity);
        C89964dG r2 = catalogCategoryTabsActivity.A02;
        if (r2 != null) {
            A0O2.A0E(r2.A00(catalogCategoryTabsActivity.A35(), 1), "CategoryTabsSearchFragmentTag", R.id.catalog_search_host);
            A0O2.A01();
            return;
        }
        throw C18450wi.A03("catalogSearchFragmentFactory");
    }
}

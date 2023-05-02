package X;

import com.obwhatsapp.R;
import com.obwhatsapp.biz.catalog.view.activity.CatalogListActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4vo  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C100544vo implements C108545Ok {
    public final /* synthetic */ CatalogListActivity A00;

    public /* synthetic */ C100544vo(CatalogListActivity catalogListActivity) {
        this.A00 = catalogListActivity;
    }

    public final void AR0(UserJid userJid) {
        CatalogListActivity catalogListActivity = this.A00;
        AnonymousClass050 A0O = C13680ns.A0O(catalogListActivity);
        A0O.A0E(catalogListActivity.A09.A00(userJid, 0), "CatalogSearchFragmentTag", R.id.catalog_search_host);
        A0O.A01();
    }
}

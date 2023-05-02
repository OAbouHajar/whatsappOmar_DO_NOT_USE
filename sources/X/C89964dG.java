package X;

import android.os.Bundle;
import com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragmentV2;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4dG  reason: invalid class name and case insensitive filesystem */
public final class C89964dG {
    public final AnonymousClass4DS A00;

    public C89964dG(AnonymousClass4DS r1) {
        this.A00 = r1;
    }

    public final AnonymousClass01A A00(UserJid userJid, int i2) {
        C18450wi.A0H(userJid, 0);
        boolean A0C = this.A00.A00.A0C(2271);
        Bundle A0D = C13690nt.A0D();
        A0D.putParcelable("category_biz_id", userJid);
        if (A0C) {
            A0D.putInt("search_entry_point", i2);
            CatalogSearchFragmentV2 catalogSearchFragmentV2 = new CatalogSearchFragmentV2();
            catalogSearchFragmentV2.A0T(A0D);
            return catalogSearchFragmentV2;
        }
        A0D.putInt("search_entry_point", i2);
        CatalogSearchFragment catalogSearchFragment = new CatalogSearchFragment();
        catalogSearchFragment.A0T(A0D);
        return catalogSearchFragment;
    }
}

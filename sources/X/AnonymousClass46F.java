package X;

import android.os.Bundle;
import com.obwhatsapp.catalogcategory.view.fragment.CatalogAllCategoryFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.46F  reason: invalid class name */
public final class AnonymousClass46F {
    public static final CatalogAllCategoryFragment A00(AnonymousClass41H r3, UserJid userJid, String str) {
        C18450wi.A0H(r3, 2);
        Bundle A0D = C13690nt.A0D();
        A0D.putString("parent_category_id", str);
        A0D.putParcelable("category_biz_id", userJid);
        A0D.putString("category_display_context", r3.name());
        CatalogAllCategoryFragment catalogAllCategoryFragment = new CatalogAllCategoryFragment();
        catalogAllCategoryFragment.A0T(A0D);
        return catalogAllCategoryFragment;
    }
}

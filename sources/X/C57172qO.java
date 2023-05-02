package X;

import android.os.Bundle;
import com.obwhatsapp.businessproductlist.view.fragment.CollectionProductListFragment;
import com.obwhatsapp.catalogcategory.view.fragment.CatalogCategoryExpandableGroupsListFragment;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.2qO  reason: invalid class name and case insensitive filesystem */
public final class C57172qO extends AnonymousClass0GX {
    public List A00;

    public C57172qO(AnonymousClass02C r1) {
        super(r1);
    }

    public int A01() {
        List list = this.A00;
        if (list != null) {
            return list.size();
        }
        throw C18450wi.A03("tabItemsList");
    }

    public /* bridge */ /* synthetic */ CharSequence A04(int i2) {
        List list = this.A00;
        if (list != null) {
            return ((AnonymousClass4WJ) list.get(i2)).A02;
        }
        throw C18450wi.A03("tabItemsList");
    }

    public AnonymousClass01A A0F(int i2) {
        List list = this.A00;
        if (list == null) {
            throw C18450wi.A03("tabItemsList");
        }
        AnonymousClass4WJ r1 = (AnonymousClass4WJ) list.get(i2);
        if (r1.A03) {
            UserJid userJid = r1.A00;
            String str = r1.A01;
            Bundle A0D = C13690nt.A0D();
            A0D.putParcelable("category_biz_id", userJid);
            A0D.putString("collection-id", str);
            A0D.putString("collection-index", (String) null);
            A0D.putInt("business_product_list_entry_point", 2);
            A0D.putInt("category_browsing_entry_point", 3);
            A0D.putInt("category_level", 1);
            CollectionProductListFragment collectionProductListFragment = new CollectionProductListFragment();
            collectionProductListFragment.A0T(A0D);
            return collectionProductListFragment;
        }
        String str2 = r1.A01;
        UserJid userJid2 = r1.A00;
        Bundle A0D2 = C13690nt.A0D();
        A0D2.putString("parent_category_id", str2);
        A0D2.putParcelable("category_biz_id", userJid2);
        CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment = new CatalogCategoryExpandableGroupsListFragment();
        catalogCategoryExpandableGroupsListFragment.A0T(A0D2);
        return catalogCategoryExpandableGroupsListFragment;
    }
}

package X;

import android.widget.ExpandableListView;
import com.obwhatsapp.catalogcategory.view.fragment.CatalogCategoryExpandableGroupsListFragment;

/* renamed from: X.4lT  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94784lT implements ExpandableListView.OnGroupExpandListener {
    public final /* synthetic */ CatalogCategoryExpandableGroupsListFragment A00;

    public /* synthetic */ C94784lT(CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment) {
        this.A00 = catalogCategoryExpandableGroupsListFragment;
    }

    public final void onGroupExpand(int i2) {
        this.A00.A00 = i2;
    }
}

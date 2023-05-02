package X;

import android.widget.ExpandableListView;
import com.obwhatsapp.catalogcategory.view.fragment.CatalogCategoryExpandableGroupsListFragment;

/* renamed from: X.4lS  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94774lS implements ExpandableListView.OnGroupCollapseListener {
    public final /* synthetic */ CatalogCategoryExpandableGroupsListFragment A00;

    public /* synthetic */ C94774lS(CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment) {
        this.A00 = catalogCategoryExpandableGroupsListFragment;
    }

    public final void onGroupCollapse(int i2) {
        this.A00.A00 = -1;
    }
}

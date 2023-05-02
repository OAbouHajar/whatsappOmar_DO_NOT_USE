package X;

import android.view.View;
import android.widget.ExpandableListView;
import com.facebook.redex.IDxObserverShape116S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.catalogcategory.view.fragment.CatalogCategoryExpandableGroupsListFragment;
import com.obwhatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4lR  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94764lR implements ExpandableListView.OnGroupClickListener {
    public final /* synthetic */ CatalogCategoryExpandableGroupsListFragment A00;

    public /* synthetic */ C94764lR(CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment) {
        this.A00 = catalogCategoryExpandableGroupsListFragment;
    }

    public final boolean onGroupClick(ExpandableListView expandableListView, View view, int i2, long j2) {
        C73113nK r1;
        CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment = this.A00;
        C64293No r0 = catalogCategoryExpandableGroupsListFragment.A04;
        if (r0 == null) {
            throw C18450wi.A03("expandableListAdapter");
        }
        int i3 = i2;
        if (r0.getGroupType(i3) == 3) {
            CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel = (CatalogCategoryGroupsViewModel) catalogCategoryExpandableGroupsListFragment.A08.getValue();
            C82594Dk r02 = (C82594Dk) catalogCategoryGroupsViewModel.A00.A01();
            if (r02 == null) {
                return true;
            }
            Object obj = r02.A00.get(i3);
            if (!(obj instanceof C73113nK) || (r1 = (C73113nK) obj) == null) {
                return true;
            }
            AnonymousClass4N4 r03 = r1.A00;
            UserJid userJid = r1.A01;
            AnonymousClass1KV r3 = catalogCategoryGroupsViewModel.A04;
            String str = r03.A01;
            r3.A01(userJid, str, 2, 3, i3, r03.A04);
            C30801cy r2 = catalogCategoryGroupsViewModel.A06;
            C18450wi.A0A(str);
            String str2 = r03.A02;
            C18450wi.A0A(str2);
            r2.A0B(new C73263nb(userJid, str, str2, 2));
            return true;
        }
        int i4 = catalogCategoryExpandableGroupsListFragment.A00;
        if (i4 != i3) {
            if (i4 != -1) {
                ExpandableListView expandableListView2 = catalogCategoryExpandableGroupsListFragment.A01;
                if (expandableListView2 != null) {
                    expandableListView2.collapseGroup(i4);
                }
            }
            C15220qW r32 = catalogCategoryExpandableGroupsListFragment.A08;
            if (C18450wi.A0R(((CatalogCategoryGroupsViewModel) r32.getValue()).A02.A01(), Boolean.TRUE)) {
                C32241fu A0R = AnonymousClass3K2.A0R(catalogCategoryExpandableGroupsListFragment);
                A0R.A01(R.string.str03c5);
                A0R.A0F(catalogCategoryExpandableGroupsListFragment.A0H(), new IDxObserverShape116S0100000_2_I1(catalogCategoryExpandableGroupsListFragment, 56), R.string.str03c4);
                A0R.A00();
                return true;
            }
            CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel2 = (CatalogCategoryGroupsViewModel) r32.getValue();
            AnonymousClass028 r12 = catalogCategoryGroupsViewModel2.A00;
            if (r12.A01() instanceof C73233nY) {
                Object A01 = r12.A01();
                if (A01 != null) {
                    C73123nL r13 = (C73123nL) ((C73233nY) A01).A00.get(i3);
                    AnonymousClass4N4 r04 = r13.A00;
                    catalogCategoryGroupsViewModel2.A04.A01(r13.A01, r04.A01, 2, 3, i3, r04.A04);
                } else {
                    throw AnonymousClass000.A0W("null cannot be cast to non-null type com.obwhatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupListState.CategoryGroupsWithChildItems");
                }
            }
            ExpandableListView expandableListView3 = catalogCategoryExpandableGroupsListFragment.A01;
            if (expandableListView3 != null) {
                expandableListView3.smoothScrollToPosition(i3);
                ExpandableListView expandableListView4 = catalogCategoryExpandableGroupsListFragment.A01;
                if (expandableListView4 != null) {
                    expandableListView4.expandGroup(i3);
                    return true;
                }
            }
        } else {
            ExpandableListView expandableListView5 = catalogCategoryExpandableGroupsListFragment.A01;
            if (expandableListView5 != null) {
                expandableListView5.collapseGroup(i3);
                return true;
            }
        }
        throw C18450wi.A03("expandableListView");
    }
}

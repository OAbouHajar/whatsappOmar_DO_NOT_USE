package X;

import android.view.View;
import android.widget.ExpandableListView;
import com.obwhatsapp.catalogcategory.view.fragment.CatalogCategoryExpandableGroupsListFragment;
import com.obwhatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.4lQ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94754lQ implements ExpandableListView.OnChildClickListener {
    public final /* synthetic */ CatalogCategoryExpandableGroupsListFragment A00;

    public /* synthetic */ C94754lQ(CatalogCategoryExpandableGroupsListFragment catalogCategoryExpandableGroupsListFragment) {
        this.A00 = catalogCategoryExpandableGroupsListFragment;
    }

    public final boolean onChildClick(ExpandableListView expandableListView, View view, int i2, int i3, long j2) {
        C73233nY r3;
        C73123nL r1;
        CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel = (CatalogCategoryGroupsViewModel) this.A00.A08.getValue();
        Object A01 = catalogCategoryGroupsViewModel.A00.A01();
        if (!(A01 instanceof C73233nY) || (r3 = (C73233nY) A01) == null) {
            return true;
        }
        Object obj = r3.A00.get(i2);
        if (!(obj instanceof C73123nL) || (r1 = (C73123nL) obj) == null) {
            return true;
        }
        String str = r1.A00.A01;
        C18450wi.A0A(str);
        C73113nK r12 = (C73113nK) ((List) C25411Jr.A00(r3.A01, str)).get(i3);
        AnonymousClass4N4 r0 = r12.A00;
        UserJid userJid = r12.A01;
        AnonymousClass1KV r32 = catalogCategoryGroupsViewModel.A04;
        String str2 = r0.A01;
        r32.A01(userJid, str2, 3, 3, i3, r0.A04);
        C30801cy r2 = catalogCategoryGroupsViewModel.A06;
        C18450wi.A0A(str2);
        String str3 = r0.A02;
        C18450wi.A0A(str3);
        r2.A0B(new C73263nb(userJid, str2, str3, 3));
        return true;
    }
}

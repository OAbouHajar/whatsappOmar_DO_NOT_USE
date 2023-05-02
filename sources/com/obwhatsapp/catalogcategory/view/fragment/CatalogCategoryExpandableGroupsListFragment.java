package com.obwhatsapp.catalogcategory.view.fragment;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass028;
import X.AnonymousClass3K4;
import X.AnonymousClass4CY;
import X.C106455Dx;
import X.C106465Dy;
import X.C13680ns;
import X.C15220qW;
import X.C18450wi;
import X.C19980zJ;
import X.C32521gW;
import X.C64293No;
import X.C73093nI;
import X.C73223nX;
import X.C73243nZ;
import X.C82594Dk;
import X.C94754lQ;
import X.C94764lR;
import X.C94774lS;
import X.C94784lT;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import com.facebook.redex.RunnableRunnableShape1S1200000_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.catalogcategory.view.CategoryThumbnailLoader;
import com.obwhatsapp.catalogcategory.view.viewmodel.CatalogCategoryGroupsViewModel;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public final class CatalogCategoryExpandableGroupsListFragment extends Hilt_CatalogCategoryExpandableGroupsListFragment {
    public int A00 = -1;
    public ExpandableListView A01;
    public C19980zJ A02;
    public AnonymousClass4CY A03;
    public C64293No A04;
    public UserJid A05;
    public String A06;
    public final C15220qW A07 = C32521gW.A00(new C106455Dx(this));
    public final C15220qW A08 = C32521gW.A00(new C106465Dy(this));

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18450wi.A0H(layoutInflater, 0);
        View A0K = AnonymousClass3K4.A0K(layoutInflater, viewGroup, R.layout.layout029c);
        this.A01 = (ExpandableListView) C18450wi.A00(A0K, R.id.expandable_list_catalog_category);
        C64293No r1 = new C64293No((CategoryThumbnailLoader) this.A07.getValue());
        this.A04 = r1;
        ExpandableListView expandableListView = this.A01;
        if (expandableListView != null) {
            expandableListView.setAdapter(r1);
            ExpandableListView expandableListView2 = this.A01;
            if (expandableListView2 != null) {
                expandableListView2.setOnChildClickListener(new C94754lQ(this));
                ExpandableListView expandableListView3 = this.A01;
                if (expandableListView3 != null) {
                    expandableListView3.setOnGroupClickListener(new C94764lR(this));
                    ExpandableListView expandableListView4 = this.A01;
                    if (expandableListView4 != null) {
                        expandableListView4.setOnGroupExpandListener(new C94784lT(this));
                        ExpandableListView expandableListView5 = this.A01;
                        if (expandableListView5 != null) {
                            expandableListView5.setOnGroupCollapseListener(new C94774lS(this));
                            return A0K;
                        }
                    }
                }
            }
        }
        throw C18450wi.A03("expandableListView");
    }

    public void A14() {
        String str;
        super.A14();
        int i2 = this.A00;
        if (i2 != -1) {
            ExpandableListView expandableListView = this.A01;
            if (expandableListView == null) {
                str = "expandableListView";
                throw C18450wi.A03(str);
            }
            expandableListView.expandGroup(i2);
        }
        CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel = (CatalogCategoryGroupsViewModel) this.A08.getValue();
        UserJid userJid = this.A05;
        if (userJid == null) {
            str = "bizJid";
            throw C18450wi.A03(str);
        }
        C82594Dk r1 = (C82594Dk) catalogCategoryGroupsViewModel.A00.A01();
        if (r1 instanceof C73243nZ) {
            catalogCategoryGroupsViewModel.A05(userJid, ((C73243nZ) r1).A00);
        }
    }

    public void A17(Bundle bundle) {
        String str;
        super.A17(bundle);
        String string = A04().getString("parent_category_id");
        AnonymousClass00B.A06(string);
        C18450wi.A0B(string);
        this.A06 = string;
        Parcelable parcelable = A04().getParcelable("category_biz_id");
        AnonymousClass00B.A06(parcelable);
        C18450wi.A0B(parcelable);
        this.A05 = (UserJid) parcelable;
        CatalogCategoryGroupsViewModel catalogCategoryGroupsViewModel = (CatalogCategoryGroupsViewModel) this.A08.getValue();
        String str2 = this.A06;
        if (str2 == null) {
            str = "categoryParentId";
        } else {
            UserJid userJid = this.A05;
            if (userJid == null) {
                str = "bizJid";
            } else {
                AnonymousClass028 r3 = (AnonymousClass028) catalogCategoryGroupsViewModel.A08.getValue();
                ArrayList A0u = AnonymousClass000.A0u();
                int i2 = 0;
                do {
                    i2++;
                    A0u.add(new C73093nI());
                } while (i2 < 5);
                r3.A0B(new C73223nX(A0u));
                catalogCategoryGroupsViewModel.A07.Acl(new RunnableRunnableShape1S1200000_I1(catalogCategoryGroupsViewModel, str2, userJid, 6));
                return;
            }
        }
        throw C18450wi.A03(str);
    }

    public void A18(Bundle bundle, View view) {
        C18450wi.A0H(view, 0);
        C15220qW r3 = this.A08;
        C13680ns.A1N(A0H(), ((CatalogCategoryGroupsViewModel) r3.getValue()).A00, this, 57);
        C13680ns.A1N(A0H(), ((CatalogCategoryGroupsViewModel) r3.getValue()).A01, this, 58);
        C13680ns.A1N(A0H(), ((CatalogCategoryGroupsViewModel) r3.getValue()).A02, this, 59);
    }
}

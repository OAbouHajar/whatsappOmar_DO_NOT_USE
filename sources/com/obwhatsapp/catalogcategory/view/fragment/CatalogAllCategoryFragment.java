package com.obwhatsapp.catalogcategory.view.fragment;

import X.AnonymousClass000;
import X.AnonymousClass028;
import X.AnonymousClass3K4;
import X.AnonymousClass41H;
import X.AnonymousClass4CY;
import X.AnonymousClass5D9;
import X.C106435Dv;
import X.C106445Dw;
import X.C13680ns;
import X.C15220qW;
import X.C18450wi;
import X.C19980zJ;
import X.C32521gW;
import X.C64523Qq;
import X.C73093nI;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.RunnableRunnableShape1S1300000_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.catalogcategory.view.CategoryThumbnailLoader;
import com.obwhatsapp.catalogcategory.view.viewmodel.CatalogAllCategoryViewModel;
import java.util.ArrayList;

public final class CatalogAllCategoryFragment extends Hilt_CatalogAllCategoryFragment {
    public RecyclerView A00;
    public C19980zJ A01;
    public AnonymousClass4CY A02;
    public C64523Qq A03;
    public final C15220qW A04 = C32521gW.A00(new C106435Dv(this));
    public final C15220qW A05 = C32521gW.A00(new C106445Dw(this));

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18450wi.A0H(layoutInflater, 0);
        View A0K = AnonymousClass3K4.A0K(layoutInflater, viewGroup, R.layout.layout0293);
        RecyclerView recyclerView = (RecyclerView) C18450wi.A00(A0K, R.id.list_all_category);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.A0h = true;
        this.A00 = recyclerView;
        C64523Qq r1 = new C64523Qq((CategoryThumbnailLoader) this.A04.getValue(), new AnonymousClass5D9(this.A05.getValue()));
        this.A03 = r1;
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 == null) {
            throw C18450wi.A03("recyclerView");
        }
        recyclerView2.setAdapter(r1);
        return A0K;
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        String string = A04().getString("parent_category_id");
        Parcelable parcelable = A04().getParcelable("category_biz_id");
        Bundle A042 = A04();
        AnonymousClass41H r2 = AnonymousClass41H.CATALOG_CATEGORY_FLOW;
        String string2 = A042.getString("category_display_context", "CATALOG_CATEGORY_FLOW");
        C18450wi.A0B(string2);
        AnonymousClass41H valueOf = AnonymousClass41H.valueOf(string2);
        if (string == null || parcelable == null) {
            throw AnonymousClass000.A0T("Required categoryParentId and bizJid not found");
        }
        CatalogAllCategoryViewModel catalogAllCategoryViewModel = (CatalogAllCategoryViewModel) this.A05.getValue();
        int i2 = 0;
        C18450wi.A0H(valueOf, 2);
        C13680ns.A1O((AnonymousClass028) catalogAllCategoryViewModel.A08.getValue(), 0);
        if (valueOf == r2) {
            AnonymousClass028 r4 = (AnonymousClass028) catalogAllCategoryViewModel.A07.getValue();
            ArrayList A0u = AnonymousClass000.A0u();
            do {
                i2++;
                A0u.add(new C73093nI());
            } while (i2 < 5);
            r4.A0B(A0u);
        }
        catalogAllCategoryViewModel.A06.Acl(new RunnableRunnableShape1S1300000_I1(4, string, catalogAllCategoryViewModel, parcelable, valueOf));
    }

    public void A18(Bundle bundle, View view) {
        C18450wi.A0H(view, 0);
        C15220qW r3 = this.A05;
        C13680ns.A1N(A0H(), ((CatalogAllCategoryViewModel) r3.getValue()).A01, this, 54);
        C13680ns.A1N(A0H(), ((CatalogAllCategoryViewModel) r3.getValue()).A00, this, 55);
        C13680ns.A1N(A0H(), ((CatalogAllCategoryViewModel) r3.getValue()).A02, this, 53);
    }
}

package com.obwhatsapp.catalogsearch.view.fragment;

import X.AnonymousClass1DV;
import X.AnonymousClass2XU;
import X.AnonymousClass5EA;
import X.C15220qW;
import com.obwhatsapp.businessproductlist.view.adapter.BusinessProductListAdapter;

public final class CatalogSearchProductListFragment extends Hilt_CatalogSearchProductListFragment {
    public final C15220qW A00 = new AnonymousClass1DV(new AnonymousClass5EA(this));

    public final void A1I() {
        AnonymousClass2XU A1C = A1C();
        if (A1C instanceof BusinessProductListAdapter) {
            A1C.A00.clear();
            A1C.A06.clear();
            A1C.A01();
        }
    }
}

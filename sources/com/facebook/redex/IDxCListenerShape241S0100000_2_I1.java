package com.facebook.redex;

import X.C15220qW;
import X.C42821yj;
import android.view.View;
import com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragmentV2;
import com.obwhatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel;

public class IDxCListenerShape241S0100000_2_I1 implements View.OnFocusChangeListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape241S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onFocusChange(View view, boolean z2) {
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                CatalogSearchFragmentV2 catalogSearchFragmentV2 = (CatalogSearchFragmentV2) obj;
                if (z2) {
                    C15220qW r0 = catalogSearchFragmentV2.A0M;
                    CatalogSearchViewModel catalogSearchViewModel = (CatalogSearchViewModel) r0.getValue();
                    String str = (String) ((CatalogSearchViewModel) r0.getValue()).A00.A01();
                    if (str == null) {
                        str = "";
                    }
                    catalogSearchViewModel.A09(str);
                    return;
                }
                return;
            case 1:
                IDxCallbackShape333S0100000_1_I0 iDxCallbackShape333S0100000_1_I0 = (IDxCallbackShape333S0100000_1_I0) obj;
                if (z2) {
                    ((C42821yj) iDxCallbackShape333S0100000_1_I0.A00).A0t();
                    return;
                }
                return;
            default:
                View view2 = (View) obj;
                if (z2) {
                    view2.requestLayout();
                    return;
                }
                return;
        }
    }
}

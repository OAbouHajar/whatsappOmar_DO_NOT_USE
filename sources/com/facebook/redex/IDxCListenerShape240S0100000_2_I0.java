package com.facebook.redex;

import X.AnonymousClass2Ut;
import X.C23061Ai;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.Window;
import com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragment;
import com.obwhatsapp.catalogsearch.view.viewmodel.CatalogSearchViewModel;
import com.obwhatsapp.search.views.TokenizedSearchInput;

public class IDxCListenerShape240S0100000_2_I0 implements View.OnFocusChangeListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape240S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onFocusChange(View view, boolean z2) {
        Window window;
        int i2;
        switch (this.A01) {
            case 0:
                CatalogSearchFragment catalogSearchFragment = (CatalogSearchFragment) this.A00;
                if (z2) {
                    ((CatalogSearchViewModel) catalogSearchFragment.A0b.getValue()).A09(catalogSearchFragment.A1B());
                    return;
                }
                return;
            case 1:
                AnonymousClass2Ut r2 = (AnonymousClass2Ut) this.A00;
                Drawable background = r2.A0A.getBackground();
                int i3 = 204;
                if (z2) {
                    i3 = 230;
                }
                background.setAlpha(i3);
                C23061Ai r0 = r2.A0E;
                if (z2) {
                    r0.A02(view);
                    window = r2.A02.getWindow();
                    i2 = 5;
                } else {
                    r0.A01(view);
                    window = r2.A02.getWindow();
                    i2 = 3;
                }
                window.setSoftInputMode(i2);
                return;
            default:
                ((TokenizedSearchInput) this.A00).A0C.A0Y(z2);
                return;
        }
    }
}

package com.obwhatsapp.shops;

import X.AnonymousClass000;
import X.C13680ns;
import android.os.Bundle;
import android.view.View;
import com.obwhatsapp.wabloks.base.BkFragment;

public abstract class ShopsBkFragment extends BkFragment {
    public void A13() {
        super.A13();
        ShopsBkLayoutViewModel shopsBkLayoutViewModel = (ShopsBkLayoutViewModel) this.A05;
        if (shopsBkLayoutViewModel.A01) {
            shopsBkLayoutViewModel.A01.A04(A0H());
            return;
        }
        throw AnonymousClass000.A0V("BkLayoutViewModel must be initialized");
    }

    public void A18(Bundle bundle, View view) {
        super.A18(bundle, view);
        ShopsBkLayoutViewModel shopsBkLayoutViewModel = (ShopsBkLayoutViewModel) this.A05;
        if (shopsBkLayoutViewModel.A01) {
            C13680ns.A1N(A0H(), shopsBkLayoutViewModel.A01, this, 130);
            return;
        }
        throw AnonymousClass000.A0V("BkLayoutViewModel must be initialized");
    }

    public Class A1A() {
        return ShopsBkLayoutViewModel.class;
    }
}

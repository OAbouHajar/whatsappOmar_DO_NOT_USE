package com.obwhatsapp.wabloks.ui.PrivacyNotice;

import X.AnonymousClass01D;
import X.AnonymousClass2WZ;
import X.C18260wP;
import X.C30801cy;
import com.obwhatsapp.shops.ShopsBkLayoutViewModel;

public class PrivacyNoticeFragmentViewModel extends ShopsBkLayoutViewModel {
    public final C30801cy A00 = C30801cy.A01();

    public PrivacyNoticeFragmentViewModel(C18260wP r2, AnonymousClass01D r3) {
        super(r2, r3);
    }

    public boolean A05(AnonymousClass2WZ r3) {
        int i2 = r3.A00;
        if (i2 != 3 && i2 != 4 && i2 != 6 && i2 != 7) {
            return super.A05(r3);
        }
        this.A00.A0B((Object) null);
        return false;
    }
}

package com.facebook.redex;

import X.AnonymousClass068;
import com.obwhatsapp.businessdirectory.view.fragment.BusinessDirectorySearchFragment;
import com.obwhatsapp.userban.ui.fragment.BanAppealFormFragment;

public class IDxPCallbackShape18S0100000_2_I1 extends AnonymousClass068 {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxPCallbackShape18S0100000_2_I1(Object obj, int i2) {
        super(true);
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00() {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            ((BanAppealFormFragment) obj).A05.A07();
        } else {
            ((BusinessDirectorySearchFragment) obj).A0B.A07();
        }
    }
}

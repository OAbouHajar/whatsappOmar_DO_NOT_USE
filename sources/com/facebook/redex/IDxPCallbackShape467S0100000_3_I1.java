package com.facebook.redex;

import X.C109035Ql;
import X.C1207362u;
import com.obwhatsapp.wabloks.ui.FcsBottomsheetBaseContainer;
import com.obwhatsapp.wabloks.ui.WaBloksActivity;

public class IDxPCallbackShape467S0100000_3_I1 implements C109035Ql {
    public Object A00;
    public final int A01;

    public IDxPCallbackShape467S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AN9() {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            ((WaBloksActivity) obj).onBackPressed();
        } else {
            ((FcsBottomsheetBaseContainer) obj).A03.A02(((FcsBottomsheetBaseContainer) obj).A04().getString("fds_observer_id")).A01(new C1207362u(((FcsBottomsheetBaseContainer) obj).A07, ((FcsBottomsheetBaseContainer) obj).A09, true));
        }
    }
}

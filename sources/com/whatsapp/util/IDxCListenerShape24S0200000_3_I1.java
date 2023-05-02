package com.whatsapp.util;

import X.AnonymousClass1K6;
import X.AnonymousClass2ZU;
import X.C000900k;
import X.C110115dX;
import X.C113125lX;
import X.C34331k5;
import android.view.View;
import com.facebook.redex.IDxEWrapperShape176S0100000_3_I1;
import com.obwhatsapp.wabloks.ui.BkActionBottomSheet;

public class IDxCListenerShape24S0200000_3_I1 extends C34331k5 {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape24S0200000_3_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void A06(View view) {
        if (this.A02 != 0) {
            IDxEWrapperShape176S0100000_3_I1 iDxEWrapperShape176S0100000_3_I1 = new IDxEWrapperShape176S0100000_3_I1(this.A01, 1);
            if (iDxEWrapperShape176S0100000_3_I1.A9V() != null) {
                BkActionBottomSheet bkActionBottomSheet = (BkActionBottomSheet) this.A00;
                AnonymousClass2ZU r3 = bkActionBottomSheet.A00;
                AnonymousClass1K6.A0A(C110115dX.A0A((C000900k) bkActionBottomSheet.A0C(), bkActionBottomSheet.A0G(), r3, bkActionBottomSheet.A04), iDxEWrapperShape176S0100000_3_I1);
                return;
            }
            return;
        }
        C113125lX r0 = (C113125lX) this.A01;
        r0.A01.AUb(r0.A00, r0.A02, r0.A03, r0.A04, r0.A05);
    }
}

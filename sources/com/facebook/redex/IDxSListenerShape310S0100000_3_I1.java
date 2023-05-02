package com.facebook.redex;

import X.AnonymousClass1Z7;
import X.AnonymousClass2HF;
import X.AnonymousClass610;
import X.C13690nt;
import X.C30671cl;
import com.obwhatsapp.payments.ui.BrazilPaymentActivity;
import java.util.List;

public class IDxSListenerShape310S0100000_3_I1 implements AnonymousClass2HF {
    public Object A00;
    public final int A01;

    public IDxSListenerShape310S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AMM(List list) {
        if (this.A01 != 0) {
            BrazilPaymentActivity brazilPaymentActivity = ((AnonymousClass610) this.A00).A00;
            brazilPaymentActivity.Ac1();
            if (brazilPaymentActivity.A0U != null && list.size() > 0) {
                brazilPaymentActivity.A0U.AUY((C30671cl) C13690nt.A0Z(list));
                return;
            }
            return;
        }
        ((AnonymousClass1Z7) this.A00).A00("on_success");
    }
}

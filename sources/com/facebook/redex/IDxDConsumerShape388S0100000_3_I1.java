package com.facebook.redex;

import X.AnonymousClass2HF;
import X.AnonymousClass5QA;
import X.C110115dX;
import X.C111815hS;
import X.C18290wS;
import X.C28371Vv;
import X.C30671cl;
import com.obwhatsapp.payments.ui.BrazilPaymentActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentCardDetailsActivity;

public class IDxDConsumerShape388S0100000_3_I1 implements AnonymousClass5QA {
    public Object A00;
    public final int A01;

    public IDxDConsumerShape388S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void Aas(C28371Vv r5) {
        C28371Vv A0J;
        C30671cl A0E;
        C18290wS r0;
        C28371Vv A0J2;
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = (BrazilPaymentCardDetailsActivity) obj;
            C28371Vv A0J3 = r5.A0J("pay");
            if (A0J3 != null && (A0J2 = A0J3.A0J("card")) != null) {
                A0E = C110115dX.A0E(brazilPaymentCardDetailsActivity.A00, new C111815hS(), A0J2);
                r0 = brazilPaymentCardDetailsActivity.A0C;
            } else {
                return;
            }
        } else {
            BrazilPaymentActivity brazilPaymentActivity = (BrazilPaymentActivity) obj;
            C28371Vv A0J4 = r5.A0J("pay");
            if (A0J4 != null && (A0J = A0J4.A0J("card")) != null) {
                A0E = C110115dX.A0E(brazilPaymentActivity.A05, new C111815hS(), A0J);
                r0 = brazilPaymentActivity.A0P;
            } else {
                return;
            }
        }
        r0.A01().A02((AnonymousClass2HF) null, A0E);
    }
}

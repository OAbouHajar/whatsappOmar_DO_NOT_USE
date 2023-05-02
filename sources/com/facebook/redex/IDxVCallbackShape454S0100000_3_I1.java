package com.facebook.redex;

import X.AnonymousClass2HJ;
import X.AnonymousClass68S;
import X.C112825ja;
import X.C1212664v;
import X.C13680ns;
import com.obwhatsapp.payments.ui.viewmodel.IndiaUpiPaymentTransactionConfirmationViewModel;

public class IDxVCallbackShape454S0100000_3_I1 implements AnonymousClass68S {
    public Object A00;
    public final int A01;

    public IDxVCallbackShape454S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AUT(AnonymousClass2HJ r4) {
        if (this.A01 != 0) {
            IndiaUpiPaymentTransactionConfirmationViewModel indiaUpiPaymentTransactionConfirmationViewModel = (IndiaUpiPaymentTransactionConfirmationViewModel) this.A00;
            if (r4 == null) {
                indiaUpiPaymentTransactionConfirmationViewModel.A09.Acl(new C1212664v(indiaUpiPaymentTransactionConfirmationViewModel));
            } else {
                indiaUpiPaymentTransactionConfirmationViewModel.A00.A0B(C13680ns.A0a());
            }
        } else {
            ((C112825ja) this.A00).A42(r4, false);
        }
    }
}

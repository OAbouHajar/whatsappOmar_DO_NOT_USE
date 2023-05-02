package com.facebook.redex;

import X.C005702l;
import X.C110105dW;
import X.C13680ns;
import android.content.DialogInterface;
import com.obwhatsapp.payments.ui.IndiaUpiMandatePaymentActivity;

public class IDxSListenerShape248S0100000_3_I1 implements DialogInterface.OnShowListener {
    public Object A00;
    public final int A01;

    public IDxSListenerShape248S0100000_3_I1(IndiaUpiMandatePaymentActivity indiaUpiMandatePaymentActivity, int i2) {
        this.A01 = i2;
        this.A00 = indiaUpiMandatePaymentActivity;
    }

    public final void onShow(DialogInterface dialogInterface) {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            IndiaUpiMandatePaymentActivity indiaUpiMandatePaymentActivity = (IndiaUpiMandatePaymentActivity) obj;
            C110105dW.A0s(((C005702l) dialogInterface).A00.A0G, dialogInterface, indiaUpiMandatePaymentActivity, 12);
            indiaUpiMandatePaymentActivity.A0E.AKT(C13680ns.A0X(), (Integer) null, "decline_mandate_dialogue", indiaUpiMandatePaymentActivity.A04, true);
            return;
        }
        C110105dW.A0s(((C005702l) dialogInterface).A00.A0G, dialogInterface, obj, 11);
    }
}

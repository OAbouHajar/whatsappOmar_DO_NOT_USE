package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass1JN;
import X.AnonymousClass29T;
import X.AnonymousClass4W4;
import X.C110105dW;
import X.C110115dX;
import X.C111805hR;
import X.C112785jQ;
import X.C30671cl;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentMethodSelectionActivity;
import com.obwhatsapp.payments.ui.PaymentSettingsFragment;
import java.util.HashMap;
import java.util.Map;

public class IDxCListenerShape196S0100000_3_I1 implements AdapterView.OnItemClickListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape196S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        switch (this.A01) {
            case 0:
                C112785jQ r1 = (C112785jQ) this.A00;
                r1.AUY(C110115dX.A0G(r1.A0L.A02, i2));
                return;
            case 1:
                IndiaUpiPaymentMethodSelectionActivity indiaUpiPaymentMethodSelectionActivity = (IndiaUpiPaymentMethodSelectionActivity) this.A00;
                C30671cl A0G = C110115dX.A0G(indiaUpiPaymentMethodSelectionActivity.A00.A02, i2);
                C111805hR r0 = (C111805hR) A0G.A08;
                if (r0 != null && !AnonymousClass000.A1X(r0.A05.A00)) {
                    AnonymousClass29T.A01(indiaUpiPaymentMethodSelectionActivity, 29);
                    return;
                } else if (indiaUpiPaymentMethodSelectionActivity.A0C.A0C(1969)) {
                    AnonymousClass4W4 r7 = new AnonymousClass4W4((Map) null, "upi_p2p_check_balance", (String) null);
                    HashMap A0x = AnonymousClass000.A0x();
                    A0x.put("credential_id", A0G.A0A);
                    indiaUpiPaymentMethodSelectionActivity.A05.A08(0, R.string.str13db);
                    ((AnonymousClass1JN) indiaUpiPaymentMethodSelectionActivity.A01.get()).A00(new IDxRCallbackShape249S0100000_3_I1(indiaUpiPaymentMethodSelectionActivity, 4), new IDxTCallbackShape262S0100000_3_I1(indiaUpiPaymentMethodSelectionActivity, 2), r7, "payment_method_picker", A0x);
                    return;
                } else {
                    Intent A04 = C110105dW.A04(indiaUpiPaymentMethodSelectionActivity, IndiaUpiCheckBalanceActivity.class);
                    C110115dX.A0o(A04, A0G);
                    indiaUpiPaymentMethodSelectionActivity.startActivity(A04);
                    return;
                }
            default:
                PaymentSettingsFragment paymentSettingsFragment = (PaymentSettingsFragment) this.A00;
                paymentSettingsFragment.AUY(C110115dX.A0G(paymentSettingsFragment.A0q.A02, i2));
                return;
        }
    }
}

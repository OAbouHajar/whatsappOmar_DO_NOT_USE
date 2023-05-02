package com.facebook.redex;

import X.C1220968g;
import X.C13680ns;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.BrazilPaymentActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import com.whatsapp.util.Log;

public class IDxTCallbackShape452S0100000_3_I1 implements C1220968g {
    public Object A00;
    public final int A01;

    public IDxTCallbackShape452S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void ARQ(int i2) {
        int i3 = this.A01;
        Object obj = this.A00;
        int i4 = i2;
        if (i3 != 0) {
            BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = (BrazilPaymentCardDetailsActivity) obj;
            brazilPaymentCardDetailsActivity.Ac1();
            if (i2 != 0) {
                Log.i(C13680ns.A0c(i2, "PAY: Verify Card flow Error: "));
                brazilPaymentCardDetailsActivity.A04.A01(brazilPaymentCardDetailsActivity, brazilPaymentCardDetailsActivity.A0C, brazilPaymentCardDetailsActivity.A02, i4, R.string.str0fd1).show();
                return;
            }
            return;
        }
        BrazilPaymentActivity brazilPaymentActivity = (BrazilPaymentActivity) obj;
        brazilPaymentActivity.Ac1();
        if (i2 != 0) {
            Log.i(C13680ns.A0c(i2, "PAY: Verify Card flow Error: "));
            brazilPaymentActivity.A08.A01(brazilPaymentActivity, brazilPaymentActivity.A0C, brazilPaymentActivity.A0B, i4, R.string.str0fd1).show();
        }
    }
}

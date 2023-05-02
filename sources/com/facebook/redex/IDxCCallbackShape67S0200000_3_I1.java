package com.facebook.redex;

import X.AnonymousClass1ZI;
import X.AnonymousClass29T;
import X.C110755em;
import X.C117725tS;
import X.C118455ui;
import X.C13680ns;
import X.C13690nt;
import X.C14600pS;
import X.C35301lh;
import android.content.Context;
import android.os.Bundle;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiSendPaymentActivity;
import com.obwhatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment;
import com.obwhatsapp.payments.ui.PaymentBottomSheet;
import com.obwhatsapp.payments.ui.PaymentTransactionDetailsListActivity;

public class IDxCCallbackShape67S0200000_3_I1 implements AnonymousClass1ZI {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCCallbackShape67S0200000_3_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void AWT(boolean z2) {
        switch (this.A02) {
            case 0:
                C118455ui r5 = (C118455ui) this.A00;
                C35301lh r2 = (C35301lh) this.A01;
                if (z2) {
                    Bundle A0D = C13690nt.A0D();
                    A0D.putParcelable("extra_payment_handle", r2);
                    IndiaUpiSendPaymentToVpaFragment indiaUpiSendPaymentToVpaFragment = new IndiaUpiSendPaymentToVpaFragment();
                    indiaUpiSendPaymentToVpaFragment.A0T(A0D);
                    r5.A00 = indiaUpiSendPaymentToVpaFragment;
                    r5.A00((PaymentBottomSheet) null);
                    return;
                }
                C14600pS r4 = r5.A04;
                Object[] A1b = C13680ns.A1b();
                A1b[0] = r5.A03.getString(R.string.str0b6e);
                r4.Afj(A1b, 0, R.string.str187e);
                return;
            case 1:
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = (IndiaUpiSendPaymentActivity) this.A00;
                Runnable runnable = (Runnable) this.A01;
                if (z2) {
                    runnable.run();
                    return;
                } else if (indiaUpiSendPaymentActivity.A09) {
                    indiaUpiSendPaymentActivity.A00 = 3;
                    indiaUpiSendPaymentActivity.A4B();
                    return;
                } else {
                    AnonymousClass29T.A01(indiaUpiSendPaymentActivity, 22);
                    return;
                }
            default:
                C110755em r6 = ((PaymentTransactionDetailsListActivity) this.A00).A0O;
                String str = ((C117725tS) this.A01).A0F;
                C117725tS A002 = C117725tS.A00(8);
                Context context = r6.A0P.A00;
                int i2 = R.string.str187e;
                if (z2) {
                    i2 = R.string.str187a;
                }
                A002.A0C = C13680ns.A0d(context, str, C13680ns.A1b(), 0, i2);
                C110755em.A01(r6, A002);
                return;
        }
    }
}

package com.obwhatsapp.payments.ui;

import X.AnonymousClass3K2;
import X.C16150sX;
import X.C17060uT;
import X.C23071Aj;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_PaymentIncentiveViewFragment extends BasePaymentIncentiveFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A01() {
        if (this.A00 == null) {
            this.A00 = C54452hX.A01(super.A0u(), this);
            this.A01 = C54462hY.A00(super.A0u());
        }
    }

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A01();
        return this.A00;
    }

    public LayoutInflater A0v(Bundle bundle) {
        return C54452hX.A00(super.A0v(bundle), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (X.C54442hW.A00(r1) == r3) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0y(android.app.Activity r3) {
        /*
            r2 = this;
            super.A0y(r3)
            android.content.ContextWrapper r1 = r2.A00
            if (r1 == 0) goto L_0x000e
            android.content.Context r1 = X.C54442hW.A00(r1)
            r0 = 0
            if (r1 != r3) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.C52772eQ.A01(r0)
            r2.A01()
            r2.A1J()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.Hilt_PaymentIncentiveViewFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A01();
        A1J();
    }

    public void A1J() {
        if (!this.A02) {
            this.A02 = true;
            PaymentIncentiveViewFragment paymentIncentiveViewFragment = (PaymentIncentiveViewFragment) this;
            C16150sX A0P = AnonymousClass3K2.A0P(paymentIncentiveViewFragment, (C17060uT) generatedComponent());
            paymentIncentiveViewFragment.A02 = C16150sX.A0U(A0P);
            paymentIncentiveViewFragment.A04 = C16150sX.A1A(A0P);
            paymentIncentiveViewFragment.A00 = (C23071Aj) A0P.AQb.get();
            paymentIncentiveViewFragment.A01 = C16150sX.A0T(A0P);
        }
    }
}

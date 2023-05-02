package com.obwhatsapp.payments.ui;

import X.AnonymousClass1N8;
import X.AnonymousClass3K2;
import X.AnonymousClass3K3;
import X.C110105dW;
import X.C110115dX;
import X.C16150sX;
import X.C16460t6;
import X.C17050uS;
import X.C17060uT;
import X.C18320wV;
import X.C228719p;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.base.WaDialogFragment;

public abstract class Hilt_PaymentSettingsFragment extends WaDialogFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A07() {
        if (this.A00 == null) {
            this.A00 = C54452hX.A01(super.A0u(), this);
            this.A01 = C54462hY.A00(super.A0u());
        }
    }

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A07();
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
            r2.A07()
            r2.A1J()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.Hilt_PaymentSettingsFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A07();
        A1J();
    }

    public void A1J() {
        if (this instanceof Hilt_P2mLitePaymentSettingsFragment) {
            Hilt_P2mLitePaymentSettingsFragment hilt_P2mLitePaymentSettingsFragment = (Hilt_P2mLitePaymentSettingsFragment) this;
            if (!hilt_P2mLitePaymentSettingsFragment.A02) {
                hilt_P2mLitePaymentSettingsFragment.A02 = true;
                C17060uT A0b = AnonymousClass3K3.A0b(hilt_P2mLitePaymentSettingsFragment);
                P2mLitePaymentSettingsFragment p2mLitePaymentSettingsFragment = (P2mLitePaymentSettingsFragment) hilt_P2mLitePaymentSettingsFragment;
                C16150sX r1 = ((C17050uS) A0b).A0b;
                AnonymousClass3K2.A18(r1, p2mLitePaymentSettingsFragment);
                p2mLitePaymentSettingsFragment.A0P = C16150sX.A0U(r1);
                C110105dW.A17(r1, p2mLitePaymentSettingsFragment);
                C110105dW.A19(r1, p2mLitePaymentSettingsFragment, C110105dW.A0c(r1, p2mLitePaymentSettingsFragment));
                C110105dW.A18(r1, p2mLitePaymentSettingsFragment);
                p2mLitePaymentSettingsFragment.A08 = (AnonymousClass1N8) r1.AGs.get();
                p2mLitePaymentSettingsFragment.A09 = C110115dX.A0V(r1);
                p2mLitePaymentSettingsFragment.A03 = (C16460t6) r1.A5k.get();
                p2mLitePaymentSettingsFragment.A05 = (C228719p) r1.AGq.get();
                p2mLitePaymentSettingsFragment.A04 = (C18320wV) r1.AIA.get();
            }
        } else if (!this.A02) {
            this.A02 = true;
            PaymentSettingsFragment paymentSettingsFragment = (PaymentSettingsFragment) this;
            C16150sX r12 = ((C17050uS) AnonymousClass3K3.A0b(this)).A0b;
            AnonymousClass3K2.A18(r12, paymentSettingsFragment);
            paymentSettingsFragment.A0P = C16150sX.A0U(r12);
            C110105dW.A17(r12, paymentSettingsFragment);
            C110105dW.A19(r12, paymentSettingsFragment, C110105dW.A0c(r12, paymentSettingsFragment));
            C110105dW.A18(r12, paymentSettingsFragment);
        }
    }
}

package com.obwhatsapp.payments.ui;

import X.AnonymousClass1MB;
import X.AnonymousClass3K2;
import X.AnonymousClass3K3;
import X.AnonymousClass60V;
import X.C110105dW;
import X.C117765tW;
import X.C15860rz;
import X.C16150sX;
import X.C17050uS;
import X.C221116r;
import X.C227819g;
import X.C227919h;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_IndiaUpiPaymentSettingsFragment extends PaymentSettingsFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A02() {
        if (this.A00 == null) {
            this.A00 = C54452hX.A01(super.A0u(), this);
            this.A01 = C54462hY.A00(super.A0u());
        }
    }

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A02();
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
            r2.A02()
            r2.A1J()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.Hilt_IndiaUpiPaymentSettingsFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A02();
        A1J();
    }

    public void A1J() {
        if (!this.A02) {
            this.A02 = true;
            IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) this;
            C16150sX r2 = ((C17050uS) AnonymousClass3K3.A0b(this)).A0b;
            AnonymousClass3K2.A18(r2, indiaUpiPaymentSettingsFragment);
            indiaUpiPaymentSettingsFragment.A0P = C16150sX.A0U(r2);
            C110105dW.A17(r2, indiaUpiPaymentSettingsFragment);
            C110105dW.A19(r2, indiaUpiPaymentSettingsFragment, C110105dW.A0c(r2, indiaUpiPaymentSettingsFragment));
            C110105dW.A18(r2, indiaUpiPaymentSettingsFragment);
            indiaUpiPaymentSettingsFragment.A01 = AnonymousClass3K3.A0a(r2);
            indiaUpiPaymentSettingsFragment.A02 = (C15860rz) r2.AQh.get();
            indiaUpiPaymentSettingsFragment.A07 = (C227819g) r2.AHv.get();
            indiaUpiPaymentSettingsFragment.A06 = (C227919h) r2.AH8.get();
            indiaUpiPaymentSettingsFragment.A04 = (C221116r) r2.AHt.get();
            indiaUpiPaymentSettingsFragment.A09 = C110105dW.A0O(r2);
            indiaUpiPaymentSettingsFragment.A08 = C16150sX.A0z(r2);
            indiaUpiPaymentSettingsFragment.A05 = (AnonymousClass60V) r2.ACJ.get();
            indiaUpiPaymentSettingsFragment.A03 = C110105dW.A0F(r2);
            indiaUpiPaymentSettingsFragment.A0A = (AnonymousClass1MB) r2.AHQ.get();
            indiaUpiPaymentSettingsFragment.A0C = (C117765tW) r2.ACL.get();
        }
    }
}

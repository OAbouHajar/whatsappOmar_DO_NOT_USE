package com.obwhatsapp.payments.ui;

import X.AnonymousClass1N0;
import X.AnonymousClass1N3;
import X.AnonymousClass3K2;
import X.AnonymousClass3K3;
import X.AnonymousClass60U;
import X.C110105dW;
import X.C110115dX;
import X.C111865hX;
import X.C117755tV;
import X.C118255uO;
import X.C118955vg;
import X.C1200560d;
import X.C1222969a;
import X.C16150sX;
import X.C17050uS;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_BrazilPaymentSettingsFragment extends PaymentSettingsFragment {
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
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.Hilt_BrazilPaymentSettingsFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A01();
        A1J();
    }

    public void A1J() {
        if (!this.A02) {
            this.A02 = true;
            BrazilPaymentSettingsFragment brazilPaymentSettingsFragment = (BrazilPaymentSettingsFragment) this;
            C16150sX r2 = ((C17050uS) AnonymousClass3K3.A0b(this)).A0b;
            AnonymousClass3K2.A18(r2, brazilPaymentSettingsFragment);
            brazilPaymentSettingsFragment.A0P = C16150sX.A0U(r2);
            C110105dW.A17(r2, brazilPaymentSettingsFragment);
            C110105dW.A19(r2, brazilPaymentSettingsFragment, C110105dW.A0c(r2, brazilPaymentSettingsFragment));
            C110105dW.A18(r2, brazilPaymentSettingsFragment);
            brazilPaymentSettingsFragment.A00 = (AnonymousClass1N0) r2.A20.get();
            brazilPaymentSettingsFragment.A02 = (AnonymousClass60U) r2.A2G.get();
            brazilPaymentSettingsFragment.A08 = (C1200560d) r2.A2K.get();
            brazilPaymentSettingsFragment.A01 = C110115dX.A0D(r2);
            brazilPaymentSettingsFragment.A06 = (C1222969a) r2.A2U.get();
            brazilPaymentSettingsFragment.A04 = C16150sX.A0z(r2);
            brazilPaymentSettingsFragment.A03 = (C111865hX) r2.AHU.get();
            brazilPaymentSettingsFragment.A09 = (C118955vg) r2.A2T.get();
            brazilPaymentSettingsFragment.A05 = (C118255uO) r2.A2M.get();
            brazilPaymentSettingsFragment.A0B = (C117755tV) r2.A2X.get();
            brazilPaymentSettingsFragment.A07 = (AnonymousClass1N3) r2.A2Q.get();
        }
    }
}

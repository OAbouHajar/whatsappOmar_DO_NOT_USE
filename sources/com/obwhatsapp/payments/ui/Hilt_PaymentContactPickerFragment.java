package com.obwhatsapp.payments.ui;

import X.AnonymousClass01J;
import X.AnonymousClass1A9;
import X.C110105dW;
import X.C16150sX;
import X.C17050uS;
import X.C17060uT;
import X.C49132Rg;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.contact.picker.ContactPickerFragment;

public abstract class Hilt_PaymentContactPickerFragment extends ContactPickerFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A05() {
        if (this.A00 == null) {
            this.A00 = C54452hX.A01(super.A0u(), this);
            this.A01 = C54462hY.A00(super.A0u());
        }
    }

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A05();
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
            r2.A05()
            r2.A19()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.Hilt_PaymentContactPickerFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A05();
        A19();
    }

    public void A19() {
        if (!this.A02) {
            this.A02 = true;
            PaymentContactPickerFragment paymentContactPickerFragment = (PaymentContactPickerFragment) this;
            C17050uS r5 = (C17050uS) ((C17060uT) generatedComponent());
            C16150sX r3 = r5.A0b;
            C110105dW.A14(r3, paymentContactPickerFragment);
            AnonymousClass01J r1 = r3.AQz;
            C49132Rg A0B = C110105dW.A0B(r5, r3, paymentContactPickerFragment, C110105dW.A0G(r3, paymentContactPickerFragment, r1));
            C110105dW.A16(r3, paymentContactPickerFragment, (AnonymousClass1A9) r3.AE7.get());
            C110105dW.A15(r3, paymentContactPickerFragment);
            C16150sX A0D = C110105dW.A0D(A0B, r3, paymentContactPickerFragment, C110105dW.A0a(A0B, r3, paymentContactPickerFragment, r1));
            C110105dW.A10(A0B, r3, paymentContactPickerFragment, C110105dW.A0b(A0D, r3, paymentContactPickerFragment, A0D.AP2));
            C110105dW.A11(r5, r3, paymentContactPickerFragment);
        }
    }
}

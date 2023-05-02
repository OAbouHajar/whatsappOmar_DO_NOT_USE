package com.obwhatsapp.payments.ui;

import X.AnonymousClass01J;
import X.AnonymousClass1A9;
import X.AnonymousClass60V;
import X.C110105dW;
import X.C110115dX;
import X.C112715ix;
import X.C16150sX;
import X.C17050uS;
import X.C17060uT;
import X.C227819g;
import X.C49132Rg;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_IndiaUpiContactPickerFragment extends PaymentContactPickerFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A06() {
        if (this.A00 == null) {
            this.A00 = C54452hX.A01(super.A0u(), this);
            this.A01 = C54462hY.A00(super.A0u());
        }
    }

    public Context A0u() {
        if (super.A0u() == null && !this.A01) {
            return null;
        }
        A06();
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
            r2.A06()
            r2.A19()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.Hilt_IndiaUpiContactPickerFragment.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A06();
        A19();
    }

    public void A19() {
        if (!this.A02) {
            this.A02 = true;
            IndiaUpiContactPickerFragment indiaUpiContactPickerFragment = (IndiaUpiContactPickerFragment) this;
            C17050uS r5 = (C17050uS) ((C17060uT) generatedComponent());
            C16150sX r3 = r5.A0b;
            C110105dW.A14(r3, indiaUpiContactPickerFragment);
            AnonymousClass01J r2 = r3.AQz;
            C49132Rg A0B = C110105dW.A0B(r5, r3, indiaUpiContactPickerFragment, C110105dW.A0G(r3, indiaUpiContactPickerFragment, r2));
            C110105dW.A16(r3, indiaUpiContactPickerFragment, (AnonymousClass1A9) r3.AE7.get());
            C110105dW.A15(r3, indiaUpiContactPickerFragment);
            C16150sX A0D = C110105dW.A0D(A0B, r3, indiaUpiContactPickerFragment, C110105dW.A0a(A0B, r3, indiaUpiContactPickerFragment, r2));
            C110105dW.A10(A0B, r3, indiaUpiContactPickerFragment, C110105dW.A0b(A0D, r3, indiaUpiContactPickerFragment, A0D.AP2));
            C110105dW.A11(r5, r3, indiaUpiContactPickerFragment);
            indiaUpiContactPickerFragment.A03 = C110115dX.A0O(r3);
            indiaUpiContactPickerFragment.A04 = (C227819g) r3.AHv.get();
            indiaUpiContactPickerFragment.A05 = C110115dX.A0P(r3);
            indiaUpiContactPickerFragment.A06 = A0B.A0Q();
            indiaUpiContactPickerFragment.A00 = C110115dX.A0D(r3);
            indiaUpiContactPickerFragment.A07 = C110105dW.A0O(r3);
            indiaUpiContactPickerFragment.A02 = C110115dX.A0M(r3);
            indiaUpiContactPickerFragment.A01 = (AnonymousClass60V) r3.ACJ.get();
            indiaUpiContactPickerFragment.A08 = (C112715ix) r3.ACG.get();
        }
    }
}

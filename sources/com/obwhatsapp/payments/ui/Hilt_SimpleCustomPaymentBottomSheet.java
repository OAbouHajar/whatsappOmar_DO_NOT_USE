package com.obwhatsapp.payments.ui;

import X.AnonymousClass3K2;
import X.C110105dW;
import X.C1222969a;
import X.C17050uS;
import X.C17060uT;
import X.C54452hX;
import X.C54462hY;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.obwhatsapp.RoundedBottomSheetDialogFragment;
import com.obwhatsapp.payments.ui.instructions.Hilt_PaymentCustomInstructionsBottomSheet;
import com.obwhatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet;

public abstract class Hilt_SimpleCustomPaymentBottomSheet extends RoundedBottomSheetDialogFragment {
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
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.Hilt_SimpleCustomPaymentBottomSheet.A0y(android.app.Activity):void");
    }

    public void A16(Context context) {
        super.A16(context);
        A01();
        A1J();
    }

    public void A1J() {
        if (this instanceof Hilt_PaymentCustomInstructionsBottomSheet) {
            Hilt_PaymentCustomInstructionsBottomSheet hilt_PaymentCustomInstructionsBottomSheet = (Hilt_PaymentCustomInstructionsBottomSheet) this;
            if (!hilt_PaymentCustomInstructionsBottomSheet.A02) {
                hilt_PaymentCustomInstructionsBottomSheet.A02 = true;
                PaymentCustomInstructionsBottomSheet paymentCustomInstructionsBottomSheet = (PaymentCustomInstructionsBottomSheet) hilt_PaymentCustomInstructionsBottomSheet;
                paymentCustomInstructionsBottomSheet.A01 = (C1222969a) AnonymousClass3K2.A0P(paymentCustomInstructionsBottomSheet, (C17060uT) hilt_PaymentCustomInstructionsBottomSheet.generatedComponent()).A2U.get();
            }
        } else if (!this.A02) {
            this.A02 = true;
            C110105dW.A13(((C17050uS) ((C17060uT) generatedComponent())).A0b, this);
        }
    }
}
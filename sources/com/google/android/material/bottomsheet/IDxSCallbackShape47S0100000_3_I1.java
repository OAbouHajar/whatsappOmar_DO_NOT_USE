package com.google.android.material.bottomsheet;

import X.AnonymousClass3K4;
import X.C13680ns;
import X.C54882iQ;
import android.content.DialogInterface;
import android.view.View;
import com.obwhatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.util.Log;

public class IDxSCallbackShape47S0100000_3_I1 extends C54882iQ {
    public Object A00;
    public final int A01;

    public IDxSCallbackShape47S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A01(View view, float f2) {
    }

    public void A02(View view, int i2) {
        if (this.A01 != 0) {
            if (i2 == 5 || i2 == 4) {
                AnonymousClass3K4.A0y(this.A00);
            }
        } else if (i2 == 5 || i2 == 4) {
            Log.i(C13680ns.A0c(i2, "onStateChanged() new State:"));
            PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) this.A00;
            paymentBottomSheet.A1C();
            paymentBottomSheet.A02.onDismiss((DialogInterface) null);
        }
    }
}

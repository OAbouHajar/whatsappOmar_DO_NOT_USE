package com.obwhatsapp.payments.ui;

import X.AnonymousClass62A;
import X.C110105dW;
import X.C111345g2;
import X.C112765jH;
import android.content.Intent;

public class IDxUExtensionShape96S0100000_3_I1 extends AnonymousClass62A {
    public Object A00;
    public final int A01;

    public IDxUExtensionShape96S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AM8() {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            C112765jH r3 = (C112765jH) obj;
            Intent A04 = C110105dW.A04(r3, IndiaUpiBankPickerActivity.class);
            A04.putExtra("extra_payments_entry_type", 6);
            A04.putExtra("extra_is_first_payment_method", !C111345g2.A21(r3));
            A04.putExtra("extra_skip_value_props_display", C111345g2.A21(r3));
            r3.A2V(A04);
            return;
        }
        BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = (BrazilConfirmReceivePaymentFragment) obj;
        String A02 = brazilConfirmReceivePaymentFragment.A0I.A02(true);
        Intent A042 = C110105dW.A04(brazilConfirmReceivePaymentFragment.A0C(), BrazilPayBloksActivity.class);
        if (A02 == null) {
            A02 = "brpay_p_add_card";
        }
        A042.putExtra("screen_name", A02);
        brazilConfirmReceivePaymentFragment.A0r(A042);
    }
}

package com.obwhatsapp.payments.ui;

import X.C110115dX;
import X.C13680ns;
import X.C13690nt;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape135S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet;

public abstract class SimpleCustomPaymentBottomSheet extends Hilt_SimpleCustomPaymentBottomSheet {
    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.layout055c, viewGroup, false);
        String string = A03().getString(R.string.str0631);
        PaymentCustomInstructionsBottomSheet paymentCustomInstructionsBottomSheet = (PaymentCustomInstructionsBottomSheet) this;
        IDxCListenerShape135S0100000_3_I1 A06 = C110115dX.A06(paymentCustomInstructionsBottomSheet, 109);
        View inflate2 = LayoutInflater.from(paymentCustomInstructionsBottomSheet.A02()).inflate(R.layout.layout0454, new FrameLayout(paymentCustomInstructionsBottomSheet.A02()));
        View findViewById = inflate2.findViewById(R.id.close);
        C13680ns.A0M(inflate2, R.id.payment_instruction_description).setText(paymentCustomInstructionsBottomSheet.A02);
        C110115dX.A0s(findViewById, paymentCustomInstructionsBottomSheet, 8);
        if (!TextUtils.isEmpty(string)) {
            TextView A0M = C13680ns.A0M(inflate, R.id.primary_button);
            A0M.setText(string);
            A0M.setOnClickListener(A06);
            A0M.setVisibility(0);
        }
        TextUtils.isEmpty((CharSequence) null);
        C13690nt.A0K(inflate, R.id.ui_container).addView(inflate2);
        return inflate;
    }
}

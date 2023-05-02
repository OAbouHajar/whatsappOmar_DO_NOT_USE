package com.obwhatsapp.payments.ui;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.C110105dW;
import X.C13680ns;
import X.C13690nt;
import X.C30671cl;
import X.C35391lr;
import X.C39891tE;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.obwhatsapp.R;

public class PaymentRailPickerFragment extends Hilt_PaymentRailPickerFragment {
    public AnonymousClass013 A00;

    public static PaymentRailPickerFragment A01(int i2, boolean z2) {
        PaymentRailPickerFragment paymentRailPickerFragment = new PaymentRailPickerFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("arg_type", i2 != 0 ? "debit" : "credit");
        A0D.putBoolean("arg_is_p2p", z2);
        paymentRailPickerFragment.A0T(A0D);
        return paymentRailPickerFragment;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0461);
    }

    public void A18(Bundle bundle, View view) {
        Bundle A04 = A04();
        String string = A04.getString("arg_type", "credit");
        AnonymousClass00B.A06(string);
        boolean equals = string.equals("credit");
        View findViewById = view.findViewById(R.id.credit_card_check);
        if (equals) {
            findViewById.setVisibility(0);
            C13690nt.A13(view, R.id.debit_card_check, 4);
        } else {
            findViewById.setVisibility(4);
            C13690nt.A13(view, R.id.debit_card_check, 0);
        }
        View findViewById2 = view.findViewById(R.id.payment_rail_credit_card_container);
        AnonymousClass00B.A04(findViewById2);
        C110105dW.A0r(findViewById2, this, 91);
        if (A04.getBoolean("arg_is_p2p")) {
            findViewById2.setEnabled(false);
            View findViewById3 = findViewById2.findViewById(R.id.payment_rail_credit_card_text);
            AnonymousClass00B.A04(findViewById3);
            C13690nt.A0w(A03(), (TextView) findViewById3, R.color.color01d6);
            View findViewById4 = findViewById2.findViewById(R.id.payment_rail_credit_card_education);
            AnonymousClass00B.A04(findViewById4);
            findViewById4.setVisibility(0);
        }
        C110105dW.A0r(view.findViewById(R.id.payment_rail_debit_card_container), this, 92);
        C110105dW.A0r(view.findViewById(R.id.back), this, 93);
    }

    public final void A1A(int i2) {
        C39891tE r0;
        ConfirmPaymentFragment confirmPaymentFragment = (ConfirmPaymentFragment) A09();
        if (confirmPaymentFragment != null) {
            confirmPaymentFragment.A00 = i2;
            TextView textView = confirmPaymentFragment.A0B;
            int i3 = R.string.str0f9a;
            if (i2 == 0) {
                i3 = R.string.str0f98;
            }
            textView.setText(i3);
            C30671cl r1 = confirmPaymentFragment.A0I;
            if ((r1 instanceof C35391lr) && (r0 = (C39891tE) r1.A08) != null) {
                r0.A03 = i2;
            }
        }
        PaymentBottomSheet paymentBottomSheet = (PaymentBottomSheet) this.A0D;
        if (paymentBottomSheet != null) {
            paymentBottomSheet.A1N();
        }
    }
}

package com.obwhatsapp.payments.ui;

import X.AnonymousClass00B;
import X.C110105dW;
import X.C13680ns;
import X.C13690nt;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;

public class PaymentTypePickerFragment extends Hilt_PaymentTypePickerFragment {
    public static Bundle A01(int i2) {
        Bundle A0D = C13690nt.A0D();
        A0D.putString("arg_type", i2 != 0 ? "friendsAndFamily" : "goodAndServices");
        return A0D;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0484);
    }

    public void A18(Bundle bundle, View view) {
        String string = A04().getString("arg_type", "goodAndServices");
        AnonymousClass00B.A06(string);
        C13680ns.A0M(view, R.id.buying_goods_and_services_text).setText(R.string.str032b);
        boolean z2 = this instanceof BrazilPaymentTypePickerFragment;
        C13680ns.A0M(view, R.id.buying_goods_and_services_hint_text).setText(A0J(z2 ? R.string.str0281 : R.string.str032c));
        C13680ns.A0M(view, R.id.sending_to_friends_and_family_text).setText(R.string.str1511);
        C13680ns.A0M(view, R.id.sending_to_friends_and_family_hint_text).setText(A0J(z2 ? R.string.str0285 : R.string.str1512));
        boolean equals = string.equals("goodAndServices");
        View findViewById = view.findViewById(R.id.buying_goods_and_services_check);
        if (equals) {
            findViewById.setVisibility(0);
            C13690nt.A13(view, R.id.sending_to_friends_and_family_check, 4);
        } else {
            findViewById.setVisibility(4);
            C13690nt.A13(view, R.id.sending_to_friends_and_family_check, 0);
        }
        C110105dW.A0r(view.findViewById(R.id.sending_to_friends_and_family_container), this, 101);
        C110105dW.A0r(view.findViewById(R.id.buying_goods_and_services_container), this, 100);
        C110105dW.A0r(view.findViewById(R.id.back), this, 99);
    }
}

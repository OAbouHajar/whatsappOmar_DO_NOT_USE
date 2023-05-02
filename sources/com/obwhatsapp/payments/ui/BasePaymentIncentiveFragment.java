package com.obwhatsapp.payments.ui;

import X.AnonymousClass5xP;
import X.C004601z;
import X.C110105dW;
import X.C116125qr;
import X.C13680ns;
import X.C13690nt;
import X.C28401Vy;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.RoundedBottomSheetDialogFragment;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaImageButton;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.components.Button;

public abstract class BasePaymentIncentiveFragment extends RoundedBottomSheetDialogFragment {
    public TextEmojiLabel A00;
    public WaImageButton A01;
    public WaTextView A02;
    public Button A03;

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0453);
    }

    public void A18(Bundle bundle, View view) {
        this.A02 = C13680ns.A0S(view, R.id.payment_incentive_bottom_sheet_title);
        this.A00 = C13680ns.A0Q(view, R.id.payment_incentive_bottom_sheet_body);
        Button button = (Button) C004601z.A0E(view, R.id.ok_button);
        this.A03 = button;
        C110105dW.A0r(button, this, 7);
        WaImageButton waImageButton = (WaImageButton) C004601z.A0E(view, R.id.back);
        this.A01 = waImageButton;
        C110105dW.A0r(waImageButton, this, 8);
    }

    public void A1N() {
        PaymentIncentiveViewFragment paymentIncentiveViewFragment = (PaymentIncentiveViewFragment) this;
        AnonymousClass5xP.A01(AnonymousClass5xP.A00(paymentIncentiveViewFragment.A02, (C28401Vy) null, paymentIncentiveViewFragment.A06, (String) null, true), paymentIncentiveViewFragment.A05, 1, "incentive_details", (String) null, 1);
    }

    public void A1O() {
        PaymentIncentiveViewFragment paymentIncentiveViewFragment = (PaymentIncentiveViewFragment) this;
        C116125qr r0 = paymentIncentiveViewFragment.A03;
        if (r0 != null) {
            r0.A00.A1C();
        }
        AnonymousClass5xP.A01(AnonymousClass5xP.A00(paymentIncentiveViewFragment.A02, (C28401Vy) null, paymentIncentiveViewFragment.A06, (String) null, true), paymentIncentiveViewFragment.A05, C13690nt.A0U(), "incentive_details", (String) null, 1);
    }
}

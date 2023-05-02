package com.obwhatsapp.payments.ui;

import X.AnonymousClass01V;
import X.AnonymousClass5x9;
import X.AnonymousClass61W;
import X.AnonymousClass69N;
import X.C004601z;
import X.C110105dW;
import X.C119405xi;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14870pt;
import X.C19980zJ;
import X.C30671cl;
import X.C45922Bq;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxSDetectorShape311S0100000_3_I1;
import com.obwhatsapp.R;

public class IndiaUpiForgotPinDialogFragment extends Hilt_IndiaUpiForgotPinDialogFragment {
    public C19980zJ A00;
    public C14870pt A01;
    public AnonymousClass01V A02;
    public AnonymousClass61W A03;
    public AnonymousClass69N A04;
    public AnonymousClass5x9 A05;

    public void A0k() {
        super.A0k();
        this.A04 = null;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C110105dW.A0m(A0D());
        this.A05.A02(new IDxSDetectorShape311S0100000_3_I1(this, 2));
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0314);
    }

    public void A18(Bundle bundle, View view) {
        Bundle bundle2 = this.A05;
        if (bundle2 != null) {
            C30671cl r7 = (C30671cl) bundle2.getParcelable("extra_bank_account");
            if (!(r7 == null || r7.A08 == null)) {
                C13680ns.A0L(view, R.id.desc).setText(C13700nu.A0F(A03(), C119405xi.A07((String) C110105dW.A0d(r7.A09)), new Object[1], 0, R.string.str116a));
            }
            Context context = view.getContext();
            C14870pt r8 = this.A01;
            C19980zJ r72 = this.A00;
            AnonymousClass01V r10 = this.A02;
            C45922Bq.A08(context, Uri.parse("https://faq.whatsapp.com/general/payments/about-payments-data"), r72, r8, C13680ns.A0Q(view, R.id.note), r10, C13690nt.A0c(this, "learn-more", new Object[1], 0, R.string.str116b));
        }
        C110105dW.A0r(C004601z.A0E(view, R.id.continue_button), this, 42);
        C110105dW.A0r(C004601z.A0E(view, R.id.close), this, 43);
        C110105dW.A0r(C004601z.A0E(view, R.id.forgot_pin_button), this, 44);
        this.A03.AKS(0, (Integer) null, "forgot_pin_prompt", (String) null);
    }
}

package com.obwhatsapp.payments.ui;

import X.AnonymousClass01V;
import X.AnonymousClass61W;
import X.AnonymousClass699;
import X.C004601z;
import X.C110105dW;
import X.C119405xi;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14710pd;
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
import com.obwhatsapp.R;

public class IndiaUpiPinPrimerDialogFragment extends Hilt_IndiaUpiPinPrimerDialogFragment {
    public C19980zJ A00;
    public C14870pt A01;
    public AnonymousClass01V A02;
    public C14710pd A03;
    public AnonymousClass61W A04;
    public AnonymousClass699 A05;

    public void A0k() {
        super.A0k();
        this.A05 = null;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0340);
    }

    public void A18(Bundle bundle, View view) {
        Bundle bundle2 = this.A05;
        if (bundle2 != null) {
            C30671cl r7 = (C30671cl) bundle2.getParcelable("extra_bank_account");
            if (!(r7 == null || r7.A08 == null)) {
                C13680ns.A0L(view, R.id.desc).setText(C13700nu.A0F(A03(), C119405xi.A06(r7), new Object[1], 0, R.string.str1176));
            }
            Context context = view.getContext();
            C14870pt r72 = this.A01;
            C19980zJ r6 = this.A00;
            AnonymousClass01V r9 = this.A02;
            C45922Bq.A08(context, Uri.parse("https://faq.whatsapp.com/general/payments/about-payments-data"), r6, r72, C13680ns.A0Q(view, R.id.note), r9, C13690nt.A0c(this, "learn-more", new Object[1], 0, R.string.str1177));
        }
        C110105dW.A0r(C004601z.A0E(view, R.id.continue_button), this, 69);
        C110105dW.A0r(C004601z.A0E(view, R.id.close), this, 70);
        this.A04.AKS(0, (Integer) null, "setup_pin_prompt", (String) null);
    }
}

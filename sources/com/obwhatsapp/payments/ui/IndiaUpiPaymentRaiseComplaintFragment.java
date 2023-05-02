package com.obwhatsapp.payments.ui;

import X.AnonymousClass01V;
import X.AnonymousClass61W;
import X.C004601z;
import X.C110105dW;
import X.C1219967w;
import X.C13680ns;
import X.C14870pt;
import X.C19980zJ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;

public class IndiaUpiPaymentRaiseComplaintFragment extends Hilt_IndiaUpiPaymentRaiseComplaintFragment {
    public C19980zJ A00;
    public C14870pt A01;
    public AnonymousClass01V A02;
    public AnonymousClass61W A03;
    public C1219967w A04;

    public void A0k() {
        super.A0k();
        this.A04 = null;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0334);
    }

    public void A18(Bundle bundle, View view) {
        C110105dW.A0r(C004601z.A0E(view, R.id.complaint_button), this, 53);
        C110105dW.A0r(C004601z.A0E(view, R.id.close), this, 54);
        this.A03.AKS(C13680ns.A0X(), (Integer) null, "raise_complaint_prompt", (String) null);
    }
}

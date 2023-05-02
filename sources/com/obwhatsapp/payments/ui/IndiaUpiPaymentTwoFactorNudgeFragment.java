package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass01V;
import X.AnonymousClass1Vo;
import X.AnonymousClass61W;
import X.C004601z;
import X.C110105dW;
import X.C1220067x;
import X.C13680ns;
import X.C13690nt;
import X.C14870pt;
import X.C18300wT;
import X.C19980zJ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;

public class IndiaUpiPaymentTwoFactorNudgeFragment extends Hilt_IndiaUpiPaymentTwoFactorNudgeFragment {
    public C19980zJ A00;
    public C14870pt A01;
    public AnonymousClass01V A02;
    public C18300wT A03;
    public AnonymousClass61W A04;
    public C1220067x A05;

    public void A0k() {
        super.A0k();
        this.A05 = null;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout033c);
    }

    public void A18(Bundle bundle, View view) {
        C110105dW.A0r(C004601z.A0E(view, R.id.continue_button), this, 64);
        C110105dW.A0r(C004601z.A0E(view, R.id.close), this, 63);
        C110105dW.A0r(C004601z.A0E(view, R.id.later_button), this, 62);
        C18300wT r4 = this.A03;
        long A002 = r4.A01.A00();
        C13680ns.A0x(C110105dW.A06(r4), "payments_last_two_factor_nudge_time", A002);
        AnonymousClass1Vo r1 = r4.A02;
        StringBuilder A0r = AnonymousClass000.A0r("updateLastTwoFactorNudgeTimeMilli to: ");
        A0r.append(A002);
        C110105dW.A1L(r1, A0r);
        C18300wT r3 = this.A03;
        int A012 = C13690nt.A01(r3.A01(), "payments_two_factor_nudge_count") + 1;
        C13680ns.A0w(C110105dW.A06(r3), "payments_two_factor_nudge_count", A012);
        r3.A02.A06(C13680ns.A0c(A012, "updateTwoFactorNudgeCount to: "));
        this.A04.AKS(C13680ns.A0X(), (Integer) null, "two_factor_nudge_prompt", (String) null);
    }
}

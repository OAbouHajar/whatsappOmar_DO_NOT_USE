package com.obwhatsapp.payments.ui;

import X.AnonymousClass00B;
import X.AnonymousClass01V;
import X.C004601z;
import X.C110105dW;
import X.C117125sU;
import X.C1222969a;
import X.C13680ns;
import X.C13690nt;
import X.C14870pt;
import X.C19980zJ;
import X.C45922Bq;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;

public class BrazilAccountRecoveryEligibilityBottomSheet extends Hilt_BrazilAccountRecoveryEligibilityBottomSheet {
    public C19980zJ A00;
    public C14870pt A01;
    public AnonymousClass01V A02;
    public C1222969a A03;
    public C117125sU A04;
    public String A05;

    public static BrazilAccountRecoveryEligibilityBottomSheet A01(String str) {
        BrazilAccountRecoveryEligibilityBottomSheet brazilAccountRecoveryEligibilityBottomSheet = new BrazilAccountRecoveryEligibilityBottomSheet();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("referral_screen", str);
        brazilAccountRecoveryEligibilityBottomSheet.A0T(A0D);
        return brazilAccountRecoveryEligibilityBottomSheet;
    }

    public void A0k() {
        super.A0k();
        this.A04 = null;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        this.A05 = A04().getString("referral_screen");
        View inflate = layoutInflater.inflate(R.layout.layout0021, viewGroup, false);
        Context context = inflate.getContext();
        C14870pt r8 = this.A01;
        C19980zJ r7 = this.A00;
        AnonymousClass01V r10 = this.A02;
        C45922Bq.A08(context, Uri.parse("https://faq.whatsapp.com/1085240205511877"), r7, r8, C13680ns.A0Q(inflate, R.id.desc), r10, C13690nt.A0c(this, "learn-more", C13680ns.A1b(), 0, R.string.str0076));
        return inflate;
    }

    public void A18(Bundle bundle, View view) {
        C110105dW.A0r(C004601z.A0E(view, R.id.use_existing_payments_button), this, 11);
        C110105dW.A0r(C004601z.A0E(view, R.id.close), this, 9);
        C110105dW.A0r(C004601z.A0E(view, R.id.setup_payments_button), this, 10);
        String str = this.A05;
        C1222969a r3 = this.A03;
        AnonymousClass00B.A06(r3);
        r3.AKS(0, (Integer) null, "prompt_recover_payments", str);
    }
}

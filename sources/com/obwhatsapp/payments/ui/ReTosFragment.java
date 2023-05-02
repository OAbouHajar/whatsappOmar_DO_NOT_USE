package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass01V;
import X.AnonymousClass1Vo;
import X.AnonymousClass5xE;
import X.AnonymousClass63D;
import X.AnonymousClass63E;
import X.AnonymousClass63F;
import X.AnonymousClass63G;
import X.AnonymousClass63H;
import X.AnonymousClass63I;
import X.AnonymousClass63J;
import X.AnonymousClass63K;
import X.C004601z;
import X.C110105dW;
import X.C110115dX;
import X.C112055hs;
import X.C1204661t;
import X.C13680ns;
import X.C13690nt;
import X.C17110uY;
import X.C18090w8;
import X.C18310wU;
import X.C28371Vv;
import X.C30531cW;
import X.C35081lL;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import com.facebook.redex.IDxCallbackShape250S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import java.util.ArrayList;

public abstract class ReTosFragment extends Hilt_ReTosFragment {
    public Button A00;
    public ProgressBar A01;
    public AnonymousClass01V A02;
    public C1204661t A03;
    public C18310wU A04;
    public AnonymousClass5xE A05;
    public C18090w8 A06;
    public final AnonymousClass1Vo A07 = C110105dW.A0Q("ReTosFragment", "onboarding");

    public static /* synthetic */ void A01(ReTosFragment reTosFragment) {
        reTosFragment.A1H(false);
        reTosFragment.A00.setVisibility(8);
        reTosFragment.A01.setVisibility(0);
        C18310wU r6 = reTosFragment.A04;
        boolean z2 = reTosFragment.A04().getBoolean("is_consumer");
        boolean z3 = reTosFragment.A04().getBoolean("is_merchant");
        IDxCallbackShape250S0100000_3_I1 iDxCallbackShape250S0100000_3_I1 = new IDxCallbackShape250S0100000_3_I1(reTosFragment, 4);
        ArrayList A0u = AnonymousClass000.A0u();
        A0u.add(new C35081lL("version", 2));
        if (z2) {
            A0u.add(new C35081lL("consumer", 1));
        }
        if (z3) {
            A0u.add(new C35081lL("merchant", 1));
        }
        C28371Vv r10 = new C28371Vv("accept_pay", C110115dX.A1F(A0u, 0));
        r6.A0I(new C112055hs(r6.A05.A00, iDxCallbackShape250S0100000_3_I1, r6.A0B, r6, r6.A01, z2, z3), r10, "set", "urn:xmpp:whatsapp:account", 0);
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        SpannableString A052;
        View A0H = C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout0505);
        TextEmojiLabel A0Q = C13680ns.A0Q(A0H, R.id.retos_bottom_sheet_desc);
        C30531cW.A03(A0Q, this.A02);
        C30531cW.A02(A0Q);
        A0Q.getContext();
        BrazilReTosFragment brazilReTosFragment = (BrazilReTosFragment) this;
        boolean z2 = brazilReTosFragment.A04().getBoolean("is_merchant");
        C17110uY r6 = brazilReTosFragment.A01;
        if (z2) {
            String[] strArr = new String[3];
            C110105dW.A1E(brazilReTosFragment.A00, "https://www.whatsapp.com/legal/merchant-terms/", strArr, 0);
            C110105dW.A1E(brazilReTosFragment.A00, "https://www.facebook.com/legal/commerce_product_merchant_agreement", strArr, 1);
            C110105dW.A1E(brazilReTosFragment.A00, "https://www.cielo.com.br/contrato-de-credenciamento-consolidado/", strArr, 2);
            Runnable[] runnableArr = {new AnonymousClass63F(), new AnonymousClass63H(), new AnonymousClass63D()};
            A052 = r6.A05(brazilReTosFragment.A0J(R.string.str0282), runnableArr, new String[]{"wa-merchant-terms", "fb-merchant-agreement", "cielo-merchant-agreement"}, strArr);
        } else {
            String[] strArr2 = new String[5];
            C110105dW.A1E(brazilReTosFragment.A00, "https://www.whatsapp.com/legal/payments-terms-of-service-br#payments", strArr2, 0);
            C110105dW.A1E(brazilReTosFragment.A00, "https://www.whatsapp.com/legal/payments-terms-of-service-br#payments-privacy-policy", strArr2, 1);
            C110105dW.A1E(brazilReTosFragment.A00, "https://www.facebook.com/payments_terms", strArr2, 2);
            C110105dW.A1E(brazilReTosFragment.A00, "https://www.facebook.com/policy.php", strArr2, 3);
            C110105dW.A1E(brazilReTosFragment.A00, "https://www.cielo.com.br/termos-fb-pay", strArr2, 4);
            Runnable[] runnableArr2 = {new AnonymousClass63K(), new AnonymousClass63E(), new AnonymousClass63J(), new AnonymousClass63I(), new AnonymousClass63G()};
            A052 = r6.A05(brazilReTosFragment.A0J(R.string.str0283), runnableArr2, new String[]{"wa-terms", "wa-privacy-policy", "fb-payments-terms", "fb-privacy-policy", "cielo-terms-and-privacy-policy"}, strArr2);
        }
        A0Q.setText(A052);
        this.A01 = (ProgressBar) C004601z.A0E(A0H, R.id.progress_bar);
        Button button = (Button) C004601z.A0E(A0H, R.id.retos_bottom_sheet_button);
        this.A00 = button;
        C110105dW.A0r(button, this, 103);
        return A0H;
    }

    public void A1N() {
        Bundle A0D = C13690nt.A0D();
        A0D.putBoolean("is_consumer", true);
        A0D.putBoolean("is_merchant", false);
        A0T(A0D);
    }
}

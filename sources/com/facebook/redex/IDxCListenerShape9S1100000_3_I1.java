package com.facebook.redex;

import X.C001000l;
import X.C110105dW;
import X.C118335uW;
import X.C118565ut;
import X.C1202660z;
import X.C13680ns;
import X.C14870pt;
import X.C16040sK;
import X.C16440t3;
import X.C17190ug;
import X.C18280wR;
import X.C18290wS;
import X.C18310wU;
import X.C35301lh;
import android.content.Intent;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentSettingsFragment;
import com.obwhatsapp.payments.ui.IndiaUpiProfileDetailsActivity;

public class IDxCListenerShape9S1100000_3_I1 implements View.OnClickListener {
    public Object A00;
    public String A01;
    public final int A02;

    public IDxCListenerShape9S1100000_3_I1(int i2, String str, Object obj) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = str;
    }

    public final void onClick(View view) {
        switch (this.A02) {
            case 0:
                BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = (BrazilPaymentCardDetailsActivity) this.A00;
                String str = this.A01;
                brazilPaymentCardDetailsActivity.Afq(R.string.str0f5c);
                C16440t3 r6 = brazilPaymentCardDetailsActivity.A05;
                C14870pt r3 = brazilPaymentCardDetailsActivity.A04;
                C16040sK r4 = brazilPaymentCardDetailsActivity.A01;
                C17190ug r8 = brazilPaymentCardDetailsActivity.A01;
                C18280wR r14 = brazilPaymentCardDetailsActivity.A0C;
                C18290wS r12 = brazilPaymentCardDetailsActivity.A0C;
                C18310wU r11 = brazilPaymentCardDetailsActivity.A06;
                C118335uW r13 = brazilPaymentCardDetailsActivity.A09;
                new C118565ut(brazilPaymentCardDetailsActivity, r3, r4, brazilPaymentCardDetailsActivity.A07, r6, brazilPaymentCardDetailsActivity.A00, r8, brazilPaymentCardDetailsActivity.A05, brazilPaymentCardDetailsActivity.A03, r11, r12, r13, r14, str).A00(new C1202660z(brazilPaymentCardDetailsActivity));
                return;
            case 1:
                BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity2 = (BrazilPaymentCardDetailsActivity) this.A00;
                String str2 = this.A01;
                brazilPaymentCardDetailsActivity2.Afq(R.string.str0f5c);
                brazilPaymentCardDetailsActivity2.A0F.A00(new IDxRCallbackShape249S0100000_3_I1(brazilPaymentCardDetailsActivity2, 1), new IDxDConsumerShape388S0100000_3_I1(brazilPaymentCardDetailsActivity2, 1), new IDxTCallbackShape452S0100000_3_I1(brazilPaymentCardDetailsActivity2, 1), str2, "payment_method_details").A00(new IDxNConsumerShape155S0100000_3_I1(brazilPaymentCardDetailsActivity2, 4));
                return;
            case 2:
                IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment = (IndiaUpiPaymentSettingsFragment) this.A00;
                String str3 = this.A01;
                indiaUpiPaymentSettingsFragment.A09.AKS(C13680ns.A0Y(), 129, "payment_home", (String) null);
                C001000l A0D = indiaUpiPaymentSettingsFragment.A0D();
                C35301lh A0J = C110105dW.A0J(C110105dW.A0L(), String.class, str3, "accountHolderName");
                Intent A04 = C110105dW.A04(A0D, IndiaUpiProfileDetailsActivity.class);
                A04.putExtra("extra_payment_name", A0J);
                A04.putExtra("extra_referral_screen", "payment_home");
                indiaUpiPaymentSettingsFragment.A0r(A04);
                return;
            default:
                return;
        }
    }
}

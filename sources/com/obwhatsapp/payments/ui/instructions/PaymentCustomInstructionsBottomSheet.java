package com.obwhatsapp.payments.ui.instructions;

import X.AnonymousClass00B;
import X.C1222969a;
import X.C13690nt;
import X.C15830rv;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PaymentCustomInstructionsBottomSheet extends Hilt_PaymentCustomInstructionsBottomSheet {
    public C15830rv A00;
    public C1222969a A01;
    public String A02;
    public String A03;
    public boolean A04;

    public static PaymentCustomInstructionsBottomSheet A01(C15830rv r2, String str, String str2, boolean z2) {
        Bundle A0D = C13690nt.A0D();
        A0D.putParcelable("merchantJid", r2);
        A0D.putString("PayInstructionsKey", str);
        A0D.putString("referral_screen", str2);
        A0D.putBoolean("should_log_event", z2);
        PaymentCustomInstructionsBottomSheet paymentCustomInstructionsBottomSheet = new PaymentCustomInstructionsBottomSheet();
        paymentCustomInstructionsBottomSheet.A0T(A0D);
        return paymentCustomInstructionsBottomSheet;
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Bundle A042 = A04();
        this.A02 = A042.getString("PayInstructionsKey", "");
        this.A00 = (C15830rv) A042.getParcelable("merchantJid");
        this.A03 = A042.getString("referral_screen");
        this.A04 = A042.getBoolean("should_log_event");
        A1N((Integer) null, 0);
        return super.A11(bundle, layoutInflater, viewGroup);
    }

    public final void A1N(Integer num, int i2) {
        if (this.A04) {
            String str = this.A03;
            C1222969a r2 = this.A01;
            AnonymousClass00B.A06(r2);
            r2.AKS(Integer.valueOf(i2), num, "custom_payment_instructions_prompt", str);
        }
    }
}

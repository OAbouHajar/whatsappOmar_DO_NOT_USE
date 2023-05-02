package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass175;
import X.AnonymousClass5wV;
import X.C003401n;
import X.C014206u;
import X.C110565eR;
import X.C110735ek;
import X.C114185nG;
import X.C118915vc;
import X.C1200960h;
import X.C14710pd;
import X.C16320sq;
import X.C16440t3;
import X.C18290wS;
import X.C30671cl;
import com.obwhatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import com.obwhatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment;
import com.obwhatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment;

public class IDxIFactoryShape26S0100000_3_I1 extends C014206u {
    public Object A00;
    public final int A01;

    public IDxIFactoryShape26S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public C003401n A6s(Class cls) {
        String str;
        switch (this.A01) {
            case 0:
                if (!cls.isAssignableFrom(C114185nG.class)) {
                    str = "View Model type mismatch. Expected a BrazilPaymentCardDetailsViewModel";
                    break;
                } else {
                    BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = (BrazilPaymentCardDetailsActivity) this.A00;
                    C16440t3 r2 = brazilPaymentCardDetailsActivity.A05;
                    C16320sq r11 = brazilPaymentCardDetailsActivity.A0G;
                    C30671cl r3 = brazilPaymentCardDetailsActivity.A08;
                    C18290wS r6 = brazilPaymentCardDetailsActivity.A0C;
                    AnonymousClass5wV r9 = brazilPaymentCardDetailsActivity.A0A;
                    AnonymousClass175 r4 = brazilPaymentCardDetailsActivity.A09;
                    C118915vc r10 = brazilPaymentCardDetailsActivity.A0B;
                    return new C114185nG(r2, r3, r4, brazilPaymentCardDetailsActivity.A06, r6, brazilPaymentCardDetailsActivity.A08, brazilPaymentCardDetailsActivity.A09, r9, r10, r11);
                }
            case 1:
                if (!cls.isAssignableFrom(C110735ek.class)) {
                    str = "Invalid viewModel for IndiaUpiSendToVpaViewModel";
                    break;
                } else {
                    IndiaUpiSendPaymentToVpaFragment indiaUpiSendPaymentToVpaFragment = (IndiaUpiSendPaymentToVpaFragment) this.A00;
                    C14710pd r32 = indiaUpiSendPaymentToVpaFragment.A0B;
                    C16320sq r7 = indiaUpiSendPaymentToVpaFragment.A0W;
                    C1200960h r62 = indiaUpiSendPaymentToVpaFragment.A0P;
                    return new C110735ek(indiaUpiSendPaymentToVpaFragment.A09, r32, indiaUpiSendPaymentToVpaFragment.A0G, indiaUpiSendPaymentToVpaFragment.A0M, r62, r7);
                }
            default:
                if (!cls.isAssignableFrom(C110565eR.class)) {
                    str = "Invalid viewModel";
                    break;
                } else {
                    return new C110565eR(((IndiaUpiPaymentInviteFragment) this.A00).A0C);
                }
        }
        throw AnonymousClass000.A0T(str);
    }
}

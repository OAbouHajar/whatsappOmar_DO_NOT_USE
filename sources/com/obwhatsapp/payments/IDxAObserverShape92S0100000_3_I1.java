package com.obwhatsapp.payments;

import X.AnonymousClass1WD;
import X.AnonymousClass4PY;
import X.AnonymousClass5kl;
import X.AnonymousClass66N;
import X.C111345g2;
import X.C112825ja;
import X.C114585o0;
import X.C1210463z;
import X.C13680ns;
import com.facebook.redex.IDxNConsumerShape155S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.BrazilPaymentActivity;
import com.obwhatsapp.payments.ui.ConfirmReceivePaymentFragment;
import com.obwhatsapp.payments.ui.PaymentMethodsListPickerFragment;

public class IDxAObserverShape92S0100000_3_I1 extends AnonymousClass4PY {
    public Object A00;
    public final int A01;

    public IDxAObserverShape92S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00() {
        switch (this.A01) {
            case 0:
                BrazilPaymentActivity brazilPaymentActivity = (BrazilPaymentActivity) this.A00;
                brazilPaymentActivity.A02.A04();
                brazilPaymentActivity.A02 = brazilPaymentActivity.A0P.A01().A00();
                return;
            case 1:
                ConfirmReceivePaymentFragment confirmReceivePaymentFragment = (ConfirmReceivePaymentFragment) this.A00;
                AnonymousClass1WD r0 = confirmReceivePaymentFragment.A01;
                if (r0 != null) {
                    r0.A04();
                }
                confirmReceivePaymentFragment.A01 = confirmReceivePaymentFragment.A04.A01().A00();
                return;
            case 2:
                AnonymousClass5kl r4 = (AnonymousClass5kl) this.A00;
                r4.A3q(r4.A08, "ConfirmPaymentFragment");
                C1210463z r3 = new C1210463z(this);
                r4.Afq(R.string.str13db);
                r4.A05.Acl(new AnonymousClass66N(r4, r3, true));
                return;
            case 3:
                C112825ja r2 = (C112825ja) this.A00;
                C114585o0 r1 = r2.A0V;
                if (r1 != null) {
                    r1.A06(true);
                    r2.A0V = null;
                }
                if (C111345g2.A21(r2)) {
                    C114585o0 r12 = new C114585o0(r2);
                    r2.A0V = r12;
                    C13680ns.A1U(r12, r2.A05);
                    return;
                }
                return;
            default:
                PaymentMethodsListPickerFragment paymentMethodsListPickerFragment = (PaymentMethodsListPickerFragment) this.A00;
                paymentMethodsListPickerFragment.A05.A01().A00().A01(new IDxNConsumerShape155S0100000_3_I1(this, 7), paymentMethodsListPickerFragment.A00.A06);
                return;
        }
    }
}

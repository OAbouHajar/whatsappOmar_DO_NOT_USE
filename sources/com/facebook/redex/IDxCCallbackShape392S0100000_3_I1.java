package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass1Vo;
import X.AnonymousClass2HJ;
import X.AnonymousClass5ko;
import X.C111765hN;
import X.C112825ja;
import X.C112935km;
import X.C1200960h;
import X.C1222668x;
import X.C39841t9;
import com.obwhatsapp.payments.ui.IndiaUpiSendPaymentActivity;

public class IDxCCallbackShape392S0100000_3_I1 implements C1222668x {
    public Object A00;
    public final int A01;

    public IDxCCallbackShape392S0100000_3_I1(IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity, int i2) {
        this.A01 = i2;
        this.A00 = indiaUpiSendPaymentActivity;
    }

    public void AP5(C111765hN r5) {
        switch (this.A01) {
            case 0:
                ((C112935km) this.A00).A3c();
                return;
            case 1:
                IndiaUpiSendPaymentActivity indiaUpiSendPaymentActivity = (IndiaUpiSendPaymentActivity) this.A00;
                indiaUpiSendPaymentActivity.A0r = false;
                indiaUpiSendPaymentActivity.Ac1();
                if (r5 != null && !indiaUpiSendPaymentActivity.A4A(r5)) {
                    AnonymousClass1Vo r3 = indiaUpiSendPaymentActivity.A0t;
                    StringBuilder A0r = AnonymousClass000.A0r("starting onContactVpa for jid: ");
                    A0r.append(indiaUpiSendPaymentActivity.A0C);
                    A0r.append(" vpa: ");
                    A0r.append(r5.A02);
                    A0r.append(" receiverVpaId: ");
                    r3.A06(AnonymousClass000.A0h(r5.A03, A0r));
                    indiaUpiSendPaymentActivity.A09 = r5.A02;
                    indiaUpiSendPaymentActivity.A0Q = r5.A03;
                    if (!C39841t9.A03(r5.A01)) {
                        indiaUpiSendPaymentActivity.A07 = r5.A01;
                    }
                    indiaUpiSendPaymentActivity.A4F(true);
                    return;
                }
                return;
            default:
                if (r5 != null && !C39841t9.A03(r5.A01)) {
                    ((AnonymousClass5ko) this.A00).A07 = r5.A01;
                    return;
                }
                return;
        }
    }

    public void AQW(AnonymousClass2HJ r5) {
        int i2 = this.A01;
        C112825ja r3 = (C112825ja) this.A00;
        switch (i2) {
            case 0:
                if (!C1200960h.A02(r3, "upi-get-vpa", r5.A00, false)) {
                    r3.A0t.A06("could not get account vpa: showErrorAndFinish");
                    break;
                } else {
                    return;
                }
            case 1:
                r3.A0r = false;
                r3.Ac1();
                if (!C1200960h.A02(r3, "upi-get-vpa", r5.A00, false)) {
                    AnonymousClass1Vo r2 = r3.A0t;
                    StringBuilder A0r = AnonymousClass000.A0r("could not get vpa for jid: ");
                    A0r.append(r3.A0C);
                    r2.A06(AnonymousClass000.A0h("; showErrorAndFinish", A0r));
                    break;
                } else {
                    return;
                }
            default:
                r3.A0t.A05(AnonymousClass000.A0f(r3.A0C, AnonymousClass000.A0r("could not get payee name for jio: ")));
                return;
        }
        r3.A41(r5);
    }
}

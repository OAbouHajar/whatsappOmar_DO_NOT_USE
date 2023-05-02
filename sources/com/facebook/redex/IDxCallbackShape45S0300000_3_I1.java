package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass1TV;
import X.AnonymousClass2HJ;
import X.AnonymousClass2HK;
import X.AnonymousClass2T3;
import X.AnonymousClass4XO;
import X.C114105n8;
import X.C119265wo;
import X.C1222969a;
import X.C18300wT;
import X.C35381lq;
import X.C77583w1;
import android.text.TextUtils;
import com.obwhatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity;

public class IDxCallbackShape45S0300000_3_I1 implements AnonymousClass1TV {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxCallbackShape45S0300000_3_I1(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public void AWC(AnonymousClass2HJ r5) {
        if (this.A03 != 0) {
            C114105n8 r3 = (C114105n8) this.A00;
            C18300wT r2 = r3.A09;
            r2.A0E(r3.A05.A00());
            r2.A0B(0);
            r3.A08.A05(AnonymousClass000.A0g("accountRecovery/getPaymentTransactions/onRequestError. paymentNetworkError: ", r5));
            return;
        }
        ((AnonymousClass1TV) this.A01).AWC(r5);
    }

    public void AWI(AnonymousClass2HJ r5) {
        int i2 = this.A03;
        Object obj = this.A00;
        if (i2 != 0) {
            C114105n8 r3 = (C114105n8) obj;
            C18300wT r2 = r3.A09;
            r2.A0E(r3.A05.A00());
            r2.A0B(0);
            r3.A08.A05(AnonymousClass000.A0g("accountRecovery/getPaymentTransactions/onResponseError. paymentNetworkError: ", r5));
            return;
        }
        IndiaUpiBankAccountDetailsActivity indiaUpiBankAccountDetailsActivity = (IndiaUpiBankAccountDetailsActivity) obj;
        indiaUpiBankAccountDetailsActivity.A0J.A06(AnonymousClass000.A0g("removePayment/onResponseError. paymentNetworkError: ", r5));
        C1222969a r1 = (C1222969a) this.A02;
        if (r1 != null) {
            r1.AKK(r5, 13);
        }
        C119265wo A04 = indiaUpiBankAccountDetailsActivity.A0C.A04((AnonymousClass4XO) null, r5.A00);
        if (A04.A00 != 0) {
            indiaUpiBankAccountDetailsActivity.Ac1();
            String A012 = A04.A01(indiaUpiBankAccountDetailsActivity);
            AnonymousClass2T3 r0 = new AnonymousClass2T3();
            r0.A08 = A012;
            r0.A00().A1G(indiaUpiBankAccountDetailsActivity.AGM(), (String) null);
            return;
        }
        ((AnonymousClass1TV) this.A01).AWI(r5);
    }

    public void AWJ(AnonymousClass2HK r8) {
        C18300wT r2;
        int i2;
        if (this.A03 != 0) {
            boolean z2 = r8 instanceof C77583w1;
            C114105n8 r3 = (C114105n8) this.A00;
            if (z2) {
                r3.A08.A04("accountRecovery/getTransactions/onResponseSuccess");
                C77583w1 r82 = (C77583w1) r8;
                C35381lq r1 = r82.A00;
                if (r1 == null) {
                    return;
                }
                if (r1.A01 || TextUtils.isEmpty(r1.A00)) {
                    r2 = r3.A09;
                    r2.A0E(r3.A05.A00());
                    i2 = 2;
                } else {
                    r3.A07.A01(this, (Integer) this.A02, (Integer) this.A01, r82.A00.A00, (String) null);
                    return;
                }
            } else {
                r2 = r3.A09;
                r2.A0E(r3.A05.A00());
                r3.A08.A04("unexpected payment transaction result type.");
                i2 = 0;
            }
            r2.A0B(i2);
            return;
        }
        ((AnonymousClass1TV) this.A01).AWJ(r8);
    }
}

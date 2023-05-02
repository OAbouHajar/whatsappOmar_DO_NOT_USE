package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass1TV;
import X.AnonymousClass1WD;
import X.AnonymousClass1Z7;
import X.AnonymousClass29T;
import X.AnonymousClass2HJ;
import X.AnonymousClass2HK;
import X.C110105dW;
import X.C110755em;
import X.C112855jo;
import X.C112885jv;
import X.C119165we;
import X.C1222969a;
import X.C13680ns;
import X.C14550pN;
import android.content.Context;
import com.obwhatsapp.R;
import java.util.Map;

public class IDxCallbackShape65S0200000_3_I1 implements AnonymousClass1TV {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCallbackShape65S0200000_3_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void AWC(AnonymousClass2HJ r10) {
        switch (this.A02) {
            case 0:
                ((AnonymousClass1WD) this.A01).A02(Boolean.FALSE);
                return;
            case 3:
                C112885jv r2 = (C112885jv) this.A00;
                r2.A0J.A04(AnonymousClass000.A0g("removePayment/onRequestError. paymentNetworkError: ", r10));
                C1222969a r1 = (C1222969a) this.A01;
                if (r1 != null) {
                    r1.AKK(r10, 13);
                }
                r2.Ac1();
                r2.Afg(R.string.str0f73);
                return;
            case 4:
                C119165we r22 = (C119165we) this.A00;
                r22.A0G.A04(AnonymousClass000.A0g("onClosePaymentAccountConfirmed/onRequestError. paymentNetworkError: ", r10));
                r22.A0C.A01((Context) this.A01, r22.A0B, r22.A0D, r10.A00, R.string.str0f35).show();
                return;
            case 5:
                ((C110755em) this.A00).A0f.A06(AnonymousClass000.A0g("syncPendingTransaction onRequestError: ", r10));
                C1222969a r12 = (C1222969a) this.A01;
                if (r12 != null) {
                    r12.AKK(r10, 10);
                    return;
                }
                return;
            default:
                C112855jo.A09((AnonymousClass1Z7) this.A01, (Map) null, r10.A00);
                return;
        }
    }

    public void AWI(AnonymousClass2HJ r10) {
        switch (this.A02) {
            case 0:
                ((AnonymousClass1WD) this.A01).A02(Boolean.FALSE);
                return;
            case 3:
                C112885jv r2 = (C112885jv) this.A00;
                r2.A0J.A06(AnonymousClass000.A0g("removePayment/onResponseError. paymentNetworkError: ", r10));
                C1222969a r1 = (C1222969a) this.A01;
                if (r1 != null) {
                    r1.AKK(r10, 13);
                }
                r2.Ac1();
                r2.Afg(R.string.str0f73);
                return;
            case 4:
                C119165we r22 = (C119165we) this.A00;
                r22.A0G.A06(AnonymousClass000.A0g("onClosePaymentAccountConfirmed/onResponseError. paymentNetworkError: ", r10));
                C14550pN r4 = (C14550pN) this.A01;
                r4.Ac1();
                r22.A0C.A01(r4, r22.A0B, r22.A0D, r10.A00, R.string.str0f35).show();
                return;
            case 5:
                ((C110755em) this.A00).A0f.A06(AnonymousClass000.A0g("syncPendingTransaction onResponseError: ", r10));
                C1222969a r12 = (C1222969a) this.A01;
                if (r12 != null) {
                    r12.AKK(r10, 10);
                    return;
                }
                return;
            default:
                C112855jo.A09((AnonymousClass1Z7) this.A01, (Map) null, r10.A00);
                return;
        }
    }

    public void AWJ(AnonymousClass2HK r5) {
        switch (this.A02) {
            case 0:
                ((AnonymousClass1WD) this.A01).A02(Boolean.TRUE);
                return;
            case 3:
                C112885jv r3 = (C112885jv) this.A00;
                r3.A0J.A06("removePayment Success");
                C1222969a r2 = (C1222969a) this.A01;
                if (r2 != null) {
                    r2.AKK((AnonymousClass2HJ) null, 13);
                }
                r3.Ac1();
                r3.Afg(R.string.str0f77);
                return;
            case 4:
                C119165we r22 = (C119165we) this.A00;
                r22.A0G.A06("onClosePaymentAccountConfirmed/onResponseSuccess");
                C14550pN r32 = (C14550pN) this.A01;
                r32.Ac1();
                C13680ns.A0z(C110105dW.A06(r22.A04), "payment_brazil_nux_dismissed", true);
                AnonymousClass29T.A01(r32, 100);
                return;
            case 5:
                ((C110755em) this.A00).A0f.A06("syncPendingTransaction onResponseSuccess");
                C1222969a r23 = (C1222969a) this.A01;
                if (r23 != null) {
                    r23.AKK((AnonymousClass2HJ) null, 10);
                    return;
                }
                return;
            default:
                ((AnonymousClass1Z7) this.A01).A00("on_success");
                return;
        }
    }
}

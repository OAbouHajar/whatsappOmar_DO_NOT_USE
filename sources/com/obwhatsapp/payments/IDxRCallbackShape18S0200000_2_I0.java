package com.obwhatsapp.payments;

import X.AnonymousClass000;
import X.AnonymousClass1TV;
import X.AnonymousClass1W9;
import X.AnonymousClass2HA;
import X.AnonymousClass2HJ;
import X.C14880pu;
import X.C18310wU;
import X.C18340wX;
import X.C28371Vv;
import android.content.Context;
import com.facebook.redex.IDxSListenerShape309S0100000_2_I1;

public class IDxRCallbackShape18S0200000_2_I0 extends AnonymousClass2HA {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxRCallbackShape18S0200000_2_I0(Context context, C18340wX r2, C14880pu r3, Object obj, Object obj2, int i2) {
        super(context, r2, r3);
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void A03(AnonymousClass2HJ r2) {
        if (2 - this.A02 != 0) {
            ((AnonymousClass1TV) this.A01).AWC(r2);
        }
    }

    public void A04(AnonymousClass2HJ r2) {
        if (2 - this.A02 != 0) {
            ((AnonymousClass1TV) this.A01).AWI(r2);
        }
    }

    public void A05(C28371Vv r4) {
        switch (this.A02) {
            case 0:
                ((C18310wU) this.A00).A06(new IDxSListenerShape309S0100000_2_I1((AnonymousClass1TV) this.A01, 0), r4, true);
                return;
            case 1:
                try {
                    AnonymousClass2HJ A002 = AnonymousClass2HJ.A00(r4.A0K("account"));
                    if (A002 != null) {
                        ((AnonymousClass1TV) this.A01).AWI(A002);
                        return;
                    }
                    ((C18310wU) this.A00).A06(new IDxSListenerShape309S0100000_2_I1((AnonymousClass1TV) this.A01, 1), r4, true);
                    return;
                } catch (AnonymousClass1W9 e2) {
                    ((C18310wU) this.A00).A0I.A05(AnonymousClass000.A0g("removePaymentMethod/onResponseSuccess/corrupt stream exception: ", e2));
                    ((AnonymousClass1TV) this.A01).AWI(new AnonymousClass2HJ(500));
                    return;
                }
            default:
                return;
        }
    }
}

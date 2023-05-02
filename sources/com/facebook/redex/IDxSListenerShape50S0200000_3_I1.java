package com.facebook.redex;

import X.AnonymousClass1Z7;
import X.AnonymousClass2HF;
import X.AnonymousClass2HJ;
import X.AnonymousClass638;
import X.C112115hy;
import X.C112135i0;
import X.C112155i2;
import X.C112165i3;
import X.C117635tJ;
import X.C118815vI;
import X.C1202660z;
import X.C1222468v;
import X.C13690nt;
import X.C35391lr;
import X.C35441lw;
import com.obwhatsapp.payments.IDxRCallbackShape94S0100000_3_I1;
import com.obwhatsapp.payments.ui.BrazilPayBloksActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentCardDetailsActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IDxSListenerShape50S0200000_3_I1 implements AnonymousClass2HF {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxSListenerShape50S0200000_3_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void AMM(List list) {
        switch (this.A02) {
            case 0:
                ((C112135i0) ((IDxRCallbackShape94S0100000_3_I1) this.A00).A00).A0E.A00((C35391lr) this.A01, (AnonymousClass2HJ) null, (ArrayList) null, true, false);
                return;
            case 1:
                ((C112135i0) ((IDxRCallbackShape94S0100000_3_I1) this.A00).A00).A0E.A00((C35391lr) this.A01, (AnonymousClass2HJ) null, (ArrayList) null, false, false);
                return;
            case 2:
                ((C112135i0) ((IDxRCallbackShape94S0100000_3_I1) this.A00).A00).A0E.A00((C35391lr) this.A01, (AnonymousClass2HJ) null, (ArrayList) null, false, true);
                return;
            case 3:
                ((C118815vI) this.A00).A01((C35391lr) this.A01);
                return;
            case 4:
                ((C1222468v) this.A00).AOB((C35391lr) this.A01);
                return;
            case 5:
                ((C1222468v) this.A00).AWW((AnonymousClass2HJ) null, (ArrayList) this.A01);
                return;
            case 6:
                ((C117635tJ) ((IDxRCallbackShape94S0100000_3_I1) this.A00).A00).A06.A00((C35441lw) this.A01, (AnonymousClass2HJ) null);
                return;
            case 7:
                ((C112115hy) ((IDxRCallbackShape94S0100000_3_I1) this.A00).A00).A07.A00((AnonymousClass2HJ) null);
                return;
            case 8:
                ((C112165i3) ((IDxRCallbackShape94S0100000_3_I1) this.A00).A00).A05.A00((C35391lr) this.A01, (AnonymousClass2HJ) null);
                return;
            case 9:
                ((C112155i2) ((IDxRCallbackShape94S0100000_3_I1) this.A00).A00).A04.A00((AnonymousClass2HJ) null);
                return;
            case 10:
                ((AnonymousClass1Z7) this.A00).A01("on_success", (HashMap) this.A01);
                return;
            case 11:
                ((AnonymousClass1Z7) this.A00).A01("on_failure", (Map) this.A01);
                return;
            case 12:
                IDxMCallbackShape6S1200000_3_I1 iDxMCallbackShape6S1200000_3_I1 = (IDxMCallbackShape6S1200000_3_I1) this.A00;
                AnonymousClass1Z7 r4 = (AnonymousClass1Z7) this.A01;
                if (list.size() > 0) {
                    r4.A01("on_success", ((BrazilPayBloksActivity) iDxMCallbackShape6S1200000_3_I1.A00).A0L.A03((C35391lr) C13690nt.A0Z(list), (AnonymousClass638) null, (String) null, -1));
                    return;
                }
                return;
            default:
                C35391lr r1 = (C35391lr) this.A01;
                BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity = ((C1202660z) this.A00).A00;
                brazilPaymentCardDetailsActivity.A08 = r1;
                brazilPaymentCardDetailsActivity.Ag3(brazilPaymentCardDetailsActivity.A0D.A00(brazilPaymentCardDetailsActivity, r1), 1);
                return;
        }
    }
}

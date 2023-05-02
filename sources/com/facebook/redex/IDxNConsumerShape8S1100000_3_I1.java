package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass1WE;
import X.AnonymousClass65S;
import X.C35391lr;
import com.obwhatsapp.payments.ui.BrazilPayBloksActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentActivity;

public class IDxNConsumerShape8S1100000_3_I1 implements AnonymousClass1WE {
    public Object A00;
    public String A01;
    public final int A02;

    public IDxNConsumerShape8S1100000_3_I1(int i2, String str, Object obj) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = str;
    }

    public final void accept(Object obj) {
        C35391lr r1;
        if (this.A02 != 0) {
            BrazilPaymentActivity brazilPaymentActivity = (BrazilPaymentActivity) this.A00;
            String str = this.A01;
            if (AnonymousClass000.A1X(obj)) {
                brazilPaymentActivity.A05.Acl(new AnonymousClass65S(brazilPaymentActivity, str));
                return;
            }
            return;
        }
        BrazilPayBloksActivity brazilPayBloksActivity = (BrazilPayBloksActivity) this.A00;
        String str2 = this.A01;
        if (AnonymousClass000.A1X(obj) && (r1 = (C35391lr) brazilPayBloksActivity.A05.A08(str2)) != null) {
            brazilPayBloksActivity.startActivity(brazilPayBloksActivity.A0L.A00(brazilPayBloksActivity, r1));
        }
        brazilPayBloksActivity.finish();
    }
}

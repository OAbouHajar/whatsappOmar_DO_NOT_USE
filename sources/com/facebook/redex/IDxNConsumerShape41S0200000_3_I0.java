package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass1Vo;
import X.AnonymousClass1WE;
import X.AnonymousClass65M;
import X.C112565ih;
import X.C119405xi;
import X.C14600pS;
import X.C35391lr;
import com.whatsapp.util.Log;
import java.util.List;

public class IDxNConsumerShape41S0200000_3_I0 implements AnonymousClass1WE {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxNConsumerShape41S0200000_3_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void accept(Object obj) {
        String A012;
        if (this.A02 != 0) {
            C112565ih r1 = (C112565ih) this.A00;
            C14600pS r3 = (C14600pS) this.A01;
            List list = (List) obj;
            if (list.size() == 0) {
                A012 = "PAY: BrazilPaymentService/onAcceptPayment: Can't launch the 'ConfirmReceiveFragment'.";
            } else {
                r1.A01.A0K(new AnonymousClass65M(r3, (C35391lr) list.get(C119405xi.A01(list))));
                return;
            }
        } else if (!AnonymousClass000.A1X(obj)) {
            A012 = AnonymousClass1Vo.A01("BrazilPaymentMerchantHelper", "triggerMerchantOnboarding -> merchant onboarding failed. Something went wrong");
        } else {
            throw new UnsupportedOperationException();
        }
        Log.e(A012);
    }
}

package com.obwhatsapp.payments.ui;

import X.C110105dW;
import X.C111425gA;
import X.C114065n4;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C49132Rg;

public class BrazilPaymentContactSupportP2pActivity extends C111425gA {
    public C114065n4 A00;
    public boolean A01;

    public BrazilPaymentContactSupportP2pActivity() {
        this(0);
    }

    public BrazilPaymentContactSupportP2pActivity(int i2) {
        this.A01 = false;
        C110105dW.A0t(this, 23);
    }

    public void A1q() {
        if (!this.A01) {
            this.A01 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            this.A00 = (C114065n4) A0C.A04.get();
        }
    }

    public void A36() {
        super.A36();
        C110105dW.A0x(this, this.A00.A00, 11);
    }
}

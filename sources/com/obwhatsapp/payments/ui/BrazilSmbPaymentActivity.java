package com.obwhatsapp.payments.ui;

import X.AnonymousClass5xG;
import X.C110105dW;
import X.C111345g2;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C49132Rg;

public class BrazilSmbPaymentActivity extends BrazilPaymentActivity {
    public boolean A00;

    public BrazilSmbPaymentActivity() {
        this(0);
    }

    public BrazilSmbPaymentActivity(int i2) {
        this.A00 = false;
        C110105dW.A0t(this, 29);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            C111345g2.A1k(A0C, r1, this, C111345g2.A1e(r1, this));
            C111345g2.A1p(r1, this);
            C111345g2.A1o(r1, this);
            C111345g2.A1j(A0C, r1, (AnonymousClass5xG) r1.AHX.get(), this);
        }
    }
}

package com.obwhatsapp.payments.ui;

import X.C110105dW;
import X.C111425gA;
import X.C114075n5;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C49132Rg;

public class BrazilPaymentReportPaymentActivity extends C111425gA {
    public C114075n5 A00;
    public boolean A01;

    public BrazilPaymentReportPaymentActivity() {
        this(0);
    }

    public BrazilPaymentReportPaymentActivity(int i2) {
        this.A01 = false;
        C110105dW.A0t(this, 26);
    }

    public void A1q() {
        if (!this.A01) {
            this.A01 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            this.A00 = (C114075n5) A0C.A08.get();
        }
    }
}
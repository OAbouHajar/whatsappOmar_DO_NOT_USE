package com.obwhatsapp.payments.ui;

import X.C005402i;
import X.C110105dW;
import X.C110115dX;
import X.C111345g2;
import X.C112805jS;
import X.C1200960h;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C49132Rg;
import android.os.Bundle;
import com.obwhatsapp.R;

public class IndiaUpiProvideMoreInfoActivity extends C112805jS {
    public boolean A00;

    public IndiaUpiProvideMoreInfoActivity() {
        this(0);
    }

    public IndiaUpiProvideMoreInfoActivity(int i2) {
        this.A00 = false;
        C110105dW.A0t(this, 72);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            C111345g2.A1k(A0C, r1, this, C111345g2.A1e(r1, this));
            C111345g2.A1q(r1, this);
            this.A04 = (C1200960h) r1.ACB.get();
            this.A00 = C110115dX.A0D(r1);
            this.A02 = C16150sX.A0z(r1);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0308);
        C005402i A0r = C111345g2.A0r(this);
        if (A0r != null) {
            C110115dX.A0u(A0r, getString(R.string.str0fdf));
        }
        C110105dW.A0r(findViewById(R.id.account_recovery_info_continue), this, 75);
    }
}

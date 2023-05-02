package com.obwhatsapp.payments.ui;

import X.AnonymousClass3A2;
import X.AnonymousClass5ko;
import X.C005402i;
import X.C110105dW;
import X.C111345g2;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C227819g;
import X.C227919h;
import X.C49132Rg;
import android.os.Bundle;
import android.view.View;
import com.obwhatsapp.R;

public final class IndiaUpiInteropSendToUpiActivity extends AnonymousClass5ko {
    public C227919h A00;
    public C227819g A01;
    public boolean A02;

    public IndiaUpiInteropSendToUpiActivity() {
        this(0);
    }

    public IndiaUpiInteropSendToUpiActivity(int i2) {
        this.A02 = false;
        C110105dW.A0t(this, 52);
    }

    public void A1q() {
        if (!this.A02) {
            this.A02 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            C111345g2.A1k(A0C, r1, this, C111345g2.A1e(r1, this));
            C111345g2.A1q(r1, this);
            this.A01 = (C227819g) r1.AHv.get();
            this.A00 = (C227919h) r1.AH8.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0318);
        Aem(C110105dW.A09(this));
        C005402i x2 = x();
        if (x2 != null) {
            C110105dW.A0u(x2, R.string.str0ddf);
        }
        View findViewById = findViewById(R.id.send_to_upi_container);
        AnonymousClass3A2.A01(findViewById, R.drawable.ic_send_to_upi, 0, R.drawable.grey_circle_stroke, R.string.str14f9);
        C110105dW.A0r(findViewById, this, 47);
    }
}

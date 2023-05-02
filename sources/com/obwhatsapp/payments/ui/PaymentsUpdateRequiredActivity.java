package com.obwhatsapp.payments.ui;

import X.C005402i;
import X.C110105dW;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C18890xQ;
import X.C49132Rg;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;

public class PaymentsUpdateRequiredActivity extends C14530pL {
    public C18890xQ A00;
    public WaImageView A01;
    public boolean A02;

    public PaymentsUpdateRequiredActivity() {
        this(0);
    }

    public PaymentsUpdateRequiredActivity(int i2) {
        this.A02 = false;
        C110105dW.A0t(this, 97);
    }

    public void A1q() {
        if (!this.A02) {
            this.A02 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            this.A00 = (C18890xQ) r1.APS.get();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        WaImageView waImageView = this.A01;
        int i2 = 0;
        if (configuration.orientation == 2) {
            i2 = 8;
        }
        waImageView.setVisibility(i2);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C005402i x2 = x();
        if (x2 != null) {
            C110105dW.A0u(x2, R.string.str1658);
        }
        setContentView((int) R.layout.layout0486);
        findViewById(R.id.update_title);
        findViewById(R.id.update_description);
        TextView A0N = C13680ns.A0N(this, R.id.upgrade_button);
        A0N.setText(R.string.str0326);
        C110105dW.A0r(A0N, this, 102);
        this.A01 = (WaImageView) findViewById(R.id.update_icon);
    }
}

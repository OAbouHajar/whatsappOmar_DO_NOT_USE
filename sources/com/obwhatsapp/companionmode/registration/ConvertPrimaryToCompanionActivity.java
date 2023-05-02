package com.obwhatsapp.companionmode.registration;

import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C16980tz;
import X.C19010xc;
import X.C19710ys;
import X.C49132Rg;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape126S0100000_1_I1;
import com.obwhatsapp.R;

public class ConvertPrimaryToCompanionActivity extends C14530pL {
    public C19010xc A00;
    public C19710ys A01;
    public C16980tz A02;
    public boolean A03;

    public ConvertPrimaryToCompanionActivity() {
        this(0);
    }

    public ConvertPrimaryToCompanionActivity(int i2) {
        this.A03 = false;
        C13680ns.A1G(this, 46);
    }

    public void A1q() {
        if (!this.A03) {
            this.A03 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A02 = C16150sX.A0V(r1);
            this.A00 = (C19010xc) r1.A6Y.get();
            this.A01 = (C19710ys) r1.A4f.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str05f6);
        C14530pL.A0Y(this);
        setContentView((int) R.layout.layout01f6);
        C14530pL.A0V(this, C13680ns.A0N(this, R.id.companion_mode_warning_text_1), getString(R.string.str05fc));
        C14530pL.A0V(this, C13680ns.A0N(this, R.id.companion_mode_warning_text_2), getString(R.string.str05f9));
        C13680ns.A1B(findViewById(R.id.proceed_button), this, new IDxCListenerShape126S0100000_1_I1(this, 2), 39);
    }
}

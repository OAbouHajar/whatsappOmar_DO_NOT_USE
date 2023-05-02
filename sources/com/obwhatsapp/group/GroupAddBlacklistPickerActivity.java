package com.obwhatsapp.group;

import X.C108815Pp;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C26121Mk;
import X.C32501gU;
import X.C49132Rg;
import android.os.Bundle;
import com.obwhatsapp.R;

public class GroupAddBlacklistPickerActivity extends C32501gU implements C108815Pp {
    public C26121Mk A00;
    public boolean A01;
    public boolean A02;

    public GroupAddBlacklistPickerActivity() {
        this(0);
    }

    public GroupAddBlacklistPickerActivity(int i2) {
        this.A01 = false;
        C13680ns.A1G(this, 71);
    }

    public void A1q() {
        if (!this.A01) {
            this.A01 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            C14530pL.A0Z(this, r1);
            this.A00 = (C26121Mk) r1.ABJ.get();
        }
    }

    public void A6g() {
        this.A05.A08(0, R.string.str0b79);
        C13680ns.A1L(this, this.A00.A01(this.A0T), 92);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A02 = getIntent().getBooleanExtra("was_nobody", false);
    }
}

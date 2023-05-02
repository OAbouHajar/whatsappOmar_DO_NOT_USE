package com.obwhatsapp.lastseen;

import X.AnonymousClass2ZA;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C32501gU;
import X.C49132Rg;

public class LastSeenBlockListPickerActivity extends C32501gU {
    public AnonymousClass2ZA A00;
    public boolean A01;

    public LastSeenBlockListPickerActivity() {
        this(0);
    }

    public LastSeenBlockListPickerActivity(int i2) {
        this.A01 = false;
        C13680ns.A1G(this, 82);
    }

    public void A1q() {
        if (!this.A01) {
            this.A01 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            C14530pL.A0Z(this, r1);
            this.A00 = A1T.A0a();
        }
    }
}

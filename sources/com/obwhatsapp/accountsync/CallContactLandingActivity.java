package com.obwhatsapp.accountsync;

import X.AnonymousClass19Y;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C16250si;
import X.C16900tq;
import X.C19760yx;
import X.C204310c;
import X.C49132Rg;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;

public class CallContactLandingActivity extends ProfileActivity {
    public C204310c A00;
    public boolean A01;

    public CallContactLandingActivity() {
        this(0);
    }

    public CallContactLandingActivity(int i2) {
        this.A01 = false;
        C13680ns.A1G(this, 9);
    }

    public void A1q() {
        if (!this.A01) {
            this.A01 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A01 = A1T.A0F();
            this.A02 = C16150sX.A0M(r1);
            this.A05 = C16150sX.A0o(r1);
            this.A06 = (WhatsAppLibLoader) r1.AR7.get();
            this.A03 = (C16250si) r1.AFP.get();
            this.A01 = (AnonymousClass19Y) r1.A4r.get();
            this.A04 = (C16900tq) r1.AFT.get();
            this.A07 = (C19760yx) r1.AKx.get();
            this.A00 = (C204310c) r1.A3O.get();
        }
    }
}

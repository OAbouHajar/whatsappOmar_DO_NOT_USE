package com.obwhatsapp.conversation;

import X.AnonymousClass1V8;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C49132Rg;

public class EditBroadcastRecipientsSelector extends AnonymousClass1V8 {
    public boolean A00;

    public EditBroadcastRecipientsSelector() {
        this(0);
    }

    public EditBroadcastRecipientsSelector(int i2) {
        this.A00 = false;
        C13680ns.A1G(this, 53);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            C14530pL.A0g(r1, C14530pL.A0D(r1, this), this);
        }
    }
}

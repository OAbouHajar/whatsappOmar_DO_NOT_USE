package com.obwhatsapp.registration.directmigration;

import X.AnonymousClass1BN;
import X.AnonymousClass1DX;
import X.AnonymousClass1GW;
import X.C13680ns;
import X.C14570pP;
import X.C16150sX;
import X.C19230xz;
import android.os.Bundle;
import com.obwhatsapp.RequestPermissionActivity;

public class RequestPermissionFromSisterAppActivity extends RequestPermissionActivity {
    public boolean A00;

    public RequestPermissionFromSisterAppActivity() {
        this(0);
    }

    public RequestPermissionFromSisterAppActivity(int i2) {
        this.A00 = false;
        C13680ns.A1G(this, 111);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            C16150sX r1 = C14570pP.A1T(this).A1s;
            this.A05 = C16150sX.A1B(r1);
            this.A06 = (AnonymousClass1BN) r1.AAp.get();
            this.A01 = (C19230xz) r1.A5B.get();
            this.A05 = (AnonymousClass1DX) r1.A3R.get();
            this.A02 = C16150sX.A0X(r1);
            this.A03 = C16150sX.A0Y(r1);
            this.A00 = (AnonymousClass1GW) r1.A0Y.get();
            this.A04 = C16150sX.A0k(r1);
        }
    }

    public void A2C(String str, Bundle bundle) {
        super.A2C(A2B(bundle, true), bundle);
    }
}

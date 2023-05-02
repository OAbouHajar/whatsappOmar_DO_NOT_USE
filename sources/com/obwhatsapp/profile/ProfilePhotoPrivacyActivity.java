package com.obwhatsapp.profile;

import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C49132Rg;
import X.C59272ve;
import android.content.Intent;
import android.os.Bundle;

public class ProfilePhotoPrivacyActivity extends C59272ve {
    public int A00;
    public boolean A01;

    public ProfilePhotoPrivacyActivity() {
        this(0);
    }

    public ProfilePhotoPrivacyActivity(int i2) {
        this.A01 = false;
        C13680ns.A1G(this, 95);
    }

    public void A1q() {
        if (!this.A01) {
            this.A01 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 1 && i3 == -1) {
            this.A00 = 3;
            Intent A09 = C13680ns.A09();
            A09.putExtra("profile_photo", this.A00);
            C13680ns.A0r(this, A09);
        }
        super.onActivityResult(i2, i3, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A00 = this.A09.A0C();
    }
}

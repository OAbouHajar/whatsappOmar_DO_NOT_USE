package com.obwhatsapp.registration;

import X.AnonymousClass1V8;
import X.AnonymousClass2EA;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C49132Rg;
import android.content.Intent;
import android.os.Bundle;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.whatsapp.util.Log;

public class NotifyContactsSelector extends AnonymousClass1V8 {
    public boolean A00;

    public NotifyContactsSelector() {
        this(0);
    }

    public NotifyContactsSelector(int i2) {
        this.A00 = false;
        C13680ns.A1G(this, AnonymousClass2EA.A03);
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

    public void A3Q(int i2) {
        if (i2 <= 0) {
            x().A0A(R.string.str00ab);
        } else {
            super.A3Q(i2);
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 150) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 != -1) {
            Log.i("listmembersselector/permissions denied");
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null && !this.A0I.A00()) {
            RequestPermissionActivity.A0D(this, R.string.str11be, R.string.str11bd);
        }
    }
}

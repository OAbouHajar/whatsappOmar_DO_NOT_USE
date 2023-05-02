package com.obwhatsapp.contact.picker;

import X.AnonymousClass1V8;
import X.C005402i;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C15800rs;
import X.C16150sX;
import X.C17240ul;
import X.C49132Rg;
import android.content.Intent;
import android.os.Bundle;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.whatsapp.util.Log;

public class ListMembersSelector extends AnonymousClass1V8 {
    public C15800rs A00;
    public C17240ul A01;
    public boolean A02;

    public ListMembersSelector() {
        this(0);
    }

    public ListMembersSelector(int i2) {
        this.A02 = false;
        C13680ns.A1G(this, 50);
    }

    public void A1q() {
        if (!this.A02) {
            this.A02 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            C14530pL.A0g(r1, C14530pL.A0D(r1, this), this);
            this.A01 = C16150sX.A0o(r1);
            this.A00 = (C15800rs) r1.A5c.get();
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
        C005402i x2 = x();
        x2.A0N(true);
        x2.A0B(R.string.str0dde);
        if (bundle == null && !this.A0I.A00()) {
            RequestPermissionActivity.A0D(this, R.string.str11b6, R.string.str11b5);
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }
}

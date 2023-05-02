package com.obwhatsapp.businessupsell;

import X.AnonymousClass2ZK;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C16490t9;
import X.C49132Rg;
import X.C74583qm;
import android.os.Bundle;
import com.obwhatsapp.R;

public class BusinessAppEducation extends C14530pL {
    public C16490t9 A00;
    public AnonymousClass2ZK A01;
    public boolean A02;

    public BusinessAppEducation() {
        this(0);
    }

    public BusinessAppEducation(int i2) {
        this.A02 = false;
        C13680ns.A1G(this, 25);
    }

    public void A1q() {
        if (!this.A02) {
            this.A02 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A00 = C16150sX.A0m(r1);
            this.A01 = A1T.A0g();
        }
    }

    public final void A35(int i2) {
        C74583qm r1 = new C74583qm();
        r1.A00 = Integer.valueOf(i2);
        r1.A01 = 12;
        this.A00.A05(r1);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout00a3);
        C13680ns.A18(findViewById(R.id.close), this, 33);
        C13680ns.A18(findViewById(R.id.install_smb_google_play), this, 34);
        A35(1);
    }
}

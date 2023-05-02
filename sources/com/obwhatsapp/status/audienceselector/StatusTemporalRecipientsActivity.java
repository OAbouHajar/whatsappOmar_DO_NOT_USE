package com.obwhatsapp.status.audienceselector;

import X.AnonymousClass11G;
import X.AnonymousClass1BU;
import X.AnonymousClass1L1;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C19000xb;
import X.C35541m6;
import X.C49132Rg;
import X.C49352Sp;

public class StatusTemporalRecipientsActivity extends StatusRecipientsActivity {
    public C35541m6 A00;
    public AnonymousClass1BU A01;
    public boolean A02;

    public StatusTemporalRecipientsActivity() {
        this(0);
    }

    public StatusTemporalRecipientsActivity(int i2) {
        this.A02 = false;
        C13680ns.A1G(this, 132);
    }

    public void A1q() {
        if (!this.A02) {
            this.A02 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            C14530pL.A0Z(this, r1);
            this.A02 = (AnonymousClass11G) r1.ANN.get();
            this.A01 = (C19000xb) r1.AQX.get();
            this.A03 = (AnonymousClass1L1) r1.ANR.get();
            this.A00 = (C49352Sp) A1T.A1G.get();
            this.A01 = (AnonymousClass1BU) r1.ANA.get();
        }
    }
}

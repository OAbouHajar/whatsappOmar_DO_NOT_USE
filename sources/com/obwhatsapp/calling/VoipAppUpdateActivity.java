package com.obwhatsapp.calling;

import X.AnonymousClass00T;
import X.AnonymousClass5P5;
import X.C13680ns;
import X.C14570pP;
import X.C16150sX;
import X.C18890xQ;
import X.C25671Kr;
import X.C34331k5;
import android.os.Bundle;
import com.facebook.redex.IDxFListenerShape370S0100000_2_I1;
import com.obwhatsapp.R;

public class VoipAppUpdateActivity extends C14570pP {
    public C18890xQ A00;
    public C25671Kr A01;
    public boolean A02;
    public final AnonymousClass5P5 A03;

    public VoipAppUpdateActivity() {
        this(0);
        this.A03 = new IDxFListenerShape370S0100000_2_I1(this, 0);
    }

    public VoipAppUpdateActivity(int i2) {
        this.A02 = false;
        C13680ns.A1G(this, 27);
    }

    public void A1q() {
        if (!this.A02) {
            this.A02 = true;
            C16150sX r1 = C14570pP.A1T(this).A1s;
            this.A05 = C16150sX.A1B(r1);
            this.A00 = C16150sX.A06(r1);
            this.A01 = (C25671Kr) r1.A3D.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C14570pP.A1U(this);
        setContentView((int) R.layout.layout05ec);
        C34331k5.A01(AnonymousClass00T.A05(this, R.id.cancel), this, 29);
        C34331k5.A01(AnonymousClass00T.A05(this, R.id.upgrade), this, 30);
        C25671Kr r0 = this.A01;
        r0.A00.add(this.A03);
    }

    public void onDestroy() {
        super.onDestroy();
        C25671Kr r0 = this.A01;
        r0.A00.remove(this.A03);
    }
}

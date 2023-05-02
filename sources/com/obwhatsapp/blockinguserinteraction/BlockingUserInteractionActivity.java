package com.obwhatsapp.blockinguserinteraction;

import X.AnonymousClass027;
import X.C13680ns;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C16250si;
import X.C18360wZ;
import X.C18370wa;
import android.os.Bundle;
import com.facebook.redex.IDxObserverShape116S0100000_2_I1;
import com.obwhatsapp.R;

public class BlockingUserInteractionActivity extends C14550pN {
    public C18370wa A00;
    public C16250si A01;
    public boolean A02;

    public BlockingUserInteractionActivity() {
        this(0);
    }

    public BlockingUserInteractionActivity(int i2) {
        this.A02 = false;
        C13680ns.A1G(this, 22);
    }

    public void A1q() {
        if (!this.A02) {
            this.A02 = true;
            C16150sX r1 = C14570pP.A1T(this).A1s;
            C14550pN.A15(r1, this);
            this.A0A = C14550pN.A0v(r1);
            this.A01 = (C16250si) r1.AFP.get();
            this.A00 = C16150sX.A0d(r1);
        }
    }

    public void onCreate(Bundle bundle) {
        IDxObserverShape116S0100000_2_I1 iDxObserverShape116S0100000_2_I1;
        AnonymousClass027 r0;
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("blocking_type", 0);
        if (intExtra == 0) {
            setContentView((int) R.layout.layout0035);
            C16250si r1 = this.A01;
            iDxObserverShape116S0100000_2_I1 = new IDxObserverShape116S0100000_2_I1(this, 17);
            r0 = r1.A03;
        } else if (intExtra == 1) {
            setTitle(R.string.str0d98);
            setContentView((int) R.layout.layout0047);
            C18370wa r12 = this.A00;
            iDxObserverShape116S0100000_2_I1 = new IDxObserverShape116S0100000_2_I1(this, 18);
            r0 = ((C18360wZ) r12).A00;
        } else {
            return;
        }
        r0.A0A(this, iDxObserverShape116S0100000_2_I1);
    }
}

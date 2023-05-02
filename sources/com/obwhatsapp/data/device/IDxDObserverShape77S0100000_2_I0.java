package com.obwhatsapp.data.device;

import X.AnonymousClass0y2;
import X.AnonymousClass1WC;
import X.AnonymousClass1WF;
import X.C16040sK;
import X.C17380uz;
import X.C19680yp;
import X.C28031Ub;
import android.app.Activity;
import com.facebook.redex.RunnableRunnableShape14S0200000_I1_2;
import com.facebook.redex.RunnableRunnableShape15S0200000_I1_3;
import com.obwhatsapp.identity.IdentityVerificationActivity;
import com.whatsapp.jid.DeviceJid;

public class IDxDObserverShape77S0100000_2_I0 extends AnonymousClass1WC {
    public Object A00;
    public final int A01;

    public IDxDObserverShape77S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00(C17380uz r4) {
        switch (this.A01) {
            case 0:
                if (!r4.isEmpty()) {
                    C19680yp r1 = (C19680yp) this.A00;
                    if (r1.A03()) {
                        r1.A00();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C28031Ub it = r4.iterator();
                while (it.hasNext()) {
                    ((AnonymousClass0y2) this.A00).A03.A05((DeviceJid) it.next());
                }
                return;
            case 2:
                IdentityVerificationActivity identityVerificationActivity = (IdentityVerificationActivity) this.A00;
                C16040sK r0 = identityVerificationActivity.A01;
                r0.A0B();
                identityVerificationActivity.A3B(r0.A05);
                return;
            default:
                super.A00(r4);
                return;
        }
    }

    public void A01(AnonymousClass1WF r4) {
        if (3 - this.A01 != 0) {
            super.A01(r4);
        } else {
            ((Activity) this.A00).runOnUiThread(new RunnableRunnableShape15S0200000_I1_3(this, 0, r4));
        }
    }

    public void A02(AnonymousClass1WF r4) {
        if (3 - this.A01 != 0) {
            super.A02(r4);
        } else {
            ((Activity) this.A00).runOnUiThread(new RunnableRunnableShape15S0200000_I1_3(this, 1, r4));
        }
    }

    public void A03(AnonymousClass1WF r4) {
        switch (this.A01) {
            case 2:
                IdentityVerificationActivity identityVerificationActivity = (IdentityVerificationActivity) this.A00;
                C16040sK r0 = identityVerificationActivity.A01;
                r0.A0B();
                identityVerificationActivity.A3B(r0.A05);
                return;
            case 3:
                ((Activity) this.A00).runOnUiThread(new RunnableRunnableShape15S0200000_I1_3(this, 2, r4));
                return;
            default:
                super.A03(r4);
                return;
        }
    }

    public void A04(AnonymousClass1WF r4) {
        if (3 - this.A01 != 0) {
            super.A04(r4);
        } else {
            ((Activity) this.A00).runOnUiThread(new RunnableRunnableShape14S0200000_I1_2(this, 49, r4));
        }
    }
}

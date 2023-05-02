package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass289;
import X.AnonymousClass2GX;
import X.C13680ns;
import X.C447225g;
import X.C55472jf;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;

public class IDxLObserverShape423S0100000_2_I0 implements AnonymousClass2GX {
    public Object A00;
    public final int A01;

    public IDxLObserverShape423S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AWh(boolean z2) {
        AnonymousClass289 r0;
        if (this.A01 != 0) {
            C55472jf r1 = (C55472jf) this.A00;
            if (z2 && (r0 = r1.A01) != null && r0.isShowing()) {
                r1.A01.A04();
                return;
            }
            return;
        }
        StringBuilder A0r = AnonymousClass000.A0r("voip/onScreenLockChanged:");
        A0r.append(z2);
        C13680ns.A1V(A0r);
        C447225g r12 = (C447225g) this.A00;
        r12.A1O = z2;
        if (Voip.A08(Voip.getCallInfo()) && !r12.A1O && r12.A1A && r12.A0P != null) {
            Log.i("onScreenLockChanged screen is turned on, but ear-near is still true, release and reacquire the proximity wake lock.");
            r12.A0T();
            r12.A0L.sendEmptyMessageDelayed(14, 6000);
        }
    }
}

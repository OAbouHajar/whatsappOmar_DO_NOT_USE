package com.obwhatsapp.data.device;

import X.AnonymousClass139;
import X.AnonymousClass19E;
import X.AnonymousClass1WC;
import X.AnonymousClass1WF;
import X.AnonymousClass256;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14870pt;
import X.C15910s6;
import X.C16590tJ;
import X.C17380uz;
import X.C18960xX;
import X.C19540yb;
import com.obwhatsapp.companiondevice.LinkedDevicesSharedViewModel;
import com.whatsapp.util.Log;
import java.util.Iterator;

public class IDxDObserverShape76S0100000_1_I0 extends AnonymousClass1WC {
    public Object A00;
    public final int A01;

    public IDxDObserverShape76S0100000_1_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00(C17380uz r7) {
        if (this.A01 != 0) {
            C19540yb r2 = (C19540yb) this.A00;
            if (r2.A01.A0G()) {
                return;
            }
            if (r2.A03()) {
                Log.i("SyncdDeleteAllDataApiHandler/onDeviceRemoved");
                if (!C13700nu.A0i(r2.A08.A07())) {
                    Iterator A002 = C16590tJ.A00(r2.A03);
                    while (A002.hasNext()) {
                        ((C18960xX) A002.next()).AW1();
                    }
                    AnonymousClass19E r5 = r2.A04;
                    AnonymousClass256 r1 = new AnonymousClass256();
                    r1.A00 = Long.valueOf((long) (r2.A05.A01().getInt("syncd_dirty", -1) - 1));
                    r5.A06.A06(r1);
                }
                r2.A05.A05(0);
                r2.A00();
            } else if (r2.A02.A02(C15910s6.A1V) > 0 && !C13700nu.A0i(r2.A08.A07())) {
                Log.i("SyncdDeleteAllDataApiHandler/onDeviceRemoved setLastCompanionDeregTime");
                AnonymousClass139 r12 = r2.A05;
                C13680ns.A0x(r12.A01().edit(), "syncd_last_companion_dereg_time", r2.A06.A00());
            }
        } else {
            C14870pt.A00(((LinkedDevicesSharedViewModel) this.A00).A06, this, 45);
        }
    }

    public void A03(AnonymousClass1WF r3) {
        if (this.A01 != 0) {
            C19540yb r1 = (C19540yb) this.A00;
            if (r1.A01.A0G()) {
                return;
            }
            if (r1.A03()) {
                Log.e("SyncdDeleteAllDataApiHandler/onDeviceRegistered: This should be rare and suggested to check more logs.");
                return;
            }
            Log.i("SyncdDeleteAllDataApiHandler/onDeviceRegistered removeLastCompanionDeregTime");
            C13690nt.A0v(r1.A05.A01().edit(), "syncd_last_companion_dereg_time");
            return;
        }
        ((LinkedDevicesSharedViewModel) this.A00).A0T.A09((Object) null);
    }
}

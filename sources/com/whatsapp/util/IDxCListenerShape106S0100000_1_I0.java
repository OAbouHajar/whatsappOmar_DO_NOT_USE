package com.whatsapp.util;

import X.AnonymousClass05J;
import X.AnonymousClass1L1;
import X.AnonymousClass1ZT;
import X.AnonymousClass1yL;
import X.C14750ph;
import X.C16040sK;
import X.C16440t3;
import X.C16740tZ;
import X.C30991dI;
import X.C34091jg;
import X.C45782Ay;
import X.C57702rc;
import X.C94694lK;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.obwhatsapp.status.StatusesFragment;
import com.obwhatsapp.status.playback.MyStatusesActivity;
import com.whatsapp.jid.UserJid;
import java.util.Collections;

public class IDxCListenerShape106S0100000_1_I0 extends C94694lK {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxCListenerShape106S0100000_1_I0(C16440t3 r1, Object obj, int i2) {
        super(r1);
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00(AdapterView adapterView, View view, int i2, long j2) {
        if (this.A01 != 0) {
            MyStatusesActivity myStatusesActivity = (MyStatusesActivity) this.A00;
            if (myStatusesActivity.A17.isEmpty()) {
                C16740tZ r2 = (C16740tZ) myStatusesActivity.A0k.A00.get(i2);
                AnonymousClass05J r0 = myStatusesActivity.A01;
                if (r0 != null) {
                    r0.A05();
                }
                Intent A0K = C14750ph.A0K(myStatusesActivity, r2.A0B(), Boolean.FALSE);
                AnonymousClass1yL.A00(A0K, r2.A11);
                myStatusesActivity.startActivity(A0K);
                C30991dI A05 = myStatusesActivity.A0O.A05();
                C16040sK r02 = myStatusesActivity.A01;
                r02.A0B();
                AnonymousClass1ZT r4 = r02.A05;
                if (A05 != null && r4 != null) {
                    myStatusesActivity.A0i.A08(r4, (Integer) null, (Integer) null, (String) null, Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyMap());
                    return;
                }
                return;
            }
            return;
        }
        C57702rc r42 = (C57702rc) view.getTag();
        if (r42 != null) {
            if (r42.A02 == C34091jg.A00 && r42.A01 == 0) {
                StatusesFragment statusesFragment = (StatusesFragment) this.A00;
                if (!statusesFragment.A08.A0G()) {
                    statusesFragment.A1H();
                    return;
                }
            }
            StatusesFragment statusesFragment2 = (StatusesFragment) this.A00;
            statusesFragment2.A0r(C14750ph.A0K(statusesFragment2.A0u(), r42.A02, Boolean.FALSE));
            AnonymousClass1L1 r1 = statusesFragment2.A0o;
            UserJid userJid = r42.A02;
            C45782Ay r03 = statusesFragment2.A0u;
            r1.A08(userJid, (Integer) null, (Integer) null, statusesFragment2.A1C(), r03.A02, r03.A03, r03.A01, r03.A05);
        }
    }

    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        if (1 - this.A01 == 0) {
            MyStatusesActivity myStatusesActivity = (MyStatusesActivity) this.A00;
            if (!myStatusesActivity.A17.isEmpty()) {
                myStatusesActivity.A38(view, (C16740tZ) myStatusesActivity.A0k.A00.get(i2));
                return;
            }
        }
        super.onItemClick(adapterView, view, i2, j2);
    }
}

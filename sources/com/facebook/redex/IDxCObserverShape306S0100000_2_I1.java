package com.facebook.redex;

import X.AnonymousClass1UX;
import X.AnonymousClass3E7;
import X.C18000vz;
import X.C23401Bv;
import X.C48642Oh;
import X.C48652Oi;
import com.whatsapp.util.Log;

public class IDxCObserverShape306S0100000_2_I1 implements C18000vz {
    public Object A00;
    public final int A01;

    public IDxCObserverShape306S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AP4(AnonymousClass1UX r6) {
        C48642Oh r2;
        if (this.A01 != 0) {
            AnonymousClass3E7 r4 = (AnonymousClass3E7) this.A00;
            if (!r4.A01.isFinishing() && r6.A01 && (r2 = r4.A07) != null && r2.A00() == 4 && r2.A08()) {
                Log.i("MediaViewStreamingVideoPlayer/auto-retry");
                C48652Oi r0 = r4.A08;
                if (r0 != null) {
                    r0.A00("", true, 2);
                    return;
                }
                return;
            }
            return;
        }
        C23401Bv r3 = (C23401Bv) this.A00;
        if (r6.A01) {
            r3.A0E.Acl(new RunnableRunnableShape8S0100000_I0_7(r3, 25));
        }
    }
}

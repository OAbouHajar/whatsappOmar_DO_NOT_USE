package com.facebook.redex;

import X.AnonymousClass5PA;
import com.whatsapp.voipcalling.VoipActivityV2;

public class IDxRListenerShape4S0110000_2_I0 implements AnonymousClass5PA {
    public Object A00;
    public boolean A01;
    public final int A02;

    public IDxRListenerShape4S0110000_2_I0(VoipActivityV2 voipActivityV2, int i2, boolean z2) {
        this.A02 = i2;
        this.A00 = voipActivityV2;
        this.A01 = z2;
    }

    public final void ANw() {
        int i2 = this.A02;
        VoipActivityV2 voipActivityV2 = (VoipActivityV2) this.A00;
        boolean z2 = this.A01;
        if (i2 != 0) {
            int i3 = 2;
            if (z2) {
                i3 = 7;
            }
            voipActivityV2.A3f(i3);
            return;
        }
        int i4 = 1;
        if (z2) {
            i4 = 5;
        }
        voipActivityV2.A3e(i4);
    }
}

package com.facebook.redex;

import X.AnonymousClass3C1;
import X.C108275Ni;
import X.C90714eg;

public class IDxSProviderShape50S0000000_2_I1 implements C108275Ni {
    public final int A00;

    public IDxSProviderShape50S0000000_2_I1(int i2) {
        this.A00 = i2;
    }

    public final int AFk(Object obj) {
        C90714eg r4 = (C90714eg) obj;
        if (this.A00 != 0) {
            return r4.A03.startsWith("OMX.google") ? 1 : 0;
        }
        String str = r4.A03;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (AnonymousClass3C1.A01 >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}

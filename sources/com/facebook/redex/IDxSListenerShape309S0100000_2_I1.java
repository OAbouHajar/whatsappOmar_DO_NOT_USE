package com.facebook.redex;

import X.AnonymousClass1TV;
import X.AnonymousClass2HF;
import X.AnonymousClass3w0;
import X.C77573vz;
import java.util.List;

public class IDxSListenerShape309S0100000_2_I1 implements AnonymousClass2HF {
    public Object A00;
    public final int A01;

    public IDxSListenerShape309S0100000_2_I1(AnonymousClass1TV r1, int i2) {
        this.A01 = i2;
        this.A00 = r1;
    }

    public final void AMM(List list) {
        int i2 = this.A01;
        AnonymousClass1TV r1 = (AnonymousClass1TV) this.A00;
        if (i2 != 0) {
            r1.AWJ(new C77573vz());
            return;
        }
        AnonymousClass3w0 r0 = new AnonymousClass3w0();
        r0.A00 = list;
        r1.AWJ(r0);
    }
}

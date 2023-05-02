package com.facebook.redex;

import X.AnonymousClass2HF;
import X.C116735rr;
import X.C35391lr;
import java.util.List;

public class IDxSListenerShape5S1200000_3_I1 implements AnonymousClass2HF {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public IDxSListenerShape5S1200000_3_I1(C35391lr r1, C116735rr r2, String str, int i2) {
        this.A03 = i2;
        this.A00 = r2;
        this.A01 = r1;
        this.A02 = str;
    }

    public final void AMM(List list) {
        int i2 = this.A03;
        C116735rr r0 = (C116735rr) this.A00;
        r0.A01.A3B(r0.A00, (C35391lr) this.A01, this.A02, (List) null, i2 != 0);
    }
}

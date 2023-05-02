package com.facebook.redex;

import X.AnonymousClass2Q5;
import X.AnonymousClass5PM;
import X.C28961Zl;
import X.C49142Rh;

public class IDxDCallbackShape375S0100000_2_I0 implements AnonymousClass5PM {
    public Object A00;
    public final int A01;

    public IDxDCallbackShape375S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AQE(int i2) {
        if (this.A01 != 0) {
            C49142Rh r0 = (C49142Rh) this.A00;
            r0.A08.setDescription(C28961Zl.A04(r0.A05, (long) i2));
            return;
        }
        AnonymousClass2Q5 r3 = (AnonymousClass2Q5) this.A00;
        r3.setDuration(C28961Zl.A04(r3.A0K, (long) i2));
    }
}

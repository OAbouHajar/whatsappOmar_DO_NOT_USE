package com.facebook.redex;

import X.AnonymousClass1ZP;
import X.C108965Qe;
import X.C46202Cw;

public class IDxEListenerShape393S0100000_2_I0 implements C108965Qe {
    public Object A00;
    public final int A01;

    public IDxEListenerShape393S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AQg(String str, String str2, boolean z2) {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            ((AnonymousClass1ZP) obj).A0A(str, z2);
        } else {
            C46202Cw.A0E((C46202Cw) obj, str2, z2);
        }
    }
}

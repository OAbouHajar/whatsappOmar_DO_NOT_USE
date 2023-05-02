package com.facebook.redex;

import X.AnonymousClass28T;
import X.AnonymousClass2HW;
import X.AnonymousClass2WZ;
import X.AnonymousClass5SD;
import X.C114685oK;

public class IDxECallbackShape17S0400000_3_I1 implements AnonymousClass2HW {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public IDxECallbackShape17S0400000_3_I1(AnonymousClass2WZ r1, AnonymousClass5SD r2, C114685oK r3, Runnable runnable, int i2) {
        this.A04 = i2;
        this.A00 = r3;
        this.A03 = runnable;
        this.A01 = r2;
        this.A02 = r1;
    }

    public void APY() {
        ((AnonymousClass5SD) this.A01).AWO((AnonymousClass2WZ) this.A02);
    }

    public void AQa(Exception exc) {
        ((AnonymousClass5SD) this.A01).AWO((AnonymousClass2WZ) this.A02);
    }

    public void AY5(AnonymousClass28T r2) {
        ((Runnable) this.A03).run();
    }
}

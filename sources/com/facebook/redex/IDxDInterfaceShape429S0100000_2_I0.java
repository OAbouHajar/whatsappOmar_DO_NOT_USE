package com.facebook.redex;

import X.AnonymousClass01A;
import X.AnonymousClass1YG;
import X.AnonymousClass5PJ;
import X.C000900k;
import X.C14550pN;

public class IDxDInterfaceShape429S0100000_2_I0 implements AnonymousClass5PJ {
    public Object A00;
    public final int A01;

    public IDxDInterfaceShape429S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void A6E() {
        AnonymousClass1YG r1;
        if (this.A01 != 0) {
            ((C000900k) ((AnonymousClass01A) this.A00).A0D()).invalidateOptionsMenu();
            return;
        }
        C14550pN r12 = (C14550pN) this.A00;
        if ((r12 instanceof AnonymousClass1YG) && (r1 = (AnonymousClass1YG) r12) != null) {
            r1.A96();
        }
    }
}

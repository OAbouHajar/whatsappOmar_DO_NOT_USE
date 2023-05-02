package com.facebook.redex;

import X.C28721Xj;
import X.C35931mj;
import X.C48462Nk;
import X.C48482Nm;
import X.C48492Nn;

public class IDxEObserverShape384S0100000_2_I0 implements C35931mj {
    public Object A00;
    public final int A01;

    public IDxEObserverShape384S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AQk(Object obj) {
        C28721Xj r0;
        int i2 = this.A01;
        Object obj2 = this.A00;
        switch (i2) {
            case 0:
                r0 = ((C48482Nm) obj2).A00;
                break;
            case 1:
                r0 = ((C48462Nk) obj2).A00;
                break;
            default:
                r0 = ((C48492Nn) obj2).A00;
                break;
        }
        if (r0 != null) {
            r0.A00();
        }
    }
}

package com.facebook.redex;

import X.C108515Oh;
import X.C26781Pd;
import X.C50262Yq;
import X.C62723Er;
import java.util.Set;

public class IDxBListenerShape101S0200000_2_I0 implements C108515Oh {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxBListenerShape101S0200000_2_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void AMe(C62723Er r3) {
        C108515Oh r1;
        Set set;
        int i2 = this.A02;
        Object obj = this.A00;
        if (i2 != 0) {
            r1 = (C108515Oh) this.A01;
            set = ((C26781Pd) obj).A0A;
        } else {
            r1 = (C108515Oh) this.A01;
            set = ((C50262Yq) obj).A03;
        }
        set.add(r3);
        if (r1 != null) {
            r1.AMe(r3);
        }
    }
}

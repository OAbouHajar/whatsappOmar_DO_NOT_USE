package com.facebook.redex;

import X.AnonymousClass2AF;
import X.C16000sG;
import X.C16040sK;
import X.C17140ub;
import X.C33391iV;

public class IDxCObserverShape426S0100000_2_I0 implements C33391iV {
    public Object A00;
    public final int A01;

    public IDxCObserverShape426S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void ATq() {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            C16000sG r0 = (C16000sG) obj;
            C17140ub r1 = r0.A07;
            C16040sK r02 = r0.A01;
            r02.A0B();
            r1.A07(r02.A05);
            return;
        }
        ((AnonymousClass2AF) obj).A0K.execute(new RunnableRunnableShape17S0100000_I1((Object) this, 38));
    }
}

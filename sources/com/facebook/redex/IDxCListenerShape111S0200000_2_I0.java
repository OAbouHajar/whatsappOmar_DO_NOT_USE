package com.facebook.redex;

import X.AnonymousClass013;
import X.C009904t;
import X.C015507l;
import X.C109455Se;
import X.C13680ns;
import X.C54662hw;

public class IDxCListenerShape111S0200000_2_I0 implements C015507l {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape111S0200000_2_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void AUN(int i2) {
    }

    public void AUO(int i2, float f2, int i3) {
    }

    public void AUP(int i2) {
        if (this.A02 != 0) {
            C009904t r1 = (C009904t) this.A00;
            r1.A00 = i2;
            if (!C13680ns.A1Z((AnonymousClass013) this.A01)) {
                i2 = (r1.A03.A01.length - i2) - 1;
            }
            r1.A03(i2);
            C109455Se r0 = r1.A04;
            if (r0 != null) {
                r0.AUP(i2);
                return;
            }
            return;
        }
        ((C54662hw) this.A00).A00.A1K(i2);
    }
}

package com.facebook.redex;

import X.AnonymousClass04N;
import X.AnonymousClass2D5;
import X.AnonymousClass2D6;

public class IDxConsumerShape54S0000000_2_I1 implements AnonymousClass04N {
    public final int A00;

    public IDxConsumerShape54S0000000_2_I1(int i2) {
        this.A00 = i2;
    }

    public final void accept(Object obj) {
        if (this.A00 != 0) {
            AnonymousClass2D5 r4 = (AnonymousClass2D5) obj;
            r4.A06 = Long.valueOf(AnonymousClass2D6.A00(r4.A06, 1));
        }
    }
}

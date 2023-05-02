package com.facebook.redex;

import X.AnonymousClass144;
import X.AnonymousClass14L;
import X.AnonymousClass14M;
import X.AnonymousClass2FC;
import X.C102404yt;
import X.C108775Ph;
import X.C16150sX;
import X.C17260un;

public class IDxFactoryShape286S0100000_2_I0 implements AnonymousClass14M {
    public Object A00;
    public final int A01;

    public IDxFactoryShape286S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public C102404yt A6y(AnonymousClass144 r4, C108775Ph r5) {
        C16150sX r0;
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 3:
            case 4:
                r0 = ((AnonymousClass2FC) obj).A02;
                break;
            default:
                r0 = ((C17260un) obj).A01;
                break;
        }
        return new C102404yt(C16150sX.A0U(r0), (AnonymousClass14L) r0.A8Y.get(), r4, r5);
    }
}

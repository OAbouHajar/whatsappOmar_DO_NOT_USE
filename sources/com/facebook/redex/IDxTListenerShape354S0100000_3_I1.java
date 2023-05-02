package com.facebook.redex;

import X.AnonymousClass5zI;
import X.AnonymousClass5zJ;
import X.AnonymousClass5zO;
import X.AnonymousClass67O;
import X.AnonymousClass68B;

public class IDxTListenerShape354S0100000_3_I1 implements AnonymousClass68B {
    public Object A00;
    public final int A01;

    public IDxTListenerShape354S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AYu() {
        switch (this.A01) {
            case 0:
                AnonymousClass5zJ r3 = (AnonymousClass5zJ) this.A00;
                if (!r3.A0G) {
                    return;
                }
                if (r3.A0E == 1 || r3.A0E == 7) {
                    r3.A0E = 0;
                    r3.A09 = Boolean.FALSE;
                    r3.A02 = new AnonymousClass67O("Failed to start operation. Operation timed out.");
                    return;
                } else if (r3.A0E == 2 || r3.A0E == 3 || r3.A0E == 4) {
                    r3.A0E = 0;
                    return;
                } else {
                    return;
                }
            case 1:
                AnonymousClass5zO r1 = (AnonymousClass5zO) this.A00;
                r1.A03 = 0;
                r1.A05 = Boolean.FALSE;
                return;
            default:
                AnonymousClass5zI r2 = (AnonymousClass5zI) this.A00;
                r2.A08 = Boolean.FALSE;
                r2.A06 = new AnonymousClass67O("Photo capture failed. Still capture timed out.");
                return;
        }
    }
}

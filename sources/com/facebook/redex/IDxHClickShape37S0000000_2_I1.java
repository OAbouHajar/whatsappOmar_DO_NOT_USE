package com.facebook.redex;

import X.AnonymousClass39Y;
import X.C102794zX;
import X.C108095Mq;
import X.C108855Pt;
import X.C53742gD;
import X.C85974Qs;

public class IDxHClickShape37S0000000_2_I1 implements C108855Pt {
    public final int A00;

    public IDxHClickShape37S0000000_2_I1(int i2) {
        this.A00 = i2;
    }

    public final void AIW(C108095Mq r5) {
        AnonymousClass39Y r2;
        int i2;
        int i3;
        int i4 = this.A00;
        C53742gD r0 = ((C102794zX) r5).A00;
        switch (i4) {
            case 0:
                AnonymousClass39Y r3 = r0.A0G;
                if (!r3.A03) {
                    C85974Qs r22 = r3.A0A;
                    r22.A00(4);
                    r3.A04 = true;
                    r22.A01.A09.A01(r3.A07);
                    r3.A02 = r3.A06;
                    return;
                }
                return;
            case 1:
                r2 = r0.A0G;
                i2 = r0.A0B;
                i3 = 2;
                break;
            case 2:
                r2 = r0.A0G;
                i2 = r0.A0C;
                i3 = 3;
                break;
            default:
                r2 = r0.A0G;
                i2 = r0.A0D;
                i3 = 1;
                break;
        }
        r2.A01(i3, i2);
    }
}

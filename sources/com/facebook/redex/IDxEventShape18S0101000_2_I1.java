package com.facebook.redex;

import X.AnonymousClass5TQ;
import X.C108365Nr;
import X.C86924Ur;
import X.C90184df;

public class IDxEventShape18S0101000_2_I1 implements C108365Nr {
    public int A00;
    public Object A01;
    public final int A02;

    public IDxEventShape18S0101000_2_I1(Object obj, int i2, int i3) {
        this.A02 = i3;
        this.A01 = obj;
        this.A00 = i2;
    }

    public final void AIX(Object obj) {
        switch (this.A02) {
            case 0:
                ((AnonymousClass5TQ) obj).AYr(((C90184df) this.A01).A05, this.A00);
                return;
            case 1:
                ((AnonymousClass5TQ) obj).AUm(((C90184df) this.A01).A0D, this.A00);
                return;
            default:
                ((AnonymousClass5TQ) obj).ATO((C86924Ur) this.A01, this.A00);
                return;
        }
    }
}

package com.facebook.redex;

import X.AnonymousClass04N;
import X.AnonymousClass3K3;
import X.C14930q1;
import X.C14940q2;
import X.C14990q7;
import X.C29701b3;
import X.C31201dg;

public class IDxConsumerShape81S0200000_2_I1 implements AnonymousClass04N {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxConsumerShape81S0200000_2_I1(C14990q7 r1, C31201dg r2, int i2) {
        this.A02 = i2;
        this.A00 = r2;
        this.A01 = r1;
    }

    public final void accept(Object obj) {
        C31201dg r3;
        C14990q7 r2;
        int i2;
        switch (this.A02) {
            case 0:
                r3 = (C31201dg) this.A00;
                r2 = (C14990q7) this.A01;
                i2 = 40;
                break;
            case 1:
                r3 = (C31201dg) this.A00;
                r2 = (C14990q7) this.A01;
                r3.A02.put(40, obj);
                i2 = 46;
                break;
            default:
                C31201dg r5 = (C31201dg) this.A00;
                C14990q7 r4 = (C14990q7) this.A01;
                String str = (String) obj;
                C14930q1 A0H = r5.A0H(46);
                if (A0H != null && str.length() == r5.A0A(36, 0)) {
                    C14940q2 r0 = new C14940q2();
                    r0.A03(str, 0);
                    C29701b3.A01(r4, r5, r0.A01(), A0H);
                    return;
                }
                return;
        }
        C14930q1 A0H2 = r3.A0H(i2);
        if (A0H2 != null) {
            C29701b3.A01(r2, r3, AnonymousClass3K3.A0Z(obj), A0H2);
        }
    }
}

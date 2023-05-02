package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass1WE;
import X.AnonymousClass1XP;
import X.AnonymousClass21I;
import X.C16460t6;
import X.C16730tY;
import X.C16740tZ;
import X.C16750ta;
import X.C18220wL;
import X.C211312x;
import X.C30761cu;

public class IDxNConsumerShape40S0200000_2_I1 implements AnonymousClass1WE {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxNConsumerShape40S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void accept(Object obj) {
        switch (this.A02) {
            case 0:
                C18220wL r4 = (C18220wL) this.A00;
                AnonymousClass1XP r3 = (AnonymousClass1XP) this.A01;
                Number number = (Number) obj;
                if (r3.A0U == null) {
                    int intValue = number.intValue();
                    AnonymousClass21I A022 = r4.A02(r3, intValue, 1);
                    if (intValue != 14) {
                        r4.A06.A06(A022);
                    }
                    r3.A02();
                    return;
                }
                return;
            case 1:
                C16740tZ r42 = (C16740tZ) this.A01;
                C16460t6 r32 = ((C211312x) this.A00).A0H;
                int i2 = 3;
                if (((C30761cu) obj).A01().A01 == 13) {
                    i2 = -1;
                }
                r32.A0e(r42, i2);
                return;
            default:
                C211312x r43 = (C211312x) this.A00;
                C16730tY r33 = (C16730tY) this.A01;
                r43.A03.A0K(new RunnableRunnableShape10S0200000_I0_8(r43, 23, r33));
                synchronized (r33) {
                    C16750ta r1 = r33.A02;
                    AnonymousClass00B.A06(r1);
                    r1.A0P = false;
                    r1.A0Z = true;
                }
                return;
        }
    }
}

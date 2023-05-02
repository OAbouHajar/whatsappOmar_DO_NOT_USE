package com.facebook.redex;

import X.C19300yD;
import X.C209612g;
import X.C24951Hx;
import X.C30761cu;
import X.C31701et;
import X.C38331qc;

public class IDxDListenerShape33S0300000_2_I0 implements C38331qc {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxDListenerShape33S0300000_2_I0(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj;
        this.A02 = obj3;
        this.A01 = obj2;
    }

    public /* synthetic */ void AQ1(long j2) {
    }

    public /* synthetic */ void AQ3(boolean z2) {
    }

    public void AQ4(C31701et r11, C30761cu r12) {
        int i2 = this.A03;
        boolean A022 = r11.A02();
        C30761cu r3 = r12;
        switch (i2) {
            case 0:
                if (A022) {
                    ((C19300yD) this.A00).A0t.Acl(new RunnableRunnableShape1S0400000_I1(this, this.A02, r12, this.A01, 1));
                    return;
                }
                return;
            case 1:
                if (!A022) {
                    ((C24951Hx) this.A00).A0N.Acl(new RunnableRunnableShape17S0100000_I1(this.A01, 46));
                    return;
                }
                ((C24951Hx) this.A00).A0N.Acl(new RunnableRunnableShape1S0400000_I1(this, r3, this.A02, this.A01, 3));
                return;
            default:
                if (A022) {
                    ((C209612g) this.A02).A04();
                    return;
                }
                return;
        }
    }
}

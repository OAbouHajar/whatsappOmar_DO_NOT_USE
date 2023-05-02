package com.facebook.redex;

import X.C30701co;
import X.C30761cu;
import X.C31701et;
import X.C34421kE;
import X.C38291qY;
import X.C38331qc;
import X.C38351qe;

public class IDxDListenerShape344S0100000_2_I0 implements C38331qc {
    public Object A00;
    public final int A01;

    public IDxDListenerShape344S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AQ1(long j2) {
        if (this.A01 == 0) {
            ((C30701co) this.A00).A09(j2);
        }
    }

    public void AQ3(boolean z2) {
        C34421kE r2;
        switch (this.A01) {
            case 0:
                ((C30701co) this.A00).A0B(new C31701et(13, (String) null, z2));
                return;
            case 1:
                r2 = ((C38291qY) this.A00).A07;
                break;
            default:
                r2 = ((C38351qe) this.A00).A03;
                break;
        }
        int i2 = 1;
        if (z2) {
            i2 = 0;
        }
        r2.A02(new C31701et(i2));
    }

    public void AQ4(C31701et r2, C30761cu r3) {
        C34421kE r0;
        switch (this.A01) {
            case 0:
                return;
            case 1:
                r0 = ((C38291qY) this.A00).A07;
                break;
            default:
                r0 = ((C38351qe) this.A00).A03;
                break;
        }
        r0.A02(r2);
    }
}

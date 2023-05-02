package com.facebook.redex;

import X.C16490t9;
import X.C19080xj;
import X.C613538o;
import X.C83364Gj;
import java.util.List;

public class RunnableRunnableShape0S0111000_I0 implements Runnable {
    public int A00;
    public Object A01;
    public boolean A02;
    public final int A03;

    public RunnableRunnableShape0S0111000_I0(Object obj, int i2, int i3, boolean z2) {
        this.A03 = i3;
        this.A01 = obj;
        this.A00 = i2;
        this.A02 = z2;
    }

    public RunnableRunnableShape0S0111000_I0(List list, int i2) {
        this.A03 = 0;
        this.A00 = i2;
        this.A01 = list;
    }

    public void run() {
        switch (this.A03) {
            case 0:
                int i2 = 0;
                while (true) {
                    List list = (List) this.A01;
                    if (i2 < list.size() && !this.A02) {
                        C613538o r2 = ((C83364Gj) list.get(i2)).A00;
                        if (!r2.A03.isCancelled() && !r2.A03.isDone() && r2.A04.get() == -1) {
                            r2.A00();
                        }
                        i2++;
                    } else {
                        return;
                    }
                }
                break;
            case 1:
                C19080xj r3 = (C19080xj) this.A01;
                int i3 = this.A00;
                boolean z2 = this.A02;
                if (r3.A05) {
                    r3.A07[i3] = z2;
                    if (z2) {
                        r3.A06[i3] = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                C16490t9 r1 = (C16490t9) this.A01;
                boolean z3 = this.A02;
                int i4 = this.A00;
                if (r1.A0I()) {
                    r1.A07.AdN(r1.A02, i4, z3, false);
                    return;
                }
                return;
        }
    }
}

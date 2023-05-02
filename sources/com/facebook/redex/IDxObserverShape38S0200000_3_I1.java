package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass023;
import X.C110105dW;
import X.C110865ex;
import X.C110885ez;
import X.C113075lS;
import X.C116235r3;
import X.C35691mL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class IDxObserverShape38S0200000_3_I1 implements AnonymousClass023 {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxObserverShape38S0200000_3_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void AOH(Object obj) {
        if (this.A02 != 0) {
            C110885ez r5 = (C110885ez) this.A01;
            HashMap A0x = AnonymousClass000.A0x();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                C110105dW.A1T(A0x, it);
            }
            int i2 = 0;
            while (true) {
                List list = r5.A0C;
                if (i2 < list.size()) {
                    C116235r3 r2 = (C116235r3) list.get(i2);
                    if (r2 instanceof C113075lS) {
                        C113075lS r22 = (C113075lS) r2;
                        String A002 = r22.A01.A00();
                        if (A0x.containsKey(A002)) {
                            r22.A00 = (C35691mL) A0x.get(A002);
                            r5.A02(i2);
                        }
                    }
                    i2++;
                } else {
                    return;
                }
            }
        } else {
            C110865ex r3 = (C110865ex) this.A01;
            HashMap A0x2 = AnonymousClass000.A0x();
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                C110105dW.A1T(A0x2, it2);
            }
            r3.A03.putAll(A0x2);
            r3.A01();
        }
    }
}

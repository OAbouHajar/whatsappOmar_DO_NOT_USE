package com.instagram.common.bloks.mutations;

import X.AnonymousClass3CP;
import X.AnonymousClass3K2;
import X.AnonymousClass4SR;
import X.C31201dg;
import X.C89524cN;
import java.util.List;

public class IDxUOperationShape50S0100000_2_I1 extends AnonymousClass4SR {
    public Object A00;
    public final int A01;

    public IDxUOperationShape50S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ void A00(Object obj) {
        C31201dg r4 = (C31201dg) obj;
        switch (this.A01) {
            case 0:
                r4.A0L().clear();
                break;
            case 1:
                r4.A0L().addAll(0, C89524cN.A02((List) this.A00));
                return;
            case 2:
                break;
            case 3:
                r4.A02.put(31, ((AnonymousClass3CP) this.A00).A02.A0E.toString());
                return;
            default:
                r4.A02.put(35, AnonymousClass3K2.A0Z());
                return;
        }
        r4.A0L().addAll(C89524cN.A02((List) this.A00));
    }
}

package com.facebook.redex;

import X.AnonymousClass00B;
import X.C15830rv;
import X.C16010sH;
import X.C49762Vq;

public class IDxFunctionShape49S0000000_2_I1 implements C49762Vq {
    public final int A00;

    public IDxFunctionShape49S0000000_2_I1(int i2) {
        this.A00 = i2;
    }

    public final Object apply(Object obj) {
        if (this.A00 == 0) {
            return obj;
        }
        C16010sH r2 = (C16010sH) obj;
        AnonymousClass00B.A06(r2);
        C15830rv A07 = r2.A07();
        AnonymousClass00B.A06(A07);
        return A07.getRawString();
    }
}

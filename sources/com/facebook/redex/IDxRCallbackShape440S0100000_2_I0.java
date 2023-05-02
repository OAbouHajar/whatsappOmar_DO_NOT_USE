package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass2VG;
import X.AnonymousClass2X4;
import X.C108765Pg;
import java.util.Collection;

public class IDxRCallbackShape440S0100000_2_I0 implements C108765Pg {
    public Object A00;
    public final int A01;

    public IDxRCallbackShape440S0100000_2_I0(AnonymousClass2X4 r1, int i2) {
        this.A01 = i2;
        this.A00 = r1;
    }

    public final void AWS(Collection collection) {
        AnonymousClass2X4 r1 = (AnonymousClass2X4) this.A00;
        AnonymousClass00B.A01();
        if (collection != null) {
            r1.A01.addAll(collection);
        }
        AnonymousClass2VG r0 = r1.A00;
        if (r0 != null) {
            r0.AWX(r1);
        }
    }
}

package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass1Vt;
import X.AnonymousClass2HJ;
import X.AnonymousClass5xB;
import X.AnonymousClass5xC;
import X.AnonymousClass68Q;
import X.C110645ea;
import X.C111855hW;
import X.C116815rz;
import X.C1215265v;
import X.C1215365w;

public class IDxRCallbackShape116S0200000_3_I1 implements AnonymousClass68Q {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxRCallbackShape116S0200000_3_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void AWL(AnonymousClass2HJ r5) {
        int i2 = this.A02;
        C110645ea r3 = (C110645ea) this.A00;
        Object obj = this.A01;
        if (i2 != 0) {
            C111855hW r2 = (C111855hW) obj;
            if (r5 == null) {
                r3.A0M.Acl(new C1215365w(r2, r3));
                return;
            }
        } else {
            AnonymousClass1Vt r22 = (AnonymousClass1Vt) obj;
            if (r5 != null) {
                C116815rz.A00(r3.A02);
            } else {
                C111855hW r0 = (C111855hW) r22.A0A;
                AnonymousClass00B.A06(r0);
                AnonymousClass5xC r02 = r0.A0B;
                AnonymousClass00B.A06(r02);
                AnonymousClass5xB r1 = r02.A0C;
                r1.A08 = "ACCEPT";
                r1.A09 = "PENDING";
                r3.A0M.Acl(new C1215265v(r22, r3));
                return;
            }
        }
        C110645ea.A01(r5, r3);
    }
}

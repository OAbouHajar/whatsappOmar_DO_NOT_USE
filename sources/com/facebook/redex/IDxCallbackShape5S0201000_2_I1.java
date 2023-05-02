package com.facebook.redex;

import X.AnonymousClass3A4;
import X.AnonymousClass4OV;
import X.AnonymousClass5PR;
import X.AnonymousClass5PS;
import X.C16740tZ;
import X.C603931h;

public class IDxCallbackShape5S0201000_2_I1 implements AnonymousClass5PR {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxCallbackShape5S0201000_2_I1(C603931h r1, AnonymousClass5PS r2, int i2, int i3) {
        this.A03 = i3;
        this.A01 = r1;
        this.A00 = i2;
        this.A02 = r2;
    }

    public final void AOt(Object obj) {
        if (this.A03 != 0) {
            C603931h r4 = (C603931h) this.A01;
            int i2 = this.A00;
            AnonymousClass5PS r2 = (AnonymousClass5PS) this.A02;
            AnonymousClass4OV r6 = (AnonymousClass4OV) obj;
            C16740tZ r1 = r6.A03;
            if (r1 != null && AnonymousClass3A4.A01(r1, r6.A04)) {
                r4.A0B(r6, r2, i2);
                return;
            }
            return;
        }
        AnonymousClass4OV r62 = (AnonymousClass4OV) obj;
        ((C603931h) this.A01).A0B(r62, (AnonymousClass5PS) this.A02, this.A00);
    }
}

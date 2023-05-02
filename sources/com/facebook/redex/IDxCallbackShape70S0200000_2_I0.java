package com.facebook.redex;

import X.AnonymousClass1WJ;
import X.AnonymousClass1z1;
import X.C19300yD;
import X.C20380zx;
import X.C38641rB;

public class IDxCallbackShape70S0200000_2_I0 implements AnonymousClass1z1 {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCallbackShape70S0200000_2_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void APS(String str) {
        int i2 = this.A02;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                C19300yD r1 = (C19300yD) obj;
                if (!((C38641rB) this.A01).A1B()) {
                    r1.A07.A0R(str);
                    return;
                }
                return;
            case 1:
                ((C20380zx) obj).A05((AnonymousClass1WJ) this.A01);
                return;
            default:
                ((C20380zx) obj).A04((AnonymousClass1WJ) this.A01);
                return;
        }
    }
}

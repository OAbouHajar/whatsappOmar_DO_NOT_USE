package com.facebook.redex;

import X.AnonymousClass1D2;
import X.AnonymousClass2KO;
import com.obwhatsapp.HomeActivity;
import com.obwhatsapp.registration.EULA;

public class IDxCListenerShape322S0100000_2_I0 implements AnonymousClass1D2 {
    public Object A00;
    public final int A01;

    public IDxCListenerShape322S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AT2() {
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                ((AnonymousClass2KO) obj).A0A = true;
                return;
            case 1:
                ((HomeActivity) obj).A1u = true;
                return;
            default:
                ((EULA) obj).A0V = true;
                return;
        }
    }
}

package com.facebook.redex;

import X.AnonymousClass04o;
import X.C003401n;
import X.C013806q;
import X.C013906r;
import X.C110615eX;
import X.C110625eY;
import X.C117745tU;
import com.obwhatsapp.payments.ui.IndiaUpiProfileDetailsActivity;

public class IDxFactoryShape343S0100000_3_I1 implements AnonymousClass04o {
    public Object A00;
    public final int A01;

    public IDxFactoryShape343S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public C003401n A6s(Class cls) {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 == 0) {
            return new C110615eX(((IndiaUpiProfileDetailsActivity) obj).A0D);
        }
        C117745tU r0 = (C117745tU) obj;
        return new C110625eY(r0.A0H, r0.A0L);
    }

    public /* synthetic */ C003401n A73(C013806q r2, Class cls) {
        return C013906r.A00(this, cls);
    }
}

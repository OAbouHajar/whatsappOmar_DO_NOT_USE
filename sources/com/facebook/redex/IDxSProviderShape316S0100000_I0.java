package com.facebook.redex;

import X.AnonymousClass05Y;
import X.C000900k;
import X.C001000l;
import X.C001100m;
import X.C011405n;
import X.C016407u;
import android.os.Bundle;
import android.os.Parcelable;

public class IDxSProviderShape316S0100000_I0 implements AnonymousClass05Y {
    public Object A00;
    public final int A01;

    public IDxSProviderShape316S0100000_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final Bundle Ad1() {
        switch (this.A01) {
            case 0:
                return C001100m.A0C((C001100m) this.A00);
            case 1:
                Bundle bundle = new Bundle();
                ((C000900k) this.A00).A1S();
                return bundle;
            case 2:
                Bundle bundle2 = new Bundle();
                C001000l r2 = (C001000l) this.A00;
                r2.A0X();
                r2.A04.A04(C011405n.ON_STOP);
                Parcelable A05 = r2.A03.A00.A03.A05();
                if (A05 == null) {
                    return bundle2;
                }
                bundle2.putParcelable(C001000l.A05, A05);
                return bundle2;
            default:
                return C016407u.A00((C016407u) this.A00);
        }
    }
}

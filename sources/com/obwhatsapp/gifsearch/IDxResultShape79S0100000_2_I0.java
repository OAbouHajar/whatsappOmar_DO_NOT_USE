package com.obwhatsapp.gifsearch;

import X.AnonymousClass35z;
import X.C13680ns;
import X.C25851Lj;
import X.C25861Lk;
import X.C25921Lq;
import X.C78743yc;
import X.C86974Uw;

public class IDxResultShape79S0100000_2_I0 extends C86974Uw {
    public Object A00;
    public final int A01 = 0;

    public IDxResultShape79S0100000_2_I0(C25851Lj r4) {
        this.A00 = r4;
        C13680ns.A1U(new AnonymousClass35z(this, (String) null), r4.A0A);
    }

    public IDxResultShape79S0100000_2_I0(C25921Lq r4) {
        this.A00 = r4;
        C13680ns.A1U(new C78743yc(this, (String) null), r4.A0A);
    }

    public boolean A01(String str) {
        if (this.A01 != 0) {
            if (str == null) {
                return false;
            }
            C13680ns.A1U(new C78743yc(this, str), ((C25861Lk) this.A00).A0A);
            return true;
        } else if (str == null) {
            return false;
        } else {
            C13680ns.A1U(new AnonymousClass35z(this, str), ((C25861Lk) this.A00).A0A);
            return true;
        }
    }
}

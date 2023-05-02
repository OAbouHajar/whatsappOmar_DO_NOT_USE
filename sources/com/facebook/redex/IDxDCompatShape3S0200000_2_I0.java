package com.facebook.redex;

import X.AnonymousClass031;
import X.AnonymousClass05M;
import X.AnonymousClass3K3;
import X.C001000l;
import X.C109275Rk;
import X.C32221fq;
import android.view.View;
import com.obwhatsapp.R;

public class IDxDCompatShape3S0200000_2_I0 extends AnonymousClass05M {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxDCompatShape3S0200000_2_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void A06(View view, AnonymousClass031 r6) {
        if (this.A02 != 0) {
            super.A06(view, r6);
            r6.A07((View) this.A01);
            return;
        }
        super.A06(view, r6);
        int ACu = ((C109275Rk) this.A01).ACu();
        C001000l A0C = ((C32221fq) this.A00).A01.A0C();
        int i2 = R.string.str0381;
        if (ACu == 1) {
            i2 = R.string.str05a9;
        }
        AnonymousClass3K3.A18(r6, A0C.getString(i2));
    }
}

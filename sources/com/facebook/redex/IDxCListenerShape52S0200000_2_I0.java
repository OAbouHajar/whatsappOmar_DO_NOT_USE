package com.facebook.redex;

import X.AnonymousClass26F;
import X.AnonymousClass2O2;
import X.AnonymousClass4I0;
import X.AnonymousClass4Q9;
import X.C37921px;
import android.view.View;
import com.whatsapp.voipcalling.VoipActivityV2;

public class IDxCListenerShape52S0200000_2_I0 implements View.OnLongClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape52S0200000_2_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final boolean onLongClick(View view) {
        switch (this.A02) {
            case 0:
                C37921px r1 = (C37921px) this.A01;
                AnonymousClass4Q9 r0 = ((AnonymousClass26F) this.A00).A02;
                if (r0 == null) {
                    return false;
                }
                r0.A00(r1);
                return true;
            case 1:
                AnonymousClass2O2 r2 = (AnonymousClass2O2) this.A00;
                r2.A0C.A0G(((AnonymousClass4I0) this.A01).A00, r2);
                return true;
            default:
                return VoipActivityV2.A0r((View.OnClickListener) this.A01, view, (VoipActivityV2) this.A00);
        }
    }
}

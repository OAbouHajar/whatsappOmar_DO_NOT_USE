package com.facebook.redex;

import X.AnonymousClass1DU;
import X.AnonymousClass3SN;
import X.C108515Oh;
import X.C62723Er;
import X.C808345t;
import android.widget.ImageView;
import com.obwhatsapp.R;

public class IDxBListenerShape285S0100000_2_I1 implements C108515Oh {
    public Object A00;
    public final int A01;

    public IDxBListenerShape285S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AMe(C62723Er r3) {
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                ((AnonymousClass3SN) obj).A01.setImageResource(R.color.color04f2);
                return;
            case 4:
                ((AnonymousClass1DU) obj).AIT();
                return;
            default:
                C808345t.A00((ImageView) obj);
                return;
        }
    }
}

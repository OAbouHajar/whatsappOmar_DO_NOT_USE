package com.facebook.redex;

import X.C42821yj;
import X.C46172Ct;
import android.view.View;
import com.obwhatsapp.R;

public class IDxCListenerShape431S0100000_2_I0 implements C46172Ct {
    public Object A00;
    public final int A01;

    public IDxCListenerShape431S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AOF(boolean z2) {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            View view = (View) obj;
            int i3 = R.drawable.ib_new_expanded;
            if (z2) {
                i3 = R.drawable.ib_new_expanded_bottom;
            }
            view.setBackgroundResource(i3);
            return;
        }
        C42821yj r1 = (C42821yj) obj;
        int i4 = R.drawable.ib_new_expanded_bottom;
        if (!z2) {
            i4 = r1.A04(2);
        }
        r1.A0R(i4);
    }
}

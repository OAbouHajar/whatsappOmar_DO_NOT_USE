package com.facebook.redex;

import X.AnonymousClass5PN;
import X.C19980zJ;
import android.view.View;
import com.obwhatsapp.R;

public class IDxOCallbackShape376S0100000_2_I0 implements AnonymousClass5PN {
    public Object A00;
    public final int A01;

    public IDxOCallbackShape376S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AXB(boolean z2) {
        int i2 = this.A01;
        View findViewById = C19980zJ.A02((View) this.A00).findViewById(R.id.proximity_overlay);
        if (findViewById != null) {
            int i3 = 4;
            if (z2) {
                i3 = 0;
            }
            findViewById.setVisibility(i3);
        }
    }
}

package com.whatsapp.util;

import X.C34331k5;
import X.C56982pZ;
import android.view.View;
import com.obwhatsapp.WaImageButton;
import java.util.List;

public class ViewOnClickCListenerShape0S0301000_I1 extends C34331k5 {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public ViewOnClickCListenerShape0S0301000_I1(C56982pZ r1, WaImageButton waImageButton, List list, int i2, int i3) {
        this.A04 = i3;
        this.A01 = r1;
        this.A00 = i2;
        this.A03 = list;
        this.A02 = waImageButton;
    }

    public void A06(View view) {
        int i2 = this.A04;
        C56982pZ r3 = (C56982pZ) this.A01;
        int i3 = this.A00;
        if (i2 != 0) {
            r3.A01 = i3;
            for (View selected : (List) this.A03) {
                selected.setSelected(false);
            }
        } else {
            r3.A00 = i3;
            for (View selected2 : (List) this.A03) {
                selected2.setSelected(false);
            }
        }
        ((View) this.A02).setSelected(true);
        r3.A04();
    }
}

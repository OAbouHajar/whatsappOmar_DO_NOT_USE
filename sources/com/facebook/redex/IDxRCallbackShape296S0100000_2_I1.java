package com.facebook.redex;

import X.AnonymousClass074;
import X.C12830l2;
import com.obwhatsapp.businessdirectory.util.FacebookMapPreview;
import com.obwhatsapp.location.LocationPicker;

public class IDxRCallbackShape296S0100000_2_I1 implements C12830l2 {
    public Object A00;
    public final int A01;

    public IDxRCallbackShape296S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void ATJ(AnonymousClass074 r3) {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            LocationPicker.A02(r3, (LocationPicker) obj);
            return;
        }
        FacebookMapPreview facebookMapPreview = (FacebookMapPreview) obj;
        if (r3 != null) {
            r3.A0B = facebookMapPreview.A01;
        }
    }
}

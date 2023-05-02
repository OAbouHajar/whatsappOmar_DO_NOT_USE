package com.facebook.redex;

import X.AnonymousClass03Y;
import X.AnonymousClass4PP;
import android.graphics.drawable.Drawable;
import com.obwhatsapp.authentication.FingerprintView;

public class IDxACallbackShape39S0100000_2_I1 extends AnonymousClass03Y {
    public Object A00;
    public final int A01;

    public IDxACallbackShape39S0100000_2_I1(FingerprintView fingerprintView, int i2) {
        this.A01 = i2;
        this.A00 = fingerprintView;
    }

    public void A01(Drawable drawable) {
        AnonymousClass4PP r0;
        if (this.A01 == 0 && (r0 = ((FingerprintView) this.A00).A00) != null) {
            r0.A00();
        }
    }
}

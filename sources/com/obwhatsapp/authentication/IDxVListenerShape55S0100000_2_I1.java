package com.obwhatsapp.authentication;

import X.AnonymousClass4PP;
import X.C13690nt;
import android.app.Activity;
import com.whatsapp.util.Log;

public class IDxVListenerShape55S0100000_2_I1 extends AnonymousClass4PP {
    public Object A00;
    public final int A01;

    public IDxVListenerShape55S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00() {
        if (this.A01 != 0) {
            Log.i("AuthenticationActivity/fingerprint-success-animation-end");
            C13690nt.A0q((Activity) this.A00);
            return;
        }
        Log.i("AppAuthenticationActivity/fingerprint-success-animation-end");
        AppAuthenticationActivity appAuthenticationActivity = (AppAuthenticationActivity) this.A00;
        appAuthenticationActivity.A2m();
        appAuthenticationActivity.finish();
    }
}

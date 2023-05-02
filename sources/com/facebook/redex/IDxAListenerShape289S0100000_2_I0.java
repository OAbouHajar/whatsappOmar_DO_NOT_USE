package com.facebook.redex;

import X.AnonymousClass5PX;
import X.C49712Vf;
import com.obwhatsapp.deviceauth.BiometricAuthPlugin;

public class IDxAListenerShape289S0100000_2_I0 implements AnonymousClass5PX {
    public Object A00;
    public final int A01;

    public IDxAListenerShape289S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AMw(int i2) {
        int i3 = this.A01;
        Object obj = this.A00;
        if (i3 != 0) {
            ((BiometricAuthPlugin) obj).A03(i2);
        } else {
            ((C49712Vf) obj).A00(i2);
        }
    }
}

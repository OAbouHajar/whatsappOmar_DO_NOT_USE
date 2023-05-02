package com.facebook.redex;

import X.AnonymousClass000;
import X.C12290k9;
import androidx.car.app.model.OnCheckedChangeDelegateImpl;
import androidx.car.app.navigation.model.PanModeDelegateImpl;

public class IDxHCallShape2S0110000_I1 implements C12290k9 {
    public Object A00;
    public boolean A01;
    public final int A02;

    public IDxHCallShape2S0110000_I1(Object obj, int i2, boolean z2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = z2;
    }

    public final Object A86() {
        int i2 = this.A02;
        Object obj = this.A00;
        if (i2 != 0) {
            PanModeDelegateImpl.PanModeListenerStub.$r8$lambda$LqYy1vRrRropiFqxnLxOFkdo8I0((PanModeDelegateImpl.PanModeListenerStub) obj, this.A01);
        } else {
            OnCheckedChangeDelegateImpl.OnCheckedChangeListenerStub.$r8$lambda$ajJY3J__wF0eQzHmi5qujwF7Tbg((OnCheckedChangeDelegateImpl.OnCheckedChangeListenerStub) obj, this.A01);
        }
        throw AnonymousClass000.A0Z();
    }
}

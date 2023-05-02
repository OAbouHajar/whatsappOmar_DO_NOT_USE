package com.facebook.redex;

import X.AnonymousClass000;
import X.C12290k9;
import androidx.car.app.navigation.NavigationManager$1;

public class IDxHCallShape351S0100000_I1 implements C12290k9 {
    public Object A00;
    public final int A01;

    public IDxHCallShape351S0100000_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final Object A86() {
        switch (this.A01) {
            case 0:
                return null;
            case 1:
                NavigationManager$1.$r8$lambda$RsBMa_HbLu0DtZV9bYmvxrUt9U4((NavigationManager$1) this.A00);
                throw AnonymousClass000.A0Z();
            default:
                throw AnonymousClass000.A0W("onScale");
        }
    }
}

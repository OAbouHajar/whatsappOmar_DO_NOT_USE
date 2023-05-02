package com.obwhatsapp.components;

import X.AnonymousClass2F3;
import X.AnonymousClass4SS;
import com.obwhatsapp.registration.ChangeNumber;

public class IDxCListenerShape64S0100000_2_I0 extends AnonymousClass4SS {
    public Object A00;
    public final int A01;

    public IDxCListenerShape64S0100000_2_I0(ChangeNumber changeNumber, int i2) {
        this.A01 = i2;
        this.A00 = changeNumber;
    }

    public void A01(String str, String str2) {
        int i2 = this.A01;
        Object obj = this.A00;
        (i2 != 0 ? ((AnonymousClass2F3) obj).A0E : ((ChangeNumber) obj).A0G).A06 = str2;
    }
}

package com.facebook.redex;

import X.AnonymousClass1YA;
import X.C48562Nw;
import X.C85364Od;
import com.obwhatsapp.inappsupport.ui.ContactUsActivity;

public class IDxListenerShape441S0100000_2_I0 implements AnonymousClass1YA {
    public Object A00;
    public final int A01;

    public IDxListenerShape441S0100000_2_I0(C48562Nw r1, int i2) {
        this.A01 = i2;
        this.A00 = r1;
    }

    public void AQK() {
        int i2 = this.A01;
        C48562Nw r1 = (C48562Nw) this.A00;
        if (i2 != 0) {
            r1.A01();
        } else if (r1.A02 != null) {
            r1.A03((String) null);
        }
    }

    public void AWo(C85364Od r4) {
        int i2;
        int i3 = this.A01;
        C48562Nw r1 = (C48562Nw) this.A00;
        ContactUsActivity contactUsActivity = r1.A02;
        if (i3 != 0) {
            if (contactUsActivity != null) {
                i2 = 2;
            } else {
                return;
            }
        } else if (contactUsActivity != null) {
            i2 = 1;
        } else {
            return;
        }
        C48562Nw.A00(r4, r1, i2);
    }
}

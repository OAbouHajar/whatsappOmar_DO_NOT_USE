package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass28T;
import X.AnonymousClass2HV;
import X.AnonymousClass2HW;
import X.C18450wi;

public class IDxECallbackShape325S0100000_2_I0 implements AnonymousClass2HW {
    public Object A00;
    public final int A01;

    public IDxECallbackShape325S0100000_2_I0(AnonymousClass2HV r1, int i2) {
        this.A01 = i2;
        this.A00 = r1;
    }

    public void APY() {
        int i2 = this.A01;
        AnonymousClass2HV r2 = (AnonymousClass2HV) this.A00;
        if (i2 != 0) {
            r2.AQu(new Exception("AvatarUserManagementHelper/generateAvatarRefreshToken/onDeliveryFailure"));
        } else {
            r2.AQu(new Exception("AvatarUserManagementHelper/deleteAvatarUser/onDeliveryFailure"));
        }
    }

    public void AQa(Exception exc) {
        C18450wi.A0H(exc, 0);
        ((AnonymousClass2HV) this.A00).AQu(exc);
    }

    public void AY5(AnonymousClass28T r3) {
        if (this.A01 != 0) {
            AnonymousClass2HV r1 = (AnonymousClass2HV) this.A00;
            if (r3 != null) {
                r1.onSuccess();
            } else {
                r1.AQu(AnonymousClass000.A0V("Avatar User Entity is null"));
            }
        } else {
            ((AnonymousClass2HV) this.A00).onSuccess();
        }
    }
}

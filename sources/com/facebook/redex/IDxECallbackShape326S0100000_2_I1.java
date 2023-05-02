package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass28T;
import X.AnonymousClass2HV;
import X.AnonymousClass2HW;
import X.C18450wi;
import com.whatsapp.util.Log;

public class IDxECallbackShape326S0100000_2_I1 implements AnonymousClass2HW {
    public Object A00;
    public final int A01;

    public IDxECallbackShape326S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void APY() {
        if (this.A01 != 0) {
            ((AnonymousClass2HV) this.A00).AQu(new Exception("AvatarUserManagementHelper/createAvatarUser/onDeliveryFailure"));
        } else {
            Log.e("Failed to delete shops user.");
        }
    }

    public void AQa(Exception exc) {
        if (this.A01 != 0) {
            C18450wi.A0H(exc, 0);
            ((AnonymousClass2HV) this.A00).AQu(exc);
            return;
        }
        Log.e("Failed to delete shops user.");
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
            Log.e("Shops user deleted successfully.");
        }
    }
}

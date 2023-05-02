package com.facebook.redex;

import X.AnonymousClass19E;
import X.AnonymousClass1WD;
import X.C18930xU;
import X.C19370yK;
import X.C74393qT;
import com.whatsapp.util.Log;
import java.util.Map;

public class IDxObserverShape92S0200000_2_I1 implements C19370yK {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxObserverShape92S0200000_2_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public void AYg() {
        if (this.A02 != 0) {
            Log.i("sync-manager/doPreCompanionLogoutTask onSyncdFailed");
            ((AnonymousClass1WD) this.A01).A02(Boolean.FALSE);
            return;
        }
        ((C18930xU) this.A00).A0C.A03(this);
    }

    public void AYh() {
        if (this.A02 != 0) {
            Log.i("sync-manager/doPreCompanionLogoutTask onSyncdSuccess");
            ((AnonymousClass1WD) this.A01).A02(Boolean.TRUE);
            return;
        }
        C18930xU r2 = (C18930xU) this.A00;
        r2.A0C.A03(this);
        Map A012 = r2.A0e.A01();
        AnonymousClass19E r22 = r2.A0N;
        boolean equals = A012.equals(this.A01);
        C74393qT r1 = new C74393qT();
        r1.A00 = Boolean.valueOf(equals);
        r22.A06.A06(r1);
    }
}

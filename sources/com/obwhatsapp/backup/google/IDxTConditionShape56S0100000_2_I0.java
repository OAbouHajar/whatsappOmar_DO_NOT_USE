package com.obwhatsapp.backup.google;

import X.AnonymousClass12U;
import X.AnonymousClass2GJ;
import X.C19670yo;
import com.whatsapp.util.Log;

public class IDxTConditionShape56S0100000_2_I0 extends AnonymousClass2GJ {
    public Object A00;
    public final int A01;

    public IDxTConditionShape56S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public boolean A05() {
        switch (this.A01) {
            case 0:
                return ((C19670yo) this.A00).A0C();
            case 1:
                AnonymousClass12U r0 = (AnonymousClass12U) this.A00;
                return r0.A07.A0F(r0.A09.A01(), r0.A00());
            default:
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A00;
                if (!restoreFromBackupActivity.A0v.get()) {
                    return restoreFromBackupActivity.A0G.A0M.A05();
                }
                Log.i("restore>RestoreFromBackupActivity/one-time-setup-task/cancelled");
                return false;
        }
    }

    public String toString() {
        switch (this.A01) {
            case 0:
                return "network-condition";
            case 1:
                return "suitable-condition";
            default:
                return "one-time-setup-condition";
        }
    }
}

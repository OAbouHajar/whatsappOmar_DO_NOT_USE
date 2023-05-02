package com.facebook.redex;

import X.C108485Oe;
import com.obwhatsapp.backup.google.GoogleBackupService;
import com.obwhatsapp.backup.google.workers.GoogleBackupWorker;

public class IDxECallbackShape414S0100000_2_I1 implements C108485Oe {
    public Object A00;
    public final int A01;

    public IDxECallbackShape414S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AQR(int i2) {
        int i3 = this.A01;
        Object obj = this.A00;
        if (i3 != 0) {
            ((GoogleBackupWorker) obj).A06(i2);
        } else {
            ((GoogleBackupService) obj).A09.A05(i2);
        }
    }
}

package com.facebook.redex;

import X.C29721b5;
import X.C29741b7;
import X.C29761b9;
import X.C29801bE;
import X.C29821bG;
import com.obwhatsapp.backup.encryptedbackup.EncBackupViewModel;

public class IDxHCallbackShape412S0100000_2_I0 implements C29741b7 {
    public Object A00;
    public final int A01;

    public IDxHCallbackShape412S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AQf(int i2, String str, int i3) {
        int i4;
        int i5 = i2;
        if (this.A01 != 0) {
            C29801bE r0 = (C29801bE) this.A00;
            C29821bG r1 = r0.A08;
            synchronized (r0.A0C) {
            }
            EncBackupViewModel.A01(r1.A00, i2);
            return;
        }
        C29721b5 r12 = (C29721b5) this.A00;
        C29761b9 r2 = r12.A08;
        synchronized (r12.A0C) {
            i4 = r12.A00;
        }
        r2.AQc(str, i5, i4, -1, i3);
    }
}

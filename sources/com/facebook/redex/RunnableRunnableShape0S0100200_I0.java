package com.facebook.redex;

import X.AnonymousClass29T;
import X.C14750ph;
import android.content.Intent;
import com.obwhatsapp.migration.export.ui.ExportMigrationActivity;
import com.obwhatsapp.registration.VerifyPhoneNumber;

public class RunnableRunnableShape0S0100200_I0 implements Runnable {
    public long A00;
    public long A01;
    public Object A02;
    public final int A03;

    public RunnableRunnableShape0S0100200_I0(Object obj, int i2, long j2, long j3) {
        this.A03 = i2;
        this.A02 = obj;
        this.A00 = j2;
        this.A01 = j3;
    }

    public final void run() {
        Intent A0A;
        if (this.A03 != 0) {
            VerifyPhoneNumber verifyPhoneNumber = (VerifyPhoneNumber) this.A02;
            long j2 = this.A00;
            long j3 = this.A01;
            AnonymousClass29T.A00(verifyPhoneNumber, 43);
            verifyPhoneNumber.A11.A0A(verifyPhoneNumber.A35());
            if (verifyPhoneNumber.A02 == 0) {
                A0A = C14750ph.A0h(verifyPhoneNumber, (String) null, -1, j2, j3, 0, verifyPhoneNumber.A1P, false, verifyPhoneNumber.A1F, false, false);
            } else {
                A0A = C14750ph.A0A(verifyPhoneNumber, 3, j2, j3, 0, verifyPhoneNumber.A1F, verifyPhoneNumber.A1P, false);
            }
            verifyPhoneNumber.finish();
            verifyPhoneNumber.startActivity(A0A);
            return;
        }
        ((ExportMigrationActivity) this.A02).A36(this.A00 - this.A01);
    }
}

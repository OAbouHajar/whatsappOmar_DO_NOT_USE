package com.facebook.redex;

import X.AnonymousClass2T3;
import X.AnonymousClass5RQ;
import X.C13680ns;
import X.C14550pN;
import androidx.fragment.app.DialogFragment;
import com.obwhatsapp.LegacyMessageDialogFragment;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

public class IDxRCallbackShape457S0100000_2_I1 implements AnonymousClass5RQ {
    public Object A00;
    public final int A01;

    public IDxRCallbackShape457S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AQR(int i2) {
        if (this.A01 != 0) {
            AnonymousClass2T3 A012 = LegacyMessageDialogFragment.A01(new Object[0], R.string.str0d7e);
            A012.A05 = R.string.str0d7f;
            A012.A0B = new Object[0];
            DialogFragment A002 = A012.A00();
            C14550pN r0 = (C14550pN) this.A00;
            C13680ns.A1J(A002, r0);
            r0.Ac1();
            return;
        }
        Log.w(C13680ns.A0c(i2, "DeviceConfirmationRegAlertDialogFragment/ Error when sending Do Not Allow IQ with error: "));
    }
}

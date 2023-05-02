package com.obwhatsapp;

import X.AnonymousClass01V;
import X.C001000l;
import X.C16440t3;
import X.C18890xQ;
import X.C18900xR;
import X.C19980zJ;
import X.C59162ux;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape161S0100000_2_I0;
import com.whatsapp.util.Log;

public class DisplayExceptionDialogFactory$SoftwareExpiredDialogFragment extends Hilt_DisplayExceptionDialogFactory_SoftwareExpiredDialogFragment {
    public C19980zJ A00;
    public C18900xR A01;
    public C18890xQ A02;
    public AnonymousClass01V A03;
    public C16440t3 A04;

    public Dialog A1B(Bundle bundle) {
        Log.w("home/dialog software-expired");
        C001000l A0D = A0D();
        C16440t3 r8 = this.A04;
        C18890xQ r6 = this.A02;
        C59162ux r2 = new C59162ux(A0D, this.A00, this.A01, r6, this.A03, r8, this.A02);
        r2.setOnCancelListener(new IDxCListenerShape161S0100000_2_I0(A0D, 1));
        return r2;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C001000l A0C = A0C();
        if (A0C != null) {
            A0C.finish();
        }
    }
}

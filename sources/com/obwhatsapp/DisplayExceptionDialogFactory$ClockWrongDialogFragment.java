package com.obwhatsapp;

import X.AnonymousClass01V;
import X.C001000l;
import X.C16440t3;
import X.C18900xR;
import X.C59152uw;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape161S0100000_2_I0;
import com.whatsapp.util.Log;

public class DisplayExceptionDialogFactory$ClockWrongDialogFragment extends Hilt_DisplayExceptionDialogFactory_ClockWrongDialogFragment {
    public C18900xR A00;
    public AnonymousClass01V A01;
    public C16440t3 A02;
    public boolean A03 = true;

    public void A14() {
        super.A14();
        if (!this.A00.A03()) {
            A1C();
        }
    }

    public Dialog A1B(Bundle bundle) {
        Log.w("home/dialog clock-wrong");
        C001000l A0D = A0D();
        C59152uw r2 = new C59152uw(A0D, this.A00, this.A01, this.A02, this.A02);
        r2.setOnCancelListener(new IDxCListenerShape161S0100000_2_I0(A0D, 0));
        return r2;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A03 = false;
        A1C();
        new DisplayExceptionDialogFactory$ClockWrongDialogFragment().A1G(A0D().AGM(), getClass().getName());
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.A03 && A0C() != null) {
            A0D().finish();
        }
    }
}

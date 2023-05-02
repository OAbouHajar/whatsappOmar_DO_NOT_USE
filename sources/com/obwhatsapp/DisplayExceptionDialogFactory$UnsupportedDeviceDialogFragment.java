package com.obwhatsapp;

import X.C001000l;
import X.C32241fu;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment extends Hilt_DisplayExceptionDialogFactory_UnsupportedDeviceDialogFragment {
    public Dialog A1B(Bundle bundle) {
        C32241fu r2 = new C32241fu(A0D());
        r2.A02(R.string.str1bd4);
        r2.A01(R.string.device_unsupported);
        r2.A07(false);
        r2.setPositiveButton(R.string.str0e87, (DialogInterface.OnClickListener) null);
        return r2.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C001000l A0C = A0C();
        if (A0C != null) {
            A0C.finish();
        }
    }
}

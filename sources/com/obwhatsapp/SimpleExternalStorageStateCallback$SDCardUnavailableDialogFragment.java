package com.obwhatsapp;

import X.AnonymousClass3K3;
import X.C14730pf;
import X.C32241fu;
import android.app.Dialog;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape23S0000000_2_I1;

public class SimpleExternalStorageStateCallback$SDCardUnavailableDialogFragment extends Hilt_SimpleExternalStorageStateCallback_SDCardUnavailableDialogFragment {
    public C14730pf A00;

    public Dialog A1B(Bundle bundle) {
        C32241fu A0c = AnonymousClass3K3.A0c(this);
        boolean A002 = C14730pf.A00();
        int i2 = R.string.str1360;
        if (A002) {
            i2 = R.string.str135f;
        }
        A0c.A02(i2);
        int i3 = R.string.str135e;
        if (A002) {
            i3 = R.string.str135d;
        }
        A0c.A01(i3);
        A0c.setPositiveButton(R.string.str0e87, new IDxCListenerShape23S0000000_2_I1(2));
        return A0c.create();
    }
}

package com.obwhatsapp;

import X.AnonymousClass3K3;
import X.C32241fu;
import android.app.Dialog;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape23S0000000_2_I1;

public class SimpleExternalStorageStateCallback$PermissionDeniedDialogFragment extends Hilt_SimpleExternalStorageStateCallback_PermissionDeniedDialogFragment {
    public Dialog A1B(Bundle bundle) {
        C32241fu A0c = AnonymousClass3K3.A0c(this);
        A0c.A02(R.string.str00d4);
        A0c.A01(R.string.str1211);
        A0c.setPositiveButton(R.string.str0e87, new IDxCListenerShape23S0000000_2_I1(1));
        return A0c.create();
    }
}

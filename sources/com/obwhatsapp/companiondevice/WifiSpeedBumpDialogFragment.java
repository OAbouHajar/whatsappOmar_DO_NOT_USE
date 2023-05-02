package com.obwhatsapp.companiondevice;

import X.AnonymousClass2XM;
import X.C32241fu;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.obwhatsapp.R;

public class WifiSpeedBumpDialogFragment extends Hilt_WifiSpeedBumpDialogFragment {
    public AnonymousClass2XM A00;

    public Dialog A1B(Bundle bundle) {
        C32241fu r3 = new C32241fu(A0u());
        r3.A02(R.string.str1b9f);
        r3.A01(R.string.str1b9d);
        r3.setPositiveButton(R.string.str1ba0, new IDxCListenerShape127S0100000_2_I0(this, 48));
        r3.setNegativeButton(R.string.str1b9e, (DialogInterface.OnClickListener) null);
        return r3.create();
    }
}

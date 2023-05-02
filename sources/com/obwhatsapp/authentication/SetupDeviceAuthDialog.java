package com.obwhatsapp.authentication;

import X.AnonymousClass15P;
import X.AnonymousClass3K2;
import X.C32241fu;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.obwhatsapp.R;

public class SetupDeviceAuthDialog extends Hilt_SetupDeviceAuthDialog {
    public AnonymousClass15P A00;

    public Dialog A1B(Bundle bundle) {
        boolean A0C = this.A00.A04.A0C(266);
        C32241fu A0R = AnonymousClass3K2.A0R(this);
        int i2 = R.string.str08fc;
        if (A0C) {
            i2 = R.string.str00f6;
        }
        A0R.setTitle(A0J(i2));
        int i3 = R.string.str08fb;
        if (A0C) {
            i3 = R.string.str00f5;
        }
        A0R.A06(A0J(i3));
        A0R.A09((DialogInterface.OnClickListener) null, A0J(R.string.str0e87));
        return A0R.create();
    }
}

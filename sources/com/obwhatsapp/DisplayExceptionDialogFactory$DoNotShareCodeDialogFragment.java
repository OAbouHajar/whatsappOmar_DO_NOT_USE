package com.obwhatsapp;

import X.C001000l;
import X.C17220uj;
import X.C19980zJ;
import X.C32241fu;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape28S0200000_2_I0;

public class DisplayExceptionDialogFactory$DoNotShareCodeDialogFragment extends Hilt_DisplayExceptionDialogFactory_DoNotShareCodeDialogFragment {
    public C19980zJ A00;
    public C17220uj A01;

    public Dialog A1B(Bundle bundle) {
        C001000l A0D = A0D();
        C32241fu r3 = new C32241fu(A0D);
        r3.A02(R.string.str12f3);
        r3.A01(R.string.str12f2);
        r3.A07(true);
        r3.setPositiveButton(R.string.str0e87, (DialogInterface.OnClickListener) null);
        r3.setNegativeButton(R.string.str1cf6, new IDxCListenerShape28S0200000_2_I0(this, 0, A0D));
        return r3.create();
    }
}

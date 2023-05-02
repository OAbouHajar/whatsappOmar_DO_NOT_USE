package com.obwhatsapp;

import X.C001000l;
import X.C15860rz;
import X.C16440t3;
import X.C19760yx;
import X.C32241fu;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape125S0100000_1_I0;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;

public class DisplayExceptionDialogFactory$LoginFailedDialogFragment extends Hilt_DisplayExceptionDialogFactory_LoginFailedDialogFragment {
    public C16440t3 A00;
    public C15860rz A01;
    public C19760yx A02;

    public Dialog A1B(Bundle bundle) {
        C32241fu r3 = new C32241fu(A0D());
        r3.A01(R.string.str12ef);
        r3.A07(false);
        r3.setPositiveButton(R.string.str0e87, new IDxCListenerShape127S0100000_2_I0(this, 10));
        r3.setNegativeButton(R.string.str12f0, new IDxCListenerShape125S0100000_1_I0(this, 0));
        return r3.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C001000l A0C = A0C();
        if (A0C != null) {
            A0C.finish();
        }
    }
}

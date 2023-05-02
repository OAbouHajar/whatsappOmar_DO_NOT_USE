package com.obwhatsapp;

import X.C001000l;
import X.C14870pt;
import X.C15480r5;
import X.C16040sK;
import X.C16320sq;
import X.C19710ys;
import X.C19760yx;
import X.C32241fu;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;

public class DisplayExceptionDialogFactory$CompanionModeIncorrectAccessFragment extends Hilt_DisplayExceptionDialogFactory_CompanionModeIncorrectAccessFragment {
    public C14870pt A00;
    public C16040sK A01;
    public C15480r5 A02;
    public C19710ys A03;
    public C19760yx A04;
    public C16320sq A05;
    public final int A06;

    public DisplayExceptionDialogFactory$CompanionModeIncorrectAccessFragment(int i2) {
        this.A06 = i2;
    }

    public Dialog A1B(Bundle bundle) {
        C32241fu r3 = new C32241fu(A0D());
        r3.A02(R.string.str0514);
        r3.A01(R.string.str0513);
        r3.A07(false);
        r3.setPositiveButton(R.string.str0e87, new IDxCListenerShape127S0100000_2_I0(this, 9));
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

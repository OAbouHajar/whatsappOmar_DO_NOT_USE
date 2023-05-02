package com.facebook.redex;

import android.content.DialogInterface;

public class IDxCListenerShape24S0000000_3_I1 implements DialogInterface.OnClickListener {
    public final int A00;

    public IDxCListenerShape24S0000000_3_I1(int i2) {
        this.A00 = i2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        switch (this.A00) {
            case 1:
            case 2:
            case 4:
                dialogInterface.dismiss();
                return;
            default:
                return;
        }
    }
}

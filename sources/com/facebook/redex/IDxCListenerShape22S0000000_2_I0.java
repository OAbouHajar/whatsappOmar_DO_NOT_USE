package com.facebook.redex;

import android.content.DialogInterface;

public class IDxCListenerShape22S0000000_2_I0 implements DialogInterface.OnClickListener {
    public final int A00;

    public IDxCListenerShape22S0000000_2_I0(int i2) {
        this.A00 = i2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        switch (this.A00) {
            case 3:
            case 7:
                return;
            default:
                dialogInterface.dismiss();
                return;
        }
    }
}

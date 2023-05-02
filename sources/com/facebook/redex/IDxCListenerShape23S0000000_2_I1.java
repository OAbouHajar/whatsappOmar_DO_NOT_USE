package com.facebook.redex;

import android.content.DialogInterface;
import com.mod.bomfab.R$styleable;

public class IDxCListenerShape23S0000000_2_I1 implements DialogInterface.OnClickListener {
    public final int A00;

    public IDxCListenerShape23S0000000_2_I1(int i2) {
        this.A00 = i2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        switch (this.A00) {
            case 4:
            case 12:
            case 13:
            case 18:
            case 19:
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                return;
            default:
                dialogInterface.dismiss();
                return;
        }
    }
}

package com.obwhatsapp.mediaview;

import X.C001000l;
import X.C15860rz;
import X.C17220uj;
import X.C19980zJ;
import X.C807745l;
import android.app.Dialog;
import android.os.Bundle;
import com.facebook.redex.IDxAListenerShape2S0201000_2_I0;
import com.mod.bomfab.R$styleable;

public class RevokeNuxDialogFragment extends Hilt_RevokeNuxDialogFragment {
    public C19980zJ A00;
    public C15860rz A01;
    public C17220uj A02;
    public final int A03;

    public RevokeNuxDialogFragment(int i2) {
        this.A03 = i2;
    }

    public Dialog A1B(Bundle bundle) {
        boolean z2;
        int i2 = this.A03;
        C001000l A0C = A0C();
        C19980zJ r5 = this.A00;
        C17220uj r4 = this.A02;
        C15860rz r3 = this.A01;
        switch (i2) {
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                z2 = true;
                break;
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                return C807745l.A00(A0C, r5, new IDxAListenerShape2S0201000_2_I0(A0C, r3, i2, 1), r4, false);
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                return C807745l.A00(A0C, r5, new IDxAListenerShape2S0201000_2_I0(A0C, r3, i2, 0), r4, true);
            default:
                z2 = false;
                break;
        }
        return C807745l.A00(A0C, r5, new IDxAListenerShape2S0201000_2_I0(A0C, r3, i2, z2 ? 1 : 0), r4, z2);
    }
}

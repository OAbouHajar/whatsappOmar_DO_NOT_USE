package com.facebook.redex;

import android.content.DialogInterface;
import androidx.biometric.FingerprintDialogFragment;
import androidx.preference.ListPreferenceDialogFragmentCompat;

public class IDxCListenerShape124S0100000_I1 implements DialogInterface.OnClickListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape124S0100000_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void onClick(DialogInterface dialogInterface, int i2) {
        if (this.A01 != 0) {
            ListPreferenceDialogFragmentCompat listPreferenceDialogFragmentCompat = (ListPreferenceDialogFragmentCompat) this.A00;
            listPreferenceDialogFragmentCompat.A00 = i2;
            listPreferenceDialogFragmentCompat.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
            return;
        }
        ((FingerprintDialogFragment) this.A00).A04.A08(true);
    }
}

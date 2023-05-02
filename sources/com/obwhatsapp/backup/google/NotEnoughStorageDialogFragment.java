package com.obwhatsapp.backup.google;

import X.AnonymousClass013;
import X.AnonymousClass2GQ;
import X.AnonymousClass3K3;
import X.C13690nt;
import X.C13700nu;
import X.C15860rz;
import X.C32241fu;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape238S0100000_2_I1;
import com.facebook.redex.IDxCListenerShape23S0000000_2_I1;
import com.obwhatsapp.R;

public class NotEnoughStorageDialogFragment extends Hilt_NotEnoughStorageDialogFragment {
    public C15860rz A00;

    public static /* synthetic */ void A01(NotEnoughStorageDialogFragment notEnoughStorageDialogFragment) {
        notEnoughStorageDialogFragment.startActivityForResult(C13700nu.A02(AnonymousClass3K3.A1P(Build.VERSION.SDK_INT, 26) ? "android.os.storage.action.MANAGE_STORAGE" : "android.settings.INTERNAL_STORAGE_SETTINGS"), 7);
    }

    public Dialog A1B(Bundle bundle) {
        Bundle A04 = A04();
        long j2 = A04.getLong("backup_size");
        int i2 = A04.getInt("backup_state");
        IDxCListenerShape238S0100000_2_I1 iDxCListenerShape238S0100000_2_I1 = new IDxCListenerShape238S0100000_2_I1(this, 0);
        C32241fu A0c = AnonymousClass3K3.A0c(this);
        A0c.A02(R.string.str0e1c);
        AnonymousClass013 r2 = this.A02;
        int i3 = R.plurals.plurals00bd;
        if (i2 == 1) {
            i3 = R.plurals.plurals0091;
        }
        A0c.A06(AnonymousClass2GQ.A02(r2, i3, j2, false));
        A0c.setPositiveButton(R.string.str0e89, new IDxCListenerShape23S0000000_2_I1(5));
        C13690nt.A1H(A0c, iDxCListenerShape238S0100000_2_I1, 21, R.string.str11f1);
        return A0c.create();
    }
}

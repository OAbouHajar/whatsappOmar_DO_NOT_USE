package com.obwhatsapp.backup.google;

import X.AnonymousClass2SD;
import android.app.Dialog;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape162S0100000_2_I1;
import com.obwhatsapp.R;

public class BaseNewUserSetupActivity$AuthRequestDialogFragment extends Hilt_BaseNewUserSetupActivity_AuthRequestDialogFragment {
    public Dialog A1B(Bundle bundle) {
        AnonymousClass2SD r2 = new AnonymousClass2SD(A0u());
        r2.setTitle(R.string.str1550);
        r2.setIndeterminate(true);
        r2.setMessage(A0J(R.string.str154f));
        r2.setCancelable(true);
        r2.setOnCancelListener(new IDxCListenerShape162S0100000_2_I1(this, 4));
        return r2;
    }
}

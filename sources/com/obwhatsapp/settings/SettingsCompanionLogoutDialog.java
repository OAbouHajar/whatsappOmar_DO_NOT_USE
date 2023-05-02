package com.obwhatsapp.settings;

import X.AnonymousClass0PG;
import X.C14870pt;
import X.C15480r5;
import X.C16320sq;
import X.C32241fu;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.obwhatsapp.R;

public class SettingsCompanionLogoutDialog extends Hilt_SettingsCompanionLogoutDialog {
    public C14870pt A00;
    public C15480r5 A01;
    public C16320sq A02;

    public Dialog A1B(Bundle bundle) {
        C32241fu r4 = new C32241fu(A02());
        AnonymousClass0PG r0 = r4.A01;
        r0.A0C = null;
        r0.A01 = R.layout.layout0118;
        r4.setPositiveButton(R.string.str0c98, new IDxCListenerShape127S0100000_2_I0(this, 128));
        r4.setNegativeButton(R.string.str0394, (DialogInterface.OnClickListener) null);
        return r4.create();
    }
}

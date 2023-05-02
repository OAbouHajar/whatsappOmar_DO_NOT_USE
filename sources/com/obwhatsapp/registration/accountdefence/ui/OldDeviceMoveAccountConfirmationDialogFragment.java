package com.obwhatsapp.registration.accountdefence.ui;

import X.AnonymousClass000;
import X.C13680ns;
import X.C32241fu;
import X.C56922p8;
import X.C82994Ey;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape23S0000000_2_I1;
import com.obwhatsapp.R;
import java.util.ArrayList;

public class OldDeviceMoveAccountConfirmationDialogFragment extends Hilt_OldDeviceMoveAccountConfirmationDialogFragment {
    public final C82994Ey A00;

    public OldDeviceMoveAccountConfirmationDialogFragment(C82994Ey r1) {
        this.A00 = r1;
    }

    public Dialog A1B(Bundle bundle) {
        Context A0u = A0u();
        ArrayList A0u2 = AnonymousClass000.A0u();
        String A0J = A0J(R.string.str0060);
        String A0J2 = A0J(R.string.str005e);
        C32241fu A002 = C32241fu.A00(A0D());
        A002.setView(new C56922p8(A0u, 20, A0J, A0J2, A0u2));
        C13680ns.A1H(A002, this, 93, R.string.str005f);
        A002.setNegativeButton(R.string.str0394, new IDxCListenerShape23S0000000_2_I1(16));
        return A002.create();
    }
}

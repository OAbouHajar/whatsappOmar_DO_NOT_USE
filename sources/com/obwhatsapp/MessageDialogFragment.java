package com.obwhatsapp;

import X.AnonymousClass00B;
import X.AnonymousClass2O1;
import X.C005302h;
import X.C13680ns;
import X.C13690nt;
import X.C18450wi;
import android.content.Context;

public final class MessageDialogFragment extends BaseMessageDialogFragment {
    public void A16(Context context) {
        C18450wi.A0H(context, 0);
        super.A16(context);
        AnonymousClass00B.A0B("Attached context should be of type OnClickListener, otherwise it will not receive click events.", context instanceof AnonymousClass2O1);
    }

    public void A1R(C005302h r3) {
        if (A1O() == 0) {
            C13680ns.A1H(r3, this, 3, R.string.str0e87);
            return;
        }
        C13680ns.A1H(r3, this, 2, A1O());
        if (A1P() != 0) {
            C13690nt.A1H(r3, this, 4, A1P());
        }
    }
}

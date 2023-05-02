package com.obwhatsapp.payments.ui;

import X.AnonymousClass15W;
import X.AnonymousClass1KO;
import X.C001000l;
import X.C13690nt;
import X.C32241fu;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape130S0100000_3_I1;
import com.obwhatsapp.R;

public class PaymentsUnavailableDialogFragment extends Hilt_PaymentsUnavailableDialogFragment {
    public AnonymousClass1KO A00;
    public AnonymousClass15W A01;

    public static PaymentsUnavailableDialogFragment A01() {
        PaymentsUnavailableDialogFragment paymentsUnavailableDialogFragment = new PaymentsUnavailableDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putBoolean("arg_is_underage_unavailability", false);
        paymentsUnavailableDialogFragment.A0T(A0D);
        return paymentsUnavailableDialogFragment;
    }

    public static PaymentsUnavailableDialogFragment A02() {
        PaymentsUnavailableDialogFragment paymentsUnavailableDialogFragment = new PaymentsUnavailableDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putBoolean("arg_is_underage_unavailability", true);
        paymentsUnavailableDialogFragment.A0T(A0D);
        return paymentsUnavailableDialogFragment;
    }

    public Dialog A1B(Bundle bundle) {
        Bundle bundle2 = this.A05;
        boolean z2 = bundle2 != null ? bundle2.getBoolean("arg_is_underage_unavailability") : false;
        C32241fu A002 = C32241fu.A00(A0C());
        A002.A02(R.string.str1164);
        int i2 = R.string.str1163;
        if (z2) {
            i2 = R.string.str1165;
        }
        A002.A01(i2);
        A002.A07(false);
        int i3 = R.string.str0e87;
        if (z2) {
            i3 = R.string.str0394;
        }
        A002.setPositiveButton(i3, (DialogInterface.OnClickListener) null);
        if (z2) {
            A002.A0B(new IDxCListenerShape130S0100000_3_I1(this, 75), R.string.str1377);
        }
        return A002.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C001000l A0C = A0C();
        if (A0C != null) {
            A0C.finish();
        }
    }
}

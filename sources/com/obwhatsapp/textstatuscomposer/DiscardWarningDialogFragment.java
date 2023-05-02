package com.obwhatsapp.textstatuscomposer;

import X.AnonymousClass3K2;
import X.C13690nt;
import X.C32241fu;
import X.C91304fh;
import android.app.Dialog;
import android.os.Bundle;
import com.obwhatsapp.R;

public class DiscardWarningDialogFragment extends Hilt_DiscardWarningDialogFragment {
    public static DiscardWarningDialogFragment A01(int i2, boolean z2) {
        DiscardWarningDialogFragment discardWarningDialogFragment = new DiscardWarningDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putInt("content", i2);
        A0D.putBoolean("back_button_pressed", z2);
        discardWarningDialogFragment.A0T(A0D);
        return discardWarningDialogFragment;
    }

    public Dialog A1B(Bundle bundle) {
        int i2 = A04().getInt("content", 1);
        boolean z2 = A04().getBoolean("back_button_pressed", false);
        int i3 = R.string.str1a64;
        if (i2 == 1) {
            i3 = R.string.str179f;
        }
        C32241fu A0R = AnonymousClass3K2.A0R(this);
        A0R.A01(i3);
        C13690nt.A1H(A0R, this, 113, R.string.str0394);
        A0R.setPositiveButton(R.string.str17a0, new C91304fh(this, i2, z2));
        return A0R.create();
    }
}

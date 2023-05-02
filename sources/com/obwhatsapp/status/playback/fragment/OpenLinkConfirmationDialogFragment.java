package com.obwhatsapp.status.playback.fragment;

import X.AnonymousClass3K2;
import X.C13690nt;
import X.C32241fu;
import android.app.Dialog;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape2S1100000_2_I1;
import com.obwhatsapp.R;

public class OpenLinkConfirmationDialogFragment extends Hilt_OpenLinkConfirmationDialogFragment {
    public static OpenLinkConfirmationDialogFragment A01(String str, String str2) {
        OpenLinkConfirmationDialogFragment openLinkConfirmationDialogFragment = new OpenLinkConfirmationDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("url", str);
        A0D.putString("message_key_id", str2);
        openLinkConfirmationDialogFragment.A0T(A0D);
        return openLinkConfirmationDialogFragment;
    }

    public Dialog A1B(Bundle bundle) {
        String string = A04().getString("url");
        A04().getString("message_key_id");
        C32241fu A0R = AnonymousClass3K2.A0R(this);
        A0R.A02(R.string.str17a2);
        A0R.A06(string);
        C13690nt.A1H(A0R, this, 105, R.string.str0394);
        A0R.setPositiveButton(R.string.str17a1, new IDxCListenerShape2S1100000_2_I1(3, string, this));
        return A0R.create();
    }

    public boolean A1L() {
        return true;
    }
}

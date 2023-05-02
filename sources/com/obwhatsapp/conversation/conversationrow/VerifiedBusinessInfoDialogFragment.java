package com.obwhatsapp.conversation.conversationrow;

import X.AnonymousClass2Sy;
import X.AnonymousClass3K3;
import X.C13690nt;
import X.C16490t9;
import X.C17220uj;
import X.C17250um;
import X.C19980zJ;
import X.C32241fu;
import android.app.Dialog;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape7S0101000_2_I1;
import com.obwhatsapp.R;

public class VerifiedBusinessInfoDialogFragment extends Hilt_VerifiedBusinessInfoDialogFragment {
    public C19980zJ A00;
    public C17250um A01;
    public C16490t9 A02;
    public C17220uj A03;

    public static VerifiedBusinessInfoDialogFragment A01(Integer num, String str) {
        VerifiedBusinessInfoDialogFragment verifiedBusinessInfoDialogFragment = new VerifiedBusinessInfoDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("message", str);
        if (num != null) {
            A0D.putInt("system_action", num.intValue());
        }
        verifiedBusinessInfoDialogFragment.A0T(A0D);
        return verifiedBusinessInfoDialogFragment;
    }

    public Dialog A1B(Bundle bundle) {
        A04();
        String string = this.A05.getString("message");
        int i2 = this.A05.getInt("system_action");
        C32241fu A0c = AnonymousClass3K3.A0c(this);
        A0c.A06(AnonymousClass2Sy.A05(A0u(), this.A01, string));
        A0c.A07(true);
        A0c.A0B(new IDxCListenerShape7S0101000_2_I1(this, i2, 2), R.string.str1cf6);
        C13690nt.A1H(A0c, this, 46, R.string.str0e87);
        return A0c.create();
    }
}

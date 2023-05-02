package com.obwhatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass16S;
import X.AnonymousClass1WU;
import X.C13690nt;
import X.C15830rv;
import X.C16010sH;
import X.C16320sq;
import X.C19810z2;
import X.C32241fu;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape29S0200000_2_I1;
import com.facebook.redex.IDxCListenerShape2S1100000_2_I1;
import com.obwhatsapp.R;

public class IdentityChangeDialogFragment extends Hilt_IdentityChangeDialogFragment {
    public C19810z2 A00;
    public AnonymousClass16S A01;
    public C16320sq A02;

    public static SecurityNotificationDialogFragment A01(AnonymousClass1WU r4) {
        IdentityChangeDialogFragment identityChangeDialogFragment = new IdentityChangeDialogFragment();
        Bundle A0D = C13690nt.A0D();
        C15830rv r1 = r4.A11.A00;
        AnonymousClass00B.A06(r1);
        C15830rv A0B = r4.A0B();
        if (A0B != null) {
            r1 = A0B;
        }
        A0D.putString("participant_jid", r1.getRawString());
        identityChangeDialogFragment.A0T(A0D);
        return identityChangeDialogFragment;
    }

    public Dialog A1B(Bundle bundle) {
        A04();
        String string = this.A05.getString("participant_jid");
        C15830rv A022 = C15830rv.A02(string);
        AnonymousClass00B.A07(A022, AnonymousClass000.A0h(string, AnonymousClass000.A0r("IdentityChangeDialogFragment/onCreateDialog/invalid remote resource jid=")));
        C16010sH A0A = this.A02.A0A(A022);
        C32241fu A002 = C32241fu.A00(A0u());
        A002.A06(A1N(A0A, R.string.str0b2c));
        A002.setNegativeButton(R.string.str0e87, (DialogInterface.OnClickListener) null);
        A002.A0B(new IDxCListenerShape29S0200000_2_I1(A0A, 14, this), R.string.str1cf6);
        A002.setPositiveButton(R.string.str1988, new IDxCListenerShape2S1100000_2_I1(2, string, this));
        return A002.create();
    }
}

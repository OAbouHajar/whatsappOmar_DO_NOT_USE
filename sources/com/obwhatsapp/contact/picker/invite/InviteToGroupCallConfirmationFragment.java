package com.obwhatsapp.contact.picker.invite;

import X.AnonymousClass00B;
import X.AnonymousClass1ZW;
import X.AnonymousClass3K2;
import X.C001000l;
import X.C005702l;
import X.C13690nt;
import X.C15900s5;
import X.C16000sG;
import X.C16080sP;
import X.C32241fu;
import android.app.Dialog;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape29S0200000_2_I1;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;

public class InviteToGroupCallConfirmationFragment extends Hilt_InviteToGroupCallConfirmationFragment {
    public C15900s5 A00;
    public C16000sG A01;
    public C16080sP A02;

    public static InviteToGroupCallConfirmationFragment A01(UserJid userJid) {
        Bundle A0D = C13690nt.A0D();
        A0D.putString("peer_id", userJid.getRawString());
        InviteToGroupCallConfirmationFragment inviteToGroupCallConfirmationFragment = new InviteToGroupCallConfirmationFragment();
        inviteToGroupCallConfirmationFragment.A0T(A0D);
        return inviteToGroupCallConfirmationFragment;
    }

    public Dialog A1B(Bundle bundle) {
        UserJid nullable = UserJid.getNullable(A04().getString("peer_id"));
        AnonymousClass00B.A07(nullable, "null peer jid");
        C001000l A0C = A0C();
        C32241fu A002 = C32241fu.A00(A0C);
        A002.setTitle(C13690nt.A0c(this, this.A02.A0C(this.A01.A0A(nullable)), new Object[1], 0, R.string.str0bc4));
        A002.A06(AnonymousClass1ZW.A01(C13690nt.A0c(this, AnonymousClass1ZW.A06(A0C, R.color.normal), new Object[1], 0, R.string.str0bc1), new Object[0]));
        C005702l A0O = AnonymousClass3K2.A0O(new IDxCListenerShape29S0200000_2_I1(nullable, 8, this), A002, R.string.str0bc2);
        A0O.setCanceledOnTouchOutside(true);
        return A0O;
    }
}

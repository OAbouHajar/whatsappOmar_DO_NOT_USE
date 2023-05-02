package com.obwhatsapp.invites;

import X.AnonymousClass00B;
import X.AnonymousClass2Oo;
import X.AnonymousClass3K2;
import X.C001000l;
import X.C005702l;
import X.C13690nt;
import X.C16000sG;
import X.C16010sH;
import X.C16080sP;
import X.C30071bh;
import X.C32241fu;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape29S0200000_2_I1;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;

public class RevokeInviteDialogFragment extends Hilt_RevokeInviteDialogFragment {
    public C16000sG A00;
    public C16080sP A01;
    public AnonymousClass2Oo A02;

    public static RevokeInviteDialogFragment A01(UserJid userJid, C30071bh r6) {
        RevokeInviteDialogFragment revokeInviteDialogFragment = new RevokeInviteDialogFragment();
        Bundle A0D = C13690nt.A0D();
        AnonymousClass00B.A06(userJid);
        A0D.putString("jid", userJid.getRawString());
        A0D.putLong("invite_row_id", r6.A13);
        revokeInviteDialogFragment.A0T(A0D);
        return revokeInviteDialogFragment;
    }

    public void A0k() {
        super.A0k();
        this.A02 = null;
    }

    public void A16(Context context) {
        super.A16(context);
        if (context instanceof AnonymousClass2Oo) {
            this.A02 = (AnonymousClass2Oo) context;
        }
    }

    public Dialog A1B(Bundle bundle) {
        Bundle A04 = A04();
        C001000l A0D = A0D();
        UserJid nullable = UserJid.getNullable(A04.getString("jid"));
        AnonymousClass00B.A06(nullable);
        C16010sH A0A = this.A00.A0A(nullable);
        IDxCListenerShape29S0200000_2_I1 iDxCListenerShape29S0200000_2_I1 = new IDxCListenerShape29S0200000_2_I1(nullable, 24, this);
        C32241fu A002 = C32241fu.A00(A0D);
        A002.A06(C13690nt.A0c(this, this.A01.A0C(A0A), new Object[1], 0, R.string.str1471));
        C005702l A0O = AnonymousClass3K2.A0O(iDxCListenerShape29S0200000_2_I1, A002, R.string.str146d);
        A0O.setCanceledOnTouchOutside(true);
        return A0O;
    }
}

package com.obwhatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass3K2;
import X.C32241fu;
import X.C82644Dp;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape128S0100000_2_I1;
import com.obwhatsapp.base.WaDialogFragment;
import com.whatsapp.jid.UserJid;

public class CommunityAdminDialogFragment extends WaDialogFragment {
    public int A00;
    public C82644Dp A01;
    public UserJid A02;

    public Dialog A1B(Bundle bundle) {
        Bundle A04 = A04();
        if (A04.containsKey("dialog_id")) {
            this.A00 = A04.getInt("dialog_id");
            UserJid nullable = UserJid.getNullable(A04.getString("user_jid"));
            this.A02 = nullable;
            if (nullable != null) {
                C32241fu A0R = AnonymousClass3K2.A0R(this);
                if (A04.containsKey("title")) {
                    A0R.setTitle(A04.getString("title"));
                }
                if (A04.containsKey("message")) {
                    A0R.A06(A04.getCharSequence("message"));
                }
                if (A04.containsKey("positive_button")) {
                    A0R.A09(new IDxCListenerShape128S0100000_2_I1(this, 34), A04.getString("positive_button"));
                }
                if (A04.containsKey("negative_button")) {
                    A0R.A08(new IDxCListenerShape128S0100000_2_I1(this, 33), A04.getString("negative_button"));
                }
                return A0R.create();
            }
            throw AnonymousClass000.A0T("CommunityAdminDialogFragment/user jid must be passed in");
        }
        throw AnonymousClass000.A0V("dialog_id should be provided.");
    }

    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        C82644Dp.A00(this);
    }
}

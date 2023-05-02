package com.obwhatsapp.invites;

import X.AnonymousClass013;
import X.C001000l;
import X.C005702l;
import X.C13680ns;
import X.C16030sJ;
import X.C16050sL;
import X.C16080sP;
import X.C17240ul;
import X.C32241fu;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.redex.IDxCListenerShape0S0201000_2_I1;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.List;

public class PromptSendGroupInviteDialogFragment extends Hilt_PromptSendGroupInviteDialogFragment {
    public C16080sP A00;
    public C17240ul A01;

    public static PromptSendGroupInviteDialogFragment A01(Bundle bundle, int i2) {
        PromptSendGroupInviteDialogFragment promptSendGroupInviteDialogFragment = new PromptSendGroupInviteDialogFragment();
        bundle.putInt("invite_intent_code", i2);
        promptSendGroupInviteDialogFragment.A0T(bundle);
        return promptSendGroupInviteDialogFragment;
    }

    public Dialog A1B(Bundle bundle) {
        Bundle A04 = A04();
        C001000l A0D = A0D();
        List A08 = C16030sJ.A08(UserJid.class, A04.getStringArrayList("jids"));
        Intent intent = (Intent) A04.getParcelable("invite_intent");
        int i2 = A04.getInt("invite_intent_code");
        boolean A0m = this.A01.A0m(C16050sL.A05(intent != null ? intent.getStringExtra("group_jid") : null));
        IDxCListenerShape0S0201000_2_I1 iDxCListenerShape0S0201000_2_I1 = new IDxCListenerShape0S0201000_2_I1(intent, i2, this, 1);
        C32241fu A002 = C32241fu.A00(A0D);
        AnonymousClass013 r9 = this.A02;
        int i3 = R.plurals.plurals00a2;
        if (A0m) {
            i3 = R.plurals.plurals00fc;
        }
        AnonymousClass013 r3 = this.A02;
        C16080sP r12 = this.A00;
        HashSet A0o = C13680ns.A0o();
        A002.A06(r9.A0J(new Object[]{r3.A0G(r12.A0M(A0o, 3, -1, r12.A0U(A08, A0o), true))}, i3, (long) A08.size()));
        int i4 = R.string.str0327;
        if (A0m) {
            i4 = R.string.str0328;
        }
        A002.setPositiveButton(i4, iDxCListenerShape0S0201000_2_I1);
        A002.setNegativeButton(R.string.str0394, (DialogInterface.OnClickListener) null);
        C005702l create = A002.create();
        create.setCanceledOnTouchOutside(false);
        return create;
    }
}

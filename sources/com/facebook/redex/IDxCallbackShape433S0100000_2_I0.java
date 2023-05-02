package com.facebook.redex;

import X.AnonymousClass1VJ;
import X.C001000l;
import X.C108495Of;
import android.view.ViewGroup;
import com.obwhatsapp.conversationslist.ConversationsFragment;

public class IDxCallbackShape433S0100000_2_I0 implements C108495Of {
    public Object A00;
    public final int A01;

    public IDxCallbackShape433S0100000_2_I0(ConversationsFragment conversationsFragment, int i2) {
        this.A01 = i2;
        this.A00 = conversationsFragment;
    }

    public final void APL(AnonymousClass1VJ r4) {
        ViewGroup viewGroup;
        int i2;
        int i3 = this.A01;
        ConversationsFragment conversationsFragment = (ConversationsFragment) this.A00;
        C001000l A0C = conversationsFragment.A0C();
        if (i3 != 0) {
            if (A0C != null && !A0C.isFinishing()) {
                if (conversationsFragment.A0N.A03(r4)) {
                    conversationsFragment.A0N.A02(r4);
                    viewGroup = conversationsFragment.A07;
                    i2 = 0;
                } else {
                    viewGroup = conversationsFragment.A07;
                    i2 = 8;
                }
                viewGroup.setVisibility(i2);
            }
        } else if (A0C != null && !A0C.isFinishing()) {
            conversationsFragment.A0M.A02(r4);
        }
    }
}

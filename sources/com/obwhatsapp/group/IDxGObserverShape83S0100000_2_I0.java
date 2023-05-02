package com.obwhatsapp.group;

import X.AnonymousClass2AS;
import X.AnonymousClass3K3;
import X.C15830rv;
import X.C45882Bm;
import com.facebook.redex.RunnableRunnableShape17S0100000_I1;
import com.facebook.redex.RunnableRunnableShape4S0200000_I0_2;
import com.facebook.redex.RunnableRunnableShape5S0100000_I0_4;
import com.obwhatsapp.community.CommunityTabViewModel;
import com.whatsapp.jid.GroupJid;

public class IDxGObserverShape83S0100000_2_I0 extends C45882Bm {
    public Object A00;
    public final int A01;

    public IDxGObserverShape83S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00(C15830rv r4) {
        if (1 - this.A01 != 0) {
            super.A00(r4);
        } else {
            ((CommunityTabViewModel) this.A00).A0K.execute(new RunnableRunnableShape17S0100000_I1((Object) this, 39));
        }
    }

    public void A01(GroupJid groupJid) {
        switch (this.A01) {
            case 0:
                AnonymousClass2AS r3 = (AnonymousClass2AS) this.A00;
                if (groupJid.equals(r3.A0j)) {
                    r3.A0s.execute(new RunnableRunnableShape5S0100000_I0_4((Object) r3, 42));
                    r3.A0s.execute(new RunnableRunnableShape5S0100000_I0_4((Object) r3, 40));
                    return;
                }
                return;
            case 1:
                AnonymousClass3K3.A1H(((CommunityTabViewModel) this.A00).A0K, this, groupJid, 37);
                return;
            default:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                if (groupJid.equals(groupChatInfoActivity.A1N)) {
                    groupChatInfoActivity.A3R();
                    groupChatInfoActivity.A3S();
                    return;
                }
                return;
        }
    }

    public void A02(GroupJid groupJid, GroupJid groupJid2) {
        if (this.A01 != 0) {
            super.A02(groupJid, groupJid2);
            return;
        }
        AnonymousClass2AS r3 = (AnonymousClass2AS) this.A00;
        r3.A0s.execute(new RunnableRunnableShape4S0200000_I0_2(r3, 13, groupJid2));
    }
}

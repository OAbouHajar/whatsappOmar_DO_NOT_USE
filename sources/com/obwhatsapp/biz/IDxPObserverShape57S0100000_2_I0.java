package com.obwhatsapp.biz;

import X.AnonymousClass2AG;
import X.AnonymousClass2XA;
import X.AnonymousClass3K2;
import X.C30511cT;
import X.C42821yj;
import X.C439822h;
import com.obwhatsapp.chatinfo.ContactInfoActivity;
import com.obwhatsapp.conversationslist.ConversationsFragment;
import com.obwhatsapp.search.SearchFragment;
import com.whatsapp.jid.UserJid;

public class IDxPObserverShape57S0100000_2_I0 extends C439822h {
    public Object A00;
    public final int A01;

    public IDxPObserverShape57S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A01(UserJid userJid) {
        switch (this.A01) {
            case 0:
                AnonymousClass2XA r1 = (AnonymousClass2XA) this.A00;
                if (r1.A05.equals(userJid)) {
                    r1.A06();
                    return;
                }
                return;
            case 1:
                AnonymousClass3K2.A1G(this.A00, userJid);
                return;
            case 2:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                if (userJid.equals(UserJid.getNullable(contactInfoActivity.getIntent().getStringExtra("jid"))) && contactInfoActivity.A0Z.A0B != null) {
                    contactInfoActivity.A3f(false, false);
                    return;
                }
                return;
            case 3:
                C30511cT r12 = (C30511cT) this.A00;
                if (C30511cT.A02(r12, userJid)) {
                    r12.A04();
                    return;
                }
                return;
            case 4:
                C42821yj r13 = (C42821yj) this.A00;
                if (userJid != null && userJid.equals(r13.A33)) {
                    r13.A2A.A06();
                    r13.A22.invalidateOptionsMenu();
                    r13.A0F();
                    return;
                }
                return;
            case 5:
                ((AnonymousClass2AG) this.A00).A0A.A0H(userJid);
                return;
            case 6:
                ConversationsFragment.A05((ConversationsFragment) this.A00, userJid);
                return;
            default:
                SearchFragment.A02(userJid, (SearchFragment) this.A00);
                return;
        }
    }
}

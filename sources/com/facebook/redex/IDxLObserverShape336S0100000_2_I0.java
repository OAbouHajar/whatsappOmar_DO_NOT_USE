package com.facebook.redex;

import X.AnonymousClass28x;
import X.AnonymousClass290;
import X.AnonymousClass291;
import X.AnonymousClass3K3;
import X.C14870pt;
import X.C15830rv;
import X.C19430yQ;
import X.C39721sx;
import X.C50222Yl;
import com.obwhatsapp.chatinfo.ContactInfoActivity;
import com.obwhatsapp.group.GroupChatInfoActivity;
import com.whatsapp.jid.UserJid;
import java.util.Map;
import java.util.Set;

public class IDxLObserverShape336S0100000_2_I0 implements AnonymousClass290 {
    public Object A00;
    public final int A01;

    public IDxLObserverShape336S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AVm(C39721sx r7) {
        if (3 - this.A01 == 0) {
            AnonymousClass291 r5 = (AnonymousClass291) this.A00;
            C19430yQ r3 = r5.A1K;
            C15830rv r2 = r5.A0c;
            UserJid userJid = r7.A06;
            synchronized (r3.A0R) {
                Map map = (Map) r3.A09().get(r2);
                if (map != null) {
                    AnonymousClass28x r1 = userJid == null ? (AnonymousClass28x) map.get(r2) : (AnonymousClass28x) map.get(userJid);
                    if (r1 != null) {
                        if (C19430yQ.A01(r1.A00, r3.A0G.A00())) {
                            r5.A0U(r7);
                        }
                    }
                }
            }
        }
    }

    public void AVn(C15830rv r4, UserJid userJid) {
        switch (this.A01) {
            case 0:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                if (r4.equals(contactInfoActivity.A3N())) {
                    C14870pt.A00(contactInfoActivity.A05, contactInfoActivity, 35);
                    return;
                }
                return;
            case 1:
                ((C50222Yl) this.A00).A04.A09(r4);
                return;
            case 2:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                if (r4.equals(groupChatInfoActivity.A1M)) {
                    AnonymousClass3K3.A1E(groupChatInfoActivity.A05, groupChatInfoActivity, 39);
                    return;
                }
                return;
            default:
                AnonymousClass291 r1 = (AnonymousClass291) this.A00;
                if (r1.A0c.equals(r4)) {
                    r1.A0H();
                    return;
                }
                return;
        }
    }

    public void AVo(C15830rv r4, UserJid userJid) {
        switch (this.A01) {
            case 0:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                if (r4.equals(contactInfoActivity.A3N())) {
                    C14870pt.A00(contactInfoActivity.A05, contactInfoActivity, 36);
                    return;
                }
                return;
            case 1:
                ((C50222Yl) this.A00).A04.A09(r4);
                return;
            case 2:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                if (r4.equals(groupChatInfoActivity.A1M)) {
                    AnonymousClass3K3.A1E(groupChatInfoActivity.A05, groupChatInfoActivity, 40);
                    return;
                }
                return;
            default:
                AnonymousClass291 r2 = (AnonymousClass291) this.A00;
                if (r2.A0c.equals(r4)) {
                    if (userJid == null) {
                        userJid = UserJid.of(r4);
                    }
                    C39721sx r0 = r2.A0o;
                    if (r0 != null && r0.A06.equals(userJid)) {
                        r2.A0o = null;
                    }
                    Set set = r2.A1U;
                    synchronized (set) {
                        set.add(userJid);
                    }
                    r2.A0H();
                    return;
                }
                return;
        }
    }
}

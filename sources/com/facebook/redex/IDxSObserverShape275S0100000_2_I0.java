package com.facebook.redex;

import X.AnonymousClass291;
import X.AnonymousClass3K3;
import X.C14550pN;
import X.C14870pt;
import X.C15830rv;
import X.C39721sx;
import X.C454728t;
import X.C50222Yl;
import com.obwhatsapp.chatinfo.ContactInfoActivity;
import com.obwhatsapp.group.GroupChatInfoActivity;

public class IDxSObserverShape275S0100000_2_I0 implements C454728t {
    public Object A00;
    public final int A01;

    public IDxSObserverShape275S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void AXX(C15830rv r4) {
        switch (this.A01) {
            case 0:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                if (r4.equals(contactInfoActivity.A3N())) {
                    C14870pt.A00(contactInfoActivity.A05, contactInfoActivity, 33);
                    return;
                }
                return;
            case 1:
                C50222Yl r0 = (C50222Yl) this.A00;
                r0.A04.A09(r0.A00);
                return;
            case 2:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                if (r4.equals(groupChatInfoActivity.A1M)) {
                    AnonymousClass3K3.A1E(groupChatInfoActivity.A05, groupChatInfoActivity, 37);
                    return;
                }
                return;
            case 3:
                AnonymousClass291 r1 = (AnonymousClass291) this.A00;
                if (r4.equals(r1.A0c)) {
                    r1.A0H();
                    r1.A0E.invalidateOptionsMenu();
                    return;
                }
                return;
            case 4:
                AnonymousClass3K3.A1E(((C14550pN) this.A00).A05, this, 46);
                return;
            default:
                ((C14550pN) this.A00).A05.A0K(new RunnableRunnableShape20S0100000_I1_3(this, 0));
                return;
        }
    }

    public void AXz(C15830rv r4) {
        switch (this.A01) {
            case 0:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                if (r4.equals(contactInfoActivity.A3N())) {
                    C14870pt.A00(contactInfoActivity.A05, contactInfoActivity, 34);
                    return;
                }
                return;
            case 1:
                ((C50222Yl) this.A00).A04.A09(r4);
                return;
            case 2:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                if (r4.equals(groupChatInfoActivity.A1M)) {
                    AnonymousClass3K3.A1E(groupChatInfoActivity.A05, groupChatInfoActivity, 38);
                    return;
                }
                return;
            case 3:
                AnonymousClass291 r2 = (AnonymousClass291) this.A00;
                if (r4.equals(r2.A0c)) {
                    C39721sx r0 = r2.A0o;
                    if (r0 != null && r2.A0z.A0I(r0.A06)) {
                        r2.A0o = null;
                    }
                    r2.A0H();
                    r2.A0E.invalidateOptionsMenu();
                    return;
                }
                return;
            case 4:
                AnonymousClass3K3.A1E(((C14550pN) this.A00).A05, this, 47);
                return;
            default:
                C14870pt.A01(((C14550pN) this.A00).A05, this, 49);
                return;
        }
    }
}

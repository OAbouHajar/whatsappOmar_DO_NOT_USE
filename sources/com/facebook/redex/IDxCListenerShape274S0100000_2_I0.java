package com.facebook.redex;

import X.AnonymousClass2DL;
import X.C14750ph;
import X.C448125q;
import X.C54222h0;
import com.obwhatsapp.chatinfo.ContactInfoActivity;
import com.obwhatsapp.chatinfo.ListChatInfoActivity;
import com.obwhatsapp.group.GroupChatInfoActivity;

public class IDxCListenerShape274S0100000_2_I0 implements C54222h0 {
    public Object A00;
    public final int A01;

    public IDxCListenerShape274S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AOf() {
        switch (this.A01) {
            case 0:
                ((C448125q) this.A00).A00();
                return;
            case 1:
                AnonymousClass2DL r1 = (AnonymousClass2DL) this.A00;
                r1.startActivity(C14750ph.A0G(r1, r1.A36()));
                return;
            case 2:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                contactInfoActivity.startActivity(C14750ph.A0G(contactInfoActivity, contactInfoActivity.A3N()));
                return;
            case 3:
                ListChatInfoActivity listChatInfoActivity = (ListChatInfoActivity) this.A00;
                listChatInfoActivity.startActivity(C14750ph.A0G(listChatInfoActivity, listChatInfoActivity.A3M()));
                return;
            default:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                groupChatInfoActivity.startActivity(C14750ph.A0G(groupChatInfoActivity, groupChatInfoActivity.A1M));
                return;
        }
    }
}

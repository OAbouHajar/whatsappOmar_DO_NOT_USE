package com.facebook.redex;

import X.AnonymousClass00B;
import X.C108785Pi;
import X.C13680ns;
import X.C14570pP;
import android.widget.CompoundButton;
import com.obwhatsapp.MuteDialogFragment;
import com.obwhatsapp.chatinfo.ContactInfoActivity;
import com.obwhatsapp.group.GroupChatInfoActivity;
import com.obwhatsapp.group.GroupSettingMembershipApprovalRowV2;
import com.obwhatsapp.settings.SettingsChat;
import com.whatsapp.jid.UserJid;

public class IDxCListenerShape219S0100000_2_I0 implements CompoundButton.OnCheckedChangeListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape219S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
        switch (this.A01) {
            case 0:
                ((MuteDialogFragment) this.A00).A0B = z2;
                return;
            case 1:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                if (z2) {
                    UserJid A3N = contactInfoActivity.A3N();
                    AnonymousClass00B.A06(A3N);
                    C13680ns.A1J(MuteDialogFragment.A01(A3N, 2), contactInfoActivity);
                    return;
                }
                contactInfoActivity.A05.Acl(new RunnableRunnableShape5S0100000_I0_4(contactInfoActivity, 22));
                return;
            case 2:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                groupChatInfoActivity.A38();
                if (z2) {
                    groupChatInfoActivity.Afb(MuteDialogFragment.A01(groupChatInfoActivity.A1M, 2), (String) null);
                    return;
                } else {
                    groupChatInfoActivity.A05.Acl(new RunnableRunnableShape18S0100000_I1_1((Object) this, 36));
                    return;
                }
            case 3:
                C108785Pi r0 = ((GroupSettingMembershipApprovalRowV2) this.A00).A04;
                if (r0 != null) {
                    r0.ATd(z2);
                    return;
                }
                return;
            case 4:
                ((SettingsChat) this.A00).A05.A03(!z2);
                return;
            default:
                C14570pP r3 = (C14570pP) this.A00;
                r3.A05.Acl(new RunnableRunnableShape0S0110000_I0(r3, 27, z2));
                return;
        }
    }
}

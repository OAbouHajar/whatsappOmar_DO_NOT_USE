package com.facebook.redex;

import X.AnonymousClass29T;
import X.AnonymousClass2KO;
import X.AnonymousClass5SB;
import X.C13680ns;
import X.C79053z7;
import android.app.Activity;
import com.obwhatsapp.R;
import com.obwhatsapp.chatinfo.ListChatInfoActivity;
import com.obwhatsapp.settings.SettingsChatHistoryFragment;
import com.whatsapp.util.Log;

public class IDxCListenerShape338S0100000_2_I0 implements AnonymousClass5SB {
    public Object A00;
    public final int A01;

    public IDxCListenerShape338S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void ATt() {
        if (this.A01 == 0) {
            AnonymousClass29T.A00((Activity) this.A00, 2);
        }
    }

    public void AUz(boolean z2) {
        if (this.A01 != 0) {
            SettingsChatHistoryFragment settingsChatHistoryFragment = (SettingsChatHistoryFragment) this.A00;
            AnonymousClass2KO r0 = settingsChatHistoryFragment.A00;
            if (r0 != null) {
                r0.Afr(R.string.str130a, R.string.str13db);
            }
            settingsChatHistoryFragment.A0B.Acl(new RunnableRunnableShape1S0110000_I1(this, 8, z2));
            return;
        }
        Log.i("list_chat_info/onclick_leaveGroup");
        ListChatInfoActivity listChatInfoActivity = (ListChatInfoActivity) this.A00;
        C13680ns.A1U(new C79053z7(listChatInfoActivity, listChatInfoActivity.A01, listChatInfoActivity.A3M(), z2), listChatInfoActivity.A05);
    }
}

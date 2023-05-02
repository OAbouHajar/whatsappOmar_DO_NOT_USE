package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass2O7;
import X.AnonymousClass2O8;
import X.AnonymousClass5PZ;
import X.C16000sG;
import X.C16010sH;
import X.C16050sL;
import android.text.TextUtils;
import android.view.View;
import com.obwhatsapp.chatinfo.ListChatInfoActivity;
import com.obwhatsapp.group.GroupChatInfoActivity;
import com.whatsapp.util.Log;

public class IDxRListenerShape372S0100000_2_I0 implements AnonymousClass5PZ {
    public Object A00;
    public final int A01;

    public IDxRListenerShape372S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AbX(String str) {
        String str2 = str;
        switch (this.A01) {
            case 0:
                ListChatInfoActivity listChatInfoActivity = (ListChatInfoActivity) this.A00;
                if (!listChatInfoActivity.A0B.A08(listChatInfoActivity.A0J).equals(str)) {
                    C16010sH r1 = listChatInfoActivity.A0J;
                    r1.A0L = str;
                    listChatInfoActivity.A06.A0M(r1);
                    listChatInfoActivity.A0G.A00(listChatInfoActivity.A3M(), str);
                    listChatInfoActivity.A3S();
                    listChatInfoActivity.A0F.A06(listChatInfoActivity.A3M());
                    return;
                }
                return;
            case 1:
                ((GroupChatInfoActivity) this.A00).A3g(str);
                return;
            default:
                AnonymousClass2O8 r3 = ((GroupChatInfoActivity) this.A00).A1B;
                C16000sG r0 = r3.A05;
                C16050sL r5 = r3.A0C;
                C16010sH A0A = r0.A0A(r5);
                if (r3.A01(false) && !TextUtils.equals(r3.A06.A08(A0A), str) && r3.A00(str)) {
                    View view = r3.A00;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    Log.i(AnonymousClass000.A0h(str, AnonymousClass000.A0r("group_info/change subject:")));
                    r3.A0B.A06(new AnonymousClass2O7(r3.A08, r3, r3.A0A, r5, str2));
                    return;
                }
                return;
        }
    }
}

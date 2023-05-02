package com.obwhatsapp.group;

import X.C108795Pj;
import X.C13690nt;
import X.C16050sL;
import android.os.Bundle;
import com.obwhatsapp.R;
import com.whatsapp.voipcalling.CallLinkInfo;

public class GroupSettingsLayoutV1$SendMessagesDialogFragment extends Hilt_GroupSettingsLayoutV1_SendMessagesDialogFragment {
    public C108795Pj A00;

    public static GroupSettingsLayoutV1$SendMessagesDialogFragment A01(C108795Pj r4, C16050sL r5, boolean z2) {
        GroupSettingsLayoutV1$SendMessagesDialogFragment groupSettingsLayoutV1$SendMessagesDialogFragment = new GroupSettingsLayoutV1$SendMessagesDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("gjid", r5.getRawString());
        A0D.putBoolean(CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID, z2);
        groupSettingsLayoutV1$SendMessagesDialogFragment.A0T(A0D);
        groupSettingsLayoutV1$SendMessagesDialogFragment.A00 = r4;
        return groupSettingsLayoutV1$SendMessagesDialogFragment;
    }

    public String A1P() {
        return A0J(R.string.str0afd);
    }

    public String A1Q() {
        return A0J(R.string.str1ce7);
    }

    public void A1R(boolean z2) {
        this.A00.AX6(2, !z2);
    }
}

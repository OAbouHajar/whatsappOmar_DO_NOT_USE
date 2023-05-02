package com.obwhatsapp.group;

import X.AnonymousClass000;
import X.C108795Pj;
import X.C13690nt;
import X.C16050sL;
import android.os.Bundle;
import com.obwhatsapp.R;
import com.whatsapp.voipcalling.CallLinkInfo;

public class GroupSettingsLayoutV1$EditGroupInfoDialogFragment extends Hilt_GroupSettingsLayoutV1_EditGroupInfoDialogFragment {
    public C108795Pj A00;

    public static GroupSettingsLayoutV1$EditGroupInfoDialogFragment A01(C108795Pj r4, C16050sL r5, boolean z2) {
        GroupSettingsLayoutV1$EditGroupInfoDialogFragment groupSettingsLayoutV1$EditGroupInfoDialogFragment = new GroupSettingsLayoutV1$EditGroupInfoDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("gjid", r5.getRawString());
        A0D.putBoolean(CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID, z2);
        groupSettingsLayoutV1$EditGroupInfoDialogFragment.A0T(A0D);
        groupSettingsLayoutV1$EditGroupInfoDialogFragment.A00 = r4;
        return groupSettingsLayoutV1$EditGroupInfoDialogFragment;
    }

    public String A1P() {
        if (!this.A04.A0C(1353)) {
            return A0J(R.string.str0b0d);
        }
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(A0J(R.string.str0b0b));
        A0o.append(" ");
        return AnonymousClass000.A0h(A0J(R.string.str0b0c), A0o);
    }

    public String A1Q() {
        boolean A0C = this.A04.A0C(1353);
        int i2 = R.string.str1ce8;
        if (A0C) {
            i2 = R.string.str0766;
        }
        return A0J(i2);
    }

    public void A1R(boolean z2) {
        this.A00.AX6(1, !z2);
    }
}

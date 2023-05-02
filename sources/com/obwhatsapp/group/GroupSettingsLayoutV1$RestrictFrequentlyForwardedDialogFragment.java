package com.obwhatsapp.group;

import X.C108795Pj;
import X.C13690nt;
import X.C16050sL;
import android.os.Bundle;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallLinkInfo;

public class GroupSettingsLayoutV1$RestrictFrequentlyForwardedDialogFragment extends Hilt_GroupSettingsLayoutV1_RestrictFrequentlyForwardedDialogFragment {
    public C108795Pj A00;

    public static GroupSettingsLayoutV1$RestrictFrequentlyForwardedDialogFragment A01(C108795Pj r4, C16050sL r5, boolean z2) {
        GroupSettingsLayoutV1$RestrictFrequentlyForwardedDialogFragment groupSettingsLayoutV1$RestrictFrequentlyForwardedDialogFragment = new GroupSettingsLayoutV1$RestrictFrequentlyForwardedDialogFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("gjid", r5.getRawString());
        A0D.putBoolean(CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID, z2);
        groupSettingsLayoutV1$RestrictFrequentlyForwardedDialogFragment.A0T(A0D);
        groupSettingsLayoutV1$RestrictFrequentlyForwardedDialogFragment.A00 = r4;
        return groupSettingsLayoutV1$RestrictFrequentlyForwardedDialogFragment;
    }

    public String A1N() {
        return A0J(R.string.str0afc);
    }

    public String A1O() {
        return A0J(R.string.str0aff);
    }

    public String A1P() {
        return A0J(R.string.str0b01);
    }

    public String A1Q() {
        return A0J(R.string.str0b02);
    }

    public void A1R(boolean z2) {
        if (this.A08.A0j != z2) {
            this.A00.AX6(3, !z2);
        } else {
            Log.i("RestrictFrequentlyForwardedDialogFragment/onPositiveButtonClick: skip request, values are equal");
        }
    }
}

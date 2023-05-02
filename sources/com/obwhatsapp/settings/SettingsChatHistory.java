package com.obwhatsapp.settings;

import X.AnonymousClass050;
import X.AnonymousClass2KO;
import X.C13680ns;
import X.C14570pP;
import X.C16150sX;
import android.os.Bundle;
import com.obwhatsapp.R;
import com.obwhatsapp.WaPreferenceFragment;

public class SettingsChatHistory extends AnonymousClass2KO {
    public boolean A00;

    public SettingsChatHistory() {
        this(0);
    }

    public SettingsChatHistory(int i2) {
        this.A00 = false;
        C13680ns.A1G(this, 116);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            C16150sX r1 = C14570pP.A1T(this).A1s;
            this.A05 = C16150sX.A1B(r1);
            this.A05 = C16150sX.A02(r1);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout04ae);
        if (bundle == null) {
            this.A06 = new SettingsChatHistoryFragment();
            AnonymousClass050 A0O = C13680ns.A0O(this);
            A0O.A0E(this.A06, "preferenceFragment", R.id.preference_fragment);
            A0O.A01();
            return;
        }
        setTitle(bundle.getCharSequence("settingsChatHistoryTitle"));
        this.A06 = (WaPreferenceFragment) AGM().A0B("preferenceFragment");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("settingsChatHistoryTitle", getTitle());
    }
}

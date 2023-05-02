package com.obwhatsapp.settings;

import X.AnonymousClass050;
import X.AnonymousClass15P;
import X.AnonymousClass2KM;
import X.C13680ns;
import X.C14570pP;
import X.C15960sC;
import X.C16150sX;
import X.C16190sc;
import android.os.Bundle;
import com.obwhatsapp.R;
import com.obwhatsapp.WaPreferenceFragment;

public class SettingsJidNotificationActivity extends AnonymousClass2KM {
    public boolean A00;

    public SettingsJidNotificationActivity() {
        this(0);
    }

    public SettingsJidNotificationActivity(int i2) {
        this.A00 = false;
        C13680ns.A1G(this, 118);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            C16150sX r1 = C14570pP.A1T(this).A1s;
            this.A05 = C16150sX.A1B(r1);
            this.A05 = C16150sX.A02(r1);
            this.A01 = (C16190sc) r1.A8R.get();
            this.A00 = (AnonymousClass15P) r1.A0b.get();
            this.A02 = C16150sX.A0T(r1);
            this.A03 = (C15960sC) r1.AKz.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout04ae);
        if (bundle == null) {
            this.A06 = new SettingsJidNotificationFragment();
            AnonymousClass050 A0O = C13680ns.A0O(this);
            A0O.A0E(this.A06, "preferenceFragment", R.id.preference_fragment);
            A0O.A01();
            return;
        }
        setTitle(bundle.getCharSequence("settingsJidNotificationFragment"));
        this.A06 = (WaPreferenceFragment) AGM().A09(bundle, "preferenceFragment");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("settingsJidNotificationFragment", getTitle());
    }
}

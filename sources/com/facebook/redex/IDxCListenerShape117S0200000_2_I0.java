package com.facebook.redex;

import X.AnonymousClass1WS;
import X.C12440kP;
import X.C16220sf;
import X.C218415q;
import android.text.TextUtils;
import androidx.preference.Preference;
import com.obwhatsapp.preference.WaRingtonePreference;
import com.obwhatsapp.settings.SettingsJidNotificationFragment;

public class IDxCListenerShape117S0200000_2_I0 implements C12440kP {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape117S0200000_2_I0(WaRingtonePreference waRingtonePreference, SettingsJidNotificationFragment settingsJidNotificationFragment, int i2) {
        this.A02 = i2;
        this.A00 = settingsJidNotificationFragment;
        this.A01 = waRingtonePreference;
    }

    public final boolean AV5(Preference preference, Object obj) {
        if (this.A02 != 0) {
            SettingsJidNotificationFragment settingsJidNotificationFragment = (SettingsJidNotificationFragment) this.A00;
            WaRingtonePreference waRingtonePreference = (WaRingtonePreference) this.A01;
            String obj2 = obj.toString();
            waRingtonePreference.A01 = obj2;
            waRingtonePreference.A0I(C218415q.A07(preference.A05, obj2));
            C16220sf r2 = settingsJidNotificationFragment.A05;
            AnonymousClass1WS A07 = r2.A07(settingsJidNotificationFragment.A04.getRawString());
            if (TextUtils.equals(obj2, A07.A07)) {
                return true;
            }
            A07.A07 = obj2;
            r2.A0K(A07);
            return true;
        }
        SettingsJidNotificationFragment settingsJidNotificationFragment2 = (SettingsJidNotificationFragment) this.A00;
        WaRingtonePreference waRingtonePreference2 = (WaRingtonePreference) this.A01;
        String obj3 = obj.toString();
        waRingtonePreference2.A01 = obj3;
        waRingtonePreference2.A0I(C218415q.A07(preference.A05, obj3));
        settingsJidNotificationFragment2.A05.A0N(settingsJidNotificationFragment2.A04.getRawString(), obj3);
        return true;
    }
}

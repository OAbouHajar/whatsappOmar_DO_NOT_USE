package com.facebook.redex;

import X.AnonymousClass1WD;
import X.AnonymousClass29T;
import X.AnonymousClass2KO;
import X.AnonymousClass391;
import X.C12450kQ;
import X.C14730pf;
import androidx.preference.Preference;
import com.obwhatsapp.R;
import com.obwhatsapp.WaPreferenceFragment;
import com.obwhatsapp.settings.SettingsChatHistoryFragment;

public class IDxCListenerShape348S0100000_2_I0 implements C12450kQ {
    public Object A00;
    public final int A01;

    public IDxCListenerShape348S0100000_2_I0(SettingsChatHistoryFragment settingsChatHistoryFragment, int i2) {
        this.A01 = i2;
        this.A00 = settingsChatHistoryFragment;
    }

    public final boolean AV6(Preference preference) {
        SettingsChatHistoryFragment settingsChatHistoryFragment;
        AnonymousClass1WD r2;
        int i2;
        switch (this.A01) {
            case 0:
                settingsChatHistoryFragment = (SettingsChatHistoryFragment) this.A00;
                r2 = settingsChatHistoryFragment.A0A.A07(settingsChatHistoryFragment.A00);
                i2 = 9;
                break;
            case 1:
                settingsChatHistoryFragment = (SettingsChatHistoryFragment) this.A00;
                r2 = settingsChatHistoryFragment.A0A.A07(settingsChatHistoryFragment.A00);
                i2 = 10;
                break;
            case 2:
                SettingsChatHistoryFragment settingsChatHistoryFragment2 = (SettingsChatHistoryFragment) this.A00;
                if (settingsChatHistoryFragment2.A07.A02()) {
                    boolean A002 = C14730pf.A00();
                    int i3 = R.string.str0dc1;
                    if (A002) {
                        i3 = R.string.str0dc0;
                    }
                    AnonymousClass2KO r0 = settingsChatHistoryFragment2.A00;
                    if (r0 == null) {
                        return true;
                    }
                    r0.Afg(i3);
                    return true;
                }
                AnonymousClass391 r1 = new AnonymousClass391(settingsChatHistoryFragment2.A0u());
                r1.A04 = true;
                settingsChatHistoryFragment2.startActivityForResult(r1.A00(), 10);
                return true;
            default:
                AnonymousClass29T.A01(((WaPreferenceFragment) this.A00).A00, 5);
                return true;
        }
        r2.A00(new IDxNConsumerShape154S0100000_2_I1(settingsChatHistoryFragment, i2));
        return true;
    }
}

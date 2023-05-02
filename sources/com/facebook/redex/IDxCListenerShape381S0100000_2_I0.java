package com.facebook.redex;

import X.AnonymousClass29T;
import X.AnonymousClass2KO;
import X.AnonymousClass36P;
import X.AnonymousClass5SB;
import X.AnonymousClass5SC;
import X.C13680ns;
import com.obwhatsapp.R;
import com.obwhatsapp.WaPreferenceFragment;
import com.obwhatsapp.settings.SettingsChatHistoryFragment;

public class IDxCListenerShape381S0100000_2_I0 implements AnonymousClass5SC {
    public Object A00;
    public final int A01;

    public IDxCListenerShape381S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void ATt() {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            ((AnonymousClass5SB) obj).ATt();
            return;
        }
        AnonymousClass2KO r1 = ((WaPreferenceFragment) obj).A00;
        if (r1 != null) {
            AnonymousClass29T.A00(r1, 3);
        }
    }

    public void AV0(boolean z2, boolean z3) {
        if (this.A01 != 0) {
            ((AnonymousClass5SB) this.A00).AUz(z3);
            return;
        }
        SettingsChatHistoryFragment settingsChatHistoryFragment = (SettingsChatHistoryFragment) this.A00;
        AnonymousClass2KO r1 = settingsChatHistoryFragment.A00;
        if (r1 != null) {
            AnonymousClass29T.A00(r1, 3);
            AnonymousClass2KO r2 = settingsChatHistoryFragment.A00;
            if (r2 != null) {
                r2.Afr(R.string.str130a, R.string.str13db);
                C13680ns.A1U(new AnonymousClass36P(settingsChatHistoryFragment.A00, settingsChatHistoryFragment.A03, z2, z3), settingsChatHistoryFragment.A0B);
            }
        }
    }
}

package com.obwhatsapp.privacy.disclosure.standalone;

import X.AnonymousClass1DV;
import X.AnonymousClass41M;
import X.C106485Ea;
import X.C13680ns;
import X.C14550pN;
import X.C14570pP;
import X.C15220qW;
import X.C16150sX;
import X.C18450wi;
import X.C79023z4;
import android.os.Bundle;
import com.facebook.redex.IDxRListenerShape304S0100000_2_I1;

public final class PrivacyDisclosureStandaloneContainerActivity extends C14550pN {
    public boolean A00;
    public boolean A01;
    public final C15220qW A02;

    public PrivacyDisclosureStandaloneContainerActivity() {
        this(0);
        this.A02 = new AnonymousClass1DV(new C106485Ea(this));
    }

    public PrivacyDisclosureStandaloneContainerActivity(int i2) {
        this.A00 = false;
        C13680ns.A1G(this, 91);
    }

    public static final void A02(Bundle bundle, PrivacyDisclosureStandaloneContainerActivity privacyDisclosureStandaloneContainerActivity) {
        C15220qW r2;
        PrivacyDisclosureStandaloneContainerViewModel privacyDisclosureStandaloneContainerViewModel;
        int i2;
        C18450wi.A0H(bundle, 2);
        String string = bundle.getString("result", (String) null);
        C18450wi.A0B(string);
        switch (AnonymousClass41M.valueOf(string).ordinal()) {
            case 0:
                r2 = privacyDisclosureStandaloneContainerActivity.A02;
                privacyDisclosureStandaloneContainerViewModel = (PrivacyDisclosureStandaloneContainerViewModel) r2.getValue();
                i2 = privacyDisclosureStandaloneContainerViewModel.A00 + 1;
                break;
            case 1:
                privacyDisclosureStandaloneContainerActivity.A02.getValue();
                break;
            case 2:
                r2 = privacyDisclosureStandaloneContainerActivity.A02;
                privacyDisclosureStandaloneContainerViewModel = (PrivacyDisclosureStandaloneContainerViewModel) r2.getValue();
                i2 = privacyDisclosureStandaloneContainerViewModel.A00 - 1;
                break;
            default:
                return;
        }
        privacyDisclosureStandaloneContainerViewModel.A00 = i2;
        ((PrivacyDisclosureStandaloneContainerViewModel) r2.getValue()).A02.A01();
        r2.getValue();
        privacyDisclosureStandaloneContainerActivity.finish();
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            C16150sX r0 = C14570pP.A1T(this).A1s;
            C14550pN.A15(r0, this);
            this.A0A = C14550pN.A0v(r0);
        }
    }

    public final void A2m() {
        PrivacyDisclosureStandaloneContainerViewModel privacyDisclosureStandaloneContainerViewModel = (PrivacyDisclosureStandaloneContainerViewModel) this.A02.getValue();
        getIntent().getIntExtra("disclosure_id", -1);
        getIntent().getStringExtra("surface");
        C13680ns.A1U(new C79023z4(privacyDisclosureStandaloneContainerViewModel), privacyDisclosureStandaloneContainerViewModel.A05);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C13680ns.A1L(this, ((PrivacyDisclosureStandaloneContainerViewModel) this.A02.getValue()).A01, 122);
        AGM().A0f(new IDxRListenerShape304S0100000_2_I1(this, 2), this, "fragResultRequestKey");
        A2m();
    }
}

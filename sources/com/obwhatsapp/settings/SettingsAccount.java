package com.obwhatsapp.settings;

import X.AnonymousClass00B;
import X.AnonymousClass01V;
import X.AnonymousClass15P;
import X.AnonymousClass2Rf;
import X.C005402i;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
import X.C15480r5;
import X.C15860rz;
import X.C15900s5;
import X.C15960sC;
import X.C16040sK;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16290sm;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16490t9;
import X.C16620tM;
import X.C17250um;
import X.C18260wP;
import X.C19110xm;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C49132Rg;
import android.os.Bundle;
import android.view.View;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5;
import com.obwhatsapp.R;

public class SettingsAccount extends C14530pL {
    public C15480r5 A00;
    public C16490t9 A01;
    public boolean A02;

    public SettingsAccount() {
        this(0);
    }

    public SettingsAccount(int i2) {
        this.A02 = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 86));
    }

    public void A1q() {
        if (!this.A02) {
            this.A02 = true;
            C49132Rg r1 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r2 = r1.A1s;
            this.A05 = (C16320sq) r2.ARB.get();
            this.A0C = (C14710pd) r2.A05.get();
            this.A05 = (C14870pt) r2.AB3.get();
            this.A03 = (C16300so) r2.A5p.get();
            this.A04 = (C16180sb) r2.A8b.get();
            this.A0B = (C17250um) r2.A7e.get();
            this.A06 = (C15900s5) r2.ALm.get();
            this.A08 = (AnonymousClass01V) r2.AOi.get();
            this.A0D = (C19950zG) r2.AQV.get();
            this.A09 = (C15860rz) r2.AQh.get();
            this.A07 = (C18260wP) r2.A4p.get();
            this.A0A = (C16290sm) r2.AQk.get();
            this.A05 = (C16440t3) r2.AP2.get();
            this.A0B = (C23061Ai) r2.AC0.get();
            this.A01 = (C16040sK) r2.ADr.get();
            this.A04 = (C16190sc) r2.A8R.get();
            this.A08 = r1.A0K();
            this.A06 = (C14730pf) r2.ANy.get();
            this.A00 = (C19980zJ) r2.A0P.get();
            this.A02 = (C23071Aj) r2.AQb.get();
            this.A03 = (AnonymousClass15P) r2.A0b.get();
            this.A0A = (C19490yW) r2.ALQ.get();
            this.A09 = (C15960sC) r2.AKz.get();
            this.A07 = C16150sX.A0d(r2);
            this.A01 = (C16490t9) r2.AQz.get();
            this.A00 = new C15480r5((C19110xm) r1.A0E.get());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str151e);
        setContentView((int) R.layout.layout04c1);
        C005402i x2 = x();
        AnonymousClass00B.A06(x2);
        x2.A0N(true);
        C14710pd r0 = this.A0C;
        C16620tM r4 = C16620tM.A02;
        boolean A0E = r0.A0E(r4, 2261);
        View findViewById = findViewById(R.id.privacy_preference);
        if (A0E) {
            findViewById.setVisibility(8);
        } else {
            findViewById.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 21));
        }
        SettingsRowIconText settingsRowIconText = (SettingsRowIconText) findViewById(R.id.security_preference);
        if (this.A0C.A0E(r4, 2261)) {
            settingsRowIconText.setText(getString(R.string.str15bf));
        }
        settingsRowIconText.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 25));
        boolean booleanExtra = getIntent().getBooleanExtra("is_companion", false);
        View findViewById2 = findViewById(R.id.log_out_preference);
        if (booleanExtra) {
            findViewById2.setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 20));
            findViewById(R.id.two_step_verification_preference).setVisibility(8);
            findViewById(R.id.change_number_preference).setVisibility(8);
            findViewById(R.id.delete_account_preference).setVisibility(8);
        } else {
            findViewById2.setVisibility(8);
            findViewById(R.id.two_step_verification_preference).setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 22));
            findViewById(R.id.change_number_preference).setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 24));
            findViewById(R.id.delete_account_preference).setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 19));
        }
        findViewById(R.id.request_account_info_preference).setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 23));
    }
}

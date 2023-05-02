package com.obwhatsapp.wabloks.commerce.ui.view;

import X.AnonymousClass01A;
import X.AnonymousClass01V;
import X.AnonymousClass15P;
import X.AnonymousClass2Rf;
import X.AnonymousClass2ZU;
import X.AnonymousClass5xY;
import X.C14710pd;
import X.C14730pf;
import X.C14870pt;
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
import X.C17250um;
import X.C17270uo;
import X.C18260wP;
import X.C18450wi;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C20140zZ;
import X.C23061Ai;
import X.C23071Aj;
import X.C35001lD;
import X.C49132Rg;
import X.C813247s;
import android.content.Intent;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.obwhatsapp.wabloks.ui.WaBloksActivity;

public final class WaBkExtensionsActivity extends WaBloksActivity {
    public boolean A00;

    public WaBkExtensionsActivity() {
        this(0);
    }

    public WaBkExtensionsActivity(int i2) {
        this.A00 = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 110));
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
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
            AnonymousClass5xY.A03(this, C17270uo.A00(r2.A1t));
            AnonymousClass5xY.A02((C20140zZ) r2.A1r.get(), this);
            AnonymousClass5xY.A05(this, C16150sX.A1D(r2));
            AnonymousClass5xY.A00((AnonymousClass2ZU) r1.A1m.get(), this);
            AnonymousClass5xY.A04(this, C16150sX.A1C(r2));
            AnonymousClass5xY.A01(r1.A06(), this);
        }
    }

    public AnonymousClass01A A35(Intent intent) {
        String stringExtra = intent.getStringExtra("screen_name");
        C18450wi.A0F(stringExtra);
        return C813247s.A00((C35001lD) intent.getParcelableExtra("screen_cache_config"), stringExtra, intent.getStringExtra("screen_params"), intent.getStringExtra("qpl_param_map"));
    }
}

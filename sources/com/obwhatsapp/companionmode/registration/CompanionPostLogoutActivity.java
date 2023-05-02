package com.obwhatsapp.companionmode.registration;

import X.AnonymousClass01V;
import X.AnonymousClass15P;
import X.AnonymousClass1KQ;
import X.AnonymousClass1RE;
import X.AnonymousClass2Rf;
import X.AnonymousClass3MF;
import X.C14530pL;
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
import X.C16980tz;
import X.C17110uY;
import X.C17250um;
import X.C18260wP;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C49132Rg;
import android.os.Bundle;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape6S0100000_I0_5;
import com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2;
import com.obwhatsapp.R;

public class CompanionPostLogoutActivity extends C14530pL {
    public AnonymousClass1RE A00;
    public C16980tz A01;
    public AnonymousClass1KQ A02;
    public C17110uY A03;
    public boolean A04;

    public CompanionPostLogoutActivity() {
        this(0);
    }

    public CompanionPostLogoutActivity(int i2) {
        this.A04 = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 41));
    }

    public void A1q() {
        if (!this.A04) {
            this.A04 = true;
            C49132Rg r2 = (C49132Rg) ((AnonymousClass2Rf) A1f().generatedComponent());
            C16150sX r1 = r2.A1s;
            this.A05 = (C16320sq) r1.ARB.get();
            this.A0C = (C14710pd) r1.A05.get();
            this.A05 = (C14870pt) r1.AB3.get();
            this.A03 = (C16300so) r1.A5p.get();
            this.A04 = (C16180sb) r1.A8b.get();
            this.A0B = (C17250um) r1.A7e.get();
            this.A06 = (C15900s5) r1.ALm.get();
            this.A08 = (AnonymousClass01V) r1.AOi.get();
            this.A0D = (C19950zG) r1.AQV.get();
            this.A09 = (C15860rz) r1.AQh.get();
            this.A07 = (C18260wP) r1.A4p.get();
            this.A0A = (C16290sm) r1.AQk.get();
            this.A05 = (C16440t3) r1.AP2.get();
            this.A0B = (C23061Ai) r1.AC0.get();
            this.A01 = (C16040sK) r1.ADr.get();
            this.A04 = (C16190sc) r1.A8R.get();
            this.A08 = r2.A0K();
            this.A06 = (C14730pf) r1.ANy.get();
            this.A00 = (C19980zJ) r1.A0P.get();
            this.A02 = (C23071Aj) r1.AQb.get();
            this.A03 = (AnonymousClass15P) r1.A0b.get();
            this.A0A = (C19490yW) r1.ALQ.get();
            this.A09 = (C15960sC) r1.AKz.get();
            this.A07 = C16150sX.A0d(r1);
            this.A01 = (C16980tz) r1.AQB.get();
            this.A03 = (C17110uY) r1.ADT.get();
            this.A02 = (AnonymousClass1KQ) r1.AAL.get();
            this.A00 = (AnonymousClass1RE) r1.A4h.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0119);
        TextView textView = (TextView) findViewById(R.id.post_logout_text_2);
        textView.setText(this.A03.A06(new RunnableRunnableShape6S0100000_I0_5(this, 35), getString(R.string.str12ed, new Object[]{"contact-help"}), "contact-help"));
        textView.setMovementMethod(new AnonymousClass3MF());
        findViewById(R.id.continue_button).setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_2(this, 12));
    }
}

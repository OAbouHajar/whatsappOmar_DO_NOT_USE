package com.obwhatsapp.registration.accountdefence.ui;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass15P;
import X.AnonymousClass1BZ;
import X.AnonymousClass1ZW;
import X.AnonymousClass2FK;
import X.AnonymousClass2JN;
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
import X.C17250um;
import X.C18260wP;
import X.C19490yW;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C49132Rg;
import X.C57102q8;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape13S0100000_I0_12;
import com.facebook.redex.ViewOnClickCListenerShape12S0100000_I0_5;
import com.obwhatsapp.Me;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

public class OldDeviceSecureAccountActivity extends C14530pL implements AnonymousClass2FK {
    public AnonymousClass1BZ A00;
    public boolean A01;

    public OldDeviceSecureAccountActivity() {
        this(0);
    }

    public OldDeviceSecureAccountActivity(int i2) {
        this.A01 = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 83));
    }

    public void A1q() {
        if (!this.A01) {
            this.A01 = true;
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
            this.A00 = (AnonymousClass1BZ) r1.A5N.get();
        }
    }

    public final void navigateTo2FactorAuthSetup(View view) {
        Context context = view.getContext();
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.registration.accountdefence.ui.OldDeviceSecureAccount2FaActivity");
        startActivity(intent);
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout002e);
        AnonymousClass00T.A05(this, R.id.close_button).setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 7));
        AnonymousClass00T.A05(this, R.id.add_security_btn).setOnClickListener(new ViewOnClickCListenerShape12S0100000_I0_5((Object) this, 6));
        ((TextView) AnonymousClass00T.A05(this, R.id.description_sms_code)).setText(AnonymousClass1ZW.A01(getString(R.string.str006c, new Object[]{AnonymousClass1ZW.A06(this, R.color.color06c5)}), new Object[0]));
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) AnonymousClass00T.A05(this, R.id.description_move_alert);
        textEmojiLabel.A07 = new AnonymousClass3MF();
        textEmojiLabel.setAccessibilityHelper(new C57102q8(textEmojiLabel, this.A08));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        C16040sK r0 = this.A01;
        r0.A0B();
        Me me = r0.A00;
        AnonymousClass00B.A06(me);
        String str = me.jabber_id;
        AnonymousClass00B.A06(str);
        AnonymousClass013 r2 = this.A01;
        String str2 = me.cc;
        textEmojiLabel.setText(spannableStringBuilder.append(AnonymousClass1ZW.A01(getString(R.string.str006b, new Object[]{AnonymousClass1ZW.A06(this, R.color.color06c5), r2.A0H(AnonymousClass2JN.A0E(str2, str.substring(str2.length())))}), new Object[0])).append(" ").append(AnonymousClass2JN.A08(new RunnableRunnableShape13S0100000_I0_12((Object) this, 49), getString(R.string.str006a), "learn-more")));
    }
}

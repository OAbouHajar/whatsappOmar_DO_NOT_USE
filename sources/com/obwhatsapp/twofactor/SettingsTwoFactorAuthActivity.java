package com.obwhatsapp.twofactor;

import X.AnonymousClass00B;
import X.AnonymousClass01V;
import X.AnonymousClass0rA;
import X.AnonymousClass15P;
import X.AnonymousClass2Rf;
import X.AnonymousClass2SR;
import X.C005402i;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14860ps;
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
import X.C32241fu;
import X.C434920f;
import X.C49132Rg;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape127S0100000_2_I0;
import com.facebook.redex.IDxCListenerShape236S0100000_2_I0;
import com.facebook.redex.IDxDListenerShape190S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape15S0100000_I0_14;
import com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6;
import com.obwhatsapp.R;
import java.util.List;

public class SettingsTwoFactorAuthActivity extends C14530pL implements AnonymousClass0rA {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public ScrollView A05;
    public TextView A06;
    public TextView A07;
    public C14860ps A08;
    public boolean A09;
    public final Handler A0A;
    public final Runnable A0B;

    public class ConfirmDisableDialog extends Hilt_SettingsTwoFactorAuthActivity_ConfirmDisableDialog {
        public Dialog A1B(Bundle bundle) {
            C32241fu r3 = new C32241fu(A0u());
            r3.A01(R.string.str15dd);
            r3.setPositiveButton(R.string.str15dc, new IDxCListenerShape127S0100000_2_I0(this, 137));
            r3.setNegativeButton(R.string.str0394, (DialogInterface.OnClickListener) null);
            return r3.create();
        }
    }

    public SettingsTwoFactorAuthActivity() {
        this(0);
        this.A0A = new Handler(Looper.getMainLooper());
        this.A0B = new RunnableRunnableShape15S0100000_I0_14(this, 46);
    }

    public SettingsTwoFactorAuthActivity(int i2) {
        this.A09 = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 106));
    }

    public void A1q() {
        if (!this.A09) {
            this.A09 = true;
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
            this.A08 = (C14860ps) r1.API.get();
        }
    }

    public final void A35() {
        this.A03.setElevation(this.A05.canScrollVertically(1) ? (float) this.A00 : 0.0f);
    }

    public final void A36() {
        this.A05.getViewTreeObserver().addOnPreDrawListener(new IDxDListenerShape190S0100000_2_I0(this, 10));
    }

    public void AZH() {
        this.A0A.removeCallbacks(this.A0B);
        Ac1();
        Afg(R.string.str1852);
        this.A05.Aco(new RunnableRunnableShape15S0100000_I0_14(this, 47));
    }

    public void AZI() {
        this.A0A.removeCallbacks(this.A0B);
        Ac1();
        this.A05.Aco(new RunnableRunnableShape15S0100000_I0_14(this, 47));
        this.A05.A09(R.string.str183e, 1);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 21) {
            A36();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str15d8);
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0N(true);
        }
        setContentView((int) R.layout.layout054c);
        this.A05 = (ScrollView) findViewById(R.id.scroll_view);
        this.A04 = (ImageView) findViewById(R.id.logo);
        this.A03 = findViewById(R.id.enable_panel);
        this.A02 = findViewById(R.id.disable_panel_divider);
        this.A01 = findViewById(R.id.disable_panel);
        this.A07 = (TextView) findViewById(R.id.description);
        TextView textView = (TextView) findViewById(R.id.disable_button);
        TextView textView2 = (TextView) findViewById(R.id.change_code_button);
        this.A06 = (TextView) findViewById(R.id.change_email_button);
        findViewById(R.id.enable_button).setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(this, 32));
        textView.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(this, 33));
        textView2.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(this, 35));
        this.A06.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(this, 34));
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            int A002 = C434920f.A00(this, R.attr.attr0451, R.color.color070f);
            AnonymousClass2SR.A09(textView, A002);
            AnonymousClass2SR.A09(textView2, A002);
            AnonymousClass2SR.A09(this.A06, A002);
            if (i2 < 21) {
                return;
            }
        }
        this.A00 = getResources().getDimensionPixelSize(R.dimen.dimen06f3);
        this.A05.getViewTreeObserver().addOnScrollChangedListener(new IDxCListenerShape236S0100000_2_I0(this, 4));
        A36();
    }

    public void onPause() {
        super.onPause();
        List list = this.A08.A0B;
        AnonymousClass00B.A0G(list.contains(this));
        list.remove(this);
    }

    public void onResume() {
        super.onResume();
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            currentFocus.clearFocus();
        }
        List list = this.A08.A0B;
        AnonymousClass00B.A0G(!list.contains(this));
        list.add(this);
        this.A05.Aco(new RunnableRunnableShape15S0100000_I0_14(this, 47));
    }
}

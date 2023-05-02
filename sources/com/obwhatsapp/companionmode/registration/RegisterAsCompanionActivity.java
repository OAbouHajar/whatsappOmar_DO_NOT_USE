package com.obwhatsapp.companionmode.registration;

import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass01V;
import X.AnonymousClass15P;
import X.AnonymousClass1BN;
import X.AnonymousClass1CB;
import X.AnonymousClass1KQ;
import X.AnonymousClass1RE;
import X.AnonymousClass1SS;
import X.AnonymousClass1ZW;
import X.AnonymousClass28A;
import X.AnonymousClass28E;
import X.AnonymousClass2Rf;
import X.AnonymousClass2SR;
import X.C005402i;
import X.C14530pL;
import X.C14710pd;
import X.C14730pf;
import X.C14750ph;
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
import X.C16980tz;
import X.C17250um;
import X.C18260wP;
import X.C19110xm;
import X.C19490yW;
import X.C19590yg;
import X.C19760yx;
import X.C19950zG;
import X.C19980zJ;
import X.C23061Ai;
import X.C23071Aj;
import X.C47132Hs;
import X.C49132Rg;
import X.C56522nn;
import X.C94544l5;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxAListenerShape120S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape6S0100000_I0_5;
import com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2;
import com.obwhatsapp.QrImageView;
import com.obwhatsapp.R;

public class RegisterAsCompanionActivity extends C14530pL {
    public LinearLayout A00;
    public ProgressBar A01;
    public QrImageView A02;
    public C19590yg A03;
    public C15480r5 A04;
    public AnonymousClass1RE A05;
    public AnonymousClass1SS A06;
    public C16980tz A07;
    public AnonymousClass1KQ A08;
    public C19760yx A09;
    public AnonymousClass1BN A0A;
    public boolean A0B;
    public final AnonymousClass28A A0C;

    public RegisterAsCompanionActivity() {
        this(0);
        this.A0C = new AnonymousClass28E(this);
    }

    public RegisterAsCompanionActivity(int i2) {
        this.A0B = false;
        A0T(new IDxAListenerShape120S0100000_2_I0(this, 42));
    }

    public void A1q() {
        if (!this.A0B) {
            this.A0B = true;
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
            this.A07 = (C16980tz) r2.AQB.get();
            this.A0A = (AnonymousClass1BN) r2.AAp.get();
            this.A08 = (AnonymousClass1KQ) r2.AAL.get();
            this.A09 = (C19760yx) r2.AKx.get();
            this.A05 = (AnonymousClass1RE) r2.A4h.get();
            this.A03 = (C19590yg) r2.A4Y.get();
            this.A06 = (AnonymousClass1SS) r2.A4S.get();
            this.A04 = new C15480r5((C19110xm) r1.A0E.get());
        }
    }

    public void onBackPressed() {
        if ("entry_phone_reg".equals(getIntent().getStringExtra("entry_point")) && this.A06.A00() == C47132Hs.PHONE) {
            this.A09.A0A(1);
            this.A0A.A04("register_as_companion", "tapped");
            startActivity(C14750ph.A06(this));
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewGroup viewGroup = (ViewGroup) findViewById(16908290);
        LayoutInflater layoutInflater = getLayoutInflater();
        C47132Hs A002 = this.A06.A00();
        C47132Hs r4 = C47132Hs.PHONE;
        int i2 = R.layout.layout04f5;
        if (A002 == r4) {
            i2 = R.layout.layout04f6;
        }
        layoutInflater.inflate(i2, viewGroup);
        QrImageView qrImageView = (QrImageView) findViewById(R.id.registration_qr);
        this.A02 = qrImageView;
        qrImageView.setVisibility(4);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.reload_qr_layout);
        this.A00 = linearLayout;
        linearLayout.setVisibility(4);
        this.A01 = (ProgressBar) findViewById(R.id.loading_spinner);
        TextView textView = (TextView) findViewById(R.id.companion_registration_linking_instructions_step_two);
        Spanned A012 = AnonymousClass1ZW.A01(getString(R.string.str051c), new Object[0]);
        Drawable A042 = AnonymousClass00T.A04(this, R.drawable.ic_ios_settings);
        AnonymousClass00B.A06(A042);
        CharSequence A013 = C56522nn.A01(textView.getPaint(), AnonymousClass2SR.A06(A042, AnonymousClass00T.A00(this, R.color.color0660)), A012, "[settings_icon]");
        Drawable A043 = AnonymousClass00T.A04(this, R.drawable.vec_ic_more_vertical);
        AnonymousClass00B.A06(A043);
        textView.setText(C56522nn.A01(textView.getPaint(), AnonymousClass2SR.A06(A043, AnonymousClass00T.A00(this, R.color.color0660)), A013, "[overflow_menu_icon]"));
        ((TextView) findViewById(R.id.companion_registration_linking_instructions_step_three)).setText(AnonymousClass1ZW.A01(getString(R.string.str051b), new Object[0]));
        findViewById(R.id.reload_qr_button).setOnClickListener(new ViewOnClickCListenerShape9S0100000_I0_2(this, 13));
        View findViewById = findViewById(R.id.scroll_view);
        if (findViewById != null) {
            Toolbar toolbar = (Toolbar) AnonymousClass00T.A05(this, R.id.title_toolbar);
            ColorDrawable colorDrawable = new ColorDrawable(getResources().getColor(R.color.color065f));
            colorDrawable.setAlpha(0);
            toolbar.setBackground(colorDrawable);
            findViewById.getViewTreeObserver().addOnScrollChangedListener(new C94544l5(colorDrawable, findViewById, toolbar, (int) getTheme().obtainStyledAttributes(new int[]{16843499}).getDimension(0, 0.0f)));
        }
        if (!"entry_eula".equals(getIntent().getStringExtra("entry_point"))) {
            this.A05.A00(2);
        }
        C15480r5 r0 = this.A04;
        ((AnonymousClass1CB) r0.A00.A00(AnonymousClass1CB.class)).A06(this.A0C);
        this.A05.Aco(new RunnableRunnableShape6S0100000_I0_5(this.A04, 41));
        Aem((Toolbar) findViewById(R.id.title_toolbar));
        C005402i x2 = x();
        boolean z2 = false;
        if (this.A06.A00() == r4) {
            z2 = true;
        }
        if (x2 != null) {
            x2.A0N(z2);
            x2.A0Q(z2);
            x2.A0Q(false);
        }
        this.A0A.A02("register_as_companion");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        int i2;
        int i3;
        if (this.A06.A00() != C47132Hs.PHONE) {
            menu.add(0, 0, 0, R.string.str13df);
            if (this.A03.A06()) {
                i2 = 1;
                i3 = R.string.str1733;
            }
            return super.onCreateOptionsMenu(menu);
        }
        i2 = 2;
        i3 = R.string.str13dd;
        menu.add(0, i2, 0, i3);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        C15480r5 r0 = this.A04;
        Class<AnonymousClass1CB> cls = AnonymousClass1CB.class;
        ((AnonymousClass1CB) r0.A00.A00(cls)).A07(this.A0C);
        ((AnonymousClass1CB) this.A04.A00.A00(cls)).A05();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            this.A08.A01(this, "RegisterAsCompanionActivity");
        } else if (itemId == 1) {
            if (this.A06.A00() != C47132Hs.PHONE) {
                this.A05.A00(1);
            }
            this.A09.A0A(1);
            this.A0A.A04("register_as_companion", "tapped");
            startActivity(C14750ph.A06(this));
            finish();
        } else if (itemId == 2) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://faq.whatsapp.com/1317564962315842")));
        } else if (itemId == 16908332) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }
}

package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass176;
import X.AnonymousClass1TV;
import X.AnonymousClass1Vo;
import X.AnonymousClass22U;
import X.AnonymousClass2HJ;
import X.AnonymousClass2HK;
import X.AnonymousClass2T3;
import X.AnonymousClass4XO;
import X.AnonymousClass5ko;
import X.AnonymousClass5vV;
import X.AnonymousClass61W;
import X.AnonymousClass64L;
import X.AnonymousClass64M;
import X.AnonymousClass64N;
import X.C005402i;
import X.C110105dW;
import X.C110115dX;
import X.C111345g2;
import X.C113285ln;
import X.C119265wo;
import X.C1200960h;
import X.C1210063v;
import X.C13680ns;
import X.C13700nu;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C17110uY;
import X.C30531cW;
import X.C32241fu;
import X.C35281lf;
import X.C40031tS;
import X.C49132Rg;
import X.C53842gO;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape33S0200000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

public class IndiaUpiPaymentsTosActivity extends AnonymousClass5ko implements AnonymousClass1TV {
    public C40031tS A00;
    public AnonymousClass5vV A01;
    public C1200960h A02;
    public C113285ln A03;
    public C17110uY A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final C53842gO A08;
    public final AnonymousClass1Vo A09;

    public IndiaUpiPaymentsTosActivity() {
        this(0);
        this.A00 = AnonymousClass176.A05;
        this.A05 = false;
        this.A07 = false;
        this.A08 = new C53842gO();
        this.A09 = C110115dX.A0S("IndiaUpiPaymentsTosActivity");
    }

    public IndiaUpiPaymentsTosActivity(int i2) {
        this.A06 = false;
        C110105dW.A0t(this, 65);
    }

    public void A1q() {
        if (!this.A06) {
            this.A06 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            C111345g2.A1k(A0C, r1, this, C111345g2.A1e(r1, this));
            C111345g2.A1q(r1, this);
            this.A04 = C16150sX.A1A(r1);
            this.A01 = (AnonymousClass5vV) r1.AHW.get();
            this.A02 = (C1200960h) r1.ACB.get();
            this.A03 = (C113285ln) r1.ACF.get();
        }
    }

    public final void A3S(int i2) {
        C111345g2.A1z(this.A03, 3);
        this.A0E.reset();
        this.A01.A01();
        this.A09.A0A("showErrorAndFinish", (Throwable) null);
        findViewById(R.id.progress).setVisibility(4);
        C119265wo A042 = this.A02.A04((AnonymousClass4XO) null, i2);
        if (A042.A00 != 0) {
            String A012 = A042.A01(this);
            AnonymousClass2T3 r0 = new AnonymousClass2T3();
            r0.A08 = A012;
            r0.A00().A1G(AGM(), (String) null);
            return;
        }
        Afg(R.string.str110a);
    }

    public final void A3T(String str) {
        C53842gO r1;
        int i2;
        boolean equals = "https://www.whatsapp.com/legal/payments/india/terms".equals(str);
        Integer A0Y = C13680ns.A0Y();
        if (equals || "https://www.whatsapp.com/legal/payments/india/privacy-policy".equals(str)) {
            r1 = this.A08;
            i2 = 20;
        } else if ("https://www.whatsapp.com/legal/payments/india/psp".equals(str)) {
            r1 = this.A08;
            i2 = 31;
        } else {
            return;
        }
        r1.A07 = Integer.valueOf(i2);
        r1.A08 = A0Y;
        C111345g2.A1s(r1, this);
    }

    public void AWC(AnonymousClass2HJ r4) {
        AnonymousClass1Vo r2 = this.A09;
        StringBuilder A0r = AnonymousClass000.A0r("got request error for accept-tos: ");
        A0r.append(r4.A00);
        C110105dW.A1L(r2, A0r);
        A3S(r4.A00);
    }

    public void AWI(AnonymousClass2HJ r4) {
        AnonymousClass1Vo r2 = this.A09;
        StringBuilder A0r = AnonymousClass000.A0r("got response error for accept-tos: ");
        A0r.append(r4.A00);
        C110105dW.A1L(r2, A0r);
        A3S(r4.A00);
    }

    public void AWJ(AnonymousClass2HK r5) {
        AnonymousClass1Vo r2 = this.A09;
        StringBuilder A0r = AnonymousClass000.A0r("got response for accept-tos: ");
        A0r.append(r5.A02);
        C110105dW.A1L(r2, A0r);
        if (!C110115dX.A17(this.A0D.A01(), "payment_usync_triggered")) {
            this.A05.Acl(new C1210063v(this.A06));
            C13680ns.A0z(C110105dW.A06(this.A0D), "payment_usync_triggered", true);
        }
        if (!this.A00.A03.equals("tos_no_wallet")) {
            return;
        }
        if (r5.A00) {
            C111345g2.A1z(this.A03, 3);
            C32241fu A002 = C32241fu.A00(this);
            A002.A01(R.string.str110b);
            C110105dW.A0w(A002, this, 47, R.string.str0e87);
            A002.A00();
            return;
        }
        C35281lf A022 = this.A0D.A02();
        if (A022 != null) {
            String str = A022.A02;
            if (!TextUtils.isEmpty(str) && str.startsWith("tos_upgrade_step_up")) {
                this.A0D.A08();
            }
        }
        this.A0I.A08(this.A00);
        setResult(-1);
        if (this.A05) {
            Intent A042 = C110105dW.A04(this, IndiaUpiPaymentsAccountSetupActivity.class);
            A3M(A042);
            A042.putExtra("extra_previous_screen", "tos_page");
            AnonymousClass22U.A00(A042, "tosAccept");
            A2X(A042, true);
            return;
        }
        finish();
    }

    public void onBackPressed() {
        if (this.A07) {
            setResult(0);
            finish();
            return;
        }
        super.onBackPressed();
        C53842gO r1 = this.A08;
        r1.A07 = C13680ns.A0a();
        r1.A08 = C13680ns.A0Y();
        C111345g2.A1s(r1, this);
        C111345g2.A1z(this.A03, 4);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        View findViewById = findViewById(R.id.hero_img);
        int i2 = 0;
        if (configuration.orientation == 2) {
            i2 = 8;
        }
        findViewById.setVisibility(i2);
    }

    public void onCreate(Bundle bundle) {
        C53842gO r3;
        Boolean bool;
        super.onCreate(bundle);
        if (getIntent() != null) {
            String stringExtra = getIntent().getStringExtra("stepName");
            if (!TextUtils.isEmpty(stringExtra)) {
                this.A00 = this.A0I.A01(stringExtra);
                this.A05 = true;
            } else {
                this.A00 = this.A0I.A01("tos_no_wallet");
            }
            this.A03 = getIntent().getIntExtra("extra_setup_mode", 1);
        }
        setContentView((int) R.layout.layout0339);
        A3L(R.string.str0fdf, R.color.color069a, R.id.scroll_view);
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0B(R.string.str0fdf);
            x2.A0N(true);
        }
        TextView A0N = C13680ns.A0N(this, R.id.title);
        if (getIntent() == null || !getIntent().getBooleanExtra("extra_show_updated_tos", false)) {
            A0N.setText(R.string.str110c);
            r3 = this.A08;
            bool = Boolean.FALSE;
        } else {
            this.A07 = true;
            A0N.setText(R.string.str110e);
            r3 = this.A08;
            bool = Boolean.TRUE;
        }
        r3.A01 = bool;
        C110105dW.A0r(findViewById(R.id.learn_more), this, 66);
        String[] strArr = new String[3];
        C110105dW.A1E(this.A02, "https://www.whatsapp.com/legal/payments/india/terms", strArr, 0);
        C110105dW.A1E(this.A02, "https://www.whatsapp.com/legal/payments/india/privacy-policy", strArr, 1);
        C110105dW.A1E(this.A02, "https://www.whatsapp.com/legal/payments/india/psp", strArr, 2);
        Runnable[] runnableArr = {new AnonymousClass64N(this), new AnonymousClass64L(this), new AnonymousClass64M(this)};
        C30531cW.A04((TextEmojiLabel) findViewById(R.id.payments_tos_desc), this.A08, this.A04.A05(getString(R.string.str1106), runnableArr, new String[]{"terms", "privacy-policy", "payment-provider-terms"}, strArr));
        View findViewById = findViewById(R.id.payments_tos_continue);
        findViewById.setOnClickListener(new IDxCListenerShape33S0200000_3_I1(findViewById, 14, this));
        AnonymousClass1Vo r2 = this.A09;
        StringBuilder A0r = AnonymousClass000.A0r("onCreate step: ");
        A0r.append(this.A00);
        C110105dW.A1L(r2, A0r);
        AnonymousClass61W r1 = this.A0E;
        r1.reset();
        r3.A0a = "tos_page";
        C110115dX.A10(r3, 0);
        r3.A0X = this.A0L;
        r1.AKR(r3);
        if (C110115dX.A18(this.A0C)) {
            this.A0X = C110105dW.A0R(this);
        }
        onConfigurationChanged(C13700nu.A03(this));
        this.A0D.A09();
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0P.A07(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            C53842gO r1 = this.A08;
            r1.A07 = C13680ns.A0a();
            r1.A08 = C13680ns.A0Y();
            C111345g2.A1s(r1, this);
            C111345g2.A1z(this.A03, 4);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A07 = bundle.getBoolean("extra_show_updated_tos");
    }

    public void onResume() {
        super.onResume();
        this.A03.A00.A09("tosShown");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("extra_show_updated_tos", this.A07);
    }
}

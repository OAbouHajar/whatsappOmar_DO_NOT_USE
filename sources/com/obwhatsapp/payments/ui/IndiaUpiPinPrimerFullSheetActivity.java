package com.obwhatsapp.payments.ui;

import X.AnonymousClass01V;
import X.AnonymousClass2St;
import X.AnonymousClass5ko;
import X.AnonymousClass64P;
import X.C005402i;
import X.C110105dW;
import X.C110115dX;
import X.C111345g2;
import X.C111805hR;
import X.C119405xi;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14870pt;
import X.C16150sX;
import X.C19980zJ;
import X.C32241fu;
import X.C35521m4;
import X.C45922Bq;
import X.C49132Rg;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;

public class IndiaUpiPinPrimerFullSheetActivity extends AnonymousClass5ko {
    public C35521m4 A00;
    public String A01;
    public boolean A02;

    public IndiaUpiPinPrimerFullSheetActivity() {
        this(0);
        this.A01 = "setup_pin";
    }

    public IndiaUpiPinPrimerFullSheetActivity(int i2) {
        this.A02 = false;
        C110105dW.A0t(this, 69);
    }

    public static Intent A02(Context context, C35521m4 r3, boolean z2) {
        Intent A04 = C110105dW.A04(context, IndiaUpiPinPrimerFullSheetActivity.class);
        C110115dX.A0o(A04, r3);
        A04.putExtra("event_screen", z2 ? "forgot_pin" : "setup_pin");
        return A04;
    }

    public void A1q() {
        if (!this.A02) {
            this.A02 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            C111345g2.A1k(A0C, r1, this, C111345g2.A1e(r1, this));
            C111345g2.A1q(r1, this);
        }
    }

    public final void A3S() {
        C111805hR r5 = (C111805hR) this.A00.A08;
        View A0p = C111345g2.A0p(this);
        C111345g2.A1h(A0p, this.A00);
        C13680ns.A0L(A0p, R.id.account_number).setText(C119405xi.A05(this, this.A00, this.A0P, false));
        C13680ns.A0L(A0p, R.id.account_name).setText((CharSequence) C110105dW.A0d(r5.A03));
        C13680ns.A0L(A0p, R.id.account_type).setText(r5.A0C());
        C14870pt r9 = this.A05;
        C19980zJ r8 = this.A00;
        AnonymousClass01V r11 = this.A08;
        String A0d = C13680ns.A0d(this, "learn-more", C13680ns.A1b(), 0, R.string.str1177);
        C45922Bq.A08(this, Uri.parse("https://faq.whatsapp.com/general/payments/about-payments-data"), r8, r9, (TextEmojiLabel) findViewById(R.id.note), r11, A0d);
        C110105dW.A0r(findViewById(R.id.continue_button), this, 71);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        Class cls;
        if (i2 != 1012) {
            super.onActivityResult(i2, i3, intent);
        } else if (i3 == -1) {
            if (intent != null && intent.hasExtra("extra_bank_account")) {
                C35521m4 r0 = (C35521m4) intent.getParcelableExtra("extra_bank_account");
                this.A00 = r0;
                this.A04 = r0;
            }
            switch (this.A02) {
                case 0:
                    Intent A09 = C13680ns.A09();
                    A09.putExtra("extra_bank_account", this.A00);
                    setResult(-1, A09);
                    finish();
                    return;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 11:
                    if (this.A0S) {
                        A3H();
                        cls = IndiaUpiPaymentsAccountSetupActivity.class;
                    } else {
                        cls = IndiaUpiBankAccountAddedLandingActivity.class;
                    }
                    Intent A04 = C110105dW.A04(this, cls);
                    C110115dX.A0r(A04, this.A01);
                    A3M(A04);
                    C110115dX.A0p(A04, this, "extra_previous_screen", "enter_debit_card");
                    return;
                default:
                    return;
            }
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.A0E.A07((AnonymousClass2St) null, C13680ns.A0Y(), C13680ns.A0a(), this.A0L, this.A01, this.A0O);
    }

    public void onCreate(Bundle bundle) {
        getWindow().addFlags(8192);
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0342);
        String stringExtra = getIntent().getStringExtra("event_screen");
        if (!TextUtils.isEmpty(stringExtra)) {
            this.A01 = stringExtra;
        }
        if (this.A01.equals("forgot_pin")) {
            C13680ns.A0N(this, R.id.title).setText(R.string.str102d);
            C13680ns.A0N(this, R.id.desc).setText(R.string.str102c);
        }
        this.A00 = (C35521m4) getIntent().getParcelableExtra("extra_bank_account");
        C005402i A0r = C111345g2.A0r(this);
        if (A0r != null) {
            C110105dW.A0u(A0r, R.string.str0fdf);
        }
        C35521m4 r0 = this.A00;
        if (r0 == null || r0.A08 == null) {
            Log.w("Screen called without account, fetching account from local db to setup pin");
            this.A05.Acl(new AnonymousClass64P(this));
        } else {
            A3S();
        }
        this.A0E.A07((AnonymousClass2St) null, C13680ns.A0X(), (Integer) null, this.A0L, this.A01, this.A0O);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        A3N(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_help) {
            String str = this.A01;
            C32241fu A002 = C32241fu.A00(this);
            A002.A01(R.string.str05af);
            A3O(A002, str);
            return true;
        }
        if (menuItem.getItemId() == 16908332) {
            this.A0E.A07((AnonymousClass2St) null, 1, C13680ns.A0a(), this.A0L, this.A01, this.A0O);
        }
        return super.onOptionsItemSelected(menuItem);
    }
}

package com.obwhatsapp.payments.ui;

import X.AnonymousClass013;
import X.AnonymousClass04o;
import X.AnonymousClass1N6;
import X.AnonymousClass29T;
import X.AnonymousClass5ko;
import X.AnonymousClass5x5;
import X.AnonymousClass5xE;
import X.C001500q;
import X.C006602z;
import X.C110105dW;
import X.C110115dX;
import X.C110705eh;
import X.C111345g2;
import X.C117675tN;
import X.C118055tz;
import X.C1204661t;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C32241fu;
import X.C49132Rg;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.util.Linkify;
import com.facebook.redex.IDxDListenerShape160S0100000_3_I1;
import com.facebook.redex.IDxIFactoryShape0S2100000_3_I1;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.R;

public class IndiaUpiQrCodeUrlValidationActivity extends AnonymousClass5ko {
    public AnonymousClass013 A00;
    public C1204661t A01;
    public C118055tz A02;
    public AnonymousClass5xE A03;
    public C117675tN A04;
    public AnonymousClass5x5 A05;
    public C110705eh A06;
    public AnonymousClass1N6 A07;
    public String A08;
    public boolean A09;

    public IndiaUpiQrCodeUrlValidationActivity() {
        this(0);
    }

    public IndiaUpiQrCodeUrlValidationActivity(int i2) {
        this.A09 = false;
        C110105dW.A0t(this, 75);
    }

    public void A1q() {
        if (!this.A09) {
            this.A09 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            C111345g2.A1k(A0C, r1, this, C111345g2.A1e(r1, this));
            C111345g2.A1q(r1, this);
            this.A05 = (AnonymousClass5x5) r1.ACN.get();
            this.A00 = C16150sX.A0Z(r1);
            this.A07 = (AnonymousClass1N6) r1.A8V.get();
            this.A01 = C110115dX.A0J(r1);
            this.A04 = (C117675tN) r1.AC7.get();
            this.A03 = C16150sX.A0z(r1);
            this.A02 = A0C.A0O();
        }
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 100) {
            AnonymousClass29T.A01(this, 25);
        } else {
            super.onActivityResult(i2, i3, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A06 = (C110705eh) new C006602z((AnonymousClass04o) new IDxIFactoryShape0S2100000_3_I1(this, getIntent().getStringExtra("ARG_URL"), getIntent().getStringExtra("external_payment_source"), 1), (C001500q) this).A01(C110705eh.class);
    }

    public Dialog onCreateDialog(int i2) {
        C32241fu r4;
        int i3;
        int i4;
        if (i2 == 21) {
            r4 = C32241fu.A00(this);
            r4.A06(C13680ns.A0d(this, getString(R.string.str0b6e), new Object[1], 0, R.string.str0f5d));
            i3 = R.string.str0e87;
            i4 = 54;
        } else if (i2 == 22) {
            r4 = C32241fu.A00(this);
            r4.A06(C13680ns.A0d(this, getString(R.string.str0b6e), new Object[1], 0, R.string.str187e));
            i3 = R.string.str0e87;
            i4 = 61;
        } else if (i2 == 40) {
            r4 = C32241fu.A00(this);
            r4.A06(C13680ns.A0d(this, this.A08, new Object[1], 0, R.string.str1084));
            i3 = R.string.str0e87;
            i4 = 60;
        } else if (i2 != 41) {
            switch (i2) {
                case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                    r4 = C32241fu.A00(this);
                    r4.A02(R.string.str1087);
                    r4.A01(R.string.str1086);
                    C110105dW.A0w(r4, this, 57, R.string.str1085);
                    C110105dW.A0v(r4, this, 58, R.string.str0394);
                    r4.A07(true);
                    break;
                case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                    Uri parse = Uri.parse(this.A06.A05().A0F);
                    String string = getString(R.string.str18d1);
                    SpannableString spannableString = new SpannableString(AnonymousClass1N6.A00(parse.toString()));
                    Linkify.addLinks(spannableString, 1);
                    r4 = new C32241fu(this, R.style.style0009);
                    r4.setTitle(string);
                    r4.A06(spannableString);
                    C110105dW.A0v(r4, this, 56, R.string.str10c7);
                    C110105dW.A0w(r4, this, 55, R.string.str18d0);
                    r4.A07(true);
                    r4.A0C(new IDxDListenerShape160S0100000_3_I1(this, 18));
                    break;
                case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                    r4 = C32241fu.A00(this);
                    r4.A06(C13680ns.A0d(this, this.A08, new Object[1], 0, R.string.str1083));
                    i3 = R.string.str0e87;
                    i4 = 59;
                    break;
                default:
                    return super.onCreateDialog(i2);
            }
        } else {
            r4 = C32241fu.A00(this);
            r4.A06(C13680ns.A0d(this, this.A08, new Object[1], 0, R.string.str1082));
            i3 = R.string.str0e87;
            i4 = 62;
        }
        C110105dW.A0w(r4, this, i4, i3);
        r4.A07(false);
        return r4.create();
    }
}

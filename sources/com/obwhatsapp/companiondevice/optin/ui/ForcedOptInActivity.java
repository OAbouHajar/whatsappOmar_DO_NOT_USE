package com.obwhatsapp.companiondevice.optin.ui;

import X.AnonymousClass00T;
import X.AnonymousClass01V;
import X.AnonymousClass04o;
import X.AnonymousClass16S;
import X.AnonymousClass1DO;
import X.C001500q;
import X.C005402i;
import X.C006602z;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C14870pt;
import X.C16150sX;
import X.C16320sq;
import X.C17220uj;
import X.C19980zJ;
import X.C45922Bq;
import X.C49132Rg;
import X.C57282qe;
import X.C95304mQ;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import com.facebook.redex.IDxCListenerShape237S0100000_2_I1;
import com.facebook.redex.IDxLListenerShape145S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.components.Button;

public class ForcedOptInActivity extends C14530pL {
    public ProgressDialog A00;
    public View A01;
    public ScrollView A02;
    public TextEmojiLabel A03;
    public AnonymousClass1DO A04;
    public C57282qe A05;
    public Button A06;
    public AnonymousClass16S A07;
    public C17220uj A08;
    public boolean A09;

    public ForcedOptInActivity() {
        this(0);
    }

    public ForcedOptInActivity(int i2) {
        this.A09 = false;
        C13680ns.A1G(this, 44);
    }

    public void A1q() {
        if (!this.A09) {
            this.A09 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A08 = C16150sX.A18(r1);
            this.A07 = (AnonymousClass16S) r1.AFt.get();
            this.A04 = (AnonymousClass1DO) r1.AFv.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0291);
        C005402i A0s = C14550pN.A0s(this, R.id.title_toolbar);
        A0s.A0B(R.string.str0ccd);
        A0s.A0N(true);
        this.A02 = (ScrollView) AnonymousClass00T.A05(this, R.id.scroll_view);
        this.A01 = AnonymousClass00T.A05(this, R.id.update_sheet_shadow);
        this.A03 = (TextEmojiLabel) AnonymousClass00T.A05(this, R.id.improvement_description);
        this.A06 = (Button) AnonymousClass00T.A05(this, R.id.update_button);
        C14870pt r6 = this.A05;
        C16320sq r10 = this.A05;
        this.A05 = (C57282qe) new C006602z((AnonymousClass04o) new C95304mQ(r6, this.A04, this.A07, this.A09, r10), (C001500q) this).A01(C57282qe.class);
        C14870pt r7 = this.A05;
        C19980zJ r62 = this.A00;
        AnonymousClass01V r9 = this.A08;
        C45922Bq.A08(this, this.A08.A05("download-and-installation", "about-linked-devices"), r62, r7, this.A03, r9, C13680ns.A0d(this, "learn-more", new Object[1], 0, R.string.str0cca));
        this.A02.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape145S0100000_2_I1(this, 3));
        this.A02.getViewTreeObserver().addOnScrollChangedListener(new IDxCListenerShape237S0100000_2_I1(this, 2));
        C13680ns.A17(this.A06, this, 12);
        C13680ns.A1L(this, this.A05.A02, 73);
        C13680ns.A1L(this, this.A05.A06, 71);
        C13680ns.A1L(this, this.A05.A07, 72);
        C13680ns.A1L(this, this.A05.A01, 74);
    }
}

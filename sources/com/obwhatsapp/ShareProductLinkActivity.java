package com.obwhatsapp;

import X.AnonymousClass00B;
import X.AnonymousClass1ZT;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C17170ue;
import X.C24561Gk;
import X.C45822Bg;
import X.C49132Rg;
import X.C70483h0;
import X.C70493h1;
import X.C70503h2;
import android.os.Bundle;
import android.widget.TextView;
import com.facebook.redex.IDxLListenerShape3S1200000_2_I1;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public class ShareProductLinkActivity extends C45822Bg {
    public C17170ue A00;
    public boolean A01;

    public ShareProductLinkActivity() {
        this(0);
    }

    public ShareProductLinkActivity(int i2) {
        this.A01 = false;
        C13680ns.A1G(this, 3);
    }

    public void A1q() {
        if (!this.A01) {
            this.A01 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A00 = C16150sX.A0A(r1);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        A39();
        UserJid A0O = C14530pL.A0O(getIntent(), "jid");
        if (!(A0O instanceof AnonymousClass1ZT)) {
            Log.e("share-product-link-activity/invalid-jid");
            finish();
            return;
        }
        String stringExtra = getIntent().getStringExtra("product_id");
        AnonymousClass00B.A06(stringExtra);
        String format = String.format("%s/p/%s/%s", new Object[]{"https://wa.me", stringExtra, C24561Gk.A03(A0O)});
        setTitle(R.string.str1318);
        TextView textView = this.A02;
        if (textView != null) {
            textView.setText(format);
        }
        C13680ns.A0N(this, R.id.share_link_description).setText(R.string.str1314);
        String A0d = this.A01.A0I(A0O) ? C13680ns.A0d(this, format, new Object[1], 0, R.string.str1316) : format;
        C70493h1 A38 = A38();
        A38.A00 = A0d;
        A38.A01 = new IDxLListenerShape3S1200000_2_I1(this, A0O, stringExtra, 2);
        C70483h0 A36 = A36();
        A36.A00 = format;
        A36.A01 = new IDxLListenerShape3S1200000_2_I1(this, A0O, stringExtra, 0);
        C70503h2 A37 = A37();
        A37.A02 = A0d;
        A37.A00 = getString(R.string.str15f0);
        A37.A01 = getString(R.string.str1315);
        A37.A01 = new IDxLListenerShape3S1200000_2_I1(this, A0O, stringExtra, 1);
    }
}

package com.obwhatsapp.qrcode.contactqr;

import X.AnonymousClass156;
import X.AnonymousClass1A9;
import X.AnonymousClass1G1;
import X.AnonymousClass341;
import X.C13680ns;
import X.C13700nu;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C14650pX;
import X.C15800rs;
import X.C16150sX;
import X.C18290wS;
import X.C19820z3;
import X.C208811y;
import X.C226818w;
import X.C23101Am;
import X.C23181Au;
import X.C23201Aw;
import X.C24961Hy;
import X.C49132Rg;
import android.view.Menu;
import android.view.MenuItem;
import com.facebook.redex.IDxCListenerShape238S0100000_2_I1;
import com.obwhatsapp.R;

public class ContactQrActivity extends AnonymousClass341 implements C14650pX {
    public boolean A00;

    public ContactQrActivity() {
        this(0);
    }

    public ContactQrActivity(int i2) {
        this.A00 = false;
        C13680ns.A1G(this, 105);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A0L = C16150sX.A0m(r1);
            this.A03 = (C23101Am) r1.A0N.get();
            this.A06 = C16150sX.A03(r1);
            this.A0A = C16150sX.A0M(r1);
            this.A0U = (AnonymousClass1A9) r1.AE7.get();
            this.A0D = C16150sX.A0Q(r1);
            this.A05 = (C208811y) r1.A6K.get();
            this.A0O = (C18290wS) r1.AIB.get();
            this.A0E = (C23181Au) r1.A53.get();
            this.A04 = (AnonymousClass1G1) r1.AJl.get();
            this.A0M = C16150sX.A0t(r1);
            this.A0I = C16150sX.A0Z(r1);
            this.A0K = (C226818w) r1.A6A.get();
            this.A0C = C16150sX.A0P(r1);
            this.A0H = C16150sX.A0X(r1);
            this.A0F = (C15800rs) r1.A5c.get();
            this.A0V = (C23201Aw) r1.AK6.get();
            this.A0N = C16150sX.A10(r1);
            this.A09 = C16150sX.A0D(r1);
            this.A0B = (AnonymousClass156) r1.ADH.get();
            this.A0J = (C19820z3) r1.A7p.get();
            this.A08 = (C24961Hy) r1.A2l.get();
            this.A0G = C16150sX.A0W(r1);
        }
    }

    public void A35() {
        super.A35();
        if (getResources().getBoolean(R.bool.notification_large_icon_width)) {
            setRequestedOrientation(1);
        }
        this.A0W = C13700nu.A0E(C13680ns.A0B(this.A09), "contact_qr_code");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C14530pL.A0U(this, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_contactqr_share) {
            A36();
            return true;
        } else if (menuItem.getItemId() != R.id.menuitem_contactqr_revoke) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            A2d(new IDxCListenerShape238S0100000_2_I1(this, 6), new IDxCListenerShape238S0100000_2_I1(this, 5), R.string.str0580, R.string.str057e, R.string.str057d, R.string.str057b);
            return true;
        }
    }
}

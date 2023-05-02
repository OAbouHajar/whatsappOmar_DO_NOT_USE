package com.obwhatsapp.conversationslist;

import X.AnonymousClass00F;
import X.AnonymousClass01S;
import X.AnonymousClass050;
import X.AnonymousClass05J;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C15860rz;
import X.C16150sX;
import X.C16320sq;
import X.C17290uq;
import X.C434920f;
import X.C49132Rg;
import android.os.Bundle;
import android.view.MenuItem;
import com.facebook.redex.RunnableRunnableShape5S0200000_I0_3;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;

public class ArchivedConversationsActivity extends C14530pL {
    public C17290uq A00;
    public boolean A01;

    public ArchivedConversationsActivity() {
        this(0);
    }

    public ArchivedConversationsActivity(int i2) {
        this.A01 = false;
        C13680ns.A1G(this, 58);
    }

    public void A1q() {
        if (!this.A01) {
            this.A01 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A00 = (C17290uq) r1.ALI.get();
        }
    }

    public AnonymousClass00F AFf() {
        return AnonymousClass01S.A02;
    }

    public void AYX(AnonymousClass05J r2) {
        super.AYX(r2);
        C434920f.A03(this, R.color.color064b);
    }

    public void AYY(AnonymousClass05J r2) {
        super.AYY(r2);
        C434920f.A03(this, R.color.right_side);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean A1b = this.A09.A1b();
        int i2 = R.string.str0103;
        if (A1b) {
            i2 = R.string.str0108;
        }
        setTitle(i2);
        x().A0N(true);
        setContentView((int) R.layout.layout0075);
        yo.ArchivedChats(this);
        if (bundle == null) {
            AnonymousClass050 A0O = C13680ns.A0O(this);
            A0O.A09(new ArchivedConversationsFragment(), R.id.container);
            A0O.A01();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }

    public void onPause() {
        super.onPause();
        C16320sq r4 = this.A05;
        C17290uq r3 = this.A00;
        C15860rz r2 = this.A09;
        if (r2.A1b() && !r2.A1c()) {
            r4.Acl(new RunnableRunnableShape5S0200000_I0_3(r2, 35, r3));
        }
    }
}

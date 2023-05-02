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
import X.C17290uq;
import X.C434920f;
import X.C49132Rg;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;

public class GpConversationsActivity extends C14530pL {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f149a = 0;
    public C17290uq A00;
    public boolean A01;

    public GpConversationsActivity() {
        this(0);
    }

    public GpConversationsActivity(int i2) {
        this.A01 = false;
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

    /* access modifiers changed from: protected */
    public void onActivityResult(int i2, int i3, Intent intent) {
        yo.Home_onActivityResult(i2, i3, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C15860rz r0 = this.A09;
        x().A0N(true);
        setContentView((int) R.layout.layout0075);
        if (bundle == null) {
            AnonymousClass050 A0O = C13680ns.A0O(this);
            A0O.A09(new GpConversationsFragment(), R.id.container);
            A0O.A01();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        onBackPressed();
        return true;
    }

    public void onPause() {
        super.onPause();
    }
}

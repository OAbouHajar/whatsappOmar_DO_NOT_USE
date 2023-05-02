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
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import com.obwhatsapp.HomeActivity;
import com.obwhatsapp.R;
import com.obwhatsapp.service.YoHiddenService;
import com.obwhatsapp.yo.shp;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;

public class HiddenConversationsActivity extends C14530pL {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f150a = 0;
    public C17290uq A00;
    public boolean A01;

    public HiddenConversationsActivity() {
        this(0);
    }

    public HiddenConversationsActivity(int i2) {
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

    public void onBackPressed() {
        super.onBackPressed();
        if (yo.Homeac != null) {
            yo.Homeac.finish();
            startActivity(new Intent(yo.getCtx(), HomeActivity.class));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C15860rz r0 = this.A09;
        x().A0N(true);
        setContentView((int) R.layout.layout0075);
        yo.HiActv(this);
        if (bundle == null) {
            AnonymousClass050 A0O = C13680ns.A0O(this);
            A0O.A09(new HiddenConversationsFragment(), R.id.container);
            A0O.A01();
        }
        shp.setBooleanPriv(yo.hideJidCode + "_notifC", false);
        YoHiddenService.A01(yo.getCtx());
        try {
            Drawable drawableByName = yo.getDrawableByName("ic_back_gray");
            drawableByName.setColorFilter(yo.mainpagercolor(), PorterDuff.Mode.SRC_ATOP);
            x().A0E(drawableByName);
        } catch (Exception unused) {
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuItem add = menu.add(yo.getString("settings_security"));
        add.setIcon(yo.getID("yo_ic_key", "drawable")).setOnMenuItemClickListener(new a(this, 0)).setShowAsAction(2);
        MenuItem add2 = menu.add(yo.getString("menuitem_settings"));
        add2.setIcon(yo.getID("yo_ic_settings", "drawable")).setOnMenuItemClickListener(new a(this, 1)).setShowAsAction(2);
        others.menuItemColor(add2);
        others.menuItemColor(add);
        return true;
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

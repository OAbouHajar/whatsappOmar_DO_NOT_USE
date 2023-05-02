package com.obwhatsapp.contextualhelp;

import X.AnonymousClass2SR;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C49132Rg;
import android.view.Menu;
import android.view.MenuItem;
import com.obwhatsapp.R;
import com.obwhatsapp.WaInAppBrowsingActivity;

public class ContextualHelpActivity extends WaInAppBrowsingActivity {
    public boolean A00;

    public ContextualHelpActivity() {
        this(0);
    }

    public ContextualHelpActivity(int i2) {
        this.A00 = false;
        C13680ns.A1G(this, 52);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            C14530pL.A0f(r1, this);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu000a, menu);
        MenuItem findItem = menu.findItem(R.id.menu_more);
        findItem.setIcon(AnonymousClass2SR.A06(findItem.getIcon(), getResources().getColor(R.color.color01bd)));
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_open_in_browser) {
            return false;
        }
        startActivity(C13680ns.A0A(getIntent().getStringExtra("webview_url")));
        return true;
    }
}

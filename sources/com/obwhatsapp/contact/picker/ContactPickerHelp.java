package com.obwhatsapp.contact.picker;

import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C49132Rg;
import android.os.Bundle;
import android.view.MenuItem;
import com.facebook.redex.RunnableRunnableShape17S0100000_I1;
import com.obwhatsapp.R;

public class ContactPickerHelp extends C14530pL {
    public boolean A00;

    public ContactPickerHelp() {
        this(0);
    }

    public ContactPickerHelp(int i2) {
        this.A00 = false;
        C13680ns.A1G(this, 48);
    }

    public void A1q() {
        if (!this.A00) {
            this.A00 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str05a5);
        C14530pL.A0Y(this);
        setContentView((int) R.layout.layout013f);
        findViewById(R.id.scroll_view).post(new RunnableRunnableShape17S0100000_I1((Object) this, 49));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        finish();
        return true;
    }
}

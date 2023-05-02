package com.facebook.redex;

import X.C32501gU;
import X.C45692Af;
import android.view.MenuItem;
import com.obwhatsapp.contact.picker.ContactPickerFragment;

public class IDxEListenerShape269S0100000_2_I0 implements MenuItem.OnActionExpandListener {
    public Object A00;
    public final int A01;

    public IDxEListenerShape269S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                C32501gU r1 = (C32501gU) obj;
                r1.A0H = null;
                C32501gU.A02(r1);
                return true;
            case 1:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) obj;
                contactPickerFragment.A2J = null;
                contactPickerFragment.A1N();
                return true;
            default:
                ((C45692Af) obj).A0P = null;
                return true;
        }
    }

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        return true;
    }
}

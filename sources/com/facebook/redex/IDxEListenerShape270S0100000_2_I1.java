package com.facebook.redex;

import X.AnonymousClass3OK;
import X.C000900k;
import android.view.MenuItem;
import com.obwhatsapp.R;
import com.obwhatsapp.contact.picker.PhoneContactsSelector;
import com.obwhatsapp.documentpicker.DocumentPickerActivity;
import com.obwhatsapp.gallery.MediaGalleryActivity;

public class IDxEListenerShape270S0100000_2_I1 implements MenuItem.OnActionExpandListener {
    public Object A00;
    public final int A01;

    public IDxEListenerShape270S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public boolean onMenuItemActionCollapse(MenuItem menuItem) {
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                PhoneContactsSelector phoneContactsSelector = (PhoneContactsSelector) obj;
                phoneContactsSelector.A0U = null;
                PhoneContactsSelector.A03(phoneContactsSelector);
                return true;
            case 1:
                DocumentPickerActivity documentPickerActivity = (DocumentPickerActivity) obj;
                documentPickerActivity.A0H = null;
                DocumentPickerActivity.A02(documentPickerActivity);
                return true;
            default:
                MediaGalleryActivity mediaGalleryActivity = (MediaGalleryActivity) obj;
                mediaGalleryActivity.A0q = null;
                ((AnonymousClass3OK) mediaGalleryActivity.findViewById(R.id.toolbar).getLayoutParams()).A00 = 21;
                return true;
        }
    }

    public boolean onMenuItemActionExpand(MenuItem menuItem) {
        if (2 - this.A01 != 0) {
            return true;
        }
        ((AnonymousClass3OK) ((C000900k) this.A00).findViewById(R.id.toolbar).getLayoutParams()).A00 = 0;
        return true;
    }
}

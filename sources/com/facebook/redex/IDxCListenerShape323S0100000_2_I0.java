package com.facebook.redex;

import X.AnonymousClass00B;
import X.AnonymousClass01A;
import X.AnonymousClass09E;
import X.C011005f;
import X.C16980tz;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.obwhatsapp.IntentChooserBottomSheetDialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.camera.bottomsheet.CameraMediaPickerFragment;
import com.obwhatsapp.gallery.GalleryTabHostFragment;

public class IDxCListenerShape323S0100000_2_I0 implements AnonymousClass09E {
    public Object A00;
    public final int A01;

    public IDxCListenerShape323S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.A01) {
            case 0:
                IntentChooserBottomSheetDialogFragment intentChooserBottomSheetDialogFragment = (IntentChooserBottomSheetDialogFragment) this.A00;
                if (!intentChooserBottomSheetDialogFragment.A0K.A02.A00(C011005f.STARTED)) {
                    return false;
                }
                if (intentChooserBottomSheetDialogFragment.A06 == null) {
                    intentChooserBottomSheetDialogFragment.A0D().startActivityForResult(menuItem.getIntent(), intentChooserBottomSheetDialogFragment.A00);
                } else {
                    AnonymousClass01A A08 = intentChooserBottomSheetDialogFragment.A0G().A08(intentChooserBottomSheetDialogFragment.A06.intValue());
                    AnonymousClass00B.A06(A08);
                    A08.startActivityForResult(menuItem.getIntent(), intentChooserBottomSheetDialogFragment.A00);
                }
                intentChooserBottomSheetDialogFragment.A1C();
                return true;
            case 1:
                CameraMediaPickerFragment cameraMediaPickerFragment = (CameraMediaPickerFragment) this.A00;
                if (menuItem.getItemId() != R.id.menuitem_select_multiple) {
                    return false;
                }
                cameraMediaPickerFragment.A1N();
                return true;
            case 2:
                CameraMediaPickerFragment cameraMediaPickerFragment2 = (CameraMediaPickerFragment) this.A00;
                if (menuItem.getItemId() != R.id.menuitem_select_multiple) {
                    return false;
                }
                cameraMediaPickerFragment2.A1R(cameraMediaPickerFragment2.A05);
                return true;
            default:
                GalleryTabHostFragment galleryTabHostFragment = (GalleryTabHostFragment) this.A00;
                if (menuItem.getItemId() != R.id.multi_select) {
                    return false;
                }
                if (!galleryTabHostFragment.A1L()) {
                    return true;
                }
                galleryTabHostFragment.A1K(true);
                menuItem.setVisible(false);
                Toolbar toolbar = galleryTabHostFragment.A03;
                if (toolbar == null) {
                    return true;
                }
                toolbar.setTitle((CharSequence) C16980tz.A00(galleryTabHostFragment.A1D()).getString(R.string.str14cd));
                return true;
        }
    }
}

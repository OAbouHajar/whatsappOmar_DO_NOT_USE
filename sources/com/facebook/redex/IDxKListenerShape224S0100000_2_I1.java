package com.facebook.redex;

import X.AnonymousClass01A;
import X.C001000l;
import X.C18450wi;
import android.app.Activity;
import android.content.DialogInterface;
import android.view.KeyEvent;
import com.obwhatsapp.picker.search.PickerSearchDialogFragment;
import com.obwhatsapp.storage.StorageUsageGalleryActivity;
import com.obwhatsapp.wabloks.commerce.ui.view.ExtensionsBottomsheetBaseContainer;

public class IDxKListenerShape224S0100000_2_I1 implements DialogInterface.OnKeyListener {
    public Object A00;
    public final int A01;

    public IDxKListenerShape224S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        C001000l r0;
        switch (this.A01) {
            case 0:
                Activity activity = (Activity) this.A00;
                if (i2 != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                activity.finish();
                return true;
            case 1:
                AnonymousClass01A r2 = (AnonymousClass01A) this.A00;
                if (i2 == 4 && keyEvent.getAction() == 1) {
                    r0 = r2.A0C();
                    break;
                } else {
                    return false;
                }
            case 2:
                AnonymousClass01A r1 = (AnonymousClass01A) this.A00;
                if (i2 == 4 && keyEvent.getAction() == 0) {
                    r0 = r1.A0C();
                    break;
                } else {
                    return false;
                }
            case 3:
                PickerSearchDialogFragment pickerSearchDialogFragment = (PickerSearchDialogFragment) this.A00;
                if (i2 != 4 || keyEvent.getAction() != 1 || keyEvent.isCanceled()) {
                    return false;
                }
                pickerSearchDialogFragment.A1M();
                return true;
            case 4:
                StorageUsageGalleryActivity storageUsageGalleryActivity = (StorageUsageGalleryActivity) this.A00;
                if (i2 != 4) {
                    return false;
                }
                storageUsageGalleryActivity.A35();
                return true;
            default:
                ExtensionsBottomsheetBaseContainer extensionsBottomsheetBaseContainer = (ExtensionsBottomsheetBaseContainer) this.A00;
                if (i2 != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                boolean A0R = C18450wi.A0R(extensionsBottomsheetBaseContainer.A1N().A02.A01(), Boolean.TRUE);
                C001000l A0D = extensionsBottomsheetBaseContainer.A0D();
                if (A0R) {
                    A0D.onBackPressed();
                    return true;
                }
                A0D.finish();
                return true;
        }
        if (r0 == null) {
            return false;
        }
        r0.onBackPressed();
        return true;
    }
}

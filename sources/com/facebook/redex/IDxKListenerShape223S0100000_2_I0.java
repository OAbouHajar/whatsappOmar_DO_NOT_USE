package com.facebook.redex;

import X.AnonymousClass01A;
import android.content.DialogInterface;
import android.view.KeyEvent;
import com.obwhatsapp.calling.videoparticipant.MaximizedParticipantVideoDialogFragment;
import com.obwhatsapp.contact.picker.SharedTextPreviewDialogFragment;

public class IDxKListenerShape223S0100000_2_I0 implements DialogInterface.OnKeyListener {
    public Object A00;
    public final int A01;

    public IDxKListenerShape223S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        switch (this.A01) {
            case 0:
                MaximizedParticipantVideoDialogFragment maximizedParticipantVideoDialogFragment = (MaximizedParticipantVideoDialogFragment) this.A00;
                if (i2 != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                maximizedParticipantVideoDialogFragment.A1O(true);
                return true;
            case 1:
                SharedTextPreviewDialogFragment sharedTextPreviewDialogFragment = (SharedTextPreviewDialogFragment) this.A00;
                if (i2 != 4 || !sharedTextPreviewDialogFragment.A09.isShowing()) {
                    return false;
                }
                sharedTextPreviewDialogFragment.A09.dismiss();
                return true;
            default:
                AnonymousClass01A r2 = (AnonymousClass01A) this.A00;
                if (i2 != 4 || keyEvent.getAction() != 1) {
                    return false;
                }
                r2.A0D().finish();
                return true;
        }
    }
}

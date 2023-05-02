package com.facebook.redex;

import X.C449726l;
import android.view.View;
import android.view.ViewTreeObserver;
import com.obwhatsapp.contact.picker.SharedTextPreviewDialogFragment;
import com.obwhatsapp.registration.ChangeNumber;
import com.obwhatsapp.registration.ChangeNumberOverview;
import com.obwhatsapp.twofactor.SettingsTwoFactorAuthActivity;

public class IDxCListenerShape236S0100000_2_I0 implements ViewTreeObserver.OnScrollChangedListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape236S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onScrollChanged() {
        switch (this.A01) {
            case 0:
                C449726l r4 = (C449726l) this.A00;
                int i2 = 0;
                int bottom = r4.A07.getChildAt(0).getBottom();
                int height = r4.A07.getHeight() + r4.A07.getScrollY();
                View view = r4.A05;
                if (bottom <= height) {
                    i2 = 8;
                }
                view.setVisibility(i2);
                return;
            case 1:
                ((SharedTextPreviewDialogFragment) this.A00).A1O();
                return;
            case 2:
                ((ChangeNumber) this.A00).A37();
                return;
            case 3:
                ((ChangeNumberOverview) this.A00).A35();
                return;
            default:
                ((SettingsTwoFactorAuthActivity) this.A00).A35();
                return;
        }
    }
}

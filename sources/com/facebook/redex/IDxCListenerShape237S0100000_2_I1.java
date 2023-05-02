package com.facebook.redex;

import X.AnonymousClass39V;
import android.view.View;
import android.view.ViewTreeObserver;
import com.obwhatsapp.account.delete.DeleteAccountConfirmation;
import com.obwhatsapp.account.delete.DeleteAccountFeedback;
import com.obwhatsapp.companiondevice.optin.ui.ForcedOptInActivity;
import com.obwhatsapp.registration.ChangeNumberNotifyContacts;
import com.obwhatsapp.registration.RegistrationScrollView;

public class IDxCListenerShape237S0100000_2_I1 implements ViewTreeObserver.OnScrollChangedListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape237S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onScrollChanged() {
        switch (this.A01) {
            case 0:
                ((DeleteAccountConfirmation) this.A00).A35();
                return;
            case 1:
                ((DeleteAccountFeedback) this.A00).A35();
                return;
            case 2:
                ForcedOptInActivity forcedOptInActivity = (ForcedOptInActivity) this.A00;
                boolean z2 = !(!forcedOptInActivity.A02.canScrollVertically(1));
                View view = forcedOptInActivity.A01;
                int i2 = 4;
                if (z2) {
                    i2 = 0;
                }
                view.setVisibility(i2);
                return;
            case 3:
                ((ChangeNumberNotifyContacts) this.A00).A35();
                return;
            case 4:
                RegistrationScrollView.A01((RegistrationScrollView) this.A00);
                return;
            default:
                ((AnonymousClass39V) this.A00).A01();
                return;
        }
    }
}

package com.facebook.redex;

import X.AnonymousClass269;
import X.AnonymousClass5PJ;
import X.C18450wi;
import android.content.DialogInterface;
import com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;
import com.obwhatsapp.registration.RegisterPhone;
import com.obwhatsapp.registration.VerifyPhoneNumber;

public class IDxDListenerShape158S0100000_2_I0 implements DialogInterface.OnDismissListener {
    public Object A00;
    public final int A01;

    public IDxDListenerShape158S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.A01) {
            case 0:
                AnonymousClass269 r0 = ((BusinessDirectoryMapViewActivity) this.A00).A0M;
                if (r0 == null) {
                    throw C18450wi.A03("viewModel");
                }
                r0.A08();
                return;
            case 1:
                ((AnonymousClass5PJ) this.A00).A6E();
                return;
            case 2:
                ((RegisterPhone) this.A00).A05 = null;
                return;
            default:
                ((VerifyPhoneNumber) this.A00).A3L();
                return;
        }
    }
}

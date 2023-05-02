package com.facebook.redex;

import X.AnonymousClass29T;
import X.AnonymousClass5ko;
import X.C111345g2;
import android.app.Activity;
import android.content.DialogInterface;

public class IDxCListenerShape13S0101000_3_I1 implements DialogInterface.OnCancelListener {
    public int A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape13S0101000_3_I1(Object obj, int i2, int i3) {
        this.A02 = i3;
        this.A01 = obj;
        this.A00 = i2;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        int i2 = this.A02;
        Object obj = this.A01;
        switch (i2) {
            case 0:
            case 1:
                C111345g2.A1v((AnonymousClass5ko) obj, this.A00);
                return;
            default:
                AnonymousClass29T.A00((Activity) obj, this.A00);
                return;
        }
    }
}

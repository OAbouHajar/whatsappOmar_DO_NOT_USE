package com.facebook.redex;

import X.AnonymousClass29T;
import X.C1222168s;
import X.C16690tT;
import android.app.Activity;
import android.content.DialogInterface;

public class IDxCListenerShape163S0100000_3_I1 implements DialogInterface.OnCancelListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape163S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Activity activity;
        int i2;
        switch (this.A01) {
            case 0:
                C1222168s r0 = (C1222168s) this.A00;
                if (r0 != null) {
                    r0.AWg();
                    return;
                }
                return;
            case 1:
                ((C16690tT) this.A00).A06(true);
                return;
            case 2:
                activity = (Activity) this.A00;
                i2 = 100;
                break;
            case 3:
                activity = (Activity) this.A00;
                i2 = 12;
                break;
            case 4:
                activity = (Activity) this.A00;
                i2 = 11;
                break;
            case 5:
                activity = (Activity) this.A00;
                i2 = 15;
                break;
            case 6:
                activity = (Activity) this.A00;
                i2 = 13;
                break;
            case 7:
                activity = (Activity) this.A00;
                i2 = 10;
                break;
            default:
                activity = (Activity) this.A00;
                i2 = 19;
                break;
        }
        AnonymousClass29T.A00(activity, i2);
    }
}

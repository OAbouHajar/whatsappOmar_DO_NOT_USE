package com.facebook.redex;

import X.AnonymousClass342;
import X.AnonymousClass3H5;
import X.AnonymousClass3K4;
import X.AnonymousClass5ST;
import X.C63213Go;
import android.app.Activity;
import android.content.DialogInterface;

public class IDxDListenerShape159S0100000_2_I1 implements DialogInterface.OnDismissListener {
    public Object A00;
    public final int A01;

    public IDxDListenerShape159S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Activity activity;
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                activity = (Activity) obj;
                break;
            case 1:
                ((AnonymousClass5ST) obj).AT7();
                return;
            case 4:
                ((C63213Go) obj).A00.A05.AcJ();
                return;
            case 5:
                activity = ((C63213Go) obj).A00;
                break;
            case 6:
                ((AnonymousClass342) obj).AVW();
                return;
            case 7:
                AnonymousClass3H5.A00((AnonymousClass3H5) obj);
                return;
            default:
                AnonymousClass3K4.A0j((Activity) obj);
                return;
        }
        activity.finish();
    }
}

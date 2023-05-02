package com.facebook.redex;

import X.AnonymousClass1Z7;
import android.app.Activity;
import android.content.DialogInterface;
import android.view.KeyEvent;

public class IDxKListenerShape225S0100000_3_I1 implements DialogInterface.OnKeyListener {
    public Object A00;
    public final int A01;

    public IDxKListenerShape225S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
        int i3 = this.A01;
        Object obj = this.A00;
        if (i3 != 0) {
            Activity activity = (Activity) obj;
            if (i2 != 4) {
                return false;
            }
            dialogInterface.dismiss();
            activity.finish();
            return true;
        }
        AnonymousClass1Z7 r1 = (AnonymousClass1Z7) obj;
        if (i2 != 4) {
            return true;
        }
        r1.A00("on_press_back");
        dialogInterface.dismiss();
        return true;
    }
}

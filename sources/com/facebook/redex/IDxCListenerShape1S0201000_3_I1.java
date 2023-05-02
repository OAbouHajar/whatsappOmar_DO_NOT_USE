package com.facebook.redex;

import X.AnonymousClass29T;
import X.C112935km;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Handler;

public class IDxCListenerShape1S0201000_3_I1 implements DialogInterface.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxCListenerShape1S0201000_3_I1(C112935km r1, Runnable runnable, int i2, int i3) {
        this.A03 = i3;
        this.A01 = r1;
        this.A00 = i2;
        this.A02 = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        int i3 = this.A03;
        Activity activity = (Activity) this.A01;
        int i4 = this.A00;
        Runnable runnable = (Runnable) this.A02;
        if (i3 != 0) {
            AnonymousClass29T.A00(activity, i4);
        } else {
            AnonymousClass29T.A00(activity, i4);
            if (runnable == null) {
                return;
            }
        }
        new Handler(activity.getMainLooper()).post(runnable);
    }
}

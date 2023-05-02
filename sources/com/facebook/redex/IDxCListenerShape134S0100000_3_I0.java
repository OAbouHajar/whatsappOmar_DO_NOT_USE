package com.facebook.redex;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;

public class IDxCListenerShape134S0100000_3_I0 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape134S0100000_3_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onClick(View view) {
        int i2 = this.A01;
        Object obj = this.A00;
        if (i2 != 0) {
            ((Activity) obj).onBackPressed();
        } else {
            ((Dialog) obj).show();
        }
    }
}

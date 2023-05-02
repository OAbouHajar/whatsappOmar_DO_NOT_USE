package com.facebook.redex;

import X.C228319l;
import X.C52342de;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class IDxLHandlerShape466S0100000_2_I0 implements C52342de {
    public Object A00;
    public final int A01;

    public IDxLHandlerShape466S0100000_2_I0(C228319l r1, int i2) {
        this.A01 = i2;
        this.A00 = r1;
    }

    public final Intent AaE(Context context, Uri uri) {
        int i2 = this.A01;
        C228319l r0 = (C228319l) this.A00;
        return i2 != 0 ? r0.A00(context, uri) : r0.A01(context, uri);
    }
}

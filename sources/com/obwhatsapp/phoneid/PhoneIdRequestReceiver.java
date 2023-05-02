package com.obwhatsapp.phoneid;

import X.AnonymousClass1SB;
import X.AnonymousClass2IF;
import X.AnonymousClass3KX;
import X.C13690nt;
import android.content.Context;
import android.content.Intent;

public class PhoneIdRequestReceiver extends AnonymousClass3KX {
    public AnonymousClass1SB A00;
    public final Object A01;
    public volatile boolean A02;

    public PhoneIdRequestReceiver() {
        this(0);
    }

    public PhoneIdRequestReceiver(int i2) {
        this.A02 = false;
        this.A01 = C13690nt.A0Y();
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    this.A00 = (AnonymousClass1SB) AnonymousClass2IF.A00(context).AIh.get();
                    this.A02 = true;
                }
            }
        }
        super.onReceive(context, intent);
    }
}

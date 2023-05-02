package com.obwhatsapp.systemreceivers.appupdated;

import X.AnonymousClass2IF;
import X.C13690nt;
import X.C18450wi;
import X.C19390yM;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class AppUpdatedReceiver extends BroadcastReceiver {
    public C19390yM A00;
    public final Object A01;
    public volatile boolean A02;

    public AppUpdatedReceiver() {
        this(0);
    }

    public AppUpdatedReceiver(int i2) {
        this.A02 = false;
        this.A01 = C13690nt.A0Y();
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    this.A00 = AnonymousClass2IF.A00(context).A1f();
                    this.A02 = true;
                }
            }
        }
        C18450wi.A0H(context, 0);
        if ("android.intent.action.MY_PACKAGE_REPLACED".equals(intent == null ? null : intent.getAction()) && this.A00 == null) {
            throw C18450wi.A03("appUpdateManager");
        }
    }
}

package com.obwhatsapp;

import X.AnonymousClass1BI;
import X.AnonymousClass1ZW;
import X.AnonymousClass2IF;
import X.C13690nt;
import X.C16150sX;
import X.C16490t9;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

public class TellAFriendReceiver extends BroadcastReceiver {
    public AnonymousClass1BI A00;
    public C16490t9 A01;
    public final Object A02;
    public volatile boolean A03;

    public TellAFriendReceiver() {
        this(0);
    }

    public TellAFriendReceiver(int i2) {
        this.A03 = false;
        this.A02 = C13690nt.A0Y();
    }

    public void onReceive(Context context, Intent intent) {
        ComponentName componentName;
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    C16150sX A002 = AnonymousClass2IF.A00(context);
                    this.A01 = C16150sX.A0m(A002);
                    this.A00 = (AnonymousClass1BI) A002.ACt.get();
                    this.A03 = true;
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 22 && (componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT")) != null) {
            String packageName = componentName.getPackageName();
            if (!AnonymousClass1ZW.A0E(packageName)) {
                this.A00.A01(Integer.valueOf(intent.getIntExtra("extra_invite_source", 0)), packageName, 2);
            }
        }
    }
}

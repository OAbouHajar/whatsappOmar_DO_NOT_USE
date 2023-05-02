package com.obwhatsapp;

import X.AnonymousClass000;
import X.AnonymousClass03J;
import X.AnonymousClass2IF;
import X.C13680ns;
import X.C13690nt;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

public class AlarmBroadcastReceiver extends BroadcastReceiver {
    public final Object A00;
    public volatile boolean A01;

    public AlarmBroadcastReceiver() {
        this(0);
    }

    public AlarmBroadcastReceiver(int i2) {
        this.A01 = false;
        this.A00 = C13690nt.A0Y();
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.A01) {
            synchronized (this.A00) {
                if (!this.A01) {
                    AnonymousClass2IF.A01(context);
                    this.A01 = true;
                }
            }
        }
        Class<AlarmService> cls = AlarmService.class;
        Intent intent2 = new Intent(intent).setClass(context, cls);
        StringBuilder A0r = AnonymousClass000.A0r("AlarmBroadcastReceiver dispatching to AlarmService; intent=");
        A0r.append(intent);
        A0r.append("; elapsedRealtime=");
        A0r.append(SystemClock.elapsedRealtime());
        C13680ns.A1V(A0r);
        AnonymousClass03J.A00(context, intent2, cls, 3);
    }
}

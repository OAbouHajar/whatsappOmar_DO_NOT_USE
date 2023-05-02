package com.obwhatsapp.notification;

import X.AnonymousClass01F;
import X.AnonymousClass2IF;
import X.C14760pi;
import X.C16150sX;
import X.C16900tq;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public class MissedCallNotificationDismissedReceiver extends BroadcastReceiver {
    public C16900tq A00;
    public C14760pi A01;
    public final Object A02;
    public volatile boolean A03;

    public MissedCallNotificationDismissedReceiver() {
        this(0);
    }

    public MissedCallNotificationDismissedReceiver(int i2) {
        this.A03 = false;
        this.A02 = new Object();
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    C16150sX r1 = (C16150sX) ((AnonymousClass01F) AnonymousClass2IF.A01(context));
                    this.A00 = (C16900tq) r1.AFT.get();
                    this.A01 = (C14760pi) r1.AFo.get();
                    this.A03 = true;
                }
            }
        }
        Log.i("missedcallnotification/dismiss");
        C16900tq r0 = this.A00;
        r0.A04();
        if (r0.A01) {
            this.A01.A01();
        }
    }
}

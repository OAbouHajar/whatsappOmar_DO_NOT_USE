package com.obwhatsapp.systemreceivers.boot;

import X.AnonymousClass106;
import X.AnonymousClass2IF;
import X.C13690nt;
import X.C15960sC;
import X.C16150sX;
import X.C18450wi;
import X.C84014Ix;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public final class BootReceiver extends BroadcastReceiver {
    public C84014Ix A00;
    public final Object A01;
    public volatile boolean A02;

    public BootReceiver() {
        this(0);
    }

    public BootReceiver(int i2) {
        this.A02 = false;
        this.A01 = C13690nt.A0Y();
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    C16150sX A002 = AnonymousClass2IF.A00(context);
                    this.A00 = new C84014Ix((C15960sC) A002.AKz.get(), A002.A1j());
                    this.A02 = true;
                }
            }
        }
        C18450wi.A0H(context, 0);
        if (intent != null && "android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
            C84014Ix r1 = this.A00;
            if (r1 == null) {
                throw C18450wi.A03("bootManager");
            } else if ("android.intent.action.BOOT_COMPLETED".equals(intent.getAction())) {
                Log.i("BootManager; boot completed.");
                if (r1.A00.A01()) {
                    for (AnonymousClass106 ANk : r1.A01) {
                        ANk.ANk();
                    }
                }
            }
        }
    }
}

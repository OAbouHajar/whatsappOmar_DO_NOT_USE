package com.obwhatsapp.location;

import X.AnonymousClass01F;
import X.AnonymousClass2IF;
import X.C16150sX;
import X.C19430yQ;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

public class FinalLiveLocationBroadcastReceiver extends BroadcastReceiver {
    public C19430yQ A00;
    public final Object A01;
    public volatile boolean A02;

    public FinalLiveLocationBroadcastReceiver() {
        this(0);
    }

    public FinalLiveLocationBroadcastReceiver(int i2) {
        this.A02 = false;
        this.A01 = new Object();
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.A02) {
            synchronized (this.A01) {
                if (!this.A02) {
                    this.A00 = (C19430yQ) ((C16150sX) ((AnonymousClass01F) AnonymousClass2IF.A01(context))).ADa.get();
                    this.A02 = true;
                }
            }
        }
        Log.i("FinalLiveLocationBroadcastReceiver/onReceive");
        this.A00.A0D();
    }
}

package com.obwhatsapp.registration;

import X.AnonymousClass2IF;
import X.C13690nt;
import X.C15860rz;
import X.C16040sK;
import X.C16150sX;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public class RegistrationCompletedReceiver extends BroadcastReceiver {
    public C16040sK A00;
    public C15860rz A01;
    public final Object A02;
    public volatile boolean A03;

    public RegistrationCompletedReceiver() {
        this(0);
    }

    public RegistrationCompletedReceiver(int i2) {
        this.A03 = false;
        this.A02 = C13690nt.A0Y();
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    C16150sX A002 = AnonymousClass2IF.A00(context);
                    this.A00 = C16150sX.A04(A002);
                    this.A01 = C16150sX.A0Y(A002);
                    this.A03 = true;
                }
            }
        }
        Log.i("received broadcast that smba was registered on this device");
        if (this.A00.A0I(UserJid.getNullable(intent.getStringExtra("jid")))) {
            Log.i("smba registered this clients phone number");
            this.A01.A1F(true);
        }
    }
}

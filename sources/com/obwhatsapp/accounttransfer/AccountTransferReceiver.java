package com.obwhatsapp.accounttransfer;

import X.AnonymousClass01V;
import X.AnonymousClass1ZW;
import X.AnonymousClass2IF;
import X.C13680ns;
import X.C13690nt;
import X.C16150sX;
import X.C16320sq;
import X.C437421i;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.facebook.redex.RunnableRunnableShape17S0100000_I1;
import com.whatsapp.util.Log;

public class AccountTransferReceiver extends BroadcastReceiver {
    public AnonymousClass01V A00;
    public C16320sq A01;
    public final Object A02;
    public volatile boolean A03;

    public AccountTransferReceiver() {
        this(0);
    }

    public AccountTransferReceiver(int i2) {
        this.A03 = false;
        this.A02 = C13690nt.A0Y();
    }

    public void onReceive(Context context, Intent intent) {
        String str;
        KeyguardManager A07;
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    C16150sX A002 = AnonymousClass2IF.A00(context);
                    this.A01 = C16150sX.A1B(A002);
                    this.A00 = C16150sX.A0T(A002);
                    this.A03 = true;
                }
            }
        }
        String action = intent.getAction();
        Log.i(C13680ns.A0h("AccountTransferReceiver/onReceive/action=", action));
        if (AnonymousClass1ZW.A0E(action)) {
            str = "AccountTransferReceiver/onReceive/action is empty";
        } else {
            AnonymousClass01V r2 = this.A00;
            if (Build.VERSION.SDK_INT < 23 || (A07 = r2.A07()) == null || !A07.isDeviceSecure() || !C437421i.A01(context)) {
                str = "AccountTransferReceiver/onReceive/disabled";
            } else if (action.equals("com.google.android.gms.auth.START_ACCOUNT_EXPORT")) {
                this.A01.Acl(new RunnableRunnableShape17S0100000_I1((Object) context, 10));
                return;
            } else {
                return;
            }
        }
        Log.i(str);
    }
}

package com.obwhatsapp.otp;

import X.AnonymousClass17U;
import X.AnonymousClass17W;
import X.AnonymousClass2IF;
import X.C13680ns;
import X.C13690nt;
import X.C16150sX;
import X.C16440t3;
import X.C42331xc;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.SystemClock;
import com.whatsapp.util.Log;

public final class OTPRequestedReceiver extends BroadcastReceiver {
    public C16440t3 A00;
    public AnonymousClass17W A01;
    public final Object A02;
    public volatile boolean A03;

    public OTPRequestedReceiver() {
        this(0);
    }

    public OTPRequestedReceiver(int i2) {
        this.A03 = false;
        this.A02 = C13690nt.A0Y();
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.A03) {
            synchronized (this.A02) {
                if (!this.A03) {
                    C16150sX A002 = AnonymousClass2IF.A00(context);
                    this.A01 = (AnonymousClass17W) A002.AGd.get();
                    this.A00 = C16150sX.A0U(A002);
                    this.A03 = true;
                }
            }
        }
        try {
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("_ci_");
            if (pendingIntent != null) {
                AnonymousClass17W r2 = this.A01;
                String creatorPackage = pendingIntent.getCreatorPackage();
                r2.A01.put(creatorPackage, Long.valueOf(SystemClock.elapsedRealtime()));
                AnonymousClass17U r22 = r2.A00;
                C42331xc r1 = new C42331xc();
                r1.A03 = C13680ns.A0Z();
                r1.A02 = C13680ns.A0a();
                r1.A08 = creatorPackage;
                r22.A01.A06(r1);
            }
        } catch (BadParcelableException e2) {
            Log.e("OTP: Error while unmarshalling", e2);
        }
    }
}

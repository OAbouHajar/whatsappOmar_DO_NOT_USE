package com.obwhatsapp.registration;

import X.AnonymousClass2IF;
import X.C007503l;
import X.C13680ns;
import X.C13690nt;
import X.C14750ph;
import X.C15960sC;
import X.C16150sX;
import X.C16980tz;
import X.C19380yL;
import X.C218415q;
import X.C42341xd;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat$BigTextStyle;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import com.whatsapp.util.Log;

public class RegRetryVerificationReceiver extends BroadcastReceiver {
    public C16980tz A00;
    public C19380yL A01;
    public C15960sC A02;
    public final Object A03;
    public volatile boolean A04;

    public RegRetryVerificationReceiver() {
        this(0);
    }

    public RegRetryVerificationReceiver(int i2) {
        this.A04 = false;
        this.A03 = C13690nt.A0Y();
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.A04) {
            synchronized (this.A03) {
                if (!this.A04) {
                    C16150sX A002 = AnonymousClass2IF.A00(context);
                    this.A00 = C16150sX.A0V(A002);
                    this.A01 = (C19380yL) A002.AQd.get();
                    this.A02 = (C15960sC) A002.AKz.get();
                    this.A04 = true;
                }
            }
        }
        Log.i("reg-retry-verification-receiver/timeout");
        if (this.A02.A01() || this.A02.A00() == 10) {
            Log.i("app-init/async/registrationretry/verified");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String string = this.A00.A00.getString(R.string.str1cf7);
        String A0d = C13680ns.A0d(this.A00.A00, string, new Object[1], 0, R.string.str1985);
        String string2 = this.A00.A00.getString(R.string.str1986);
        PendingIntent A003 = C42341xd.A00(context, 1, C14750ph.A04(context), 0);
        C007503l A004 = C218415q.A00(context);
        A004.A0J = "critical_app_alerts@1";
        A004.A0B(A0d);
        A004.A05(currentTimeMillis);
        A004.A02(3);
        A004.A0D(true);
        A004.A0A(string);
        A004.A09(string2);
        NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = new NotificationCompat$BigTextStyle();
        notificationCompat$BigTextStyle.A09(string2);
        A004.A08(notificationCompat$BigTextStyle);
        A004.A09 = A003;
        A004.A07.icon = yo.getNIcon(R.drawable.notifybar);
        this.A01.A02(1, A004.A01());
    }
}

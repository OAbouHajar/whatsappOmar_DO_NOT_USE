package com.obwhatsapp.instrumentation.notification;

import X.AnonymousClass000;
import X.AnonymousClass013;
import X.AnonymousClass1GJ;
import X.AnonymousClass2IF;
import X.C007503l;
import X.C13680ns;
import X.C13690nt;
import X.C15970sD;
import X.C16150sX;
import X.C19380yL;
import X.C218415q;
import X.C42341xd;
import X.C47672Jx;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import java.util.Iterator;

public class DelayedNotificationReceiver extends BroadcastReceiver {
    public C19380yL A00;
    public AnonymousClass013 A01;
    public AnonymousClass1GJ A02;
    public C15970sD A03;
    public final Object A04;
    public volatile boolean A05;

    public DelayedNotificationReceiver() {
        this(0);
    }

    public DelayedNotificationReceiver(int i2) {
        this.A05 = false;
        this.A04 = C13690nt.A0Y();
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.A05) {
            synchronized (this.A04) {
                if (!this.A05) {
                    C16150sX A002 = AnonymousClass2IF.A00(context);
                    this.A02 = (AnonymousClass1GJ) A002.ACY.get();
                    this.A00 = (C19380yL) A002.AQd.get();
                    this.A03 = (C15970sD) A002.ACi.get();
                    this.A01 = C16150sX.A0Z(A002);
                    this.A05 = true;
                }
            }
        }
        Iterator it = this.A03.A02().iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass000.A0m(it);
            if (!this.A03.A01().getBoolean(C15970sD.A00(A0m, "metadata/delayed_notification_shown"), false)) {
                long A08 = C13680ns.A08(this.A03.A01(), C15970sD.A00(A0m, "auth/token_ts"));
                Number number = (Number) this.A02.A01.get(A0m);
                int intValue = number != null ? number.intValue() : R.string.str188d;
                String string = context.getString(R.string.str0e2d);
                String A003 = C47672Jx.A00(this.A01, A08);
                Object[] A1Z = C13690nt.A1Z();
                A1Z[0] = context.getString(intValue);
                C007503l A012 = C218415q.A01(context, string, C13680ns.A0d(context, A003, A1Z, 1, R.string.str0e2c));
                A012.A0D(true);
                A012.A07.icon = yo.getNIcon(R.drawable.notifybar);
                this.A00.A02(41, A012.A01());
                C13680ns.A0z(this.A03.A01().edit(), C15970sD.A00(A0m, "metadata/delayed_notification_shown"), true);
            }
        }
        PendingIntent A013 = C42341xd.A01(context, 0, intent, 536870912);
        if (A013 != null) {
            A013.cancel();
        }
    }
}

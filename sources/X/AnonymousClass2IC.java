package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;

/* renamed from: X.2IC  reason: invalid class name */
public final class AnonymousClass2IC extends BroadcastReceiver {
    public final AnonymousClass1HT A00;
    public final C210712r A01;
    public final AnonymousClass01V A02;
    public final C16440t3 A03;
    public final C16980tz A04;
    public final C19210xw A05;
    public final C14850pr A06;
    public final AnonymousClass1HC A07;
    public final Object A08 = new Object();
    public volatile boolean A09 = false;

    public AnonymousClass2IC(AnonymousClass1HT r2, C210712r r3, AnonymousClass01V r4, C16440t3 r5, C16980tz r6, C19210xw r7, C14850pr r8, AnonymousClass1HC r9) {
        this.A03 = r5;
        this.A01 = r3;
        this.A04 = r6;
        this.A02 = r4;
        this.A06 = r8;
        this.A05 = r7;
        this.A07 = r9;
        this.A00 = r2;
    }

    public void A00() {
        PendingIntent A012 = C42341xd.A01(this.A04.A00, 0, new Intent("com.obwhatsapp.alarm.AVAILABLE_TIMEOUT").setPackage("com.obwhatsapp"), 536870912);
        if (A012 != null) {
            AnonymousClass01V r1 = this.A02;
            AnonymousClass01V.A0P = true;
            AlarmManager A042 = r1.A04();
            AnonymousClass01V.A0P = false;
            if (A042 != null) {
                A042.cancel(A012);
            } else {
                Log.w("AvailabilityTimeoutAlarmBroadcastReceiver/cancelAvailableTimeoutAlarm AlarmManager is null");
            }
            A012.cancel();
        }
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.A09) {
            synchronized (this.A08) {
                if (!this.A09) {
                    AnonymousClass2IF.A01(context);
                    this.A09 = true;
                }
            }
        }
        C14850pr r3 = this.A06;
        if (r3.A00 != 1) {
            C19210xw r2 = this.A05;
            r2.A04.A00();
            StringBuilder sb = new StringBuilder("presencestatemanager/setUnavailable previous-state: ");
            C14850pr r1 = r2.A05;
            sb.append(r1);
            Log.i(sb.toString());
            r1.A00 = 3;
            this.A07.A01();
            this.A00.A00.clear();
        }
        StringBuilder sb2 = new StringBuilder("app/presenceavailable/timeout/foreground ");
        sb2.append(r3);
        Log.i(sb2.toString());
    }
}

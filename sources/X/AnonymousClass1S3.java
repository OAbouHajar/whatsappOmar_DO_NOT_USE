package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.DeadObjectException;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.1S3  reason: invalid class name */
public class AnonymousClass1S3 {
    public C19090xk A00;
    public final BroadcastReceiver A01 = new AnonymousClass2CK(this);
    public final C16570tH A02;
    public final C16300so A03;
    public final C210712r A04;
    public final AnonymousClass01V A05;
    public final C16440t3 A06;
    public final C16980tz A07;
    public final C14710pd A08;
    public final AnonymousClass1HJ A09;
    public final AnonymousClass1HL A0A;

    public AnonymousClass1S3(C16570tH r2, C16300so r3, C210712r r4, AnonymousClass01V r5, C16440t3 r6, C16980tz r7, C14710pd r8, AnonymousClass1HJ r9, AnonymousClass1HL r10) {
        this.A06 = r6;
        this.A08 = r8;
        this.A04 = r4;
        this.A03 = r3;
        this.A07 = r7;
        this.A05 = r5;
        this.A09 = r9;
        this.A0A = r10;
        this.A02 = r2;
    }

    public void A00() {
        Context context = this.A07.A00;
        synchronized (this.A01) {
            Log.i("xmpp/handler/logout-timer/cancel");
            try {
                PendingIntent A012 = C42341xd.A01(context, 0, new Intent("com.obwhatsapp.MessageHandler.LOGOUT_ACTION").setPackage("com.obwhatsapp"), 536870912);
                if (A012 != null) {
                    AlarmManager A042 = this.A05.A04();
                    if (A042 != null) {
                        A042.cancel(A012);
                    } else {
                        Log.w("MessageHandler/cancelLogoutTimer AlarmManager is null");
                    }
                    A012.cancel();
                }
            } catch (RuntimeException e2) {
                if (e2.getCause() instanceof DeadObjectException) {
                    this.A03.AcB("messagehandler/deadOS", (String) null, false);
                } else {
                    throw e2;
                }
            }
        }
    }

    public void A01() {
        synchronized (this.A01) {
            Log.i("xmpp/handler/logout-timer/reset");
            if (A03()) {
                A02();
            }
        }
    }

    public void A02() {
        Context context = this.A07.A00;
        synchronized (this.A01) {
            Log.i("xmpp/handler/logout-timer/start");
            if (!this.A04.A02(C42341xd.A01(context, 0, new Intent("com.obwhatsapp.MessageHandler.LOGOUT_ACTION").setPackage("com.obwhatsapp"), 134217728), 2, SystemClock.elapsedRealtime() + (((long) this.A08.A03(C16620tM.A02, 431)) * 60 * 1000))) {
                Log.w("MessageHandler/startLogoutTimer AlarmManager is null");
            }
        }
    }

    public boolean A03() {
        boolean z2;
        synchronized (this.A01) {
            z2 = false;
            if (C42341xd.A01(this.A07.A00, 0, new Intent("com.obwhatsapp.MessageHandler.LOGOUT_ACTION").setPackage("com.obwhatsapp"), 536870912) != null) {
                z2 = true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("xmpp/handler/logout-timer/has=");
            sb.append(z2);
            Log.i(sb.toString());
        }
        return z2;
    }
}

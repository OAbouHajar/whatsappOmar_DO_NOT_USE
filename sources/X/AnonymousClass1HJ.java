package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.redex.IDxRCallbackShape49S0200000_2_I0;
import com.facebook.redex.RunnableRunnableShape11S0100000_I0_10;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.1HJ  reason: invalid class name */
public class AnonymousClass1HJ {
    public int A00;
    public AnonymousClass2CB A01;
    public AnonymousClass2CA A02;
    public C34511kO A03;
    public C17190ug A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Handler A09;
    public final C15900s5 A0A;
    public final C16600tK A0B;
    public final C210712r A0C;
    public final AnonymousClass01V A0D;
    public final C16440t3 A0E;
    public final C16980tz A0F;
    public volatile long A0G;

    public AnonymousClass1HJ(C15900s5 r3, C16600tK r4, C210712r r5, AnonymousClass01V r6, C16440t3 r7, C16980tz r8, C17190ug r9) {
        Looper mainLooper = Looper.getMainLooper();
        this.A0E = r7;
        this.A0C = r5;
        this.A0F = r8;
        this.A0A = r3;
        this.A04 = r9;
        this.A0D = r6;
        this.A09 = new Handler(mainLooper);
        this.A0B = r4;
    }

    public void A00() {
        Log.i("xmpp/client-ping/on-demand-ping");
        this.A09.post(new RunnableRunnableShape11S0100000_I0_10((Object) this, 9));
    }

    public final void A01() {
        Log.i("xmpp/client-ping/timeout/cancel-alarm");
        A07(new Intent("com.obwhatsapp.alarm.CLIENT_PING_TIMEOUT").setPackage("com.obwhatsapp"));
    }

    public final void A02() {
        Log.i("xmpp/client-ping/on-disconnected");
        Handler handler = this.A09;
        AnonymousClass00B.A02(handler);
        A03();
        if (!this.A06) {
            Log.w("xmpp/client-ping/on-disconnected; not connected, ignoring...");
            return;
        }
        if (this.A0G > 0) {
            A01();
        }
        AnonymousClass00B.A02(handler);
        AnonymousClass2CA r1 = this.A02;
        if (r1 != null) {
            this.A0F.A00.unregisterReceiver(r1);
            this.A02 = null;
        }
        Log.i("xmpp/client-ping/periodic/cancel-alarm");
        A07(new Intent("com.obwhatsapp.alarm.CLIENT_PING_PERIODIC").setPackage("com.obwhatsapp"));
        AnonymousClass00B.A02(handler);
        AnonymousClass2CB r12 = this.A01;
        if (r12 != null) {
            this.A0F.A00.unregisterReceiver(r12);
            this.A01 = null;
        }
        this.A03 = null;
        this.A06 = false;
    }

    public final void A03() {
        AnonymousClass00B.A02(this.A09);
        if (!this.A07) {
            A07(new Intent("com.obwhatsapp.MessageHandler.CLIENT_PINGER_ACTION"));
            A07(new Intent("com.obwhatsapp.MessageHandler.CLIENT_PINGER_ACTION").setPackage("com.obwhatsapp"));
            this.A07 = true;
        }
    }

    public final void A04() {
        String str;
        Log.i("xmpp/client-ping/ping-timeout");
        AnonymousClass00B.A02(this.A09);
        if (!this.A06 || this.A03 == null) {
            str = "xmpp/client-ping/ping-timeout; not connected, ignoring.";
        } else if (!this.A0B.A05) {
            str = "xmpp/client-ping/ping-timeout; xmpp connection is not ready, ignoring.";
        } else if (this.A08) {
            str = "xmpp/client-ping/ping-timeout; already notified about timeout, ignoring.";
        } else {
            ((Handler) this.A03).obtainMessage(8).sendToTarget();
            this.A08 = true;
            A01();
            return;
        }
        Log.w(str);
    }

    public final void A05() {
        Log.i("xmpp/client-ping/send-ping");
        AnonymousClass00B.A02(this.A09);
        if (!this.A06 || this.A03 == null) {
            Log.w("xmpp/client-ping/send-ping; not connected, ignoring.");
        } else if (this.A0G > 0) {
            Log.w("xmpp/client-ping/send-ping; skipping ping request, pending ping already exists.");
            if (this.A0G > 0 && SystemClock.elapsedRealtime() > this.A0G + Math.min(32000, Math.max(8000, (long) (this.A0A.A02(C15910s6.A1s) * 1000)))) {
                A04();
            }
        } else {
            Log.i("xmpp/client-ping/periodic/cancel-alarm");
            A07(new Intent("com.obwhatsapp.alarm.CLIENT_PING_PERIODIC").setPackage("com.obwhatsapp"));
            this.A0G = SystemClock.elapsedRealtime();
            this.A08 = false;
            Log.i("xmpp/client-ping/timeout/schedule-alarm");
            if (!this.A0C.A02(C42341xd.A01(this.A0F.A00, 0, new Intent("com.obwhatsapp.alarm.CLIENT_PING_TIMEOUT").setPackage("com.obwhatsapp"), 134217728), 2, SystemClock.elapsedRealtime() + Math.min(32000, Math.max(8000, (long) (this.A0A.A02(C15910s6.A1s) * 1000))))) {
                Log.w("xmpp/client-ping/timeout/schedule-alarm; failed to schedule alarm");
            }
            A08((Runnable) null);
            this.A00++;
        }
    }

    public final void A06() {
        Log.i("xmpp/client-ping/periodic/schedule-alarm");
        Context context = this.A0F.A00;
        AlarmManager A042 = this.A0D.A04();
        if (A042 == null) {
            Log.w("xmpp/client-ping/periodic/schedule-alarm; alarm manager is null");
            return;
        }
        PendingIntent A012 = C42341xd.A01(context, 0, new Intent("com.obwhatsapp.alarm.CLIENT_PING_PERIODIC").setPackage("com.obwhatsapp"), 134217728);
        long elapsedRealtime = SystemClock.elapsedRealtime() + (this.A00 == 0 ? 15000 : 240000);
        int i2 = 2;
        if (this.A05) {
            i2 = 3;
        }
        A042.set(i2, elapsedRealtime, A012);
    }

    public void A07(Intent intent) {
        PendingIntent A012 = C42341xd.A01(this.A0F.A00, 0, intent, 536870912);
        if (A012 != null) {
            AlarmManager A042 = this.A0D.A04();
            if (A042 == null) {
                Log.w("xmpp/client-ping/cancel-alarm; service is null");
                return;
            }
            A042.cancel(A012);
            A012.cancel();
        }
    }

    public void A08(Runnable runnable) {
        C17190ug r5 = this.A04;
        String A022 = r5.A02();
        r5.A0A(new IDxRCallbackShape49S0200000_2_I0(runnable, 3, this), new C28371Vv(new C28371Vv("ping", (C35081lL[]) null), "iq", new C35081lL[]{new C35081lL("id", A022), new C35081lL("xmlns", "w:p"), new C35081lL("type", "get"), new C35081lL((Jid) C34791ks.A00, "to")}), A022, 22, 32000);
    }
}

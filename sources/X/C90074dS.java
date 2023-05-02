package X;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.4dS  reason: invalid class name and case insensitive filesystem */
public final class C90074dS {
    public static HandlerThread A05;
    public static C90074dS A06;
    public static final Object A07 = C13690nt.A0Y();
    public final Context A00;
    public final C91984go A01;
    public final AnonymousClass3BF A02;
    public final HashMap A03 = AnonymousClass000.A0x();
    public volatile Handler A04;

    public C90074dS(Context context, Looper looper) {
        C91984go r1 = new C91984go(this);
        this.A01 = r1;
        this.A00 = context.getApplicationContext();
        this.A04 = new AnonymousClass3M3(looper, r1);
        this.A02 = AnonymousClass3BF.A00();
    }

    public static C90074dS A00(Context context) {
        synchronized (A07) {
            if (A06 == null) {
                A06 = new C90074dS(context.getApplicationContext(), context.getMainLooper());
            }
        }
        return A06;
    }

    public final void A01(ServiceConnection serviceConnection, AnonymousClass3BI r7) {
        IllegalStateException illegalStateException;
        HashMap hashMap = this.A03;
        synchronized (hashMap) {
            C91594gB r0 = (C91594gB) hashMap.get(r7);
            if (r0 != null) {
                Map map = r0.A05;
                if (map.containsKey(serviceConnection)) {
                    map.remove(serviceConnection);
                    if (map.isEmpty()) {
                        this.A04.sendMessageDelayed(this.A04.obtainMessage(0, r7), 5000);
                    }
                } else {
                    String obj = r7.toString();
                    StringBuilder A0g = C13690nt.A0g(obj.length() + 76);
                    A0g.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    illegalStateException = AnonymousClass000.A0V(AnonymousClass000.A0h(obj, A0g));
                }
            } else {
                String obj2 = r7.toString();
                StringBuilder A0g2 = C13690nt.A0g(obj2.length() + 50);
                A0g2.append("Nonexistent connection status for service config: ");
                illegalStateException = AnonymousClass000.A0V(AnonymousClass000.A0h(obj2, A0g2));
            }
            throw illegalStateException;
        }
    }

    public final boolean A02(ServiceConnection serviceConnection, AnonymousClass3BI r6, String str) {
        boolean z2;
        HashMap hashMap = this.A03;
        synchronized (hashMap) {
            C91594gB r2 = (C91594gB) hashMap.get(r6);
            if (r2 == null) {
                r2 = new C91594gB(r6, this);
                r2.A05.put(serviceConnection, serviceConnection);
                r2.A00(str);
                hashMap.put(r6, r2);
            } else {
                this.A04.removeMessages(0, r6);
                Map map = r2.A05;
                if (!map.containsKey(serviceConnection)) {
                    map.put(serviceConnection, serviceConnection);
                    int i2 = r2.A00;
                    if (i2 == 1) {
                        serviceConnection.onServiceConnected(r2.A01, r2.A02);
                    } else if (i2 == 2) {
                        r2.A00(str);
                    }
                } else {
                    String obj = r6.toString();
                    StringBuilder A0g = C13690nt.A0g(obj.length() + 81);
                    A0g.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    throw AnonymousClass000.A0V(AnonymousClass000.A0h(obj, A0g));
                }
            }
            z2 = r2.A03;
        }
        return z2;
    }
}

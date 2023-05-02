package X;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.0pD  reason: invalid class name and case insensitive filesystem */
public final class C14460pD {
    public static C14460pD A04;
    public int A00 = 1;
    public C15500rE A01 = new C15500rE(this);
    public final Context A02;
    public final ScheduledExecutorService A03;

    public C14460pD(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.A03 = scheduledExecutorService;
        this.A02 = context.getApplicationContext();
    }

    public static synchronized C14460pD A00(Context context) {
        C14460pD r1;
        synchronized (C14460pD.class) {
            r1 = A04;
            if (r1 == null) {
                r1 = new C14460pD(context, Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new C14160oi("MessengerIpcClient"))));
                A04 = r1;
            }
        }
        return r1;
    }

    public final synchronized C14210on A01(C14480pF r5) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(r5);
            StringBuilder sb = new StringBuilder(valueOf.length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.A01.A03(r5)) {
            C15500rE r0 = new C15500rE(this);
            this.A01 = r0;
            r0.A03(r5);
        }
        return r5.A03.A00;
    }
}

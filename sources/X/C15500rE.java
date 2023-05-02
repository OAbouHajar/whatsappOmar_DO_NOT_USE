package X;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.facebook.redex.RunnableRunnableShape1S0100000_I0;
import com.facebook.redex.RunnableRunnableShape2S0200000_I0;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: X.0rE  reason: invalid class name and case insensitive filesystem */
public final class C15500rE implements ServiceConnection {
    public int A00 = 0;
    public AnonymousClass4GZ A01;
    public final Messenger A02 = new Messenger(new AnonymousClass0pA(Looper.getMainLooper(), new C91994gp(this)));
    public final SparseArray A03 = new SparseArray();
    public final Queue A04 = new ArrayDeque();
    public final /* synthetic */ C14460pD A05;

    public C15500rE(C14460pD r4) {
        this.A05 = r4;
    }

    public final synchronized void A00() {
        if (this.A00 == 2 && this.A04.isEmpty() && this.A03.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.A00 = 3;
            AnonymousClass3BF.A00().A01(this.A05.A02, this);
        }
    }

    public final synchronized void A01(int i2, String str) {
        SparseArray sparseArray;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i3 = this.A00;
        if (i3 == 0) {
            throw new IllegalStateException();
        } else if (i3 == 1 || i3 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.A00 = 4;
            AnonymousClass3BF.A00().A01(this.A05.A02, this);
            C14520pJ r3 = new C14520pJ(i2, str);
            Queue<C14480pF> queue = this.A04;
            for (C14480pF A012 : queue) {
                A012.A01(r3);
            }
            queue.clear();
            int i4 = 0;
            while (true) {
                sparseArray = this.A03;
                if (i4 >= sparseArray.size()) {
                    break;
                }
                ((C14480pF) sparseArray.valueAt(i4)).A01(r3);
                i4++;
            }
            sparseArray.clear();
        } else if (i3 == 3) {
            this.A00 = 4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
        r2 = r7.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0058, code lost:
        if (r2.getBoolean("unsupported", false) == false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005a, code lost:
        r4.A01(new X.C14520pJ(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0065, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0066, code lost:
        r4.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0069, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(android.os.Message r7) {
        /*
            r6 = this;
            int r5 = r7.arg1
            java.lang.String r2 = "MessengerIpcClient"
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r2, r0)
            if (r0 == 0) goto L_0x0021
            r0 = 41
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Received response to request: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r2, r0)
        L_0x0021:
            monitor-enter(r6)
            android.util.SparseArray r0 = r6.A03     // Catch:{ all -> 0x006a }
            java.lang.Object r4 = r0.get(r5)     // Catch:{ all -> 0x006a }
            X.0pF r4 = (X.C14480pF) r4     // Catch:{ all -> 0x006a }
            r3 = 1
            if (r4 != 0) goto L_0x0045
            r0 = 50
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x006a }
            r1.<init>(r0)     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "Received response for unknown request: "
            r1.append(r0)     // Catch:{ all -> 0x006a }
            r1.append(r5)     // Catch:{ all -> 0x006a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x006a }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x006a }
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            return r3
        L_0x0045:
            r0.remove(r5)     // Catch:{ all -> 0x006a }
            r6.A00()     // Catch:{ all -> 0x006a }
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            android.os.Bundle r2 = r7.getData()
            java.lang.String r1 = "unsupported"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 == 0) goto L_0x0066
            r2 = 4
            java.lang.String r1 = "Not supported by GmsCore"
            X.0pJ r0 = new X.0pJ
            r0.<init>(r2, r1)
            r4.A01(r0)
            return r3
        L_0x0066:
            r4.A00(r2)
            return r3
        L_0x006a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x006a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15500rE.A02(android.os.Message):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A03(X.C14480pF r10) {
        /*
            r9 = this;
            r6 = r9
            monitor-enter(r6)
            int r0 = r9.A00     // Catch:{ all -> 0x007f }
            r3 = 2
            r2 = 0
            r8 = 1
            if (r0 == 0) goto L_0x0027
            if (r0 == r8) goto L_0x0021
            if (r0 == r3) goto L_0x000f
            monitor-exit(r6)
            return r2
        L_0x000f:
            java.util.Queue r0 = r9.A04     // Catch:{ all -> 0x007f }
            r0.add(r10)     // Catch:{ all -> 0x007f }
            X.0pD r0 = r9.A05     // Catch:{ all -> 0x007f }
            java.util.concurrent.ScheduledExecutorService r1 = r0.A03     // Catch:{ all -> 0x007f }
            X.3HV r0 = new X.3HV     // Catch:{ all -> 0x007f }
            r0.<init>(r9)     // Catch:{ all -> 0x007f }
            r1.execute(r0)     // Catch:{ all -> 0x007f }
            goto L_0x0077
        L_0x0021:
            java.util.Queue r0 = r9.A04     // Catch:{ all -> 0x007f }
            r0.add(r10)     // Catch:{ all -> 0x007f }
            goto L_0x0077
        L_0x0027:
            java.util.Queue r0 = r9.A04     // Catch:{ all -> 0x007f }
            r0.add(r10)     // Catch:{ all -> 0x007f }
            int r0 = r9.A00     // Catch:{ all -> 0x007f }
            if (r0 != 0) goto L_0x0079
            java.lang.String r1 = "MessengerIpcClient"
            boolean r0 = android.util.Log.isLoggable(r1, r3)     // Catch:{ all -> 0x007f }
            if (r0 == 0) goto L_0x003d
            java.lang.String r0 = "Starting bind to GmsCore"
            android.util.Log.v(r1, r0)     // Catch:{ all -> 0x007f }
        L_0x003d:
            r9.A00 = r8     // Catch:{ all -> 0x007f }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x007f }
            r5.<init>(r0)     // Catch:{ all -> 0x007f }
            java.lang.String r0 = "com.google.android.gms"
            r5.setPackage(r0)     // Catch:{ all -> 0x007f }
            X.3BF r3 = X.AnonymousClass3BF.A00()     // Catch:{ all -> 0x007f }
            X.0pD r1 = r9.A05     // Catch:{ all -> 0x007f }
            android.content.Context r4 = r1.A02     // Catch:{ all -> 0x007f }
            java.lang.Class r0 = r4.getClass()     // Catch:{ all -> 0x007f }
            java.lang.String r7 = r0.getName()     // Catch:{ all -> 0x007f }
            boolean r0 = r3.A02(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x007f }
            if (r0 != 0) goto L_0x0067
            java.lang.String r0 = "Unable to bind to service"
            r9.A01(r2, r0)     // Catch:{ all -> 0x007f }
            goto L_0x0077
        L_0x0067:
            java.util.concurrent.ScheduledExecutorService r4 = r1.A03     // Catch:{ all -> 0x007f }
            r0 = 21
            com.facebook.redex.RunnableRunnableShape1S0100000_I0 r3 = new com.facebook.redex.RunnableRunnableShape1S0100000_I0     // Catch:{ all -> 0x007f }
            r3.<init>((java.lang.Object) r9, (int) r0)     // Catch:{ all -> 0x007f }
            r1 = 30
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x007f }
            r4.schedule(r3, r1, r0)     // Catch:{ all -> 0x007f }
        L_0x0077:
            monitor-exit(r6)
            return r8
        L_0x0079:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007f }
            r0.<init>()     // Catch:{ all -> 0x007f }
            throw r0     // Catch:{ all -> 0x007f }
        L_0x007f:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15500rE.A03(X.0pF):boolean");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.A05.A03.execute(new RunnableRunnableShape2S0200000_I0(iBinder, 10, this));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.A05.A03.execute(new RunnableRunnableShape1S0100000_I0((Object) this, 19));
    }
}

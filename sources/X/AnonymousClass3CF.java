package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.3CF  reason: invalid class name */
public final class AnonymousClass3CF implements ServiceConnection {
    public AnonymousClass3LR A00;
    public boolean A01 = false;
    public final Context A02;
    public final Intent A03;
    public final Queue A04 = new ArrayDeque();
    public final ScheduledExecutorService A05;

    public AnonymousClass3CF(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new C14160oi("Firebase-FirebaseInstanceIdServiceConnection"));
        Context applicationContext = context.getApplicationContext();
        this.A02 = applicationContext;
        this.A03 = C13700nu.A02("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.A05 = scheduledThreadPoolExecutor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0083, code lost:
        if (android.util.Log.isLoggable("FirebaseInstanceId", 3) == false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0087, code lost:
        r5 = X.AnonymousClass000.A1P(r11.A01 ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r1 = X.C13690nt.A0g(39);
        r1.append("binder is dead. start connection? ");
        r1.append(r5);
        android.util.Log.d("FirebaseInstanceId", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a2, code lost:
        if (r11.A01 != false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a4, code lost:
        r11.A01 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r5 = X.AnonymousClass3BF.A00();
        r6 = r11.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b8, code lost:
        if (r5.A02(r6, r11.A03, r8, X.AnonymousClass000.A0d(r6), 65) != false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ba, code lost:
        android.util.Log.e("FirebaseInstanceId", "binding to the service failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c0, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        android.util.Log.e("FirebaseInstanceId", "Exception while binding the service", r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A00() {
        /*
            r11 = this;
            r8 = r11
            monitor-enter(r8)
            java.lang.String r4 = "FirebaseInstanceId"
            r6 = 3
            boolean r0 = android.util.Log.isLoggable(r4, r6)     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = "flush queue called"
            android.util.Log.d(r4, r0)     // Catch:{ all -> 0x00da }
        L_0x0010:
            java.util.Queue r2 = r11.A04     // Catch:{ all -> 0x00da }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x00d8
            boolean r0 = android.util.Log.isLoggable(r4, r6)     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = "found intent to be delivered"
            android.util.Log.d(r4, r0)     // Catch:{ all -> 0x00da }
        L_0x0023:
            X.3LR r0 = r11.A00     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x007d
            boolean r0 = r0.isBinderAlive()     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x007d
            boolean r0 = android.util.Log.isLoggable(r4, r6)     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = "binder is alive, sending the intent."
            android.util.Log.d(r4, r0)     // Catch:{ all -> 0x00da }
        L_0x0038:
            java.lang.Object r7 = r2.poll()     // Catch:{ all -> 0x00da }
            X.4RR r7 = (X.AnonymousClass4RR) r7     // Catch:{ all -> 0x00da }
            X.3LR r2 = r11.A00     // Catch:{ all -> 0x00da }
            int r1 = android.os.Binder.getCallingUid()     // Catch:{ all -> 0x00da }
            int r0 = android.os.Process.myUid()     // Catch:{ all -> 0x00da }
            if (r1 != r0) goto L_0x0075
            boolean r0 = android.util.Log.isLoggable(r4, r6)     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "service received new intent via bind strategy"
            android.util.Log.d(r4, r0)     // Catch:{ all -> 0x00da }
        L_0x0056:
            X.4CB r0 = r2.A00     // Catch:{ all -> 0x00da }
            android.content.Intent r1 = r7.A02     // Catch:{ all -> 0x00da }
            X.2n5 r0 = r0.A00     // Catch:{ all -> 0x00da }
            X.0on r5 = r0.A00(r1)     // Catch:{ all -> 0x00da }
            java.util.concurrent.Executor r3 = X.C14390p5.A00     // Catch:{ all -> 0x00da }
            X.4sw r2 = new X.4sw     // Catch:{ all -> 0x00da }
            r2.<init>(r7)     // Catch:{ all -> 0x00da }
            X.0oq r1 = r5.A03     // Catch:{ all -> 0x00da }
            X.4t7 r0 = new X.4t7     // Catch:{ all -> 0x00da }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x00da }
            r1.A00(r0)     // Catch:{ all -> 0x00da }
            r5.A04()     // Catch:{ all -> 0x00da }
            goto L_0x0010
        L_0x0075:
            java.lang.String r1 = "Binding only allowed within app"
            java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch:{ all -> 0x00da }
            r0.<init>(r1)     // Catch:{ all -> 0x00da }
            throw r0     // Catch:{ all -> 0x00da }
        L_0x007d:
            boolean r0 = android.util.Log.isLoggable(r4, r6)     // Catch:{ all -> 0x00da }
            r3 = 0
            r6 = 1
            if (r0 == 0) goto L_0x00a0
            boolean r0 = r11.A01     // Catch:{ all -> 0x00da }
            boolean r5 = X.AnonymousClass000.A1P(r0)
            r0 = 39
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "binder is dead. start connection? "
            r1.append(r0)     // Catch:{ all -> 0x00da }
            r1.append(r5)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00da }
            android.util.Log.d(r4, r0)     // Catch:{ all -> 0x00da }
        L_0x00a0:
            boolean r0 = r11.A01     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x00d8
            r11.A01 = r6     // Catch:{ all -> 0x00da }
            X.3BF r5 = X.AnonymousClass3BF.A00()     // Catch:{ SecurityException -> 0x00c0 }
            android.content.Context r6 = r11.A02     // Catch:{ SecurityException -> 0x00c0 }
            android.content.Intent r7 = r11.A03     // Catch:{ SecurityException -> 0x00c0 }
            r10 = 65
            java.lang.String r9 = X.AnonymousClass000.A0d(r6)     // Catch:{ SecurityException -> 0x00c0 }
            boolean r0 = r5.A02(r6, r7, r8, r9, r10)     // Catch:{ SecurityException -> 0x00c0 }
            if (r0 != 0) goto L_0x00d8
            java.lang.String r0 = "binding to the service failed"
            android.util.Log.e(r4, r0)     // Catch:{ SecurityException -> 0x00c0 }
            goto L_0x00c6
        L_0x00c0:
            r1 = move-exception
            java.lang.String r0 = "Exception while binding the service"
            android.util.Log.e(r4, r0, r1)     // Catch:{ all -> 0x00da }
        L_0x00c6:
            r11.A01 = r3     // Catch:{ all -> 0x00da }
        L_0x00c8:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x00d8
            java.lang.Object r0 = r2.poll()     // Catch:{ all -> 0x00da }
            X.4RR r0 = (X.AnonymousClass4RR) r0     // Catch:{ all -> 0x00da }
            r0.A00()     // Catch:{ all -> 0x00da }
            goto L_0x00c8
        L_0x00d8:
            monitor-exit(r8)
            return
        L_0x00da:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CF.A00():void");
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder A0g = C13690nt.A0g(valueOf.length() + 20);
            A0g.append("onServiceConnected: ");
            Log.d("FirebaseInstanceId", AnonymousClass000.A0h(valueOf, A0g));
        }
        this.A01 = false;
        if (!(iBinder instanceof AnonymousClass3LR)) {
            String valueOf2 = String.valueOf(iBinder);
            StringBuilder A0g2 = C13690nt.A0g(valueOf2.length() + 28);
            A0g2.append("Invalid service connection: ");
            Log.e("FirebaseInstanceId", AnonymousClass000.A0h(valueOf2, A0g2));
            while (true) {
                Queue queue = this.A04;
                if (queue.isEmpty()) {
                    break;
                }
                ((AnonymousClass4RR) queue.poll()).A00();
            }
        } else {
            this.A00 = (AnonymousClass3LR) iBinder;
            A00();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder A0g = C13690nt.A0g(valueOf.length() + 23);
            A0g.append("onServiceDisconnected: ");
            Log.d("FirebaseInstanceId", AnonymousClass000.A0h(valueOf, A0g));
        }
        A00();
    }
}

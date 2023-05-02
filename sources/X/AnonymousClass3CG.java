package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService;
import com.whatsapp.util.Log;

/* renamed from: X.3CG  reason: invalid class name */
public class AnonymousClass3CG implements ServiceConnection {
    public IInterface A00;
    public C799041u A01;
    public AnonymousClass4F8 A02;
    public final Context A03;
    public final C16300so A04;
    public final AnonymousClass4F7 A05;
    public final Object A06 = C13690nt.A0Y();

    public AnonymousClass3CG(Context context, C16300so r3, AnonymousClass4F7 r4, AnonymousClass4F8 r5) {
        this.A03 = context;
        this.A04 = r3;
        this.A05 = r4;
        this.A02 = r5;
        this.A01 = C799041u.NEW;
    }

    public void A00(String str) {
        String A0h = AnonymousClass000.A0h("GoogleMigrateClient", AnonymousClass000.A0r("svc-connection/detach-binder; service="));
        StringBuilder A0q = AnonymousClass000.A0q(A0h);
        A0q.append(", reason=");
        Log.i(AnonymousClass000.A0h(str, A0q));
        synchronized (this.A06) {
            C799041u r2 = this.A01;
            if (!(r2 == C799041u.CONNECTING || r2 == C799041u.CONNECTED)) {
                StringBuilder A0q2 = AnonymousClass000.A0q(A0h);
                A0q2.append(", reason=");
                A0q2.append(str);
                Log.e(AnonymousClass000.A0e(r2, ", detached while in wrong state=", A0q2));
                C16300so r3 = this.A04;
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append("reason=");
                A0o.append(str);
                A0o.append(", unexpected state=");
                r3.AcB("svc-connection-detach-binder-failure", AnonymousClass000.A0f(this.A01, A0o), false);
            }
        }
        A01(true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003c, code lost:
        if (r8 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        r4 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0042, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r4.A01 == r7) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        r3 = r4.A05;
        r1 = X.AnonymousClass000.A0o();
        r1.append("name=");
        r3.AcB("svc-client-close-unexpected-connection", X.AnonymousClass000.A0h("GoogleMigrateClient", r1), false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        r4.A01 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0037, code lost:
        r7.A03.unbindService(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(boolean r8) {
        /*
            r7 = this;
            java.lang.String r0 = "svc-connection/close; service="
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r5 = "GoogleMigrateClient"
            java.lang.String r6 = X.AnonymousClass000.A0h(r5, r0)
            com.whatsapp.util.Log.i((java.lang.String) r6)
            java.lang.Object r4 = r7.A06
            monitor-enter(r4)
            X.41u r1 = r7.A01     // Catch:{ all -> 0x0067 }
            X.41u r0 = X.C799041u.CLOSED     // Catch:{ all -> 0x0067 }
            if (r1 != r0) goto L_0x001b
            monitor-exit(r4)     // Catch:{ all -> 0x0067 }
            return
        L_0x001b:
            X.4F8 r3 = r7.A02     // Catch:{ all -> 0x0067 }
            r2 = 0
            r7.A02 = r2     // Catch:{ all -> 0x0067 }
            r7.A01 = r0     // Catch:{ all -> 0x0067 }
            r4.notifyAll()     // Catch:{ all -> 0x0067 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r6)     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = " -> state="
            r1.append(r0)     // Catch:{ all -> 0x0067 }
            X.41u r0 = r7.A01     // Catch:{ all -> 0x0067 }
            r1.append(r0)     // Catch:{ all -> 0x0067 }
            X.C13680ns.A1V(r1)     // Catch:{ all -> 0x0067 }
            monitor-exit(r4)     // Catch:{ all -> 0x0067 }
            android.content.Context r0 = r7.A03
            r0.unbindService(r7)
            if (r8 == 0) goto L_0x0066
            if (r3 == 0) goto L_0x0066
            X.1NJ r4 = r3.A00
            monitor-enter(r4)
            X.3CG r0 = r4.A01     // Catch:{ all -> 0x0063 }
            if (r0 == r7) goto L_0x005f
            X.0so r3 = r4.A05     // Catch:{ all -> 0x0063 }
            java.lang.String r2 = "svc-client-close-unexpected-connection"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "name="
            r1.append(r0)     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = X.AnonymousClass000.A0h(r5, r1)     // Catch:{ all -> 0x0063 }
            r0 = 0
            r3.AcB(r2, r1, r0)     // Catch:{ all -> 0x0063 }
        L_0x005d:
            monitor-exit(r4)     // Catch:{ all -> 0x0063 }
            goto L_0x0062
        L_0x005f:
            r4.A01 = r2     // Catch:{ all -> 0x0063 }
            goto L_0x005d
        L_0x0062:
            return
        L_0x0063:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0063 }
            throw r0
        L_0x0066:
            return
        L_0x0067:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0067 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CG.A01(boolean):void");
    }

    public void onBindingDied(ComponentName componentName) {
        A00("binder-died");
    }

    public void onNullBinding(ComponentName componentName) {
        A00("binder-null");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z2;
        if (iBinder != null) {
            String A0h = AnonymousClass000.A0h("GoogleMigrateClient", AnonymousClass000.A0r("svc-connection/attach-binder; service="));
            Log.i(A0h);
            Object obj = this.A06;
            synchronized (obj) {
                C799041u r2 = this.A01;
                z2 = false;
                if (r2 == C799041u.CONNECTING) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService");
                    this.A00 = (queryLocalInterface == null || !(queryLocalInterface instanceof IAppDataReaderService)) ? new C96154ns(iBinder) : (IAppDataReaderService) queryLocalInterface;
                    this.A01 = C799041u.CONNECTED;
                    obj.notifyAll();
                    StringBuilder A0q = AnonymousClass000.A0q(A0h);
                    A0q.append(" -> state=");
                    A0q.append(this.A01);
                    C13680ns.A1V(A0q);
                } else {
                    Log.e(AnonymousClass000.A0e(r2, ", attached while in a wrong state=", AnonymousClass000.A0q(A0h)));
                    C16300so r3 = this.A04;
                    StringBuilder A0o = AnonymousClass000.A0o();
                    A0o.append("unexpected state=");
                    r3.AcB("svc-connection-attach-binder-failure", AnonymousClass000.A0f(this.A01, A0o), false);
                    z2 = true;
                }
            }
            if (z2) {
                A01(true);
                return;
            }
            return;
        }
        A00("binder-null-on-connect");
    }

    public void onServiceDisconnected(ComponentName componentName) {
        A00("disconnected");
    }
}

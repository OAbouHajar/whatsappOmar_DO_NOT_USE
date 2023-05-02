package com.google.android.gms.internal.gtm;

import X.AnonymousClass000;
import X.C13710nw;
import X.C15000qA;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Looper;
import com.facebook.redex.RunnableRunnableShape12S0200000_I1;

public final class zzcb implements ServiceConnection {
    public final /* synthetic */ zzcc zza;
    public volatile boolean zzb;
    public volatile zzey zzc;

    public zzcb(zzcc zzcc) {
        this.zza = zzcc;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:10|(1:12)(1:13)|14|15|20|21|(4:23|(1:25)(1:26)|29|30)|27|28|29|30) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0045 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0081 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r6, android.os.IBinder r7) {
        /*
            r5 = this;
            java.lang.String r2 = "AnalyticsServiceConnection.onServiceConnected"
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r1 != r0) goto L_0x0092
            monitor-enter(r5)
            if (r7 != 0) goto L_0x0017
            com.google.android.gms.internal.gtm.zzcc r1 = r5.zza     // Catch:{ all -> 0x008a }
            java.lang.String r0 = "Service connected with null binder"
            r1.zzJ(r0)     // Catch:{ all -> 0x008a }
            goto L_0x0085
        L_0x0017:
            r3 = 0
            java.lang.String r2 = r7.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x0044 }
            java.lang.String r1 = "com.google.android.gms.analytics.internal.IAnalyticsService"
            boolean r0 = r1.equals(r2)     // Catch:{ RemoteException -> 0x0044 }
            if (r0 == 0) goto L_0x003c
            android.os.IInterface r4 = r7.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x0044 }
            boolean r0 = r4 instanceof com.google.android.gms.internal.gtm.zzey     // Catch:{ RemoteException -> 0x0044 }
            if (r0 == 0) goto L_0x002f
            com.google.android.gms.internal.gtm.zzey r4 = (com.google.android.gms.internal.gtm.zzey) r4     // Catch:{ RemoteException -> 0x0044 }
            goto L_0x0034
        L_0x002f:
            com.google.android.gms.internal.gtm.zzey r4 = new com.google.android.gms.internal.gtm.zzey     // Catch:{ RemoteException -> 0x0044 }
            r4.<init>(r7)     // Catch:{ RemoteException -> 0x0044 }
        L_0x0034:
            com.google.android.gms.internal.gtm.zzcc r1 = r5.zza     // Catch:{ RemoteException -> 0x0045 }
            java.lang.String r0 = "Bound to IAnalyticsService interface"
            r1.zzO(r0)     // Catch:{ RemoteException -> 0x0045 }
            goto L_0x004c
        L_0x003c:
            com.google.android.gms.internal.gtm.zzcc r1 = r5.zza     // Catch:{ RemoteException -> 0x0044 }
            java.lang.String r0 = "Got binder with a wrong descriptor"
            r1.zzK(r0, r2)     // Catch:{ RemoteException -> 0x0044 }
            goto L_0x0072
        L_0x0044:
            r4 = r3
        L_0x0045:
            com.google.android.gms.internal.gtm.zzcc r1 = r5.zza     // Catch:{ all -> 0x008a }
            java.lang.String r0 = "Service connect failed to get IAnalyticsService"
            r1.zzJ(r0)     // Catch:{ all -> 0x008a }
        L_0x004c:
            if (r4 == 0) goto L_0x0072
            boolean r0 = r5.zzb     // Catch:{ all -> 0x008a }
            if (r0 != 0) goto L_0x006f
            com.google.android.gms.internal.gtm.zzcc r1 = r5.zza     // Catch:{ all -> 0x008a }
            java.lang.String r0 = "onServiceConnected received after the timeout limit"
            r1.zzR(r0)     // Catch:{ all -> 0x008a }
            com.google.android.gms.internal.gtm.zzcc r0 = r5.zza     // Catch:{ all -> 0x008a }
            com.google.android.gms.internal.gtm.zzbv r0 = r0.zza     // Catch:{ all -> 0x008a }
            X.0qA r2 = r0.zzg     // Catch:{ all -> 0x008a }
            X.C13710nw.A01(r2)     // Catch:{ all -> 0x008a }
            r0 = 17
            com.facebook.redex.RunnableRunnableShape12S0200000_I1 r1 = new com.facebook.redex.RunnableRunnableShape12S0200000_I1     // Catch:{ all -> 0x008a }
            r1.<init>(r5, r4, r3, r0)     // Catch:{ all -> 0x008a }
            X.0qB r0 = r2.A03     // Catch:{ all -> 0x008a }
            r0.submit(r1)     // Catch:{ all -> 0x008a }
            goto L_0x0081
        L_0x006f:
            r5.zzc = r4     // Catch:{ all -> 0x008a }
            goto L_0x0081
        L_0x0072:
            X.3BF r3 = X.AnonymousClass3BF.A00()     // Catch:{ IllegalArgumentException -> 0x0081 }
            com.google.android.gms.internal.gtm.zzcc r2 = r5.zza     // Catch:{ IllegalArgumentException -> 0x0081 }
            com.google.android.gms.internal.gtm.zzbv r0 = r2.zza     // Catch:{ IllegalArgumentException -> 0x0081 }
            android.content.Context r1 = r0.zzb     // Catch:{ IllegalArgumentException -> 0x0081 }
            com.google.android.gms.internal.gtm.zzcb r0 = r2.zza     // Catch:{ IllegalArgumentException -> 0x0081 }
            r3.A01(r1, r0)     // Catch:{ IllegalArgumentException -> 0x0081 }
        L_0x0081:
            r5.notifyAll()     // Catch:{ all -> 0x008f }
            goto L_0x0088
        L_0x0085:
            r5.notifyAll()     // Catch:{ all -> 0x008f }
        L_0x0088:
            monitor-exit(r5)     // Catch:{ all -> 0x008f }
            return
        L_0x008a:
            r0 = move-exception
            r5.notifyAll()     // Catch:{ all -> 0x008f }
            throw r0     // Catch:{ all -> 0x008f }
        L_0x008f:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x008f }
            throw r0
        L_0x0092:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzcb.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            C15000qA r2 = this.zza.zza.zzg;
            C13710nw.A01(r2);
            r2.A03.submit(new RunnableRunnableShape12S0200000_I1(componentName, 18, this));
            return;
        }
        throw AnonymousClass000.A0V("AnalyticsServiceConnection.onServiceDisconnected");
    }
}

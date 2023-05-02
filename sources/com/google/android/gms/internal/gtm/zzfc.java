package com.google.android.gms.internal.gtm;

import X.C13710nw;
import android.content.BroadcastReceiver;

public final class zzfc extends BroadcastReceiver {
    public static final String zza = zzfc.class.getName();
    public final zzbv zzb;
    public boolean zzc;
    public boolean zzd;

    public zzfc(zzbv zzbv) {
        C13710nw.A01(zzbv);
        this.zzb = zzbv;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003f, code lost:
        if (r0.isConnected() == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            com.google.android.gms.internal.gtm.zzbv r0 = r5.zzb
            com.google.android.gms.internal.gtm.zzfb r0 = r0.zzf
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)
            com.google.android.gms.internal.gtm.zzbv r0 = r5.zzb
            com.google.android.gms.internal.gtm.zzbq r0 = r0.zzh
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)
            java.lang.String r2 = r7.getAction()
            com.google.android.gms.internal.gtm.zzbv r1 = r5.zzb
            com.google.android.gms.internal.gtm.zzfb r0 = r1.zzf
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)
            com.google.android.gms.internal.gtm.zzfb r1 = r1.zzf
            java.lang.String r0 = "NetworkBroadcastReceiver received action"
            r1.zzP(r0, r2)
            java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x006d
            com.google.android.gms.internal.gtm.zzbv r0 = r5.zzb
            android.content.Context r1 = r0.zzb
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x0041 }
            if (r0 == 0) goto L_0x0041
            boolean r0 = r0.isConnected()     // Catch:{ SecurityException -> 0x0041 }
            r4 = 1
            if (r0 != 0) goto L_0x0042
        L_0x0041:
            r4 = 0
        L_0x0042:
            boolean r0 = r5.zzd
            if (r0 == r4) goto L_0x00b1
            r5.zzd = r4
            com.google.android.gms.internal.gtm.zzbv r1 = r5.zzb
            com.google.android.gms.internal.gtm.zzbq r0 = r1.zzh
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)
            com.google.android.gms.internal.gtm.zzbq r3 = r1.zzh
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.String r0 = "Network connectivity status changed"
            r3.zzP(r0, r1)
            com.google.android.gms.internal.gtm.zzbv r0 = r3.zza
            X.0qA r2 = r0.zzg
            X.C13710nw.A01(r2)
            r0 = 2
            com.facebook.redex.RunnableRunnableShape17S0100000_I1 r1 = new com.facebook.redex.RunnableRunnableShape17S0100000_I1
            r1.<init>(r3, r4, r0)
            X.0qB r0 = r2.A03
            r0.submit(r1)
            return
        L_0x006d:
            java.lang.String r0 = "com.google.analytics.RADIO_POWERED"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x00b7
            java.lang.String r0 = zza
            boolean r0 = r7.hasExtra(r0)
            if (r0 != 0) goto L_0x00b1
            com.google.android.gms.internal.gtm.zzbv r1 = r5.zzb
            com.google.android.gms.internal.gtm.zzbq r0 = r1.zzh
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)
            com.google.android.gms.internal.gtm.zzbq r1 = r1.zzh
            java.lang.String r0 = "Radio powered up"
            r1.zzO(r0)
            r1.zzW()
            com.google.android.gms.internal.gtm.zzbv r0 = r1.zza
            android.content.Context r3 = r0.zzb
            boolean r0 = com.google.android.gms.internal.gtm.zzfi.zza(r3)
            if (r0 == 0) goto L_0x00b2
            boolean r0 = com.google.android.gms.internal.gtm.zzfn.zzh(r3)
            if (r0 == 0) goto L_0x00b2
            java.lang.String r0 = "com.google.android.gms.analytics.ANALYTICS_DISPATCH"
            android.content.Intent r2 = X.C13700nu.A02(r0)
            java.lang.String r1 = "com.google.android.gms.analytics.AnalyticsService"
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r3, r1)
            r2.setComponent(r0)
            r3.startService(r2)
        L_0x00b1:
            return
        L_0x00b2:
            r0 = 0
            r1.zze(r0)
            return
        L_0x00b7:
            com.google.android.gms.internal.gtm.zzbv r1 = r5.zzb
            com.google.android.gms.internal.gtm.zzfb r0 = r1.zzf
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)
            com.google.android.gms.internal.gtm.zzfb r1 = r1.zzf
            java.lang.String r0 = "NetworkBroadcastReceiver received unknown action"
            r1.zzS(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfc.onReceive(android.content.Context, android.content.Intent):void");
    }
}

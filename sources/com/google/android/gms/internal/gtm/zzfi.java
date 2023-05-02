package com.google.android.gms.internal.gtm;

import X.C15550rJ;

public final class zzfi {
    public static final Object zza = new Object();
    public static C15550rJ zzb;
    public static Boolean zzc;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r0.enabled == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean zza(android.content.Context r4) {
        /*
            X.C13710nw.A01(r4)
            java.lang.Boolean r0 = zzc
            if (r0 == 0) goto L_0x000c
            boolean r1 = r0.booleanValue()
            return r1
        L_0x000c:
            java.lang.String r3 = "com.google.android.gms.analytics.AnalyticsReceiver"
            r2 = 0
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0023 }
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0023 }
            r0.<init>(r4, r3)     // Catch:{ NameNotFoundException -> 0x0023 }
            android.content.pm.ActivityInfo r0 = r1.getReceiverInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x0023 }
            if (r0 == 0) goto L_0x0023
            boolean r0 = r0.enabled     // Catch:{ NameNotFoundException -> 0x0023 }
            r1 = 1
            if (r0 != 0) goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            zzc = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.gtm.zzfi.zza(android.content.Context):boolean");
    }
}

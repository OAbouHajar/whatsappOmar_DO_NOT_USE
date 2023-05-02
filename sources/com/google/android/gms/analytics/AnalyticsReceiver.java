package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import com.google.android.gms.internal.gtm.zzfi;

public final class AnalyticsReceiver extends BroadcastReceiver {
    public zzfi A00;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void onReceive(android.content.Context r7, android.content.Intent r8) {
        /*
            r6 = this;
            com.google.android.gms.internal.gtm.zzfi r0 = r6.A00
            if (r0 != 0) goto L_0x000b
            com.google.android.gms.internal.gtm.zzfi r0 = new com.google.android.gms.internal.gtm.zzfi
            r0.<init>()
            r6.A00 = r0
        L_0x000b:
            com.google.android.gms.internal.gtm.zzbv r1 = com.google.android.gms.internal.gtm.zzbv.zzg(r7)
            com.google.android.gms.internal.gtm.zzfb r0 = r1.zzf
            com.google.android.gms.internal.gtm.zzbv.zzs(r0)
            com.google.android.gms.internal.gtm.zzfb r4 = r1.zzf
            if (r8 != 0) goto L_0x001e
            java.lang.String r0 = "AnalyticsReceiver called with null intent"
            r4.zzR(r0)
        L_0x001d:
            return
        L_0x001e:
            java.lang.String r1 = r8.getAction()
            java.lang.String r0 = "Local AnalyticsReceiver got"
            r4.zzP(r0, r1)
            java.lang.String r3 = "com.google.android.gms.analytics.ANALYTICS_DISPATCH"
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L_0x001d
            boolean r5 = com.google.android.gms.internal.gtm.zzfn.zzh(r7)
            android.content.Intent r2 = X.C13700nu.A02(r3)
            java.lang.String r1 = "com.google.android.gms.analytics.AnalyticsService"
            android.content.ComponentName r0 = new android.content.ComponentName
            r0.<init>(r7, r1)
            r2.setComponent(r0)
            r2.setAction(r3)
            java.lang.Object r3 = com.google.android.gms.internal.gtm.zzfi.zza
            monitor-enter(r3)
            r7.startService(r2)     // Catch:{ all -> 0x0073 }
            if (r5 == 0) goto L_0x0071
            X.0rJ r0 = com.google.android.gms.internal.gtm.zzfi.zzb     // Catch:{ SecurityException -> 0x006c }
            if (r0 != 0) goto L_0x0064
            java.lang.String r0 = "Analytics WakeLock"
            X.0rJ r2 = new X.0rJ     // Catch:{ SecurityException -> 0x006c }
            r2.<init>(r7, r0)     // Catch:{ SecurityException -> 0x006c }
            com.google.android.gms.internal.gtm.zzfi.zzb = r2     // Catch:{ SecurityException -> 0x006c }
            r0 = 0
            java.lang.Object r1 = r2.A0B     // Catch:{ SecurityException -> 0x006c }
            monitor-enter(r1)     // Catch:{ SecurityException -> 0x006c }
            r2.A08 = r0     // Catch:{ all -> 0x0061 }
            monitor-exit(r1)     // Catch:{ all -> 0x0061 }
            goto L_0x0064
        L_0x0061:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0061 }
            throw r0     // Catch:{ SecurityException -> 0x006c }
        L_0x0064:
            X.0rJ r2 = com.google.android.gms.internal.gtm.zzfi.zzb     // Catch:{ SecurityException -> 0x006c }
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.A02(r0)     // Catch:{ SecurityException -> 0x006c }
            goto L_0x0071
        L_0x006c:
            java.lang.String r0 = "Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions."
            r4.zzR(r0)     // Catch:{ all -> 0x0073 }
        L_0x0071:
            monitor-exit(r3)     // Catch:{ all -> 0x0073 }
            return
        L_0x0073:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0073 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.analytics.AnalyticsReceiver.onReceive(android.content.Context, android.content.Intent):void");
    }
}

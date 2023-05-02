package X;

import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2GS  reason: invalid class name */
public class AnonymousClass2GS {
    public static final Set A00 = new HashSet();

    public static Object A00(AnonymousClass4PQ r1, AnonymousClass2GJ r2, String str) {
        return A01(r1, r2, str, 14);
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static java.lang.Object A01(X.AnonymousClass4PQ r9, X.AnonymousClass2GJ r10, java.lang.String r11, int r12) {
        /*
            java.lang.String r4 = "gdrive-retry-task/execute/attempt-"
            java.util.Random r3 = new java.util.Random
            r3.<init>()
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            X.1ue r2 = new X.1ue
            r2.<init>(r3, r12, r0)
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00ff }
            java.util.Set r0 = A00     // Catch:{ all -> 0x00ff }
            monitor-enter(r0)     // Catch:{ all -> 0x00ff }
            r0.add(r5)     // Catch:{ all -> 0x00f9 }
            monitor-exit(r0)     // Catch:{ all -> 0x00f9 }
            r0.size()     // Catch:{ all -> 0x00ff }
            r3 = 0
        L_0x001e:
            r8 = 0
            if (r10 == 0) goto L_0x003d
            boolean r0 = r10.A05()     // Catch:{ all -> 0x00ff }
            if (r0 != 0) goto L_0x003d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ff }
            r1.<init>()     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = "gdrive-retry-task/condition-failed/"
            r1.append(r0)     // Catch:{ all -> 0x00ff }
            r1.append(r10)     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00ff }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ff }
            goto L_0x00f5
        L_0x003d:
            r7 = -1
            monitor-enter(r2)     // Catch:{ 1da -> 0x0068 }
            int r0 = r2.A00     // Catch:{ all -> 0x0065 }
            monitor-exit(r2)     // Catch:{ 1da -> 0x0068 }
            java.lang.Object r6 = r9.A00(r0)     // Catch:{ 1da -> 0x0068 }
            if (r6 == 0) goto L_0x0072
            if (r0 <= 0) goto L_0x00c5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1da -> 0x0068 }
            r1.<init>()     // Catch:{ 1da -> 0x0068 }
            r1.append(r4)     // Catch:{ 1da -> 0x0068 }
            r1.append(r0)     // Catch:{ 1da -> 0x0068 }
            java.lang.String r0 = "/success: "
            r1.append(r0)     // Catch:{ 1da -> 0x0068 }
            r1.append(r11)     // Catch:{ 1da -> 0x0068 }
            java.lang.String r0 = r1.toString()     // Catch:{ 1da -> 0x0068 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1da -> 0x0068 }
            goto L_0x00c5
        L_0x0065:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ 1da -> 0x0068 }
            throw r0     // Catch:{ 1da -> 0x0068 }
        L_0x0068:
            r1 = move-exception
            int r3 = r3 + 1
            java.lang.String r0 = "gdrive-retry-task/execute"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00ff }
            int r7 = r1.retryAfter     // Catch:{ all -> 0x00ff }
        L_0x0072:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ff }
            r1.<init>()     // Catch:{ all -> 0x00ff }
            r1.append(r4)     // Catch:{ all -> 0x00ff }
            monitor-enter(r2)     // Catch:{ all -> 0x00ff }
            int r0 = r2.A00     // Catch:{ all -> 0x00fc }
            monitor-exit(r2)     // Catch:{ all -> 0x00ff }
            r1.append(r0)     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = "/failed: "
            r1.append(r0)     // Catch:{ all -> 0x00ff }
            r1.append(r11)     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00ff }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00ff }
            java.lang.Long r6 = r2.A00()     // Catch:{ all -> 0x00ff }
            if (r6 == 0) goto L_0x00d0
            if (r7 <= 0) goto L_0x00a3
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00ff }
            long r0 = (long) r7     // Catch:{ all -> 0x00ff }
            long r0 = r6.toMillis(r0)     // Catch:{ all -> 0x00ff }
            java.lang.Long r6 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00ff }
        L_0x00a3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x00c9 }
            r1.<init>()     // Catch:{ InterruptedException -> 0x00c9 }
            java.lang.String r0 = "gdrive/gdrive-retry-task backoff for "
            r1.append(r0)     // Catch:{ InterruptedException -> 0x00c9 }
            r1.append(r6)     // Catch:{ InterruptedException -> 0x00c9 }
            java.lang.String r0 = " milliseconds"
            r1.append(r0)     // Catch:{ InterruptedException -> 0x00c9 }
            java.lang.String r0 = r1.toString()     // Catch:{ InterruptedException -> 0x00c9 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x00c9 }
            long r0 = r6.longValue()     // Catch:{ InterruptedException -> 0x00c9 }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x00c9 }
            goto L_0x001e
        L_0x00c5:
            A03(r5)
            return r6
        L_0x00c9:
            r1 = move-exception
            java.lang.String r0 = "gdrive-retry-task/interrupted"
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x00ff }
            goto L_0x00f5
        L_0x00d0:
            if (r3 <= 0) goto L_0x00f5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ff }
            r1.<init>()     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = "Google Drive failures/total attempts: "
            r1.append(r0)     // Catch:{ all -> 0x00ff }
            r1.append(r3)     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ all -> 0x00ff }
            monitor-enter(r2)     // Catch:{ all -> 0x00ff }
            int r0 = r2.A00     // Catch:{ all -> 0x00fc }
            monitor-exit(r2)     // Catch:{ all -> 0x00ff }
            r1.append(r0)     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00ff }
            X.3iS r1 = new X.3iS     // Catch:{ all -> 0x00ff }
            r1.<init>(r0)     // Catch:{ all -> 0x00ff }
            goto L_0x00fe
        L_0x00f5:
            A03(r5)
            return r8
        L_0x00f9:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00f9 }
            goto L_0x00fe
        L_0x00fc:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00ff }
        L_0x00fe:
            throw r1     // Catch:{ all -> 0x00ff }
        L_0x00ff:
            r1 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            A03(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2GS.A01(X.4PQ, X.2GJ, java.lang.String, int):java.lang.Object");
    }

    public static void A02() {
        Set<Thread> set = A00;
        synchronized (set) {
            for (Thread interrupt : set) {
                interrupt.interrupt();
            }
        }
        StringBuilder sb = new StringBuilder("gdrive-retry-task/interrupt-active-tasks/size/");
        sb.append(set.size());
        Log.i(sb.toString());
    }

    public static void A03(Thread thread) {
        Set set = A00;
        synchronized (set) {
            set.remove(thread);
        }
        set.size();
    }
}

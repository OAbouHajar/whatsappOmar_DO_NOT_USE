package X;

/* renamed from: X.0fn  reason: invalid class name and case insensitive filesystem */
public class C09610fn implements Runnable {
    public final /* synthetic */ C06250Uz A00;

    public C09610fn(C06250Uz r1) {
        this.A00 = r1;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void run() {
        /*
            r4 = this;
            X.0Uz r3 = r4.A00
            X.0Um r0 = r3.A03
            if (r0 == 0) goto L_0x0057
            X.0Um r0 = r3.A03
            java.lang.Object r2 = r0.A00
            if (r2 == 0) goto L_0x0028
            monitor-enter(r3)
            java.util.Set r1 = r3.A02     // Catch:{ all -> 0x0054 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0054 }
            r0.<init>(r1)     // Catch:{ all -> 0x0054 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0054 }
        L_0x0018:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x0052
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0054 }
            X.0ki r0 = (X.C12630ki) r0     // Catch:{ all -> 0x0054 }
            r0.AWP(r2)     // Catch:{ all -> 0x0054 }
            goto L_0x0018
        L_0x0028:
            java.lang.Throwable r2 = r0.A01
            monitor-enter(r3)
            java.util.Set r0 = r3.A01     // Catch:{ all -> 0x0054 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0054 }
            r1.<init>(r0)     // Catch:{ all -> 0x0054 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = "Lottie encountered an error but no failure listener was added:"
            X.C05770Sy.A01(r0, r2)     // Catch:{ all -> 0x0054 }
            goto L_0x0052
        L_0x003e:
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0054 }
        L_0x0042:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x0052
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0054 }
            X.0ki r0 = (X.C12630ki) r0     // Catch:{ all -> 0x0054 }
            r0.AWP(r2)     // Catch:{ all -> 0x0054 }
            goto L_0x0042
        L_0x0052:
            monitor-exit(r3)
            return
        L_0x0054:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0057:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09610fn.run():void");
    }
}

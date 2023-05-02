package X;

/* renamed from: X.131  reason: invalid class name */
public class AnonymousClass131 {
    public final C16920ts A00;
    public final C15810rt A01;
    public final AnonymousClass11J A02;
    public final C216314v A03;
    public final AnonymousClass19X A04;
    public final C16900tq A05;
    public final AnonymousClass1HF A06;
    public final AnonymousClass17C A07;
    public final AnonymousClass11G A08;
    public final C17580vJ A09;
    public final AnonymousClass15H A0A;

    public AnonymousClass131(C16920ts r1, C15810rt r2, AnonymousClass11J r3, C216314v r4, AnonymousClass19X r5, C16900tq r6, AnonymousClass1HF r7, AnonymousClass17C r8, AnonymousClass11G r9, C17580vJ r10, AnonymousClass15H r11) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A08 = r9;
        this.A06 = r7;
        this.A09 = r10;
        this.A07 = r8;
        this.A04 = r5;
        this.A05 = r6;
        this.A02 = r3;
        this.A0A = r11;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A00() {
        /*
            r4 = this;
            X.14v r1 = r4.A03
            java.util.Map r0 = r1.A04
            r0.clear()
            java.util.Map r0 = r1.A03
            r0.clear()
            X.1HF r3 = r4.A06
            X.03L r1 = r3.A00
            r0 = -1
            r1.A05(r0)
            X.1Pq r0 = r3.A06
            X.03L r1 = r0.A00
            monitor-enter(r1)
            r2 = -1
            r1.A05(r2)     // Catch:{ all -> 0x0094 }
            monitor-exit(r1)     // Catch:{ all -> 0x0094 }
            X.16V r1 = r3.A05
            X.17B r0 = r1.A02
            X.03L r0 = r0.A00
            r0.A05(r2)
            X.179 r0 = r1.A01
            X.03L r0 = r0.A00
            r0.A05(r2)
            X.11J r0 = r4.A02
            java.util.concurrent.ConcurrentHashMap r0 = r0.A03
            r0.clear()
            X.17C r0 = r4.A07
            r0.A01()
            X.0tq r1 = r4.A05
            r0 = 0
            r1.A04()
            r1.A01 = r0
            X.0rt r1 = r4.A01
            monitor-enter(r1)
            boolean r0 = r1.A00     // Catch:{ all -> 0x0091 }
            if (r0 == 0) goto L_0x0059
            monitor-enter(r1)     // Catch:{ all -> 0x0091 }
            java.util.concurrent.ConcurrentHashMap r0 = r1.A0C()     // Catch:{ all -> 0x0056 }
            r0.clear()     // Catch:{ all -> 0x0056 }
            r0 = 0
            r1.A00 = r0     // Catch:{ all -> 0x0056 }
            monitor-exit(r1)     // Catch:{ all -> 0x0091 }
            goto L_0x0059
        L_0x0056:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0091 }
            throw r0     // Catch:{ all -> 0x0091 }
        L_0x0059:
            monitor-exit(r1)
            X.0ts r1 = r4.A00
            monitor-enter(r1)
            java.util.Map r0 = r1.A06     // Catch:{ all -> 0x008e }
            r0.clear()     // Catch:{ all -> 0x008e }
            java.util.Map r0 = r1.A07     // Catch:{ all -> 0x008e }
            r0.clear()     // Catch:{ all -> 0x008e }
            monitor-exit(r1)     // Catch:{ all -> 0x008e }
            X.11G r1 = r4.A08
            java.util.concurrent.ConcurrentHashMap r0 = r1.A08
            if (r0 == 0) goto L_0x0073
            java.util.concurrent.ConcurrentHashMap r0 = r1.A08
            r0.clear()
        L_0x0073:
            X.0vJ r1 = r4.A09
            java.util.Map r0 = r1.A02
            r0.clear()
            java.util.Map r0 = r1.A03
            r0.clear()
            X.19X r0 = r4.A04
            java.util.Map r0 = r0.A01
            r0.clear()
            X.15H r0 = r4.A0A
            java.util.Map r0 = r0.A05
            r0.clear()
            return
        L_0x008e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008e }
            throw r0
        L_0x0091:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0094:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0094 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass131.A00():void");
    }
}

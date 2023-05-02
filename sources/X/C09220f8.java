package X;

/* renamed from: X.0f8  reason: invalid class name and case insensitive filesystem */
public class C09220f8 implements Runnable {
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void run() {
        /*
            r9 = this;
        L_0x0000:
            java.util.concurrent.BlockingQueue r0 = X.C03440In.A03     // Catch:{ InterruptedException -> 0x0000 }
            java.lang.Object r4 = r0.take()     // Catch:{ InterruptedException -> 0x0000 }
            X.0OV r4 = (X.AnonymousClass0OV) r4     // Catch:{ InterruptedException -> 0x0000 }
            r2 = 0
            java.lang.String r0 = r4.A01     // Catch:{ IOException -> 0x00dd, all -> 0x010a }
            if (r0 != 0) goto L_0x0017
            X.0V3 r1 = X.AnonymousClass0V3.A09     // Catch:{ IOException -> 0x00dd, all -> 0x010a }
            monitor-enter(r1)     // Catch:{ IOException -> 0x00dd, all -> 0x010a }
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            goto L_0x00f1
        L_0x0013:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0013 }
            goto L_0x00dc
        L_0x0017:
            X.0eu r6 = X.C03440In.A05     // Catch:{ IOException -> 0x00dd, all -> 0x010a }
            java.lang.String r7 = r4.A01     // Catch:{ IOException -> 0x00dd, all -> 0x010a }
            monitor-enter(r6)     // Catch:{ IOException -> 0x00dd, all -> 0x010a }
            java.io.Writer r0 = r6.A04     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00d3
            X.C09100eu.A04(r7)     // Catch:{ all -> 0x00da }
            java.util.LinkedHashMap r0 = r6.A0B     // Catch:{ all -> 0x00da }
            java.lang.Object r1 = r0.get(r7)     // Catch:{ all -> 0x00da }
            X.0QY r1 = (X.AnonymousClass0QY) r1     // Catch:{ all -> 0x00da }
            r3 = 0
            if (r1 != 0) goto L_0x005d
            X.0QY r1 = new X.0QY     // Catch:{ all -> 0x00da }
            r1.<init>(r6, r7)     // Catch:{ all -> 0x00da }
            r0.put(r7, r1)     // Catch:{ all -> 0x00da }
        L_0x0036:
            X.0Pt r3 = new X.0Pt     // Catch:{ all -> 0x00da }
            r3.<init>(r1, r6)     // Catch:{ all -> 0x00da }
            r1.A01 = r3     // Catch:{ all -> 0x00da }
            java.io.Writer r5 = r6.A04     // Catch:{ all -> 0x00da }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "DIRTY "
            r1.append(r0)     // Catch:{ all -> 0x00da }
            r1.append(r7)     // Catch:{ all -> 0x00da }
            r0 = 10
            r1.append(r0)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00da }
            r5.write(r0)     // Catch:{ all -> 0x00da }
            java.io.Writer r0 = r6.A04     // Catch:{ all -> 0x00da }
            r0.flush()     // Catch:{ all -> 0x00da }
            goto L_0x0061
        L_0x005d:
            X.0Pt r0 = r1.A01     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x0036
        L_0x0061:
            monitor-exit(r6)     // Catch:{ IOException -> 0x00dd, all -> 0x010a }
            if (r3 == 0) goto L_0x00f1
            r6 = 0
            X.0eu r5 = r3.A04     // Catch:{ IOException -> 0x00d0, all -> 0x00f6 }
            int r7 = r5.A06     // Catch:{ IOException -> 0x00d0, all -> 0x00f6 }
            if (r6 >= r7) goto L_0x00bd
            monitor-enter(r5)     // Catch:{ IOException -> 0x00d0, all -> 0x00f6 }
            X.0QY r7 = r3.A02     // Catch:{ all -> 0x00ba }
            X.0Pt r0 = r7.A01     // Catch:{ all -> 0x00ba }
            if (r0 != r3) goto L_0x00b4
            boolean r0 = r7.A02     // Catch:{ all -> 0x00ba }
            if (r0 != 0) goto L_0x007b
            boolean[] r1 = r3.A03     // Catch:{ all -> 0x00ba }
            r0 = 1
            r1[r6] = r0     // Catch:{ all -> 0x00ba }
        L_0x007b:
            java.io.File r1 = r7.A01()     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0085 }
            goto L_0x008f
        L_0x0085:
            java.io.File r0 = r5.A07     // Catch:{ all -> 0x00ba }
            r0.mkdirs()     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0095 }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0095 }
        L_0x008f:
            X.0J6 r8 = new X.0J6     // Catch:{ all -> 0x00ba }
            r8.<init>(r3, r0)     // Catch:{ all -> 0x00ba }
            goto L_0x0097
        L_0x0095:
            java.io.OutputStream r8 = X.C09100eu.A0E     // Catch:{ all -> 0x00ba }
        L_0x0097:
            monitor-exit(r5)     // Catch:{ all -> 0x00ba }
            r2 = r8
            byte[] r1 = r4.A02     // Catch:{ IOException -> 0x00d0, all -> 0x00f6 }
            int r0 = r4.A00     // Catch:{ IOException -> 0x00d0, all -> 0x00f6 }
            r8.write(r1, r6, r0)     // Catch:{ IOException -> 0x00d0, all -> 0x00f6 }
            boolean r0 = r3.A01     // Catch:{ IOException -> 0x00d0, all -> 0x00f6 }
            r1 = 1
            if (r0 == 0) goto L_0x00b0
            X.C09100eu.A00(r3, r5, r6)     // Catch:{ IOException -> 0x00d0, all -> 0x00f6 }
            java.lang.String r0 = r7.A03     // Catch:{ IOException -> 0x00d0, all -> 0x00f6 }
            r5.A07(r0)     // Catch:{ IOException -> 0x00d0, all -> 0x00f6 }
        L_0x00ad:
            r3.A00 = r1     // Catch:{ IOException -> 0x00d0, all -> 0x00f6 }
            goto L_0x00ee
        L_0x00b0:
            X.C09100eu.A00(r3, r5, r1)     // Catch:{ IOException -> 0x00d0, all -> 0x00f6 }
            goto L_0x00ad
        L_0x00b4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00ba }
            r0.<init>()     // Catch:{ all -> 0x00ba }
            throw r0     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00ba }
            goto L_0x00cf
        L_0x00bd:
            java.lang.String r0 = "Expected index "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ IOException -> 0x00d0, all -> 0x00f6 }
            r1.append(r6)     // Catch:{ IOException -> 0x00d0, all -> 0x00f6 }
            java.lang.String r0 = " to be greater than 0 and less than the maximum value count of "
            r1.append(r0)     // Catch:{ IOException -> 0x00d0, all -> 0x00f6 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0U(r1, r7)     // Catch:{ IOException -> 0x00d0, all -> 0x00f6 }
        L_0x00cf:
            throw r0     // Catch:{ IOException -> 0x00d0, all -> 0x00f6 }
        L_0x00d0:
            r8 = r2
            r2 = r3
            goto L_0x00de
        L_0x00d3:
            java.lang.String r0 = "cache is closed"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ all -> 0x00da }
            throw r0     // Catch:{ all -> 0x00da }
        L_0x00da:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ IOException -> 0x00dd, all -> 0x010a }
        L_0x00dc:
            throw r0     // Catch:{ IOException -> 0x00dd, all -> 0x010a }
        L_0x00dd:
            r8 = r2
        L_0x00de:
            X.0V3 r0 = X.AnonymousClass0V3.A0B     // Catch:{ all -> 0x00fa }
            r0.A02()     // Catch:{ all -> 0x00fa }
            if (r2 == 0) goto L_0x00ec
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x00ec
            r2.A00()     // Catch:{ IOException -> 0x00ec }
        L_0x00ec:
            if (r8 == 0) goto L_0x00f1
        L_0x00ee:
            r8.close()     // Catch:{ IOException -> 0x00f1 }
        L_0x00f1:
            X.C08760eG.A01(r4)
            goto L_0x0000
        L_0x00f6:
            r1 = move-exception
            r8 = r2
            r2 = r3
            goto L_0x00fd
        L_0x00fa:
            r1 = move-exception
            if (r2 == 0) goto L_0x0104
        L_0x00fd:
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x0104
            r2.A00()     // Catch:{ IOException -> 0x0104 }
        L_0x0104:
            if (r8 == 0) goto L_0x010b
            r8.close()     // Catch:{ IOException -> 0x010b }
            throw r1
        L_0x010a:
            r1 = move-exception
        L_0x010b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09220f8.run():void");
    }
}

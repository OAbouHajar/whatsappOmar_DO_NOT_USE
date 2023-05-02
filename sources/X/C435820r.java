package X;

/* renamed from: X.20r  reason: invalid class name and case insensitive filesystem */
public final class C435820r extends AnonymousClass1ZS {
    public final C14870pt A00;
    public final C14710pd A01;
    public final AnonymousClass1QP A02;
    public final C436620z A03;
    public final AnonymousClass4FH A04 = new AnonymousClass4FH();
    public volatile AnonymousClass4FG A05;
    public volatile boolean A06;

    public C435820r(C14870pt r2, C14710pd r3, AnonymousClass1QP r4, AnonymousClass4FG r5, C436620z r6) {
        super("StickerFramePreloader");
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = r6;
        this.A02 = r4;
        this.A05 = r5;
    }

    public void A00() {
        this.A06 = true;
        AnonymousClass20p r1 = this.A05.A00;
        r1.A00 = null;
        C436620z r12 = r1.A04;
        synchronized (r12) {
            r12.A00 = null;
        }
        interrupt();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void run() {
        /*
            r14 = this;
            r0 = 1
            android.os.Process.setThreadPriority(r0)
            r11 = 0
        L_0x0005:
            boolean r0 = r14.A06
            if (r0 != 0) goto L_0x01be
            X.20z r3 = r14.A03     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
            monitor-enter(r3)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
            java.util.PriorityQueue r2 = r3.A01     // Catch:{ all -> 0x01b0 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x01b0 }
            if (r0 == 0) goto L_0x0019
            r0 = 5000(0x1388, double:2.4703E-320)
            r3.wait(r0)     // Catch:{ all -> 0x01b0 }
        L_0x0019:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x01b0 }
            if (r0 != 0) goto L_0x0026
            java.lang.Object r10 = r2.remove()     // Catch:{ all -> 0x01b0 }
            X.54y r10 = (X.C1043454y) r10     // Catch:{ all -> 0x01b0 }
            goto L_0x002e
        L_0x0026:
            X.20r r0 = r3.A00     // Catch:{ all -> 0x01b0 }
            if (r0 == 0) goto L_0x002d
            r0.A00()     // Catch:{ all -> 0x01b0 }
        L_0x002d:
            r10 = 0
        L_0x002e:
            monitor-exit(r3)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
            X.0pd r2 = r14.A01     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
            r1 = 276(0x114, float:3.87E-43)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
            boolean r0 = r2.A0E(r0, r1)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
            if (r0 == 0) goto L_0x0063
            if (r10 == 0) goto L_0x0073
            X.4FH r4 = r14.A04     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
            X.4VG r0 = r10.A02     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
            int r3 = r0.A06     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
            monitor-enter(r4)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
            java.util.HashMap r2 = r4.A00     // Catch:{ all -> 0x01b3 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x01b3 }
            boolean r0 = r2.containsKey(r1)     // Catch:{ all -> 0x01b3 }
            if (r0 == 0) goto L_0x0057
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x01b3 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x01b3 }
            goto L_0x0060
        L_0x0057:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x01b3 }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r3, r0)     // Catch:{ all -> 0x01b3 }
            r2.put(r1, r0)     // Catch:{ all -> 0x01b3 }
        L_0x0060:
            monitor-exit(r4)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
            r11 = r0
            goto L_0x0073
        L_0x0063:
            if (r11 != 0) goto L_0x0073
            if (r10 == 0) goto L_0x0073
            X.4VG r0 = r10.A02     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
            int r2 = r0.A06     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
            int r1 = r0.A05     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
            android.graphics.Bitmap r11 = android.graphics.Bitmap.createBitmap(r2, r1, r0)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
        L_0x0073:
            boolean r0 = r14.A06     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
            if (r0 != 0) goto L_0x01be
            if (r10 == 0) goto L_0x0005
            X.4VG r9 = r10.A02     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
            X.1QP r8 = r14.A02     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
            monitor-enter(r9)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
            android.graphics.Bitmap r0 = r9.A01     // Catch:{ all -> 0x01ab }
            if (r0 != 0) goto L_0x009c
            int r2 = r9.A06     // Catch:{ all -> 0x01ab }
            int r1 = r9.A05     // Catch:{ all -> 0x01ab }
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x01ab }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r1, r0)     // Catch:{ all -> 0x01ab }
            r9.A01 = r0     // Catch:{ all -> 0x01ab }
            android.graphics.Canvas r3 = new android.graphics.Canvas     // Catch:{ all -> 0x01ab }
            r3.<init>(r0)     // Catch:{ all -> 0x01ab }
            r9.A03 = r3     // Catch:{ all -> 0x01ab }
            android.graphics.Bitmap r2 = r9.A08     // Catch:{ all -> 0x01ab }
            r1 = 0
            r0 = 0
            r3.drawBitmap(r2, r0, r0, r1)     // Catch:{ all -> 0x01ab }
        L_0x009c:
            android.graphics.Bitmap r0 = r9.A01     // Catch:{ all -> 0x01ad }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x01ad }
            android.graphics.Canvas r0 = r9.A03     // Catch:{ all -> 0x01ad }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x01ad }
            int r2 = r9.A00     // Catch:{ all -> 0x01ad }
            int r1 = r2 + 1
            int r0 = r9.A07     // Catch:{ all -> 0x01ad }
            int r1 = r1 % r0
            r9.A00 = r1     // Catch:{ all -> 0x01ad }
            com.facebook.animated.webp.WebPImage r1 = r9.A0A     // Catch:{ all -> 0x01ad }
            X.4Na r7 = r1.getFrameInfo(r2)     // Catch:{ all -> 0x01ad }
            int r0 = r9.A00     // Catch:{ all -> 0x01ad }
            com.facebook.animated.webp.WebPFrame r6 = r1.getFrame((int) r0)     // Catch:{ all -> 0x01ad }
            int r0 = r9.A00     // Catch:{ all -> 0x01ad }
            X.4Na r5 = r1.getFrameInfo(r0)     // Catch:{ all -> 0x01ad }
            int r2 = r9.A00     // Catch:{ all -> 0x01ad }
            if (r2 != 0) goto L_0x00c8
            android.graphics.Bitmap r1 = r9.A08     // Catch:{ all -> 0x01ad }
            goto L_0x00f8
        L_0x00c8:
            java.lang.String r0 = r9.A0B     // Catch:{ all -> 0x01ad }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ad }
            r1.<init>()     // Catch:{ all -> 0x01ad }
            r1.append(r0)     // Catch:{ all -> 0x01ad }
            java.lang.String r0 = "_frame_"
            r1.append(r0)     // Catch:{ all -> 0x01ad }
            r1.append(r2)     // Catch:{ all -> 0x01ad }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x01ad }
            X.1Cv r0 = r8.A00     // Catch:{ all -> 0x01ad }
            X.1kk r2 = r0.A03()     // Catch:{ all -> 0x01ad }
            java.lang.Object r1 = r2.A00(r3)     // Catch:{ all -> 0x01ad }
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch:{ all -> 0x01ad }
            if (r1 == 0) goto L_0x00f8
            boolean r0 = r1.isRecycled()     // Catch:{ all -> 0x01ad }
            if (r0 == 0) goto L_0x00f8
            X.1km r0 = r2.A02     // Catch:{ all -> 0x01ad }
            r0.A03(r3)     // Catch:{ all -> 0x01ad }
            r1 = 0
        L_0x00f8:
            r4 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0112
            r9.A02 = r1     // Catch:{ all -> 0x01ad }
            android.graphics.Bitmap r0 = r9.A01     // Catch:{ all -> 0x01ad }
            r0.eraseColor(r3)     // Catch:{ all -> 0x01ad }
            android.graphics.Canvas r2 = r9.A03     // Catch:{ all -> 0x01ad }
            android.graphics.Bitmap r1 = r9.A02     // Catch:{ all -> 0x01ad }
            r0 = 0
            r2.drawBitmap(r1, r0, r0, r4)     // Catch:{ all -> 0x01ad }
            r6.dispose()     // Catch:{ all -> 0x01ad }
            android.graphics.Bitmap r3 = r9.A02     // Catch:{ all -> 0x01ad }
            goto L_0x019c
        L_0x0112:
            r11.eraseColor(r3)     // Catch:{ all -> 0x01ad }
            int r0 = r6.getWidth()     // Catch:{ all -> 0x01ad }
            float r0 = (float) r0     // Catch:{ all -> 0x01ad }
            float r2 = r9.A04     // Catch:{ all -> 0x01ad }
            float r0 = r0 * r2
            double r0 = (double) r0     // Catch:{ all -> 0x01ad }
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ all -> 0x01ad }
            int r12 = (int) r0     // Catch:{ all -> 0x01ad }
            int r0 = r6.getHeight()     // Catch:{ all -> 0x01ad }
            float r0 = (float) r0     // Catch:{ all -> 0x01ad }
            float r0 = r0 * r2
            double r0 = (double) r0     // Catch:{ all -> 0x01ad }
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ all -> 0x01ad }
            int r13 = (int) r0     // Catch:{ all -> 0x01ad }
            r6.renderFrame(r12, r13, r11)     // Catch:{ all -> 0x01ad }
            X.41Q r1 = r7.A05     // Catch:{ all -> 0x01ad }
            X.41Q r0 = X.AnonymousClass41Q.DISPOSE_TO_BACKGROUND     // Catch:{ all -> 0x01ad }
            if (r1 != r0) goto L_0x013d
            android.graphics.Canvas r0 = r9.A03     // Catch:{ all -> 0x01ad }
            r9.A00(r0, r7)     // Catch:{ all -> 0x01ad }
        L_0x013d:
            X.41A r1 = r5.A04     // Catch:{ all -> 0x01ad }
            X.41A r0 = X.AnonymousClass41A.NO_BLEND     // Catch:{ all -> 0x01ad }
            if (r1 != r0) goto L_0x0148
            android.graphics.Canvas r0 = r9.A03     // Catch:{ all -> 0x01ad }
            r9.A00(r0, r5)     // Catch:{ all -> 0x01ad }
        L_0x0148:
            int r1 = r6.getXOffset()     // Catch:{ all -> 0x01ad }
            int r0 = r6.getYOffset()     // Catch:{ all -> 0x01ad }
            r6.dispose()     // Catch:{ all -> 0x01ad }
            android.graphics.Canvas r5 = r9.A03     // Catch:{ all -> 0x01ad }
            float r1 = (float) r1     // Catch:{ all -> 0x01ad }
            float r1 = r1 * r2
            float r0 = (float) r0     // Catch:{ all -> 0x01ad }
            float r0 = r0 * r2
            r5.drawBitmap(r11, r1, r0, r4)     // Catch:{ all -> 0x01ad }
            android.graphics.Bitmap r1 = r9.A01     // Catch:{ OutOfMemoryError -> 0x0190 }
            android.graphics.Bitmap$Config r0 = r1.getConfig()     // Catch:{ OutOfMemoryError -> 0x0190 }
            android.graphics.Bitmap r3 = r1.copy(r0, r3)     // Catch:{ OutOfMemoryError -> 0x0190 }
            r9.A02 = r3     // Catch:{ OutOfMemoryError -> 0x0190 }
            java.lang.String r0 = r9.A0B     // Catch:{ OutOfMemoryError -> 0x0190 }
            int r2 = r9.A00     // Catch:{ OutOfMemoryError -> 0x0190 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x0190 }
            r1.<init>()     // Catch:{ OutOfMemoryError -> 0x0190 }
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x0190 }
            java.lang.String r0 = "_frame_"
            r1.append(r0)     // Catch:{ OutOfMemoryError -> 0x0190 }
            r1.append(r2)     // Catch:{ OutOfMemoryError -> 0x0190 }
            java.lang.String r1 = r1.toString()     // Catch:{ OutOfMemoryError -> 0x0190 }
            boolean r0 = r3.isRecycled()     // Catch:{ OutOfMemoryError -> 0x0190 }
            if (r0 != 0) goto L_0x019a
            X.1Cv r0 = r8.A00     // Catch:{ OutOfMemoryError -> 0x0190 }
            X.1kk r0 = r0.A03()     // Catch:{ OutOfMemoryError -> 0x0190 }
            r0.A03(r1, r3)     // Catch:{ OutOfMemoryError -> 0x0190 }
            goto L_0x019a
        L_0x0190:
            r1 = move-exception
            android.graphics.Bitmap r0 = r9.A01     // Catch:{ all -> 0x01ad }
            r9.A02 = r0     // Catch:{ all -> 0x01ad }
            java.lang.String r0 = "AnimatedWebpRenderer/renderNextFrame/OutofMemoryError: "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01ad }
        L_0x019a:
            android.graphics.Bitmap r3 = r9.A02     // Catch:{ all -> 0x01ad }
        L_0x019c:
            monitor-exit(r9)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
            X.0pt r2 = r14.A00     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
            r1 = 49
            com.facebook.redex.RunnableRunnableShape10S0200000_I0_8 r0 = new com.facebook.redex.RunnableRunnableShape10S0200000_I0_8     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
            r0.<init>(r10, r1, r3)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
            r2.A0K(r0)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
            goto L_0x0005
        L_0x01ab:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01ad }
        L_0x01ad:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
            goto L_0x01b5
        L_0x01b0:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
            goto L_0x01b5
        L_0x01b3:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
        L_0x01b5:
            throw r0     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01b6 }
        L_0x01b6:
            r1 = move-exception
            java.lang.String r0 = "StickerFramePreloader/FrameLoaderThread failed to load frame "
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0005
        L_0x01be:
            X.0pd r2 = r14.A01
            r1 = 276(0x114, float:3.87E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x01fa
            X.4FH r4 = r14.A04
            monitor-enter(r4)
            java.util.HashMap r3 = r4.A00     // Catch:{ all -> 0x01f7 }
            java.util.Collection r0 = r3.values()     // Catch:{ all -> 0x01f7 }
            r0.size()     // Catch:{ all -> 0x01f7 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x01f7 }
        L_0x01da:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x01f7 }
            if (r0 == 0) goto L_0x01f2
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x01f7 }
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch:{ all -> 0x01f7 }
            if (r1 == 0) goto L_0x01da
            boolean r0 = r1.isRecycled()     // Catch:{ all -> 0x01f7 }
            if (r0 != 0) goto L_0x01da
            r1.recycle()     // Catch:{ all -> 0x01f7 }
            goto L_0x01da
        L_0x01f2:
            r3.clear()     // Catch:{ all -> 0x01f7 }
            monitor-exit(r4)
            return
        L_0x01f7:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x01fa:
            if (r11 == 0) goto L_0x01ff
            r11.recycle()
        L_0x01ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C435820r.run():void");
    }
}

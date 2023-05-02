package X;

import com.whatsapp.util.Log;

/* renamed from: X.3iK  reason: invalid class name and case insensitive filesystem */
public class C71003iK extends AnonymousClass2GJ {
    public C16600tK A00;
    public C19670yo A01;
    public C17190ug A02;
    public boolean A03 = true;
    public boolean A04 = true;
    public boolean A05 = true;
    public boolean A06 = true;
    public final Object A07 = C13690nt.A0Y();

    public C71003iK(C16600tK r2, C19670yo r3, C17190ug r4) {
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean A00() {
        boolean z2;
        synchronized (this.A07) {
            z2 = this.A03;
        }
        return z2;
    }

    public boolean A01() {
        boolean z2;
        synchronized (this.A07) {
            z2 = this.A04;
        }
        return z2;
    }

    public boolean A02() {
        boolean z2;
        synchronized (this.A07) {
            z2 = this.A05;
        }
        return z2;
    }

    public boolean A03() {
        boolean z2;
        synchronized (this.A07) {
            z2 = this.A06;
        }
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        if (r3.A03 == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A07
            monitor-enter(r2)
            boolean r0 = r3.A05     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0014
            boolean r0 = r3.A04     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0014
            boolean r0 = r3.A06     // Catch:{ all -> 0x0017 }
            if (r0 == 0) goto L_0x0014
            boolean r1 = r3.A03     // Catch:{ all -> 0x0017 }
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            return r0
        L_0x0017:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0017 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71003iK.A04():boolean");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:58:0x0068=Splitter:B:58:0x0068, B:50:0x005e=Splitter:B:50:0x005e} */
    public synchronized boolean A05() {
        /*
            r6 = this;
            monitor-enter(r6)
            r1 = r6
            boolean r0 = r6 instanceof X.C70873i4     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x0013
            X.3i4 r1 = (X.C70873i4) r1     // Catch:{ all -> 0x0069 }
            com.obwhatsapp.backup.google.workers.GoogleEncryptedReUploadWorker r0 = r1.A00     // Catch:{ all -> 0x0069 }
            X.0yo r0 = r0.A07     // Catch:{ all -> 0x0069 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0d     // Catch:{ all -> 0x0069 }
        L_0x000e:
            boolean r0 = r0.get()     // Catch:{ all -> 0x0069 }
            goto L_0x0018
        L_0x0013:
            X.0yo r0 = r6.A01     // Catch:{ all -> 0x0069 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0c     // Catch:{ all -> 0x0069 }
            goto L_0x000e
        L_0x0018:
            if (r0 != 0) goto L_0x0020
            java.lang.String r0 = "google-backup-worker-task-condition/block backup is not running"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0069 }
            goto L_0x0063
        L_0x0020:
            r6.A06()     // Catch:{ all -> 0x0069 }
            java.lang.Object r5 = r6.A07     // Catch:{ all -> 0x0069 }
            monitor-enter(r5)     // Catch:{ all -> 0x0069 }
            boolean r0 = r6.A06     // Catch:{ all -> 0x0066 }
            r4 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0039
            boolean r0 = r6.A04     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0039
            boolean r0 = r6.A05     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0039
            boolean r1 = r6.A03     // Catch:{ all -> 0x0066 }
            r0 = 1
            if (r1 != 0) goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            monitor-exit(r5)     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x005e
            java.lang.String r0 = "google-backup-worker-task-condition/reconnectXmppIfNeeded xmpp is not connected, reconnecting"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0069 }
            X.0ug r2 = r6.A02     // Catch:{ 1kR -> 0x0051 }
            r0 = 32000(0x7d00, double:1.581E-319)
            r2.A07(r0)     // Catch:{ 1kR -> 0x0051 }
            monitor-enter(r5)     // Catch:{ 1kR -> 0x0051 }
            r6.A06 = r4     // Catch:{ all -> 0x004e }
            monitor-exit(r5)     // Catch:{ all -> 0x004e }
            goto L_0x005e
        L_0x004e:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x004e }
            throw r0     // Catch:{ 1kR -> 0x0051 }
        L_0x0051:
            java.lang.String r0 = "google-backup-worker-task-condition/reconnectXmppIfNeeded xmpp reconnect wasn't successful"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0069 }
            monitor-enter(r5)     // Catch:{ all -> 0x0069 }
            r6.A06 = r3     // Catch:{ all -> 0x005b }
            monitor-exit(r5)     // Catch:{ all -> 0x005b }
            goto L_0x005e
        L_0x005b:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x005b }
            goto L_0x0068
        L_0x005e:
            boolean r0 = r6.A04()     // Catch:{ all -> 0x0069 }
            goto L_0x0064
        L_0x0063:
            r0 = 0
        L_0x0064:
            monitor-exit(r6)
            return r0
        L_0x0066:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0066 }
        L_0x0068:
            throw r0     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71003iK.A05():boolean");
    }

    public void A06() {
        synchronized (this.A07) {
            this.A06 = true;
            this.A05 = true;
            this.A03 = true;
            this.A04 = true;
            C19670yo r2 = this.A01;
            if (!r2.A09) {
                Log.i("google-backup-worker-task-condition/refreshConditions sd card is not available");
                this.A05 = false;
            }
            if (!r2.A0g.get()) {
                Log.i("google-backup-worker-task-condition/refreshConditions network is not available for backup");
                this.A04 = false;
            }
            if (!r2.A05) {
                Log.i("google-backup-worker-task-condition/refreshConditions battery is not available for backup");
                this.A03 = false;
            }
            if (!this.A00.A08()) {
                Log.i("google-backup-worker-task-condition/refreshConditions xmpp is not connected");
                this.A06 = false;
            }
        }
    }

    public String toString() {
        return "backup-condition-for-backup-worker";
    }
}

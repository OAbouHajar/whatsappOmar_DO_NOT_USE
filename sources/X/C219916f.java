package X;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;

/* renamed from: X.16f  reason: invalid class name and case insensitive filesystem */
public class C219916f implements SSLSessionContext {
    public C219816e A00;
    public final Map A01 = new C29311aQ(this);
    public volatile int A02 = 64;
    public volatile long A03 = 172800;

    public C219916f(C219816e r3) {
        this.A00 = r3;
    }

    public Enumeration getIds() {
        SSLSession[] sSLSessionArr;
        Map map = this.A01;
        synchronized (map) {
            sSLSessionArr = (SSLSession[]) map.values().toArray(new SSLSession[0]);
        }
        return new C29321aR(this, Arrays.asList(sSLSessionArr).iterator());
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized javax.net.ssl.SSLSession getSession(byte[] r15) {
        /*
            r14 = this;
            monitor-enter(r14)
            X.1aS r7 = new X.1aS     // Catch:{ all -> 0x00f3 }
            r7.<init>(r14, r15)     // Catch:{ all -> 0x00f3 }
            java.util.Map r3 = r14.A01     // Catch:{ 1aU -> 0x00d7 }
            monitor-enter(r3)     // Catch:{ 1aU -> 0x00d7 }
            java.lang.Object r6 = r3.get(r7)     // Catch:{ all -> 0x00d4 }
            X.1aT r6 = (X.C29341aT) r6     // Catch:{ all -> 0x00d4 }
            if (r6 != 0) goto L_0x0059
            X.16e r5 = r14.A00     // Catch:{ all -> 0x00d4 }
            if (r5 == 0) goto L_0x00d2
            monitor-enter(r5)     // Catch:{ all -> 0x00d4 }
            java.io.File r0 = r5.A01()     // Catch:{ all -> 0x0035 }
            if (r0 != 0) goto L_0x001e
            r4 = 0
            goto L_0x0031
        L_0x001e:
            java.io.File r2 = r5.A01()     // Catch:{ all -> 0x0035 }
            r0 = 10
            java.lang.String r1 = android.util.Base64.encodeToString(r15, r0)     // Catch:{ all -> 0x0035 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0035 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0035 }
            com.obwhatsapp.watls13.WtPersistentSession r4 = r5.A00(r0)     // Catch:{ all -> 0x0035 }
        L_0x0031:
            monitor-exit(r5)     // Catch:{ all -> 0x00d4 }
            if (r4 == 0) goto L_0x00d2
            goto L_0x0038
        L_0x0035:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00d4 }
            throw r0     // Catch:{ all -> 0x00d4 }
        L_0x0038:
            java.lang.String r2 = r4.A02     // Catch:{ all -> 0x00d4 }
            int r1 = r4.A00     // Catch:{ all -> 0x00d4 }
            java.lang.String r0 = r4.A01     // Catch:{ all -> 0x00d4 }
            X.1aT r6 = new X.1aT     // Catch:{ all -> 0x00d4 }
            r6.<init>(r14, r2, r0, r1)     // Catch:{ all -> 0x00d4 }
            java.util.Map r0 = r4.A04     // Catch:{ all -> 0x00d4 }
            r6.A08 = r0     // Catch:{ all -> 0x00d4 }
            java.util.LinkedHashSet r0 = r4.A03     // Catch:{ all -> 0x00d4 }
            r6.A07 = r0     // Catch:{ all -> 0x00d4 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00d4 }
            r6.A02 = r0     // Catch:{ all -> 0x00d4 }
            X.1aS r0 = new X.1aS     // Catch:{ all -> 0x00d4 }
            r0.<init>(r14, r15)     // Catch:{ all -> 0x00d4 }
            r3.put(r0, r6)     // Catch:{ all -> 0x00d4 }
        L_0x0059:
            boolean r0 = r6.isValid()     // Catch:{ all -> 0x00d4 }
            if (r0 == 0) goto L_0x00c6
            java.lang.String r9 = r6.getPeerHost()     // Catch:{ all -> 0x00d4 }
            int r13 = r6.getPeerPort()     // Catch:{ all -> 0x00d4 }
            java.lang.String r10 = r6.getCipherSuite()     // Catch:{ all -> 0x00d4 }
            X.1aT r5 = new X.1aT     // Catch:{ all -> 0x00d4 }
            r5.<init>(r14, r9, r10, r13)     // Catch:{ all -> 0x00d4 }
            java.util.LinkedHashSet r0 = r6.A07     // Catch:{ all -> 0x00d4 }
            r8 = 0
            if (r0 == 0) goto L_0x009d
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00d4 }
            if (r0 != 0) goto L_0x009d
            java.util.Random r2 = new java.util.Random     // Catch:{ all -> 0x00d4 }
            r2.<init>()     // Catch:{ all -> 0x00d4 }
            java.util.LinkedHashSet r1 = r6.A07     // Catch:{ all -> 0x00d4 }
            if (r1 == 0) goto L_0x009d
            r0 = 0
            com.obwhatsapp.net.tls13.WtCachedPsk[] r0 = new com.obwhatsapp.net.tls13.WtCachedPsk[r0]     // Catch:{ all -> 0x00d4 }
            java.lang.Object[] r4 = r1.toArray(r0)     // Catch:{ all -> 0x00d4 }
            com.obwhatsapp.net.tls13.WtCachedPsk[] r4 = (com.obwhatsapp.net.tls13.WtCachedPsk[]) r4     // Catch:{ all -> 0x00d4 }
            if (r4 == 0) goto L_0x009d
            int r0 = r4.length     // Catch:{ all -> 0x00d4 }
            int r2 = r2.nextInt(r0)     // Catch:{ all -> 0x00d4 }
            java.util.LinkedHashSet r1 = r6.A07     // Catch:{ all -> 0x00d4 }
            r0 = r4[r2]     // Catch:{ all -> 0x00d4 }
            r1.remove(r0)     // Catch:{ all -> 0x00d4 }
            r8 = r4[r2]     // Catch:{ all -> 0x00d4 }
        L_0x009d:
            java.util.Map r1 = r6.A08     // Catch:{ all -> 0x00d4 }
            byte r0 = r8.certsID     // Catch:{ all -> 0x00d4 }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x00d4 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00d4 }
            java.security.cert.Certificate[] r0 = (java.security.cert.Certificate[]) r0     // Catch:{ all -> 0x00d4 }
            if (r0 == 0) goto L_0x00b2
            r5.A03 = r8     // Catch:{ all -> 0x00d4 }
            r5.A01(r0)     // Catch:{ all -> 0x00d4 }
        L_0x00b2:
            X.16e r1 = r14.A00     // Catch:{ all -> 0x00d4 }
            if (r1 == 0) goto L_0x00c4
            byte[] r0 = r7.A01     // Catch:{ all -> 0x00d4 }
            java.util.LinkedHashSet r11 = r6.A07     // Catch:{ all -> 0x00d4 }
            java.util.Map r12 = r6.A08     // Catch:{ all -> 0x00d4 }
            com.obwhatsapp.watls13.WtPersistentSession r8 = new com.obwhatsapp.watls13.WtPersistentSession     // Catch:{ all -> 0x00d4 }
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00d4 }
            r1.A02(r8, r0)     // Catch:{ all -> 0x00d4 }
        L_0x00c4:
            monitor-exit(r3)     // Catch:{ all -> 0x00d4 }
            goto L_0x00f1
        L_0x00c6:
            r3.remove(r7)     // Catch:{ all -> 0x00d4 }
            X.16e r1 = r14.A00     // Catch:{ all -> 0x00d4 }
            if (r1 == 0) goto L_0x00d2
            byte[] r0 = r7.A01     // Catch:{ all -> 0x00d4 }
            r1.A03(r0)     // Catch:{ all -> 0x00d4 }
        L_0x00d2:
            monitor-exit(r3)     // Catch:{ all -> 0x00d4 }
            goto L_0x00f0
        L_0x00d4:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00d4 }
            throw r0     // Catch:{ 1aU -> 0x00d7 }
        L_0x00d7:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f3 }
            r1.<init>()     // Catch:{ all -> 0x00f3 }
            java.lang.String r0 = "Encountered Exception "
            r1.append(r0)     // Catch:{ all -> 0x00f3 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00f3 }
            r1.append(r0)     // Catch:{ all -> 0x00f3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00f3 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00f3 }
        L_0x00f0:
            r5 = 0
        L_0x00f1:
            monitor-exit(r14)
            return r5
        L_0x00f3:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C219916f.getSession(byte[]):javax.net.ssl.SSLSession");
    }

    public int getSessionCacheSize() {
        return this.A02;
    }

    public int getSessionTimeout() {
        return (int) this.A03;
    }

    public void setSessionCacheSize(int i2) {
        if (i2 >= 0) {
            this.A02 = i2;
            return;
        }
        throw new IllegalArgumentException("Cache size < 0");
    }

    public void setSessionTimeout(int i2) {
        if (i2 >= 0) {
            this.A03 = (long) i2;
            Map map = this.A01;
            synchronized (map) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    SSLSession sSLSession = (SSLSession) it.next();
                    if (!sSLSession.isValid()) {
                        it.remove();
                        C219816e r1 = this.A00;
                        if (r1 != null) {
                            r1.A03(sSLSession.getId());
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("Timeout < 0");
    }
}

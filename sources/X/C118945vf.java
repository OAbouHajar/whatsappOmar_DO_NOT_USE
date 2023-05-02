package X;

import android.os.Handler;
import android.util.Log;
import android.util.Pair;
import java.util.UUID;

/* renamed from: X.5vf  reason: invalid class name and case insensitive filesystem */
public class C118945vf {
    public C115745qF A00;
    public String A01;
    public final C119355wx A02;
    public volatile UUID A03;
    public volatile boolean A04;
    public volatile boolean A05;

    public C118945vf(C119355wx r1) {
        this.A02 = r1;
    }

    public UUID A00(Handler handler, String str) {
        UUID uuid;
        C119355wx r1 = this.A02;
        synchronized (r1) {
            if (this.A04) {
                A01(this.A01, str);
            }
            if (A03()) {
                A01(this.A01, str);
            }
            r1.A00 = handler;
            this.A01 = str;
            this.A04 = true;
            uuid = this.A03;
        }
        return uuid;
    }

    public final void A01(String str, String str2) {
        StringBuilder A0q = AnonymousClass000.A0q(str);
        A0q.append(" has been evicted. ");
        A0q.append(str2);
        Log.e("SessionManager", AnonymousClass000.A0h(" now owns the camera device", A0q));
        new Pair(str, str2);
        AnonymousClass5xH.A00();
        C115745qF r0 = this.A00;
        if (r0 != null) {
            C119355wx r2 = this.A02;
            C1216466h r1 = new C1216466h(r0, this, str, str2);
            synchronized (r2) {
                Handler handler = r2.A00;
                if (handler != null) {
                    handler.post(r1);
                } else {
                    AnonymousClass5xT.A00(r1);
                }
            }
            this.A00 = null;
        }
    }

    public void A02(UUID uuid) {
        C119355wx r2 = this.A02;
        synchronized (r2) {
            if (uuid != null) {
                if (uuid.equals(this.A03)) {
                    A03();
                    r2.A00 = null;
                    this.A00 = null;
                    this.A04 = false;
                }
            }
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final boolean A03() {
        /*
            r7 = this;
            r6 = 0
            java.util.UUID r0 = r7.A03
            if (r0 == 0) goto L_0x0042
            X.5wx r5 = r7.A02
            java.util.UUID r4 = r7.A03
            monitor-enter(r5)
            java.util.UUID r0 = r5.A01     // Catch:{ all -> 0x003e }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x0013
            goto L_0x0041
        L_0x0013:
            android.os.Handler r0 = r5.A03     // Catch:{ all -> 0x003e }
            boolean r3 = r0.hasMessages(r6, r4)     // Catch:{ all -> 0x003e }
            r0.removeCallbacksAndMessages(r4)     // Catch:{ all -> 0x003e }
            android.os.Handler r0 = r5.A00     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x002b
            boolean r0 = r0.hasMessages(r6, r4)     // Catch:{ all -> 0x003e }
            r3 = r3 | r0
            android.os.Handler r0 = r5.A00     // Catch:{ all -> 0x003e }
            r0.removeCallbacksAndMessages(r4)     // Catch:{ all -> 0x003e }
            goto L_0x0039
        L_0x002b:
            java.lang.Class<X.5xT> r2 = X.AnonymousClass5xT.class
            monitor-enter(r2)     // Catch:{ all -> 0x003e }
            android.os.Handler r1 = X.AnonymousClass5xT.A00     // Catch:{ all -> 0x003b }
            boolean r0 = r1.hasMessages(r6, r4)     // Catch:{ all -> 0x003b }
            r1.removeCallbacksAndMessages(r4)     // Catch:{ all -> 0x003b }
            monitor-exit(r2)     // Catch:{ all -> 0x003e }
            r3 = r3 | r0
        L_0x0039:
            monitor-exit(r5)
            goto L_0x0043
        L_0x003b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0041:
            monitor-exit(r5)
        L_0x0042:
            r3 = 0
        L_0x0043:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            r7.A03 = r0
            X.5wx r1 = r7.A02
            java.util.UUID r0 = r7.A03
            monitor-enter(r1)
            r1.A01 = r0     // Catch:{ all -> 0x0052 }
            monitor-exit(r1)
            return r3
        L_0x0052:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C118945vf.A03():boolean");
    }
}

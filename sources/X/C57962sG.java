package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* renamed from: X.2sG  reason: invalid class name and case insensitive filesystem */
public final class C57962sG extends C57972sH {
    public final AnonymousClass4N0 A00;
    public final AnonymousClass5M1 A01;
    public final String A02 = "locationServices";

    public C57962sG(Context context, Looper looper, C15650rc r12, C15670re r13, AnonymousClass4O1 r14) {
        super(context, looper, r12, r13, r14, 23);
        C98354sH r1 = new C98354sH(this);
        this.A01 = r1;
        this.A00 = new AnonymousClass4N0(context, r1);
    }

    public static /* synthetic */ void A01(C57962sG r0) {
        if (!r0.isConnected()) {
            throw AnonymousClass000.A0V("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public final Bundle A08() {
        Bundle A0D = C13690nt.A0D();
        A0D.putString("client_name", this.A02);
        return A0D;
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
    public final void A80() {
        /*
            r11 = this;
            X.4N0 r3 = r11.A00
            monitor-enter(r3)
            boolean r0 = r11.isConnected()     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0078
            java.util.Map r2 = r3.A02     // Catch:{ Exception -> 0x0070 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x0070 }
            java.util.Iterator r1 = X.C13680ns.A0q(r2)     // Catch:{ all -> 0x006d }
        L_0x0010:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x006d }
            r5 = 0
            if (r0 == 0) goto L_0x0038
            java.lang.Object r6 = r1.next()     // Catch:{ all -> 0x006d }
            X.3a8 r6 = (X.C66573a8) r6     // Catch:{ all -> 0x006d }
            if (r6 == 0) goto L_0x0010
            X.5M1 r0 = r3.A01     // Catch:{ all -> 0x006d }
            X.4sH r0 = (X.C98354sH) r0     // Catch:{ all -> 0x006d }
            X.2sG r0 = r0.A00     // Catch:{ all -> 0x006d }
            android.os.IInterface r0 = r0.A01()     // Catch:{ all -> 0x006d }
            X.5UF r0 = (X.AnonymousClass5UF) r0     // Catch:{ all -> 0x006d }
            r10 = 2
            r8 = r5
            r9 = r5
            X.3Xf r4 = new X.3Xf     // Catch:{ all -> 0x006d }
            r7 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x006d }
            r0.AjO(r4)     // Catch:{ all -> 0x006d }
            goto L_0x0010
        L_0x0038:
            r2.clear()     // Catch:{ all -> 0x006d }
            monitor-exit(r2)     // Catch:{ all -> 0x006d }
            java.util.Map r2 = r3.A04     // Catch:{ Exception -> 0x0070 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x0070 }
            java.util.Iterator r1 = X.C13680ns.A0q(r2)     // Catch:{ all -> 0x006a }
        L_0x0043:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x004d
            r1.next()     // Catch:{ all -> 0x006a }
            goto L_0x0043
        L_0x004d:
            r2.clear()     // Catch:{ all -> 0x006a }
            monitor-exit(r2)     // Catch:{ all -> 0x006a }
            java.util.Map r2 = r3.A03     // Catch:{ Exception -> 0x0070 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x0070 }
            java.util.Iterator r1 = X.C13680ns.A0q(r2)     // Catch:{ all -> 0x0067 }
        L_0x0058:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x0062
            r1.next()     // Catch:{ all -> 0x0067 }
            goto L_0x0058
        L_0x0062:
            r2.clear()     // Catch:{ all -> 0x0067 }
            monitor-exit(r2)     // Catch:{ all -> 0x0067 }
            goto L_0x0078
        L_0x0067:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0067 }
            goto L_0x006f
        L_0x006a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006a }
            goto L_0x006f
        L_0x006d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006d }
        L_0x006f:
            throw r0     // Catch:{ Exception -> 0x0070 }
        L_0x0070:
            r2 = move-exception
            java.lang.String r1 = "LocationClientImpl"
            java.lang.String r0 = "Client disconnected before listeners could be cleaned up"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x007d }
        L_0x0078:
            super.A80()     // Catch:{ all -> 0x007d }
            monitor-exit(r3)     // Catch:{ all -> 0x007d }
            return
        L_0x007d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x007d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57962sG.A80():void");
    }

    public final int ADl() {
        return 11717000;
    }
}

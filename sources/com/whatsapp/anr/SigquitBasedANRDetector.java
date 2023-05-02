package com.whatsapp.anr;

import X.C15900s5;
import X.C205810s;
import X.C32631gs;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.regex.Pattern;

public class SigquitBasedANRDetector {
    public HandlerThread A00;
    public String A01;
    public Pattern A02;
    public Pattern A03;
    public final C15900s5 A04;
    public final C205810s A05;
    public final C32631gs A06;
    public final Object A07;
    public final Object A08;
    public volatile Handler A09;
    public volatile boolean A0A;
    public volatile boolean A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r1.startsWith("0.") != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SigquitBasedANRDetector(X.C15900s5 r5, X.C205810s r6, X.AnonymousClass01V r7, X.C16980tz r8) {
        /*
            r4 = this;
            java.lang.String r0 = "java.vm.version"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            if (r1 == 0) goto L_0x0019
            java.lang.String r0 = "1."
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "0."
            boolean r0 = r1.startsWith(r0)
            r3 = 1
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r3 = 0
        L_0x001a:
            int r2 = android.os.Build.VERSION.SDK_INT
            android.content.Context r0 = r8.A00
            X.1gs r1 = new X.1gs
            r1.<init>(r0, r7)
            r4.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.A08 = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.A07 = r0
            r4.A05 = r6
            r4.A04 = r5
            r4.A06 = r1
            init(r4, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.anr.SigquitBasedANRDetector.<init>(X.0s5, X.10s, X.01V, X.0tz):void");
    }

    public static native void init(SigquitBasedANRDetector sigquitBasedANRDetector, boolean z2, int i2);

    public static native boolean startDetector();

    public static native void stopDetector();

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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void anrDetected(java.lang.String r6) {
        /*
            r5 = this;
            boolean r0 = android.os.Debug.isDebuggerConnected()
            if (r0 != 0) goto L_0x0094
            java.lang.String r4 = "SigquitBasedANRDetector"
            java.lang.String r0 = "On anrDetected call"
            android.util.Log.i(r4, r0)
            boolean r0 = r5.A0B
            if (r0 == 0) goto L_0x0094
            java.util.regex.Pattern r0 = r5.A02
            if (r0 != 0) goto L_0x001f
            r1 = 8
            java.lang.String r0 = "^$^\\s*(\"main\".*?$\\s*\\|\\s+group=\"main\"(?s).*?$^\\s*$)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            r5.A02 = r0
        L_0x001f:
            java.util.regex.Matcher r1 = r0.matcher(r6)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x0061
            r0 = 1
            java.lang.String r2 = r1.group(r0)
            if (r2 == 0) goto L_0x0061
            java.lang.String r1 = "ANR detected. Main thread: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r4, r0)
            java.util.regex.Pattern r0 = r5.A03
            if (r0 != 0) goto L_0x004f
            r1 = 8
            java.lang.String r0 = "^\\s*[ank#](?s).*"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            r5.A03 = r0
        L_0x004f:
            java.util.regex.Matcher r1 = r0.matcher(r2)
            boolean r0 = r1.find()
            if (r0 == 0) goto L_0x0061
            java.lang.String r3 = r1.group()
        L_0x005d:
            java.lang.Object r2 = r5.A07
            monitor-enter(r2)
            goto L_0x0063
        L_0x0061:
            r3 = 0
            goto L_0x005d
        L_0x0063:
            boolean r0 = r5.A0A     // Catch:{ all -> 0x0091 }
            r1 = 1
            if (r0 == 0) goto L_0x007a
            if (r3 == 0) goto L_0x0078
            java.lang.String r0 = r5.A01     // Catch:{ all -> 0x0091 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x0091 }
            if (r0 != 0) goto L_0x0078
            java.lang.String r0 = "Detected a new ANR before the end of the previous one"
            android.util.Log.w(r4, r0)     // Catch:{ all -> 0x0091 }
            goto L_0x007c
        L_0x0078:
            r1 = 0
            goto L_0x007c
        L_0x007a:
            r5.A0A = r1     // Catch:{ all -> 0x0091 }
        L_0x007c:
            r5.A01 = r3     // Catch:{ all -> 0x0091 }
            monitor-exit(r2)     // Catch:{ all -> 0x0091 }
            if (r1 == 0) goto L_0x0094
            android.os.Handler r0 = r5.A09
            if (r0 == 0) goto L_0x0094
            android.os.Handler r2 = r5.A09
            r1 = 0
            com.facebook.redex.RunnableRunnableShape0S2100000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S2100000_I0
            r0.<init>(r5, r6, r3, r1)
            r2.post(r0)
            return
        L_0x0091:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0091 }
            throw r0
        L_0x0094:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.anr.SigquitBasedANRDetector.anrDetected(java.lang.String):void");
    }
}

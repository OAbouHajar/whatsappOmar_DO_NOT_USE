package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.27x  reason: invalid class name and case insensitive filesystem */
public class C453127x implements Runnable {
    public final C452727t A00;
    public final /* synthetic */ C19600yh A01;

    public C453127x(C19600yh r1, C452727t r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public final void A00(AnonymousClass284 r7) {
        ArrayList arrayList = new ArrayList();
        C452727t r4 = this.A00;
        List<AnonymousClass28Q> list = r4.A03;
        for (AnonymousClass28Q r1 : list) {
            if (!r1.A00) {
                arrayList.add(r1);
                r1.A02(r7);
            }
        }
        list.removeAll(arrayList);
        if (!list.isEmpty()) {
            r4.A01 = false;
            this.A01.A01(r4);
        }
    }

    public final void A01(AnonymousClass284 r3) {
        for (C34421kE A02 : this.A00.A03) {
            A02.A02(r3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v167, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v31, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v33, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v40, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v41, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v42, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v43, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v44, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v45, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v44, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v45, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v46, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v361, resolved type: java.util.HashMap} */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:265:0x0728=Splitter:B:265:0x0728, B:920:0x1a49=Splitter:B:920:0x1a49} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:482:0x0d71=Splitter:B:482:0x0d71, B:780:0x181a=Splitter:B:780:0x181a} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:771:0x17e9=Splitter:B:771:0x17e9, B:795:0x1829=Splitter:B:795:0x1829} */
    public void run() {
        /*
            r88 = this;
            r87 = r88
            r0 = r87
            X.0yh r4 = r0.A01
            X.27t r3 = r0.A00
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0021
            X.0pd r2 = r4.A0N
            r1 = 560(0x230, float:7.85E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0021
            X.0tK r0 = r4.A04
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x0021
            return
        L_0x0021:
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A0U
            r23 = r0
            monitor-enter(r23)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x1a78 }
            r1.<init>()     // Catch:{ all -> 0x1a78 }
            java.lang.String r0 = "ContactSyncRequestExecutor/onStart "
            r1.append(r0)     // Catch:{ all -> 0x1a78 }
            r1.append(r3)     // Catch:{ all -> 0x1a78 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x1a78 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x1a78 }
            r1 = 1
            r0 = r23
            r0.set(r1)     // Catch:{ all -> 0x1a78 }
            X.27r r0 = r4.A0F     // Catch:{ all -> 0x1a78 }
            r20 = r0
            monitor-enter(r20)     // Catch:{ all -> 0x1a78 }
            java.util.Set r0 = r0.A02     // Catch:{ all -> 0x1a75 }
            r0.remove(r3)     // Catch:{ all -> 0x1a75 }
            r0 = r20
            java.util.Map r0 = r0.A01     // Catch:{ all -> 0x1a75 }
            r0.remove(r3)     // Catch:{ all -> 0x1a75 }
            r20.A00()     // Catch:{ all -> 0x1a75 }
            monitor-exit(r20)     // Catch:{ all -> 0x1a78 }
            monitor-enter(r20)     // Catch:{ all -> 0x1a78 }
            r0 = r20
            r0.A00 = r3     // Catch:{ all -> 0x1a75 }
            r20.A00()     // Catch:{ all -> 0x1a75 }
            monitor-exit(r20)     // Catch:{ all -> 0x1a78 }
            monitor-exit(r23)     // Catch:{ all -> 0x1a78 }
            X.0pt r0 = r4.A02
            r86 = r0
            X.16j r2 = r4.A0B
            r0 = 7
            com.facebook.redex.RunnableRunnableShape7S0100000_I0_6 r1 = new com.facebook.redex.RunnableRunnableShape7S0100000_I0_6
            r1.<init>(r2, r0)
            r0 = r86
            r0.A0K(r1)
            boolean r0 = r3.A0A
            r18 = r0
            boolean r0 = r3.A0G
            r19 = r0
            boolean r0 = r3.A0H
            r22 = r0
            boolean r2 = r3.A0F
            boolean r0 = r3.A09
            r21 = r0
            boolean r8 = r3.A0B
            boolean r10 = r3.A0E
            boolean r0 = r3.A0C
            r17 = r0
            boolean r0 = r3.A0D
            r16 = r0
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x00b2
            X.0sK r0 = r4.A03
            r0.A0B()
            com.obwhatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x00a3
            X.0sC r0 = r4.A0Q
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x00b2
        L_0x00a3:
            java.lang.String r0 = "ContactSyncRequestExecutor/registration not complete"
        L_0x00a5:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00a8:
            X.284 r5 = X.AnonymousClass284.A03
        L_0x00aa:
            r0 = r87
            r0.A01(r5)
        L_0x00af:
            monitor-enter(r23)
            goto L_0x1a14
        L_0x00b2:
            X.0wP r0 = r4.A08
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x00c7
            java.lang.String r0 = "ContactSyncRequestExecutor/no-network"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.284 r5 = X.AnonymousClass284.A04
            r0 = r87
            r0.A00(r5)
            goto L_0x00af
        L_0x00c7:
            X.0t3 r0 = r4.A0I
            long r0 = r0.A00()
            X.12D r5 = r4.A0C
            r85 = r5
            android.content.SharedPreferences r7 = r85.A01()
            java.lang.String r12 = "global_backoff_time"
            r5 = -1
            long r13 = r7.getLong(r12, r5)
            java.lang.String r45 = "ms"
            int r7 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x010f
            X.0pd r11 = r4.A0N
            r9 = 1297(0x511, float:1.817E-42)
            X.0tM r7 = X.C16620tM.A02
            boolean r7 = r11.A0E(r7, r9)
            if (r7 == 0) goto L_0x010f
            java.lang.String r2 = "ContactSyncRequestExecutor/global backoff for another "
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r2)
            android.content.SharedPreferences r2 = r85.A01()
            long r2 = r2.getLong(r12, r5)
            long r2 = r2 - r0
            r7.append(r2)
            r0 = r45
            r7.append(r0)
            java.lang.String r0 = r7.toString()
        L_0x010b:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x00a8
        L_0x010f:
            X.1kz r7 = r3.A02
            X.27z r6 = r7.mode
            X.27z r26 = X.C453327z.FULL
            r11 = 0
            r5 = r26
            if (r6 != r5) goto L_0x011b
            r11 = 1
        L_0x011b:
            java.lang.String r9 = "ContactSyncRequestExecutor/contact backoff for another "
            if (r11 == 0) goto L_0x033d
            if (r18 == 0) goto L_0x0153
            android.content.SharedPreferences r11 = r85.A01()
            java.lang.String r13 = "contact_sync_backoff"
            r5 = -1
            long r14 = r11.getLong(r13, r5)
            int r11 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x0153
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r9)
            android.content.SharedPreferences r11 = r85.A01()
            long r5 = r11.getLong(r13, r5)
            long r5 = r5 - r0
            r12.append(r5)
            r5 = r45
            r12.append(r5)
            java.lang.String r5 = r12.toString()
            com.whatsapp.util.Log.i((java.lang.String) r5)
            r18 = 0
        L_0x0153:
            if (r19 == 0) goto L_0x0187
            android.content.SharedPreferences r11 = r85.A01()
            java.lang.String r13 = "sidelist_sync_backoff"
            r5 = -1
            long r14 = r11.getLong(r13, r5)
            int r11 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x0187
            java.lang.String r11 = "ContactSyncRequestExecutor/sidelist backoff for another "
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r11)
            android.content.SharedPreferences r11 = r85.A01()
            long r5 = r11.getLong(r13, r5)
            long r5 = r5 - r0
            r12.append(r5)
            r5 = r45
            r12.append(r5)
            java.lang.String r5 = r12.toString()
            com.whatsapp.util.Log.i((java.lang.String) r5)
            r19 = 0
        L_0x0187:
            if (r22 == 0) goto L_0x01bb
            android.content.SharedPreferences r11 = r85.A01()
            java.lang.String r13 = "status_sync_backoff"
            r5 = -1
            long r14 = r11.getLong(r13, r5)
            int r11 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x01bb
            java.lang.String r11 = "ContactSyncRequestExecutor/status backoff for another "
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r11)
            android.content.SharedPreferences r11 = r85.A01()
            long r5 = r11.getLong(r13, r5)
            long r5 = r5 - r0
            r12.append(r5)
            r5 = r45
            r12.append(r5)
            java.lang.String r5 = r12.toString()
            com.whatsapp.util.Log.i((java.lang.String) r5)
            r22 = 0
        L_0x01bb:
            if (r2 == 0) goto L_0x01ec
            android.content.SharedPreferences r2 = r85.A01()
            java.lang.String r12 = "picture_sync_backoff"
            r5 = -1
            long r13 = r2.getLong(r12, r5)
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0329
            java.lang.String r2 = "ContactSyncRequestExecutor/picture backoff for another "
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r2)
            android.content.SharedPreferences r2 = r85.A01()
            long r5 = r2.getLong(r12, r5)
            long r5 = r5 - r0
            r11.append(r5)
            r2 = r45
            r11.append(r2)
            java.lang.String r2 = r11.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
        L_0x01ec:
            r55 = 0
        L_0x01ee:
            if (r21 == 0) goto L_0x0221
            android.content.SharedPreferences r2 = r85.A01()
            java.lang.String r12 = "business_sync_backoff"
            r5 = -1
            long r13 = r2.getLong(r12, r5)
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0221
            java.lang.String r2 = "ContactSyncRequestExecutor/business backoff for another "
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r2)
            android.content.SharedPreferences r2 = r85.A01()
            long r5 = r2.getLong(r12, r5)
            long r5 = r5 - r0
            r11.append(r5)
            r2 = r45
            r11.append(r2)
            java.lang.String r2 = r11.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            r21 = 0
        L_0x0221:
            if (r8 == 0) goto L_0x025e
            android.content.SharedPreferences r2 = r85.A01()
            java.lang.String r11 = "devices_sync_backoff"
            r5 = -1
            long r5 = r2.getLong(r11, r5)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0325
            X.27y r5 = r7.context
            X.27y r2 = X.C453227y.MESSAGE
            if (r5 == r2) goto L_0x0325
            X.27y r2 = X.C453227y.VOIP
            if (r5 == r2) goto L_0x0325
            java.lang.String r2 = "ContactSyncRequestExecutor/devices backoff for another "
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r2)
            android.content.SharedPreferences r2 = r85.A01()
            r5 = -1
            long r5 = r2.getLong(r11, r5)
            long r5 = r5 - r0
            r8.append(r5)
            r2 = r45
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
        L_0x025e:
            r57 = 0
        L_0x0260:
            if (r10 == 0) goto L_0x0291
            android.content.SharedPreferences r2 = r85.A01()
            java.lang.String r10 = "payment_sync_backoff"
            r5 = -1
            long r11 = r2.getLong(r10, r5)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0319
            java.lang.String r2 = "ContactSyncRequestExecutor/payment backoff for another "
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r2)
            android.content.SharedPreferences r2 = r85.A01()
            long r5 = r2.getLong(r10, r5)
            long r5 = r5 - r0
            r8.append(r5)
            r2 = r45
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
        L_0x0291:
            r58 = 0
        L_0x0293:
            if (r17 == 0) goto L_0x02c6
            android.content.SharedPreferences r2 = r85.A01()
            java.lang.String r10 = "disappearing_mode_sync_backoff"
            r5 = -1
            long r11 = r2.getLong(r10, r5)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x02c6
            java.lang.String r2 = "ContactSyncRequestExecutor/disappearing_mode backoff for another "
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r2)
            android.content.SharedPreferences r2 = r85.A01()
            long r5 = r2.getLong(r10, r5)
            long r5 = r5 - r0
            r8.append(r5)
            r2 = r45
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            r17 = 0
        L_0x02c6:
            android.content.SharedPreferences r8 = r85.A01()
            java.lang.String r2 = "lid_sync_backoff"
            r5 = -1
            long r5 = r8.getLong(r2, r5)
            if (r16 == 0) goto L_0x02f2
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x02f2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            long r5 = r5 - r0
            r2.append(r5)
            r5 = r45
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            r16 = 0
        L_0x02f2:
            X.0pd r2 = r4.A0N
            r84 = r2
            r6 = 1892(0x764, float:2.651E-42)
            X.0tM r29 = X.C16620tM.A02
            r5 = r2
            r2 = r29
            boolean r2 = r5.A0E(r2, r6)
            r16 = r16 & r2
            if (r18 != 0) goto L_0x0361
            if (r19 != 0) goto L_0x0361
            if (r55 != 0) goto L_0x0361
            if (r22 != 0) goto L_0x0361
            if (r21 != 0) goto L_0x0361
            if (r57 != 0) goto L_0x0361
            if (r58 != 0) goto L_0x0361
            if (r17 != 0) goto L_0x0361
            if (r16 != 0) goto L_0x0361
            java.lang.String r0 = "ContactSyncRequestExecutor/no syncing protocol should be requested at this moment due to error backoff"
            goto L_0x00a5
        L_0x0319:
            X.0w8 r2 = r4.A0O
            boolean r2 = r2.A08()
            r58 = 1
            if (r2 != 0) goto L_0x0293
            goto L_0x0291
        L_0x0325:
            r57 = 1
            goto L_0x0260
        L_0x0329:
            X.12B r2 = r4.A0P
            boolean r2 = r2.A05()
            if (r2 != 0) goto L_0x0339
            X.1kz r2 = X.C34861kz.A06
            if (r7 == r2) goto L_0x0339
            X.1kz r2 = X.C34861kz.A07
            if (r7 != r2) goto L_0x01ec
        L_0x0339:
            r55 = 1
            goto L_0x01ee
        L_0x033d:
            X.27z r5 = X.C453327z.DELTA
            if (r6 != r5) goto L_0x0187
            X.0pd r11 = r4.A0N
            r6 = 949(0x3b5, float:1.33E-42)
            X.0tM r5 = X.C16620tM.A02
            boolean r5 = r11.A0E(r5, r6)
            if (r5 == 0) goto L_0x0187
            android.content.SharedPreferences r12 = r85.A01()
            java.lang.String r11 = "delta_sync_backoff"
            r5 = -1
            long r11 = r12.getLong(r11, r5)
            int r5 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r5 <= 0) goto L_0x0187
            java.lang.String r0 = "ContactSyncRequestExecutor/delta sync backoff"
            goto L_0x010b
        L_0x0361:
            X.27d r2 = r4.A0D
            r83 = r2
            X.27b r9 = new X.27b
            r9.<init>()
            java.lang.String r2 = r7.toString()
            r9.A0I = r2
            boolean r2 = r3.A01
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r9.A02 = r2
            boolean r2 = r3.A06
            r30 = r2
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r30)
            r9.A01 = r2
            int r2 = r3.A00
            long r5 = (long) r2
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r9.A0E = r2
            boolean r2 = r3.A02()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r9.A03 = r2
            r2 = r83
            java.util.HashMap r5 = r2.A02
            X.0t3 r2 = r2.A00
            long r10 = r2.A00()
            java.lang.Long r2 = java.lang.Long.valueOf(r10)
            r5.put(r9, r2)
            X.0pf r2 = r4.A0L
            r82 = r2
            long r35 = r82.A02()
            X.28R r5 = r7.scope
            X.28R r38 = X.AnonymousClass28R.PHONEBOOK
            r2 = r38
            if (r5 == r2) goto L_0x03bc
            X.28R r2 = X.AnonymousClass28R.PHONEBOOK_AND_SIDELIST
            r24 = 0
            if (r5 != r2) goto L_0x03be
        L_0x03bc:
            r24 = 1
        L_0x03be:
            X.28R r37 = X.AnonymousClass28R.SIDELIST
            r2 = r37
            if (r5 == r2) goto L_0x03c9
            X.28R r2 = X.AnonymousClass28R.PHONEBOOK_AND_SIDELIST
            r15 = 0
            if (r5 != r2) goto L_0x03ca
        L_0x03c9:
            r15 = 1
        L_0x03ca:
            r34 = 0
            if (r24 == 0) goto L_0x05b9
            X.0sG r10 = r4.A09
            X.01V r6 = r4.A0H
            X.0sj r5 = r4.A0K
            java.lang.String r2 = "android.permission.READ_CONTACTS"
            int r2 = r5.A03(r2)
            if (r2 == 0) goto L_0x04a9
            java.lang.String r2 = "system-contacts-query/all/permission_denied"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            java.util.Map r2 = java.util.Collections.emptyMap()
            if (r2 != 0) goto L_0x0501
        L_0x03e8:
            java.util.List r6 = java.util.Collections.emptyList()
            java.util.Map r5 = java.util.Collections.emptyMap()
            X.4Hf r25 = new X.4Hf
            r2 = r25
            r2.<init>(r6, r5)
        L_0x03f7:
            r2 = r25
            java.util.Map r2 = r2.A01
            int r5 = r2.size()
            r2 = r25
            java.util.List r2 = r2.A00
            int r2 = r2.size()
            int r5 = r5 + r2
            long r5 = (long) r5
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            r9.A06 = r2
        L_0x040f:
            r10 = r34
        L_0x0411:
            boolean r2 = r3.A07
            if (r2 == 0) goto L_0x044b
            X.27z r5 = r7.mode
            X.27z r2 = X.C453327z.DELTA
            if (r5 != r2) goto L_0x044b
            X.27y r5 = r7.context
            X.27y r2 = X.C453227y.CONTACT_DISCOVERY
            if (r5 == r2) goto L_0x044b
            if (r15 == 0) goto L_0x04a7
            if (r19 == 0) goto L_0x04a7
            X.0sG r5 = r4.A09
            X.0rs r2 = r4.A0G
            java.util.Set r2 = r2.A0A()
            java.util.Collection r10 = r5.A0G(r2)
            int r5 = r10.size()
        L_0x0435:
            if (r25 == 0) goto L_0x047c
            r2 = r25
            java.util.List r2 = r2.A00
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x044b
            r2 = r25
            java.util.Map r2 = r2.A01
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x047c
        L_0x044b:
            X.28R r5 = r7.scope
            X.28R r33 = X.AnonymousClass28R.MULTI_PROTOCOLS_QUERY
            r2 = r33
            if (r5 != r2) goto L_0x0612
            java.util.Set r2 = r3.A05
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L_0x05fa
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r6 = r2.iterator()
        L_0x0464:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0612
            java.lang.Object r5 = r6.next()
            X.0rv r5 = (X.C15830rv) r5
            X.0sG r2 = r4.A09
            X.0sH r2 = r2.A08(r5)
            if (r2 == 0) goto L_0x0464
            r10.add(r2)
            goto L_0x0464
        L_0x047c:
            if (r5 != 0) goto L_0x044b
            java.lang.String r0 = "ContactSyncRequestExecutor/no_phonebook_or_sidelist_change"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.284 r5 = X.AnonymousClass284.A08
            r0 = r87
            r0.A01(r5)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r9.A04 = r0
            r9.A00 = r0
            r0 = r83
            r0.A01(r9)
            X.0t9 r2 = r0.A01
            X.00F r0 = r9.samplingRate
            int r0 = r0.A03
            int r1 = r0 * 10
            X.00F r0 = new X.00F
            r0.<init>(r1, r1)
            r2.A0A(r9, r0)
            goto L_0x00af
        L_0x04a7:
            r5 = 0
            goto L_0x0435
        L_0x04a9:
            android.content.ContentResolver r39 = r6.A0C()
            if (r39 != 0) goto L_0x04b7
            java.lang.String r2 = "system-contacts-query/all cr=null"
            com.whatsapp.util.Log.w((java.lang.String) r2)
            goto L_0x03e8
        L_0x04b7:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r5 = 2
            java.lang.String[] r8 = new java.lang.String[r5]
            r5 = 0
            java.lang.String r6 = "_id"
            r8[r5] = r6
            r11 = 1
            java.lang.String r5 = "version"
            r8[r11] = r5
            android.net.Uri r40 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ Exception -> 0x05b0 }
            java.lang.String r42 = X.AnonymousClass286.A01()     // Catch:{ Exception -> 0x05b0 }
            r44 = r34
            r41 = r8
            r43 = r34
            android.database.Cursor r8 = r39.query(r40, r41, r42, r43, r44)     // Catch:{ Exception -> 0x05b0 }
            if (r8 == 0) goto L_0x05a1
            int r11 = r8.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x05a9 }
            int r12 = r8.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x05a9 }
        L_0x04e4:
            boolean r5 = r8.moveToNext()     // Catch:{ all -> 0x05a9 }
            if (r5 == 0) goto L_0x04fe
            long r13 = r8.getLong(r11)     // Catch:{ all -> 0x05a9 }
            int r5 = r8.getInt(r12)     // Catch:{ all -> 0x05a9 }
            java.lang.Long r6 = java.lang.Long.valueOf(r13)     // Catch:{ all -> 0x05a9 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x05a9 }
            r2.put(r6, r5)     // Catch:{ all -> 0x05a9 }
            goto L_0x04e4
        L_0x04fe:
            r8.close()     // Catch:{ Exception -> 0x05b0 }
        L_0x0501:
            java.lang.String r5 = "system-contacts-query/all/"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            int r5 = r2.size()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.whatsapp.util.Log.i((java.lang.String) r5)
            X.18c r11 = r10.A06
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r5 = 2
            java.lang.String[] r8 = new java.lang.String[r5]
            r5 = 0
            java.lang.String r6 = "id"
            r8[r5] = r6
            r12 = 1
            java.lang.String r5 = "version"
            r8[r12] = r5
            X.11X r11 = r11.A00
            X.0tf r46 = r11.get()
            java.lang.String r47 = "system_contacts_version_table"
            java.lang.String r50 = "CONTACT_SYSTEM_VERSIONS"
            r49 = r34
            r52 = r34
            r48 = r34
            r51 = r8
            android.database.Cursor r8 = X.AnonymousClass15L.A03(r46, r47, r48, r49, r50, r51, r52)     // Catch:{ all -> 0x1a70 }
            if (r8 == 0) goto L_0x057f
            int r13 = r8.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x1a6b }
            int r12 = r8.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x1a6b }
        L_0x054d:
            boolean r5 = r8.moveToNext()     // Catch:{ all -> 0x1a6b }
            if (r5 == 0) goto L_0x057c
            int r5 = r8.getInt(r13)     // Catch:{ all -> 0x1a6b }
            long r5 = (long) r5     // Catch:{ all -> 0x1a6b }
            int r11 = r8.getInt(r12)     // Catch:{ all -> 0x1a6b }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x1a6b }
            java.lang.Long r6 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x1a6b }
            boolean r5 = r2.containsKey(r6)     // Catch:{ all -> 0x1a6b }
            if (r5 != 0) goto L_0x056e
            r10.add(r6)     // Catch:{ all -> 0x1a6b }
            goto L_0x054d
        L_0x056e:
            java.lang.Object r5 = r2.get(r6)     // Catch:{ all -> 0x1a6b }
            boolean r5 = r11.equals(r5)     // Catch:{ all -> 0x1a6b }
            if (r5 == 0) goto L_0x054d
            r2.remove(r6)     // Catch:{ all -> 0x1a6b }
            goto L_0x054d
        L_0x057c:
            r8.close()     // Catch:{ all -> 0x1a70 }
        L_0x057f:
            r46.close()
            java.lang.String r5 = "system-contacts-query/updated/"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            int r5 = r2.size()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            com.whatsapp.util.Log.i((java.lang.String) r5)
            X.4Hf r25 = new X.4Hf
            r5 = r25
            r5.<init>(r10, r2)
            goto L_0x03f7
        L_0x05a1:
            java.lang.String r2 = "system-contacts-query/contact cursor was null"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x05a9 }
            goto L_0x03e8
        L_0x05a9:
            r2 = move-exception
            if (r8 == 0) goto L_0x05af
            r8.close()     // Catch:{ all -> 0x05af }
        L_0x05af:
            throw r2     // Catch:{ Exception -> 0x05b0 }
        L_0x05b0:
            r5 = move-exception
            java.lang.String r2 = "system-contacts-query/contact exception"
            com.whatsapp.util.Log.e(r2, r5)
            goto L_0x03e8
        L_0x05b9:
            if (r15 == 0) goto L_0x05f6
            if (r19 == 0) goto L_0x05f6
            java.util.Set r2 = r3.A05
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L_0x05e6
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r6 = r2.iterator()
        L_0x05ce:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x05f2
            java.lang.Object r5 = r6.next()
            X.0rv r5 = (X.C15830rv) r5
            X.0sG r2 = r4.A09
            X.0sH r2 = r2.A08(r5)
            if (r2 == 0) goto L_0x05ce
            r10.add(r2)
            goto L_0x05ce
        L_0x05e6:
            X.0sG r5 = r4.A09
            X.0rs r2 = r4.A0G
            java.util.Set r2 = r2.A0A()
            java.util.Collection r10 = r5.A0G(r2)
        L_0x05f2:
            r25 = r34
            goto L_0x0411
        L_0x05f6:
            r25 = r34
            goto L_0x040f
        L_0x05fa:
            if (r57 == 0) goto L_0x0605
            java.lang.String r0 = "ContactSyncRequestExecutor/No device to sync separately."
        L_0x05fe:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.284 r5 = X.AnonymousClass284.A08
            goto L_0x00aa
        L_0x0605:
            if (r58 == 0) goto L_0x060a
            java.lang.String r0 = "ContactSyncRequestExecutor/No payment to sync separately."
            goto L_0x05fe
        L_0x060a:
            if (r55 == 0) goto L_0x060f
            java.lang.String r0 = "ContactSyncRequestExecutor/No picture to sync separately."
            goto L_0x05fe
        L_0x060f:
            java.lang.String r0 = "ContactSyncRequestExecutor/No contact to sync separately."
            goto L_0x05fe
        L_0x0612:
            java.lang.String r2 = "ContactSyncManager/fullSync: mode="
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r2)
            X.27z r2 = r7.mode
            java.lang.String r2 = r2.modeString
            r5.append(r2)
            java.lang.String r2 = "; context="
            r5.append(r2)
            X.27y r2 = r7.context
            java.lang.String r2 = r2.contextString
            r5.append(r2)
            java.lang.String r2 = "; isContact="
            r5.append(r2)
            r2 = r18
            r5.append(r2)
            java.lang.String r2 = "; isSidelist="
            r5.append(r2)
            r2 = r19
            r5.append(r2)
            java.lang.String r2 = "; retry="
            r5.append(r2)
            int r2 = r3.A00
            r5.append(r2)
            java.lang.String r2 = "; urgent="
            r5.append(r2)
            boolean r2 = r3.A01
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.27z r6 = r7.mode
            r2 = r26
            if (r6 != r2) goto L_0x0663
            if (r18 != 0) goto L_0x0673
        L_0x0663:
            X.27y r5 = r7.context
            X.27y r2 = X.C453227y.NOTIFICATION
            if (r5 != r2) goto L_0x066b
            if (r24 != 0) goto L_0x0673
        L_0x066b:
            X.27z r2 = X.C453327z.DELTA
            if (r6 != r2) goto L_0x06bd
            if (r24 == 0) goto L_0x06bd
            if (r15 == 0) goto L_0x06bd
        L_0x0673:
            X.0sG r2 = r4.A09
            java.util.List r63 = r2.A0H()
        L_0x0679:
            X.27z r5 = r7.mode
            r2 = r26
            if (r5 != r2) goto L_0x06ba
            X.0sG r2 = r4.A09
            java.util.ArrayList r64 = r2.A0F()
        L_0x0685:
            X.27y r5 = r7.context
            X.27y r32 = X.C453227y.NOTIFICATION
            r2 = r32
            if (r5 != r2) goto L_0x069f
            if (r15 == 0) goto L_0x069f
            X.0sG r2 = r4.A09
            X.18c r5 = r2.A06
            r2 = 1
            java.util.Collection r5 = r5.A0C(r2)
            java.util.ArrayList r34 = new java.util.ArrayList
            r2 = r34
            r2.<init>(r5)
        L_0x069f:
            X.1xs r2 = r4.A0A
            X.16O r5 = r4.A07
            int r51 = r5.A00()
            java.util.List r5 = r3.A04
            r39 = r5
            X.0uc r5 = r4.A06
            java.util.Map r8 = r5.A02()
            X.0wS r5 = r2.A0K
            r5.A06()
            X.17Q r13 = r5.A0F
            r12 = 0
            goto L_0x06c0
        L_0x06ba:
            r64 = r34
            goto L_0x0685
        L_0x06bd:
            r63 = r34
            goto L_0x0679
        L_0x06c0:
            X.284 r5 = X.AnonymousClass284.A03     // Catch:{ all -> 0x1a4a }
            r81 = r5
            java.util.Map r6 = r2.A0M     // Catch:{ all -> 0x1a4a }
            r80 = r6
            r6.putAll(r8)     // Catch:{ all -> 0x1a4a }
            java.util.Map r6 = r2.A0O     // Catch:{ all -> 0x1a4a }
            r79 = r6
            X.0uP r6 = r2.A05     // Catch:{ all -> 0x1a4a }
            X.18c r6 = r6.A05     // Catch:{ all -> 0x1a4a }
            java.lang.String r14 = "serial"
            java.lang.String r11 = "jid"
            java.util.HashMap r15 = new java.util.HashMap     // Catch:{ all -> 0x1a4a }
            r15.<init>()     // Catch:{ all -> 0x1a4a }
            X.11X r6 = r6.A00     // Catch:{ all -> 0x1a4a }
            X.0tf r65 = r6.get()     // Catch:{ all -> 0x1a4a }
            java.lang.String r66 = "wa_vnames"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x1a45 }
            r8 = 0
            r6[r8] = r11     // Catch:{ all -> 0x1a45 }
            r8 = 1
            r6[r8] = r14     // Catch:{ all -> 0x1a45 }
            java.lang.String r69 = "CONTACT_VNAMES"
            r68 = r12
            r71 = r12
            r67 = r12
            r70 = r6
            android.database.Cursor r8 = X.AnonymousClass15L.A03(r65, r66, r67, r68, r69, r70, r71)     // Catch:{ all -> 0x1a45 }
            if (r8 == 0) goto L_0x0728
            int r31 = r8.getColumnIndexOrThrow(r11)     // Catch:{ all -> 0x1a3c }
            int r14 = r8.getColumnIndexOrThrow(r14)     // Catch:{ all -> 0x1a3c }
        L_0x0707:
            boolean r6 = r8.moveToNext()     // Catch:{ all -> 0x1a3c }
            if (r6 == 0) goto L_0x0725
            r6 = r31
            java.lang.String r6 = r8.getString(r6)     // Catch:{ all -> 0x1a3c }
            com.whatsapp.jid.UserJid r6 = com.whatsapp.jid.UserJid.getNullable(r6)     // Catch:{ all -> 0x1a3c }
            if (r6 == 0) goto L_0x0707
            long r27 = r8.getLong(r14)     // Catch:{ all -> 0x1a3c }
            java.lang.String r11 = java.lang.String.valueOf(r27)     // Catch:{ all -> 0x1a3c }
            r15.put(r6, r11)     // Catch:{ all -> 0x1a3c }
            goto L_0x0707
        L_0x0725:
            r8.close()     // Catch:{ all -> 0x1a45 }
        L_0x0728:
            r65.close()     // Catch:{ all -> 0x1a4a }
            r6 = r79
            r6.putAll(r15)     // Catch:{ all -> 0x1a4a }
            if (r58 == 0) goto L_0x0765
            X.0w8 r6 = r2.A0J     // Catch:{ all -> 0x1a4a }
            boolean r6 = r6.A08()     // Catch:{ all -> 0x1a4a }
            if (r6 == 0) goto L_0x0765
            X.0w8 r6 = r13.A03     // Catch:{ all -> 0x1a4a }
            boolean r6 = r6.A08()     // Catch:{ all -> 0x1a4a }
            if (r6 == 0) goto L_0x0765
            X.160 r6 = r13.A02     // Catch:{ all -> 0x1a4a }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x1a4a }
            r8.<init>()     // Catch:{ all -> 0x1a4a }
            java.util.List r6 = r6.A0C()     // Catch:{ all -> 0x1a4a }
            java.util.Iterator r14 = r6.iterator()     // Catch:{ all -> 0x1a4a }
        L_0x0751:
            boolean r6 = r14.hasNext()     // Catch:{ all -> 0x1a4a }
            if (r6 == 0) goto L_0x0763
            java.lang.Object r6 = r14.next()     // Catch:{ all -> 0x1a4a }
            X.1m3 r6 = (X.C35511m3) r6     // Catch:{ all -> 0x1a4a }
            com.whatsapp.jid.UserJid r11 = r6.A05     // Catch:{ all -> 0x1a4a }
            r8.put(r11, r6)     // Catch:{ all -> 0x1a4a }
            goto L_0x0751
        L_0x0763:
            r13.A01 = r8     // Catch:{ all -> 0x1a4a }
        L_0x0765:
            X.28R r8 = r7.scope     // Catch:{ all -> 0x1a4a }
            r6 = r38
            if (r8 == r6) goto L_0x0771
            X.28R r6 = X.AnonymousClass28R.PHONEBOOK_AND_SIDELIST     // Catch:{ all -> 0x1a4a }
            r28 = 0
            if (r8 != r6) goto L_0x0773
        L_0x0771:
            r28 = 1
        L_0x0773:
            r6 = r37
            if (r8 == r6) goto L_0x077d
            X.28R r6 = X.AnonymousClass28R.PHONEBOOK_AND_SIDELIST     // Catch:{ all -> 0x1a4a }
            r27 = 0
            if (r8 != r6) goto L_0x077f
        L_0x077d:
            r27 = 1
        L_0x077f:
            r6 = r33
            if (r8 != r6) goto L_0x07a7
            r52 = 0
            com.facebook.redex.IDxFunctionShape0S0481000_1_I0 r5 = new com.facebook.redex.IDxFunctionShape0S0481000_1_I0     // Catch:{ all -> 0x1a4a }
            r46 = r5
            r47 = r2
            r48 = r7
            r49 = r9
            r50 = r10
            r53 = r18
            r54 = r22
            r56 = r21
            r59 = r17
            r60 = r16
            r46.<init>(r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)     // Catch:{ all -> 0x1a4a }
            java.lang.String r6 = "sync/syncQueryMultiProtocols/no result"
            X.284 r5 = r2.A00(r5, r6)     // Catch:{ all -> 0x1a4a }
            goto L_0x0923
        L_0x07a7:
            X.27z r11 = r7.mode     // Catch:{ all -> 0x1a4a }
            r8 = 0
            r6 = r26
            if (r11 != r6) goto L_0x07af
            r8 = 1
        L_0x07af:
            r15 = 1
            r6 = 0
            if (r8 == 0) goto L_0x0830
            if (r28 == 0) goto L_0x07b8
            if (r27 == 0) goto L_0x07b8
            r6 = 1
        L_0x07b8:
            X.AnonymousClass00B.A0G(r6)     // Catch:{ all -> 0x1a4a }
            if (r18 != 0) goto L_0x07ce
            if (r19 != 0) goto L_0x07ce
            if (r22 != 0) goto L_0x07ce
            if (r21 != 0) goto L_0x07ce
            if (r55 != 0) goto L_0x07ce
            if (r57 != 0) goto L_0x07ce
            if (r58 != 0) goto L_0x07ce
            if (r17 != 0) goto L_0x07ce
            if (r16 != 0) goto L_0x07ce
            r15 = 0
        L_0x07ce:
            X.AnonymousClass00B.A0G(r15)     // Catch:{ all -> 0x1a4a }
            if (r18 == 0) goto L_0x0801
            X.AnonymousClass00B.A06(r63)     // Catch:{ all -> 0x1a4a }
            X.AnonymousClass00B.A06(r64)     // Catch:{ all -> 0x1a4a }
            X.3DV r5 = new X.3DV     // Catch:{ all -> 0x1a4a }
            r59 = r5
            r60 = r2
            r61 = r7
            r62 = r9
            r65 = r51
            r66 = r19
            r67 = r22
            r68 = r55
            r69 = r21
            r70 = r57
            r71 = r58
            r72 = r17
            r73 = r16
            r59.<init>(r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73)     // Catch:{ all -> 0x1a4a }
            java.lang.String r6 = "sync/sync_all"
            X.284 r5 = r2.A00(r5, r6)     // Catch:{ all -> 0x1a4a }
            goto L_0x0923
        L_0x0801:
            X.AnonymousClass00B.A06(r64)     // Catch:{ all -> 0x1a4a }
            r65 = 1
            com.facebook.redex.IDxFunctionShape0S0481000_1_I0 r5 = new com.facebook.redex.IDxFunctionShape0S0481000_1_I0     // Catch:{ all -> 0x1a4a }
            r59 = r5
            r60 = r2
            r61 = r7
            r62 = r9
            r63 = r64
            r64 = r51
            r66 = r21
            r67 = r57
            r68 = r58
            r69 = r17
            r70 = r16
            r71 = r19
            r72 = r22
            r73 = r55
            r59.<init>(r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73)     // Catch:{ all -> 0x1a4a }
            java.lang.String r6 = "sync/sync_all_non_contact"
            X.284 r5 = r2.A00(r5, r6)     // Catch:{ all -> 0x1a4a }
            goto L_0x0923
        L_0x0830:
            X.27y r14 = r7.context     // Catch:{ all -> 0x1a4a }
            r8 = r32
            if (r14 != r8) goto L_0x08a4
            boolean r8 = r39.isEmpty()     // Catch:{ all -> 0x1a4a }
            if (r8 != 0) goto L_0x0905
            if (r28 == 0) goto L_0x0873
            if (r27 == 0) goto L_0x0841
            r15 = 0
        L_0x0841:
            X.AnonymousClass00B.A0G(r15)     // Catch:{ all -> 0x1a4a }
            X.AnonymousClass00B.A06(r63)     // Catch:{ all -> 0x1a4a }
            r71 = 1
            com.facebook.redex.IDxFunctionShape0S0571000_1_I0 r5 = new com.facebook.redex.IDxFunctionShape0S0571000_1_I0     // Catch:{ all -> 0x1a4a }
            r64 = r5
            r65 = r2
            r66 = r7
            r67 = r9
            r68 = r39
            r69 = r63
            r70 = r51
            r72 = r22
            r73 = r55
            r74 = r21
            r75 = r57
            r76 = r58
            r77 = r17
            r78 = r16
            r64.<init>(r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78)     // Catch:{ all -> 0x1a4a }
            java.lang.String r6 = "sync/sync_notification_contact"
            X.284 r5 = r2.A00(r5, r6)     // Catch:{ all -> 0x1a4a }
            goto L_0x0923
        L_0x0873:
            if (r27 == 0) goto L_0x0923
            X.AnonymousClass00B.A06(r34)     // Catch:{ all -> 0x1a4a }
            com.facebook.redex.IDxFunctionShape0S0571000_1_I0 r6 = new com.facebook.redex.IDxFunctionShape0S0571000_1_I0     // Catch:{ all -> 0x1a4a }
            r66 = 0
            r59 = r6
            r60 = r2
            r61 = r7
            r62 = r9
            r63 = r39
            r64 = r34
            r65 = r51
            r67 = r22
            r68 = r55
            r69 = r21
            r70 = r57
            r71 = r58
            r72 = r17
            r73 = r16
            r59.<init>(r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73)     // Catch:{ all -> 0x1a4a }
            java.lang.String r5 = "sync/sync_notification_sidelist"
            X.284 r5 = r2.A00(r6, r5)     // Catch:{ all -> 0x1a4a }
            goto L_0x0923
        L_0x08a4:
            X.27z r8 = X.C453327z.DELTA     // Catch:{ all -> 0x1a4a }
            if (r11 != r8) goto L_0x0923
            if (r28 == 0) goto L_0x08cb
            if (r27 == 0) goto L_0x08e8
            X.AnonymousClass00B.A06(r63)     // Catch:{ all -> 0x1a4a }
            X.3DU r5 = new X.3DU     // Catch:{ all -> 0x1a4a }
            r37 = r5
            r38 = r2
            r39 = r7
            r40 = r9
            r41 = r10
            r42 = r63
            r43 = r51
            r44 = r16
            r37.<init>(r38, r39, r40, r41, r42, r43, r44)     // Catch:{ all -> 0x1a4a }
            java.lang.String r6 = "contactsynchelper/syncDelta"
            X.284 r5 = r2.A00(r5, r6)     // Catch:{ all -> 0x1a4a }
            goto L_0x0923
        L_0x08cb:
            if (r27 == 0) goto L_0x08e8
            X.3DT r6 = new X.3DT     // Catch:{ all -> 0x1a4a }
            r37 = r6
            r38 = r2
            r39 = r7
            r40 = r9
            r41 = r10
            r42 = r51
            r43 = r16
            r37.<init>(r38, r39, r40, r41, r42, r43)     // Catch:{ all -> 0x1a4a }
            java.lang.String r5 = "sync/syncSidelist"
            X.284 r5 = r2.A00(r6, r5)     // Catch:{ all -> 0x1a4a }
            goto L_0x0923
        L_0x08e8:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x1a4a }
            r10.<init>()     // Catch:{ all -> 0x1a4a }
            java.lang.String r8 = "wrong sync type and query scope: "
            r10.append(r8)     // Catch:{ all -> 0x1a4a }
            int r8 = r7.code     // Catch:{ all -> 0x1a4a }
            r10.append(r8)     // Catch:{ all -> 0x1a4a }
            java.lang.String r8 = r10.toString()     // Catch:{ all -> 0x1a4a }
            com.whatsapp.util.Log.e((java.lang.String) r8)     // Catch:{ all -> 0x1a4a }
            X.0so r10 = r2.A03     // Catch:{ all -> 0x1a4a }
            java.lang.String r8 = "sync/sync_delta/error"
            goto L_0x0920
        L_0x0905:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x1a4a }
            r10.<init>()     // Catch:{ all -> 0x1a4a }
            java.lang.String r8 = "empty jid hash: "
            r10.append(r8)     // Catch:{ all -> 0x1a4a }
            int r8 = r7.code     // Catch:{ all -> 0x1a4a }
            r10.append(r8)     // Catch:{ all -> 0x1a4a }
            java.lang.String r8 = r10.toString()     // Catch:{ all -> 0x1a4a }
            com.whatsapp.util.Log.e((java.lang.String) r8)     // Catch:{ all -> 0x1a4a }
            X.0so r10 = r2.A03     // Catch:{ all -> 0x1a4a }
            java.lang.String r8 = "sync/sync_notification_no_jidhash/error"
        L_0x0920:
            r10.AcB(r8, r12, r6)     // Catch:{ all -> 0x1a4a }
        L_0x0923:
            java.util.Map r6 = r2.A0P
            r6.clear()
            java.util.Map r6 = r2.A0N
            r6.clear()
            r80.clear()
            r79.clear()
            r2.A01 = r12
            r2.A02 = r12
            java.util.Map r2 = r13.A01
            if (r2 == 0) goto L_0x093e
            r2.clear()
        L_0x093e:
            X.0tz r2 = r4.A0J
            android.content.Context r2 = r2.A00
            r56 = r2
            boolean r2 = r5.A00()
            if (r2 == 0) goto L_0x184d
            java.lang.String r2 = "ContactSyncRequestExecutor/success"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            int r12 = r5.A00
            r2 = 3
            if (r12 == r2) goto L_0x0957
            r2 = 2
            if (r12 != r2) goto L_0x095e
        L_0x0957:
            java.lang.Runnable r3 = r4.A0S
            r2 = r86
            r2.A0K(r3)
        L_0x095e:
            r2 = r87
            r2.A01(r5)
            if (r30 == 0) goto L_0x09e7
            X.16k r11 = r4.A05
            monitor-enter(r11)
            X.0sK r2 = r11.A00     // Catch:{ all -> 0x1a42 }
            boolean r2 = r2.A0G()     // Catch:{ all -> 0x1a42 }
            r27 = 1
            if (r2 != 0) goto L_0x09dd
            X.19Y r2 = r11.A01     // Catch:{ all -> 0x1a42 }
            boolean r2 = r2.A00()     // Catch:{ all -> 0x1a42 }
            if (r2 != 0) goto L_0x0980
            java.lang.String r2 = "androidcontactssync/clearsyncdata/permission_denied"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x1a42 }
            goto L_0x09dd
        L_0x0980:
            android.content.ContentResolver r14 = r56.getContentResolver()     // Catch:{ all -> 0x1a42 }
            android.net.Uri r2 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x1a42 }
            android.net.Uri$Builder r6 = r2.buildUpon()     // Catch:{ all -> 0x1a42 }
            java.lang.String r3 = "account_name"
            r10 = 2131893204(0x7f121bd4, float:1.9421178E38)
            r2 = r56
            java.lang.String r2 = r2.getString(r10)     // Catch:{ all -> 0x1a42 }
            android.net.Uri$Builder r3 = r6.appendQueryParameter(r3, r2)     // Catch:{ all -> 0x1a42 }
            java.lang.String r2 = "account_type"
            java.lang.String r8 = "com.obwhatsapp"
            android.net.Uri$Builder r6 = r3.appendQueryParameter(r2, r8)     // Catch:{ all -> 0x1a42 }
            java.lang.String r3 = "caller_is_syncadapter"
            java.lang.String r2 = "true"
            android.net.Uri$Builder r2 = r6.appendQueryParameter(r3, r2)     // Catch:{ all -> 0x1a42 }
            android.net.Uri r13 = r2.build()     // Catch:{ all -> 0x1a42 }
            java.lang.String r2 = "androidcontactssync/clearsyncdata/delete"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x1a42 }
            r15 = 0
            java.lang.String r6 = "account_name = ? AND account_type = ?"
            r2 = 2
            java.lang.String[] r3 = new java.lang.String[r2]     // Catch:{ SecurityException -> 0x09c9, IllegalArgumentException -> 0x09c7 }
            r2 = r56
            java.lang.String r2 = r2.getString(r10)     // Catch:{ SecurityException -> 0x09c9, IllegalArgumentException -> 0x09c7 }
            r3[r15] = r2     // Catch:{ SecurityException -> 0x09c9, IllegalArgumentException -> 0x09c7 }
            r3[r27] = r8     // Catch:{ SecurityException -> 0x09c9, IllegalArgumentException -> 0x09c7 }
            r14.delete(r13, r6, r3)     // Catch:{ SecurityException -> 0x09c9, IllegalArgumentException -> 0x09c7 }
            goto L_0x09dd
        L_0x09c7:
            monitor-exit(r11)
            goto L_0x09e0
        L_0x09c9:
            r6 = move-exception
            java.lang.String r2 = r6.getMessage()     // Catch:{ all -> 0x1a42 }
            if (r2 == 0) goto L_0x1a41
            java.lang.String r3 = r6.getMessage()     // Catch:{ all -> 0x1a42 }
            java.lang.String r2 = "User 0 tying to get authenticator types for "
            boolean r2 = r3.startsWith(r2)     // Catch:{ all -> 0x1a42 }
            if (r2 == 0) goto L_0x1a41
            goto L_0x09df
        L_0x09dd:
            monitor-exit(r11)
            goto L_0x09e7
        L_0x09df:
            monitor-exit(r11)
        L_0x09e0:
            r3 = r87
            r2 = r81
            r3.A01(r2)
        L_0x09e7:
            X.27z r3 = r7.mode
            r2 = r26
            if (r3 != r2) goto L_0x0a98
            if (r18 == 0) goto L_0x0a00
            android.content.SharedPreferences r2 = r85.A01()
            android.content.SharedPreferences$Editor r3 = r2.edit()
            java.lang.String r2 = "last_contact_full_sync"
            android.content.SharedPreferences$Editor r2 = r3.putLong(r2, r0)
            r2.apply()
        L_0x0a00:
            if (r19 == 0) goto L_0x0a13
            android.content.SharedPreferences r2 = r85.A01()
            android.content.SharedPreferences$Editor r3 = r2.edit()
            java.lang.String r2 = "last_sidelist_full_sync"
            android.content.SharedPreferences$Editor r2 = r3.putLong(r2, r0)
            r2.apply()
        L_0x0a13:
            if (r22 == 0) goto L_0x0a26
            android.content.SharedPreferences r2 = r85.A01()
            android.content.SharedPreferences$Editor r3 = r2.edit()
            java.lang.String r2 = "last_status_full_sync"
            android.content.SharedPreferences$Editor r2 = r3.putLong(r2, r0)
            r2.apply()
        L_0x0a26:
            if (r21 == 0) goto L_0x0a39
            android.content.SharedPreferences r2 = r85.A01()
            android.content.SharedPreferences$Editor r3 = r2.edit()
            java.lang.String r2 = "last_business_full_sync"
            android.content.SharedPreferences$Editor r2 = r3.putLong(r2, r0)
            r2.apply()
        L_0x0a39:
            if (r55 == 0) goto L_0x0a4c
            android.content.SharedPreferences r2 = r85.A01()
            android.content.SharedPreferences$Editor r3 = r2.edit()
            java.lang.String r2 = "last_picture_full_sync"
            android.content.SharedPreferences$Editor r2 = r3.putLong(r2, r0)
            r2.apply()
        L_0x0a4c:
            if (r57 == 0) goto L_0x0a5f
            android.content.SharedPreferences r2 = r85.A01()
            android.content.SharedPreferences$Editor r3 = r2.edit()
            java.lang.String r2 = "last_devices_full_sync"
            android.content.SharedPreferences$Editor r2 = r3.putLong(r2, r0)
            r2.apply()
        L_0x0a5f:
            if (r58 == 0) goto L_0x0a72
            android.content.SharedPreferences r2 = r85.A01()
            android.content.SharedPreferences$Editor r3 = r2.edit()
            java.lang.String r2 = "last_payment_full_sync"
            android.content.SharedPreferences$Editor r2 = r3.putLong(r2, r0)
            r2.apply()
        L_0x0a72:
            if (r17 == 0) goto L_0x0a85
            android.content.SharedPreferences r2 = r85.A01()
            android.content.SharedPreferences$Editor r3 = r2.edit()
            java.lang.String r2 = "last_disappearing_mode_full_sync"
            android.content.SharedPreferences$Editor r2 = r3.putLong(r2, r0)
            r2.apply()
        L_0x0a85:
            if (r16 == 0) goto L_0x0a98
            android.content.SharedPreferences r2 = r85.A01()
            android.content.SharedPreferences$Editor r3 = r2.edit()
            java.lang.String r2 = "last_lid_full_sync"
            android.content.SharedPreferences$Editor r0 = r3.putLong(r2, r0)
            r0.apply()
        L_0x0a98:
            if (r24 == 0) goto L_0x18c0
            r0 = 2
            if (r12 != r0) goto L_0x18c0
            X.16k r0 = r4.A05     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
            r18 = r0
            r0 = r25
            java.util.Map r0 = r0.A01     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
            java.util.Set r37 = r0.keySet()     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
            X.0sG r0 = r4.A09     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
            r55 = r0
            X.18c r1 = r0.A06     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
            r0 = 1
            X.1Zf r7 = new X.1Zf     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
            r7.<init>((boolean) r0)     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
            r7.A03()     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
            java.util.ArrayList r34 = new java.util.ArrayList     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
            r34.<init>()     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
            X.11X r0 = r1.A00     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
            X.0tf r38 = r0.get()     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
            java.lang.String r39 = "wa_contacts LEFT JOIN wa_vnames ON (wa_contacts.jid = wa_vnames.jid) LEFT JOIN wa_group_Descriptions ON (wa_contacts.jid = wa_group_descriptions.jid) LEFT JOIN wa_group_admin_settings ON (wa_contacts.jid = wa_group_admin_settings.jid)"
            r0 = 8
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x1825 }
            r2 = 0
            java.lang.String r0 = "wa_contacts._id"
            r1[r2] = r0     // Catch:{ all -> 0x1825 }
            r2 = 1
            java.lang.String r0 = "wa_contacts.jid"
            r1[r2] = r0     // Catch:{ all -> 0x1825 }
            r2 = 2
            java.lang.String r0 = "is_whatsapp_user"
            r1[r2] = r0     // Catch:{ all -> 0x1825 }
            r2 = 3
            java.lang.String r0 = "number"
            r1[r2] = r0     // Catch:{ all -> 0x1825 }
            r2 = 4
            java.lang.String r0 = "raw_contact_id"
            r1[r2] = r0     // Catch:{ all -> 0x1825 }
            r2 = 5
            java.lang.String r33 = "display_name"
            r1[r2] = r33     // Catch:{ all -> 0x1825 }
            r3 = 6
            java.lang.String r2 = "phone_type"
            r1[r3] = r2     // Catch:{ all -> 0x1825 }
            r3 = 7
            java.lang.String r2 = "phone_label"
            r1[r3] = r2     // Catch:{ all -> 0x1825 }
            java.lang.String r40 = "is_whatsapp_user = 1"
            r41 = 0
            java.lang.String r42 = "CONTACTS"
            r43 = r1
            r44 = r41
            android.database.Cursor r1 = X.AnonymousClass15L.A03(r38, r39, r40, r41, r42, r43, r44)     // Catch:{ all -> 0x1825 }
            if (r1 != 0) goto L_0x0b0d
            java.lang.String r2 = "contact-mgr-db/unable to get wacontacts for account sync"
            X.AnonymousClass00B.A08(r2)     // Catch:{ all -> 0x181e }
            r38.close()     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
            goto L_0x0b6b
        L_0x0b0d:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x181e }
            if (r2 == 0) goto L_0x0b5f
            r6 = 1
            java.lang.String r2 = r1.getString(r6)     // Catch:{ all -> 0x181e }
            com.whatsapp.jid.Jid r3 = com.whatsapp.jid.Jid.getNullable(r2)     // Catch:{ all -> 0x181e }
            boolean r2 = X.C16030sJ.A0O(r3)     // Catch:{ all -> 0x181e }
            if (r2 == 0) goto L_0x0b0d
            com.whatsapp.jid.UserJid r47 = com.whatsapp.jid.UserJid.of(r3)     // Catch:{ all -> 0x181e }
            r2 = 2
            int r3 = r1.getInt(r2)     // Catch:{ all -> 0x181e }
            r2 = 0
            r54 = 0
            if (r3 != r6) goto L_0x0b32
            r54 = 1
        L_0x0b32:
            r3 = 3
            java.lang.String r48 = r1.getString(r3)     // Catch:{ all -> 0x181e }
            r3 = 4
            long r52 = r1.getLong(r3)     // Catch:{ all -> 0x181e }
            r3 = 5
            java.lang.String r49 = r1.getString(r3)     // Catch:{ all -> 0x181e }
            r3 = 6
            int r51 = r1.getInt(r3)     // Catch:{ all -> 0x181e }
            r3 = 7
            java.lang.String r50 = r1.getString(r3)     // Catch:{ all -> 0x181e }
            X.0sH r6 = new X.0sH     // Catch:{ all -> 0x181e }
            r46 = r6
            r46.<init>(r47, r48, r49, r50, r51, r52, r54)     // Catch:{ all -> 0x181e }
            long r2 = r1.getLong(r2)     // Catch:{ all -> 0x181e }
            r6.A0D(r2)     // Catch:{ all -> 0x181e }
            r2 = r34
            r2.add(r6)     // Catch:{ all -> 0x181e }
            goto L_0x0b0d
        L_0x0b5f:
            r1.close()     // Catch:{ all -> 0x1825 }
            r38.close()     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
            r34.size()     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
            r7.A00()     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
        L_0x0b6b:
            monitor-enter(r18)     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
            r1 = r18
            X.0sK r1 = r1.A00     // Catch:{ all -> 0x181b }
            boolean r1 = r1.A0G()     // Catch:{ all -> 0x181b }
            if (r1 == 0) goto L_0x0b81
            java.lang.String r0 = "androidcontactssync/skipping raw contacts sync to Android contacts content provider due to companion mode"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x181b }
            java.util.List r8 = java.util.Collections.emptyList()     // Catch:{ all -> 0x181b }
            goto L_0x17e9
        L_0x0b81:
            java.lang.String r1 = "androidcontactssync/start"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x181b }
            long r21 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x181b }
            r2 = r18
            r1 = r56
            android.accounts.Account r17 = r2.A02(r1)     // Catch:{ all -> 0x181b }
            X.0u3 r1 = r2.A04     // Catch:{ all -> 0x181b }
            r53 = r1
            java.lang.String r43 = X.AnonymousClass01S.A07     // Catch:{ all -> 0x181b }
            r2 = r1
            r1 = r43
            android.content.SharedPreferences r3 = r2.A00(r1)     // Catch:{ all -> 0x181b }
            java.lang.String r44 = "perform_sync_manager_version"
            r2 = 0
            r1 = r44
            int r3 = r3.getInt(r1, r2)     // Catch:{ all -> 0x181b }
            r11 = 3
            if (r3 >= r11) goto L_0x0d8a
            r15 = 0
            if (r17 != 0) goto L_0x0bb5
            java.lang.String r0 = "androidcontactssync/skipping onVersionUpgrade"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x181b }
            goto L_0x0cef
        L_0x0bb5:
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x181b }
            r13.<init>()     // Catch:{ all -> 0x181b }
            android.content.ContentResolver r12 = r56.getContentResolver()     // Catch:{ all -> 0x181b }
            boolean r2 = r34.isEmpty()     // Catch:{ all -> 0x181b }
            r1 = 1
            if (r2 != 0) goto L_0x0d97
            java.util.HashMap r14 = new java.util.HashMap     // Catch:{ all -> 0x181b }
            r14.<init>()     // Catch:{ all -> 0x181b }
            java.util.Iterator r7 = r34.iterator()     // Catch:{ all -> 0x181b }
        L_0x0bce:
            boolean r2 = r7.hasNext()     // Catch:{ all -> 0x181b }
            if (r2 == 0) goto L_0x0be4
            java.lang.Object r6 = r7.next()     // Catch:{ all -> 0x181b }
            X.0sH r6 = (X.C16010sH) r6     // Catch:{ all -> 0x181b }
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r2 = r6.A08(r2)     // Catch:{ all -> 0x181b }
            r14.put(r2, r6)     // Catch:{ all -> 0x181b }
            goto L_0x0bce
        L_0x0be4:
            android.net.Uri r2 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x181b }
            android.net.Uri$Builder r7 = r2.buildUpon()     // Catch:{ all -> 0x181b }
            r2 = r17
            java.lang.String r6 = r2.name     // Catch:{ all -> 0x181b }
            java.lang.String r2 = "account_name"
            android.net.Uri$Builder r7 = r7.appendQueryParameter(r2, r6)     // Catch:{ all -> 0x181b }
            r2 = r17
            java.lang.String r6 = r2.type     // Catch:{ all -> 0x181b }
            java.lang.String r2 = "account_type"
            android.net.Uri$Builder r2 = r7.appendQueryParameter(r2, r6)     // Catch:{ all -> 0x181b }
            java.lang.String r7 = "caller_is_syncadapter"
            java.lang.String r6 = "true"
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r7, r6)     // Catch:{ all -> 0x181b }
            android.net.Uri r47 = r2.build()     // Catch:{ all -> 0x181b }
            android.net.Uri r2 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ all -> 0x181b }
            android.net.Uri$Builder r2 = r2.buildUpon()     // Catch:{ all -> 0x181b }
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r7, r6)     // Catch:{ all -> 0x181b }
            android.net.Uri r30 = r2.build()     // Catch:{ all -> 0x181b }
            r2 = 100
            java.lang.String r10 = "androidcontactssync/onVersionUpgrade/error"
            java.lang.String r8 = "sync1"
            java.lang.String r6 = "_id"
            r7 = 2
            if (r3 == 0) goto L_0x0c3e
            if (r3 == r1) goto L_0x0c3e
            if (r3 == r7) goto L_0x0cf5
            java.lang.String r1 = "unexpected old version during AndroidContactsSyncHelper upgrade, version="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x181b }
            r0.<init>(r1)     // Catch:{ all -> 0x181b }
            r0.append(r3)     // Catch:{ all -> 0x181b }
            java.lang.String r1 = r0.toString()     // Catch:{ all -> 0x181b }
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x181b }
            r0.<init>(r1)     // Catch:{ all -> 0x181b }
            throw r0     // Catch:{ all -> 0x181b }
        L_0x0c3e:
            java.lang.String[] r3 = new java.lang.String[r11]     // Catch:{ all -> 0x181b }
            r3[r15] = r6     // Catch:{ all -> 0x181b }
            r3[r1] = r8     // Catch:{ all -> 0x181b }
            java.lang.String r1 = "deleted"
            r3[r7] = r1     // Catch:{ all -> 0x181b }
            r50 = r41
            r51 = r41
            r46 = r12
            r48 = r3
            r49 = r41
            android.database.Cursor r7 = r46.query(r47, r48, r49, r50, r51)     // Catch:{ all -> 0x181b }
            if (r7 == 0) goto L_0x0ce3
            int r29 = r7.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0d87 }
            int r28 = r7.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x0d87 }
            int r24 = r7.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0d87 }
        L_0x0c64:
            boolean r1 = r7.moveToNext()     // Catch:{ all -> 0x0d87 }
            if (r1 == 0) goto L_0x0ce0
            int r1 = r13.size()     // Catch:{ all -> 0x0d87 }
            if (r1 < r2) goto L_0x0c78
            boolean r1 = X.C220416k.A01(r12, r10, r13)     // Catch:{ all -> 0x0d87 }
            if (r1 != 0) goto L_0x0c78
            goto L_0x0d71
        L_0x0c78:
            r1 = r29
            long r26 = r7.getLong(r1)     // Catch:{ all -> 0x0d87 }
            r1 = r28
            java.lang.String r1 = r7.getString(r1)     // Catch:{ all -> 0x0d87 }
            com.whatsapp.jid.UserJid r3 = com.whatsapp.jid.UserJid.getNullable(r1)     // Catch:{ all -> 0x0d87 }
            r1 = r24
            boolean r1 = r7.isNull(r1)     // Catch:{ all -> 0x0d87 }
            if (r1 == 0) goto L_0x0c91
            goto L_0x0c98
        L_0x0c91:
            r1 = r24
            int r2 = r7.getInt(r1)     // Catch:{ all -> 0x0d87 }
            goto L_0x0c99
        L_0x0c98:
            r2 = 0
        L_0x0c99:
            if (r3 == 0) goto L_0x0cdd
            boolean r1 = r14.containsKey(r3)     // Catch:{ all -> 0x0d87 }
            if (r1 == 0) goto L_0x0cdd
            if (r2 != 0) goto L_0x0cdd
            android.content.ContentProviderOperation$Builder r2 = android.content.ContentProviderOperation.newUpdate(r47)     // Catch:{ all -> 0x0d87 }
            r1 = 1
            android.content.ContentProviderOperation$Builder r19 = r2.withYieldAllowed(r1)     // Catch:{ all -> 0x0d87 }
            java.lang.String r16 = "_id = ?"
            java.lang.String[] r15 = new java.lang.String[r1]     // Catch:{ all -> 0x0d87 }
            java.lang.String r2 = java.lang.String.valueOf(r26)     // Catch:{ all -> 0x0d87 }
            r1 = 0
            r15[r1] = r2     // Catch:{ all -> 0x0d87 }
            r2 = r19
            r1 = r16
            android.content.ContentProviderOperation$Builder r16 = r2.withSelection(r1, r15)     // Catch:{ all -> 0x0d87 }
            java.lang.String r15 = "sync2"
            java.lang.Object r1 = r14.get(r3)     // Catch:{ all -> 0x0d87 }
            X.0sH r1 = (X.C16010sH) r1     // Catch:{ all -> 0x0d87 }
            long r1 = r1.A05()     // Catch:{ all -> 0x0d87 }
            java.lang.Long r2 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0d87 }
            r1 = r16
            android.content.ContentProviderOperation$Builder r1 = r1.withValue(r15, r2)     // Catch:{ all -> 0x0d87 }
            android.content.ContentProviderOperation r1 = r1.build()     // Catch:{ all -> 0x0d87 }
            r13.add(r1)     // Catch:{ all -> 0x0d87 }
        L_0x0cdd:
            r2 = 100
            goto L_0x0c64
        L_0x0ce0:
            r7.close()     // Catch:{ all -> 0x181b }
        L_0x0ce3:
            boolean r1 = r13.isEmpty()     // Catch:{ all -> 0x181b }
            if (r1 != 0) goto L_0x0cf5
            boolean r1 = X.C220416k.A01(r12, r10, r13)     // Catch:{ all -> 0x181b }
            if (r1 != 0) goto L_0x0cf5
        L_0x0cef:
            java.util.List r8 = java.util.Collections.emptyList()     // Catch:{ all -> 0x181b }
            goto L_0x17e9
        L_0x0cf5:
            r7 = 0
            r3 = 2
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ all -> 0x181b }
            r1[r7] = r6     // Catch:{ all -> 0x181b }
            r7 = 1
            r1[r7] = r8     // Catch:{ all -> 0x181b }
            r50 = r41
            r51 = r41
            r46 = r12
            r48 = r1
            r49 = r41
            android.database.Cursor r7 = r46.query(r47, r48, r49, r50, r51)     // Catch:{ all -> 0x181b }
            if (r7 == 0) goto L_0x0d79
            int r14 = r7.getColumnIndexOrThrow(r6)     // Catch:{ all -> 0x0d87 }
            int r15 = r7.getColumnIndexOrThrow(r8)     // Catch:{ all -> 0x0d87 }
        L_0x0d16:
            boolean r1 = r7.moveToNext()     // Catch:{ all -> 0x0d87 }
            if (r1 == 0) goto L_0x0d76
            int r1 = r13.size()     // Catch:{ all -> 0x0d87 }
            if (r1 < r2) goto L_0x0d29
            boolean r1 = X.C220416k.A01(r12, r10, r13)     // Catch:{ all -> 0x0d87 }
            if (r1 != 0) goto L_0x0d29
            goto L_0x0d71
        L_0x0d29:
            long r26 = r7.getLong(r14)     // Catch:{ all -> 0x0d87 }
            java.lang.String r1 = r7.getString(r15)     // Catch:{ all -> 0x0d87 }
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.getNullable(r1)     // Catch:{ all -> 0x0d87 }
            if (r1 == 0) goto L_0x0d16
            android.content.ContentProviderOperation$Builder r6 = android.content.ContentProviderOperation.newDelete(r30)     // Catch:{ all -> 0x0d87 }
            r1 = 1
            android.content.ContentProviderOperation$Builder r8 = r6.withYieldAllowed(r1)     // Catch:{ all -> 0x0d87 }
            java.lang.String r6 = "raw_contact_id = ? AND mimetype in (?,?,?,?,?)"
            r1 = 5
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x0d87 }
            java.lang.String r19 = java.lang.String.valueOf(r26)     // Catch:{ all -> 0x0d87 }
            r16 = 0
            r1[r16] = r19     // Catch:{ all -> 0x0d87 }
            java.lang.String r19 = "vnd.android.cursor.item/name"
            r16 = 1
            r1[r16] = r19     // Catch:{ all -> 0x0d87 }
            java.lang.String r16 = "vnd.android.cursor.item/vnd.com.obwhatsapp.profile"
            r1[r3] = r16     // Catch:{ all -> 0x0d87 }
            java.lang.String r16 = "vnd.android.cursor.item/vnd.com.obwhatsapp.voip.call"
            r1[r11] = r16     // Catch:{ all -> 0x0d87 }
            r19 = 4
            java.lang.String r16 = "vnd.android.cursor.item/vnd.com.obwhatsapp.video.call"
            r1[r19] = r16     // Catch:{ all -> 0x0d87 }
            android.content.ContentProviderOperation$Builder r1 = r8.withSelection(r6, r1)     // Catch:{ all -> 0x0d87 }
            android.content.ContentProviderOperation r1 = r1.build()     // Catch:{ all -> 0x0d87 }
            r13.add(r1)     // Catch:{ all -> 0x0d87 }
            goto L_0x0d16
        L_0x0d71:
            r7.close()     // Catch:{ all -> 0x181b }
            goto L_0x0cef
        L_0x0d76:
            r7.close()     // Catch:{ all -> 0x181b }
        L_0x0d79:
            boolean r1 = r13.isEmpty()     // Catch:{ all -> 0x181b }
            if (r1 != 0) goto L_0x0d97
            boolean r1 = X.C220416k.A01(r12, r10, r13)     // Catch:{ all -> 0x181b }
            if (r1 != 0) goto L_0x0d97
            goto L_0x0cef
        L_0x0d87:
            r0 = move-exception
            goto L_0x1817
        L_0x0d8a:
            if (r17 != 0) goto L_0x0d97
            java.lang.String r0 = "androidcontactssync/skipping raw contacts sync to Android contacts content provider due to null account"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x181b }
            java.util.List r8 = java.util.Collections.emptyList()     // Catch:{ all -> 0x181b }
            goto L_0x17e9
        L_0x0d97:
            r1 = r18
            X.19Y r1 = r1.A01     // Catch:{ all -> 0x181b }
            boolean r1 = r1.A00()     // Catch:{ all -> 0x181b }
            if (r1 != 0) goto L_0x0dac
            java.lang.String r0 = "androidcontactssync/skipping raw contacts sync to Android contacts content provider due to permissions denied"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x181b }
            java.util.List r8 = java.util.Collections.emptyList()     // Catch:{ all -> 0x181b }
            goto L_0x17e9
        L_0x0dac:
            boolean r1 = r34.isEmpty()     // Catch:{ all -> 0x181b }
            if (r1 == 0) goto L_0x0db8
            java.util.List r8 = java.util.Collections.emptyList()     // Catch:{ all -> 0x181b }
            goto L_0x17e9
        L_0x0db8:
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ all -> 0x181b }
            r10.<init>()     // Catch:{ all -> 0x181b }
            java.util.Iterator r3 = r34.iterator()     // Catch:{ all -> 0x181b }
        L_0x0dc1:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x181b }
            if (r1 == 0) goto L_0x0dd9
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x181b }
            X.0sH r2 = (X.C16010sH) r2     // Catch:{ all -> 0x181b }
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r2.A08(r1)     // Catch:{ all -> 0x181b }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ all -> 0x181b }
            r10.put(r1, r2)     // Catch:{ all -> 0x181b }
            goto L_0x0dc1
        L_0x0dd9:
            android.net.Uri r1 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x181b }
            android.net.Uri$Builder r2 = r1.buildUpon()     // Catch:{ all -> 0x181b }
            java.lang.String r42 = "account_name"
            r1 = r17
            java.lang.String r3 = r1.name     // Catch:{ all -> 0x181b }
            r1 = r42
            android.net.Uri$Builder r2 = r2.appendQueryParameter(r1, r3)     // Catch:{ all -> 0x181b }
            java.lang.String r41 = "account_type"
            r1 = r17
            java.lang.String r3 = r1.type     // Catch:{ all -> 0x181b }
            r1 = r41
            android.net.Uri$Builder r3 = r2.appendQueryParameter(r1, r3)     // Catch:{ all -> 0x181b }
            java.lang.String r40 = "caller_is_syncadapter"
            java.lang.String r39 = "true"
            r2 = r40
            r1 = r39
            android.net.Uri$Builder r1 = r3.appendQueryParameter(r2, r1)     // Catch:{ all -> 0x181b }
            android.net.Uri r32 = r1.build()     // Catch:{ all -> 0x181b }
            android.net.Uri r1 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ all -> 0x181b }
            android.net.Uri$Builder r3 = r1.buildUpon()     // Catch:{ all -> 0x181b }
            r1 = r39
            android.net.Uri$Builder r1 = r3.appendQueryParameter(r2, r1)     // Catch:{ all -> 0x181b }
            android.net.Uri r31 = r1.build()     // Catch:{ all -> 0x181b }
            java.util.HashSet r38 = new java.util.HashSet     // Catch:{ all -> 0x181b }
            r38.<init>()     // Catch:{ all -> 0x181b }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x181b }
            r8.<init>()     // Catch:{ all -> 0x181b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x181b }
            r2.<init>()     // Catch:{ all -> 0x181b }
            java.lang.String r1 = "androidcontactssync/starting sync of raw contacts to Android contacts content provider, size="
            r2.append(r1)     // Catch:{ all -> 0x181b }
            int r1 = r34.size()     // Catch:{ all -> 0x181b }
            r2.append(r1)     // Catch:{ all -> 0x181b }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x181b }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x181b }
            android.content.ContentResolver r30 = r56.getContentResolver()     // Catch:{ all -> 0x181b }
            r1 = 4
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ all -> 0x181b }
            java.lang.String r2 = "_id"
            r6 = 0
            r3[r6] = r2     // Catch:{ all -> 0x181b }
            java.lang.String r19 = "sync1"
            r1 = 1
            r3[r1] = r19     // Catch:{ all -> 0x181b }
            java.lang.String r1 = "deleted"
            r7 = 2
            r3[r7] = r1     // Catch:{ all -> 0x181b }
            r3[r11] = r33     // Catch:{ all -> 0x181b }
            r14 = 0
            r16 = r14
            r11 = r30
            r12 = r32
            r13 = r3
            r15 = r14
            android.database.Cursor r7 = r11.query(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x181b }
            java.lang.String r3 = "androidcontactssync/finished query of current raw contacts"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x1814 }
            if (r7 == 0) goto L_0x0ef6
            int r24 = r7.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x1814 }
            r2 = r19
            int r16 = r7.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x1814 }
            int r15 = r7.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x1814 }
            r1 = r33
            int r14 = r7.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x1814 }
        L_0x0e7b:
            boolean r1 = r7.moveToNext()     // Catch:{ all -> 0x1814 }
            if (r1 == 0) goto L_0x0ef3
            r1 = r24
            long r1 = r7.getLong(r1)     // Catch:{ all -> 0x1814 }
            r3 = r16
            java.lang.String r3 = r7.getString(r3)     // Catch:{ all -> 0x1814 }
            com.whatsapp.jid.UserJid r11 = com.whatsapp.jid.UserJid.getNullable(r3)     // Catch:{ all -> 0x1814 }
            boolean r3 = r7.isNull(r15)     // Catch:{ all -> 0x1814 }
            if (r3 == 0) goto L_0x0e99
            r13 = 0
            goto L_0x0e9d
        L_0x0e99:
            int r13 = r7.getInt(r15)     // Catch:{ all -> 0x1814 }
        L_0x0e9d:
            java.lang.String r3 = r7.getString(r14)     // Catch:{ all -> 0x1814 }
            X.27p r12 = new X.27p     // Catch:{ all -> 0x1814 }
            r12.<init>(r11, r3, r1)     // Catch:{ all -> 0x1814 }
            if (r13 == 0) goto L_0x0edf
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x1814 }
            r11.<init>()     // Catch:{ all -> 0x1814 }
            java.lang.String r3 = "androidcontactssync/ --> deleting data rows for raw contact "
            r11.append(r3)     // Catch:{ all -> 0x1814 }
            r11.append(r12)     // Catch:{ all -> 0x1814 }
            java.lang.String r3 = r11.toString()     // Catch:{ all -> 0x1814 }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x1814 }
            java.lang.String r13 = "raw_contact_id=?"
            r3 = 1
            java.lang.String[] r12 = new java.lang.String[r3]     // Catch:{ Exception -> 0x0ecf }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0ecf }
            r12[r6] = r3     // Catch:{ Exception -> 0x0ecf }
            r11 = r31
            r3 = r30
            r3.delete(r11, r13, r12)     // Catch:{ Exception -> 0x0ecf }
            goto L_0x0ed5
        L_0x0ecf:
            r11 = move-exception
            java.lang.String r3 = "androidcontactssync/delete error"
            com.whatsapp.util.Log.w(r3, r11)     // Catch:{ all -> 0x1814 }
        L_0x0ed5:
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x1814 }
            r1 = r38
            r1.add(r2)     // Catch:{ all -> 0x1814 }
            goto L_0x0e7b
        L_0x0edf:
            java.lang.Object r1 = r8.get(r11)     // Catch:{ all -> 0x1814 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x1814 }
            if (r1 != 0) goto L_0x0eef
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x1814 }
            r1.<init>()     // Catch:{ all -> 0x1814 }
            r8.put(r11, r1)     // Catch:{ all -> 0x1814 }
        L_0x0eef:
            r1.add(r12)     // Catch:{ all -> 0x1814 }
            goto L_0x0e7b
        L_0x0ef3:
            r7.close()     // Catch:{ all -> 0x181b }
        L_0x0ef6:
            java.util.HashSet r14 = new java.util.HashSet     // Catch:{ all -> 0x181b }
            r14.<init>()     // Catch:{ all -> 0x181b }
            java.util.Set r1 = r8.entrySet()     // Catch:{ all -> 0x181b }
            java.util.Iterator r26 = r1.iterator()     // Catch:{ all -> 0x181b }
        L_0x0f03:
            boolean r1 = r26.hasNext()     // Catch:{ all -> 0x181b }
            if (r1 == 0) goto L_0x0f9d
            java.lang.Object r3 = r26.next()     // Catch:{ all -> 0x181b }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x181b }
            java.lang.Object r13 = r3.getKey()     // Catch:{ all -> 0x181b }
            com.whatsapp.jid.UserJid r13 = (com.whatsapp.jid.UserJid) r13     // Catch:{ all -> 0x181b }
            java.lang.Object r2 = r10.get(r13)     // Catch:{ all -> 0x181b }
            X.0sH r2 = (X.C16010sH) r2     // Catch:{ all -> 0x181b }
            if (r2 == 0) goto L_0x0f3b
            X.1ko r1 = r2.A0D     // Catch:{ all -> 0x181b }
            if (r1 == 0) goto L_0x0f3b
            boolean r1 = r2.A0i     // Catch:{ all -> 0x181b }
            if (r1 == 0) goto L_0x0f3b
            boolean r1 = r2.A0J()     // Catch:{ all -> 0x181b }
            if (r1 != 0) goto L_0x0f3b
            X.0rv r1 = r2.A0E     // Catch:{ all -> 0x181b }
            boolean r1 = X.C16030sJ.A0G(r1)     // Catch:{ all -> 0x181b }
            if (r1 != 0) goto L_0x0f3b
            X.0rv r1 = r2.A0E     // Catch:{ all -> 0x181b }
            boolean r1 = r1 instanceof X.C34991lC     // Catch:{ all -> 0x181b }
            r24 = 1
            if (r1 == 0) goto L_0x0f3d
        L_0x0f3b:
            r24 = 0
        L_0x0f3d:
            java.lang.Object r12 = r3.getValue()     // Catch:{ all -> 0x181b }
            java.util.ArrayList r12 = (java.util.ArrayList) r12     // Catch:{ all -> 0x181b }
            int r1 = r12.size()     // Catch:{ all -> 0x181b }
            int r11 = r1 + -1
            if (r24 == 0) goto L_0x0f4d
            int r11 = r1 + -2
        L_0x0f4d:
            r7 = 0
        L_0x0f4e:
            if (r7 > r11) goto L_0x0f96
            java.lang.Object r3 = r12.get(r7)     // Catch:{ all -> 0x181b }
            X.27p r3 = (X.C452327p) r3     // Catch:{ all -> 0x181b }
            long r1 = r3.A00     // Catch:{ all -> 0x181b }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x181b }
            r1 = r38
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x181b }
            if (r1 != 0) goto L_0x0f93
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x181b }
            r2.<init>()     // Catch:{ all -> 0x181b }
            java.lang.String r1 = "androidcontactssync/ --> deleting raw contact "
            r2.append(r1)     // Catch:{ all -> 0x181b }
            r2.append(r3)     // Catch:{ all -> 0x181b }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x181b }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x181b }
            java.lang.String r2 = "_id = ?"
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ Exception -> 0x0f8d }
            long r15 = r3.A00     // Catch:{ Exception -> 0x0f8d }
            java.lang.String r3 = java.lang.String.valueOf(r15)     // Catch:{ Exception -> 0x0f8d }
            r1[r6] = r3     // Catch:{ Exception -> 0x0f8d }
            r15 = r30
            r3 = r32
            r15.delete(r3, r2, r1)     // Catch:{ Exception -> 0x0f8d }
            goto L_0x0f93
        L_0x0f8d:
            r2 = move-exception
            java.lang.String r1 = "androidcontactssync/delete error"
            com.whatsapp.util.Log.w(r1, r2)     // Catch:{ all -> 0x181b }
        L_0x0f93:
            int r7 = r7 + 1
            goto L_0x0f4e
        L_0x0f96:
            if (r24 != 0) goto L_0x0f03
            r14.add(r13)     // Catch:{ all -> 0x181b }
            goto L_0x0f03
        L_0x0f9d:
            java.util.Set r1 = r8.keySet()     // Catch:{ all -> 0x181b }
            r1.removeAll(r14)     // Catch:{ all -> 0x181b }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x181b }
            r7.<init>()     // Catch:{ all -> 0x181b }
            java.util.ArrayList r33 = new java.util.ArrayList     // Catch:{ all -> 0x181b }
            r33.<init>()     // Catch:{ all -> 0x181b }
            java.util.HashSet r29 = new java.util.HashSet     // Catch:{ all -> 0x181b }
            r29.<init>()     // Catch:{ all -> 0x181b }
            java.util.HashSet r28 = new java.util.HashSet     // Catch:{ all -> 0x181b }
            r28.<init>()     // Catch:{ all -> 0x181b }
            java.util.HashSet r27 = new java.util.HashSet     // Catch:{ all -> 0x181b }
            r27.<init>()     // Catch:{ all -> 0x181b }
            java.util.HashSet r26 = new java.util.HashSet     // Catch:{ all -> 0x181b }
            r26.<init>()     // Catch:{ all -> 0x181b }
            java.util.HashSet r24 = new java.util.HashSet     // Catch:{ all -> 0x181b }
            r24.<init>()     // Catch:{ all -> 0x181b }
            java.lang.String r3 = "mimetype"
            java.lang.String r1 = "androidcontactssync/buildIdToMimeTypeMap/start"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x181b }
            java.util.HashMap r16 = new java.util.HashMap     // Catch:{ all -> 0x181b }
            r16.<init>()     // Catch:{ all -> 0x181b }
            android.net.Uri r1 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ all -> 0x181b }
            android.net.Uri$Builder r2 = r1.buildUpon()     // Catch:{ all -> 0x181b }
            r10 = 2131893204(0x7f121bd4, float:1.9421178E38)
            r1 = r56
            java.lang.String r10 = r1.getString(r10)     // Catch:{ all -> 0x181b }
            r1 = r42
            android.net.Uri$Builder r10 = r2.appendQueryParameter(r1, r10)     // Catch:{ all -> 0x181b }
            java.lang.String r1 = "com.whatsapp"
            r2 = r41
            android.net.Uri$Builder r11 = r10.appendQueryParameter(r2, r1)     // Catch:{ all -> 0x181b }
            r10 = r40
            r2 = r39
            android.net.Uri$Builder r2 = r11.appendQueryParameter(r10, r2)     // Catch:{ all -> 0x181b }
            android.net.Uri r47 = r2.build()     // Catch:{ all -> 0x181b }
            android.content.ContentResolver r46 = r56.getContentResolver()     // Catch:{ Exception -> 0x1085, OutOfMemoryError -> 0x1144 }
            r11 = 2
            java.lang.String[] r10 = new java.lang.String[r11]     // Catch:{ Exception -> 0x1085, OutOfMemoryError -> 0x1144 }
            r10[r6] = r0     // Catch:{ Exception -> 0x1085, OutOfMemoryError -> 0x1144 }
            r13 = 1
            r10[r13] = r3     // Catch:{ Exception -> 0x1085, OutOfMemoryError -> 0x1144 }
            java.lang.String r49 = "mimetype in (?,?,?,?,?)"
            r2 = 5
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ Exception -> 0x1085, OutOfMemoryError -> 0x1144 }
            java.lang.String r12 = "vnd.android.cursor.item/name"
            r2[r6] = r12     // Catch:{ Exception -> 0x1085, OutOfMemoryError -> 0x1144 }
            java.lang.String r12 = "vnd.android.cursor.item/phone_v2"
            r2[r13] = r12     // Catch:{ Exception -> 0x1085, OutOfMemoryError -> 0x1144 }
            java.lang.String r12 = "vnd.android.cursor.item/vnd.com.obwhatsapp.profile"
            r2[r11] = r12     // Catch:{ Exception -> 0x1085, OutOfMemoryError -> 0x1144 }
            r12 = 3
            java.lang.String r11 = "vnd.android.cursor.item/vnd.com.obwhatsapp.voip.call"
            r2[r12] = r11     // Catch:{ Exception -> 0x1085, OutOfMemoryError -> 0x1144 }
            r12 = 4
            java.lang.String r11 = "vnd.android.cursor.item/vnd.com.obwhatsapp.video.call"
            r2[r12] = r11     // Catch:{ Exception -> 0x1085, OutOfMemoryError -> 0x1144 }
            r51 = 0
            r48 = r10
            r50 = r2
            android.database.Cursor r14 = r46.query(r47, r48, r49, r50, r51)     // Catch:{ Exception -> 0x1085, OutOfMemoryError -> 0x1144 }
            if (r14 != 0) goto L_0x103a
            java.lang.String r2 = "androidcontactssync/failed/null hasDataUriCursorRow cursor"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x107e }
            goto L_0x1090
        L_0x103a:
            int r13 = r14.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x107e }
            int r12 = r14.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x107e }
        L_0x1042:
            boolean r2 = r14.moveToNext()     // Catch:{ all -> 0x107e }
            if (r2 == 0) goto L_0x107a
            long r10 = r14.getLong(r13)     // Catch:{ all -> 0x107e }
            java.lang.Long r11 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x107e }
            java.lang.String r15 = r14.getString(r12)     // Catch:{ all -> 0x107e }
            r2 = r16
            boolean r2 = r2.containsKey(r11)     // Catch:{ all -> 0x107e }
            if (r2 != 0) goto L_0x1066
            java.util.HashSet r10 = new java.util.HashSet     // Catch:{ all -> 0x107e }
            r10.<init>()     // Catch:{ all -> 0x107e }
            r2 = r16
            r2.put(r11, r10)     // Catch:{ all -> 0x107e }
        L_0x1066:
            r2 = r16
            java.lang.Object r10 = r2.get(r11)     // Catch:{ all -> 0x107e }
            java.util.Set r10 = (java.util.Set) r10     // Catch:{ all -> 0x107e }
            byte r2 = X.C220416k.A00(r15)     // Catch:{ all -> 0x107e }
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)     // Catch:{ all -> 0x107e }
            r10.add(r2)     // Catch:{ all -> 0x107e }
            goto L_0x1042
        L_0x107a:
            r14.close()     // Catch:{ Exception -> 0x1085, OutOfMemoryError -> 0x1144 }
            goto L_0x108b
        L_0x107e:
            r2 = move-exception
            if (r14 == 0) goto L_0x1084
            r14.close()     // Catch:{ all -> 0x1084 }
        L_0x1084:
            throw r2     // Catch:{ Exception -> 0x1085, OutOfMemoryError -> 0x1144 }
        L_0x1085:
            r10 = move-exception
            java.lang.String r2 = "androidcontactssync/failed/null hasDataUriCursorRow error"
            com.whatsapp.util.Log.e(r2, r10)     // Catch:{ all -> 0x181b }
        L_0x108b:
            java.lang.String r2 = "androidcontactssync/buildIdToMimeTypeMap/end"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x181b }
        L_0x1090:
            java.lang.String r11 = "data3"
            java.lang.String r10 = "data2"
            java.lang.String r2 = "androidcontactssync/buildIdToCustomLabelMap/start"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x181b }
            java.util.HashMap r46 = new java.util.HashMap     // Catch:{ all -> 0x181b }
            r46.<init>()     // Catch:{ all -> 0x181b }
            android.net.Uri r2 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ all -> 0x181b }
            android.net.Uri$Builder r12 = r2.buildUpon()     // Catch:{ all -> 0x181b }
            r13 = 2131893204(0x7f121bd4, float:1.9421178E38)
            r2 = r56
            java.lang.String r13 = r2.getString(r13)     // Catch:{ all -> 0x181b }
            r2 = r42
            android.net.Uri$Builder r12 = r12.appendQueryParameter(r2, r13)     // Catch:{ all -> 0x181b }
            r2 = r41
            android.net.Uri$Builder r12 = r12.appendQueryParameter(r2, r1)     // Catch:{ all -> 0x181b }
            r2 = r40
            r1 = r39
            android.net.Uri$Builder r1 = r12.appendQueryParameter(r2, r1)     // Catch:{ all -> 0x181b }
            android.net.Uri r48 = r1.build()     // Catch:{ all -> 0x181b }
            android.content.ContentResolver r47 = r56.getContentResolver()     // Catch:{ Exception -> 0x115b, OutOfMemoryError -> 0x112d }
            r1 = 3
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ Exception -> 0x115b, OutOfMemoryError -> 0x112d }
            r2[r6] = r0     // Catch:{ Exception -> 0x115b, OutOfMemoryError -> 0x112d }
            r1 = 1
            r2[r1] = r10     // Catch:{ Exception -> 0x115b, OutOfMemoryError -> 0x112d }
            r12 = 2
            r2[r12] = r11     // Catch:{ Exception -> 0x115b, OutOfMemoryError -> 0x112d }
            java.lang.String r50 = "mimetype = ?"
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ Exception -> 0x115b, OutOfMemoryError -> 0x112d }
            java.lang.String r12 = "vnd.android.cursor.item/phone_v2"
            r1[r6] = r12     // Catch:{ Exception -> 0x115b, OutOfMemoryError -> 0x112d }
            r52 = 0
            r49 = r2
            r51 = r1
            android.database.Cursor r15 = r47.query(r48, r49, r50, r51, r52)     // Catch:{ Exception -> 0x115b, OutOfMemoryError -> 0x112d }
            if (r15 != 0) goto L_0x10f0
            java.lang.String r1 = "androidcontactssync/failed/null hasDataUriCursorRow cursor"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x1126 }
            goto L_0x1176
        L_0x10f0:
            int r47 = r15.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x1126 }
            int r14 = r15.getColumnIndexOrThrow(r10)     // Catch:{ all -> 0x1126 }
            int r13 = r15.getColumnIndexOrThrow(r11)     // Catch:{ all -> 0x1126 }
        L_0x10fc:
            boolean r1 = r15.moveToNext()     // Catch:{ all -> 0x1126 }
            if (r1 == 0) goto L_0x1122
            r1 = r47
            long r1 = r15.getLong(r1)     // Catch:{ all -> 0x1126 }
            java.lang.Long r12 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x1126 }
            int r1 = r15.getInt(r14)     // Catch:{ all -> 0x1126 }
            java.lang.String r2 = r15.getString(r13)     // Catch:{ all -> 0x1126 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x1126 }
            android.util.Pair r2 = android.util.Pair.create(r1, r2)     // Catch:{ all -> 0x1126 }
            r1 = r46
            r1.put(r12, r2)     // Catch:{ all -> 0x1126 }
            goto L_0x10fc
        L_0x1122:
            r15.close()     // Catch:{ Exception -> 0x115b, OutOfMemoryError -> 0x112d }
            goto L_0x1161
        L_0x1126:
            r1 = move-exception
            if (r15 == 0) goto L_0x112c
            r15.close()     // Catch:{ all -> 0x112c }
        L_0x112c:
            throw r1     // Catch:{ Exception -> 0x115b, OutOfMemoryError -> 0x112d }
        L_0x112d:
            r2 = move-exception
            java.lang.String r0 = "androidcontactssync/hasCustomLabel/too-many-rows/size/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x181b }
            r1.<init>(r0)     // Catch:{ all -> 0x181b }
            int r0 = r46.size()     // Catch:{ all -> 0x181b }
            r1.append(r0)     // Catch:{ all -> 0x181b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x181b }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x181b }
            goto L_0x115a
        L_0x1144:
            r2 = move-exception
            java.lang.String r0 = "androidcontactssync/too-many-rows/size/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x181b }
            r1.<init>(r0)     // Catch:{ all -> 0x181b }
            int r0 = r16.size()     // Catch:{ all -> 0x181b }
            r1.append(r0)     // Catch:{ all -> 0x181b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x181b }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x181b }
        L_0x115a:
            throw r2     // Catch:{ all -> 0x181b }
        L_0x115b:
            r2 = move-exception
            java.lang.String r1 = "androidcontactssync/hasCustomLabel/failed/null hasDataUriCursorRow error"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x181b }
        L_0x1161:
            java.lang.String r1 = "androidcontactssync/buildIdToCustomLabelMap/end/"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x181b }
            r2.<init>(r1)     // Catch:{ all -> 0x181b }
            int r1 = r46.size()     // Catch:{ all -> 0x181b }
            r2.append(r1)     // Catch:{ all -> 0x181b }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x181b }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x181b }
        L_0x1176:
            r2 = 2131893143(0x7f121b97, float:1.9421054E38)
            r1 = r56
            java.lang.String r49 = r1.getString(r2)     // Catch:{ all -> 0x181b }
            java.lang.String r1 = "androidcontactssync/adding missing raw contacts or adding/updating whatsapp data labels"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x181b }
            java.util.Iterator r48 = r34.iterator()     // Catch:{ all -> 0x181b }
        L_0x1188:
            boolean r1 = r48.hasNext()     // Catch:{ all -> 0x181b }
            if (r1 == 0) goto L_0x1502
            java.lang.Object r50 = r48.next()     // Catch:{ all -> 0x181b }
            r1 = r50
            X.0sH r1 = (X.C16010sH) r1     // Catch:{ all -> 0x181b }
            r50 = r1
            int r2 = r7.size()     // Catch:{ all -> 0x181b }
            r1 = 100
            if (r2 < r1) goto L_0x11a7
            java.lang.String r2 = "error adding/updating contact data MIMETYPE labels"
            r1 = r30
            X.C220416k.A01(r1, r2, r7)     // Catch:{ all -> 0x181b }
        L_0x11a7:
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            r1 = r50
            com.whatsapp.jid.Jid r13 = r1.A08(r2)     // Catch:{ all -> 0x181b }
            com.whatsapp.jid.UserJid r13 = (com.whatsapp.jid.UserJid) r13     // Catch:{ all -> 0x181b }
            X.AnonymousClass00B.A06(r13)     // Catch:{ all -> 0x181b }
            X.1ko r1 = r1.A0D     // Catch:{ all -> 0x181b }
            if (r1 == 0) goto L_0x11e4
            r1 = r50
            boolean r1 = r1.A0i     // Catch:{ all -> 0x181b }
            if (r1 == 0) goto L_0x11e4
            boolean r1 = r50.A0J()     // Catch:{ all -> 0x181b }
            if (r1 != 0) goto L_0x11e4
            r1 = r50
            X.0rv r1 = r1.A0E     // Catch:{ all -> 0x181b }
            boolean r1 = X.C16030sJ.A0G(r1)     // Catch:{ all -> 0x181b }
            if (r1 != 0) goto L_0x11e4
            r1 = r50
            X.0rv r1 = r1.A0E     // Catch:{ all -> 0x181b }
            boolean r1 = r1 instanceof X.C34991lC     // Catch:{ all -> 0x181b }
            if (r1 != 0) goto L_0x11e4
            boolean r1 = r8.containsKey(r13)     // Catch:{ all -> 0x181b }
            if (r1 != 0) goto L_0x1221
            r2 = r33
            r1 = r50
            r2.add(r1)     // Catch:{ all -> 0x181b }
            goto L_0x1188
        L_0x11e4:
            boolean r1 = r8.containsKey(r13)     // Catch:{ all -> 0x181b }
            if (r1 == 0) goto L_0x1221
            java.lang.Object r1 = r8.get(r13)     // Catch:{ all -> 0x181b }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x181b }
            java.util.Iterator r15 = r1.iterator()     // Catch:{ all -> 0x181b }
        L_0x11f4:
            boolean r1 = r15.hasNext()     // Catch:{ all -> 0x181b }
            if (r1 == 0) goto L_0x1188
            java.lang.Object r1 = r15.next()     // Catch:{ all -> 0x181b }
            X.27p r1 = (X.C452327p) r1     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r12 = android.content.ContentProviderOperation.newDelete(r32)     // Catch:{ all -> 0x181b }
            r2 = 1
            android.content.ContentProviderOperation$Builder r14 = r12.withYieldAllowed(r2)     // Catch:{ all -> 0x181b }
            java.lang.String r13 = "_id=?"
            java.lang.String[] r12 = new java.lang.String[r2]     // Catch:{ all -> 0x181b }
            long r1 = r1.A00     // Catch:{ all -> 0x181b }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x181b }
            r12[r6] = r1     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r1 = r14.withSelection(r13, r12)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation r1 = r1.build()     // Catch:{ all -> 0x181b }
            r7.add(r1)     // Catch:{ all -> 0x181b }
            goto L_0x11f4
        L_0x1221:
            boolean r1 = r8.containsKey(r13)     // Catch:{ all -> 0x181b }
            if (r1 == 0) goto L_0x1188
            java.lang.Object r2 = r8.get(r13)     // Catch:{ all -> 0x181b }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x181b }
            int r1 = r2.size()     // Catch:{ all -> 0x181b }
            r12 = 1
            int r1 = r1 - r12
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x181b }
            X.27p r1 = (X.C452327p) r1     // Catch:{ all -> 0x181b }
            long r1 = r1.A00     // Catch:{ all -> 0x181b }
            r51 = r1
            java.lang.Long r15 = java.lang.Long.valueOf(r51)     // Catch:{ all -> 0x181b }
            r1 = r16
            java.lang.Object r14 = r1.get(r15)     // Catch:{ all -> 0x181b }
            java.util.Set r14 = (java.util.Set) r14     // Catch:{ all -> 0x181b }
            if (r14 == 0) goto L_0x13a9
            java.lang.String r12 = "vnd.android.cursor.item/name"
            byte r1 = X.C220416k.A00(r12)     // Catch:{ all -> 0x181b }
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)     // Catch:{ all -> 0x181b }
            boolean r1 = r14.contains(r1)     // Catch:{ all -> 0x181b }
            if (r1 != 0) goto L_0x13c2
            r1 = r29
            boolean r1 = r1.contains(r15)     // Catch:{ all -> 0x181b }
            if (r1 != 0) goto L_0x128b
            android.content.ContentProviderOperation$Builder r2 = android.content.ContentProviderOperation.newInsert(r31)     // Catch:{ all -> 0x181b }
            r1 = 1
            android.content.ContentProviderOperation$Builder r1 = r2.withYieldAllowed(r1)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r1 = r1.withValue(r0, r15)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r12 = r1.withValue(r3, r12)     // Catch:{ all -> 0x181b }
            java.lang.String r2 = "data1"
            java.lang.String r1 = r50.A09()     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r1 = r12.withValue(r2, r1)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation r1 = r1.build()     // Catch:{ all -> 0x181b }
            r7.add(r1)     // Catch:{ all -> 0x181b }
            r1 = r29
            r1.add(r15)     // Catch:{ all -> 0x181b }
        L_0x128b:
            r1 = r18
            X.013 r12 = r1.A03     // Catch:{ all -> 0x181b }
            java.lang.String r2 = r13.user     // Catch:{ all -> 0x181b }
            X.1Mf r1 = X.C26071Mf.A00()     // Catch:{ all -> 0x181b }
            java.lang.String r1 = X.C24561Gk.A00(r1, r2)     // Catch:{ all -> 0x181b }
            java.lang.String r47 = r12.A0H(r1)     // Catch:{ all -> 0x181b }
            java.lang.String r12 = "vnd.android.cursor.item/vnd.com.obwhatsapp.profile"
            byte r1 = X.C220416k.A00(r12)     // Catch:{ all -> 0x181b }
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)     // Catch:{ all -> 0x181b }
            boolean r1 = r14.contains(r1)     // Catch:{ all -> 0x181b }
            if (r1 != 0) goto L_0x12f7
            r1 = r28
            boolean r1 = r1.contains(r15)     // Catch:{ all -> 0x181b }
            if (r1 != 0) goto L_0x12f7
            android.content.ContentProviderOperation$Builder r2 = android.content.ContentProviderOperation.newInsert(r31)     // Catch:{ all -> 0x181b }
            r1 = 1
            android.content.ContentProviderOperation$Builder r1 = r2.withYieldAllowed(r1)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r1 = r1.withValue(r0, r15)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r12 = r1.withValue(r3, r12)     // Catch:{ all -> 0x181b }
            java.lang.String r2 = "data1"
            java.lang.String r1 = r13.getRawString()     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r2 = r12.withValue(r2, r1)     // Catch:{ all -> 0x181b }
            r1 = r49
            android.content.ContentProviderOperation$Builder r34 = r2.withValue(r10, r1)     // Catch:{ all -> 0x181b }
            r12 = 2131886218(0x7f12008a, float:1.9407009E38)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x181b }
            r2[r6] = r47     // Catch:{ all -> 0x181b }
            r1 = r56
            java.lang.String r2 = r1.getString(r12, r2)     // Catch:{ all -> 0x181b }
            r1 = r34
            android.content.ContentProviderOperation$Builder r1 = r1.withValue(r11, r2)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation r1 = r1.build()     // Catch:{ all -> 0x181b }
            r7.add(r1)     // Catch:{ all -> 0x181b }
            r1 = r28
            r1.add(r15)     // Catch:{ all -> 0x181b }
        L_0x12f7:
            java.lang.String r12 = "vnd.android.cursor.item/vnd.com.obwhatsapp.voip.call"
            byte r1 = X.C220416k.A00(r12)     // Catch:{ all -> 0x181b }
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)     // Catch:{ all -> 0x181b }
            boolean r1 = r14.contains(r1)     // Catch:{ all -> 0x181b }
            if (r1 != 0) goto L_0x1351
            r1 = r27
            boolean r1 = r1.contains(r15)     // Catch:{ all -> 0x181b }
            if (r1 != 0) goto L_0x1351
            android.content.ContentProviderOperation$Builder r2 = android.content.ContentProviderOperation.newInsert(r31)     // Catch:{ all -> 0x181b }
            r1 = 1
            android.content.ContentProviderOperation$Builder r1 = r2.withYieldAllowed(r1)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r1 = r1.withValue(r0, r15)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r12 = r1.withValue(r3, r12)     // Catch:{ all -> 0x181b }
            java.lang.String r2 = "data1"
            java.lang.String r1 = r13.getRawString()     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r2 = r12.withValue(r2, r1)     // Catch:{ all -> 0x181b }
            r1 = r49
            android.content.ContentProviderOperation$Builder r34 = r2.withValue(r10, r1)     // Catch:{ all -> 0x181b }
            r12 = 2131886220(0x7f12008c, float:1.9407013E38)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x181b }
            r2[r6] = r47     // Catch:{ all -> 0x181b }
            r1 = r56
            java.lang.String r2 = r1.getString(r12, r2)     // Catch:{ all -> 0x181b }
            r1 = r34
            android.content.ContentProviderOperation$Builder r1 = r1.withValue(r11, r2)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation r1 = r1.build()     // Catch:{ all -> 0x181b }
            r7.add(r1)     // Catch:{ all -> 0x181b }
            r1 = r27
            r1.add(r15)     // Catch:{ all -> 0x181b }
        L_0x1351:
            java.lang.String r12 = "vnd.android.cursor.item/vnd.com.obwhatsapp.video.call"
            byte r1 = X.C220416k.A00(r12)     // Catch:{ all -> 0x181b }
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)     // Catch:{ all -> 0x181b }
            boolean r1 = r14.contains(r1)     // Catch:{ all -> 0x181b }
            if (r1 != 0) goto L_0x13a9
            r1 = r26
            boolean r1 = r1.contains(r15)     // Catch:{ all -> 0x181b }
            if (r1 != 0) goto L_0x13a9
            android.content.ContentProviderOperation$Builder r2 = android.content.ContentProviderOperation.newInsert(r31)     // Catch:{ all -> 0x181b }
            r1 = 1
            android.content.ContentProviderOperation$Builder r1 = r2.withYieldAllowed(r1)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r1 = r1.withValue(r0, r15)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r2 = r1.withValue(r3, r12)     // Catch:{ all -> 0x181b }
            java.lang.String r1 = "data1"
            java.lang.String r12 = r13.getRawString()     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r2 = r2.withValue(r1, r12)     // Catch:{ all -> 0x181b }
            r1 = r49
            android.content.ContentProviderOperation$Builder r13 = r2.withValue(r10, r1)     // Catch:{ all -> 0x181b }
            r12 = 2131886219(0x7f12008b, float:1.940701E38)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x181b }
            r2[r6] = r47     // Catch:{ all -> 0x181b }
            r1 = r56
            java.lang.String r1 = r1.getString(r12, r2)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r1 = r13.withValue(r11, r1)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation r1 = r1.build()     // Catch:{ all -> 0x181b }
            r7.add(r1)     // Catch:{ all -> 0x181b }
            r1 = r26
            r1.add(r15)     // Catch:{ all -> 0x181b }
        L_0x13a9:
            r1 = r50
            X.1ko r1 = r1.A0D     // Catch:{ all -> 0x181b }
            if (r1 == 0) goto L_0x13c0
            java.lang.String r12 = r1.A01     // Catch:{ all -> 0x181b }
        L_0x13b1:
            boolean r1 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x181b }
            if (r1 != 0) goto L_0x1188
            r1 = r46
            boolean r1 = r1.containsKey(r15)     // Catch:{ all -> 0x181b }
            if (r1 == 0) goto L_0x1188
            goto L_0x1400
        L_0x13c0:
            r12 = 0
            goto L_0x13b1
        L_0x13c2:
            r1 = r50
            X.1ko r1 = r1.A0D     // Catch:{ all -> 0x181b }
            long r1 = r1.A00     // Catch:{ all -> 0x181b }
            java.lang.Long r2 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x181b }
            r1 = r37
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x181b }
            if (r1 == 0) goto L_0x128b
            android.content.ContentProviderOperation$Builder r47 = android.content.ContentProviderOperation.newUpdate(r31)     // Catch:{ all -> 0x181b }
            java.lang.String r2 = "raw_contact_id=? AND mimetype=?"
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x181b }
            java.lang.String r34 = java.lang.String.valueOf(r51)     // Catch:{ all -> 0x181b }
            r1[r6] = r34     // Catch:{ all -> 0x181b }
            r34 = 1
            r1[r34] = r12     // Catch:{ all -> 0x181b }
            r12 = r47
            android.content.ContentProviderOperation$Builder r12 = r12.withSelection(r2, r1)     // Catch:{ all -> 0x181b }
            java.lang.String r2 = "data1"
            java.lang.String r1 = r50.A09()     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r1 = r12.withValue(r2, r1)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation r1 = r1.build()     // Catch:{ all -> 0x181b }
            r7.add(r1)     // Catch:{ all -> 0x181b }
            goto L_0x128b
        L_0x1400:
            if (r14 == 0) goto L_0x1415
            java.lang.String r1 = "vnd.android.cursor.item/name"
            byte r1 = X.C220416k.A00(r1)     // Catch:{ all -> 0x181b }
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)     // Catch:{ all -> 0x181b }
            boolean r1 = r14.contains(r1)     // Catch:{ all -> 0x181b }
            r47 = 1
            if (r1 != 0) goto L_0x1417
        L_0x1415:
            r47 = 0
        L_0x1417:
            r1 = r46
            java.lang.Object r1 = r1.get(r15)     // Catch:{ all -> 0x181b }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ all -> 0x181b }
            java.lang.Object r1 = r1.first     // Catch:{ all -> 0x181b }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x181b }
            int r13 = r1.intValue()     // Catch:{ all -> 0x181b }
            r1 = r46
            java.lang.Object r1 = r1.get(r15)     // Catch:{ all -> 0x181b }
            android.util.Pair r1 = (android.util.Pair) r1     // Catch:{ all -> 0x181b }
            java.lang.Object r2 = r1.second     // Catch:{ all -> 0x181b }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x181b }
            r1 = r50
            java.lang.Integer r1 = r1.A0I     // Catch:{ all -> 0x181b }
            int r1 = r1.intValue()     // Catch:{ all -> 0x181b }
            if (r1 != 0) goto L_0x1462
            r1 = r50
            java.lang.String r1 = r1.A0R     // Catch:{ all -> 0x181b }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x181b }
            if (r1 != 0) goto L_0x1458
            r1 = r50
            java.lang.String r14 = r1.A0R     // Catch:{ all -> 0x181b }
        L_0x144b:
            r1 = r50
            java.lang.Integer r1 = r1.A0I     // Catch:{ all -> 0x181b }
            int r1 = r1.intValue()     // Catch:{ all -> 0x181b }
            r34 = 0
            if (r1 != r13) goto L_0x1466
            goto L_0x1464
        L_0x1458:
            r14 = 2131893204(0x7f121bd4, float:1.9421178E38)
            r1 = r56
            java.lang.String r14 = r1.getString(r14)     // Catch:{ all -> 0x181b }
            goto L_0x144b
        L_0x1462:
            r14 = 0
            goto L_0x144b
        L_0x1464:
            r34 = 1
        L_0x1466:
            if (r14 == 0) goto L_0x146e
            boolean r13 = r14.equals(r2)     // Catch:{ all -> 0x181b }
            if (r13 != 0) goto L_0x147a
        L_0x146e:
            if (r2 == 0) goto L_0x1476
            boolean r13 = r2.equals(r14)     // Catch:{ all -> 0x181b }
            if (r13 != 0) goto L_0x147a
        L_0x1476:
            if (r14 != 0) goto L_0x1484
            if (r2 != 0) goto L_0x1484
        L_0x147a:
            r2 = 1
        L_0x147b:
            if (r34 == 0) goto L_0x1481
            if (r1 != 0) goto L_0x1188
            if (r2 != 0) goto L_0x1188
        L_0x1481:
            if (r47 != 0) goto L_0x14cb
            goto L_0x1486
        L_0x1484:
            r2 = 0
            goto L_0x147b
        L_0x1486:
            r1 = r24
            boolean r1 = r1.contains(r15)     // Catch:{ all -> 0x181b }
            if (r1 != 0) goto L_0x1188
            java.lang.String r13 = "vnd.android.cursor.item/phone_v2"
            android.content.ContentProviderOperation$Builder r2 = android.content.ContentProviderOperation.newInsert(r31)     // Catch:{ all -> 0x181b }
            r1 = 1
            android.content.ContentProviderOperation$Builder r1 = r2.withYieldAllowed(r1)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r1 = r1.withValue(r0, r15)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r2 = r1.withValue(r3, r13)     // Catch:{ all -> 0x181b }
            java.lang.String r1 = "data1"
            android.content.ContentProviderOperation$Builder r2 = r2.withValue(r1, r12)     // Catch:{ all -> 0x181b }
            r1 = r50
            java.lang.Integer r1 = r1.A0I     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r2 = r2.withValue(r10, r1)     // Catch:{ all -> 0x181b }
            r1 = r50
            java.lang.Integer r1 = r1.A0I     // Catch:{ all -> 0x181b }
            int r1 = r1.intValue()     // Catch:{ all -> 0x181b }
            if (r1 != 0) goto L_0x14bd
            r2.withValue(r11, r14)     // Catch:{ all -> 0x181b }
        L_0x14bd:
            android.content.ContentProviderOperation r1 = r2.build()     // Catch:{ all -> 0x181b }
            r7.add(r1)     // Catch:{ all -> 0x181b }
            r1 = r24
            r1.add(r15)     // Catch:{ all -> 0x181b }
            goto L_0x1188
        L_0x14cb:
            java.lang.String r15 = "vnd.android.cursor.item/phone_v2"
            android.content.ContentProviderOperation$Builder r2 = android.content.ContentProviderOperation.newUpdate(r31)     // Catch:{ all -> 0x181b }
            r1 = r50
            java.lang.Integer r1 = r1.A0I     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r12 = r2.withValue(r10, r1)     // Catch:{ all -> 0x181b }
            java.lang.String r2 = "raw_contact_id=? AND mimetype=?"
            r1 = 2
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x181b }
            java.lang.String r13 = java.lang.String.valueOf(r51)     // Catch:{ all -> 0x181b }
            r1[r6] = r13     // Catch:{ all -> 0x181b }
            r13 = 1
            r1[r13] = r15     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r2 = r12.withSelection(r2, r1)     // Catch:{ all -> 0x181b }
            r1 = r50
            java.lang.Integer r1 = r1.A0I     // Catch:{ all -> 0x181b }
            int r1 = r1.intValue()     // Catch:{ all -> 0x181b }
            if (r1 != 0) goto L_0x14f9
            r2.withValue(r11, r14)     // Catch:{ all -> 0x181b }
        L_0x14f9:
            android.content.ContentProviderOperation r1 = r2.build()     // Catch:{ all -> 0x181b }
            r7.add(r1)     // Catch:{ all -> 0x181b }
            goto L_0x1188
        L_0x1502:
            boolean r1 = r7.isEmpty()     // Catch:{ all -> 0x181b }
            if (r1 != 0) goto L_0x150f
            java.lang.String r2 = "error adding/updating contact data MIMETYPE labels"
            r1 = r30
            X.C220416k.A01(r1, r2, r7)     // Catch:{ all -> 0x181b }
        L_0x150f:
            r1 = r18
            X.0rz r12 = r1.A02     // Catch:{ all -> 0x181b }
            X.01D r1 = r12.A01     // Catch:{ all -> 0x181b }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x181b }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ all -> 0x181b }
            java.lang.String r8 = "current_data_action_string_version"
            int r1 = r1.getInt(r8, r6)     // Catch:{ all -> 0x181b }
            r7 = 4
            if (r1 == r7) goto L_0x1538
            r2 = r18
            r13 = r17
            r1 = r56
            r2.A03(r13, r1)     // Catch:{ all -> 0x181b }
            android.content.SharedPreferences$Editor r1 = r12.A0K()     // Catch:{ all -> 0x181b }
            android.content.SharedPreferences$Editor r1 = r1.putInt(r8, r7)     // Catch:{ all -> 0x181b }
            r1.apply()     // Catch:{ all -> 0x181b }
        L_0x1538:
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x181b }
            r13.<init>()     // Catch:{ all -> 0x181b }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x181b }
            r8.<init>()     // Catch:{ all -> 0x181b }
            android.content.ContentResolver r46 = r56.getContentResolver()     // Catch:{ all -> 0x181b }
            java.lang.String r1 = "androidcontactssync/recording raw contacts information to android contacts content provider"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x181b }
            java.util.Iterator r37 = r33.iterator()     // Catch:{ all -> 0x181b }
        L_0x154f:
            boolean r1 = r37.hasNext()     // Catch:{ all -> 0x181b }
            java.lang.String r12 = "error while writing to android contacts provider"
            if (r1 == 0) goto L_0x1713
            java.lang.Object r7 = r37.next()     // Catch:{ all -> 0x181b }
            X.0sH r7 = (X.C16010sH) r7     // Catch:{ all -> 0x181b }
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r14 = r7.A08(r1)     // Catch:{ all -> 0x181b }
            X.AnonymousClass00B.A06(r14)     // Catch:{ all -> 0x181b }
            com.whatsapp.jid.UserJid r14 = (com.whatsapp.jid.UserJid) r14     // Catch:{ all -> 0x181b }
            int r2 = r13.size()     // Catch:{ all -> 0x181b }
            r1 = 100
            if (r2 < r1) goto L_0x1575
            r1 = r46
            X.C220416k.A01(r1, r12, r13)     // Catch:{ all -> 0x181b }
        L_0x1575:
            java.lang.String r1 = r14.user     // Catch:{ all -> 0x181b }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x181b }
            if (r1 == 0) goto L_0x1581
            r8.add(r7)     // Catch:{ all -> 0x181b }
            goto L_0x154f
        L_0x1581:
            X.1ko r1 = r7.A0D     // Catch:{ all -> 0x181b }
            if (r1 == 0) goto L_0x16cc
            java.lang.String r1 = r1.A01     // Catch:{ all -> 0x181b }
            r34 = r1
        L_0x1589:
            java.lang.String r2 = r7.A09()     // Catch:{ all -> 0x181b }
            long r26 = r7.A05()     // Catch:{ all -> 0x181b }
            java.lang.Integer r1 = r7.A0I     // Catch:{ all -> 0x181b }
            r32 = r1
            java.lang.String r1 = r7.A0R     // Catch:{ all -> 0x181b }
            r31 = r1
            android.net.Uri r1 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ all -> 0x181b }
            android.net.Uri$Builder r12 = r1.buildUpon()     // Catch:{ all -> 0x181b }
            r7 = r40
            r1 = r39
            android.net.Uri$Builder r1 = r12.appendQueryParameter(r7, r1)     // Catch:{ all -> 0x181b }
            android.net.Uri r30 = r1.build()     // Catch:{ all -> 0x181b }
            int r12 = r13.size()     // Catch:{ all -> 0x181b }
            java.lang.String r7 = r14.user     // Catch:{ all -> 0x181b }
            X.1Mf r1 = X.C26071Mf.A00()     // Catch:{ all -> 0x181b }
            java.lang.String r29 = X.C24561Gk.A00(r1, r7)     // Catch:{ all -> 0x181b }
            r7 = 2131893143(0x7f121b97, float:1.9421054E38)
            r1 = r56
            java.lang.String r28 = r1.getString(r7)     // Catch:{ all -> 0x181b }
            android.net.Uri r1 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r15 = android.content.ContentProviderOperation.newInsert(r1)     // Catch:{ all -> 0x181b }
            r1 = r17
            java.lang.String r7 = r1.name     // Catch:{ all -> 0x181b }
            r1 = r42
            android.content.ContentProviderOperation$Builder r15 = r15.withValue(r1, r7)     // Catch:{ all -> 0x181b }
            r1 = r17
            java.lang.String r7 = r1.type     // Catch:{ all -> 0x181b }
            r1 = r41
            android.content.ContentProviderOperation$Builder r15 = r15.withValue(r1, r7)     // Catch:{ all -> 0x181b }
            java.lang.String r7 = r14.getRawString()     // Catch:{ all -> 0x181b }
            r1 = r19
            android.content.ContentProviderOperation$Builder r15 = r15.withValue(r1, r7)     // Catch:{ all -> 0x181b }
            java.lang.Long r7 = java.lang.Long.valueOf(r26)     // Catch:{ all -> 0x181b }
            java.lang.String r1 = "sync2"
            android.content.ContentProviderOperation$Builder r7 = r15.withValue(r1, r7)     // Catch:{ all -> 0x181b }
            r27 = 1
            r1 = r27
            android.content.ContentProviderOperation$Builder r1 = r7.withYieldAllowed(r1)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation r1 = r1.build()     // Catch:{ all -> 0x181b }
            r13.add(r1)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r1 = android.content.ContentProviderOperation.newInsert(r30)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r7 = r1.withValueBackReference(r0, r12)     // Catch:{ all -> 0x181b }
            java.lang.String r1 = "vnd.android.cursor.item/name"
            android.content.ContentProviderOperation$Builder r1 = r7.withValue(r3, r1)     // Catch:{ all -> 0x181b }
            java.lang.String r7 = "data1"
            android.content.ContentProviderOperation$Builder r1 = r1.withValue(r7, r2)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation r1 = r1.build()     // Catch:{ all -> 0x181b }
            r13.add(r1)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r1 = android.content.ContentProviderOperation.newInsert(r30)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r2 = r1.withValueBackReference(r0, r12)     // Catch:{ all -> 0x181b }
            java.lang.String r1 = "vnd.android.cursor.item/vnd.com.obwhatsapp.profile"
            android.content.ContentProviderOperation$Builder r2 = r2.withValue(r3, r1)     // Catch:{ all -> 0x181b }
            java.lang.String r1 = r14.getRawString()     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r2 = r2.withValue(r7, r1)     // Catch:{ all -> 0x181b }
            r1 = r28
            android.content.ContentProviderOperation$Builder r26 = r2.withValue(r10, r1)     // Catch:{ all -> 0x181b }
            r1 = r27
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x181b }
            r16 = r1
            r24 = 0
            r1[r6] = r29     // Catch:{ all -> 0x181b }
            r1 = 2131886218(0x7f12008a, float:1.9407009E38)
            r15 = r56
            r2 = r1
            r1 = r16
            java.lang.String r2 = r15.getString(r2, r1)     // Catch:{ all -> 0x181b }
            r1 = r26
            android.content.ContentProviderOperation$Builder r1 = r1.withValue(r11, r2)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation r1 = r1.build()     // Catch:{ all -> 0x181b }
            r13.add(r1)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r1 = android.content.ContentProviderOperation.newInsert(r30)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r2 = r1.withValueBackReference(r0, r12)     // Catch:{ all -> 0x181b }
            java.lang.String r1 = "vnd.android.cursor.item/vnd.com.obwhatsapp.voip.call"
            android.content.ContentProviderOperation$Builder r2 = r2.withValue(r3, r1)     // Catch:{ all -> 0x181b }
            java.lang.String r1 = r14.getRawString()     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r2 = r2.withValue(r7, r1)     // Catch:{ all -> 0x181b }
            r1 = r28
            android.content.ContentProviderOperation$Builder r16 = r2.withValue(r10, r1)     // Catch:{ all -> 0x181b }
            r15 = 2131886220(0x7f12008c, float:1.9407013E38)
            r1 = r27
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x181b }
            r2[r6] = r29     // Catch:{ all -> 0x181b }
            r1 = r56
            java.lang.String r2 = r1.getString(r15, r2)     // Catch:{ all -> 0x181b }
            r1 = r16
            android.content.ContentProviderOperation$Builder r1 = r1.withValue(r11, r2)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation r1 = r1.build()     // Catch:{ all -> 0x181b }
            r13.add(r1)     // Catch:{ all -> 0x181b }
            java.lang.String r2 = "vnd.android.cursor.item/vnd.com.obwhatsapp.video.call"
            android.content.ContentProviderOperation$Builder r1 = android.content.ContentProviderOperation.newInsert(r30)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r1 = r1.withValueBackReference(r0, r12)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r1 = r1.withValue(r3, r2)     // Catch:{ all -> 0x181b }
            java.lang.String r2 = r14.getRawString()     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r2 = r1.withValue(r7, r2)     // Catch:{ all -> 0x181b }
            r1 = r28
            android.content.ContentProviderOperation$Builder r15 = r2.withValue(r10, r1)     // Catch:{ all -> 0x181b }
            r14 = 2131886219(0x7f12008b, float:1.940701E38)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x181b }
            r2[r6] = r29     // Catch:{ all -> 0x181b }
            r1 = r56
            java.lang.String r1 = r1.getString(r14, r2)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r1 = r15.withValue(r11, r1)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation r1 = r1.build()     // Catch:{ all -> 0x181b }
            r13.add(r1)     // Catch:{ all -> 0x181b }
            goto L_0x16d0
        L_0x16cc:
            r34 = 0
            goto L_0x1589
        L_0x16d0:
            if (r34 == 0) goto L_0x154f
            java.lang.String r2 = "vnd.android.cursor.item/phone_v2"
            android.content.ContentProviderOperation$Builder r1 = android.content.ContentProviderOperation.newInsert(r30)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r1 = r1.withValueBackReference(r0, r12)     // Catch:{ all -> 0x181b }
            android.content.ContentProviderOperation$Builder r2 = r1.withValue(r3, r2)     // Catch:{ all -> 0x181b }
            r1 = r34
            android.content.ContentProviderOperation$Builder r7 = r2.withValue(r7, r1)     // Catch:{ all -> 0x181b }
            if (r32 == 0) goto L_0x16ed
            int r24 = r32.intValue()     // Catch:{ all -> 0x181b }
        L_0x16ed:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)     // Catch:{ all -> 0x181b }
            r7.withValue(r10, r1)     // Catch:{ all -> 0x181b }
            if (r24 != 0) goto L_0x170a
            boolean r1 = android.text.TextUtils.isEmpty(r31)     // Catch:{ all -> 0x181b }
            if (r1 == 0) goto L_0x1705
            r2 = 2131893204(0x7f121bd4, float:1.9421178E38)
            r1 = r56
            java.lang.String r31 = r1.getString(r2)     // Catch:{ all -> 0x181b }
        L_0x1705:
            r1 = r31
            r7.withValue(r11, r1)     // Catch:{ all -> 0x181b }
        L_0x170a:
            android.content.ContentProviderOperation r1 = r7.build()     // Catch:{ all -> 0x181b }
            r13.add(r1)     // Catch:{ all -> 0x181b }
            goto L_0x154f
        L_0x1713:
            boolean r0 = r13.isEmpty()     // Catch:{ all -> 0x181b }
            if (r0 != 0) goto L_0x171e
            r0 = r46
            X.C220416k.A01(r0, r12, r13)     // Catch:{ all -> 0x181b }
        L_0x171e:
            java.lang.String r0 = "androidcontactssync/finished recording raw contacts information to android contacts content provider"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x181b }
            r1 = r53
            r0 = r43
            android.content.SharedPreferences r0 = r1.A00(r0)     // Catch:{ all -> 0x181b }
            android.content.SharedPreferences$Editor r2 = r0.edit()     // Catch:{ all -> 0x181b }
            r1 = 3
            r0 = r44
            android.content.SharedPreferences$Editor r0 = r2.putInt(r0, r1)     // Catch:{ all -> 0x181b }
            r0.commit()     // Catch:{ all -> 0x181b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x181b }
            r2.<init>()     // Catch:{ all -> 0x181b }
            java.lang.String r0 = "androidcontactssync/missing raw contacts added "
            r2.append(r0)     // Catch:{ all -> 0x181b }
            int r0 = r33.size()     // Catch:{ all -> 0x181b }
            r2.append(r0)     // Catch:{ all -> 0x181b }
            java.lang.String r0 = " in "
            r2.append(r0)     // Catch:{ all -> 0x181b }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x181b }
            long r0 = r0 - r21
            r2.append(r0)     // Catch:{ all -> 0x181b }
            r0 = r45
            r2.append(r0)     // Catch:{ all -> 0x181b }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x181b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x181b }
            boolean r0 = r38.isEmpty()     // Catch:{ all -> 0x181b }
            if (r0 != 0) goto L_0x17e9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x181b }
            r1.<init>()     // Catch:{ all -> 0x181b }
            java.lang.String r0 = "androidcontactssync/submit deletion from raw-contacts table size="
            r1.append(r0)     // Catch:{ all -> 0x181b }
            int r0 = r38.size()     // Catch:{ all -> 0x181b }
            r1.append(r0)     // Catch:{ all -> 0x181b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x181b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x181b }
            android.net.Uri r0 = android.provider.ContactsContract.RawContacts.CONTENT_URI     // Catch:{ all -> 0x181b }
            android.net.Uri$Builder r2 = r0.buildUpon()     // Catch:{ all -> 0x181b }
            r0 = r17
            java.lang.String r1 = r0.name     // Catch:{ all -> 0x181b }
            r0 = r42
            android.net.Uri$Builder r1 = r2.appendQueryParameter(r0, r1)     // Catch:{ all -> 0x181b }
            r0 = r17
            java.lang.String r2 = r0.type     // Catch:{ all -> 0x181b }
            r0 = r41
            android.net.Uri$Builder r1 = r1.appendQueryParameter(r0, r2)     // Catch:{ all -> 0x181b }
            r2 = r40
            r0 = r39
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r2, r0)     // Catch:{ all -> 0x181b }
            android.net.Uri r2 = r0.build()     // Catch:{ all -> 0x181b }
            java.util.Iterator r10 = r38.iterator()     // Catch:{ all -> 0x181b }
        L_0x17ac:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x181b }
            if (r0 == 0) goto L_0x17e9
            java.lang.Object r7 = r10.next()     // Catch:{ all -> 0x181b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x17e2 }
            r1.<init>()     // Catch:{ Exception -> 0x17e2 }
            java.lang.String r0 = "androidcontactssync/deleting raw contact rows size="
            r1.append(r0)     // Catch:{ Exception -> 0x17e2 }
            int r0 = r38.size()     // Catch:{ Exception -> 0x17e2 }
            r1.append(r0)     // Catch:{ Exception -> 0x17e2 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x17e2 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x17e2 }
            android.content.ContentResolver r3 = r56.getContentResolver()     // Catch:{ Exception -> 0x17e2 }
            java.lang.String r1 = "_id = ?"
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ Exception -> 0x17e2 }
            r0[r6] = r7     // Catch:{ Exception -> 0x17e2 }
            r3.delete(r2, r1, r0)     // Catch:{ Exception -> 0x17e2 }
            java.lang.String r0 = "androidcontactssync/deleting raw contact rows complete"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x17e2 }
            goto L_0x17ac
        L_0x17e2:
            r1 = move-exception
            java.lang.String r0 = "androidcontactssync/error deleting raw contacts with deleted=1"
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x181b }
            goto L_0x17ac
        L_0x17e9:
            monitor-exit(r18)     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
            boolean r0 = r8.isEmpty()     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
            if (r0 != 0) goto L_0x18c2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
            r1.<init>()     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
            java.lang.String r0 = "androidcontactssync/invalid contacts found during android contacts sync; removing "
            r1.append(r0)     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
            int r0 = r8.size()     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
            r1.append(r0)     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
            java.lang.String r0 = " contacts"
            r1.append(r0)     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
            java.lang.String r0 = r1.toString()     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
            r0 = r55
            r0.A0X(r8)     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
            goto L_0x18c2
        L_0x1814:
            r0 = move-exception
            if (r7 == 0) goto L_0x181a
        L_0x1817:
            r7.close()     // Catch:{ all -> 0x181a }
        L_0x181a:
            throw r0     // Catch:{ all -> 0x181b }
        L_0x181b:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
            throw r0     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
        L_0x181e:
            r0 = move-exception
            if (r1 == 0) goto L_0x1824
            r1.close()     // Catch:{ all -> 0x1824 }
        L_0x1824:
            throw r0     // Catch:{ all -> 0x1825 }
        L_0x1825:
            r0 = move-exception
            r38.close()     // Catch:{ all -> 0x1829 }
        L_0x1829:
            throw r0     // Catch:{ SecurityException -> 0x1849, NullPointerException -> 0x1845, RuntimeException -> 0x182a }
        L_0x182a:
            r6 = move-exception
            java.lang.Throwable r0 = r6.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 != 0) goto L_0x1841
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x1894
            java.lang.Throwable r0 = r6.getCause()
            boolean r0 = r0 instanceof android.os.DeadSystemException
            if (r0 == 0) goto L_0x1894
        L_0x1841:
            X.284 r5 = X.AnonymousClass284.A02
            goto L_0x00af
        L_0x1845:
            r6 = move-exception
            java.lang.String r2 = "SyncTask/sync/npe"
            goto L_0x1896
        L_0x1849:
            r6 = move-exception
            java.lang.String r2 = "SyncTask/sync/securityException"
            goto L_0x1896
        L_0x184d:
            java.lang.String r0 = "ContactSyncRequestExecutor/failure"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r3.A00
            int r0 = r0 + 1
            r3.A00 = r0
            r2 = 1390(0x56e, float:1.948E-42)
            r1 = r84
            r0 = r29
            int r1 = r1.A03(r0, r2)
            int r0 = r3.A00
            if (r0 > r1) goto L_0x188e
            int r1 = r5.A00
            r0 = 6
            if (r1 == r0) goto L_0x188e
            r0 = r87
            r0.A00(r5)
        L_0x1870:
            java.lang.Long r0 = r9.A09
            if (r0 != 0) goto L_0x188a
            int r1 = r5.A00
            r0 = 3
            if (r1 == 0) goto L_0x1883
            r0 = 4
            if (r1 == r0) goto L_0x1883
            r0 = 5
            if (r1 == r0) goto L_0x1883
            r0 = 6
            if (r1 == r0) goto L_0x1883
            r0 = -1
        L_0x1883:
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r9.A09 = r0
        L_0x188a:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L_0x1938
        L_0x188e:
            r0 = r87
            r0.A01(r5)
            goto L_0x1870
        L_0x1894:
            java.lang.String r2 = "SyncTask/sync/RuntimeException"
        L_0x1896:
            java.lang.String r1 = "ContactSyncRequestExecutor/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r6)
            X.0so r3 = r4.A01
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r1 = r6.getMessage()
            r0 = 1
            r3.AcB(r2, r1, r0)
        L_0x18c0:
            if (r25 == 0) goto L_0x1928
        L_0x18c2:
            r0 = r25
            java.util.List r2 = r0.A00
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x18d6
            r0 = r25
            java.util.Map r0 = r0.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x1928
        L_0x18d6:
            X.0sG r0 = r4.A09
            X.18c r3 = r0.A06
            r0 = r25
            java.util.Map r1 = r0.A01
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x198a
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x198a
        L_0x18ea:
            android.content.SharedPreferences r1 = r85.A01()
            java.lang.String r3 = "contact_version"
            r0 = 0
            int r2 = r1.getInt(r3, r0)
            java.lang.String r1 = "contact-sync-prefs/getversion="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r2 = r2 + 1
            java.lang.String r1 = "contact-sync-prefs/setversion="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.SharedPreferences r0 = r85.A01()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putInt(r3, r2)
            r0.apply()
        L_0x1928:
            java.lang.Long r0 = r9.A0F
            if (r0 == 0) goto L_0x196e
            long r6 = r0.longValue()
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x196e
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        L_0x1938:
            r9.A04 = r0
            r0 = r83
            r0.A01(r9)
            X.0t9 r0 = r0.A01
            r0.A06(r9)
        L_0x1944:
            long r2 = r82.A02()
            long r8 = r35 - r2
            r6 = 1073741824(0x40000000, double:5.304989477E-315)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x00af
            java.lang.String r0 = "ContactSyncAdapter/excessive internal storage used before: "
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            r0 = r35
            r6.append(r0)
            java.lang.String r0 = " now"
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = r6.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x00af
        L_0x196e:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r9.A04 = r0
            r9.A00 = r0
            r0 = r83
            r0.A01(r9)
            X.0t9 r2 = r0.A01
            X.00F r0 = r9.samplingRate
            int r0 = r0.A03
            int r1 = r0 * 10
            X.00F r0 = new X.00F
            r0.<init>(r1, r1)
            r2.A0A(r9, r0)
            goto L_0x1944
        L_0x198a:
            X.11X r0 = r3.A00     // Catch:{ RuntimeException -> 0x1a0c }
            X.0tf r7 = r0.A02()     // Catch:{ RuntimeException -> 0x1a0c }
            X.1cj r11 = r7.A00()     // Catch:{ all -> 0x1a07 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x1a02 }
            java.lang.String r8 = "system_contacts_version_table"
            if (r0 != 0) goto L_0x19d1
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x1a02 }
            r6.<init>()     // Catch:{ all -> 0x1a02 }
            java.util.Set r0 = r1.entrySet()     // Catch:{ all -> 0x1a02 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x1a02 }
        L_0x19aa:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x1a02 }
            if (r0 == 0) goto L_0x19d1
            java.lang.Object r3 = r10.next()     // Catch:{ all -> 0x1a02 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x1a02 }
            java.lang.String r1 = "id"
            java.lang.Object r0 = r3.getKey()     // Catch:{ all -> 0x1a02 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x1a02 }
            r6.put(r1, r0)     // Catch:{ all -> 0x1a02 }
            java.lang.String r1 = "version"
            java.lang.Object r0 = r3.getValue()     // Catch:{ all -> 0x1a02 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x1a02 }
            r6.put(r1, r0)     // Catch:{ all -> 0x1a02 }
            X.AnonymousClass15L.A04(r6, r7, r8)     // Catch:{ all -> 0x1a02 }
            goto L_0x19aa
        L_0x19d1:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x1a02 }
            if (r0 != 0) goto L_0x19f7
            java.util.Iterator r10 = r2.iterator()     // Catch:{ all -> 0x1a02 }
        L_0x19db:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x1a02 }
            if (r0 == 0) goto L_0x19f7
            java.lang.Object r6 = r10.next()     // Catch:{ all -> 0x1a02 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x1a02 }
            java.lang.String r3 = "id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x1a02 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x1a02 }
            r2[r1] = r0     // Catch:{ all -> 0x1a02 }
            X.AnonymousClass15L.A02(r7, r8, r3, r2)     // Catch:{ all -> 0x1a02 }
            goto L_0x19db
        L_0x19f7:
            r11.A00()     // Catch:{ all -> 0x1a02 }
            r11.close()     // Catch:{ all -> 0x1a07 }
            r7.close()     // Catch:{ RuntimeException -> 0x1a0c }
            goto L_0x18ea
        L_0x1a02:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x1a06 }
        L_0x1a06:
            throw r0     // Catch:{ all -> 0x1a07 }
        L_0x1a07:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x1a0b }
        L_0x1a0b:
            throw r0     // Catch:{ RuntimeException -> 0x1a0c }
        L_0x1a0c:
            r1 = move-exception
            java.lang.String r0 = "contact-mgr-db/system-version; apply-failed"
            X.AnonymousClass00B.A09(r0, r1)
            goto L_0x18ea
        L_0x1a14:
            java.lang.String r0 = "ContactSyncRequestExecutor/onStop."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x1a39 }
            r1 = 0
            monitor-enter(r20)     // Catch:{ all -> 0x1a39 }
            r0 = r20
            r0.A00 = r1     // Catch:{ all -> 0x1a36 }
            r20.A00()     // Catch:{ all -> 0x1a36 }
            monitor-exit(r20)     // Catch:{ all -> 0x1a39 }
            r1 = 0
            r0 = r23
            r0.set(r1)     // Catch:{ all -> 0x1a39 }
            monitor-exit(r23)     // Catch:{ all -> 0x1a39 }
            r0 = 5
            com.facebook.redex.RunnableRunnableShape5S0200000_I0_3 r1 = new com.facebook.redex.RunnableRunnableShape5S0200000_I0_3
            r1.<init>(r4, r0, r5)
            r0 = r86
            r0.A0K(r1)
            return
        L_0x1a36:
            r0 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x1a39 }
            throw r0     // Catch:{ all -> 0x1a39 }
        L_0x1a39:
            r0 = move-exception
            monitor-exit(r23)     // Catch:{ all -> 0x1a39 }
            throw r0
        L_0x1a3c:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x1a40 }
        L_0x1a40:
            throw r0     // Catch:{ all -> 0x1a45 }
        L_0x1a41:
            throw r6     // Catch:{ all -> 0x1a42 }
        L_0x1a42:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x1a45:
            r0 = move-exception
            r65.close()     // Catch:{ all -> 0x1a49 }
        L_0x1a49:
            throw r0     // Catch:{ all -> 0x1a4a }
        L_0x1a4a:
            r1 = move-exception
            java.util.Map r0 = r2.A0P
            r0.clear()
            java.util.Map r0 = r2.A0N
            r0.clear()
            java.util.Map r0 = r2.A0M
            r0.clear()
            java.util.Map r0 = r2.A0O
            r0.clear()
            r2.A01 = r12
            r2.A02 = r12
            java.util.Map r0 = r13.A01
            if (r0 == 0) goto L_0x1a6a
            r0.clear()
        L_0x1a6a:
            throw r1
        L_0x1a6b:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x1a6f }
        L_0x1a6f:
            throw r0     // Catch:{ all -> 0x1a70 }
        L_0x1a70:
            r0 = move-exception
            r46.close()     // Catch:{ all -> 0x1a74 }
        L_0x1a74:
            throw r0
        L_0x1a75:
            r0 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x1a78 }
            throw r0     // Catch:{ all -> 0x1a78 }
        L_0x1a78:
            r0 = move-exception
            monitor-exit(r23)     // Catch:{ all -> 0x1a78 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C453127x.run():void");
    }
}

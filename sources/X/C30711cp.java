package X;

import com.facebook.redex.IDxCallableShape148S0100000_2_I0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.1cp  reason: invalid class name and case insensitive filesystem */
public abstract class C30711cp extends AnonymousClass1WD implements Runnable, C30721cq {
    public final AnonymousClass1XS A00 = new AnonymousClass1XS();
    public final CountDownLatch A01 = new CountDownLatch(1);
    public final FutureTask A02 = new AnonymousClass5CZ(this, new IDxCallableShape148S0100000_2_I0(this, 0));

    public void A04() {
        super.A04();
        this.A00.A01();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0957: MOVE  (r2v53 X.21E) = (r44v0 X.21E)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:122)
        	at jadx.core.dex.visitors.regions.TernaryMod.visitRegion(TernaryMod.java:34)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:73)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:78)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:31)
        */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:(3:171|(2:173|174)|189)|175|176|(3:178|397|186)(1:187)|188) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:261|262|263|264|265|661|266) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:175:0x038d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:264:0x0533 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:523:0x09c0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:539:0x09d6 */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0393 A[Catch:{ all -> 0x09b9, all -> 0x0a05 }] */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03b8 A[Catch:{ all -> 0x09b9, all -> 0x0a05 }] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0479 A[Catch:{ all -> 0x09b9, all -> 0x0a05 }] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x047c A[Catch:{ all -> 0x09b9, all -> 0x0a05 }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x04c1 A[Catch:{ all -> 0x09b9, all -> 0x0a05 }] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x04d0 A[Catch:{ all -> 0x09b9, all -> 0x0a05 }] */
    /* JADX WARNING: Removed duplicated region for block: B:507:0x097a A[Catch:{ all -> 0x09b9, all -> 0x0a05 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:184:0x03a3=Splitter:B:184:0x03a3, B:264:0x0533=Splitter:B:264:0x0533, B:356:0x06d3=Splitter:B:356:0x06d3, B:539:0x09d6=Splitter:B:539:0x09d6, B:156:0x0339=Splitter:B:156:0x0339, B:175:0x038d=Splitter:B:175:0x038d, B:361:0x06ee=Splitter:B:361:0x06ee} */
    public java.lang.Object A05() {
        /*
            r46 = this;
            r0 = r46
            boolean r1 = r0 instanceof X.C43341zq
            if (r1 == 0) goto L_0x00a7
            X.1zq r0 = (X.C43341zq) r0
            X.1zp r8 = r0.A01
            X.0tZ r7 = r0.A00
            X.1QZ r0 = r8.A04
            java.util.List r9 = X.AnonymousClass2QA.A02(r7, r0)
            r6 = 0
            if (r9 != 0) goto L_0x002b
            java.lang.String r0 = "Couldn't load vcard for message "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.1Vw r0 = r7.A11
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.25G r1 = new X.25G
            r1.<init>(r0)
            throw r1
        L_0x002b:
            r5 = 3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r5)
            r13 = r6
            r3 = 0
            r2 = 0
        L_0x0034:
            int r0 = r9.size()
            if (r3 >= r0) goto L_0x009a
            r0 = 100
            if (r3 >= r0) goto L_0x009a
            if (r2 >= r5) goto L_0x009a
            X.0tz r10 = r8.A02     // Catch:{ 25G -> 0x008b }
            X.0sG r11 = r8.A00     // Catch:{ 25G -> 0x008b }
            X.013 r0 = r8.A03     // Catch:{ 25G -> 0x008b }
            X.1st r1 = new X.1st     // Catch:{ 25G -> 0x008b }
            r1.<init>(r11, r10, r0)     // Catch:{ 25G -> 0x008b }
            java.lang.Object r0 = r9.get(r3)     // Catch:{ 25G -> 0x008b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ 25G -> 0x008b }
            r1.A06(r0)     // Catch:{ 25G -> 0x008b }
            X.1sv r10 = r1.A03     // Catch:{ 25G -> 0x008b }
            if (r6 != 0) goto L_0x0059
            r6 = r10
        L_0x0059:
            byte[] r0 = r10.A09     // Catch:{ 25G -> 0x008b }
            if (r0 == 0) goto L_0x0064
            int r0 = r0.length     // Catch:{ 25G -> 0x008b }
            if (r0 <= 0) goto L_0x0064
        L_0x0060:
            r4.add(r10)     // Catch:{ 25G -> 0x008b }
            goto L_0x0092
        L_0x0064:
            java.util.List r0 = r10.A05     // Catch:{ 25G -> 0x008b }
            if (r0 == 0) goto L_0x0097
            java.util.Iterator r12 = r0.iterator()     // Catch:{ 25G -> 0x008b }
        L_0x006c:
            boolean r0 = r12.hasNext()     // Catch:{ 25G -> 0x008b }
            if (r0 == 0) goto L_0x0097
            java.lang.Object r0 = r12.next()     // Catch:{ 25G -> 0x008b }
            X.1sw r0 = (X.C39711sw) r0     // Catch:{ 25G -> 0x008b }
            com.whatsapp.jid.UserJid r0 = r0.A01     // Catch:{ 25G -> 0x008b }
            if (r0 == 0) goto L_0x006c
            X.0sH r1 = r11.A08(r0)     // Catch:{ 25G -> 0x008b }
            if (r1 == 0) goto L_0x006c
            X.120 r0 = r8.A01     // Catch:{ 25G -> 0x008b }
            boolean r0 = r0.A06(r1)     // Catch:{ 25G -> 0x008b }
            if (r0 == 0) goto L_0x006c
            goto L_0x0060
        L_0x008b:
            r1 = move-exception
            java.lang.String r0 = "Invalid VCard."
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0097
        L_0x0092:
            if (r13 != 0) goto L_0x0095
            r13 = r10
        L_0x0095:
            int r2 = r2 + 1
        L_0x0097:
            int r3 = r3 + 1
            goto L_0x0034
        L_0x009a:
            if (r13 == 0) goto L_0x009d
            r6 = r13
        L_0x009d:
            int r1 = r9.size()
            X.4Mi r0 = new X.4Mi
            r0.<init>(r7, r4, r6, r1)
            return r0
        L_0x00a7:
            boolean r1 = r0 instanceof X.C31681er
            if (r1 == 0) goto L_0x0a30
            X.1er r0 = (X.C31681er) r0
            boolean r1 = r0 instanceof X.C31671eq
            if (r1 == 0) goto L_0x017d
            X.1eq r0 = (X.C31671eq) r0
            X.1QX r7 = r0.A0Z
            X.1f0 r3 = r0.A0U
            X.1qS r4 = r3.A02
            X.1XK r5 = r4.A05
            java.io.File r6 = r4.A06
            X.AnonymousClass00B.A06(r6)
            r2 = 0
            boolean r1 = r7.A07(r5, r6, r2)
            if (r1 != 0) goto L_0x00df
            java.lang.String r1 = "unable to send media; media valid check failed."
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 5
        L_0x00da:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x00de:
            return r3
        L_0x00df:
            X.AnonymousClass00B.A06(r6)
            java.lang.String r2 = r7.A06(r5, r6, r2)
            if (r2 == 0) goto L_0x00ee
            X.1ez r1 = r0.A0W
            monitor-enter(r1)
            r1.A0B = r2     // Catch:{ all -> 0x09b6 }
            monitor-exit(r1)
        L_0x00ee:
            X.0u3 r2 = r0.A0c
            X.0sb r1 = r0.A08
            X.C17970vw.A0L(r1, r2)
            r0.A09()
            X.0xf r1 = r0.A0e
            r1.A08()
            X.1qE r2 = r1.A07()
            X.0t3 r1 = r0.A0I
            java.lang.String r8 = X.AnonymousClass2NK.A00(r1, r2)
            if (r2 == 0) goto L_0x0179
            if (r8 == 0) goto L_0x0179
            int r9 = X.C31841f7.A00(r5)
            X.AnonymousClass00B.A06(r6)
            java.lang.String r6 = r6.getPath()
            java.lang.String r2 = r4.A09
            X.1XK r1 = X.AnonymousClass1XK.A0R
            if (r5 != r1) goto L_0x014c
            r10 = 3
        L_0x011d:
            boolean r2 = r4.A0A
            boolean r1 = r4.A0D
            r11 = r2 ^ 1
            if (r1 == 0) goto L_0x0127
            r11 = r11 | 4
        L_0x0127:
            java.lang.String r7 = r3.toString()
            X.4Ry r5 = new X.4Ry
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.10M r1 = r0.A00
            X.1ep r2 = new X.1ep
            r2.<init>(r1, r0)
            r1 = 1
            com.obwhatsapp.wamsys.IDxARunnableShape10S0300000_2_I0 r0 = new com.obwhatsapp.wamsys.IDxARunnableShape10S0300000_2_I0
            r0.<init>(r5, r2, r2, r1)
            r2.A00 = r0
            java.lang.Object r0 = X.C31591ei.A00(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0175
            int r0 = r0.intValue()
            goto L_0x00da
        L_0x014c:
            X.1XK r1 = X.AnonymousClass1XK.A07
            if (r5 != r1) goto L_0x0152
            r10 = 6
            goto L_0x011d
        L_0x0152:
            int r1 = r2.hashCode()
            switch(r1) {
                case -786681338: goto L_0x016b;
                case 108243: goto L_0x0163;
                case 1312630381: goto L_0x015b;
                default: goto L_0x0159;
            }
        L_0x0159:
            r10 = -1
            goto L_0x011d
        L_0x015b:
            java.lang.String r1 = "optimistic"
            boolean r1 = r2.equals(r1)
            r10 = 1
            goto L_0x0172
        L_0x0163:
            java.lang.String r1 = "mms"
            boolean r1 = r2.equals(r1)
            r10 = 0
            goto L_0x0172
        L_0x016b:
            java.lang.String r1 = "payment"
            boolean r1 = r2.equals(r1)
            r10 = 2
        L_0x0172:
            if (r1 != 0) goto L_0x011d
            goto L_0x0159
        L_0x0175:
            r0 = 23
            goto L_0x00da
        L_0x0179:
            r0 = 13
            goto L_0x00da
        L_0x017d:
            boolean r1 = r0 instanceof X.C43361zs     // Catch:{ all -> 0x0a05 }
            r22 = r1
            X.1f0 r4 = r0.A0U     // Catch:{ all -> 0x0a05 }
            X.1f1 r1 = r4.A01     // Catch:{ all -> 0x0a05 }
            r45 = r1
            long r5 = r1.A09     // Catch:{ all -> 0x0a05 }
            r2 = 0
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0197
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0a05 }
            r1 = r45
            r1.A09 = r2     // Catch:{ all -> 0x0a05 }
        L_0x0197:
            X.21E r1 = r0.A0X     // Catch:{ all -> 0x0a05 }
            r44 = r1
            X.14n r1 = r0.A0T     // Catch:{ all -> 0x0a05 }
            r43 = r1
            r10 = 0
            java.lang.Float r2 = r1.A01(r10)     // Catch:{ all -> 0x0a05 }
            r1 = r44
            r1.A05 = r2     // Catch:{ all -> 0x0a05 }
            X.0zs r1 = r0.A0P     // Catch:{ all -> 0x0a05 }
            X.0vT r1 = r1.A01     // Catch:{ all -> 0x0a05 }
            boolean r2 = r1.A01()     // Catch:{ all -> 0x0a05 }
            r1 = 0
            if (r2 == 0) goto L_0x01b4
            r1 = 4
        L_0x01b4:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0a05 }
            r1 = r44
            r1.A07 = r2     // Catch:{ all -> 0x0a05 }
            r7 = 1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0a05 }
            r1.A04 = r2     // Catch:{ all -> 0x0a05 }
            if (r22 == 0) goto L_0x01c8
            r20 = 1
            goto L_0x01ca
        L_0x01c8:
            r20 = 0
        L_0x01ca:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r20)     // Catch:{ all -> 0x0a05 }
            r1.A03 = r2     // Catch:{ all -> 0x0a05 }
            android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0a05 }
            long r16 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0a05 }
            X.0xf r6 = r0.A0e     // Catch:{ all -> 0x0a05 }
            r6.A08()     // Catch:{ all -> 0x0a05 }
            boolean r1 = r0 instanceof X.C43351zr     // Catch:{ all -> 0x0a05 }
            if (r1 == 0) goto L_0x01e1
            goto L_0x01e3
        L_0x01e1:
            r15 = 0
            goto L_0x01e4
        L_0x01e3:
            r15 = 1
        L_0x01e4:
            if (r15 == 0) goto L_0x0241
            X.1qS r1 = r4.A02     // Catch:{ all -> 0x0a05 }
            X.1XK r2 = r1.A05     // Catch:{ all -> 0x0a05 }
            r42 = r2
            java.lang.String r2 = r2.A02     // Catch:{ all -> 0x0a05 }
            r41 = r2
            r33 = 0
            X.1qE r30 = r6.A07()     // Catch:{ all -> 0x0a05 }
            X.0t3 r14 = r6.A08     // Catch:{ all -> 0x0a05 }
            X.0pd r13 = r6.A09     // Catch:{ all -> 0x0a05 }
            X.16Y r12 = r6.A0G     // Catch:{ all -> 0x0a05 }
            X.0so r11 = r6.A05     // Catch:{ all -> 0x0a05 }
            X.0s5 r9 = r6.A06     // Catch:{ all -> 0x0a05 }
            X.0tK r8 = r6.A07     // Catch:{ all -> 0x0a05 }
            X.0vT r5 = r6.A0A     // Catch:{ all -> 0x0a05 }
            long r2 = r6.A03     // Catch:{ all -> 0x0a05 }
            r24 = r9
            r25 = r8
            r26 = r14
            r27 = r13
            r28 = r5
            r29 = r6
            r31 = r12
            r32 = r41
            r34 = r33
            r35 = r10
            r36 = r10
            r37 = r2
            r39 = r7
            r40 = r10
            r23 = r11
            X.1qL r5 = X.C38161qL.A01(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r40)     // Catch:{ all -> 0x0a05 }
            X.1ap r8 = r5.A02     // Catch:{ all -> 0x0a05 }
            if (r8 == 0) goto L_0x0239
            X.3xJ r5 = new X.3xJ     // Catch:{ all -> 0x0a05 }
            r5.<init>(r8, r2)     // Catch:{ all -> 0x0a05 }
            X.1qJ r21 = new X.1qJ     // Catch:{ all -> 0x0a05 }
            r2 = r21
            r2.<init>(r5)     // Catch:{ all -> 0x0a05 }
            goto L_0x025b
        L_0x0239:
            X.1qJ r21 = new X.1qJ     // Catch:{ all -> 0x0a05 }
            r2 = r21
            r2.<init>(r5)     // Catch:{ all -> 0x0a05 }
            goto L_0x025b
        L_0x0241:
            X.1qS r1 = r4.A02     // Catch:{ all -> 0x0a05 }
            X.1XK r2 = r1.A05     // Catch:{ all -> 0x0a05 }
            r42 = r2
            java.lang.String r2 = r2.A02     // Catch:{ all -> 0x0a05 }
            r41 = r2
            r25 = 0
            r23 = r6
            r24 = r2
            r26 = r25
            r27 = r10
            r28 = r10
            X.1qJ r21 = r23.A05(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x0a05 }
        L_0x025b:
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0a05 }
            long r2 = r2 - r16
            java.lang.Long r3 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0a05 }
            r2 = r44
            r2.A0F = r3     // Catch:{ all -> 0x0a05 }
            r2 = r21
            X.1qI r2 = r2.A00     // Catch:{ all -> 0x0a05 }
            X.1ap r2 = r2.ABS()     // Catch:{ all -> 0x0a05 }
            r25 = 13
            if (r2 != 0) goto L_0x028f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a05 }
            r3.<init>()     // Catch:{ all -> 0x0a05 }
            java.lang.String r2 = "mediaupload/getselectedroute/failed; request="
            r3.append(r2)     // Catch:{ all -> 0x0a05 }
            r3.append(r4)     // Catch:{ all -> 0x0a05 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0a05 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0a05 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r25)     // Catch:{ all -> 0x0a05 }
            goto L_0x098e
        L_0x028f:
            if (r15 == 0) goto L_0x02a3
            java.lang.String r3 = r2.A05     // Catch:{ all -> 0x0a05 }
            java.lang.String r2 = "fallback"
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x02a3
            r2 = 27
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0a05 }
            goto L_0x098e
        L_0x02a3:
            r2 = r21
            r0.A01 = r2     // Catch:{ all -> 0x0a05 }
            r0.A06()     // Catch:{ all -> 0x0a05 }
            X.1ez r5 = r0.A0W     // Catch:{ all -> 0x0a05 }
            monitor-enter(r5)     // Catch:{ all -> 0x0a05 }
            X.21D r2 = r5.A01     // Catch:{ all -> 0x09ff }
            monitor-exit(r5)     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x02bd
            monitor-enter(r5)     // Catch:{ all -> 0x0a05 }
            X.21D r2 = r5.A01     // Catch:{ all -> 0x09ff }
            monitor-exit(r5)     // Catch:{ all -> 0x0a05 }
            X.1zM r9 = r2.A01     // Catch:{ all -> 0x0a05 }
            monitor-enter(r5)     // Catch:{ all -> 0x0a05 }
            X.21D r2 = r5.A01     // Catch:{ all -> 0x09ff }
            goto L_0x04d2
        L_0x02bd:
            X.4MQ r8 = r0.A0V     // Catch:{ all -> 0x0a05 }
            X.1zL r2 = r0.A0L     // Catch:{ all -> 0x0a05 }
            r29 = r2
            X.1XM r2 = r5.A00()     // Catch:{ all -> 0x0a05 }
            r12 = 3
            r24 = 1
            if (r2 == 0) goto L_0x02e8
            X.1XM r9 = r5.A00()     // Catch:{ all -> 0x0a05 }
            boolean r2 = r1.A0A     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x02eb
            int r2 = r4.A00()     // Catch:{ all -> 0x0a05 }
            if (r2 == r12) goto L_0x02e6
            X.0t3 r2 = r8.A00     // Catch:{ all -> 0x0a05 }
            long r2 = r2.A00()     // Catch:{ all -> 0x0a05 }
            boolean r2 = X.AnonymousClass1XM.A00(r9, r2)     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x02eb
        L_0x02e6:
            r2 = 1
            goto L_0x02ec
        L_0x02e8:
            r23 = 1
            goto L_0x02f0
        L_0x02eb:
            r2 = 0
        L_0x02ec:
            if (r2 == 0) goto L_0x02f3
            r23 = 3
        L_0x02f0:
            if (r20 == 0) goto L_0x0355
            goto L_0x02fd
        L_0x02f3:
            monitor-enter(r5)     // Catch:{ all -> 0x0a05 }
            r2 = 0
            r5.A00 = r2     // Catch:{ all -> 0x09ff }
            r5.A08 = r2     // Catch:{ all -> 0x09ff }
            monitor-exit(r5)     // Catch:{ all -> 0x0a05 }
            r23 = 2
            goto L_0x02f0
        L_0x02fd:
            X.1QX r3 = r8.A03     // Catch:{ all -> 0x0a05 }
            r2 = 32
            byte[] r9 = new byte[r2]     // Catch:{ all -> 0x0a05 }
            java.security.SecureRandom r2 = X.C003601p.A00()     // Catch:{ all -> 0x0a05 }
            r2.nextBytes(r9)     // Catch:{ all -> 0x0a05 }
            r2 = 2
            java.lang.String r2 = android.util.Base64.encodeToString(r9, r2)     // Catch:{ all -> 0x0a05 }
            X.1zQ r13 = new X.1zQ     // Catch:{ all -> 0x0a05 }
            r13.<init>(r2, r10)     // Catch:{ all -> 0x0a05 }
            r2 = 32
            byte[] r9 = new byte[r2]     // Catch:{ all -> 0x0a05 }
            java.security.SecureRandom r2 = X.C003601p.A00()     // Catch:{ all -> 0x0a05 }
            r2.nextBytes(r9)     // Catch:{ all -> 0x0a05 }
            r2 = 2
            java.lang.String r2 = android.util.Base64.encodeToString(r9, r2)     // Catch:{ all -> 0x0a05 }
            X.1zQ r11 = new X.1zQ     // Catch:{ all -> 0x0a05 }
            r11.<init>(r2, r10)     // Catch:{ all -> 0x0a05 }
            r2 = 32
            byte[] r14 = new byte[r2]     // Catch:{ all -> 0x0a05 }
            monitor-enter(r3)     // Catch:{ all -> 0x0a05 }
            java.security.SecureRandom r2 = r3.A00     // Catch:{ all -> 0x0a02 }
            if (r2 != 0) goto L_0x0339
            java.security.SecureRandom r2 = new java.security.SecureRandom     // Catch:{ all -> 0x0a02 }
            r2.<init>()     // Catch:{ all -> 0x0a02 }
            r3.A00 = r2     // Catch:{ all -> 0x0a02 }
        L_0x0339:
            monitor-exit(r3)     // Catch:{ all -> 0x0a05 }
            r2.nextBytes(r14)     // Catch:{ all -> 0x0a05 }
            X.0t3 r2 = r3.A02     // Catch:{ all -> 0x0a05 }
            long r15 = r2.A00()     // Catch:{ all -> 0x0a05 }
            X.1XM r9 = new X.1XM     // Catch:{ all -> 0x0a05 }
            r2 = r15
            r9.<init>(r14, r2)     // Catch:{ all -> 0x0a05 }
            X.1zM r2 = new X.1zM     // Catch:{ all -> 0x0a05 }
            r2.<init>(r9, r7)     // Catch:{ all -> 0x0a05 }
            X.1zR r3 = new X.1zR     // Catch:{ all -> 0x0a05 }
            r3.<init>(r13, r11, r2)     // Catch:{ all -> 0x0a05 }
            goto L_0x03e8
        L_0x0355:
            int r2 = r1.A01     // Catch:{ all -> 0x0a05 }
            r13 = 0
            if (r2 == r7) goto L_0x035b
            r13 = 1
        L_0x035b:
            X.1QX r9 = r8.A03     // Catch:{ all -> 0x0a05 }
            java.io.File r3 = r1.A06     // Catch:{ all -> 0x0a05 }
            X.AnonymousClass00B.A06(r3)     // Catch:{ all -> 0x0a05 }
            java.lang.String r11 = r4.toString()     // Catch:{ all -> 0x0a05 }
            X.AnonymousClass00B.A06(r3)     // Catch:{ all -> 0x0a05 }
            boolean r2 = r3.exists()     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x09d7
            if (r13 == 0) goto L_0x038d
            java.lang.String r2 = r5.A05()     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x038d
            java.lang.String r2 = r5.A04()     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x038d
            X.1XM r2 = r5.A00()     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x038d
            java.lang.String r2 = r5.A04()     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x03c8
            android.util.Base64.decode(r2, r10)     // Catch:{ IllegalArgumentException -> 0x038d }
            goto L_0x03c8
        L_0x038d:
            X.1XM r2 = r5.A00()     // Catch:{ all -> 0x0a05 }
            if (r2 != 0) goto L_0x03b8
            r2 = 32
            byte[] r13 = new byte[r2]     // Catch:{ all -> 0x0a05 }
            monitor-enter(r9)     // Catch:{ all -> 0x0a05 }
            java.security.SecureRandom r2 = r9.A00     // Catch:{ all -> 0x09b9 }
            if (r2 != 0) goto L_0x03a3
            java.security.SecureRandom r2 = new java.security.SecureRandom     // Catch:{ all -> 0x09b9 }
            r2.<init>()     // Catch:{ all -> 0x09b9 }
            r9.A00 = r2     // Catch:{ all -> 0x09b9 }
        L_0x03a3:
            monitor-exit(r9)     // Catch:{ all -> 0x0a05 }
            r2.nextBytes(r13)     // Catch:{ all -> 0x0a05 }
            X.0t3 r2 = r9.A02     // Catch:{ all -> 0x0a05 }
            long r2 = r2.A00()     // Catch:{ all -> 0x0a05 }
            X.1XM r11 = new X.1XM     // Catch:{ all -> 0x0a05 }
            r11.<init>(r13, r2)     // Catch:{ all -> 0x0a05 }
            X.1zM r3 = new X.1zM     // Catch:{ all -> 0x0a05 }
            r3.<init>(r11, r7)     // Catch:{ all -> 0x0a05 }
            goto L_0x03c1
        L_0x03b8:
            X.1XM r2 = r5.A00()     // Catch:{ all -> 0x0a05 }
            X.1zM r3 = new X.1zM     // Catch:{ all -> 0x0a05 }
            r3.<init>(r2, r10)     // Catch:{ all -> 0x0a05 }
        L_0x03c1:
            r2 = r29
            X.1zR r3 = r9.A04(r2, r4, r3)     // Catch:{ all -> 0x0a05 }
            goto L_0x03e8
        L_0x03c8:
            java.lang.String r2 = r5.A05()     // Catch:{ all -> 0x0a05 }
            X.1zQ r11 = new X.1zQ     // Catch:{ all -> 0x0a05 }
            r11.<init>(r2, r7)     // Catch:{ all -> 0x0a05 }
            java.lang.String r2 = r5.A04()     // Catch:{ all -> 0x0a05 }
            X.1zQ r9 = new X.1zQ     // Catch:{ all -> 0x0a05 }
            r9.<init>(r2, r7)     // Catch:{ all -> 0x0a05 }
            X.1XM r3 = r5.A00()     // Catch:{ all -> 0x0a05 }
            X.1zM r2 = new X.1zM     // Catch:{ all -> 0x0a05 }
            r2.<init>(r3, r10)     // Catch:{ all -> 0x0a05 }
            X.1zR r3 = new X.1zR     // Catch:{ all -> 0x0a05 }
            r3.<init>(r11, r9, r2)     // Catch:{ all -> 0x0a05 }
        L_0x03e8:
            X.1zQ r2 = r3.A01     // Catch:{ all -> 0x0a05 }
            r28 = r2
            X.1zQ r2 = r3.A00     // Catch:{ all -> 0x0a05 }
            r19 = r2
            X.1zM r9 = r3.A02     // Catch:{ all -> 0x0a05 }
            r2 = r28
            java.lang.String r2 = r2.A00     // Catch:{ all -> 0x0a05 }
            r18 = r2
            r2 = r42
            byte r11 = r2.A00     // Catch:{ all -> 0x0a05 }
            if (r18 == 0) goto L_0x0407
            X.0t8 r3 = r8.A01     // Catch:{ all -> 0x0a05 }
            r2 = r18
            X.1f5 r11 = r3.A08(r2, r11, r7)     // Catch:{ all -> 0x0a05 }
            goto L_0x0408
        L_0x0407:
            r11 = 0
        L_0x0408:
            if (r11 == 0) goto L_0x0482
            boolean r2 = r9.A01     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x0482
            X.0ta r13 = r11.A02     // Catch:{ all -> 0x0a05 }
            long r2 = r11.A01     // Catch:{ all -> 0x0a05 }
            r26 = r2
            byte[] r2 = r13.A0U     // Catch:{ all -> 0x0a05 }
            r17 = r2
            long r2 = r13.A0B     // Catch:{ all -> 0x0a05 }
            r15 = r2
            if (r17 != 0) goto L_0x041e
            goto L_0x042f
        L_0x041e:
            r13 = 0
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 > 0) goto L_0x0426
            r15 = r26
        L_0x0426:
            X.1XM r13 = new X.1XM     // Catch:{ all -> 0x0a05 }
            r14 = r17
            r2 = r15
            r13.<init>(r14, r2)     // Catch:{ all -> 0x0a05 }
            goto L_0x0430
        L_0x042f:
            r13 = 0
        L_0x0430:
            if (r13 == 0) goto L_0x0482
            X.0pd r2 = r8.A02     // Catch:{ all -> 0x0a05 }
            r14 = r2
            X.0tM r3 = X.C16620tM.A02     // Catch:{ all -> 0x0a05 }
            r2 = 1505(0x5e1, float:2.109E-42)
            boolean r2 = r14.A0E(r3, r2)     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x0471
            X.0t8 r2 = r8.A01     // Catch:{ all -> 0x0a05 }
            r14 = r2
            java.lang.String r2 = r11.A03     // Catch:{ all -> 0x0a05 }
            r3 = r2
            byte[] r2 = r13.A01     // Catch:{ all -> 0x0a05 }
            r15 = r14
            r14 = r3
            r3 = r2
            r2 = r18
            X.1Vw r2 = r15.A09(r2, r14, r3, r7)     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x0471
            X.0rv r2 = r2.A00     // Catch:{ all -> 0x0a05 }
            boolean r2 = X.C16030sJ.A0Q(r2)     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x0471
        L_0x045a:
            boolean r2 = r1.A0A     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x0476
            int r2 = r4.A00()     // Catch:{ all -> 0x0a05 }
            if (r2 == r12) goto L_0x0474
            X.0t3 r2 = r8.A00     // Catch:{ all -> 0x0a05 }
            long r2 = r2.A00()     // Catch:{ all -> 0x0a05 }
            boolean r2 = X.AnonymousClass1XM.A00(r13, r2)     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x0476
            goto L_0x0474
        L_0x0471:
            r24 = 0
            goto L_0x045a
        L_0x0474:
            r2 = 1
            goto L_0x0477
        L_0x0476:
            r2 = 0
        L_0x0477:
            if (r2 == 0) goto L_0x047c
            if (r24 != 0) goto L_0x0480
            goto L_0x0488
        L_0x047c:
            r12 = r23
            if (r24 == 0) goto L_0x0496
        L_0x0480:
            r12 = 4
            goto L_0x0496
        L_0x0482:
            r12 = r23
            r8 = 0
            if (r11 == 0) goto L_0x04c3
            goto L_0x0496
        L_0x0488:
            java.lang.String r3 = r11.A03     // Catch:{ all -> 0x0a05 }
            X.1zQ r19 = new X.1zQ     // Catch:{ all -> 0x0a05 }
            r2 = r19
            r2.<init>(r3, r10)     // Catch:{ all -> 0x0a05 }
            X.1zM r9 = new X.1zM     // Catch:{ all -> 0x0a05 }
            r9.<init>(r13, r10)     // Catch:{ all -> 0x0a05 }
        L_0x0496:
            X.0ta r3 = r11.A02     // Catch:{ all -> 0x0a05 }
            java.io.File r8 = r1.A06     // Catch:{ all -> 0x0a05 }
            X.AnonymousClass00B.A06(r8)     // Catch:{ all -> 0x0a05 }
            boolean r2 = r3.A0P     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x04d0
            java.io.File r2 = r3.A0F     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x04d0
            boolean r2 = r2.isAbsolute()     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x04d0
            java.io.File r2 = r3.A0F     // Catch:{ all -> 0x0a05 }
            boolean r2 = r2.exists()     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x04d0
            java.io.File r2 = r3.A0F     // Catch:{ all -> 0x0a05 }
            long r15 = r2.length()     // Catch:{ all -> 0x0a05 }
            long r13 = r8.length()     // Catch:{ all -> 0x0a05 }
            int r2 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x04d0
            java.io.File r8 = r3.A0F     // Catch:{ all -> 0x0a05 }
        L_0x04c3:
            X.1XS r3 = r0.A0F     // Catch:{ all -> 0x0a05 }
            X.21D r2 = new X.21D     // Catch:{ all -> 0x0a05 }
            r2.<init>(r9, r12)     // Catch:{ all -> 0x0a05 }
            r3.A04(r2)     // Catch:{ all -> 0x0a05 }
            r0.A03 = r8     // Catch:{ all -> 0x0a05 }
            goto L_0x04e7
        L_0x04d0:
            r8 = 0
            goto L_0x04c3
        L_0x04d2:
            monitor-exit(r5)     // Catch:{ all -> 0x0a05 }
            int r12 = r2.A00     // Catch:{ all -> 0x0a05 }
            X.1QX r3 = r0.A0Z     // Catch:{ all -> 0x0a05 }
            X.1zL r2 = r0.A0L     // Catch:{ all -> 0x0a05 }
            r29 = r2
            X.1zR r3 = r3.A04(r2, r4, r9)     // Catch:{ all -> 0x0a05 }
            X.1zQ r2 = r3.A01     // Catch:{ all -> 0x0a05 }
            r28 = r2
            X.1zQ r2 = r3.A00     // Catch:{ all -> 0x0a05 }
            r19 = r2
        L_0x04e7:
            r2 = r28
            java.lang.String r2 = r2.A00     // Catch:{ all -> 0x0a05 }
            r36 = r2
            r5.A09(r2)     // Catch:{ all -> 0x0a05 }
            r2 = r28
            boolean r2 = r2.A01     // Catch:{ all -> 0x0a05 }
            r18 = r2
            r0.A06()     // Catch:{ all -> 0x0a05 }
            r2 = r45
            int r2 = r2.A00     // Catch:{ all -> 0x0a05 }
            if (r2 != 0) goto L_0x0503
            r2 = r45
            r2.A00 = r12     // Catch:{ all -> 0x0a05 }
        L_0x0503:
            r2 = r19
            java.lang.String r2 = r2.A00     // Catch:{ all -> 0x0a05 }
            r5.A08(r2)     // Catch:{ all -> 0x0a05 }
            r0.A04 = r2     // Catch:{ all -> 0x0a05 }
            r0.A06()     // Catch:{ all -> 0x0a05 }
            boolean r2 = r1.A0C     // Catch:{ all -> 0x0a05 }
            if (r2 != 0) goto L_0x0544
            int r8 = r4.A00()     // Catch:{ all -> 0x0a05 }
            r3 = 3
            r2 = 0
            if (r8 != r3) goto L_0x051c
            r2 = 1
        L_0x051c:
            if (r2 != 0) goto L_0x0544
            if (r20 == 0) goto L_0x053e
        L_0x0520:
            if (r22 == 0) goto L_0x052a
            r2 = r4
            X.1zS r2 = (X.C43171zS) r2     // Catch:{ all -> 0x0a05 }
            boolean r2 = r2.A01     // Catch:{ all -> 0x0a05 }
            r2 = r2 ^ 1
            goto L_0x052b
        L_0x052a:
            r2 = 0
        L_0x052b:
            if (r2 == 0) goto L_0x053e
            r2 = 100
            java.lang.Thread.sleep(r2)     // Catch:{ InterruptedException -> 0x0533 }
            goto L_0x053a
        L_0x0533:
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0a05 }
            r2.interrupt()     // Catch:{ all -> 0x0a05 }
        L_0x053a:
            r0.A06()     // Catch:{ all -> 0x0a05 }
            goto L_0x0520
        L_0x053e:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0a05 }
            goto L_0x098e
        L_0x0544:
            X.1QX r8 = r0.A0Z     // Catch:{ all -> 0x0a05 }
            java.io.File r2 = r1.A06     // Catch:{ all -> 0x0a05 }
            r35 = r2
            X.AnonymousClass00B.A06(r35)     // Catch:{ all -> 0x0a05 }
            r10 = r42
            r3 = r2
            r2 = r20
            boolean r2 = r8.A07(r10, r3, r2)     // Catch:{ all -> 0x0a05 }
            r10 = 5
            if (r2 != 0) goto L_0x0574
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a05 }
            r3.<init>()     // Catch:{ all -> 0x0a05 }
            java.lang.String r2 = "unable to send media; was not eligible for encryption but must be encrypted; request="
            r3.append(r2)     // Catch:{ all -> 0x0a05 }
            r3.append(r4)     // Catch:{ all -> 0x0a05 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0a05 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0a05 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0a05 }
            goto L_0x098e
        L_0x0574:
            X.AnonymousClass00B.A06(r35)     // Catch:{ all -> 0x0a05 }
            r10 = r42
            r2 = r20
            java.lang.String r2 = r8.A06(r10, r3, r2)     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x0585
            monitor-enter(r5)     // Catch:{ all -> 0x0a05 }
            r5.A0B = r2     // Catch:{ all -> 0x09ff }
            monitor-exit(r5)     // Catch:{ all -> 0x0a05 }
        L_0x0585:
            X.5PT r2 = r0.A0K     // Catch:{ all -> 0x0a05 }
            X.1XM r12 = r9.A00     // Catch:{ all -> 0x0a05 }
            byte[] r3 = r12.A01     // Catch:{ all -> 0x0a05 }
            X.1zH r10 = r2.A7u(r3)     // Catch:{ all -> 0x0a05 }
            r2 = r29
            X.1zN r17 = r2.ABy(r3)     // Catch:{ all -> 0x0a05 }
            boolean r2 = r1.A0A     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x05a9
            byte[] r11 = r10.A00     // Catch:{ all -> 0x0a05 }
            byte[] r3 = r10.A02     // Catch:{ all -> 0x0a05 }
            byte[] r2 = r10.A01     // Catch:{ all -> 0x0a05 }
            monitor-enter(r5)     // Catch:{ all -> 0x0a05 }
            r5.A00 = r12     // Catch:{ all -> 0x09ff }
            r5.A0I = r11     // Catch:{ all -> 0x09ff }
            r5.A0K = r3     // Catch:{ all -> 0x09ff }
            r5.A0L = r2     // Catch:{ all -> 0x09ff }
            monitor-exit(r5)     // Catch:{ all -> 0x0a05 }
        L_0x05a9:
            r0.A06()     // Catch:{ all -> 0x0a05 }
            X.0pd r11 = r0.A0O     // Catch:{ all -> 0x0a05 }
            r3 = 1505(0x5e1, float:2.109E-42)
            X.0tM r2 = X.C16620tM.A02     // Catch:{ all -> 0x0a05 }
            boolean r2 = r11.A0E(r2, r3)     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x05c3
            X.1XJ r3 = r4.A03     // Catch:{ all -> 0x0a05 }
            boolean r2 = r3.A01     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x05c3
            boolean r3 = r3.A00     // Catch:{ all -> 0x0a05 }
            r2 = 1
            if (r3 == 0) goto L_0x05c4
        L_0x05c3:
            r2 = 0
        L_0x05c4:
            if (r2 == 0) goto L_0x05c7
            goto L_0x05ca
        L_0x05c7:
            r32 = 0
            goto L_0x05cd
        L_0x05ca:
            java.lang.String r32 = "status"
        L_0x05cd:
            r2 = r45
            java.lang.String r2 = r2.A0D     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x0618
            java.util.UUID r2 = java.util.UUID.fromString(r2)     // Catch:{ all -> 0x0a05 }
            long r11 = r2.getMostSignificantBits()     // Catch:{ all -> 0x0a05 }
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r11 = r11 & r2
            java.lang.Long r28 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x0a05 }
        L_0x05e5:
            java.lang.String r13 = r1.A09     // Catch:{ all -> 0x0a05 }
            X.1QV r12 = r0.A0S     // Catch:{ all -> 0x0a05 }
            java.lang.String r11 = r0.A04     // Catch:{ all -> 0x0a05 }
            boolean r3 = r1.A0D     // Catch:{ all -> 0x0a05 }
            X.AnonymousClass00B.A06(r11)     // Catch:{ all -> 0x0a05 }
            X.AnonymousClass00B.A06(r41)     // Catch:{ all -> 0x0a05 }
            X.2A0 r2 = new X.2A0     // Catch:{ all -> 0x0a05 }
            r26 = r2
            r27 = r12
            r29 = r11
            r30 = r41
            r31 = r13
            r33 = r20
            r34 = r3
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0a05 }
            r0.A02 = r2     // Catch:{ all -> 0x0a05 }
            r0.A06()     // Catch:{ all -> 0x0a05 }
            r3 = 6
            android.net.TrafficStats.setThreadStatsTag(r3)     // Catch:{ all -> 0x0a05 }
            boolean r3 = r9.A01     // Catch:{ all -> 0x0a05 }
            if (r3 == 0) goto L_0x061d
            r11 = 0
            r0.A00 = r11     // Catch:{ all -> 0x0a05 }
            goto L_0x061b
        L_0x0618:
            r28 = 0
            goto L_0x05e5
        L_0x061b:
            r11 = 0
            goto L_0x064c
        L_0x061d:
            java.lang.String r9 = r0.A04     // Catch:{ all -> 0x0a05 }
            r3 = r21
            X.4Nm r9 = r0.A08(r3, r2, r9)     // Catch:{ all -> 0x0a05 }
            X.21K r11 = r9.A02     // Catch:{ all -> 0x0a05 }
            r3 = r44
            r3.A01 = r11     // Catch:{ all -> 0x0a05 }
            X.1AO r11 = r0.A0R     // Catch:{ all -> 0x0a05 }
            java.lang.String r3 = r9.A03     // Catch:{ all -> 0x0a05 }
            java.lang.String r3 = r11.A00(r3)     // Catch:{ all -> 0x0a05 }
            r5.A07(r3)     // Catch:{ all -> 0x0a05 }
            java.lang.String r3 = r9.A04     // Catch:{ all -> 0x0a05 }
            r5.A0A(r3)     // Catch:{ all -> 0x0a05 }
            int r3 = r9.A01     // Catch:{ all -> 0x0a05 }
            if (r3 == 0) goto L_0x0645
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0a05 }
            goto L_0x098e
        L_0x0645:
            int r3 = r9.A00     // Catch:{ all -> 0x0a05 }
            long r11 = (long) r3     // Catch:{ all -> 0x0a05 }
            r0.A00 = r11     // Catch:{ all -> 0x0a05 }
            boolean r11 = r9.A05     // Catch:{ all -> 0x0a05 }
        L_0x064c:
            r0.A06()     // Catch:{ all -> 0x0a05 }
            X.0u3 r9 = r0.A0c     // Catch:{ all -> 0x0a05 }
            X.0sb r3 = r0.A08     // Catch:{ all -> 0x0a05 }
            X.C17970vw.A0L(r3, r9)     // Catch:{ all -> 0x0a05 }
            r0.A09()     // Catch:{ all -> 0x0a05 }
            if (r11 == 0) goto L_0x06f5
            boolean r2 = r0.A0C()     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x06eb
            X.0t8 r11 = r0.A0M     // Catch:{ all -> 0x0a05 }
            java.lang.String r9 = r0.A04     // Catch:{ all -> 0x0a05 }
            X.1XM r2 = r5.A00()     // Catch:{ all -> 0x0a05 }
            X.AnonymousClass00B.A06(r2)     // Catch:{ all -> 0x0a05 }
            byte[] r6 = r2.A01     // Catch:{ all -> 0x0a05 }
            r3 = 0
            r2 = r36
            X.1Vw r6 = r11.A09(r2, r9, r6, r3)     // Catch:{ all -> 0x0a05 }
            if (r6 == 0) goto L_0x067e
            X.17J r2 = r0.A0N     // Catch:{ all -> 0x0a05 }
            X.1y3 r3 = r2.A00(r6)     // Catch:{ all -> 0x0a05 }
            goto L_0x067f
        L_0x067e:
            r3 = 0
        L_0x067f:
            if (r3 == 0) goto L_0x06a6
            byte[] r2 = r3.A00     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x06a6
            int r2 = r2.length     // Catch:{ all -> 0x0a05 }
            if (r2 <= 0) goto L_0x06a6
            monitor-enter(r5)     // Catch:{ all -> 0x0a05 }
            r5.A02 = r3     // Catch:{ all -> 0x09ff }
            monitor-exit(r5)     // Catch:{ all -> 0x0a05 }
            int[] r2 = r3.A01     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x06eb
            X.0th r2 = r8.A03     // Catch:{ all -> 0x0a05 }
            X.0tZ r2 = r2.A03(r6)     // Catch:{ all -> 0x0a05 }
            X.0tY r2 = (X.C16730tY) r2     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x06eb
            X.0ta r2 = r2.A02     // Catch:{ all -> 0x0a05 }
            X.AnonymousClass00B.A06(r2)     // Catch:{ all -> 0x0a05 }
            java.lang.String r2 = r2.A0K     // Catch:{ all -> 0x0a05 }
            monitor-enter(r5)     // Catch:{ all -> 0x0a05 }
            r5.A0D = r2     // Catch:{ all -> 0x09ff }
            monitor-exit(r5)     // Catch:{ all -> 0x0a05 }
            goto L_0x06eb
        L_0x06a6:
            int[] r11 = r1.A0E     // Catch:{ all -> 0x0a05 }
            if (r11 == 0) goto L_0x06d3
            int r2 = r11.length     // Catch:{ all -> 0x0a05 }
            if (r2 <= 0) goto L_0x06d3
            X.AnonymousClass00B.A06(r35)     // Catch:{ all -> 0x0a05 }
            r3 = r17
            r2 = r35
            X.1zO r6 = r8.A03(r3, r2, r11)     // Catch:{ all -> 0x0a05 }
            X.1zP r2 = r6.A00     // Catch:{ all -> 0x09c8 }
            X.3pV r9 = new X.3pV     // Catch:{ IOException -> 0x09c1 }
            r9.<init>(r10, r2, r11)     // Catch:{ IOException -> 0x09c1 }
            r2 = 8192(0x2000, float:1.14794E-41)
            byte[] r3 = new byte[r2]     // Catch:{ all -> 0x09bc }
        L_0x06c3:
            int r2 = r9.read(r3)     // Catch:{ all -> 0x09bc }
            if (r2 >= 0) goto L_0x06c3
            X.1zK r11 = r9.A04     // Catch:{ all -> 0x09bc }
            r9.close()     // Catch:{ IOException -> 0x09c1 }
            X.4MR r9 = r6.A00()     // Catch:{ all -> 0x09c8 }
            goto L_0x06ee
        L_0x06d3:
            X.AnonymousClass00B.A06(r35)     // Catch:{ all -> 0x0a05 }
            r3 = r17
            r2 = r35
            X.1zO r6 = r8.A02(r3, r4, r2)     // Catch:{ all -> 0x0a05 }
            X.1zP r3 = r6.A00     // Catch:{ all -> 0x09c8 }
            r2 = 65536(0x10000, float:9.18355E-41)
            X.1zK r11 = X.AnonymousClass1QX.A00(r10, r3, r2)     // Catch:{ all -> 0x09c8 }
            X.4MR r9 = r6.A00()     // Catch:{ all -> 0x09c8 }
            goto L_0x06ee
        L_0x06eb:
            r9 = 0
            r11 = 0
            goto L_0x06f1
        L_0x06ee:
            r6.close()     // Catch:{ all -> 0x0a05 }
        L_0x06f1:
            r0.A06 = r7     // Catch:{ all -> 0x0a05 }
            goto L_0x08b0
        L_0x06f5:
            boolean r3 = r0.A0g     // Catch:{ all -> 0x0a05 }
            if (r3 == 0) goto L_0x0700
            r0.A0i = r7     // Catch:{ all -> 0x0a05 }
            X.1qR r3 = r0.A0d     // Catch:{ all -> 0x0a05 }
            r6.A02(r3)     // Catch:{ all -> 0x0a05 }
        L_0x0700:
            X.1QU r9 = r0.A0Y     // Catch:{ all -> 0x0a05 }
            java.lang.String r31 = r4.toString()     // Catch:{ all -> 0x0a05 }
            java.util.concurrent.atomic.AtomicReference r3 = r0.A05     // Catch:{ all -> 0x0a05 }
            r32 = r3
            int[] r7 = r1.A0E     // Catch:{ all -> 0x0a05 }
            X.0vT r6 = r9.A01     // Catch:{ all -> 0x0a05 }
            X.0vU r3 = r9.A00     // Catch:{ all -> 0x0a05 }
            X.4Oe r26 = new X.4Oe     // Catch:{ all -> 0x0a05 }
            r27 = r3
            r28 = r6
            r29 = r0
            r30 = r44
            r33 = r7
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x0a05 }
            X.3G4 r6 = new X.3G4     // Catch:{ all -> 0x0a05 }
            r9 = r6
            r11 = r17
            r12 = r21
            r13 = r0
            r14 = r26
            r15 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0a05 }
            java.lang.Object r12 = r12.A00(r6)     // Catch:{ all -> 0x0a05 }
            X.4OE r12 = (X.AnonymousClass4OE) r12     // Catch:{ all -> 0x0a05 }
            if (r12 != 0) goto L_0x0740
            java.lang.String r2 = "mediaupload/failed-network; no routes to upload"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0a05 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r25)     // Catch:{ all -> 0x0a05 }
            goto L_0x098e
        L_0x0740:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a05 }
            r7.<init>()     // Catch:{ all -> 0x0a05 }
            java.lang.String r3 = "mediaupload/transfer completed; result = "
            r7.append(r3)     // Catch:{ all -> 0x0a05 }
            int r6 = r12.A05     // Catch:{ all -> 0x0a05 }
            java.lang.String r3 = X.C87644Xx.A00(r6)     // Catch:{ all -> 0x0a05 }
            r7.append(r3)     // Catch:{ all -> 0x0a05 }
            java.lang.String r3 = "; cancelled = "
            r7.append(r3)     // Catch:{ all -> 0x0a05 }
            java.util.concurrent.FutureTask r3 = r0.A02     // Catch:{ all -> 0x0a05 }
            boolean r3 = r3.isCancelled()     // Catch:{ all -> 0x0a05 }
            r7.append(r3)     // Catch:{ all -> 0x0a05 }
            java.lang.String r3 = r7.toString()     // Catch:{ all -> 0x0a05 }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x0a05 }
            r7 = 17
            if (r6 != r7) goto L_0x0786
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a05 }
            r3.<init>()     // Catch:{ all -> 0x0a05 }
            java.lang.String r2 = "mediaupload/failed-network; request="
            r3.append(r2)     // Catch:{ all -> 0x0a05 }
            r3.append(r4)     // Catch:{ all -> 0x0a05 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0a05 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0a05 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0a05 }
            goto L_0x098e
        L_0x0786:
            X.4MR r9 = r12.A02     // Catch:{ all -> 0x0a05 }
            X.4Kq r3 = r12.A01     // Catch:{ all -> 0x0a05 }
            if (r3 == 0) goto L_0x078f
            X.1zK r11 = r3.A00     // Catch:{ all -> 0x0a05 }
            goto L_0x0790
        L_0x078f:
            r11 = 0
        L_0x0790:
            if (r22 == 0) goto L_0x07e8
            r13 = r0
            X.1zs r13 = (X.C43361zs) r13     // Catch:{ all -> 0x0a05 }
            X.1f0 r3 = r13.A0U     // Catch:{ all -> 0x0a05 }
            r15 = r3
            r14 = r15
            X.1zS r14 = (X.C43171zS) r14     // Catch:{ all -> 0x0a05 }
            boolean r3 = r14.A01     // Catch:{ all -> 0x0a05 }
            java.lang.String r7 = "Cannot calculate final hash before recording finished"
            X.AnonymousClass00B.A0B(r7, r3)     // Catch:{ all -> 0x0a05 }
            java.lang.String r7 = r13.A00     // Catch:{ all -> 0x0a05 }
            if (r7 != 0) goto L_0x07ed
            X.1QX r3 = r13.A0Z     // Catch:{ all -> 0x0a05 }
            r7 = r3
            X.1qS r3 = r15.A02     // Catch:{ all -> 0x0a05 }
            java.io.File r3 = r3.A06     // Catch:{ all -> 0x0a05 }
            X.AnonymousClass00B.A06(r3)     // Catch:{ all -> 0x0a05 }
            r15 = r7
            r7 = r17
            X.1zO r16 = r15.A01(r7, r14, r3)     // Catch:{ all -> 0x0a05 }
            r3 = 16384(0x4000, float:2.2959E-41)
            byte[] r3 = new byte[r3]     // Catch:{ all -> 0x09cd }
            r15 = r3
        L_0x07bc:
            r3 = r16
            X.1zP r7 = r3.A00     // Catch:{ IOException -> 0x07c7 }
            int r3 = r7.read(r15)     // Catch:{ IOException -> 0x07c7 }
            if (r3 < 0) goto L_0x07dc
            goto L_0x07bc
        L_0x07c7:
            r15 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x09cd }
            r7.<init>()     // Catch:{ all -> 0x09cd }
            java.lang.String r3 = "IOException while computing ciphertext sha-256; skipping duplicate detection; request="
            r7.append(r3)     // Catch:{ all -> 0x09cd }
            r7.append(r14)     // Catch:{ all -> 0x09cd }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x09cd }
            com.whatsapp.util.Log.w(r7, r15)     // Catch:{ all -> 0x09cd }
        L_0x07dc:
            X.4MR r3 = r16.A00()     // Catch:{ all -> 0x09cd }
            java.lang.String r7 = r3.A00     // Catch:{ all -> 0x09cd }
            r16.close()     // Catch:{ all -> 0x0a05 }
            r13.A00 = r7     // Catch:{ all -> 0x0a05 }
            goto L_0x07ed
        L_0x07e8:
            java.lang.String r7 = r0.A04     // Catch:{ all -> 0x0a05 }
            X.AnonymousClass00B.A06(r7)     // Catch:{ all -> 0x0a05 }
        L_0x07ed:
            if (r7 != 0) goto L_0x07f6
            r2 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0a05 }
            goto L_0x098e
        L_0x07f6:
            X.4Ns r3 = r12.A03     // Catch:{ all -> 0x0a05 }
            if (r3 == 0) goto L_0x0860
            java.lang.String r3 = r3.A05     // Catch:{ all -> 0x0a05 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0a05 }
            if (r3 == 0) goto L_0x082c
            X.1ap r13 = r12.A06     // Catch:{ all -> 0x0a05 }
            java.lang.String r3 = r2.A02     // Catch:{ all -> 0x0a05 }
            r16 = r3
            java.lang.String r3 = r2.A01     // Catch:{ all -> 0x0a05 }
            r15 = r3
            java.lang.String r3 = r2.A00     // Catch:{ all -> 0x0a05 }
            r26 = 0
            X.1qN r14 = new X.1qN     // Catch:{ all -> 0x0a05 }
            r23 = r16
            r24 = r15
            r25 = r3
            r27 = r26
            r22 = r14
            r22.<init>(r23, r24, r25, r26, r27)     // Catch:{ all -> 0x0a05 }
            r3 = 1
            java.lang.String r3 = r14.A9R(r13, r3)     // Catch:{ all -> 0x0a05 }
        L_0x0823:
            r5.A0A(r3)     // Catch:{ all -> 0x0a05 }
            X.4Ns r3 = r12.A03     // Catch:{ all -> 0x0a05 }
            java.lang.String r3 = r3.A02     // Catch:{ all -> 0x0a05 }
            monitor-enter(r5)     // Catch:{ all -> 0x0a05 }
            goto L_0x0831
        L_0x082c:
            X.4Ns r3 = r12.A03     // Catch:{ all -> 0x0a05 }
            java.lang.String r3 = r3.A05     // Catch:{ all -> 0x0a05 }
            goto L_0x0823
        L_0x0831:
            r5.A07 = r3     // Catch:{ all -> 0x09ff }
            monitor-exit(r5)     // Catch:{ all -> 0x0a05 }
            X.1AO r13 = r0.A0R     // Catch:{ all -> 0x0a05 }
            X.4Ns r3 = r12.A03     // Catch:{ all -> 0x0a05 }
            java.lang.String r3 = r3.A00     // Catch:{ all -> 0x0a05 }
            java.lang.String r3 = r13.A00(r3)     // Catch:{ all -> 0x0a05 }
            r5.A07(r3)     // Catch:{ all -> 0x0a05 }
            r5.A08(r7)     // Catch:{ all -> 0x0a05 }
            X.4Ns r3 = r12.A03     // Catch:{ all -> 0x0a05 }
            java.lang.String r3 = r3.A03     // Catch:{ all -> 0x0a05 }
            monitor-enter(r5)     // Catch:{ all -> 0x0a05 }
            r5.A0A = r3     // Catch:{ all -> 0x09ff }
            monitor-exit(r5)     // Catch:{ all -> 0x0a05 }
            X.4Ns r3 = r12.A03     // Catch:{ all -> 0x0a05 }
            java.lang.String r3 = r3.A01     // Catch:{ all -> 0x0a05 }
            monitor-enter(r5)     // Catch:{ all -> 0x0a05 }
            r5.A06 = r3     // Catch:{ all -> 0x09ff }
            monitor-exit(r5)     // Catch:{ all -> 0x0a05 }
            X.4Ns r3 = r12.A03     // Catch:{ all -> 0x0a05 }
            java.lang.String r3 = r3.A04     // Catch:{ all -> 0x0a05 }
            monitor-enter(r5)     // Catch:{ all -> 0x0a05 }
            r5.A0E = r3     // Catch:{ all -> 0x09ff }
            monitor-exit(r5)     // Catch:{ all -> 0x0a05 }
            boolean r3 = r12.A04     // Catch:{ all -> 0x0a05 }
            r0.A06 = r3     // Catch:{ all -> 0x0a05 }
        L_0x0860:
            if (r20 == 0) goto L_0x08b1
            java.lang.Object r3 = r32.get()     // Catch:{ all -> 0x0a05 }
            if (r3 == 0) goto L_0x08b1
            X.AnonymousClass00B.A06(r35)     // Catch:{ all -> 0x0a05 }
            java.lang.String r3 = X.C37981q3.A00(r35)     // Catch:{ all -> 0x0a05 }
            r5.A09(r3)     // Catch:{ all -> 0x0a05 }
            if (r6 != 0) goto L_0x08b1
            X.29z r12 = r0.A0b     // Catch:{ all -> 0x0a05 }
            X.3G3 r3 = new X.3G3     // Catch:{ all -> 0x0a05 }
            r3.<init>(r12, r2, r7)     // Catch:{ all -> 0x0a05 }
            r2 = r21
            java.lang.Object r12 = r2.A00(r3)     // Catch:{ all -> 0x0a05 }
            X.4NN r12 = (X.AnonymousClass4NN) r12     // Catch:{ all -> 0x0a05 }
            if (r12 != 0) goto L_0x088a
            X.4NN r12 = new X.4NN     // Catch:{ all -> 0x0a05 }
            r12.<init>()     // Catch:{ all -> 0x0a05 }
        L_0x088a:
            X.21J r3 = r12.A01     // Catch:{ all -> 0x0a05 }
            r2 = r44
            r2.A00 = r3     // Catch:{ all -> 0x0a05 }
            boolean r2 = r12.A04     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x08a8
            java.lang.String r2 = r12.A03     // Catch:{ all -> 0x0a05 }
            r5.A0A(r2)     // Catch:{ all -> 0x0a05 }
            X.1AO r3 = r0.A0R     // Catch:{ all -> 0x0a05 }
            java.lang.String r2 = r12.A02     // Catch:{ all -> 0x0a05 }
            java.lang.String r2 = r3.A00(r2)     // Catch:{ all -> 0x0a05 }
            r5.A07(r2)     // Catch:{ all -> 0x0a05 }
            r5.A08(r7)     // Catch:{ all -> 0x0a05 }
            goto L_0x08b1
        L_0x08a8:
            r2 = 11
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0a05 }
            goto L_0x098e
        L_0x08b0:
            r6 = 0
        L_0x08b1:
            if (r6 != 0) goto L_0x0911
            if (r9 == 0) goto L_0x0911
            java.lang.String r3 = r9.A00     // Catch:{ all -> 0x0a05 }
            r2 = r19
            boolean r2 = r2.A01     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x08cf
            java.lang.String r2 = r0.A04     // Catch:{ all -> 0x0a05 }
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x0a05 }
            if (r2 != 0) goto L_0x08cf
            java.lang.String r2 = "mediaupload/optimistic-hash-fail"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x0a05 }
            r5.A08(r3)     // Catch:{ all -> 0x0a05 }
            r7 = 1
            goto L_0x08d0
        L_0x08cf:
            r7 = 0
        L_0x08d0:
            java.lang.String r3 = r9.A02     // Catch:{ all -> 0x0a05 }
            if (r18 == 0) goto L_0x08e5
            r2 = r36
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x0a05 }
            if (r2 != 0) goto L_0x08e5
            java.lang.String r2 = "mediaupload/optimistic-plaintext-hash-fail"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x0a05 }
            r5.A09(r3)     // Catch:{ all -> 0x0a05 }
            r7 = 1
        L_0x08e5:
            if (r7 == 0) goto L_0x08ef
            r2 = 12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0a05 }
            goto L_0x098e
        L_0x08ef:
            boolean r2 = r0.A0C()     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x090b
            if (r11 == 0) goto L_0x090b
            byte[] r7 = r11.A00()     // Catch:{ all -> 0x0a05 }
            if (r7 == 0) goto L_0x090b
            int r2 = r7.length     // Catch:{ all -> 0x0a05 }
            if (r2 <= 0) goto L_0x090b
            int[] r3 = r1.A0E     // Catch:{ all -> 0x0a05 }
            X.1y3 r2 = new X.1y3     // Catch:{ all -> 0x0a05 }
            r2.<init>(r7, r3)     // Catch:{ all -> 0x0a05 }
            monitor-enter(r5)     // Catch:{ all -> 0x0a05 }
            r5.A02 = r2     // Catch:{ all -> 0x09ff }
            monitor-exit(r5)     // Catch:{ all -> 0x0a05 }
        L_0x090b:
            java.lang.String r2 = r9.A01     // Catch:{ all -> 0x0a05 }
            monitor-enter(r5)     // Catch:{ all -> 0x0a05 }
            r5.A0D = r2     // Catch:{ all -> 0x09ff }
            monitor-exit(r5)     // Catch:{ all -> 0x0a05 }
        L_0x0911:
            int r7 = r1.A00     // Catch:{ all -> 0x0a05 }
            if (r7 <= 0) goto L_0x0948
            X.1XK r3 = X.AnonymousClass1XK.A0S     // Catch:{ all -> 0x0a05 }
            r2 = r42
            if (r2 != r3) goto L_0x0948
            X.AnonymousClass00B.A06(r35)     // Catch:{ all -> 0x0a05 }
            long r2 = (long) r7     // Catch:{ all -> 0x0a05 }
            r11 = 15
            long r2 = r2 + r11
            r11 = 16
            long r2 = r2 / r11
            long r2 = r2 * r11
            int r9 = (int) r2     // Catch:{ all -> 0x0a05 }
            r3 = r17
            r2 = r35
            X.1zO r8 = r8.A02(r3, r4, r2)     // Catch:{ all -> 0x0a05 }
            X.1zP r7 = r8.A00     // Catch:{ all -> 0x09d2 }
            long r2 = (long) r9     // Catch:{ all -> 0x09d2 }
            X.1q7 r4 = new X.1q7     // Catch:{ all -> 0x09d2 }
            r4.<init>(r7, r2)     // Catch:{ all -> 0x09d2 }
            X.1zK r2 = X.AnonymousClass1QX.A00(r10, r4, r9)     // Catch:{ all -> 0x09d2 }
            byte[] r2 = r2.A00()     // Catch:{ all -> 0x09d2 }
            r8.close()     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x0948
            monitor-enter(r5)     // Catch:{ all -> 0x0a05 }
            r5.A0J = r2     // Catch:{ all -> 0x09ff }
            monitor-exit(r5)     // Catch:{ all -> 0x0a05 }
        L_0x0948:
            r2 = 5
            if (r6 != r2) goto L_0x0952
            r2 = 0
            r5.A08(r2)     // Catch:{ all -> 0x0a05 }
            r5.A09(r2)     // Catch:{ all -> 0x0a05 }
        L_0x0952:
            r0.A06()     // Catch:{ all -> 0x0a05 }
            if (r6 != 0) goto L_0x098a
            r2 = r44
            java.lang.Long r5 = r2.A08     // Catch:{ all -> 0x0a05 }
            if (r5 == 0) goto L_0x098a
            java.lang.Long r3 = r2.A0D     // Catch:{ all -> 0x0a05 }
            if (r3 == 0) goto L_0x0977
            java.lang.Long r2 = r2.A0C     // Catch:{ all -> 0x0a05 }
            if (r2 == 0) goto L_0x0977
            long r7 = r2.longValue()     // Catch:{ all -> 0x0a05 }
            long r3 = r3.longValue()     // Catch:{ all -> 0x0a05 }
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0977
            long r7 = r7 - r3
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0a05 }
            goto L_0x0978
        L_0x0977:
            r2 = 0
        L_0x0978:
            if (r2 == 0) goto L_0x098a
            long r10 = r5.longValue()     // Catch:{ all -> 0x0a05 }
            long r12 = r2.longValue()     // Catch:{ all -> 0x0a05 }
            r9 = 0
            r7 = r43
            r8 = r42
            r7.A02(r8, r9, r10, r12)     // Catch:{ all -> 0x0a05 }
        L_0x098a:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0a05 }
        L_0x098e:
            android.net.TrafficStats.clearThreadStatsTag()
            java.io.File r1 = r1.A06
            X.AnonymousClass00B.A06(r1)
            long r1 = r1.length()
            java.lang.Long r2 = java.lang.Long.valueOf(r1)
            r1 = r44
            r1.A0B = r2
            X.1qJ r0 = r0.A01
            if (r0 == 0) goto L_0x00de
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A01
            int r0 = r0.get()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = r44
            r0.A0E = r1
            return r3
        L_0x09b6:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x09b9:
            r2 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0a05 }
            goto L_0x0a04
        L_0x09bc:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x09c0 }
        L_0x09c0:
            throw r1     // Catch:{ IOException -> 0x09c1 }
        L_0x09c1:
            r2 = move-exception
            java.lang.String r1 = "mediaupload/calculate-sidecar/ioexception"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x09c8 }
            throw r2     // Catch:{ all -> 0x09c8 }
        L_0x09c8:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x09d6 }
            goto L_0x09d6
        L_0x09cd:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x09d6 }
            goto L_0x09d6
        L_0x09d2:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x09d6 }
        L_0x09d6:
            throw r1     // Catch:{ all -> 0x0a05 }
        L_0x09d7:
            java.lang.String r2 = "mediaupload/hash-calculate/file not found; message.key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a05 }
            r1.<init>(r2)     // Catch:{ all -> 0x0a05 }
            r1.append(r11)     // Catch:{ all -> 0x0a05 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0a05 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0a05 }
            java.lang.String r2 = "File not found: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a05 }
            r1.<init>(r2)     // Catch:{ all -> 0x0a05 }
            X.AnonymousClass00B.A06(r3)     // Catch:{ all -> 0x0a05 }
            r1.append(r3)     // Catch:{ all -> 0x0a05 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0a05 }
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0a05 }
            r2.<init>(r1)     // Catch:{ all -> 0x0a05 }
            goto L_0x0a04
        L_0x09ff:
            r2 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0a05 }
            goto L_0x0a04
        L_0x0a02:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0a05 }
        L_0x0a04:
            throw r2     // Catch:{ all -> 0x0a05 }
        L_0x0a05:
            r4 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            X.21E r3 = r0.A0X
            X.1f0 r1 = r0.A0U
            X.1qS r1 = r1.A02
            java.io.File r1 = r1.A06
            X.AnonymousClass00B.A06(r1)
            long r1 = r1.length()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.A0B = r1
            X.1qJ r0 = r0.A01
            if (r0 == 0) goto L_0x0a2f
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A01
            int r0 = r0.get()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A0E = r0
        L_0x0a2f:
            throw r4
        L_0x0a30:
            boolean r1 = r0 instanceof X.C59322x3
            if (r1 == 0) goto L_0x0adf
            X.2x3 r0 = (X.C59322x3) r0
            X.024 r5 = r0.A01
            r5.A02()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Collection r1 = r0.A04
            java.util.Iterator r12 = r1.iterator()
        L_0x0a46:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0a84
            java.lang.Object r1 = r12.next()
            java.io.File r1 = (java.io.File) r1
            java.io.File[] r11 = r1.listFiles()
            r5.A02()
            if (r11 == 0) goto L_0x0a46
            int r9 = r11.length
            r8 = 0
        L_0x0a5d:
            if (r8 >= r9) goto L_0x0a46
            r4 = r11[r8]
            boolean r1 = r4.isFile()
            if (r1 == 0) goto L_0x0a81
            long r6 = r4.lastModified()
            long r1 = r0.A00
            long r6 = r6 - r1
            long r2 = java.lang.Math.abs(r6)
            r6 = 3600000(0x36ee80, double:1.7786363E-317)
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x0a81
            X.1jq r1 = new X.1jq
            r1.<init>(r4, r2)
            r10.add(r1)
        L_0x0a81:
            int r8 = r8 + 1
            goto L_0x0a5d
        L_0x0a84:
            r5.A02()
            r2 = 21
            com.facebook.redex.IDxComparatorShape20S0000000_2_I1 r1 = new com.facebook.redex.IDxComparatorShape20S0000000_2_I1
            r1.<init>(r2)
            java.util.Collections.sort(r10, r1)
            r10.size()
            r5.A02()
            java.util.Iterator r4 = r10.iterator()
        L_0x0a9b:
            boolean r1 = r4.hasNext()
            java.lang.String r3 = "; job="
            if (r1 == 0) goto L_0x0ac3
            java.lang.Object r1 = r4.next()
            X.1jq r1 = (X.C34191jq) r1
            java.io.File r3 = r1.A01
            r5.A02()
            java.lang.String r2 = X.C37981q3.A00(r3)     // Catch:{ IOException -> 0x0abb }
            java.lang.String r1 = r0.A03     // Catch:{ IOException -> 0x0abb }
            boolean r1 = r1.equals(r2)     // Catch:{ IOException -> 0x0abb }
            if (r1 == 0) goto L_0x0a9b
            goto L_0x0ac2
        L_0x0abb:
            r2 = move-exception
            java.lang.String r1 = "mediafilefindjob/run/ioexception"
            com.whatsapp.util.Log.e(r1, r2)
            goto L_0x0a9b
        L_0x0ac2:
            return r3
        L_0x0ac3:
            java.lang.String r1 = "file not found for hash "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = r0.A03
            r2.append(r1)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            r1.<init>(r0)
            throw r1
        L_0x0adf:
            boolean r1 = r0 instanceof X.AnonymousClass2CQ
            if (r1 == 0) goto L_0x0bb4
            X.2CQ r0 = (X.AnonymousClass2CQ) r0
            java.util.Collection r1 = r0.A00
            java.util.Iterator r10 = r1.iterator()
        L_0x0aeb:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0bb1
            java.lang.Object r9 = r10.next()
            X.0tY r9 = (X.C16730tY) r9
            X.1HE r8 = r0.A01
            int r2 = r9.A0C
            r1 = 1
            if (r2 == r1) goto L_0x0b1c
            java.lang.String r1 = "mediajobmanager/trycancelmessageandmediajob "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            X.1Vw r1 = r9.A11
            r2.append(r1)
            java.lang.String r1 = " status:"
            r2.append(r1)
            int r1 = r9.A0C
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            goto L_0x0aeb
        L_0x0b1c:
            X.1zg r5 = r8.A00(r9)
            if (r5 == 0) goto L_0x0aeb
            java.lang.Object r7 = r8.A0Q
            monitor-enter(r7)
            java.util.WeakHashMap r4 = r8.A0R     // Catch:{ all -> 0x0bae }
            java.lang.Object r6 = r4.get(r5)     // Catch:{ all -> 0x0bae }
            X.1XP r6 = (X.AnonymousClass1XP) r6     // Catch:{ all -> 0x0bae }
            monitor-exit(r7)     // Catch:{ all -> 0x0bae }
            if (r6 == 0) goto L_0x0aeb
            X.1Rq r1 = r8.A0J
            java.lang.Runnable r1 = r1.A00(r6)
            X.1er r1 = (X.C31681er) r1
            if (r1 == 0) goto L_0x0b43
            X.1Sv r3 = r8.A0E
            X.1ez r2 = r1.A0W
            X.0ta r1 = r9.A02
            r3.A02(r1, r2, r9)
        L_0x0b43:
            java.lang.Object r2 = r6.A0R
            monitor-enter(r2)
            X.1Vw r1 = r9.A11     // Catch:{ all -> 0x0bab }
            r5.A02(r1)     // Catch:{ all -> 0x0bab }
            java.util.concurrent.CopyOnWriteArrayList r1 = r5.A01     // Catch:{ all -> 0x0bab }
            int r1 = r1.size()     // Catch:{ all -> 0x0bab }
            if (r1 != 0) goto L_0x0b57
            r1 = 0
            r8.A02(r5, r1)     // Catch:{ all -> 0x0bab }
        L_0x0b57:
            monitor-exit(r2)     // Catch:{ all -> 0x0bab }
            monitor-enter(r7)
            java.util.Set r1 = r4.entrySet()     // Catch:{ all -> 0x0ba8 }
            java.util.Iterator r9 = r1.iterator()     // Catch:{ all -> 0x0ba8 }
            r5 = 0
        L_0x0b62:
            boolean r1 = r9.hasNext()     // Catch:{ all -> 0x0ba8 }
            if (r1 == 0) goto L_0x0b9b
            java.lang.Object r4 = r9.next()     // Catch:{ all -> 0x0ba8 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x0ba8 }
            java.lang.Object r3 = r4.getKey()     // Catch:{ all -> 0x0ba8 }
            X.1zg r3 = (X.C43241zg) r3     // Catch:{ all -> 0x0ba8 }
            monitor-enter(r3)     // Catch:{ all -> 0x0ba8 }
            java.util.concurrent.CopyOnWriteArrayList r1 = r3.A01     // Catch:{ all -> 0x0ba5 }
            int r1 = r1.size()     // Catch:{ all -> 0x0ba5 }
            r2 = 0
            if (r1 != 0) goto L_0x0b7f
            r2 = 1
        L_0x0b7f:
            monitor-exit(r3)     // Catch:{ all -> 0x0ba8 }
            r1 = 0
            if (r2 != 0) goto L_0x0b84
            r1 = 1
        L_0x0b84:
            X.AnonymousClass00B.A0G(r1)     // Catch:{ all -> 0x0ba8 }
            java.lang.Object r1 = r4.getValue()     // Catch:{ all -> 0x0ba8 }
            if (r1 != r6) goto L_0x0b62
            java.lang.Object r1 = r4.getKey()     // Catch:{ all -> 0x0ba8 }
            X.1zg r1 = (X.C43241zg) r1     // Catch:{ all -> 0x0ba8 }
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.A01     // Catch:{ all -> 0x0ba8 }
            int r1 = r1.size()     // Catch:{ all -> 0x0ba8 }
            int r5 = r5 + r1
            goto L_0x0b62
        L_0x0b9b:
            monitor-exit(r7)     // Catch:{ all -> 0x0ba8 }
            if (r5 != 0) goto L_0x0aeb
            X.0wL r1 = r8.A0D
            r1.A06(r6)
            goto L_0x0aeb
        L_0x0ba5:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0ba8 }
            throw r0     // Catch:{ all -> 0x0ba8 }
        L_0x0ba8:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0ba8 }
            throw r1
        L_0x0bab:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0bab }
            throw r1
        L_0x0bae:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0bae }
            throw r1
        L_0x0bb1:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x0bb4:
            X.1wy r0 = (X.C41961wy) r0
            X.0tA r1 = r0.A01
            X.0tY r0 = r0.A02
            android.net.Uri r0 = com.obwhatsapp.contentprovider.MediaProvider.A02(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30711cp.A05():java.lang.Object");
    }

    public void A06() {
        if (this.A02.isCancelled()) {
            throw new CancellationException();
        }
    }

    public void cancel() {
        this.A02.cancel(true);
    }

    public void run() {
        Throwable e2;
        Throwable e3;
        try {
            FutureTask futureTask = this.A02;
            futureTask.run();
            try {
                boolean interrupted = Thread.interrupted();
                this.A01.await();
                if (interrupted) {
                    Thread.currentThread().interrupt();
                }
                Object obj = futureTask.get();
                AnonymousClass00B.A06(obj);
                A02(obj);
            } catch (InterruptedException | CancellationException e4) {
                e3 = e4;
                A03(e3);
            } catch (ExecutionException e5) {
                e3 = e5.getCause();
                A03(e3);
            }
        } catch (Throwable th) {
            try {
                boolean interrupted2 = Thread.interrupted();
                this.A01.await();
                if (interrupted2) {
                    Thread.currentThread().interrupt();
                }
                Object obj2 = this.A02.get();
                AnonymousClass00B.A06(obj2);
                A02(obj2);
                throw th;
            } catch (InterruptedException | CancellationException e6) {
                e2 = e6;
                A03(e2);
                throw th;
            } catch (ExecutionException e7) {
                e2 = e7.getCause();
                A03(e2);
                throw th;
            }
        }
    }
}

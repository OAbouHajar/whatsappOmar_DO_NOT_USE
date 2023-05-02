package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.LinkedList;

/* renamed from: X.2CW  reason: invalid class name */
public final class AnonymousClass2CW extends HandlerThread {
    public C51542bq A00;
    public boolean A01 = true;
    public final C51592bv A02;
    public final C51602bw A03;
    public final C51582bu A04;
    public final C51622by A05 = new C51622by(this);
    public final LinkedList A06 = new LinkedList();

    public AnonymousClass2CW(C51592bv r3, C51602bw r4, C51582bu r5) {
        super("WriterThread", 1);
        this.A04 = r5;
        this.A02 = r3;
        this.A03 = r4;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v231, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v375, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v376, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v488, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v491, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r0v386, types: [java.lang.String] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x1415: MOVE  (r0v139 int) = (r22v0 int)
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
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x1210 A[Catch:{ 2Pf -> 0x162b, IOException -> 0x178a, 2Pf -> 0x17af, IOException -> 0x178a }] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x1217 A[Catch:{ 2Pf -> 0x162b, IOException -> 0x178a, 2Pf -> 0x17af, IOException -> 0x178a }] */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x125c A[Catch:{ 2Pf -> 0x162b, IOException -> 0x178a, 2Pf -> 0x17af, IOException -> 0x178a }] */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x12be A[Catch:{ 2Pf -> 0x162b, IOException -> 0x178a, 2Pf -> 0x17af, IOException -> 0x178a }] */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x12f8 A[ADDED_TO_REGION, Catch:{ 2Pf -> 0x162b, IOException -> 0x178a, 2Pf -> 0x17af, IOException -> 0x178a }] */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x1355 A[Catch:{ 2Pf -> 0x162b, IOException -> 0x178a, 2Pf -> 0x17af, IOException -> 0x178a }] */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x1372 A[Catch:{ 2Pf -> 0x162b, IOException -> 0x178a, 2Pf -> 0x17af, IOException -> 0x178a }] */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x1375 A[Catch:{ 2Pf -> 0x162b, IOException -> 0x178a, 2Pf -> 0x17af, IOException -> 0x178a }] */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x13a0 A[Catch:{ 2Pf -> 0x162b, IOException -> 0x178a, 2Pf -> 0x17af, IOException -> 0x178a }] */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x13ae A[Catch:{ 2Pf -> 0x162b, IOException -> 0x178a, 2Pf -> 0x17af, IOException -> 0x178a }] */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x13bc A[Catch:{ 2Pf -> 0x162b, IOException -> 0x178a, 2Pf -> 0x17af, IOException -> 0x178a }] */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x13ca A[Catch:{ 2Pf -> 0x162b, IOException -> 0x178a, 2Pf -> 0x17af, IOException -> 0x178a }] */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x13e5 A[Catch:{ 2Pf -> 0x162b, IOException -> 0x178a, 2Pf -> 0x17af, IOException -> 0x178a }] */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x13f3 A[Catch:{ 2Pf -> 0x162b, IOException -> 0x178a, 2Pf -> 0x17af, IOException -> 0x178a }] */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x13f6 A[Catch:{ 2Pf -> 0x162b, IOException -> 0x178a, 2Pf -> 0x17af, IOException -> 0x178a }] */
    /* JADX WARNING: Removed duplicated region for block: B:382:0x13fb A[Catch:{ 2Pf -> 0x162b, IOException -> 0x178a, 2Pf -> 0x17af, IOException -> 0x178a }] */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x1430 A[Catch:{ 2Pf -> 0x162b, IOException -> 0x178a, 2Pf -> 0x17af, IOException -> 0x178a }] */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x1442 A[Catch:{ 2Pf -> 0x162b, IOException -> 0x178a, 2Pf -> 0x17af, IOException -> 0x178a }] */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x1450 A[Catch:{ 2Pf -> 0x162b, IOException -> 0x178a, 2Pf -> 0x17af, IOException -> 0x178a }] */
    /* JADX WARNING: Removed duplicated region for block: B:402:0x147f A[Catch:{ 2Pf -> 0x162b, IOException -> 0x178a, 2Pf -> 0x17af, IOException -> 0x178a }] */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x1482 A[Catch:{ 2Pf -> 0x162b, IOException -> 0x178a, 2Pf -> 0x17af, IOException -> 0x178a }] */
    /* JADX WARNING: Removed duplicated region for block: B:409:0x148d A[Catch:{ 2Pf -> 0x162b, IOException -> 0x178a, 2Pf -> 0x17af, IOException -> 0x178a }] */
    /* JADX WARNING: Removed duplicated region for block: B:509:0x178a A[ExcHandler: IOException (r1v3 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:36:0x00a8] */
    public void A00(android.os.Message r54) {
        /*
            r53 = this;
            r2 = r54
            android.os.Bundle r4 = r2.getData()
            java.lang.String r0 = "messageClient:iqId"
            java.lang.String r3 = r4.getString(r0)
            java.lang.String r0 = "messageClient:checkCallback"
            boolean r0 = r4.getBoolean(r0)
            r52 = r53
            if (r0 == 0) goto L_0x0032
            r0 = r52
            X.2bu r0 = r0.A04
            X.AnonymousClass00B.A06(r3)
            X.2bt r0 = (X.C51572bt) r0
            X.1vi r0 = r0.A00
            X.1CP r0 = r0.A0l
            java.util.Map r1 = r0.A0E
            monitor-enter(r1)
            boolean r0 = r1.containsKey(r3)     // Catch:{ all -> 0x002c }
            monitor-exit(r1)     // Catch:{ all -> 0x002c }
            goto L_0x002f
        L_0x002c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002c }
            throw r0
        L_0x002f:
            r1 = 1
            if (r0 == 0) goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            r0 = r52
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x0056
            int r0 = X.C34501kN.A00(r2)
            switch(r0) {
                case 0: goto L_0x0195;
                case 4: goto L_0x0195;
                case 5: goto L_0x0195;
                case 8: goto L_0x0195;
                case 13: goto L_0x0195;
                case 14: goto L_0x0195;
                case 18: goto L_0x0195;
                case 21: goto L_0x0195;
                case 22: goto L_0x0195;
                case 23: goto L_0x0195;
                case 24: goto L_0x0195;
                case 29: goto L_0x0195;
                case 38: goto L_0x0195;
                case 69: goto L_0x0195;
                case 70: goto L_0x0195;
                case 74: goto L_0x0195;
                case 76: goto L_0x0195;
                case 77: goto L_0x0195;
                case 85: goto L_0x0195;
                case 86: goto L_0x0195;
                case 87: goto L_0x0195;
                case 89: goto L_0x0195;
                case 96: goto L_0x0195;
                case 105: goto L_0x0195;
                case 106: goto L_0x0195;
                case 118: goto L_0x0195;
                case 119: goto L_0x0195;
                case 124: goto L_0x0195;
                case 132: goto L_0x0195;
                case 133: goto L_0x0195;
                case 162: goto L_0x0195;
                case 164: goto L_0x0195;
                case 183: goto L_0x0195;
                case 184: goto L_0x0195;
                case 189: goto L_0x0195;
                case 192: goto L_0x0195;
                case 193: goto L_0x0195;
                case 196: goto L_0x0195;
                case 214: goto L_0x0195;
                case 215: goto L_0x0195;
                case 216: goto L_0x0195;
                case 222: goto L_0x0195;
                case 223: goto L_0x0195;
                case 226: goto L_0x0195;
                case 229: goto L_0x0195;
                case 230: goto L_0x0195;
                case 231: goto L_0x0195;
                case 232: goto L_0x0195;
                case 241: goto L_0x0195;
                case 248: goto L_0x0195;
                case 251: goto L_0x0195;
                case 261: goto L_0x0195;
                case 263: goto L_0x0195;
                case 270: goto L_0x0195;
                case 271: goto L_0x0195;
                case 274: goto L_0x0195;
                case 275: goto L_0x0195;
                case 277: goto L_0x0195;
                case 279: goto L_0x0195;
                case 296: goto L_0x0195;
                case 327: goto L_0x0195;
                case 332: goto L_0x0195;
                case 342: goto L_0x0195;
                default: goto L_0x0040;
            }
        L_0x0040:
            java.lang.String r0 = "messageClient:dropIfOffline"
            boolean r0 = r4.getBoolean(r0)
            if (r0 != 0) goto L_0x0195
            if (r1 != 0) goto L_0x0195
            r0 = r52
            java.util.LinkedList r1 = r0.A06
            android.os.Message r0 = android.os.Message.obtain(r2)
            r1.add(r0)
        L_0x0055:
            return
        L_0x0056:
            if (r1 != 0) goto L_0x0195
            r0 = r52
            X.2bu r0 = r0.A04
            r16 = r0
            r0 = r16
            X.2bt r0 = (X.C51572bt) r0
            r16 = r0
            X.1vi r0 = r0.A00
            X.1CP r8 = r0.A0l
            if (r3 == 0) goto L_0x00a6
            java.lang.Object r7 = r8.A0B
            monitor-enter(r7)
            java.util.Map r6 = r8.A0E     // Catch:{ all -> 0x01a6 }
            boolean r0 = r6.containsKey(r3)     // Catch:{ all -> 0x01a6 }
            if (r0 == 0) goto L_0x00a5
            java.util.Map r5 = r8.A0D     // Catch:{ all -> 0x01a6 }
            boolean r0 = r5.containsKey(r3)     // Catch:{ all -> 0x01a6 }
            r4 = 0
            if (r0 != 0) goto L_0x007f
            r4 = 1
        L_0x007f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a6 }
            r1.<init>()     // Catch:{ all -> 0x01a6 }
            java.lang.String r0 = "Unhandled iq-response for id:"
            r1.append(r0)     // Catch:{ all -> 0x01a6 }
            r1.append(r3)     // Catch:{ all -> 0x01a6 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01a6 }
            X.AnonymousClass00B.A0D(r0, r4)     // Catch:{ all -> 0x01a6 }
            java.lang.Object r0 = r6.remove(r3)     // Catch:{ all -> 0x01a6 }
            X.0yc r0 = (X.C19550yc) r0     // Catch:{ all -> 0x01a6 }
            r5.put(r3, r0)     // Catch:{ all -> 0x01a6 }
            r1 = 7
            com.facebook.redex.IDxNConsumerShape0S1000000_2_I0 r0 = new com.facebook.redex.IDxNConsumerShape0S1000000_2_I0     // Catch:{ all -> 0x01a6 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x01a6 }
            r8.A02(r0)     // Catch:{ all -> 0x01a6 }
        L_0x00a5:
            monitor-exit(r7)     // Catch:{ all -> 0x01a6 }
        L_0x00a6:
            r0 = r52
            X.2by r1 = r0.A05     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.Object r4 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            boolean r3 = r4 instanceof android.os.Bundle     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 0
            if (r3 == 0) goto L_0x00b8
            android.os.Bundle r4 = (android.os.Bundle) r4     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x00b3:
            int r11 = r2.arg1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            if (r11 == 0) goto L_0x1708
            goto L_0x00c5
        L_0x00b8:
            android.os.Bundle r3 = r2.peekData()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            if (r3 == 0) goto L_0x00c3
            android.os.Bundle r4 = r2.getData()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            goto L_0x00b3
        L_0x00c3:
            r4 = r0
            goto L_0x00b3
        L_0x00c5:
            r3 = 3
            if (r11 == r3) goto L_0x16c7
            r3 = 6
            if (r11 == r3) goto L_0x1667
            r3 = 8
            if (r11 == r3) goto L_0x10a8
            r3 = 9
            if (r11 == r3) goto L_0x10a0
            r3 = 23
            if (r11 == r3) goto L_0x107b
            r3 = 24
            if (r11 == r3) goto L_0x106f
            r3 = 76
            if (r11 == r3) goto L_0x1067
            r3 = 77
            if (r11 == r3) goto L_0x0ff8
            java.lang.String r9 = "remoteResource"
            java.lang.String r10 = "messageKeyId"
            java.lang.String r6 = "callId"
            java.lang.String r8 = "callCreatorJid"
            java.lang.String r7 = "jid"
            java.lang.String r5 = "loggableStanzaId"
            java.lang.String r3 = "id"
            switch(r11) {
                case 6: goto L_0x1667;
                case 18: goto L_0x082b;
                case 21: goto L_0x08eb;
                case 27: goto L_0x08fd;
                case 29: goto L_0x09c7;
                case 42: goto L_0x0a35;
                case 61: goto L_0x0b1e;
                case 96: goto L_0x0be1;
                case 117: goto L_0x0bf4;
                case 129: goto L_0x0fb6;
                case 157: goto L_0x0c4e;
                case 163: goto L_0x0cf1;
                case 206: goto L_0x0d21;
                case 233: goto L_0x1667;
                case 240: goto L_0x0d7e;
                case 247: goto L_0x0121;
                case 263: goto L_0x0db6;
                case 276: goto L_0x016e;
                case 295: goto L_0x0e27;
                case 327: goto L_0x0ebc;
                case 343: goto L_0x1677;
                case 356: goto L_0x1677;
                default: goto L_0x00f4;
            }     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x00f4:
            switch(r11) {
                case 11: goto L_0x0608;
                case 12: goto L_0x07d0;
                case 13: goto L_0x0779;
                default: goto L_0x00f7;
            }     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x00f7:
            switch(r11) {
                case 35: goto L_0x057a;
                case 36: goto L_0x04e8;
                case 37: goto L_0x0604;
                case 38: goto L_0x0e47;
                default: goto L_0x00fa;
            }     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x00fa:
            switch(r11) {
                case 71: goto L_0x049c;
                case 72: goto L_0x04c2;
                case 73: goto L_0x1695;
                default: goto L_0x00fd;
            }     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x00fd:
            switch(r11) {
                case 85: goto L_0x01d0;
                case 86: goto L_0x02d5;
                case 87: goto L_0x0362;
                case 88: goto L_0x043a;
                case 89: goto L_0x173a;
                case 90: goto L_0x0102;
                default: goto L_0x0100;
            }     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x0100:
            goto L_0x01a9
        L_0x0102:
            java.lang.Object r0 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.List r0 = (java.util.List) r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.size()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x010d:
            boolean r0 = r4.hasNext()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            if (r0 == 0) goto L_0x0055
            java.lang.Object r3 = r4.next()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.0tZ r3 = (X.C16740tZ) r3     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            boolean r0 = r3.A0w     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            if (r0 != 0) goto L_0x010d
            r1.A00(r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            goto L_0x010d
        L_0x0121:
            java.lang.Object r0 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.List r0 = (java.util.List) r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.size()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x012c:
            boolean r0 = r6.hasNext()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            if (r0 == 0) goto L_0x0055
            java.lang.Object r5 = r6.next()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1ci r5 = (X.C30641ci) r5     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = r5.A05     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "receipt"
            boolean r0 = r0.equals(r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            if (r0 == 0) goto L_0x016a
            java.lang.String r3 = r5.A08     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "read"
            boolean r0 = r0.equals(r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            if (r0 != 0) goto L_0x0154
            java.lang.String r0 = "read-self"
            boolean r0 = r0.equals(r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            if (r0 == 0) goto L_0x016a
        L_0x0154:
            X.2CW r0 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bv r4 = r0.A02     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            com.whatsapp.jid.Jid r0 = r5.A01     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.0rv r3 = X.C16030sJ.A00(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.0z0 r0 = r4.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            boolean r0 = r0.A01(r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = r0 ^ 1
            r1.A02(r5, r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            goto L_0x012c
        L_0x016a:
            r1.A01(r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            goto L_0x012c
        L_0x016e:
            java.lang.Object r0 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.List r0 = (java.util.List) r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            if (r0 == 0) goto L_0x0fb6
            r0.size()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x017b:
            boolean r0 = r5.hasNext()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            if (r0 == 0) goto L_0x0055
            java.lang.Object r4 = r5.next()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1ci r4 = (X.C30641ci) r4     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = r4.A05     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "notification"
            boolean r0 = r0.equals(r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            if (r0 == 0) goto L_0x017b
            r1.A01(r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            goto L_0x017b
        L_0x0195:
            r0 = r52
            X.2bu r0 = r0.A04
            X.2bt r0 = (X.C51572bt) r0
            X.1vi r0 = r0.A00
            X.1CP r0 = r0.A0l
            if (r3 == 0) goto L_0x0055
            java.lang.Object r2 = r0.A0B
            monitor-enter(r2)
            goto L_0x17b7
        L_0x01a6:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x01a6 }
            throw r0
        L_0x01a9:
            java.lang.String r0 = "xmppmsg/send/unknown what="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            int r0 = r2.what     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "argv1="
            r1.append(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r11)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "object="
            r1.append(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.Object r0 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = r1.toString()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            return
        L_0x01d0:
            java.lang.Object r4 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.AnonymousClass00B.A06(r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2c1 r4 = (X.C51652c1) r4     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            byte[] r0 = r4.A01     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r18 = r0
            byte[] r13 = r4.A02     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1dG[] r14 = r4.A03     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1dG r12 = r4.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2CW r0 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r11 = r0.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r17 = 5
            int r0 = r11.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            int r0 = r0 + 1
            r11.A00 = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r10 = java.lang.Integer.toHexString(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.Map r1 = r11.A03     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2c2 r0 = new X.2c2     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>(r11, r13)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.put(r10, r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            int r15 = r14.length     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv[] r9 = new X.C28371Vv[r15]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r8 = 0
            r7 = 0
        L_0x0200:
            java.lang.String r6 = "value"
            r1 = 2
            r5 = 0
            if (r7 >= r15) goto L_0x022c
            X.1Vv[] r4 = new X.C28371Vv[r1]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = r14[r7]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            byte[] r1 = r0.A01     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv r0 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r3, (byte[]) r1, (X.C35081lL[]) r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4[r8] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = r14[r7]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            byte[] r1 = r0.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv r0 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r6, (byte[]) r1, (X.C35081lL[]) r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1 = 1
            r4[r1] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "key"
            X.1Vv r0 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r1, (X.C35081lL[]) r5, (X.C28371Vv[]) r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r9[r7] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            int r7 = r7 + 1
            goto L_0x0200
        L_0x022c:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.<init>()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r14 = "identity"
            X.1Vv r7 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = r18
            r7.<init>((java.lang.String) r14, (byte[]) r0, (X.C35081lL[]) r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.add(r7)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r7 = "registration"
            X.1Vv r0 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r7, (byte[]) r13, (X.C35081lL[]) r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.add(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 1
            byte[] r7 = new byte[r0]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r7[r8] = r17     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r13 = "type"
            X.1Vv r0 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r13, (byte[]) r7, (X.C35081lL[]) r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.add(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r7 = "list"
            X.1Vv r0 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r7, (X.C35081lL[]) r5, (X.C28371Vv[]) r9)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.add(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r7 = 3
            X.1Vv[] r9 = new X.C28371Vv[r7]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            byte[] r14 = r12.A01     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv r0 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r3, (byte[]) r14, (X.C35081lL[]) r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r9[r8] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            byte[] r0 = r12.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv r14 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r14.<init>((java.lang.String) r6, (byte[]) r0, (X.C35081lL[]) r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 1
            r9[r0] = r14     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            byte[] r12 = r12.A02     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r6 = "signature"
            X.1Vv r0 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r6, (byte[]) r12, (X.C35081lL[]) r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r9[r1] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r6 = "skey"
            X.1Vv r0 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r6, (X.C35081lL[]) r5, (X.C28371Vv[]) r9)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.add(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 4
            X.1lL[] r5 = new X.C35081lL[r0]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r3, (java.lang.String) r10)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5[r8] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r6 = "xmlns"
            java.lang.String r0 = "encrypt"
            X.1lL r3 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3.<init>((java.lang.String) r6, (java.lang.String) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 1
            r5[r0] = r3     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = "set"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r13, (java.lang.String) r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5[r1] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1ks r3 = X.C34791ks.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "to"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((com.whatsapp.jid.Jid) r3, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5[r7] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv[] r0 = new X.C28371Vv[r8]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.Object[] r1 = r4.toArray(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv[] r1 = (X.C28371Vv[]) r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "iq"
            X.1Vv r3 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3.<init>((java.lang.String) r0, (X.C35081lL[]) r5, (X.C28371Vv[]) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Gl r1 = r11.A0C     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 1
            r1.A04(r3, r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/set-pre-key"
            goto L_0x1786
        L_0x02d5:
            java.lang.Object r4 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.AnonymousClass00B.A06(r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Qi r4 = (X.C49012Qi) r4     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r11 = r4.A02     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1dG r9 = r4.A01     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Qh r5 = r4.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2CW r1 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r4 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.Map r1 = r4.A03     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.put(r11, r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Gl r7 = r4.A0C     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1 = 4
            X.1lL[] r6 = new X.C35081lL[r1]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r5 = "xmlns"
            java.lang.String r4 = "encrypt"
            X.1lL r1 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r5, (java.lang.String) r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r12 = 0
            r6[r12] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r5 = "type"
            java.lang.String r4 = "set"
            X.1lL r1 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r5, (java.lang.String) r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5 = 1
            r6[r5] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1ks r8 = X.C34791ks.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r4 = "to"
            X.1lL r1 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((com.whatsapp.jid.Jid) r8, (java.lang.String) r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r10 = 2
            r6[r10] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL r4 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.<init>((java.lang.String) r3, (java.lang.String) r11)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1 = 3
            r6[r1] = r4     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv[] r8 = new X.C28371Vv[r1]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            byte[] r4 = r9.A01     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r3, (byte[]) r4, (X.C35081lL[]) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r8[r12] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            byte[] r4 = r9.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = "value"
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r3, (byte[]) r4, (X.C35081lL[]) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r8[r5] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            byte[] r4 = r9.A02     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = "signature"
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r3, (byte[]) r4, (X.C35081lL[]) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r8[r10] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "skey"
            X.1Vv r4 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.<init>((java.lang.String) r1, (X.C35081lL[]) r0, (X.C28371Vv[]) r8)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "rotate"
            X.1Vv r3 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3.<init>((X.C28371Vv) r4, (java.lang.String) r1, (X.C35081lL[]) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "iq"
            X.1Vv r0 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((X.C28371Vv) r3, (java.lang.String) r1, (X.C35081lL[]) r6)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r7.A04(r0, r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/rotate-pre-key"
            goto L_0x1786
        L_0x0362:
            X.AnonymousClass00B.A06(r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r10 = r4.getString(r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r5 = "jids"
            android.os.Parcelable[] r9 = r4.getParcelableArray(r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            com.whatsapp.jid.DeviceJid[] r9 = (com.whatsapp.jid.DeviceJid[]) r9     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r5 = "identityJids"
            android.os.Parcelable[] r5 = r4.getParcelableArray(r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r18 = "; jids="
            java.util.Arrays.toString(r9)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2CW r1 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r12 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.Map r4 = r12.A03     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2c0 r1 = new X.2c0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>(r12, r9)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.put(r10, r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            int r1 = r9.length     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r19 = r1
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r13.<init>(r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.List r1 = java.util.Arrays.asList(r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.HashSet r14 = new java.util.HashSet     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r14.<init>(r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r11 = 0
            r8 = 0
        L_0x039d:
            r4 = 2
            r6 = 1
            r1 = r19
            if (r8 >= r1) goto L_0x03da
            r1 = r9[r8]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            boolean r5 = r14.contains(r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r17 = "user"
            if (r5 == 0) goto L_0x03cd
            X.1lL[] r15 = new X.C35081lL[r4]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL r4 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.<init>((com.whatsapp.jid.Jid) r1, (java.lang.String) r7)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r15[r11] = r4     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r4 = "reason"
            java.lang.String r1 = "identity"
            X.1lL r5 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5.<init>((java.lang.String) r4, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r15[r6] = r5     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x03c2:
            X.1Vv r4 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1 = r17
            r4.<init>(r1, r15)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r13.add(r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            goto L_0x03d7
        L_0x03cd:
            X.1lL[] r15 = new X.C35081lL[r6]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL r4 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.<init>((com.whatsapp.jid.Jid) r1, (java.lang.String) r7)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r15[r11] = r4     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            goto L_0x03c2
        L_0x03d7:
            int r8 = r8 + 1
            goto L_0x039d
        L_0x03da:
            r1 = 4
            X.1lL[] r5 = new X.C35081lL[r1]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL r1 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r3, (java.lang.String) r10)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5[r11] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r7 = "xmlns"
            java.lang.String r3 = "encrypt"
            X.1lL r1 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r7, (java.lang.String) r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5[r6] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r7 = "type"
            java.lang.String r3 = "get"
            X.1lL r1 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r7, (java.lang.String) r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5[r4] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r7 = 3
            X.1ks r4 = X.C34791ks.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = "to"
            X.1lL r1 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((com.whatsapp.jid.Jid) r4, (java.lang.String) r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5[r7] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv[] r1 = new X.C28371Vv[r11]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.Object[] r4 = r13.toArray(r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv[] r4 = (X.C28371Vv[]) r4     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "key"
            X.1Vv r3 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3.<init>((java.lang.String) r1, (X.C35081lL[]) r0, (X.C28371Vv[]) r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "iq"
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((X.C28371Vv) r3, (java.lang.String) r0, (X.C35081lL[]) r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Gl r0 = r12.A0C     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.A04(r1, r6)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/get-pre-key-batch; id="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r10)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = r18
            r1.append(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = java.util.Arrays.toString(r9)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            goto L_0x177f
        L_0x043a:
            X.2CW r1 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r7 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            int r1 = r7.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r6 = 1
            int r1 = r1 + 1
            r7.A00 = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r8 = java.lang.Integer.toHexString(r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.Map r4 = r7.A03     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bz r1 = new X.2bz     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>(r7)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.put(r8, r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1 = 4
            X.1lL[] r5 = new X.C35081lL[r1]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL r4 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.<init>((java.lang.String) r3, (java.lang.String) r8)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1 = 0
            r5[r1] = r4     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r4 = "xmlns"
            java.lang.String r3 = "encrypt"
            X.1lL r1 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r4, (java.lang.String) r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5[r6] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r4 = "type"
            java.lang.String r1 = "get"
            X.1lL r3 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3.<init>((java.lang.String) r4, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1 = 2
            r5[r1] = r3     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1ks r4 = X.C34791ks.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "to"
            X.1lL r3 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3.<init>((com.whatsapp.jid.Jid) r4, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1 = 3
            r5[r1] = r3     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "digest"
            X.1Vv r3 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3.<init>(r1, r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "iq"
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((X.C28371Vv) r3, (java.lang.String) r0, (X.C35081lL[]) r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Gl r0 = r7.A0C     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.A04(r1, r6)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/get-pre-key-digest"
            goto L_0x1786
        L_0x049c:
            java.lang.String r11 = r4.getString(r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            android.os.Parcelable r9 = r4.getParcelable(r7)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            com.whatsapp.jid.DeviceJid r9 = (com.whatsapp.jid.DeviceJid) r9     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            android.os.Parcelable r10 = r4.getParcelable(r8)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            com.whatsapp.jid.DeviceJid r10 = (com.whatsapp.jid.DeviceJid) r10     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r12 = r4.getString(r6)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            long r14 = r4.getLong(r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2CW r0 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r8 = r0.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r13 = "offer"
            r8.A06(r9, r10, r11, r12, r13, r14)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/call-offer-receipt; callId="
            goto L_0x16b9
        L_0x04c2:
            java.lang.String r11 = r4.getString(r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            android.os.Parcelable r9 = r4.getParcelable(r7)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            com.whatsapp.jid.DeviceJid r9 = (com.whatsapp.jid.DeviceJid) r9     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            android.os.Parcelable r10 = r4.getParcelable(r8)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            com.whatsapp.jid.DeviceJid r10 = (com.whatsapp.jid.DeviceJid) r10     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r12 = r4.getString(r6)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            long r14 = r4.getLong(r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2CW r0 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r8 = r0.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r13 = "accept"
            r8.A06(r9, r10, r11, r12, r13, r14)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/call-accept-receipt; callId="
            goto L_0x16b9
        L_0x04e8:
            java.lang.String r4 = "xmppmsg/send/get-normalized-jid"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.Object r4 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2c5 r4 = (X.C51682c5) r4     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r6 = r4.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r5 = "; phoneNumber="
            java.lang.String r4 = r4.A01     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2CW r1 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r9 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            int r1 = r9.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r8 = 1
            int r1 = r1 + 1
            r9.A00 = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r12 = java.lang.Integer.toHexString(r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.Map r7 = r9.A03     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r11 = 4
            com.whatsapp.protocol.IDxRHandlerShape97S0100000_2_I0 r1 = new com.whatsapp.protocol.IDxRHandlerShape97S0100000_2_I0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>(r9, r11)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r7.put(r12, r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r13 = 2
            X.1Vv[] r10 = new X.C28371Vv[r13]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r7 = "cc"
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r7, (java.lang.String) r6, (X.C35081lL[]) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r14 = 0
            r10[r14] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r7 = "in"
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r7, (java.lang.String) r4, (X.C35081lL[]) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r10[r8] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "normalize"
            X.1Vv r7 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r7.<init>((java.lang.String) r1, (X.C35081lL[]) r0, (X.C28371Vv[]) r10)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL[] r10 = new X.C35081lL[r11]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1ks r11 = X.C34791ks.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "to"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((com.whatsapp.jid.Jid) r11, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r10[r14] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r11 = "xmlns"
            java.lang.String r1 = "urn:xmpp:whatsapp:account"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r11, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r10[r8] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r11 = "type"
            java.lang.String r1 = "get"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r11, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r10[r13] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL r1 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r3, (java.lang.String) r12)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 3
            r10[r0] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "iq"
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((X.C28371Vv) r7, (java.lang.String) r0, (X.C35081lL[]) r10)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Gl r0 = r9.A0C     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.A04(r1, r8)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/get-normalized-jid; countryCode="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r6)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            goto L_0x0d1c
        L_0x057a:
            java.lang.String r4 = "xmppmsg/send/set-recovery-token"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            android.os.Bundle r5 = r2.getData()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r4 = "rc"
            byte[] r7 = r5.getByteArray(r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            android.os.Bundle r5 = r2.getData()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r4 = "rcJid"
            java.lang.String r10 = r5.getString(r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            android.os.Bundle r5 = r2.getData()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r4 = "saveRecoveryToken"
            boolean r9 = r5.getBoolean(r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2CW r1 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r6 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            int r1 = r6.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5 = 1
            int r1 = r1 + 1
            r6.A00 = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r8 = java.lang.Integer.toHexString(r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.Map r4 = r6.A03     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2c6 r1 = new X.2c6     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>(r6, r10, r7, r9)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.put(r8, r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "token"
            X.1Vv r4 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.<init>((java.lang.String) r1, (byte[]) r7, (X.C35081lL[]) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 4
            X.1lL[] r7 = new X.C35081lL[r0]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL r1 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r3, (java.lang.String) r8)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 0
            r7[r0] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = "xmlns"
            java.lang.String r1 = "w:auth:token"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r3, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r7[r5] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = "type"
            java.lang.String r0 = "set"
            X.1lL r1 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r3, (java.lang.String) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 2
            r7[r0] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1ks r3 = X.C34791ks.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "to"
            X.1lL r1 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((com.whatsapp.jid.Jid) r3, (java.lang.String) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 3
            r7[r0] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "iq"
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((X.C28371Vv) r4, (java.lang.String) r0, (X.C35081lL[]) r7)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Gl r0 = r6.A0C     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.A04(r1, r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/set-recovery-token"
            goto L_0x1786
        L_0x0604:
            if (r4 == 0) goto L_0x0aa4
            goto L_0x0aa0
        L_0x0608:
            java.lang.Object r14 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2QJ r14 = (X.AnonymousClass2QJ) r14     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r10 = r14.A0A     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r19 = "; jid="
            com.whatsapp.jid.Jid r4 = r14.A04     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r30 = r4
            java.lang.String r18 = "; retryCount="
            int r4 = r14.A01     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r29 = r4
            X.2CW r1 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r1 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r28 = r1
            com.whatsapp.jid.Jid r13 = r14.A05     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            com.whatsapp.jid.UserJid r1 = r14.A06     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r22 = r1
            long r6 = r14.A03     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            byte[] r12 = r14.A0D     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            byte[] r11 = r14.A0C     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            byte r1 = r14.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r17 = r1
            X.1dG r1 = r14.A08     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1dG r9 = r14.A07     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            byte[] r8 = r14.A0B     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            long r4 = r14.A02     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r26 = r4
            java.lang.String r14 = r14.A09     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r21 = r30
            boolean r4 = X.C16030sJ.A0I(r13)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r20 = r13
            if (r4 != 0) goto L_0x064a
            r20 = r30
            r21 = r13
        L_0x064a:
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r15.<init>()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r13 = "v"
            java.lang.String r5 = "1"
            X.1lL r4 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.<init>((java.lang.String) r13, (java.lang.String) r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r15.add(r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r13 = java.lang.String.valueOf(r29)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r5 = "count"
            X.1lL r4 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.<init>((java.lang.String) r5, (java.lang.String) r13)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r15.add(r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL r4 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.<init>((java.lang.String) r3, (java.lang.String) r10)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r15.add(r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r4
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r5 = "t"
            X.1lL r4 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.<init>((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r15.add(r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r5 = "retry"
            r23 = r10
            r24 = r5
            r25 = r14
            X.1lL[] r14 = X.C51542bq.A01(r20, r21, r22, r23, r24, r25)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r13.<init>()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL[] r4 = X.C51542bq.A0D     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.Object[] r6 = r15.toArray(r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL[] r6 = (X.C35081lL[]) r6     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv r4 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.<init>(r5, r6)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r13.add(r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r5 = "registration"
            X.1Vv r4 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.<init>((java.lang.String) r5, (byte[]) r12, (X.C35081lL[]) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r13.add(r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r12 = 0
            if (r11 == 0) goto L_0x0742
            if (r1 == 0) goto L_0x0742
            if (r9 == 0) goto L_0x0742
            r4 = 3
            X.1Vv[] r4 = new X.C28371Vv[r4]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            byte[] r6 = r1.A01     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv r5 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5.<init>((java.lang.String) r3, (byte[]) r6, (X.C35081lL[]) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4[r12] = r5     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            byte[] r6 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r7 = "value"
            X.1Vv r5 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5.<init>((java.lang.String) r7, (byte[]) r6, (X.C35081lL[]) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r6 = 1
            r4[r6] = r5     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            byte[] r15 = r1.A02     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r5 = "signature"
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r5, (byte[]) r15, (X.C35081lL[]) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5 = 2
            r4[r5] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "skey"
            X.1Vv r15 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r15.<init>((java.lang.String) r1, (X.C35081lL[]) r0, (X.C28371Vv[]) r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv[] r5 = new X.C28371Vv[r5]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            byte[] r4 = r9.A01     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r3, (byte[]) r4, (X.C35081lL[]) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5[r12] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            byte[] r3 = r9.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r7, (byte[]) r3, (X.C35081lL[]) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5[r6] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "key"
            X.1Vv r7 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r7.<init>((java.lang.String) r1, (X.C35081lL[]) r0, (X.C28371Vv[]) r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.<init>()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = "identity"
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r3, (byte[]) r11, (X.C35081lL[]) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.add(r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            byte[] r5 = new byte[r6]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5[r12] = r17     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = "type"
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r3, (byte[]) r5, (X.C35081lL[]) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.add(r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.add(r7)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.add(r15)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            if (r8 == 0) goto L_0x0730
            java.lang.String r3 = "device-identity"
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r3, (byte[]) r8, (X.C35081lL[]) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.add(r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x0730:
            X.1Vv[] r1 = new X.C28371Vv[r12]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.Object[] r4 = r4.toArray(r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv[] r4 = (X.C28371Vv[]) r4     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = "keys"
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r3, (X.C35081lL[]) r0, (X.C28371Vv[]) r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r13.add(r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x0742:
            X.1Vv[] r0 = new X.C28371Vv[r12]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.Object[] r1 = r13.toArray(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv[] r1 = (X.C28371Vv[]) r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "receipt"
            X.1Vv r4 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.<init>((java.lang.String) r0, (X.C35081lL[]) r14, (X.C28371Vv[]) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3 = r28
            r0 = r26
            r3.A07(r4, r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/message-retry; message.key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r10)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = r19
            r1.append(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = r30
            r1.append(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = r18
            r1.append(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = r29
            r1.append(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            goto L_0x16c1
        L_0x0779:
            X.2CW r4 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r6 = r4.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r5 = "unavailable"
            java.lang.String r0 = "presence"
            X.1gQ r3 = new X.1gQ     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3.<init>((java.lang.String) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.ArrayList r1 = X.C51672c3.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "type"
            r3.A09(r5, r0, r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv r1 = r3.A01()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Gl r5 = r6.A0C     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 1
            r5.A04(r1, r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3.<init>()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1 = 0
            r3.write(r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.C46842Gl.A01(r3, r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 2
            r3.write(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            byte[] r7 = r3.toByteArray()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Gm r3 = r5.A03     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            int r8 = r7.length     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Gy r0 = r3.A01     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Gz r5 = r0.A04     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.concurrent.atomic.AtomicLong r0 = r0.A01     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            long r9 = r0.getAndIncrement()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            byte[] r6 = new byte[r1]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            byte[] r1 = r5.A01(r6, r7, r8, r9)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.io.OutputStream r0 = r3.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.write(r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.flush()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 1
            r4.A01 = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/logout"
            goto L_0x1786
        L_0x07d0:
            java.lang.Object r14 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            com.whatsapp.jid.Jid r14 = (com.whatsapp.jid.Jid) r14     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            android.os.Bundle r0 = r2.getData()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r8 = "tctoken"
            byte[] r3 = r0.getByteArray(r8)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2CW r0 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r4 = r0.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r7 = 0
            if (r3 == 0) goto L_0x07f0
            X.2c7 r0 = new X.2c7     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>(r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2c8 r7 = new X.2c8     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r7.<init>(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x07f0:
            java.lang.String r0 = "presence"
            X.1gQ r5 = new X.1gQ     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5.<init>((java.lang.String) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = "type"
            java.lang.String r1 = "subscribe"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r3, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5.A02(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 2
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.Class<X.0sL> r0 = X.C16050sL.class
            r6 = 0
            r3[r6] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1 = 1
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            r3[r1] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.List r0 = java.util.Arrays.asList(r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "to"
            boolean r0 = X.C32271fx.A0A(r14, r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            if (r0 == 0) goto L_0x0827
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((com.whatsapp.jid.Jid) r14, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5.A02(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x0827:
            if (r7 == 0) goto L_0x0f9f
            goto L_0x0f6e
        L_0x082b:
            java.lang.String r0 = "xmppmsg/send/clear-dirty "
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            android.os.Bundle r3 = r2.getData()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "category"
            java.lang.String r6 = r3.getString(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            android.os.Bundle r3 = r2.getData()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "timestamp"
            long r3 = r3.getLong(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.Long r5 = java.lang.Long.valueOf(r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r4 = "; timestamp="
            X.2CW r0 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r10 = r0.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.AnonymousClass00B.A06(r6)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            int r0 = r10.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            int r0 = r0 + 1
            r10.A00 = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = java.lang.Integer.toHexString(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.Map r1 = r10.A03     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r9 = 1
            com.whatsapp.protocol.IDxRHandlerShape97S0100000_2_I0 r0 = new com.whatsapp.protocol.IDxRHandlerShape97S0100000_2_I0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>(r10, r9)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.put(r3, r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2cK r11 = new X.2cK     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r11.<init>(r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "syncd_app_state"
            boolean r0 = r6.equals(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            if (r0 == 0) goto L_0x08e5
            X.2cL r12 = new X.2cL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r12.<init>(r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x087b:
            java.lang.String r0 = "iq"
            X.1gQ r8 = new X.1gQ     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r8.<init>((java.lang.String) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1ks r3 = X.C34791ks.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "to"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((com.whatsapp.jid.Jid) r3, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r8.A02(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = "xmlns"
            java.lang.String r1 = "urn:xmpp:whatsapp:dirty"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r3, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r8.A02(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "clean"
            X.1gQ r7 = new X.1gQ     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r7.<init>((java.lang.String) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv r1 = r12.ADy()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r7.A05(r1, r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.List r3 = java.util.Collections.EMPTY_LIST     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r12.Aaf(r7, r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv r0 = r7.A01()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r8.A03(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv r1 = r11.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r8.A05(r1, r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r11.A00(r8, r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv r1 = r8.A01()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Gl r0 = r10.A0C     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.A04(r1, r9)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/clear-dirty; category="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r6)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            goto L_0x16c1
        L_0x08e5:
            X.2cN r12 = new X.2cN     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r12.<init>(r6, r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            goto L_0x087b
        L_0x08eb:
            java.lang.String r0 = "forceRefresh"
            boolean r3 = r4.getBoolean(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2CW r0 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r0 = r0.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.A09(r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/get-server-props"
            goto L_0x1786
        L_0x08fd:
            java.lang.String r13 = "lg"
            java.lang.String r12 = r4.getString(r13)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r11 = "lc"
            java.lang.String r19 = r4.getString(r11)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "userFeedback"
            java.lang.String r10 = r4.getString(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "deleteReason"
            int r18 = r4.getInt(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2CW r0 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r15 = r0.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            int r0 = r15.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r14 = 1
            int r0 = r0 + 1
            r15.A00 = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r9 = java.lang.Integer.toHexString(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.Map r1 = r15.A03     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r8 = 0
            com.whatsapp.protocol.IDxRHandlerShape97S0100000_2_I0 r0 = new com.whatsapp.protocol.IDxRHandlerShape97S0100000_2_I0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>(r15, r8)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.put(r9, r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r7 = 3
            r17 = 0
            r6 = 2
            if (r10 == 0) goto L_0x0940
            java.lang.String r5 = ""
            if (r12 != 0) goto L_0x093b
            r12 = r5
        L_0x093b:
            if (r19 == 0) goto L_0x0943
            r5 = r19
            goto L_0x0943
        L_0x0940:
            r5 = r17
            goto L_0x096d
        L_0x0943:
            java.lang.String r4 = "body"
            if (r18 < 0) goto L_0x09b6
            X.1lL[] r1 = new X.C35081lL[r7]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r13, (java.lang.String) r12)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1[r8] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r11, (java.lang.String) r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1[r14] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r11 = java.lang.Integer.toString(r18)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r5 = "reason"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r5, (java.lang.String) r11)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1[r6] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x0964:
            X.1Vv r0 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r4, (java.lang.String) r10, (X.C35081lL[]) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv[] r5 = new X.C28371Vv[r14]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5[r8] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x096d:
            java.lang.String r1 = "remove"
            X.1Vv r4 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = r17
            r4.<init>((java.lang.String) r1, (X.C35081lL[]) r0, (X.C28371Vv[]) r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 4
            X.1lL[] r5 = new X.C35081lL[r0]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1ks r10 = X.C34791ks.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "to"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((com.whatsapp.jid.Jid) r10, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5[r8] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r8 = "xmlns"
            java.lang.String r1 = "urn:xmpp:whatsapp:account"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r8, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5[r14] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r8 = "type"
            java.lang.String r1 = "get"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r8, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5[r6] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r3, (java.lang.String) r9)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5[r7] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "iq"
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((X.C28371Vv) r4, (java.lang.String) r0, (X.C35081lL[]) r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Gl r0 = r15.A0C     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.A04(r1, r14)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/remove-account"
            goto L_0x1786
        L_0x09b6:
            X.1lL[] r1 = new X.C35081lL[r6]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r13, (java.lang.String) r12)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1[r8] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r11, (java.lang.String) r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1[r14] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            goto L_0x0964
        L_0x09c7:
            java.lang.Object r4 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2cD r4 = (X.C51752cD) r4     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2CW r1 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r12 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r13 = r4.A03     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2cE r10 = r4.A01     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1um r11 = r4.A02     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2cF r9 = r4.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            int r1 = r12.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4 = 1
            int r1 = r1 + 1
            r12.A00 = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r7 = java.lang.Integer.toHexString(r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.Map r1 = r12.A03     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2cG r8 = new X.2cG     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.put(r7, r8)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r8 = "status"
            X.1Vv r5 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5.<init>((java.lang.String) r8, (java.lang.String) r13, (X.C35081lL[]) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 4
            X.1lL[] r6 = new X.C35081lL[r0]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL r1 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r3, (java.lang.String) r7)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 0
            r6[r0] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "xmlns"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r1, (java.lang.String) r8)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r6[r4] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = "type"
            java.lang.String r0 = "set"
            X.1lL r1 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r3, (java.lang.String) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 2
            r6[r0] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1ks r3 = X.C34791ks.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "to"
            X.1lL r1 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((com.whatsapp.jid.Jid) r3, (java.lang.String) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 3
            r6[r0] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "iq"
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((X.C28371Vv) r5, (java.lang.String) r0, (X.C35081lL[]) r6)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Gl r0 = r12.A0C     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.A04(r1, r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/status-update"
            goto L_0x1786
        L_0x0a35:
            java.lang.String r0 = "toJid"
            android.os.Parcelable r8 = r4.getParcelable(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            com.whatsapp.jid.Jid r8 = (com.whatsapp.jid.Jid) r8     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "msgId"
            java.lang.String r7 = r4.getString(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "isValid"
            boolean r6 = r4.getBoolean(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            long r3 = r4.getLong(r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1kL r5 = new X.1kL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5.<init>()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5.A01 = r8     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5.A07 = r7     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5.A00 = r3     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = "contacts"
            r5.A08 = r3     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "notification"
            r5.A05 = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1ci r10 = r5.A00()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r9 = "; msgId="
            java.lang.String r5 = "; isValid="
            X.2CW r0 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r11 = r0.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            if (r6 == 0) goto L_0x0a9d
            java.lang.String r0 = "in"
        L_0x0a71:
            X.1lL r1 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r3, (java.lang.String) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 1
            X.1lL[] r4 = new X.C35081lL[r0]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 0
            r4[r0] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3 = 0
            java.lang.String r1 = "sync"
            X.1Vv r0 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r1, (X.C35081lL[]) r4, (X.C28371Vv[]) r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r11.A08(r0, r10)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/contact-ack; toJid="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r8)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r9)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r7)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            goto L_0x0b17
        L_0x0a9d:
            java.lang.String r0 = "out"
            goto L_0x0a71
        L_0x0aa0:
            java.lang.String r0 = r4.getString(r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x0aa4:
            java.lang.Object r4 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            boolean r6 = r4.booleanValue()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2CW r1 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r9 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r8 = 1
            if (r0 != 0) goto L_0x0abd
            int r0 = r9.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            int r0 = r0 + 1
            r9.A00 = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = java.lang.Integer.toHexString(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x0abd:
            java.util.Map r4 = r9.A03     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2c4 r1 = new X.2c4     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>(r9, r6)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.put(r0, r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r10 = "passive"
            if (r6 == 0) goto L_0x0b1c
            java.lang.String r4 = "active"
        L_0x0acd:
            r1 = 0
            X.1Vv r7 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r7.<init>(r4, r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1 = 4
            X.1lL[] r5 = new X.C35081lL[r1]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4 = 0
            X.1lL r1 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r3, (java.lang.String) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5[r4] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "xmlns"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r1, (java.lang.String) r10)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5[r8] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4 = 2
            java.lang.String r3 = "type"
            java.lang.String r1 = "set"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r3, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5[r4] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4 = 3
            X.1ks r3 = X.C34791ks.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "to"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((com.whatsapp.jid.Jid) r3, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5[r4] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "iq"
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((X.C28371Vv) r7, (java.lang.String) r0, (X.C35081lL[]) r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Gl r0 = r9.A0C     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.A04(r1, r8)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/set-connection-active; active="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x0b17:
            r1.append(r6)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            goto L_0x16c1
        L_0x0b1c:
            r4 = r10
            goto L_0x0acd
        L_0x0b1e:
            java.lang.String r4 = "xmppmsg/send/changenumber"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.Object r4 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Gd r4 = (X.C46762Gd) r4     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r6 = r4.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2CW r1 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r15 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.List r1 = r4.A01     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r18 = r1
            int r1 = r15.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r14 = 1
            int r1 = r1 + 1
            r15.A00 = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r13 = java.lang.Integer.toHexString(r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.Map r5 = r15.A03     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4 = 5
            com.whatsapp.protocol.IDxRHandlerShape97S0100000_2_I0 r1 = new com.whatsapp.protocol.IDxRHandlerShape97S0100000_2_I0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>(r15, r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5.put(r13, r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "username"
            X.1Vv r12 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r12.<init>((java.lang.String) r1, (java.lang.String) r6, (X.C35081lL[]) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r11 = 2
            java.lang.String r10 = "modify"
            r17 = 0
            if (r18 == 0) goto L_0x0b88
            int r1 = r18.size()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            if (r1 <= 0) goto L_0x0b88
            int r1 = r18.size()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv[] r9 = new X.C28371Vv[r1]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r8 = 0
        L_0x0b64:
            int r1 = r18.size()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            if (r8 >= r1) goto L_0x0b8e
            X.1lL[] r5 = new X.C35081lL[r14]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1 = r18
            java.lang.Object r4 = r1.get(r8)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            com.whatsapp.jid.Jid r4 = (com.whatsapp.jid.Jid) r4     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL r1 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((com.whatsapp.jid.Jid) r4, (java.lang.String) r7)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5[r17] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r4 = "user"
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>(r4, r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r9[r8] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            int r8 = r8 + 1
            goto L_0x0b64
        L_0x0b88:
            X.1Vv r4 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.<init>((X.C28371Vv) r12, (java.lang.String) r10, (X.C35081lL[]) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            goto L_0x0ba0
        L_0x0b8e:
            java.lang.String r1 = "notify"
            X.1Vv r4 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.<init>((java.lang.String) r1, (X.C35081lL[]) r0, (X.C28371Vv[]) r9)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv[] r1 = new X.C28371Vv[r11]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1[r17] = r12     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1[r14] = r4     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv r4 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.<init>((java.lang.String) r10, (X.C35081lL[]) r0, (X.C28371Vv[]) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x0ba0:
            r0 = 4
            X.1lL[] r7 = new X.C35081lL[r0]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r3, (java.lang.String) r13)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r7[r17] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = "xmlns"
            java.lang.String r1 = "urn:xmpp:whatsapp:account"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r3, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r7[r14] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = "type"
            java.lang.String r1 = "get"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r3, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r7[r11] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5 = 3
            X.1ks r3 = X.C34791ks.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "to"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((com.whatsapp.jid.Jid) r3, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r7[r5] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "iq"
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((X.C28371Vv) r4, (java.lang.String) r0, (X.C35081lL[]) r7)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Gl r0 = r15.A0C     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.A04(r1, r14)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/change-number; oldChatUserId="
            goto L_0x0eb0
        L_0x0be1:
            java.lang.String r0 = "stanzaKey"
            android.os.Parcelable r3 = r4.getParcelable(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1ci r3 = (X.C30641ci) r3     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "disable"
            boolean r0 = r4.getBoolean(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.A02(r3, r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            return
        L_0x0bf4:
            android.os.Bundle r3 = r2.getData()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r4 = "subType"
            boolean r3 = r3.containsKey(r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            if (r3 == 0) goto L_0x0c4c
            android.os.Bundle r3 = r2.getData()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r12 = r3.getString(r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x0c09:
            android.os.Bundle r3 = r2.getData()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r4 = "errorCode"
            boolean r3 = r3.containsKey(r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            if (r3 == 0) goto L_0x0c21
            android.os.Bundle r0 = r2.getData()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            int r0 = r0.getInt(r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x0c21:
            java.lang.Object r4 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.0rv r4 = (X.C15830rv) r4     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            android.os.Bundle r3 = r2.getData()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r6 = r3.getString(r10)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            android.os.Bundle r3 = r2.getData()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            android.os.Parcelable r3 = r3.getParcelable(r9)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.0rv r3 = (X.C15830rv) r3     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2CW r1 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r1 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r13 = "structure-unavailable"
            r14 = 0
            r7 = r1
            r8 = r4
            r9 = r3
            r10 = r0
            r11 = r6
            r7.A04(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/message-received-structure-unavailable; message.key.id="
            goto L_0x0eb0
        L_0x0c4c:
            r12 = r0
            goto L_0x0c09
        L_0x0c4e:
            java.lang.String r21 = r4.getString(r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            android.os.Parcelable r11 = r4.getParcelable(r7)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            com.whatsapp.jid.Jid r11 = (com.whatsapp.jid.Jid) r11     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            android.os.Parcelable r0 = r4.getParcelable(r8)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r6 = r4.getString(r6)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r12 = "type"
            java.lang.String r10 = r4.getString(r12)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r7 = "registrationId"
            byte[] r9 = r4.getByteArray(r7)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r7 = "retry"
            byte r20 = r4.getByte(r7)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            long r4 = r4.getLong(r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2CW r1 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r14 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r19 = 1
            r18 = 2
            r1 = 2
            if (r9 != 0) goto L_0x0c86
            r1 = 1
        L_0x0c86:
            X.1Vv[] r13 = new X.C28371Vv[r1]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r8 = 3
            X.1lL[] r7 = new X.C35081lL[r8]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r15 = "call-id"
            X.1lL r1 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r15, (java.lang.String) r6)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r17 = 0
            r7[r17] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r15 = "call-creator"
            X.1lL r1 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((com.whatsapp.jid.Jid) r0, (java.lang.String) r15)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r7[r19] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r15 = java.lang.String.valueOf(r20)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "count"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r1, (java.lang.String) r15)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r7[r18] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "enc_rekey"
            X.1Vv r0 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>(r1, r7)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r13[r17] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            if (r9 == 0) goto L_0x0cc1
            r7 = 0
            java.lang.String r1 = "registration"
            X.1Vv r0 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r1, (byte[]) r9, (X.C35081lL[]) r7)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r13[r19] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x0cc1:
            if (r10 != 0) goto L_0x0cc4
            r8 = 2
        L_0x0cc4:
            X.1lL[] r7 = new X.C35081lL[r8]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "to"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((com.whatsapp.jid.Jid) r11, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r7[r17] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL r1 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = r21
            r1.<init>((java.lang.String) r3, (java.lang.String) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r7[r19] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            if (r10 == 0) goto L_0x0ce2
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r12, (java.lang.String) r10)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r7[r18] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x0ce2:
            java.lang.String r1 = "receipt"
            X.1Vv r0 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r1, (X.C35081lL[]) r7, (X.C28371Vv[]) r13)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r14.A07(r0, r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/call-rekey; callId="
            goto L_0x0eb0
        L_0x0cf1:
            java.lang.Object r6 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.0rv r6 = (X.C15830rv) r6     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            android.os.Bundle r3 = r2.getData()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r4 = r3.getString(r10)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            android.os.Bundle r3 = r2.getData()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            android.os.Parcelable r7 = r3.getParcelable(r9)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.0rv r7 = (X.C15830rv) r7     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2CW r1 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r5 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r11 = "hsm-envelope-mismatch"
            r10 = r0
            r12 = r0
            r8 = r0
            r9 = r4
            r5.A04(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/message-received-permanent-failure; message.key.id="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x0d1c:
            r1.append(r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            goto L_0x16c1
        L_0x0d21:
            java.lang.Object r8 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2cC r8 = (X.C51742cC) r8     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            com.whatsapp.protocol.VoipStanzaChildNode r10 = r8.A01     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r7 = r10.tag     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r12 = r8.A02     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r6 = "; id="
            java.lang.String r5 = r8.A03     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r4 = "; callId="
            X.2CW r0 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r9 = r0.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r11.<init>()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            com.whatsapp.jid.Jid r8 = r8.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "to"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((com.whatsapp.jid.Jid) r8, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r11.add(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r3, (java.lang.String) r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r11.add(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL[] r0 = X.C51542bq.A0D     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.Object[] r8 = r11.toArray(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL[] r8 = (X.C35081lL[]) r8     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv r1 = r10.toProtocolTreeNode()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "call"
            X.1Vv r3 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3.<init>((X.C28371Vv) r1, (java.lang.String) r0, (X.C35081lL[]) r8)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Gl r1 = r9.A0C     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 1
            r1.A04(r3, r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/call-stanza-"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r7)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r6)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            goto L_0x16be
        L_0x0d7e:
            java.lang.Object r6 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            com.whatsapp.jid.Jid r6 = (com.whatsapp.jid.Jid) r6     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2CW r0 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r5 = r0.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "presence"
            X.1gQ r4 = new X.1gQ     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.<init>((java.lang.String) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = "type"
            java.lang.String r1 = "probe"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r3, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.A02(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "to"
            boolean r0 = X.C32271fx.A0C(r6, r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            if (r0 == 0) goto L_0x0dab
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((com.whatsapp.jid.Jid) r6, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4.A02(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x0dab:
            X.1Vv r3 = r4.A01()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Gl r1 = r5.A0C     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 1
            r1.A04(r3, r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            return
        L_0x0db6:
            X.2CW r0 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r7 = r0.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            int r0 = r7.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r6 = 1
            int r0 = r0 + 1
            r7.A00 = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r9 = java.lang.Integer.toHexString(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.Map r1 = r7.A03     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r8 = 3
            com.whatsapp.protocol.IDxRHandlerShape97S0100000_2_I0 r0 = new com.whatsapp.protocol.IDxRHandlerShape97S0100000_2_I0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>(r7, r8)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.put(r9, r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL[] r10 = new X.C35081lL[r6]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r4 = "platform"
            java.lang.String r1 = "fbns"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r4, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1 = 0
            r10[r1] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "clear"
            X.1Vv r5 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5.<init>(r0, r10)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 4
            X.1lL[] r4 = new X.C35081lL[r0]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r3, (java.lang.String) r9)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4[r1] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = "xmlns"
            java.lang.String r1 = "urn:xmpp:whatsapp:push"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r3, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4[r6] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = "type"
            java.lang.String r0 = "set"
            X.1lL r1 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r3, (java.lang.String) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 2
            r4[r0] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1ks r3 = X.C34791ks.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "to"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((com.whatsapp.jid.Jid) r3, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4[r8] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "iq"
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((X.C28371Vv) r5, (java.lang.String) r0, (X.C35081lL[]) r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Gl r0 = r7.A0C     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.A04(r1, r6)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/clear_fbns_token;"
            goto L_0x1786
        L_0x0e27:
            java.lang.Object r4 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.0rv r4 = (X.C15830rv) r4     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            android.os.Bundle r3 = r2.getData()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r6 = r3.getString(r10)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2CW r1 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r7 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r13 = "order-status-update-failed"
            java.lang.String r14 = "invalid-transition"
            r10 = r0
            r12 = r0
            r8 = r4
            r9 = r0
            r11 = r6
            r7.A04(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/order-status-update-failure; message.key.id="
            goto L_0x0eb0
        L_0x0e47:
            java.lang.Object r9 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2QP r9 = (X.AnonymousClass2QP) r9     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = "id="
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5.<init>(r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String[] r7 = r9.A03     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3 = 0
            r3 = r7[r3]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5.append(r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = " count="
            r5.append(r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            int r3 = r7.length     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5.append(r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = " to="
            r5.append(r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.0rv r8 = r9.A01     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5.append(r8)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = " participant="
            r5.append(r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.0rv r4 = r9.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5.append(r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r6 = r5.toString()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2CW r1 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r5 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = r9.A02     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.AnonymousClass00B.A0J(r7)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1 = 0
            r1 = r7[r1]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL[] r4 = X.C51542bq.A00(r8, r4, r1, r0, r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            int r1 = r7.length     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 1
            if (r1 <= r0) goto L_0x0eba
            java.lang.Object[] r0 = java.util.Arrays.copyOfRange(r7, r0, r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv[] r1 = X.C51542bq.A02(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x0e99:
            boolean r0 = com.obwhatsapp.yo.yo.yoHidePlay()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            if (r0 == 0) goto L_0x0ea0
            return
        L_0x0ea0:
            java.lang.String r0 = "receipt"
            X.1Vv r3 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3.<init>((java.lang.String) r0, (X.C35081lL[]) r4, (X.C28371Vv[]) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Gl r1 = r5.A0C     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 1
            r1.A04(r3, r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/message-played; "
        L_0x0eb0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r6)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            goto L_0x16c1
        L_0x0eba:
            r1 = 0
            goto L_0x0e99
        L_0x0ebc:
            java.lang.Object r4 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2QW r4 = (X.AnonymousClass2QW) r4     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r13 = r4.A03     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r17 = " chatJid="
            X.0rv r12 = r4.A01     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r11 = " participant="
            X.0rv r14 = r4.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2CW r1 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r15 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.0rv r3 = r4.A02     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            byte[] r10 = r4.A05     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            byte[] r9 = r4.A06     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            boolean r1 = r4.A04     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r18 = r1
            java.lang.String r1 = "server-error"
            X.1lL[] r8 = X.C51542bq.A00(r3, r0, r13, r0, r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1 = 2
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r6.<init>(r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5 = 0
            if (r10 == 0) goto L_0x0f07
            X.1Vv[] r4 = new X.C28371Vv[r1]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = "enc_p"
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r3, (byte[]) r10, (X.C35081lL[]) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4[r5] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r10 = 1
            java.lang.String r3 = "enc_iv"
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r3, (byte[]) r9, (X.C35081lL[]) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r4[r10] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = "encrypt"
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r3, (X.C35081lL[]) r0, (X.C28371Vv[]) r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r6.add(r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x0f07:
            r0 = 3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3.<init>(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((com.whatsapp.jid.Jid) r12, (java.lang.String) r7)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3.add(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r4 = java.lang.String.valueOf(r18)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "from_me"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r1, (java.lang.String) r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3.add(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            if (r14 == 0) goto L_0x0f2f
            java.lang.String r1 = "participant"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((com.whatsapp.jid.Jid) r14, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3.add(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x0f2f:
            X.1lL[] r0 = X.C51542bq.A0D     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.Object[] r3 = r3.toArray(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1lL[] r3 = (X.C35081lL[]) r3     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "rmr"
            X.1Vv r0 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>(r1, r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r6.add(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv[] r0 = new X.C28371Vv[r5]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.Object[] r1 = r6.toArray(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv[] r1 = (X.C28371Vv[]) r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "receipt"
            X.1Vv r3 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3.<init>((java.lang.String) r0, (X.C35081lL[]) r8, (X.C28371Vv[]) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Gl r1 = r15.A0C     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 1
            r1.A04(r3, r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/message-md-media-error; id="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r13)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = r17
            r1.append(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r12)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r11)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            goto L_0x0fb1
        L_0x0f6e:
            X.1Vv r3 = r7.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5.A05(r3, r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.List r1 = java.util.Collections.EMPTY_LIST     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5.A07(r3, r1, r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0[r6] = r8     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3.<init>(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3.addAll(r6, r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2c7 r0 = r7.A01     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv r1 = r0.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5.A07(r1, r3, r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x0f9f:
            X.1Vv r3 = r5.A01()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Gl r1 = r4.A0C     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 1
            r1.A04(r3, r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/subscription-request; jid="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x0fb1:
            r1.append(r14)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            goto L_0x16c1
        L_0x0fb6:
            java.lang.Object r6 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1v9 r6 = (X.C41051v9) r6     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1kL r5 = new X.1kL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5.<init>()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "message"
            r5.A05 = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = r6.A04     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5.A07 = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            long r3 = r6.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5.A00 = r3     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            com.whatsapp.jid.Jid r0 = r6.A02     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5.A01 = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            com.whatsapp.jid.Jid r0 = r6.A01     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5.A02 = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = r6.A05     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r5.A08 = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = r6.A03     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            if (r0 != 0) goto L_0x0fe4
            java.lang.String r0 = "error"
            r5.A01(r0, r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x0fe4:
            X.2CW r0 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r3 = r0.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1ci r1 = r5.A00()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv r0 = r1.A01()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3.A08(r0, r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/send-message-ack"
            goto L_0x1786
        L_0x0ff8:
            java.lang.Object r9 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2QZ r9 = (X.AnonymousClass2QZ) r9     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r8 = r9.A03     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r7 = " to="
            X.0rv r6 = r9.A01     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r5 = " participant="
            X.0rv r4 = r9.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2CW r1 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r12 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = r9.A02     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            byte[] r14 = r9.A04     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            byte[] r9 = r9.A05     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "server-error"
            X.1lL[] r11 = X.C51542bq.A00(r6, r4, r8, r3, r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r10 = "receipt"
            if (r14 == 0) goto L_0x1061
            r1 = 2
            X.1Vv[] r13 = new X.C28371Vv[r1]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = "enc_p"
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r3, (byte[]) r14, (X.C35081lL[]) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r14 = 0
            r13[r14] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = "enc_iv"
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r3, (byte[]) r9, (X.C35081lL[]) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r9 = 1
            r13[r9] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = "encrypt"
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r3, (X.C35081lL[]) r0, (X.C28371Vv[]) r13)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv[] r0 = new X.C28371Vv[r9]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0[r14] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv r3 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3.<init>((java.lang.String) r10, (X.C35081lL[]) r11, (X.C28371Vv[]) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x1042:
            X.2Gl r1 = r12.A0C     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 1
            r1.A04(r3, r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/message-media-error; id="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r8)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r7)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r6)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            goto L_0x16c1
        L_0x1061:
            X.1Vv r3 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3.<init>(r10, r11)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            goto L_0x1042
        L_0x1067:
            java.lang.Object r0 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1ci r0 = (X.C30641ci) r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.A01(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            return
        L_0x106f:
            X.2CW r0 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r0 = r0.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.A03()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/active"
            goto L_0x1786
        L_0x107b:
            X.2CW r0 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r5 = r0.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r4 = "unavailable"
            java.lang.String r0 = "presence"
            X.1gQ r3 = new X.1gQ     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3.<init>((java.lang.String) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.ArrayList r1 = X.C51672c3.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "type"
            r3.A09(r4, r0, r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv r3 = r3.A01()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Gl r1 = r5.A0C     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 1
            r1.A04(r3, r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/inactive"
            goto L_0x1786
        L_0x10a0:
            java.lang.Object r0 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.0tZ r0 = (X.C16740tZ) r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.A00(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            return
        L_0x10a8:
            java.lang.Object r10 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.AnonymousClass00B.A06(r10)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2cQ r10 = (X.C51872cQ) r10     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2CW r3 = r1.A00     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r51 = r3
            X.2bw r4 = r3.A03     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.2bq r3 = r3.A00     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r50 = r3
            X.2Ca r9 = r4.A00     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.1Vw r8 = r10.A0C     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            com.whatsapp.jid.Jid r3 = r10.A06     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r32 = r3
            long r3 = r10.A03     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r17 = r3
            int r3 = r10.A02     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r31 = r3
            X.1ZT r3 = r10.A07     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r30 = r3
            com.whatsapp.jid.DeviceJid r3 = r10.A05     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r29 = r3
            com.whatsapp.jid.UserJid r3 = r10.A08     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r28 = r3
            java.lang.String r3 = r10.A0J     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r27 = r3
            java.lang.String r3 = r10.A0L     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r49 = r3
            java.lang.String r12 = r10.A0K     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.2EC r3 = r10.A0B     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r26 = r3
            X.1d1 r3 = r10.A0A     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r25 = r3
            java.util.Map r3 = r10.A0Q     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r48 = r3
            java.util.Map r11 = r10.A0S     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.util.List r3 = r10.A0O     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r23 = r3
            int r13 = r10.A01     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.util.List r3 = r10.A0P     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r24 = r3
            int r3 = r10.A00     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r22 = r3
            java.lang.Integer r3 = r10.A0G     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r41 = r3
            X.1Vt r7 = r10.A04     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.util.Map r3 = r10.A0R     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r47 = r3
            java.lang.Integer r3 = r10.A0H     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r21 = r3
            java.lang.String r3 = r10.A0I     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r46 = r3
            java.lang.String r3 = r10.A0N     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r45 = r3
            boolean r3 = r10.A0V     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r20 = r3
            X.1Vv r3 = r10.A0E     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r19 = r3
            X.1ta r6 = r10.A0D     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            boolean r3 = r10.A0T     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r43 = r3
            java.lang.String r3 = r10.A0M     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r36 = r3
            X.2cR r5 = r10.A09     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            boolean r3 = r10.A0U     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r44 = r3
            if (r25 != 0) goto L_0x114d
            if (r11 == 0) goto L_0x1133
            boolean r3 = r11.isEmpty()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r3 == 0) goto L_0x114d
        L_0x1133:
            boolean r3 = r47.isEmpty()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r3 == 0) goto L_0x114d
            X.0so r3 = r9.A00     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r15 = r3
            X.0rv r3 = r8.A00     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            int r3 = X.C18020w1.A04(r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.String r14 = java.lang.String.valueOf(r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.String r4 = "sendMessageEncrypted/empty_payload"
            r3 = 1
            r15.AcB(r4, r14, r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x114d:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r4.<init>()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3 = r13 & 64
            if (r3 == 0) goto L_0x1160
            java.lang.String r14 = "multicast"
            X.1Vv r3 = new X.1Vv     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.<init>(r14, r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r4.add(r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x1160:
            r3 = r13 & 4
            if (r3 == 0) goto L_0x116f
            java.lang.String r14 = "url_number"
            X.1Vv r3 = new X.1Vv     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.<init>(r14, r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r4.add(r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x116f:
            r3 = r13 & 2
            if (r3 == 0) goto L_0x117e
            java.lang.String r14 = "url_text"
            X.1Vv r3 = new X.1Vv     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.<init>(r14, r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r4.add(r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x117e:
            r3 = r13 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x118c
            java.lang.String r13 = "automated"
            X.1Vv r3 = new X.1Vv     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.<init>(r13, r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r4.add(r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x118c:
            if (r24 == 0) goto L_0x1193
            r3 = r24
            r4.addAll(r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x1193:
            boolean r3 = r47.isEmpty()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r3 == 0) goto L_0x1201
            if (r25 == 0) goto L_0x11da
            r33 = r25
            r34 = r41
            r35 = r12
            r37 = r31
            r38 = r43
            r39 = r44
            X.1Vv r3 = X.C454228o.A01(r33, r34, r35, r36, r37, r38, r39)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r4.add(r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3 = r32
            boolean r3 = r3 instanceof com.whatsapp.jid.UserJid     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r3 == 0) goto L_0x120c
            java.lang.String r3 = "url"
            boolean r3 = r3.equals(r12)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r3 == 0) goto L_0x11cc
            if (r5 == 0) goto L_0x11cc
            byte[] r14 = r5.A01     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.String r13 = "sender_content_binding"
            X.1Vv r3 = new X.1Vv     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.<init>((java.lang.String) r13, (byte[]) r14, (X.C35081lL[]) r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r4.add(r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x11cc:
            r3 = r32
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.1Vv r3 = X.C46022Ca.A01(r3, r5, r12)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r3 == 0) goto L_0x120c
            r4.add(r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            goto L_0x120c
        L_0x11da:
            r37 = 2
            java.lang.String r34 = "none"
            r33 = r41
            r35 = r12
            r38 = r31
            r39 = r43
            r40 = r44
            java.util.List r13 = X.C454228o.A03(r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.1lL[] r3 = X.C454228o.A00     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.Object[] r14 = r13.toArray(r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.1lL[] r14 = (X.C35081lL[]) r14     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.String r13 = "enc"
            X.1Vv r3 = new X.1Vv     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.<init>(r13, r14)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r4.add(r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r42 = 1
            goto L_0x120e
        L_0x1201:
            if (r11 != 0) goto L_0x1206
            r13 = 1
            if (r23 == 0) goto L_0x1207
        L_0x1206:
            r13 = 0
        L_0x1207:
            java.lang.String r3 = "Message fanout is only supported for 1:1 chat"
            X.AnonymousClass00B.A0D(r3, r13)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x120c:
            r42 = 0
        L_0x120e:
            if (r19 == 0) goto L_0x1215
            r3 = r19
            r4.add(r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x1215:
            if (r7 == 0) goto L_0x125a
            X.0wS r13 = r9.A04     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.String r3 = r7.A0G     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.1Vx r14 = r13.A02(r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3 = 0
            if (r14 == 0) goto L_0x1258
            java.lang.String r13 = r7.A0I     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.19r r14 = r14.AEp(r13)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x1228:
            X.1lL[] r13 = X.C46022Ca.A06     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r14 == 0) goto L_0x124d
            java.util.List r15 = r14.AEM(r7, r8)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r15 == 0) goto L_0x1238
            java.lang.Object[] r13 = r15.toArray(r13)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.1lL[] r13 = (X.C35081lL[]) r13     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x1238:
            java.util.List r7 = r14.AEL(r7, r8)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r7 == 0) goto L_0x124d
            boolean r14 = r7.isEmpty()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r14 != 0) goto L_0x124d
            r3 = 0
            X.1Vv[] r3 = new X.C28371Vv[r3]     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.Object[] r3 = r7.toArray(r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.1Vv[] r3 = (X.C28371Vv[]) r3     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x124d:
            java.lang.String r14 = "pay"
            X.1Vv r7 = new X.1Vv     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r7.<init>((java.lang.String) r14, (X.C35081lL[]) r13, (X.C28371Vv[]) r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r4.add(r7)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            goto L_0x125a
        L_0x1258:
            r14 = r0
            goto L_0x1228
        L_0x125a:
            if (r6 == 0) goto L_0x12a3
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r13.<init>()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            int r3 = r6.actualActors     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.String r14 = java.lang.Integer.toString(r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.String r7 = "actual_actors"
            X.1lL r3 = new X.1lL     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.<init>((java.lang.String) r7, (java.lang.String) r14)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r13.add(r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            int r3 = r6.hostStorage     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.String r14 = java.lang.Integer.toString(r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.String r7 = "host_storage"
            X.1lL r3 = new X.1lL     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.<init>((java.lang.String) r7, (java.lang.String) r14)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r13.add(r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            long r6 = r6.privacyModeTs     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.String r7 = java.lang.Long.toString(r6)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.String r6 = "privacy_mode_ts"
            X.1lL r3 = new X.1lL     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.<init>((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r13.add(r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.1lL[] r3 = X.C46022Ca.A06     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.Object[] r7 = r13.toArray(r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.1lL[] r7 = (X.C35081lL[]) r7     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.String r6 = "biz"
            X.1Vv r3 = new X.1Vv     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.<init>(r6, r7)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r4.add(r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x12a3:
            r33 = r5
            r34 = r41
            r35 = r12
            r37 = r23
            r38 = r48
            r39 = r11
            r40 = r47
            r41 = r31
            java.util.List r6 = X.C46022Ca.A02(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            boolean r3 = r6.isEmpty()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r13 = 0
            if (r3 != 0) goto L_0x12ee
            X.1Vv[] r3 = new X.C28371Vv[r13]     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.Object[] r7 = r6.toArray(r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.1Vv[] r7 = (X.C28371Vv[]) r7     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.String r6 = "participants"
            X.1Vv r3 = new X.1Vv     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.<init>((java.lang.String) r6, (X.C35081lL[]) r0, (X.C28371Vv[]) r7)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r4.add(r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            int r3 = r47.size()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r3 <= 0) goto L_0x12ee
            java.lang.String r3 = "url"
            boolean r3 = r3.equals(r12)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r3 == 0) goto L_0x12ee
            if (r5 == 0) goto L_0x12ee
            byte[] r6 = r5.A01     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.String r5 = "sender_content_binding"
            X.1Vv r3 = new X.1Vv     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.<init>((java.lang.String) r5, (byte[]) r6, (X.C35081lL[]) r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r4.add(r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x12ee:
            X.2CZ r5 = r9.A02     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.0sK r3 = r5.A00     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            boolean r3 = r3.A0G()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r3 == 0) goto L_0x132f
            if (r25 == 0) goto L_0x1301
            r3 = r25
            int r6 = r3.A00     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3 = 1
            if (r6 == r3) goto L_0x131c
        L_0x1301:
            if (r11 == 0) goto L_0x1335
            java.util.Collection r3 = r11.values()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.util.Iterator r7 = r3.iterator()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x130b:
            boolean r3 = r7.hasNext()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r3 == 0) goto L_0x1335
            java.lang.Object r3 = r7.next()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.1d1 r3 = (X.C30821d1) r3     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            int r6 = r3.A00     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3 = 1
            if (r6 != r3) goto L_0x130b
        L_0x131c:
            X.11R r3 = r5.A01     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            byte[] r6 = r3.A03()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.AnonymousClass00B.A06(r6)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.String r5 = "device-identity"
            X.1Vv r3 = new X.1Vv     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.<init>((java.lang.String) r5, (byte[]) r6, (X.C35081lL[]) r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r4.add(r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x132f:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.<init>()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            goto L_0x134f
        L_0x1335:
            java.util.Collection r3 = r47.values()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.util.Iterator r7 = r3.iterator()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x133d:
            boolean r3 = r7.hasNext()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r3 == 0) goto L_0x132f
            java.lang.Object r3 = r7.next()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.1d1 r3 = (X.C30821d1) r3     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            int r6 = r3.A00     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3 = 1
            if (r6 != r3) goto L_0x133d
            goto L_0x131c
        L_0x134f:
            r5 = 0
            int r0 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x1368
            r5 = 1000(0x3e8, double:4.94E-321)
            long r17 = r17 / r5
            java.lang.String r6 = java.lang.String.valueOf(r17)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.String r5 = "t"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r0.<init>((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.add(r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x1368:
            boolean r0 = r8.A02     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r0 != 0) goto L_0x1375
            r5 = 8
            r0 = r22
            if (r0 == r5) goto L_0x1375
            java.lang.String r6 = "from"
            goto L_0x1378
        L_0x1375:
            java.lang.String r6 = "to"
        L_0x1378:
            X.AnonymousClass00B.A06(r32)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.1lL r5 = new X.1lL     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r0 = r32
            r5.<init>((com.whatsapp.jid.Jid) r0, (java.lang.String) r6)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.add(r5)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.String r6 = "type"
            X.1lL r5 = new X.1lL     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r0 = r49
            r5.<init>((java.lang.String) r6, (java.lang.String) r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.add(r5)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.String r6 = r8.A01     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.String r5 = "id"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r0.<init>((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.add(r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r27 == 0) goto L_0x13ac
            java.lang.String r6 = "phash"
            X.1lL r5 = new X.1lL     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r0 = r27
            r5.<init>((java.lang.String) r6, (java.lang.String) r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.add(r5)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x13ac:
            if (r29 == 0) goto L_0x13ba
            java.lang.String r6 = "participant"
            X.1lL r5 = new X.1lL     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r0 = r29
            r5.<init>((com.whatsapp.jid.Jid) r0, (java.lang.String) r6)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.add(r5)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x13ba:
            if (r28 == 0) goto L_0x13c8
            java.lang.String r6 = "recipient"
            X.1lL r5 = new X.1lL     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r0 = r28
            r5.<init>((com.whatsapp.jid.Jid) r0, (java.lang.String) r6)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.add(r5)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x13c8:
            if (r30 == 0) goto L_0x13d6
            java.lang.String r6 = "recipient_pn"
            X.1lL r5 = new X.1lL     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r0 = r30
            r5.<init>((com.whatsapp.jid.Jid) r0, (java.lang.String) r6)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.add(r5)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x13d6:
            if (r26 == 0) goto L_0x13f9
            X.2EC r5 = X.AnonymousClass2EC.NONE     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r0 = r26
            if (r0 == r5) goto L_0x13f9
            int r0 = r26.ordinal()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            switch(r0) {
                case 1: goto L_0x13f3;
                case 2: goto L_0x13f6;
                case 3: goto L_0x13f6;
                default: goto L_0x13e5;
            }     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x13e5:
            java.lang.String r6 = "none"
        L_0x13e7:
            java.lang.String r5 = "web"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r0.<init>((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.add(r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            goto L_0x13f9
        L_0x13f3:
            java.lang.String r6 = "invis"
            goto L_0x13e7
        L_0x13f6:
            java.lang.String r6 = "relay"
            goto L_0x13e7
        L_0x13f9:
            if (r22 == 0) goto L_0x1409
            java.lang.String r6 = java.lang.Integer.toString(r22)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.String r5 = "edit"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r0.<init>((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.add(r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x1409:
            if (r21 == 0) goto L_0x142a
            int r6 = r21.intValue()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r6 <= 0) goto L_0x142a
            if (r31 != 0) goto L_0x142a
            r5 = 8
            r0 = r22
            if (r0 == r5) goto L_0x142a
            r5 = 7
            if (r0 == r5) goto L_0x142a
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.String r5 = "expiration"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r0.<init>((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.add(r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x142a:
            boolean r0 = android.text.TextUtils.isEmpty(r46)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r0 != 0) goto L_0x143c
            java.lang.String r6 = "category"
            X.1lL r5 = new X.1lL     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r0 = r46
            r5.<init>((java.lang.String) r6, (java.lang.String) r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.add(r5)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x143c:
            boolean r0 = android.text.TextUtils.isEmpty(r45)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r0 != 0) goto L_0x144e
            java.lang.String r6 = "push_priority"
            X.1lL r5 = new X.1lL     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r0 = r45
            r5.<init>((java.lang.String) r6, (java.lang.String) r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.add(r5)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x144e:
            if (r20 == 0) goto L_0x145c
            java.lang.String r6 = "device_fanout"
            java.lang.String r5 = "false"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r0.<init>((java.lang.String) r6, (java.lang.String) r5)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.add(r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x145c:
            X.1lL[] r0 = X.C46022Ca.A06     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.Object[] r5 = r3.toArray(r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.1lL[] r5 = (X.C35081lL[]) r5     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.1Vv[] r0 = new X.C28371Vv[r13]     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.Object[] r3 = r4.toArray(r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.1Vv[] r3 = (X.C28371Vv[]) r3     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.String r0 = "message"
            X.1Vv r4 = new X.1Vv     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r4.<init>((java.lang.String) r0, (X.C35081lL[]) r5, (X.C28371Vv[]) r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r0 = r50
            X.2Gl r3 = r0.A0C     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r0 = 1
            r3.A04(r4, r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r13 = 13
            if (r12 != 0) goto L_0x148d
            r13 = 0
        L_0x1480:
            if (r31 != 0) goto L_0x160a
            r3 = 8
            r0 = r22
            if (r0 == r3) goto L_0x15c8
            r3 = 7
            if (r0 == r3) goto L_0x15c8
            goto L_0x1513
        L_0x148d:
            int r0 = r12.hashCode()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            switch(r0) {
                case -1890252483: goto L_0x1505;
                case -1183699191: goto L_0x14fc;
                case -622287711: goto L_0x14f3;
                case -309474065: goto L_0x14ea;
                case 102340: goto L_0x14e3;
                case 93166550: goto L_0x14db;
                case 100313435: goto L_0x14d3;
                case 106006350: goto L_0x14ca;
                case 112021638: goto L_0x14c1;
                case 112202875: goto L_0x14b8;
                case 555704345: goto L_0x14af;
                case 861720859: goto L_0x14a6;
                case 943481210: goto L_0x149d;
                case 1901043637: goto L_0x1495;
                default: goto L_0x1494;
            }     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x1494:
            goto L_0x1510
        L_0x1495:
            java.lang.String r0 = "location"
            boolean r0 = r12.equals(r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r13 = 5
            goto L_0x150e
        L_0x149d:
            java.lang.String r0 = "contact_array"
            boolean r0 = r12.equals(r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r13 = 14
            goto L_0x150e
        L_0x14a6:
            java.lang.String r0 = "document"
            boolean r0 = r12.equals(r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r13 = 9
            goto L_0x150e
        L_0x14af:
            java.lang.String r0 = "catalog"
            boolean r0 = r12.equals(r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r13 = 37
            goto L_0x150e
        L_0x14b8:
            java.lang.String r0 = "video"
            boolean r0 = r12.equals(r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r13 = 3
            goto L_0x150e
        L_0x14c1:
            java.lang.String r0 = "vcard"
            boolean r0 = r12.equals(r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r13 = 4
            goto L_0x150e
        L_0x14ca:
            java.lang.String r0 = "order"
            boolean r0 = r12.equals(r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r13 = 44
            goto L_0x150e
        L_0x14d3:
            java.lang.String r0 = "image"
            boolean r0 = r12.equals(r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r13 = 1
            goto L_0x150e
        L_0x14db:
            java.lang.String r0 = "audio"
            boolean r0 = r12.equals(r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r13 = 2
            goto L_0x150e
        L_0x14e3:
            java.lang.String r0 = "gif"
            boolean r0 = r12.equals(r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            goto L_0x150e
        L_0x14ea:
            java.lang.String r0 = "product"
            boolean r0 = r12.equals(r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r13 = 23
            goto L_0x150e
        L_0x14f3:
            java.lang.String r0 = "livelocation"
            boolean r0 = r12.equals(r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r13 = 16
            goto L_0x150e
        L_0x14fc:
            java.lang.String r0 = "invite"
            boolean r0 = r12.equals(r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r13 = 24
            goto L_0x150e
        L_0x1505:
            java.lang.String r0 = "sticker"
            boolean r0 = r12.equals(r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r13 = 20
        L_0x150e:
            if (r0 != 0) goto L_0x1480
        L_0x1510:
            r13 = -1
            goto L_0x1480
        L_0x1513:
            X.0ua r7 = r9.A01     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.0rv r6 = r8.A00     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.String r0 = "pay"
            boolean r12 = r0.equals(r12)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            boolean r5 = X.C16030sJ.A0Q(r6)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r5 == 0) goto L_0x1525
            r4 = 3
            goto L_0x1529
        L_0x1525:
            r4 = 2
            if (r13 != 0) goto L_0x1529
            r4 = 1
        L_0x1529:
            X.1Zo r3 = r7.A00     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r0 = 0
            if (r3 == 0) goto L_0x152f
            r0 = 1
        L_0x152f:
            X.AnonymousClass00B.A0G(r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r0 = 6
            android.os.Message r0 = android.os.Message.obtain(r3, r0, r4, r12)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r0.sendToTarget()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r7.A02()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r5 != 0) goto L_0x160a
            boolean r0 = X.C16030sJ.A0G(r6)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r0 == 0) goto L_0x159a
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r5.<init>()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r11 == 0) goto L_0x1559
            X.0so r3 = r9.A00     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.util.Set r0 = r11.keySet()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.util.Set r0 = X.C16030sJ.A0A(r3, r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r5.addAll(r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x1559:
            if (r23 == 0) goto L_0x156a
            X.0so r4 = r9.A00     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3.<init>()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r0 = r23
            X.C16030sJ.A0C(r4, r0, r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r5.addAll(r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x156a:
            X.159 r0 = r9.A03     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r7.<init>(r5)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.Iterable r0 = r0.A01()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x1579:
            boolean r0 = r6.hasNext()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r0 == 0) goto L_0x160a
            java.lang.Object r5 = r6.next()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.1dF r5 = (X.C30961dF) r5     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            boolean r0 = r5 instanceof X.AnonymousClass2D3     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r0 == 0) goto L_0x1579
            X.2D3 r5 = (X.AnonymousClass2D3) r5     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.15I r0 = r5.A00     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.1WA r4 = r0.A0Z     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3 = 41
            com.facebook.redex.RunnableRunnableShape0S0300000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0300000_I0     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r0.<init>(r5, r7, r8, r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r4.execute(r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            goto L_0x1579
        L_0x159a:
            X.159 r0 = r9.A03     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.AnonymousClass00B.A06(r6)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.Iterable r0 = r0.A01()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x15a7:
            boolean r0 = r7.hasNext()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r0 == 0) goto L_0x160a
            java.lang.Object r5 = r7.next()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.1dF r5 = (X.C30961dF) r5     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            boolean r0 = r5 instanceof X.AnonymousClass2D3     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r0 == 0) goto L_0x15a7
            X.2D3 r5 = (X.AnonymousClass2D3) r5     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.15I r0 = r5.A00     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.1WA r4 = r0.A0Z     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3 = 38
            com.facebook.redex.RunnableRunnableShape0S0300000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0300000_I0     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r0.<init>(r5, r6, r8, r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r4.execute(r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            goto L_0x15a7
        L_0x15c8:
            X.0rv r7 = r8.A00     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            boolean r0 = X.C16030sJ.A0Q(r7)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r0 != 0) goto L_0x160a
            boolean r0 = X.C16030sJ.A0G(r7)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r0 != 0) goto L_0x160a
            X.159 r0 = r9.A03     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.AnonymousClass00B.A06(r7)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.Iterable r0 = r0.A01()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
        L_0x15e3:
            boolean r0 = r6.hasNext()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r0 == 0) goto L_0x160a
            java.lang.Object r5 = r6.next()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.1dF r5 = (X.C30961dF) r5     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            boolean r0 = r5 instanceof X.AnonymousClass2D3     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r0 == 0) goto L_0x15e3
            X.2D3 r5 = (X.AnonymousClass2D3) r5     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            X.15I r3 = r5.A00     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            boolean r0 = X.AnonymousClass15I.A02(r3, r8)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            if (r0 == 0) goto L_0x15e3
            X.1WA r4 = r3.A0Z     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r3 = 40
            com.facebook.redex.RunnableRunnableShape0S0300000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0300000_I0     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r0.<init>(r5, r7, r8, r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r4.execute(r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            goto L_0x15e3
        L_0x160a:
            java.lang.String r3 = "xmpp/writer/write/message-encrypted; "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r0.<init>(r3)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r0.append(r10)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            java.lang.String r0 = r0.toString()     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 2Pf -> 0x162b, IOException -> 0x178a }
            r0 = r51
            X.2bu r1 = r0.A04     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            android.os.Handler r1 = (android.os.Handler) r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 2
            android.os.Message r0 = r1.obtainMessage(r0, r8)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.sendToTarget()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            return
        L_0x162b:
            r5 = move-exception
            X.2CW r0 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bu r0 = r0.A04     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1ci r6 = r10.A0F     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            int r4 = r5.excessPayloadByteSize     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bt r0 = (X.C51572bt) r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1vi r0 = r0.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1CP r0 = r0.A0l     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1CO r3 = r0.A07     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "received message too large error; stanzaKey="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>(r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.append(r6)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = r0.toString()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.util.Map r1 = r3.A02     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            monitor-enter(r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.Object r3 = r1.remove(r6)     // Catch:{ all -> 0x1664 }
            X.1kE r3 = (X.C34421kE) r3     // Catch:{ all -> 0x1664 }
            monitor-exit(r1)     // Catch:{ all -> 0x1664 }
            if (r3 == 0) goto L_0x1663
            java.lang.String r1 = "Message payload too big"
            X.2Pf r0 = new X.2Pf     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>(r1, r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3.A01(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x1663:
            throw r5     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x1664:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x1664 }
            throw r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x1667:
            int r4 = X.C34501kN.A00(r2)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.Object r3 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv r3 = (X.C28371Vv) r3     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2CW r0 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r0 = r0.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Gl r1 = r0.A0C     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 1
            goto L_0x1686
        L_0x1677:
            int r4 = X.C34501kN.A00(r2)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.Object r3 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv r3 = (X.C28371Vv) r3     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2CW r0 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r0 = r0.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Gl r1 = r0.A0C     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 3
        L_0x1686:
            r1.A04(r3, r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/type="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            goto L_0x16c1
        L_0x1695:
            java.lang.String r11 = r4.getString(r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            android.os.Parcelable r9 = r4.getParcelable(r7)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            com.whatsapp.jid.DeviceJid r9 = (com.whatsapp.jid.DeviceJid) r9     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            android.os.Parcelable r10 = r4.getParcelable(r8)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            com.whatsapp.jid.DeviceJid r10 = (com.whatsapp.jid.DeviceJid) r10     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r12 = r4.getString(r6)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            long r14 = r4.getLong(r5)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2CW r0 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r8 = r0.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r13 = "reject"
            r8.A06(r9, r10, r11, r12, r13, r14)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/call-reject-receipt; callId="
        L_0x16b9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x16be:
            r1.append(r12)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x16c1:
            java.lang.String r0 = r1.toString()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            goto L_0x1786
        L_0x16c7:
            java.lang.Object r6 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2CW r0 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r4 = r0.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r5 = "available"
            java.lang.String r0 = "presence"
            X.1gQ r3 = new X.1gQ     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3.<init>((java.lang.String) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            if (r6 == 0) goto L_0x16f2
            r11 = 1
            r7 = 0
            r9 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            boolean r0 = X.C32271fx.A0D(r6, r7, r9, r11)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            if (r0 == 0) goto L_0x16f2
            java.lang.String r1 = "name"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((java.lang.String) r1, (java.lang.String) r6)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3.A02(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x16f2:
            java.util.ArrayList r1 = X.C51672c3.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "type"
            r3.A09(r5, r0, r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vv r3 = r3.A01()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Gl r1 = r4.A0C     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 1
            r1.A04(r3, r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/push-name"
            goto L_0x1786
        L_0x1708:
            X.2CW r0 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r5 = r0.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 2
            X.1lL[] r4 = new X.C35081lL[r0]     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r3 = "type"
            java.lang.String r0 = "result"
            X.1lL r1 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>((java.lang.String) r3, (java.lang.String) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0 = 0
            r4[r0] = r1     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1ks r3 = X.C34791ks.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r1 = "to"
            X.1lL r0 = new X.1lL     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.<init>((com.whatsapp.jid.Jid) r3, (java.lang.String) r1)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r3 = 1
            r4[r3] = r0     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "iq"
            X.1Vv r1 = new X.1Vv     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>(r0, r4)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2Gl r0 = r5.A0C     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r0.A04(r1, r3)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/pong"
            goto L_0x1786
        L_0x173a:
            java.lang.Object r9 = r2.obj     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2QK r9 = (X.AnonymousClass2QK) r9     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.1Vw r10 = r9.A04     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2CW r1 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.2bq r8 = r1.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            X.0rv r7 = r9.A02     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            com.whatsapp.jid.DeviceJid r6 = r9.A03     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r5 = r9.A05     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String[] r1 = r9.A01     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            long r3 = r9.A00     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r20 = r0
            r21 = r10
            r22 = r5
            r23 = r1
            r24 = r3
            r17 = r8
            r18 = r7
            r19 = r6
            r17.A05(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = "xmpp/writer/write/messages-read; message.key="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.<init>(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r10)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = " participant="
            r1.append(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            r1.append(r7)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = " extraIds="
            r1.append(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String[] r0 = r9.A01     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = java.util.Arrays.deepToString(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x177f:
            r1.append(r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            java.lang.String r0 = r1.toString()     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
        L_0x1786:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 2Pf -> 0x17af, IOException -> 0x178a }
            return
        L_0x178a:
            r1 = move-exception
            java.lang.String r0 = "unknown I/O error writing to the chat connection"
            com.whatsapp.util.Log.e(r0, r1)
            r3 = 1
            r0 = r52
            r0.A01 = r3
            android.os.Handler r1 = r2.getTarget()
            android.os.Message r0 = android.os.Message.obtain(r2)
            r1.sendMessageAtFrontOfQueue(r0)
            r0 = r52
            X.2bq r1 = r0.A00
            r0 = r16
            android.os.Message r0 = r0.obtainMessage(r3, r1)
            r0.sendToTarget()
            return
        L_0x17af:
            r1 = move-exception
            java.lang.String r0 = "tried to write too large of a buffer to the chat connection"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x17b7:
            X.1kF r1 = r0.A09     // Catch:{ all -> 0x17c3 }
            r0 = 5
            android.os.Message r0 = r1.obtainMessage(r0, r3)     // Catch:{ all -> 0x17c3 }
            r0.sendToTarget()     // Catch:{ all -> 0x17c3 }
            monitor-exit(r2)     // Catch:{ all -> 0x17c3 }
            return
        L_0x17c3:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x17c3 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2CW.A00(android.os.Message):void");
    }

    public void onLooperPrepared() {
        ((Handler) this.A04).obtainMessage(0, new AnonymousClass2CV(getLooper(), this)).sendToTarget();
    }
}

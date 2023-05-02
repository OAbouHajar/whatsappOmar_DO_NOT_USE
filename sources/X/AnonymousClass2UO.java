package X;

import com.facebook.redex.RunnableRunnableShape0S0101000_I0;
import com.facebook.redex.RunnableRunnableShape6S0100000_I0_5;
import com.whatsapp.util.Log;

/* renamed from: X.2UO  reason: invalid class name */
public class AnonymousClass2UO implements C19550yc {
    public AnonymousClass4M6 A00;
    public AnonymousClass27J A01;
    public boolean A02 = true;
    public boolean A03;
    public final C16300so A04;
    public final C14870pt A05;
    public final AnonymousClass2UP A06;
    public final C16440t3 A07;
    public final C17190ug A08;

    public AnonymousClass2UO(C16300so r2, C14870pt r3, AnonymousClass2UP r4, C16440t3 r5, C17190ug r6) {
        this.A07 = r5;
        this.A05 = r3;
        this.A04 = r2;
        this.A08 = r6;
        this.A06 = r4;
    }

    public void APb(String str) {
        Log.i("devicePairRequest/onDeliveryFailure");
        this.A05.Acq(new RunnableRunnableShape6S0100000_I0_5(this, 9));
    }

    public void AQe(C28371Vv r5, String str) {
        int A002 = C34451kH.A00(r5);
        StringBuilder sb = new StringBuilder("devicePairRequest/onError :");
        sb.append(A002);
        Log.i(sb.toString());
        this.A05.Acq(new RunnableRunnableShape0S0101000_I0((Object) this, A002, 11));
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009e  */
    public void AYG(X.C28371Vv r21, java.lang.String r22) {
        /*
            r20 = this;
            java.lang.String r0 = "devicePairRequest/onSuccess"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3 = r20
            X.0so r4 = r3.A04
            r7 = 0
            r5 = r21
            if (r21 == 0) goto L_0x00bb
            java.lang.String r0 = "type"
            java.lang.String r1 = r5.A0N(r0, r7)
            java.lang.String r0 = "result"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00bb
            java.lang.String r0 = "device"
            X.1Vv r2 = r5.A0J(r0)
            if (r2 == 0) goto L_0x00bb
            java.lang.Class<com.whatsapp.jid.DeviceJid> r1 = com.whatsapp.jid.DeviceJid.class
            java.lang.String r0 = "jid"
            com.whatsapp.jid.Jid r8 = r2.A0F(r4, r1, r0)
            com.whatsapp.jid.DeviceJid r8 = (com.whatsapp.jid.DeviceJid) r8
            if (r8 == 0) goto L_0x00bb
            java.lang.String r0 = "companion-props"
            X.1Vv r0 = r5.A0J(r0)
            if (r0 == 0) goto L_0x004c
            byte[] r1 = r0.A01     // Catch:{ 1bD -> 0x0047 }
            X.2go r0 = X.C54102go.A06     // Catch:{ 1bD -> 0x0047 }
            X.1Wm r2 = X.C28541Wm.A0E(r0, r1)     // Catch:{ 1bD -> 0x0047 }
            X.2go r2 = (X.C54102go) r2     // Catch:{ 1bD -> 0x0047 }
            if (r2 == 0) goto L_0x0056
            goto L_0x004e
        L_0x0047:
            java.lang.String r0 = "DevicePairRequestProtocolHelper/parseDeviceInfo/failed to parse companion props"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x004c:
            r2 = r7
            goto L_0x0056
        L_0x004e:
            int r0 = r2.A01
            X.1p8 r9 = X.C37421p8.A00(r0)
            if (r9 != 0) goto L_0x0058
        L_0x0056:
            X.1p8 r9 = X.C37421p8.A0E
        L_0x0058:
            X.0t3 r0 = r3.A07
            long r13 = r0.A00()
            if (r2 == 0) goto L_0x009e
            java.lang.String r10 = r2.A04
        L_0x0062:
            r17 = 0
            X.27J r0 = r3.A01
            if (r0 == 0) goto L_0x009c
            int r12 = r0.A01
        L_0x006a:
            if (r2 == 0) goto L_0x0072
            boolean r0 = r2.A05
            r19 = 1
            if (r0 != 0) goto L_0x0074
        L_0x0072:
            r19 = 0
        L_0x0074:
            r11 = 0
            if (r2 == 0) goto L_0x008a
            int r0 = r2.A00
            r1 = 16
            r0 = r0 & 16
            if (r0 != r1) goto L_0x008a
            X.2tf r0 = r2.A03
            if (r0 != 0) goto L_0x0085
            X.2tf r0 = X.C58542tf.A04
        L_0x0085:
            X.1cN r7 = new X.1cN
            r7.<init>(r0)
        L_0x008a:
            X.1WN r6 = new X.1WN
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r15, r17, r19)
            X.2UP r0 = r3.A06
            com.whatsapp.jid.DeviceJid r5 = r6.A06
            X.2Ui r0 = r0.A00
            X.0yO r4 = r0.A0E
            java.lang.Object r2 = r4.A0O
            monitor-enter(r2)
            goto L_0x00a0
        L_0x009c:
            r12 = 0
            goto L_0x006a
        L_0x009e:
            r10 = r7
            goto L_0x0062
        L_0x00a0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b8 }
            r1.<init>()     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = "companion-device-manager/onDeviceReceived: "
            r1.append(r0)     // Catch:{ all -> 0x00b8 }
            r1.append(r5)     // Catch:{ all -> 0x00b8 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00b8 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00b8 }
            r4.A01 = r5     // Catch:{ all -> 0x00b8 }
            monitor-exit(r2)     // Catch:{ all -> 0x00b8 }
            goto L_0x0102
        L_0x00b8:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b8 }
            throw r0
        L_0x00bb:
            r6 = r7
            X.4M6 r0 = r3.A00
            if (r0 == 0) goto L_0x0102
            boolean r0 = r3.A03
            if (r0 != 0) goto L_0x0102
            r0 = -1
            if (r21 == 0) goto L_0x0102
            java.lang.String r2 = "type"
            java.lang.String r4 = r5.A0N(r2, r7)
            java.lang.String r2 = "result"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0102
            java.lang.String r2 = "retry-ts"
            X.1Vv r4 = r5.A0J(r2)
            if (r4 == 0) goto L_0x0102
            java.lang.String r2 = "ts"
            java.lang.String r4 = r4.A0N(r2, r7)
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 != 0) goto L_0x0102
            long r4 = X.C29501aj.A01(r4, r0)
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0102
            X.0pt r2 = r3.A05
            r1 = 0
            com.facebook.redex.RunnableRunnableShape0S0100100_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0100100_I0
            r0.<init>(r3, r4, r1)
            r2.Acq(r0)
            return
        L_0x0102:
            X.0pt r2 = r3.A05
            r1 = 17
            com.facebook.redex.RunnableRunnableShape4S0200000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape4S0200000_I0_2
            r0.<init>(r3, r1, r6)
            r2.Acq(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2UO.AYG(X.1Vv, java.lang.String):void");
    }
}

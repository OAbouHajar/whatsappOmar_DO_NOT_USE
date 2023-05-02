package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.2CM  reason: invalid class name */
public final class AnonymousClass2CM extends Handler implements AnonymousClass2CN {
    public final /* synthetic */ C19090xk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2CM(Looper looper, C19090xk r2) {
        super(looper);
        this.A00 = r2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r5v14, types: [int] */
    /* JADX WARNING: type inference failed for: r5v16 */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x04a3  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x064d  */
    public void handleMessage(android.os.Message r15) {
        /*
            r14 = this;
            int r0 = r15.what
            r5 = 0
            switch(r0) {
                case 0: goto L_0x020b;
                case 1: goto L_0x0007;
                case 2: goto L_0x0293;
                case 3: goto L_0x04eb;
                case 4: goto L_0x0505;
                case 5: goto L_0x0031;
                case 6: goto L_0x018e;
                case 7: goto L_0x0511;
                case 8: goto L_0x01f4;
                default: goto L_0x0006;
            }
        L_0x0006:
            return
        L_0x0007:
            X.0xk r0 = r14.A00
            X.0yR r0 = r0.A0A
            X.0tK r1 = r0.A0A
            r0 = 1
            r1.A03 = r0
            int r0 = r1.A00
            int r0 = r0 + 1
            r1.A00 = r0
            X.AnonymousClass00B.A01()
            java.lang.Iterable r0 = r1.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0021:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0006
            java.lang.Object r0 = r1.next()
            X.0xW r0 = (X.C18950xW) r0
            r0.ARz()
            goto L_0x0021
        L_0x0031:
            X.0xk r0 = r14.A00
            X.0yR r0 = r0.A0A
            X.2Cb r4 = r0.A0c
            X.13O r6 = r0.A0g
            int r1 = r15.arg1
            r0 = 5
            java.lang.String r7 = "pushName"
            java.lang.String r2 = "jid"
            if (r1 == r0) goto L_0x0819
            r0 = 12
            if (r1 == r0) goto L_0x0813
            r0 = 24
            java.lang.String r3 = "stanzaKey"
            if (r1 == r0) goto L_0x07d2
            r0 = 64
            if (r1 == r0) goto L_0x0739
            r0 = 85
            if (r1 == r0) goto L_0x0729
            r0 = 88
            if (r1 == r0) goto L_0x0797
            r0 = 158(0x9e, float:2.21E-43)
            java.lang.String r8 = "errorCode"
            if (r1 == r0) goto L_0x0175
            r0 = 190(0xbe, float:2.66E-43)
            if (r1 == r0) goto L_0x00f4
            r0 = 237(0xed, float:3.32E-43)
            if (r1 == r0) goto L_0x071f
            r0 = 20
            java.lang.String r3 = "author"
            if (r1 == r0) goto L_0x088b
            r0 = 21
            if (r1 == r0) goto L_0x06fc
            r0 = 107(0x6b, float:1.5E-43)
            java.lang.String r6 = "ns"
            java.lang.String r3 = "requestLocales"
            if (r1 == r0) goto L_0x0593
            r0 = 108(0x6c, float:1.51E-43)
            if (r1 != r0) goto L_0x0006
            android.os.Bundle r2 = r15.getData()
            java.io.Serializable r7 = r2.getSerializable(r3)
            java.util.Locale[] r7 = (java.util.Locale[]) r7
            java.lang.String r1 = "haveHashes"
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x00f2
            java.lang.String[] r3 = r2.getStringArray(r1)
        L_0x0093:
            java.lang.String r6 = r2.getString(r6)
            int r2 = r2.getInt(r8)
            java.lang.String r0 = "recvmessagelistener/on-get-biz-language-pack-error requestLocales="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = X.AnonymousClass1WH.A08(r7)
            r1.append(r0)
            java.lang.String r0 = " haveHashes="
            r1.append(r0)
            java.lang.String r0 = java.util.Arrays.toString(r3)
            r1.append(r0)
            java.lang.String r0 = " ns="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " errorCode="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0yB r8 = r4.A04
            java.lang.String r1 = "languagepackmanager/on-get-biz-language-pack-error code="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 404(0x194, float:5.66E-43)
            if (r2 != r0) goto L_0x056e
            int r9 = r7.length
            r3 = 0
        L_0x00e5:
            if (r5 >= r9) goto L_0x052e
            r2 = r7[r5]
            X.11i r1 = r8.A01
            r0 = 0
            r1.A00(r0, r6, r2, r0)
            int r5 = r5 + 1
            goto L_0x00e5
        L_0x00f2:
            r3 = 0
            goto L_0x0093
        L_0x00f4:
            android.os.Bundle r0 = r15.getData()
            android.os.Parcelable r4 = r0.getParcelable(r3)
            X.1ci r4 = (X.C30641ci) r4
            java.lang.Object r7 = r15.obj
            X.1Vv r7 = (X.C28371Vv) r7
            X.1Vo r1 = r6.A0G
            java.lang.String r0 = "app/xmpp/recv/message/onPaymentMethodUpdate"
            r1.A06(r0)
            X.11o r3 = r6.A05
            long r0 = r4.A00
            r2 = 2
            X.1d2 r1 = r3.A00(r2, r0)
            if (r1 == 0) goto L_0x0118
            r0 = 3
            r1.A00(r0)
        L_0x0118:
            X.0wS r3 = r6.A0F
            X.19r r0 = r3.A03()
            X.2Cc r1 = r0.AEJ()
            if (r1 == 0) goto L_0x0006
            X.173 r0 = r6.A03
            java.util.ArrayList r1 = r1.AaD(r0, r7)
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x0160
            java.lang.Object r0 = r1.get(r5)
            X.1tF r0 = (X.C39901tF) r0
            X.1cl r2 = r0.A05()
            if (r2 == 0) goto L_0x0168
            r3.A06()
            X.1xv r1 = r3.A00
            X.AnonymousClass00B.A06(r1)
            java.lang.String r0 = r2.A0A
            X.1WD r3 = r1.A01(r0)
            r1 = 7
            com.facebook.redex.IDxNConsumerShape17S0300000_2_I0 r0 = new com.facebook.redex.IDxNConsumerShape17S0300000_2_I0
            r0.<init>(r7, r6, r2, r1)
            r3.A00(r0)
            r0 = 16
            com.facebook.redex.IDxNConsumerShape39S0200000_2_I0 r2 = new com.facebook.redex.IDxNConsumerShape39S0200000_2_I0
            r2.<init>(r7, r0, r6)
            X.1XS r1 = r3.A00
            r0 = 0
            r1.A03(r2, r0)
        L_0x0160:
            X.17f r0 = r6.A04
            X.0ug r0 = r0.A03
            r0.A0E(r4)
            return
        L_0x0168:
            X.0pt r2 = r6.A01
            r1 = 20
            com.facebook.redex.RunnableRunnableShape9S0200000_I0_7 r0 = new com.facebook.redex.RunnableRunnableShape9S0200000_I0_7
            r0.<init>(r6, r1, r7)
            r2.A0K(r0)
            goto L_0x0160
        L_0x0175:
            android.os.Bundle r0 = r15.getData()
            int r2 = r0.getInt(r8)
            X.0xk r1 = r4.A08
            r0 = 500(0x1f4, float:7.0E-43)
            if (r2 < r0) goto L_0x0006
            r0 = 600(0x258, float:8.41E-43)
            if (r2 >= r0) goto L_0x0006
            r0 = 1
            r1.A0D = r0
            r1.A0E(r5)
            return
        L_0x018e:
            X.0xk r1 = r14.A00
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A0v
            r0.set(r5)
            X.0yR r5 = r1.A0A
            java.lang.String r0 = "message-handler-callback/handlerconnected/handleclockwrong"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.116 r1 = r5.A0r
            X.0tz r0 = r5.A0K
            android.content.Context r4 = r0.A00
            java.lang.Class<com.obwhatsapp.service.GcmFGService> r0 = com.obwhatsapp.service.GcmFGService.class
            r1.A01(r4, r0)
            X.0pt r0 = r5.A03
            X.0pS r2 = r0.A00
            if (r2 == 0) goto L_0x01b7
            X.0xk r1 = r5.A0b
            X.0pj r0 = r5.A0f
            boolean r0 = X.C46052Cd.A02(r2, r1, r0)
            if (r0 != 0) goto L_0x0006
        L_0x01b7:
            java.lang.String r0 = "message-handler-callback/handlerconnected/displayclockwrong/notification "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            r2.append(r0)
            java.lang.String r0 = " "
            r2.append(r0)
            long r0 = java.lang.System.currentTimeMillis()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.0yL r3 = r5.A0L
            r0 = 2131888212(0x7f120854, float:1.9411053E38)
            java.lang.String r2 = r4.getString(r0)
            r0 = 2131887215(0x7f12046f, float:1.940903E38)
            java.lang.String r1 = r4.getString(r0)
            r0 = 8
            X.C33881jL.A01(r4, r3, r2, r1, r0)
            X.0pj r1 = r5.A0f
            r0 = 1
            r1.A03 = r0
            return
        L_0x01f4:
            X.0xk r0 = r14.A00
            X.1CO r1 = r0.A0d
            java.lang.Object r0 = r15.obj
            java.util.Map r2 = r1.A03
            monitor-enter(r2)
            java.lang.Object r1 = r2.remove(r0)     // Catch:{ all -> 0x0932 }
            X.1kE r1 = (X.C34421kE) r1     // Catch:{ all -> 0x0932 }
            monitor-exit(r2)     // Catch:{ all -> 0x0932 }
            if (r1 == 0) goto L_0x0006
            r0 = 0
            r1.A02(r0)
            return
        L_0x020b:
            X.0xk r4 = r14.A00
            java.lang.Object r7 = r15.obj
            X.1kO r7 = (X.C34511kO) r7
            boolean r0 = r4.A10
            if (r0 != 0) goto L_0x021c
            java.lang.String r0 = "xmpp/handleSendingChannelReady/not started"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x021c:
            r4.A08 = r7
            X.1S3 r1 = r4.A0s
            r1.A00 = r4
            X.0tz r0 = r1.A07
            android.content.Context r6 = r0.A00
            android.content.BroadcastReceiver r3 = r1.A01
            java.lang.String r0 = "com.obwhatsapp.MessageHandler.LOGOUT_ACTION"
            android.content.IntentFilter r2 = new android.content.IntentFilter
            r2.<init>(r0)
            java.lang.String r1 = X.AnonymousClass01S.A09
            r0 = 0
            r6.registerReceiver(r3, r2, r1, r0)
            X.0ug r1 = r4.A0e
            X.1kP r0 = new X.1kP
            r0.<init>(r4)
            r1.A00 = r7
            r1.A01 = r0
            java.lang.String r0 = "xmpp/connectionready"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Vm r6 = r4.A0h
            long r0 = r6.ABO()
            r4.A01 = r0
            X.0tz r0 = r4.A0T
            android.content.Context r3 = r0.A00
            android.content.BroadcastReceiver r2 = r4.A0E
            java.lang.String r1 = "com.obwhatsapp.MessageHandler.CONNECTIVITY_RETRY_ACTION"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r1)
            r3.registerReceiver(r2, r0)
            java.lang.String r1 = "MessageHandler Connectivity Handler"
            android.os.HandlerThread r0 = new android.os.HandlerThread
            r0.<init>(r1)
            r4.A04 = r0
            r0.start()
            android.os.HandlerThread r0 = r4.A04
            android.os.Looper r1 = r0.getLooper()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1)
            r6.Ag6(r0)
            r1 = 1
            r4.A0G(r1, r5, r5)
            X.0tK r0 = r4.A0K
            r0.A05 = r1
            X.0yR r0 = r4.A0A
            if (r0 == 0) goto L_0x0287
            r0.A01()
        L_0x0287:
            X.0vy r1 = r4.A0X
            X.0wP r0 = r4.A0N
            X.1UW r0 = r0.A06()
            r1.A01(r0)
            return
        L_0x0293:
            X.0xk r7 = r14.A00
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A0v
            r0.set(r5)
            java.lang.Object r9 = r15.obj
            X.2Ce r9 = (X.C46062Ce) r9
            java.lang.Object r6 = r7.A0t
            monitor-enter(r6)
            int r3 = r9.type     // Catch:{ all -> 0x04e8 }
            r0 = 4
            r8 = 0
            r2 = 6
            r4 = 1
            if (r3 == r0) goto L_0x04c8
            if (r3 == r2) goto L_0x04c8
            r0 = 8
            if (r3 == r0) goto L_0x04c8
            X.0yR r10 = r7.A0A     // Catch:{ all -> 0x04e8 }
            X.0tz r0 = r10.A0K     // Catch:{ all -> 0x04e8 }
            android.content.Context r11 = r0.A00     // Catch:{ all -> 0x04e8 }
            X.0yU r2 = r10.A0W     // Catch:{ all -> 0x04e8 }
            boolean r0 = r2 instanceof X.AnonymousClass11B     // Catch:{ all -> 0x04e8 }
            if (r0 == 0) goto L_0x02ce
            X.11B r2 = (X.AnonymousClass11B) r2     // Catch:{ all -> 0x04e8 }
            X.0s4 r0 = r2.A04     // Catch:{ all -> 0x04e8 }
            X.0s5 r1 = r0.A00     // Catch:{ all -> 0x04e8 }
            X.0s8 r0 = X.C15910s6.A11     // Catch:{ all -> 0x04e8 }
            boolean r0 = r1.A05(r0)     // Catch:{ all -> 0x04e8 }
            if (r0 == 0) goto L_0x02ce
            X.118 r0 = r2.A05     // Catch:{ all -> 0x04e8 }
            r0.A01()     // Catch:{ all -> 0x04e8 }
        L_0x02ce:
            int r2 = r9.type     // Catch:{ all -> 0x04e8 }
            if (r2 == 0) goto L_0x0428
            r0 = 5
            if (r2 == r0) goto L_0x03f7
            r0 = 7
            if (r2 == r0) goto L_0x0369
            r0 = 2
            if (r2 == r0) goto L_0x0303
            r0 = 3
            if (r2 == r0) goto L_0x02e0
            goto L_0x0482
        L_0x02e0:
            long r0 = r9.expiration_time     // Catch:{ all -> 0x04e8 }
            r11 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 > 0) goto L_0x02ee
            X.0t3 r0 = r10.A0J     // Catch:{ all -> 0x04e8 }
            long r0 = r0.A00()     // Catch:{ all -> 0x04e8 }
        L_0x02ee:
            X.0rz r2 = r10.A0M     // Catch:{ all -> 0x04e8 }
            android.content.SharedPreferences$Editor r3 = r2.A0K()     // Catch:{ all -> 0x04e8 }
            java.lang.String r2 = "software_forced_expiration"
            android.content.SharedPreferences$Editor r0 = r3.putLong(r2, r0)     // Catch:{ all -> 0x04e8 }
            r0.apply()     // Catch:{ all -> 0x04e8 }
            r10.A02()     // Catch:{ all -> 0x04e8 }
            goto L_0x0493
        L_0x0303:
            int r12 = r9.code     // Catch:{ all -> 0x04e8 }
            int r3 = r9.expire_time_out     // Catch:{ all -> 0x04e8 }
            java.lang.String r2 = r9.banMessage     // Catch:{ all -> 0x04e8 }
            java.lang.String r1 = r9.faqUrl     // Catch:{ all -> 0x04e8 }
            android.content.Intent r5 = new android.content.Intent     // Catch:{ all -> 0x04e8 }
            r5.<init>()     // Catch:{ all -> 0x04e8 }
            java.lang.String r13 = r11.getPackageName()     // Catch:{ all -> 0x04e8 }
            java.lang.String r0 = "com.obwhatsapp.spamwarning.SpamWarningActivity"
            r5.setClassName(r13, r0)     // Catch:{ all -> 0x04e8 }
            r0 = 100
            if (r12 < r0) goto L_0x0323
            java.lang.String r0 = "spam_warning_reason_key"
            r5.putExtra(r0, r12)     // Catch:{ all -> 0x04e8 }
        L_0x0323:
            java.lang.String r0 = "expiry_in_seconds"
            r5.putExtra(r0, r3)     // Catch:{ all -> 0x04e8 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x04e8 }
            if (r0 != 0) goto L_0x0334
            java.lang.String r0 = "spam_warning_message_key"
            r5.putExtra(r0, r2)     // Catch:{ all -> 0x04e8 }
        L_0x0334:
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x04e8 }
            if (r0 != 0) goto L_0x033f
            java.lang.String r0 = "faq_url_key"
            r5.putExtra(r0, r1)     // Catch:{ all -> 0x04e8 }
        L_0x033f:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r5.setFlags(r0)     // Catch:{ all -> 0x04e8 }
            X.0rz r10 = r10.A0M     // Catch:{ all -> 0x04e8 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x04e8 }
            int r0 = r9.expire_time_out     // Catch:{ all -> 0x04e8 }
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch:{ all -> 0x04e8 }
            long r2 = r2 + r0
            android.content.SharedPreferences$Editor r1 = r10.A0K()     // Catch:{ all -> 0x04e8 }
            java.lang.String r0 = "spam_banned"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r4)     // Catch:{ all -> 0x04e8 }
            r0.apply()     // Catch:{ all -> 0x04e8 }
            java.lang.String r0 = "spam_banned_expiry_timestamp"
            r10.A14(r0, r2)     // Catch:{ all -> 0x04e8 }
            r11.startActivity(r5)     // Catch:{ all -> 0x04e8 }
            goto L_0x0493
        L_0x0369:
            java.lang.String r0 = "MessageHandlerCallback/onMessageHandlerLoginFailed/perm-banned"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04e8 }
            X.1CG r0 = r10.A00     // Catch:{ all -> 0x04e8 }
            r0.A08()     // Catch:{ all -> 0x04e8 }
            X.0xZ r0 = r10.A0y     // Catch:{ all -> 0x04e8 }
            r0.A00()     // Catch:{ all -> 0x04e8 }
            X.0xa r0 = r10.A0o     // Catch:{ all -> 0x04e8 }
            r0.A04(r4)     // Catch:{ all -> 0x04e8 }
            X.0sK r0 = r10.A05     // Catch:{ all -> 0x04e8 }
            boolean r0 = r0.A0G()     // Catch:{ all -> 0x04e8 }
            if (r0 != 0) goto L_0x0468
            X.0yy r3 = r10.A0u     // Catch:{ all -> 0x04e8 }
            int r5 = r9.violationType     // Catch:{ all -> 0x04e8 }
            java.lang.String r1 = "banmanager/startPermanentBanFlow vt: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x04e8 }
            r0.<init>(r1)     // Catch:{ all -> 0x04e8 }
            r0.append(r5)     // Catch:{ all -> 0x04e8 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x04e8 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04e8 }
            if (r5 <= 0) goto L_0x03eb
            X.0pd r2 = r3.A05     // Catch:{ all -> 0x04e8 }
            r1 = 622(0x26e, float:8.72E-43)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x04e8 }
            boolean r0 = r2.A0E(r0, r1)     // Catch:{ all -> 0x04e8 }
            if (r0 == 0) goto L_0x03eb
            X.0sC r0 = r3.A07     // Catch:{ all -> 0x04e8 }
            boolean r0 = r0.A01()     // Catch:{ all -> 0x04e8 }
            if (r0 == 0) goto L_0x03eb
            X.0yx r1 = r3.A06     // Catch:{ all -> 0x04e8 }
            r1.A01()     // Catch:{ all -> 0x04e8 }
            r0 = 9
            r1.A0A(r0)     // Catch:{ all -> 0x04e8 }
            X.0rz r2 = r3.A04     // Catch:{ all -> 0x04e8 }
            android.content.SharedPreferences$Editor r1 = r2.A0K()     // Catch:{ all -> 0x04e8 }
            java.lang.String r0 = "support_ban_appeal_user_banned_from_chat_disconnect"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r4)     // Catch:{ all -> 0x04e8 }
            r0.apply()     // Catch:{ all -> 0x04e8 }
            android.content.SharedPreferences$Editor r1 = r2.A0K()     // Catch:{ all -> 0x04e8 }
            java.lang.String r0 = "support_ban_appeal_screen_before_verification"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r4)     // Catch:{ all -> 0x04e8 }
            r0.apply()     // Catch:{ all -> 0x04e8 }
            X.0yv r0 = r3.A01     // Catch:{ all -> 0x04e8 }
            r0.A01()     // Catch:{ all -> 0x04e8 }
            X.0pt r2 = r3.A00     // Catch:{ all -> 0x04e8 }
            r1 = 37
            com.facebook.redex.RunnableRunnableShape0S0201000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0201000_I0     // Catch:{ all -> 0x04e8 }
            r0.<init>((java.lang.Object) r3, (int) r5, (java.lang.Object) r11, (int) r1)     // Catch:{ all -> 0x04e8 }
            r2.Acq(r0)     // Catch:{ all -> 0x04e8 }
            goto L_0x0493
        L_0x03eb:
            java.lang.String r0 = "banmanager/startPermanentBanFlow/notify-or-show-login-failure-overlay-alert"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04e8 }
            X.0yx r0 = r3.A06     // Catch:{ all -> 0x04e8 }
            r0.A05()     // Catch:{ all -> 0x04e8 }
            goto L_0x0493
        L_0x03f7:
            java.lang.String r0 = "MessageHandlerCallback/onMessageHandlerLoginFailed/underage-account"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04e8 }
            X.0rz r0 = r10.A0M     // Catch:{ all -> 0x04e8 }
            android.content.SharedPreferences$Editor r1 = r0.A0K()     // Catch:{ all -> 0x04e8 }
            java.lang.String r0 = "underage_account_banned"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r4)     // Catch:{ all -> 0x04e8 }
            r0.apply()     // Catch:{ all -> 0x04e8 }
            X.0xa r0 = r10.A0o     // Catch:{ all -> 0x04e8 }
            r0.A04(r4)     // Catch:{ all -> 0x04e8 }
            X.0sK r0 = r10.A05     // Catch:{ all -> 0x04e8 }
            boolean r0 = r0.A0G()     // Catch:{ all -> 0x04e8 }
            if (r0 != 0) goto L_0x0468
            X.0yx r0 = r10.A0p     // Catch:{ all -> 0x04e8 }
            android.content.Intent r1 = r0.A01()     // Catch:{ all -> 0x04e8 }
            java.lang.String r0 = "com.obwhatsapp.registration.RegisterPhone.show_underage_account_ban_dialog"
            r1.putExtra(r0, r4)     // Catch:{ all -> 0x04e8 }
            r11.startActivity(r1)     // Catch:{ all -> 0x04e8 }
            goto L_0x0493
        L_0x0428:
            java.lang.String r0 = "MessageHandlerCallback/onMessageHandlerLoginFailed/exception-password"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04e8 }
            X.0xa r0 = r10.A0o     // Catch:{ all -> 0x04e8 }
            r0.A04(r4)     // Catch:{ all -> 0x04e8 }
            X.0sK r0 = r10.A05     // Catch:{ all -> 0x04e8 }
            boolean r0 = r0.A0G()     // Catch:{ all -> 0x04e8 }
            if (r0 != 0) goto L_0x0468
            X.11R r0 = r10.A0H     // Catch:{ all -> 0x04e8 }
            android.content.SharedPreferences r0 = r0.A00()     // Catch:{ all -> 0x04e8 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x04e8 }
            java.lang.String r0 = "previously_logged_out_from_primary"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r4)     // Catch:{ all -> 0x04e8 }
            r0.apply()     // Catch:{ all -> 0x04e8 }
            X.0yx r0 = r10.A0p     // Catch:{ all -> 0x04e8 }
            r0.A05()     // Catch:{ all -> 0x04e8 }
            X.0tq r0 = r10.A0P     // Catch:{ all -> 0x04e8 }
            r0.A04()     // Catch:{ all -> 0x04e8 }
            boolean r0 = r0.A01     // Catch:{ all -> 0x04e8 }
            if (r0 == 0) goto L_0x0493
            X.0sq r2 = r10.A0x     // Catch:{ all -> 0x04e8 }
            r1 = 17
            com.facebook.redex.RunnableRunnableShape11S0100000_I0_10 r0 = new com.facebook.redex.RunnableRunnableShape11S0100000_I0_10     // Catch:{ all -> 0x04e8 }
            r0.<init>((java.lang.Object) r10, (int) r1)     // Catch:{ all -> 0x04e8 }
            r2.Acl(r0)     // Catch:{ all -> 0x04e8 }
            goto L_0x0493
        L_0x0468:
            java.lang.String r0 = "MessageHandlerCallback/handleLoginFailedOnCompanion/companion logged out"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04e8 }
            X.0sq r2 = r10.A0x     // Catch:{ all -> 0x04e8 }
            r1 = 20
            com.facebook.redex.RunnableRunnableShape11S0100000_I0_10 r0 = new com.facebook.redex.RunnableRunnableShape11S0100000_I0_10     // Catch:{ all -> 0x04e8 }
            r0.<init>((java.lang.Object) r10, (int) r1)     // Catch:{ all -> 0x04e8 }
            r2.Aco(r0)     // Catch:{ all -> 0x04e8 }
            X.0pt r1 = r10.A03     // Catch:{ all -> 0x04e8 }
            r0 = 2131889307(0x7f120c9b, float:1.9413274E38)
            r1.A08(r5, r0)     // Catch:{ all -> 0x04e8 }
            goto L_0x0493
        L_0x0482:
            java.lang.String r1 = "message-handler-callback/login-failed LoginFailureException type: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x04e8 }
            r0.<init>(r1)     // Catch:{ all -> 0x04e8 }
            r0.append(r2)     // Catch:{ all -> 0x04e8 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x04e8 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04e8 }
        L_0x0493:
            X.2CO r0 = r7.A0a     // Catch:{ all -> 0x04e8 }
            r0.A00(r4)     // Catch:{ all -> 0x04e8 }
            X.1CO r0 = r7.A0d     // Catch:{ all -> 0x04e8 }
            r0.A01(r9)     // Catch:{ all -> 0x04e8 }
            X.1CP r2 = r7.A0j     // Catch:{ all -> 0x04e8 }
            X.1kO r1 = r7.A08     // Catch:{ all -> 0x04e8 }
            if (r1 == 0) goto L_0x04c4
            X.2CT r1 = (X.AnonymousClass2CT) r1     // Catch:{ all -> 0x04e8 }
            r0 = 4
            boolean r0 = r1.hasMessages(r0)     // Catch:{ all -> 0x04e8 }
            if (r0 != 0) goto L_0x04c3
            X.1vi r0 = r1.A00     // Catch:{ all -> 0x04e8 }
            X.2CU r1 = r0.A04     // Catch:{ all -> 0x04e8 }
            X.2CV r1 = (X.AnonymousClass2CV) r1     // Catch:{ all -> 0x04e8 }
            r0 = 2
            boolean r0 = r1.hasMessages(r0)     // Catch:{ all -> 0x04e8 }
            if (r0 != 0) goto L_0x04c3
            X.2CW r0 = r1.A00     // Catch:{ all -> 0x04e8 }
            java.util.LinkedList r0 = r0.A06     // Catch:{ all -> 0x04e8 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x04e8 }
            if (r0 != 0) goto L_0x04c4
        L_0x04c3:
            r8 = 1
        L_0x04c4:
            r2.A04(r8)     // Catch:{ all -> 0x04e8 }
            goto L_0x04e6
        L_0x04c8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x04e8 }
            r1.<init>()     // Catch:{ all -> 0x04e8 }
            java.lang.String r0 = "MessageHandler/login failed with reason: "
            r1.append(r0)     // Catch:{ all -> 0x04e8 }
            r1.append(r3)     // Catch:{ all -> 0x04e8 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x04e8 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x04e8 }
            r7.A0D = r4     // Catch:{ all -> 0x04e8 }
            int r0 = r9.type     // Catch:{ all -> 0x04e8 }
            if (r0 != r2) goto L_0x04e3
            r8 = 1
        L_0x04e3:
            r7.A0E(r8)     // Catch:{ all -> 0x04e8 }
        L_0x04e6:
            monitor-exit(r6)     // Catch:{ all -> 0x04e8 }
            return
        L_0x04e8:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x04e8 }
            throw r0
        L_0x04eb:
            X.0xk r4 = r14.A00
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A0v
            r0.set(r5)
            java.lang.Object r0 = r15.obj
            X.AnonymousClass00B.A06(r0)
            X.2Cf r0 = (X.C46072Cf) r0
            int r3 = r0.A00
            boolean r2 = r0.A02
            java.lang.Integer r1 = r0.A01
            boolean r0 = r0.A03
            X.C19090xk.A02(r4, r1, r3, r2, r0)
            return
        L_0x0505:
            X.0xk r2 = r14.A00
            int r1 = r15.arg1
            r0 = 1
            if (r1 != r0) goto L_0x050d
            r5 = 1
        L_0x050d:
            X.C19090xk.A03(r2, r5)
            return
        L_0x0511:
            X.0xk r1 = r14.A00
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A0v
            r0.set(r5)
            X.0yR r3 = r1.A0A
            java.lang.String r0 = "message-handler-callback/handlerconnected/handlesoftwareexpired"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.116 r2 = r3.A0r
            X.0tz r0 = r3.A0K
            android.content.Context r1 = r0.A00
            java.lang.Class<com.obwhatsapp.service.GcmFGService> r0 = com.obwhatsapp.service.GcmFGService.class
            r2.A01(r1, r0)
            r3.A02()
            return
        L_0x052e:
            X.197 r4 = r8.A03
            monitor-enter(r4)
            X.2Cg r0 = X.C46082Cg.A07     // Catch:{ all -> 0x056b }
            X.1Wr r0 = r0.A0U()     // Catch:{ all -> 0x056b }
            X.2Ch r0 = (X.C46092Ch) r0     // Catch:{ all -> 0x056b }
            r0.A05(r6)     // Catch:{ all -> 0x056b }
            X.1Wm r2 = r0.A02()     // Catch:{ all -> 0x056b }
            X.2Cg r2 = (X.C46082Cg) r2     // Catch:{ all -> 0x056b }
        L_0x0542:
            if (r3 >= r9) goto L_0x0556
            r0 = r7[r3]     // Catch:{ all -> 0x056b }
            X.2Ci r1 = new X.2Ci     // Catch:{ all -> 0x056b }
            r1.<init>(r6, r0)     // Catch:{ all -> 0x056b }
            r4.put(r1, r2)     // Catch:{ all -> 0x056b }
            java.util.HashSet r0 = r8.A05     // Catch:{ all -> 0x056b }
            r0.remove(r1)     // Catch:{ all -> 0x056b }
            int r3 = r3 + 1
            goto L_0x0542
        L_0x0556:
            java.util.HashMap r3 = r8.A04     // Catch:{ all -> 0x056b }
            android.util.Pair r2 = android.util.Pair.create(r7, r6)     // Catch:{ all -> 0x056b }
            X.0t3 r0 = r8.A02     // Catch:{ all -> 0x056b }
            long r0 = r0.A00()     // Catch:{ all -> 0x056b }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x056b }
            r3.put(r2, r0)     // Catch:{ all -> 0x056b }
            monitor-exit(r4)     // Catch:{ all -> 0x056b }
            goto L_0x0585
        L_0x056b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x056b }
            throw r0
        L_0x056e:
            X.197 r4 = r8.A03
            monitor-enter(r4)
            java.util.HashMap r3 = r8.A04     // Catch:{ all -> 0x0590 }
            android.util.Pair r2 = android.util.Pair.create(r7, r6)     // Catch:{ all -> 0x0590 }
            X.0t3 r0 = r8.A02     // Catch:{ all -> 0x0590 }
            long r0 = r0.A00()     // Catch:{ all -> 0x0590 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0590 }
            r3.put(r2, r0)     // Catch:{ all -> 0x0590 }
            monitor-exit(r4)     // Catch:{ all -> 0x0590 }
        L_0x0585:
            X.2Cj r1 = r8.A00
            X.2Ck r0 = new X.2Ck
            r0.<init>(r6, r7)
            r1.A04()
            return
        L_0x0590:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0590 }
            throw r0
        L_0x0593:
            android.os.Bundle r1 = r15.getData()
            java.io.Serializable r9 = r1.getSerializable(r3)
            java.util.Locale[] r9 = (java.util.Locale[]) r9
            java.lang.String r0 = "locale"
            java.io.Serializable r7 = r1.getSerializable(r0)
            java.util.Locale r7 = (java.util.Locale) r7
            java.lang.String r0 = "hash"
            java.lang.String r13 = r1.getString(r0)
            java.lang.String r6 = r1.getString(r6)
            java.lang.String r0 = "blob"
            byte[] r1 = r1.getByteArray(r0)
            java.lang.String r0 = "recvmessagelistener/on-get-biz-language-pack locale="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r0 = X.AnonymousClass1WH.A05(r7)
            r2.append(r0)
            java.lang.String r0 = " hash="
            r2.append(r0)
            r2.append(r13)
            java.lang.String r0 = " ns="
            r2.append(r0)
            r2.append(r6)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0yB r8 = r4.A04
            java.lang.String r0 = "languagepackmanager/on-get-biz-language-pack"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r1 == 0) goto L_0x06c8
            int r0 = r1.length
            if (r0 == 0) goto L_0x06c8
            int r11 = r9.length
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r11)
            r10 = 0
        L_0x05ed:
            if (r10 >= r11) goto L_0x0621
            r4 = r9[r10]
            boolean r0 = r4.equals(r7)
            if (r0 != 0) goto L_0x0621
            java.lang.String r3 = r4.getCountry()
            java.lang.String r0 = r7.getCountry()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0623
            java.lang.String r3 = r4.getLanguage()
            java.lang.String r0 = r7.getLanguage()
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0623
            java.lang.String r3 = X.AnonymousClass1WH.A02(r4)
            java.lang.String r0 = X.AnonymousClass1WH.A02(r7)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0623
        L_0x0621:
            r12 = 0
            goto L_0x0629
        L_0x0623:
            r2.add(r4)
            int r10 = r10 + 1
            goto L_0x05ed
        L_0x0629:
            X.2Cg r3 = X.C46082Cg.A07     // Catch:{ 1bD -> 0x06bc }
            X.1Wm r10 = X.C28541Wm.A0E(r3, r1)     // Catch:{ 1bD -> 0x06bc }
            X.2Cg r10 = (X.C46082Cg) r10     // Catch:{ 1bD -> 0x06bc }
            if (r10 == 0) goto L_0x06c2
            int r0 = r10.A00
            r4 = 1
            r0 = r0 & 1
            if (r0 != r4) goto L_0x06c2
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x06c2
            X.11i r4 = r8.A01
            java.lang.String r0 = r10.A06
            r4.A00(r13, r0, r7, r1)
            int r0 = r2.size()
            if (r0 >= r11) goto L_0x0661
            java.util.Iterator r1 = r2.iterator()
        L_0x0651:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0661
            java.lang.Object r0 = r1.next()
            java.util.Locale r0 = (java.util.Locale) r0
            r4.A00(r12, r6, r0, r12)
            goto L_0x0651
        L_0x0661:
            X.197 r4 = r8.A03
            monitor-enter(r4)
            java.lang.String r1 = r10.A06     // Catch:{ all -> 0x06b9 }
            X.2Ci r0 = new X.2Ci     // Catch:{ all -> 0x06b9 }
            r0.<init>(r1, r7)     // Catch:{ all -> 0x06b9 }
            r4.put(r0, r10)     // Catch:{ all -> 0x06b9 }
            java.util.HashSet r10 = r8.A05     // Catch:{ all -> 0x06b9 }
            r10.remove(r0)     // Catch:{ all -> 0x06b9 }
            int r0 = r2.size()     // Catch:{ all -> 0x06b9 }
            if (r0 >= r11) goto L_0x06a4
            X.1Wr r0 = r3.A0U()     // Catch:{ all -> 0x06b9 }
            X.2Ch r0 = (X.C46092Ch) r0     // Catch:{ all -> 0x06b9 }
            r0.A05(r6)     // Catch:{ all -> 0x06b9 }
            X.1Wm r3 = r0.A02()     // Catch:{ all -> 0x06b9 }
            X.2Cg r3 = (X.C46082Cg) r3     // Catch:{ all -> 0x06b9 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x06b9 }
        L_0x068c:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x06b9 }
            if (r0 == 0) goto L_0x06a4
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x06b9 }
            java.util.Locale r1 = (java.util.Locale) r1     // Catch:{ all -> 0x06b9 }
            X.2Ci r0 = new X.2Ci     // Catch:{ all -> 0x06b9 }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x06b9 }
            r4.put(r0, r3)     // Catch:{ all -> 0x06b9 }
            r10.remove(r0)     // Catch:{ all -> 0x06b9 }
            goto L_0x068c
        L_0x06a4:
            java.util.HashMap r3 = r8.A04     // Catch:{ all -> 0x06b9 }
            android.util.Pair r2 = android.util.Pair.create(r9, r6)     // Catch:{ all -> 0x06b9 }
            X.0t3 r0 = r8.A02     // Catch:{ all -> 0x06b9 }
            long r0 = r0.A00()     // Catch:{ all -> 0x06b9 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x06b9 }
            r3.put(r2, r0)     // Catch:{ all -> 0x06b9 }
            monitor-exit(r4)     // Catch:{ all -> 0x06b9 }
            goto L_0x06e9
        L_0x06b9:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x06b9 }
            throw r0
        L_0x06bc:
            r1 = move-exception
            java.lang.String r0 = "languagepackmanager/on-get-biz-language-pack/invalidproto:"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x06c2:
            java.lang.String r0 = "languagepackmanager/on-get-biz-language-pack pack data is invalid"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x06c8:
            java.lang.String r0 = "languagepackmanager/on-get-biz-language-pack already have latest version"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.197 r4 = r8.A03
            monitor-enter(r4)
            java.util.HashMap r3 = r8.A04     // Catch:{ all -> 0x06f9 }
            android.util.Pair r2 = android.util.Pair.create(r9, r6)     // Catch:{ all -> 0x06f9 }
            X.0t3 r0 = r8.A02     // Catch:{ all -> 0x06f9 }
            long r0 = r0.A00()     // Catch:{ all -> 0x06f9 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x06f9 }
            r3.put(r2, r0)     // Catch:{ all -> 0x06f9 }
            monitor-exit(r4)     // Catch:{ all -> 0x06f9 }
            X.11i r0 = r8.A01
            r0.A01(r6, r7)
        L_0x06e9:
            X.2Cj r2 = r8.A00
            r0 = 1
            java.util.Locale[] r1 = new java.util.Locale[r0]
            r1[r5] = r7
            X.2Ck r0 = new X.2Ck
            r0.<init>(r6, r1)
            r2.A04()
            return
        L_0x06f9:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x06f9 }
            throw r0
        L_0x06fc:
            java.lang.Object r1 = r15.obj
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.String r0 = r1.getString(r2)
            com.whatsapp.jid.Jid r2 = com.whatsapp.jid.Jid.getNullable(r0)
            X.0rv r2 = (X.C15830rv) r2
            java.lang.String r0 = r1.getString(r3)
            com.whatsapp.jid.Jid r1 = com.whatsapp.jid.Jid.getNullable(r0)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            X.125 r0 = r4.A0B
            r0.A06(r2, r1)
            X.127 r0 = r4.A05
            r0.A04(r2)
            return
        L_0x071f:
            java.lang.String r2 = "[WA Debug] Server sent smax-invalid (code:479)"
            X.0so r1 = r4.A00
            java.lang.String r0 = "SmaxInvalidError"
            r1.AcB(r0, r2, r5)
            return
        L_0x0729:
            java.lang.Object r0 = r15.obj
            android.os.Bundle r0 = (android.os.Bundle) r0
            android.os.Parcelable r1 = r0.getParcelable(r3)
            X.1ci r1 = (X.C30641ci) r1
            X.124 r0 = r4.A09
            r0.A02(r1)
            return
        L_0x0739:
            java.lang.Object r1 = r15.obj
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.String r0 = r1.getString(r2)
            com.whatsapp.jid.Jid r3 = com.whatsapp.jid.Jid.getNullable(r0)
            X.0rv r3 = (X.C15830rv) r3
            java.lang.String r7 = r1.getString(r7)
            java.lang.String r0 = "lastSeen"
            long r5 = r1.getLong(r0)
            java.lang.String r0 = "presence"
            java.lang.String r2 = r1.getString(r0)
            java.lang.String r0 = "app/xmpp/recv/handle_unavailable "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            r0 = 32
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " last:"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " presence: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.14t r0 = r4.A07
            r0.A01(r3)
            r2 = 1
            X.125 r0 = r4.A0B
            com.whatsapp.jid.GroupJid r1 = r0.A02(r3, r5)
            r0.A07(r3, r2)
            if (r1 == 0) goto L_0x07cc
            X.127 r0 = r4.A05
            r0.A04(r1)
            goto L_0x07cc
        L_0x0797:
            java.lang.Object r1 = r15.obj
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.String r0 = r1.getString(r2)
            com.whatsapp.jid.Jid r3 = com.whatsapp.jid.Jid.getNullable(r0)
            X.0rv r3 = (X.C15830rv) r3
            java.lang.String r2 = r1.getString(r7)
            java.lang.String r0 = "app/xmpp/recv/handle_unsubscribe"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r3)
            r0 = 32
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.14t r0 = r4.A07
            r0.A01(r3)
            X.125 r0 = r4.A0B
            r0.A07(r3, r5)
        L_0x07cc:
            X.127 r0 = r4.A05
            r0.A04(r3)
            return
        L_0x07d2:
            android.os.Bundle r1 = r15.getData()
            android.os.Parcelable r5 = r1.getParcelable(r3)
            X.1ci r5 = (X.C30641ci) r5
            java.lang.String r0 = "jidHash"
            byte[] r7 = r1.getByteArray(r0)
            java.lang.Object r6 = r15.obj
            X.27w r6 = (X.C453027w) r6
            X.11o r3 = r4.A0A
            long r1 = r5.A00
            r0 = 2
            X.1d2 r1 = r3.A00(r0, r1)
            if (r1 == 0) goto L_0x07f5
            r0 = 3
            r1.A00(r0)
        L_0x07f5:
            X.1kz r1 = X.C34861kz.A0H
            X.27v r0 = new X.27v
            r0.<init>(r1)
            r2 = 1
            r0.A02 = r2
            r0.A00 = r6
            r0.A02(r7)
            X.27t r1 = r0.A01()
            X.0xz r0 = r4.A06
            r0.A03(r1, r2)
            X.124 r0 = r4.A09
            r0.A02(r5)
            return
        L_0x0813:
            X.0xc r0 = r4.A03
            r0.A00()
            return
        L_0x0819:
            java.lang.Object r1 = r15.obj
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.String r0 = r1.getString(r2)
            com.whatsapp.jid.Jid r5 = com.whatsapp.jid.Jid.getNullable(r0)
            X.0rv r5 = (X.C15830rv) r5
            java.lang.String r2 = r1.getString(r7)
            java.lang.String r0 = "app/xmpp/recv/handle_available "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r5)
            r0 = 32
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.14t r0 = r4.A07
            X.0sH r7 = r0.A01(r5)
            X.125 r6 = r4.A0B
            boolean r3 = r6.A08(r5)
            com.obwhatsapp.yo.yo.checkContactOnline(r5)
            java.util.HashMap r0 = r6.A06
            java.lang.Object r2 = r0.get(r5)
            X.2Cl r2 = (X.AnonymousClass2Cl) r2
            if (r2 != 0) goto L_0x0865
            X.2Cl r2 = new X.2Cl
            r2.<init>()
            r0.put(r5, r2)
        L_0x0865:
            r0 = 1
            r2.A03 = r0
            r0 = 1
            r6.A07(r5, r0)
            if (r3 != 0) goto L_0x0914
            X.0rv r0 = r7.A0E
            if (r0 == 0) goto L_0x0914
            X.1H8 r0 = r4.A02
            r3 = r5
            android.os.Handler r2 = r0.A00
            java.util.HashMap r1 = r0.A06
            java.lang.Object r0 = r1.get(r5)
            if (r0 == 0) goto L_0x0887
            r3 = r0
        L_0x0881:
            r0 = 2
            r2.removeMessages(r0, r3)
            goto L_0x0914
        L_0x0887:
            r1.put(r5, r5)
            goto L_0x0881
        L_0x088b:
            java.lang.Object r1 = r15.obj
            android.os.Bundle r1 = (android.os.Bundle) r1
            java.lang.String r0 = r1.getString(r2)
            com.whatsapp.jid.Jid r5 = com.whatsapp.jid.Jid.getNullable(r0)
            X.0rv r5 = (X.C15830rv) r5
            java.lang.String r0 = r1.getString(r3)
            com.whatsapp.jid.Jid r7 = com.whatsapp.jid.Jid.getNullable(r0)
            java.lang.String r0 = "media"
            int r8 = r1.getInt(r0)
            X.125 r6 = r4.A0B
            java.util.HashMap r0 = r6.A06
            java.lang.Object r3 = r0.get(r5)
            X.2Cl r3 = (X.AnonymousClass2Cl) r3
            if (r3 != 0) goto L_0x08bb
            X.2Cl r3 = new X.2Cl
            r3.<init>()
            r0.put(r5, r3)
        L_0x08bb:
            if (r7 == 0) goto L_0x08e8
            boolean r0 = X.C16030sJ.A0L(r5)
            if (r0 == 0) goto L_0x08e8
            java.util.HashMap r0 = r3.A04
            if (r0 != 0) goto L_0x08ce
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.A04 = r0
        L_0x08ce:
            java.lang.Object r2 = r0.get(r7)
            X.2Cm r2 = (X.C46122Cm) r2
            if (r2 != 0) goto L_0x08e0
            X.2Cm r2 = new X.2Cm
            r2.<init>()
            java.util.HashMap r0 = r3.A04
            r0.put(r7, r2)
        L_0x08e0:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.A01 = r0
            r2.A00 = r8
        L_0x08e8:
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3.A02 = r0
            r3.A00 = r8
            if (r7 != 0) goto L_0x091a
            java.lang.String r2 = r5.getRawString()
        L_0x08f6:
            java.util.HashMap r1 = r6.A05
            java.lang.Object r3 = r1.get(r2)
            com.facebook.redex.RunnableRunnableShape1S0300000_I0_1 r3 = (com.facebook.redex.RunnableRunnableShape1S0300000_I0_1) r3
            if (r3 != 0) goto L_0x090a
            r0 = 40
            com.facebook.redex.RunnableRunnableShape1S0300000_I0_1 r3 = new com.facebook.redex.RunnableRunnableShape1S0300000_I0_1
            r3.<init>(r7, r5, r6, r0)
            r1.put(r2, r3)
        L_0x090a:
            android.os.Handler r2 = r6.A00
            r2.removeCallbacks(r3)
            r0 = 25000(0x61a8, double:1.23516E-319)
            r2.postDelayed(r3, r0)
        L_0x0914:
            X.127 r0 = r4.A05
            r0.A04(r5)
            return
        L_0x091a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r5.getRawString()
            r1.append(r0)
            java.lang.String r0 = r7.getRawString()
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            goto L_0x08f6
        L_0x0932:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0932 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2CM.handleMessage(android.os.Message):void");
    }
}

package X;

/* renamed from: X.11x  reason: invalid class name and case insensitive filesystem */
public class C208711x implements C19420yP {
    public final C15480r5 A00;

    public C208711x(C15480r5 r1) {
        this.A00 = r1;
    }

    public int[] ACW() {
        return new int[]{242, 243, 244, 245};
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public boolean AHS(android.os.Message r20, int r21) {
        /*
            r19 = this;
            r4 = 1
            r0 = 242(0xf2, float:3.39E-43)
            r2 = r19
            r3 = r20
            r1 = r21
            if (r1 != r0) goto L_0x0168
            java.lang.Object r5 = r3.obj
            X.AnonymousClass00B.A06(r5)
            X.1Vv r5 = (X.C28371Vv) r5
            java.lang.String r0 = "pair-device"
            X.1Vv r1 = r5.A0J(r0)
            if (r1 == 0) goto L_0x074b
            java.lang.String r0 = "ref"
            java.util.List r0 = r1.A0O(r0)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x0029:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r1 = r3.next()
            X.1Vv r1 = (X.C28371Vv) r1
            java.lang.String r0 = r1.A0L()
            r10.add(r0)
            r1.A0L()
            goto L_0x0029
        L_0x0040:
            X.0r5 r1 = r2.A00
            java.lang.String r12 = "id"
            r0 = 0
            java.lang.String r11 = r5.A0N(r12, r0)
            X.0xm r1 = r1.A00
            java.lang.Class<X.1CB> r0 = X.AnonymousClass1CB.class
            X.0vg r6 = r1.A00(r0)
            X.1CB r6 = (X.AnonymousClass1CB) r6
            monitor-enter(r6)
            X.0ys r1 = r6.A0K     // Catch:{ all -> 0x074c }
            int r0 = r1.A00()     // Catch:{ all -> 0x074c }
            r9 = 3
            r8 = 2
            if (r0 != r9) goto L_0x0069
            java.lang.String r0 = "companion/registration/refs/reconnected"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x074c }
            r1.A01(r8)     // Catch:{ all -> 0x074c }
            r6.A04()     // Catch:{ all -> 0x074c }
        L_0x0069:
            int r0 = r1.A00()     // Catch:{ all -> 0x074c }
            if (r0 == r8) goto L_0x0076
            java.lang.String r0 = "companion/registration/refs/invalid state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x074c }
            goto L_0x074a
        L_0x0076:
            int r0 = r10.size()     // Catch:{ all -> 0x074c }
            r7 = 6
            if (r0 != r7) goto L_0x0747
            r1.A01(r9)     // Catch:{ all -> 0x074c }
            X.2gW r0 = r6.A0L     // Catch:{ all -> 0x074c }
            X.0ug r3 = r0.A00     // Catch:{ all -> 0x074c }
            X.1lL[] r5 = new X.C35081lL[r9]     // Catch:{ all -> 0x074c }
            X.1ks r2 = X.C34791ks.A00     // Catch:{ all -> 0x074c }
            java.lang.String r0 = "to"
            X.1lL r1 = new X.1lL     // Catch:{ all -> 0x074c }
            r1.<init>((com.whatsapp.jid.Jid) r2, (java.lang.String) r0)     // Catch:{ all -> 0x074c }
            r0 = 0
            r5[r0] = r1     // Catch:{ all -> 0x074c }
            java.lang.String r2 = "type"
            java.lang.String r1 = "result"
            X.1lL r0 = new X.1lL     // Catch:{ all -> 0x074c }
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)     // Catch:{ all -> 0x074c }
            r5[r4] = r0     // Catch:{ all -> 0x074c }
            X.1lL r0 = new X.1lL     // Catch:{ all -> 0x074c }
            r0.<init>((java.lang.String) r12, (java.lang.String) r11)     // Catch:{ all -> 0x074c }
            r5[r8] = r0     // Catch:{ all -> 0x074c }
            java.lang.String r0 = "iq"
            X.1Vv r1 = new X.1Vv     // Catch:{ all -> 0x074c }
            r1.<init>(r0, r5)     // Catch:{ all -> 0x074c }
            r0 = 305(0x131, float:4.27E-43)
            r3.A0D(r1, r0)     // Catch:{ all -> 0x074c }
            java.lang.Runnable r1 = r6.A06     // Catch:{ all -> 0x074c }
            if (r1 == 0) goto L_0x00bc
            X.0sq r0 = r6.A0f     // Catch:{ all -> 0x074c }
            r0.Ac3(r1)     // Catch:{ all -> 0x074c }
        L_0x00bc:
            X.0sq r5 = r6.A0f     // Catch:{ all -> 0x074c }
            r0 = 37
            com.facebook.redex.RunnableRunnableShape6S0100000_I0_5 r3 = new com.facebook.redex.RunnableRunnableShape6S0100000_I0_5     // Catch:{ all -> 0x074c }
            r3.<init>(r6, r0)     // Catch:{ all -> 0x074c }
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            java.lang.String r2 = "CompanionRegistrationManager/refTimeoutRunnable"
            java.lang.Runnable r0 = r5.Ad4(r3, r2, r0)     // Catch:{ all -> 0x074c }
            r6.A06 = r0     // Catch:{ all -> 0x074c }
            java.lang.String r0 = "HmacSHA256"
            javax.crypto.KeyGenerator r0 = javax.crypto.KeyGenerator.getInstance(r0)     // Catch:{ InterruptedException | NoSuchAlgorithmException | ExecutionException -> 0x0161 }
            javax.crypto.SecretKey r0 = r0.generateKey()     // Catch:{ InterruptedException | NoSuchAlgorithmException | ExecutionException -> 0x0161 }
            r6.A09 = r0     // Catch:{ InterruptedException | NoSuchAlgorithmException | ExecutionException -> 0x0161 }
            X.16P r3 = r6.A0S     // Catch:{ InterruptedException | NoSuchAlgorithmException | ExecutionException -> 0x0161 }
            X.11s r2 = r6.A0R     // Catch:{ InterruptedException | NoSuchAlgorithmException | ExecutionException -> 0x0161 }
            r0 = 9
            com.facebook.redex.IDxCallableShape148S0100000_2_I0 r1 = new com.facebook.redex.IDxCallableShape148S0100000_2_I0     // Catch:{ InterruptedException | NoSuchAlgorithmException | ExecutionException -> 0x0161 }
            r1.<init>(r2, r0)     // Catch:{ InterruptedException | NoSuchAlgorithmException | ExecutionException -> 0x0161 }
            java.util.concurrent.ThreadPoolExecutor r0 = r3.A00     // Catch:{ InterruptedException | NoSuchAlgorithmException | ExecutionException -> 0x0161 }
            java.util.concurrent.Future r0 = r0.submit(r1)     // Catch:{ InterruptedException | NoSuchAlgorithmException | ExecutionException -> 0x0161 }
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException | NoSuchAlgorithmException | ExecutionException -> 0x0161 }
            byte[] r0 = (byte[]) r0     // Catch:{ InterruptedException | NoSuchAlgorithmException | ExecutionException -> 0x0161 }
            r6.A0A = r0     // Catch:{ InterruptedException | NoSuchAlgorithmException | ExecutionException -> 0x0161 }
            X.1CG r2 = r6.A0C     // Catch:{ all -> 0x074c }
            monitor-enter(r2)     // Catch:{ all -> 0x074c }
            X.1fK r0 = r2.A02()     // Catch:{ all -> 0x015e }
            X.1fL r0 = r0.A01     // Catch:{ all -> 0x015e }
            if (r0 == 0) goto L_0x0156
            monitor-exit(r2)     // Catch:{ all -> 0x074c }
            X.1mf r12 = r0.A02     // Catch:{ all -> 0x074c }
            r15 = 0
            r11 = 0
        L_0x0105:
            java.lang.String r2 = "%s,%s,%s,%s"
            r0 = 4
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x074c }
            java.lang.Object r0 = r10.get(r11)     // Catch:{ all -> 0x074c }
            r1[r15] = r0     // Catch:{ all -> 0x074c }
            byte[] r0 = r12.A01     // Catch:{ all -> 0x074c }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r8)     // Catch:{ all -> 0x074c }
            r1[r4] = r0     // Catch:{ all -> 0x074c }
            byte[] r0 = r6.A0A     // Catch:{ all -> 0x074c }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r8)     // Catch:{ all -> 0x074c }
            r1[r8] = r0     // Catch:{ all -> 0x074c }
            javax.crypto.SecretKey r0 = r6.A09     // Catch:{ all -> 0x074c }
            byte[] r0 = r0.getEncoded()     // Catch:{ all -> 0x074c }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r8)     // Catch:{ all -> 0x074c }
            r1[r9] = r0     // Catch:{ all -> 0x074c }
            java.lang.String r1 = java.lang.String.format(r2, r1)     // Catch:{ all -> 0x074c }
            int r14 = r11 * 20000
            r0 = 26
            com.facebook.redex.RunnableRunnableShape0S1100000_I0 r13 = new com.facebook.redex.RunnableRunnableShape0S1100000_I0     // Catch:{ all -> 0x074c }
            r13.<init>(r0, r1, r6)     // Catch:{ all -> 0x074c }
            long r2 = (long) r14     // Catch:{ all -> 0x074c }
            java.lang.String r1 = "CompanionRegistrationManager/refChangeRunnable"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x074c }
            r0.<init>(r1)     // Catch:{ all -> 0x074c }
            r0.append(r14)     // Catch:{ all -> 0x074c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x074c }
            java.lang.Runnable r1 = r5.Ad4(r13, r0, r2)     // Catch:{ all -> 0x074c }
            java.util.List r0 = r6.A0g     // Catch:{ all -> 0x074c }
            r0.add(r1)     // Catch:{ all -> 0x074c }
            int r11 = r11 + 1
            if (r11 >= r7) goto L_0x074a
            goto L_0x0105
        L_0x0156:
            java.lang.String r1 = "AuthKeyStore/failed to get client static key pair"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x015e }
            r0.<init>(r1)     // Catch:{ all -> 0x015e }
            throw r0     // Catch:{ all -> 0x015e }
        L_0x015e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x074c }
            throw r0     // Catch:{ all -> 0x074c }
        L_0x0161:
            java.lang.String r0 = "companion/registration/qr/failed to get keys"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x074c }
            goto L_0x0747
        L_0x0168:
            r0 = 243(0xf3, float:3.4E-43)
            if (r1 != r0) goto L_0x042b
            java.lang.Object r6 = r3.obj
            X.AnonymousClass00B.A06(r6)
            X.1Vv r6 = (X.C28371Vv) r6
            java.lang.String r0 = "pair-success"
            X.1Vv r1 = r6.A0J(r0)
            if (r1 == 0) goto L_0x074b
            java.lang.String r7 = "device-identity"
            X.1Vv r5 = r1.A0J(r7)
            java.lang.String r0 = "device"
            X.1Vv r3 = r1.A0J(r0)
            if (r5 == 0) goto L_0x074b
            if (r3 == 0) goto L_0x074b
            X.0r5 r2 = r2.A00
            java.lang.String r11 = "id"
            r1 = 0
            java.lang.String r10 = r6.A0N(r11, r1)
            byte[] r5 = r5.A01
            java.lang.String r0 = "jid"
            java.lang.String r18 = r3.A0N(r0, r1)
            X.0xm r1 = r2.A00
            java.lang.Class<X.1CB> r0 = X.AnonymousClass1CB.class
            X.0vg r6 = r1.A00(r0)
            X.1CB r6 = (X.AnonymousClass1CB) r6
            monitor-enter(r6)
            X.0ys r2 = r6.A0K     // Catch:{ all -> 0x074c }
            int r0 = r2.A00()     // Catch:{ all -> 0x074c }
            r3 = 3
            if (r0 == r3) goto L_0x01b7
            java.lang.String r0 = "companion/registration/pair-success/invalid state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x074c }
            goto L_0x074a
        L_0x01b7:
            r0 = 4
            r2.A01(r0)     // Catch:{ all -> 0x074c }
            if (r5 != 0) goto L_0x01bf
            goto L_0x0742
        L_0x01bf:
            X.2gX r0 = X.C53932gX.A03     // Catch:{ 1bD -> 0x0424 }
            X.1Wm r8 = X.C28541Wm.A0E(r0, r5)     // Catch:{ 1bD -> 0x0424 }
            X.2gX r8 = (X.C53932gX) r8     // Catch:{ 1bD -> 0x0424 }
            r5 = 0
            if (r8 != 0) goto L_0x01cc
            goto L_0x03a4
        L_0x01cc:
            X.1Ww r0 = r8.A02     // Catch:{ all -> 0x074c }
            byte[] r1 = r0.A04()     // Catch:{ all -> 0x074c }
            X.1Ww r0 = r8.A01     // Catch:{ all -> 0x074c }
            byte[] r9 = r0.A04()     // Catch:{ all -> 0x074c }
            javax.crypto.SecretKey r0 = r6.A09     // Catch:{ all -> 0x074c }
            byte[] r0 = r0.getEncoded()     // Catch:{ all -> 0x074c }
            byte[] r0 = X.C40481uC.A00(r9, r0)     // Catch:{ Exception -> 0x039b }
            byte[] r1 = android.util.Base64.encode(r1, r5)     // Catch:{ all -> 0x074c }
            byte[] r0 = android.util.Base64.encode(r0, r5)     // Catch:{ all -> 0x074c }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ all -> 0x074c }
            if (r0 == 0) goto L_0x03a1
            X.27T r8 = X.AnonymousClass27T.A05     // Catch:{ 1bD -> 0x0398 }
            X.1Wm r13 = X.C28541Wm.A0E(r8, r9)     // Catch:{ 1bD -> 0x0398 }
            X.27T r13 = (X.AnonymousClass27T) r13     // Catch:{ 1bD -> 0x0398 }
            X.1Ww r0 = r13.A01     // Catch:{ all -> 0x074c }
            byte[] r12 = r0.A04()     // Catch:{ all -> 0x074c }
            X.1CH r14 = r6.A0J     // Catch:{ all -> 0x074c }
            r9 = 5
            X.1cD r0 = new X.1cD     // Catch:{ all -> 0x074c }
            r0.<init>(r12, r9)     // Catch:{ all -> 0x074c }
            X.1WL r15 = new X.1WL     // Catch:{ all -> 0x074c }
            r15.<init>(r0)     // Catch:{ all -> 0x074c }
            X.0t3 r0 = r14.A03     // Catch:{ all -> 0x074c }
            long r0 = r0.A00()     // Catch:{ all -> 0x074c }
            r16 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r16
            r14.A00 = r0     // Catch:{ all -> 0x074c }
            X.19E r0 = r14.A02     // Catch:{ all -> 0x074c }
            X.11s r0 = r0.A03     // Catch:{ all -> 0x074c }
            X.1mo r0 = r0.A00     // Catch:{ all -> 0x074c }
            X.1nX r0 = r0.A04()     // Catch:{ all -> 0x074c }
            X.1WL r0 = r0.A01     // Catch:{ all -> 0x074c }
            java.lang.String r0 = X.AnonymousClass19E.A04(r0, r15)     // Catch:{ all -> 0x074c }
            r14.A01 = r0     // Catch:{ all -> 0x074c }
            byte[] r15 = r6.A0A     // Catch:{ all -> 0x074c }
            X.1Ww r0 = r13.A02     // Catch:{ all -> 0x074c }
            byte[] r14 = r0.A04()     // Catch:{ all -> 0x074c }
            X.1Ww r0 = r13.A01     // Catch:{ all -> 0x074c }
            byte[] r16 = r0.A04()     // Catch:{ all -> 0x074c }
            byte[][] r1 = new byte[r3][]     // Catch:{ all -> 0x074c }
            byte[] r0 = X.AnonymousClass01S.A0B     // Catch:{ all -> 0x074c }
            r1[r5] = r0     // Catch:{ all -> 0x074c }
            X.1Ww r0 = r13.A03     // Catch:{ all -> 0x074c }
            byte[] r0 = r0.A04()     // Catch:{ all -> 0x074c }
            r1[r4] = r0     // Catch:{ all -> 0x074c }
            r0 = 2
            r1[r0] = r15     // Catch:{ all -> 0x074c }
            byte[] r1 = X.C28641Wx.A04(r1)     // Catch:{ all -> 0x074c }
            byte[][] r15 = new byte[r0][]     // Catch:{ 1ey -> 0x0390 }
            byte[] r0 = new byte[r4]     // Catch:{ 1ey -> 0x0390 }
            r0[r5] = r9     // Catch:{ 1ey -> 0x0390 }
            r15[r5] = r0     // Catch:{ 1ey -> 0x0390 }
            r15[r4] = r16     // Catch:{ 1ey -> 0x0390 }
            byte[] r0 = X.C28641Wx.A04(r15)     // Catch:{ 1ey -> 0x0390 }
            X.1cD r0 = X.C28851Ya.A01(r0)     // Catch:{ 1ey -> 0x0390 }
            boolean r0 = X.C28851Ya.A05(r0, r1, r14)     // Catch:{ all -> 0x074c }
            if (r0 == 0) goto L_0x0395
            r6.A05 = r13     // Catch:{ all -> 0x074c }
            r6.A0B = r12     // Catch:{ all -> 0x074c }
            r2.A01(r9)     // Catch:{ all -> 0x074c }
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.getNullable(r18)     // Catch:{ all -> 0x074c }
            r6.A04 = r0     // Catch:{ all -> 0x074c }
            X.27T r0 = r6.A05     // Catch:{ 1bD -> 0x0389 }
            X.1Ww r0 = r0.A03     // Catch:{ 1bD -> 0x0389 }
            byte[] r1 = r0.A04()     // Catch:{ 1bD -> 0x0389 }
            X.27I r0 = X.AnonymousClass27I.A04     // Catch:{ 1bD -> 0x0389 }
            X.1Wm r5 = X.C28541Wm.A0E(r0, r1)     // Catch:{ 1bD -> 0x0389 }
            X.27I r5 = (X.AnonymousClass27I) r5     // Catch:{ 1bD -> 0x0389 }
            X.16P r9 = r6.A0S     // Catch:{ InterruptedException | ExecutionException -> 0x0382 }
            X.11s r2 = r6.A0R     // Catch:{ InterruptedException | ExecutionException -> 0x0382 }
            r0 = 10
            com.facebook.redex.IDxCallableShape148S0100000_2_I0 r1 = new com.facebook.redex.IDxCallableShape148S0100000_2_I0     // Catch:{ InterruptedException | ExecutionException -> 0x0382 }
            r1.<init>(r2, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0382 }
            java.util.concurrent.ThreadPoolExecutor r0 = r9.A00     // Catch:{ InterruptedException | ExecutionException -> 0x0382 }
            java.util.concurrent.Future r0 = r0.submit(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0382 }
            java.lang.Object r1 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0382 }
            X.1nX r1 = (X.C36431nX) r1     // Catch:{ InterruptedException | ExecutionException -> 0x0382 }
            X.27T r9 = r6.A05     // Catch:{ all -> 0x074c }
            X.1WL r0 = r1.A01     // Catch:{ all -> 0x074c }
            X.1cD r13 = r0.A00     // Catch:{ all -> 0x074c }
            X.1nv r2 = r1.A00     // Catch:{ all -> 0x074c }
            r0 = 4
            byte[][] r12 = new byte[r0][]     // Catch:{ all -> 0x074c }
            byte[] r1 = X.AnonymousClass01S.A0C     // Catch:{ all -> 0x074c }
            r0 = 0
            r12[r0] = r1     // Catch:{ all -> 0x074c }
            X.1Ww r0 = r9.A03     // Catch:{ all -> 0x074c }
            byte[] r0 = r0.A04()     // Catch:{ all -> 0x074c }
            r12[r4] = r0     // Catch:{ all -> 0x074c }
            byte[] r1 = r13.A01     // Catch:{ all -> 0x074c }
            r0 = 2
            r12[r0] = r1     // Catch:{ all -> 0x074c }
            X.1Ww r0 = r9.A01     // Catch:{ all -> 0x074c }
            byte[] r0 = r0.A04()     // Catch:{ all -> 0x074c }
            r12[r3] = r0     // Catch:{ all -> 0x074c }
            byte[] r0 = X.C28641Wx.A04(r12)     // Catch:{ all -> 0x074c }
            X.1Wr r9 = r9.A0U()     // Catch:{ all -> 0x074c }
            X.2gZ r9 = (X.C53952gZ) r9     // Catch:{ all -> 0x074c }
            byte[] r2 = X.C28851Ya.A06(r2, r0)     // Catch:{ all -> 0x074c }
            int r1 = r2.length     // Catch:{ all -> 0x074c }
            r0 = 0
            X.1Ww r2 = X.C28631Ww.A01(r2, r0, r1)     // Catch:{ all -> 0x074c }
            r9.A03()     // Catch:{ all -> 0x074c }
            X.1Wm r1 = r9.A00     // Catch:{ all -> 0x074c }
            X.27T r1 = (X.AnonymousClass27T) r1     // Catch:{ all -> 0x074c }
            int r0 = r1.A00     // Catch:{ all -> 0x074c }
            r0 = r0 | 8
            r1.A00 = r0     // Catch:{ all -> 0x074c }
            r1.A04 = r2     // Catch:{ all -> 0x074c }
            X.1Wm r0 = r9.A02()     // Catch:{ all -> 0x074c }
            X.27T r0 = (X.AnonymousClass27T) r0     // Catch:{ all -> 0x074c }
            r6.A05 = r0     // Catch:{ all -> 0x074c }
            X.1Wr r2 = r0.A0U()     // Catch:{ all -> 0x074c }
            X.2gZ r2 = (X.C53952gZ) r2     // Catch:{ all -> 0x074c }
            r2.A03()     // Catch:{ all -> 0x074c }
            X.1Wm r1 = r2.A00     // Catch:{ all -> 0x074c }
            X.27T r1 = (X.AnonymousClass27T) r1     // Catch:{ all -> 0x074c }
            int r0 = r1.A00     // Catch:{ all -> 0x074c }
            r0 = r0 & -3
            r1.A00 = r0     // Catch:{ all -> 0x074c }
            X.1Ww r0 = r8.A01     // Catch:{ all -> 0x074c }
            r1.A01 = r0     // Catch:{ all -> 0x074c }
            X.1Wm r0 = r2.A02()     // Catch:{ all -> 0x074c }
            byte[] r12 = r0.A02()     // Catch:{ all -> 0x074c }
            int r0 = r5.A02     // Catch:{ all -> 0x074c }
            r6.A01 = r0     // Catch:{ all -> 0x074c }
            int r2 = r5.A01     // Catch:{ all -> 0x074c }
            r6.A00 = r2     // Catch:{ all -> 0x074c }
            long r0 = r5.A03     // Catch:{ all -> 0x074c }
            r6.A02 = r0     // Catch:{ all -> 0x074c }
            X.2gW r0 = r6.A0L     // Catch:{ all -> 0x074c }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x074c }
            X.0ug r5 = r0.A00     // Catch:{ all -> 0x074c }
            X.1lL[] r9 = new X.C35081lL[r4]     // Catch:{ all -> 0x074c }
            java.lang.String r1 = "key-index"
            X.1lL r0 = new X.1lL     // Catch:{ all -> 0x074c }
            r0.<init>((java.lang.String) r1, (java.lang.String) r2)     // Catch:{ all -> 0x074c }
            r8 = 0
            r9[r8] = r0     // Catch:{ all -> 0x074c }
            X.1Vv r2 = new X.1Vv     // Catch:{ all -> 0x074c }
            r2.<init>((java.lang.String) r7, (byte[]) r12, (X.C35081lL[]) r9)     // Catch:{ all -> 0x074c }
            X.1lL[] r1 = new X.C35081lL[r8]     // Catch:{ all -> 0x074c }
            java.lang.String r0 = "pair-device-sign"
            X.1Vv r7 = new X.1Vv     // Catch:{ all -> 0x074c }
            r7.<init>((X.C28371Vv) r2, (java.lang.String) r0, (X.C35081lL[]) r1)     // Catch:{ all -> 0x074c }
            X.1lL[] r3 = new X.C35081lL[r3]     // Catch:{ all -> 0x074c }
            X.1ks r2 = X.C34791ks.A00     // Catch:{ all -> 0x074c }
            java.lang.String r1 = "to"
            X.1lL r0 = new X.1lL     // Catch:{ all -> 0x074c }
            r0.<init>((com.whatsapp.jid.Jid) r2, (java.lang.String) r1)     // Catch:{ all -> 0x074c }
            r3[r8] = r0     // Catch:{ all -> 0x074c }
            java.lang.String r2 = "type"
            java.lang.String r1 = "result"
            X.1lL r0 = new X.1lL     // Catch:{ all -> 0x074c }
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)     // Catch:{ all -> 0x074c }
            r3[r4] = r0     // Catch:{ all -> 0x074c }
            X.1lL r1 = new X.1lL     // Catch:{ all -> 0x074c }
            r1.<init>((java.lang.String) r11, (java.lang.String) r10)     // Catch:{ all -> 0x074c }
            r0 = 2
            r3[r0] = r1     // Catch:{ all -> 0x074c }
            java.lang.String r0 = "iq"
            X.1Vv r1 = new X.1Vv     // Catch:{ all -> 0x074c }
            r1.<init>((X.C28371Vv) r7, (java.lang.String) r0, (X.C35081lL[]) r3)     // Catch:{ all -> 0x074c }
            r0 = 307(0x133, float:4.3E-43)
            r5.A0D(r1, r0)     // Catch:{ all -> 0x074c }
            java.lang.Runnable r1 = r6.A07     // Catch:{ all -> 0x074c }
            if (r1 == 0) goto L_0x036d
            X.0sq r0 = r6.A0f     // Catch:{ all -> 0x074c }
            r0.Ac3(r1)     // Catch:{ all -> 0x074c }
        L_0x036d:
            X.0sq r5 = r6.A0f     // Catch:{ all -> 0x074c }
            r0 = 38
            com.facebook.redex.RunnableRunnableShape6S0100000_I0_5 r3 = new com.facebook.redex.RunnableRunnableShape6S0100000_I0_5     // Catch:{ all -> 0x074c }
            r3.<init>(r6, r0)     // Catch:{ all -> 0x074c }
            r1 = 3000(0xbb8, double:1.482E-320)
            java.lang.String r0 = "CompanionRegistrationManager/serverRegistrationTimeoutRunnable"
            java.lang.Runnable r0 = r5.Ad4(r3, r0, r1)     // Catch:{ all -> 0x074c }
            r6.A07 = r0     // Catch:{ all -> 0x074c }
            goto L_0x074a
        L_0x0382:
            java.lang.String r0 = "companion/registration/pair-success/failed to get identity key pair"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x074c }
            goto L_0x0747
        L_0x0389:
            java.lang.String r0 = "companion/registration/pair-success/failed to parse device identity"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x074c }
            goto L_0x0747
        L_0x0390:
            java.lang.String r0 = "CompanionRegistrationAdvUtil/verifyDeviceIdentityAccountSignature/invalidKeyException"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x074c }
        L_0x0395:
            java.lang.String r0 = "companion/registration/pair-success/account signature verification failed"
            goto L_0x03a6
        L_0x0398:
            java.lang.String r0 = "companion/registration/pair-success/failed to parse device identity"
            goto L_0x03a6
        L_0x039b:
            r1 = move-exception
            java.lang.String r0 = "CompanionRegistrationAdvUtil/verifyDeviceIdentityHMAC/Failed to calculate hmac-sha256"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x074c }
        L_0x03a1:
            java.lang.String r0 = "companion/registration/pair-success/hmac verification failed"
            goto L_0x03a6
        L_0x03a4:
            java.lang.String r0 = "companion/registration/pair-success/invalid device identity hmac"
        L_0x03a6:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x074c }
            r0 = 6
            r2.A01(r0)     // Catch:{ all -> 0x074c }
            X.1CH r2 = r6.A0J     // Catch:{ all -> 0x074c }
            r0 = 401(0x191, double:1.98E-321)
            r2.A00(r4, r0)     // Catch:{ all -> 0x074c }
            X.2gW r0 = r6.A0L     // Catch:{ all -> 0x074c }
            X.0ug r8 = r0.A00     // Catch:{ all -> 0x074c }
            r9 = 2
            X.1lL[] r3 = new X.C35081lL[r9]     // Catch:{ all -> 0x074c }
            java.lang.String r2 = "code"
            r1 = 401(0x191, float:5.62E-43)
            X.1lL r0 = new X.1lL     // Catch:{ all -> 0x074c }
            r0.<init>((java.lang.String) r2, (int) r1)     // Catch:{ all -> 0x074c }
            r12 = 0
            r3[r5] = r0     // Catch:{ all -> 0x074c }
            java.lang.String r2 = "text"
            java.lang.String r1 = "not-authorized"
            X.1lL r0 = new X.1lL     // Catch:{ all -> 0x074c }
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)     // Catch:{ all -> 0x074c }
            r3[r4] = r0     // Catch:{ all -> 0x074c }
            java.lang.String r7 = "error"
            X.1Vv r5 = new X.1Vv     // Catch:{ all -> 0x074c }
            r5.<init>(r7, r3)     // Catch:{ all -> 0x074c }
            r0 = 3
            X.1lL[] r3 = new X.C35081lL[r0]     // Catch:{ all -> 0x074c }
            X.1ks r2 = X.C34791ks.A00     // Catch:{ all -> 0x074c }
            java.lang.String r1 = "to"
            X.1lL r0 = new X.1lL     // Catch:{ all -> 0x074c }
            r0.<init>((com.whatsapp.jid.Jid) r2, (java.lang.String) r1)     // Catch:{ all -> 0x074c }
            r3[r12] = r0     // Catch:{ all -> 0x074c }
            java.lang.String r1 = "type"
            X.1lL r0 = new X.1lL     // Catch:{ all -> 0x074c }
            r0.<init>((java.lang.String) r1, (java.lang.String) r7)     // Catch:{ all -> 0x074c }
            r3[r4] = r0     // Catch:{ all -> 0x074c }
            X.1lL r0 = new X.1lL     // Catch:{ all -> 0x074c }
            r0.<init>((java.lang.String) r11, (java.lang.String) r10)     // Catch:{ all -> 0x074c }
            r3[r9] = r0     // Catch:{ all -> 0x074c }
            java.lang.String r0 = "iq"
            X.1Vv r1 = new X.1Vv     // Catch:{ all -> 0x074c }
            r1.<init>((X.C28371Vv) r5, (java.lang.String) r0, (X.C35081lL[]) r3)     // Catch:{ all -> 0x074c }
            r0 = 306(0x132, float:4.29E-43)
            r8.A0D(r1, r0)     // Catch:{ all -> 0x074c }
            java.lang.Runnable r1 = r6.A08     // Catch:{ all -> 0x074c }
            if (r1 == 0) goto L_0x040f
            X.0sq r0 = r6.A0f     // Catch:{ all -> 0x074c }
            r0.Ac3(r1)     // Catch:{ all -> 0x074c }
        L_0x040f:
            X.0sq r5 = r6.A0f     // Catch:{ all -> 0x074c }
            r0 = 39
            com.facebook.redex.RunnableRunnableShape6S0100000_I0_5 r3 = new com.facebook.redex.RunnableRunnableShape6S0100000_I0_5     // Catch:{ all -> 0x074c }
            r3.<init>(r6, r0)     // Catch:{ all -> 0x074c }
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r0 = "CompanionRegistrationManager/verificationErrorRunnable"
            java.lang.Runnable r0 = r5.Ad4(r3, r0, r1)     // Catch:{ all -> 0x074c }
            r6.A08 = r0     // Catch:{ all -> 0x074c }
            goto L_0x074a
        L_0x0424:
            java.lang.String r0 = "companion/registration/pair-success/failed to parse device identity HMAC"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x074c }
            goto L_0x0747
        L_0x042b:
            r0 = 244(0xf4, float:3.42E-43)
            if (r1 != r0) goto L_0x0717
            X.0r5 r0 = r2.A00
            X.0xm r1 = r0.A00
            java.lang.Class<X.1CB> r0 = X.AnonymousClass1CB.class
            X.0vg r2 = r1.A00(r0)
            X.1CB r2 = (X.AnonymousClass1CB) r2
            monitor-enter(r2)
            X.0ys r3 = r2.A0K     // Catch:{ all -> 0x0714 }
            int r0 = r3.A00()     // Catch:{ all -> 0x0714 }
            r10 = 5
            if (r0 == r10) goto L_0x044c
            java.lang.String r0 = "companion/registration/complete/invalid state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0714 }
            goto L_0x0712
        L_0x044c:
            X.124 r0 = r2.A0b     // Catch:{ all -> 0x0714 }
            r0.A00()     // Catch:{ all -> 0x0714 }
            X.0xk r7 = r2.A0a     // Catch:{ all -> 0x0714 }
            r5 = 0
            r7.A0D(r5)     // Catch:{ all -> 0x0714 }
            r2.A04()     // Catch:{ all -> 0x0714 }
            java.lang.Runnable r1 = r2.A07     // Catch:{ all -> 0x0714 }
            if (r1 == 0) goto L_0x0463
            X.0sq r0 = r2.A0f     // Catch:{ all -> 0x0714 }
            r0.Ac3(r1)     // Catch:{ all -> 0x0714 }
        L_0x0463:
            r0 = 7
            r3.A01(r0)     // Catch:{ all -> 0x0714 }
            com.whatsapp.jid.DeviceJid r9 = r2.A04     // Catch:{ all -> 0x0714 }
            X.AnonymousClass00B.A06(r9)     // Catch:{ all -> 0x0714 }
            X.0rz r6 = r2.A0Q     // Catch:{ all -> 0x0714 }
            java.lang.String r0 = r9.user     // Catch:{ all -> 0x0714 }
            r6.A0v(r0)     // Catch:{ all -> 0x0714 }
            java.lang.String r0 = r9.user     // Catch:{ all -> 0x0714 }
            java.lang.String r11 = X.C39851tA.A02(r0)     // Catch:{ all -> 0x0714 }
            X.AnonymousClass00B.A06(r11)     // Catch:{ all -> 0x0714 }
            java.lang.String r3 = r9.user     // Catch:{ all -> 0x0714 }
            if (r3 != 0) goto L_0x0482
            r1 = 0
            goto L_0x048a
        L_0x0482:
            java.lang.String r1 = "\\D"
            java.lang.String r0 = ""
            java.lang.String r1 = r3.replaceAll(r1, r0)     // Catch:{ all -> 0x0714 }
        L_0x048a:
            X.AnonymousClass00B.A06(r1)     // Catch:{ all -> 0x0714 }
            int r0 = r11.length()     // Catch:{ all -> 0x0714 }
            java.lang.String r8 = r1.substring(r0)     // Catch:{ all -> 0x0714 }
            r6.A19(r11, r8)     // Catch:{ all -> 0x0714 }
            r6.A1L(r5)     // Catch:{ all -> 0x0714 }
            r6.A1K(r5)     // Catch:{ all -> 0x0714 }
            X.1Bw r1 = r2.A0M     // Catch:{ all -> 0x0714 }
            byte r0 = r9.device     // Catch:{ all -> 0x0714 }
            r1.A00(r0)     // Catch:{ all -> 0x0714 }
            X.11R r12 = r2.A0N     // Catch:{ all -> 0x0714 }
            X.27T r0 = r2.A05     // Catch:{ all -> 0x0714 }
            byte[] r1 = r0.A02()     // Catch:{ all -> 0x0714 }
            r0 = 3
            java.lang.String r3 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x0714 }
            android.content.SharedPreferences r0 = r12.A00()     // Catch:{ all -> 0x0714 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x0714 }
            java.lang.String r0 = "adv_signed_identity"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r3)     // Catch:{ all -> 0x0714 }
            r0.apply()     // Catch:{ all -> 0x0714 }
            java.lang.String r0 = r9.user     // Catch:{ all -> 0x0714 }
            com.obwhatsapp.Me r1 = new com.obwhatsapp.Me     // Catch:{ all -> 0x0714 }
            r1.<init>(r11, r8, r0)     // Catch:{ all -> 0x0714 }
            X.0sK r8 = r2.A0D     // Catch:{ all -> 0x0714 }
            r8.A0B()     // Catch:{ all -> 0x0714 }
            java.lang.String r0 = "me"
            boolean r0 = r8.A0H(r1, r0)     // Catch:{ all -> 0x0714 }
            if (r0 != 0) goto L_0x04e1
            java.lang.String r0 = "companion/registration/complete/save me object failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0714 }
            r2.A05()     // Catch:{ all -> 0x0714 }
            goto L_0x0712
        L_0x04e1:
            r8.A0B()     // Catch:{ all -> 0x0714 }
            r8.A0D(r1)     // Catch:{ all -> 0x0714 }
            X.12B r1 = r2.A0c     // Catch:{ all -> 0x0714 }
            com.whatsapp.jid.UserJid r0 = r9.getUserJid()     // Catch:{ all -> 0x0714 }
            r1.A01(r0, r5, r4)     // Catch:{ all -> 0x0714 }
            X.0ym r0 = r2.A0T     // Catch:{ all -> 0x0714 }
            r0.A00()     // Catch:{ all -> 0x0714 }
            X.0vy r1 = r2.A0X     // Catch:{ all -> 0x0714 }
            boolean r0 = r8.A0G()     // Catch:{ all -> 0x0714 }
            X.18r r3 = r1.A07     // Catch:{ all -> 0x0714 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0714 }
            r0 = 12027(0x2efb, float:1.6853E-41)
            r3.A02(r1, r0, r5)     // Catch:{ all -> 0x0714 }
            r3.A02(r1, r0, r4)     // Catch:{ all -> 0x0714 }
            r0 = 2
            byte[][] r1 = new byte[r0][]     // Catch:{ 1ey -> 0x0709 }
            byte[] r0 = new byte[r4]     // Catch:{ 1ey -> 0x0709 }
            r0[r5] = r10     // Catch:{ 1ey -> 0x0709 }
            r1[r5] = r0     // Catch:{ 1ey -> 0x0709 }
            byte[] r0 = r2.A0B     // Catch:{ 1ey -> 0x0709 }
            r1[r4] = r0     // Catch:{ 1ey -> 0x0709 }
            byte[] r0 = X.C28641Wx.A04(r1)     // Catch:{ 1ey -> 0x0709 }
            X.1cD r0 = X.C28851Ya.A01(r0)     // Catch:{ 1ey -> 0x0709 }
            X.1WL r10 = new X.1WL     // Catch:{ all -> 0x0714 }
            r10.<init>(r0)     // Catch:{ all -> 0x0714 }
            X.16P r3 = r2.A0S     // Catch:{ all -> 0x0714 }
            r0 = 31
            com.facebook.redex.RunnableRunnableShape0S0300000_I0 r1 = new com.facebook.redex.RunnableRunnableShape0S0300000_I0     // Catch:{ all -> 0x0714 }
            r1.<init>(r2, r9, r10, r0)     // Catch:{ all -> 0x0714 }
            java.util.concurrent.ThreadPoolExecutor r0 = r3.A00     // Catch:{ all -> 0x0714 }
            r0.submit(r1)     // Catch:{ all -> 0x0714 }
            int r3 = r2.A01     // Catch:{ all -> 0x0714 }
            android.content.SharedPreferences$Editor r1 = r6.A0K()     // Catch:{ all -> 0x0714 }
            java.lang.String r0 = "adv_raw_id"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r3)     // Catch:{ all -> 0x0714 }
            r0.apply()     // Catch:{ all -> 0x0714 }
            int r3 = r2.A00     // Catch:{ all -> 0x0714 }
            android.content.SharedPreferences$Editor r1 = r6.A0K()     // Catch:{ all -> 0x0714 }
            java.lang.String r0 = "adv_current_key_index"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r3)     // Catch:{ all -> 0x0714 }
            r0.apply()     // Catch:{ all -> 0x0714 }
            long r0 = r2.A02     // Catch:{ all -> 0x0714 }
            android.content.SharedPreferences$Editor r6 = r6.A0K()     // Catch:{ all -> 0x0714 }
            java.lang.String r3 = "adv_timestamp_sec"
            android.content.SharedPreferences$Editor r0 = r6.putLong(r3, r0)     // Catch:{ all -> 0x0714 }
            r0.apply()     // Catch:{ all -> 0x0714 }
            com.whatsapp.jid.UserJid r1 = r9.getUserJid()     // Catch:{ all -> 0x0714 }
            boolean r0 = r7.A0z     // Catch:{ all -> 0x0714 }
            if (r0 == 0) goto L_0x0568
            r7.A05 = r1     // Catch:{ all -> 0x0714 }
        L_0x0568:
            X.0xa r0 = r2.A0d     // Catch:{ all -> 0x0714 }
            r0.A04(r5)     // Catch:{ all -> 0x0714 }
            X.1C5 r6 = new X.1C5     // Catch:{ all -> 0x0714 }
            r6.<init>()     // Catch:{ all -> 0x0714 }
            r8.A0B()     // Catch:{ all -> 0x0714 }
            X.1ZT r0 = r8.A05     // Catch:{ all -> 0x0714 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x0714 }
            com.whatsapp.jid.DeviceJid r3 = r0.getPrimaryDevice()     // Catch:{ all -> 0x0714 }
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0714 }
            r6.put(r3, r0)     // Catch:{ all -> 0x0714 }
            X.0vs r1 = r6.build()     // Catch:{ all -> 0x0714 }
            X.0yO r0 = r2.A0U     // Catch:{ all -> 0x0714 }
            r0.A0D(r1, r5, r5)     // Catch:{ all -> 0x0714 }
            r7.A04()     // Catch:{ all -> 0x0714 }
            java.lang.Iterable r0 = r2.A01()     // Catch:{ all -> 0x0714 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0714 }
        L_0x059b:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0714 }
            if (r0 == 0) goto L_0x05ab
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0714 }
            X.28A r0 = (X.AnonymousClass28A) r0     // Catch:{ all -> 0x0714 }
            r0.A03()     // Catch:{ all -> 0x0714 }
            goto L_0x059b
        L_0x05ab:
            X.11W r9 = r2.A0H     // Catch:{ all -> 0x0714 }
            java.util.concurrent.atomic.AtomicInteger r0 = r9.A0A     // Catch:{ all -> 0x0714 }
            r0.set(r5)     // Catch:{ all -> 0x0714 }
            X.1WD r3 = new X.1WD     // Catch:{ all -> 0x0714 }
            r3.<init>()     // Catch:{ all -> 0x0714 }
            X.11U r6 = r9.A02     // Catch:{ all -> 0x0714 }
            X.1WD r12 = new X.1WD     // Catch:{ all -> 0x0714 }
            r12.<init>()     // Catch:{ all -> 0x0714 }
            r1 = 4
            com.facebook.redex.IDxNConsumerShape153S0100000_2_I0 r0 = new com.facebook.redex.IDxNConsumerShape153S0100000_2_I0     // Catch:{ all -> 0x0714 }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x0714 }
            r12.A00(r0)     // Catch:{ all -> 0x0714 }
            X.2dp r0 = new X.2dp     // Catch:{ all -> 0x0714 }
            r0.<init>(r12, r6)     // Catch:{ all -> 0x0714 }
            X.2dm r1 = r6.A03     // Catch:{ all -> 0x0714 }
            monitor-enter(r1)     // Catch:{ all -> 0x0714 }
            r1.A00 = r0     // Catch:{ all -> 0x0706 }
            monitor-exit(r1)     // Catch:{ all -> 0x0714 }
            r1 = 5
            com.facebook.redex.IDxNConsumerShape153S0100000_2_I0 r0 = new com.facebook.redex.IDxNConsumerShape153S0100000_2_I0     // Catch:{ all -> 0x0714 }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x0714 }
            r12.A00(r0)     // Catch:{ all -> 0x0714 }
            X.11R r0 = r6.A05     // Catch:{ JSONException -> 0x0604 }
            org.json.JSONObject r6 = r0.A01()     // Catch:{ JSONException -> 0x0604 }
            android.content.SharedPreferences r1 = r0.A00()     // Catch:{ JSONException -> 0x0604 }
            java.lang.String r0 = "HAS_COMPANION_HISTORY_SYNC_FAILED"
            boolean r0 = r1.getBoolean(r0, r5)     // Catch:{ JSONException -> 0x0604 }
            if (r0 == 0) goto L_0x05f3
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ JSONException -> 0x0604 }
            r12.A02(r0)     // Catch:{ JSONException -> 0x0604 }
            goto L_0x0609
        L_0x05f3:
            if (r6 == 0) goto L_0x0609
            java.lang.String r0 = "sync_type"
            int r0 = r6.getInt(r0)     // Catch:{ JSONException -> 0x0604 }
            if (r0 <= 0) goto L_0x0609
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ JSONException -> 0x0604 }
            r12.A02(r0)     // Catch:{ JSONException -> 0x0604 }
            goto L_0x0609
        L_0x0604:
            java.lang.String r0 = "ReceiveHistorySyncManager/ unable to parse history sync companion state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0714 }
        L_0x0609:
            X.11S r8 = r9.A01     // Catch:{ all -> 0x0714 }
            java.lang.String r0 = "CompanionSyncdBootstrapManager/startCriticalBootstrapPhase started"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0714 }
            X.1WD r10 = new X.1WD     // Catch:{ all -> 0x0714 }
            r10.<init>()     // Catch:{ all -> 0x0714 }
            r1 = 2
            com.facebook.redex.IDxNConsumerShape153S0100000_2_I0 r0 = new com.facebook.redex.IDxNConsumerShape153S0100000_2_I0     // Catch:{ all -> 0x0714 }
            r0.<init>(r8, r1)     // Catch:{ all -> 0x0714 }
            r10.A00(r0)     // Catch:{ all -> 0x0714 }
            X.0sK r0 = r8.A00     // Catch:{ all -> 0x0714 }
            boolean r0 = r0.A0G()     // Catch:{ all -> 0x0714 }
            if (r0 != 0) goto L_0x0643
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0714 }
        L_0x0628:
            r10.A02(r0)     // Catch:{ all -> 0x0714 }
        L_0x062b:
            X.11V r8 = r9.A03     // Catch:{ all -> 0x0714 }
            X.1WD r11 = new X.1WD     // Catch:{ all -> 0x0714 }
            r11.<init>()     // Catch:{ all -> 0x0714 }
            X.2ga r0 = new X.2ga     // Catch:{ all -> 0x0714 }
            r0.<init>()     // Catch:{ all -> 0x0714 }
            r11.A00(r0)     // Catch:{ all -> 0x0714 }
            X.2dt r0 = new X.2dt     // Catch:{ all -> 0x0714 }
            r0.<init>(r11, r8)     // Catch:{ all -> 0x0714 }
            X.2dr r6 = r8.A01     // Catch:{ all -> 0x0714 }
            monitor-enter(r6)     // Catch:{ all -> 0x0714 }
            goto L_0x0682
        L_0x0643:
            X.11R r7 = r8.A03     // Catch:{ all -> 0x0714 }
            android.content.SharedPreferences r0 = r7.A00()     // Catch:{ all -> 0x0714 }
            java.lang.String r6 = "companion_syncd_critical_bootstrap_state"
            int r0 = r0.getInt(r6, r5)     // Catch:{ all -> 0x0714 }
            if (r0 == 0) goto L_0x0663
            android.content.SharedPreferences r0 = r7.A00()     // Catch:{ all -> 0x0714 }
            int r7 = r0.getInt(r6, r5)     // Catch:{ all -> 0x0714 }
            r6 = 3
            r0 = 0
            if (r7 < r6) goto L_0x065e
            r0 = 1
        L_0x065e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0714 }
            goto L_0x0628
        L_0x0663:
            X.2gb r6 = new X.2gb     // Catch:{ all -> 0x0714 }
            r6.<init>(r10, r8)     // Catch:{ all -> 0x0714 }
            X.11Q r0 = r8.A01     // Catch:{ all -> 0x0714 }
            r0.A02(r6)     // Catch:{ all -> 0x0714 }
            com.facebook.redex.IDxNConsumerShape39S0200000_2_I0 r0 = new com.facebook.redex.IDxNConsumerShape39S0200000_2_I0     // Catch:{ all -> 0x0714 }
            r0.<init>(r6, r5, r8)     // Catch:{ all -> 0x0714 }
            r10.A00(r0)     // Catch:{ all -> 0x0714 }
            X.0sq r7 = r8.A05     // Catch:{ all -> 0x0714 }
            r6 = 19
            com.facebook.redex.RunnableRunnableShape6S0100000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape6S0100000_I0_5     // Catch:{ all -> 0x0714 }
            r0.<init>(r8, r6)     // Catch:{ all -> 0x0714 }
            r7.Acl(r0)     // Catch:{ all -> 0x0714 }
            goto L_0x062b
        L_0x0682:
            r6.A00 = r0     // Catch:{ all -> 0x0703 }
            monitor-exit(r6)     // Catch:{ all -> 0x0714 }
            r6 = 6
            com.facebook.redex.IDxNConsumerShape153S0100000_2_I0 r0 = new com.facebook.redex.IDxNConsumerShape153S0100000_2_I0     // Catch:{ all -> 0x0714 }
            r0.<init>(r8, r6)     // Catch:{ all -> 0x0714 }
            r11.A00(r0)     // Catch:{ all -> 0x0714 }
            java.lang.Object r7 = r8.A04     // Catch:{ all -> 0x0714 }
            monitor-enter(r7)     // Catch:{ all -> 0x0714 }
            X.11R r0 = r8.A02     // Catch:{ all -> 0x0700 }
            android.content.SharedPreferences r6 = r0.A00()     // Catch:{ all -> 0x0700 }
            java.lang.String r0 = "has_received_security_notification_setting"
            boolean r0 = r6.getBoolean(r0, r5)     // Catch:{ all -> 0x0700 }
            if (r0 == 0) goto L_0x06a4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0700 }
            r11.A02(r0)     // Catch:{ all -> 0x0700 }
        L_0x06a4:
            monitor-exit(r7)     // Catch:{ all -> 0x0700 }
            com.facebook.redex.IDxNConsumerShape153S0100000_2_I0 r0 = new com.facebook.redex.IDxNConsumerShape153S0100000_2_I0     // Catch:{ all -> 0x0714 }
            r0.<init>(r9, r4)     // Catch:{ all -> 0x0714 }
            r12.A00(r0)     // Catch:{ all -> 0x0714 }
            com.facebook.redex.IDxNConsumerShape153S0100000_2_I0 r0 = new com.facebook.redex.IDxNConsumerShape153S0100000_2_I0     // Catch:{ all -> 0x0714 }
            r0.<init>(r9, r4)     // Catch:{ all -> 0x0714 }
            r10.A00(r0)     // Catch:{ all -> 0x0714 }
            com.facebook.redex.IDxNConsumerShape153S0100000_2_I0 r0 = new com.facebook.redex.IDxNConsumerShape153S0100000_2_I0     // Catch:{ all -> 0x0714 }
            r0.<init>(r9, r4)     // Catch:{ all -> 0x0714 }
            r11.A00(r0)     // Catch:{ all -> 0x0714 }
            r0 = 3
            X.1WD[] r0 = new X.AnonymousClass1WD[r0]     // Catch:{ all -> 0x0714 }
            r0[r5] = r10     // Catch:{ all -> 0x0714 }
            r0[r4] = r12     // Catch:{ all -> 0x0714 }
            r0[r1] = r11     // Catch:{ all -> 0x0714 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x0714 }
            X.1XU r5 = new X.1XU     // Catch:{ all -> 0x0714 }
            r5.<init>(r0)     // Catch:{ all -> 0x0714 }
            X.0sq r7 = r9.A09     // Catch:{ all -> 0x0714 }
            r13 = 14
            com.facebook.redex.RunnableRunnableShape0S0400000_I0 r8 = new com.facebook.redex.RunnableRunnableShape0S0400000_I0     // Catch:{ all -> 0x0714 }
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0714 }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0714 }
            X.0s5 r1 = r9.A00     // Catch:{ all -> 0x0714 }
            X.0tC r0 = X.C15910s6.A1b     // Catch:{ all -> 0x0714 }
            int r0 = r1.A02(r0)     // Catch:{ all -> 0x0714 }
            long r0 = (long) r0     // Catch:{ all -> 0x0714 }
            long r0 = r6.toMillis(r0)     // Catch:{ all -> 0x0714 }
            java.lang.String r6 = "CompanionBootstrapManager/critical-bootstrap"
            java.lang.Runnable r6 = r7.Ad4(r8, r6, r0)     // Catch:{ all -> 0x0714 }
            r1 = 0
            com.facebook.redex.IDxNConsumerShape15S0300000_1_I0 r0 = new com.facebook.redex.IDxNConsumerShape15S0300000_1_I0     // Catch:{ all -> 0x0714 }
            r0.<init>(r6, r9, r3, r1)     // Catch:{ all -> 0x0714 }
            r5.A00(r0)     // Catch:{ all -> 0x0714 }
            r1 = 7
            com.facebook.redex.IDxNConsumerShape153S0100000_2_I0 r0 = new com.facebook.redex.IDxNConsumerShape153S0100000_2_I0     // Catch:{ all -> 0x0714 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0714 }
            r3.A00(r0)     // Catch:{ all -> 0x0714 }
            goto L_0x0712
        L_0x0700:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0700 }
            goto L_0x0708
        L_0x0703:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0714 }
            goto L_0x0708
        L_0x0706:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0714 }
        L_0x0708:
            throw r0     // Catch:{ all -> 0x0714 }
        L_0x0709:
            java.lang.String r0 = "companion/registration/complete/failed to save primary public key"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0714 }
            r0 = 0
            r2.A08(r0, r4, r4)     // Catch:{ all -> 0x0714 }
        L_0x0712:
            monitor-exit(r2)
            return r4
        L_0x0714:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0717:
            r0 = 245(0xf5, float:3.43E-43)
            if (r1 != r0) goto L_0x074f
            X.0r5 r0 = r2.A00
            X.0xm r1 = r0.A00
            java.lang.Class<X.1CB> r0 = X.AnonymousClass1CB.class
            X.0vg r6 = r1.A00(r0)
            X.1CB r6 = (X.AnonymousClass1CB) r6
            monitor-enter(r6)
            X.1CH r3 = r6.A0J     // Catch:{ all -> 0x074c }
            r2 = 2
            r0 = 516(0x204, double:2.55E-321)
            r3.A00(r2, r0)     // Catch:{ all -> 0x074c }
            X.0ys r0 = r6.A0K     // Catch:{ all -> 0x074c }
            int r1 = r0.A00()     // Catch:{ all -> 0x074c }
            r0 = 5
            if (r1 == r0) goto L_0x0747
            r0 = 6
            if (r1 == r0) goto L_0x0747
            java.lang.String r0 = "companion/registration/complete/invalid state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x074c }
            goto L_0x074a
        L_0x0742:
            java.lang.String r0 = "companion/registration/pair-success/invalid device identity"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x074c }
        L_0x0747:
            r6.A05()     // Catch:{ all -> 0x074c }
        L_0x074a:
            monitor-exit(r6)
        L_0x074b:
            return r4
        L_0x074c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x074f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208711x.AHS(android.os.Message, int):boolean");
    }
}

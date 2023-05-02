package com.facebook.redex;

public class RunnableRunnableShape7S0200000_I0_5 implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public RunnableRunnableShape7S0200000_I0_5(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0641, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0642, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r0 = r5.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0683, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0684, code lost:
        com.whatsapp.util.Log.e(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x0687, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0688, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0689, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r0 = r6.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x068e, code lost:
        r0.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0691, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0779, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x077c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        r0.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0253, code lost:
        if (r3.A00.A05() == false) goto L_0x0255;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0683 A[ExcHandler: Error | RuntimeException (r1v9 'e' java.lang.Throwable A[CUSTOM_DECLARE])] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r2 = r19
            int r0 = r2.A02
            switch(r0) {
                case 0: goto L_0x0654;
                case 1: goto L_0x0648;
                case 2: goto L_0x0648;
                case 3: goto L_0x061a;
                case 4: goto L_0x030d;
                case 5: goto L_0x060b;
                case 6: goto L_0x05f1;
                case 7: goto L_0x0576;
                case 8: goto L_0x06de;
                case 9: goto L_0x02ac;
                case 10: goto L_0x06a9;
                case 11: goto L_0x0568;
                case 12: goto L_0x0552;
                case 13: goto L_0x0209;
                case 14: goto L_0x0521;
                case 15: goto L_0x04e8;
                case 16: goto L_0x01d4;
                case 17: goto L_0x04d5;
                case 18: goto L_0x01a5;
                case 19: goto L_0x04c9;
                case 20: goto L_0x017e;
                case 21: goto L_0x014d;
                case 22: goto L_0x04ae;
                case 23: goto L_0x0473;
                case 24: goto L_0x0465;
                case 25: goto L_0x0114;
                case 26: goto L_0x0108;
                case 27: goto L_0x0421;
                case 28: goto L_0x00dc;
                case 29: goto L_0x03fc;
                case 30: goto L_0x00ba;
                case 31: goto L_0x0007;
                case 32: goto L_0x03e2;
                case 33: goto L_0x03d4;
                case 34: goto L_0x0007;
                case 35: goto L_0x0098;
                case 36: goto L_0x0076;
                case 37: goto L_0x0054;
                case 38: goto L_0x03c4;
                case 39: goto L_0x03b2;
                case 40: goto L_0x0037;
                case 41: goto L_0x0037;
                case 42: goto L_0x03a4;
                case 43: goto L_0x0398;
                case 44: goto L_0x0007;
                case 45: goto L_0x0015;
                case 46: goto L_0x03d4;
                case 47: goto L_0x0386;
                case 48: goto L_0x0373;
                case 49: goto L_0x035d;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r2.A00
            X.0ul r0 = (X.C17240ul) r0
            java.lang.Object r1 = r2.A01
            X.0rv r1 = (X.C15830rv) r1
            X.18O r0 = r0.A0j
        L_0x0011:
            r0.A00(r1)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r0 = r2.A00
            X.0ul r0 = (X.C17240ul) r0
            java.lang.Object r2 = r2.A01
            X.0sL r2 = (X.C16050sL) r2
            X.18R r0 = r0.A0k
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0027:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.1VD r0 = (X.AnonymousClass1VD) r0
            r0.A01(r2)
            goto L_0x0027
        L_0x0037:
            java.lang.Object r0 = r2.A00
            X.0ul r0 = (X.C17240ul) r0
            java.lang.Object r4 = r2.A01
            java.util.Collection r4 = (java.util.Collection) r4
            X.0xz r1 = r0.A0I
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0014
            r4.size()
            X.1kz r3 = X.C34861kz.A05
            X.27w r2 = X.C453027w.A0E
            r5 = 1
            r6 = 0
            r1.A02(r2, r3, r4, r5, r6)
            return
        L_0x0054:
            java.lang.Object r0 = r2.A00
            X.0ul r0 = (X.C17240ul) r0
            java.lang.Object r2 = r2.A01
            X.0sL r2 = (X.C16050sL) r2
            X.18R r0 = r0.A0k
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0066:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.1VD r0 = (X.AnonymousClass1VD) r0
            r0.A04(r2)
            goto L_0x0066
        L_0x0076:
            java.lang.Object r0 = r2.A00
            X.0ul r0 = (X.C17240ul) r0
            java.lang.Object r2 = r2.A01
            X.0sL r2 = (X.C16050sL) r2
            X.18R r0 = r0.A0k
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0088:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.1VD r0 = (X.AnonymousClass1VD) r0
            r0.A02(r2)
            goto L_0x0088
        L_0x0098:
            java.lang.Object r0 = r2.A00
            X.0ul r0 = (X.C17240ul) r0
            java.lang.Object r2 = r2.A01
            X.0sL r2 = (X.C16050sL) r2
            X.18R r0 = r0.A0k
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x00aa:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.1VD r0 = (X.AnonymousClass1VD) r0
            r0.A03(r2)
            goto L_0x00aa
        L_0x00ba:
            java.lang.Object r0 = r2.A00
            X.0ul r0 = (X.C17240ul) r0
            java.lang.Object r2 = r2.A01
            com.whatsapp.jid.GroupJid r2 = (com.whatsapp.jid.GroupJid) r2
            X.15g r0 = r0.A0m
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x00cc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.2Bm r0 = (X.C45882Bm) r0
            r0.A01(r2)
            goto L_0x00cc
        L_0x00dc:
            java.lang.Object r4 = r2.A00
            com.obwhatsapp.group.GroupChatInfoActivity r4 = (com.obwhatsapp.group.GroupChatInfoActivity) r4
            java.lang.Object r3 = r2.A01
            com.whatsapp.jid.Jid r3 = (com.whatsapp.jid.Jid) r3
            X.0pd r2 = r4.A0C
            r1 = 1071(0x42f, float:1.501E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0014
            if (r3 == 0) goto L_0x0014
            boolean r0 = r3 instanceof X.C16060sN
            if (r0 == 0) goto L_0x0014
            X.0sO r0 = r4.A0C
            X.0sN r3 = (X.C16060sN) r3
            boolean r0 = r0.A0C(r3)
            if (r0 != 0) goto L_0x0014
            X.1BL r2 = r4.A1V
            r1 = 4
            r0 = 0
            r2.A00(r1, r0)
            return
        L_0x0108:
            java.lang.Object r0 = r2.A00
            X.18M r0 = (X.AnonymousClass18M) r0
            java.lang.Object r1 = r2.A01
            X.0rv r1 = (X.C15830rv) r1
            X.18O r0 = r0.A06
            goto L_0x0011
        L_0x0114:
            java.lang.Object r4 = r2.A00
            X.2OL r4 = (X.AnonymousClass2OL) r4
            int r1 = r4.A03()
            r0 = 2
            if (r1 == r0) goto L_0x013c
            X.0tP r0 = r4.A01
            X.0tV r0 = r0.A04
            if (r0 == 0) goto L_0x013c
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Handler r3 = new android.os.Handler
            r3.<init>(r0)
            r1 = 21
            com.facebook.redex.RunnableRunnableShape9S0100000_I0_8 r0 = new com.facebook.redex.RunnableRunnableShape9S0100000_I0_8
            r0.<init>(r4, r1)
            r3.post(r0)
            r0 = 1
            r4.A06(r0)
        L_0x013c:
            java.lang.Object r0 = r2.A01
            android.os.Handler r0 = (android.os.Handler) r0
            r0.removeCallbacks(r2)
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 == 0) goto L_0x0014
            r0.quit()
            return
        L_0x014d:
            java.lang.Object r7 = r2.A00
            X.2Od r7 = (X.C48602Od) r7
            java.lang.Object r0 = r2.A01
            X.2Oi r6 = r7.A0C
            if (r6 == 0) goto L_0x0014
            X.1rK r5 = r7.A0A
            X.2Oh r4 = r7.A0B
            int r1 = r4.A00()
            monitor-enter(r0)
            monitor-exit(r0)
            r0 = 4
            java.lang.String r3 = ""
            if (r1 != r0) goto L_0x0692
            X.0tz r0 = r7.A07
            android.content.Context r2 = r0.A00
            X.0sP r1 = r7.A06
            X.14t r0 = r7.A09
            java.lang.String r0 = X.C48662Oj.A00(r2, r1, r0, r5, r4)
            if (r0 == 0) goto L_0x0175
            r3 = r0
        L_0x0175:
            boolean r1 = r4.A08()
            r0 = 1
            r6.A00(r3, r1, r0)
            return
        L_0x017e:
            java.lang.Object r1 = r2.A00
            X.2Ob r1 = (X.C48592Ob) r1
            java.lang.Object r3 = r2.A01
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0 = 0
            r1.A00 = r0
            java.lang.String r2 = r3.toString()
            com.obwhatsapp.emoji.search.EmojiSearchContainer r1 = r1.A02
            java.lang.String r0 = r1.A0D
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0014
            int r0 = r1.getVisibility()
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = r3.toString()
            r1.A00(r0)
            return
        L_0x01a5:
            java.lang.Object r0 = r2.A00
            X.0vP r0 = (X.C17640vP) r0
            java.lang.Object r1 = r2.A01
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1
            X.01D r0 = r0.A02
            java.lang.Object r0 = r0.get()
            X.0tJ r0 = (X.C16590tJ) r0
            com.whatsapp.jid.UserJid r2 = r1.getUserJid()
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x01c1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r1.next()
            X.22h r0 = (X.C439822h) r0
            r0.A01(r2)
            r0.A00(r2)
            goto L_0x01c1
        L_0x01d4:
            java.lang.Object r4 = r2.A00
            com.obwhatsapp.data.device.DeviceChangeManager r4 = (com.obwhatsapp.data.device.DeviceChangeManager) r4
            java.lang.Object r0 = r2.A01
            X.0v0 r0 = (X.C17390v0) r0
            X.1Ub r3 = r0.iterator()
        L_0x01e0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r1 = r3.next()
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1
            X.0xT r0 = r4.A07
            java.util.concurrent.locks.Lock r2 = r0.A04(r1)
            if (r2 == 0) goto L_0x01f7
            r2.lock()     // Catch:{ all -> 0x0697 }
        L_0x01f7:
            X.1Yb r1 = X.C28851Ya.A02(r1)     // Catch:{ all -> 0x0697 }
            X.11s r0 = r4.A05     // Catch:{ all -> 0x0697 }
            r0.A0U(r1)     // Catch:{ all -> 0x0697 }
            r0.A0T(r1)     // Catch:{ all -> 0x0697 }
            if (r2 == 0) goto L_0x01e0
            r2.unlock()
            goto L_0x01e0
        L_0x0209:
            java.lang.Object r3 = r2.A00
            X.0yO r3 = (X.C19410yO) r3
            java.lang.Object r4 = r2.A01
            X.1WF r4 = (X.AnonymousClass1WF) r4
            java.lang.Iterable r0 = r3.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0219:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0229
            java.lang.Object r0 = r1.next()
            X.1WC r0 = (X.AnonymousClass1WC) r0
            r0.A02(r4)
            goto L_0x0219
        L_0x0229:
            X.16Q r6 = r3.A0H
            X.1iM r1 = r6.A04
            X.2Ok r0 = new X.2Ok
            r0.<init>(r4, r3)
            r1.A02(r0)
            X.0sK r0 = r6.A02
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x0241
            java.lang.String r0 = "CriticalDataUploadManager/startCriticalDataBootstrap this device is a companion, it should not be able to upload bootstrap data"
            goto L_0x0779
        L_0x0241:
            monitor-enter(r6)
            X.24q r3 = r6.A00     // Catch:{ all -> 0x06a6 }
            X.1ZU r2 = r3.A01     // Catch:{ all -> 0x06a6 }
            boolean r0 = r2.A05()     // Catch:{ all -> 0x06a6 }
            if (r0 == 0) goto L_0x0255
            X.1ZU r0 = r3.A00     // Catch:{ all -> 0x06a6 }
            boolean r0 = r0.A05()     // Catch:{ all -> 0x06a6 }
            r1 = 1
            if (r0 != 0) goto L_0x0256
        L_0x0255:
            r1 = 0
        L_0x0256:
            java.lang.String r0 = "Critical data bootstrap already in progress"
            X.AnonymousClass00B.A0D(r0, r1)     // Catch:{ all -> 0x06a6 }
            r2.A03()     // Catch:{ all -> 0x06a6 }
            X.1ZU r0 = r3.A00     // Catch:{ all -> 0x06a6 }
            r0.A03()     // Catch:{ all -> 0x06a6 }
            java.lang.String r0 = "CriticalDataUploadManager/startCriticalDataBootstrap"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x06a6 }
            X.0sq r5 = r6.A06     // Catch:{ all -> 0x06a6 }
            r0 = 47
            com.facebook.redex.RunnableRunnableShape8S0100000_I0_7 r3 = new com.facebook.redex.RunnableRunnableShape8S0100000_I0_7     // Catch:{ all -> 0x06a6 }
            r3.<init>(r6, r0)     // Catch:{ all -> 0x06a6 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x06a6 }
            X.0s5 r1 = r6.A03     // Catch:{ all -> 0x06a6 }
            X.0tC r0 = X.C15910s6.A1c     // Catch:{ all -> 0x06a6 }
            int r0 = r1.A02(r0)     // Catch:{ all -> 0x06a6 }
            long r0 = (long) r0     // Catch:{ all -> 0x06a6 }
            long r1 = r2.toMillis(r0)     // Catch:{ all -> 0x06a6 }
            java.lang.String r0 = "CriticalDataUploadManager/data-bootstrap"
            java.lang.Runnable r0 = r5.Ad4(r3, r0, r1)     // Catch:{ all -> 0x06a6 }
            r6.A01 = r0     // Catch:{ all -> 0x06a6 }
            monitor-exit(r6)     // Catch:{ all -> 0x06a6 }
            X.1iJ r0 = r6.A05
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r3 = r0.iterator()
        L_0x0293:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0014
            java.lang.Object r0 = r3.next()
            X.1iK r0 = (X.C33281iK) r0
            X.0xU r2 = r0.A00
            X.0sq r1 = r2.A0n
            com.whatsapp.util.RunnableTRunnableShape1S0200000_I0 r0 = new com.whatsapp.util.RunnableTRunnableShape1S0200000_I0
            r0.<init>((X.AnonymousClass1WF) r4, (X.C18930xU) r2)
            r1.Acl(r0)
            goto L_0x0293
        L_0x02ac:
            java.lang.Object r4 = r2.A00
            X.1Sj r4 = (X.C27591Sj) r4
            java.lang.Object r8 = r2.A01
            X.1qx r8 = (X.C38541qx) r8
            X.14w r7 = r4.A08
            X.1Vw r6 = r8.A11
            java.util.List r1 = r7.A00(r6)
            int r0 = r1.size()
            if (r0 == 0) goto L_0x0014
            X.1Vw r0 = r8.A12()
            if (r0 == 0) goto L_0x0309
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0309
            java.util.Iterator r2 = r1.iterator()
        L_0x02d0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0309
            java.lang.Object r0 = r2.next()
            X.2Bz r0 = (X.C46012Bz) r0
            int r1 = r0.A00
            r0 = 17
            if (r1 != r0) goto L_0x02d0
            long r2 = r8.A13
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            X.15G r4 = r4.A0A
            byte r0 = r8.A10
            java.util.List r1 = X.AnonymousClass15G.A0M
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0302
            X.0rv r1 = r6.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.put(r1, r0)
        L_0x0302:
            java.util.Set r0 = java.util.Collections.singleton(r6)
            r4.A0A(r5, r0)
        L_0x0309:
            r7.A01(r6)
            return
        L_0x030d:
            java.lang.Object r1 = r2.A00
            X.15G r1 = (X.AnonymousClass15G) r1
            java.lang.Object r4 = r2.A01
            X.0tZ r4 = (X.C16740tZ) r4
            X.1Vw r2 = r4.A11
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = r4.A0l
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0341
            java.lang.String r0 = "MessageAddonManager/updateWAContactName/from_name is empty  jid:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.0rv r0 = r4.A0B()
            r1.append(r0)
            java.lang.String r0 = " message:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0341:
            com.whatsapp.jid.UserJid r0 = r4.A0C()
            if (r0 == 0) goto L_0x0014
            X.0sG r3 = r1.A02
            X.0sH r2 = r3.A0A(r0)
            java.lang.String r1 = r4.A0l
            java.lang.String r0 = r2.A0W
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0014
            r2.A0W = r1
            r3.A0L(r2)
            return
        L_0x035d:
            java.lang.Object r0 = r2.A00
            X.2NW r0 = (X.AnonymousClass2NW) r0
            java.lang.Object r2 = r2.A01
            X.0rv r2 = (X.C15830rv) r2
            com.obwhatsapp.group.NewGroup r0 = r0.A00
            X.121 r1 = r0.A0T
            X.0sG r0 = r0.A08
            X.0sH r0 = r0.A0A(r2)
            r1.A0A(r0)
            return
        L_0x0373:
            java.lang.Object r0 = r2.A00
            X.2Or r0 = (X.AnonymousClass2Or) r0
            java.lang.Object r1 = r2.A01
            X.2O3 r0 = r0.A00
            X.0pt r2 = r0.A00
            java.lang.String r1 = r1.toString()
            r0 = 0
            r2.A0N(r1, r0)
            return
        L_0x0386:
            java.lang.Object r1 = r2.A00
            X.2O4 r1 = (X.AnonymousClass2O4) r1
            java.lang.Object r0 = r2.A01
            X.2BN r0 = (X.AnonymousClass2BN) r0
            X.18U r2 = r1.A05
            X.0sL r1 = r0.A05
            com.whatsapp.jid.UserJid r0 = r0.A06
            r2.A03(r1, r0)
            return
        L_0x0398:
            java.lang.Object r0 = r2.A00
            X.0ul r0 = (X.C17240ul) r0
            java.lang.Object r1 = r2.A01
            java.util.Set r0 = r0.A12
            r0.remove(r1)
            return
        L_0x03a4:
            java.lang.Object r0 = r2.A00
            X.0ul r0 = (X.C17240ul) r0
            java.lang.Object r1 = r2.A01
            java.util.Set r1 = (java.util.Set) r1
            X.18R r0 = r0.A0k
            r0.A04(r1)
            return
        L_0x03b2:
            java.lang.Object r1 = r2.A00
            X.0ul r1 = (X.C17240ul) r1
            java.lang.Object r0 = r2.A01
            X.0tZ r0 = (X.C16740tZ) r0
            X.18O r1 = r1.A0j
            X.1Vw r0 = r0.A11
            X.0rv r0 = r0.A00
            r1.A00(r0)
            return
        L_0x03c4:
            java.lang.Object r1 = r2.A00
            X.0ul r1 = (X.C17240ul) r1
            java.lang.Object r0 = r2.A01
            X.18R r1 = r1.A0k
            java.util.Set r0 = java.util.Collections.singleton(r0)
            r1.A04(r0)
            return
        L_0x03d4:
            java.lang.Object r0 = r2.A00
            X.0ul r0 = (X.C17240ul) r0
            java.lang.Object r1 = r2.A01
            X.0sL r1 = (X.C16050sL) r1
            X.18U r0 = r0.A0W
            r0.A02(r1)
            return
        L_0x03e2:
            java.lang.Object r3 = r2.A00
            X.0ul r3 = (X.C17240ul) r3
            java.lang.Object r0 = r2.A01
            X.0sO r2 = r3.A0a
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.0sK r0 = r3.A08
            r0.A0B()
            X.1ZT r0 = r0.A05
            X.AnonymousClass00B.A06(r0)
            r2.A07(r0, r1)
            return
        L_0x03fc:
            java.lang.Object r0 = r2.A00
            com.obwhatsapp.group.GroupChatInfoActivity r0 = (com.obwhatsapp.group.GroupChatInfoActivity) r0
            java.lang.Object r3 = r2.A01
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = "group_participant_list"
            java.lang.String r5 = "whatsapp"
            X.1vW r2 = new X.1vW
            r2.<init>(r3, r4, r5, r6, r8)
            X.1vV r1 = new X.1vV
            r1.<init>(r2)
            X.0z3 r0 = r0.A0n
            r0.A00(r1)
            return
        L_0x0421:
            java.lang.Object r3 = r2.A00
            com.obwhatsapp.group.GroupChatInfoActivity r3 = (com.obwhatsapp.group.GroupChatInfoActivity) r3
            java.lang.Object r4 = r2.A01
            X.0uk r1 = r3.A0X
            X.0sL r0 = r3.A1M
            X.0sL r1 = r1.A02(r0)
            r3.A1N = r1
            if (r1 != 0) goto L_0x0437
            r0 = 0
            r3.A1j = r0
            return
        L_0x0437:
            X.0sG r0 = r3.A06
            X.0sH r5 = r0.A0A(r1)
            X.0sP r0 = r3.A0f
            java.lang.String r0 = r0.A08(r5)
            r3.A1j = r0
            X.0uk r1 = r3.A0X
            X.0sL r0 = r3.A1N
            int r6 = r1.A00(r0)
            X.2aL r2 = r3.A0M
            X.0sL r1 = r3.A1N
            r0 = 2
            X.4Rt r0 = r2.A00(r3, r1, r0)
            r3.A0W = r0
            X.0pt r0 = r3.A05
            r7 = 8
            com.facebook.redex.RunnableRunnableShape0S0301000_I0 r2 = new com.facebook.redex.RunnableRunnableShape0S0301000_I0
            r2.<init>(r3, r4, r5, r6, r7)
            r0.A0K(r2)
            return
        L_0x0465:
            java.lang.Object r3 = r2.A00
            X.2Jn r3 = (X.C47572Jn) r3
            java.lang.Object r1 = r2.A01
            android.view.View r1 = (android.view.View) r1
            int r0 = r3.A00
            r3.A0I(r1, r0)
            return
        L_0x0473:
            java.lang.Object r4 = r2.A00
            X.16q r4 = (X.C221016q) r4
            java.lang.Object r3 = r2.A01
            java.lang.Integer r3 = (java.lang.Integer) r3
            X.2Oq r2 = new X.2Oq
            r2.<init>()
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r2.A05 = r0
            X.0t3 r0 = r4.A00
            long r0 = r0.A00()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A04 = r0
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A00 = r0
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A02 = r0
            if (r3 == 0) goto L_0x04a8
            r2.A03 = r3
        L_0x04a8:
            X.0t9 r0 = r4.A01
            r0.A06(r2)
            return
        L_0x04ae:
            java.lang.Object r0 = r2.A00
            X.18r r0 = (X.C226318r) r0
            java.lang.Object r6 = r2.A01
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            java.util.concurrent.CountDownLatch r5 = r0.A03
            long r3 = r5.getCount()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x069e
            r6.run()
            r5.countDown()
            return
        L_0x04c9:
            java.lang.Object r1 = r2.A00
            X.1RS r1 = (X.AnonymousClass1RS) r1
            java.lang.Object r0 = r2.A01
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            r1.A03(r0)
            return
        L_0x04d5:
            java.lang.Object r3 = r2.A00
            X.19P r3 = (X.AnonymousClass19P) r3
            java.lang.Object r1 = r2.A01
            monitor-enter(r3)
            X.1p4 r0 = r3.A02     // Catch:{ all -> 0x04e5 }
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x04e5 }
            r0.remove(r1)     // Catch:{ all -> 0x04e5 }
            monitor-exit(r3)     // Catch:{ all -> 0x04e5 }
            return
        L_0x04e5:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x04e5 }
            throw r1
        L_0x04e8:
            java.lang.Object r1 = r2.A00
            X.0yO r1 = (X.C19410yO) r1
            java.lang.Object r2 = r2.A01
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            X.0xd r3 = r1.A0I
            java.lang.Object r6 = r2.getKey()
            com.whatsapp.jid.DeviceJid r6 = (com.whatsapp.jid.DeviceJid) r6
            java.lang.Object r0 = r2.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r10 = r0.intValue()
            X.1p8 r7 = X.C37421p8.A0E
            r5 = 0
            r11 = 0
            r17 = 0
            r9 = r5
            r13 = 0
            r15 = 0
            X.1WN r4 = new X.1WN
            r8 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r13, r15, r17)
            r3.A08(r4)
            java.util.Set r1 = r1.A0P
            java.lang.Object r0 = r2.getKey()
            r1.add(r0)
            return
        L_0x0521:
            java.lang.Object r3 = r2.A00
            X.0yO r3 = (X.C19410yO) r3
            java.lang.Object r2 = r2.A01
            X.1WF r2 = (X.AnonymousClass1WF) r2
            X.1cn r5 = new X.1cn
            r5.<init>(r2, r3)
            java.lang.String r0 = "companion-device-manager/addDevice"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1WN r1 = r2.A01
            X.0xd r0 = r3.A0I
            r0.A08(r1)
            com.whatsapp.jid.DeviceJid r4 = r1.A06
            X.1WL r6 = r2.A00
            X.16P r0 = r3.A0G
            r7 = 24
            com.facebook.redex.RunnableRunnableShape0S0400000_I0 r2 = new com.facebook.redex.RunnableRunnableShape0S0400000_I0
            r2.<init>(r3, r4, r5, r6, r7)
            java.util.concurrent.ThreadPoolExecutor r0 = r0.A00
            r0.execute(r2)
            java.util.Set r0 = r3.A0P
            r0.add(r4)
            return
        L_0x0552:
            java.lang.Object r0 = r2.A00
            X.0yO r0 = (X.C19410yO) r0
            java.lang.Object r1 = r2.A01
            android.location.LocationListener r1 = (android.location.LocationListener) r1
            X.16R r0 = r0.A06
            r4 = 2
            r5 = 0
            r3 = 0
            java.lang.String r2 = "CompanionDevice"
            r7 = 0
            r0.A05(r1, r2, r3, r4, r5, r7)
            return
        L_0x0568:
            java.lang.Object r0 = r2.A00
            X.0yO r0 = (X.C19410yO) r0
            java.lang.Object r1 = r2.A01
            android.location.LocationListener r1 = (android.location.LocationListener) r1
            X.16R r0 = r0.A06
            r0.A04(r1)
            return
        L_0x0576:
            java.lang.Object r3 = r2.A00
            X.1Sj r3 = (X.C27591Sj) r3
            java.lang.Object r6 = r2.A01
            X.1qx r6 = (X.C38541qx) r6
            r5 = 4
            r6.A0W(r5)
            X.15G r2 = r3.A0A
            X.1Py r1 = r2.A0G
            X.1Vw r4 = r6.A11
            java.util.Set r0 = java.util.Collections.singleton(r4)
            r1.A07(r0, r5)
            r2.A09(r6)
            X.0t6 r5 = r3.A05
            X.1Vw r1 = r6.A12()
            X.0th r0 = r5.A0K
            X.0tZ r2 = r0.A03(r1)
            boolean r0 = r6 instanceof X.C39101rv
            if (r0 == 0) goto L_0x05dc
            if (r2 == 0) goto L_0x05dc
            X.23T r0 = r2.A0W
            if (r0 == 0) goto L_0x05dc
            r0.A04(r6)
        L_0x05ab:
            X.0t3 r0 = r3.A03
            long r13 = r0.A00()
            long r0 = r6.A0I
            long r13 = r13 - r0
            X.16V r0 = r3.A09
            java.util.Set r1 = r0.A00(r4)
            X.0w1 r5 = r3.A01
            int r0 = r6.A0B
            int r8 = r0 + 1
            X.0so r0 = r3.A00
            java.util.Set r0 = X.C16030sJ.A0A(r0, r1)
            int r9 = r0.size()
            int r10 = r1.size()
            r7 = 1
            r11 = 0
            r12 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r5.A0I(r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18)
            return
        L_0x05dc:
            boolean r0 = r6 instanceof X.C39191s4
            if (r0 == 0) goto L_0x05ab
            boolean r0 = r6.A1C
            if (r0 == 0) goto L_0x05ab
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r1.add(r2)
            r0 = 0
            r5.A0m(r1, r0)
            goto L_0x05ab
        L_0x05f1:
            java.lang.Object r0 = r2.A00
            X.1Sj r0 = (X.C27591Sj) r0
            java.lang.Object r4 = r2.A01
            X.1qx r4 = (X.C38541qx) r4
            X.15G r3 = r0.A0A
            X.1Py r2 = r3.A0G
            X.1Vw r0 = r4.A11
            java.util.Set r1 = java.util.Collections.singleton(r0)
            r0 = 7
            r2.A07(r1, r0)
            r3.A09(r4)
            return
        L_0x060b:
            java.lang.Object r0 = r2.A00
            X.1Sj r0 = (X.C27591Sj) r0
            java.lang.Object r2 = r2.A01
            X.0rv r2 = (X.C15830rv) r2
            X.17Z r1 = r0.A02
            r0 = 0
            r1.A03(r2, r0)
            return
        L_0x061a:
            java.lang.Object r5 = r2.A00
            X.17m r5 = (X.C223217m) r5
            java.lang.Object r4 = r2.A01
            X.0rx r4 = (X.C15840rx) r4
            X.0ts r3 = r5.A05     // Catch:{ SQLiteDatabaseCorruptException -> 0x0641, Error | RuntimeException -> 0x0683 }
            monitor-enter(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0641, Error | RuntimeException -> 0x0683 }
            r0 = 2
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x063e }
            r2.<init>(r0)     // Catch:{ all -> 0x063e }
            java.lang.String r1 = "vcard_ui_dismissed"
            int r0 = r4.A09     // Catch:{ all -> 0x063e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x063e }
            r2.put(r1, r0)     // Catch:{ all -> 0x063e }
            monitor-exit(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0641, Error | RuntimeException -> 0x0683 }
            X.0rv r0 = r4.A0i     // Catch:{ SQLiteDatabaseCorruptException -> 0x0641, Error | RuntimeException -> 0x0683 }
            r3.A00(r2, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0641, Error | RuntimeException -> 0x0683 }
            return
        L_0x063e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0641, Error | RuntimeException -> 0x0683 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0641, Error | RuntimeException -> 0x0683 }
        L_0x0641:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r5.A08
            goto L_0x068e
        L_0x0648:
            java.lang.Object r0 = r2.A00
            X.19O r0 = (X.AnonymousClass19O) r0
            java.lang.Object r1 = r2.A01
            java.util.Map r0 = r0.A03
            r0.remove(r1)
            return
        L_0x0654:
            java.lang.Object r6 = r2.A00
            X.19A r6 = (X.AnonymousClass19A) r6
            java.lang.Object r5 = r2.A01
            X.0rx r5 = (X.C15840rx) r5
            X.0ts r4 = r6.A02     // Catch:{ SQLiteDatabaseCorruptException -> 0x0688, Error | RuntimeException -> 0x0683, Error | RuntimeException -> 0x0683 }
            monitor-enter(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0688, Error | RuntimeException -> 0x0683, Error | RuntimeException -> 0x0683 }
            r0 = 3
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x0680 }
            r3.<init>(r0)     // Catch:{ all -> 0x0680 }
            java.lang.String r2 = "last_read_receipt_sent_message_row_id"
            long r0 = r5.A0P     // Catch:{ all -> 0x0680 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0680 }
            r3.put(r2, r0)     // Catch:{ all -> 0x0680 }
            java.lang.String r2 = "last_read_receipt_sent_message_sort_id"
            long r0 = r5.A0Q     // Catch:{ all -> 0x0680 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0680 }
            r3.put(r2, r0)     // Catch:{ all -> 0x0680 }
            monitor-exit(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0688, Error | RuntimeException -> 0x0683, Error | RuntimeException -> 0x0683 }
            r4.A0I(r3, r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0688, Error | RuntimeException -> 0x0683, Error | RuntimeException -> 0x0683 }
            return
        L_0x0680:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0688, Error | RuntimeException -> 0x0683, Error | RuntimeException -> 0x0683 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0688, Error | RuntimeException -> 0x0683, Error | RuntimeException -> 0x0683 }
        L_0x0683:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)
            throw r1
        L_0x0688:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r6.A06
        L_0x068e:
            r0.A02()
            return
        L_0x0692:
            r0 = 0
            r6.A00(r3, r0, r0)
            return
        L_0x0697:
            r1 = move-exception
            if (r2 == 0) goto L_0x06a5
            r2.unlock()
            throw r1
        L_0x069e:
            java.lang.String r0 = "Multiple calls to initializeCommonAttributes"
            java.lang.Error r1 = new java.lang.Error
            r1.<init>(r0)
        L_0x06a5:
            throw r1
        L_0x06a6:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x06a6 }
            throw r1
        L_0x06a9:
            java.lang.Object r4 = r2.A00
            X.1Sj r4 = (X.C27591Sj) r4
            java.lang.Object r3 = r2.A01
            X.1qx r3 = (X.C38541qx) r3
            X.15G r1 = r4.A0A
            r0 = 1
            int r2 = r1.A01(r3, r0)
            boolean r0 = X.AnonymousClass23W.A01(r2)
            if (r0 == 0) goto L_0x06da
            X.16y r0 = r4.A07
            java.util.Set r1 = r0.A03(r3)
            if (r1 == 0) goto L_0x06d1
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x06d1
            X.16V r0 = r4.A09
            r0.A02(r3, r1)
        L_0x06d1:
            r4.A01(r3, r2)
            X.0y3 r0 = r4.A0D
            r0.A01(r3)
            return
        L_0x06da:
            java.lang.String r0 = "MessageAddOnSendRecvManager/storeMessageAddOnAndSendAsync failed to store messageAddOn"
            goto L_0x0779
        L_0x06de:
            java.lang.Object r4 = r2.A00
            X.1Sj r4 = (X.C27591Sj) r4
            java.lang.Object r3 = r2.A01
            X.1qx r3 = (X.C38541qx) r3
            X.15G r1 = r4.A0A
            r0 = 0
            int r6 = r1.A01(r3, r0)
            boolean r0 = X.AnonymousClass23W.A01(r6)
            r5 = 5
            if (r0 == 0) goto L_0x0772
            X.11o r2 = r4.A0E
            long r0 = r3.A16
            X.1d2 r0 = r2.A01(r0)
            if (r0 == 0) goto L_0x0701
            r0.A00(r5)
        L_0x0701:
            X.126 r5 = r4.A04
            r1 = 9
            com.facebook.redex.RunnableRunnableShape7S0200000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape7S0200000_I0_5
            r0.<init>(r4, r1, r3)
            r2 = 54
            android.os.Handler r1 = r5.A01
            android.os.Message r0 = android.os.Message.obtain(r1, r0)
            r0.arg1 = r2
            r1.sendMessage(r0)
            r4.A01(r3, r6)
            X.1Vw r0 = r3.A12()
            if (r0 == 0) goto L_0x074a
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x074a
            X.1Vw r0 = r3.A11
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x074a
            boolean r0 = r3 instanceof X.C39101rv
            if (r0 == 0) goto L_0x0750
            X.0pj r6 = r4.A0F
            r5 = r3
            X.1rv r5 = (X.C39101rv) r5
            android.os.Handler r2 = r6.A01()
            r1 = 12
            com.facebook.redex.RunnableRunnableShape9S0200000_I0_7 r0 = new com.facebook.redex.RunnableRunnableShape9S0200000_I0_7
            r0.<init>(r6, r1, r5)
            r2.post(r0)
            java.lang.String r0 = r5.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
        L_0x0747:
            r6.A0B(r3, r0, r0)
        L_0x074a:
            X.17f r0 = r4.A0C
            r0.A03(r3)
            return
        L_0x0750:
            boolean r0 = r3 instanceof X.C39191s4
            if (r0 == 0) goto L_0x074a
            X.0pd r2 = r4.A0B
            r1 = 1352(0x548, float:1.895E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x074a
            X.0pj r6 = r4.A0F
            android.os.Handler r2 = r6.A01()
            r1 = 11
            com.facebook.redex.RunnableRunnableShape9S0200000_I0_7 r0 = new com.facebook.redex.RunnableRunnableShape9S0200000_I0_7
            r0.<init>(r6, r1, r3)
            r2.post(r0)
            r0 = 0
            goto L_0x0747
        L_0x0772:
            r0 = 7
            if (r6 == r0) goto L_0x074a
            if (r6 == r5) goto L_0x074a
            java.lang.String r0 = "MessageAddOnManager/storeMessageAddOnAndSendReadReceiptAsync failed to store messageAddOn"
        L_0x0779:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape7S0200000_I0_5.run():void");
    }
}

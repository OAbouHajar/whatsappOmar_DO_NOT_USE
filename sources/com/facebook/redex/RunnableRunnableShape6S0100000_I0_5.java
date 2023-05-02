package com.facebook.redex;

public class RunnableRunnableShape6S0100000_I0_5 implements Runnable {
    public Object A00;
    public final int A01;

    public RunnableRunnableShape6S0100000_I0_5(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0545, code lost:
        r5.A02.A0O();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x054a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ca, code lost:
        r5 = (X.AnonymousClass1CB) r0.A00.A00(X.AnonymousClass1CB.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d4, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        com.whatsapp.util.Log.i("companion/registration/start");
        r5.A0K.A01(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r2 = r5.A0S;
        r6 = r5.A0R;
        r0 = new com.facebook.redex.IDxCallableShape149S0100000_2_I1(r6, 4);
        r2 = r2.A00;
        r5.A0a.A0A(new X.AnonymousClass28H((X.C30971dG) r2.submit(r0).get(), (byte[]) r2.submit(new com.facebook.redex.IDxCallableShape148S0100000_2_I0(r6, 9)).get(), X.C28641Wx.A02(((java.lang.Integer) r2.submit(new com.facebook.redex.IDxCallableShape149S0100000_2_I1(r6, 5)).get()).intValue())));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        r1 = r0.A01().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        com.whatsapp.util.Log.e("companion/registration/failed to load keys for sending");
        r5.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002f, code lost:
        if (r1.hasNext() == false) goto L_0x06c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
        ((X.C33481ie) r1.next()).A06((java.util.Collection) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0243, code lost:
        r1.A0N();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0246, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:167:0x03d7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r28 = this;
            r10 = 0
            r1 = r28
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0792;
                case 1: goto L_0x0763;
                case 2: goto L_0x0754;
                case 3: goto L_0x0744;
                case 4: goto L_0x0737;
                case 5: goto L_0x0726;
                case 6: goto L_0x06dc;
                case 7: goto L_0x06c9;
                case 8: goto L_0x06c1;
                case 9: goto L_0x06a6;
                case 10: goto L_0x0698;
                case 11: goto L_0x0665;
                case 12: goto L_0x061d;
                case 13: goto L_0x060c;
                case 14: goto L_0x05f4;
                case 15: goto L_0x05da;
                case 16: goto L_0x05d2;
                case 17: goto L_0x0567;
                case 18: goto L_0x054b;
                case 19: goto L_0x0521;
                case 20: goto L_0x04f9;
                case 21: goto L_0x04f1;
                case 22: goto L_0x04ca;
                case 23: goto L_0x0461;
                case 24: goto L_0x03f0;
                case 25: goto L_0x03dd;
                case 26: goto L_0x027f;
                case 27: goto L_0x0247;
                case 28: goto L_0x0237;
                case 29: goto L_0x0211;
                case 30: goto L_0x0202;
                case 31: goto L_0x01de;
                case 32: goto L_0x01b6;
                case 33: goto L_0x01ae;
                case 34: goto L_0x01a3;
                case 35: goto L_0x0197;
                case 36: goto L_0x018d;
                case 37: goto L_0x0161;
                case 38: goto L_0x0151;
                case 39: goto L_0x0149;
                case 40: goto L_0x0137;
                case 41: goto L_0x00c6;
                case 42: goto L_0x00bf;
                case 43: goto L_0x008f;
                case 44: goto L_0x007c;
                case 45: goto L_0x004a;
                case 46: goto L_0x0042;
                case 47: goto L_0x003b;
                case 48: goto L_0x06b5;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.Object r2 = r1.A00
            X.1L6 r2 = (X.AnonymousClass1L6) r2
            X.0sG r0 = r2.A04
            X.1kv r0 = r0.A04
            java.util.Map r0 = r0.A01
            r0.clear()
            X.0sP r1 = r2.A06
            java.util.concurrent.ConcurrentHashMap r0 = r1.A0C
            r0.clear()
            java.util.concurrent.ConcurrentHashMap r0 = r1.A0D
            r0.clear()
            X.0ub r0 = r2.A05
        L_0x0023:
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x002b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x06c0
            java.lang.Object r0 = r1.next()
            X.1ie r0 = (X.C33481ie) r0
            r0.A06(r10)
            goto L_0x002b
        L_0x003b:
            java.lang.Object r0 = r1.A00
            X.0sG r0 = (X.C16000sG) r0
            X.0ub r0 = r0.A07
            goto L_0x0023
        L_0x0042:
            java.lang.Object r0 = r1.A00
            X.0yG r0 = (X.C19330yG) r0
            X.C19330yG.A01(r0)
            return
        L_0x004a:
            java.lang.Object r3 = r1.A00
            com.obwhatsapp.components.AutoScrollView r3 = (com.obwhatsapp.components.AutoScrollView) r3
            boolean r1 = r3.A02
            boolean r0 = r3.A03
            if (r1 == 0) goto L_0x006d
            r2 = 0
            android.widget.HorizontalScrollView r1 = r3.A00
            if (r0 == 0) goto L_0x005f
            int r0 = r3.A04
            r1.scrollTo(r0, r2)
            return
        L_0x005f:
            int r0 = r1.getMeasuredWidth()
            r1.scrollTo(r0, r2)
            int r0 = r3.A04
            int r0 = -r0
            r1.scrollBy(r0, r2)
            return
        L_0x006d:
            android.widget.HorizontalScrollView r1 = r3.A00
            if (r0 == 0) goto L_0x0076
            r0 = 0
            r1.scrollTo(r0, r0)
            return
        L_0x0076:
            r0 = 66
            r1.fullScroll(r0)
            return
        L_0x007c:
            java.lang.Object r0 = r1.A00
            X.28E r0 = (X.AnonymousClass28E) r0
            com.obwhatsapp.companionmode.registration.RegisterAsCompanionActivity r2 = r0.A00
            android.widget.LinearLayout r1 = r2.A00
            r0 = 0
            r1.setVisibility(r0)
            com.obwhatsapp.QrImageView r1 = r2.A02
            r0 = 4
            r1.setVisibility(r0)
            return
        L_0x008f:
            java.lang.Object r0 = r1.A00
            X.28E r0 = (X.AnonymousClass28E) r0
            com.obwhatsapp.companionmode.registration.RegisterAsCompanionActivity r4 = r0.A00
            X.1fu r3 = new X.1fu
            r3.<init>(r4)
            r0 = 2131887381(0x7f120515, float:1.9409367E38)
            r3.A01(r0)
            r0 = 2131887382(0x7f120516, float:1.940937E38)
            r3.A02(r0)
            r0 = 0
            r3.A07(r0)
            r0 = 2131889799(0x7f120e87, float:1.9414272E38)
            java.lang.String r2 = r4.getString(r0)
            r1 = 39
            com.facebook.redex.IDxCListenerShape128S0100000_2_I1 r0 = new com.facebook.redex.IDxCListenerShape128S0100000_2_I1
            r0.<init>(r4, r1)
            r3.A09(r0, r2)
            r3.A00()
            return
        L_0x00bf:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.companionmode.registration.RegisterAsCompanionActivity r0 = (com.obwhatsapp.companionmode.registration.RegisterAsCompanionActivity) r0
            X.0r5 r0 = r0.A04
            goto L_0x00ca
        L_0x00c6:
            java.lang.Object r0 = r1.A00
            X.0r5 r0 = (X.C15480r5) r0
        L_0x00ca:
            X.0xm r1 = r0.A00
            java.lang.Class<X.1CB> r0 = X.AnonymousClass1CB.class
            X.0vg r5 = r1.A00(r0)
            X.1CB r5 = (X.AnonymousClass1CB) r5
            monitor-enter(r5)
            java.lang.String r0 = "companion/registration/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0134 }
            r1 = 2
            X.0ys r0 = r5.A0K     // Catch:{ all -> 0x0134 }
            r0.A01(r1)     // Catch:{ all -> 0x0134 }
            X.16P r2 = r5.A0S     // Catch:{ InterruptedException | ExecutionException -> 0x012a }
            X.11s r6 = r5.A0R     // Catch:{ InterruptedException | ExecutionException -> 0x012a }
            r1 = 4
            com.facebook.redex.IDxCallableShape149S0100000_2_I1 r0 = new com.facebook.redex.IDxCallableShape149S0100000_2_I1     // Catch:{ InterruptedException | ExecutionException -> 0x012a }
            r0.<init>(r6, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x012a }
            java.util.concurrent.ThreadPoolExecutor r2 = r2.A00     // Catch:{ InterruptedException | ExecutionException -> 0x012a }
            java.util.concurrent.Future r0 = r2.submit(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x012a }
            java.lang.Object r4 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x012a }
            X.1dG r4 = (X.C30971dG) r4     // Catch:{ InterruptedException | ExecutionException -> 0x012a }
            r1 = 9
            com.facebook.redex.IDxCallableShape148S0100000_2_I0 r0 = new com.facebook.redex.IDxCallableShape148S0100000_2_I0     // Catch:{ InterruptedException | ExecutionException -> 0x012a }
            r0.<init>(r6, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x012a }
            java.util.concurrent.Future r0 = r2.submit(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x012a }
            java.lang.Object r3 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x012a }
            byte[] r3 = (byte[]) r3     // Catch:{ InterruptedException | ExecutionException -> 0x012a }
            r1 = 5
            com.facebook.redex.IDxCallableShape149S0100000_2_I1 r0 = new com.facebook.redex.IDxCallableShape149S0100000_2_I1     // Catch:{ InterruptedException | ExecutionException -> 0x012a }
            r0.<init>(r6, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x012a }
            java.util.concurrent.Future r0 = r2.submit(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x012a }
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x012a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ InterruptedException | ExecutionException -> 0x012a }
            int r0 = r0.intValue()     // Catch:{ InterruptedException | ExecutionException -> 0x012a }
            byte[] r2 = X.C28641Wx.A02(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x012a }
            X.0xk r1 = r5.A0a     // Catch:{ InterruptedException | ExecutionException -> 0x012a }
            X.28H r0 = new X.28H     // Catch:{ InterruptedException | ExecutionException -> 0x012a }
            r0.<init>(r4, r3, r2)     // Catch:{ InterruptedException | ExecutionException -> 0x012a }
            r1.A0A(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x012a }
            goto L_0x0132
        L_0x012a:
            java.lang.String r0 = "companion/registration/failed to load keys for sending"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0134 }
            r5.A05()     // Catch:{ all -> 0x0134 }
        L_0x0132:
            monitor-exit(r5)
            return
        L_0x0134:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0137:
            java.lang.Object r0 = r1.A00
            X.0r5 r0 = (X.C15480r5) r0
            X.0xm r1 = r0.A00
            java.lang.Class<X.1CB> r0 = X.AnonymousClass1CB.class
            X.0vg r0 = r1.A00(r0)
            X.1CB r0 = (X.AnonymousClass1CB) r0
            r0.A05()
            return
        L_0x0149:
            java.lang.Object r0 = r1.A00
            X.1CB r0 = (X.AnonymousClass1CB) r0
            r0.A05()
            return
        L_0x0151:
            java.lang.Object r4 = r1.A00
            X.1CB r4 = (X.AnonymousClass1CB) r4
            X.1CH r3 = r4.A0J
            r2 = 2
            r0 = 401(0x191, double:1.98E-321)
            r3.A00(r2, r0)
            r4.A05()
            return
        L_0x0161:
            java.lang.Object r2 = r1.A00
            X.1CB r2 = (X.AnonymousClass1CB) r2
            monitor-enter(r2)
            r1 = 0
            X.0ys r0 = r2.A0K     // Catch:{ all -> 0x018a }
            r0.A01(r1)     // Catch:{ all -> 0x018a }
            X.0xk r0 = r2.A0a     // Catch:{ all -> 0x018a }
            r0.A0D(r1)     // Catch:{ all -> 0x018a }
            monitor-exit(r2)     // Catch:{ all -> 0x018a }
            java.lang.Iterable r0 = r2.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x017a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x06c0
            java.lang.Object r0 = r1.next()
            X.28A r0 = (X.AnonymousClass28A) r0
            r0.A01()
            goto L_0x017a
        L_0x018a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x018a }
            throw r0
        L_0x018d:
            java.lang.Object r1 = r1.A00
            X.1WD r1 = (X.AnonymousClass1WD) r1
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A02(r0)
            return
        L_0x0197:
            java.lang.Object r2 = r1.A00
            com.obwhatsapp.companionmode.registration.CompanionPostLogoutActivity r2 = (com.obwhatsapp.companionmode.registration.CompanionPostLogoutActivity) r2
            X.1KQ r1 = r2.A02
            java.lang.String r0 = "CompanionPostLogoutActivity"
            r1.A01(r2, r0)
            return
        L_0x01a3:
            java.lang.Object r0 = r1.A00
            X.1Fy r0 = (X.C24441Fy) r0
            X.0r5 r1 = r0.A01
            r0 = 1
            r1.A00(r10, r0, r0)
            return
        L_0x01ae:
            java.lang.Object r0 = r1.A00
            java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0
            r0.countDown()
            return
        L_0x01b6:
            java.lang.Object r1 = r1.A00
            X.1Wb r1 = (X.C28431Wb) r1
            X.0sK r0 = r1.A02
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x06c0
            monitor-enter(r1)
            java.util.List r5 = r1.A01     // Catch:{ all -> 0x01db }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x01db }
            r0.<init>()     // Catch:{ all -> 0x01db }
            r1.A01 = r0     // Catch:{ all -> 0x01db }
            r1.A00 = r10     // Catch:{ all -> 0x01db }
            X.0xz r2 = r1.A05     // Catch:{ all -> 0x01db }
            X.1kz r4 = X.C34861kz.A04     // Catch:{ all -> 0x01db }
            X.27w r3 = X.C453027w.A0A     // Catch:{ all -> 0x01db }
            r6 = 0
            r7 = 1
            r2.A02(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x01db }
            monitor-exit(r1)     // Catch:{ all -> 0x01db }
            return
        L_0x01db:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01db }
            throw r0
        L_0x01de:
            java.lang.Object r2 = r1.A00
            X.1Ca r2 = (X.C23451Ca) r2
            r0 = 15
            r2.A01(r0, r10)
            X.139 r1 = r2.A04
            X.0t3 r0 = r2.A07
            long r2 = r0.A00()
            android.content.SharedPreferences r0 = r1.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "syncd_last_lthash_consistency_check_time"
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)
            r0.apply()
            return
        L_0x0202:
            java.lang.Object r0 = r1.A00
            X.1aM r0 = (X.C29291aM) r0
            X.0xU r1 = r0.A00
            X.0yJ r0 = r1.A0O
            r0.A00()
            r1.A0M()
            goto L_0x0243
        L_0x0211:
            java.lang.Object r2 = r1.A00
            X.0xU r2 = (X.C18930xU) r2
            X.0yb r0 = r2.A0D
            boolean r0 = r0.A04()
            if (r0 == 0) goto L_0x022d
            X.0sK r0 = r2.A07
            boolean r0 = r0.A0G()
            r1 = 1
            r0 = r0 ^ 1
            X.AnonymousClass00B.A0F(r0)
            r2.A0P(r1)
            return
        L_0x022d:
            boolean r0 = r2.A0X()
            if (r0 == 0) goto L_0x06c0
            r2.A0N()
            return
        L_0x0237:
            java.lang.Object r1 = r1.A00
            X.0xU r1 = (X.C18930xU) r1
            X.0yJ r0 = r1.A0O
            r0.A00()
            r1.A0K()
        L_0x0243:
            r1.A0N()
            return
        L_0x0247:
            java.lang.Object r0 = r1.A00
            X.0xU r0 = (X.C18930xU) r0
            X.15h r3 = r0.A0T
            monitor-enter(r3)
            X.0zv r2 = r3.A03     // Catch:{ all -> 0x027c }
            r0 = 1
            com.facebook.redex.IDxIFilterShape43S0000000_2_I1 r1 = new com.facebook.redex.IDxIFilterShape43S0000000_2_I1     // Catch:{ all -> 0x027c }
            r1.<init>(r0)     // Catch:{ all -> 0x027c }
            java.lang.String r0 = "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE are_dependencies_missing = 1 ORDER BY _id ASC"
            java.util.List r0 = r2.A07(r1, r0, r10)     // Catch:{ all -> 0x027c }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x027c }
        L_0x0260:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x027c }
            if (r0 == 0) goto L_0x027a
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x027c }
            X.1WJ r1 = (X.AnonymousClass1WJ) r1     // Catch:{ all -> 0x027c }
            boolean r0 = r1 instanceof X.C36821oA     // Catch:{ all -> 0x027c }
            if (r0 == 0) goto L_0x0260
            X.0zx r0 = r3.A00(r1)     // Catch:{ all -> 0x027c }
            if (r0 == 0) goto L_0x0260
            r0.A03(r1)     // Catch:{ all -> 0x027c }
            goto L_0x0260
        L_0x027a:
            monitor-exit(r3)     // Catch:{ all -> 0x027c }
            return
        L_0x027c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x027c }
            throw r0
        L_0x027f:
            java.lang.Object r4 = r1.A00
            X.1Ci r4 = (X.C23531Ci) r4
            java.lang.String r9 = "NonMessageDataRequestManager/dailyCheck invalid deviceId"
            X.19M r1 = r4.A09
            r0 = 70
            java.util.List r0 = r1.A04(r0)
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x0296:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02ac
            java.lang.Object r1 = r2.next()
            X.1pD r1 = (X.C37471pD) r1
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0296
            java.util.Set r0 = r1.A01
            r8.addAll(r0)
            goto L_0x0296
        L_0x02ac:
            X.1RK r7 = r4.A0A
            X.AnonymousClass00B.A00()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            X.19K r0 = r7.A00
            X.0tf r3 = r0.get()
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x03d8 }
            java.lang.String r0 = "SELECT file_key, rmr_source, failure_count, response_device_id, last_fetch_timestamp FROM rmr_response_error"
            android.database.Cursor r2 = r2.A08(r0, r10)     // Catch:{ all -> 0x03d8 }
            if (r2 != 0) goto L_0x02c7
            goto L_0x02d8
        L_0x02c7:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x03d3 }
            if (r0 == 0) goto L_0x02d5
            X.28B r0 = X.AnonymousClass28B.A00(r2)     // Catch:{ all -> 0x03d3 }
            r1.add(r0)     // Catch:{ all -> 0x03d3 }
            goto L_0x02c7
        L_0x02d5:
            r2.close()     // Catch:{ all -> 0x03d8 }
        L_0x02d8:
            r3.close()
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            X.0z2 r0 = r4.A08
            X.0uz r6 = r0.A06()
            X.0sK r0 = r4.A01
            r0.A0B()
            X.1ZT r5 = r0.A05
            int r3 = r0.A00()
            X.0t3 r0 = r4.A06
            long r21 = r0.A00()
            java.util.Iterator r20 = r1.iterator()
        L_0x02fb:
            boolean r0 = r20.hasNext()
            r19 = 0
            if (r0 == 0) goto L_0x03ad
            java.lang.Object r14 = r20.next()
            X.28B r14 = (X.AnonymousClass28B) r14
            java.lang.String r2 = r14.A04
            boolean r0 = r8.contains(r2)
            if (r0 == 0) goto L_0x0323
            java.lang.String r1 = "NonMessageDataRequestManager/dailyCheck request inFlight="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x02fb
        L_0x0323:
            int r13 = r14.A03
            if (r13 == 0) goto L_0x033a
            java.lang.String r1 = "NonMessageDataRequestManager/dailyCheck invalid rmr source="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r19 = 1
        L_0x033a:
            r11 = 0
            int r12 = r14.A02     // Catch:{ 1W4 -> 0x0342 }
            com.whatsapp.jid.DeviceJid r11 = com.whatsapp.jid.DeviceJid.getFromUserJidAndDeviceId(r5, r12)     // Catch:{ 1W4 -> 0x0342 }
            goto L_0x0359
        L_0x0342:
            r1 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            int r12 = r14.A02
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r1)
            r19 = 1
        L_0x0359:
            if (r12 == r3) goto L_0x0361
            boolean r0 = r6.contains(r11)
            if (r0 != 0) goto L_0x0375
        L_0x0361:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r9)
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r19 = 1
        L_0x0375:
            long r0 = r14.A01
            long r17 = r21 - r0
            r15 = 172800000(0xa4cb800, double:8.53745436E-316)
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x03a8
            int r1 = r14.A00
            r0 = 3
            if (r1 > r0) goto L_0x03a8
            if (r19 != 0) goto L_0x03a8
            if (r11 == 0) goto L_0x03a8
            r8.add(r2)
            boolean r0 = r10.containsKey(r11)
            if (r0 != 0) goto L_0x039a
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r10.put(r11, r0)
        L_0x039a:
            java.lang.Object r0 = r10.get(r11)
            X.AnonymousClass00B.A06(r0)
            java.util.Set r0 = (java.util.Set) r0
            r0.add(r2)
            goto L_0x02fb
        L_0x03a8:
            r7.A00(r13, r2, r12)
            goto L_0x02fb
        L_0x03ad:
            java.util.Set r0 = r10.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L_0x03b5:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x06c0
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            X.1Gq r2 = r4.A05
            java.lang.Object r1 = r0.getKey()
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            r2.A00(r1, r0)
            goto L_0x03b5
        L_0x03d3:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x03d7 }
        L_0x03d7:
            throw r0     // Catch:{ all -> 0x03d8 }
        L_0x03d8:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x03dc }
        L_0x03dc:
            throw r0
        L_0x03dd:
            java.lang.Object r1 = r1.A00
            X.1Bo r1 = (X.C23331Bo) r1
            java.lang.String r0 = "MDSyncAbpropsObserver/onAfterABPropsChanged enable fav sticker sync"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0xU r0 = r1.A03
            X.15h r1 = r0.A0T
            java.lang.String r0 = "favoriteSticker"
            r1.A08(r0)
            return
        L_0x03f0:
            java.lang.Object r0 = r1.A00
            X.1Bo r0 = (X.C23331Bo) r0
            X.0xU r1 = r0.A03
            boolean r1 = r1.A0X()
            if (r1 == 0) goto L_0x06c0
            X.0xd r1 = r0.A04
            X.0vs r1 = r1.A01()
            X.0uz r3 = r1.keySet()
            java.lang.String r1 = "MDSyncAbpropsObserver/onAfterABPropsChanged enable the recent sticker, peer size="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            int r1 = r3.size()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.util.Iterator r3 = r3.iterator()
        L_0x041f:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x06c0
            java.lang.Object r11 = r3.next()
            com.whatsapp.jid.DeviceJid r11 = (com.whatsapp.jid.DeviceJid) r11
            X.1Bn r9 = r0.A06
            X.0sK r1 = r9.A01
            boolean r1 = r1.A0G()
            if (r1 != 0) goto L_0x041f
            X.1bP r1 = X.C29901bP.A0D     // Catch:{ Exception -> 0x045a }
            X.1Wr r12 = r1.A0U()     // Catch:{ Exception -> 0x045a }
            X.1bQ r12 = (X.C29911bQ) r12     // Catch:{ Exception -> 0x045a }
            X.1bR r1 = X.C29921bR.A04     // Catch:{ Exception -> 0x045a }
            r12.A07(r1)     // Catch:{ Exception -> 0x045a }
            r9.A04(r12)     // Catch:{ Exception -> 0x045a }
            r14 = 0
            r15 = 5
            r16 = 100
            r18 = -1
            r24 = 0
            r17 = 0
            r20 = -1
            r22 = -1
            r26 = 0
            r13 = r10
            r9.A01(r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r22, r24, r26)     // Catch:{ Exception -> 0x045a }
            goto L_0x041f
        L_0x045a:
            r2 = move-exception
            java.lang.String r1 = "history-sync-send-methods/sendNonBlockingDataMessages: error"
            com.whatsapp.util.Log.e(r1, r2)
            goto L_0x041f
        L_0x0461:
            java.lang.Object r1 = r1.A00
            X.1Bo r1 = (X.C23331Bo) r1
            java.lang.String r0 = "MDSyncAbpropsObserver/onAfterABPropsChanged enable note to self, sync meContact"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0xU r3 = r1.A03
            X.0sK r2 = r3.A07
            boolean r0 = r2.A0G()
            if (r0 != 0) goto L_0x06c0
            monitor-enter(r3)
            r0 = 0
            boolean r0 = r3.A0Z(r0)     // Catch:{ all -> 0x04c7 }
            if (r0 == 0) goto L_0x04c5
            X.15h r1 = r3.A0T     // Catch:{ all -> 0x04c7 }
            java.lang.String r0 = "contact"
            java.lang.Object r0 = r1.A02(r0)     // Catch:{ all -> 0x04c7 }
            if (r0 == 0) goto L_0x04c5
            boolean r0 = r3.A0X()     // Catch:{ all -> 0x04c7 }
            if (r0 == 0) goto L_0x04c5
            X.0sG r1 = r3.A0V     // Catch:{ all -> 0x04c7 }
            X.0sK r0 = r1.A01     // Catch:{ all -> 0x04c7 }
            r0.A0B()     // Catch:{ all -> 0x04c7 }
            X.1ZT r0 = r0.A05     // Catch:{ all -> 0x04c7 }
            X.0sH r0 = r1.A09(r0)     // Catch:{ all -> 0x04c7 }
            if (r0 == 0) goto L_0x04c5
            boolean r0 = X.C224818c.A08(r0)     // Catch:{ all -> 0x04c7 }
            if (r0 == 0) goto L_0x04c5
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x04c7 }
            r1.<init>()     // Catch:{ all -> 0x04c7 }
            r2.A0B()     // Catch:{ all -> 0x04c7 }
            X.1ZT r0 = r2.A05     // Catch:{ all -> 0x04c7 }
            r1.add(r0)     // Catch:{ all -> 0x04c7 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x04c7 }
            r0.<init>()     // Catch:{ all -> 0x04c7 }
            android.util.Pair r0 = r3.A09(r1, r0)     // Catch:{ all -> 0x04c7 }
            X.1CW r2 = r3.A0o     // Catch:{ all -> 0x04c7 }
            java.lang.String r1 = "SYNC_MANAGER_CONTACTS_JID_ADDED"
            java.lang.Object r0 = r0.first     // Catch:{ all -> 0x04c7 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ all -> 0x04c7 }
            r2.A06(r1, r0)     // Catch:{ all -> 0x04c7 }
            r3.A0L()     // Catch:{ all -> 0x04c7 }
        L_0x04c5:
            monitor-exit(r3)     // Catch:{ all -> 0x04c7 }
            return
        L_0x04c7:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x04c7 }
            throw r0
        L_0x04ca:
            java.lang.Object r3 = r1.A00
            com.obwhatsapp.companiondevice.sync.HistorySyncWorker r3 = (com.obwhatsapp.companiondevice.sync.HistorySyncWorker) r3
            r3.A04()     // Catch:{ all -> 0x04e4 }
            com.facebook.redex.RunnableRunnableShape0S0400000_I0 r0 = r3.A00     // Catch:{ all -> 0x04e4 }
            if (r0 == 0) goto L_0x04d8
            r0.run()     // Catch:{ all -> 0x04e4 }
        L_0x04d8:
            X.1WE r1 = r3.A01
            if (r1 == 0) goto L_0x06c0
            X.1RS r0 = r3.A06
            X.1XS r0 = r0.A00
            r0.A02(r1)
            return
        L_0x04e4:
            r2 = move-exception
            X.1WE r1 = r3.A01
            if (r1 == 0) goto L_0x04f0
            X.1RS r0 = r3.A06
            X.1XS r0 = r0.A00
            r0.A02(r1)
        L_0x04f0:
            throw r2
        L_0x04f1:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.companiondevice.sync.HistorySyncCompanionWorker r0 = (com.obwhatsapp.companiondevice.sync.HistorySyncCompanionWorker) r0
            r0.A04()
            return
        L_0x04f9:
            java.lang.Object r5 = r1.A00
            X.11S r5 = (X.AnonymousClass11S) r5
            java.util.Set r0 = X.AnonymousClass1WJ.A08
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r0)
            java.util.Set r0 = X.AnonymousClass1WJ.A09
            r1.removeAll(r0)
            java.util.Iterator r4 = r1.iterator()
        L_0x050d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0545
            java.lang.Object r3 = r4.next()
            java.lang.String r3 = (java.lang.String) r3
            X.11P r2 = r5.A04
            r0 = 0
            r2.A04(r3, r0)
            goto L_0x050d
        L_0x0521:
            java.lang.Object r5 = r1.A00
            X.11S r5 = (X.AnonymousClass11S) r5
            java.util.Set r0 = X.AnonymousClass1WJ.A09
            java.util.Iterator r4 = r0.iterator()
        L_0x052b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x053f
            java.lang.Object r3 = r4.next()
            java.lang.String r3 = (java.lang.String) r3
            X.11P r2 = r5.A04
            r0 = 0
            r2.A04(r3, r0)
            goto L_0x052b
        L_0x053f:
            X.11R r1 = r5.A03
            r0 = 1
            r1.A02(r0)
        L_0x0545:
            X.0xU r0 = r5.A02
            r0.A0O()
            return
        L_0x054b:
            java.lang.Object r0 = r1.A00
            X.0tJ r0 = (X.C16590tJ) r0
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0557:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x06c0
            java.lang.Object r0 = r1.next()
            X.0xX r0 = (X.C18960xX) r0
            r0.AYe()
            goto L_0x0557
        L_0x0567:
            java.lang.Object r7 = r1.A00
            X.0yb r7 = (X.C19540yb) r7
            X.19E r8 = r7.A04
            X.139 r4 = r7.A05
            android.content.SharedPreferences r1 = r4.A01()
            java.lang.String r5 = "syncd_dirty_reason"
            r0 = 0
            int r0 = r1.getInt(r5, r0)
            if (r0 == 0) goto L_0x05bc
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        L_0x0581:
            android.content.SharedPreferences r2 = r4.A01()
            java.lang.String r1 = "syncd_dirty"
            r0 = -1
            int r0 = r2.getInt(r1, r0)
            int r0 = r0 + -1
            long r2 = (long) r0
            X.28K r1 = new X.28K
            r1.<init>()
            r1.A00 = r6
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A01 = r0
            X.0t9 r0 = r8.A06
            r0.A06(r1)
            X.1Ch r0 = r7.A03
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x05ac:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x05be
            java.lang.Object r0 = r1.next()
            X.0xX r0 = (X.C18960xX) r0
            r0.AYd()
            goto L_0x05ac
        L_0x05bc:
            r6 = 0
            goto L_0x0581
        L_0x05be:
            android.content.SharedPreferences r0 = r4.A01()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.remove(r5)
            r0.apply()
            r0 = -1
            r4.A05(r0)
            return
        L_0x05d2:
            java.lang.Object r0 = r1.A00
            X.0yb r0 = (X.C19540yb) r0
            r0.A00()
            return
        L_0x05da:
            java.lang.Object r0 = r1.A00
            X.1Wc r0 = (X.C28441Wc) r0
            r0.A00()
            X.1Wd r3 = r0.A02
            java.lang.String r0 = "SyncResponseHandler/onDeliveryFailure request failed to be delivered, retrying."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1ue r0 = r3.A0J
            java.lang.Long r2 = r0.A00()
            r1 = 0
            r0 = 1
            r3.A04(r2, r1, r0)
            return
        L_0x05f4:
            java.lang.Object r0 = r1.A00
            com.obwhatsapp.companiondevice.LinkedDevicesViewModel r0 = (com.obwhatsapp.companiondevice.LinkedDevicesViewModel) r0
            X.0sq r4 = r0.A09
            X.0yO r3 = r0.A03
            X.113 r2 = r0.A04
            X.28N r0 = r0.A02
            X.28O r1 = new X.28O
            r1.<init>(r0, r3, r2)
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r4.Ack(r1, r0)
            return
        L_0x060c:
            java.lang.Object r3 = r1.A00
            com.obwhatsapp.companiondevice.LinkedDevicesSharedViewModel r3 = (com.obwhatsapp.companiondevice.LinkedDevicesSharedViewModel) r3
            X.0sq r2 = r3.A0V
            r1 = 12
            com.facebook.redex.RunnableRunnableShape6S0100000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape6S0100000_I0_5
            r0.<init>(r3, r1)
            r2.Acl(r0)
            return
        L_0x061d:
            java.lang.Object r5 = r1.A00
            com.obwhatsapp.companiondevice.LinkedDevicesSharedViewModel r5 = (com.obwhatsapp.companiondevice.LinkedDevicesSharedViewModel) r5
            X.0yO r6 = r5.A0E
            java.util.Set r0 = r6.A0P
            r0.clear()
            java.util.List r0 = r6.A07()
            java.util.Iterator r4 = r0.iterator()
        L_0x0630:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0651
            java.lang.Object r0 = r4.next()
            X.1WN r0 = (X.AnonymousClass1WN) r0
            com.whatsapp.jid.DeviceJid r1 = r0.A06
            X.0ug r3 = r6.A0K
            r2 = 0
            r0 = 240(0xf0, float:3.36E-43)
            android.os.Message r1 = android.os.Message.obtain(r10, r2, r0, r2, r1)
            X.0tK r0 = r3.A02
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0630
            r3.A09(r1, r2)
            goto L_0x0630
        L_0x0651:
            X.0sq r4 = r5.A0V
            r0 = 13
            com.facebook.redex.RunnableRunnableShape6S0100000_I0_5 r3 = new com.facebook.redex.RunnableRunnableShape6S0100000_I0_5
            r3.<init>(r5, r0)
            r1 = 30000(0x7530, double:1.4822E-319)
            java.lang.String r0 = "LinedDevicesActivity/refresh"
            java.lang.Runnable r0 = r4.Ad4(r3, r0, r1)
            r5.A02 = r0
            return
        L_0x0665:
            java.lang.Object r4 = r1.A00
            com.obwhatsapp.companiondevice.LinkedDevicesActivity r4 = (com.obwhatsapp.companiondevice.LinkedDevicesActivity) r4
            boolean r0 = r4.isFinishing()
            if (r0 != 0) goto L_0x06c0
            androidx.recyclerview.widget.RecyclerView r0 = r4.A00
            X.02W r0 = r0.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r1 = r0.A1A()
            int r0 = r0.A18()
            int r1 = r1 - r0
            r3 = 1
            int r2 = r1 + 1
            X.2UN r0 = r4.A03
            java.util.List r0 = r0.A02
            int r0 = r0.size()
            r1 = 0
            if (r2 == r0) goto L_0x068f
            r3 = 0
        L_0x068f:
            androidx.recyclerview.widget.RecyclerView r0 = r4.A00
            if (r3 == 0) goto L_0x0694
            r1 = 2
        L_0x0694:
            r0.setOverScrollMode(r1)
            return
        L_0x0698:
            java.lang.Object r0 = r1.A00
            X.0pN r0 = (X.C14550pN) r0
            X.0pt r2 = r0.A05
            r1 = 2131889386(0x7f120cea, float:1.9413434E38)
            r0 = 1
            r2.A0A(r1, r0)
            return
        L_0x06a6:
            java.lang.Object r1 = r1.A00
            X.2UO r1 = (X.AnonymousClass2UO) r1
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x06c0
            X.2UP r1 = r1.A06
            r0 = -2
            r1.A00(r0)
            return
        L_0x06b5:
            java.lang.Object r0 = r1.A00
            X.0sG r0 = (X.C16000sG) r0
            X.0xq r1 = r0.A0E
            X.1kq r0 = X.C34771kq.A00
            r1.A04(r0)
        L_0x06c0:
            return
        L_0x06c1:
            java.lang.Object r0 = r1.A00
            X.2Uf r0 = (X.C49602Uf) r0
            r0.AW1()
            return
        L_0x06c9:
            java.lang.Object r0 = r1.A00
            X.2Ug r0 = (X.AnonymousClass2Ug) r0
            X.2Ui r2 = r0.A01
            X.2UO r1 = r2.A01
            if (r1 == 0) goto L_0x06d6
            r0 = 0
            r1.A02 = r0
        L_0x06d6:
            X.2Uf r0 = r2.A0G
            r0.AYf()
            return
        L_0x06dc:
            java.lang.Object r0 = r1.A00
            X.2UP r0 = (X.AnonymousClass2UP) r0
            X.2Ui r0 = r0.A00
            X.0yO r5 = r0.A0E
            X.1WF r2 = r0.A00
            java.lang.Object r4 = r5.A0O
            monitor-enter(r4)
            X.1WF r0 = r5.A00     // Catch:{ all -> 0x0723 }
            if (r0 != 0) goto L_0x070e
            r5.A01 = r10     // Catch:{ all -> 0x0723 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0723 }
            r1.<init>()     // Catch:{ all -> 0x0723 }
            java.lang.String r0 = "companion-device-manager/device login initiated: "
            r1.append(r0)     // Catch:{ all -> 0x0723 }
            X.1WN r0 = r2.A01     // Catch:{ all -> 0x0723 }
            com.whatsapp.jid.DeviceJid r0 = r0.A06     // Catch:{ all -> 0x0723 }
            r1.append(r0)     // Catch:{ all -> 0x0723 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0723 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0723 }
            r5.A00 = r2     // Catch:{ all -> 0x0723 }
            r0 = 1
            r5.A03 = r0     // Catch:{ all -> 0x0723 }
        L_0x070c:
            monitor-exit(r4)     // Catch:{ all -> 0x0723 }
            goto L_0x0722
        L_0x070e:
            java.lang.String r0 = "companion-device-manager/onDeviceLoginInitiated/login already initiated"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0723 }
            X.0so r3 = r5.A05     // Catch:{ all -> 0x0723 }
            java.lang.String r2 = "companion-device-manager/login already initiated"
            boolean r0 = r5.A03     // Catch:{ all -> 0x0723 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0723 }
            r0 = 0
            r3.AcB(r2, r1, r0)     // Catch:{ all -> 0x0723 }
            goto L_0x070c
        L_0x0722:
            return
        L_0x0723:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0723 }
            throw r0
        L_0x0726:
            java.lang.Object r2 = r1.A00
            X.2Ui r2 = (X.AnonymousClass2Ui) r2
            X.2UO r1 = r2.A01
            if (r1 == 0) goto L_0x0731
            r0 = 0
            r1.A02 = r0
        L_0x0731:
            X.2Uf r0 = r2.A0G
            r0.ASK()
            return
        L_0x0737:
            java.lang.Object r0 = r1.A00
            X.27H r0 = (X.AnonymousClass27H) r0
            X.0yO r2 = r0.A04
            java.lang.String r1 = "invalid_adv_status"
            r0 = 1
            r2.A0C(r1, r0)
            return
        L_0x0744:
            java.lang.Object r3 = r1.A00
            X.2Uk r3 = (X.C49622Uk) r3
            X.0sq r2 = r3.A0B
            r1 = 1
            com.facebook.redex.RunnableRunnableShape6S0100000_I0_5 r0 = new com.facebook.redex.RunnableRunnableShape6S0100000_I0_5
            r0.<init>(r3, r1)
            r2.Acl(r0)
            return
        L_0x0754:
            java.lang.Object r0 = r1.A00
            X.2Uk r0 = (X.C49622Uk) r0
            X.2OJ r1 = r0.A08
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A09(r0)
            return
        L_0x0763:
            java.lang.Object r3 = r1.A00
            X.2Uk r3 = (X.C49622Uk) r3
            X.2OJ r1 = r3.A09
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A09(r0)
            X.0sL r6 = r3.A00
            if (r6 != 0) goto L_0x077d
            X.027 r1 = r3.A01
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A09(r0)
            return
        L_0x077d:
            X.0vd r1 = r3.A07
            X.0ul r5 = r3.A06
            X.11A r4 = r3.A05
            X.0rt r0 = r3.A04
            java.lang.String r7 = r0.A09(r6)
            X.2Un r2 = new X.2Un
            r2.<init>(r3, r4, r5, r6, r7)
            r1.A06(r2)
            return
        L_0x0792:
            java.lang.Object r0 = r1.A00
            X.2Uo r0 = (X.C49642Uo) r0
            X.0uk r2 = r0.A05
            X.0sL r1 = r0.A0U
            r0 = 3
            r2.A05(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape6S0100000_I0_5.run():void");
    }
}

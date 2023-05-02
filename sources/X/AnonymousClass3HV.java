package X;

/* renamed from: X.3HV  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3HV implements Runnable {
    public final C15500rE A00;

    public AnonymousClass3HV(C15500rE r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        r5 = java.lang.String.valueOf(r7);
        r1 = X.C13690nt.A0g(r5.length() + 8);
        r1.append("Sending ");
        android.util.Log.d("MessengerIpcClient", X.AnonymousClass000.A0h(r5, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        r6 = r6.A02;
        r1 = r2.A02;
        r5 = android.os.Message.obtain();
        r5.what = r7.A01;
        r5.arg1 = r4;
        r5.replyTo = r1;
        r4 = X.C13690nt.A0D();
        r4.putBoolean("oneWay", r7.A03());
        r4.putString("pkg", r6.getPackageName());
        r4.putBundle("data", r7.A02);
        r5.setData(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1 = r2.A01;
        r0 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008d, code lost:
        if (r0 == null) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008f, code lost:
        r0.send(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0094, code lost:
        r0 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0096, code lost:
        if (r0 == null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0098, code lost:
        r0.A00(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a3, code lost:
        throw X.AnonymousClass000.A0V("Both messengers are null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a5, code lost:
        r2.A01(2, r0.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            X.0rE r2 = r10.A00
        L_0x0002:
            monitor-enter(r2)
            int r0 = r2.A00     // Catch:{ all -> 0x00af }
            r3 = 2
            if (r0 != r3) goto L_0x0013
            java.util.Queue r1 = r2.A04     // Catch:{ all -> 0x00af }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x0016
            r2.A00()     // Catch:{ all -> 0x00af }
        L_0x0013:
            monitor-exit(r2)     // Catch:{ all -> 0x00af }
            goto L_0x00ae
        L_0x0016:
            java.lang.Object r7 = r1.poll()     // Catch:{ all -> 0x00af }
            X.0pF r7 = (X.C14480pF) r7     // Catch:{ all -> 0x00af }
            android.util.SparseArray r0 = r2.A03     // Catch:{ all -> 0x00af }
            int r4 = r7.A00     // Catch:{ all -> 0x00af }
            r0.put(r4, r7)     // Catch:{ all -> 0x00af }
            X.0pD r6 = r2.A05     // Catch:{ all -> 0x00af }
            java.util.concurrent.ScheduledExecutorService r9 = r6.A03     // Catch:{ all -> 0x00af }
            r0 = 24
            com.facebook.redex.RunnableRunnableShape12S0200000_I1 r8 = new com.facebook.redex.RunnableRunnableShape12S0200000_I1     // Catch:{ all -> 0x00af }
            r8.<init>(r2, r0, r7)     // Catch:{ all -> 0x00af }
            r0 = 30
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00af }
            r9.schedule(r8, r0, r5)     // Catch:{ all -> 0x00af }
            monitor-exit(r2)     // Catch:{ all -> 0x00af }
            java.lang.String r8 = "MessengerIpcClient"
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r8, r0)
            if (r0 == 0) goto L_0x0059
            java.lang.String r5 = java.lang.String.valueOf(r7)
            int r0 = r5.length()
            int r0 = r0 + 8
            java.lang.StringBuilder r1 = X.C13690nt.A0g(r0)
            java.lang.String r0 = "Sending "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r5, r1)
            android.util.Log.d(r8, r0)
        L_0x0059:
            android.content.Context r6 = r6.A02
            android.os.Messenger r1 = r2.A02
            android.os.Message r5 = android.os.Message.obtain()
            int r0 = r7.A01
            r5.what = r0
            r5.arg1 = r4
            r5.replyTo = r1
            android.os.Bundle r4 = X.C13690nt.A0D()
            java.lang.String r1 = "oneWay"
            boolean r0 = r7.A03()
            r4.putBoolean(r1, r0)
            java.lang.String r1 = "pkg"
            java.lang.String r0 = r6.getPackageName()
            r4.putString(r1, r0)
            java.lang.String r1 = "data"
            android.os.Bundle r0 = r7.A02
            r4.putBundle(r1, r0)
            r5.setData(r4)
            X.4GZ r1 = r2.A01     // Catch:{ RemoteException -> 0x00a4 }
            android.os.Messenger r0 = r1.A00     // Catch:{ RemoteException -> 0x00a4 }
            if (r0 == 0) goto L_0x0094
            r0.send(r5)     // Catch:{ RemoteException -> 0x00a4 }
            goto L_0x0002
        L_0x0094:
            X.0pC r0 = r1.A01     // Catch:{ RemoteException -> 0x00a4 }
            if (r0 == 0) goto L_0x009d
            r0.A00(r5)     // Catch:{ RemoteException -> 0x00a4 }
            goto L_0x0002
        L_0x009d:
            java.lang.String r0 = "Both messengers are null"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ RemoteException -> 0x00a4 }
            throw r0     // Catch:{ RemoteException -> 0x00a4 }
        L_0x00a4:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2.A01(r3, r0)
            goto L_0x0002
        L_0x00ae:
            return
        L_0x00af:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00af }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3HV.run():void");
    }
}

package e;

/* compiled from: XFMFile */
public final class m0 extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1696a = 1;

    public m0() {
        super("Okio Watchdog");
        setDaemon(true);
    }

    public m0(Runnable runnable) {
        super(runnable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r1.timedOut();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
            int r0 = r3.f1696a
            switch(r0) {
                case 0: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x000f
        L_0x0006:
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            super.run()
            return
        L_0x000f:
            java.lang.Class<okio.AsyncTimeout> r0 = okio.AsyncTimeout.class
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x000f }
            okio.AsyncTimeout r1 = okio.AsyncTimeout.a()     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x001a
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            goto L_0x000f
        L_0x001a:
            okio.AsyncTimeout r2 = okio.AsyncTimeout.f2318i     // Catch:{ all -> 0x0028 }
            if (r1 != r2) goto L_0x0023
            r1 = 0
            okio.AsyncTimeout.f2318i = r1     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            r1.timedOut()     // Catch:{ InterruptedException -> 0x000f }
            goto L_0x000f
        L_0x0028:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r1     // Catch:{ InterruptedException -> 0x000f }
        */
        throw new UnsupportedOperationException("Method not decompiled: e.m0.run():void");
    }
}

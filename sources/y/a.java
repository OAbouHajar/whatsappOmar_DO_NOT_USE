package y;

import okhttp3.internal.ws.RealWebSocket;

/* compiled from: XFMFile */
public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2791a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RealWebSocket f2792b;

    public /* synthetic */ a(RealWebSocket realWebSocket, int i2) {
        this.f2791a = i2;
        this.f2792b = realWebSocket;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        if (r3 == -1) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003a, code lost:
        r2 = new java.net.SocketTimeoutException("sent ping but didn't receive pong within " + r0.f2298d + "ms (after " + (r3 - 1) + " successful ping/pongs)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r2.a(okio.ByteString.EMPTY, 9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0066, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            int r0 = r9.f2791a
            r1 = 0
            switch(r0) {
                case 0: goto L_0x000d;
                case 1: goto L_0x0007;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x001b
        L_0x0007:
            okhttp3.internal.ws.RealWebSocket r0 = r9.f2792b
            r0.cancel()
            return
        L_0x000d:
            okhttp3.internal.ws.RealWebSocket r0 = r9.f2792b
        L_0x000f:
            boolean r2 = r0.c()     // Catch:{ IOException -> 0x0016 }
            if (r2 == 0) goto L_0x001a
            goto L_0x000f
        L_0x0016:
            r2 = move-exception
            r0.failWebSocket(r2, r1)
        L_0x001a:
            return
        L_0x001b:
            okhttp3.internal.ws.RealWebSocket r0 = r9.f2792b
            monitor-enter(r0)
            boolean r2 = r0.f2313s     // Catch:{ all -> 0x006b }
            if (r2 == 0) goto L_0x0024
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            goto L_0x006a
        L_0x0024:
            y.f r2 = r0.f2303i     // Catch:{ all -> 0x006b }
            boolean r3 = r0.f2315u     // Catch:{ all -> 0x006b }
            r4 = -1
            if (r3 == 0) goto L_0x002e
            int r3 = r0.f2314t     // Catch:{ all -> 0x006b }
            goto L_0x002f
        L_0x002e:
            r3 = -1
        L_0x002f:
            int r5 = r0.f2314t     // Catch:{ all -> 0x006b }
            r6 = 1
            int r5 = r5 + r6
            r0.f2314t = r5     // Catch:{ all -> 0x006b }
            r0.f2315u = r6     // Catch:{ all -> 0x006b }
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            if (r3 == r4) goto L_0x005e
            java.net.SocketTimeoutException r2 = new java.net.SocketTimeoutException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "sent ping but didn't receive pong within "
            r4.<init>(r5)
            long r7 = r0.f2298d
            r4.append(r7)
            java.lang.String r5 = "ms (after "
            r4.append(r5)
            int r3 = r3 - r6
            r4.append(r3)
            java.lang.String r3 = " successful ping/pongs)"
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            goto L_0x0067
        L_0x005e:
            okio.ByteString r3 = okio.ByteString.EMPTY     // Catch:{ IOException -> 0x0066 }
            r4 = 9
            r2.a(r3, r4)     // Catch:{ IOException -> 0x0066 }
            goto L_0x006a
        L_0x0066:
            r2 = move-exception
        L_0x0067:
            r0.failWebSocket(r2, r1)
        L_0x006a:
            return
        L_0x006b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x006b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y.a.run():void");
    }
}

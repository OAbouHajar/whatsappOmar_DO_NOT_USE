package e;

/* compiled from: XFMFile */
public final class g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1638a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1639b;

    public /* synthetic */ g(Object obj, int i2) {
        this.f1638a = i2;
        this.f1639b = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r1 = r6.f1639b;
        ((okhttp3.internal.cache.DiskLruCache) r1).f2144q = true;
        ((okhttp3.internal.cache.DiskLruCache) r1).f2137j = okio.Okio.buffer(okio.Okio.blackhole());
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0023 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0041 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f1639b
            okhttp3.internal.cache.DiskLruCache r0 = (okhttp3.internal.cache.DiskLruCache) r0
            monitor-enter(r0)
            java.lang.Object r1 = r6.f1639b     // Catch:{ all -> 0x0056 }
            r2 = r1
            okhttp3.internal.cache.DiskLruCache r2 = (okhttp3.internal.cache.DiskLruCache) r2     // Catch:{ all -> 0x0056 }
            boolean r2 = r2.f2141n     // Catch:{ all -> 0x0056 }
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L_0x0012
            r2 = 1
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r5 = r1
            okhttp3.internal.cache.DiskLruCache r5 = (okhttp3.internal.cache.DiskLruCache) r5     // Catch:{ all -> 0x0056 }
            boolean r5 = r5.f2142o     // Catch:{ all -> 0x0056 }
            r2 = r2 | r5
            if (r2 == 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            return
        L_0x001d:
            okhttp3.internal.cache.DiskLruCache r1 = (okhttp3.internal.cache.DiskLruCache) r1     // Catch:{ IOException -> 0x0023 }
            r1.j()     // Catch:{ IOException -> 0x0023 }
            goto L_0x0029
        L_0x0023:
            java.lang.Object r1 = r6.f1639b     // Catch:{ all -> 0x0056 }
            okhttp3.internal.cache.DiskLruCache r1 = (okhttp3.internal.cache.DiskLruCache) r1     // Catch:{ all -> 0x0056 }
            r1.f2143p = r4     // Catch:{ all -> 0x0056 }
        L_0x0029:
            java.lang.Object r1 = r6.f1639b     // Catch:{ IOException -> 0x0041 }
            okhttp3.internal.cache.DiskLruCache r1 = (okhttp3.internal.cache.DiskLruCache) r1     // Catch:{ IOException -> 0x0041 }
            boolean r1 = r1.d()     // Catch:{ IOException -> 0x0041 }
            if (r1 == 0) goto L_0x0054
            java.lang.Object r1 = r6.f1639b     // Catch:{ IOException -> 0x0041 }
            okhttp3.internal.cache.DiskLruCache r1 = (okhttp3.internal.cache.DiskLruCache) r1     // Catch:{ IOException -> 0x0041 }
            r1.h()     // Catch:{ IOException -> 0x0041 }
            java.lang.Object r1 = r6.f1639b     // Catch:{ IOException -> 0x0041 }
            okhttp3.internal.cache.DiskLruCache r1 = (okhttp3.internal.cache.DiskLruCache) r1     // Catch:{ IOException -> 0x0041 }
            r1.f2139l = r3     // Catch:{ IOException -> 0x0041 }
            goto L_0x0054
        L_0x0041:
            java.lang.Object r1 = r6.f1639b     // Catch:{ all -> 0x0056 }
            r2 = r1
            okhttp3.internal.cache.DiskLruCache r2 = (okhttp3.internal.cache.DiskLruCache) r2     // Catch:{ all -> 0x0056 }
            r2.f2144q = r4     // Catch:{ all -> 0x0056 }
            okhttp3.internal.cache.DiskLruCache r1 = (okhttp3.internal.cache.DiskLruCache) r1     // Catch:{ all -> 0x0056 }
            okio.Sink r2 = okio.Okio.blackhole()     // Catch:{ all -> 0x0056 }
            okio.BufferedSink r2 = okio.Okio.buffer((okio.Sink) r2)     // Catch:{ all -> 0x0056 }
            r1.f2137j = r2     // Catch:{ all -> 0x0056 }
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            return
        L_0x0056:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0056 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g.a():void");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
            int r0 = r6.f1638a
            switch(r0) {
                case 0: goto L_0x0064;
                case 1: goto L_0x0056;
                case 2: goto L_0x003e;
                case 3: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            r6.a()
            return
        L_0x0009:
            java.lang.Object r0 = r6.f1639b
            okhttp3.ConnectionPool r0 = (okhttp3.ConnectionPool) r0
            long r1 = java.lang.System.nanoTime()
            long r0 = r0.a(r1)
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x001c
            return
        L_0x001c:
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0009
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r0 / r2
            long r2 = r2 * r4
            long r0 = r0 - r2
            java.lang.Object r2 = r6.f1639b
            okhttp3.ConnectionPool r2 = (okhttp3.ConnectionPool) r2
            monitor-enter(r2)
            java.lang.Object r3 = r6.f1639b     // Catch:{ InterruptedException -> 0x003a }
            okhttp3.ConnectionPool r3 = (okhttp3.ConnectionPool) r3     // Catch:{ InterruptedException -> 0x003a }
            int r1 = (int) r0     // Catch:{ InterruptedException -> 0x003a }
            r3.wait(r4, r1)     // Catch:{ InterruptedException -> 0x003a }
            goto L_0x003a
        L_0x0038:
            r0 = move-exception
            goto L_0x003c
        L_0x003a:
            monitor-exit(r2)     // Catch:{ all -> 0x0038 }
            goto L_0x0009
        L_0x003c:
            monitor-exit(r2)     // Catch:{ all -> 0x0038 }
            throw r0
        L_0x003e:
            java.lang.Object r0 = r6.f1639b
            android.view.View r0 = (android.view.View) r0
            boolean r1 = com.obwhatsapp.yo.yo.o()
            if (r1 == 0) goto L_0x004a
            r1 = 0
            goto L_0x004c
        L_0x004a:
            r1 = 8
        L_0x004c:
            r0.setVisibility(r1)
            r1 = 3600000(0x36ee80, double:1.7786363E-317)
            r0.postDelayed(r6, r1)
            return
        L_0x0056:
            java.lang.Object r0 = r6.f1639b
            e.q r0 = (e.q) r0
            e.p r0 = r0.f1716n
            e.q r1 = r0.f1702a
            android.content.Context r1 = r1.f1704b
            r1.unregisterReceiver(r0)
            return
        L_0x0064:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.Object r1 = r6.f1639b
            java.lang.StringBuilder r1 = (java.lang.StringBuilder) r1
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.g.run():void");
    }
}

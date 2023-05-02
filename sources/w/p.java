package w;

import okhttp3.internal.http2.Http2Stream;
import okio.Buffer;
import okio.Source;
import okio.Timeout;

/* compiled from: XFMFile */
public final class p implements Source {

    /* renamed from: a  reason: collision with root package name */
    public final Buffer f2749a = new Buffer();

    /* renamed from: b  reason: collision with root package name */
    public final Buffer f2750b = new Buffer();

    /* renamed from: c  reason: collision with root package name */
    public final long f2751c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2752d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f2753e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Http2Stream f2754f;

    public p(Http2Stream http2Stream, long j2) {
        this.f2754f = http2Stream;
        this.f2751c = j2;
    }

    public final void close() {
        long size;
        synchronized (this.f2754f) {
            this.f2752d = true;
            size = this.f2750b.size();
            this.f2750b.clear();
            this.f2754f.notifyAll();
        }
        if (size > 0) {
            this.f2754f.f2271d.g(size);
        }
        this.f2754f.a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009c, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009d, code lost:
        r3.f2277j.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a2, code lost:
        throw r11;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long read(okio.Buffer r11, long r12) {
        /*
            r10 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x00a6
            okhttp3.internal.http2.Http2Stream r2 = r10.f2754f
            monitor-enter(r2)
            okhttp3.internal.http2.Http2Stream r3 = r10.f2754f     // Catch:{ all -> 0x00a3 }
            w.q r4 = r3.f2277j     // Catch:{ all -> 0x00a3 }
            r4.enter()     // Catch:{ all -> 0x00a3 }
        L_0x0010:
            okio.Buffer r4 = r10.f2750b     // Catch:{ all -> 0x009c }
            long r4 = r4.size()     // Catch:{ all -> 0x009c }
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x002a
            boolean r4 = r10.f2753e     // Catch:{ all -> 0x009c }
            if (r4 != 0) goto L_0x002a
            boolean r4 = r10.f2752d     // Catch:{ all -> 0x009c }
            if (r4 != 0) goto L_0x002a
            okhttp3.internal.http2.ErrorCode r4 = r3.f2279l     // Catch:{ all -> 0x009c }
            if (r4 != 0) goto L_0x002a
            r3.g()     // Catch:{ all -> 0x009c }
            goto L_0x0010
        L_0x002a:
            w.q r3 = r3.f2277j     // Catch:{ all -> 0x00a3 }
            r3.d()     // Catch:{ all -> 0x00a3 }
            boolean r3 = r10.f2752d     // Catch:{ all -> 0x00a3 }
            if (r3 != 0) goto L_0x0094
            okhttp3.internal.http2.Http2Stream r3 = r10.f2754f     // Catch:{ all -> 0x00a3 }
            okhttp3.internal.http2.ErrorCode r3 = r3.f2279l     // Catch:{ all -> 0x00a3 }
            okio.Buffer r4 = r10.f2750b     // Catch:{ all -> 0x00a3 }
            long r4 = r4.size()     // Catch:{ all -> 0x00a3 }
            r6 = -1
            int r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x0059
            okio.Buffer r4 = r10.f2750b     // Catch:{ all -> 0x00a3 }
            long r8 = r4.size()     // Catch:{ all -> 0x00a3 }
            long r12 = java.lang.Math.min(r12, r8)     // Catch:{ all -> 0x00a3 }
            long r11 = r4.read(r11, r12)     // Catch:{ all -> 0x00a3 }
            okhttp3.internal.http2.Http2Stream r13 = r10.f2754f     // Catch:{ all -> 0x00a3 }
            long r4 = r13.f2268a     // Catch:{ all -> 0x00a3 }
            long r4 = r4 + r11
            r13.f2268a = r4     // Catch:{ all -> 0x00a3 }
            goto L_0x005a
        L_0x0059:
            r11 = r6
        L_0x005a:
            if (r3 != 0) goto L_0x007e
            okhttp3.internal.http2.Http2Stream r13 = r10.f2754f     // Catch:{ all -> 0x00a3 }
            long r4 = r13.f2268a     // Catch:{ all -> 0x00a3 }
            okhttp3.internal.http2.Http2Connection r13 = r13.f2271d     // Catch:{ all -> 0x00a3 }
            okhttp3.internal.http2.Settings r13 = r13.f2253n     // Catch:{ all -> 0x00a3 }
            int r13 = r13.a()     // Catch:{ all -> 0x00a3 }
            int r13 = r13 / 2
            long r8 = (long) r13     // Catch:{ all -> 0x00a3 }
            int r13 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r13 < 0) goto L_0x007e
            okhttp3.internal.http2.Http2Stream r13 = r10.f2754f     // Catch:{ all -> 0x00a3 }
            okhttp3.internal.http2.Http2Connection r4 = r13.f2271d     // Catch:{ all -> 0x00a3 }
            int r5 = r13.f2270c     // Catch:{ all -> 0x00a3 }
            long r8 = r13.f2268a     // Catch:{ all -> 0x00a3 }
            r4.j(r5, r8)     // Catch:{ all -> 0x00a3 }
            okhttp3.internal.http2.Http2Stream r13 = r10.f2754f     // Catch:{ all -> 0x00a3 }
            r13.f2268a = r0     // Catch:{ all -> 0x00a3 }
        L_0x007e:
            monitor-exit(r2)     // Catch:{ all -> 0x00a3 }
            int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r13 == 0) goto L_0x008b
            okhttp3.internal.http2.Http2Stream r13 = r10.f2754f
            okhttp3.internal.http2.Http2Connection r13 = r13.f2271d
            r13.g(r11)
            return r11
        L_0x008b:
            if (r3 != 0) goto L_0x008e
            return r6
        L_0x008e:
            okhttp3.internal.http2.StreamResetException r11 = new okhttp3.internal.http2.StreamResetException
            r11.<init>(r3)
            throw r11
        L_0x0094:
            java.io.IOException r11 = new java.io.IOException     // Catch:{ all -> 0x00a3 }
            java.lang.String r12 = "stream closed"
            r11.<init>(r12)     // Catch:{ all -> 0x00a3 }
            throw r11     // Catch:{ all -> 0x00a3 }
        L_0x009c:
            r11 = move-exception
            w.q r12 = r3.f2277j     // Catch:{ all -> 0x00a3 }
            r12.d()     // Catch:{ all -> 0x00a3 }
            throw r11     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r11 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00a3 }
            throw r11
        L_0x00a6:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "byteCount < 0: "
            java.lang.String r12 = a.a.e(r0, r12)
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: w.p.read(okio.Buffer, long):long");
    }

    public final Timeout timeout() {
        return this.f2754f.f2277j;
    }
}

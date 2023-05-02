package w;

import okhttp3.internal.http2.Http2Stream;
import okio.Buffer;
import okio.Sink;
import okio.Timeout;

/* compiled from: XFMFile */
public final class o implements Sink {

    /* renamed from: a  reason: collision with root package name */
    public final Buffer f2745a = new Buffer();

    /* renamed from: b  reason: collision with root package name */
    public boolean f2746b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2747c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Http2Stream f2748d;

    public o(Http2Stream http2Stream) {
        this.f2748d = http2Stream;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1.f2278k.d();
        r11.f2748d.b();
        r9 = java.lang.Math.min(r11.f2748d.f2269b, r11.f2745a.size());
        r1 = r11.f2748d;
        r1.f2269b -= r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r12) {
        /*
            r11 = this;
            okhttp3.internal.http2.Http2Stream r0 = r11.f2748d
            monitor-enter(r0)
            okhttp3.internal.http2.Http2Stream r1 = r11.f2748d     // Catch:{ all -> 0x007f }
            w.q r1 = r1.f2278k     // Catch:{ all -> 0x007f }
            r1.enter()     // Catch:{ all -> 0x007f }
        L_0x000a:
            okhttp3.internal.http2.Http2Stream r1 = r11.f2748d     // Catch:{ all -> 0x0076 }
            long r2 = r1.f2269b     // Catch:{ all -> 0x0076 }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0024
            boolean r2 = r11.f2747c     // Catch:{ all -> 0x0076 }
            if (r2 != 0) goto L_0x0024
            boolean r2 = r11.f2746b     // Catch:{ all -> 0x0076 }
            if (r2 != 0) goto L_0x0024
            okhttp3.internal.http2.ErrorCode r2 = r1.f2279l     // Catch:{ all -> 0x0076 }
            if (r2 != 0) goto L_0x0024
            r1.g()     // Catch:{ all -> 0x0076 }
            goto L_0x000a
        L_0x0024:
            w.q r1 = r1.f2278k     // Catch:{ all -> 0x007f }
            r1.d()     // Catch:{ all -> 0x007f }
            okhttp3.internal.http2.Http2Stream r1 = r11.f2748d     // Catch:{ all -> 0x007f }
            r1.b()     // Catch:{ all -> 0x007f }
            okhttp3.internal.http2.Http2Stream r1 = r11.f2748d     // Catch:{ all -> 0x007f }
            long r1 = r1.f2269b     // Catch:{ all -> 0x007f }
            okio.Buffer r3 = r11.f2745a     // Catch:{ all -> 0x007f }
            long r3 = r3.size()     // Catch:{ all -> 0x007f }
            long r9 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x007f }
            okhttp3.internal.http2.Http2Stream r1 = r11.f2748d     // Catch:{ all -> 0x007f }
            long r2 = r1.f2269b     // Catch:{ all -> 0x007f }
            long r2 = r2 - r9
            r1.f2269b = r2     // Catch:{ all -> 0x007f }
            monitor-exit(r0)     // Catch:{ all -> 0x007f }
            w.q r0 = r1.f2278k
            r0.enter()
            okhttp3.internal.http2.Http2Stream r0 = r11.f2748d     // Catch:{ all -> 0x006d }
            okhttp3.internal.http2.Http2Connection r5 = r0.f2271d     // Catch:{ all -> 0x006d }
            int r6 = r0.f2270c     // Catch:{ all -> 0x006d }
            if (r12 == 0) goto L_0x005e
            okio.Buffer r12 = r11.f2745a     // Catch:{ all -> 0x006d }
            long r0 = r12.size()     // Catch:{ all -> 0x006d }
            int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r12 != 0) goto L_0x005e
            r12 = 1
            r7 = 1
            goto L_0x0060
        L_0x005e:
            r12 = 0
            r7 = 0
        L_0x0060:
            okio.Buffer r8 = r11.f2745a     // Catch:{ all -> 0x006d }
            r5.writeData(r6, r7, r8, r9)     // Catch:{ all -> 0x006d }
            okhttp3.internal.http2.Http2Stream r12 = r11.f2748d
            w.q r12 = r12.f2278k
            r12.d()
            return
        L_0x006d:
            r12 = move-exception
            okhttp3.internal.http2.Http2Stream r0 = r11.f2748d
            w.q r0 = r0.f2278k
            r0.d()
            throw r12
        L_0x0076:
            r12 = move-exception
            okhttp3.internal.http2.Http2Stream r1 = r11.f2748d     // Catch:{ all -> 0x007f }
            w.q r1 = r1.f2278k     // Catch:{ all -> 0x007f }
            r1.d()     // Catch:{ all -> 0x007f }
            throw r12     // Catch:{ all -> 0x007f }
        L_0x007f:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x007f }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: w.o.a(boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        if (r8.f2745a.size() <= 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r8.f2745a.size() <= 0) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
        a(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        r0 = r8.f2748d;
        r0.f2271d.writeData(r0.f2270c, true, (okio.Buffer) null, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        r2 = r8.f2748d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r8.f2746b = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        r8.f2748d.f2271d.flush();
        r8.f2748d.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r8.f2748d.f2276i.f2747c != false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r8 = this;
            okhttp3.internal.http2.Http2Stream r0 = r8.f2748d
            monitor-enter(r0)
            boolean r1 = r8.f2746b     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return
        L_0x0009:
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            okhttp3.internal.http2.Http2Stream r0 = r8.f2748d
            w.o r0 = r0.f2276i
            boolean r0 = r0.f2747c
            r1 = 1
            if (r0 != 0) goto L_0x003a
            okio.Buffer r0 = r8.f2745a
            long r2 = r0.size()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x002d
        L_0x001f:
            okio.Buffer r0 = r8.f2745a
            long r2 = r0.size()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x003a
            r8.a(r1)
            goto L_0x001f
        L_0x002d:
            okhttp3.internal.http2.Http2Stream r0 = r8.f2748d
            okhttp3.internal.http2.Http2Connection r2 = r0.f2271d
            int r3 = r0.f2270c
            r4 = 1
            r5 = 0
            r6 = 0
            r2.writeData(r3, r4, r5, r6)
        L_0x003a:
            okhttp3.internal.http2.Http2Stream r2 = r8.f2748d
            monitor-enter(r2)
            r8.f2746b = r1     // Catch:{ all -> 0x004d }
            monitor-exit(r2)     // Catch:{ all -> 0x004d }
            okhttp3.internal.http2.Http2Stream r0 = r8.f2748d
            okhttp3.internal.http2.Http2Connection r0 = r0.f2271d
            r0.flush()
            okhttp3.internal.http2.Http2Stream r0 = r8.f2748d
            r0.a()
            return
        L_0x004d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004d }
            throw r0
        L_0x0050:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: w.o.close():void");
    }

    public final void flush() {
        synchronized (this.f2748d) {
            this.f2748d.b();
        }
        while (this.f2745a.size() > 0) {
            a(false);
            this.f2748d.f2271d.flush();
        }
    }

    public final Timeout timeout() {
        return this.f2748d.f2278k;
    }

    public final void write(Buffer buffer, long j2) {
        Buffer buffer2 = this.f2745a;
        buffer2.write(buffer, j2);
        while (buffer2.size() >= 16384) {
            a(false);
        }
    }
}

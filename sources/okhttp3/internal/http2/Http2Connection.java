package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.Protocol;
import okhttp3.internal.NamedRunnable;
import okhttp3.internal.Util;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import w.e;
import w.f;
import w.i;
import w.j;
import w.k;
import w.n;
import w.r;

/* compiled from: XFMFile */
public final class Http2Connection implements Closeable {

    /* renamed from: u  reason: collision with root package name */
    public static final ThreadPoolExecutor f2239u = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp Http2Connection", true));

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2240a;

    /* renamed from: b  reason: collision with root package name */
    public final Listener f2241b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f2242c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final String f2243d;

    /* renamed from: e  reason: collision with root package name */
    public int f2244e;

    /* renamed from: f  reason: collision with root package name */
    public int f2245f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2246g;

    /* renamed from: h  reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f2247h;

    /* renamed from: i  reason: collision with root package name */
    public final ThreadPoolExecutor f2248i;

    /* renamed from: j  reason: collision with root package name */
    public final PushObserver f2249j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2250k;

    /* renamed from: l  reason: collision with root package name */
    public long f2251l = 0;

    /* renamed from: m  reason: collision with root package name */
    public long f2252m;

    /* renamed from: n  reason: collision with root package name */
    public final Settings f2253n;

    /* renamed from: o  reason: collision with root package name */
    public final Settings f2254o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f2255p;

    /* renamed from: q  reason: collision with root package name */
    public final Socket f2256q;

    /* renamed from: r  reason: collision with root package name */
    public final r f2257r;

    /* renamed from: s  reason: collision with root package name */
    public final k f2258s;

    /* renamed from: t  reason: collision with root package name */
    public final LinkedHashSet f2259t;

    /* compiled from: XFMFile */
    public class Builder {

        /* renamed from: a  reason: collision with root package name */
        public Socket f2260a;

        /* renamed from: b  reason: collision with root package name */
        public String f2261b;

        /* renamed from: c  reason: collision with root package name */
        public BufferedSource f2262c;

        /* renamed from: d  reason: collision with root package name */
        public BufferedSink f2263d;

        /* renamed from: e  reason: collision with root package name */
        public Listener f2264e = Listener.REFUSE_INCOMING_STREAMS;

        /* renamed from: f  reason: collision with root package name */
        public PushObserver f2265f = PushObserver.CANCEL;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f2266g;

        /* renamed from: h  reason: collision with root package name */
        public int f2267h;

        public Builder(boolean z2) {
            this.f2266g = z2;
        }

        public Http2Connection build() {
            return new Http2Connection(this);
        }

        public Builder listener(Listener listener) {
            this.f2264e = listener;
            return this;
        }

        public Builder pingIntervalMillis(int i2) {
            this.f2267h = i2;
            return this;
        }

        public Builder pushObserver(PushObserver pushObserver) {
            this.f2265f = pushObserver;
            return this;
        }

        public Builder socket(Socket socket) {
            return socket(socket, ((InetSocketAddress) socket.getRemoteSocketAddress()).getHostName(), Okio.buffer(Okio.source(socket)), Okio.buffer(Okio.sink(socket)));
        }

        public Builder socket(Socket socket, String str, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            this.f2260a = socket;
            this.f2261b = str;
            this.f2262c = bufferedSource;
            this.f2263d = bufferedSink;
            return this;
        }
    }

    /* compiled from: XFMFile */
    public abstract class Listener {
        public static final Listener REFUSE_INCOMING_STREAMS = new i();

        public void onSettings(Http2Connection http2Connection) {
        }

        public abstract void onStream(Http2Stream http2Stream);
    }

    public Http2Connection(Builder builder) {
        Builder builder2 = builder;
        Settings settings = new Settings();
        this.f2253n = settings;
        Settings settings2 = new Settings();
        this.f2254o = settings2;
        this.f2255p = false;
        this.f2259t = new LinkedHashSet();
        this.f2249j = builder2.f2265f;
        boolean z2 = builder2.f2266g;
        this.f2240a = z2;
        this.f2241b = builder2.f2264e;
        int i2 = z2 ? 1 : 2;
        this.f2245f = i2;
        if (z2) {
            this.f2245f = i2 + 2;
        }
        if (z2) {
            settings.b(7, 16777216);
        }
        String str = builder2.f2261b;
        this.f2243d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, Util.threadFactory(Util.format("OkHttp %s Writer", str), false));
        this.f2247h = scheduledThreadPoolExecutor;
        if (builder2.f2267h != 0) {
            j jVar = new j(this, false, 0, 0);
            long j2 = (long) builder2.f2267h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(jVar, j2, j2, TimeUnit.MILLISECONDS);
        }
        this.f2248i = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Util.threadFactory(Util.format("OkHttp %s Push Observer", str), true));
        settings2.b(7, 65535);
        settings2.b(5, 16384);
        this.f2252m = (long) settings2.a();
        this.f2256q = builder2.f2260a;
        this.f2257r = new r(builder2.f2263d, z2);
        this.f2258s = new k(this, new n(builder2.f2262c, z2));
    }

    public final void a(ErrorCode errorCode, ErrorCode errorCode2) {
        Http2Stream[] http2StreamArr = null;
        try {
            shutdown(errorCode);
            e = null;
        } catch (IOException e2) {
            e = e2;
        }
        synchronized (this) {
            if (!this.f2242c.isEmpty()) {
                http2StreamArr = (Http2Stream[]) this.f2242c.values().toArray(new Http2Stream[this.f2242c.size()]);
                this.f2242c.clear();
            }
        }
        if (http2StreamArr != null) {
            for (Http2Stream close : http2StreamArr) {
                try {
                    close.close(errorCode2);
                } catch (IOException e3) {
                    if (e != null) {
                        e = e3;
                    }
                }
            }
        }
        try {
            this.f2257r.close();
        } catch (IOException e4) {
            if (e == null) {
                e = e4;
            }
        }
        try {
            this.f2256q.close();
        } catch (IOException e5) {
            e = e5;
        }
        this.f2247h.shutdown();
        this.f2248i.shutdown();
        if (e != null) {
            throw e;
        }
    }

    public final void b() {
        try {
            ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
            a(errorCode, errorCode);
        } catch (IOException unused) {
        }
    }

    public final synchronized Http2Stream c(int i2) {
        return (Http2Stream) this.f2242c.get(Integer.valueOf(i2));
    }

    public void close() {
        a(ErrorCode.NO_ERROR, ErrorCode.CANCEL);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.internal.http2.Http2Stream d(int r11, java.util.List r12, boolean r13) {
        /*
            r10 = this;
            r6 = r13 ^ 1
            r4 = 0
            w.r r7 = r10.f2257r
            monitor-enter(r7)
            monitor-enter(r10)     // Catch:{ all -> 0x0076 }
            int r0 = r10.f2245f     // Catch:{ all -> 0x0073 }
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L_0x0013
            okhttp3.internal.http2.ErrorCode r0 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch:{ all -> 0x0073 }
            r10.shutdown(r0)     // Catch:{ all -> 0x0073 }
        L_0x0013:
            boolean r0 = r10.f2246g     // Catch:{ all -> 0x0073 }
            if (r0 != 0) goto L_0x006d
            int r8 = r10.f2245f     // Catch:{ all -> 0x0073 }
            int r0 = r8 + 2
            r10.f2245f = r0     // Catch:{ all -> 0x0073 }
            okhttp3.internal.http2.Http2Stream r9 = new okhttp3.internal.http2.Http2Stream     // Catch:{ all -> 0x0073 }
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0073 }
            if (r13 == 0) goto L_0x003a
            long r0 = r10.f2252m     // Catch:{ all -> 0x0073 }
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x003a
            long r0 = r9.f2269b     // Catch:{ all -> 0x0073 }
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x0038
            goto L_0x003a
        L_0x0038:
            r13 = 0
            goto L_0x003b
        L_0x003a:
            r13 = 1
        L_0x003b:
            boolean r0 = r9.isOpen()     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x004a
            java.util.LinkedHashMap r0 = r10.f2242c     // Catch:{ all -> 0x0073 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0073 }
            r0.put(r1, r9)     // Catch:{ all -> 0x0073 }
        L_0x004a:
            monitor-exit(r10)     // Catch:{ all -> 0x0073 }
            if (r11 != 0) goto L_0x0053
            w.r r11 = r10.f2257r     // Catch:{ all -> 0x0076 }
            r11.j(r6, r8, r12)     // Catch:{ all -> 0x0076 }
            goto L_0x005c
        L_0x0053:
            boolean r0 = r10.f2240a     // Catch:{ all -> 0x0076 }
            if (r0 != 0) goto L_0x0065
            w.r r0 = r10.f2257r     // Catch:{ all -> 0x0076 }
            r0.g(r11, r8, r12)     // Catch:{ all -> 0x0076 }
        L_0x005c:
            monitor-exit(r7)     // Catch:{ all -> 0x0076 }
            if (r13 == 0) goto L_0x0064
            w.r r11 = r10.f2257r
            r11.flush()
        L_0x0064:
            return r9
        L_0x0065:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0076 }
            java.lang.String r12 = "client streams shouldn't have associated stream IDs"
            r11.<init>(r12)     // Catch:{ all -> 0x0076 }
            throw r11     // Catch:{ all -> 0x0076 }
        L_0x006d:
            okhttp3.internal.http2.ConnectionShutdownException r11 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x0073 }
            r11.<init>()     // Catch:{ all -> 0x0073 }
            throw r11     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0073 }
            throw r11     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r11 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0076 }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.d(int, java.util.List, boolean):okhttp3.internal.http2.Http2Stream");
    }

    public final synchronized void e(NamedRunnable namedRunnable) {
        if (!isShutdown()) {
            this.f2248i.execute(namedRunnable);
        }
    }

    public final synchronized Http2Stream f(int i2) {
        Http2Stream http2Stream;
        http2Stream = (Http2Stream) this.f2242c.remove(Integer.valueOf(i2));
        notifyAll();
        return http2Stream;
    }

    public void flush() {
        this.f2257r.flush();
    }

    public final synchronized void g(long j2) {
        long j3 = this.f2251l + j2;
        this.f2251l = j3;
        if (j3 >= ((long) (this.f2253n.a() / 2))) {
            j(0, this.f2251l);
            this.f2251l = 0;
        }
    }

    public Protocol getProtocol() {
        return Protocol.HTTP_2;
    }

    public final void h(int i2, List list, boolean z2) {
        r rVar = this.f2257r;
        synchronized (rVar) {
            if (!rVar.f2762e) {
                rVar.e(i2, list, z2);
            } else {
                throw new IOException("closed");
            }
        }
    }

    public final void i(int i2, ErrorCode errorCode) {
        try {
            this.f2247h.execute(new e(this, "OkHttp %s stream %d", new Object[]{this.f2243d, Integer.valueOf(i2)}, i2, errorCode, 0));
        } catch (RejectedExecutionException unused) {
        }
    }

    public synchronized boolean isShutdown() {
        return this.f2246g;
    }

    public final void j(int i2, long j2) {
        try {
            this.f2247h.execute(new f(this, new Object[]{this.f2243d, Integer.valueOf(i2)}, i2, j2));
        } catch (RejectedExecutionException unused) {
        }
    }

    public synchronized int maxConcurrentStreams() {
        Settings settings;
        settings = this.f2254o;
        return (settings.f2280a & 16) != 0 ? settings.f2281b[4] : Integer.MAX_VALUE;
    }

    public Http2Stream newStream(List<Header> list, boolean z2) {
        return d(0, list, z2);
    }

    public synchronized int openStreamCount() {
        return this.f2242c.size();
    }

    public Http2Stream pushStream(int i2, List<Header> list, boolean z2) {
        if (!this.f2240a) {
            return d(i2, list, z2);
        }
        throw new IllegalStateException("Client cannot push requests.");
    }

    public void setSettings(Settings settings) {
        synchronized (this.f2257r) {
            synchronized (this) {
                if (!this.f2246g) {
                    Settings settings2 = this.f2253n;
                    settings2.getClass();
                    for (int i2 = 0; i2 < 10; i2++) {
                        boolean z2 = true;
                        if (((1 << i2) & settings.f2280a) == 0) {
                            z2 = false;
                        }
                        if (z2) {
                            settings2.b(i2, settings.f2281b[i2]);
                        }
                    }
                } else {
                    throw new ConnectionShutdownException();
                }
            }
            this.f2257r.i(settings);
        }
    }

    public void shutdown(ErrorCode errorCode) {
        synchronized (this.f2257r) {
            synchronized (this) {
                if (!this.f2246g) {
                    this.f2246g = true;
                    int i2 = this.f2244e;
                    this.f2257r.d(i2, errorCode, Util.EMPTY_BYTE_ARRAY);
                }
            }
        }
    }

    public void start() {
        r rVar = this.f2257r;
        synchronized (rVar) {
            if (rVar.f2762e) {
                throw new IOException("closed");
            } else if (rVar.f2759b) {
                Logger logger = r.f2757g;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(Util.format(">> CONNECTION %s", Http2.f2228a.hex()));
                }
                rVar.f2758a.write(Http2.f2228a.toByteArray());
                rVar.f2758a.flush();
            }
        }
        this.f2257r.i(this.f2253n);
        int a2 = this.f2253n.a();
        if (a2 != 65535) {
            this.f2257r.k(0, (long) (a2 - 65535));
        }
        new Thread(this.f2258s).start();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.f2257r.f2761d);
        r6 = (long) r3;
        r8.f2252m -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0062, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0056 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeData(int r9, boolean r10, okio.Buffer r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            w.r r12 = r8.f2257r
            r12.b(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0065
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.f2252m     // Catch:{ InterruptedException -> 0x0056 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x0030
            java.util.LinkedHashMap r3 = r8.f2242c     // Catch:{ InterruptedException -> 0x0056 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x0056 }
            boolean r3 = r3.containsKey(r4)     // Catch:{ InterruptedException -> 0x0056 }
            if (r3 == 0) goto L_0x0028
            r8.wait()     // Catch:{ InterruptedException -> 0x0056 }
            goto L_0x0012
        L_0x0028:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x0056 }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x0056 }
            throw r9     // Catch:{ InterruptedException -> 0x0056 }
        L_0x0030:
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0054 }
            int r4 = (int) r3     // Catch:{ all -> 0x0054 }
            w.r r3 = r8.f2257r     // Catch:{ all -> 0x0054 }
            int r3 = r3.f2761d     // Catch:{ all -> 0x0054 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0054 }
            long r4 = r8.f2252m     // Catch:{ all -> 0x0054 }
            long r6 = (long) r3     // Catch:{ all -> 0x0054 }
            long r4 = r4 - r6
            r8.f2252m = r4     // Catch:{ all -> 0x0054 }
            monitor-exit(r8)     // Catch:{ all -> 0x0054 }
            long r12 = r12 - r6
            w.r r4 = r8.f2257r
            if (r10 == 0) goto L_0x004f
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x004f
            r5 = 1
            goto L_0x0050
        L_0x004f:
            r5 = 0
        L_0x0050:
            r4.b(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0054:
            r9 = move-exception
            goto L_0x0063
        L_0x0056:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0054 }
            r9.interrupt()     // Catch:{ all -> 0x0054 }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0054 }
            r9.<init>()     // Catch:{ all -> 0x0054 }
            throw r9     // Catch:{ all -> 0x0054 }
        L_0x0063:
            monitor-exit(r8)     // Catch:{ all -> 0x0054 }
            throw r9
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Connection.writeData(int, boolean, okio.Buffer, long):void");
    }
}

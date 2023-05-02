package okhttp3.internal.ws;

import com.google.gson.internal.i;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import y.a;
import y.d;
import y.f;

/* compiled from: XFMFile */
public final class RealWebSocket implements WebSocket, WebSocketReader$FrameCallback {

    /* renamed from: v  reason: collision with root package name */
    public static final List f2294v = Collections.singletonList(Protocol.HTTP_1_1);

    /* renamed from: a  reason: collision with root package name */
    public final Request f2295a;

    /* renamed from: b  reason: collision with root package name */
    public final WebSocketListener f2296b;

    /* renamed from: c  reason: collision with root package name */
    public final Random f2297c;

    /* renamed from: d  reason: collision with root package name */
    public final long f2298d;

    /* renamed from: e  reason: collision with root package name */
    public final String f2299e;

    /* renamed from: f  reason: collision with root package name */
    public Call f2300f;

    /* renamed from: g  reason: collision with root package name */
    public final a f2301g;

    /* renamed from: h  reason: collision with root package name */
    public d f2302h;

    /* renamed from: i  reason: collision with root package name */
    public f f2303i;

    /* renamed from: j  reason: collision with root package name */
    public ScheduledThreadPoolExecutor f2304j;

    /* renamed from: k  reason: collision with root package name */
    public Streams f2305k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayDeque f2306l = new ArrayDeque();

    /* renamed from: m  reason: collision with root package name */
    public final ArrayDeque f2307m = new ArrayDeque();

    /* renamed from: n  reason: collision with root package name */
    public long f2308n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2309o;

    /* renamed from: p  reason: collision with root package name */
    public ScheduledFuture f2310p;

    /* renamed from: q  reason: collision with root package name */
    public int f2311q = -1;

    /* renamed from: r  reason: collision with root package name */
    public String f2312r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2313s;

    /* renamed from: t  reason: collision with root package name */
    public int f2314t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2315u;

    /* compiled from: XFMFile */
    public abstract class Streams implements Closeable {
        public final boolean client;
        public final BufferedSink sink;
        public final BufferedSource source;

        public Streams(boolean z2, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            this.client = z2;
            this.source = bufferedSource;
            this.sink = bufferedSink;
        }
    }

    public RealWebSocket(Request request, WebSocketListener webSocketListener, Random random, long j2) {
        if ("GET".equals(request.method())) {
            this.f2295a = request;
            this.f2296b = webSocketListener;
            this.f2297c = random;
            this.f2298d = j2;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.f2299e = ByteString.of(bArr).base64();
            this.f2301g = new a(this, 0);
            return;
        }
        throw new IllegalArgumentException("Request must be GET: " + request.method());
    }

    public final void a(Response response) {
        if (response.code() == 101) {
            String header = response.header("Connection");
            if ("Upgrade".equalsIgnoreCase(header)) {
                String header2 = response.header("Upgrade");
                if ("websocket".equalsIgnoreCase(header2)) {
                    String header3 = response.header("Sec-WebSocket-Accept");
                    String base64 = ByteString.encodeUtf8(this.f2299e + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").sha1().base64();
                    if (!base64.equals(header3)) {
                        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + base64 + "' but was '" + header3 + "'");
                    }
                    return;
                }
                throw new ProtocolException("Expected 'Upgrade' header value 'websocket' but was '" + header2 + "'");
            }
            throw new ProtocolException("Expected 'Connection' header value 'Upgrade' but was '" + header + "'");
        }
        throw new ProtocolException("Expected HTTP 101 response but was '" + response.code() + " " + response.message() + "'");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean b(okio.ByteString r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f2313s     // Catch:{ all -> 0x0044 }
            r1 = 0
            if (r0 != 0) goto L_0x0042
            boolean r0 = r6.f2309o     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x000b
            goto L_0x0042
        L_0x000b:
            long r2 = r6.f2308n     // Catch:{ all -> 0x0044 }
            int r0 = r7.size()     // Catch:{ all -> 0x0044 }
            long r4 = (long) r0     // Catch:{ all -> 0x0044 }
            long r2 = r2 + r4
            r4 = 16777216(0x1000000, double:8.289046E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            r7 = 1001(0x3e9, float:1.403E-42)
            r8 = 0
            r6.close(r7, r8)     // Catch:{ all -> 0x0044 }
            monitor-exit(r6)
            return r1
        L_0x0022:
            long r0 = r6.f2308n     // Catch:{ all -> 0x0044 }
            int r2 = r7.size()     // Catch:{ all -> 0x0044 }
            long r2 = (long) r2     // Catch:{ all -> 0x0044 }
            long r0 = r0 + r2
            r6.f2308n = r0     // Catch:{ all -> 0x0044 }
            java.util.ArrayDeque r0 = r6.f2307m     // Catch:{ all -> 0x0044 }
            y.c r1 = new y.c     // Catch:{ all -> 0x0044 }
            r1.<init>(r7, r8)     // Catch:{ all -> 0x0044 }
            r0.add(r1)     // Catch:{ all -> 0x0044 }
            java.util.concurrent.ScheduledThreadPoolExecutor r7 = r6.f2304j     // Catch:{ all -> 0x0044 }
            if (r7 == 0) goto L_0x003f
            y.a r8 = r6.f2301g     // Catch:{ all -> 0x0044 }
            r7.execute(r8)     // Catch:{ all -> 0x0044 }
        L_0x003f:
            monitor-exit(r6)
            r7 = 1
            return r7
        L_0x0042:
            monitor-exit(r6)
            return r1
        L_0x0044:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.b(okio.ByteString, int):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004f, code lost:
        if (r2 == null) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r0.a(r2, 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        if ((r6 instanceof y.c) == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        r2 = ((y.c) r6).f2797b;
        r3 = ((y.c) r6).f2796a;
        r6 = (long) r2.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
        if (r0.f2822h != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006e, code lost:
        r0.f2822h = true;
        r0 = r0.f2821g;
        r0.f2810a = r3;
        r0.f2811b = r6;
        r0.f2812c = true;
        r0.f2813d = false;
        r0 = okio.Okio.buffer((okio.Sink) r0);
        r0.write(r2);
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0084, code lost:
        monitor-enter(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r13.f2308n -= (long) r2.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008f, code lost:
        monitor-exit(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009b, code lost:
        throw new java.lang.IllegalStateException("Another message writer is active. Did you call close()?");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009e, code lost:
        if ((r6 instanceof y.b) == false) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a0, code lost:
        r6 = (y.b) r6;
        r1 = r6.f2793a;
        r2 = r6.f2794b;
        r0.getClass();
        r6 = okio.ByteString.EMPTY;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ab, code lost:
        if (r1 != 0) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ad, code lost:
        if (r2 == null) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00af, code lost:
        if (r1 == 0) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b1, code lost:
        r6 = okhttp3.internal.ws.WebSocketProtocol.a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b5, code lost:
        if (r6 != null) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bd, code lost:
        throw new java.lang.IllegalArgumentException(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00be, code lost:
        r6 = new okio.Buffer();
        r6.writeShort(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c6, code lost:
        if (r2 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c8, code lost:
        r6.write(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00cb, code lost:
        r6 = r6.readByteString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r0.a(r6, 8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r0.f2819e = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d6, code lost:
        if (r5 == null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d8, code lost:
        r13.f2296b.onClosed(r13, r3, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00dd, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e0, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e1, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r0.f2819e = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e4, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00ea, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00eb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ec, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00ef, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:23:0x0053, B:57:0x00d1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
            r13 = this;
            monitor-enter(r13)
            boolean r0 = r13.f2313s     // Catch:{ all -> 0x00f0 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r13)     // Catch:{ all -> 0x00f0 }
            return r1
        L_0x0008:
            y.f r0 = r13.f2303i     // Catch:{ all -> 0x00f0 }
            java.util.ArrayDeque r2 = r13.f2306l     // Catch:{ all -> 0x00f0 }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x00f0 }
            okio.ByteString r2 = (okio.ByteString) r2     // Catch:{ all -> 0x00f0 }
            r3 = -1
            r4 = 1
            r5 = 0
            if (r2 != 0) goto L_0x004c
            java.util.ArrayDeque r6 = r13.f2307m     // Catch:{ all -> 0x00f0 }
            java.lang.Object r6 = r6.poll()     // Catch:{ all -> 0x00f0 }
            boolean r7 = r6 instanceof y.b     // Catch:{ all -> 0x00f0 }
            if (r7 == 0) goto L_0x0048
            int r7 = r13.f2311q     // Catch:{ all -> 0x00f0 }
            java.lang.String r8 = r13.f2312r     // Catch:{ all -> 0x00f0 }
            if (r7 == r3) goto L_0x0032
            okhttp3.internal.ws.RealWebSocket$Streams r3 = r13.f2305k     // Catch:{ all -> 0x00f0 }
            r13.f2305k = r5     // Catch:{ all -> 0x00f0 }
            java.util.concurrent.ScheduledThreadPoolExecutor r5 = r13.f2304j     // Catch:{ all -> 0x00f0 }
            r5.shutdown()     // Catch:{ all -> 0x00f0 }
            r5 = r3
            goto L_0x0046
        L_0x0032:
            java.util.concurrent.ScheduledThreadPoolExecutor r3 = r13.f2304j     // Catch:{ all -> 0x00f0 }
            y.a r9 = new y.a     // Catch:{ all -> 0x00f0 }
            r9.<init>(r13, r4)     // Catch:{ all -> 0x00f0 }
            r10 = r6
            y.b r10 = (y.b) r10     // Catch:{ all -> 0x00f0 }
            long r10 = r10.f2795c     // Catch:{ all -> 0x00f0 }
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00f0 }
            java.util.concurrent.ScheduledFuture r3 = r3.schedule(r9, r10, r12)     // Catch:{ all -> 0x00f0 }
            r13.f2310p = r3     // Catch:{ all -> 0x00f0 }
        L_0x0046:
            r3 = r7
            goto L_0x004e
        L_0x0048:
            if (r6 != 0) goto L_0x004d
            monitor-exit(r13)     // Catch:{ all -> 0x00f0 }
            return r1
        L_0x004c:
            r6 = r5
        L_0x004d:
            r8 = r5
        L_0x004e:
            monitor-exit(r13)     // Catch:{ all -> 0x00f0 }
            if (r2 == 0) goto L_0x0058
            r1 = 10
            r0.a(r2, r1)     // Catch:{ all -> 0x00eb }
            goto L_0x00dd
        L_0x0058:
            boolean r2 = r6 instanceof y.c     // Catch:{ all -> 0x00eb }
            if (r2 == 0) goto L_0x009c
            r2 = r6
            y.c r2 = (y.c) r2     // Catch:{ all -> 0x00eb }
            okio.ByteString r2 = r2.f2797b     // Catch:{ all -> 0x00eb }
            y.c r6 = (y.c) r6     // Catch:{ all -> 0x00eb }
            int r3 = r6.f2796a     // Catch:{ all -> 0x00eb }
            int r6 = r2.size()     // Catch:{ all -> 0x00eb }
            long r6 = (long) r6     // Catch:{ all -> 0x00eb }
            boolean r8 = r0.f2822h     // Catch:{ all -> 0x00eb }
            if (r8 != 0) goto L_0x0094
            r0.f2822h = r4     // Catch:{ all -> 0x00eb }
            y.e r0 = r0.f2821g     // Catch:{ all -> 0x00eb }
            r0.f2810a = r3     // Catch:{ all -> 0x00eb }
            r0.f2811b = r6     // Catch:{ all -> 0x00eb }
            r0.f2812c = r4     // Catch:{ all -> 0x00eb }
            r0.f2813d = r1     // Catch:{ all -> 0x00eb }
            okio.BufferedSink r0 = okio.Okio.buffer((okio.Sink) r0)     // Catch:{ all -> 0x00eb }
            r0.write((okio.ByteString) r2)     // Catch:{ all -> 0x00eb }
            r0.close()     // Catch:{ all -> 0x00eb }
            monitor-enter(r13)     // Catch:{ all -> 0x00eb }
            long r0 = r13.f2308n     // Catch:{ all -> 0x0091 }
            int r2 = r2.size()     // Catch:{ all -> 0x0091 }
            long r2 = (long) r2     // Catch:{ all -> 0x0091 }
            long r0 = r0 - r2
            r13.f2308n = r0     // Catch:{ all -> 0x0091 }
            monitor-exit(r13)     // Catch:{ all -> 0x0091 }
            goto L_0x00dd
        L_0x0091:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0091 }
            throw r0     // Catch:{ all -> 0x00eb }
        L_0x0094:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00eb }
            java.lang.String r1 = "Another message writer is active. Did you call close()?"
            r0.<init>(r1)     // Catch:{ all -> 0x00eb }
            throw r0     // Catch:{ all -> 0x00eb }
        L_0x009c:
            boolean r1 = r6 instanceof y.b     // Catch:{ all -> 0x00eb }
            if (r1 == 0) goto L_0x00e5
            y.b r6 = (y.b) r6     // Catch:{ all -> 0x00eb }
            int r1 = r6.f2793a     // Catch:{ all -> 0x00eb }
            okio.ByteString r2 = r6.f2794b     // Catch:{ all -> 0x00eb }
            r0.getClass()     // Catch:{ all -> 0x00eb }
            okio.ByteString r6 = okio.ByteString.EMPTY     // Catch:{ all -> 0x00eb }
            if (r1 != 0) goto L_0x00af
            if (r2 == 0) goto L_0x00cf
        L_0x00af:
            if (r1 == 0) goto L_0x00be
            java.lang.String r6 = okhttp3.internal.ws.WebSocketProtocol.a(r1)     // Catch:{ all -> 0x00eb }
            if (r6 != 0) goto L_0x00b8
            goto L_0x00be
        L_0x00b8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00eb }
            r0.<init>(r6)     // Catch:{ all -> 0x00eb }
            throw r0     // Catch:{ all -> 0x00eb }
        L_0x00be:
            okio.Buffer r6 = new okio.Buffer     // Catch:{ all -> 0x00eb }
            r6.<init>()     // Catch:{ all -> 0x00eb }
            r6.writeShort((int) r1)     // Catch:{ all -> 0x00eb }
            if (r2 == 0) goto L_0x00cb
            r6.write((okio.ByteString) r2)     // Catch:{ all -> 0x00eb }
        L_0x00cb:
            okio.ByteString r6 = r6.readByteString()     // Catch:{ all -> 0x00eb }
        L_0x00cf:
            r1 = 8
            r0.a(r6, r1)     // Catch:{ all -> 0x00e1 }
            r0.f2819e = r4     // Catch:{ all -> 0x00eb }
            if (r5 == 0) goto L_0x00dd
            okhttp3.WebSocketListener r0 = r13.f2296b     // Catch:{ all -> 0x00eb }
            r0.onClosed(r13, r3, r8)     // Catch:{ all -> 0x00eb }
        L_0x00dd:
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r5)
            return r4
        L_0x00e1:
            r1 = move-exception
            r0.f2819e = r4     // Catch:{ all -> 0x00eb }
            throw r1     // Catch:{ all -> 0x00eb }
        L_0x00e5:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x00eb }
            r0.<init>()     // Catch:{ all -> 0x00eb }
            throw r0     // Catch:{ all -> 0x00eb }
        L_0x00eb:
            r0 = move-exception
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r5)
            throw r0
        L_0x00f0:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x00f0 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.c():boolean");
    }

    public void cancel() {
        this.f2300f.cancel();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean close(int r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "reason.size() > 123: "
            monitor-enter(r7)
            java.lang.String r1 = okhttp3.internal.ws.WebSocketProtocol.a(r8)     // Catch:{ all -> 0x0025 }
            if (r1 != 0) goto L_0x004c
            if (r9 == 0) goto L_0x0027
            okio.ByteString r1 = okio.ByteString.encodeUtf8(r9)     // Catch:{ all -> 0x0025 }
            int r2 = r1.size()     // Catch:{ all -> 0x0025 }
            long r2 = (long) r2     // Catch:{ all -> 0x0025 }
            r4 = 123(0x7b, double:6.1E-322)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x001b
            goto L_0x0028
        L_0x001b:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0025 }
            java.lang.String r9 = r0.concat(r9)     // Catch:{ all -> 0x0025 }
            r8.<init>(r9)     // Catch:{ all -> 0x0025 }
            throw r8     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r8 = move-exception
            goto L_0x0052
        L_0x0027:
            r1 = 0
        L_0x0028:
            boolean r9 = r7.f2313s     // Catch:{ all -> 0x0025 }
            if (r9 != 0) goto L_0x0049
            boolean r9 = r7.f2309o     // Catch:{ all -> 0x0025 }
            if (r9 == 0) goto L_0x0031
            goto L_0x0049
        L_0x0031:
            r9 = 1
            r7.f2309o = r9     // Catch:{ all -> 0x0025 }
            java.util.ArrayDeque r0 = r7.f2307m     // Catch:{ all -> 0x0025 }
            y.b r2 = new y.b     // Catch:{ all -> 0x0025 }
            r2.<init>(r8, r1)     // Catch:{ all -> 0x0025 }
            r0.add(r2)     // Catch:{ all -> 0x0025 }
            java.util.concurrent.ScheduledThreadPoolExecutor r8 = r7.f2304j     // Catch:{ all -> 0x0025 }
            if (r8 == 0) goto L_0x0047
            y.a r0 = r7.f2301g     // Catch:{ all -> 0x0025 }
            r8.execute(r0)     // Catch:{ all -> 0x0025 }
        L_0x0047:
            monitor-exit(r7)
            goto L_0x004b
        L_0x0049:
            monitor-exit(r7)
            r9 = 0
        L_0x004b:
            return r9
        L_0x004c:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0025 }
            r8.<init>(r1)     // Catch:{ all -> 0x0025 }
            throw r8     // Catch:{ all -> 0x0025 }
        L_0x0052:
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.close(int, java.lang.String):boolean");
    }

    public void connect(OkHttpClient okHttpClient) {
        OkHttpClient build = okHttpClient.newBuilder().eventListener(EventListener.NONE).protocols(f2294v).build();
        Request build2 = this.f2295a.newBuilder().header("Upgrade", "websocket").header("Connection", "Upgrade").header("Sec-WebSocket-Key", this.f2299e).header("Sec-WebSocket-Version", "13").build();
        Call newWebSocketCall = Internal.instance.newWebSocketCall(build, build2);
        this.f2300f = newWebSocketCall;
        newWebSocketCall.enqueue(new i(this, build2, 5));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3.f2296b.onFailure(r3, r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        okhttp3.internal.Util.closeQuietly((java.io.Closeable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void failWebSocket(java.lang.Exception r4, @javax.annotation.Nullable okhttp3.Response r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f2313s     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x002d }
            return
        L_0x0007:
            r0 = 1
            r3.f2313s = r0     // Catch:{ all -> 0x002d }
            okhttp3.internal.ws.RealWebSocket$Streams r0 = r3.f2305k     // Catch:{ all -> 0x002d }
            r1 = 0
            r3.f2305k = r1     // Catch:{ all -> 0x002d }
            java.util.concurrent.ScheduledFuture r1 = r3.f2310p     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0017
            r2 = 0
            r1.cancel(r2)     // Catch:{ all -> 0x002d }
        L_0x0017:
            java.util.concurrent.ScheduledThreadPoolExecutor r1 = r3.f2304j     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x001e
            r1.shutdown()     // Catch:{ all -> 0x002d }
        L_0x001e:
            monitor-exit(r3)     // Catch:{ all -> 0x002d }
            okhttp3.WebSocketListener r1 = r3.f2296b     // Catch:{ all -> 0x0028 }
            r1.onFailure(r3, r4, r5)     // Catch:{ all -> 0x0028 }
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r0)
            return
        L_0x0028:
            r4 = move-exception
            okhttp3.internal.Util.closeQuietly((java.io.Closeable) r0)
            throw r4
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.failWebSocket(java.lang.Exception, okhttp3.Response):void");
    }

    public void initReaderAndWriter(String str, Streams streams) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (this) {
            try {
                this.f2305k = streams;
                this.f2303i = new f(streams.client, streams.sink, this.f2297c);
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, Util.threadFactory(str, false));
                this.f2304j = scheduledThreadPoolExecutor2;
                long j2 = this.f2298d;
                if (j2 != 0) {
                    scheduledThreadPoolExecutor2.scheduleAtFixedRate(new a(this, 2), j2, j2, TimeUnit.MILLISECONDS);
                }
                if (!this.f2307m.isEmpty() && (scheduledThreadPoolExecutor = this.f2304j) != null) {
                    scheduledThreadPoolExecutor.execute(this.f2301g);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.f2302h = new d(streams.client, streams.source, this);
    }

    public void loopReader() {
        while (this.f2311q == -1) {
            d dVar = this.f2302h;
            dVar.b();
            if (dVar.f2805h) {
                dVar.a();
            } else {
                int i2 = dVar.f2802e;
                if (i2 == 1 || i2 == 2) {
                    while (!dVar.f2801d) {
                        long j2 = dVar.f2803f;
                        Buffer buffer = dVar.f2807j;
                        if (j2 > 0) {
                            dVar.f2799b.readFully(buffer, j2);
                            if (!dVar.f2798a) {
                                Buffer.UnsafeCursor unsafeCursor = dVar.f2809l;
                                buffer.readAndWriteUnsafe(unsafeCursor);
                                unsafeCursor.seek(buffer.size() - dVar.f2803f);
                                WebSocketProtocol.b(unsafeCursor, dVar.f2808k);
                                unsafeCursor.close();
                            }
                        }
                        if (dVar.f2804g) {
                            WebSocketReader$FrameCallback webSocketReader$FrameCallback = dVar.f2800c;
                            if (i2 == 1) {
                                webSocketReader$FrameCallback.onReadMessage(buffer.readUtf8());
                            } else {
                                webSocketReader$FrameCallback.onReadMessage(buffer.readByteString());
                            }
                        } else {
                            while (!dVar.f2801d) {
                                dVar.b();
                                if (!dVar.f2805h) {
                                    break;
                                }
                                dVar.a();
                            }
                            if (dVar.f2802e != 0) {
                                throw new ProtocolException("Expected continuation opcode. Got: " + Integer.toHexString(dVar.f2802e));
                            }
                        }
                    }
                    throw new IOException("closed");
                }
                throw new ProtocolException("Unknown opcode: " + Integer.toHexString(i2));
            }
        }
    }

    public void onReadClose(int i2, String str) {
        Streams streams;
        if (i2 != -1) {
            synchronized (this) {
                if (this.f2311q == -1) {
                    this.f2311q = i2;
                    this.f2312r = str;
                    streams = null;
                    if (this.f2309o && this.f2307m.isEmpty()) {
                        Streams streams2 = this.f2305k;
                        this.f2305k = streams;
                        ScheduledFuture scheduledFuture = this.f2310p;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        this.f2304j.shutdown();
                        streams = streams2;
                    }
                } else {
                    throw new IllegalStateException("already closed");
                }
            }
            try {
                this.f2296b.onClosing(this, i2, str);
                if (streams != null) {
                    this.f2296b.onClosed(this, i2, str);
                }
            } finally {
                Util.closeQuietly((Closeable) streams);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void onReadMessage(String str) {
        this.f2296b.onMessage((WebSocket) this, str);
    }

    public void onReadMessage(ByteString byteString) {
        this.f2296b.onMessage((WebSocket) this, byteString);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onReadPing(okio.ByteString r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f2313s     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0022
            boolean r0 = r1.f2309o     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0012
            java.util.ArrayDeque r0 = r1.f2307m     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0012
            goto L_0x0022
        L_0x0012:
            java.util.ArrayDeque r0 = r1.f2306l     // Catch:{ all -> 0x0024 }
            r0.add(r2)     // Catch:{ all -> 0x0024 }
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r1.f2304j     // Catch:{ all -> 0x0024 }
            if (r2 == 0) goto L_0x0020
            y.a r0 = r1.f2301g     // Catch:{ all -> 0x0024 }
            r2.execute(r0)     // Catch:{ all -> 0x0024 }
        L_0x0020:
            monitor-exit(r1)
            return
        L_0x0022:
            monitor-exit(r1)
            return
        L_0x0024:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.ws.RealWebSocket.onReadPing(okio.ByteString):void");
    }

    public synchronized void onReadPong(ByteString byteString) {
        this.f2315u = false;
    }

    public synchronized long queueSize() {
        return this.f2308n;
    }

    public Request request() {
        return this.f2295a;
    }

    public boolean send(String str) {
        if (str != null) {
            return b(ByteString.encodeUtf8(str), 1);
        }
        throw new NullPointerException("text == null");
    }

    public boolean send(ByteString byteString) {
        if (byteString != null) {
            return b(byteString, 2);
        }
        throw new NullPointerException("bytes == null");
    }
}

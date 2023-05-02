package okhttp3.internal.http2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import w.o;
import w.p;
import w.q;

/* compiled from: XFMFile */
public final class Http2Stream {

    /* renamed from: a  reason: collision with root package name */
    public long f2268a = 0;

    /* renamed from: b  reason: collision with root package name */
    public long f2269b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2270c;

    /* renamed from: d  reason: collision with root package name */
    public final Http2Connection f2271d;

    /* renamed from: e  reason: collision with root package name */
    public final List f2272e;

    /* renamed from: f  reason: collision with root package name */
    public List f2273f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2274g;

    /* renamed from: h  reason: collision with root package name */
    public final p f2275h;

    /* renamed from: i  reason: collision with root package name */
    public final o f2276i;

    /* renamed from: j  reason: collision with root package name */
    public final q f2277j = new q(this, 0);

    /* renamed from: k  reason: collision with root package name */
    public final q f2278k = new q(this, 0);

    /* renamed from: l  reason: collision with root package name */
    public ErrorCode f2279l = null;

    public Http2Stream(int i2, Http2Connection http2Connection, boolean z2, boolean z3, List list) {
        if (http2Connection == null) {
            throw new NullPointerException("connection == null");
        } else if (list != null) {
            this.f2270c = i2;
            this.f2271d = http2Connection;
            this.f2269b = (long) http2Connection.f2254o.a();
            p pVar = new p(this, (long) http2Connection.f2253n.a());
            this.f2275h = pVar;
            o oVar = new o(this);
            this.f2276i = oVar;
            pVar.f2753e = z3;
            oVar.f2747c = z2;
            this.f2272e = list;
        } else {
            throw new NullPointerException("requestHeaders == null");
        }
    }

    public final void a() {
        boolean z2;
        boolean isOpen;
        synchronized (this) {
            p pVar = this.f2275h;
            if (!pVar.f2753e && pVar.f2752d) {
                o oVar = this.f2276i;
                if (oVar.f2747c || oVar.f2746b) {
                    z2 = true;
                    isOpen = isOpen();
                }
            }
            z2 = false;
            isOpen = isOpen();
        }
        if (z2) {
            close(ErrorCode.CANCEL);
        } else if (!isOpen) {
            this.f2271d.f(this.f2270c);
        }
    }

    public final void b() {
        o oVar = this.f2276i;
        if (oVar.f2746b) {
            throw new IOException("stream closed");
        } else if (oVar.f2747c) {
            throw new IOException("stream finished");
        } else if (this.f2279l != null) {
            throw new StreamResetException(this.f2279l);
        }
    }

    public final boolean c(ErrorCode errorCode) {
        synchronized (this) {
            if (this.f2279l != null) {
                return false;
            }
            if (this.f2275h.f2753e && this.f2276i.f2747c) {
                return false;
            }
            this.f2279l = errorCode;
            notifyAll();
            this.f2271d.f(this.f2270c);
            return true;
        }
    }

    public void close(ErrorCode errorCode) {
        if (c(errorCode)) {
            this.f2271d.f2257r.h(this.f2270c, errorCode);
        }
    }

    public void closeLater(ErrorCode errorCode) {
        if (c(errorCode)) {
            this.f2271d.i(this.f2270c, errorCode);
        }
    }

    public final void d() {
        boolean isOpen;
        synchronized (this) {
            this.f2275h.f2753e = true;
            isOpen = isOpen();
            notifyAll();
        }
        if (!isOpen) {
            this.f2271d.f(this.f2270c);
        }
    }

    public final void e(ArrayList arrayList) {
        boolean z2;
        synchronized (this) {
            z2 = true;
            this.f2274g = true;
            if (this.f2273f == null) {
                this.f2273f = arrayList;
                z2 = isOpen();
                notifyAll();
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f2273f);
                arrayList2.add((Object) null);
                arrayList2.addAll(arrayList);
                this.f2273f = arrayList2;
            }
        }
        if (!z2) {
            this.f2271d.f(this.f2270c);
        }
    }

    public final synchronized void f(ErrorCode errorCode) {
        if (this.f2279l == null) {
            this.f2279l = errorCode;
            notifyAll();
        }
    }

    public final void g() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public Http2Connection getConnection() {
        return this.f2271d;
    }

    public synchronized ErrorCode getErrorCode() {
        return this.f2279l;
    }

    public int getId() {
        return this.f2270c;
    }

    public List<Header> getRequestHeaders() {
        return this.f2272e;
    }

    public Sink getSink() {
        synchronized (this) {
            if (!this.f2274g) {
                if (!isLocallyInitiated()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f2276i;
    }

    public Source getSource() {
        return this.f2275h;
    }

    public boolean isLocallyInitiated() {
        return this.f2271d.f2240a == ((this.f2270c & 1) == 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0023, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean isOpen() {
        /*
            r3 = this;
            monitor-enter(r3)
            okhttp3.internal.http2.ErrorCode r0 = r3.f2279l     // Catch:{ all -> 0x0025 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r3)
            return r1
        L_0x0008:
            w.p r0 = r3.f2275h     // Catch:{ all -> 0x0025 }
            boolean r2 = r0.f2753e     // Catch:{ all -> 0x0025 }
            if (r2 != 0) goto L_0x0012
            boolean r0 = r0.f2752d     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
        L_0x0012:
            w.o r0 = r3.f2276i     // Catch:{ all -> 0x0025 }
            boolean r2 = r0.f2747c     // Catch:{ all -> 0x0025 }
            if (r2 != 0) goto L_0x001c
            boolean r0 = r0.f2746b     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
        L_0x001c:
            boolean r0 = r3.f2274g     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            monitor-exit(r3)
            r0 = 1
            return r0
        L_0x0025:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.isOpen():boolean");
    }

    public Timeout readTimeout() {
        return this.f2277j;
    }

    public void sendResponseHeaders(List<Header> list, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        if (list != null) {
            synchronized (this) {
                z3 = true;
                this.f2274g = true;
                if (!z2) {
                    this.f2276i.f2747c = true;
                    z4 = true;
                    z5 = true;
                } else {
                    z4 = false;
                    z5 = false;
                }
            }
            if (!z4) {
                synchronized (this.f2271d) {
                    if (this.f2271d.f2252m != 0) {
                        z3 = false;
                    }
                }
                z4 = z3;
            }
            this.f2271d.h(this.f2270c, list, z5);
            if (z4) {
                this.f2271d.flush();
                return;
            }
            return;
        }
        throw new NullPointerException("responseHeaders == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
        r2.f2277j.d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0034, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<okhttp3.internal.http2.Header> takeResponseHeaders() {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isLocallyInitiated()     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0035
            w.q r0 = r2.f2277j     // Catch:{ all -> 0x003d }
            r0.enter()     // Catch:{ all -> 0x003d }
        L_0x000c:
            java.util.List r0 = r2.f2273f     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x0018
            okhttp3.internal.http2.ErrorCode r0 = r2.f2279l     // Catch:{ all -> 0x002e }
            if (r0 != 0) goto L_0x0018
            r2.g()     // Catch:{ all -> 0x002e }
            goto L_0x000c
        L_0x0018:
            w.q r0 = r2.f2277j     // Catch:{ all -> 0x003d }
            r0.d()     // Catch:{ all -> 0x003d }
            java.util.List r0 = r2.f2273f     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0026
            r1 = 0
            r2.f2273f = r1     // Catch:{ all -> 0x003d }
            monitor-exit(r2)
            return r0
        L_0x0026:
            okhttp3.internal.http2.StreamResetException r0 = new okhttp3.internal.http2.StreamResetException     // Catch:{ all -> 0x003d }
            okhttp3.internal.http2.ErrorCode r1 = r2.f2279l     // Catch:{ all -> 0x003d }
            r0.<init>(r1)     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x002e:
            r0 = move-exception
            w.q r1 = r2.f2277j     // Catch:{ all -> 0x003d }
            r1.d()     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x0035:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x003d }
            java.lang.String r1 = "servers cannot read response headers"
            r0.<init>(r1)     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Http2Stream.takeResponseHeaders():java.util.List");
    }

    public Timeout writeTimeout() {
        return this.f2278k;
    }
}

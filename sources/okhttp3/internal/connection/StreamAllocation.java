package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.ConnectionPool;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Route;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteSelector;
import okhttp3.internal.http.HttpCodec;

/* compiled from: XFMFile */
public final class StreamAllocation {

    /* renamed from: a  reason: collision with root package name */
    public RouteSelector.Selection f2183a;
    public final Address address;

    /* renamed from: b  reason: collision with root package name */
    public Route f2184b;

    /* renamed from: c  reason: collision with root package name */
    public final ConnectionPool f2185c;
    public final Call call;

    /* renamed from: d  reason: collision with root package name */
    public final Object f2186d;

    /* renamed from: e  reason: collision with root package name */
    public final RouteSelector f2187e;
    public final EventListener eventListener;

    /* renamed from: f  reason: collision with root package name */
    public int f2188f;

    /* renamed from: g  reason: collision with root package name */
    public RealConnection f2189g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2190h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f2191i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f2192j;

    /* renamed from: k  reason: collision with root package name */
    public HttpCodec f2193k;

    /* compiled from: XFMFile */
    public final class StreamAllocationReference extends WeakReference<StreamAllocation> {
        public final Object callStackTrace;

        public StreamAllocationReference(StreamAllocation streamAllocation, Object obj) {
            super(streamAllocation);
            this.callStackTrace = obj;
        }
    }

    public StreamAllocation(ConnectionPool connectionPool, Address address2, Call call2, EventListener eventListener2, Object obj) {
        this.f2185c = connectionPool;
        this.address = address2;
        this.call = call2;
        this.eventListener = eventListener2;
        this.f2187e = new RouteSelector(address2, Internal.instance.routeDatabase(connectionPool), call2, eventListener2);
        this.f2186d = obj;
    }

    public final Socket a(boolean z2, boolean z3, boolean z4) {
        Socket socket;
        if (z4) {
            this.f2193k = null;
        }
        if (z3) {
            this.f2191i = true;
        }
        RealConnection realConnection = this.f2189g;
        if (realConnection == null) {
            return null;
        }
        if (z2) {
            realConnection.noNewStreams = true;
        }
        if (this.f2193k != null) {
            return null;
        }
        if (!this.f2191i && !realConnection.noNewStreams) {
            return null;
        }
        int size = realConnection.allocations.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (realConnection.allocations.get(i2).get() == this) {
                realConnection.allocations.remove(i2);
                if (this.f2189g.allocations.isEmpty()) {
                    this.f2189g.idleAtNanos = System.nanoTime();
                    if (Internal.instance.connectionBecameIdle(this.f2185c, this.f2189g)) {
                        socket = this.f2189g.socket();
                        this.f2189g = null;
                        return socket;
                    }
                }
                socket = null;
                this.f2189g = null;
                return socket;
            }
        }
        throw new IllegalStateException();
    }

    public void acquire(RealConnection realConnection, boolean z2) {
        if (this.f2189g == null) {
            this.f2189g = realConnection;
            this.f2190h = z2;
            realConnection.allocations.add(new StreamAllocationReference(this, this.f2186d));
            return;
        }
        throw new IllegalStateException();
    }

    public final RealConnection b(boolean z2, int i2, int i3, int i4, int i5) {
        RealConnection realConnection;
        Socket socket;
        Socket a2;
        RealConnection realConnection2;
        boolean z3;
        Route route;
        boolean z4;
        RouteSelector.Selection selection;
        synchronized (this.f2185c) {
            if (this.f2191i) {
                throw new IllegalStateException("released");
            } else if (this.f2193k != null) {
                throw new IllegalStateException("codec != null");
            } else if (!this.f2192j) {
                realConnection = this.f2189g;
                socket = null;
                a2 = (realConnection == null || !realConnection.noNewStreams) ? null : a(false, false, true);
                realConnection2 = this.f2189g;
                if (realConnection2 != null) {
                    realConnection = null;
                } else {
                    realConnection2 = null;
                }
                if (!this.f2190h) {
                    realConnection = null;
                }
                if (realConnection2 == null) {
                    Internal.instance.get(this.f2185c, this.address, this, (Route) null);
                    RealConnection realConnection3 = this.f2189g;
                    if (realConnection3 != null) {
                        realConnection2 = realConnection3;
                        z3 = true;
                        route = null;
                    } else {
                        route = this.f2184b;
                    }
                } else {
                    route = null;
                }
                z3 = false;
            } else {
                throw new IOException("Canceled");
            }
        }
        Util.closeQuietly(a2);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
        if (z3) {
            this.eventListener.connectionAcquired(this.call, realConnection2);
        }
        if (realConnection2 != null) {
            return realConnection2;
        }
        if (route != null || ((selection = this.f2183a) != null && selection.hasNext())) {
            z4 = false;
        } else {
            this.f2183a = this.f2187e.next();
            z4 = true;
        }
        synchronized (this.f2185c) {
            if (!this.f2192j) {
                if (z4) {
                    List<Route> all = this.f2183a.getAll();
                    int size = all.size();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size) {
                            break;
                        }
                        Route route2 = all.get(i6);
                        Internal.instance.get(this.f2185c, this.address, this, route2);
                        RealConnection realConnection4 = this.f2189g;
                        if (realConnection4 != null) {
                            this.f2184b = route2;
                            realConnection2 = realConnection4;
                            z3 = true;
                            break;
                        }
                        i6++;
                    }
                }
                if (!z3) {
                    if (route == null) {
                        route = this.f2183a.next();
                    }
                    this.f2184b = route;
                    this.f2188f = 0;
                    realConnection2 = new RealConnection(this.f2185c, route);
                    acquire(realConnection2, false);
                }
            } else {
                throw new IOException("Canceled");
            }
        }
        if (!z3) {
            realConnection2.connect(i2, i3, i4, i5, z2, this.call, this.eventListener);
            Internal.instance.routeDatabase(this.f2185c).connected(realConnection2.route());
            synchronized (this.f2185c) {
                this.f2190h = true;
                Internal.instance.put(this.f2185c, realConnection2);
                if (realConnection2.isMultiplexed()) {
                    socket = Internal.instance.deduplicate(this.f2185c, this.address, this);
                    realConnection2 = this.f2189g;
                }
            }
            Util.closeQuietly(socket);
        }
        this.eventListener.connectionAcquired(this.call, realConnection2);
        return realConnection2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r0.isHealthy(r12) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.internal.connection.RealConnection c(int r7, int r8, int r9, int r10, boolean r11, boolean r12) {
        /*
            r6 = this;
        L_0x0000:
            r0 = r6
            r1 = r11
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            okhttp3.internal.connection.RealConnection r0 = r0.b(r1, r2, r3, r4, r5)
            okhttp3.ConnectionPool r1 = r6.f2185c
            monitor-enter(r1)
            int r2 = r0.successCount     // Catch:{ all -> 0x001f }
            if (r2 != 0) goto L_0x0013
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            return r0
        L_0x0013:
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            boolean r1 = r0.isHealthy(r12)
            if (r1 != 0) goto L_0x001e
            r6.noNewStreams()
            goto L_0x0000
        L_0x001e:
            return r0
        L_0x001f:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.StreamAllocation.c(int, int, int, int, boolean, boolean):okhttp3.internal.connection.RealConnection");
    }

    public void cancel() {
        HttpCodec httpCodec;
        RealConnection realConnection;
        synchronized (this.f2185c) {
            this.f2192j = true;
            httpCodec = this.f2193k;
            realConnection = this.f2189g;
        }
        if (httpCodec != null) {
            httpCodec.cancel();
        } else if (realConnection != null) {
            realConnection.cancel();
        }
    }

    public HttpCodec codec() {
        HttpCodec httpCodec;
        synchronized (this.f2185c) {
            httpCodec = this.f2193k;
        }
        return httpCodec;
    }

    public synchronized RealConnection connection() {
        return this.f2189g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f2183a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean hasMoreRoutes() {
        /*
            r1 = this;
            okhttp3.Route r0 = r1.f2184b
            if (r0 != 0) goto L_0x0019
            okhttp3.internal.connection.RouteSelector$Selection r0 = r1.f2183a
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L_0x0019
        L_0x000e:
            okhttp3.internal.connection.RouteSelector r0 = r1.f2187e
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = 0
            goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.StreamAllocation.hasMoreRoutes():boolean");
    }

    public HttpCodec newStream(OkHttpClient okHttpClient, Interceptor.Chain chain, boolean z2) {
        try {
            HttpCodec newCodec = c(chain.connectTimeoutMillis(), chain.readTimeoutMillis(), chain.writeTimeoutMillis(), okHttpClient.pingIntervalMillis(), okHttpClient.retryOnConnectionFailure(), z2).newCodec(okHttpClient, chain, this);
            synchronized (this.f2185c) {
                this.f2193k = newCodec;
            }
            return newCodec;
        } catch (IOException e2) {
            throw new RouteException(e2);
        }
    }

    public void noNewStreams() {
        RealConnection realConnection;
        Socket a2;
        synchronized (this.f2185c) {
            realConnection = this.f2189g;
            a2 = a(true, false, false);
            if (this.f2189g != null) {
                realConnection = null;
            }
        }
        Util.closeQuietly(a2);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
    }

    public void release() {
        RealConnection realConnection;
        Socket a2;
        synchronized (this.f2185c) {
            realConnection = this.f2189g;
            a2 = a(false, true, false);
            if (this.f2189g != null) {
                realConnection = null;
            }
        }
        Util.closeQuietly(a2);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
            this.eventListener.callEnd(this.call);
        }
    }

    public Socket releaseAndAcquire(RealConnection realConnection) {
        if (this.f2193k == null && this.f2189g.allocations.size() == 1) {
            Socket a2 = a(true, false, false);
            this.f2189g = realConnection;
            realConnection.allocations.add(this.f2189g.allocations.get(0));
            return a2;
        }
        throw new IllegalStateException();
    }

    public Route route() {
        return this.f2184b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r7 != okhttp3.internal.http2.ErrorCode.CANCEL) goto L_0x001e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void streamFailed(java.io.IOException r7) {
        /*
            r6 = this;
            okhttp3.ConnectionPool r0 = r6.f2185c
            monitor-enter(r0)
            boolean r1 = r7 instanceof okhttp3.internal.http2.StreamResetException     // Catch:{ all -> 0x0062 }
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0021
            okhttp3.internal.http2.StreamResetException r7 = (okhttp3.internal.http2.StreamResetException) r7     // Catch:{ all -> 0x0062 }
            okhttp3.internal.http2.ErrorCode r7 = r7.errorCode     // Catch:{ all -> 0x0062 }
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.REFUSED_STREAM     // Catch:{ all -> 0x0062 }
            if (r7 != r1) goto L_0x001a
            int r7 = r6.f2188f     // Catch:{ all -> 0x0062 }
            int r7 = r7 + r3
            r6.f2188f = r7     // Catch:{ all -> 0x0062 }
            if (r7 <= r3) goto L_0x0043
            goto L_0x001e
        L_0x001a:
            okhttp3.internal.http2.ErrorCode r1 = okhttp3.internal.http2.ErrorCode.CANCEL     // Catch:{ all -> 0x0062 }
            if (r7 == r1) goto L_0x0043
        L_0x001e:
            r6.f2184b = r2     // Catch:{ all -> 0x0062 }
            goto L_0x0041
        L_0x0021:
            okhttp3.internal.connection.RealConnection r1 = r6.f2189g     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x0043
            boolean r1 = r1.isMultiplexed()     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x002f
            boolean r1 = r7 instanceof okhttp3.internal.http2.ConnectionShutdownException     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x0043
        L_0x002f:
            okhttp3.internal.connection.RealConnection r1 = r6.f2189g     // Catch:{ all -> 0x0062 }
            int r1 = r1.successCount     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x0041
            okhttp3.Route r1 = r6.f2184b     // Catch:{ all -> 0x0062 }
            if (r1 == 0) goto L_0x001e
            if (r7 == 0) goto L_0x001e
            okhttp3.internal.connection.RouteSelector r5 = r6.f2187e     // Catch:{ all -> 0x0062 }
            r5.connectFailed(r1, r7)     // Catch:{ all -> 0x0062 }
            goto L_0x001e
        L_0x0041:
            r7 = 1
            goto L_0x0044
        L_0x0043:
            r7 = 0
        L_0x0044:
            okhttp3.internal.connection.RealConnection r1 = r6.f2189g     // Catch:{ all -> 0x0062 }
            java.net.Socket r7 = r6.a(r7, r4, r3)     // Catch:{ all -> 0x0062 }
            okhttp3.internal.connection.RealConnection r3 = r6.f2189g     // Catch:{ all -> 0x0062 }
            if (r3 != 0) goto L_0x0054
            boolean r3 = r6.f2190h     // Catch:{ all -> 0x0062 }
            if (r3 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r2 = r1
        L_0x0054:
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r7)
            if (r2 == 0) goto L_0x0061
            okhttp3.EventListener r7 = r6.eventListener
            okhttp3.Call r0 = r6.call
            r7.connectionReleased(r0, r2)
        L_0x0061:
            return
        L_0x0062:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0062 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.StreamAllocation.streamFailed(java.io.IOException):void");
    }

    public void streamFinished(boolean z2, HttpCodec httpCodec, long j2, IOException iOException) {
        RealConnection realConnection;
        Socket a2;
        boolean z3;
        this.eventListener.responseBodyEnd(this.call, j2);
        synchronized (this.f2185c) {
            if (httpCodec != null) {
                if (httpCodec == this.f2193k) {
                    if (!z2) {
                        this.f2189g.successCount++;
                    }
                    realConnection = this.f2189g;
                    a2 = a(z2, false, true);
                    if (this.f2189g != null) {
                        realConnection = null;
                    }
                    z3 = this.f2191i;
                }
            }
            throw new IllegalStateException("expected " + this.f2193k + " but was " + httpCodec);
        }
        Util.closeQuietly(a2);
        if (realConnection != null) {
            this.eventListener.connectionReleased(this.call, realConnection);
        }
        if (iOException != null) {
            this.eventListener.callFailed(this.call, iOException);
        } else if (z3) {
            this.eventListener.callEnd(this.call);
        }
    }

    public String toString() {
        RealConnection connection = connection();
        return connection != null ? connection.toString() : this.address.toString();
    }
}

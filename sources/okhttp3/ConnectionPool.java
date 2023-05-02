package okhttp3;

import a.a;
import e.g;
import java.lang.ref.Reference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.platform.Platform;

/* compiled from: XFMFile */
public final class ConnectionPool {

    /* renamed from: g  reason: collision with root package name */
    public static final ThreadPoolExecutor f1912g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), Util.threadFactory("OkHttp ConnectionPool", true));

    /* renamed from: a  reason: collision with root package name */
    public final int f1913a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1914b;

    /* renamed from: c  reason: collision with root package name */
    public final g f1915c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f1916d;

    /* renamed from: e  reason: collision with root package name */
    public final RouteDatabase f1917e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1918f;

    public ConnectionPool() {
        this(5, 5, TimeUnit.MINUTES);
    }

    public ConnectionPool(int i2, long j2, TimeUnit timeUnit) {
        this.f1915c = new g(this, 3);
        this.f1916d = new ArrayDeque();
        this.f1917e = new RouteDatabase();
        this.f1913a = i2;
        this.f1914b = timeUnit.toNanos(j2);
        if (j2 <= 0) {
            throw new IllegalArgumentException(a.e("keepAliveDuration <= 0: ", j2));
        }
    }

    public final long a(long j2) {
        synchronized (this) {
            Iterator it = this.f1916d.iterator();
            RealConnection realConnection = null;
            long j3 = Long.MIN_VALUE;
            int i2 = 0;
            int i3 = 0;
            while (it.hasNext()) {
                RealConnection realConnection2 = (RealConnection) it.next();
                if (b(realConnection2, j2) > 0) {
                    i3++;
                } else {
                    i2++;
                    long j4 = j2 - realConnection2.idleAtNanos;
                    if (j4 > j3) {
                        realConnection = realConnection2;
                        j3 = j4;
                    }
                }
            }
            long j5 = this.f1914b;
            if (j3 < j5) {
                if (i2 <= this.f1913a) {
                    if (i2 > 0) {
                        long j6 = j5 - j3;
                        return j6;
                    } else if (i3 > 0) {
                        return j5;
                    } else {
                        this.f1918f = false;
                        return -1;
                    }
                }
            }
            this.f1916d.remove(realConnection);
            Util.closeQuietly(realConnection.socket());
            return 0;
        }
    }

    public final int b(RealConnection realConnection, long j2) {
        List<Reference<StreamAllocation>> list = realConnection.allocations;
        int i2 = 0;
        while (i2 < list.size()) {
            Reference reference = list.get(i2);
            if (reference.get() != null) {
                i2++;
            } else {
                Platform.get().logCloseableLeak("A connection to " + realConnection.route().address().url() + " was leaked. Did you forget to close a response body?", ((StreamAllocation.StreamAllocationReference) reference).callStackTrace);
                list.remove(i2);
                realConnection.noNewStreams = true;
                if (list.isEmpty()) {
                    realConnection.idleAtNanos = j2 - this.f1914b;
                    return 0;
                }
            }
        }
        return list.size();
    }

    public synchronized int connectionCount() {
        return this.f1916d.size();
    }

    public void evictAll() {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f1916d.iterator();
            while (it.hasNext()) {
                RealConnection realConnection = (RealConnection) it.next();
                if (realConnection.allocations.isEmpty()) {
                    realConnection.noNewStreams = true;
                    arrayList.add(realConnection);
                    it.remove();
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Util.closeQuietly(((RealConnection) it2.next()).socket());
        }
    }

    public synchronized int idleConnectionCount() {
        int i2;
        Iterator it = this.f1916d.iterator();
        i2 = 0;
        while (it.hasNext()) {
            if (((RealConnection) it.next()).allocations.isEmpty()) {
                i2++;
            }
        }
        return i2;
    }
}

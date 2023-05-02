package r;

import java.net.Socket;
import java.util.Iterator;
import javax.net.ssl.SSLSocket;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CipherSuite;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteDatabase;
import okhttp3.internal.connection.StreamAllocation;

/* compiled from: XFMFile */
public final class i extends Internal {
    public final void addLenient(Headers.Builder builder, String str) {
        builder.a(str);
    }

    public final void addLenient(Headers.Builder builder, String str, String str2) {
        builder.b(str, str2);
    }

    public final void apply(ConnectionSpec connectionSpec, SSLSocket sSLSocket, boolean z2) {
        String[] strArr = connectionSpec.f1921c;
        String[] intersect = strArr != null ? Util.intersect(CipherSuite.f1909b, sSLSocket.getEnabledCipherSuites(), strArr) : sSLSocket.getEnabledCipherSuites();
        String[] strArr2 = connectionSpec.f1922d;
        String[] intersect2 = strArr2 != null ? Util.intersect(Util.NATURAL_ORDER, sSLSocket.getEnabledProtocols(), strArr2) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int indexOf = Util.indexOf(CipherSuite.f1909b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z2 && indexOf != -1) {
            intersect = Util.concat(intersect, supportedCipherSuites[indexOf]);
        }
        ConnectionSpec build = new ConnectionSpec.Builder(connectionSpec).cipherSuites(intersect).tlsVersions(intersect2).build();
        String[] strArr3 = build.f1922d;
        if (strArr3 != null) {
            sSLSocket.setEnabledProtocols(strArr3);
        }
        String[] strArr4 = build.f1921c;
        if (strArr4 != null) {
            sSLSocket.setEnabledCipherSuites(strArr4);
        }
    }

    public final int code(Response.Builder builder) {
        return builder.f2085c;
    }

    public final boolean connectionBecameIdle(ConnectionPool connectionPool, RealConnection realConnection) {
        connectionPool.getClass();
        if (realConnection.noNewStreams || connectionPool.f1913a == 0) {
            connectionPool.f1916d.remove(realConnection);
            return true;
        }
        connectionPool.notifyAll();
        return false;
    }

    public final Socket deduplicate(ConnectionPool connectionPool, Address address, StreamAllocation streamAllocation) {
        Iterator it = connectionPool.f1916d.iterator();
        while (it.hasNext()) {
            RealConnection realConnection = (RealConnection) it.next();
            if (realConnection.isEligible(address, (Route) null) && realConnection.isMultiplexed() && realConnection != streamAllocation.connection()) {
                return streamAllocation.releaseAndAcquire(realConnection);
            }
        }
        return null;
    }

    public final boolean equalsNonHost(Address address, Address address2) {
        return address.a(address2);
    }

    public final RealConnection get(ConnectionPool connectionPool, Address address, StreamAllocation streamAllocation, Route route) {
        Iterator it = connectionPool.f1916d.iterator();
        while (it.hasNext()) {
            RealConnection realConnection = (RealConnection) it.next();
            if (realConnection.isEligible(address, route)) {
                streamAllocation.acquire(realConnection, true);
                return realConnection;
            }
        }
        return null;
    }

    public final boolean isInvalidHttpUrlHost(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException.getMessage().startsWith("Invalid URL host");
    }

    public final Call newWebSocketCall(OkHttpClient okHttpClient, Request request) {
        k kVar = new k(okHttpClient, request, true);
        kVar.f2434c = okHttpClient.eventListenerFactory().create(kVar);
        return kVar;
    }

    public final void put(ConnectionPool connectionPool, RealConnection realConnection) {
        if (!connectionPool.f1918f) {
            connectionPool.f1918f = true;
            ConnectionPool.f1912g.execute(connectionPool.f1915c);
        }
        connectionPool.f1916d.add(realConnection);
    }

    public final RouteDatabase routeDatabase(ConnectionPool connectionPool) {
        return connectionPool.f1917e;
    }

    public final void setCache(OkHttpClient.Builder builder, InternalCache internalCache) {
        builder.f2041k = internalCache;
        builder.f2040j = null;
    }

    public final StreamAllocation streamAllocation(Call call) {
        return ((k) call).f2433b.streamAllocation();
    }
}

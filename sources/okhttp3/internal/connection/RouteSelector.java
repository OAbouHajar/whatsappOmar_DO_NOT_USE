package okhttp3.internal.connection;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;

/* compiled from: XFMFile */
public final class RouteSelector {

    /* renamed from: a  reason: collision with root package name */
    public final Address f2173a;

    /* renamed from: b  reason: collision with root package name */
    public final RouteDatabase f2174b;

    /* renamed from: c  reason: collision with root package name */
    public final Call f2175c;

    /* renamed from: d  reason: collision with root package name */
    public final EventListener f2176d;

    /* renamed from: e  reason: collision with root package name */
    public List f2177e = Collections.emptyList();

    /* renamed from: f  reason: collision with root package name */
    public int f2178f;

    /* renamed from: g  reason: collision with root package name */
    public List f2179g = Collections.emptyList();

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f2180h = new ArrayList();

    /* compiled from: XFMFile */
    public final class Selection {

        /* renamed from: a  reason: collision with root package name */
        public final List f2181a;

        /* renamed from: b  reason: collision with root package name */
        public int f2182b = 0;

        public Selection(ArrayList arrayList) {
            this.f2181a = arrayList;
        }

        public List<Route> getAll() {
            return new ArrayList(this.f2181a);
        }

        public boolean hasNext() {
            return this.f2182b < this.f2181a.size();
        }

        public Route next() {
            if (hasNext()) {
                int i2 = this.f2182b;
                this.f2182b = i2 + 1;
                return (Route) this.f2181a.get(i2);
            }
            throw new NoSuchElementException();
        }
    }

    public RouteSelector(Address address, RouteDatabase routeDatabase, Call call, EventListener eventListener) {
        List<T> list;
        this.f2173a = address;
        this.f2174b = routeDatabase;
        this.f2175c = call;
        this.f2176d = eventListener;
        HttpUrl url = address.url();
        Proxy proxy = address.proxy();
        if (proxy != null) {
            list = Collections.singletonList(proxy);
        } else {
            List<Proxy> select = address.proxySelector().select(url.uri());
            if (select == null || select.isEmpty()) {
                list = Util.immutableList((T[]) new Proxy[]{Proxy.NO_PROXY});
            } else {
                list = Util.immutableList(select);
            }
        }
        this.f2177e = list;
        this.f2178f = 0;
    }

    public void connectFailed(Route route, IOException iOException) {
        if (route.proxy().type() != Proxy.Type.DIRECT) {
            Address address = this.f2173a;
            if (address.proxySelector() != null) {
                address.proxySelector().connectFailed(address.url().uri(), route.proxy().address(), iOException);
            }
        }
        this.f2174b.failed(route);
    }

    public boolean hasNext() {
        return (this.f2178f < this.f2177e.size()) || !this.f2180h.isEmpty();
    }

    public Selection next() {
        ArrayList arrayList;
        String str;
        int i2;
        if (hasNext()) {
            ArrayList arrayList2 = new ArrayList();
            do {
                boolean z2 = this.f2178f < this.f2177e.size();
                arrayList = this.f2180h;
                if (!z2) {
                    break;
                }
                boolean z3 = this.f2178f < this.f2177e.size();
                Address address = this.f2173a;
                if (z3) {
                    List list = this.f2177e;
                    int i3 = this.f2178f;
                    this.f2178f = i3 + 1;
                    Proxy proxy = (Proxy) list.get(i3);
                    this.f2179g = new ArrayList();
                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                        str = address.url().host();
                        i2 = address.url().port();
                    } else {
                        SocketAddress address2 = proxy.address();
                        if (address2 instanceof InetSocketAddress) {
                            InetSocketAddress inetSocketAddress = (InetSocketAddress) address2;
                            InetAddress address3 = inetSocketAddress.getAddress();
                            str = address3 == null ? inetSocketAddress.getHostName() : address3.getHostAddress();
                            i2 = inetSocketAddress.getPort();
                        } else {
                            throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + address2.getClass());
                        }
                    }
                    if (i2 < 1 || i2 > 65535) {
                        throw new SocketException("No route to " + str + ":" + i2 + "; port is out of range");
                    }
                    if (proxy.type() == Proxy.Type.SOCKS) {
                        this.f2179g.add(InetSocketAddress.createUnresolved(str, i2));
                    } else {
                        EventListener eventListener = this.f2176d;
                        Call call = this.f2175c;
                        eventListener.dnsStart(call, str);
                        List<InetAddress> lookup = address.dns().lookup(str);
                        if (!lookup.isEmpty()) {
                            eventListener.dnsEnd(call, str, lookup);
                            int size = lookup.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                this.f2179g.add(new InetSocketAddress(lookup.get(i4), i2));
                            }
                        } else {
                            throw new UnknownHostException(address.dns() + " returned no addresses for " + str);
                        }
                    }
                    int size2 = this.f2179g.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        Route route = new Route(address, proxy, (InetSocketAddress) this.f2179g.get(i5));
                        if (this.f2174b.shouldPostpone(route)) {
                            arrayList.add(route);
                        } else {
                            arrayList2.add(route);
                        }
                    }
                } else {
                    throw new SocketException("No route to " + address.url().host() + "; exhausted proxy configurations: " + this.f2177e);
                }
            } while (arrayList2.isEmpty());
            if (arrayList2.isEmpty()) {
                arrayList2.addAll(arrayList);
                arrayList.clear();
            }
            return new Selection(arrayList2);
        }
        throw new NoSuchElementException();
    }
}

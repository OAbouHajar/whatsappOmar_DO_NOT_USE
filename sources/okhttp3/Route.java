package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;

/* compiled from: XFMFile */
public final class Route {

    /* renamed from: a  reason: collision with root package name */
    public final Address f2096a;

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f2097b;

    /* renamed from: c  reason: collision with root package name */
    public final InetSocketAddress f2098c;

    public Route(Address address, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (address == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.f2096a = address;
            this.f2097b = proxy;
            this.f2098c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    public Address address() {
        return this.f2096a;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Route) {
            Route route = (Route) obj;
            return route.f2096a.equals(this.f2096a) && route.f2097b.equals(this.f2097b) && route.f2098c.equals(this.f2098c);
        }
    }

    public int hashCode() {
        int hashCode = this.f2097b.hashCode();
        return this.f2098c.hashCode() + ((hashCode + ((this.f2096a.hashCode() + 527) * 31)) * 31);
    }

    public Proxy proxy() {
        return this.f2097b;
    }

    public boolean requiresTunnel() {
        return this.f2096a.f1872i != null && this.f2097b.type() == Proxy.Type.HTTP;
    }

    public InetSocketAddress socketAddress() {
        return this.f2098c;
    }

    public String toString() {
        return "Route{" + this.f2098c + "}";
    }
}

package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;

/* compiled from: XFMFile */
public final class Address {

    /* renamed from: a  reason: collision with root package name */
    public final HttpUrl f1864a;

    /* renamed from: b  reason: collision with root package name */
    public final Dns f1865b;

    /* renamed from: c  reason: collision with root package name */
    public final SocketFactory f1866c;

    /* renamed from: d  reason: collision with root package name */
    public final Authenticator f1867d;

    /* renamed from: e  reason: collision with root package name */
    public final List f1868e;

    /* renamed from: f  reason: collision with root package name */
    public final List f1869f;

    /* renamed from: g  reason: collision with root package name */
    public final ProxySelector f1870g;

    /* renamed from: h  reason: collision with root package name */
    public final Proxy f1871h;

    /* renamed from: i  reason: collision with root package name */
    public final SSLSocketFactory f1872i;

    /* renamed from: j  reason: collision with root package name */
    public final HostnameVerifier f1873j;

    /* renamed from: k  reason: collision with root package name */
    public final CertificatePinner f1874k;

    public Address(String str, int i2, Dns dns, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable CertificatePinner certificatePinner, Authenticator authenticator, @Nullable Proxy proxy, List<Protocol> list, List<ConnectionSpec> list2, ProxySelector proxySelector) {
        this.f1864a = new HttpUrl.Builder().scheme(sSLSocketFactory != null ? "https" : "http").host(str).port(i2).build();
        if (dns != null) {
            this.f1865b = dns;
            if (socketFactory != null) {
                this.f1866c = socketFactory;
                if (authenticator != null) {
                    this.f1867d = authenticator;
                    if (list != null) {
                        this.f1868e = Util.immutableList(list);
                        if (list2 != null) {
                            this.f1869f = Util.immutableList(list2);
                            if (proxySelector != null) {
                                this.f1870g = proxySelector;
                                this.f1871h = proxy;
                                this.f1872i = sSLSocketFactory;
                                this.f1873j = hostnameVerifier;
                                this.f1874k = certificatePinner;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }

    public final boolean a(Address address) {
        return this.f1865b.equals(address.f1865b) && this.f1867d.equals(address.f1867d) && this.f1868e.equals(address.f1868e) && this.f1869f.equals(address.f1869f) && this.f1870g.equals(address.f1870g) && Util.equal(this.f1871h, address.f1871h) && Util.equal(this.f1872i, address.f1872i) && Util.equal(this.f1873j, address.f1873j) && Util.equal(this.f1874k, address.f1874k) && url().port() == address.url().port();
    }

    @Nullable
    public CertificatePinner certificatePinner() {
        return this.f1874k;
    }

    public List<ConnectionSpec> connectionSpecs() {
        return this.f1869f;
    }

    public Dns dns() {
        return this.f1865b;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Address) {
            Address address = (Address) obj;
            return this.f1864a.equals(address.f1864a) && a(address);
        }
    }

    public int hashCode() {
        int hashCode = this.f1865b.hashCode();
        int hashCode2 = (this.f1870g.hashCode() + ((this.f1869f.hashCode() + ((this.f1868e.hashCode() + ((this.f1867d.hashCode() + ((hashCode + ((this.f1864a.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        int i2 = 0;
        Proxy proxy = this.f1871h;
        int hashCode3 = (hashCode2 + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f1872i;
        int hashCode4 = (hashCode3 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f1873j;
        int hashCode5 = (hashCode4 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        CertificatePinner certificatePinner = this.f1874k;
        if (certificatePinner != null) {
            i2 = certificatePinner.hashCode();
        }
        return hashCode5 + i2;
    }

    @Nullable
    public HostnameVerifier hostnameVerifier() {
        return this.f1873j;
    }

    public List<Protocol> protocols() {
        return this.f1868e;
    }

    @Nullable
    public Proxy proxy() {
        return this.f1871h;
    }

    public Authenticator proxyAuthenticator() {
        return this.f1867d;
    }

    public ProxySelector proxySelector() {
        return this.f1870g;
    }

    public SocketFactory socketFactory() {
        return this.f1866c;
    }

    @Nullable
    public SSLSocketFactory sslSocketFactory() {
        return this.f1872i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        HttpUrl httpUrl = this.f1864a;
        sb.append(httpUrl.host());
        sb.append(":");
        sb.append(httpUrl.port());
        Object obj = this.f1871h;
        if (obj != null) {
            sb.append(", proxy=");
        } else {
            sb.append(", proxySelector=");
            obj = this.f1870g;
        }
        sb.append(obj);
        sb.append("}");
        return sb.toString();
    }

    public HttpUrl url() {
        return this.f1864a;
    }
}

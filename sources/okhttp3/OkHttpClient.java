package okhttp3;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.google.gson.internal.bind.g;
import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.WebSocket;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.cache.InternalCache;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.CertificateChainCleaner;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import r.i;
import r.k;

/* compiled from: XFMFile */
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {
    public static final List B = Util.immutableList((T[]) new Protocol[]{Protocol.HTTP_2, Protocol.HTTP_1_1});
    public static final List C = Util.immutableList((T[]) new ConnectionSpec[]{ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT});
    public final int A;

    /* renamed from: a  reason: collision with root package name */
    public final Dispatcher f2005a;

    /* renamed from: b  reason: collision with root package name */
    public final Proxy f2006b;

    /* renamed from: c  reason: collision with root package name */
    public final List f2007c;

    /* renamed from: d  reason: collision with root package name */
    public final List f2008d;

    /* renamed from: e  reason: collision with root package name */
    public final List f2009e;

    /* renamed from: f  reason: collision with root package name */
    public final List f2010f;

    /* renamed from: g  reason: collision with root package name */
    public final EventListener.Factory f2011g;

    /* renamed from: h  reason: collision with root package name */
    public final ProxySelector f2012h;

    /* renamed from: i  reason: collision with root package name */
    public final CookieJar f2013i;

    /* renamed from: j  reason: collision with root package name */
    public final Cache f2014j;

    /* renamed from: k  reason: collision with root package name */
    public final InternalCache f2015k;

    /* renamed from: l  reason: collision with root package name */
    public final SocketFactory f2016l;

    /* renamed from: m  reason: collision with root package name */
    public final SSLSocketFactory f2017m;

    /* renamed from: n  reason: collision with root package name */
    public final CertificateChainCleaner f2018n;

    /* renamed from: o  reason: collision with root package name */
    public final HostnameVerifier f2019o;

    /* renamed from: p  reason: collision with root package name */
    public final CertificatePinner f2020p;

    /* renamed from: q  reason: collision with root package name */
    public final Authenticator f2021q;

    /* renamed from: r  reason: collision with root package name */
    public final Authenticator f2022r;

    /* renamed from: s  reason: collision with root package name */
    public final ConnectionPool f2023s;

    /* renamed from: t  reason: collision with root package name */
    public final Dns f2024t;

    /* renamed from: u  reason: collision with root package name */
    public final boolean f2025u;

    /* renamed from: v  reason: collision with root package name */
    public final boolean f2026v;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f2027w;

    /* renamed from: x  reason: collision with root package name */
    public final int f2028x;

    /* renamed from: y  reason: collision with root package name */
    public final int f2029y;

    /* renamed from: z  reason: collision with root package name */
    public final int f2030z;

    /* compiled from: XFMFile */
    public final class Builder {
        public int A;

        /* renamed from: a  reason: collision with root package name */
        public Dispatcher f2031a;

        /* renamed from: b  reason: collision with root package name */
        public Proxy f2032b;

        /* renamed from: c  reason: collision with root package name */
        public List f2033c;

        /* renamed from: d  reason: collision with root package name */
        public List f2034d;

        /* renamed from: e  reason: collision with root package name */
        public final ArrayList f2035e;

        /* renamed from: f  reason: collision with root package name */
        public final ArrayList f2036f;

        /* renamed from: g  reason: collision with root package name */
        public EventListener.Factory f2037g;

        /* renamed from: h  reason: collision with root package name */
        public ProxySelector f2038h;

        /* renamed from: i  reason: collision with root package name */
        public CookieJar f2039i;

        /* renamed from: j  reason: collision with root package name */
        public Cache f2040j;

        /* renamed from: k  reason: collision with root package name */
        public InternalCache f2041k;

        /* renamed from: l  reason: collision with root package name */
        public SocketFactory f2042l;

        /* renamed from: m  reason: collision with root package name */
        public SSLSocketFactory f2043m;

        /* renamed from: n  reason: collision with root package name */
        public CertificateChainCleaner f2044n;

        /* renamed from: o  reason: collision with root package name */
        public HostnameVerifier f2045o;

        /* renamed from: p  reason: collision with root package name */
        public CertificatePinner f2046p;

        /* renamed from: q  reason: collision with root package name */
        public Authenticator f2047q;

        /* renamed from: r  reason: collision with root package name */
        public Authenticator f2048r;

        /* renamed from: s  reason: collision with root package name */
        public ConnectionPool f2049s;

        /* renamed from: t  reason: collision with root package name */
        public Dns f2050t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f2051u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f2052v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f2053w;

        /* renamed from: x  reason: collision with root package name */
        public int f2054x;

        /* renamed from: y  reason: collision with root package name */
        public int f2055y;

        /* renamed from: z  reason: collision with root package name */
        public int f2056z;

        public Builder() {
            this.f2035e = new ArrayList();
            this.f2036f = new ArrayList();
            this.f2031a = new Dispatcher();
            this.f2033c = OkHttpClient.B;
            this.f2034d = OkHttpClient.C;
            this.f2037g = new g(EventListener.NONE);
            this.f2038h = ProxySelector.getDefault();
            this.f2039i = CookieJar.NO_COOKIES;
            this.f2042l = SocketFactory.getDefault();
            this.f2045o = OkHostnameVerifier.INSTANCE;
            this.f2046p = CertificatePinner.DEFAULT;
            Authenticator authenticator = Authenticator.NONE;
            this.f2047q = authenticator;
            this.f2048r = authenticator;
            this.f2049s = new ConnectionPool();
            this.f2050t = Dns.SYSTEM;
            this.f2051u = true;
            this.f2052v = true;
            this.f2053w = true;
            this.f2054x = SearchActionVerificationClientService.NOTIFICATION_ID;
            this.f2055y = SearchActionVerificationClientService.NOTIFICATION_ID;
            this.f2056z = SearchActionVerificationClientService.NOTIFICATION_ID;
            this.A = 0;
        }

        public Builder(OkHttpClient okHttpClient) {
            ArrayList arrayList = new ArrayList();
            this.f2035e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f2036f = arrayList2;
            this.f2031a = okHttpClient.f2005a;
            this.f2032b = okHttpClient.f2006b;
            this.f2033c = okHttpClient.f2007c;
            this.f2034d = okHttpClient.f2008d;
            arrayList.addAll(okHttpClient.f2009e);
            arrayList2.addAll(okHttpClient.f2010f);
            this.f2037g = okHttpClient.f2011g;
            this.f2038h = okHttpClient.f2012h;
            this.f2039i = okHttpClient.f2013i;
            this.f2041k = okHttpClient.f2015k;
            this.f2040j = okHttpClient.f2014j;
            this.f2042l = okHttpClient.f2016l;
            this.f2043m = okHttpClient.f2017m;
            this.f2044n = okHttpClient.f2018n;
            this.f2045o = okHttpClient.f2019o;
            this.f2046p = okHttpClient.f2020p;
            this.f2047q = okHttpClient.f2021q;
            this.f2048r = okHttpClient.f2022r;
            this.f2049s = okHttpClient.f2023s;
            this.f2050t = okHttpClient.f2024t;
            this.f2051u = okHttpClient.f2025u;
            this.f2052v = okHttpClient.f2026v;
            this.f2053w = okHttpClient.f2027w;
            this.f2054x = okHttpClient.f2028x;
            this.f2055y = okHttpClient.f2029y;
            this.f2056z = okHttpClient.f2030z;
            this.A = okHttpClient.A;
        }

        public Builder addInterceptor(Interceptor interceptor) {
            if (interceptor != null) {
                this.f2035e.add(interceptor);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        public Builder addNetworkInterceptor(Interceptor interceptor) {
            if (interceptor != null) {
                this.f2036f.add(interceptor);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        public Builder authenticator(Authenticator authenticator) {
            if (authenticator != null) {
                this.f2048r = authenticator;
                return this;
            }
            throw new NullPointerException("authenticator == null");
        }

        public OkHttpClient build() {
            return new OkHttpClient(this);
        }

        public Builder cache(@Nullable Cache cache) {
            this.f2040j = cache;
            this.f2041k = null;
            return this;
        }

        public Builder certificatePinner(CertificatePinner certificatePinner) {
            if (certificatePinner != null) {
                this.f2046p = certificatePinner;
                return this;
            }
            throw new NullPointerException("certificatePinner == null");
        }

        public Builder connectTimeout(long j2, TimeUnit timeUnit) {
            this.f2054x = Util.checkDuration("timeout", j2, timeUnit);
            return this;
        }

        public Builder connectionPool(ConnectionPool connectionPool) {
            if (connectionPool != null) {
                this.f2049s = connectionPool;
                return this;
            }
            throw new NullPointerException("connectionPool == null");
        }

        public Builder connectionSpecs(List<ConnectionSpec> list) {
            this.f2034d = Util.immutableList(list);
            return this;
        }

        public Builder cookieJar(CookieJar cookieJar) {
            if (cookieJar != null) {
                this.f2039i = cookieJar;
                return this;
            }
            throw new NullPointerException("cookieJar == null");
        }

        public Builder dispatcher(Dispatcher dispatcher) {
            if (dispatcher != null) {
                this.f2031a = dispatcher;
                return this;
            }
            throw new IllegalArgumentException("dispatcher == null");
        }

        public Builder dns(Dns dns) {
            if (dns != null) {
                this.f2050t = dns;
                return this;
            }
            throw new NullPointerException("dns == null");
        }

        public Builder eventListener(EventListener eventListener) {
            if (eventListener != null) {
                EventListener eventListener2 = EventListener.NONE;
                this.f2037g = new g(eventListener);
                return this;
            }
            throw new NullPointerException("eventListener == null");
        }

        public Builder eventListenerFactory(EventListener.Factory factory) {
            if (factory != null) {
                this.f2037g = factory;
                return this;
            }
            throw new NullPointerException("eventListenerFactory == null");
        }

        public Builder followRedirects(boolean z2) {
            this.f2052v = z2;
            return this;
        }

        public Builder followSslRedirects(boolean z2) {
            this.f2051u = z2;
            return this;
        }

        public Builder hostnameVerifier(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier != null) {
                this.f2045o = hostnameVerifier;
                return this;
            }
            throw new NullPointerException("hostnameVerifier == null");
        }

        public List<Interceptor> interceptors() {
            return this.f2035e;
        }

        public List<Interceptor> networkInterceptors() {
            return this.f2036f;
        }

        public Builder pingInterval(long j2, TimeUnit timeUnit) {
            this.A = Util.checkDuration("interval", j2, timeUnit);
            return this;
        }

        public Builder protocols(List<Protocol> list) {
            ArrayList arrayList = new ArrayList(list);
            Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(protocol) && !arrayList.contains(Protocol.HTTP_1_1)) {
                throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList);
            } else if (arrayList.contains(protocol) && arrayList.size() > 1) {
                throw new IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList);
            } else if (arrayList.contains(Protocol.HTTP_1_0)) {
                throw new IllegalArgumentException("protocols must not contain http/1.0: " + arrayList);
            } else if (!arrayList.contains((Object) null)) {
                arrayList.remove(Protocol.SPDY_3);
                this.f2033c = Collections.unmodifiableList(arrayList);
                return this;
            } else {
                throw new IllegalArgumentException("protocols must not contain null");
            }
        }

        public Builder proxy(@Nullable Proxy proxy) {
            this.f2032b = proxy;
            return this;
        }

        public Builder proxyAuthenticator(Authenticator authenticator) {
            if (authenticator != null) {
                this.f2047q = authenticator;
                return this;
            }
            throw new NullPointerException("proxyAuthenticator == null");
        }

        public Builder proxySelector(ProxySelector proxySelector) {
            this.f2038h = proxySelector;
            return this;
        }

        public Builder readTimeout(long j2, TimeUnit timeUnit) {
            this.f2055y = Util.checkDuration("timeout", j2, timeUnit);
            return this;
        }

        public Builder retryOnConnectionFailure(boolean z2) {
            this.f2053w = z2;
            return this;
        }

        public Builder socketFactory(SocketFactory socketFactory) {
            if (socketFactory != null) {
                this.f2042l = socketFactory;
                return this;
            }
            throw new NullPointerException("socketFactory == null");
        }

        public Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory) {
            if (sSLSocketFactory != null) {
                this.f2043m = sSLSocketFactory;
                this.f2044n = Platform.get().buildCertificateChainCleaner(sSLSocketFactory);
                return this;
            }
            throw new NullPointerException("sslSocketFactory == null");
        }

        public Builder sslSocketFactory(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            if (sSLSocketFactory == null) {
                throw new NullPointerException("sslSocketFactory == null");
            } else if (x509TrustManager != null) {
                this.f2043m = sSLSocketFactory;
                this.f2044n = CertificateChainCleaner.get(x509TrustManager);
                return this;
            } else {
                throw new NullPointerException("trustManager == null");
            }
        }

        public Builder writeTimeout(long j2, TimeUnit timeUnit) {
            this.f2056z = Util.checkDuration("timeout", j2, timeUnit);
            return this;
        }
    }

    static {
        Internal.instance = new i();
    }

    public OkHttpClient() {
        this(new Builder());
    }

    public OkHttpClient(Builder builder) {
        boolean z2;
        CertificateChainCleaner certificateChainCleaner;
        this.f2005a = builder.f2031a;
        this.f2006b = builder.f2032b;
        this.f2007c = builder.f2033c;
        List list = builder.f2034d;
        this.f2008d = list;
        this.f2009e = Util.immutableList(builder.f2035e);
        this.f2010f = Util.immutableList(builder.f2036f);
        this.f2011g = builder.f2037g;
        this.f2012h = builder.f2038h;
        this.f2013i = builder.f2039i;
        this.f2014j = builder.f2040j;
        this.f2015k = builder.f2041k;
        this.f2016l = builder.f2042l;
        Iterator it = list.iterator();
        loop0:
        while (true) {
            z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                ConnectionSpec connectionSpec = (ConnectionSpec) it.next();
                if (z2 || connectionSpec.isTls()) {
                    z2 = true;
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = builder.f2043m;
        if (sSLSocketFactory != null || !z2) {
            this.f2017m = sSLSocketFactory;
            certificateChainCleaner = builder.f2044n;
        } else {
            X509TrustManager platformTrustManager = Util.platformTrustManager();
            try {
                SSLContext sSLContext = Platform.get().getSSLContext();
                sSLContext.init((KeyManager[]) null, new TrustManager[]{platformTrustManager}, (SecureRandom) null);
                this.f2017m = sSLContext.getSocketFactory();
                certificateChainCleaner = CertificateChainCleaner.get(platformTrustManager);
            } catch (GeneralSecurityException e2) {
                throw Util.assertionError("No System TLS", e2);
            }
        }
        this.f2018n = certificateChainCleaner;
        if (this.f2017m != null) {
            Platform.get().configureSslSocketFactory(this.f2017m);
        }
        this.f2019o = builder.f2045o;
        CertificatePinner certificatePinner = builder.f2046p;
        this.f2020p = !Util.equal(certificatePinner.f1904b, certificateChainCleaner) ? new CertificatePinner(certificatePinner.f1903a, certificateChainCleaner) : certificatePinner;
        this.f2021q = builder.f2047q;
        this.f2022r = builder.f2048r;
        this.f2023s = builder.f2049s;
        this.f2024t = builder.f2050t;
        this.f2025u = builder.f2051u;
        this.f2026v = builder.f2052v;
        this.f2027w = builder.f2053w;
        this.f2028x = builder.f2054x;
        this.f2029y = builder.f2055y;
        this.f2030z = builder.f2056z;
        this.A = builder.A;
        if (this.f2009e.contains((Object) null)) {
            throw new IllegalStateException("Null interceptor: " + this.f2009e);
        } else if (this.f2010f.contains((Object) null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f2010f);
        }
    }

    public Authenticator authenticator() {
        return this.f2022r;
    }

    @Nullable
    public Cache cache() {
        return this.f2014j;
    }

    public CertificatePinner certificatePinner() {
        return this.f2020p;
    }

    public int connectTimeoutMillis() {
        return this.f2028x;
    }

    public ConnectionPool connectionPool() {
        return this.f2023s;
    }

    public List<ConnectionSpec> connectionSpecs() {
        return this.f2008d;
    }

    public CookieJar cookieJar() {
        return this.f2013i;
    }

    public Dispatcher dispatcher() {
        return this.f2005a;
    }

    public Dns dns() {
        return this.f2024t;
    }

    public EventListener.Factory eventListenerFactory() {
        return this.f2011g;
    }

    public boolean followRedirects() {
        return this.f2026v;
    }

    public boolean followSslRedirects() {
        return this.f2025u;
    }

    public HostnameVerifier hostnameVerifier() {
        return this.f2019o;
    }

    public List<Interceptor> interceptors() {
        return this.f2009e;
    }

    public List<Interceptor> networkInterceptors() {
        return this.f2010f;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public Call newCall(Request request) {
        k kVar = new k(this, request, false);
        kVar.f2434c = eventListenerFactory().create(kVar);
        return kVar;
    }

    public WebSocket newWebSocket(Request request, WebSocketListener webSocketListener) {
        RealWebSocket realWebSocket = new RealWebSocket(request, webSocketListener, new Random(), (long) this.A);
        realWebSocket.connect(this);
        return realWebSocket;
    }

    public int pingIntervalMillis() {
        return this.A;
    }

    public List<Protocol> protocols() {
        return this.f2007c;
    }

    public Proxy proxy() {
        return this.f2006b;
    }

    public Authenticator proxyAuthenticator() {
        return this.f2021q;
    }

    public ProxySelector proxySelector() {
        return this.f2012h;
    }

    public int readTimeoutMillis() {
        return this.f2029y;
    }

    public boolean retryOnConnectionFailure() {
        return this.f2027w;
    }

    public SocketFactory socketFactory() {
        return this.f2016l;
    }

    public SSLSocketFactory sslSocketFactory() {
        return this.f2017m;
    }

    public int writeTimeoutMillis() {
        return this.f2030z;
    }
}

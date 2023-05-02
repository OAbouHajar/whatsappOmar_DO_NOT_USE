package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.ConnectionPool;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.Version;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http1.Http1Codec;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Codec;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;
import t.a;

/* compiled from: XFMFile */
public final class RealConnection extends Http2Connection.Listener implements Connection {

    /* renamed from: a  reason: collision with root package name */
    public final ConnectionPool f2161a;
    public int allocationLimit = 1;
    public final List<Reference<StreamAllocation>> allocations = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final Route f2162b;

    /* renamed from: c  reason: collision with root package name */
    public Socket f2163c;

    /* renamed from: d  reason: collision with root package name */
    public Socket f2164d;

    /* renamed from: e  reason: collision with root package name */
    public Handshake f2165e;

    /* renamed from: f  reason: collision with root package name */
    public Protocol f2166f;

    /* renamed from: g  reason: collision with root package name */
    public Http2Connection f2167g;

    /* renamed from: h  reason: collision with root package name */
    public BufferedSource f2168h;

    /* renamed from: i  reason: collision with root package name */
    public BufferedSink f2169i;
    public long idleAtNanos = Long.MAX_VALUE;
    public boolean noNewStreams;
    public int successCount;

    public RealConnection(ConnectionPool connectionPool, Route route) {
        this.f2161a = connectionPool;
        this.f2162b = route;
    }

    public static RealConnection testConnection(ConnectionPool connectionPool, Route route, Socket socket, long j2) {
        RealConnection realConnection = new RealConnection(connectionPool, route);
        realConnection.f2164d = socket;
        realConnection.idleAtNanos = j2;
        return realConnection;
    }

    public final void a(int i2, int i3, Call call, EventListener eventListener) {
        Route route = this.f2162b;
        Proxy proxy = route.proxy();
        this.f2163c = (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) ? route.address().socketFactory().createSocket() : new Socket(proxy);
        eventListener.connectStart(call, route.socketAddress(), proxy);
        this.f2163c.setSoTimeout(i3);
        try {
            Platform.get().connectSocket(this.f2163c, route.socketAddress(), i2);
            try {
                this.f2168h = Okio.buffer(Okio.source(this.f2163c));
                this.f2169i = Okio.buffer(Okio.sink(this.f2163c));
            } catch (NullPointerException e2) {
                if ("throw with null exception".equals(e2.getMessage())) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            ConnectException connectException = new ConnectException("Failed to connect to " + route.socketAddress());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    public final void b(int i2, int i3, int i4, Call call, EventListener eventListener) {
        int i5;
        int i6 = i3;
        Call call2 = call;
        EventListener eventListener2 = eventListener;
        Request.Builder builder = new Request.Builder();
        Route route = this.f2162b;
        boolean z2 = true;
        Request build = builder.url(route.address().url()).header("Host", Util.hostHeader(route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", Version.userAgent()).build();
        HttpUrl url = build.url();
        int i7 = 0;
        while (i7 < 21) {
            a(i2, i6, call2, eventListener2);
            String str = "CONNECT " + Util.hostHeader(url, z2) + " HTTP/1.1";
            while (true) {
                Http1Codec http1Codec = new Http1Codec((OkHttpClient) null, (StreamAllocation) null, this.f2168h, this.f2169i);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                this.f2168h.timeout().timeout((long) i6, timeUnit);
                i5 = i7;
                this.f2169i.timeout().timeout((long) i4, timeUnit);
                http1Codec.writeRequest(build.headers(), str);
                http1Codec.finishRequest();
                Response build2 = http1Codec.readResponseHeaders(false).request(build).build();
                long contentLength = HttpHeaders.contentLength(build2);
                if (contentLength == -1) {
                    contentLength = 0;
                }
                Source newFixedLengthSource = http1Codec.newFixedLengthSource(contentLength);
                Util.skipAll(newFixedLengthSource, Integer.MAX_VALUE, timeUnit);
                newFixedLengthSource.close();
                int code = build2.code();
                if (code != 200) {
                    if (code == 407) {
                        Request authenticate = route.address().proxyAuthenticator().authenticate(route, build2);
                        if (authenticate == null) {
                            throw new IOException("Failed to authenticate with proxy");
                        } else if ("close".equalsIgnoreCase(build2.header("Connection"))) {
                            build = authenticate;
                            break;
                        } else {
                            int i8 = i2;
                            build = authenticate;
                            i7 = i5;
                        }
                    } else {
                        throw new IOException("Unexpected response code for CONNECT: " + build2.code());
                    }
                } else if (!this.f2168h.buffer().exhausted() || !this.f2169i.buffer().exhausted()) {
                    throw new IOException("TLS tunnel buffered too many bytes!");
                } else {
                    build = null;
                }
            }
            if (build != null) {
                Util.closeQuietly(this.f2163c);
                this.f2163c = null;
                this.f2169i = null;
                this.f2168h = null;
                eventListener2.connectEnd(call2, route.socketAddress(), route.proxy(), (Protocol) null);
                i7 = i5 + 1;
                z2 = true;
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: javax.net.ssl.SSLSocket} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.net.Socket, javax.net.ssl.SSLSocket] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0147 A[Catch:{ all -> 0x013e }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x014d A[Catch:{ all -> 0x013e }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0151  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(okhttp3.internal.connection.ConnectionSpecSelector r9, int r10, okhttp3.Call r11, okhttp3.EventListener r12) {
        /*
            r8 = this;
            okhttp3.Route r0 = r8.f2162b
            okhttp3.Address r1 = r0.address()
            javax.net.ssl.SSLSocketFactory r1 = r1.sslSocketFactory()
            if (r1 != 0) goto L_0x002f
            okhttp3.Address r9 = r0.address()
            java.util.List r9 = r9.protocols()
            okhttp3.Protocol r11 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r9 = r9.contains(r11)
            if (r9 == 0) goto L_0x0026
            java.net.Socket r9 = r8.f2163c
            r8.f2164d = r9
            r8.f2166f = r11
            r8.d(r10)
            return
        L_0x0026:
            java.net.Socket r9 = r8.f2163c
            r8.f2164d = r9
            okhttp3.Protocol r9 = okhttp3.Protocol.HTTP_1_1
            r8.f2166f = r9
            return
        L_0x002f:
            r12.secureConnectStart(r11)
            java.lang.String r1 = "Hostname "
            okhttp3.Address r0 = r0.address()
            javax.net.ssl.SSLSocketFactory r2 = r0.sslSocketFactory()
            r3 = 0
            java.net.Socket r4 = r8.f2163c     // Catch:{ AssertionError -> 0x0140 }
            okhttp3.HttpUrl r5 = r0.url()     // Catch:{ AssertionError -> 0x0140 }
            java.lang.String r5 = r5.host()     // Catch:{ AssertionError -> 0x0140 }
            okhttp3.HttpUrl r6 = r0.url()     // Catch:{ AssertionError -> 0x0140 }
            int r6 = r6.port()     // Catch:{ AssertionError -> 0x0140 }
            r7 = 1
            java.net.Socket r2 = r2.createSocket(r4, r5, r6, r7)     // Catch:{ AssertionError -> 0x0140 }
            javax.net.ssl.SSLSocket r2 = (javax.net.ssl.SSLSocket) r2     // Catch:{ AssertionError -> 0x0140 }
            okhttp3.ConnectionSpec r9 = r9.configureSecureSocket(r2)     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            boolean r4 = r9.supportsTlsExtensions()     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            if (r4 == 0) goto L_0x0073
            okhttp3.internal.platform.Platform r4 = okhttp3.internal.platform.Platform.get()     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            okhttp3.HttpUrl r5 = r0.url()     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            java.lang.String r5 = r5.host()     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            java.util.List r6 = r0.protocols()     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            r4.configureTlsExtensions(r2, r5, r6)     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
        L_0x0073:
            r2.startHandshake()     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            javax.net.ssl.SSLSession r4 = r2.getSession()     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            okhttp3.Handshake r5 = okhttp3.Handshake.get(r4)     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            javax.net.ssl.HostnameVerifier r6 = r0.hostnameVerifier()     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            okhttp3.HttpUrl r7 = r0.url()     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            java.lang.String r7 = r7.host()     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            boolean r4 = r6.verify(r7, r4)     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            if (r4 == 0) goto L_0x00ec
            okhttp3.CertificatePinner r1 = r0.certificatePinner()     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            okhttp3.HttpUrl r0 = r0.url()     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            java.lang.String r0 = r0.host()     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            java.util.List r4 = r5.peerCertificates()     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            r1.check((java.lang.String) r0, (java.util.List<java.security.cert.Certificate>) r4)     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            boolean r9 = r9.supportsTlsExtensions()     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            if (r9 == 0) goto L_0x00b1
            okhttp3.internal.platform.Platform r9 = okhttp3.internal.platform.Platform.get()     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            java.lang.String r3 = r9.getSelectedProtocol(r2)     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
        L_0x00b1:
            r8.f2164d = r2     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            okio.Source r9 = okio.Okio.source((java.net.Socket) r2)     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            okio.BufferedSource r9 = okio.Okio.buffer((okio.Source) r9)     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            r8.f2168h = r9     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            java.net.Socket r9 = r8.f2164d     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            okio.Sink r9 = okio.Okio.sink((java.net.Socket) r9)     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            okio.BufferedSink r9 = okio.Okio.buffer((okio.Sink) r9)     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            r8.f2169i = r9     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            r8.f2165e = r5     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            if (r3 == 0) goto L_0x00d2
            okhttp3.Protocol r9 = okhttp3.Protocol.get(r3)     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            goto L_0x00d4
        L_0x00d2:
            okhttp3.Protocol r9 = okhttp3.Protocol.HTTP_1_1     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
        L_0x00d4:
            r8.f2166f = r9     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            okhttp3.internal.platform.Platform r9 = okhttp3.internal.platform.Platform.get()
            r9.afterHandshake(r2)
            okhttp3.Handshake r9 = r8.f2165e
            r12.secureConnectEnd(r11, r9)
            okhttp3.Protocol r9 = r8.f2166f
            okhttp3.Protocol r11 = okhttp3.Protocol.HTTP_2
            if (r9 != r11) goto L_0x00eb
            r8.d(r10)
        L_0x00eb:
            return
        L_0x00ec:
            java.util.List r9 = r5.peerCertificates()     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            r10 = 0
            java.lang.Object r9 = r9.get(r10)     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            java.security.cert.X509Certificate r9 = (java.security.cert.X509Certificate) r9     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            javax.net.ssl.SSLPeerUnverifiedException r10 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            r11.<init>(r1)     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            okhttp3.HttpUrl r12 = r0.url()     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            java.lang.String r12 = r12.host()     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            r11.append(r12)     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            java.lang.String r12 = " not verified:\n    certificate: "
            r11.append(r12)     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            java.lang.String r12 = okhttp3.CertificatePinner.pin(r9)     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            r11.append(r12)     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            java.lang.String r12 = "\n    DN: "
            r11.append(r12)     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            java.security.Principal r12 = r9.getSubjectDN()     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            java.lang.String r12 = r12.getName()     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            r11.append(r12)     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            java.lang.String r12 = "\n    subjectAltNames: "
            r11.append(r12)     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            java.util.List r9 = okhttp3.internal.tls.OkHostnameVerifier.allSubjectAltNames(r9)     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            r11.append(r9)     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            java.lang.String r9 = r11.toString()     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            r10.<init>(r9)     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
            throw r10     // Catch:{ AssertionError -> 0x013b, all -> 0x0139 }
        L_0x0139:
            r9 = move-exception
            goto L_0x014f
        L_0x013b:
            r9 = move-exception
            r3 = r2
            goto L_0x0141
        L_0x013e:
            r9 = move-exception
            goto L_0x014e
        L_0x0140:
            r9 = move-exception
        L_0x0141:
            boolean r10 = okhttp3.internal.Util.isAndroidGetsocknameError(r9)     // Catch:{ all -> 0x013e }
            if (r10 == 0) goto L_0x014d
            java.io.IOException r10 = new java.io.IOException     // Catch:{ all -> 0x013e }
            r10.<init>(r9)     // Catch:{ all -> 0x013e }
            throw r10     // Catch:{ all -> 0x013e }
        L_0x014d:
            throw r9     // Catch:{ all -> 0x013e }
        L_0x014e:
            r2 = r3
        L_0x014f:
            if (r2 == 0) goto L_0x0158
            okhttp3.internal.platform.Platform r10 = okhttp3.internal.platform.Platform.get()
            r10.afterHandshake(r2)
        L_0x0158:
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.c(okhttp3.internal.connection.ConnectionSpecSelector, int, okhttp3.Call, okhttp3.EventListener):void");
    }

    public void cancel() {
        Util.closeQuietly(this.f2163c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x008d A[Catch:{ IOException -> 0x00f6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0132  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void connect(int r17, int r18, int r19, int r20, boolean r21, okhttp3.Call r22, okhttp3.EventListener r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            okhttp3.Protocol r0 = r7.f2166f
            if (r0 != 0) goto L_0x014d
            okhttp3.Route r0 = r7.f2162b
            okhttp3.Address r0 = r0.address()
            java.util.List r0 = r0.connectionSpecs()
            okhttp3.internal.connection.ConnectionSpecSelector r10 = new okhttp3.internal.connection.ConnectionSpecSelector
            r10.<init>(r0)
            okhttp3.Route r1 = r7.f2162b
            okhttp3.Address r1 = r1.address()
            javax.net.ssl.SSLSocketFactory r1 = r1.sslSocketFactory()
            if (r1 != 0) goto L_0x0071
            okhttp3.ConnectionSpec r1 = okhttp3.ConnectionSpec.CLEARTEXT
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0064
            okhttp3.Route r0 = r7.f2162b
            okhttp3.Address r0 = r0.address()
            okhttp3.HttpUrl r0 = r0.url()
            java.lang.String r0 = r0.host()
            okhttp3.internal.platform.Platform r1 = okhttp3.internal.platform.Platform.get()
            boolean r1 = r1.isCleartextTrafficPermitted(r0)
            if (r1 == 0) goto L_0x0046
            goto L_0x0083
        L_0x0046:
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0064:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0071:
            okhttp3.Route r0 = r7.f2162b
            okhttp3.Address r0 = r0.address()
            java.util.List r0 = r0.protocols()
            okhttp3.Protocol r1 = okhttp3.Protocol.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0140
        L_0x0083:
            r11 = 0
            r12 = r11
        L_0x0085:
            okhttp3.Route r0 = r7.f2162b     // Catch:{ IOException -> 0x00f6 }
            boolean r0 = r0.requiresTunnel()     // Catch:{ IOException -> 0x00f6 }
            if (r0 == 0) goto L_0x00a6
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.b(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00f6 }
            java.net.Socket r0 = r7.f2163c     // Catch:{ IOException -> 0x00f6 }
            if (r0 != 0) goto L_0x00a1
            goto L_0x00c3
        L_0x00a1:
            r13 = r17
            r14 = r18
            goto L_0x00ad
        L_0x00a6:
            r13 = r17
            r14 = r18
            r7.a(r13, r14, r8, r9)     // Catch:{ IOException -> 0x00f4 }
        L_0x00ad:
            r15 = r20
            r7.c(r10, r15, r8, r9)     // Catch:{ IOException -> 0x00f2 }
            okhttp3.Route r0 = r7.f2162b     // Catch:{ IOException -> 0x00f2 }
            java.net.InetSocketAddress r0 = r0.socketAddress()     // Catch:{ IOException -> 0x00f2 }
            okhttp3.Route r1 = r7.f2162b     // Catch:{ IOException -> 0x00f2 }
            java.net.Proxy r1 = r1.proxy()     // Catch:{ IOException -> 0x00f2 }
            okhttp3.Protocol r2 = r7.f2166f     // Catch:{ IOException -> 0x00f2 }
            r9.connectEnd(r8, r0, r1, r2)     // Catch:{ IOException -> 0x00f2 }
        L_0x00c3:
            okhttp3.Route r0 = r7.f2162b
            boolean r0 = r0.requiresTunnel()
            if (r0 == 0) goto L_0x00dd
            java.net.Socket r0 = r7.f2163c
            if (r0 == 0) goto L_0x00d0
            goto L_0x00dd
        L_0x00d0:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Too many tunnel connections attempted: 21"
            r0.<init>(r1)
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            r1.<init>(r0)
            throw r1
        L_0x00dd:
            okhttp3.internal.http2.Http2Connection r0 = r7.f2167g
            if (r0 == 0) goto L_0x00f1
            okhttp3.ConnectionPool r1 = r7.f2161a
            monitor-enter(r1)
            okhttp3.internal.http2.Http2Connection r0 = r7.f2167g     // Catch:{ all -> 0x00ee }
            int r0 = r0.maxConcurrentStreams()     // Catch:{ all -> 0x00ee }
            r7.allocationLimit = r0     // Catch:{ all -> 0x00ee }
            monitor-exit(r1)     // Catch:{ all -> 0x00ee }
            goto L_0x00f1
        L_0x00ee:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00ee }
            throw r0
        L_0x00f1:
            return
        L_0x00f2:
            r0 = move-exception
            goto L_0x00fd
        L_0x00f4:
            r0 = move-exception
            goto L_0x00fb
        L_0x00f6:
            r0 = move-exception
            r13 = r17
            r14 = r18
        L_0x00fb:
            r15 = r20
        L_0x00fd:
            java.net.Socket r1 = r7.f2164d
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r1)
            java.net.Socket r1 = r7.f2163c
            okhttp3.internal.Util.closeQuietly((java.net.Socket) r1)
            r7.f2164d = r11
            r7.f2163c = r11
            r7.f2168h = r11
            r7.f2169i = r11
            r7.f2165e = r11
            r7.f2166f = r11
            r7.f2167g = r11
            okhttp3.Route r1 = r7.f2162b
            java.net.InetSocketAddress r3 = r1.socketAddress()
            okhttp3.Route r1 = r7.f2162b
            java.net.Proxy r4 = r1.proxy()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.connectFailed(r2, r3, r4, r5, r6)
            if (r12 != 0) goto L_0x0132
            okhttp3.internal.connection.RouteException r12 = new okhttp3.internal.connection.RouteException
            r12.<init>(r0)
            goto L_0x0135
        L_0x0132:
            r12.addConnectException(r0)
        L_0x0135:
            if (r21 == 0) goto L_0x013f
            boolean r0 = r10.connectionFailed(r0)
            if (r0 == 0) goto L_0x013f
            goto L_0x0085
        L_0x013f:
            throw r12
        L_0x0140:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x014d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.RealConnection.connect(int, int, int, int, boolean, okhttp3.Call, okhttp3.EventListener):void");
    }

    public final void d(int i2) {
        this.f2164d.setSoTimeout(0);
        Http2Connection build = new Http2Connection.Builder(true).socket(this.f2164d, this.f2162b.address().url().host(), this.f2168h, this.f2169i).listener(this).pingIntervalMillis(i2).build();
        this.f2167g = build;
        build.start();
    }

    public Handshake handshake() {
        return this.f2165e;
    }

    public boolean isEligible(Address address, @Nullable Route route) {
        if (this.allocations.size() < this.allocationLimit && !this.noNewStreams) {
            Internal internal = Internal.instance;
            Route route2 = this.f2162b;
            if (!internal.equalsNonHost(route2.address(), address)) {
                return false;
            }
            if (address.url().host().equals(route().address().url().host())) {
                return true;
            }
            if (this.f2167g == null || route == null || route.proxy().type() != Proxy.Type.DIRECT || route2.proxy().type() != Proxy.Type.DIRECT || !route2.socketAddress().equals(route.socketAddress()) || route.address().hostnameVerifier() != OkHostnameVerifier.INSTANCE || !supportsUrl(address.url())) {
                return false;
            }
            try {
                address.certificatePinner().check(address.url().host(), handshake().peerCertificates());
                return true;
            } catch (SSLPeerUnverifiedException unused) {
            }
        }
        return false;
    }

    public boolean isHealthy(boolean z2) {
        int soTimeout;
        if (this.f2164d.isClosed() || this.f2164d.isInputShutdown() || this.f2164d.isOutputShutdown()) {
            return false;
        }
        Http2Connection http2Connection = this.f2167g;
        if (http2Connection != null) {
            return !http2Connection.isShutdown();
        }
        if (z2) {
            try {
                soTimeout = this.f2164d.getSoTimeout();
                this.f2164d.setSoTimeout(1);
                if (this.f2168h.exhausted()) {
                    this.f2164d.setSoTimeout(soTimeout);
                    return false;
                }
                this.f2164d.setSoTimeout(soTimeout);
                return true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            } catch (Throwable th) {
                this.f2164d.setSoTimeout(soTimeout);
                throw th;
            }
        }
        return true;
    }

    public boolean isMultiplexed() {
        return this.f2167g != null;
    }

    public HttpCodec newCodec(OkHttpClient okHttpClient, Interceptor.Chain chain, StreamAllocation streamAllocation) {
        if (this.f2167g != null) {
            return new Http2Codec(okHttpClient, chain, streamAllocation, this.f2167g);
        }
        this.f2164d.setSoTimeout(chain.readTimeoutMillis());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f2168h.timeout().timeout((long) chain.readTimeoutMillis(), timeUnit);
        this.f2169i.timeout().timeout((long) chain.writeTimeoutMillis(), timeUnit);
        return new Http1Codec(okHttpClient, streamAllocation, this.f2168h, this.f2169i);
    }

    public RealWebSocket.Streams newWebSocketStreams(StreamAllocation streamAllocation) {
        return new a(this.f2168h, this.f2169i, streamAllocation);
    }

    public void onSettings(Http2Connection http2Connection) {
        synchronized (this.f2161a) {
            this.allocationLimit = http2Connection.maxConcurrentStreams();
        }
    }

    public void onStream(Http2Stream http2Stream) {
        http2Stream.close(ErrorCode.REFUSED_STREAM);
    }

    public Protocol protocol() {
        return this.f2166f;
    }

    public Route route() {
        return this.f2162b;
    }

    public Socket socket() {
        return this.f2164d;
    }

    public boolean supportsUrl(HttpUrl httpUrl) {
        int port = httpUrl.port();
        Route route = this.f2162b;
        if (port != route.address().url().port()) {
            return false;
        }
        if (!httpUrl.host().equals(route.address().url().host())) {
            return this.f2165e != null && OkHostnameVerifier.INSTANCE.verify(httpUrl.host(), (X509Certificate) this.f2165e.peerCertificates().get(0));
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        Route route = this.f2162b;
        sb.append(route.address().url().host());
        sb.append(":");
        sb.append(route.address().url().port());
        sb.append(", proxy=");
        sb.append(route.proxy());
        sb.append(" hostAddress=");
        sb.append(route.socketAddress());
        sb.append(" cipherSuite=");
        Handshake handshake = this.f2165e;
        sb.append(handshake != null ? handshake.cipherSuite() : "none");
        sb.append(" protocol=");
        sb.append(this.f2166f);
        sb.append('}');
        return sb.toString();
    }
}

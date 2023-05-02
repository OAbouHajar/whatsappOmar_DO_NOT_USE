package okhttp3.internal.http;

import a.a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http2.ConnectionShutdownException;

/* compiled from: XFMFile */
public final class RetryAndFollowUpInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public final OkHttpClient f2215a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2216b;

    /* renamed from: c  reason: collision with root package name */
    public volatile StreamAllocation f2217c;

    /* renamed from: d  reason: collision with root package name */
    public Object f2218d;

    /* renamed from: e  reason: collision with root package name */
    public volatile boolean f2219e;

    public RetryAndFollowUpInterceptor(OkHttpClient okHttpClient, boolean z2) {
        this.f2215a = okHttpClient;
        this.f2216b = z2;
    }

    public static int d(Response response, int i2) {
        String header = response.header("Retry-After");
        if (header == null) {
            return i2;
        }
        if (header.matches("\\d+")) {
            return Integer.valueOf(header).intValue();
        }
        return Integer.MAX_VALUE;
    }

    public static boolean e(Response response, HttpUrl httpUrl) {
        HttpUrl url = response.request().url();
        return url.host().equals(httpUrl.host()) && url.port() == httpUrl.port() && url.scheme().equals(httpUrl.scheme());
    }

    public final Address a(HttpUrl httpUrl) {
        CertificatePinner certificatePinner;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        boolean isHttps = httpUrl.isHttps();
        OkHttpClient okHttpClient = this.f2215a;
        if (isHttps) {
            sSLSocketFactory = okHttpClient.sslSocketFactory();
            hostnameVerifier = okHttpClient.hostnameVerifier();
            certificatePinner = okHttpClient.certificatePinner();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new Address(httpUrl.host(), httpUrl.port(), okHttpClient.dns(), okHttpClient.socketFactory(), sSLSocketFactory, hostnameVerifier, certificatePinner, okHttpClient.proxyAuthenticator(), okHttpClient.proxy(), okHttpClient.protocols(), okHttpClient.connectionSpecs(), okHttpClient.proxySelector());
    }

    public final Request b(Route route, Response response) {
        String header;
        HttpUrl resolve;
        if (response != null) {
            int code = response.code();
            String method = response.request().method();
            OkHttpClient okHttpClient = this.f2215a;
            RequestBody requestBody = null;
            if (code == 307 || code == 308) {
                if (!method.equals("GET") && !method.equals("HEAD")) {
                    return null;
                }
            } else if (code == 401) {
                return okHttpClient.authenticator().authenticate(route, response);
            } else {
                if (code != 503) {
                    if (code == 407) {
                        if ((route != null ? route.proxy() : okHttpClient.proxy()).type() == Proxy.Type.HTTP) {
                            return okHttpClient.proxyAuthenticator().authenticate(route, response);
                        }
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    } else if (code != 408) {
                        switch (code) {
                            case 300:
                            case 301:
                            case 302:
                            case 303:
                                break;
                            default:
                                return null;
                        }
                    } else if (!okHttpClient.retryOnConnectionFailure() || (response.request().body() instanceof UnrepeatableRequestBody)) {
                        return null;
                    } else {
                        if ((response.priorResponse() == null || response.priorResponse().code() != 408) && d(response, 0) <= 0) {
                            return response.request();
                        }
                        return null;
                    }
                } else if ((response.priorResponse() == null || response.priorResponse().code() != 503) && d(response, Integer.MAX_VALUE) == 0) {
                    return response.request();
                } else {
                    return null;
                }
            }
            if (!okHttpClient.followRedirects() || (header = response.header("Location")) == null || (resolve = response.request().url().resolve(header)) == null) {
                return null;
            }
            if (!resolve.scheme().equals(response.request().url().scheme()) && !okHttpClient.followSslRedirects()) {
                return null;
            }
            Request.Builder newBuilder = response.request().newBuilder();
            if (HttpMethod.permitsRequestBody(method)) {
                boolean redirectsWithBody = HttpMethod.redirectsWithBody(method);
                if (HttpMethod.redirectsToGet(method)) {
                    newBuilder.method("GET", (RequestBody) null);
                } else {
                    if (redirectsWithBody) {
                        requestBody = response.request().body();
                    }
                    newBuilder.method(method, requestBody);
                }
                if (!redirectsWithBody) {
                    newBuilder.removeHeader("Transfer-Encoding");
                    newBuilder.removeHeader("Content-Length");
                    newBuilder.removeHeader("Content-Type");
                }
            }
            if (!e(response, resolve)) {
                newBuilder.removeHeader("Authorization");
            }
            return newBuilder.url(resolve).build();
        }
        throw new IllegalStateException();
    }

    public final boolean c(IOException iOException, StreamAllocation streamAllocation, boolean z2, Request request) {
        streamAllocation.streamFailed(iOException);
        if (!this.f2215a.retryOnConnectionFailure()) {
            return false;
        }
        if (z2 && (request.body() instanceof UnrepeatableRequestBody)) {
            return false;
        }
        return (!(iOException instanceof ProtocolException) && (!(iOException instanceof InterruptedIOException) ? (!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException) : (iOException instanceof SocketTimeoutException) && !z2)) && streamAllocation.hasMoreRoutes();
    }

    public void cancel() {
        this.f2219e = true;
        StreamAllocation streamAllocation = this.f2217c;
        if (streamAllocation != null) {
            streamAllocation.cancel();
        }
    }

    public Response intercept(Interceptor.Chain chain) {
        Request request = chain.request();
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Call call = realInterceptorChain.call();
        EventListener eventListener = realInterceptorChain.eventListener();
        StreamAllocation streamAllocation = new StreamAllocation(this.f2215a.connectionPool(), a(request.url()), call, eventListener, this.f2218d);
        this.f2217c = streamAllocation;
        int i2 = 0;
        Response response = null;
        while (!this.f2219e) {
            try {
                Response proceed = realInterceptorChain.proceed(request, streamAllocation, (HttpCodec) null, (RealConnection) null);
                if (response != null) {
                    proceed = proceed.newBuilder().priorResponse(response.newBuilder().body((ResponseBody) null).build()).build();
                }
                try {
                    Request b2 = b(streamAllocation.route(), proceed);
                    if (b2 == null) {
                        if (!this.f2216b) {
                            streamAllocation.release();
                        }
                        return proceed;
                    }
                    Util.closeQuietly((Closeable) proceed.body());
                    int i3 = i2 + 1;
                    if (i3 > 20) {
                        streamAllocation.release();
                        throw new ProtocolException(a.d("Too many follow-up requests: ", i3));
                    } else if (!(b2.body() instanceof UnrepeatableRequestBody)) {
                        if (!e(proceed, b2.url())) {
                            streamAllocation.release();
                            streamAllocation = new StreamAllocation(this.f2215a.connectionPool(), a(b2.url()), call, eventListener, this.f2218d);
                            this.f2217c = streamAllocation;
                        } else if (streamAllocation.codec() != null) {
                            throw new IllegalStateException("Closing the body of " + proceed + " didn't close its backing stream. Bad interceptor?");
                        }
                        response = proceed;
                        request = b2;
                        i2 = i3;
                    } else {
                        streamAllocation.release();
                        throw new HttpRetryException("Cannot retry streamed HTTP body", proceed.code());
                    }
                } catch (IOException e2) {
                    streamAllocation.release();
                    throw e2;
                }
            } catch (RouteException e3) {
                if (!c(e3.getLastConnectException(), streamAllocation, false, request)) {
                    throw e3.getFirstConnectException();
                }
            } catch (IOException e4) {
                if (!c(e4, streamAllocation, !(e4 instanceof ConnectionShutdownException), request)) {
                    throw e4;
                }
            } catch (Throwable th) {
                streamAllocation.streamFailed((IOException) null);
                streamAllocation.release();
                throw th;
            }
        }
        streamAllocation.release();
        throw new IOException("Canceled");
    }

    public boolean isCanceled() {
        return this.f2219e;
    }

    public void setCallStackTrace(Object obj) {
        this.f2218d = obj;
    }

    public StreamAllocation streamAllocation() {
        return this.f2217c;
    }
}

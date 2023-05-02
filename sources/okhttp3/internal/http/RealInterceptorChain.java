package okhttp3.internal.http;

import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;

/* compiled from: XFMFile */
public final class RealInterceptorChain implements Interceptor.Chain {

    /* renamed from: a  reason: collision with root package name */
    public final List f2200a;

    /* renamed from: b  reason: collision with root package name */
    public final StreamAllocation f2201b;

    /* renamed from: c  reason: collision with root package name */
    public final HttpCodec f2202c;

    /* renamed from: d  reason: collision with root package name */
    public final RealConnection f2203d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2204e;

    /* renamed from: f  reason: collision with root package name */
    public final Request f2205f;

    /* renamed from: g  reason: collision with root package name */
    public final Call f2206g;

    /* renamed from: h  reason: collision with root package name */
    public final EventListener f2207h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2208i;

    /* renamed from: j  reason: collision with root package name */
    public final int f2209j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2210k;

    /* renamed from: l  reason: collision with root package name */
    public int f2211l;

    public RealInterceptorChain(List<Interceptor> list, StreamAllocation streamAllocation, HttpCodec httpCodec, RealConnection realConnection, int i2, Request request, Call call, EventListener eventListener, int i3, int i4, int i5) {
        this.f2200a = list;
        this.f2203d = realConnection;
        this.f2201b = streamAllocation;
        this.f2202c = httpCodec;
        this.f2204e = i2;
        this.f2205f = request;
        this.f2206g = call;
        this.f2207h = eventListener;
        this.f2208i = i3;
        this.f2209j = i4;
        this.f2210k = i5;
    }

    public Call call() {
        return this.f2206g;
    }

    public int connectTimeoutMillis() {
        return this.f2208i;
    }

    public Connection connection() {
        return this.f2203d;
    }

    public EventListener eventListener() {
        return this.f2207h;
    }

    public HttpCodec httpStream() {
        return this.f2202c;
    }

    public Response proceed(Request request) {
        return proceed(request, this.f2201b, this.f2202c, this.f2203d);
    }

    public Response proceed(Request request, StreamAllocation streamAllocation, HttpCodec httpCodec, RealConnection realConnection) {
        List list = this.f2200a;
        int size = list.size();
        int i2 = this.f2204e;
        if (i2 < size) {
            this.f2211l++;
            HttpCodec httpCodec2 = this.f2202c;
            if (httpCodec2 != null && !this.f2203d.supportsUrl(request.url())) {
                throw new IllegalStateException("network interceptor " + list.get(i2 - 1) + " must retain the same host and port");
            } else if (httpCodec2 == null || this.f2211l <= 1) {
                Call call = this.f2206g;
                EventListener eventListener = this.f2207h;
                int i3 = this.f2208i;
                int i4 = this.f2209j;
                RealInterceptorChain realInterceptorChain = new RealInterceptorChain(this.f2200a, streamAllocation, httpCodec, realConnection, i2 + 1, request, call, eventListener, i3, i4, this.f2210k);
                Interceptor interceptor = (Interceptor) list.get(i2);
                Response intercept = interceptor.intercept(realInterceptorChain);
                if (httpCodec != null && i2 + 1 < list.size() && realInterceptorChain.f2211l != 1) {
                    throw new IllegalStateException("network interceptor " + interceptor + " must call proceed() exactly once");
                } else if (intercept == null) {
                    throw new NullPointerException("interceptor " + interceptor + " returned null");
                } else if (intercept.body() != null) {
                    return intercept;
                } else {
                    throw new IllegalStateException("interceptor " + interceptor + " returned a response with no body");
                }
            } else {
                throw new IllegalStateException("network interceptor " + list.get(i2 - 1) + " must call proceed() exactly once");
            }
        } else {
            throw new AssertionError();
        }
    }

    public int readTimeoutMillis() {
        return this.f2209j;
    }

    public Request request() {
        return this.f2205f;
    }

    public StreamAllocation streamAllocation() {
        return this.f2201b;
    }

    public Interceptor.Chain withConnectTimeout(int i2, TimeUnit timeUnit) {
        return new RealInterceptorChain(this.f2200a, this.f2201b, this.f2202c, this.f2203d, this.f2204e, this.f2205f, this.f2206g, this.f2207h, Util.checkDuration("timeout", (long) i2, timeUnit), this.f2209j, this.f2210k);
    }

    public Interceptor.Chain withReadTimeout(int i2, TimeUnit timeUnit) {
        return new RealInterceptorChain(this.f2200a, this.f2201b, this.f2202c, this.f2203d, this.f2204e, this.f2205f, this.f2206g, this.f2207h, this.f2208i, Util.checkDuration("timeout", (long) i2, timeUnit), this.f2210k);
    }

    public Interceptor.Chain withWriteTimeout(int i2, TimeUnit timeUnit) {
        return new RealInterceptorChain(this.f2200a, this.f2201b, this.f2202c, this.f2203d, this.f2204e, this.f2205f, this.f2206g, this.f2207h, this.f2208i, this.f2209j, Util.checkDuration("timeout", (long) i2, timeUnit));
    }

    public int writeTimeoutMillis() {
        return this.f2210k;
    }
}

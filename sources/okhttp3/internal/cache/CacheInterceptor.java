package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealResponseBody;
import okio.Okio;
import okio.Sink;
import okio.Source;
import s.a;

/* compiled from: XFMFile */
public final class CacheInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public final InternalCache f2114a;

    public CacheInterceptor(InternalCache internalCache) {
        this.f2114a = internalCache;
    }

    public static boolean a(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    public static boolean b(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    public static Response c(Response response) {
        return (response == null || response.body() == null) ? response : response.newBuilder().body((ResponseBody) null).build();
    }

    public Response intercept(Interceptor.Chain chain) {
        Response.Builder builder;
        Sink body;
        InternalCache internalCache = this.f2114a;
        Response response = internalCache != null ? internalCache.get(chain.request()) : null;
        CacheStrategy cacheStrategy = new CacheStrategy.Factory(System.currentTimeMillis(), chain.request(), response).get();
        Request request = cacheStrategy.networkRequest;
        Response response2 = cacheStrategy.cacheResponse;
        if (internalCache != null) {
            internalCache.trackResponse(cacheStrategy);
        }
        if (response != null && response2 == null) {
            Util.closeQuietly((Closeable) response.body());
        }
        if (request == null && response2 == null) {
            builder = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1).receivedResponseAtMillis(System.currentTimeMillis());
        } else if (request == null) {
            builder = response2.newBuilder().cacheResponse(c(response2));
        } else {
            try {
                Response proceed = chain.proceed(request);
                if (proceed == null && response != null) {
                }
                if (response2 != null) {
                    if (proceed.code() == 304) {
                        Response.Builder newBuilder = response2.newBuilder();
                        Headers headers = response2.headers();
                        Headers headers2 = proceed.headers();
                        Headers.Builder builder2 = new Headers.Builder();
                        int size = headers.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            String name = headers.name(i2);
                            String value = headers.value(i2);
                            if ((!"Warning".equalsIgnoreCase(name) || !value.startsWith("1")) && (a(name) || !b(name) || headers2.get(name) == null)) {
                                Internal.instance.addLenient(builder2, name, value);
                            }
                        }
                        int size2 = headers2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            String name2 = headers2.name(i3);
                            if (!a(name2) && b(name2)) {
                                Internal.instance.addLenient(builder2, name2, headers2.value(i3));
                            }
                        }
                        Response build = newBuilder.headers(builder2.build()).sentRequestAtMillis(proceed.sentRequestAtMillis()).receivedResponseAtMillis(proceed.receivedResponseAtMillis()).cacheResponse(c(response2)).networkResponse(c(proceed)).build();
                        proceed.body().close();
                        internalCache.trackConditionalCacheHit();
                        internalCache.update(response2, build);
                        return build;
                    }
                    Util.closeQuietly((Closeable) response2.body());
                }
                Response build2 = proceed.newBuilder().cacheResponse(c(response2)).networkResponse(c(proceed)).build();
                if (internalCache != null) {
                    if (HttpHeaders.hasBody(build2) && CacheStrategy.isCacheable(build2, request)) {
                        CacheRequest put = internalCache.put(build2);
                        if (put == null || (body = put.body()) == null) {
                            return build2;
                        }
                        return build2.newBuilder().body(new RealResponseBody(build2.header("Content-Type"), build2.body().contentLength(), Okio.buffer((Source) new a(build2.body().source(), put, Okio.buffer(body))))).build();
                    } else if (HttpMethod.invalidatesCache(request.method())) {
                        try {
                            internalCache.remove(request);
                        } catch (IOException unused) {
                        }
                    }
                }
                return build2;
            } finally {
                if (response != null) {
                    Util.closeQuietly((Closeable) response.body());
                }
            }
        }
        return builder.build();
    }
}

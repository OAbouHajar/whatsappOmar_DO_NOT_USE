package okhttp3.internal.http;

import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.Version;
import okio.GzipSource;
import okio.Okio;
import okio.Source;

/* compiled from: XFMFile */
public final class BridgeInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public final CookieJar f2194a;

    public BridgeInterceptor(CookieJar cookieJar) {
        this.f2194a = cookieJar;
    }

    public Response intercept(Interceptor.Chain chain) {
        boolean z2;
        Request request = chain.request();
        Request.Builder newBuilder = request.newBuilder();
        RequestBody body = request.body();
        if (body != null) {
            MediaType contentType = body.contentType();
            if (contentType != null) {
                newBuilder.header("Content-Type", contentType.toString());
            }
            long contentLength = body.contentLength();
            if (contentLength != -1) {
                newBuilder.header("Content-Length", Long.toString(contentLength));
                newBuilder.removeHeader("Transfer-Encoding");
            } else {
                newBuilder.header("Transfer-Encoding", "chunked");
                newBuilder.removeHeader("Content-Length");
            }
        }
        if (request.header("Host") == null) {
            newBuilder.header("Host", Util.hostHeader(request.url(), false));
        }
        if (request.header("Connection") == null) {
            newBuilder.header("Connection", "Keep-Alive");
        }
        if (request.header("Accept-Encoding") == null && request.header("Range") == null) {
            newBuilder.header("Accept-Encoding", "gzip");
            z2 = true;
        } else {
            z2 = false;
        }
        HttpUrl url = request.url();
        CookieJar cookieJar = this.f2194a;
        List<Cookie> loadForRequest = cookieJar.loadForRequest(url);
        if (!loadForRequest.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = loadForRequest.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 > 0) {
                    sb.append("; ");
                }
                Cookie cookie = loadForRequest.get(i2);
                sb.append(cookie.name());
                sb.append('=');
                sb.append(cookie.value());
            }
            newBuilder.header("Cookie", sb.toString());
        }
        if (request.header("User-Agent") == null) {
            newBuilder.header("User-Agent", Version.userAgent());
        }
        Response proceed = chain.proceed(newBuilder.build());
        HttpHeaders.receiveHeaders(cookieJar, request.url(), proceed.headers());
        Response.Builder request2 = proceed.newBuilder().request(request);
        if (z2 && "gzip".equalsIgnoreCase(proceed.header("Content-Encoding")) && HttpHeaders.hasBody(proceed)) {
            GzipSource gzipSource = new GzipSource(proceed.body().source());
            request2.headers(proceed.headers().newBuilder().removeAll("Content-Encoding").removeAll("Content-Length").build());
            request2.body(new RealResponseBody(proceed.header("Content-Type"), -1, Okio.buffer((Source) gzipSource)));
        }
        return request2.build();
    }
}

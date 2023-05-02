package okhttp3.internal.http;

import java.net.ProtocolException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;
import okio.BufferedSink;
import okio.Okio;
import okio.Sink;
import u.a;

/* compiled from: XFMFile */
public final class CallServerInterceptor implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f2195a;

    public CallServerInterceptor(boolean z2) {
        this.f2195a = z2;
    }

    public Response intercept(Interceptor.Chain chain) {
        Response.Builder builder;
        ResponseBody responseBody;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        HttpCodec httpStream = realInterceptorChain.httpStream();
        StreamAllocation streamAllocation = realInterceptorChain.streamAllocation();
        RealConnection realConnection = (RealConnection) realInterceptorChain.connection();
        Request request = realInterceptorChain.request();
        long currentTimeMillis = System.currentTimeMillis();
        realInterceptorChain.eventListener().requestHeadersStart(realInterceptorChain.call());
        httpStream.writeRequestHeaders(request);
        realInterceptorChain.eventListener().requestHeadersEnd(realInterceptorChain.call(), request);
        Response.Builder builder2 = null;
        if (HttpMethod.permitsRequestBody(request.method()) && request.body() != null) {
            if ("100-continue".equalsIgnoreCase(request.header("Expect"))) {
                httpStream.flushRequest();
                realInterceptorChain.eventListener().responseHeadersStart(realInterceptorChain.call());
                builder2 = httpStream.readResponseHeaders(true);
            }
            if (builder2 == null) {
                realInterceptorChain.eventListener().requestBodyStart(realInterceptorChain.call());
                a aVar = new a(httpStream.createRequestBody(request, request.body().contentLength()));
                BufferedSink buffer = Okio.buffer((Sink) aVar);
                request.body().writeTo(buffer);
                buffer.close();
                realInterceptorChain.eventListener().requestBodyEnd(realInterceptorChain.call(), aVar.f2671b);
            } else if (!realConnection.isMultiplexed()) {
                streamAllocation.noNewStreams();
            }
        }
        httpStream.finishRequest();
        if (builder2 == null) {
            realInterceptorChain.eventListener().responseHeadersStart(realInterceptorChain.call());
            builder2 = httpStream.readResponseHeaders(false);
        }
        Response build = builder2.request(request).handshake(streamAllocation.connection().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        int code = build.code();
        if (code == 100) {
            build = httpStream.readResponseHeaders(false).request(request).handshake(streamAllocation.connection().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            code = build.code();
        }
        realInterceptorChain.eventListener().responseHeadersEnd(realInterceptorChain.call(), build);
        if (!this.f2195a || code != 101) {
            builder = build.newBuilder();
            responseBody = httpStream.openResponseBody(build);
        } else {
            builder = build.newBuilder();
            responseBody = Util.EMPTY_RESPONSE;
        }
        Response build2 = builder.body(responseBody).build();
        if ("close".equalsIgnoreCase(build2.request().header("Connection")) || "close".equalsIgnoreCase(build2.header("Connection"))) {
            streamAllocation.noNewStreams();
        }
        if ((code != 204 && code != 205) || build2.body().contentLength() <= 0) {
            return build2;
        }
        throw new ProtocolException("HTTP " + code + " had non-zero Content-Length: " + build2.body().contentLength());
    }
}

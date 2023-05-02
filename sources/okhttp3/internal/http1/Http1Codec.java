package okhttp3.internal.http1;

import java.io.EOFException;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import org.apache.commons.io.IOUtils;
import v.b;
import v.c;
import v.d;
import v.e;
import v.f;

/* compiled from: XFMFile */
public final class Http1Codec implements HttpCodec {

    /* renamed from: a  reason: collision with root package name */
    public final OkHttpClient f2220a;

    /* renamed from: b  reason: collision with root package name */
    public final StreamAllocation f2221b;

    /* renamed from: c  reason: collision with root package name */
    public final BufferedSource f2222c;

    /* renamed from: d  reason: collision with root package name */
    public final BufferedSink f2223d;

    /* renamed from: e  reason: collision with root package name */
    public int f2224e = 0;

    /* renamed from: f  reason: collision with root package name */
    public long f2225f = 262144;

    public Http1Codec(OkHttpClient okHttpClient, StreamAllocation streamAllocation, BufferedSource bufferedSource, BufferedSink bufferedSink) {
        this.f2220a = okHttpClient;
        this.f2221b = streamAllocation;
        this.f2222c = bufferedSource;
        this.f2223d = bufferedSink;
    }

    public void cancel() {
        RealConnection connection = this.f2221b.connection();
        if (connection != null) {
            connection.cancel();
        }
    }

    public Sink createRequestBody(Request request, long j2) {
        if ("chunked".equalsIgnoreCase(request.header("Transfer-Encoding"))) {
            return newChunkedSink();
        }
        if (j2 != -1) {
            return newFixedLengthSink(j2);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public void finishRequest() {
        this.f2223d.flush();
    }

    public void flushRequest() {
        this.f2223d.flush();
    }

    public boolean isClosed() {
        return this.f2224e == 6;
    }

    public Sink newChunkedSink() {
        if (this.f2224e == 1) {
            this.f2224e = 2;
            return new b(this);
        }
        throw new IllegalStateException("state: " + this.f2224e);
    }

    public Source newChunkedSource(HttpUrl httpUrl) {
        if (this.f2224e == 4) {
            this.f2224e = 5;
            return new c(this, httpUrl);
        }
        throw new IllegalStateException("state: " + this.f2224e);
    }

    public Sink newFixedLengthSink(long j2) {
        if (this.f2224e == 1) {
            this.f2224e = 2;
            return new d(this, j2);
        }
        throw new IllegalStateException("state: " + this.f2224e);
    }

    public Source newFixedLengthSource(long j2) {
        if (this.f2224e == 4) {
            this.f2224e = 5;
            return new e(this, j2);
        }
        throw new IllegalStateException("state: " + this.f2224e);
    }

    public Source newUnknownLengthSource() {
        if (this.f2224e == 4) {
            StreamAllocation streamAllocation = this.f2221b;
            if (streamAllocation != null) {
                this.f2224e = 5;
                streamAllocation.noNewStreams();
                return new f(this);
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        throw new IllegalStateException("state: " + this.f2224e);
    }

    public ResponseBody openResponseBody(Response response) {
        StreamAllocation streamAllocation = this.f2221b;
        streamAllocation.eventListener.responseBodyStart(streamAllocation.call);
        String header = response.header("Content-Type");
        if (!HttpHeaders.hasBody(response)) {
            return new RealResponseBody(header, 0, Okio.buffer(newFixedLengthSource(0)));
        }
        if ("chunked".equalsIgnoreCase(response.header("Transfer-Encoding"))) {
            return new RealResponseBody(header, -1, Okio.buffer(newChunkedSource(response.request().url())));
        }
        long contentLength = HttpHeaders.contentLength(response);
        return contentLength != -1 ? new RealResponseBody(header, contentLength, Okio.buffer(newFixedLengthSource(contentLength))) : new RealResponseBody(header, -1, Okio.buffer(newUnknownLengthSource()));
    }

    public Headers readHeaders() {
        Headers.Builder builder = new Headers.Builder();
        while (true) {
            String readUtf8LineStrict = this.f2222c.readUtf8LineStrict(this.f2225f);
            this.f2225f -= (long) readUtf8LineStrict.length();
            if (readUtf8LineStrict.length() == 0) {
                return builder.build();
            }
            Internal.instance.addLenient(builder, readUtf8LineStrict);
        }
    }

    public Response.Builder readResponseHeaders(boolean z2) {
        int i2 = this.f2224e;
        if (i2 == 1 || i2 == 3) {
            try {
                String readUtf8LineStrict = this.f2222c.readUtf8LineStrict(this.f2225f);
                this.f2225f -= (long) readUtf8LineStrict.length();
                StatusLine parse = StatusLine.parse(readUtf8LineStrict);
                Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(readHeaders());
                if (z2 && parse.code == 100) {
                    return null;
                }
                if (parse.code == 100) {
                    this.f2224e = 3;
                    return headers;
                }
                this.f2224e = 4;
                return headers;
            } catch (EOFException e2) {
                IOException iOException = new IOException("unexpected end of stream on " + this.f2221b);
                iOException.initCause(e2);
                throw iOException;
            }
        } else {
            throw new IllegalStateException("state: " + this.f2224e);
        }
    }

    public void writeRequest(Headers headers, String str) {
        if (this.f2224e == 0) {
            BufferedSink bufferedSink = this.f2223d;
            bufferedSink.writeUtf8(str).writeUtf8(IOUtils.LINE_SEPARATOR_WINDOWS);
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                bufferedSink.writeUtf8(headers.name(i2)).writeUtf8(": ").writeUtf8(headers.value(i2)).writeUtf8(IOUtils.LINE_SEPARATOR_WINDOWS);
            }
            bufferedSink.writeUtf8(IOUtils.LINE_SEPARATOR_WINDOWS);
            this.f2224e = 1;
            return;
        }
        throw new IllegalStateException("state: " + this.f2224e);
    }

    public void writeRequestHeaders(Request request) {
        writeRequest(request.headers(), RequestLine.get(request, this.f2221b.connection().route().proxy().type()));
    }
}

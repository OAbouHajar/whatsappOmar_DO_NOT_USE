package okhttp3.internal.http2;

import com.AssemMods.translator.Language;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okio.ByteString;
import okio.Okio;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import w.d;

/* compiled from: XFMFile */
public final class Http2Codec implements HttpCodec {

    /* renamed from: f  reason: collision with root package name */
    public static final List f2232f;

    /* renamed from: g  reason: collision with root package name */
    public static final List f2233g;

    /* renamed from: a  reason: collision with root package name */
    public final Interceptor.Chain f2234a;

    /* renamed from: b  reason: collision with root package name */
    public final StreamAllocation f2235b;

    /* renamed from: c  reason: collision with root package name */
    public final Http2Connection f2236c;

    /* renamed from: d  reason: collision with root package name */
    public Http2Stream f2237d;

    /* renamed from: e  reason: collision with root package name */
    public final Protocol f2238e;

    static {
        ByteString encodeUtf8 = ByteString.encodeUtf8("connection");
        ByteString encodeUtf82 = ByteString.encodeUtf8("host");
        ByteString encodeUtf83 = ByteString.encodeUtf8("keep-alive");
        ByteString encodeUtf84 = ByteString.encodeUtf8("proxy-connection");
        ByteString encodeUtf85 = ByteString.encodeUtf8("transfer-encoding");
        ByteString encodeUtf86 = ByteString.encodeUtf8(Language.TELUGU);
        ByteString encodeUtf87 = ByteString.encodeUtf8("encoding");
        ByteString encodeUtf88 = ByteString.encodeUtf8("upgrade");
        f2232f = Util.immutableList((T[]) new ByteString[]{encodeUtf8, encodeUtf82, encodeUtf83, encodeUtf84, encodeUtf86, encodeUtf85, encodeUtf87, encodeUtf88, Header.TARGET_METHOD, Header.TARGET_PATH, Header.TARGET_SCHEME, Header.TARGET_AUTHORITY});
        f2233g = Util.immutableList((T[]) new ByteString[]{encodeUtf8, encodeUtf82, encodeUtf83, encodeUtf84, encodeUtf86, encodeUtf85, encodeUtf87, encodeUtf88});
    }

    public Http2Codec(OkHttpClient okHttpClient, Interceptor.Chain chain, StreamAllocation streamAllocation, Http2Connection http2Connection) {
        this.f2234a = chain;
        this.f2235b = streamAllocation;
        this.f2236c = http2Connection;
        List<Protocol> protocols = okHttpClient.protocols();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.f2238e = !protocols.contains(protocol) ? Protocol.HTTP_2 : protocol;
    }

    public static List<Header> http2HeadersList(Request request) {
        Headers headers = request.headers();
        ArrayList arrayList = new ArrayList(headers.size() + 4);
        arrayList.add(new Header(Header.TARGET_METHOD, request.method()));
        arrayList.add(new Header(Header.TARGET_PATH, RequestLine.requestPath(request.url())));
        String header = request.header("Host");
        if (header != null) {
            arrayList.add(new Header(Header.TARGET_AUTHORITY, header));
        }
        arrayList.add(new Header(Header.TARGET_SCHEME, request.url().scheme()));
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            ByteString encodeUtf8 = ByteString.encodeUtf8(headers.name(i2).toLowerCase(Locale.US));
            if (!f2232f.contains(encodeUtf8)) {
                arrayList.add(new Header(encodeUtf8, headers.value(i2)));
            }
        }
        return arrayList;
    }

    public static Response.Builder readHttp2HeadersList(List<Header> list, Protocol protocol) {
        Headers.Builder builder = new Headers.Builder();
        int size = list.size();
        StatusLine statusLine = null;
        for (int i2 = 0; i2 < size; i2++) {
            Header header = list.get(i2);
            if (header != null) {
                ByteString byteString = header.name;
                String utf8 = header.value.utf8();
                if (byteString.equals(Header.RESPONSE_STATUS)) {
                    statusLine = StatusLine.parse("HTTP/1.1 " + utf8);
                } else if (!f2233g.contains(byteString)) {
                    Internal.instance.addLenient(builder, byteString.utf8(), utf8);
                }
            } else if (statusLine != null && statusLine.code == 100) {
                builder = new Headers.Builder();
                statusLine = null;
            }
        }
        if (statusLine != null) {
            return new Response.Builder().protocol(protocol).code(statusLine.code).message(statusLine.message).headers(builder.build());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    public void cancel() {
        Http2Stream http2Stream = this.f2237d;
        if (http2Stream != null) {
            http2Stream.closeLater(ErrorCode.CANCEL);
        }
    }

    public Sink createRequestBody(Request request, long j2) {
        return this.f2237d.getSink();
    }

    public void finishRequest() {
        this.f2237d.getSink().close();
    }

    public void flushRequest() {
        this.f2236c.flush();
    }

    public ResponseBody openResponseBody(Response response) {
        StreamAllocation streamAllocation = this.f2235b;
        streamAllocation.eventListener.responseBodyStart(streamAllocation.call);
        return new RealResponseBody(response.header("Content-Type"), HttpHeaders.contentLength(response), Okio.buffer((Source) new d(this, this.f2237d.getSource())));
    }

    public Response.Builder readResponseHeaders(boolean z2) {
        Response.Builder readHttp2HeadersList = readHttp2HeadersList(this.f2237d.takeResponseHeaders(), this.f2238e);
        if (!z2 || Internal.instance.code(readHttp2HeadersList) != 100) {
            return readHttp2HeadersList;
        }
        return null;
    }

    public void writeRequestHeaders(Request request) {
        if (this.f2237d == null) {
            Http2Stream newStream = this.f2236c.newStream(http2HeadersList(request), request.body() != null);
            this.f2237d = newStream;
            Timeout readTimeout = newStream.readTimeout();
            Interceptor.Chain chain = this.f2234a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            readTimeout.timeout((long) chain.readTimeoutMillis(), timeUnit);
            this.f2237d.writeTimeout().timeout((long) chain.writeTimeoutMillis(), timeUnit);
        }
    }
}

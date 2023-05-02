package okhttp3;

import java.io.Closeable;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.internal.http.HttpHeaders;
import okio.Buffer;
import okio.BufferedSource;

/* compiled from: XFMFile */
public final class Response implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final Request f2070a;

    /* renamed from: b  reason: collision with root package name */
    public final Protocol f2071b;

    /* renamed from: c  reason: collision with root package name */
    public final int f2072c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2073d;

    /* renamed from: e  reason: collision with root package name */
    public final Handshake f2074e;

    /* renamed from: f  reason: collision with root package name */
    public final Headers f2075f;

    /* renamed from: g  reason: collision with root package name */
    public final ResponseBody f2076g;

    /* renamed from: h  reason: collision with root package name */
    public final Response f2077h;

    /* renamed from: i  reason: collision with root package name */
    public final Response f2078i;

    /* renamed from: j  reason: collision with root package name */
    public final Response f2079j;

    /* renamed from: k  reason: collision with root package name */
    public final long f2080k;

    /* renamed from: l  reason: collision with root package name */
    public final long f2081l;

    /* renamed from: m  reason: collision with root package name */
    public volatile CacheControl f2082m;

    /* compiled from: XFMFile */
    public class Builder {

        /* renamed from: a  reason: collision with root package name */
        public Request f2083a;

        /* renamed from: b  reason: collision with root package name */
        public Protocol f2084b;

        /* renamed from: c  reason: collision with root package name */
        public int f2085c;

        /* renamed from: d  reason: collision with root package name */
        public String f2086d;

        /* renamed from: e  reason: collision with root package name */
        public Handshake f2087e;

        /* renamed from: f  reason: collision with root package name */
        public Headers.Builder f2088f;

        /* renamed from: g  reason: collision with root package name */
        public ResponseBody f2089g;

        /* renamed from: h  reason: collision with root package name */
        public Response f2090h;

        /* renamed from: i  reason: collision with root package name */
        public Response f2091i;

        /* renamed from: j  reason: collision with root package name */
        public Response f2092j;

        /* renamed from: k  reason: collision with root package name */
        public long f2093k;

        /* renamed from: l  reason: collision with root package name */
        public long f2094l;

        public Builder() {
            this.f2085c = -1;
            this.f2088f = new Headers.Builder();
        }

        public Builder(Response response) {
            this.f2085c = -1;
            this.f2083a = response.f2070a;
            this.f2084b = response.f2071b;
            this.f2085c = response.f2072c;
            this.f2086d = response.f2073d;
            this.f2087e = response.f2074e;
            this.f2088f = response.f2075f.newBuilder();
            this.f2089g = response.f2076g;
            this.f2090h = response.f2077h;
            this.f2091i = response.f2078i;
            this.f2092j = response.f2079j;
            this.f2093k = response.f2080k;
            this.f2094l = response.f2081l;
        }

        public static void a(String str, Response response) {
            if (response.f2076g != null) {
                throw new IllegalArgumentException(str.concat(".body != null"));
            } else if (response.f2077h != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null"));
            } else if (response.f2078i != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null"));
            } else if (response.f2079j != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null"));
            }
        }

        public Builder addHeader(String str, String str2) {
            this.f2088f.add(str, str2);
            return this;
        }

        public Builder body(@Nullable ResponseBody responseBody) {
            this.f2089g = responseBody;
            return this;
        }

        public Response build() {
            if (this.f2083a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f2084b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f2085c < 0) {
                throw new IllegalStateException("code < 0: " + this.f2085c);
            } else if (this.f2086d != null) {
                return new Response(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }

        public Builder cacheResponse(@Nullable Response response) {
            if (response != null) {
                a("cacheResponse", response);
            }
            this.f2091i = response;
            return this;
        }

        public Builder code(int i2) {
            this.f2085c = i2;
            return this;
        }

        public Builder handshake(@Nullable Handshake handshake) {
            this.f2087e = handshake;
            return this;
        }

        public Builder header(String str, String str2) {
            this.f2088f.set(str, str2);
            return this;
        }

        public Builder headers(Headers headers) {
            this.f2088f = headers.newBuilder();
            return this;
        }

        public Builder message(String str) {
            this.f2086d = str;
            return this;
        }

        public Builder networkResponse(@Nullable Response response) {
            if (response != null) {
                a("networkResponse", response);
            }
            this.f2090h = response;
            return this;
        }

        public Builder priorResponse(@Nullable Response response) {
            if (response == null || response.f2076g == null) {
                this.f2092j = response;
                return this;
            }
            throw new IllegalArgumentException("priorResponse.body != null");
        }

        public Builder protocol(Protocol protocol) {
            this.f2084b = protocol;
            return this;
        }

        public Builder receivedResponseAtMillis(long j2) {
            this.f2094l = j2;
            return this;
        }

        public Builder removeHeader(String str) {
            this.f2088f.removeAll(str);
            return this;
        }

        public Builder request(Request request) {
            this.f2083a = request;
            return this;
        }

        public Builder sentRequestAtMillis(long j2) {
            this.f2093k = j2;
            return this;
        }
    }

    public Response(Builder builder) {
        this.f2070a = builder.f2083a;
        this.f2071b = builder.f2084b;
        this.f2072c = builder.f2085c;
        this.f2073d = builder.f2086d;
        this.f2074e = builder.f2087e;
        this.f2075f = builder.f2088f.build();
        this.f2076g = builder.f2089g;
        this.f2077h = builder.f2090h;
        this.f2078i = builder.f2091i;
        this.f2079j = builder.f2092j;
        this.f2080k = builder.f2093k;
        this.f2081l = builder.f2094l;
    }

    @Nullable
    public ResponseBody body() {
        return this.f2076g;
    }

    public CacheControl cacheControl() {
        CacheControl cacheControl = this.f2082m;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl parse = CacheControl.parse(this.f2075f);
        this.f2082m = parse;
        return parse;
    }

    @Nullable
    public Response cacheResponse() {
        return this.f2078i;
    }

    public List<Challenge> challenges() {
        String str;
        int i2 = this.f2072c;
        if (i2 == 401) {
            str = "WWW-Authenticate";
        } else if (i2 != 407) {
            return Collections.emptyList();
        } else {
            str = "Proxy-Authenticate";
        }
        return HttpHeaders.parseChallenges(headers(), str);
    }

    public void close() {
        ResponseBody responseBody = this.f2076g;
        if (responseBody != null) {
            responseBody.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public int code() {
        return this.f2072c;
    }

    public Handshake handshake() {
        return this.f2074e;
    }

    @Nullable
    public String header(String str) {
        return header(str, (String) null);
    }

    @Nullable
    public String header(String str, @Nullable String str2) {
        String str3 = this.f2075f.get(str);
        return str3 != null ? str3 : str2;
    }

    public List<String> headers(String str) {
        return this.f2075f.values(str);
    }

    public Headers headers() {
        return this.f2075f;
    }

    public boolean isRedirect() {
        int i2 = this.f2072c;
        if (i2 == 307 || i2 == 308) {
            return true;
        }
        switch (i2) {
            case 300:
            case 301:
            case 302:
            case 303:
                return true;
            default:
                return false;
        }
    }

    public boolean isSuccessful() {
        int i2 = this.f2072c;
        return i2 >= 200 && i2 < 300;
    }

    public String message() {
        return this.f2073d;
    }

    @Nullable
    public Response networkResponse() {
        return this.f2077h;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public ResponseBody peekBody(long j2) {
        ResponseBody responseBody = this.f2076g;
        BufferedSource source = responseBody.source();
        source.request(j2);
        Buffer clone = source.buffer().clone();
        if (clone.size() > j2) {
            Buffer buffer = new Buffer();
            buffer.write(clone, j2);
            clone.clear();
            clone = buffer;
        }
        return ResponseBody.create(responseBody.contentType(), clone.size(), clone);
    }

    @Nullable
    public Response priorResponse() {
        return this.f2079j;
    }

    public Protocol protocol() {
        return this.f2071b;
    }

    public long receivedResponseAtMillis() {
        return this.f2081l;
    }

    public Request request() {
        return this.f2070a;
    }

    public long sentRequestAtMillis() {
        return this.f2080k;
    }

    public String toString() {
        return "Response{protocol=" + this.f2071b + ", code=" + this.f2072c + ", message=" + this.f2073d + ", url=" + this.f2070a.url() + '}';
    }
}

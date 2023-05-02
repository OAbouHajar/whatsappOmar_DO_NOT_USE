package okhttp3;

import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;

/* compiled from: XFMFile */
public final class Request {

    /* renamed from: a  reason: collision with root package name */
    public final HttpUrl f2059a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2060b;

    /* renamed from: c  reason: collision with root package name */
    public final Headers f2061c;

    /* renamed from: d  reason: collision with root package name */
    public final RequestBody f2062d;

    /* renamed from: e  reason: collision with root package name */
    public final Map f2063e;

    /* renamed from: f  reason: collision with root package name */
    public volatile CacheControl f2064f;

    /* compiled from: XFMFile */
    public class Builder {

        /* renamed from: a  reason: collision with root package name */
        public HttpUrl f2065a;

        /* renamed from: b  reason: collision with root package name */
        public String f2066b;

        /* renamed from: c  reason: collision with root package name */
        public Headers.Builder f2067c;

        /* renamed from: d  reason: collision with root package name */
        public RequestBody f2068d;

        /* renamed from: e  reason: collision with root package name */
        public Map f2069e;

        public Builder() {
            this.f2069e = Collections.emptyMap();
            this.f2066b = "GET";
            this.f2067c = new Headers.Builder();
        }

        public Builder(Request request) {
            this.f2069e = Collections.emptyMap();
            this.f2065a = request.f2059a;
            this.f2066b = request.f2060b;
            this.f2068d = request.f2062d;
            Map map = request.f2063e;
            this.f2069e = map.isEmpty() ? Collections.emptyMap() : new LinkedHashMap(map);
            this.f2067c = request.f2061c.newBuilder();
        }

        public Builder addHeader(String str, String str2) {
            this.f2067c.add(str, str2);
            return this;
        }

        public Request build() {
            if (this.f2065a != null) {
                return new Request(this);
            }
            throw new IllegalStateException("url == null");
        }

        public Builder cacheControl(CacheControl cacheControl) {
            String cacheControl2 = cacheControl.toString();
            return cacheControl2.isEmpty() ? removeHeader("Cache-Control") : header("Cache-Control", cacheControl2);
        }

        public Builder delete() {
            return delete(Util.EMPTY_REQUEST);
        }

        public Builder delete(@Nullable RequestBody requestBody) {
            return method("DELETE", requestBody);
        }

        public Builder get() {
            return method("GET", (RequestBody) null);
        }

        public Builder head() {
            return method("HEAD", (RequestBody) null);
        }

        public Builder header(String str, String str2) {
            this.f2067c.set(str, str2);
            return this;
        }

        public Builder headers(Headers headers) {
            this.f2067c = headers.newBuilder();
            return this;
        }

        public Builder method(String str, @Nullable RequestBody requestBody) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (requestBody != null && !HttpMethod.permitsRequestBody(str)) {
                throw new IllegalArgumentException("method " + str + " must not have a request body.");
            } else if (requestBody != null || !HttpMethod.requiresRequestBody(str)) {
                this.f2066b = str;
                this.f2068d = requestBody;
                return this;
            } else {
                throw new IllegalArgumentException("method " + str + " must have a request body.");
            }
        }

        public Builder patch(RequestBody requestBody) {
            return method("PATCH", requestBody);
        }

        public Builder post(RequestBody requestBody) {
            return method("POST", requestBody);
        }

        public Builder put(RequestBody requestBody) {
            return method("PUT", requestBody);
        }

        public Builder removeHeader(String str) {
            this.f2067c.removeAll(str);
            return this;
        }

        public <T> Builder tag(Class<? super T> cls, @Nullable T t2) {
            if (cls != null) {
                if (t2 == null) {
                    this.f2069e.remove(cls);
                } else {
                    if (this.f2069e.isEmpty()) {
                        this.f2069e = new LinkedHashMap();
                    }
                    this.f2069e.put(cls, cls.cast(t2));
                }
                return this;
            }
            throw new NullPointerException("type == null");
        }

        public Builder tag(@Nullable Object obj) {
            return tag(Object.class, obj);
        }

        public Builder url(String str) {
            StringBuilder sb;
            int i2;
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    sb = new StringBuilder("http:");
                    i2 = 3;
                } else {
                    if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                        sb = new StringBuilder("https:");
                        i2 = 4;
                    }
                    return url(HttpUrl.get(str));
                }
                sb.append(str.substring(i2));
                str = sb.toString();
                return url(HttpUrl.get(str));
            }
            throw new NullPointerException("url == null");
        }

        public Builder url(URL url) {
            if (url != null) {
                return url(HttpUrl.get(url.toString()));
            }
            throw new NullPointerException("url == null");
        }

        public Builder url(HttpUrl httpUrl) {
            if (httpUrl != null) {
                this.f2065a = httpUrl;
                return this;
            }
            throw new NullPointerException("url == null");
        }
    }

    public Request(Builder builder) {
        this.f2059a = builder.f2065a;
        this.f2060b = builder.f2066b;
        this.f2061c = builder.f2067c.build();
        this.f2062d = builder.f2068d;
        this.f2063e = Util.immutableMap(builder.f2069e);
    }

    @Nullable
    public RequestBody body() {
        return this.f2062d;
    }

    public CacheControl cacheControl() {
        CacheControl cacheControl = this.f2064f;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl parse = CacheControl.parse(this.f2061c);
        this.f2064f = parse;
        return parse;
    }

    @Nullable
    public String header(String str) {
        return this.f2061c.get(str);
    }

    public List<String> headers(String str) {
        return this.f2061c.values(str);
    }

    public Headers headers() {
        return this.f2061c;
    }

    public boolean isHttps() {
        return this.f2059a.isHttps();
    }

    public String method() {
        return this.f2060b;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    @Nullable
    public Object tag() {
        return tag(Object.class);
    }

    @Nullable
    public <T> T tag(Class<? extends T> cls) {
        return cls.cast(this.f2063e.get(cls));
    }

    public String toString() {
        return "Request{method=" + this.f2060b + ", url=" + this.f2059a + ", tags=" + this.f2063e + '}';
    }

    public HttpUrl url() {
        return this.f2059a;
    }
}

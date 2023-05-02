package okhttp3.internal.cache;

import java.util.Date;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.HttpDate;
import okhttp3.internal.http.HttpHeaders;

/* compiled from: XFMFile */
public final class CacheStrategy {
    @Nullable
    public final Response cacheResponse;
    @Nullable
    public final Request networkRequest;

    /* compiled from: XFMFile */
    public class Factory {

        /* renamed from: a  reason: collision with root package name */
        public final long f2115a;

        /* renamed from: b  reason: collision with root package name */
        public final Request f2116b;

        /* renamed from: c  reason: collision with root package name */
        public final Response f2117c;

        /* renamed from: d  reason: collision with root package name */
        public final Date f2118d;

        /* renamed from: e  reason: collision with root package name */
        public final String f2119e;

        /* renamed from: f  reason: collision with root package name */
        public final Date f2120f;

        /* renamed from: g  reason: collision with root package name */
        public final String f2121g;

        /* renamed from: h  reason: collision with root package name */
        public final Date f2122h;

        /* renamed from: i  reason: collision with root package name */
        public final long f2123i;

        /* renamed from: j  reason: collision with root package name */
        public final long f2124j;

        /* renamed from: k  reason: collision with root package name */
        public final String f2125k;

        /* renamed from: l  reason: collision with root package name */
        public final int f2126l = -1;

        public Factory(long j2, Request request, Response response) {
            this.f2115a = j2;
            this.f2116b = request;
            this.f2117c = response;
            if (response != null) {
                this.f2123i = response.sentRequestAtMillis();
                this.f2124j = response.receivedResponseAtMillis();
                Headers headers = response.headers();
                int size = headers.size();
                for (int i2 = 0; i2 < size; i2++) {
                    String name = headers.name(i2);
                    String value = headers.value(i2);
                    if ("Date".equalsIgnoreCase(name)) {
                        this.f2118d = HttpDate.parse(value);
                        this.f2119e = value;
                    } else if ("Expires".equalsIgnoreCase(name)) {
                        this.f2122h = HttpDate.parse(value);
                    } else if ("Last-Modified".equalsIgnoreCase(name)) {
                        this.f2120f = HttpDate.parse(value);
                        this.f2121g = value;
                    } else if ("ETag".equalsIgnoreCase(name)) {
                        this.f2125k = value;
                    } else if ("Age".equalsIgnoreCase(name)) {
                        this.f2126l = HttpHeaders.parseSeconds(value, -1);
                    }
                }
            }
        }

        /* JADX WARNING: type inference failed for: r1v1, types: [okhttp3.Request, okhttp3.Response] */
        /* JADX WARNING: type inference failed for: r1v2 */
        /* JADX WARNING: type inference failed for: r1v14 */
        /* JADX WARNING: type inference failed for: r1v16 */
        /* JADX WARNING: type inference failed for: r1v42 */
        /* JADX WARNING: type inference failed for: r1v43 */
        /* JADX WARNING: Removed duplicated region for block: B:101:0x01e8 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x01e2  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public okhttp3.internal.cache.CacheStrategy get() {
            /*
                r23 = this;
                r0 = r23
                okhttp3.Request r1 = r0.f2116b
                r2 = 0
                okhttp3.Response r3 = r0.f2117c
                if (r3 != 0) goto L_0x0012
                okhttp3.internal.cache.CacheStrategy r3 = new okhttp3.internal.cache.CacheStrategy
                r3.<init>(r2, r1)
            L_0x000e:
                r11 = r1
            L_0x000f:
                r1 = r2
                goto L_0x01d4
            L_0x0012:
                boolean r4 = r1.isHttps()
                if (r4 == 0) goto L_0x0024
                okhttp3.Handshake r4 = r3.handshake()
                if (r4 != 0) goto L_0x0024
                okhttp3.internal.cache.CacheStrategy r3 = new okhttp3.internal.cache.CacheStrategy
                r3.<init>(r2, r1)
                goto L_0x000e
            L_0x0024:
                boolean r4 = okhttp3.internal.cache.CacheStrategy.isCacheable(r3, r1)
                if (r4 != 0) goto L_0x0030
                okhttp3.internal.cache.CacheStrategy r3 = new okhttp3.internal.cache.CacheStrategy
                r3.<init>(r2, r1)
                goto L_0x000e
            L_0x0030:
                okhttp3.CacheControl r4 = r1.cacheControl()
                boolean r5 = r4.noCache()
                if (r5 != 0) goto L_0x01cd
                java.lang.String r5 = "If-Modified-Since"
                java.lang.String r6 = r1.header(r5)
                java.lang.String r9 = "If-None-Match"
                if (r6 != 0) goto L_0x004d
                java.lang.String r6 = r1.header(r9)
                if (r6 == 0) goto L_0x004b
                goto L_0x004d
            L_0x004b:
                r6 = 0
                goto L_0x004e
            L_0x004d:
                r6 = 1
            L_0x004e:
                if (r6 == 0) goto L_0x0052
                goto L_0x01cd
            L_0x0052:
                okhttp3.CacheControl r6 = r3.cacheControl()
                boolean r10 = r6.immutable()
                if (r10 == 0) goto L_0x0066
                okhttp3.internal.cache.CacheStrategy r4 = new okhttp3.internal.cache.CacheStrategy
                r4.<init>(r3, r2)
                r11 = r1
                r1 = r2
                r3 = r4
                goto L_0x01d4
            L_0x0066:
                r10 = 0
                long r12 = r0.f2124j
                java.util.Date r14 = r0.f2118d
                if (r14 == 0) goto L_0x0079
                long r15 = r14.getTime()
                long r7 = r12 - r15
                long r7 = java.lang.Math.max(r10, r7)
                goto L_0x007a
            L_0x0079:
                r7 = r10
            L_0x007a:
                r15 = -1
                int r2 = r0.f2126l
                if (r2 == r15) goto L_0x008c
                java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
                r11 = r1
                long r1 = (long) r2
                long r1 = r10.toMillis(r1)
                long r7 = java.lang.Math.max(r7, r1)
                goto L_0x008d
            L_0x008c:
                r11 = r1
            L_0x008d:
                long r1 = r0.f2123i
                long r19 = r12 - r1
                r21 = r1
                long r1 = r0.f2115a
                long r1 = r1 - r12
                long r7 = r7 + r19
                long r7 = r7 + r1
                okhttp3.CacheControl r1 = r3.cacheControl()
                int r2 = r1.maxAgeSeconds()
                java.util.Date r10 = r0.f2120f
                r19 = r5
                java.util.Date r5 = r0.f2122h
                if (r2 == r15) goto L_0x00b5
                java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
                int r1 = r1.maxAgeSeconds()
                long r12 = (long) r1
                long r1 = r2.toMillis(r12)
                goto L_0x00f8
            L_0x00b5:
                if (r5 == 0) goto L_0x00cc
                if (r14 == 0) goto L_0x00bd
                long r12 = r14.getTime()
            L_0x00bd:
                long r1 = r5.getTime()
                long r1 = r1 - r12
                r12 = 0
                int r20 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
                if (r20 <= 0) goto L_0x00c9
                goto L_0x00f8
            L_0x00c9:
                r1 = 0
                goto L_0x00f8
            L_0x00cc:
                if (r10 == 0) goto L_0x00f5
                okhttp3.Request r1 = r3.request()
                okhttp3.HttpUrl r1 = r1.url()
                java.lang.String r1 = r1.query()
                if (r1 != 0) goto L_0x00f5
                if (r14 == 0) goto L_0x00e3
                long r1 = r14.getTime()
                goto L_0x00e5
            L_0x00e3:
                r1 = r21
            L_0x00e5:
                long r12 = r10.getTime()
                long r1 = r1 - r12
                r12 = 0
                int r17 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
                if (r17 <= 0) goto L_0x00f7
                r17 = 10
                long r1 = r1 / r17
                goto L_0x00f8
            L_0x00f5:
                r12 = 0
            L_0x00f7:
                r1 = r12
            L_0x00f8:
                int r12 = r4.maxAgeSeconds()
                if (r12 == r15) goto L_0x0110
                java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS
                int r13 = r4.maxAgeSeconds()
                r20 = r14
                long r13 = (long) r13
                long r12 = r12.toMillis(r13)
                long r1 = java.lang.Math.min(r1, r12)
                goto L_0x0112
            L_0x0110:
                r20 = r14
            L_0x0112:
                int r12 = r4.minFreshSeconds()
                if (r12 == r15) goto L_0x0124
                java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS
                int r13 = r4.minFreshSeconds()
                long r13 = (long) r13
                long r12 = r12.toMillis(r13)
                goto L_0x0126
            L_0x0124:
                r12 = 0
            L_0x0126:
                boolean r14 = r6.mustRevalidate()
                if (r14 != 0) goto L_0x0144
                int r14 = r4.maxStaleSeconds()
                if (r14 == r15) goto L_0x0144
                java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.SECONDS
                int r4 = r4.maxStaleSeconds()
                r21 = r9
                r22 = r10
                long r9 = (long) r4
                long r9 = r14.toMillis(r9)
                r17 = r9
                goto L_0x014a
            L_0x0144:
                r21 = r9
                r22 = r10
                r17 = 0
            L_0x014a:
                boolean r4 = r6.noCache()
                if (r4 != 0) goto L_0x018f
                long r12 = r12 + r7
                long r17 = r1 + r17
                int r4 = (r12 > r17 ? 1 : (r12 == r17 ? 0 : -1))
                if (r4 >= 0) goto L_0x018f
                okhttp3.Response$Builder r4 = r3.newBuilder()
                java.lang.String r6 = "Warning"
                int r9 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
                if (r9 < 0) goto L_0x0166
                java.lang.String r1 = "110 HttpURLConnection \"Response is stale\""
                r4.addHeader(r6, r1)
            L_0x0166:
                r1 = 86400000(0x5265c00, double:4.2687272E-316)
                int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
                if (r9 <= 0) goto L_0x0183
                okhttp3.CacheControl r1 = r3.cacheControl()
                int r1 = r1.maxAgeSeconds()
                if (r1 != r15) goto L_0x017b
                if (r5 != 0) goto L_0x017b
                r7 = 1
                goto L_0x017c
            L_0x017b:
                r7 = 0
            L_0x017c:
                if (r7 == 0) goto L_0x0183
                java.lang.String r1 = "113 HttpURLConnection \"Heuristic expiration\""
                r4.addHeader(r6, r1)
            L_0x0183:
                okhttp3.internal.cache.CacheStrategy r3 = new okhttp3.internal.cache.CacheStrategy
                okhttp3.Response r1 = r4.build()
                r2 = 0
                r3.<init>(r1, r2)
                goto L_0x000f
            L_0x018f:
                java.lang.String r1 = r0.f2125k
                if (r1 == 0) goto L_0x0196
                r5 = r21
                goto L_0x01a1
            L_0x0196:
                if (r22 == 0) goto L_0x019b
                java.lang.String r1 = r0.f2121g
                goto L_0x019f
            L_0x019b:
                if (r20 == 0) goto L_0x01c6
                java.lang.String r1 = r0.f2119e
            L_0x019f:
                r5 = r19
            L_0x01a1:
                okhttp3.Headers r2 = r11.headers()
                okhttp3.Headers$Builder r2 = r2.newBuilder()
                okhttp3.internal.Internal r4 = okhttp3.internal.Internal.instance
                r4.addLenient(r2, r5, r1)
                okhttp3.Request$Builder r1 = r11.newBuilder()
                okhttp3.Headers r2 = r2.build()
                okhttp3.Request$Builder r1 = r1.headers(r2)
                okhttp3.Request r1 = r1.build()
                okhttp3.internal.cache.CacheStrategy r2 = new okhttp3.internal.cache.CacheStrategy
                r2.<init>(r3, r1)
                r3 = r2
                r1 = 0
                goto L_0x01d4
            L_0x01c6:
                okhttp3.internal.cache.CacheStrategy r3 = new okhttp3.internal.cache.CacheStrategy
                r1 = 0
                r3.<init>(r1, r11)
                goto L_0x01d4
            L_0x01cd:
                r11 = r1
                r1 = r2
                okhttp3.internal.cache.CacheStrategy r3 = new okhttp3.internal.cache.CacheStrategy
                r3.<init>(r1, r11)
            L_0x01d4:
                okhttp3.Request r2 = r3.networkRequest
                if (r2 == 0) goto L_0x01e8
                okhttp3.CacheControl r2 = r11.cacheControl()
                boolean r2 = r2.onlyIfCached()
                if (r2 == 0) goto L_0x01e8
                okhttp3.internal.cache.CacheStrategy r2 = new okhttp3.internal.cache.CacheStrategy
                r2.<init>(r1, r1)
                return r2
            L_0x01e8:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.CacheStrategy.Factory.get():okhttp3.internal.cache.CacheStrategy");
        }
    }

    public CacheStrategy(Response response, Request request) {
        this.networkRequest = request;
        this.cacheResponse = response;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r3.cacheControl().isPrivate() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isCacheable(okhttp3.Response r3, okhttp3.Request r4) {
        /*
            int r0 = r3.code()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L_0x005a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L_0x0031
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L_0x005a
            switch(r0) {
                case 300: goto L_0x005a;
                case 301: goto L_0x005a;
                case 302: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0059
        L_0x0031:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.header(r0)
            if (r0 != 0) goto L_0x005a
            okhttp3.CacheControl r0 = r3.cacheControl()
            int r0 = r0.maxAgeSeconds()
            r1 = -1
            if (r0 != r1) goto L_0x005a
            okhttp3.CacheControl r0 = r3.cacheControl()
            boolean r0 = r0.isPublic()
            if (r0 != 0) goto L_0x005a
            okhttp3.CacheControl r0 = r3.cacheControl()
            boolean r0 = r0.isPrivate()
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            return r2
        L_0x005a:
            okhttp3.CacheControl r3 = r3.cacheControl()
            boolean r3 = r3.noStore()
            if (r3 != 0) goto L_0x006f
            okhttp3.CacheControl r3 = r4.cacheControl()
            boolean r3 = r3.noStore()
            if (r3 != 0) goto L_0x006f
            r2 = 1
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.CacheStrategy.isCacheable(okhttp3.Response, okhttp3.Request):boolean");
    }
}

package okhttp3;

import a.a;
import java.util.concurrent.TimeUnit;

/* compiled from: XFMFile */
public final class CacheControl {
    public static final CacheControl FORCE_CACHE = new Builder().onlyIfCached().maxStale(Integer.MAX_VALUE, TimeUnit.SECONDS).build();
    public static final CacheControl FORCE_NETWORK = new Builder().noCache().build();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f1882a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1883b;

    /* renamed from: c  reason: collision with root package name */
    public final int f1884c;

    /* renamed from: d  reason: collision with root package name */
    public final int f1885d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f1886e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f1887f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1888g;

    /* renamed from: h  reason: collision with root package name */
    public final int f1889h;

    /* renamed from: i  reason: collision with root package name */
    public final int f1890i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f1891j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f1892k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f1893l;

    /* renamed from: m  reason: collision with root package name */
    public String f1894m;

    /* compiled from: XFMFile */
    public final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1895a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1896b;

        /* renamed from: c  reason: collision with root package name */
        public int f1897c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f1898d = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f1899e = -1;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1900f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1901g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1902h;

        public CacheControl build() {
            return new CacheControl(this);
        }

        public Builder immutable() {
            this.f1902h = true;
            return this;
        }

        public Builder maxAge(int i2, TimeUnit timeUnit) {
            if (i2 >= 0) {
                long seconds = timeUnit.toSeconds((long) i2);
                this.f1897c = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException(a.d("maxAge < 0: ", i2));
        }

        public Builder maxStale(int i2, TimeUnit timeUnit) {
            if (i2 >= 0) {
                long seconds = timeUnit.toSeconds((long) i2);
                this.f1898d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException(a.d("maxStale < 0: ", i2));
        }

        public Builder minFresh(int i2, TimeUnit timeUnit) {
            if (i2 >= 0) {
                long seconds = timeUnit.toSeconds((long) i2);
                this.f1899e = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException(a.d("minFresh < 0: ", i2));
        }

        public Builder noCache() {
            this.f1895a = true;
            return this;
        }

        public Builder noStore() {
            this.f1896b = true;
            return this;
        }

        public Builder noTransform() {
            this.f1901g = true;
            return this;
        }

        public Builder onlyIfCached() {
            this.f1900f = true;
            return this;
        }
    }

    public CacheControl(Builder builder) {
        this.f1882a = builder.f1895a;
        this.f1883b = builder.f1896b;
        this.f1884c = builder.f1897c;
        this.f1885d = -1;
        this.f1886e = false;
        this.f1887f = false;
        this.f1888g = false;
        this.f1889h = builder.f1898d;
        this.f1890i = builder.f1899e;
        this.f1891j = builder.f1900f;
        this.f1892k = builder.f1901g;
        this.f1893l = builder.f1902h;
    }

    public CacheControl(boolean z2, boolean z3, int i2, int i3, boolean z4, boolean z5, boolean z6, int i4, int i5, boolean z7, boolean z8, boolean z9, String str) {
        this.f1882a = z2;
        this.f1883b = z3;
        this.f1884c = i2;
        this.f1885d = i3;
        this.f1886e = z4;
        this.f1887f = z5;
        this.f1888g = z6;
        this.f1889h = i4;
        this.f1890i = i5;
        this.f1891j = z7;
        this.f1892k = z8;
        this.f1893l = z9;
        this.f1894m = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static okhttp3.CacheControl parse(okhttp3.Headers r22) {
        /*
            r0 = r22
            int r1 = r22.size()
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
            r20 = 0
        L_0x001a:
            if (r6 >= r1) goto L_0x013f
            java.lang.String r2 = r0.name(r6)
            java.lang.String r5 = r0.value(r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0031
            if (r8 == 0) goto L_0x002f
            goto L_0x0039
        L_0x002f:
            r8 = r5
            goto L_0x003a
        L_0x0031:
            java.lang.String r3 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x0138
        L_0x0039:
            r7 = 0
        L_0x003a:
            r2 = 0
        L_0x003b:
            int r3 = r5.length()
            if (r2 >= r3) goto L_0x0138
            java.lang.String r3 = "=,;"
            int r3 = okhttp3.internal.http.HttpHeaders.skipUntil(r5, r2, r3)
            java.lang.String r2 = r5.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            int r4 = r5.length()
            if (r3 == r4) goto L_0x0099
            char r4 = r5.charAt(r3)
            r0 = 44
            if (r4 == r0) goto L_0x0099
            char r0 = r5.charAt(r3)
            r4 = 59
            if (r0 != r4) goto L_0x0066
            goto L_0x0099
        L_0x0066:
            int r3 = r3 + 1
            int r0 = okhttp3.internal.http.HttpHeaders.skipWhitespace(r5, r3)
            int r3 = r5.length()
            if (r0 >= r3) goto L_0x0089
            char r3 = r5.charAt(r0)
            r4 = 34
            if (r3 != r4) goto L_0x0089
            int r0 = r0 + 1
            java.lang.String r3 = "\""
            int r3 = okhttp3.internal.http.HttpHeaders.skipUntil(r5, r0, r3)
            java.lang.String r0 = r5.substring(r0, r3)
            r4 = 1
            int r3 = r3 + r4
            goto L_0x009d
        L_0x0089:
            r4 = 1
            java.lang.String r3 = ",;"
            int r3 = okhttp3.internal.http.HttpHeaders.skipUntil(r5, r0, r3)
            java.lang.String r0 = r5.substring(r0, r3)
            java.lang.String r0 = r0.trim()
            goto L_0x009d
        L_0x0099:
            r4 = 1
            int r3 = r3 + 1
            r0 = 0
        L_0x009d:
            java.lang.String r4 = "no-cache"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00a9
            r4 = -1
            r9 = 1
            goto L_0x0133
        L_0x00a9:
            java.lang.String r4 = "no-store"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00b5
            r4 = -1
            r10 = 1
            goto L_0x0133
        L_0x00b5:
            java.lang.String r4 = "max-age"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00c4
            r4 = -1
            int r11 = okhttp3.internal.http.HttpHeaders.parseSeconds(r0, r4)
            goto L_0x0133
        L_0x00c4:
            java.lang.String r4 = "s-maxage"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00d2
            r4 = -1
            int r12 = okhttp3.internal.http.HttpHeaders.parseSeconds(r0, r4)
            goto L_0x0133
        L_0x00d2:
            java.lang.String r4 = "private"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00dd
            r4 = -1
            r13 = 1
            goto L_0x0133
        L_0x00dd:
            java.lang.String r4 = "public"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00e8
            r4 = -1
            r14 = 1
            goto L_0x0133
        L_0x00e8:
            java.lang.String r4 = "must-revalidate"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x00f3
            r4 = -1
            r15 = 1
            goto L_0x0133
        L_0x00f3:
            java.lang.String r4 = "max-stale"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x0104
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r16 = okhttp3.internal.http.HttpHeaders.parseSeconds(r0, r2)
            r4 = -1
            goto L_0x0133
        L_0x0104:
            java.lang.String r4 = "min-fresh"
            boolean r4 = r4.equalsIgnoreCase(r2)
            if (r4 == 0) goto L_0x0112
            r4 = -1
            int r17 = okhttp3.internal.http.HttpHeaders.parseSeconds(r0, r4)
            goto L_0x0133
        L_0x0112:
            r4 = -1
            java.lang.String r0 = "only-if-cached"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x011e
            r18 = 1
            goto L_0x0133
        L_0x011e:
            java.lang.String r0 = "no-transform"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0129
            r19 = 1
            goto L_0x0133
        L_0x0129:
            java.lang.String r0 = "immutable"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0133
            r20 = 1
        L_0x0133:
            r0 = r22
            r2 = r3
            goto L_0x003b
        L_0x0138:
            r4 = -1
            int r6 = r6 + 1
            r0 = r22
            goto L_0x001a
        L_0x013f:
            if (r7 != 0) goto L_0x0144
            r21 = 0
            goto L_0x0146
        L_0x0144:
            r21 = r8
        L_0x0146:
            okhttp3.CacheControl r0 = new okhttp3.CacheControl
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.CacheControl.parse(okhttp3.Headers):okhttp3.CacheControl");
    }

    public boolean immutable() {
        return this.f1893l;
    }

    public boolean isPrivate() {
        return this.f1886e;
    }

    public boolean isPublic() {
        return this.f1887f;
    }

    public int maxAgeSeconds() {
        return this.f1884c;
    }

    public int maxStaleSeconds() {
        return this.f1889h;
    }

    public int minFreshSeconds() {
        return this.f1890i;
    }

    public boolean mustRevalidate() {
        return this.f1888g;
    }

    public boolean noCache() {
        return this.f1882a;
    }

    public boolean noStore() {
        return this.f1883b;
    }

    public boolean noTransform() {
        return this.f1892k;
    }

    public boolean onlyIfCached() {
        return this.f1891j;
    }

    public int sMaxAgeSeconds() {
        return this.f1885d;
    }

    public String toString() {
        String str = this.f1894m;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f1882a) {
                sb.append("no-cache, ");
            }
            if (this.f1883b) {
                sb.append("no-store, ");
            }
            int i2 = this.f1884c;
            if (i2 != -1) {
                sb.append("max-age=");
                sb.append(i2);
                sb.append(", ");
            }
            int i3 = this.f1885d;
            if (i3 != -1) {
                sb.append("s-maxage=");
                sb.append(i3);
                sb.append(", ");
            }
            if (this.f1886e) {
                sb.append("private, ");
            }
            if (this.f1887f) {
                sb.append("public, ");
            }
            if (this.f1888g) {
                sb.append("must-revalidate, ");
            }
            int i4 = this.f1889h;
            if (i4 != -1) {
                sb.append("max-stale=");
                sb.append(i4);
                sb.append(", ");
            }
            int i5 = this.f1890i;
            if (i5 != -1) {
                sb.append("min-fresh=");
                sb.append(i5);
                sb.append(", ");
            }
            if (this.f1891j) {
                sb.append("only-if-cached, ");
            }
            if (this.f1892k) {
                sb.append("no-transform, ");
            }
            if (this.f1893l) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                str = "";
            } else {
                sb.delete(sb.length() - 2, sb.length());
                str = sb.toString();
            }
            this.f1894m = str;
        }
        return str;
    }
}

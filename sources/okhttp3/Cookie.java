package okhttp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpDate;

/* compiled from: XFMFile */
public final class Cookie {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f1927j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f1928k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f1929l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f1930m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a  reason: collision with root package name */
    public final String f1931a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1932b;

    /* renamed from: c  reason: collision with root package name */
    public final long f1933c;

    /* renamed from: d  reason: collision with root package name */
    public final String f1934d;

    /* renamed from: e  reason: collision with root package name */
    public final String f1935e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f1936f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1937g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f1938h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f1939i;

    /* compiled from: XFMFile */
    public final class Builder {

        /* renamed from: a  reason: collision with root package name */
        public String f1940a;

        /* renamed from: b  reason: collision with root package name */
        public String f1941b;

        /* renamed from: c  reason: collision with root package name */
        public long f1942c = HttpDate.MAX_DATE;

        /* renamed from: d  reason: collision with root package name */
        public String f1943d;

        /* renamed from: e  reason: collision with root package name */
        public String f1944e = "/";

        /* renamed from: f  reason: collision with root package name */
        public boolean f1945f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f1946g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f1947h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f1948i;

        public final void a(String str, boolean z2) {
            if (str != null) {
                String canonicalizeHost = Util.canonicalizeHost(str);
                if (canonicalizeHost != null) {
                    this.f1943d = canonicalizeHost;
                    this.f1948i = z2;
                    return;
                }
                throw new IllegalArgumentException("unexpected domain: ".concat(str));
            }
            throw new NullPointerException("domain == null");
        }

        public Cookie build() {
            return new Cookie(this);
        }

        public Builder domain(String str) {
            a(str, false);
            return this;
        }

        public Builder expiresAt(long j2) {
            if (j2 <= 0) {
                j2 = Long.MIN_VALUE;
            }
            if (j2 > HttpDate.MAX_DATE) {
                j2 = 253402300799999L;
            }
            this.f1942c = j2;
            this.f1947h = true;
            return this;
        }

        public Builder hostOnlyDomain(String str) {
            a(str, true);
            return this;
        }

        public Builder httpOnly() {
            this.f1946g = true;
            return this;
        }

        public Builder name(String str) {
            if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str.trim().equals(str)) {
                this.f1940a = str;
                return this;
            } else {
                throw new IllegalArgumentException("name is not trimmed");
            }
        }

        public Builder path(String str) {
            if (str.startsWith("/")) {
                this.f1944e = str;
                return this;
            }
            throw new IllegalArgumentException("path must start with '/'");
        }

        public Builder secure() {
            this.f1945f = true;
            return this;
        }

        public Builder value(String str) {
            if (str == null) {
                throw new NullPointerException("value == null");
            } else if (str.trim().equals(str)) {
                this.f1941b = str;
                return this;
            } else {
                throw new IllegalArgumentException("value is not trimmed");
            }
        }
    }

    public Cookie(String str, String str2, long j2, String str3, String str4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f1931a = str;
        this.f1932b = str2;
        this.f1933c = j2;
        this.f1934d = str3;
        this.f1935e = str4;
        this.f1936f = z2;
        this.f1937g = z3;
        this.f1939i = z4;
        this.f1938h = z5;
    }

    public Cookie(Builder builder) {
        String str = builder.f1940a;
        if (str != null) {
            String str2 = builder.f1941b;
            if (str2 != null) {
                String str3 = builder.f1943d;
                if (str3 != null) {
                    this.f1931a = str;
                    this.f1932b = str2;
                    this.f1933c = builder.f1942c;
                    this.f1934d = str3;
                    this.f1935e = builder.f1944e;
                    this.f1936f = builder.f1945f;
                    this.f1937g = builder.f1946g;
                    this.f1938h = builder.f1947h;
                    this.f1939i = builder.f1948i;
                    return;
                }
                throw new NullPointerException("builder.domain == null");
            }
            throw new NullPointerException("builder.value == null");
        }
        throw new NullPointerException("builder.name == null");
    }

    public static int a(String str, int i2, int i3, boolean z2) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (((charAt < ' ' && charAt != 9) || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z2)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static boolean b(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !Util.verifyAsIpAddress(str);
    }

    public static long c(String str, int i2) {
        int a2 = a(str, 0, i2, false);
        Pattern pattern = f1930m;
        Matcher matcher = pattern.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (a2 < i2) {
            int a3 = a(str, a2 + 1, i2, true);
            matcher.region(a2, a3);
            if (i4 == -1 && matcher.usePattern(pattern).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i7 = Integer.parseInt(matcher.group(2));
                i8 = Integer.parseInt(matcher.group(3));
            } else if (i5 != -1 || !matcher.usePattern(f1929l).matches()) {
                if (i6 == -1) {
                    Pattern pattern2 = f1928k;
                    if (matcher.usePattern(pattern2).matches()) {
                        i6 = pattern2.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(f1927j).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                }
            } else {
                i5 = Integer.parseInt(matcher.group(1));
            }
            a2 = a(str, a3 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException();
        } else if (i6 == -1) {
            throw new IllegalArgumentException();
        } else if (i5 < 1 || i5 > 31) {
            throw new IllegalArgumentException();
        } else if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException();
        } else if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        } else if (i8 < 0 || i8 > 59) {
            throw new IllegalArgumentException();
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, i6 - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i7);
            gregorianCalendar.set(13, i8);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0091, code lost:
        if (r21 <= 0) goto L_0x00a6;
     */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static okhttp3.Cookie parse(okhttp3.HttpUrl r29, java.lang.String r30) {
        /*
            r1 = r30
            long r2 = java.lang.System.currentTimeMillis()
            int r4 = r30.length()
            r5 = 0
            r6 = 59
            int r0 = okhttp3.internal.Util.delimiterOffset((java.lang.String) r1, (int) r5, (int) r4, (char) r6)
            r7 = 61
            int r8 = okhttp3.internal.Util.delimiterOffset((java.lang.String) r1, (int) r5, (int) r0, (char) r7)
            if (r8 != r0) goto L_0x001b
            goto L_0x0181
        L_0x001b:
            java.lang.String r11 = okhttp3.internal.Util.trimSubstring(r1, r5, r8)
            boolean r10 = r11.isEmpty()
            if (r10 != 0) goto L_0x0181
            int r10 = okhttp3.internal.Util.indexOfControlOrNonAscii(r11)
            r12 = -1
            if (r10 == r12) goto L_0x002e
            goto L_0x0181
        L_0x002e:
            r10 = 1
            int r8 = r8 + r10
            java.lang.String r8 = okhttp3.internal.Util.trimSubstring(r1, r8, r0)
            int r13 = okhttp3.internal.Util.indexOfControlOrNonAscii(r8)
            if (r13 == r12) goto L_0x003c
            goto L_0x0181
        L_0x003c:
            int r0 = r0 + r10
            r14 = -1
            r21 = r14
            r5 = 0
            r9 = 0
            r17 = 0
            r18 = 0
            r19 = 1
            r20 = 0
            r23 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
        L_0x0050:
            r25 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r27 = -9223372036854775808
            if (r0 >= r4) goto L_0x0104
            int r12 = okhttp3.internal.Util.delimiterOffset((java.lang.String) r1, (int) r0, (int) r4, (char) r6)
            int r13 = okhttp3.internal.Util.delimiterOffset((java.lang.String) r1, (int) r0, (int) r12, (char) r7)
            java.lang.String r0 = okhttp3.internal.Util.trimSubstring(r1, r0, r13)
            if (r13 >= r12) goto L_0x006e
            int r13 = r13 + 1
            java.lang.String r13 = okhttp3.internal.Util.trimSubstring(r1, r13, r12)
            goto L_0x0070
        L_0x006e:
            java.lang.String r13 = ""
        L_0x0070:
            java.lang.String r6 = "expires"
            boolean r6 = r0.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x0081
            int r0 = r13.length()     // Catch:{ IllegalArgumentException -> 0x00fe }
            long r23 = c(r13, r0)     // Catch:{ IllegalArgumentException -> 0x00fe }
            goto L_0x00ab
        L_0x0081:
            java.lang.String r6 = "max-age"
            boolean r6 = r0.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x00af
            long r21 = java.lang.Long.parseLong(r13)     // Catch:{ NumberFormatException -> 0x0094 }
            r25 = 0
            int r0 = (r21 > r25 ? 1 : (r21 == r25 ? 0 : -1))
            if (r0 > 0) goto L_0x00ab
            goto L_0x00a6
        L_0x0094:
            r0 = move-exception
            r6 = r0
            java.lang.String r0 = "-?\\d+"
            boolean r0 = r13.matches(r0)     // Catch:{  }
            if (r0 == 0) goto L_0x00ae
            java.lang.String r0 = "-"
            boolean r0 = r13.startsWith(r0)     // Catch:{  }
            if (r0 == 0) goto L_0x00a9
        L_0x00a6:
            r21 = r27
            goto L_0x00ab
        L_0x00a9:
            r21 = r25
        L_0x00ab:
            r20 = 1
            goto L_0x00fe
        L_0x00ae:
            throw r6     // Catch:{  }
        L_0x00af:
            java.lang.String r6 = "domain"
            boolean r6 = r0.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x00df
            java.lang.String r0 = "."
            boolean r6 = r13.endsWith(r0)     // Catch:{ IllegalArgumentException -> 0x00fe }
            if (r6 != 0) goto L_0x00d9
            boolean r0 = r13.startsWith(r0)     // Catch:{ IllegalArgumentException -> 0x00fe }
            if (r0 == 0) goto L_0x00c9
            java.lang.String r13 = r13.substring(r10)     // Catch:{ IllegalArgumentException -> 0x00fe }
        L_0x00c9:
            java.lang.String r0 = okhttp3.internal.Util.canonicalizeHost(r13)     // Catch:{ IllegalArgumentException -> 0x00fe }
            if (r0 == 0) goto L_0x00d3
            r9 = r0
            r19 = 0
            goto L_0x00fe
        L_0x00d3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x00fe }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x00fe }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00fe }
        L_0x00d9:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x00fe }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x00fe }
            throw r0     // Catch:{ IllegalArgumentException -> 0x00fe }
        L_0x00df:
            java.lang.String r6 = "path"
            boolean r6 = r0.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x00e9
            r5 = r13
            goto L_0x00fe
        L_0x00e9:
            java.lang.String r6 = "secure"
            boolean r6 = r0.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x00f4
            r17 = 1
            goto L_0x00fe
        L_0x00f4:
            java.lang.String r6 = "httponly"
            boolean r0 = r0.equalsIgnoreCase(r6)
            if (r0 == 0) goto L_0x00fe
            r18 = 1
        L_0x00fe:
            int r0 = r12 + 1
            r6 = 59
            goto L_0x0050
        L_0x0104:
            int r0 = (r21 > r27 ? 1 : (r21 == r27 ? 0 : -1))
            if (r0 != 0) goto L_0x010b
            r13 = r27
            goto L_0x0133
        L_0x010b:
            int r0 = (r21 > r14 ? 1 : (r21 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0131
            r0 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r4 = (r21 > r0 ? 1 : (r21 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x011c
            r0 = 1000(0x3e8, double:4.94E-321)
            long r25 = r21 * r0
        L_0x011c:
            long r25 = r2 + r25
            int r0 = (r25 > r2 ? 1 : (r25 == r2 ? 0 : -1))
            r1 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            if (r0 < 0) goto L_0x012f
            int r0 = (r25 > r1 ? 1 : (r25 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x012c
            goto L_0x012f
        L_0x012c:
            r13 = r25
            goto L_0x0133
        L_0x012f:
            r13 = r1
            goto L_0x0133
        L_0x0131:
            r13 = r23
        L_0x0133:
            java.lang.String r0 = r29.host()
            if (r9 != 0) goto L_0x013b
            r15 = r0
            goto L_0x0143
        L_0x013b:
            boolean r1 = b(r0, r9)
            if (r1 != 0) goto L_0x0142
            goto L_0x0181
        L_0x0142:
            r15 = r9
        L_0x0143:
            int r0 = r0.length()
            int r1 = r15.length()
            if (r0 == r1) goto L_0x0158
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.get()
            java.lang.String r0 = r0.getEffectiveTldPlusOne(r15)
            if (r0 != 0) goto L_0x0158
            goto L_0x0181
        L_0x0158:
            java.lang.String r0 = "/"
            if (r5 == 0) goto L_0x0166
            boolean r1 = r5.startsWith(r0)
            if (r1 != 0) goto L_0x0163
            goto L_0x0166
        L_0x0163:
            r16 = r5
            goto L_0x0179
        L_0x0166:
            java.lang.String r1 = r29.encodedPath()
            r2 = 47
            int r2 = r1.lastIndexOf(r2)
            if (r2 == 0) goto L_0x0177
            r3 = 0
            java.lang.String r0 = r1.substring(r3, r2)
        L_0x0177:
            r16 = r0
        L_0x0179:
            okhttp3.Cookie r9 = new okhttp3.Cookie
            r10 = r9
            r12 = r8
            r10.<init>(r11, r12, r13, r15, r16, r17, r18, r19, r20)
            goto L_0x0182
        L_0x0181:
            r9 = 0
        L_0x0182:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.Cookie.parse(okhttp3.HttpUrl, java.lang.String):okhttp3.Cookie");
    }

    public static List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        List<String> values = headers.values("Set-Cookie");
        int size = values.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            Cookie parse = parse(httpUrl, values.get(i2));
            if (parse != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(parse);
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public String domain() {
        return this.f1934d;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) obj;
        return cookie.f1931a.equals(this.f1931a) && cookie.f1932b.equals(this.f1932b) && cookie.f1934d.equals(this.f1934d) && cookie.f1935e.equals(this.f1935e) && cookie.f1933c == this.f1933c && cookie.f1936f == this.f1936f && cookie.f1937g == this.f1937g && cookie.f1938h == this.f1938h && cookie.f1939i == this.f1939i;
    }

    public long expiresAt() {
        return this.f1933c;
    }

    public int hashCode() {
        int hashCode = this.f1932b.hashCode();
        int hashCode2 = this.f1934d.hashCode();
        int hashCode3 = this.f1935e.hashCode();
        long j2 = this.f1933c;
        return ((((((((((hashCode3 + ((hashCode2 + ((hashCode + ((this.f1931a.hashCode() + 527) * 31)) * 31)) * 31)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f1936f ^ true ? 1 : 0)) * 31) + (this.f1937g ^ true ? 1 : 0)) * 31) + (this.f1938h ^ true ? 1 : 0)) * 31) + (this.f1939i ^ true ? 1 : 0);
    }

    public boolean hostOnly() {
        return this.f1939i;
    }

    public boolean httpOnly() {
        return this.f1937g;
    }

    public boolean matches(HttpUrl httpUrl) {
        boolean z2 = this.f1939i;
        String str = this.f1934d;
        if (!(z2 ? httpUrl.host().equals(str) : b(httpUrl.host(), str))) {
            return false;
        }
        String encodedPath = httpUrl.encodedPath();
        String str2 = this.f1935e;
        if (!(encodedPath.equals(str2) || (encodedPath.startsWith(str2) && (str2.endsWith("/") || encodedPath.charAt(str2.length()) == '/')))) {
            return false;
        }
        return !this.f1936f || httpUrl.isHttps();
    }

    public String name() {
        return this.f1931a;
    }

    public String path() {
        return this.f1935e;
    }

    public boolean persistent() {
        return this.f1938h;
    }

    public boolean secure() {
        return this.f1936f;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1931a);
        sb.append('=');
        sb.append(this.f1932b);
        if (this.f1938h) {
            long j2 = this.f1933c;
            if (j2 == Long.MIN_VALUE) {
                str = "; max-age=0";
            } else {
                sb.append("; expires=");
                str = HttpDate.format(new Date(j2));
            }
            sb.append(str);
        }
        if (!this.f1939i) {
            sb.append("; domain=");
            sb.append(this.f1934d);
        }
        sb.append("; path=");
        sb.append(this.f1935e);
        if (this.f1936f) {
            sb.append("; secure");
        }
        if (this.f1937g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public String value() {
        return this.f1932b;
    }
}
